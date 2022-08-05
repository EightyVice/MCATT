using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines.C
{
	internal class Literal
	{

	}
	internal class Literal<T> : Literal
	{
		public Literal(T init)
		{
			Value = init;
		}
		public T Value { get; set; }
	}
}
