using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines.C
{
	interface RValue : IAtom
	{

	}
	interface  LValue : IAtom
	{
		public string Name { get; set; }

		public RValue ToRvalue();
	}
}
