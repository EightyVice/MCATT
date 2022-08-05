namespace MCATT.VirtualMachines.C
{
	internal class Environment
	{
		private Dictionary<string, LValue> variables = new Dictionary<string, LValue>();
		private Dictionary<string, Structure> structures = new Dictionary<string, Structure>();

		public void DefineStructure(Structure structure)
		{
			if (structures.ContainsKey(structure.Name))
				throw new CompileErrorException("Structure already defined");
			else
				structures.Add(structure.Name, structure);
		}
		public Structure GetStructure(string Name)
		{
			if (structures.ContainsKey(Name))
				return structures[Name];
			else
				throw new CompileErrorException("Structure doesnt exists");
		}
		public void DefineVariable(LValue variable)
		{
			if (variables.ContainsKey(variable.Name))
			{
				throw new CompileErrorException($"{variable.Name} already defined.");
			}
			else
			{
				variables.Add(variable.Name, variable);
			}
		}

		public void DefineVariable(Variable variable)
		{
			DefineVariable(variable.Name, variable.Type, variable.Value);
		}

		public LValue GetLValue(string Name)
		{
			if (variables.ContainsKey(Name))
			{
				return variables[Name];
			}
			else
			{
				throw new CompileErrorException($"{Name} is not defined.");
			}
		}
		public void DefineVariable(string Name, PrimitiveDataType type, IAtom init)
		{
			if (variables.ContainsKey(Name))
			{
				throw new CompileErrorException($"{Name} already defined.");
			}
			else
			{
				variables.Add(Name, new Variable(Name, type, init));

			}
		}

		public void SetLValue(string Name, IAtom Value)
		{
			if (variables.ContainsKey(Name))
			{
				if(variables[Name] is Variable)
				{
					((Variable)variables[Name]).Value = Value;

				}
			}
			else
			{
				throw new CompileErrorException($"{Name} is not defined.");
			}
		}
	}
}
