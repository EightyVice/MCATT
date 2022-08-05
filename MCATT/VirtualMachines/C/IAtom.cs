using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines.C
{
	internal interface IAtom
	{
		public PrimitiveDataType Type { get; }
	}
}
