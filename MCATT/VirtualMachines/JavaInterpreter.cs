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
			type = PrimitiveType.GetTypeFromString(context.typeType().GetText().Replace("[]", ""));

			// Get multiple declarators
			foreach(var declarator in context.variableDeclarators().variableDeclarator())
			{
				Step step = new Step()
				{
					Start = context.Start.StartIndex,
					End = context.Stop.StopIndex,
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
					step.Event.Parameters.Add(name);
					step.Event.Parameters.Add(Enum.GetName(type));
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
				End = context.Stop.StopIndex,
				Line = context.start.Line,
				Text = context.GetText(),
				Event = new Event(EventType.ValueChanged)
			};
			// Todo support nested right assoc
			object exprLeft = Visit(context.expression(0));
			dynamic right = context.expression(1);

			if(exprLeft is PrimitiveType)
			{
				PrimitiveType left = (PrimitiveType)exprLeft;
				switch (context.bop.Text)
				{
					case "=":	step.Event.Parameters.AddRange(new string[] { left.Name, left.Value.ToString(), right.ToString()});					VM.Steps.Add(step);	return left.Value = right;
					case "+=":	step.Event.Parameters.AddRange(new string[] { left.Name, left.Value.ToString(), (left.Value + GetValFromExpr(right)).ToString()});	VM.Steps.Add(step);	return left.Value += GetValFromExpr(right);
					case "-=":	step.Event.Parameters.AddRange(new string[] { left.Name, left.Value.ToString(), (left.Value - GetValFromExpr(right)).ToString()});	VM.Steps.Add(step);	return left.Value -= GetValFromExpr(right);
					case "*=":	step.Event.Parameters.AddRange(new string[] { left.Name, left.Value.ToString(), (left.Value * GetValFromExpr(right)).ToString()});	VM.Steps.Add(step);	return left.Value *= GetValFromExpr(right);
					case "/=":	step.Event.Parameters.AddRange(new string[] { left.Name, left.Value.ToString(), (left.Value / GetValFromExpr(right)).ToString()});	VM.Steps.Add(step); return left.Value /= GetValFromExpr(right);
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

		public override dynamic VisitExprMemberAcess([NotNull] ExprMemberAcessContext context)
		{
			// Don't visit children
			object left = Visit(context.expression());
			if (context.identifier() != null)
			{
				return (left as ReferenceType).Members[context.identifier().GetText()];
			}
			else if (context.methodCall() != null)
			{
				Step step = new Step()
				{
					Start = context.Start.StartIndex,
					End = context.Stop.StopIndex,
					Line = context.start.Line,
					Text = context.GetText(),
					Event = new Event(EventType.CallFunction)
				};
				step.Event.Parameters.Add(context.GetText());

				VM.Steps.Add(step);
				var methodctx = context.methodCall();
				string funcName = context.methodCall().identifier().GetText();
				// check function arity
				ReferenceType obj = (ReferenceType)left;
				if (obj.Members.ContainsKey(funcName))
				{
					IMethod func = (IMethod)obj.Members[funcName];
					
					if(func.Arity == methodctx.expressionList().expression().Length)
					{
						if (func.Arity == 0) func.Invoke();
						else
						{
							List<dynamic> args = new List<dynamic>();
							foreach (var arg in methodctx.expressionList().expression())
							{
								step.Event.Parameters.Add(arg.GetText());
								args.Add(Visit(arg));
							}
							func.Invoke(args.ToArray());
						}
					}
				}
			}

			return null;
		}
		#endregion


		#region Statements
		public override dynamic VisitStmtIf([NotNull] StmtIfContext context)
		{
			Step step = new Step()
			{
				Start = context.Start.StartIndex,
				End = context.Stop.StopIndex,
				Line = context.start.Line,
				Text = context.GetText(),
				Event = new Event(EventType.Branching)
			};

			var comporator = context.parExpression().expression();
			step.Event.Parameters.Add(comporator.GetText());
			VM.Steps.Add(step);

			// Don't visit children this time, visit on condition
			if (GetValFromExpr(comporator) == true)
			{
				step.Event.Parameters.Add("true");
				Visit(context.statement(0));	// Execute the then statement
			}
			else
			{
				step.Event.Parameters.Add("false");
				if(context.statement(1) != null) Visit(context.statement(1));	// Execute the else statement
			}

			return null;
		}

		public override dynamic VisitStmtWhile([NotNull] StmtWhileContext context)
		{
			// Limit loops executions to 10 this time
			int counter = 0;

			Step step = new Step()
			{
				Start = context.Start.StartIndex,
				End = context.Stop.StopIndex,
				Line = context.start.Line,
				Text = context.GetText(),
				Event = new Event(EventType.Loop)
			};

			var comporator = context.parExpression().expression();
			VM.Steps.Add(step);

			// Don't visit children this time, visit on condition
			while (GetValFromExpr(comporator) == true && counter < 10)
			{
				Visit(context.statement());
				counter++;
			}
			step.Event.Parameters.Add(counter.ToString());
			return null;
		}

		public override dynamic VisitStmtFor([NotNull] StmtForContext context)
		{
			// Don't visit children this time, visit on condition
			// todo: optional for loops structures
			var control = context.forControl();
			IVarObj init = Visit(control.forInit().localVariableDeclaration());
			bool condition = Visit(control.expression());
			while (condition)
			{
				foreach (var after in control.expressionList().expression())
				{
					Visit(after);
				}
			}
			return null;
		}
		public override dynamic VisitMethodCall([NotNull] MethodCallContext context)
		{
			// a dummy function for testing 
			if(context.identifier().GetText() == "print")
			{
				Console.WriteLine(Visit(context.expressionList().expression(0)));
			}
			return null;
		}
		#endregion

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
