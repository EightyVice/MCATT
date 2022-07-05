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
	internal class JavaInterpreter : JavaParserBaseVisitor<object>
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

		public override object VisitExpression([NotNull] JavaParser.ExpressionContext context)
		{
			return base.VisitExpression(context);
		}


		public override object VisitLocalVariableDeclaration([NotNull] LocalVariableDeclarationContext context)
		{
			VisitChildren(context);

			List<Variable> variables = new List<Variable>();

			bool isConstant = false;
			VariableType type = VariableType.Unknown;

			// check for 'final' modifier
			if (context.variableModifier(0)?.FINAL() != null) isConstant = true;
			
			// Get Variable Type
			type = Variable.GetTypeFromString(context.typeType().GetText());

			// Get multiple declarators
			foreach(var declarator in context.variableDeclarators().variableDeclarator())
			{
				Variable variable = new Variable();
				variable.Type = type;
				variable.IsConstant = isConstant;
				
				variable.Name = declarator.variableDeclaratorId().GetText();

				// Get Initializers
				var initializer = declarator.variableInitializer();
				if(initializer.arrayInitializer() != null)	// It's an array?
				{
					variable.IsArray = true;
					List<object> inits = new List<object>();
					
					// For now, first-dimension arrays only
					foreach(var arrinit in initializer.arrayInitializer().variableInitializer())
					{
						inits.Add(Visit(arrinit.expression()));
					}

					variable.Values = inits;
				}
				else
				{
					variable.IsArray = false;
					variable.Value = Visit(initializer.expression());
				}
				variables.Add(variable);
			}

			foreach(var variable in variables)
			{
				VM.Environment.Variables.Add(variable.Name, variable);
			}

			return null;
		}
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
	}
}
