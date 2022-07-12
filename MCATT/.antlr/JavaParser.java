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
		RULE_block = 77, RULE_blockStatement = 78, RULE_localVariableDeclaration = 79, 
		RULE_identifier = 80, RULE_localTypeDeclaration = 81, RULE_statement = 82, 
		RULE_catchClause = 83, RULE_catchType = 84, RULE_finallyBlock = 85, RULE_resourceSpecification = 86, 
		RULE_resources = 87, RULE_resource = 88, RULE_switchBlockStatementGroup = 89, 
		RULE_switchLabel = 90, RULE_forControl = 91, RULE_forInit = 92, RULE_enhancedForControl = 93, 
		RULE_parExpression = 94, RULE_expressionList = 95, RULE_methodCall = 96, 
		RULE_expression = 97, RULE_pattern = 98, RULE_lambdaExpression = 99, RULE_lambdaParameters = 100, 
		RULE_lambdaBody = 101, RULE_primary = 102, RULE_switchExpression = 103, 
		RULE_switchLabeledRule = 104, RULE_guardedPattern = 105, RULE_switchRuleOutcome = 106, 
		RULE_classType = 107, RULE_creator = 108, RULE_createdName = 109, RULE_innerCreator = 110, 
		RULE_arrayCreatorRest = 111, RULE_classCreatorRest = 112, RULE_explicitGenericInvocation = 113, 
		RULE_typeArgumentsOrDiamond = 114, RULE_nonWildcardTypeArgumentsOrDiamond = 115, 
		RULE_nonWildcardTypeArguments = 116, RULE_typeList = 117, RULE_typeType = 118, 
		RULE_primitiveType = 119, RULE_typeArguments = 120, RULE_superSuffix = 121, 
		RULE_explicitGenericInvocationSuffix = 122, RULE_arguments = 123;
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
			"recordComponent", "recordBody", "block", "blockStatement", "localVariableDeclaration", 
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(248);
					packageDeclaration();
					}
					break;
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT) {
					{
					{
					setState(251);
					importDeclaration();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (CLASS - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (INTERFACE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(257);
					typeDeclaration();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				moduleDeclaration();
				setState(264);
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
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(268);
				annotation();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(PACKAGE);
			setState(275);
			qualifiedName();
			setState(276);
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
			setState(278);
			match(IMPORT);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(279);
				match(STATIC);
				}
			}

			setState(282);
			qualifiedName();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(283);
				match(DOT);
				setState(284);
				match(MUL);
				}
			}

			setState(287);
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
			setState(303);
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
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(289);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(295);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(296);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(297);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(298);
					annotationTypeDeclaration();
					}
					break;
				case RECORD:
					{
					setState(299);
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
				setState(302);
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
			setState(310);
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
				setState(305);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
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
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				annotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(PUBLIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(PROTECTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(PRIVATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				match(STATIC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				match(ABSTRACT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				match(FINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(319);
				match(STRICTFP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(320);
				match(SEALED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(321);
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
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
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
				setState(325);
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
			setState(328);
			match(CLASS);
			setState(329);
			identifier();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(330);
				typeParameters();
				}
			}

			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(333);
				match(EXTENDS);
				setState(334);
				typeType();
				}
			}

			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(337);
				match(IMPLEMENTS);
				setState(338);
				typeList();
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(341);
				match(PERMITS);
				setState(342);
				typeList();
				}
			}

			setState(345);
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
			setState(347);
			match(LT);
			setState(348);
			typeParameter();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349);
				match(COMMA);
				setState(350);
				typeParameter();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
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
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					annotation();
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(364);
			identifier();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(365);
				match(EXTENDS);
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(366);
						annotation();
						}
						} 
					}
					setState(371);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(372);
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
			setState(375);
			typeType();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(376);
				match(BITAND);
				setState(377);
				typeType();
				}
				}
				setState(382);
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
			setState(383);
			match(ENUM);
			setState(384);
			identifier();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(385);
				match(IMPLEMENTS);
				setState(386);
				typeList();
				}
			}

			setState(389);
			match(LBRACE);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(390);
				enumConstants();
				}
			}

			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(393);
				match(COMMA);
				}
			}

			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(396);
				enumBodyDeclarations();
				}
			}

			setState(399);
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
			setState(401);
			enumConstant();
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					match(COMMA);
					setState(403);
					enumConstant();
					}
					} 
				}
				setState(408);
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
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(409);
					annotation();
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(415);
			identifier();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(416);
				arguments();
				}
			}

			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(419);
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
			setState(422);
			match(SEMI);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(423);
				classBodyDeclaration();
				}
				}
				setState(428);
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
			setState(429);
			match(INTERFACE);
			setState(430);
			identifier();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(431);
				typeParameters();
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(434);
				match(EXTENDS);
				setState(435);
				typeList();
				}
			}

			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERMITS) {
				{
				setState(438);
				match(PERMITS);
				setState(439);
				typeList();
				}
			}

			setState(442);
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
			setState(444);
			match(LBRACE);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(445);
				classBodyDeclaration();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
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
			setState(453);
			match(LBRACE);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DEFAULT - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(454);
				interfaceBodyDeclaration();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
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
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(463);
					match(STATIC);
					}
				}

				setState(466);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(467);
						modifier();
						}
						} 
					}
					setState(472);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(473);
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
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(482);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(483);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(484);
				enumDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(485);
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
			setState(488);
			typeTypeOrVoid();
			setState(489);
			identifier();
			setState(490);
			formalParameters();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(491);
				match(LBRACK);
				setState(492);
				match(RBRACK);
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(498);
				match(THROWS);
				setState(499);
				qualifiedNameList();
				}
			}

			setState(502);
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
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
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
			setState(510);
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
				setState(508);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
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
			setState(512);
			typeParameters();
			setState(513);
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
			setState(515);
			typeParameters();
			setState(516);
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
			setState(518);
			identifier();
			setState(519);
			formalParameters();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(520);
				match(THROWS);
				setState(521);
				qualifiedNameList();
				}
			}

			setState(524);
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
			setState(526);
			typeType();
			setState(527);
			variableDeclarators();
			setState(528);
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
			setState(538);
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
				setState(533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(530);
						modifier();
						}
						} 
					}
					setState(535);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(536);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
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
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(544);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(545);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(546);
				enumDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(547);
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
			setState(550);
			typeType();
			setState(551);
			constantDeclarator();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(552);
				match(COMMA);
				setState(553);
				constantDeclarator();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
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
			setState(561);
			identifier();
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(562);
				match(LBRACK);
				setState(563);
				match(RBRACK);
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(569);
			match(ASSIGN);
			setState(570);
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
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(572);
					interfaceMethodModifier();
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(578);
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
			setState(586);
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
				setState(580);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(583);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(584);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(585);
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
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (DEFAULT - 1)) | (1L << (PUBLIC - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(588);
				interfaceMethodModifier();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			typeParameters();
			setState(595);
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
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(597);
					annotation();
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(603);
			typeTypeOrVoid();
			setState(604);
			identifier();
			setState(605);
			formalParameters();
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(606);
				match(LBRACK);
				setState(607);
				match(RBRACK);
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(613);
				match(THROWS);
				setState(614);
				qualifiedNameList();
				}
			}

			setState(617);
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
			setState(619);
			variableDeclarator();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(620);
				match(COMMA);
				setState(621);
				variableDeclarator();
				}
				}
				setState(626);
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
			setState(627);
			variableDeclaratorId();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(628);
				match(ASSIGN);
				setState(629);
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
			setState(632);
			identifier();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(633);
				match(LBRACK);
				setState(634);
				match(RBRACK);
				}
				}
				setState(639);
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
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
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
				setState(641);
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
			setState(644);
			match(LBRACE);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(645);
				variableInitializer();
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(646);
						match(COMMA);
						setState(647);
						variableInitializer();
						}
						} 
					}
					setState(652);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(653);
					match(COMMA);
					}
				}

				}
			}

			setState(658);
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
			setState(660);
			identifier();
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(661);
				typeArguments();
				}
				break;
			}
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(664);
					match(DOT);
					setState(665);
					identifier();
					setState(667);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(666);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(673);
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
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(675);
					annotation();
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681);
				match(QUESTION);
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(682);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(683);
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
			setState(688);
			qualifiedName();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(689);
				match(COMMA);
				setState(690);
				qualifiedName();
				}
				}
				setState(695);
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
			setState(696);
			match(LPAREN);
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(697);
					receiverParameter();
					}
				}

				}
				break;
			case 2:
				{
				setState(700);
				receiverParameter();
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(701);
					match(COMMA);
					setState(702);
					formalParameterList();
					}
				}

				}
				break;
			case 3:
				{
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(705);
					formalParameterList();
					}
				}

				}
				break;
			}
			setState(710);
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
			setState(712);
			typeType();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(713);
				identifier();
				setState(714);
				match(DOT);
				}
				}
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(721);
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
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				formalParameter();
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(724);
						match(COMMA);
						setState(725);
						formalParameter();
						}
						} 
					}
					setState(730);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(731);
					match(COMMA);
					setState(732);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
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
			setState(741);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(738);
					variableModifier();
					}
					} 
				}
				setState(743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(744);
			typeType();
			setState(745);
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
			setState(750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(747);
					variableModifier();
					}
					} 
				}
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(753);
			typeType();
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				{
				setState(754);
				annotation();
				}
				}
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(760);
			match(ELLIPSIS);
			setState(761);
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
			setState(763);
			lambdaLVTIParameter();
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(764);
				match(COMMA);
				setState(765);
				lambdaLVTIParameter();
				}
				}
				setState(770);
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
			setState(774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(771);
					variableModifier();
					}
					} 
				}
				setState(776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(777);
			match(VAR);
			setState(778);
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
			setState(780);
			identifier();
			setState(785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(781);
					match(DOT);
					setState(782);
					identifier();
					}
					} 
				}
				setState(787);
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
			setState(795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				_localctx = new ExprIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				_localctx = new ExprFloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				_localctx = new ExprCharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new ExprStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(791);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				_localctx = new ExprBoolLitearlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(792);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				_localctx = new ExprNullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(793);
				match(NULL_LITERAL);
				}
				break;
			case TEXT_BLOCK:
				_localctx = new ExprTextBlockLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(794);
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
			setState(797);
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
			setState(799);
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
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(801);
				identifier();
				setState(802);
				match(DOT);
				}
				}
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(809);
			match(AT);
			setState(810);
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
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(812);
				match(AT);
				setState(813);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(814);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(817);
				match(LPAREN);
				setState(820);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(818);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(819);
					elementValue();
					}
					break;
				}
				setState(822);
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
			setState(825);
			elementValuePair();
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(826);
				match(COMMA);
				setState(827);
				elementValuePair();
				}
				}
				setState(832);
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
			setState(833);
			identifier();
			setState(834);
			match(ASSIGN);
			setState(835);
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
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(839);
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
			setState(842);
			match(LBRACE);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(843);
				elementValue();
				setState(848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(844);
						match(COMMA);
						setState(845);
						elementValue();
						}
						} 
					}
					setState(850);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
			}

			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(853);
				match(COMMA);
				}
			}

			setState(856);
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
			setState(858);
			match(AT);
			setState(859);
			match(INTERFACE);
			setState(860);
			identifier();
			setState(861);
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
			setState(863);
			match(LBRACE);
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(864);
				annotationTypeElementDeclaration();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(870);
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
			setState(880);
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
				setState(875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(872);
						modifier();
						}
						} 
					}
					setState(877);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				setState(878);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
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
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				typeType();
				setState(883);
				annotationMethodOrConstantRest();
				setState(884);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				classDeclaration();
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(887);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(890);
				interfaceDeclaration();
				setState(892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(891);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(894);
				enumDeclaration();
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(895);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(898);
				annotationTypeDeclaration();
				setState(900);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(899);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(902);
				recordDeclaration();
				setState(904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(903);
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
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
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
			setState(912);
			identifier();
			setState(913);
			match(LPAREN);
			setState(914);
			match(RPAREN);
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(915);
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
			setState(918);
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
			setState(920);
			match(DEFAULT);
			setState(921);
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
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(923);
				match(OPEN);
				}
			}

			setState(926);
			match(MODULE);
			setState(927);
			qualifiedName();
			setState(928);
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
			setState(930);
			match(LBRACE);
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REQUIRES) | (1L << EXPORTS) | (1L << OPENS) | (1L << USES) | (1L << PROVIDES))) != 0)) {
				{
				{
				setState(931);
				moduleDirective();
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(937);
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
			setState(975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRES:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				match(REQUIRES);
				setState(943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(940);
						requiresModifier();
						}
						} 
					}
					setState(945);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(946);
				qualifiedName();
				setState(947);
				match(SEMI);
				}
				break;
			case EXPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				match(EXPORTS);
				setState(950);
				qualifiedName();
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(951);
					match(TO);
					setState(952);
					qualifiedName();
					}
				}

				setState(955);
				match(SEMI);
				}
				break;
			case OPENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				match(OPENS);
				setState(958);
				qualifiedName();
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(959);
					match(TO);
					setState(960);
					qualifiedName();
					}
				}

				setState(963);
				match(SEMI);
				}
				break;
			case USES:
				enterOuterAlt(_localctx, 4);
				{
				setState(965);
				match(USES);
				setState(966);
				qualifiedName();
				setState(967);
				match(SEMI);
				}
				break;
			case PROVIDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(969);
				match(PROVIDES);
				setState(970);
				qualifiedName();
				setState(971);
				match(WITH);
				setState(972);
				qualifiedName();
				setState(973);
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
			setState(977);
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
			setState(979);
			match(RECORD);
			setState(980);
			identifier();
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(981);
				typeParameters();
				}
			}

			setState(984);
			recordHeader();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(985);
				match(IMPLEMENTS);
				setState(986);
				typeList();
				}
			}

			setState(989);
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
			setState(991);
			match(LPAREN);
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(992);
				recordComponentList();
				}
			}

			setState(995);
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
			setState(997);
			recordComponent();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(998);
				match(COMMA);
				setState(999);
				recordComponent();
				}
				}
				setState(1004);
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
			setState(1005);
			typeType();
			setState(1006);
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
			setState(1008);
			match(LBRACE);
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (DOUBLE - 1)) | (1L << (ENUM - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NATIVE - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOID - 1)) | (1L << (VOLATILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(1009);
				classBodyDeclaration();
				}
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1015);
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
			setState(1017);
			match(LBRACE);
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(1018);
				blockStatement();
				}
				}
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1024);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_blockStatement);
		try {
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026);
				localVariableDeclaration();
				setState(1027);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1030);
				localTypeDeclaration();
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
		enterRule(_localctx, 158, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1033);
					variableModifier();
					}
					} 
				}
				setState(1038);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1039);
				typeType();
				setState(1040);
				variableDeclarators();
				}
				break;
			case 2:
				{
				setState(1042);
				match(VAR);
				setState(1043);
				identifier();
				setState(1044);
				match(ASSIGN);
				setState(1045);
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
		enterRule(_localctx, 160, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
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
		enterRule(_localctx, 162, RULE_localTypeDeclaration);
		try {
			int _alt;
			setState(1063);
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
				setState(1054);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1051);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(1056);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}
				setState(1060);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(1057);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(1058);
					interfaceDeclaration();
					}
					break;
				case RECORD:
					{
					setState(1059);
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
				setState(1062);
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
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public IdentifierContext identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
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
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
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
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1065);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				match(ASSERT);
				setState(1067);
				expression(0);
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1068);
					match(COLON);
					setState(1069);
					expression(0);
					}
				}

				setState(1072);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1074);
				match(IF);
				setState(1075);
				parExpression();
				setState(1076);
				statement();
				setState(1079);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1077);
					match(ELSE);
					setState(1078);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1081);
				match(FOR);
				setState(1082);
				match(LPAREN);
				setState(1083);
				forControl();
				setState(1084);
				match(RPAREN);
				setState(1085);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1087);
				match(WHILE);
				setState(1088);
				parExpression();
				setState(1089);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1091);
				match(DO);
				setState(1092);
				statement();
				setState(1093);
				match(WHILE);
				setState(1094);
				parExpression();
				setState(1095);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1097);
				match(TRY);
				setState(1098);
				block();
				setState(1108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1099);
						catchClause();
						}
						}
						setState(1102); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(1105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1104);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1107);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1110);
				match(TRY);
				setState(1111);
				resourceSpecification();
				setState(1112);
				block();
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(1113);
					catchClause();
					}
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1119);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1122);
				match(SWITCH);
				setState(1123);
				parExpression();
				setState(1124);
				match(LBRACE);
				setState(1128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1125);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(1130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				}
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1131);
					switchLabel();
					}
					}
					setState(1136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1137);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1139);
				match(RETURN);
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1140);
					expression(0);
					}
				}

				setState(1143);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1144);
				match(THROW);
				setState(1145);
				expression(0);
				setState(1146);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1148);
				match(BREAK);
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1149);
					identifier();
					}
				}

				setState(1152);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1153);
				match(CONTINUE);
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==IDENTIFIER) {
					{
					setState(1154);
					identifier();
					}
				}

				setState(1157);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1158);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1159);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(1160);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1162);
				((StatementContext)_localctx).identifierLabel = identifier();
				setState(1163);
				match(COLON);
				setState(1164);
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
		enterRule(_localctx, 166, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(CATCH);
			setState(1169);
			match(LPAREN);
			setState(1173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1170);
					variableModifier();
					}
					} 
				}
				setState(1175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1176);
			catchType();
			setState(1177);
			identifier();
			setState(1178);
			match(RPAREN);
			setState(1179);
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
		enterRule(_localctx, 168, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			qualifiedName();
			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1182);
				match(BITOR);
				setState(1183);
				qualifiedName();
				}
				}
				setState(1188);
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
		enterRule(_localctx, 170, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(FINALLY);
			setState(1190);
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
		enterRule(_localctx, 172, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(LPAREN);
			setState(1193);
			resources();
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1194);
				match(SEMI);
				}
			}

			setState(1197);
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
		enterRule(_localctx, 174, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			resource();
			setState(1204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1200);
					match(SEMI);
					setState(1201);
					resource();
					}
					} 
				}
				setState(1206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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
		enterRule(_localctx, 176, RULE_resource);
		try {
			int _alt;
			setState(1224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1207);
						variableModifier();
						}
						} 
					}
					setState(1212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				}
				setState(1218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1213);
					classOrInterfaceType();
					setState(1214);
					variableDeclaratorId();
					}
					break;
				case 2:
					{
					setState(1216);
					match(VAR);
					setState(1217);
					identifier();
					}
					break;
				}
				setState(1220);
				match(ASSIGN);
				setState(1221);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223);
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
		enterRule(_localctx, 178, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1226);
				switchLabel();
				}
				}
				setState(1229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1231);
				blockStatement();
				}
				}
				setState(1234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
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
		enterRule(_localctx, 180, RULE_switchLabel);
		try {
			setState(1247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236);
				match(CASE);
				setState(1242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1237);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1238);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				case 3:
					{
					setState(1239);
					typeType();
					setState(1240);
					((SwitchLabelContext)_localctx).varName = identifier();
					}
					break;
				}
				setState(1244);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1245);
				match(DEFAULT);
				setState(1246);
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
		enterRule(_localctx, 182, RULE_forControl);
		int _la;
		try {
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1250);
					forInit();
					}
				}

				setState(1253);
				match(SEMI);
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1254);
					expression(0);
					}
				}

				setState(1257);
				match(SEMI);
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1258);
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
		enterRule(_localctx, 184, RULE_forInit);
		try {
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1263);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1264);
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
		enterRule(_localctx, 186, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1267);
					variableModifier();
					}
					} 
				}
				setState(1272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1273);
				typeType();
				}
				break;
			case 2:
				{
				setState(1274);
				match(VAR);
				}
				break;
			}
			setState(1277);
			variableDeclaratorId();
			setState(1278);
			match(COLON);
			setState(1279);
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
		enterRule(_localctx, 188, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(LPAREN);
			setState(1282);
			expression(0);
			setState(1283);
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
		enterRule(_localctx, 190, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			expression(0);
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1286);
				match(COMMA);
				setState(1287);
				expression(0);
				}
				}
				setState(1292);
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
		enterRule(_localctx, 192, RULE_methodCall);
		int _la;
		try {
			setState(1312);
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
				setState(1293);
				identifier();
				setState(1294);
				match(LPAREN);
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1295);
					expressionList();
					}
				}

				setState(1298);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1300);
				match(THIS);
				setState(1301);
				match(LPAREN);
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1302);
					expressionList();
					}
				}

				setState(1305);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1306);
				match(SUPER);
				setState(1307);
				match(LPAREN);
				setState(1309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(1308);
					expressionList();
					}
				}

				setState(1311);
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
	public static class ExprDotBOPContext extends ExpressionContext {
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
		public ExprDotBOPContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1315);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new ExprMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1316);
				methodCall();
				}
				break;
			case 3:
				{
				_localctx = new ExprCreatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1317);
				match(NEW);
				setState(1318);
				creator();
				}
				break;
			case 4:
				{
				_localctx = new ExprPrefixArthemticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1319);
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
				setState(1320);
				expression(15);
				}
				break;
			case 5:
				{
				_localctx = new ExprPrefixLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1321);
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
				setState(1322);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMDMContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1325);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1326);
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
						setState(1327);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprASContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1328);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1329);
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
						setState(1330);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprShiftingContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1331);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1339);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
						case 1:
							{
							setState(1332);
							match(LT);
							setState(1333);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1334);
							match(GT);
							setState(1335);
							match(GT);
							setState(1336);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1337);
							match(GT);
							setState(1338);
							match(GT);
							}
							break;
						}
						setState(1341);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1342);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1343);
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
						setState(1344);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprEqualityContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1345);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1346);
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
						setState(1347);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprBitwiseANDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1348);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1349);
						((ExprBitwiseANDContext)_localctx).bop = match(BITAND);
						setState(1350);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprXORContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1351);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1352);
						((ExprXORContext)_localctx).bop = match(CARET);
						setState(1353);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprBitwiseORContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1354);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1355);
						((ExprBitwiseORContext)_localctx).bop = match(BITOR);
						setState(1356);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprLogicalANDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1357);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1358);
						((ExprLogicalANDContext)_localctx).bop = match(AND);
						setState(1359);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExprLogicalORContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1360);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1361);
						((ExprLogicalORContext)_localctx).bop = match(OR);
						setState(1362);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExprTernaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1363);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1364);
						((ExprTernaryContext)_localctx).bop = match(QUESTION);
						setState(1365);
						expression(0);
						setState(1366);
						match(COLON);
						setState(1367);
						expression(2);
						}
						break;
					case 12:
						{
						_localctx = new ExprRightAssociationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1369);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1370);
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
						setState(1371);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExprDotBOPContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1372);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1373);
						((ExprDotBOPContext)_localctx).bop = match(DOT);
						setState(1385);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
						case 1:
							{
							setState(1374);
							identifier();
							}
							break;
						case 2:
							{
							setState(1375);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1376);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1377);
							match(NEW);
							setState(1379);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1378);
								nonWildcardTypeArguments();
								}
							}

							setState(1381);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1382);
							match(SUPER);
							setState(1383);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1384);
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
						setState(1387);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1388);
						match(LBRACK);
						setState(1389);
						expression(0);
						setState(1390);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExprPostfixContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1392);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1393);
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
						setState(1394);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1395);
						((ExprIsInstanceContext)_localctx).bop = match(INSTANCEOF);
						setState(1398);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
						case 1:
							{
							setState(1396);
							typeType();
							}
							break;
						case 2:
							{
							setState(1397);
							pattern();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
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
		enterRule(_localctx, 196, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1405);
					variableModifier();
					}
					} 
				}
				setState(1410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			setState(1411);
			typeType();
			setState(1415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1412);
					annotation();
					}
					} 
				}
				setState(1417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			setState(1418);
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
		enterRule(_localctx, 198, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			lambdaParameters();
			setState(1421);
			match(ARROW);
			setState(1422);
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
		enterRule(_localctx, 200, RULE_lambdaParameters);
		int _la;
		try {
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1424);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1425);
				match(LPAREN);
				setState(1427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FINAL - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (SHORT - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1426);
					formalParameterList();
					}
				}

				setState(1429);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1430);
				match(LPAREN);
				setState(1431);
				identifier();
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1432);
					match(COMMA);
					setState(1433);
					identifier();
					}
					}
					setState(1438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1439);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1441);
				match(LPAREN);
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (FINAL - 18)) | (1L << (MODULE - 18)) | (1L << (OPEN - 18)) | (1L << (REQUIRES - 18)) | (1L << (EXPORTS - 18)) | (1L << (OPENS - 18)) | (1L << (TO - 18)) | (1L << (USES - 18)) | (1L << (PROVIDES - 18)) | (1L << (WITH - 18)) | (1L << (TRANSITIVE - 18)) | (1L << (VAR - 18)) | (1L << (YIELD - 18)) | (1L << (RECORD - 18)) | (1L << (SEALED - 18)) | (1L << (PERMITS - 18)))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1442);
					lambdaLVTIList();
					}
				}

				setState(1445);
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
		enterRule(_localctx, 202, RULE_lambdaBody);
		try {
			setState(1450);
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
				setState(1448);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1449);
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
		enterRule(_localctx, 204, RULE_primary);
		try {
			setState(1470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1452);
				match(LPAREN);
				setState(1453);
				expression(0);
				setState(1454);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1457);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1458);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1459);
				identifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1460);
				typeTypeOrVoid();
				setState(1461);
				match(DOT);
				setState(1462);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1464);
				nonWildcardTypeArguments();
				setState(1468);
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
					setState(1465);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1466);
					match(THIS);
					setState(1467);
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
		enterRule(_localctx, 206, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			match(SWITCH);
			setState(1473);
			parExpression();
			setState(1474);
			match(LBRACE);
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1475);
				switchLabeledRule();
				}
				}
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1481);
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
		enterRule(_localctx, 208, RULE_switchLabeledRule);
		int _la;
		try {
			setState(1494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				match(CASE);
				setState(1487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1484);
					expressionList();
					}
					break;
				case 2:
					{
					setState(1485);
					match(NULL_LITERAL);
					}
					break;
				case 3:
					{
					setState(1486);
					guardedPattern(0);
					}
					break;
				}
				setState(1489);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1490);
				switchRuleOutcome();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491);
				match(DEFAULT);
				setState(1492);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ARROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1493);
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
		int _startState = 210;
		enterRecursionRule(_localctx, 210, RULE_guardedPattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(1497);
				match(LPAREN);
				setState(1498);
				guardedPattern(0);
				setState(1499);
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
				setState(1504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1501);
						variableModifier();
						}
						} 
					}
					setState(1506);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				}
				setState(1507);
				typeType();
				setState(1511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1508);
						annotation();
						}
						} 
					}
					setState(1513);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				setState(1514);
				identifier();
				setState(1519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1515);
						match(AND);
						setState(1516);
						expression(0);
						}
						} 
					}
					setState(1521);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GuardedPatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guardedPattern);
					setState(1524);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1525);
					match(AND);
					setState(1526);
					expression(0);
					}
					} 
				}
				setState(1531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
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
		enterRule(_localctx, 212, RULE_switchRuleOutcome);
		int _la;
		try {
			setState(1539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (ABSTRACT - 1)) | (1L << (ASSERT - 1)) | (1L << (BOOLEAN - 1)) | (1L << (BREAK - 1)) | (1L << (BYTE - 1)) | (1L << (CHAR - 1)) | (1L << (CLASS - 1)) | (1L << (CONTINUE - 1)) | (1L << (DO - 1)) | (1L << (DOUBLE - 1)) | (1L << (FINAL - 1)) | (1L << (FLOAT - 1)) | (1L << (FOR - 1)) | (1L << (IF - 1)) | (1L << (INT - 1)) | (1L << (INTERFACE - 1)) | (1L << (LONG - 1)) | (1L << (NEW - 1)) | (1L << (PRIVATE - 1)) | (1L << (PROTECTED - 1)) | (1L << (PUBLIC - 1)) | (1L << (RETURN - 1)) | (1L << (SHORT - 1)) | (1L << (STATIC - 1)) | (1L << (STRICTFP - 1)) | (1L << (SUPER - 1)) | (1L << (SWITCH - 1)) | (1L << (THIS - 1)) | (1L << (THROW - 1)) | (1L << (TRY - 1)) | (1L << (VOID - 1)) | (1L << (WHILE - 1)) | (1L << (MODULE - 1)) | (1L << (OPEN - 1)) | (1L << (REQUIRES - 1)) | (1L << (EXPORTS - 1)) | (1L << (OPENS - 1)) | (1L << (TO - 1)) | (1L << (USES - 1)) | (1L << (PROVIDES - 1)) | (1L << (WITH - 1)) | (1L << (TRANSITIVE - 1)) | (1L << (VAR - 1)) | (1L << (YIELD - 1)) | (1L << (RECORD - 1)) | (1L << (SEALED - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PERMITS - 65)) | (1L << (NON_SEALED - 65)) | (1L << (DECIMAL_LITERAL - 65)) | (1L << (HEX_LITERAL - 65)) | (1L << (OCT_LITERAL - 65)) | (1L << (BINARY_LITERAL - 65)) | (1L << (FLOAT_LITERAL - 65)) | (1L << (HEX_FLOAT_LITERAL - 65)) | (1L << (BOOL_LITERAL - 65)) | (1L << (CHAR_LITERAL - 65)) | (1L << (STRING_LITERAL - 65)) | (1L << (TEXT_BLOCK - 65)) | (1L << (NULL_LITERAL - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (AT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(1533);
					blockStatement();
					}
					}
					setState(1538);
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
		enterRule(_localctx, 214, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1541);
				classOrInterfaceType();
				setState(1542);
				match(DOT);
				}
				break;
			}
			setState(1549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1546);
					annotation();
					}
					} 
				}
				setState(1551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			setState(1552);
			identifier();
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1553);
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
		enterRule(_localctx, 216, RULE_creator);
		try {
			setState(1565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				nonWildcardTypeArguments();
				setState(1557);
				createdName();
				setState(1558);
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
				setState(1560);
				createdName();
				setState(1563);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1561);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1562);
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
		enterRule(_localctx, 218, RULE_createdName);
		int _la;
		try {
			setState(1582);
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
				setState(1567);
				identifier();
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1568);
					typeArgumentsOrDiamond();
					}
				}

				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1571);
					match(DOT);
					setState(1572);
					identifier();
					setState(1574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1573);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1580);
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
				setState(1581);
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
		enterRule(_localctx, 220, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			identifier();
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1585);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1588);
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
		enterRule(_localctx, 222, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			match(LBRACK);
			setState(1618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1591);
				match(RBRACK);
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1592);
					match(LBRACK);
					setState(1593);
					match(RBRACK);
					}
					}
					setState(1598);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1599);
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
				setState(1600);
				expression(0);
				setState(1601);
				match(RBRACK);
				setState(1608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1602);
						match(LBRACK);
						setState(1603);
						expression(0);
						setState(1604);
						match(RBRACK);
						}
						} 
					}
					setState(1610);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				}
				setState(1615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1611);
						match(LBRACK);
						setState(1612);
						match(RBRACK);
						}
						} 
					}
					setState(1617);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
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
		enterRule(_localctx, 224, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			arguments();
			setState(1622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1621);
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
		enterRule(_localctx, 226, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			nonWildcardTypeArguments();
			setState(1625);
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
		enterRule(_localctx, 228, RULE_typeArgumentsOrDiamond);
		try {
			setState(1630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				match(LT);
				setState(1628);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1629);
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
		enterRule(_localctx, 230, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1632);
				match(LT);
				setState(1633);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1634);
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
		enterRule(_localctx, 232, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(LT);
			setState(1638);
			typeList();
			setState(1639);
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
		enterRule(_localctx, 234, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			typeType();
			setState(1646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1642);
				match(COMMA);
				setState(1643);
				typeType();
				}
				}
				setState(1648);
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
		enterRule(_localctx, 236, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1649);
					annotation();
					}
					} 
				}
				setState(1654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			setState(1657);
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
				setState(1655);
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
				setState(1656);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1662);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (MODULE - 51)) | (1L << (OPEN - 51)) | (1L << (REQUIRES - 51)) | (1L << (EXPORTS - 51)) | (1L << (OPENS - 51)) | (1L << (TO - 51)) | (1L << (USES - 51)) | (1L << (PROVIDES - 51)) | (1L << (WITH - 51)) | (1L << (TRANSITIVE - 51)) | (1L << (VAR - 51)) | (1L << (YIELD - 51)) | (1L << (RECORD - 51)) | (1L << (SEALED - 51)) | (1L << (PERMITS - 51)))) != 0) || _la==AT || _la==IDENTIFIER) {
						{
						{
						setState(1659);
						annotation();
						}
						}
						setState(1664);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1665);
					match(LBRACK);
					setState(1666);
					match(RBRACK);
					}
					} 
				}
				setState(1671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
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
		enterRule(_localctx, 238, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
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
		enterRule(_localctx, 240, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			match(LT);
			setState(1675);
			typeArgument();
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1676);
				match(COMMA);
				setState(1677);
				typeArgument();
				}
				}
				setState(1682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1683);
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
		enterRule(_localctx, 242, RULE_superSuffix);
		int _la;
		try {
			setState(1694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1685);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1686);
				match(DOT);
				setState(1688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1687);
					typeArguments();
					}
				}

				setState(1690);
				identifier();
				setState(1692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1691);
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
		enterRule(_localctx, 244, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1696);
				match(SUPER);
				setState(1697);
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
				setState(1698);
				identifier();
				setState(1699);
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
		enterRule(_localctx, 246, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			match(LPAREN);
			setState(1705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (BOOLEAN - 3)) | (1L << (BYTE - 3)) | (1L << (CHAR - 3)) | (1L << (DOUBLE - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (LONG - 3)) | (1L << (NEW - 3)) | (1L << (SHORT - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (VOID - 3)) | (1L << (MODULE - 3)) | (1L << (OPEN - 3)) | (1L << (REQUIRES - 3)) | (1L << (EXPORTS - 3)) | (1L << (OPENS - 3)) | (1L << (TO - 3)) | (1L << (USES - 3)) | (1L << (PROVIDES - 3)) | (1L << (WITH - 3)) | (1L << (TRANSITIVE - 3)) | (1L << (VAR - 3)) | (1L << (YIELD - 3)) | (1L << (RECORD - 3)) | (1L << (SEALED - 3)) | (1L << (PERMITS - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DECIMAL_LITERAL - 67)) | (1L << (HEX_LITERAL - 67)) | (1L << (OCT_LITERAL - 67)) | (1L << (BINARY_LITERAL - 67)) | (1L << (FLOAT_LITERAL - 67)) | (1L << (HEX_FLOAT_LITERAL - 67)) | (1L << (BOOL_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (TEXT_BLOCK - 67)) | (1L << (NULL_LITERAL - 67)) | (1L << (LPAREN - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(1704);
				expressionList();
				}
			}

			setState(1707);
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
		case 97:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 105:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0082\u06b0\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\3\2\5\2\u00fc\n\2\3\2\7\2\u00ff"+
		"\n\2\f\2\16\2\u0102\13\2\3\2\7\2\u0105\n\2\f\2\16\2\u0108\13\2\3\2\3\2"+
		"\3\2\5\2\u010d\n\2\3\3\7\3\u0110\n\3\f\3\16\3\u0113\13\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\5\4\u011b\n\4\3\4\3\4\3\4\5\4\u0120\n\4\3\4\3\4\3\5\7\5\u0125"+
		"\n\5\f\5\16\5\u0128\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u012f\n\5\3\5\5\5\u0132"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0139\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0145\n\7\3\b\3\b\5\b\u0149\n\b\3\t\3\t\3\t\5\t\u014e\n\t"+
		"\3\t\3\t\5\t\u0152\n\t\3\t\3\t\5\t\u0156\n\t\3\t\3\t\5\t\u015a\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\7\n\u0162\n\n\f\n\16\n\u0165\13\n\3\n\3\n\3\13\7"+
		"\13\u016a\n\13\f\13\16\13\u016d\13\13\3\13\3\13\3\13\7\13\u0172\n\13\f"+
		"\13\16\13\u0175\13\13\3\13\5\13\u0178\n\13\3\f\3\f\3\f\7\f\u017d\n\f\f"+
		"\f\16\f\u0180\13\f\3\r\3\r\3\r\3\r\5\r\u0186\n\r\3\r\3\r\5\r\u018a\n\r"+
		"\3\r\5\r\u018d\n\r\3\r\5\r\u0190\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0197"+
		"\n\16\f\16\16\16\u019a\13\16\3\17\7\17\u019d\n\17\f\17\16\17\u01a0\13"+
		"\17\3\17\3\17\5\17\u01a4\n\17\3\17\5\17\u01a7\n\17\3\20\3\20\7\20\u01ab"+
		"\n\20\f\20\16\20\u01ae\13\20\3\21\3\21\3\21\5\21\u01b3\n\21\3\21\3\21"+
		"\5\21\u01b7\n\21\3\21\3\21\5\21\u01bb\n\21\3\21\3\21\3\22\3\22\7\22\u01c1"+
		"\n\22\f\22\16\22\u01c4\13\22\3\22\3\22\3\23\3\23\7\23\u01ca\n\23\f\23"+
		"\16\23\u01cd\13\23\3\23\3\23\3\24\3\24\5\24\u01d3\n\24\3\24\3\24\7\24"+
		"\u01d7\n\24\f\24\16\24\u01da\13\24\3\24\5\24\u01dd\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01e9\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u01f0\n\26\f\26\16\26\u01f3\13\26\3\26\3\26\5\26\u01f7\n\26"+
		"\3\26\3\26\3\27\3\27\5\27\u01fd\n\27\3\30\3\30\5\30\u0201\n\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u020d\n\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\7\35\u0216\n\35\f\35\16\35\u0219\13\35\3\35"+
		"\3\35\5\35\u021d\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0227"+
		"\n\36\3\37\3\37\3\37\3\37\7\37\u022d\n\37\f\37\16\37\u0230\13\37\3\37"+
		"\3\37\3 \3 \3 \7 \u0237\n \f \16 \u023a\13 \3 \3 \3 \3!\7!\u0240\n!\f"+
		"!\16!\u0243\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u024d\n\"\3#\7#\u0250"+
		"\n#\f#\16#\u0253\13#\3#\3#\3#\3$\7$\u0259\n$\f$\16$\u025c\13$\3$\3$\3"+
		"$\3$\3$\7$\u0263\n$\f$\16$\u0266\13$\3$\3$\5$\u026a\n$\3$\3$\3%\3%\3%"+
		"\7%\u0271\n%\f%\16%\u0274\13%\3&\3&\3&\5&\u0279\n&\3\'\3\'\3\'\7\'\u027e"+
		"\n\'\f\'\16\'\u0281\13\'\3(\3(\5(\u0285\n(\3)\3)\3)\3)\7)\u028b\n)\f)"+
		"\16)\u028e\13)\3)\5)\u0291\n)\5)\u0293\n)\3)\3)\3*\3*\5*\u0299\n*\3*\3"+
		"*\3*\5*\u029e\n*\7*\u02a0\n*\f*\16*\u02a3\13*\3+\3+\7+\u02a7\n+\f+\16"+
		"+\u02aa\13+\3+\3+\3+\5+\u02af\n+\5+\u02b1\n+\3,\3,\3,\7,\u02b6\n,\f,\16"+
		",\u02b9\13,\3-\3-\5-\u02bd\n-\3-\3-\3-\5-\u02c2\n-\3-\5-\u02c5\n-\5-\u02c7"+
		"\n-\3-\3-\3.\3.\3.\3.\7.\u02cf\n.\f.\16.\u02d2\13.\3.\3.\3/\3/\3/\7/\u02d9"+
		"\n/\f/\16/\u02dc\13/\3/\3/\5/\u02e0\n/\3/\5/\u02e3\n/\3\60\7\60\u02e6"+
		"\n\60\f\60\16\60\u02e9\13\60\3\60\3\60\3\60\3\61\7\61\u02ef\n\61\f\61"+
		"\16\61\u02f2\13\61\3\61\3\61\7\61\u02f6\n\61\f\61\16\61\u02f9\13\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\7\62\u0301\n\62\f\62\16\62\u0304\13\62\3"+
		"\63\7\63\u0307\n\63\f\63\16\63\u030a\13\63\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\7\64\u0312\n\64\f\64\16\64\u0315\13\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\5\65\u031e\n\65\3\66\3\66\3\67\3\67\38\38\38\78\u0327\n8\f8\16"+
		"8\u032a\138\38\38\38\39\39\39\59\u0332\n9\39\39\39\59\u0337\n9\39\59\u033a"+
		"\n9\3:\3:\3:\7:\u033f\n:\f:\16:\u0342\13:\3;\3;\3;\3;\3<\3<\3<\5<\u034b"+
		"\n<\3=\3=\3=\3=\7=\u0351\n=\f=\16=\u0354\13=\5=\u0356\n=\3=\5=\u0359\n"+
		"=\3=\3=\3>\3>\3>\3>\3>\3?\3?\7?\u0364\n?\f?\16?\u0367\13?\3?\3?\3@\7@"+
		"\u036c\n@\f@\16@\u036f\13@\3@\3@\5@\u0373\n@\3A\3A\3A\3A\3A\3A\5A\u037b"+
		"\nA\3A\3A\5A\u037f\nA\3A\3A\5A\u0383\nA\3A\3A\5A\u0387\nA\3A\3A\5A\u038b"+
		"\nA\5A\u038d\nA\3B\3B\5B\u0391\nB\3C\3C\3C\3C\5C\u0397\nC\3D\3D\3E\3E"+
		"\3E\3F\5F\u039f\nF\3F\3F\3F\3F\3G\3G\7G\u03a7\nG\fG\16G\u03aa\13G\3G\3"+
		"G\3H\3H\7H\u03b0\nH\fH\16H\u03b3\13H\3H\3H\3H\3H\3H\3H\3H\5H\u03bc\nH"+
		"\3H\3H\3H\3H\3H\3H\5H\u03c4\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H"+
		"\u03d2\nH\3I\3I\3J\3J\3J\5J\u03d9\nJ\3J\3J\3J\5J\u03de\nJ\3J\3J\3K\3K"+
		"\5K\u03e4\nK\3K\3K\3L\3L\3L\7L\u03eb\nL\fL\16L\u03ee\13L\3M\3M\3M\3N\3"+
		"N\7N\u03f5\nN\fN\16N\u03f8\13N\3N\3N\3O\3O\7O\u03fe\nO\fO\16O\u0401\13"+
		"O\3O\3O\3P\3P\3P\3P\3P\5P\u040a\nP\3Q\7Q\u040d\nQ\fQ\16Q\u0410\13Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u041a\nQ\3R\3R\3S\7S\u041f\nS\fS\16S\u0422\13"+
		"S\3S\3S\3S\5S\u0427\nS\3S\5S\u042a\nS\3T\3T\3T\3T\3T\5T\u0431\nT\3T\3"+
		"T\3T\3T\3T\3T\3T\5T\u043a\nT\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\6T\u044f\nT\rT\16T\u0450\3T\5T\u0454\nT\3T\5T\u0457\n"+
		"T\3T\3T\3T\3T\7T\u045d\nT\fT\16T\u0460\13T\3T\5T\u0463\nT\3T\3T\3T\3T"+
		"\7T\u0469\nT\fT\16T\u046c\13T\3T\7T\u046f\nT\fT\16T\u0472\13T\3T\3T\3"+
		"T\3T\5T\u0478\nT\3T\3T\3T\3T\3T\3T\3T\5T\u0481\nT\3T\3T\3T\5T\u0486\n"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0491\nT\3U\3U\3U\7U\u0496\nU\fU\16U\u0499"+
		"\13U\3U\3U\3U\3U\3U\3V\3V\3V\7V\u04a3\nV\fV\16V\u04a6\13V\3W\3W\3W\3X"+
		"\3X\3X\5X\u04ae\nX\3X\3X\3Y\3Y\3Y\7Y\u04b5\nY\fY\16Y\u04b8\13Y\3Z\7Z\u04bb"+
		"\nZ\fZ\16Z\u04be\13Z\3Z\3Z\3Z\3Z\3Z\5Z\u04c5\nZ\3Z\3Z\3Z\3Z\5Z\u04cb\n"+
		"Z\3[\6[\u04ce\n[\r[\16[\u04cf\3[\6[\u04d3\n[\r[\16[\u04d4\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\5\\\u04dd\n\\\3\\\3\\\3\\\5\\\u04e2\n\\\3]\3]\5]\u04e6\n"+
		"]\3]\3]\5]\u04ea\n]\3]\3]\5]\u04ee\n]\5]\u04f0\n]\3^\3^\5^\u04f4\n^\3"+
		"_\7_\u04f7\n_\f_\16_\u04fa\13_\3_\3_\5_\u04fe\n_\3_\3_\3_\3_\3`\3`\3`"+
		"\3`\3a\3a\3a\7a\u050b\na\fa\16a\u050e\13a\3b\3b\3b\5b\u0513\nb\3b\3b\3"+
		"b\3b\3b\5b\u051a\nb\3b\3b\3b\3b\5b\u0520\nb\3b\5b\u0523\nb\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\5c\u052e\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\5c\u053e\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0566\n"+
		"c\3c\3c\3c\3c\5c\u056c\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0579\n"+
		"c\7c\u057b\nc\fc\16c\u057e\13c\3d\7d\u0581\nd\fd\16d\u0584\13d\3d\3d\7"+
		"d\u0588\nd\fd\16d\u058b\13d\3d\3d\3e\3e\3e\3e\3f\3f\3f\5f\u0596\nf\3f"+
		"\3f\3f\3f\3f\7f\u059d\nf\ff\16f\u05a0\13f\3f\3f\3f\3f\5f\u05a6\nf\3f\5"+
		"f\u05a9\nf\3g\3g\5g\u05ad\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\5h\u05bf\nh\5h\u05c1\nh\3i\3i\3i\3i\7i\u05c7\ni\fi\16i\u05ca\13"+
		"i\3i\3i\3j\3j\3j\3j\5j\u05d2\nj\3j\3j\3j\3j\3j\5j\u05d9\nj\3k\3k\3k\3"+
		"k\3k\3k\7k\u05e1\nk\fk\16k\u05e4\13k\3k\3k\7k\u05e8\nk\fk\16k\u05eb\13"+
		"k\3k\3k\3k\7k\u05f0\nk\fk\16k\u05f3\13k\5k\u05f5\nk\3k\3k\3k\7k\u05fa"+
		"\nk\fk\16k\u05fd\13k\3l\3l\7l\u0601\nl\fl\16l\u0604\13l\5l\u0606\nl\3"+
		"m\3m\3m\5m\u060b\nm\3m\7m\u060e\nm\fm\16m\u0611\13m\3m\3m\5m\u0615\nm"+
		"\3n\3n\3n\3n\3n\3n\3n\5n\u061e\nn\5n\u0620\nn\3o\3o\5o\u0624\no\3o\3o"+
		"\3o\5o\u0629\no\7o\u062b\no\fo\16o\u062e\13o\3o\5o\u0631\no\3p\3p\5p\u0635"+
		"\np\3p\3p\3q\3q\3q\3q\7q\u063d\nq\fq\16q\u0640\13q\3q\3q\3q\3q\3q\3q\3"+
		"q\7q\u0649\nq\fq\16q\u064c\13q\3q\3q\7q\u0650\nq\fq\16q\u0653\13q\5q\u0655"+
		"\nq\3r\3r\5r\u0659\nr\3s\3s\3s\3t\3t\3t\5t\u0661\nt\3u\3u\3u\5u\u0666"+
		"\nu\3v\3v\3v\3v\3w\3w\3w\7w\u066f\nw\fw\16w\u0672\13w\3x\7x\u0675\nx\f"+
		"x\16x\u0678\13x\3x\3x\5x\u067c\nx\3x\7x\u067f\nx\fx\16x\u0682\13x\3x\3"+
		"x\7x\u0686\nx\fx\16x\u0689\13x\3y\3y\3z\3z\3z\3z\7z\u0691\nz\fz\16z\u0694"+
		"\13z\3z\3z\3{\3{\3{\5{\u069b\n{\3{\3{\5{\u069f\n{\5{\u06a1\n{\3|\3|\3"+
		"|\3|\3|\5|\u06a8\n|\3}\3}\5}\u06ac\n}\3}\3}\3}\2\4\u00c4\u00d4~\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\2\21\4\2\23\23**\3\2EH\3\2IJ\4\2((>>\4"+
		"\2\65C\u0082\u0082\3\2fi\3\2\\]\4\2jkoo\3\2hi\4\2Z[ab\4\2``cc\4\2YYpz"+
		"\3\2fg\4\2__{{\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'\'\2\u0768\2\u010c"+
		"\3\2\2\2\4\u0111\3\2\2\2\6\u0118\3\2\2\2\b\u0131\3\2\2\2\n\u0138\3\2\2"+
		"\2\f\u0144\3\2\2\2\16\u0148\3\2\2\2\20\u014a\3\2\2\2\22\u015d\3\2\2\2"+
		"\24\u016b\3\2\2\2\26\u0179\3\2\2\2\30\u0181\3\2\2\2\32\u0193\3\2\2\2\34"+
		"\u019e\3\2\2\2\36\u01a8\3\2\2\2 \u01af\3\2\2\2\"\u01be\3\2\2\2$\u01c7"+
		"\3\2\2\2&\u01dc\3\2\2\2(\u01e8\3\2\2\2*\u01ea\3\2\2\2,\u01fc\3\2\2\2."+
		"\u0200\3\2\2\2\60\u0202\3\2\2\2\62\u0205\3\2\2\2\64\u0208\3\2\2\2\66\u0210"+
		"\3\2\2\28\u021c\3\2\2\2:\u0226\3\2\2\2<\u0228\3\2\2\2>\u0233\3\2\2\2@"+
		"\u0241\3\2\2\2B\u024c\3\2\2\2D\u0251\3\2\2\2F\u025a\3\2\2\2H\u026d\3\2"+
		"\2\2J\u0275\3\2\2\2L\u027a\3\2\2\2N\u0284\3\2\2\2P\u0286\3\2\2\2R\u0296"+
		"\3\2\2\2T\u02b0\3\2\2\2V\u02b2\3\2\2\2X\u02ba\3\2\2\2Z\u02ca\3\2\2\2\\"+
		"\u02e2\3\2\2\2^\u02e7\3\2\2\2`\u02f0\3\2\2\2b\u02fd\3\2\2\2d\u0308\3\2"+
		"\2\2f\u030e\3\2\2\2h\u031d\3\2\2\2j\u031f\3\2\2\2l\u0321\3\2\2\2n\u0328"+
		"\3\2\2\2p\u0331\3\2\2\2r\u033b\3\2\2\2t\u0343\3\2\2\2v\u034a\3\2\2\2x"+
		"\u034c\3\2\2\2z\u035c\3\2\2\2|\u0361\3\2\2\2~\u0372\3\2\2\2\u0080\u038c"+
		"\3\2\2\2\u0082\u0390\3\2\2\2\u0084\u0392\3\2\2\2\u0086\u0398\3\2\2\2\u0088"+
		"\u039a\3\2\2\2\u008a\u039e\3\2\2\2\u008c\u03a4\3\2\2\2\u008e\u03d1\3\2"+
		"\2\2\u0090\u03d3\3\2\2\2\u0092\u03d5\3\2\2\2\u0094\u03e1\3\2\2\2\u0096"+
		"\u03e7\3\2\2\2\u0098\u03ef\3\2\2\2\u009a\u03f2\3\2\2\2\u009c\u03fb\3\2"+
		"\2\2\u009e\u0409\3\2\2\2\u00a0\u040e\3\2\2\2\u00a2\u041b\3\2\2\2\u00a4"+
		"\u0429\3\2\2\2\u00a6\u0490\3\2\2\2\u00a8\u0492\3\2\2\2\u00aa\u049f\3\2"+
		"\2\2\u00ac\u04a7\3\2\2\2\u00ae\u04aa\3\2\2\2\u00b0\u04b1\3\2\2\2\u00b2"+
		"\u04ca\3\2\2\2\u00b4\u04cd\3\2\2\2\u00b6\u04e1\3\2\2\2\u00b8\u04ef\3\2"+
		"\2\2\u00ba\u04f3\3\2\2\2\u00bc\u04f8\3\2\2\2\u00be\u0503\3\2\2\2\u00c0"+
		"\u0507\3\2\2\2\u00c2\u0522\3\2\2\2\u00c4\u052d\3\2\2\2\u00c6\u0582\3\2"+
		"\2\2\u00c8\u058e\3\2\2\2\u00ca\u05a8\3\2\2\2\u00cc\u05ac\3\2\2\2\u00ce"+
		"\u05c0\3\2\2\2\u00d0\u05c2\3\2\2\2\u00d2\u05d8\3\2\2\2\u00d4\u05f4\3\2"+
		"\2\2\u00d6\u0605\3\2\2\2\u00d8\u060a\3\2\2\2\u00da\u061f\3\2\2\2\u00dc"+
		"\u0630\3\2\2\2\u00de\u0632\3\2\2\2\u00e0\u0638\3\2\2\2\u00e2\u0656\3\2"+
		"\2\2\u00e4\u065a\3\2\2\2\u00e6\u0660\3\2\2\2\u00e8\u0665\3\2\2\2\u00ea"+
		"\u0667\3\2\2\2\u00ec\u066b\3\2\2\2\u00ee\u0676\3\2\2\2\u00f0\u068a\3\2"+
		"\2\2\u00f2\u068c\3\2\2\2\u00f4\u06a0\3\2\2\2\u00f6\u06a7\3\2\2\2\u00f8"+
		"\u06a9\3\2\2\2\u00fa\u00fc\5\4\3\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u0100\3\2\2\2\u00fd\u00ff\5\6\4\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0106\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\u0105\5\b\5\2\u0104\u0103\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010d\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0109\u010a\5\u008aF\2\u010a\u010b\7\2\2\3\u010b"+
		"\u010d\3\2\2\2\u010c\u00fb\3\2\2\2\u010c\u0109\3\2\2\2\u010d\3\3\2\2\2"+
		"\u010e\u0110\5p9\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0115\7\"\2\2\u0115\u0116\5f\64\2\u0116\u0117\7V\2\2\u0117\5\3\2\2\2"+
		"\u0118\u011a\7\33\2\2\u0119\u011b\7(\2\2\u011a\u0119\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\5f\64\2\u011d\u011e\7X\2\2\u011e"+
		"\u0120\7j\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\7V\2\2\u0122\7\3\2\2\2\u0123\u0125\5\f\7\2\u0124\u0123"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u012e\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012f\5\20\t\2\u012a\u012f\5"+
		"\30\r\2\u012b\u012f\5 \21\2\u012c\u012f\5z>\2\u012d\u012f\5\u0092J\2\u012e"+
		"\u0129\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0132\7V\2\2\u0131"+
		"\u0126\3\2\2\2\u0131\u0130\3\2\2\2\u0132\t\3\2\2\2\u0133\u0139\5\f\7\2"+
		"\u0134\u0139\7 \2\2\u0135\u0139\7,\2\2\u0136\u0139\7\60\2\2\u0137\u0139"+
		"\7\63\2\2\u0138\u0133\3\2\2\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2"+
		"\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\13\3\2\2\2\u013a\u0145"+
		"\5p9\2\u013b\u0145\7%\2\2\u013c\u0145\7$\2\2\u013d\u0145\7#\2\2\u013e"+
		"\u0145\7(\2\2\u013f\u0145\7\3\2\2\u0140\u0145\7\24\2\2\u0141\u0145\7)"+
		"\2\2\u0142\u0145\7B\2\2\u0143\u0145\7D\2\2\u0144\u013a\3\2\2\2\u0144\u013b"+
		"\3\2\2\2\u0144\u013c\3\2\2\2\u0144\u013d\3\2\2\2\u0144\u013e\3\2\2\2\u0144"+
		"\u013f\3\2\2\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0143\3\2\2\2\u0145\r\3\2\2\2\u0146\u0149\7\24\2\2\u0147\u0149"+
		"\5p9\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\17\3\2\2\2\u014a"+
		"\u014b\7\13\2\2\u014b\u014d\5\u00a2R\2\u014c\u014e\5\22\n\2\u014d\u014c"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\7\23\2\2"+
		"\u0150\u0152\5\u00eex\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0154\7\32\2\2\u0154\u0156\5\u00ecw\2\u0155\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0158\7C\2\2\u0158"+
		"\u015a\5\u00ecw\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\5\"\22\2\u015c\21\3\2\2\2\u015d\u015e\7[\2\2\u015e"+
		"\u0163\5\24\13\2\u015f\u0160\7W\2\2\u0160\u0162\5\24\13\2\u0161\u015f"+
		"\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7Z\2\2\u0167\23\3\2\2\2"+
		"\u0168\u016a\5p9\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0177\5\u00a2R\2\u016f\u0173\7\23\2\2\u0170\u0172\5p9\2\u0171\u0170\3"+
		"\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\5\26\f\2\u0177\u016f\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\25\3\2\2\2\u0179\u017e\5\u00eex\2\u017a"+
		"\u017b\7l\2\2\u017b\u017d\5\u00eex\2\u017c\u017a\3\2\2\2\u017d\u0180\3"+
		"\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\27\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0182\7\22\2\2\u0182\u0185\5\u00a2R\2\u0183\u0184"+
		"\7\32\2\2\u0184\u0186\5\u00ecw\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2"+
		"\2\u0186\u0187\3\2\2\2\u0187\u0189\7R\2\2\u0188\u018a\5\32\16\2\u0189"+
		"\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u018d\7W"+
		"\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0190\5\36\20\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3"+
		"\2\2\2\u0191\u0192\7S\2\2\u0192\31\3\2\2\2\u0193\u0198\5\34\17\2\u0194"+
		"\u0195\7W\2\2\u0195\u0197\5\34\17\2\u0196\u0194\3\2\2\2\u0197\u019a\3"+
		"\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\33\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019d\5p9\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2"+
		"\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a1\u01a3\5\u00a2R\2\u01a2\u01a4\5\u00f8}\2\u01a3\u01a2\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\5\"\22\2\u01a6"+
		"\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\35\3\2\2\2\u01a8\u01ac\7V\2\2"+
		"\u01a9\u01ab\5&\24\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\37\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af"+
		"\u01b0\7\36\2\2\u01b0\u01b2\5\u00a2R\2\u01b1\u01b3\5\22\n\2\u01b2\u01b1"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b5\7\23\2\2"+
		"\u01b5\u01b7\5\u00ecw\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01ba\3\2\2\2\u01b8\u01b9\7C\2\2\u01b9\u01bb\5\u00ecw\2\u01ba\u01b8\3"+
		"\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\5$\23\2\u01bd"+
		"!\3\2\2\2\u01be\u01c2\7R\2\2\u01bf\u01c1\5&\24\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7S\2\2\u01c6#\3\2\2\2\u01c7\u01cb"+
		"\7R\2\2\u01c8\u01ca\58\35\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01ce\u01cf\7S\2\2\u01cf%\3\2\2\2\u01d0\u01dd\7V\2\2\u01d1\u01d3"+
		"\7(\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01dd\5\u009cO\2\u01d5\u01d7\5\n\6\2\u01d6\u01d5\3\2\2\2\u01d7\u01da"+
		"\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01db\u01dd\5(\25\2\u01dc\u01d0\3\2\2\2\u01dc\u01d2\3\2"+
		"\2\2\u01dc\u01d8\3\2\2\2\u01dd\'\3\2\2\2\u01de\u01e9\5*\26\2\u01df\u01e9"+
		"\5\60\31\2\u01e0\u01e9\5\66\34\2\u01e1\u01e9\5\64\33\2\u01e2\u01e9\5\62"+
		"\32\2\u01e3\u01e9\5 \21\2\u01e4\u01e9\5z>\2\u01e5\u01e9\5\20\t\2\u01e6"+
		"\u01e9\5\30\r\2\u01e7\u01e9\5\u0092J\2\u01e8\u01de\3\2\2\2\u01e8\u01df"+
		"\3\2\2\2\u01e8\u01e0\3\2\2\2\u01e8\u01e1\3\2\2\2\u01e8\u01e2\3\2\2\2\u01e8"+
		"\u01e3\3\2\2\2\u01e8\u01e4\3\2\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e7\3\2\2\2\u01e9)\3\2\2\2\u01ea\u01eb\5.\30\2\u01eb\u01ec"+
		"\5\u00a2R\2\u01ec\u01f1\5X-\2\u01ed\u01ee\7T\2\2\u01ee\u01f0\7U\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f6\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\7/\2\2\u01f5"+
		"\u01f7\5V,\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2"+
		"\2\u01f8\u01f9\5,\27\2\u01f9+\3\2\2\2\u01fa\u01fd\5\u009cO\2\u01fb\u01fd"+
		"\7V\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd-\3\2\2\2\u01fe\u0201"+
		"\5\u00eex\2\u01ff\u0201\7\62\2\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2"+
		"\2\u0201/\3\2\2\2\u0202\u0203\5\22\n\2\u0203\u0204\5*\26\2\u0204\61\3"+
		"\2\2\2\u0205\u0206\5\22\n\2\u0206\u0207\5\64\33\2\u0207\63\3\2\2\2\u0208"+
		"\u0209\5\u00a2R\2\u0209\u020c\5X-\2\u020a\u020b\7/\2\2\u020b\u020d\5V"+
		",\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\5\u009cO\2\u020f\65\3\2\2\2\u0210\u0211\5\u00eex\2\u0211\u0212"+
		"\5H%\2\u0212\u0213\7V\2\2\u0213\67\3\2\2\2\u0214\u0216\5\n\6\2\u0215\u0214"+
		"\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021d\5:\36\2\u021b\u021d\7V"+
		"\2\2\u021c\u0217\3\2\2\2\u021c\u021b\3\2\2\2\u021d9\3\2\2\2\u021e\u0227"+
		"\5<\37\2\u021f\u0227\5@!\2\u0220\u0227\5D#\2\u0221\u0227\5 \21\2\u0222"+
		"\u0227\5z>\2\u0223\u0227\5\20\t\2\u0224\u0227\5\30\r\2\u0225\u0227\5\u0092"+
		"J\2\u0226\u021e\3\2\2\2\u0226\u021f\3\2\2\2\u0226\u0220\3\2\2\2\u0226"+
		"\u0221\3\2\2\2\u0226\u0222\3\2\2\2\u0226\u0223\3\2\2\2\u0226\u0224\3\2"+
		"\2\2\u0226\u0225\3\2\2\2\u0227;\3\2\2\2\u0228\u0229\5\u00eex\2\u0229\u022e"+
		"\5> \2\u022a\u022b\7W\2\2\u022b\u022d\5> \2\u022c\u022a\3\2\2\2\u022d"+
		"\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2"+
		"\2\2\u0230\u022e\3\2\2\2\u0231\u0232\7V\2\2\u0232=\3\2\2\2\u0233\u0238"+
		"\5\u00a2R\2\u0234\u0235\7T\2\2\u0235\u0237\7U\2\2\u0236\u0234\3\2\2\2"+
		"\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b"+
		"\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023c\7Y\2\2\u023c\u023d\5N(\2\u023d"+
		"?\3\2\2\2\u023e\u0240\5B\"\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0244\u0245\5F$\2\u0245A\3\2\2\2\u0246\u024d\5p9\2\u0247\u024d\7"+
		"%\2\2\u0248\u024d\7\3\2\2\u0249\u024d\7\16\2\2\u024a\u024d\7(\2\2\u024b"+
		"\u024d\7)\2\2\u024c\u0246\3\2\2\2\u024c\u0247\3\2\2\2\u024c\u0248\3\2"+
		"\2\2\u024c\u0249\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024d"+
		"C\3\2\2\2\u024e\u0250\5B\"\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0254\u0255\5\22\n\2\u0255\u0256\5F$\2\u0256E\3\2\2\2\u0257\u0259"+
		"\5p9\2\u0258\u0257\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e\5."+
		"\30\2\u025e\u025f\5\u00a2R\2\u025f\u0264\5X-\2\u0260\u0261\7T\2\2\u0261"+
		"\u0263\7U\2\2\u0262\u0260\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265\u0269\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"\u0268\7/\2\2\u0268\u026a\5V,\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2"+
		"\2\u026a\u026b\3\2\2\2\u026b\u026c\5,\27\2\u026cG\3\2\2\2\u026d\u0272"+
		"\5J&\2\u026e\u026f\7W\2\2\u026f\u0271\5J&\2\u0270\u026e\3\2\2\2\u0271"+
		"\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273I\3\2\2\2"+
		"\u0274\u0272\3\2\2\2\u0275\u0278\5L\'\2\u0276\u0277\7Y\2\2\u0277\u0279"+
		"\5N(\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279K\3\2\2\2\u027a\u027f"+
		"\5\u00a2R\2\u027b\u027c\7T\2\2\u027c\u027e\7U\2\2\u027d\u027b\3\2\2\2"+
		"\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280M\3"+
		"\2\2\2\u0281\u027f\3\2\2\2\u0282\u0285\5P)\2\u0283\u0285\5\u00c4c\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285O\3\2\2\2\u0286\u0292\7R\2\2\u0287"+
		"\u028c\5N(\2\u0288\u0289\7W\2\2\u0289\u028b\5N(\2\u028a\u0288\3\2\2\2"+
		"\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0290"+
		"\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0291\7W\2\2\u0290\u028f\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u0287\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293\u0294\3\2\2\2\u0294\u0295\7S\2\2\u0295Q\3\2\2\2\u0296\u0298"+
		"\5\u00a2R\2\u0297\u0299\5\u00f2z\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2"+
		"\2\2\u0299\u02a1\3\2\2\2\u029a\u029b\7X\2\2\u029b\u029d\5\u00a2R\2\u029c"+
		"\u029e\5\u00f2z\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0"+
		"\3\2\2\2\u029f\u029a\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2S\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02b1\5\u00ee"+
		"x\2\u02a5\u02a7\5p9\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab"+
		"\u02ae\7^\2\2\u02ac\u02ad\t\2\2\2\u02ad\u02af\5\u00eex\2\u02ae\u02ac\3"+
		"\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02a4\3\2\2\2\u02b0"+
		"\u02a8\3\2\2\2\u02b1U\3\2\2\2\u02b2\u02b7\5f\64\2\u02b3\u02b4\7W\2\2\u02b4"+
		"\u02b6\5f\64\2\u02b5\u02b3\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2"+
		"\2\2\u02b7\u02b8\3\2\2\2\u02b8W\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02c6"+
		"\7P\2\2\u02bb\u02bd\5Z.\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02c7\3\2\2\2\u02be\u02c1\5Z.\2\u02bf\u02c0\7W\2\2\u02c0\u02c2\5\\/\2"+
		"\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c7\3\2\2\2\u02c3\u02c5"+
		"\5\\/\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6"+
		"\u02bc\3\2\2\2\u02c6\u02be\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02c9\7Q\2\2\u02c9Y\3\2\2\2\u02ca\u02d0\5\u00eex\2\u02cb\u02cc"+
		"\5\u00a2R\2\u02cc\u02cd\7X\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02cb\3\2\2\2"+
		"\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3"+
		"\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d4\7-\2\2\u02d4[\3\2\2\2\u02d5\u02da"+
		"\5^\60\2\u02d6\u02d7\7W\2\2\u02d7\u02d9\5^\60\2\u02d8\u02d6\3\2\2\2\u02d9"+
		"\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02df\3\2"+
		"\2\2\u02dc\u02da\3\2\2\2\u02dd\u02de\7W\2\2\u02de\u02e0\5`\61\2\u02df"+
		"\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02e3\5`"+
		"\61\2\u02e2\u02d5\3\2\2\2\u02e2\u02e1\3\2\2\2\u02e3]\3\2\2\2\u02e4\u02e6"+
		"\5\16\b\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2"+
		"\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02eb"+
		"\5\u00eex\2\u02eb\u02ec\5L\'\2\u02ec_\3\2\2\2\u02ed\u02ef\5\16\b\2\u02ee"+
		"\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2"+
		"\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f7\5\u00eex\2\u02f4"+
		"\u02f6\5p9\2\u02f5\u02f4\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2"+
		"\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fb"+
		"\7~\2\2\u02fb\u02fc\5L\'\2\u02fca\3\2\2\2\u02fd\u0302\5d\63\2\u02fe\u02ff"+
		"\7W\2\2\u02ff\u0301\5d\63\2\u0300\u02fe\3\2\2\2\u0301\u0304\3\2\2\2\u0302"+
		"\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303c\3\2\2\2\u0304\u0302\3\2\2\2"+
		"\u0305\u0307\5\16\b\2\u0306\u0305\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0308\3\2\2\2\u030b"+
		"\u030c\7?\2\2\u030c\u030d\5\u00a2R\2\u030de\3\2\2\2\u030e\u0313\5\u00a2"+
		"R\2\u030f\u0310\7X\2\2\u0310\u0312\5\u00a2R\2\u0311\u030f\3\2\2\2\u0312"+
		"\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314g\3\2\2\2"+
		"\u0315\u0313\3\2\2\2\u0316\u031e\5j\66\2\u0317\u031e\5l\67\2\u0318\u031e"+
		"\7L\2\2\u0319\u031e\7M\2\2\u031a\u031e\7K\2\2\u031b\u031e\7O\2\2\u031c"+
		"\u031e\7N\2\2\u031d\u0316\3\2\2\2\u031d\u0317\3\2\2\2\u031d\u0318\3\2"+
		"\2\2\u031d\u0319\3\2\2\2\u031d\u031a\3\2\2\2\u031d\u031b\3\2\2\2\u031d"+
		"\u031c\3\2\2\2\u031ei\3\2\2\2\u031f\u0320\t\3\2\2\u0320k\3\2\2\2\u0321"+
		"\u0322\t\4\2\2\u0322m\3\2\2\2\u0323\u0324\5\u00a2R\2\u0324\u0325\7X\2"+
		"\2\u0325\u0327\3\2\2\2\u0326\u0323\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326"+
		"\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\3\2\2\2\u032a\u0328\3\2\2\2\u032b"+
		"\u032c\7}\2\2\u032c\u032d\5\u00a2R\2\u032do\3\2\2\2\u032e\u032f\7}\2\2"+
		"\u032f\u0332\5f\64\2\u0330\u0332\5n8\2\u0331\u032e\3\2\2\2\u0331\u0330"+
		"\3\2\2\2\u0332\u0339\3\2\2\2\u0333\u0336\7P\2\2\u0334\u0337\5r:\2\u0335"+
		"\u0337\5v<\2\u0336\u0334\3\2\2\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2"+
		"\2\u0337\u0338\3\2\2\2\u0338\u033a\7Q\2\2\u0339\u0333\3\2\2\2\u0339\u033a"+
		"\3\2\2\2\u033aq\3\2\2\2\u033b\u0340\5t;\2\u033c\u033d\7W\2\2\u033d\u033f"+
		"\5t;\2\u033e\u033c\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340"+
		"\u0341\3\2\2\2\u0341s\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0344\5\u00a2"+
		"R\2\u0344\u0345\7Y\2\2\u0345\u0346\5v<\2\u0346u\3\2\2\2\u0347\u034b\5"+
		"\u00c4c\2\u0348\u034b\5p9\2\u0349\u034b\5x=\2\u034a\u0347\3\2\2\2\u034a"+
		"\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034bw\3\2\2\2\u034c\u0355\7R\2\2\u034d"+
		"\u0352\5v<\2\u034e\u034f\7W\2\2\u034f\u0351\5v<\2\u0350\u034e\3\2\2\2"+
		"\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0356"+
		"\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u034d\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0358\3\2\2\2\u0357\u0359\7W\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2"+
		"\2\2\u0359\u035a\3\2\2\2\u035a\u035b\7S\2\2\u035by\3\2\2\2\u035c\u035d"+
		"\7}\2\2\u035d\u035e\7\36\2\2\u035e\u035f\5\u00a2R\2\u035f\u0360\5|?\2"+
		"\u0360{\3\2\2\2\u0361\u0365\7R\2\2\u0362\u0364\5~@\2\u0363\u0362\3\2\2"+
		"\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368"+
		"\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u0369\7S\2\2\u0369}\3\2\2\2\u036a\u036c"+
		"\5\n\6\2\u036b\u036a\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d"+
		"\u036e\3\2\2\2\u036e\u0370\3\2\2\2\u036f\u036d\3\2\2\2\u0370\u0373\5\u0080"+
		"A\2\u0371\u0373\7V\2\2\u0372\u036d\3\2\2\2\u0372\u0371\3\2\2\2\u0373\177"+
		"\3\2\2\2\u0374\u0375\5\u00eex\2\u0375\u0376\5\u0082B\2\u0376\u0377\7V"+
		"\2\2\u0377\u038d\3\2\2\2\u0378\u037a\5\20\t\2\u0379\u037b\7V\2\2\u037a"+
		"\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u038d\3\2\2\2\u037c\u037e\5 "+
		"\21\2\u037d\u037f\7V\2\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f"+
		"\u038d\3\2\2\2\u0380\u0382\5\30\r\2\u0381\u0383\7V\2\2\u0382\u0381\3\2"+
		"\2\2\u0382\u0383\3\2\2\2\u0383\u038d\3\2\2\2\u0384\u0386\5z>\2\u0385\u0387"+
		"\7V\2\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u038d\3\2\2\2\u0388"+
		"\u038a\5\u0092J\2\u0389\u038b\7V\2\2\u038a\u0389\3\2\2\2\u038a\u038b\3"+
		"\2\2\2\u038b\u038d\3\2\2\2\u038c\u0374\3\2\2\2\u038c\u0378\3\2\2\2\u038c"+
		"\u037c\3\2\2\2\u038c\u0380\3\2\2\2\u038c\u0384\3\2\2\2\u038c\u0388\3\2"+
		"\2\2\u038d\u0081\3\2\2\2\u038e\u0391\5\u0084C\2\u038f\u0391\5\u0086D\2"+
		"\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391\u0083\3\2\2\2\u0392\u0393"+
		"\5\u00a2R\2\u0393\u0394\7P\2\2\u0394\u0396\7Q\2\2\u0395\u0397\5\u0088"+
		"E\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0085\3\2\2\2\u0398"+
		"\u0399\5H%\2\u0399\u0087\3\2\2\2\u039a\u039b\7\16\2\2\u039b\u039c\5v<"+
		"\2\u039c\u0089\3\2\2\2\u039d\u039f\7\66\2\2\u039e\u039d\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\7\65\2\2\u03a1\u03a2\5"+
		"f\64\2\u03a2\u03a3\5\u008cG\2\u03a3\u008b\3\2\2\2\u03a4\u03a8\7R\2\2\u03a5"+
		"\u03a7\5\u008eH\2\u03a6\u03a5\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a6"+
		"\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03a8\3\2\2\2\u03ab"+
		"\u03ac\7S\2\2\u03ac\u008d\3\2\2\2\u03ad\u03b1\7\67\2\2\u03ae\u03b0\5\u0090"+
		"I\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u03b4\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b5\5f"+
		"\64\2\u03b5\u03b6\7V\2\2\u03b6\u03d2\3\2\2\2\u03b7\u03b8\78\2\2\u03b8"+
		"\u03bb\5f\64\2\u03b9\u03ba\7:\2\2\u03ba\u03bc\5f\64\2\u03bb\u03b9\3\2"+
		"\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\7V\2\2\u03be"+
		"\u03d2\3\2\2\2\u03bf\u03c0\79\2\2\u03c0\u03c3\5f\64\2\u03c1\u03c2\7:\2"+
		"\2\u03c2\u03c4\5f\64\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5"+
		"\3\2\2\2\u03c5\u03c6\7V\2\2\u03c6\u03d2\3\2\2\2\u03c7\u03c8\7;\2\2\u03c8"+
		"\u03c9\5f\64\2\u03c9\u03ca\7V\2\2\u03ca\u03d2\3\2\2\2\u03cb\u03cc\7<\2"+
		"\2\u03cc\u03cd\5f\64\2\u03cd\u03ce\7=\2\2\u03ce\u03cf\5f\64\2\u03cf\u03d0"+
		"\7V\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03ad\3\2\2\2\u03d1\u03b7\3\2\2\2\u03d1"+
		"\u03bf\3\2\2\2\u03d1\u03c7\3\2\2\2\u03d1\u03cb\3\2\2\2\u03d2\u008f\3\2"+
		"\2\2\u03d3\u03d4\t\5\2\2\u03d4\u0091\3\2\2\2\u03d5\u03d6\7A\2\2\u03d6"+
		"\u03d8\5\u00a2R\2\u03d7\u03d9\5\22\n\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9"+
		"\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dd\5\u0094K\2\u03db\u03dc\7\32\2"+
		"\2\u03dc\u03de\5\u00ecw\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03e0\5\u009aN\2\u03e0\u0093\3\2\2\2\u03e1\u03e3"+
		"\7P\2\2\u03e2\u03e4\5\u0096L\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2"+
		"\u03e4\u03e5\3\2\2\2\u03e5\u03e6\7Q\2\2\u03e6\u0095\3\2\2\2\u03e7\u03ec"+
		"\5\u0098M\2\u03e8\u03e9\7W\2\2\u03e9\u03eb\5\u0098M\2\u03ea\u03e8\3\2"+
		"\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u0097\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f0\5\u00eex\2\u03f0\u03f1"+
		"\5\u00a2R\2\u03f1\u0099\3\2\2\2\u03f2\u03f6\7R\2\2\u03f3\u03f5\5&\24\2"+
		"\u03f4\u03f3\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7"+
		"\3\2\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fa\7S\2\2\u03fa"+
		"\u009b\3\2\2\2\u03fb\u03ff\7R\2\2\u03fc\u03fe\5\u009eP\2\u03fd\u03fc\3"+
		"\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400"+
		"\u0402\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u0403\7S\2\2\u0403\u009d\3\2"+
		"\2\2\u0404\u0405\5\u00a0Q\2\u0405\u0406\7V\2\2\u0406\u040a\3\2\2\2\u0407"+
		"\u040a\5\u00a6T\2\u0408\u040a\5\u00a4S\2\u0409\u0404\3\2\2\2\u0409\u0407"+
		"\3\2\2\2\u0409\u0408\3\2\2\2\u040a\u009f\3\2\2\2\u040b\u040d\5\16\b\2"+
		"\u040c\u040b\3\2\2\2\u040d\u0410\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f"+
		"\3\2\2\2\u040f\u0419\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u0412\5\u00eex"+
		"\2\u0412\u0413\5H%\2\u0413\u041a\3\2\2\2\u0414\u0415\7?\2\2\u0415\u0416"+
		"\5\u00a2R\2\u0416\u0417\7Y\2\2\u0417\u0418\5\u00c4c\2\u0418\u041a\3\2"+
		"\2\2\u0419\u0411\3\2\2\2\u0419\u0414\3\2\2\2\u041a\u00a1\3\2\2\2\u041b"+
		"\u041c\t\6\2\2\u041c\u00a3\3\2\2\2\u041d\u041f\5\f\7\2\u041e\u041d\3\2"+
		"\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421"+
		"\u0426\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u0427\5\20\t\2\u0424\u0427\5"+
		" \21\2\u0425\u0427\5\u0092J\2\u0426\u0423\3\2\2\2\u0426\u0424\3\2\2\2"+
		"\u0426\u0425\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u042a\7V\2\2\u0429\u0420"+
		"\3\2\2\2\u0429\u0428\3\2\2\2\u042a\u00a5\3\2\2\2\u042b\u0491\5\u009cO"+
		"\2\u042c\u042d\7\4\2\2\u042d\u0430\5\u00c4c\2\u042e\u042f\7_\2\2\u042f"+
		"\u0431\5\u00c4c\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432"+
		"\3\2\2\2\u0432\u0433\7V\2\2\u0433\u0491\3\2\2\2\u0434\u0435\7\30\2\2\u0435"+
		"\u0436\5\u00be`\2\u0436\u0439\5\u00a6T\2\u0437\u0438\7\21\2\2\u0438\u043a"+
		"\5\u00a6T\2\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u0491\3\2\2"+
		"\2\u043b\u043c\7\27\2\2\u043c\u043d\7P\2\2\u043d\u043e\5\u00b8]\2\u043e"+
		"\u043f\7Q\2\2\u043f\u0440\5\u00a6T\2\u0440\u0491\3\2\2\2\u0441\u0442\7"+
		"\64\2\2\u0442\u0443\5\u00be`\2\u0443\u0444\5\u00a6T\2\u0444\u0491\3\2"+
		"\2\2\u0445\u0446\7\17\2\2\u0446\u0447\5\u00a6T\2\u0447\u0448\7\64\2\2"+
		"\u0448\u0449\5\u00be`\2\u0449\u044a\7V\2\2\u044a\u0491\3\2\2\2\u044b\u044c"+
		"\7\61\2\2\u044c\u0456\5\u009cO\2\u044d\u044f\5\u00a8U\2\u044e\u044d\3"+
		"\2\2\2\u044f\u0450\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451"+
		"\u0453\3\2\2\2\u0452\u0454\5\u00acW\2\u0453\u0452\3\2\2\2\u0453\u0454"+
		"\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0457\5\u00acW\2\u0456\u044e\3\2\2"+
		"\2\u0456\u0455\3\2\2\2\u0457\u0491\3\2\2\2\u0458\u0459\7\61\2\2\u0459"+
		"\u045a\5\u00aeX\2\u045a\u045e\5\u009cO\2\u045b\u045d\5\u00a8U\2\u045c"+
		"\u045b\3\2\2\2\u045d\u0460\3\2\2\2\u045e\u045c\3\2\2\2\u045e\u045f\3\2"+
		"\2\2\u045f\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0461\u0463\5\u00acW\2\u0462"+
		"\u0461\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0491\3\2\2\2\u0464\u0465\7+"+
		"\2\2\u0465\u0466\5\u00be`\2\u0466\u046a\7R\2\2\u0467\u0469\5\u00b4[\2"+
		"\u0468\u0467\3\2\2\2\u0469\u046c\3\2\2\2\u046a\u0468\3\2\2\2\u046a\u046b"+
		"\3\2\2\2\u046b\u0470\3\2\2\2\u046c\u046a\3\2\2\2\u046d\u046f\5\u00b6\\"+
		"\2\u046e\u046d\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u0471"+
		"\3\2\2\2\u0471\u0473\3\2\2\2\u0472\u0470\3\2\2\2\u0473\u0474\7S\2\2\u0474"+
		"\u0491\3\2\2\2\u0475\u0477\7&\2\2\u0476\u0478\5\u00c4c\2\u0477\u0476\3"+
		"\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u0491\7V\2\2\u047a"+
		"\u047b\7.\2\2\u047b\u047c\5\u00c4c\2\u047c\u047d\7V\2\2\u047d\u0491\3"+
		"\2\2\2\u047e\u0480\7\6\2\2\u047f\u0481\5\u00a2R\2\u0480\u047f\3\2\2\2"+
		"\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0491\7V\2\2\u0483\u0485"+
		"\7\r\2\2\u0484\u0486\5\u00a2R\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2"+
		"\2\u0486\u0487\3\2\2\2\u0487\u0491\7V\2\2\u0488\u0491\7V\2\2\u0489\u048a"+
		"\5\u00c4c\2\u048a\u048b\7V\2\2\u048b\u0491\3\2\2\2\u048c\u048d\5\u00a2"+
		"R\2\u048d\u048e\7_\2\2\u048e\u048f\5\u00a6T\2\u048f\u0491\3\2\2\2\u0490"+
		"\u042b\3\2\2\2\u0490\u042c\3\2\2\2\u0490\u0434\3\2\2\2\u0490\u043b\3\2"+
		"\2\2\u0490\u0441\3\2\2\2\u0490\u0445\3\2\2\2\u0490\u044b\3\2\2\2\u0490"+
		"\u0458\3\2\2\2\u0490\u0464\3\2\2\2\u0490\u0475\3\2\2\2\u0490\u047a\3\2"+
		"\2\2\u0490\u047e\3\2\2\2\u0490\u0483\3\2\2\2\u0490\u0488\3\2\2\2\u0490"+
		"\u0489\3\2\2\2\u0490\u048c\3\2\2\2\u0491\u00a7\3\2\2\2\u0492\u0493\7\t"+
		"\2\2\u0493\u0497\7P\2\2\u0494\u0496\5\16\b\2\u0495\u0494\3\2\2\2\u0496"+
		"\u0499\3\2\2\2\u0497\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049a\3\2"+
		"\2\2\u0499\u0497\3\2\2\2\u049a\u049b\5\u00aaV\2\u049b\u049c\5\u00a2R\2"+
		"\u049c\u049d\7Q\2\2\u049d\u049e\5\u009cO\2\u049e\u00a9\3\2\2\2\u049f\u04a4"+
		"\5f\64\2\u04a0\u04a1\7m\2\2\u04a1\u04a3\5f\64\2\u04a2\u04a0\3\2\2\2\u04a3"+
		"\u04a6\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u00ab\3\2"+
		"\2\2\u04a6\u04a4\3\2\2\2\u04a7\u04a8\7\25\2\2\u04a8\u04a9\5\u009cO\2\u04a9"+
		"\u00ad\3\2\2\2\u04aa\u04ab\7P\2\2\u04ab\u04ad\5\u00b0Y\2\u04ac\u04ae\7"+
		"V\2\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04af\3\2\2\2\u04af"+
		"\u04b0\7Q\2\2\u04b0\u00af\3\2\2\2\u04b1\u04b6\5\u00b2Z\2\u04b2\u04b3\7"+
		"V\2\2\u04b3\u04b5\5\u00b2Z\2\u04b4\u04b2\3\2\2\2\u04b5\u04b8\3\2\2\2\u04b6"+
		"\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u00b1\3\2\2\2\u04b8\u04b6\3\2"+
		"\2\2\u04b9\u04bb\5\16\b\2\u04ba\u04b9\3\2\2\2\u04bb\u04be\3\2\2\2\u04bc"+
		"\u04ba\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04c4\3\2\2\2\u04be\u04bc\3\2"+
		"\2\2\u04bf\u04c0\5R*\2\u04c0\u04c1\5L\'\2\u04c1\u04c5\3\2\2\2\u04c2\u04c3"+
		"\7?\2\2\u04c3\u04c5\5\u00a2R\2\u04c4\u04bf\3\2\2\2\u04c4\u04c2\3\2\2\2"+
		"\u04c5\u04c6\3\2\2\2\u04c6\u04c7\7Y\2\2\u04c7\u04c8\5\u00c4c\2\u04c8\u04cb"+
		"\3\2\2\2\u04c9\u04cb\5\u00a2R\2\u04ca\u04bc\3\2\2\2\u04ca\u04c9\3\2\2"+
		"\2\u04cb\u00b3\3\2\2\2\u04cc\u04ce\5\u00b6\\\2\u04cd\u04cc\3\2\2\2\u04ce"+
		"\u04cf\3\2\2\2\u04cf\u04cd\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d2\3\2"+
		"\2\2\u04d1\u04d3\5\u009eP\2\u04d2\u04d1\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4"+
		"\u04d2\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u00b5\3\2\2\2\u04d6\u04dc\7\b"+
		"\2\2\u04d7\u04dd\5\u00c4c\2\u04d8\u04dd\7\u0082\2\2\u04d9\u04da\5\u00ee"+
		"x\2\u04da\u04db\5\u00a2R\2\u04db\u04dd\3\2\2\2\u04dc\u04d7\3\2\2\2\u04dc"+
		"\u04d8\3\2\2\2\u04dc\u04d9\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e2\7_"+
		"\2\2\u04df\u04e0\7\16\2\2\u04e0\u04e2\7_\2\2\u04e1\u04d6\3\2\2\2\u04e1"+
		"\u04df\3\2\2\2\u04e2\u00b7\3\2\2\2\u04e3\u04f0\5\u00bc_\2\u04e4\u04e6"+
		"\5\u00ba^\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2"+
		"\2\u04e7\u04e9\7V\2\2\u04e8\u04ea\5\u00c4c\2\u04e9\u04e8\3\2\2\2\u04e9"+
		"\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ed\7V\2\2\u04ec\u04ee\5\u00c0"+
		"a\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f0\3\2\2\2\u04ef"+
		"\u04e3\3\2\2\2\u04ef\u04e5\3\2\2\2\u04f0\u00b9\3\2\2\2\u04f1\u04f4\5\u00a0"+
		"Q\2\u04f2\u04f4\5\u00c0a\2\u04f3\u04f1\3\2\2\2\u04f3\u04f2\3\2\2\2\u04f4"+
		"\u00bb\3\2\2\2\u04f5\u04f7\5\16\b\2\u04f6\u04f5\3\2\2\2\u04f7\u04fa\3"+
		"\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fd\3\2\2\2\u04fa"+
		"\u04f8\3\2\2\2\u04fb\u04fe\5\u00eex\2\u04fc\u04fe\7?\2\2\u04fd\u04fb\3"+
		"\2\2\2\u04fd\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\5L\'\2\u0500"+
		"\u0501\7_\2\2\u0501\u0502\5\u00c4c\2\u0502\u00bd\3\2\2\2\u0503\u0504\7"+
		"P\2\2\u0504\u0505\5\u00c4c\2\u0505\u0506\7Q\2\2\u0506\u00bf\3\2\2\2\u0507"+
		"\u050c\5\u00c4c\2\u0508\u0509\7W\2\2\u0509\u050b\5\u00c4c\2\u050a\u0508"+
		"\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"\u00c1\3\2\2\2\u050e\u050c\3\2\2\2\u050f\u0510\5\u00a2R\2\u0510\u0512"+
		"\7P\2\2\u0511\u0513\5\u00c0a\2\u0512\u0511\3\2\2\2\u0512\u0513\3\2\2\2"+
		"\u0513\u0514\3\2\2\2\u0514\u0515\7Q\2\2\u0515\u0523\3\2\2\2\u0516\u0517"+
		"\7-\2\2\u0517\u0519\7P\2\2\u0518\u051a\5\u00c0a\2\u0519\u0518\3\2\2\2"+
		"\u0519\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u0523\7Q\2\2\u051c\u051d"+
		"\7*\2\2\u051d\u051f\7P\2\2\u051e\u0520\5\u00c0a\2\u051f\u051e\3\2\2\2"+
		"\u051f\u0520\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0523\7Q\2\2\u0522\u050f"+
		"\3\2\2\2\u0522\u0516\3\2\2\2\u0522\u051c\3\2\2\2\u0523\u00c3\3\2\2\2\u0524"+
		"\u0525\bc\1\2\u0525\u052e\5\u00ceh\2\u0526\u052e\5\u00c2b\2\u0527\u0528"+
		"\7!\2\2\u0528\u052e\5\u00dan\2\u0529\u052a\t\7\2\2\u052a\u052e\5\u00c4"+
		"c\21\u052b\u052c\t\b\2\2\u052c\u052e\5\u00c4c\20\u052d\u0524\3\2\2\2\u052d"+
		"\u0526\3\2\2\2\u052d\u0527\3\2\2\2\u052d\u0529\3\2\2\2\u052d\u052b\3\2"+
		"\2\2\u052e\u057c\3\2\2\2\u052f\u0530\f\17\2\2\u0530\u0531\t\t\2\2\u0531"+
		"\u057b\5\u00c4c\20\u0532\u0533\f\16\2\2\u0533\u0534\t\n\2\2\u0534\u057b"+
		"\5\u00c4c\17\u0535\u053d\f\r\2\2\u0536\u0537\7[\2\2\u0537\u053e\7[\2\2"+
		"\u0538\u0539\7Z\2\2\u0539\u053a\7Z\2\2\u053a\u053e\7Z\2\2\u053b\u053c"+
		"\7Z\2\2\u053c\u053e\7Z\2\2\u053d\u0536\3\2\2\2\u053d\u0538\3\2\2\2\u053d"+
		"\u053b\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u057b\5\u00c4c\16\u0540\u0541"+
		"\f\f\2\2\u0541\u0542\t\13\2\2\u0542\u057b\5\u00c4c\r\u0543\u0544\f\n\2"+
		"\2\u0544\u0545\t\f\2\2\u0545\u057b\5\u00c4c\13\u0546\u0547\f\t\2\2\u0547"+
		"\u0548\7l\2\2\u0548\u057b\5\u00c4c\n\u0549\u054a\f\b\2\2\u054a\u054b\7"+
		"n\2\2\u054b\u057b\5\u00c4c\t\u054c\u054d\f\7\2\2\u054d\u054e\7m\2\2\u054e"+
		"\u057b\5\u00c4c\b\u054f\u0550\f\6\2\2\u0550\u0551\7d\2\2\u0551\u057b\5"+
		"\u00c4c\7\u0552\u0553\f\5\2\2\u0553\u0554\7e\2\2\u0554\u057b\5\u00c4c"+
		"\6\u0555\u0556\f\4\2\2\u0556\u0557\7^\2\2\u0557\u0558\5\u00c4c\2\u0558"+
		"\u0559\7_\2\2\u0559\u055a\5\u00c4c\4\u055a\u057b\3\2\2\2\u055b\u055c\f"+
		"\3\2\2\u055c\u055d\t\r\2\2\u055d\u057b\5\u00c4c\3\u055e\u055f\f\26\2\2"+
		"\u055f\u056b\7X\2\2\u0560\u056c\5\u00a2R\2\u0561\u056c\5\u00c2b\2\u0562"+
		"\u056c\7-\2\2\u0563\u0565\7!\2\2\u0564\u0566\5\u00eav\2\u0565\u0564\3"+
		"\2\2\2\u0565\u0566\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u056c\5\u00dep\2"+
		"\u0568\u0569\7*\2\2\u0569\u056c\5\u00f4{\2\u056a\u056c\5\u00e4s\2\u056b"+
		"\u0560\3\2\2\2\u056b\u0561\3\2\2\2\u056b\u0562\3\2\2\2\u056b\u0563\3\2"+
		"\2\2\u056b\u0568\3\2\2\2\u056b\u056a\3\2\2\2\u056c\u057b\3\2\2\2\u056d"+
		"\u056e\f\25\2\2\u056e\u056f\7T\2\2\u056f\u0570\5\u00c4c\2\u0570\u0571"+
		"\7U\2\2\u0571\u057b\3\2\2\2\u0572\u0573\f\22\2\2\u0573\u057b\t\16\2\2"+
		"\u0574\u0575\f\13\2\2\u0575\u0578\7\34\2\2\u0576\u0579\5\u00eex\2\u0577"+
		"\u0579\5\u00c6d\2\u0578\u0576\3\2\2\2\u0578\u0577\3\2\2\2\u0579\u057b"+
		"\3\2\2\2\u057a\u052f\3\2\2\2\u057a\u0532\3\2\2\2\u057a\u0535\3\2\2\2\u057a"+
		"\u0540\3\2\2\2\u057a\u0543\3\2\2\2\u057a\u0546\3\2\2\2\u057a\u0549\3\2"+
		"\2\2\u057a\u054c\3\2\2\2\u057a\u054f\3\2\2\2\u057a\u0552\3\2\2\2\u057a"+
		"\u0555\3\2\2\2\u057a\u055b\3\2\2\2\u057a\u055e\3\2\2\2\u057a\u056d\3\2"+
		"\2\2\u057a\u0572\3\2\2\2\u057a\u0574\3\2\2\2\u057b\u057e\3\2\2\2\u057c"+
		"\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u00c5\3\2\2\2\u057e\u057c\3\2"+
		"\2\2\u057f\u0581\5\16\b\2\u0580\u057f\3\2\2\2\u0581\u0584\3\2\2\2\u0582"+
		"\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u0582\3\2"+
		"\2\2\u0585\u0589\5\u00eex\2\u0586\u0588\5p9\2\u0587\u0586\3\2\2\2\u0588"+
		"\u058b\3\2\2\2\u0589\u0587\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058c\3\2"+
		"\2\2\u058b\u0589\3\2\2\2\u058c\u058d\5\u00a2R\2\u058d\u00c7\3\2\2\2\u058e"+
		"\u058f\5\u00caf\2\u058f\u0590\7{\2\2\u0590\u0591\5\u00ccg\2\u0591\u00c9"+
		"\3\2\2\2\u0592\u05a9\5\u00a2R\2\u0593\u0595\7P\2\2\u0594\u0596\5\\/\2"+
		"\u0595\u0594\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u05a9"+
		"\7Q\2\2\u0598\u0599\7P\2\2\u0599\u059e\5\u00a2R\2\u059a\u059b\7W\2\2\u059b"+
		"\u059d\5\u00a2R\2\u059c\u059a\3\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059c"+
		"\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a1\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1"+
		"\u05a2\7Q\2\2\u05a2\u05a9\3\2\2\2\u05a3\u05a5\7P\2\2\u05a4\u05a6\5b\62"+
		"\2\u05a5\u05a4\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a9"+
		"\7Q\2\2\u05a8\u0592\3\2\2\2\u05a8\u0593\3\2\2\2\u05a8\u0598\3\2\2\2\u05a8"+
		"\u05a3\3\2\2\2\u05a9\u00cb\3\2\2\2\u05aa\u05ad\5\u00c4c\2\u05ab\u05ad"+
		"\5\u009cO\2\u05ac\u05aa\3\2\2\2\u05ac\u05ab\3\2\2\2\u05ad\u00cd\3\2\2"+
		"\2\u05ae\u05af\7P\2\2\u05af\u05b0\5\u00c4c\2\u05b0\u05b1\7Q\2\2\u05b1"+
		"\u05c1\3\2\2\2\u05b2\u05c1\7-\2\2\u05b3\u05c1\7*\2\2\u05b4\u05c1\5h\65"+
		"\2\u05b5\u05c1\5\u00a2R\2\u05b6\u05b7\5.\30\2\u05b7\u05b8\7X\2\2\u05b8"+
		"\u05b9\7\13\2\2\u05b9\u05c1\3\2\2\2\u05ba\u05be\5\u00eav\2\u05bb\u05bf"+
		"\5\u00f6|\2\u05bc\u05bd\7-\2\2\u05bd\u05bf\5\u00f8}\2\u05be\u05bb\3\2"+
		"\2\2\u05be\u05bc\3\2\2\2\u05bf\u05c1\3\2\2\2\u05c0\u05ae\3\2\2\2\u05c0"+
		"\u05b2\3\2\2\2\u05c0\u05b3\3\2\2\2\u05c0\u05b4\3\2\2\2\u05c0\u05b5\3\2"+
		"\2\2\u05c0\u05b6\3\2\2\2\u05c0\u05ba\3\2\2\2\u05c1\u00cf\3\2\2\2\u05c2"+
		"\u05c3\7+\2\2\u05c3\u05c4\5\u00be`\2\u05c4\u05c8\7R\2\2\u05c5\u05c7\5"+
		"\u00d2j\2\u05c6\u05c5\3\2\2\2\u05c7\u05ca\3\2\2\2\u05c8\u05c6\3\2\2\2"+
		"\u05c8\u05c9\3\2\2\2\u05c9\u05cb\3\2\2\2\u05ca\u05c8\3\2\2\2\u05cb\u05cc"+
		"\7S\2\2\u05cc\u00d1\3\2\2\2\u05cd\u05d1\7\b\2\2\u05ce\u05d2\5\u00c0a\2"+
		"\u05cf\u05d2\7O\2\2\u05d0\u05d2\5\u00d4k\2\u05d1\u05ce\3\2\2\2\u05d1\u05cf"+
		"\3\2\2\2\u05d1\u05d0\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\t\17\2\2"+
		"\u05d4\u05d9\5\u00d6l\2\u05d5\u05d6\7\16\2\2\u05d6\u05d7\t\17\2\2\u05d7"+
		"\u05d9\5\u00d6l\2\u05d8\u05cd\3\2\2\2\u05d8\u05d5\3\2\2\2\u05d9\u00d3"+
		"\3\2\2\2\u05da\u05db\bk\1\2\u05db\u05dc\7P\2\2\u05dc\u05dd\5\u00d4k\2"+
		"\u05dd\u05de\7Q\2\2\u05de\u05f5\3\2\2\2\u05df\u05e1\5\16\b\2\u05e0\u05df"+
		"\3\2\2\2\u05e1\u05e4\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3"+
		"\u05e5\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e5\u05e9\5\u00eex\2\u05e6\u05e8"+
		"\5p9\2\u05e7\u05e6\3\2\2\2\u05e8\u05eb\3\2\2\2\u05e9\u05e7\3\2\2\2\u05e9"+
		"\u05ea\3\2\2\2\u05ea\u05ec\3\2\2\2\u05eb\u05e9\3\2\2\2\u05ec\u05f1\5\u00a2"+
		"R\2\u05ed\u05ee\7d\2\2\u05ee\u05f0\5\u00c4c\2\u05ef\u05ed\3\2\2\2\u05f0"+
		"\u05f3\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f5\3\2"+
		"\2\2\u05f3\u05f1\3\2\2\2\u05f4\u05da\3\2\2\2\u05f4\u05e2\3\2\2\2\u05f5"+
		"\u05fb\3\2\2\2\u05f6\u05f7\f\3\2\2\u05f7\u05f8\7d\2\2\u05f8\u05fa\5\u00c4"+
		"c\2\u05f9\u05f6\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb"+
		"\u05fc\3\2\2\2\u05fc\u00d5\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u0606\5\u009c"+
		"O\2\u05ff\u0601\5\u009eP\2\u0600\u05ff\3\2\2\2\u0601\u0604\3\2\2\2\u0602"+
		"\u0600\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0606\3\2\2\2\u0604\u0602\3\2"+
		"\2\2\u0605\u05fe\3\2\2\2\u0605\u0602\3\2\2\2\u0606\u00d7\3\2\2\2\u0607"+
		"\u0608\5R*\2\u0608\u0609\7X\2\2\u0609\u060b\3\2\2\2\u060a\u0607\3\2\2"+
		"\2\u060a\u060b\3\2\2\2\u060b\u060f\3\2\2\2\u060c\u060e\5p9\2\u060d\u060c"+
		"\3\2\2\2\u060e\u0611\3\2\2\2\u060f\u060d\3\2\2\2\u060f\u0610\3\2\2\2\u0610"+
		"\u0612\3\2\2\2\u0611\u060f\3\2\2\2\u0612\u0614\5\u00a2R\2\u0613\u0615"+
		"\5\u00f2z\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u00d9\3\2\2"+
		"\2\u0616\u0617\5\u00eav\2\u0617\u0618\5\u00dco\2\u0618\u0619\5\u00e2r"+
		"\2\u0619\u0620\3\2\2\2\u061a\u061d\5\u00dco\2\u061b\u061e\5\u00e0q\2\u061c"+
		"\u061e\5\u00e2r\2\u061d\u061b\3\2\2\2\u061d\u061c\3\2\2\2\u061e\u0620"+
		"\3\2\2\2\u061f\u0616\3\2\2\2\u061f\u061a\3\2\2\2\u0620\u00db\3\2\2\2\u0621"+
		"\u0623\5\u00a2R\2\u0622\u0624\5\u00e6t\2\u0623\u0622\3\2\2\2\u0623\u0624"+
		"\3\2\2\2\u0624\u062c\3\2\2\2\u0625\u0626\7X\2\2\u0626\u0628\5\u00a2R\2"+
		"\u0627\u0629\5\u00e6t\2\u0628\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629"+
		"\u062b\3\2\2\2\u062a\u0625\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a\3\2"+
		"\2\2\u062c\u062d\3\2\2\2\u062d\u0631\3\2\2\2\u062e\u062c\3\2\2\2\u062f"+
		"\u0631\5\u00f0y\2\u0630\u0621\3\2\2\2\u0630\u062f\3\2\2\2\u0631\u00dd"+
		"\3\2\2\2\u0632\u0634\5\u00a2R\2\u0633\u0635\5\u00e8u\2\u0634\u0633\3\2"+
		"\2\2\u0634\u0635\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0637\5\u00e2r\2\u0637"+
		"\u00df\3\2\2\2\u0638\u0654\7T\2\2\u0639\u063e\7U\2\2\u063a\u063b\7T\2"+
		"\2\u063b\u063d\7U\2\2\u063c\u063a\3\2\2\2\u063d\u0640\3\2\2\2\u063e\u063c"+
		"\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0641\3\2\2\2\u0640\u063e\3\2\2\2\u0641"+
		"\u0655\5P)\2\u0642\u0643\5\u00c4c\2\u0643\u064a\7U\2\2\u0644\u0645\7T"+
		"\2\2\u0645\u0646\5\u00c4c\2\u0646\u0647\7U\2\2\u0647\u0649\3\2\2\2\u0648"+
		"\u0644\3\2\2\2\u0649\u064c\3\2\2\2\u064a\u0648\3\2\2\2\u064a\u064b\3\2"+
		"\2\2\u064b\u0651\3\2\2\2\u064c\u064a\3\2\2\2\u064d\u064e\7T\2\2\u064e"+
		"\u0650\7U\2\2\u064f\u064d\3\2\2\2\u0650\u0653\3\2\2\2\u0651\u064f\3\2"+
		"\2\2\u0651\u0652\3\2\2\2\u0652\u0655\3\2\2\2\u0653\u0651\3\2\2\2\u0654"+
		"\u0639\3\2\2\2\u0654\u0642\3\2\2\2\u0655\u00e1\3\2\2\2\u0656\u0658\5\u00f8"+
		"}\2\u0657\u0659\5\"\22\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659"+
		"\u00e3\3\2\2\2\u065a\u065b\5\u00eav\2\u065b\u065c\5\u00f6|\2\u065c\u00e5"+
		"\3\2\2\2\u065d\u065e\7[\2\2\u065e\u0661\7Z\2\2\u065f\u0661\5\u00f2z\2"+
		"\u0660\u065d\3\2\2\2\u0660\u065f\3\2\2\2\u0661\u00e7\3\2\2\2\u0662\u0663"+
		"\7[\2\2\u0663\u0666\7Z\2\2\u0664\u0666\5\u00eav\2\u0665\u0662\3\2\2\2"+
		"\u0665\u0664\3\2\2\2\u0666\u00e9\3\2\2\2\u0667\u0668\7[\2\2\u0668\u0669"+
		"\5\u00ecw\2\u0669\u066a\7Z\2\2\u066a\u00eb\3\2\2\2\u066b\u0670\5\u00ee"+
		"x\2\u066c\u066d\7W\2\2\u066d\u066f\5\u00eex\2\u066e\u066c\3\2\2\2\u066f"+
		"\u0672\3\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u00ed\3\2"+
		"\2\2\u0672\u0670\3\2\2\2\u0673\u0675\5p9\2\u0674\u0673\3\2\2\2\u0675\u0678"+
		"\3\2\2\2\u0676\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u067b\3\2\2\2\u0678"+
		"\u0676\3\2\2\2\u0679\u067c\5R*\2\u067a\u067c\5\u00f0y\2\u067b\u0679\3"+
		"\2\2\2\u067b\u067a\3\2\2\2\u067c\u0687\3\2\2\2\u067d\u067f\5p9\2\u067e"+
		"\u067d\3\2\2\2\u067f\u0682\3\2\2\2\u0680\u067e\3\2\2\2\u0680\u0681\3\2"+
		"\2\2\u0681\u0683\3\2\2\2\u0682\u0680\3\2\2\2\u0683\u0684\7T\2\2\u0684"+
		"\u0686\7U\2\2\u0685\u0680\3\2\2\2\u0686\u0689\3\2\2\2\u0687\u0685\3\2"+
		"\2\2\u0687\u0688\3\2\2\2\u0688\u00ef\3\2\2\2\u0689\u0687\3\2\2\2\u068a"+
		"\u068b\t\20\2\2\u068b\u00f1\3\2\2\2\u068c\u068d\7[\2\2\u068d\u0692\5T"+
		"+\2\u068e\u068f\7W\2\2\u068f\u0691\5T+\2\u0690\u068e\3\2\2\2\u0691\u0694"+
		"\3\2\2\2\u0692\u0690\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0695\3\2\2\2\u0694"+
		"\u0692\3\2\2\2\u0695\u0696\7Z\2\2\u0696\u00f3\3\2\2\2\u0697\u06a1\5\u00f8"+
		"}\2\u0698\u069a\7X\2\2\u0699\u069b\5\u00f2z\2\u069a\u0699\3\2\2\2\u069a"+
		"\u069b\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069e\5\u00a2R\2\u069d\u069f"+
		"\5\u00f8}\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a1\3\2\2"+
		"\2\u06a0\u0697\3\2\2\2\u06a0\u0698\3\2\2\2\u06a1\u00f5\3\2\2\2\u06a2\u06a3"+
		"\7*\2\2\u06a3\u06a8\5\u00f4{\2\u06a4\u06a5\5\u00a2R\2\u06a5\u06a6\5\u00f8"+
		"}\2\u06a6\u06a8\3\2\2\2\u06a7\u06a2\3\2\2\2\u06a7\u06a4\3\2\2\2\u06a8"+
		"\u00f7\3\2\2\2\u06a9\u06ab\7P\2\2\u06aa\u06ac\5\u00c0a\2\u06ab\u06aa\3"+
		"\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ae\7Q\2\2\u06ae"+
		"\u00f9\3\2\2\2\u00d7\u00fb\u0100\u0106\u010c\u0111\u011a\u011f\u0126\u012e"+
		"\u0131\u0138\u0144\u0148\u014d\u0151\u0155\u0159\u0163\u016b\u0173\u0177"+
		"\u017e\u0185\u0189\u018c\u018f\u0198\u019e\u01a3\u01a6\u01ac\u01b2\u01b6"+
		"\u01ba\u01c2\u01cb\u01d2\u01d8\u01dc\u01e8\u01f1\u01f6\u01fc\u0200\u020c"+
		"\u0217\u021c\u0226\u022e\u0238\u0241\u024c\u0251\u025a\u0264\u0269\u0272"+
		"\u0278\u027f\u0284\u028c\u0290\u0292\u0298\u029d\u02a1\u02a8\u02ae\u02b0"+
		"\u02b7\u02bc\u02c1\u02c4\u02c6\u02d0\u02da\u02df\u02e2\u02e7\u02f0\u02f7"+
		"\u0302\u0308\u0313\u031d\u0328\u0331\u0336\u0339\u0340\u034a\u0352\u0355"+
		"\u0358\u0365\u036d\u0372\u037a\u037e\u0382\u0386\u038a\u038c\u0390\u0396"+
		"\u039e\u03a8\u03b1\u03bb\u03c3\u03d1\u03d8\u03dd\u03e3\u03ec\u03f6\u03ff"+
		"\u0409\u040e\u0419\u0420\u0426\u0429\u0430\u0439\u0450\u0453\u0456\u045e"+
		"\u0462\u046a\u0470\u0477\u0480\u0485\u0490\u0497\u04a4\u04ad\u04b6\u04bc"+
		"\u04c4\u04ca\u04cf\u04d4\u04dc\u04e1\u04e5\u04e9\u04ed\u04ef\u04f3\u04f8"+
		"\u04fd\u050c\u0512\u0519\u051f\u0522\u052d\u053d\u0565\u056b\u0578\u057a"+
		"\u057c\u0582\u0589\u0595\u059e\u05a5\u05a8\u05ac\u05be\u05c0\u05c8\u05d1"+
		"\u05d8\u05e2\u05e9\u05f1\u05f4\u05fb\u0602\u0605\u060a\u060f\u0614\u061d"+
		"\u061f\u0623\u0628\u062c\u0630\u0634\u063e\u064a\u0651\u0654\u0658\u0660"+
		"\u0665\u0670\u0676\u067b\u0680\u0687\u0692\u069a\u069e\u06a0\u06a7\u06ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}