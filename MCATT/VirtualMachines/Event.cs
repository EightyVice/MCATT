using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	public enum EventType
	{
		InitVariable,
		InitArray,
		InitObject,
		ValueChanged,
		Comparison,
		ReferenceChanged,
		CallFunction
	}
	internal class Event
	{
		public EventType EventID { get; set; }
		public List<string> Parameters { get; set; } = new List<string>();
		
		public Event(EventType id)
		{
			EventID = id;
		}
	}
}
