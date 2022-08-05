using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines.C
{
	internal interface IStatementVisitor
	{
		void VisitFunctionCall(FunctionCall call);
		void VisitVarDeclaration(VarDeclarationStatement varDecl);
	}

	internal abstract class Statement
	{
		public abstract void Visit(IStatementVisitor visitor);
	}

	internal class FunctionCall : Statement
	{
		public readonly string Name;
		public readonly List<Expression> Args;
		public FunctionCall(string name, List<Expression> args)
		{
			Name = name;
			Args = args;
		}

		public override void Visit(IStatementVisitor visitor)
		{
			visitor.VisitFunctionCall(this);
		}
	}
	internal class VarDeclarationStatement : Statement
	{
		public readonly string name;
		public readonly Expression initializer;
		public readonly DataType type;
		public VarDeclarationStatement(string varname, DataType type, Expression init)
		{
			name = varname;
			initializer = init;
			this.type = type;
		}

		public override void Visit(IStatementVisitor visitor)
		{
			visitor.VisitVarDeclaration(this);
		}
	}
}
