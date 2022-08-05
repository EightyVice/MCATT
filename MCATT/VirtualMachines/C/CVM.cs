using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Antlr4.Runtime;
namespace MCATT.VirtualMachines.C
{
	internal class CVM
	{
		public string SourceCode { get; private set; }
		public List<Step> Steps { get; private set; }	= new List<Step>();
		public Memory Memory { get; private set; } = new Memory();
		public Environment Environment { get; set; } = new Environment();

		public CVM(string sourceCode)
		{
			SourceCode = sourceCode;
		}
		
		public void Interpret()
		{
			AntlrInputStream fs = new AntlrInputStream(SourceCode);
			CLexer lexer = new CLexer(fs);
			CommonTokenStream token = new CommonTokenStream(lexer);
			CParser parser = new CParser(token);
			parser.AddErrorListener(new ErrorListener());

			var tree = parser.prog();

			//StatementsBuilder builder = new StatementsBuilder(this);
			ParserVisitor visitor = new ParserVisitor(this);
			//tree.Accept(builder);
			tree.Accept(visitor);
			//Interpreter  interpreter = new Interpreter(this, builder.Statements);
			//interpreter.Interpret();
		}
	}
}
