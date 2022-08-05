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
			Standard.InitStandard(this);
			Environment.Variables.Add("System", Standard.System);
		}
		public void Interpret()
		{
			try
			{
				AntlrInputStream fs = new AntlrInputStream(SourceCode);
				JavaLexer lexer = new JavaLexer(fs);
				CommonTokenStream token = new CommonTokenStream(lexer);
				JavaParser parser = new JavaParser(token);
				parser.AddErrorListener(new ErrorListener());

				var tree = parser.prog();
				//Console.WriteLine(tree.ToStringTree());
				JavaInterpreter interpreter = new JavaInterpreter(this);
				tree.Accept(interpreter);
			}catch(AppDomainUnloadedException e)
			{
				Console.WriteLine(e.Message);
			}
			// Dumping
			Console.WriteLine(JsonSerializer.Serialize(Steps, new JsonSerializerOptions() { WriteIndented = true}));

			Console.WriteLine();
		}
	}
}
