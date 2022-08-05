using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	internal class Standard
	{
		private class System_out_println : IMethod
		{
			private JavaVM VM;

			public System_out_println(JavaVM vm)
			{
				this.VM = vm;
			}

			public string Name { get; } = "println";
			public int Arity { get; } = 1;

			public dynamic Invoke(params dynamic[] args)
			{
				Step step = new Step();
				step.Event = new Event(EventType.PrintOutput);
				step.Event.Parameters.Add(args[0].ToString());
				VM.Steps.Add(step);
				return null;
			}
		}
		public static JavaVM VM { get; set; }

		public static ReferenceType System { get; private set; }
		public static void InitStandard(JavaVM javaVM)
		{
			VM = javaVM;

			System = new ReferenceType()
			{
				ClassType = "System",
				Name = "System",
				Members = {
				{
					"out", new ReferenceType() {
						ClassType = "PrintStream",
						Name = "out",
						Members =
						{
							{
								"println", new System_out_println(VM)
							}
						}
					}
				}
			}
			};

		}
	}
}
