using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System.Text.Json;
using System.Text.Json.Serialization;

namespace MCATT.VirtualMachines
{
	internal class JavaVM
	{
		public Environment Environment { get; private set; } = new Environment();
		public List<Step> Steps { get; private set; } = new List<Step> ();

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

			// Dumping
			Console.WriteLine("** Dumping Environment **");
			Console.WriteLine(JsonSerializer.Serialize(Environment));
			Console.WriteLine("*************************");
			Console.WriteLine("**    Dumping Steps    **");
			Console.WriteLine(JsonSerializer.Serialize(Steps, new JsonSerializerOptions() { WriteIndented = true}));

			Console.WriteLine();
		}
	}
}
