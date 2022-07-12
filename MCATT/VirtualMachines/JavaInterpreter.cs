using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using static MCATT.JavaParser;

namespace MCATT.VirtualMachines
{
	internal class JavaInterpreter : JavaParserBaseVisitor<dynamic>
	{
		public JavaVM VM { get; }

		public JavaInterpreter(JavaVM vm)
		{
			VM = vm;
		}

		public override object VisitChildren([NotNull] IRuleNode node)
		{
			return base.VisitChildren(node);
		}


		public override object VisitLocalVariableDeclaration([NotNull] LocalVariableDeclarationContext context)
		{
			VisitChildren(context);

			List<IVarObj> variables = new List<IVarObj>();

			bool isConstant = false;
			VariableType type = VariableType.Unknown;
			string name;

			// check for 'final' modifier
			if (context.variableModifier(0)?.FINAL() != null) isConstant = true;
			
			// Get Variable Type
			type = PrimitiveType.GetTypeFromString(context.typeType().GetText());

			// Get multiple declarators
			foreach(var declarator in context.variableDeclarators().variableDeclarator())
			{
				Step step = new Step()
				{
					Start = context.Start.StartIndex,
					End = context.stop.StopIndex,
					Line = context.start.Line,
					Text = context.GetText()
				};

				IVarObj variable = null;
				name = declarator.variableDeclaratorId().GetText();

				// Get Initializers
				var initializer = declarator.variableInitializer();
				if(initializer.arrayInitializer() != null)	// It's an array?
				{
					List<IVarObj> inits = new List<IVarObj>();
					step.Event = new Event(EventType.InitArray);
					// For now, first-dimension arrays only
					foreach(var arrinit in initializer.arrayInitializer().variableInitializer())
					{
						var val = new PrimitiveType(name, type, Visit(arrinit.expression()), isConstant);
						inits.Add(val);
						step.Event.Parameters.Add(val.Value.ToString());
					}

					variable = new ArrayClass(name, inits.ToArray());
				}
				else
				{
					dynamic val = Visit(initializer.expression());
					variable = new PrimitiveType(name, type, val); 
					step.Event = new Event(EventType.InitVariable);
					step.Event.Parameters.Add(name);
					step.Event.Parameters.Add(Enum.GetName(variable.VarType));
					step.Event.Parameters.Add(((PrimitiveType)variable).Value?.ToString());
				}

				variables.Add(variable);
				VM.Steps.Add(step);
			}

			foreach(var variable in variables)
			{
				VM.Environment.Variables.Add(variable.Name, variable);
			}

			return null;
		}

		// All expression evaluations will happen in this region, so this method will end up being the biggest, NOTE: Part it if possible...
		#region Expression
		
		// Adding & Subtraction
		public override dynamic VisitExprAS([NotNull] ExprASContext context)
		{
			VisitChildren(context);

			dynamic left = Visit(context.expression(0));
			dynamic right = Visit(context.expression(1));

			// Todo, + / - overloaded operators on classes
			if (context.bop.Text == "+") return left + right;
			else if (context.bop.Text == "-") return left - right;
			else return null;
		}

		public override dynamic VisitExprMDM([NotNull] ExprMDMContext context)
		{
			VisitChildren(context);

			dynamic left = Visit(context.expression(0));
			dynamic right = Visit(context.expression(1));

			if (context.bop.Text == "*") return left * right;
			else if (context.bop.Text == "/") return left / right;
			else if (context.bop.Text == "%") return left % right;
			else return null;
		}

		public override dynamic VisitExprPrimary([NotNull] ExprPrimaryContext context)
		{
				
			if(context.primary().identifier() != null)
			{
				string id = context.primary().identifier().GetText();
				return VM.Environment.Variables[id];
			}
			return VisitChildren(context);
		}
		public override dynamic VisitExprArraySubscription([NotNull] ExprArraySubscriptionContext context)
		{
			VisitChildren(context);

			object arr = Visit(context.expression(0));
			int index = Visit(context.expression(1));
			if(arr is ArrayClass)
			{
				return ((ArrayClass)arr).Values[index];
			}
			return null;
		}

		public override dynamic VisitExprRightAssociation([NotNull] ExprRightAssociationContext context)
		{
			VisitChildren(context);

			Step step = new Step()
			{
				Start = context.Start.StartIndex,
				End = context.stop.StopIndex,
				Line = context.start.Line,
				Text = context.GetText(),
				Event = new Event(EventType.ValueChanged)
			};
			// Todo support nested right assoc
			object exprLeft = Visit(context.expression(0));
			dynamic right = Visit(context.expression(1));

			if(exprLeft is PrimitiveType)
			{
				PrimitiveType left = (PrimitiveType)exprLeft;
				switch (context.bop.Text)
				{
					case "=":	step.Event.Parameters.AddRange(new string[] { left.Name, left.Value.ToString(), right.ToString()});					VM.Steps.Add(step);	return left.Value = right;
					case "+=":	step.Event.Parameters.AddRange(new string[] { left.Name, left.Value.ToString(), (left.Value + right).ToString()});	VM.Steps.Add(step);	return left.Value += right;
					case "-=":	step.Event.Parameters.AddRange(new string[] { left.Name, left.Value.ToString(), (left.Value - right).ToString()});	VM.Steps.Add(step);	return left.Value -= right;
					case "*=":	step.Event.Parameters.AddRange(new string[] { left.Name, left.Value.ToString(), (left.Value * right).ToString()});	VM.Steps.Add(step);	return left.Value *= right;
					case "/=":	step.Event.Parameters.AddRange(new string[] { left.Name, left.Value.ToString(), (left.Value / right).ToString()});	VM.Steps.Add(step); return left.Value /= right;
				}

			}
			else
			{
				throw new Exception();
			}
			return null;
		}


		// Logicals
		public override dynamic VisitExprComparison([NotNull] ExprComparisonContext context)
		{
			VisitChildren(context);
			dynamic left = Visit(context.expression(0));
			dynamic right = Visit(context.expression(1));


			switch (context.bop.Text)
			{
				case ">":	return (left is PrimitiveType ? (left as PrimitiveType).Value : left) >	(right is PrimitiveType ? (right as PrimitiveType).Value : right);
				case "<":	return (left is PrimitiveType ? (left as PrimitiveType).Value : left) < (right is PrimitiveType ? (right as PrimitiveType).Value : right);
				case ">=":	return (left is PrimitiveType ? (left as PrimitiveType).Value : left) >= (right is PrimitiveType ? (right as PrimitiveType).Value : right);
				case "<=":	return (left is PrimitiveType ? (left as PrimitiveType).Value : left) <= (right is PrimitiveType ? (right as PrimitiveType).Value : right);
			}

			return null;
		}

		public override dynamic VisitExprEquality([NotNull] ExprEqualityContext context)
		{
			VisitChildren(context);
			dynamic left = Visit(context.expression(0));
			dynamic right = Visit(context.expression(1));


			switch (context.bop.Text)
			{
				case "==": return (left is PrimitiveType ? (left as PrimitiveType).Value : left) == (right is PrimitiveType ? (right as PrimitiveType).Value : right);
				case "!=": return (left is PrimitiveType ? (left as PrimitiveType).Value : left) != (right is PrimitiveType ? (right as PrimitiveType).Value : right);
			}

			return null;
		}

		private dynamic GetValFromExpr(ExpressionContext context)
		{
			dynamic val = Visit(context);
			return (val is PrimitiveType ? (val as PrimitiveType).Value : val);
		}

		public override dynamic VisitExprLogicalAND([NotNull] ExprLogicalANDContext context)
		{
			VisitChildren(context);
			dynamic left = Visit(context.expression(0));
			dynamic right = Visit(context.expression(1));

			return GetValFromExpr(left) && GetValFromExpr(right); 
		}

		public override dynamic VisitExprLogicalOR([NotNull] ExprLogicalORContext context)
		{
			VisitChildren(context);
			dynamic left = Visit(context.expression(0));
			dynamic right = Visit(context.expression(1));

			return GetValFromExpr(left) || GetValFromExpr(right);
		}
		#endregion


		#region Statements
		public override dynamic VisitStmtIf([NotNull] StmtIfContext context)
		{
			// Don't visit children this time, visit on condition
			if(GetValFromExpr(context.parExpression().expression()) == true)
			{
				Visit(context.statement(0));	// Execute the then statement
			}
			else
			{
				Visit(context.statement(1));	// Execute the else statement
			}
			return null;
		}

		public override dynamic VisitMethodCall([NotNull] MethodCallContext context)
		{
			VisitChildren(context);
			// a dummy function for testing 
			if(context.identifier().GetText() == "print")
			{
				Console.WriteLine(Visit(context.expressionList().expression(0)));
			}
			return base.VisitMethodCall(context);
		}
		#endregion
		public override object VisitBlockStatement([NotNull] BlockStatementContext context)
		{
			VisitChildren(context);
			//Console.WriteLine(context.GetText());
			return null;
		}

		public override object VisitArrayInitializer([NotNull] JavaParser.ArrayInitializerContext context)
		{
			return base.VisitArrayInitializer(context);
		}


		#region Literals
		public override dynamic VisitExprIntLiteral([NotNull] ExprIntLiteralContext context)
		{
			return int.Parse(context.GetText());
		}
		public override dynamic VisitExprFloatLiteral([NotNull] ExprFloatLiteralContext context)
		{
			return float.Parse(context.GetText().TrimEnd('f', 'F'));
		}
		public override dynamic VisitExprBoolLitearl([NotNull] ExprBoolLitearlContext context)
		{
			return bool.Parse(context.GetText());
		}

		public override dynamic VisitExprCharLiteral([NotNull] ExprCharLiteralContext context)
		{
			return base.VisitExprCharLiteral(context);
		}

		public override dynamic VisitExprStringLiteral([NotNull] ExprStringLiteralContext context)
		{
			return context.GetText().TrimStart('\"').TrimEnd('\"');
		}
		#endregion
	}
}
