using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace MCATT.VirtualMachines
{
	internal class JavaVM
	{
		public Environment Environment { get; private set; } = new Environment();
		public string SourceCode { get; private set; }

		public JavaVM(string sourceCode)
		{
			SourceCode = sourceCode;
		}
		public void Interpret()
		{
			AntlrInputStream fs = new AntlrInputStream(SourceCode);
			JavaLexer lexer = new JavaLexer(fs);
			CommonTokenStream token = new CommonTokenStream(lexer);
			JavaParser parser = new JavaParser(token);
			var tree = parser.block();
			//Console.WriteLine(tree.ToStringTree());
			JavaInterpreter interpreter = new JavaInterpreter(this);
			tree.Accept(interpreter);

			Console.WriteLine();
		}
	}
}
