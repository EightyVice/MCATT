using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines.C
{
	internal class Interpreter : IStatementVisitor, IExpressionVisitor<object>
	{
		private readonly List<Statement> statements;
		private readonly CVM VM;
		public Interpreter(CVM vm, List<Statement> statements)
		{
			this.statements = statements;
			VM = vm;
		}

		public void Interpret()
		{
			foreach (var statement in statements)
			{
				statement.Visit(this);
			}
		}

		public object VisitBinary(BinaryExpression binaryExpression)
		{
			object lhs = Evaluate(binaryExpression.Left);
			object rhs = Evaluate(binaryExpression.Right);
			
			if(binaryExpression.Operator == "+")
			{
				if (lhs is int && rhs is int)
					return Convert.ToInt32(lhs) + Convert.ToInt32(rhs);

				if (lhs is int && rhs is float)
					return Convert.ToInt32(lhs) + Convert.ToSingle(rhs);

				if (lhs is float && rhs is int)
					return Convert.ToSingle(lhs) + Convert.ToInt32(rhs);

				if (lhs is float && rhs is float)
					return Convert.ToSingle(lhs) + Convert.ToSingle(rhs);
			}

			if (binaryExpression.Operator == "-")
			{
				if (lhs is int && rhs is int)
					return Convert.ToInt32(lhs) - Convert.ToInt32(rhs);

				if (lhs is int && rhs is float)
					return Convert.ToInt32(lhs) - Convert.ToSingle(rhs);

				if (lhs is float && rhs is int)
					return Convert.ToSingle(lhs) - Convert.ToInt32(rhs);

				if (lhs is float && rhs is float)
					return Convert.ToSingle(lhs) - Convert.ToSingle(rhs);
			}

			if (binaryExpression.Operator == "*")
			{
				if (lhs is int && rhs is int)
					return Convert.ToInt32(lhs) * Convert.ToInt32(rhs);

				if (lhs is int && rhs is float)
					return Convert.ToInt32(lhs) * Convert.ToSingle(rhs);

				if (lhs is float && rhs is int)
					return Convert.ToSingle(lhs) * Convert.ToInt32(rhs);

				if (lhs is float && rhs is float)
					return Convert.ToSingle(lhs) * Convert.ToSingle(rhs);
			}

			if (binaryExpression.Operator == "/")
			{
				if (lhs is int && rhs is int)
					return Convert.ToInt32(lhs) / Convert.ToInt32(rhs);

				if (lhs is int && rhs is float)
					return Convert.ToInt32(lhs) / Convert.ToSingle(rhs);

				if (lhs is float && rhs is int)
					return Convert.ToSingle(lhs) / Convert.ToInt32(rhs);

				if (lhs is float && rhs is float)
					return Convert.ToSingle(lhs) / Convert.ToSingle(rhs);
			}

			return null;
		}

		public object Evaluate(Expression expression)
		{
			return expression.Accept(this);
		}
		public void VisitFunctionCall(FunctionCall call)
		{
			if(call.Name == "print")
			{
				Console.WriteLine(Evaluate(call.Args[0]).ToString());
			}
		}

		public object VisitIntLiteral(IntLiteral intLiteral)
		{
			return intLiteral.Value;
		}

		public object VisitFloatLiteral(FloatLiteral floatLiteral)
		{
			return floatLiteral.Value;
		}

		public void VisitVarDeclaration(VarDeclarationStatement varDecl)
		{
			VM.Environment.DefineVariable(varDecl.name, varDecl.type, varDecl.initializer);
		}

		public object VisitIdentifier(Identifier identifier)
		{
			// Evaluate(VM.Environment.GetLValue(identifier.identifier).Value);
			return null;
		}

		public object VisitAssignment(Assignment assignment)
		{
			return null;
		}
	}
}
