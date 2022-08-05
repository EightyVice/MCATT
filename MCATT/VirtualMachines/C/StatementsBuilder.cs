using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

namespace MCATT.VirtualMachines.C
{
	internal class Semantics
	{
		public enum OperationType
		{
			BinaryArithmetic
		}
		public static bool IsArithmetic(object expr)
		{
			if (
				expr is Literal<byte>	||
				expr is Literal<short>	||
				expr is Literal<int>	||
				expr is Literal<long>	||
				expr is Literal<float>	||
				expr is Literal<double>
			) return true;

			return false;
		}
		
		public static bool IsIntegerType(object expr)
		{
			if(
				expr is Literal<byte> ||
				expr is Literal<short> ||
				expr is Literal<int> ||
				expr is Literal<long>
			) return true;

			return false;
		}

		public static bool IsBinaryOperationArithmetic(object lhs, object rhs)
		{
			if(IsArithmetic(lhs) && IsArithmetic(rhs)) return true;
			return false;
		}

		
			
	}
	internal class StatementsBuilder : CBaseVisitor<Expression>
	{
		public CVM VM { get; }
		public List<Statement> Statements { get; private set; } = new List<Statement>();

		public StatementsBuilder(CVM vm)
		{
			VM = vm;
		}

		#region Declaration
		private DataType GetTypeFromString(string type)
		{
			switch (type)
			{
				case "char":	return DataType.Char;
				case "short":	return DataType.Short;
				case "int":		return DataType.Int;
				case "long":	return DataType.Long;
				case "float":	return DataType.Float;
				case "double":	return DataType.Double;
				default: return DataType.Unknown;
			}
		}
		public override Expression VisitDeclaration([NotNull] CParser.DeclarationContext context)
		{
			VarDeclarationStatement varDecl = null;

			var type = context.type().primitiveTypes();
			bool _unsigned = false;
			bool _isPointer = false;
			// Check sign
			if(type.signedorunsigned() != null)
			{
				_unsigned = type.signedorunsigned().GetText() == "unsigned" ? true : false;
			}

			var _type = GetTypeFromString(type.arithType().GetText());

			foreach(var declarator in context.declarators().declarator())
			{
				LValue variable;
				string _name = declarator.declId().GetText();
				Expression _val = null;
				var initializer = declarator.initializer();

				if (initializer.arrayInit() != null)
				{
					//if (declarator.declId().arrBracket() == null)
					//	throw new CompileErrorException("Can't assign array to non-array type");

					//List<dynamic> inits = new List<dynamic>();
					//// For now, first-dimension arrays only
					//foreach (var init in initializer.arrayInit().initializer())
					//{
					//	// todo: Check if same types
					//	inits.Add(Visit(init));
					//	variable = new ArrayVariable(_name, inits.ToArray());
					//}
				}			
				else
				{
					_val = Visit(initializer.expression());
				}

				varDecl = new VarDeclarationStatement(_name, _type, _val);
			}

			Statements.Add(varDecl);
			return null;
		}
		#endregion
		#region Expressions
		public override Expression VisitExprAS([NotNull] CParser.ExprASContext context)
		{
			Expression lhs = Visit(context.expression(0));
			Expression rhs = Visit(context.expression(1));
			
			return new BinaryExpression(lhs, context.bop.Text, rhs);
		}

		public override Expression VisitExprRightAssociation([NotNull] CParser.ExprRightAssociationContext context)
		{
			Identifier lhs = (Identifier)Visit(context.expression(0));
			Expression rhs = Visit(context.expression(1));
			string op = context.bop.Text;
			return new Assignment(lhs, op, rhs);
		}
		#endregion

		#region Literals
		public override Expression VisitIntegerLiteral([NotNull] CParser.IntegerLiteralContext context)
		{
			return new IntLiteral(int.Parse(context.GetText()));
		}

		public override Expression VisitFloatLiteral([NotNull] CParser.FloatLiteralContext context)
		{
			return new FloatLiteral(float.Parse(context.GetText()));
		}

		public override Expression VisitFuncCall([NotNull] CParser.FuncCallContext context)
		{
			string name = context.identifier().GetText();
			List<Expression> args = new List<Expression>();
			foreach(var arg in context.expressionList().expression())
			{
				args.Add(Visit(arg));
			}
			Statements.Add(new FunctionCall(name, args));
			return null;
		}

		public override Expression VisitPrimaryIdentifier([NotNull] CParser.PrimaryIdentifierContext context)
		{
			return new Identifier(context.identifier().GetText());
		}
		#endregion

	}
}
