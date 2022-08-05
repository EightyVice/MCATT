using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

namespace MCATT
{
	internal class ErrorListener : BaseErrorListener
	{
		public override void SyntaxError([NotNull] IRecognizer recognizer, [Nullable] IToken offendingSymbol, int line, int charPositionInLine, [NotNull] string msg, [Nullable] RecognitionException e)
		{
			Console.WriteLine($"line: {line} @ {charPositionInLine} [{offendingSymbol.Text}]: {msg}");
	
		}
	}
}
