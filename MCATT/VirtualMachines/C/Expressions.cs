using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MCATT.VirtualMachines.C
{
	public enum PrimitiveDataType
	{
		Int,
		Float,
		Pointer,
		Structure,
		Unknown
	}

	internal class Kind
	{
		public PrimitiveDataType DataType { get; set; }
		public bool IsPrimitive { get; set; }
		public bool IsPointerToPrimitive { get; set; }
		public bool IsArray { get; set; }
		public bool IsStructure { get; set; }
		public bool IsPointerToStructure { get; set; }
		public string StructureName { get; set; }
		public bool IsReference { get; set; }

	}
	internal class Variable : LValue
	{

		public Variable(string name, PrimitiveDataType type, IAtom value)
		{
			
			Name = name;
			Value = value;
			Type = type;
		}

		public string Name { get; set; }
		public IAtom Value { get; set; }
		public PrimitiveDataType Type { get; private set; }
		public int Address { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }

		public RValue ToRvalue()
		{
			return (RValue)Value;
		}
	}

	internal class Structure
	{
		public string Name { get; set; }
		public PrimitiveDataType Type => PrimitiveDataType.Structure;

		public List<(string name, Kind type)> Members { get; } = new List<(string name, Kind type)>();

		public Structure(string name, List<(string name, Kind type)> members) {
			Name = name;
			Members = members;
		}
	}

	internal class Record : LValue
	{
		public string Name { get; set; }
		public string StructureName { get; set; }
		public PrimitiveDataType Type => PrimitiveDataType.Structure;

		public Dictionary<string, LValue> Members = new Dictionary<string, LValue>();

		public static readonly Record NullRecord = new Record();

		public RValue ToRvalue()
		{
			throw new NotImplementedException();
		}
	}



	internal class Reference : LValue
	{
		public string Name { get; set; }

		public Record Record { get; set; }

		public PrimitiveDataType Type => PrimitiveDataType.Pointer;

		public Reference(string name, Record record)
		{
			Name = name;
			Record = record;
		}

		public RValue ToRvalue()
		{
			throw new NotImplementedException();
		}
	}

	#region Literals
	internal class Pointer : LValue, IAtom
	{
		public string Name { get; set; }
		public PointerLiteral Value { get; set; }
		public int Address { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }

		public PrimitiveDataType Type { get; }
		public Pointer(string name, PrimitiveDataType type, PointerLiteral to)
		{
			Name = name;
			Type = type;
			Value = to;
		}

		public RValue ToRvalue()
		{
			return Value;
		}
	}

	internal class StructurePointer : LValue, IAtom
	{
		public readonly string StructName;
		public StructPointerLiteral Pointee { get; set; }

		public PrimitiveDataType Type => PrimitiveDataType.Pointer;

		public string Name { get; set; }

		public StructurePointer(string name, string structName, StructPointerLiteral to)
		{
			Name = name;
			StructName = structName;
			Pointee = to;
		}

		public RValue ToRvalue()
		{
			return Pointee;
		}
	}

	internal class StructPointerLiteral : RValue, IAtom
	{
		public readonly string StructName;
		public readonly Record Record;
		public PrimitiveDataType Type => PrimitiveDataType.Pointer;

		public StructPointerLiteral(string structName, Record record)
		{
			StructName = structName;
			Record = record;
		}
	}
	internal class FloatLiteral : Literal, IAtom, RValue
	{
		public readonly float Value;

		public FloatLiteral(float value)
		{
			Value = value;
		}

		public PrimitiveDataType Type => PrimitiveDataType.Float;
	}



	internal class IntLiteral : Literal, IAtom, RValue
	{ 
		public readonly int Value;
		
		public IntLiteral(int value)
		{
			Value = value;
		}

		public PrimitiveDataType Type => PrimitiveDataType.Int;
	}

	internal class PointerLiteral : IAtom, RValue
	{
		public readonly LValue pointee;
		public PointerLiteral(LValue to)
		{
			pointee = to;
		}

		public PrimitiveDataType Type => throw new NotImplementedException();
	}
	#endregion
}
