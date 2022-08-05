using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines
{
	internal enum VariableType
	{
		Int,
		Float,
		Char,
		Bool,
		Short,
		Long,
		Unknown,
		Double
	}

	internal class PrimitiveType : IVarObj, IMember
	{
		public string Name { get; set; }
		public dynamic Value { get; set; }

		public bool IsArray { get; } = false;

		public VariableType VarType { get; set; }
		public bool IsConstant { get; set; }

		public bool IsPrimitive { get; } = false;

		public PrimitiveType(string name, VariableType type, dynamic value, bool constant = false)
		{
			Name = name;
			Value = value;
			IsConstant = constant;
			VarType = type;
		}

		public static VariableType GetTypeFromString(string typeString)
		{
			switch (typeString)
			{
				case "int": return VariableType.Int;
				case "short": return VariableType.Short;
				case "boolean": return VariableType.Bool;
				case "double": return VariableType.Double;
				case "long": return VariableType.Long;
				case "char": return VariableType.Char;
			}
			return VariableType.Unknown;
		}


	}
}
