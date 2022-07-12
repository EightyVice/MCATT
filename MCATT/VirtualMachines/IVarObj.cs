using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	internal interface IVarObj
	{
		public string Name { get; set; }
		public VariableType VarType { get; set; }
		public bool IsPrimitive { get; }
		public bool IsArray { get; }
	}
}
