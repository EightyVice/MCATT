﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	internal class Environment
	{
		public Dictionary<string, IVarObj> Variables = new Dictionary<string,IVarObj>();
		
	}
}
