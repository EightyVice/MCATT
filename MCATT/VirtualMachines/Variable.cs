using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	internal enum VariableType
	{
		Integer,
		Float,
		String,
		Char,
		Bool,
		Short,
		Long,
		Unknown
	}

	internal class Variable
	{
		public string Name { get; set; }
		public object Value { get; set; }
		public List<object> Values { get; set; }

		public bool IsArray { get; set; }

		public VariableType Type { get; set; }
		public bool IsConstant { get; set; }
		
		public static VariableType GetTypeFromString(string typeString)
		{
			switch (typeString)
			{
				case "int": return VariableType.Integer;
				case "short": return VariableType.Short;
				case "String": return VariableType.String;
				case "Bool": return VariableType.Bool;
				case "long": return VariableType.Long;
				case "char": return VariableType.Char;
			}
			return VariableType.Unknown;
		}
	}
}
