using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	internal class ReferenceType : IMember, IVarObj
	{
		public string Name { get; set; }
		public string ClassType { get; set; }
		public bool IsConstant { get; set; }
		public Dictionary<string, IMember> Members { get; set; } = new Dictionary<string, IMember>();
		public VariableType VarType { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }

		public bool IsPrimitive => throw new NotImplementedException();

		public bool IsArray => throw new NotImplementedException();
	}
}
