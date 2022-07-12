using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	internal class PrimitiveValue<T>
	{
		private T value;

		public PrimitiveValue(object Value)
		{
			value = (T)Value;
		}
	}
}
