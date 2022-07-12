using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	internal class ArrayClass : IVarObj
	{
		public bool IsPrimitive { get;}
		public string Name { get; set; }
		public List<IVarObj> Values { get; set; } = new List<IVarObj>();
		public VariableType VarType { get; set; }
		public bool IsArray { get;}

		public ArrayClass(string name, params IVarObj[] values)
		{
			Name = name;
			Values.AddRange(values);
		}
	}
}
