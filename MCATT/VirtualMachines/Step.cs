using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	internal class Step
	{
		public string Text { get; set; }
		public int Line { get; set; }
		public StepEvent Event { get; set; } = new StepEvent();
	}
}
