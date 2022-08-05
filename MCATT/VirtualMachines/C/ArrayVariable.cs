using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines.C
{
	internal class ArrayVariable : LValue
	{
		public string Name { get; set; }
		public List<IAtom> Values { get; set; } = new List<IAtom>();
		public PrimitiveDataType Type { get; set; }
		public int Address { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }

		public ArrayVariable(string name, params IAtom[] values)
		{
			Name = name;
			Values.AddRange(values);
		}

		public RValue ToRvalue()
		{
			throw new NotImplementedException();
		}
	}
}
