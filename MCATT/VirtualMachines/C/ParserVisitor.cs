using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

namespace MCATT.VirtualMachines.C
{
	internal class ParserVisitor : CBaseVisitor<IAtom>
	{
		public CVM VM { get; }

		public ParserVisitor(CVM vm)
		{
			VM = vm;
		}

	
		#region Declaration
		private bool IsAssignableTo(IAtom destination, IAtom source)
		{
			if(
				destination is IntLiteral && source is IntLiteral		||
				destination is IntLiteral && source is FloatLiteral		||
				destination is FloatLiteral && source is IntLiteral		||
				destination is FloatLiteral && source is FloatLiteral
			)return true;

			return false;
		}
		private bool IsAssignableToType(PrimitiveDataType destination, IAtom source)
		{
			if (
				destination == PrimitiveDataType.Int && source is IntLiteral		||
				destination == PrimitiveDataType.Int && source is FloatLiteral		||
				destination == PrimitiveDataType.Float && source is IntLiteral		||
				destination == PrimitiveDataType.Float && source is FloatLiteral
			) return true;

			return false;
		}

		private PrimitiveDataType GetTypeFromString(string type)
		{
			switch (type)
			{
				case "int":		return PrimitiveDataType.Int;
				case "float":	return PrimitiveDataType.Float;
				default: return PrimitiveDataType.Unknown;
			}
		}
		
		private bool IsTypeFromStringPrimitive(string type)
		{
			if(type == "int") return true;
			if(type == "float") return true;
			else return false;
		}

		public override IAtom VisitDeclStruct([NotNull] CParser.DeclStructContext context)
		{
			string name = context.structDecl().identifier().GetText();

			List<(string name, Kind type)> members = new List<(string name, Kind type)>();

			foreach (var memberdecl in context.structDecl().memberDecl())
			{
				Kind kind = new Kind();
				string memName = null;
				string strType = null;

				if(memberdecl.type() != null)
				{
					strType = memberdecl.type().GetText();
					memName = memberdecl.identifier(0).GetText();
				}
				else
				{
					strType = memberdecl.identifier(0).GetText();
					memName = memberdecl.identifier(1).GetText();
				}

				if(memberdecl.pointer() != null) // if it's a pointer
				{
					if (IsTypeFromStringPrimitive(strType))
					{
						kind.IsPointerToPrimitive = true;
						kind.DataType = GetTypeFromString(strType);
					}
					else
					{
						kind.IsPointerToStructure = true;

						if (strType == name)
							kind.StructureName = strType;

						else if(VM.Environment.GetStructure(strType) != null)
							kind.StructureName = strType;
					}
				}
				else
				{
					if (IsTypeFromStringPrimitive(strType))
					{
						kind.IsPrimitive = true;
						kind.DataType = GetTypeFromString(strType);
					}
					else
					{
						if(strType != name)
							VM.Environment.GetStructure(strType);

						kind.IsReference = true;
						kind.StructureName= strType;
					}
				}
				members.Add((memName, kind));
			}

			VM.Environment.DefineStructure(new Structure(name, members));

			return null;
		}

		//public override IAtom VisitDeclStructRecord([NotNull] CParser.DeclStructRecordContext context)
		//{
		//	string structName = context.identifier(0).GetText();
		//	string recordName = context.identifier(1).GetText();
		//	Record record = new Record();
		//	record.Name = recordName;
		//	record.StructureName = structName;

		//	// Build Struct
		//	Structure strct = VM.Environment.GetStructure(structName);
		//	foreach(var member in strct.Members)
		//	{
		//		if (member.type.IsPrimitive)
		//		{
		//			if (member.type.DataType == PrimitiveDataType.Int)
		//				record.Members.Add(member.name, new Variable(member.name, member.type.DataType, new IntLiteral(0)));

		//			if (member.type.DataType == PrimitiveDataType.Float)
		//				record.Members.Add(member.name, new Variable(member.name, member.type.DataType, new FloatLiteral(0)));
		//		}
		//		else if (member.type.IsPointerToPrimitive)
		//		{
		//			record.Members.Add(member.name, new Pointer(member.name, member.type.DataType, new PointerLiteral(null)));
		//		}
		//		else if (member.type.IsPointerToStructure)
		//		{
		//			record.Members.Add(member.name, new StructurePointer(member.name, member.type.StructureName, null));
		//		}
		//		else
		//			throw new CompileErrorException("something wrong");
		//	}
		//	Reference reference = new Reference(recordName, record);

		//	VM.Environment.DefineVariable(record);
		//	return null;
		//}

		public override IAtom VisitDeclReference([NotNull] CParser.DeclReferenceContext context)
		{
			string structName = context.identifier().GetText();
			
			if(VM.Environment.GetStructure(structName) != null)
			{
				foreach (var declarator in context.declarators().declarator()) {

					string name = declarator.declId().identifier().GetText();

					IAtom init = null;
					Record rec = null;

					if (declarator.initializer() != null)
					{
						init = Visit(declarator.initializer().expression());

						if (init is Reference)
							rec = ((Reference)init).Record;
						else
							throw new CompileErrorException("Can't assign ");
					}
					else
					{
						rec = Record.NullRecord;
					}		
					
					Reference reference = new Reference(name, rec);

					VM.Environment.DefineVariable(reference);
				}
			}

			return null;
		}


		public override IAtom VisitExprConstructor([NotNull] CParser.ExprConstructorContext context)
		{
			Record record = new Record();
			string className = context.identifier().GetText();

			Reference reference = new Reference(className, record);

			Structure strct = VM.Environment.GetStructure(className);
			foreach (var member in strct.Members)
			{
				if (member.type.IsPrimitive)
				{
					if (member.type.DataType == PrimitiveDataType.Int)
						record.Members.Add(member.name, new Variable(member.name, member.type.DataType, new IntLiteral(0)));

					if (member.type.DataType == PrimitiveDataType.Float)
						record.Members.Add(member.name, new Variable(member.name, member.type.DataType, new FloatLiteral(0)));
				}
				else if (member.type.IsPointerToPrimitive)
				{
					record.Members.Add(member.name, new Pointer(member.name, member.type.DataType, new PointerLiteral(null)));
				}
				else if (member.type.IsPointerToStructure)
				{
					record.Members.Add(member.name, new StructurePointer(member.name, member.type.StructureName, null));
				}else if (member.type.IsReference)
				{
					record.Members.Add(member.name, new Reference(member.name, Record.NullRecord));
				}
				else
					throw new CompileErrorException("something wrong");
			}

			return reference;
		}
		public override IAtom VisitExprMemberAcess([NotNull] CParser.ExprMemberAcessContext context)
		{
			IAtom _ref = Visit(context.expression());
			if (_ref is Reference == false)
				throw new CompileErrorException("Only can access references");

			string member = context.identifier().GetText();

			var members = ((Reference)_ref).Record.Members;

			if (members.ContainsKey(member))
				return members[member];
			else
				throw new CompileErrorException($"record {((Record)_ref).Name} doesn't have member '{member}'");
		}
		public override IAtom VisitDeclPrimitiveVar([NotNull] CParser.DeclPrimitiveVarContext context)
		{
			
			var type = context.type().primitiveTypes();
			bool _unsigned = false;
			bool _isPointer = false;
			// Check sign
			if (type.signedorunsigned() != null)
			{
				_unsigned = type.signedorunsigned().GetText() == "unsigned" ? true : false;
			}

			var _type = GetTypeFromString(type.arithType().GetText());


			foreach (var declarator in context.declarators().declarator())
			{
				LValue variable = null;
				string _name = declarator.declId().identifier().GetText();
				IAtom _val = null;
				var initializer = declarator.initializer();

				if (declarator.declId().pointer() != null)
				{

					if (initializer.arrayInit() != null)
						throw new CompileErrorException("Can't assign array to pointer");

					_val = Visit(initializer.expression());

					// check if references an LValue
					if (_val is PointerLiteral == false)
						throw new CompileErrorException("Pointers can only be assigned to lvalue reference");

					variable = new Pointer(_name, _type, (PointerLiteral)_val);
				}
				else if (initializer.arrayInit() != null)
				{
					if (declarator.declId().arrBracket() == null)
						throw new CompileErrorException("Can't assign array to non-array type");

					List<IAtom> inits = new List<IAtom>();
					// For now, first-dimension arrays only
					foreach (var init in initializer.arrayInit().initializer())
					{
						// todo: Check if same types
						// int x = {1,2,3};
						if (IsAssignableToType(_type, Visit(init)))
							inits.Add(Visit(init));
						else
							throw new CompileErrorException("Different types");
						variable = new ArrayVariable(_name, inits.ToArray());
					}
				}
				else
				{
					_val = Visit(initializer.expression());
					variable = new Variable(_name, _type, _val);
				}

				VM.Environment.DefineVariable(variable);
			}

			return null;
		}
		#endregion


		#region Statements
		private bool IsTruthy(IAtom conditionExpr)
		{
			if(conditionExpr is Variable)
				conditionExpr = ((Variable)conditionExpr).Value;

			if(conditionExpr is IntLiteral)
			{
				if (((IntLiteral)conditionExpr).Value == 0)
					return false;
				else
					return true;
			}
			return false;
		}

		public override IAtom VisitStmtIf([NotNull] CParser.StmtIfContext context)
		{
			IAtom conditionExpr = Visit(context.exprpar().expression());
			bool condition = IsTruthy(conditionExpr);

			if (condition)
				Visit(context.statement(0));
			else
				Visit(context.statement(1));

			return null;
		}


		#endregion
		#region Expressions
		public override IAtom VisitExprAS([NotNull] CParser.ExprASContext context)
		{
			object lhs = Visit(context.expression(0));
			object rhs = Visit(context.expression(1));
			string op = context.bop.Text;

			if (lhs is Variable)
				lhs = ((Variable)lhs).Value;

			if (rhs is Variable)
				rhs = ((Variable)rhs).Value;

			if (op == "+")
			{
				if (lhs is IntLiteral && rhs is IntLiteral)
					return new IntLiteral(((IntLiteral)lhs).Value + ((IntLiteral)rhs).Value);

				if (lhs is IntLiteral && rhs is FloatLiteral)
					return new FloatLiteral(((IntLiteral)lhs).Value + ((FloatLiteral)rhs).Value);

				if (lhs is FloatLiteral && rhs is IntLiteral)
					return new FloatLiteral(((FloatLiteral)lhs).Value + ((IntLiteral)rhs).Value);

				if (lhs is FloatLiteral && rhs is FloatLiteral)
					return new FloatLiteral(((FloatLiteral)lhs).Value + ((FloatLiteral)rhs).Value);

				
			}

			if (op == "-")
			{
				if (lhs is IntLiteral && rhs is IntLiteral)
					return new IntLiteral(((IntLiteral)lhs).Value - ((IntLiteral)rhs).Value);

				if (lhs is IntLiteral && rhs is FloatLiteral)
					return new FloatLiteral(((IntLiteral)lhs).Value - ((FloatLiteral)rhs).Value);

				if (lhs is FloatLiteral && rhs is IntLiteral)
					return new FloatLiteral(((FloatLiteral)lhs).Value - ((IntLiteral)rhs).Value);

				if (lhs is FloatLiteral && rhs is FloatLiteral)
					return new FloatLiteral(((FloatLiteral)lhs).Value - ((FloatLiteral)rhs).Value);
			}

			if (op == "*")
			{
				if (lhs is IntLiteral && rhs is IntLiteral)
					return new IntLiteral(((IntLiteral)lhs).Value + ((IntLiteral)rhs).Value);

				if (lhs is IntLiteral && rhs is FloatLiteral)
					return new FloatLiteral(((IntLiteral)lhs).Value + ((FloatLiteral)rhs).Value);

				if (lhs is FloatLiteral && rhs is IntLiteral)
					return new FloatLiteral(((FloatLiteral)lhs).Value + ((IntLiteral)rhs).Value);

				if (lhs is FloatLiteral && rhs is FloatLiteral)
					return new FloatLiteral(((FloatLiteral)lhs).Value + ((FloatLiteral)rhs).Value);
			}

			if (op == "/")
			{
				if (lhs is IntLiteral && rhs is IntLiteral)
					return new IntLiteral(((IntLiteral)lhs).Value + ((IntLiteral)rhs).Value);

				if (lhs is IntLiteral && rhs is FloatLiteral)
					return new FloatLiteral(((IntLiteral)lhs).Value + ((FloatLiteral)rhs).Value);

				if (lhs is FloatLiteral && rhs is IntLiteral)
					return new FloatLiteral(((FloatLiteral)lhs).Value + ((IntLiteral)rhs).Value);

				if (lhs is FloatLiteral && rhs is FloatLiteral)
					return new FloatLiteral(((FloatLiteral)lhs).Value + ((FloatLiteral)rhs).Value);
			}

			return null;
		}

		public override IAtom VisitExprRightAssociation([NotNull] CParser.ExprRightAssociationContext context)
		{
			IAtom lhs = Visit(context.expression(0));
			IAtom rhs = Visit(context.expression(1));

			LValue lvalue = null;

			if (lhs is LValue)
				lvalue = (LValue)lhs;
			else
				throw new CompileErrorException("The left hand side has to be a lvalue to be assigned to");


			string op = context.bop.Text;
			switch (op)
			{
				case "=":
					if(lvalue is StructurePointer)
					{
						if(rhs is StructPointerLiteral)
						{
							StructPointerLiteral structPtrVal = (StructPointerLiteral)rhs;
							StructurePointer structPtr = (StructurePointer)lhs;

							if (structPtr.StructName == structPtrVal.StructName)
								structPtr.Pointee = structPtrVal;
							else
								throw new CompileErrorException("Different types");
						}
					}
					if (lvalue is Variable)
					{
						Variable v = (Variable)lvalue;

						if (v.Type == PrimitiveDataType.Float)
						{
							if (rhs is FloatLiteral)
							{
								v.Value = ((FloatLiteral)lvalue);
								return v.Value;
							}

							if (rhs is IntLiteral)
							{
								v.Value = ((IntLiteral)lvalue);
								return v.Value;
							}
						}

						if (v.Type == PrimitiveDataType.Int)
						{
							if (rhs is FloatLiteral)
							{
								// Warn!
								v.Value = ((FloatLiteral)lvalue);
								return v.Value;
							}

							if (rhs is IntLiteral)
							{
								v.Value = (IntLiteral)rhs;
								return v.Value;
							}
						}
					}
					break;
			}
			return null;

		}
		#endregion

		#region Literals
		public override IAtom VisitIntegerLiteral([NotNull] CParser.IntegerLiteralContext context)
		{
			return new IntLiteral(int.Parse(context.GetText()));
		}

		public override IAtom VisitFloatLiteral([NotNull] CParser.FloatLiteralContext context)
		{
			return new FloatLiteral(float.Parse(context.GetText()));
		}

		public override IAtom VisitFuncCall([NotNull] CParser.FuncCallContext context)
		{
			object obj = Visit(context.expressionList().expression(0));

			if (context.identifier().GetText() == "typeof")
			{
				Console.WriteLine($"{context.expressionList().expression(0).GetText()} is {obj.ToString().Split('.')[^1]}");
				return null;
			}

			// RValue-ize the parameter 
			if(obj is Variable)
				obj = ((Variable)obj).Value;

			if (obj is StructurePointer)
				obj = ((StructurePointer)obj).Pointee;

			else if (obj is StructPointerLiteral)
				obj = ((StructPointerLiteral)obj).Record;

			else if (obj is Pointer)
				obj = ((PointerLiteral)obj).pointee;

			else if(obj is IntLiteral)
				obj = ((IntLiteral)obj).Value;

			Console.WriteLine(obj);
			return null;
			string name = context.identifier().GetText();
			List<object> args = new List<object>();
			foreach(var arg in context.expressionList().expression())
			{
				args.Add(Visit(arg));
			}

			//Statements.Add(new FunctionCall(name, args));
			return null;
		}
		public override IAtom VisitExprGroupedExpression([NotNull] CParser.ExprGroupedExpressionContext context)
		{
			return Visit(context.expression());
		}
		public override IAtom VisitPrimaryIdentifier([NotNull] CParser.PrimaryIdentifierContext context)
		{
			return VM.Environment.GetLValue(context.identifier().GetText());
		}

		public override IAtom VisitExprIndirection([NotNull] CParser.ExprIndirectionContext context)
		{
			IAtom operand = Visit(context.expression());

			if(context.prefix.Text == "&")
			{
				if (operand is Record)
					return new StructPointerLiteral(((Record)operand).StructureName, (Record)operand);
				else if (operand is LValue)
					return new PointerLiteral((LValue)operand);
				else
					throw new CompileErrorException("Pointer should point to LValue");

			}
			else // prefix == "*"
			{
				if (operand is StructurePointer)
					return ((StructurePointer)operand).Pointee.Record;


				else if (operand is PointerLiteral)
					return ((PointerLiteral)operand).pointee;
				else
					throw new CompileErrorException("Only can dereference a pointer");
			}
		}
		#endregion

	}
}
