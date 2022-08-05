using Antlr4.Runtime;
using MCATT.VirtualMachines;

using MCATT.VirtualMachines.C;

namespace MCATT
{
	public class Program
	{
		public static void Main(string[] args)
		{
			//JavaVM javaVM = new JavaVM(File.ReadAllText("sourcecode.txt"));
			//javaVM.Interpret();

			CVM cVM = new CVM(File.ReadAllText("sourcecode.txt"));
			cVM.Interpret();
		}
	}
}