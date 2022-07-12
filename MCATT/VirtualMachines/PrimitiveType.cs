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

	internal class PrimitiveType : IVarObj
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

		public static bool IsNumericType(object o)
		{
			switch (Type.GetTypeCode(o.GetType()))
			{
				case TypeCode.Byte:
				case TypeCode.SByte:
				case TypeCode.UInt16:
				case TypeCode.UInt32:
				case TypeCode.UInt64:
				case TypeCode.Int16:
				case TypeCode.Int32:
				case TypeCode.Int64:
				case TypeCode.Decimal:
				case TypeCode.Double:
				case TypeCode.Single:
					return true;
				default:
					return false;
			}
		}
		private void ValidateAssignment(object right)
		{
			if(right.GetType().IsPrimitive && this.IsPrimitive)
			{
				Value = right;
			}
		}
	}
}
