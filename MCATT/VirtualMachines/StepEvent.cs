using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	public enum Event
	{
		InitVariable,
		InitArray,
		InitObject,
		Assign,
		CallFunction
	}
	internal class StepEvent
	{
		public Event Event { get; set; }
		public List<string> EventParameters { get; set; } = new List<string>();
	}
}
