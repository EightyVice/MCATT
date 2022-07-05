using Antlr4.Runtime;
using MCATT.VirtualMachines;

namespace MCATT
{
	public class Program
	{
		public static void Main(string[] args)
		{
			JavaVM javaVM = new JavaVM(File.ReadAllText("sourcecode.txt"));
			javaVM.Interpret();
		}
	}
}