// Generated from c:\Users\8yvic\source\repos\MCATT\MCATT\JavaParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, MODULE=51, OPEN=52, REQUIRES=53, EXPORTS=54, OPENS=55, TO=56, 
		USES=57, PROVIDES=58, WITH=59, TRANSITIVE=60, VAR=61, YIELD=62, RECORD=63, 
		SEALED=64, PERMITS=65, NON_SEALED=66, DECIMAL_LITERAL=67, HEX_LITERAL=68, 
		OCT_LITERAL=69, BINARY_LITERAL=70, FLOAT_LITERAL=71, HEX_FLOAT_LITERAL=72, 
		BOOL_LITERAL=73, CHAR_LITERAL=74, STRING_LITERAL=75, TEXT_BLOCK=76, NULL_LITERAL=77, 
		LPAREN=78, RPAREN=79, LBRACE=80, RBRACE=81, LBRACK=82, RBRACK=83, SEMI=84, 
		COMMA=85, DOT=86, ASSIGN=87, GT=88, LT=89, BANG=90, TILDE=91, QUESTION=92, 
		COLON=93, EQUAL=94, LE=95, GE=96, NOTEQUAL=97, AND=98, OR=99, INC=100, 
		DEC=101, ADD=102, SUB=103, MUL=104, DIV=105, BITAND=106, BITOR=107, CARET=108, 
		MOD=109, ADD_ASSIGN=110, SUB_ASSIGN=111, MUL_ASSIGN=112, DIV_ASSIGN=113, 
		AND_ASSIGN=114, OR_ASSIGN=115, XOR_ASSIGN=116, MOD_ASSIGN=117, LSHIFT_ASSIGN=118, 
		RSHIFT_ASSIGN=119, URSHIFT_ASSIGN=120, ARROW=121, COLONCOLON=122, AT=123, 
		ELLIPSIS=124, WS=125, COMMENT=126, LINE_COMMENT=127, IDENTIFIER=128;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_classBody = 16, RULE_interfaceBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_memberDeclaration = 19, RULE_methodDeclaration = 20, 
		RULE_methodBody = 21, RULE_typeTypeOrVoid = 22, RULE_genericMethodDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_constructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31, 
		RULE_interfaceMethodModifier = 32, RULE_genericInterfaceMethodDeclaration = 33, 
		RULE_interfaceCommonBodyDeclaration = 34, RULE_variableDeclarators = 35, 
		RULE_variableDeclarator = 36, RULE_variableDeclaratorId = 37, RULE_variableInitializer = 38, 
		RULE_arrayInitializer = 39, RULE_classOrInterfaceType = 40, RULE_typeArgument = 41, 
		RULE_qualifiedNameList = 42, RULE_formalParameters = 43, RULE_receiverParameter = 44, 
		RULE_formalParameterList = 45, RULE_formalParameter = 46, RULE_lastFormalParameter = 47, 
		RULE_lambdaLVTIList = 48, RULE_lambdaLVTIParameter = 49, RULE_qualifiedName = 50, 
		RULE_literal = 51, RULE_integerLiteral = 52, RULE_floatLiteral = 53, RULE_altAnnotationQualifiedName = 54, 
		RULE_annotation = 55, RULE_elementValuePairs = 56, RULE_elementValuePair = 57, 
		RULE_elementValue = 58, RULE_elementValueArrayInitializer = 59, RULE_annotationTypeDeclaration = 60, 
		RULE_annotationTypeBody = 61, RULE_annotationTypeElementDeclaration = 62, 
		RULE_annotationTypeElementRest = 63, RULE_annotationMethodOrConstantRest = 64, 
		RULE_annotationMethodRest = 65, RULE_annotationConstantRest = 66, RULE_defaultValue = 67, 
		RULE_moduleDeclaration = 68, RULE_moduleBody = 69, RULE_moduleDirective = 70, 
		RULE_requiresModifier = 71, RULE_recordDeclaration = 72, RULE_recordHeader = 73, 
		RULE_recordComponentList = 74, RULE_recordComponent = 75, RULE_recordBody = 76, 
		RULE_block = 77, RULE_prog = 78, RULE_blockStatement = 79, RULE_localVariableDeclaration = 80, 
		RULE_identifier = 81, RULE_localTypeDeclaration = 82, RULE_statement = 83, 
		RULE_catchClause = 84, RULE_catchType = 85, RULE_finallyBlock = 86, RULE_resourceSpecification = 87, 
		RULE_resources = 88, RULE_resource = 89, RULE_switchBlockStatementGroup = 90, 
		RULE_switchLabel = 91, RULE_forControl = 92, RULE_forInit = 93, RULE_enhancedForControl = 94, 
		RULE_parExpression = 95, RULE_expressionList = 96, RULE_methodCall = 97, 
		RULE_expression = 98, RULE_pattern = 99, RULE_lambdaExpression = 100, 
		RULE_lambdaParameters = 101, RULE_lambdaBody = 102, RULE_primary = 103, 
		RULE_switchExpression = 104, RULE_switchLabeledRule = 105, RULE_guardedPattern = 106, 
		RULE_switchRuleOutcome = 107, RULE_classType = 108, RULE_creator = 109, 
		RULE_createdName = 110, RULE_innerCreator = 111, RULE_arrayCreatorRest = 112, 
		RULE_classCreatorRest = 113, RULE_explicitGenericInvocation = 114, RULE_typeArgumentsOrDiamond = 115, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 116, RULE_nonWildcardTypeArguments = 117, 
		RULE_typeList = 118, RULE_typeType = 119, RULE_primitiveType = 120, RULE_typeArguments = 121, 
		RULE_superSuffix = 122, RULE_explicitGenericInvocationSuffix = 123, RULE_arguments = 124;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
			"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "classBody", 
			"interfaceBody", "classBodyDeclaration", "memberDeclaration", "methodDeclaration", 
			"methodBody", "typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
			"interfaceCommonBodyDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "classOrInterfaceType", 
			"typeArgument", "qualifiedNameList", "formalParameters", "receiverParameter", 
			"formalParameterList", "formalParameter", "lastFormalParameter", "lambdaLVTIList", 
			"lambdaLVTIParameter", "qualifiedName", "literal", "integerLiteral", 
			"floatLiteral", "altAnnotationQualifiedName", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "moduleDeclaration", "moduleBody", "moduleDirective", 
			"requiresModifier", "recordDeclaration", "recordHeader", "recordComponentList", 
			"recordComponent", "recordBody", "block", "prog", "blockStatement", "localVariableDeclaration", 
			"identifier", "localTypeDeclaration", "statement", "catchClause", "catchType", 
			"finallyBlock", "resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "expression", "pattern", "lambdaExpression", 
			"lambdaParameters", "lambdaBody", "primary", "switchExpression", "switchLabeledRule", 
			"guardedPattern", "switchRuleOutcome", "classType", "creator", "createdName", 
			"innerCreator", "arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'module'", 
			"'open'", "'requires'", "'exports'", "'opens'", "'to'", "'uses'", "'provides'", 
			"'with'", "'transitive'", "'var'", "'yield'", "'record'", "'sealed'", 
			"'permits'", "'non-sealed'", null, null, null, null, null, null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'->'", 
			"'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "MODULE", 
			"OPEN", "REQUIRES", "EXPORTS", "OPENS", "TO", "USES", "PROVIDES", "WITH", 
			"TRANSITIVE", "VAR", "YIELD", "RECORD", "SEALED", "PERMITS", "NON_SEALED", 
			"DECIMAL_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", 
			"HEX_FLOAT_LITERAL", "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"TEXT_BLOCK", "NULL_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", 
			"LINE_COMMENT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(250);
					packageDeclaration();
					}
					break;
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT) {
					{
					{
					setState(253);
					importDeclaration();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (CLASS - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (INTERFACE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(259);
					typeDeclaration();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				moduleDeclaration();
				setState(266);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(270);
				annotation();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(PACKAGE);
			setState(277);
			qualifiedName();
			setState(278);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(IMPORT);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(281);
				match(STATIC);
				}
			}

			setState(284);
			qualifiedName();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(285);
				match(DOT);
				setState(286);
				match(MUL);
				}
			}

			setState(289);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			int _alt;
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(291);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(297);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(298);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(299);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(300);
					annotationTypeDeclaration();
					}
					break;
				case RECORD:
					{
					setState(301);
					recordDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode NON_SEALED() { return getToken(JavaParser.NON_SEALED, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				annotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(PUBLIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(PROTECTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(PRIVATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				match(STATIC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				match(ABSTRACT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(320);
				match(FINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(321);
				match(STRICTFP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(322);
				match(SEALED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(323);
				match(NON_SEALED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(FINAL);
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(CLASS);
			setState(331);
			identifier();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(332);
				typeParameters();
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(335);
				match(EXTENDS);
				setState(336);
				typeType();
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(339);
				match(IMPLEMENTS);
				setState(340);
				typeList();
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(343);
				match(PERMITS);
				setState(344);
				typeList();
				}
			}

			setState(347);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(LT);
			setState(350);
			typeParameter();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(351);
				match(COMMA);
				setState(352);
				typeParameter();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					annotation();
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(366);
			identifier();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(367);
				match(EXTENDS);
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(368);
						annotation();
						}
						} 
					}
					setState(373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(374);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			typeType();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(378);
				match(BITAND);
				setState(379);
				typeType();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(ENUM);
			setState(386);
			identifier();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(387);
				match(IMPLEMENTS);
				setState(388);
				typeList();
				}
			}

			setState(391);
			match(LBRACE);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(392);
				enumConstants();
				}
			}

			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(395);
				match(COMMA);
				}
			}

			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(398);
				enumBodyDeclarations();
				}
			}

			setState(401);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			enumConstant();
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(404);
					match(COMMA);
					setState(405);
					enumConstant();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(411);
					annotation();
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(417);
			identifier();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(418);
				arguments();
				}
			}

			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(421);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(SEMI);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(425);
				classBodyDeclaration();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public List<TypeListContext> typeList() {
			return getRuleContexts(TypeListContext.class);
		}
		public TypeListContext typeList(int i) {
			return getRuleContext(TypeListContext.class,i);
		}
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(INTERFACE);
			setState(432);
			identifier();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(433);
				typeParameters();
				}
			}

			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(436);
				match(EXTENDS);
				setState(437);
				typeList();
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(440);
				match(PERMITS);
				setState(441);
				typeList();
				}
			}

			setState(444);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(LBRACE);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(447);
				classBodyDeclaration();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(LBRACE);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DEFAULT - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(456);
				interfaceBodyDeclaration();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(465);
					match(STATIC);
					}
				}

				setState(468);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(469);
						modifier();
						}
						} 
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(475);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_memberDeclaration);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(483);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(484);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(485);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(486);
				enumDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(487);
				recordDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			typeTypeOrVoid();
			setState(491);
			identifier();
			setState(492);
			formalParameters();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(493);
				match(LBRACK);
				setState(494);
				match(RBRACK);
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(500);
				match(THROWS);
				setState(501);
				qualifiedNameList();
				}
			}

			setState(504);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodBody);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeTypeOrVoid);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			typeParameters();
			setState(515);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			typeParameters();
			setState(518);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			identifier();
			setState(521);
			formalParameters();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(522);
				match(THROWS);
				setState(523);
				qualifiedNameList();
				}
			}

			setState(526);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			typeType();
			setState(529);
			variableDeclarators();
			setState(530);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(532);
						modifier();
						}
						} 
					}
					setState(537);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(538);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(547);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(548);
				enumDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(549);
				recordDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			typeType();
			setState(553);
			constantDeclarator();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(554);
				match(COMMA);
				setState(555);
				constantDeclarator();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			identifier();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(564);
				match(LBRACK);
				setState(565);
				match(RBRACK);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			match(ASSIGN);
			setState(572);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(574);
					interfaceMethodModifier();
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(580);
			interfaceCommonBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodModifier);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(586);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(587);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() {
			return getRuleContext(InterfaceCommonBodyDeclarationContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (DEFAULT - 1)) | (1L << (PUBLIC - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(590);
				interfaceMethodModifier();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			typeParameters();
			setState(597);
			interfaceCommonBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceCommonBodyDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceCommonBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCommonBodyDeclaration; }
	}

	public final InterfaceCommonBodyDeclarationContext interfaceCommonBodyDeclaration() throws RecognitionException {
		InterfaceCommonBodyDeclarationContext _localctx = new InterfaceCommonBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_interfaceCommonBodyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					annotation();
					}
					} 
				}
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(605);
			typeTypeOrVoid();
			setState(606);
			identifier();
			setState(607);
			formalParameters();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(608);
				match(LBRACK);
				setState(609);
				match(RBRACK);
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(615);
				match(THROWS);
				setState(616);
				qualifiedNameList();
				}
			}

			setState(619);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			variableDeclarator();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(622);
				match(COMMA);
				setState(623);
				variableDeclarator();
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			variableDeclaratorId();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(630);
				match(ASSIGN);
				setState(631);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			identifier();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(635);
				match(LBRACK);
				setState(636);
				match(RBRACK);
				}
				}
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableInitializer);
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(LBRACE);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(647);
				variableInitializer();
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(648);
						match(COMMA);
						setState(649);
						variableInitializer();
						}
						} 
					}
					setState(654);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(655);
					match(COMMA);
					}
				}

				}
			}

			setState(660);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			identifier();
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(663);
				typeArguments();
				}
				break;
			}
			setState(673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(666);
					match(DOT);
					setState(667);
					identifier();
					setState(669);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(668);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArgument);
		int _la;
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(677);
					annotation();
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(683);
				match(QUESTION);
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(684);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(685);
					typeType();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			qualifiedName();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(691);
				match(COMMA);
				setState(692);
				qualifiedName();
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(LPAREN);
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(699);
					receiverParameter();
					}
				}

				}
				break;
			case 2:
				{
				setState(702);
				receiverParameter();
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(703);
					match(COMMA);
					setState(704);
					formalParameterList();
					}
				}

				}
				break;
			case 3:
				{
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(707);
					formalParameterList();
					}
				}

				}
				break;
			}
			setState(712);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			typeType();
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(715);
				identifier();
				setState(716);
				match(DOT);
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				formalParameter();
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(726);
						match(COMMA);
						setState(727);
						formalParameter();
						}
						} 
					}
					setState(732);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(733);
					match(COMMA);
					setState(734);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(740);
					variableModifier();
					}
					} 
				}
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(746);
			typeType();
			setState(747);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lastFormalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(749);
					variableModifier();
					}
					} 
				}
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(755);
			typeType();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(756);
				annotation();
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(762);
			match(ELLIPSIS);
			setState(763);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaLVTIListContext extends ParserRuleContext {
		public List<LambdaLVTIParameterContext> lambdaLVTIParameter() {
			return getRuleContexts(LambdaLVTIParameterContext.class);
		}
		public LambdaLVTIParameterContext lambdaLVTIParameter(int i) {
			return getRuleContext(LambdaLVTIParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LambdaLVTIListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIList; }
	}

	public final LambdaLVTIListContext lambdaLVTIList() throws RecognitionException {
		LambdaLVTIListContext _localctx = new LambdaLVTIListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lambdaLVTIList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			lambdaLVTIParameter();
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(766);
				match(COMMA);
				setState(767);
				lambdaLVTIParameter();
				}
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaLVTIParameterContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LambdaLVTIParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLVTIParameter; }
	}

	public final LambdaLVTIParameterContext lambdaLVTIParameter() throws RecognitionException {
		LambdaLVTIParameterContext _localctx = new LambdaLVTIParameterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lambdaLVTIParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(773);
					variableModifier();
					}
					} 
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(779);
			match(VAR);
			setState(780);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			identifier();
			setState(787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(783);
					match(DOT);
					setState(784);
					identifier();
					}
					} 
				}
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprTextBlockLiteralContext extends LiteralContext {
		public TerminalNode TEXT_BLOCK() { return getToken(JavaParser.TEXT_BLOCK, 0); }
		public ExprTextBlockLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCharLiteralContext extends LiteralContext {
		public TerminalNode CHAR_LITERAL() { return getToken(JavaParser.CHAR_LITERAL, 0); }
		public ExprCharLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBoolLitearlContext extends LiteralContext {
		public TerminalNode BOOL_LITERAL() { return getToken(JavaParser.BOOL_LITERAL, 0); }
		public ExprBoolLitearlContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIntLiteralContext extends LiteralContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public ExprIntLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class ExprFloatLiteralContext extends LiteralContext {
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public ExprFloatLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class ExprStringLiteralContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(JavaParser.STRING_LITERAL, 0); }
		public ExprStringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNullLiteralContext extends LiteralContext {
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public ExprNullLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		try {
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				_localctx = new ExprIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				_localctx = new ExprFloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				_localctx = new ExprCharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new ExprStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(793);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				_localctx = new ExprBoolLitearlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(794);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				_localctx = new ExprNullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(795);
				match(NULL_LITERAL);
				}
				break;
			case TEXT_BLOCK:
				_localctx = new ExprTextBlockLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(796);
				match(TEXT_BLOCK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(JavaParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(JavaParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(JavaParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(JavaParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(JavaParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(JavaParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltAnnotationQualifiedNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public AltAnnotationQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAnnotationQualifiedName; }
	}

	public final AltAnnotationQualifiedNameContext altAnnotationQualifiedName() throws RecognitionException {
		AltAnnotationQualifiedNameContext _localctx = new AltAnnotationQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_altAnnotationQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(803);
				identifier();
				setState(804);
				match(DOT);
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
			match(AT);
			setState(812);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AltAnnotationQualifiedNameContext altAnnotationQualifiedName() {
			return getRuleContext(AltAnnotationQualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(814);
				match(AT);
				setState(815);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(816);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(819);
				match(LPAREN);
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(820);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(821);
					elementValue();
					}
					break;
				}
				setState(824);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			elementValuePair();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(828);
				match(COMMA);
				setState(829);
				elementValuePair();
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			identifier();
			setState(836);
			match(ASSIGN);
			setState(837);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementValue);
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(841);
				elementValueArrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(LBRACE);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(845);
				elementValue();
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(846);
						match(COMMA);
						setState(847);
						elementValue();
						}
						} 
					}
					setState(852);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
			}

			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(855);
				match(COMMA);
				}
			}

			setState(858);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(AT);
			setState(861);
			match(INTERFACE);
			setState(862);
			identifier();
			setState(863);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(LBRACE);
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(866);
				annotationTypeElementDeclaration();
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(872);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(882);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(874);
						modifier();
						}
						} 
					}
					setState(879);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				setState(880);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationTypeElementRest);
		try {
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				typeType();
				setState(885);
				annotationMethodOrConstantRest();
				setState(886);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
				classDeclaration();
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(889);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(892);
				interfaceDeclaration();
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(893);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(896);
				enumDeclaration();
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(897);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(900);
				annotationTypeDeclaration();
				setState(902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(901);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(904);
				recordDeclaration();
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(905);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationMethodOrConstantRest);
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(910);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			identifier();
			setState(915);
			match(LPAREN);
			setState(916);
			match(RPAREN);
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(917);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(DEFAULT);
			setState(923);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclarationContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_moduleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(925);
				match(OPEN);
				}
			}

			setState(928);
			match(MODULE);
			setState(929);
			qualifiedName();
			setState(930);
			moduleBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ModuleDirectiveContext> moduleDirective() {
			return getRuleContexts(ModuleDirectiveContext.class);
		}
		public ModuleDirectiveContext moduleDirective(int i) {
			return getRuleContext(ModuleDirectiveContext.class,i);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_moduleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(LBRACE);
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << USES) | (1L << PROVIDES))) != 0)) {
				{
				{
				setState(933);
				moduleDirective();
				}
				}
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(939);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDirectiveContext extends ParserRuleContext {
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<RequiresModifierContext> requiresModifier() {
			return getRuleContexts(RequiresModifierContext.class);
		}
		public RequiresModifierContext requiresModifier(int i) {
			return getRuleContext(RequiresModifierContext.class,i);
		}
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public ModuleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDirective; }
	}

	public final ModuleDirectiveContext moduleDirective() throws RecognitionException {
		ModuleDirectiveContext _localctx = new ModuleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_moduleDirective);
		int _la;
		try {
			int _alt;
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRES:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(REQUIRES);
				setState(945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(942);
						requiresModifier();
						}
						} 
					}
					setState(947);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(948);
				qualifiedName();
				setState(949);
				match(SEMI);
				}
				break;
			case EXPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(EXPORTS);
				setState(952);
				qualifiedName();
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(953);
					match(TO);
					setState(954);
					qualifiedName();
					}
				}

				setState(957);
				match(SEMI);
				}
				break;
			case OPENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				match(OPENS);
				setState(960);
				qualifiedName();
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(961);
					match(TO);
					setState(962);
					qualifiedName();
					}
				}

				setState(965);
				match(SEMI);
				}
				break;
			case USES:
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				match(USES);
				setState(968);
				qualifiedName();
				setState(969);
				match(SEMI);
				}
				break;
			case PROVIDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(971);
				match(PROVIDES);
				setState(972);
				qualifiedName();
				setState(973);
				match(WITH);
				setState(974);
				qualifiedName();
				setState(975);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequiresModifierContext extends ParserRuleContext {
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public RequiresModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiresModifier; }
	}

	public final RequiresModifierContext requiresModifier() throws RecognitionException {
		RequiresModifierContext _localctx = new RequiresModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_requiresModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			_la = _input.LA(1);
			if ( !(_la==STATIC || _la==TRANSITIVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordDeclarationContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordHeaderContext recordHeader() {
			return getRuleContext(RecordHeaderContext.class,0);
		}
		public RecordBodyContext recordBody() {
			return getRuleContext(RecordBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public RecordDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDeclaration; }
	}

	public final RecordDeclarationContext recordDeclaration() throws RecognitionException {
		RecordDeclarationContext _localctx = new RecordDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_recordDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(RECORD);
			setState(982);
			identifier();
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(983);
				typeParameters();
				}
			}

			setState(986);
			recordHeader();
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(987);
				match(IMPLEMENTS);
				setState(988);
				typeList();
				}
			}

			setState(991);
			recordBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordHeaderContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public RecordComponentListContext recordComponentList() {
			return getRuleContext(RecordComponentListContext.class,0);
		}
		public RecordHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordHeader; }
	}

	public final RecordHeaderContext recordHeader() throws RecognitionException {
		RecordHeaderContext _localctx = new RecordHeaderContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_recordHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(LPAREN);
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(994);
				recordComponentList();
				}
			}

			setState(997);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordComponentListContext extends ParserRuleContext {
		public List<RecordComponentContext> recordComponent() {
			return getRuleContexts(RecordComponentContext.class);
		}
		public RecordComponentContext recordComponent(int i) {
			return getRuleContext(RecordComponentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public RecordComponentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponentList; }
	}

	public final RecordComponentListContext recordComponentList() throws RecognitionException {
		RecordComponentListContext _localctx = new RecordComponentListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_recordComponentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			recordComponent();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1000);
				match(COMMA);
				setState(1001);
				recordComponent();
				}
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordComponentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordComponent; }
	}

	public final RecordComponentContext recordComponent() throws RecognitionException {
		RecordComponentContext _localctx = new RecordComponentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_recordComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			typeType();
			setState(1008);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public RecordBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordBody; }
	}

	public final RecordBodyContext recordBody() throws RecognitionException {
		RecordBodyContext _localctx = new RecordBodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_recordBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(LBRACE);
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(1011);
				classBodyDeclaration();
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1017);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(LBRACE);
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BREAK - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (CONTINUE - 3)) | (1L << (DO - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (FOR - 3)) | (1L << (IF - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (RETURN - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (THROW - 3)) | (1L << (TRY - 3)) | (1L << (VOID - 3)) | (1L << (WHILE - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(1020);
				blockStatement();
				}
				}
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1026);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BREAK - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (CONTINUE - 3)) | (1L << (DO - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (FOR - 3)) | (1L << (IF - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (RETURN - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (THROW - 3)) | (1L << (TRY - 3)) | (1L << (VOID - 3)) | (1L << (WHILE - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(1028);
				blockStatement();
				}
				}
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_blockStatement);
		try {
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				localVariableDeclaration();
				setState(1035);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1040);
					variableModifier();
					}
					} 
				}
				setState(1045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1046);
				typeType();
				setState(1047);
				variableDeclarators();
				}
				break;
			case 2:
				{
				setState(1049);
				match(VAR);
				setState(1050);
				identifier();
				setState(1051);
				match(ASSIGN);
				setState(1052);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode MODULE() { return getToken(JavaParser.MODULE, 0); }
		public TerminalNode OPEN() { return getToken(JavaParser.OPEN, 0); }
		public TerminalNode REQUIRES() { return getToken(JavaParser.REQUIRES, 0); }
		public TerminalNode EXPORTS() { return getToken(JavaParser.EXPORTS, 0); }
		public TerminalNode OPENS() { return getToken(JavaParser.OPENS, 0); }
		public TerminalNode TO() { return getToken(JavaParser.TO, 0); }
		public TerminalNode USES() { return getToken(JavaParser.USES, 0); }
		public TerminalNode PROVIDES() { return getToken(JavaParser.PROVIDES, 0); }
		public TerminalNode WITH() { return getToken(JavaParser.WITH, 0); }
		public TerminalNode TRANSITIVE() { return getToken(JavaParser.TRANSITIVE, 0); }
		public TerminalNode YIELD() { return getToken(JavaParser.YIELD, 0); }
		public TerminalNode SEALED() { return getToken(JavaParser.SEALED, 0); }
		public TerminalNode PERMITS() { return getToken(JavaParser.PERMITS, 0); }
		public TerminalNode RECORD() { return getToken(JavaParser.RECORD, 0); }
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public RecordDeclarationContext recordDeclaration() {
			return getRuleContext(RecordDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_localTypeDeclaration);
		try {
			int _alt;
			setState(1070);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case NON_SEALED:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1058);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(1063);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				}
				setState(1067);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(1064);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(1065);
					interfaceDeclaration();
					}
					break;
				case RECORD:
					{
					setState(1066);
					recordDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtReturnContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtReturnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtBlockContext extends StatementContext {
		public BlockContext blockLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtBlockContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtContinueContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StmtContinueContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtWhileContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StmtWhileContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtSemicolonContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public StmtSemicolonContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtForContext extends StatementContext {
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StmtForContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtSwitchContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public StmtSwitchContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtExpressionContext extends StatementContext {
		public ExpressionContext statementExpression;
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtExpressionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtDoWhileContext extends StatementContext {
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public StmtDoWhileContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtThrowContext extends StatementContext {
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public StmtThrowContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtIfContext extends StatementContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public StmtIfContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmTryCatchContext extends StatementContext {
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public StmTryCatchContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtBreakContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StmtBreakContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new StmtBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				((StmtBlockContext)_localctx).blockLabel = block();
				}
				break;
			case IF:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				match(IF);
				setState(1074);
				parExpression();
				setState(1075);
				statement();
				setState(1078);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1076);
					match(ELSE);
					setState(1077);
					statement();
					}
					break;
				}
				}
				break;
			case FOR:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1080);
				match(FOR);
				setState(1081);
				match(LPAREN);
				setState(1082);
				forControl();
				setState(1083);
				match(RPAREN);
				setState(1084);
				statement();
				}
				break;
			case WHILE:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1086);
				match(WHILE);
				setState(1087);
				parExpression();
				setState(1088);
				statement();
				}
				break;
			case DO:
				_localctx = new StmtDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1090);
				match(DO);
				setState(1091);
				statement();
				setState(1092);
				match(WHILE);
				setState(1093);
				parExpression();
				setState(1094);
				match(SEMI);
				}
				break;
			case TRY:
				_localctx = new StmTryCatchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1096);
				match(TRY);
				setState(1097);
				block();
				setState(1107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1099); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1098);
						catchClause();
						}
						}
						setState(1101); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1103);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1106);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SWITCH:
				_localctx = new StmtSwitchContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1109);
				match(SWITCH);
				setState(1110);
				parExpression();
				setState(1111);
				match(LBRACE);
				setState(1115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1112);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(1117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				}
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1118);
					switchLabel();
					}
					}
					setState(1123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1124);
				match(RBRACE);
				}
				break;
			case RETURN:
				_localctx = new StmtReturnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1126);
				match(RETURN);
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1127);
					expression(0);
					}
				}

				setState(1130);
				match(SEMI);
				}
				break;
			case THROW:
				_localctx = new StmtThrowContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1131);
				match(THROW);
				setState(1132);
				expression(0);
				setState(1133);
				match(SEMI);
				}
				break;
			case BREAK:
				_localctx = new StmtBreakContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1135);
				match(BREAK);
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1136);
					identifier();
					}
				}

				setState(1139);
				match(SEMI);
				}
				break;
			case CONTINUE:
				_localctx = new StmtContinueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1140);
				match(CONTINUE);
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1141);
					identifier();
					}
				}

				setState(1144);
				match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new StmtSemicolonContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1145);
				match(SEMI);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				_localctx = new StmtExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1146);
				((StmtExpressionContext)_localctx).statementExpression = expression(0);
				setState(1147);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(CATCH);
			setState(1152);
			match(LPAREN);
			setState(1156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1153);
					variableModifier();
					}
					} 
				}
				setState(1158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1159);
			catchType();
			setState(1160);
			identifier();
			setState(1161);
			match(RPAREN);
			setState(1162);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			qualifiedName();
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1165);
				match(BITOR);
				setState(1166);
				qualifiedName();
				}
				}
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(FINALLY);
			setState(1173);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(LPAREN);
			setState(1176);
			resources();
			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1177);
				match(SEMI);
				}
			}

			setState(1180);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			resource();
			setState(1187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1183);
					match(SEMI);
					setState(1184);
					resource();
					}
					} 
				}
				setState(1189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_resource);
		try {
			int _alt;
			setState(1207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1190);
						variableModifier();
						}
						} 
					}
					setState(1195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				}
				setState(1201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1196);
					classOrInterfaceType();
					setState(1197);
					variableDeclaratorId();
					}
					break;
				case 2:
					{
					setState(1199);
					match(VAR);
					setState(1200);
					identifier();
					}
					break;
				}
				setState(1203);
				match(ASSIGN);
				setState(1204);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1209);
				switchLabel();
				}
				}
				setState(1212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1214);
				blockStatement();
				}
				}
				setState(1217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BREAK - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (CONTINUE - 3)) | (1L << (DO - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (FOR - 3)) | (1L << (IF - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (RETURN - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (THROW - 3)) | (1L << (TRY - 3)) | (1L << (VOID - 3)) | (1L << (WHILE - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public IdentifierContext varName;
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_switchLabel);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1219);
				match(CASE);
				setState(1225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1220);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1221);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(1222);
					typeType();
					setState(1223);
					((SwitchLabelContext)_localctx).varName = identifier();
					}
					break;
				}
				setState(1227);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				match(DEFAULT);
				setState(1229);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_forControl);
		int _la;
		try {
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1232);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1233);
					forInit();
					}
				}

				setState(1236);
				match(SEMI);
				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1237);
					expression(0);
					}
				}

				setState(1240);
				match(SEMI);
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1241);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_forInit);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1247);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JavaParser.VAR, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1250);
					variableModifier();
					}
					} 
				}
				setState(1255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1256);
				typeType();
				}
				break;
			case 2:
				{
				setState(1257);
				match(VAR);
				}
				break;
			}
			setState(1260);
			variableDeclaratorId();
			setState(1261);
			match(COLON);
			setState(1262);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(LPAREN);
			setState(1265);
			expression(0);
			setState(1266);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			expression(0);
			setState(1273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1269);
				match(COMMA);
				setState(1270);
				expression(0);
				}
				}
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_methodCall);
		int _la;
		try {
			setState(1295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1276);
				identifier();
				setState(1277);
				match(LPAREN);
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1278);
					expressionList();
					}
				}

				setState(1281);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				match(THIS);
				setState(1284);
				match(LPAREN);
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1285);
					expressionList();
					}
				}

				setState(1288);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1289);
				match(SUPER);
				setState(1290);
				match(LPAREN);
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1291);
					expressionList();
					}
				}

				setState(1294);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprMethodCallContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ExprMethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprTernaryContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public ExprTernaryContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprComparisonContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(JavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaParser.GE, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public ExprComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBitwiseORContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITOR() { return getToken(JavaParser.BITOR, 0); }
		public ExprBitwiseORContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprASContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public ExprASContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrefixArthemticContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public ExprPrefixArthemticContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLogicalORContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(JavaParser.OR, 0); }
		public ExprLogicalORContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprRightAssociationContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JavaParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JavaParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaParser.MOD_ASSIGN, 0); }
		public ExprRightAssociationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprShiftingContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(JavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaParser.GT, i);
		}
		public ExprShiftingContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPostfixContext extends ExpressionContext {
		public Token postfix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public ExprPostfixContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrimaryContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExprPrimaryContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMDMContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaParser.MOD, 0); }
		public ExprMDMContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprXORContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CARET() { return getToken(JavaParser.CARET, 0); }
		public ExprXORContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMemberAcessContext extends ExpressionContext {
		public Token bop;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExprMemberAcessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIsInstanceContext extends ExpressionContext {
		public Token bop;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(JavaParser.INSTANCEOF, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExprIsInstanceContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrefixLogicalContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(JavaParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(JavaParser.BANG, 0); }
		public ExprPrefixLogicalContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCreatorContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ExprCreatorContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBitwiseANDContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITAND() { return getToken(JavaParser.BITAND, 0); }
		public ExprBitwiseANDContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprEqualityContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(JavaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JavaParser.NOTEQUAL, 0); }
		public ExprEqualityContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprArraySubscriptionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public ExprArraySubscriptionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLogicalANDContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(JavaParser.AND, 0); }
		public ExprLogicalANDContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 196;
		enterRecursionRule(_localctx, 196, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1298);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new ExprMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1299);
				methodCall();
				}
				break;
			case 3:
				{
				_localctx = new ExprCreatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1300);
				match(NEW);
				setState(1301);
				creator();
				}
				break;
			case 4:
				{
				_localctx = new ExprPrefixArthemticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1302);
				((ExprPrefixArthemticContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (INC - 100)) | (1L << (DEC - 100)) | (1L << (ADD - 100)) | (1L << (SUB - 100)))) != 0)) ) {
					((ExprPrefixArthemticContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1303);
				expression(15);
				}
				break;
			case 5:
				{
				_localctx = new ExprPrefixLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1304);
				((ExprPrefixLogicalContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExprPrefixLogicalContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1305);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1383);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMDMContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1308);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1309);
						((ExprMDMContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (MUL - 104)) | (1L << (DIV - 104)) | (1L << (MOD - 104)))) != 0)) ) {
							((ExprMDMContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1310);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprASContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1311);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1312);
						((ExprASContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprASContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1313);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprShiftingContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1314);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1322);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
						case 1:
							{
							setState(1315);
							match(LT);
							setState(1316);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1317);
							match(GT);
							setState(1318);
							match(GT);
							setState(1319);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1320);
							match(GT);
							setState(1321);
							match(GT);
							}
							break;
						}
						setState(1324);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1325);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1326);
						((ExprComparisonContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (GT - 88)) | (1L << (LT - 88)) | (1L << (LE - 88)) | (1L << (GE - 88)))) != 0)) ) {
							((ExprComparisonContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1327);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprEqualityContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1328);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1329);
						((ExprEqualityContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExprEqualityContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1330);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprBitwiseANDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1331);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1332);
						((ExprBitwiseANDContext)_localctx).bop = match(BITAND);
						setState(1333);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprXORContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1334);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1335);
						((ExprXORContext)_localctx).bop = match(CARET);
						setState(1336);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprBitwiseORContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1337);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1338);
						((ExprBitwiseORContext)_localctx).bop = match(BITOR);
						setState(1339);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprLogicalANDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1340);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1341);
						((ExprLogicalANDContext)_localctx).bop = match(AND);
						setState(1342);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExprLogicalORContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1343);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1344);
						((ExprLogicalORContext)_localctx).bop = match(OR);
						setState(1345);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExprTernaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1346);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1347);
						((ExprTernaryContext)_localctx).bop = match(QUESTION);
						setState(1348);
						expression(0);
						setState(1349);
						match(COLON);
						setState(1350);
						expression(2);
						}
						break;
					case 12:
						{
						_localctx = new ExprRightAssociationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1352);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1353);
						((ExprRightAssociationContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (ASSIGN - 87)) | (1L << (ADD_ASSIGN - 87)) | (1L << (SUB_ASSIGN - 87)) | (1L << (MUL_ASSIGN - 87)) | (1L << (DIV_ASSIGN - 87)) | (1L << (AND_ASSIGN - 87)) | (1L << (OR_ASSIGN - 87)) | (1L << (XOR_ASSIGN - 87)) | (1L << (MOD_ASSIGN - 87)) | (1L << (LSHIFT_ASSIGN - 87)) | (1L << (RSHIFT_ASSIGN - 87)) | (1L << (URSHIFT_ASSIGN - 87)))) != 0)) ) {
							((ExprRightAssociationContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1354);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExprMemberAcessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1355);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1356);
						((ExprMemberAcessContext)_localctx).bop = match(DOT);
						setState(1368);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
						case 1:
							{
							setState(1357);
							identifier();
							}
							break;
						case 2:
							{
							setState(1358);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1359);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1360);
							match(NEW);
							setState(1362);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1361);
								nonWildcardTypeArguments();
								}
							}

							setState(1364);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1365);
							match(SUPER);
							setState(1366);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1367);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprArraySubscriptionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1370);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1371);
						match(LBRACK);
						setState(1372);
						expression(0);
						setState(1373);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExprPostfixContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1375);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1376);
						((ExprPostfixContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExprPostfixContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExprIsInstanceContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1377);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1378);
						((ExprIsInstanceContext)_localctx).bop = match(INSTANCEOF);
						setState(1381);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
						case 1:
							{
							setState(1379);
							typeType();
							}
							break;
						case 2:
							{
							setState(1380);
							pattern();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1388);
					variableModifier();
					}
					} 
				}
				setState(1393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(1394);
			typeType();
			setState(1398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1395);
					annotation();
					}
					} 
				}
				setState(1400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			setState(1401);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			lambdaParameters();
			setState(1404);
			match(ARROW);
			setState(1405);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LambdaLVTIListContext lambdaLVTIList() {
			return getRuleContext(LambdaLVTIListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_lambdaParameters);
		int _la;
		try {
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1407);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1408);
				match(LPAREN);
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1409);
					formalParameterList();
					}
				}

				setState(1412);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1413);
				match(LPAREN);
				setState(1414);
				identifier();
				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1415);
					match(COMMA);
					setState(1416);
					identifier();
					}
					}
					setState(1421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1422);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1424);
				match(LPAREN);
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (FINAL - 18)) | (1L << (MODULE - 18)) | (1L << (OPEN - 18)) | (1L << (REQUIRES - 18)) | (1L << (EXPORTS - 18)) | (1L << (OPENS - 18)) | (1L << (TO - 18)) | (1L << (USES - 18)) | (1L << (PROVIDES - 18)) | (1L << (WITH - 18)) | (1L << (TRANSITIVE - 18)) | (1L << (VAR - 18)) | (1L << (YIELD - 18)) | (1L << (RECORD - 18)) | (1L << (SEALED - 18)) | (1L << (PERMITS - 18)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1425);
					lambdaLVTIList();
					}
				}

				setState(1428);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_lambdaBody);
		try {
			setState(1433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1431);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1432);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_primary);
		try {
			setState(1453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				match(LPAREN);
				setState(1436);
				expression(0);
				setState(1437);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1440);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1441);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1442);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1443);
				typeTypeOrVoid();
				setState(1444);
				match(DOT);
				setState(1445);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1447);
				nonWildcardTypeArguments();
				setState(1451);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case MODULE:
				case OPEN:
				case REQUIRES:
				case EXPORTS:
				case OPENS:
				case TO:
				case USES:
				case PROVIDES:
				case WITH:
				case TRANSITIVE:
				case VAR:
				case YIELD:
				case RECORD:
				case SEALED:
				case PERMITS:
				case IDENTIFIER:
					{
					setState(1448);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1449);
					match(THIS);
					setState(1450);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchExpressionContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<SwitchLabeledRuleContext> switchLabeledRule() {
			return getRuleContexts(SwitchLabeledRuleContext.class);
		}
		public SwitchLabeledRuleContext switchLabeledRule(int i) {
			return getRuleContext(SwitchLabeledRuleContext.class,i);
		}
		public SwitchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpression; }
	}

	public final SwitchExpressionContext switchExpression() throws RecognitionException {
		SwitchExpressionContext _localctx = new SwitchExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			match(SWITCH);
			setState(1456);
			parExpression();
			setState(1457);
			match(LBRACE);
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1458);
				switchLabeledRule();
				}
				}
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1464);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabeledRuleContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public SwitchRuleOutcomeContext switchRuleOutcome() {
			return getRuleContext(SwitchRuleOutcomeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabeledRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabeledRule; }
	}

	public final SwitchLabeledRuleContext switchLabeledRule() throws RecognitionException {
		SwitchLabeledRuleContext _localctx = new SwitchLabeledRuleContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_switchLabeledRule);
		int _la;
		try {
			setState(1477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				match(CASE);
				setState(1470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1467);
					expressionList();
					}
					break;
				case 2:
					{
					setState(1468);
					match(NULL_LITERAL);
					}
					break;
				case 3:
					{
					setState(1469);
					guardedPattern(0);
					}
					break;
				}
				setState(1472);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1473);
				switchRuleOutcome();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
				match(DEFAULT);
				setState(1475);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1476);
				switchRuleOutcome();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardedPatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public GuardedPatternContext guardedPattern() {
			return getRuleContext(GuardedPatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JavaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JavaParser.AND, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GuardedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardedPattern; }
	}

	public final GuardedPatternContext guardedPattern() throws RecognitionException {
		return guardedPattern(0);
	}

	private GuardedPatternContext guardedPattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GuardedPatternContext _localctx = new GuardedPatternContext(_ctx, _parentState);
		GuardedPatternContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_guardedPattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1480);
				match(LPAREN);
				setState(1481);
				guardedPattern(0);
				setState(1482);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case AT:
			case IDENTIFIER:
				{
				setState(1487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1484);
						variableModifier();
						}
						} 
					}
					setState(1489);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				}
				setState(1490);
				typeType();
				setState(1494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1491);
						annotation();
						}
						} 
					}
					setState(1496);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				}
				setState(1497);
				identifier();
				setState(1502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1498);
						match(AND);
						setState(1499);
						expression(0);
						}
						} 
					}
					setState(1504);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GuardedPatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guardedPattern);
					setState(1507);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1508);
					match(AND);
					setState(1509);
					expression(0);
					}
					} 
				}
				setState(1514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SwitchRuleOutcomeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchRuleOutcomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchRuleOutcome; }
	}

	public final SwitchRuleOutcomeContext switchRuleOutcome() throws RecognitionException {
		SwitchRuleOutcomeContext _localctx = new SwitchRuleOutcomeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_switchRuleOutcome);
		int _la;
		try {
			setState(1522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BREAK - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (CONTINUE - 3)) | (1L << (DO - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (FOR - 3)) | (1L << (IF - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (RETURN - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (SWITCH - 3)) | (1L << (THIS - 3)) | (1L << (THROW - 3)) | (1L << (TRY - 3)) | (1L << (VOID - 3)) | (1L << (WHILE - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					{
					setState(1516);
					blockStatement();
					}
					}
					setState(1521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1524);
				classOrInterfaceType();
				setState(1525);
				match(DOT);
				}
				break;
			}
			setState(1532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1529);
					annotation();
					}
					} 
				}
				setState(1534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			setState(1535);
			identifier();
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1536);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_creator);
		try {
			setState(1548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				nonWildcardTypeArguments();
				setState(1540);
				createdName();
				setState(1541);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543);
				createdName();
				setState(1546);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1544);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1545);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_createdName);
		int _la;
		try {
			setState(1565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1550);
				identifier();
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1551);
					typeArgumentsOrDiamond();
					}
				}

				setState(1561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1554);
					match(DOT);
					setState(1555);
					identifier();
					setState(1557);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1556);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1564);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			identifier();
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1568);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1571);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(LBRACK);
			setState(1601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1574);
				match(RBRACK);
				setState(1579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1575);
					match(LBRACK);
					setState(1576);
					match(RBRACK);
					}
					}
					setState(1581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1582);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TEXT_BLOCK:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1583);
				expression(0);
				setState(1584);
				match(RBRACK);
				setState(1591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1585);
						match(LBRACK);
						setState(1586);
						expression(0);
						setState(1587);
						match(RBRACK);
						}
						} 
					}
					setState(1593);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				}
				setState(1598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1594);
						match(LBRACK);
						setState(1595);
						match(RBRACK);
						}
						} 
					}
					setState(1600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			arguments();
			setState(1605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1604);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			nonWildcardTypeArguments();
			setState(1608);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_typeArgumentsOrDiamond);
		try {
			setState(1613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				match(LT);
				setState(1611);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1612);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1615);
				match(LT);
				setState(1616);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1617);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			match(LT);
			setState(1621);
			typeList();
			setState(1622);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			typeType();
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1625);
				match(COMMA);
				setState(1626);
				typeType();
				}
				}
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1632);
					annotation();
					}
					} 
				}
				setState(1637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			setState(1640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				{
				setState(1638);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1639);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1645);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
						{
						{
						setState(1642);
						annotation();
						}
						}
						setState(1647);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1648);
					match(LBRACK);
					setState(1649);
					match(RBRACK);
					}
					} 
				}
				setState(1654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(LT);
			setState(1658);
			typeArgument();
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1659);
				match(COMMA);
				setState(1660);
				typeArgument();
				}
				}
				setState(1665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1666);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_superSuffix);
		int _la;
		try {
			setState(1677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1668);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1669);
				match(DOT);
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1670);
					typeArguments();
					}
				}

				setState(1673);
				identifier();
				setState(1675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1674);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1679);
				match(SUPER);
				setState(1680);
				superSuffix();
				}
				break;
			case MODULE:
			case OPEN:
			case REQUIRES:
			case EXPORTS:
			case OPENS:
			case TO:
			case USES:
			case PROVIDES:
			case WITH:
			case TRANSITIVE:
			case VAR:
			case YIELD:
			case RECORD:
			case SEALED:
			case PERMITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				identifier();
				setState(1682);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			match(LPAREN);
			setState(1688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(1687);
				expressionList();
				}
			}

			setState(1690);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 98:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 106:
			return guardedPattern_sempred((GuardedPatternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 20);
		case 13:
			return precpred(_ctx, 19);
		case 14:
			return precpred(_ctx, 16);
		case 15:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean guardedPattern_sempred(GuardedPatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0082\u069f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\3\2\5\2\u00fe\n\2\3\2\7"+
		"\2\u0101\n\2\f\2\16\2\u0104\13\2\3\2\7\2\u0107\n\2\f\2\16\2\u010a\13\2"+
		"\3\2\3\2\3\2\5\2\u010f\n\2\3\3\7\3\u0112\n\3\f\3\16\3\u0115\13\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\5\4\u011d\n\4\3\4\3\4\3\4\5\4\u0122\n\4\3\4\3\4\3\5"+
		"\7\5\u0127\n\5\f\5\16\5\u012a\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u0131\n\5\3"+
		"\5\5\5\u0134\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u013b\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u0147\n\7\3\b\3\b\5\b\u014b\n\b\3\t\3\t\3\t\5"+
		"\t\u0150\n\t\3\t\3\t\5\t\u0154\n\t\3\t\3\t\5\t\u0158\n\t\3\t\3\t\5\t\u015c"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0164\n\n\f\n\16\n\u0167\13\n\3\n\3\n"+
		"\3\13\7\13\u016c\n\13\f\13\16\13\u016f\13\13\3\13\3\13\3\13\7\13\u0174"+
		"\n\13\f\13\16\13\u0177\13\13\3\13\5\13\u017a\n\13\3\f\3\f\3\f\7\f\u017f"+
		"\n\f\f\f\16\f\u0182\13\f\3\r\3\r\3\r\3\r\5\r\u0188\n\r\3\r\3\r\5\r\u018c"+
		"\n\r\3\r\5\r\u018f\n\r\3\r\5\r\u0192\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0199"+
		"\n\16\f\16\16\16\u019c\13\16\3\17\7\17\u019f\n\17\f\17\16\17\u01a2\13"+
		"\17\3\17\3\17\5\17\u01a6\n\17\3\17\5\17\u01a9\n\17\3\20\3\20\7\20\u01ad"+
		"\n\20\f\20\16\20\u01b0\13\20\3\21\3\21\3\21\5\21\u01b5\n\21\3\21\3\21"+
		"\5\21\u01b9\n\21\3\21\3\21\5\21\u01bd\n\21\3\21\3\21\3\22\3\22\7\22\u01c3"+
		"\n\22\f\22\16\22\u01c6\13\22\3\22\3\22\3\23\3\23\7\23\u01cc\n\23\f\23"+
		"\16\23\u01cf\13\23\3\23\3\23\3\24\3\24\5\24\u01d5\n\24\3\24\3\24\7\24"+
		"\u01d9\n\24\f\24\16\24\u01dc\13\24\3\24\5\24\u01df\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01eb\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u01f2\n\26\f\26\16\26\u01f5\13\26\3\26\3\26\5\26\u01f9\n\26"+
		"\3\26\3\26\3\27\3\27\5\27\u01ff\n\27\3\30\3\30\5\30\u0203\n\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u020f\n\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\7\35\u0218\n\35\f\35\16\35\u021b\13\35\3\35"+
		"\3\35\5\35\u021f\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0229"+
		"\n\36\3\37\3\37\3\37\3\37\7\37\u022f\n\37\f\37\16\37\u0232\13\37\3\37"+
		"\3\37\3 \3 \3 \7 \u0239\n \f \16 \u023c\13 \3 \3 \3 \3!\7!\u0242\n!\f"+
		"!\16!\u0245\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u024f\n\"\3#\7#\u0252"+
		"\n#\f#\16#\u0255\13#\3#\3#\3#\3$\7$\u025b\n$\f$\16$\u025e\13$\3$\3$\3"+
		"$\3$\3$\7$\u0265\n$\f$\16$\u0268\13$\3$\3$\5$\u026c\n$\3$\3$\3%\3%\3%"+
		"\7%\u0273\n%\f%\16%\u0276\13%\3&\3&\3&\5&\u027b\n&\3\'\3\'\3\'\7\'\u0280"+
		"\n\'\f\'\16\'\u0283\13\'\3(\3(\5(\u0287\n(\3)\3)\3)\3)\7)\u028d\n)\f)"+
		"\16)\u0290\13)\3)\5)\u0293\n)\5)\u0295\n)\3)\3)\3*\3*\5*\u029b\n*\3*\3"+
		"*\3*\5*\u02a0\n*\7*\u02a2\n*\f*\16*\u02a5\13*\3+\3+\7+\u02a9\n+\f+\16"+
		"+\u02ac\13+\3+\3+\3+\5+\u02b1\n+\5+\u02b3\n+\3,\3,\3,\7,\u02b8\n,\f,\16"+
		",\u02bb\13,\3-\3-\5-\u02bf\n-\3-\3-\3-\5-\u02c4\n-\3-\5-\u02c7\n-\5-\u02c9"+
		"\n-\3-\3-\3.\3.\3.\3.\7.\u02d1\n.\f.\16.\u02d4\13.\3.\3.\3/\3/\3/\7/\u02db"+
		"\n/\f/\16/\u02de\13/\3/\3/\5/\u02e2\n/\3/\5/\u02e5\n/\3\60\7\60\u02e8"+
		"\n\60\f\60\16\60\u02eb\13\60\3\60\3\60\3\60\3\61\7\61\u02f1\n\61\f\61"+
		"\16\61\u02f4\13\61\3\61\3\61\7\61\u02f8\n\61\f\61\16\61\u02fb\13\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\7\62\u0303\n\62\f\62\16\62\u0306\13\62\3"+
		"\63\7\63\u0309\n\63\f\63\16\63\u030c\13\63\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\7\64\u0314\n\64\f\64\16\64\u0317\13\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\5\65\u0320\n\65\3\66\3\66\3\67\3\67\38\38\38\78\u0329\n8\f8\16"+
		"8\u032c\138\38\38\38\39\39\39\59\u0334\n9\39\39\39\59\u0339\n9\39\59\u033c"+
		"\n9\3:\3:\3:\7:\u0341\n:\f:\16:\u0344\13:\3;\3;\3;\3;\3<\3<\3<\5<\u034d"+
		"\n<\3=\3=\3=\3=\7=\u0353\n=\f=\16=\u0356\13=\5=\u0358\n=\3=\5=\u035b\n"+
		"=\3=\3=\3>\3>\3>\3>\3>\3?\3?\7?\u0366\n?\f?\16?\u0369\13?\3?\3?\3@\7@"+
		"\u036e\n@\f@\16@\u0371\13@\3@\3@\5@\u0375\n@\3A\3A\3A\3A\3A\3A\5A\u037d"+
		"\nA\3A\3A\5A\u0381\nA\3A\3A\5A\u0385\nA\3A\3A\5A\u0389\nA\3A\3A\5A\u038d"+
		"\nA\5A\u038f\nA\3B\3B\5B\u0393\nB\3C\3C\3C\3C\5C\u0399\nC\3D\3D\3E\3E"+
		"\3E\3F\5F\u03a1\nF\3F\3F\3F\3F\3G\3G\7G\u03a9\nG\fG\16G\u03ac\13G\3G\3"+
		"G\3H\3H\7H\u03b2\nH\fH\16H\u03b5\13H\3H\3H\3H\3H\3H\3H\3H\5H\u03be\nH"+
		"\3H\3H\3H\3H\3H\3H\5H\u03c6\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H"+
		"\u03d4\nH\3I\3I\3J\3J\3J\5J\u03db\nJ\3J\3J\3J\5J\u03e0\nJ\3J\3J\3K\3K"+
		"\5K\u03e6\nK\3K\3K\3L\3L\3L\7L\u03ed\nL\fL\16L\u03f0\13L\3M\3M\3M\3N\3"+
		"N\7N\u03f7\nN\fN\16N\u03fa\13N\3N\3N\3O\3O\7O\u0400\nO\fO\16O\u0403\13"+
		"O\3O\3O\3P\7P\u0408\nP\fP\16P\u040b\13P\3Q\3Q\3Q\3Q\5Q\u0411\nQ\3R\7R"+
		"\u0414\nR\fR\16R\u0417\13R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0421\nR\3S\3S\3"+
		"T\7T\u0426\nT\fT\16T\u0429\13T\3T\3T\3T\5T\u042e\nT\3T\5T\u0431\nT\3U"+
		"\3U\3U\3U\3U\3U\5U\u0439\nU\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\6U\u044e\nU\rU\16U\u044f\3U\5U\u0453\nU\3U\5U\u0456\n"+
		"U\3U\3U\3U\3U\7U\u045c\nU\fU\16U\u045f\13U\3U\7U\u0462\nU\fU\16U\u0465"+
		"\13U\3U\3U\3U\3U\5U\u046b\nU\3U\3U\3U\3U\3U\3U\3U\5U\u0474\nU\3U\3U\3"+
		"U\5U\u0479\nU\3U\3U\3U\3U\3U\5U\u0480\nU\3V\3V\3V\7V\u0485\nV\fV\16V\u0488"+
		"\13V\3V\3V\3V\3V\3V\3W\3W\3W\7W\u0492\nW\fW\16W\u0495\13W\3X\3X\3X\3Y"+
		"\3Y\3Y\5Y\u049d\nY\3Y\3Y\3Z\3Z\3Z\7Z\u04a4\nZ\fZ\16Z\u04a7\13Z\3[\7[\u04aa"+
		"\n[\f[\16[\u04ad\13[\3[\3[\3[\3[\3[\5[\u04b4\n[\3[\3[\3[\3[\5[\u04ba\n"+
		"[\3\\\6\\\u04bd\n\\\r\\\16\\\u04be\3\\\6\\\u04c2\n\\\r\\\16\\\u04c3\3"+
		"]\3]\3]\3]\3]\3]\5]\u04cc\n]\3]\3]\3]\5]\u04d1\n]\3^\3^\5^\u04d5\n^\3"+
		"^\3^\5^\u04d9\n^\3^\3^\5^\u04dd\n^\5^\u04df\n^\3_\3_\5_\u04e3\n_\3`\7"+
		"`\u04e6\n`\f`\16`\u04e9\13`\3`\3`\5`\u04ed\n`\3`\3`\3`\3`\3a\3a\3a\3a"+
		"\3b\3b\3b\7b\u04fa\nb\fb\16b\u04fd\13b\3c\3c\3c\5c\u0502\nc\3c\3c\3c\3"+
		"c\3c\5c\u0509\nc\3c\3c\3c\3c\5c\u050f\nc\3c\5c\u0512\nc\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\5d\u051d\nd\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5"+
		"d\u052d\nd\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0555\nd\3"+
		"d\3d\3d\3d\5d\u055b\nd\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0568\nd\7"+
		"d\u056a\nd\fd\16d\u056d\13d\3e\7e\u0570\ne\fe\16e\u0573\13e\3e\3e\7e\u0577"+
		"\ne\fe\16e\u057a\13e\3e\3e\3f\3f\3f\3f\3g\3g\3g\5g\u0585\ng\3g\3g\3g\3"+
		"g\3g\7g\u058c\ng\fg\16g\u058f\13g\3g\3g\3g\3g\5g\u0595\ng\3g\5g\u0598"+
		"\ng\3h\3h\5h\u059c\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i"+
		"\5i\u05ae\ni\5i\u05b0\ni\3j\3j\3j\3j\7j\u05b6\nj\fj\16j\u05b9\13j\3j\3"+
		"j\3k\3k\3k\3k\5k\u05c1\nk\3k\3k\3k\3k\3k\5k\u05c8\nk\3l\3l\3l\3l\3l\3"+
		"l\7l\u05d0\nl\fl\16l\u05d3\13l\3l\3l\7l\u05d7\nl\fl\16l\u05da\13l\3l\3"+
		"l\3l\7l\u05df\nl\fl\16l\u05e2\13l\5l\u05e4\nl\3l\3l\3l\7l\u05e9\nl\fl"+
		"\16l\u05ec\13l\3m\3m\7m\u05f0\nm\fm\16m\u05f3\13m\5m\u05f5\nm\3n\3n\3"+
		"n\5n\u05fa\nn\3n\7n\u05fd\nn\fn\16n\u0600\13n\3n\3n\5n\u0604\nn\3o\3o"+
		"\3o\3o\3o\3o\3o\5o\u060d\no\5o\u060f\no\3p\3p\5p\u0613\np\3p\3p\3p\5p"+
		"\u0618\np\7p\u061a\np\fp\16p\u061d\13p\3p\5p\u0620\np\3q\3q\5q\u0624\n"+
		"q\3q\3q\3r\3r\3r\3r\7r\u062c\nr\fr\16r\u062f\13r\3r\3r\3r\3r\3r\3r\3r"+
		"\7r\u0638\nr\fr\16r\u063b\13r\3r\3r\7r\u063f\nr\fr\16r\u0642\13r\5r\u0644"+
		"\nr\3s\3s\5s\u0648\ns\3t\3t\3t\3u\3u\3u\5u\u0650\nu\3v\3v\3v\5v\u0655"+
		"\nv\3w\3w\3w\3w\3x\3x\3x\7x\u065e\nx\fx\16x\u0661\13x\3y\7y\u0664\ny\f"+
		"y\16y\u0667\13y\3y\3y\5y\u066b\ny\3y\7y\u066e\ny\fy\16y\u0671\13y\3y\3"+
		"y\7y\u0675\ny\fy\16y\u0678\13y\3z\3z\3{\3{\3{\3{\7{\u0680\n{\f{\16{\u0683"+
		"\13{\3{\3{\3|\3|\3|\5|\u068a\n|\3|\3|\5|\u068e\n|\5|\u0690\n|\3}\3}\3"+
		"}\3}\3}\5}\u0697\n}\3~\3~\5~\u069b\n~\3~\3~\3~\2\4\u00c6\u00d6\177\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\2\21\4\2\23\23**\3\2EH\3\2IJ\4\2"+
		"((>>\4\2\65C\u0082\u0082\3\2fi\3\2\\]\4\2jkoo\3\2hi\4\2Z[ab\4\2``cc\4"+
		"\2YYpz\3\2fg\4\2__{{\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'\'\2\u0750"+
		"\2\u010e\3\2\2\2\4\u0113\3\2\2\2\6\u011a\3\2\2\2\b\u0133\3\2\2\2\n\u013a"+
		"\3\2\2\2\f\u0146\3\2\2\2\16\u014a\3\2\2\2\20\u014c\3\2\2\2\22\u015f\3"+
		"\2\2\2\24\u016d\3\2\2\2\26\u017b\3\2\2\2\30\u0183\3\2\2\2\32\u0195\3\2"+
		"\2\2\34\u01a0\3\2\2\2\36\u01aa\3\2\2\2 \u01b1\3\2\2\2\"\u01c0\3\2\2\2"+
		"$\u01c9\3\2\2\2&\u01de\3\2\2\2(\u01ea\3\2\2\2*\u01ec\3\2\2\2,\u01fe\3"+
		"\2\2\2.\u0202\3\2\2\2\60\u0204\3\2\2\2\62\u0207\3\2\2\2\64\u020a\3\2\2"+
		"\2\66\u0212\3\2\2\28\u021e\3\2\2\2:\u0228\3\2\2\2<\u022a\3\2\2\2>\u0235"+
		"\3\2\2\2@\u0243\3\2\2\2B\u024e\3\2\2\2D\u0253\3\2\2\2F\u025c\3\2\2\2H"+
		"\u026f\3\2\2\2J\u0277\3\2\2\2L\u027c\3\2\2\2N\u0286\3\2\2\2P\u0288\3\2"+
		"\2\2R\u0298\3\2\2\2T\u02b2\3\2\2\2V\u02b4\3\2\2\2X\u02bc\3\2\2\2Z\u02cc"+
		"\3\2\2\2\\\u02e4\3\2\2\2^\u02e9\3\2\2\2`\u02f2\3\2\2\2b\u02ff\3\2\2\2"+
		"d\u030a\3\2\2\2f\u0310\3\2\2\2h\u031f\3\2\2\2j\u0321\3\2\2\2l\u0323\3"+
		"\2\2\2n\u032a\3\2\2\2p\u0333\3\2\2\2r\u033d\3\2\2\2t\u0345\3\2\2\2v\u034c"+
		"\3\2\2\2x\u034e\3\2\2\2z\u035e\3\2\2\2|\u0363\3\2\2\2~\u0374\3\2\2\2\u0080"+
		"\u038e\3\2\2\2\u0082\u0392\3\2\2\2\u0084\u0394\3\2\2\2\u0086\u039a\3\2"+
		"\2\2\u0088\u039c\3\2\2\2\u008a\u03a0\3\2\2\2\u008c\u03a6\3\2\2\2\u008e"+
		"\u03d3\3\2\2\2\u0090\u03d5\3\2\2\2\u0092\u03d7\3\2\2\2\u0094\u03e3\3\2"+
		"\2\2\u0096\u03e9\3\2\2\2\u0098\u03f1\3\2\2\2\u009a\u03f4\3\2\2\2\u009c"+
		"\u03fd\3\2\2\2\u009e\u0409\3\2\2\2\u00a0\u0410\3\2\2\2\u00a2\u0415\3\2"+
		"\2\2\u00a4\u0422\3\2\2\2\u00a6\u0430\3\2\2\2\u00a8\u047f\3\2\2\2\u00aa"+
		"\u0481\3\2\2\2\u00ac\u048e\3\2\2\2\u00ae\u0496\3\2\2\2\u00b0\u0499\3\2"+
		"\2\2\u00b2\u04a0\3\2\2\2\u00b4\u04b9\3\2\2\2\u00b6\u04bc\3\2\2\2\u00b8"+
		"\u04d0\3\2\2\2\u00ba\u04de\3\2\2\2\u00bc\u04e2\3\2\2\2\u00be\u04e7\3\2"+
		"\2\2\u00c0\u04f2\3\2\2\2\u00c2\u04f6\3\2\2\2\u00c4\u0511\3\2\2\2\u00c6"+
		"\u051c\3\2\2\2\u00c8\u0571\3\2\2\2\u00ca\u057d\3\2\2\2\u00cc\u0597\3\2"+
		"\2\2\u00ce\u059b\3\2\2\2\u00d0\u05af\3\2\2\2\u00d2\u05b1\3\2\2\2\u00d4"+
		"\u05c7\3\2\2\2\u00d6\u05e3\3\2\2\2\u00d8\u05f4\3\2\2\2\u00da\u05f9\3\2"+
		"\2\2\u00dc\u060e\3\2\2\2\u00de\u061f\3\2\2\2\u00e0\u0621\3\2\2\2\u00e2"+
		"\u0627\3\2\2\2\u00e4\u0645\3\2\2\2\u00e6\u0649\3\2\2\2\u00e8\u064f\3\2"+
		"\2\2\u00ea\u0654\3\2\2\2\u00ec\u0656\3\2\2\2\u00ee\u065a\3\2\2\2\u00f0"+
		"\u0665\3\2\2\2\u00f2\u0679\3\2\2\2\u00f4\u067b\3\2\2\2\u00f6\u068f\3\2"+
		"\2\2\u00f8\u0696\3\2\2\2\u00fa\u0698\3\2\2\2\u00fc\u00fe\5\4\3\2\u00fd"+
		"\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0102\3\2\2\2\u00ff\u0101\5\6"+
		"\4\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0108\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\5\b"+
		"\5\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010f\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\5\u008a"+
		"F\2\u010c\u010d\7\2\2\3\u010d\u010f\3\2\2\2\u010e\u00fd\3\2\2\2\u010e"+
		"\u010b\3\2\2\2\u010f\3\3\2\2\2\u0110\u0112\5p9\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\"\2\2\u0117\u0118\5f\64\2\u0118"+
		"\u0119\7V\2\2\u0119\5\3\2\2\2\u011a\u011c\7\33\2\2\u011b\u011d\7(\2\2"+
		"\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0121"+
		"\5f\64\2\u011f\u0120\7X\2\2\u0120\u0122\7j\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7V\2\2\u0124\7\3\2\2\2"+
		"\u0125\u0127\5\f\7\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0130\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u0131\5\20\t\2\u012c\u0131\5\30\r\2\u012d\u0131\5 \21\2\u012e\u0131\5"+
		"z>\2\u012f\u0131\5\u0092J\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2\2\2\u0130"+
		"\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2"+
		"\2\2\u0132\u0134\7V\2\2\u0133\u0128\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\t\3\2\2\2\u0135\u013b\5\f\7\2\u0136\u013b\7 \2\2\u0137\u013b\7,\2\2\u0138"+
		"\u013b\7\60\2\2\u0139\u013b\7\63\2\2\u013a\u0135\3\2\2\2\u013a\u0136\3"+
		"\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\13\3\2\2\2\u013c\u0147\5p9\2\u013d\u0147\7%\2\2\u013e\u0147\7$\2\2\u013f"+
		"\u0147\7#\2\2\u0140\u0147\7(\2\2\u0141\u0147\7\3\2\2\u0142\u0147\7\24"+
		"\2\2\u0143\u0147\7)\2\2\u0144\u0147\7B\2\2\u0145\u0147\7D\2\2\u0146\u013c"+
		"\3\2\2\2\u0146\u013d\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u013f\3\2\2\2\u0146"+
		"\u0140\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\r\3\2\2\2\u0148\u014b"+
		"\7\24\2\2\u0149\u014b\5p9\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\17\3\2\2\2\u014c\u014d\7\13\2\2\u014d\u014f\5\u00a4S\2\u014e\u0150\5"+
		"\22\n\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u0152\7\23\2\2\u0152\u0154\5\u00f0y\2\u0153\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\7\32\2\2\u0156\u0158\5\u00ee"+
		"x\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u015a\7C\2\2\u015a\u015c\5\u00eex\2\u015b\u0159\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\5\"\22\2\u015e\21\3\2\2\2\u015f"+
		"\u0160\7[\2\2\u0160\u0165\5\24\13\2\u0161\u0162\7W\2\2\u0162\u0164\5\24"+
		"\13\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7Z"+
		"\2\2\u0169\23\3\2\2\2\u016a\u016c\5p9\2\u016b\u016a\3\2\2\2\u016c\u016f"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0179\5\u00a4S\2\u0171\u0175\7\23\2\2\u0172\u0174"+
		"\5p9\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017a\5\26"+
		"\f\2\u0179\u0171\3\2\2\2\u0179\u017a\3\2\2\2\u017a\25\3\2\2\2\u017b\u0180"+
		"\5\u00f0y\2\u017c\u017d\7l\2\2\u017d\u017f\5\u00f0y\2\u017e\u017c\3\2"+
		"\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\27\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7\22\2\2\u0184\u0187\5\u00a4"+
		"S\2\u0185\u0186\7\32\2\2\u0186\u0188\5\u00eex\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\7R\2\2\u018a\u018c\5\32"+
		"\16\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u018f\7W\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2"+
		"\2\2\u0190\u0192\5\36\20\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0194\7S\2\2\u0194\31\3\2\2\2\u0195\u019a\5\34\17"+
		"\2\u0196\u0197\7W\2\2\u0197\u0199\5\34\17\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\33\3\2\2"+
		"\2\u019c\u019a\3\2\2\2\u019d\u019f\5p9\2\u019e\u019d\3\2\2\2\u019f\u01a2"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a5\5\u00a4S\2\u01a4\u01a6\5\u00fa~\2\u01a5\u01a4"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9\5\"\22\2"+
		"\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\35\3\2\2\2\u01aa\u01ae"+
		"\7V\2\2\u01ab\u01ad\5&\24\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\37\3\2\2\2\u01b0\u01ae\3\2\2"+
		"\2\u01b1\u01b2\7\36\2\2\u01b2\u01b4\5\u00a4S\2\u01b3\u01b5\5\22\n\2\u01b4"+
		"\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b7\7\23"+
		"\2\2\u01b7\u01b9\5\u00eex\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01bc\3\2\2\2\u01ba\u01bb\7C\2\2\u01bb\u01bd\5\u00eex\2\u01bc\u01ba\3"+
		"\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5$\23\2\u01bf"+
		"!\3\2\2\2\u01c0\u01c4\7R\2\2\u01c1\u01c3\5&\24\2\u01c2\u01c1\3\2\2\2\u01c3"+
		"\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7S\2\2\u01c8#\3\2\2\2\u01c9\u01cd"+
		"\7R\2\2\u01ca\u01cc\58\35\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2"+
		"\2\2\u01d0\u01d1\7S\2\2\u01d1%\3\2\2\2\u01d2\u01df\7V\2\2\u01d3\u01d5"+
		"\7(\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01df\5\u009cO\2\u01d7\u01d9\5\n\6\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc"+
		"\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dd\u01df\5(\25\2\u01de\u01d2\3\2\2\2\u01de\u01d4\3\2"+
		"\2\2\u01de\u01da\3\2\2\2\u01df\'\3\2\2\2\u01e0\u01eb\5*\26\2\u01e1\u01eb"+
		"\5\60\31\2\u01e2\u01eb\5\66\34\2\u01e3\u01eb\5\64\33\2\u01e4\u01eb\5\62"+
		"\32\2\u01e5\u01eb\5 \21\2\u01e6\u01eb\5z>\2\u01e7\u01eb\5\20\t\2\u01e8"+
		"\u01eb\5\30\r\2\u01e9\u01eb\5\u0092J\2\u01ea\u01e0\3\2\2\2\u01ea\u01e1"+
		"\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01e3\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea"+
		"\u01e5\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01e9\3\2\2\2\u01eb)\3\2\2\2\u01ec\u01ed\5.\30\2\u01ed\u01ee"+
		"\5\u00a4S\2\u01ee\u01f3\5X-\2\u01ef\u01f0\7T\2\2\u01f0\u01f2\7U\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f8\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7/\2\2\u01f7"+
		"\u01f9\5V,\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2"+
		"\2\u01fa\u01fb\5,\27\2\u01fb+\3\2\2\2\u01fc\u01ff\5\u009cO\2\u01fd\u01ff"+
		"\7V\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff-\3\2\2\2\u0200\u0203"+
		"\5\u00f0y\2\u0201\u0203\7\62\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2"+
		"\2\u0203/\3\2\2\2\u0204\u0205\5\22\n\2\u0205\u0206\5*\26\2\u0206\61\3"+
		"\2\2\2\u0207\u0208\5\22\n\2\u0208\u0209\5\64\33\2\u0209\63\3\2\2\2\u020a"+
		"\u020b\5\u00a4S\2\u020b\u020e\5X-\2\u020c\u020d\7/\2\2\u020d\u020f\5V"+
		",\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0211\5\u009cO\2\u0211\65\3\2\2\2\u0212\u0213\5\u00f0y\2\u0213\u0214"+
		"\5H%\2\u0214\u0215\7V\2\2\u0215\67\3\2\2\2\u0216\u0218\5\n\6\2\u0217\u0216"+
		"\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021f\5:\36\2\u021d\u021f\7V"+
		"\2\2\u021e\u0219\3\2\2\2\u021e\u021d\3\2\2\2\u021f9\3\2\2\2\u0220\u0229"+
		"\5<\37\2\u0221\u0229\5@!\2\u0222\u0229\5D#\2\u0223\u0229\5 \21\2\u0224"+
		"\u0229\5z>\2\u0225\u0229\5\20\t\2\u0226\u0229\5\30\r\2\u0227\u0229\5\u0092"+
		"J\2\u0228\u0220\3\2\2\2\u0228\u0221\3\2\2\2\u0228\u0222\3\2\2\2\u0228"+
		"\u0223\3\2\2\2\u0228\u0224\3\2\2\2\u0228\u0225\3\2\2\2\u0228\u0226\3\2"+
		"\2\2\u0228\u0227\3\2\2\2\u0229;\3\2\2\2\u022a\u022b\5\u00f0y\2\u022b\u0230"+
		"\5> \2\u022c\u022d\7W\2\2\u022d\u022f\5> \2\u022e\u022c\3\2\2\2\u022f"+
		"\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2"+
		"\2\2\u0232\u0230\3\2\2\2\u0233\u0234\7V\2\2\u0234=\3\2\2\2\u0235\u023a"+
		"\5\u00a4S\2\u0236\u0237\7T\2\2\u0237\u0239\7U\2\2\u0238\u0236\3\2\2\2"+
		"\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d"+
		"\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\7Y\2\2\u023e\u023f\5N(\2\u023f"+
		"?\3\2\2\2\u0240\u0242\5B\"\2\u0241\u0240\3\2\2\2\u0242\u0245\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u0243\3\2"+
		"\2\2\u0246\u0247\5F$\2\u0247A\3\2\2\2\u0248\u024f\5p9\2\u0249\u024f\7"+
		"%\2\2\u024a\u024f\7\3\2\2\u024b\u024f\7\16\2\2\u024c\u024f\7(\2\2\u024d"+
		"\u024f\7)\2\2\u024e\u0248\3\2\2\2\u024e\u0249\3\2\2\2\u024e\u024a\3\2"+
		"\2\2\u024e\u024b\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024d\3\2\2\2\u024f"+
		"C\3\2\2\2\u0250\u0252\5B\"\2\u0251\u0250\3\2\2\2\u0252\u0255\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2"+
		"\2\2\u0256\u0257\5\22\n\2\u0257\u0258\5F$\2\u0258E\3\2\2\2\u0259\u025b"+
		"\5p9\2\u025a\u0259\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0260\5."+
		"\30\2\u0260\u0261\5\u00a4S\2\u0261\u0266\5X-\2\u0262\u0263\7T\2\2\u0263"+
		"\u0265\7U\2\2\u0264\u0262\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2"+
		"\2\2\u0266\u0267\3\2\2\2\u0267\u026b\3\2\2\2\u0268\u0266\3\2\2\2\u0269"+
		"\u026a\7/\2\2\u026a\u026c\5V,\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2"+
		"\2\u026c\u026d\3\2\2\2\u026d\u026e\5,\27\2\u026eG\3\2\2\2\u026f\u0274"+
		"\5J&\2\u0270\u0271\7W\2\2\u0271\u0273\5J&\2\u0272\u0270\3\2\2\2\u0273"+
		"\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275I\3\2\2\2"+
		"\u0276\u0274\3\2\2\2\u0277\u027a\5L\'\2\u0278\u0279\7Y\2\2\u0279\u027b"+
		"\5N(\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027bK\3\2\2\2\u027c\u0281"+
		"\5\u00a4S\2\u027d\u027e\7T\2\2\u027e\u0280\7U\2\2\u027f\u027d\3\2\2\2"+
		"\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282M\3"+
		"\2\2\2\u0283\u0281\3\2\2\2\u0284\u0287\5P)\2\u0285\u0287\5\u00c6d\2\u0286"+
		"\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0287O\3\2\2\2\u0288\u0294\7R\2\2\u0289"+
		"\u028e\5N(\2\u028a\u028b\7W\2\2\u028b\u028d\5N(\2\u028c\u028a\3\2\2\2"+
		"\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0292"+
		"\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0293\7W\2\2\u0292\u0291\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0289\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0296\3\2\2\2\u0296\u0297\7S\2\2\u0297Q\3\2\2\2\u0298\u029a"+
		"\5\u00a4S\2\u0299\u029b\5\u00f4{\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\u02a3\3\2\2\2\u029c\u029d\7X\2\2\u029d\u029f\5\u00a4S\2\u029e"+
		"\u02a0\5\u00f4{\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2"+
		"\3\2\2\2\u02a1\u029c\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4S\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02b3\5\u00f0"+
		"y\2\u02a7\u02a9\5p9\2\u02a8\u02a7\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8"+
		"\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad"+
		"\u02b0\7^\2\2\u02ae\u02af\t\2\2\2\u02af\u02b1\5\u00f0y\2\u02b0\u02ae\3"+
		"\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02a6\3\2\2\2\u02b2"+
		"\u02aa\3\2\2\2\u02b3U\3\2\2\2\u02b4\u02b9\5f\64\2\u02b5\u02b6\7W\2\2\u02b6"+
		"\u02b8\5f\64\2\u02b7\u02b5\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2"+
		"\2\2\u02b9\u02ba\3\2\2\2\u02baW\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02c8"+
		"\7P\2\2\u02bd\u02bf\5Z.\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c9\3\2\2\2\u02c0\u02c3\5Z.\2\u02c1\u02c2\7W\2\2\u02c2\u02c4\5\\/\2"+
		"\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c9\3\2\2\2\u02c5\u02c7"+
		"\5\\/\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8"+
		"\u02be\3\2\2\2\u02c8\u02c0\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ca\3\2"+
		"\2\2\u02ca\u02cb\7Q\2\2\u02cbY\3\2\2\2\u02cc\u02d2\5\u00f0y\2\u02cd\u02ce"+
		"\5\u00a4S\2\u02ce\u02cf\7X\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02cd\3\2\2\2"+
		"\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5"+
		"\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d6\7-\2\2\u02d6[\3\2\2\2\u02d7\u02dc"+
		"\5^\60\2\u02d8\u02d9\7W\2\2\u02d9\u02db\5^\60\2\u02da\u02d8\3\2\2\2\u02db"+
		"\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02e1\3\2"+
		"\2\2\u02de\u02dc\3\2\2\2\u02df\u02e0\7W\2\2\u02e0\u02e2\5`\61\2\u02e1"+
		"\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e5\5`"+
		"\61\2\u02e4\u02d7\3\2\2\2\u02e4\u02e3\3\2\2\2\u02e5]\3\2\2\2\u02e6\u02e8"+
		"\5\16\b\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2"+
		"\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed"+
		"\5\u00f0y\2\u02ed\u02ee\5L\'\2\u02ee_\3\2\2\2\u02ef\u02f1\5\16\b\2\u02f0"+
		"\u02ef\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2"+
		"\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f9\5\u00f0y\2\u02f6"+
		"\u02f8\5p9\2\u02f7\u02f6\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2"+
		"\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02fd"+
		"\7~\2\2\u02fd\u02fe\5L\'\2\u02fea\3\2\2\2\u02ff\u0304\5d\63\2\u0300\u0301"+
		"\7W\2\2\u0301\u0303\5d\63\2\u0302\u0300\3\2\2\2\u0303\u0306\3\2\2\2\u0304"+
		"\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305c\3\2\2\2\u0306\u0304\3\2\2\2"+
		"\u0307\u0309\5\16\b\2\u0308\u0307\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308"+
		"\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030a\3\2\2\2\u030d"+
		"\u030e\7?\2\2\u030e\u030f\5\u00a4S\2\u030fe\3\2\2\2\u0310\u0315\5\u00a4"+
		"S\2\u0311\u0312\7X\2\2\u0312\u0314\5\u00a4S\2\u0313\u0311\3\2\2\2\u0314"+
		"\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316g\3\2\2\2"+
		"\u0317\u0315\3\2\2\2\u0318\u0320\5j\66\2\u0319\u0320\5l\67\2\u031a\u0320"+
		"\7L\2\2\u031b\u0320\7M\2\2\u031c\u0320\7K\2\2\u031d\u0320\7O\2\2\u031e"+
		"\u0320\7N\2\2\u031f\u0318\3\2\2\2\u031f\u0319\3\2\2\2\u031f\u031a\3\2"+
		"\2\2\u031f\u031b\3\2\2\2\u031f\u031c\3\2\2\2\u031f\u031d\3\2\2\2\u031f"+
		"\u031e\3\2\2\2\u0320i\3\2\2\2\u0321\u0322\t\3\2\2\u0322k\3\2\2\2\u0323"+
		"\u0324\t\4\2\2\u0324m\3\2\2\2\u0325\u0326\5\u00a4S\2\u0326\u0327\7X\2"+
		"\2\u0327\u0329\3\2\2\2\u0328\u0325\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d"+
		"\u032e\7}\2\2\u032e\u032f\5\u00a4S\2\u032fo\3\2\2\2\u0330\u0331\7}\2\2"+
		"\u0331\u0334\5f\64\2\u0332\u0334\5n8\2\u0333\u0330\3\2\2\2\u0333\u0332"+
		"\3\2\2\2\u0334\u033b\3\2\2\2\u0335\u0338\7P\2\2\u0336\u0339\5r:\2\u0337"+
		"\u0339\5v<\2\u0338\u0336\3\2\2\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2"+
		"\2\u0339\u033a\3\2\2\2\u033a\u033c\7Q\2\2\u033b\u0335\3\2\2\2\u033b\u033c"+
		"\3\2\2\2\u033cq\3\2\2\2\u033d\u0342\5t;\2\u033e\u033f\7W\2\2\u033f\u0341"+
		"\5t;\2\u0340\u033e\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342"+
		"\u0343\3\2\2\2\u0343s\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u0346\5\u00a4"+
		"S\2\u0346\u0347\7Y\2\2\u0347\u0348\5v<\2\u0348u\3\2\2\2\u0349\u034d\5"+
		"\u00c6d\2\u034a\u034d\5p9\2\u034b\u034d\5x=\2\u034c\u0349\3\2\2\2\u034c"+
		"\u034a\3\2\2\2\u034c\u034b\3\2\2\2\u034dw\3\2\2\2\u034e\u0357\7R\2\2\u034f"+
		"\u0354\5v<\2\u0350\u0351\7W\2\2\u0351\u0353\5v<\2\u0352\u0350\3\2\2\2"+
		"\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0358"+
		"\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u034f\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"\u035a\3\2\2\2\u0359\u035b\7W\2\2\u035a\u0359\3\2\2\2\u035a\u035b\3\2"+
		"\2\2\u035b\u035c\3\2\2\2\u035c\u035d\7S\2\2\u035dy\3\2\2\2\u035e\u035f"+
		"\7}\2\2\u035f\u0360\7\36\2\2\u0360\u0361\5\u00a4S\2\u0361\u0362\5|?\2"+
		"\u0362{\3\2\2\2\u0363\u0367\7R\2\2\u0364\u0366\5~@\2\u0365\u0364\3\2\2"+
		"\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a"+
		"\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036b\7S\2\2\u036b}\3\2\2\2\u036c\u036e"+
		"\5\n\6\2\u036d\u036c\3\2\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0372\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u0375\5\u0080"+
		"A\2\u0373\u0375\7V\2\2\u0374\u036f\3\2\2\2\u0374\u0373\3\2\2\2\u0375\177"+
		"\3\2\2\2\u0376\u0377\5\u00f0y\2\u0377\u0378\5\u0082B\2\u0378\u0379\7V"+
		"\2\2\u0379\u038f\3\2\2\2\u037a\u037c\5\20\t\2\u037b\u037d\7V\2\2\u037c"+
		"\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u038f\3\2\2\2\u037e\u0380\5 "+
		"\21\2\u037f\u0381\7V\2\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381"+
		"\u038f\3\2\2\2\u0382\u0384\5\30\r\2\u0383\u0385\7V\2\2\u0384\u0383\3\2"+
		"\2\2\u0384\u0385\3\2\2\2\u0385\u038f\3\2\2\2\u0386\u0388\5z>\2\u0387\u0389"+
		"\7V\2\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038f\3\2\2\2\u038a"+
		"\u038c\5\u0092J\2\u038b\u038d\7V\2\2\u038c\u038b\3\2\2\2\u038c\u038d\3"+
		"\2\2\2\u038d\u038f\3\2\2\2\u038e\u0376\3\2\2\2\u038e\u037a\3\2\2\2\u038e"+
		"\u037e\3\2\2\2\u038e\u0382\3\2\2\2\u038e\u0386\3\2\2\2\u038e\u038a\3\2"+
		"\2\2\u038f\u0081\3\2\2\2\u0390\u0393\5\u0084C\2\u0391\u0393\5\u0086D\2"+
		"\u0392\u0390\3\2\2\2\u0392\u0391\3\2\2\2\u0393\u0083\3\2\2\2\u0394\u0395"+
		"\5\u00a4S\2\u0395\u0396\7P\2\2\u0396\u0398\7Q\2\2\u0397\u0399\5\u0088"+
		"E\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u0085\3\2\2\2\u039a"+
		"\u039b\5H%\2\u039b\u0087\3\2\2\2\u039c\u039d\7\16\2\2\u039d\u039e\5v<"+
		"\2\u039e\u0089\3\2\2\2\u039f\u03a1\7\66\2\2\u03a0\u039f\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\7\65\2\2\u03a3\u03a4\5"+
		"f\64\2\u03a4\u03a5\5\u008cG\2\u03a5\u008b\3\2\2\2\u03a6\u03aa\7R\2\2\u03a7"+
		"\u03a9\5\u008eH\2\u03a8\u03a7\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8"+
		"\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad"+
		"\u03ae\7S\2\2\u03ae\u008d\3\2\2\2\u03af\u03b3\7\67\2\2\u03b0\u03b2\5\u0090"+
		"I\2\u03b1\u03b0\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b7\5f"+
		"\64\2\u03b7\u03b8\7V\2\2\u03b8\u03d4\3\2\2\2\u03b9\u03ba\78\2\2\u03ba"+
		"\u03bd\5f\64\2\u03bb\u03bc\7:\2\2\u03bc\u03be\5f\64\2\u03bd\u03bb\3\2"+
		"\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\7V\2\2\u03c0"+
		"\u03d4\3\2\2\2\u03c1\u03c2\79\2\2\u03c2\u03c5\5f\64\2\u03c3\u03c4\7:\2"+
		"\2\u03c4\u03c6\5f\64\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7"+
		"\3\2\2\2\u03c7\u03c8\7V\2\2\u03c8\u03d4\3\2\2\2\u03c9\u03ca\7;\2\2\u03ca"+
		"\u03cb\5f\64\2\u03cb\u03cc\7V\2\2\u03cc\u03d4\3\2\2\2\u03cd\u03ce\7<\2"+
		"\2\u03ce\u03cf\5f\64\2\u03cf\u03d0\7=\2\2\u03d0\u03d1\5f\64\2\u03d1\u03d2"+
		"\7V\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03af\3\2\2\2\u03d3\u03b9\3\2\2\2\u03d3"+
		"\u03c1\3\2\2\2\u03d3\u03c9\3\2\2\2\u03d3\u03cd\3\2\2\2\u03d4\u008f\3\2"+
		"\2\2\u03d5\u03d6\t\5\2\2\u03d6\u0091\3\2\2\2\u03d7\u03d8\7A\2\2\u03d8"+
		"\u03da\5\u00a4S\2\u03d9\u03db\5\22\n\2\u03da\u03d9\3\2\2\2\u03da\u03db"+
		"\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03df\5\u0094K\2\u03dd\u03de\7\32\2"+
		"\2\u03de\u03e0\5\u00eex\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u03e2\5\u009aN\2\u03e2\u0093\3\2\2\2\u03e3\u03e5"+
		"\7P\2\2\u03e4\u03e6\5\u0096L\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2"+
		"\u03e6\u03e7\3\2\2\2\u03e7\u03e8\7Q\2\2\u03e8\u0095\3\2\2\2\u03e9\u03ee"+
		"\5\u0098M\2\u03ea\u03eb\7W\2\2\u03eb\u03ed\5\u0098M\2\u03ec\u03ea\3\2"+
		"\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u0097\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f2\5\u00f0y\2\u03f2\u03f3"+
		"\5\u00a4S\2\u03f3\u0099\3\2\2\2\u03f4\u03f8\7R\2\2\u03f5\u03f7\5&\24\2"+
		"\u03f6\u03f5\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9"+
		"\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u03fc\7S\2\2\u03fc"+
		"\u009b\3\2\2\2\u03fd\u0401\7R\2\2\u03fe\u0400\5\u00a0Q\2\u03ff\u03fe\3"+
		"\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402"+
		"\u0404\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0405\7S\2\2\u0405\u009d\3\2"+
		"\2\2\u0406\u0408\5\u00a0Q\2\u0407\u0406\3\2\2\2\u0408\u040b\3\2\2\2\u0409"+
		"\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u009f\3\2\2\2\u040b\u0409\3\2"+
		"\2\2\u040c\u040d\5\u00a2R\2\u040d\u040e\7V\2\2\u040e\u0411\3\2\2\2\u040f"+
		"\u0411\5\u00a8U\2\u0410\u040c\3\2\2\2\u0410\u040f\3\2\2\2\u0411\u00a1"+
		"\3\2\2\2\u0412\u0414\5\16\b\2\u0413\u0412\3\2\2\2\u0414\u0417\3\2\2\2"+
		"\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0420\3\2\2\2\u0417\u0415"+
		"\3\2\2\2\u0418\u0419\5\u00f0y\2\u0419\u041a\5H%\2\u041a\u0421\3\2\2\2"+
		"\u041b\u041c\7?\2\2\u041c\u041d\5\u00a4S\2\u041d\u041e\7Y\2\2\u041e\u041f"+
		"\5\u00c6d\2\u041f\u0421\3\2\2\2\u0420\u0418\3\2\2\2\u0420\u041b\3\2\2"+
		"\2\u0421\u00a3\3\2\2\2\u0422\u0423\t\6\2\2\u0423\u00a5\3\2\2\2\u0424\u0426"+
		"\5\f\7\2\u0425\u0424\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u042d\3\2\2\2\u0429\u0427\3\2\2\2\u042a\u042e\5\20"+
		"\t\2\u042b\u042e\5 \21\2\u042c\u042e\5\u0092J\2\u042d\u042a\3\2\2\2\u042d"+
		"\u042b\3\2\2\2\u042d\u042c\3\2\2\2\u042e\u0431\3\2\2\2\u042f\u0431\7V"+
		"\2\2\u0430\u0427\3\2\2\2\u0430\u042f\3\2\2\2\u0431\u00a7\3\2\2\2\u0432"+
		"\u0480\5\u009cO\2\u0433\u0434\7\30\2\2\u0434\u0435\5\u00c0a\2\u0435\u0438"+
		"\5\u00a8U\2\u0436\u0437\7\21\2\2\u0437\u0439\5\u00a8U\2\u0438\u0436\3"+
		"\2\2\2\u0438\u0439\3\2\2\2\u0439\u0480\3\2\2\2\u043a\u043b\7\27\2\2\u043b"+
		"\u043c\7P\2\2\u043c\u043d\5\u00ba^\2\u043d\u043e\7Q\2\2\u043e\u043f\5"+
		"\u00a8U\2\u043f\u0480\3\2\2\2\u0440\u0441\7\64\2\2\u0441\u0442\5\u00c0"+
		"a\2\u0442\u0443\5\u00a8U\2\u0443\u0480\3\2\2\2\u0444\u0445\7\17\2\2\u0445"+
		"\u0446\5\u00a8U\2\u0446\u0447\7\64\2\2\u0447\u0448\5\u00c0a\2\u0448\u0449"+
		"\7V\2\2\u0449\u0480\3\2\2\2\u044a\u044b\7\61\2\2\u044b\u0455\5\u009cO"+
		"\2\u044c\u044e\5\u00aaV\2\u044d\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f"+
		"\u044d\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0452\3\2\2\2\u0451\u0453\5\u00ae"+
		"X\2\u0452\u0451\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0456\3\2\2\2\u0454"+
		"\u0456\5\u00aeX\2\u0455\u044d\3\2\2\2\u0455\u0454\3\2\2\2\u0456\u0480"+
		"\3\2\2\2\u0457\u0458\7+\2\2\u0458\u0459\5\u00c0a\2\u0459\u045d\7R\2\2"+
		"\u045a\u045c\5\u00b6\\\2\u045b\u045a\3\2\2\2\u045c\u045f\3\2\2\2\u045d"+
		"\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0463\3\2\2\2\u045f\u045d\3\2"+
		"\2\2\u0460\u0462\5\u00b8]\2\u0461\u0460\3\2\2\2\u0462\u0465\3\2\2\2\u0463"+
		"\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0466\3\2\2\2\u0465\u0463\3\2"+
		"\2\2\u0466\u0467\7S\2\2\u0467\u0480\3\2\2\2\u0468\u046a\7&\2\2\u0469\u046b"+
		"\5\u00c6d\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2"+
		"\2\u046c\u0480\7V\2\2\u046d\u046e\7.\2\2\u046e\u046f\5\u00c6d\2\u046f"+
		"\u0470\7V\2\2\u0470\u0480\3\2\2\2\u0471\u0473\7\6\2\2\u0472\u0474\5\u00a4"+
		"S\2\u0473\u0472\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"\u0480\7V\2\2\u0476\u0478\7\r\2\2\u0477\u0479\5\u00a4S\2\u0478\u0477\3"+
		"\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u0480\7V\2\2\u047b"+
		"\u0480\7V\2\2\u047c\u047d\5\u00c6d\2\u047d\u047e\7V\2\2\u047e\u0480\3"+
		"\2\2\2\u047f\u0432\3\2\2\2\u047f\u0433\3\2\2\2\u047f\u043a\3\2\2\2\u047f"+
		"\u0440\3\2\2\2\u047f\u0444\3\2\2\2\u047f\u044a\3\2\2\2\u047f\u0457\3\2"+
		"\2\2\u047f\u0468\3\2\2\2\u047f\u046d\3\2\2\2\u047f\u0471\3\2\2\2\u047f"+
		"\u0476\3\2\2\2\u047f\u047b\3\2\2\2\u047f\u047c\3\2\2\2\u0480\u00a9\3\2"+
		"\2\2\u0481\u0482\7\t\2\2\u0482\u0486\7P\2\2\u0483\u0485\5\16\b\2\u0484"+
		"\u0483\3\2\2\2\u0485\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2"+
		"\2\2\u0487\u0489\3\2\2\2\u0488\u0486\3\2\2\2\u0489\u048a\5\u00acW\2\u048a"+
		"\u048b\5\u00a4S\2\u048b\u048c\7Q\2\2\u048c\u048d\5\u009cO\2\u048d\u00ab"+
		"\3\2\2\2\u048e\u0493\5f\64\2\u048f\u0490\7m\2\2\u0490\u0492\5f\64\2\u0491"+
		"\u048f\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2"+
		"\2\2\u0494\u00ad\3\2\2\2\u0495\u0493\3\2\2\2\u0496\u0497\7\25\2\2\u0497"+
		"\u0498\5\u009cO\2\u0498\u00af\3\2\2\2\u0499\u049a\7P\2\2\u049a\u049c\5"+
		"\u00b2Z\2\u049b\u049d\7V\2\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d"+
		"\u049e\3\2\2\2\u049e\u049f\7Q\2\2\u049f\u00b1\3\2\2\2\u04a0\u04a5\5\u00b4"+
		"[\2\u04a1\u04a2\7V\2\2\u04a2\u04a4\5\u00b4[\2\u04a3\u04a1\3\2\2\2\u04a4"+
		"\u04a7\3\2\2\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u00b3\3\2"+
		"\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04aa\5\16\b\2\u04a9\u04a8\3\2\2\2\u04aa"+
		"\u04ad\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04b3\3\2"+
		"\2\2\u04ad\u04ab\3\2\2\2\u04ae\u04af\5R*\2\u04af\u04b0\5L\'\2\u04b0\u04b4"+
		"\3\2\2\2\u04b1\u04b2\7?\2\2\u04b2\u04b4\5\u00a4S\2\u04b3\u04ae\3\2\2\2"+
		"\u04b3\u04b1\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\7Y\2\2\u04b6\u04b7"+
		"\5\u00c6d\2\u04b7\u04ba\3\2\2\2\u04b8\u04ba\5\u00a4S\2\u04b9\u04ab\3\2"+
		"\2\2\u04b9\u04b8\3\2\2\2\u04ba\u00b5\3\2\2\2\u04bb\u04bd\5\u00b8]\2\u04bc"+
		"\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bf\3\2"+
		"\2\2\u04bf\u04c1\3\2\2\2\u04c0\u04c2\5\u00a0Q\2\u04c1\u04c0\3\2\2\2\u04c2"+
		"\u04c3\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u00b7\3\2"+
		"\2\2\u04c5\u04cb\7\b\2\2\u04c6\u04cc\5\u00c6d\2\u04c7\u04cc\7\u0082\2"+
		"\2\u04c8\u04c9\5\u00f0y\2\u04c9\u04ca\5\u00a4S\2\u04ca\u04cc\3\2\2\2\u04cb"+
		"\u04c6\3\2\2\2\u04cb\u04c7\3\2\2\2\u04cb\u04c8\3\2\2\2\u04cc\u04cd\3\2"+
		"\2\2\u04cd\u04d1\7_\2\2\u04ce\u04cf\7\16\2\2\u04cf\u04d1\7_\2\2\u04d0"+
		"\u04c5\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d1\u00b9\3\2\2\2\u04d2\u04df\5\u00be"+
		"`\2\u04d3\u04d5\5\u00bc_\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5"+
		"\u04d6\3\2\2\2\u04d6\u04d8\7V\2\2\u04d7\u04d9\5\u00c6d\2\u04d8\u04d7\3"+
		"\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04dc\7V\2\2\u04db"+
		"\u04dd\5\u00c2b\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04df"+
		"\3\2\2\2\u04de\u04d2\3\2\2\2\u04de\u04d4\3\2\2\2\u04df\u00bb\3\2\2\2\u04e0"+
		"\u04e3\5\u00a2R\2\u04e1\u04e3\5\u00c2b\2\u04e2\u04e0\3\2\2\2\u04e2\u04e1"+
		"\3\2\2\2\u04e3\u00bd\3\2\2\2\u04e4\u04e6\5\16\b\2\u04e5\u04e4\3\2\2\2"+
		"\u04e6\u04e9\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ec"+
		"\3\2\2\2\u04e9\u04e7\3\2\2\2\u04ea\u04ed\5\u00f0y\2\u04eb\u04ed\7?\2\2"+
		"\u04ec\u04ea\3\2\2\2\u04ec\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef"+
		"\5L\'\2\u04ef\u04f0\7_\2\2\u04f0\u04f1\5\u00c6d\2\u04f1\u00bf\3\2\2\2"+
		"\u04f2\u04f3\7P\2\2\u04f3\u04f4\5\u00c6d\2\u04f4\u04f5\7Q\2\2\u04f5\u00c1"+
		"\3\2\2\2\u04f6\u04fb\5\u00c6d\2\u04f7\u04f8\7W\2\2\u04f8\u04fa\5\u00c6"+
		"d\2\u04f9\u04f7\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fb"+
		"\u04fc\3\2\2\2\u04fc\u00c3\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe\u04ff\5\u00a4"+
		"S\2\u04ff\u0501\7P\2\2\u0500\u0502\5\u00c2b\2\u0501\u0500\3\2\2\2\u0501"+
		"\u0502\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504\7Q\2\2\u0504\u0512\3\2"+
		"\2\2\u0505\u0506\7-\2\2\u0506\u0508\7P\2\2\u0507\u0509\5\u00c2b\2\u0508"+
		"\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u0512\7Q"+
		"\2\2\u050b\u050c\7*\2\2\u050c\u050e\7P\2\2\u050d\u050f\5\u00c2b\2\u050e"+
		"\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0512\7Q"+
		"\2\2\u0511\u04fe\3\2\2\2\u0511\u0505\3\2\2\2\u0511\u050b\3\2\2\2\u0512"+
		"\u00c5\3\2\2\2\u0513\u0514\bd\1\2\u0514\u051d\5\u00d0i\2\u0515\u051d\5"+
		"\u00c4c\2\u0516\u0517\7!\2\2\u0517\u051d\5\u00dco\2\u0518\u0519\t\7\2"+
		"\2\u0519\u051d\5\u00c6d\21\u051a\u051b\t\b\2\2\u051b\u051d\5\u00c6d\20"+
		"\u051c\u0513\3\2\2\2\u051c\u0515\3\2\2\2\u051c\u0516\3\2\2\2\u051c\u0518"+
		"\3\2\2\2\u051c\u051a\3\2\2\2\u051d\u056b\3\2\2\2\u051e\u051f\f\17\2\2"+
		"\u051f\u0520\t\t\2\2\u0520\u056a\5\u00c6d\20\u0521\u0522\f\16\2\2\u0522"+
		"\u0523\t\n\2\2\u0523\u056a\5\u00c6d\17\u0524\u052c\f\r\2\2\u0525\u0526"+
		"\7[\2\2\u0526\u052d\7[\2\2\u0527\u0528\7Z\2\2\u0528\u0529\7Z\2\2\u0529"+
		"\u052d\7Z\2\2\u052a\u052b\7Z\2\2\u052b\u052d\7Z\2\2\u052c\u0525\3\2\2"+
		"\2\u052c\u0527\3\2\2\2\u052c\u052a\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u056a"+
		"\5\u00c6d\16\u052f\u0530\f\f\2\2\u0530\u0531\t\13\2\2\u0531\u056a\5\u00c6"+
		"d\r\u0532\u0533\f\n\2\2\u0533\u0534\t\f\2\2\u0534\u056a\5\u00c6d\13\u0535"+
		"\u0536\f\t\2\2\u0536\u0537\7l\2\2\u0537\u056a\5\u00c6d\n\u0538\u0539\f"+
		"\b\2\2\u0539\u053a\7n\2\2\u053a\u056a\5\u00c6d\t\u053b\u053c\f\7\2\2\u053c"+
		"\u053d\7m\2\2\u053d\u056a\5\u00c6d\b\u053e\u053f\f\6\2\2\u053f\u0540\7"+
		"d\2\2\u0540\u056a\5\u00c6d\7\u0541\u0542\f\5\2\2\u0542\u0543\7e\2\2\u0543"+
		"\u056a\5\u00c6d\6\u0544\u0545\f\4\2\2\u0545\u0546\7^\2\2\u0546\u0547\5"+
		"\u00c6d\2\u0547\u0548\7_\2\2\u0548\u0549\5\u00c6d\4\u0549\u056a\3\2\2"+
		"\2\u054a\u054b\f\3\2\2\u054b\u054c\t\r\2\2\u054c\u056a\5\u00c6d\3\u054d"+
		"\u054e\f\26\2\2\u054e\u055a\7X\2\2\u054f\u055b\5\u00a4S\2\u0550\u055b"+
		"\5\u00c4c\2\u0551\u055b\7-\2\2\u0552\u0554\7!\2\2\u0553\u0555\5\u00ec"+
		"w\2\u0554\u0553\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u055b\5\u00e0q\2\u0557\u0558\7*\2\2\u0558\u055b\5\u00f6|\2\u0559\u055b"+
		"\5\u00e6t\2\u055a\u054f\3\2\2\2\u055a\u0550\3\2\2\2\u055a\u0551\3\2\2"+
		"\2\u055a\u0552\3\2\2\2\u055a\u0557\3\2\2\2\u055a\u0559\3\2\2\2\u055b\u056a"+
		"\3\2\2\2\u055c\u055d\f\25\2\2\u055d\u055e\7T\2\2\u055e\u055f\5\u00c6d"+
		"\2\u055f\u0560\7U\2\2\u0560\u056a\3\2\2\2\u0561\u0562\f\22\2\2\u0562\u056a"+
		"\t\16\2\2\u0563\u0564\f\13\2\2\u0564\u0567\7\34\2\2\u0565\u0568\5\u00f0"+
		"y\2\u0566\u0568\5\u00c8e\2\u0567\u0565\3\2\2\2\u0567\u0566\3\2\2\2\u0568"+
		"\u056a\3\2\2\2\u0569\u051e\3\2\2\2\u0569\u0521\3\2\2\2\u0569\u0524\3\2"+
		"\2\2\u0569\u052f\3\2\2\2\u0569\u0532\3\2\2\2\u0569\u0535\3\2\2\2\u0569"+
		"\u0538\3\2\2\2\u0569\u053b\3\2\2\2\u0569\u053e\3\2\2\2\u0569\u0541\3\2"+
		"\2\2\u0569\u0544\3\2\2\2\u0569\u054a\3\2\2\2\u0569\u054d\3\2\2\2\u0569"+
		"\u055c\3\2\2\2\u0569\u0561\3\2\2\2\u0569\u0563\3\2\2\2\u056a\u056d\3\2"+
		"\2\2\u056b\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u00c7\3\2\2\2\u056d"+
		"\u056b\3\2\2\2\u056e\u0570\5\16\b\2\u056f\u056e\3\2\2\2\u0570\u0573\3"+
		"\2\2\2\u0571\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2\2\2\u0573"+
		"\u0571\3\2\2\2\u0574\u0578\5\u00f0y\2\u0575\u0577\5p9\2\u0576\u0575\3"+
		"\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579"+
		"\u057b\3\2\2\2\u057a\u0578\3\2\2\2\u057b\u057c\5\u00a4S\2\u057c\u00c9"+
		"\3\2\2\2\u057d\u057e\5\u00ccg\2\u057e\u057f\7{\2\2\u057f\u0580\5\u00ce"+
		"h\2\u0580\u00cb\3\2\2\2\u0581\u0598\5\u00a4S\2\u0582\u0584\7P\2\2\u0583"+
		"\u0585\5\\/\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0586\3\2"+
		"\2\2\u0586\u0598\7Q\2\2\u0587\u0588\7P\2\2\u0588\u058d\5\u00a4S\2\u0589"+
		"\u058a\7W\2\2\u058a\u058c\5\u00a4S\2\u058b\u0589\3\2\2\2\u058c\u058f\3"+
		"\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0590\3\2\2\2\u058f"+
		"\u058d\3\2\2\2\u0590\u0591\7Q\2\2\u0591\u0598\3\2\2\2\u0592\u0594\7P\2"+
		"\2\u0593\u0595\5b\62\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596"+
		"\3\2\2\2\u0596\u0598\7Q\2\2\u0597\u0581\3\2\2\2\u0597\u0582\3\2\2\2\u0597"+
		"\u0587\3\2\2\2\u0597\u0592\3\2\2\2\u0598\u00cd\3\2\2\2\u0599\u059c\5\u00c6"+
		"d\2\u059a\u059c\5\u009cO\2\u059b\u0599\3\2\2\2\u059b\u059a\3\2\2\2\u059c"+
		"\u00cf\3\2\2\2\u059d\u059e\7P\2\2\u059e\u059f\5\u00c6d\2\u059f\u05a0\7"+
		"Q\2\2\u05a0\u05b0\3\2\2\2\u05a1\u05b0\7-\2\2\u05a2\u05b0\7*\2\2\u05a3"+
		"\u05b0\5h\65\2\u05a4\u05b0\5\u00a4S\2\u05a5\u05a6\5.\30\2\u05a6\u05a7"+
		"\7X\2\2\u05a7\u05a8\7\13\2\2\u05a8\u05b0\3\2\2\2\u05a9\u05ad\5\u00ecw"+
		"\2\u05aa\u05ae\5\u00f8}\2\u05ab\u05ac\7-\2\2\u05ac\u05ae\5\u00fa~\2\u05ad"+
		"\u05aa\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ae\u05b0\3\2\2\2\u05af\u059d\3\2"+
		"\2\2\u05af\u05a1\3\2\2\2\u05af\u05a2\3\2\2\2\u05af\u05a3\3\2\2\2\u05af"+
		"\u05a4\3\2\2\2\u05af\u05a5\3\2\2\2\u05af\u05a9\3\2\2\2\u05b0\u00d1\3\2"+
		"\2\2\u05b1\u05b2\7+\2\2\u05b2\u05b3\5\u00c0a\2\u05b3\u05b7\7R\2\2\u05b4"+
		"\u05b6\5\u00d4k\2\u05b5\u05b4\3\2\2\2\u05b6\u05b9\3\2\2\2\u05b7\u05b5"+
		"\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05b7\3\2\2\2\u05ba"+
		"\u05bb\7S\2\2\u05bb\u00d3\3\2\2\2\u05bc\u05c0\7\b\2\2\u05bd\u05c1\5\u00c2"+
		"b\2\u05be\u05c1\7O\2\2\u05bf\u05c1\5\u00d6l\2\u05c0\u05bd\3\2\2\2\u05c0"+
		"\u05be\3\2\2\2\u05c0\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\t\17"+
		"\2\2\u05c3\u05c8\5\u00d8m\2\u05c4\u05c5\7\16\2\2\u05c5\u05c6\t\17\2\2"+
		"\u05c6\u05c8\5\u00d8m\2\u05c7\u05bc\3\2\2\2\u05c7\u05c4\3\2\2\2\u05c8"+
		"\u00d5\3\2\2\2\u05c9\u05ca\bl\1\2\u05ca\u05cb\7P\2\2\u05cb\u05cc\5\u00d6"+
		"l\2\u05cc\u05cd\7Q\2\2\u05cd\u05e4\3\2\2\2\u05ce\u05d0\5\16\b\2\u05cf"+
		"\u05ce\3\2\2\2\u05d0\u05d3\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d1\u05d2\3\2"+
		"\2\2\u05d2\u05d4\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d4\u05d8\5\u00f0y\2\u05d5"+
		"\u05d7\5p9\2\u05d6\u05d5\3\2\2\2\u05d7\u05da\3\2\2\2\u05d8\u05d6\3\2\2"+
		"\2\u05d8\u05d9\3\2\2\2\u05d9\u05db\3\2\2\2\u05da\u05d8\3\2\2\2\u05db\u05e0"+
		"\5\u00a4S\2\u05dc\u05dd\7d\2\2\u05dd\u05df\5\u00c6d\2\u05de\u05dc\3\2"+
		"\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1"+
		"\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e3\u05c9\3\2\2\2\u05e3\u05d1\3\2"+
		"\2\2\u05e4\u05ea\3\2\2\2\u05e5\u05e6\f\3\2\2\u05e6\u05e7\7d\2\2\u05e7"+
		"\u05e9\5\u00c6d\2\u05e8\u05e5\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8"+
		"\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u00d7\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed"+
		"\u05f5\5\u009cO\2\u05ee\u05f0\5\u00a0Q\2\u05ef\u05ee\3\2\2\2\u05f0\u05f3"+
		"\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f5\3\2\2\2\u05f3"+
		"\u05f1\3\2\2\2\u05f4\u05ed\3\2\2\2\u05f4\u05f1\3\2\2\2\u05f5\u00d9\3\2"+
		"\2\2\u05f6\u05f7\5R*\2\u05f7\u05f8\7X\2\2\u05f8\u05fa\3\2\2\2\u05f9\u05f6"+
		"\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fe\3\2\2\2\u05fb\u05fd\5p9\2\u05fc"+
		"\u05fb\3\2\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe\u05ff\3\2"+
		"\2\2\u05ff\u0601\3\2\2\2\u0600\u05fe\3\2\2\2\u0601\u0603\5\u00a4S\2\u0602"+
		"\u0604\5\u00f4{\2\u0603\u0602\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u00db"+
		"\3\2\2\2\u0605\u0606\5\u00ecw\2\u0606\u0607\5\u00dep\2\u0607\u0608\5\u00e4"+
		"s\2\u0608\u060f\3\2\2\2\u0609\u060c\5\u00dep\2\u060a\u060d\5\u00e2r\2"+
		"\u060b\u060d\5\u00e4s\2\u060c\u060a\3\2\2\2\u060c\u060b\3\2\2\2\u060d"+
		"\u060f\3\2\2\2\u060e\u0605\3\2\2\2\u060e\u0609\3\2\2\2\u060f\u00dd\3\2"+
		"\2\2\u0610\u0612\5\u00a4S\2\u0611\u0613\5\u00e8u\2\u0612\u0611\3\2\2\2"+
		"\u0612\u0613\3\2\2\2\u0613\u061b\3\2\2\2\u0614\u0615\7X\2\2\u0615\u0617"+
		"\5\u00a4S\2\u0616\u0618\5\u00e8u\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2"+
		"\2\2\u0618\u061a\3\2\2\2\u0619\u0614\3\2\2\2\u061a\u061d\3\2\2\2\u061b"+
		"\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u0620\3\2\2\2\u061d\u061b\3\2"+
		"\2\2\u061e\u0620\5\u00f2z\2\u061f\u0610\3\2\2\2\u061f\u061e\3\2\2\2\u0620"+
		"\u00df\3\2\2\2\u0621\u0623\5\u00a4S\2\u0622\u0624\5\u00eav\2\u0623\u0622"+
		"\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0626\5\u00e4s"+
		"\2\u0626\u00e1\3\2\2\2\u0627\u0643\7T\2\2\u0628\u062d\7U\2\2\u0629\u062a"+
		"\7T\2\2\u062a\u062c\7U\2\2\u062b\u0629\3\2\2\2\u062c\u062f\3\2\2\2\u062d"+
		"\u062b\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u0630\3\2\2\2\u062f\u062d\3\2"+
		"\2\2\u0630\u0644\5P)\2\u0631\u0632\5\u00c6d\2\u0632\u0639\7U\2\2\u0633"+
		"\u0634\7T\2\2\u0634\u0635\5\u00c6d\2\u0635\u0636\7U\2\2\u0636\u0638\3"+
		"\2\2\2\u0637\u0633\3\2\2\2\u0638\u063b\3\2\2\2\u0639\u0637\3\2\2\2\u0639"+
		"\u063a\3\2\2\2\u063a\u0640\3\2\2\2\u063b\u0639\3\2\2\2\u063c\u063d\7T"+
		"\2\2\u063d\u063f\7U\2\2\u063e\u063c\3\2\2\2\u063f\u0642\3\2\2\2\u0640"+
		"\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0644\3\2\2\2\u0642\u0640\3\2"+
		"\2\2\u0643\u0628\3\2\2\2\u0643\u0631\3\2\2\2\u0644\u00e3\3\2\2\2\u0645"+
		"\u0647\5\u00fa~\2\u0646\u0648\5\"\22\2\u0647\u0646\3\2\2\2\u0647\u0648"+
		"\3\2\2\2\u0648\u00e5\3\2\2\2\u0649\u064a\5\u00ecw\2\u064a\u064b\5\u00f8"+
		"}\2\u064b\u00e7\3\2\2\2\u064c\u064d\7[\2\2\u064d\u0650\7Z\2\2\u064e\u0650"+
		"\5\u00f4{\2\u064f\u064c\3\2\2\2\u064f\u064e\3\2\2\2\u0650\u00e9\3\2\2"+
		"\2\u0651\u0652\7[\2\2\u0652\u0655\7Z\2\2\u0653\u0655\5\u00ecw\2\u0654"+
		"\u0651\3\2\2\2\u0654\u0653\3\2\2\2\u0655\u00eb\3\2\2\2\u0656\u0657\7["+
		"\2\2\u0657\u0658\5\u00eex\2\u0658\u0659\7Z\2\2\u0659\u00ed\3\2\2\2\u065a"+
		"\u065f\5\u00f0y\2\u065b\u065c\7W\2\2\u065c\u065e\5\u00f0y\2\u065d\u065b"+
		"\3\2\2\2\u065e\u0661\3\2\2\2\u065f\u065d\3\2\2\2\u065f\u0660\3\2\2\2\u0660"+
		"\u00ef\3\2\2\2\u0661\u065f\3\2\2\2\u0662\u0664\5p9\2\u0663\u0662\3\2\2"+
		"\2\u0664\u0667\3\2\2\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u066a"+
		"\3\2\2\2\u0667\u0665\3\2\2\2\u0668\u066b\5R*\2\u0669\u066b\5\u00f2z\2"+
		"\u066a\u0668\3\2\2\2\u066a\u0669\3\2\2\2\u066b\u0676\3\2\2\2\u066c\u066e"+
		"\5p9\2\u066d\u066c\3\2\2\2\u066e\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u066f"+
		"\u0670\3\2\2\2\u0670\u0672\3\2\2\2\u0671\u066f\3\2\2\2\u0672\u0673\7T"+
		"\2\2\u0673\u0675\7U\2\2\u0674\u066f\3\2\2\2\u0675\u0678\3\2\2\2\u0676"+
		"\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u00f1\3\2\2\2\u0678\u0676\3\2"+
		"\2\2\u0679\u067a\t\20\2\2\u067a\u00f3\3\2\2\2\u067b\u067c\7[\2\2\u067c"+
		"\u0681\5T+\2\u067d\u067e\7W\2\2\u067e\u0680\5T+\2\u067f\u067d\3\2\2\2"+
		"\u0680\u0683\3\2\2\2\u0681\u067f\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0684"+
		"\3\2\2\2\u0683\u0681\3\2\2\2\u0684\u0685\7Z\2\2\u0685\u00f5\3\2\2\2\u0686"+
		"\u0690\5\u00fa~\2\u0687\u0689\7X\2\2\u0688\u068a\5\u00f4{\2\u0689\u0688"+
		"\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068d\5\u00a4S"+
		"\2\u068c\u068e\5\u00fa~\2\u068d\u068c\3\2\2\2\u068d\u068e\3\2\2\2\u068e"+
		"\u0690\3\2\2\2\u068f\u0686\3\2\2\2\u068f\u0687\3\2\2\2\u0690\u00f7\3\2"+
		"\2\2\u0691\u0692\7*\2\2\u0692\u0697\5\u00f6|\2\u0693\u0694\5\u00a4S\2"+
		"\u0694\u0695\5\u00fa~\2\u0695\u0697\3\2\2\2\u0696\u0691\3\2\2\2\u0696"+
		"\u0693\3\2\2\2\u0697\u00f9\3\2\2\2\u0698\u069a\7P\2\2\u0699\u069b\5\u00c2"+
		"b\2\u069a\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069c\3\2\2\2\u069c"+
		"\u069d\7Q\2\2\u069d\u00fb\3\2\2\2\u00d5\u00fd\u0102\u0108\u010e\u0113"+
		"\u011c\u0121\u0128\u0130\u0133\u013a\u0146\u014a\u014f\u0153\u0157\u015b"+
		"\u0165\u016d\u0175\u0179\u0180\u0187\u018b\u018e\u0191\u019a\u01a0\u01a5"+
		"\u01a8\u01ae\u01b4\u01b8\u01bc\u01c4\u01cd\u01d4\u01da\u01de\u01ea\u01f3"+
		"\u01f8\u01fe\u0202\u020e\u0219\u021e\u0228\u0230\u023a\u0243\u024e\u0253"+
		"\u025c\u0266\u026b\u0274\u027a\u0281\u0286\u028e\u0292\u0294\u029a\u029f"+
		"\u02a3\u02aa\u02b0\u02b2\u02b9\u02be\u02c3\u02c6\u02c8\u02d2\u02dc\u02e1"+
		"\u02e4\u02e9\u02f2\u02f9\u0304\u030a\u0315\u031f\u032a\u0333\u0338\u033b"+
		"\u0342\u034c\u0354\u0357\u035a\u0367\u036f\u0374\u037c\u0380\u0384\u0388"+
		"\u038c\u038e\u0392\u0398\u03a0\u03aa\u03b3\u03bd\u03c5\u03d3\u03da\u03df"+
		"\u03e5\u03ee\u03f8\u0401\u0409\u0410\u0415\u0420\u0427\u042d\u0430\u0438"+
		"\u044f\u0452\u0455\u045d\u0463\u046a\u0473\u0478\u047f\u0486\u0493\u049c"+
		"\u04a5\u04ab\u04b3\u04b9\u04be\u04c3\u04cb\u04d0\u04d4\u04d8\u04dc\u04de"+
		"\u04e2\u04e7\u04ec\u04fb\u0501\u0508\u050e\u0511\u051c\u052c\u0554\u055a"+
		"\u0567\u0569\u056b\u0571\u0578\u0584\u058d\u0594\u0597\u059b\u05ad\u05af"+
		"\u05b7\u05c0\u05c7\u05d1\u05d8\u05e0\u05e3\u05ea\u05f1\u05f4\u05f9\u05fe"+
		"\u0603\u060c\u060e\u0612\u0617\u061b\u061f\u0623\u062d\u0639\u0640\u0643"+
		"\u0647\u064f\u0654\u065f\u0665\u066a\u066f\u0676\u0681\u0689\u068d\u068f"+
		"\u0696\u069a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}