using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	internal interface IMethod : IMember
	{
		public string Name { get; }
		public int Arity { get;  }
		public dynamic Invoke(params dynamic[] args);

	}
}
