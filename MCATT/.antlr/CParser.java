// Generated from c:\Users\8yvic\source\repos\MCATT\MCATT\C.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, DECIMAL_LITERAL=58, 
		HEX_LITERAL=59, OCT_LITERAL=60, BINARY_LITERAL=61, FLOAT_LITERAL=62, HEX_FLOAT_LITERAL=63, 
		BOOL_LITERAL=64, CHAR_LITERAL=65, STRING_LITERAL=66, IDENTIFIER=67;
	public static final int
		RULE_prog = 0, RULE_init = 1, RULE_declaration = 2, RULE_primitiveDecl = 3, 
		RULE_memberDecl = 4, RULE_structDecl = 5, RULE_type = 6, RULE_funcCall = 7, 
		RULE_primitiveTypes = 8, RULE_arithType = 9, RULE_arithTypeNOINT = 10, 
		RULE_signedorunsigned = 11, RULE_declarators = 12, RULE_declarator = 13, 
		RULE_declId = 14, RULE_arrBracket = 15, RULE_pointer = 16, RULE_expression = 17, 
		RULE_initializer = 18, RULE_arrayInit = 19, RULE_statement = 20, RULE_exprpar = 21, 
		RULE_primary = 22, RULE_identifier = 23, RULE_literal = 24, RULE_integerLiteral = 25, 
		RULE_floatLiteral = 26, RULE_expressionList = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "init", "declaration", "primitiveDecl", "memberDecl", "structDecl", 
			"type", "funcCall", "primitiveTypes", "arithType", "arithTypeNOINT", 
			"signedorunsigned", "declarators", "declarator", "declId", "arrBracket", 
			"pointer", "expression", "initializer", "arrayInit", "statement", "exprpar", 
			"primary", "identifier", "literal", "integerLiteral", "floatLiteral", 
			"expressionList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'struct'", "'{'", "'}'", "'('", "')'", "'char'", "'short'", 
			"'int'", "'long'", "'float'", "'double'", "'signed'", "'unsgined'", "','", 
			"'='", "'['", "']'", "'*'", "'.'", "'new'", "'++'", "'--'", "'+'", "'-'", 
			"'~'", "'!'", "'&'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'^'", "'|'", "'&&'", "'||'", "'?'", "':'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'>>='", "'<<='", "'%='", "'if'", "'else'", 
			"'while'", "'do'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "IDENTIFIER"
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
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				init();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || _la==IDENTIFIER );
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

	public static class InitContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_init);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				declaration();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclPrimitiveContext extends DeclarationContext {
		public PrimitiveDeclContext primitiveDecl() {
			return getRuleContext(PrimitiveDeclContext.class,0);
		}
		public DeclPrimitiveContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class DeclStructContext extends DeclarationContext {
		public StructDeclContext structDecl() {
			return getRuleContext(StructDeclContext.class,0);
		}
		public DeclStructContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case IDENTIFIER:
				_localctx = new DeclPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				primitiveDecl();
				}
				break;
			case T__1:
				_localctx = new DeclStructContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				structDecl();
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

	public static class PrimitiveDeclContext extends ParserRuleContext {
		public PrimitiveDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDecl; }
	 
		public PrimitiveDeclContext() { }
		public void copyFrom(PrimitiveDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclPrimitiveVarContext extends PrimitiveDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclaratorsContext declarators() {
			return getRuleContext(DeclaratorsContext.class,0);
		}
		public DeclPrimitiveVarContext(PrimitiveDeclContext ctx) { copyFrom(ctx); }
	}
	public static class DeclReferenceContext extends PrimitiveDeclContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclaratorsContext declarators() {
			return getRuleContext(DeclaratorsContext.class,0);
		}
		public DeclReferenceContext(PrimitiveDeclContext ctx) { copyFrom(ctx); }
	}

	public final PrimitiveDeclContext primitiveDecl() throws RecognitionException {
		PrimitiveDeclContext _localctx = new PrimitiveDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitiveDecl);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
				_localctx = new DeclPrimitiveVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				type();
				setState(70);
				declarators();
				setState(71);
				match(T__0);
				}
				break;
			case IDENTIFIER:
				_localctx = new DeclReferenceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				identifier();
				setState(74);
				declarators();
				setState(75);
				match(T__0);
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

	public static class MemberDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_memberDecl);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				type();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(80);
					pointer();
					}
				}

				setState(83);
				identifier();
				setState(84);
				match(T__0);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				identifier();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(87);
					pointer();
					}
				}

				setState(90);
				identifier();
				setState(91);
				match(T__0);
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

	public static class StructDeclContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<MemberDeclContext> memberDecl() {
			return getRuleContexts(MemberDeclContext.class);
		}
		public MemberDeclContext memberDecl(int i) {
			return getRuleContext(MemberDeclContext.class,i);
		}
		public StructDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDecl; }
	}

	public final StructDeclContext structDecl() throws RecognitionException {
		StructDeclContext _localctx = new StructDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__1);
			setState(96);
			identifier();
			setState(97);
			match(T__2);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				memberDecl();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__7 - 7)) | (1L << (T__8 - 7)) | (1L << (T__9 - 7)) | (1L << (T__10 - 7)) | (1L << (T__11 - 7)) | (1L << (T__12 - 7)) | (1L << (T__13 - 7)) | (1L << (IDENTIFIER - 7)))) != 0) );
			setState(103);
			match(T__3);
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypesContext primitiveTypes() {
			return getRuleContext(PrimitiveTypesContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			primitiveTypes();
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

	public static class FuncCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			identifier();
			setState(108);
			match(T__4);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__18 - 5)) | (1L << (T__20 - 5)) | (1L << (T__21 - 5)) | (1L << (T__22 - 5)) | (1L << (T__23 - 5)) | (1L << (T__24 - 5)) | (1L << (T__25 - 5)) | (1L << (T__26 - 5)) | (1L << (T__27 - 5)) | (1L << (DECIMAL_LITERAL - 5)) | (1L << (HEX_LITERAL - 5)) | (1L << (OCT_LITERAL - 5)) | (1L << (BINARY_LITERAL - 5)) | (1L << (FLOAT_LITERAL - 5)) | (1L << (HEX_FLOAT_LITERAL - 5)) | (1L << (IDENTIFIER - 5)))) != 0)) {
				{
				setState(109);
				expressionList();
				}
			}

			setState(112);
			match(T__5);
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

	public static class PrimitiveTypesContext extends ParserRuleContext {
		public ArithTypeContext arithType() {
			return getRuleContext(ArithTypeContext.class,0);
		}
		public SignedorunsignedContext signedorunsigned() {
			return getRuleContext(SignedorunsignedContext.class,0);
		}
		public PrimitiveTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveTypes; }
	}

	public final PrimitiveTypesContext primitiveTypes() throws RecognitionException {
		PrimitiveTypesContext _localctx = new PrimitiveTypesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitiveTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__13) {
				{
				setState(114);
				signedorunsigned();
				}
			}

			setState(117);
			arithType();
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

	public static class ArithTypeContext extends ParserRuleContext {
		public ArithTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithType; }
	}

	public final ArithTypeContext arithType() throws RecognitionException {
		ArithTypeContext _localctx = new ArithTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class ArithTypeNOINTContext extends ParserRuleContext {
		public ArithTypeNOINTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithTypeNOINT; }
	}

	public final ArithTypeNOINTContext arithTypeNOINT() throws RecognitionException {
		ArithTypeNOINTContext _localctx = new ArithTypeNOINTContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arithTypeNOINT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__9))) != 0)) ) {
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

	public static class SignedorunsignedContext extends ParserRuleContext {
		public SignedorunsignedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedorunsigned; }
	}

	public final SignedorunsignedContext signedorunsigned() throws RecognitionException {
		SignedorunsignedContext _localctx = new SignedorunsignedContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signedorunsigned);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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

	public static class DeclaratorsContext extends ParserRuleContext {
		public List<DeclaratorContext> declarator() {
			return getRuleContexts(DeclaratorContext.class);
		}
		public DeclaratorContext declarator(int i) {
			return getRuleContext(DeclaratorContext.class,i);
		}
		public DeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarators; }
	}

	public final DeclaratorsContext declarators() throws RecognitionException {
		DeclaratorsContext _localctx = new DeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			declarator();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(126);
				match(T__14);
				setState(127);
				declarator();
				}
				}
				setState(132);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DeclIdContext declId() {
			return getRuleContext(DeclIdContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			declId();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(134);
				match(T__15);
				setState(135);
				initializer();
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

	public static class DeclIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public ArrBracketContext arrBracket() {
			return getRuleContext(ArrBracketContext.class,0);
		}
		public DeclIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declId; }
	}

	public final DeclIdContext declId() throws RecognitionException {
		DeclIdContext _localctx = new DeclIdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(138);
				pointer();
				}
			}

			setState(141);
			identifier();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(142);
				arrBracket();
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

	public static class ArrBracketContext extends ParserRuleContext {
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public ArrBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrBracket; }
	}

	public final ArrBracketContext arrBracket() throws RecognitionException {
		ArrBracketContext _localctx = new ArrBracketContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrBracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__16);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) {
				{
				{
				setState(146);
				integerLiteral();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__17);
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

	public static class PointerContext extends ParserRuleContext {
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__18);
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
	public static class ExprConstructorContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprConstructorContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprTernaryContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		public ExprComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIdentifierContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBitwiseORContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		public ExprASContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrefixArthemticContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprPrefixArthemticContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIndirectionContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprIndirectionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLogicalORContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		public ExprRightAssociationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprShiftingContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprShiftingContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPostfixContext extends ExpressionContext {
		public Token postfix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		public ExprMDMContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprFuncCallContext extends ExpressionContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ExprFuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprXORContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprXORContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMemberAcessContext extends ExpressionContext {
		public Token bop;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprMemberAcessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprGroupedExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprGroupedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrefixLogicalContext extends ExpressionContext {
		public Token prefix;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprPrefixLogicalContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBitwiseANDContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		public ExprEqualityContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLogicalANDContext extends ExpressionContext {
		public Token bop;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(157);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new ExprIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new ExprGroupedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(T__4);
				setState(160);
				expression(0);
				setState(161);
				match(T__5);
				}
				break;
			case 4:
				{
				_localctx = new ExprFuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				funcCall();
				}
				break;
			case 5:
				{
				_localctx = new ExprConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(T__20);
				setState(165);
				identifier();
				setState(166);
				match(T__4);
				setState(167);
				match(T__5);
				}
				break;
			case 6:
				{
				_localctx = new ExprPrefixArthemticContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				((ExprPrefixArthemticContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
					((ExprPrefixArthemticContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				expression(15);
				}
				break;
			case 7:
				{
				_localctx = new ExprPrefixLogicalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				((ExprPrefixLogicalContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
					((ExprPrefixLogicalContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				expression(14);
				}
				break;
			case 8:
				{
				_localctx = new ExprIndirectionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				((ExprIndirectionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__27) ) {
					((ExprIndirectionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				expression(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMDMContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(178);
						((ExprMDMContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((ExprMDMContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprASContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(181);
						((ExprASContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((ExprASContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprShiftingContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(191);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(184);
							match(T__30);
							setState(185);
							match(T__30);
							}
							break;
						case 2:
							{
							setState(186);
							match(T__31);
							setState(187);
							match(T__31);
							setState(188);
							match(T__31);
							}
							break;
						case 3:
							{
							setState(189);
							match(T__31);
							setState(190);
							match(T__31);
							}
							break;
						}
						setState(193);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(195);
						((ExprComparisonContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
							((ExprComparisonContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprEqualityContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(198);
						((ExprEqualityContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
							((ExprEqualityContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprBitwiseANDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(201);
						((ExprBitwiseANDContext)_localctx).bop = match(T__27);
						setState(202);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprXORContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(204);
						((ExprXORContext)_localctx).bop = match(T__36);
						setState(205);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprBitwiseORContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(207);
						((ExprBitwiseORContext)_localctx).bop = match(T__37);
						setState(208);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprLogicalANDContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(210);
						((ExprLogicalANDContext)_localctx).bop = match(T__38);
						setState(211);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExprLogicalORContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(213);
						((ExprLogicalORContext)_localctx).bop = match(T__39);
						setState(214);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExprTernaryContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(215);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(216);
						((ExprTernaryContext)_localctx).bop = match(T__40);
						setState(217);
						expression(0);
						setState(218);
						match(T__41);
						setState(219);
						expression(2);
						}
						break;
					case 12:
						{
						_localctx = new ExprRightAssociationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(222);
						((ExprRightAssociationContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
							((ExprRightAssociationContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExprMemberAcessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(225);
						((ExprMemberAcessContext)_localctx).bop = match(T__19);
						setState(226);
						identifier();
						}
						break;
					case 14:
						{
						_localctx = new ExprPostfixContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(228);
						((ExprPostfixContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((ExprPostfixContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class InitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_initializer);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__18:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				expression(0);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				arrayInit();
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

	public static class ArrayInitContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public ArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInit; }
	}

	public final ArrayInitContext arrayInit() throws RecognitionException {
		ArrayInitContext _localctx = new ArrayInitContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayInit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__2);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL))) != 0) || _la==IDENTIFIER) {
				{
				setState(239);
				initializer();
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(240);
						match(T__14);
						setState(241);
						initializer();
						}
						} 
					}
					setState(246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(247);
					match(T__14);
					}
				}

				}
			}

			setState(252);
			match(T__3);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtReturnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtWhileContext extends StatementContext {
		public ExprparContext exprpar() {
			return getRuleContext(ExprparContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StmtWhileContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class EmptyStatementContext extends StatementContext {
		public EmptyStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtExpressionContext extends StatementContext {
		public ExpressionContext statementExpression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtExpressionContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtDoWhileContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprparContext exprpar() {
			return getRuleContext(ExprparContext.class,0);
		}
		public StmtDoWhileContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class StmtIfContext extends StatementContext {
		public ExprparContext exprpar() {
			return getRuleContext(ExprparContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StmtIfContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(T__52);
				setState(255);
				exprpar();
				setState(256);
				statement();
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(257);
					match(T__53);
					setState(258);
					statement();
					}
					break;
				}
				}
				break;
			case T__54:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(T__54);
				setState(262);
				exprpar();
				setState(263);
				statement();
				}
				break;
			case T__55:
				_localctx = new StmtDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(T__55);
				setState(266);
				statement();
				setState(267);
				match(T__54);
				setState(268);
				exprpar();
				setState(269);
				match(T__0);
				}
				break;
			case T__56:
				_localctx = new StmtReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				match(T__56);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__18 - 5)) | (1L << (T__20 - 5)) | (1L << (T__21 - 5)) | (1L << (T__22 - 5)) | (1L << (T__23 - 5)) | (1L << (T__24 - 5)) | (1L << (T__25 - 5)) | (1L << (T__26 - 5)) | (1L << (T__27 - 5)) | (1L << (DECIMAL_LITERAL - 5)) | (1L << (HEX_LITERAL - 5)) | (1L << (OCT_LITERAL - 5)) | (1L << (BINARY_LITERAL - 5)) | (1L << (FLOAT_LITERAL - 5)) | (1L << (HEX_FLOAT_LITERAL - 5)) | (1L << (IDENTIFIER - 5)))) != 0)) {
					{
					setState(272);
					expression(0);
					}
				}

				setState(275);
				match(T__0);
				}
				break;
			case T__4:
			case T__18:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case IDENTIFIER:
				_localctx = new StmtExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				((StmtExpressionContext)_localctx).statementExpression = expression(0);
				setState(277);
				match(T__0);
				}
				break;
			case T__0:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				match(T__0);
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

	public static class ExprparContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprpar; }
	}

	public final ExprparContext exprpar() throws RecognitionException {
		ExprparContext _localctx = new ExprparContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__4);
			setState(283);
			expression(0);
			setState(284);
			match(T__5);
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
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryIdentifierContext extends PrimaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrimaryIdentifierContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryLiteralContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primary);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				_localctx = new PrimaryLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				literal();
				}
				break;
			case IDENTIFIER:
				_localctx = new PrimaryIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				identifier();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(IDENTIFIER);
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
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				floatLiteral();
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
		public TerminalNode DECIMAL_LITERAL() { return getToken(CParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(CParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(CParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(CParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
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
		public TerminalNode FLOAT_LITERAL() { return getToken(CParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(CParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			expression(0);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(301);
				match(T__14);
				setState(302);
				expression(0);
				}
				}
				setState(307);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
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
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0137\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2<\n\2\r\2\16\2=\3\3\3"+
		"\3\5\3B\n\3\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5"+
		"\3\6\3\6\5\6T\n\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\6\5\6`\n\6\3"+
		"\7\3\7\3\7\3\7\6\7f\n\7\r\7\16\7g\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\tq\n\t"+
		"\3\t\3\t\3\n\5\nv\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\7\16\u0083\n\16\f\16\16\16\u0086\13\16\3\17\3\17\3\17\5\17\u008b\n\17"+
		"\3\20\5\20\u008e\n\20\3\20\3\20\5\20\u0092\n\20\3\21\3\21\7\21\u0096\n"+
		"\21\f\21\16\21\u0099\13\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00b2\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00c2\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u00e8\n\23\f\23\16\23\u00eb\13\23\3\24\3\24\5\24\u00ef\n\24\3\25"+
		"\3\25\3\25\3\25\7\25\u00f5\n\25\f\25\16\25\u00f8\13\25\3\25\5\25\u00fb"+
		"\n\25\5\25\u00fd\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0106\n"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0114"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u011b\n\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\5\30\u0123\n\30\3\31\3\31\3\32\3\32\5\32\u0129\n\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\35\7\35\u0132\n\35\f\35\16\35\u0135\13\35\3\35\2"+
		"\3$\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2"+
		"\20\3\2\t\16\4\2\t\n\f\f\3\2\17\20\3\2\30\33\3\2\34\35\4\2\25\25\36\36"+
		"\4\2\25\25\37 \3\2\32\33\3\2!$\3\2%&\4\2\22\22-\66\3\2\30\31\3\2<?\3\2"+
		"@A\2\u014e\2;\3\2\2\2\4A\3\2\2\2\6E\3\2\2\2\bO\3\2\2\2\n_\3\2\2\2\fa\3"+
		"\2\2\2\16k\3\2\2\2\20m\3\2\2\2\22u\3\2\2\2\24y\3\2\2\2\26{\3\2\2\2\30"+
		"}\3\2\2\2\32\177\3\2\2\2\34\u0087\3\2\2\2\36\u008d\3\2\2\2 \u0093\3\2"+
		"\2\2\"\u009c\3\2\2\2$\u00b1\3\2\2\2&\u00ee\3\2\2\2(\u00f0\3\2\2\2*\u011a"+
		"\3\2\2\2,\u011c\3\2\2\2.\u0122\3\2\2\2\60\u0124\3\2\2\2\62\u0128\3\2\2"+
		"\2\64\u012a\3\2\2\2\66\u012c\3\2\2\28\u012e\3\2\2\2:<\5\4\3\2;:\3\2\2"+
		"\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?B\5*\26\2@B\5\6\4\2A?\3\2"+
		"\2\2A@\3\2\2\2B\5\3\2\2\2CF\5\b\5\2DF\5\f\7\2EC\3\2\2\2ED\3\2\2\2F\7\3"+
		"\2\2\2GH\5\16\b\2HI\5\32\16\2IJ\7\3\2\2JP\3\2\2\2KL\5\60\31\2LM\5\32\16"+
		"\2MN\7\3\2\2NP\3\2\2\2OG\3\2\2\2OK\3\2\2\2P\t\3\2\2\2QS\5\16\b\2RT\5\""+
		"\22\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\5\60\31\2VW\7\3\2\2W`\3\2\2\2XZ"+
		"\5\60\31\2Y[\5\"\22\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\5\60\31\2]^\7"+
		"\3\2\2^`\3\2\2\2_Q\3\2\2\2_X\3\2\2\2`\13\3\2\2\2ab\7\4\2\2bc\5\60\31\2"+
		"ce\7\5\2\2df\5\n\6\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2"+
		"ij\7\6\2\2j\r\3\2\2\2kl\5\22\n\2l\17\3\2\2\2mn\5\60\31\2np\7\7\2\2oq\5"+
		"8\35\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\b\2\2s\21\3\2\2\2tv\5\30\r\2"+
		"ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5\24\13\2x\23\3\2\2\2yz\t\2\2\2z\25\3"+
		"\2\2\2{|\t\3\2\2|\27\3\2\2\2}~\t\4\2\2~\31\3\2\2\2\177\u0084\5\34\17\2"+
		"\u0080\u0081\7\21\2\2\u0081\u0083\5\34\17\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\33\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0087\u008a\5\36\20\2\u0088\u0089\7\22\2\2\u0089"+
		"\u008b\5&\24\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\35\3\2\2"+
		"\2\u008c\u008e\5\"\22\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\5\60\31\2\u0090\u0092\5 \21\2\u0091\u0090\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\37\3\2\2\2\u0093\u0097\7\23\2\2\u0094"+
		"\u0096\5\64\33\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\7\24\2\2\u009b!\3\2\2\2\u009c\u009d\7\25\2\2\u009d#\3\2\2\2\u009e"+
		"\u009f\b\23\1\2\u009f\u00b2\5.\30\2\u00a0\u00b2\5\60\31\2\u00a1\u00a2"+
		"\7\7\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a4\7\b\2\2\u00a4\u00b2\3\2\2\2\u00a5"+
		"\u00b2\5\20\t\2\u00a6\u00a7\7\27\2\2\u00a7\u00a8\5\60\31\2\u00a8\u00a9"+
		"\7\7\2\2\u00a9\u00aa\7\b\2\2\u00aa\u00b2\3\2\2\2\u00ab\u00ac\t\5\2\2\u00ac"+
		"\u00b2\5$\23\21\u00ad\u00ae\t\6\2\2\u00ae\u00b2\5$\23\20\u00af\u00b0\t"+
		"\7\2\2\u00b0\u00b2\5$\23\17\u00b1\u009e\3\2\2\2\u00b1\u00a0\3\2\2\2\u00b1"+
		"\u00a1\3\2\2\2\u00b1\u00a5\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b1\u00ab\3\2"+
		"\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00e9\3\2\2\2\u00b3"+
		"\u00b4\f\16\2\2\u00b4\u00b5\t\b\2\2\u00b5\u00e8\5$\23\17\u00b6\u00b7\f"+
		"\r\2\2\u00b7\u00b8\t\t\2\2\u00b8\u00e8\5$\23\16\u00b9\u00c1\f\f\2\2\u00ba"+
		"\u00bb\7!\2\2\u00bb\u00c2\7!\2\2\u00bc\u00bd\7\"\2\2\u00bd\u00be\7\"\2"+
		"\2\u00be\u00c2\7\"\2\2\u00bf\u00c0\7\"\2\2\u00c0\u00c2\7\"\2\2\u00c1\u00ba"+
		"\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00e8\5$\23\r\u00c4\u00c5\f\13\2\2\u00c5\u00c6\t\n\2\2\u00c6\u00e8\5"+
		"$\23\f\u00c7\u00c8\f\n\2\2\u00c8\u00c9\t\13\2\2\u00c9\u00e8\5$\23\13\u00ca"+
		"\u00cb\f\t\2\2\u00cb\u00cc\7\36\2\2\u00cc\u00e8\5$\23\n\u00cd\u00ce\f"+
		"\b\2\2\u00ce\u00cf\7\'\2\2\u00cf\u00e8\5$\23\t\u00d0\u00d1\f\7\2\2\u00d1"+
		"\u00d2\7(\2\2\u00d2\u00e8\5$\23\b\u00d3\u00d4\f\6\2\2\u00d4\u00d5\7)\2"+
		"\2\u00d5\u00e8\5$\23\7\u00d6\u00d7\f\5\2\2\u00d7\u00d8\7*\2\2\u00d8\u00e8"+
		"\5$\23\6\u00d9\u00da\f\4\2\2\u00da\u00db\7+\2\2\u00db\u00dc\5$\23\2\u00dc"+
		"\u00dd\7,\2\2\u00dd\u00de\5$\23\4\u00de\u00e8\3\2\2\2\u00df\u00e0\f\3"+
		"\2\2\u00e0\u00e1\t\f\2\2\u00e1\u00e8\5$\23\3\u00e2\u00e3\f\25\2\2\u00e3"+
		"\u00e4\7\26\2\2\u00e4\u00e8\5\60\31\2\u00e5\u00e6\f\22\2\2\u00e6\u00e8"+
		"\t\r\2\2\u00e7\u00b3\3\2\2\2\u00e7\u00b6\3\2\2\2\u00e7\u00b9\3\2\2\2\u00e7"+
		"\u00c4\3\2\2\2\u00e7\u00c7\3\2\2\2\u00e7\u00ca\3\2\2\2\u00e7\u00cd\3\2"+
		"\2\2\u00e7\u00d0\3\2\2\2\u00e7\u00d3\3\2\2\2\u00e7\u00d6\3\2\2\2\u00e7"+
		"\u00d9\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"%\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\5$\23\2\u00ed\u00ef\5(\25\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\'\3\2\2\2\u00f0\u00fc\7"+
		"\5\2\2\u00f1\u00f6\5&\24\2\u00f2\u00f3\7\21\2\2\u00f3\u00f5\5&\24\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\7\21\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f1\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\6\2\2\u00ff"+
		")\3\2\2\2\u0100\u0101\7\67\2\2\u0101\u0102\5,\27\2\u0102\u0105\5*\26\2"+
		"\u0103\u0104\78\2\2\u0104\u0106\5*\26\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u011b\3\2\2\2\u0107\u0108\79\2\2\u0108\u0109\5,\27\2\u0109"+
		"\u010a\5*\26\2\u010a\u011b\3\2\2\2\u010b\u010c\7:\2\2\u010c\u010d\5*\26"+
		"\2\u010d\u010e\79\2\2\u010e\u010f\5,\27\2\u010f\u0110\7\3\2\2\u0110\u011b"+
		"\3\2\2\2\u0111\u0113\7;\2\2\u0112\u0114\5$\23\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011b\7\3\2\2\u0116\u0117\5$"+
		"\23\2\u0117\u0118\7\3\2\2\u0118\u011b\3\2\2\2\u0119\u011b\7\3\2\2\u011a"+
		"\u0100\3\2\2\2\u011a\u0107\3\2\2\2\u011a\u010b\3\2\2\2\u011a\u0111\3\2"+
		"\2\2\u011a\u0116\3\2\2\2\u011a\u0119\3\2\2\2\u011b+\3\2\2\2\u011c\u011d"+
		"\7\7\2\2\u011d\u011e\5$\23\2\u011e\u011f\7\b\2\2\u011f-\3\2\2\2\u0120"+
		"\u0123\5\62\32\2\u0121\u0123\5\60\31\2\u0122\u0120\3\2\2\2\u0122\u0121"+
		"\3\2\2\2\u0123/\3\2\2\2\u0124\u0125\7E\2\2\u0125\61\3\2\2\2\u0126\u0129"+
		"\5\64\33\2\u0127\u0129\5\66\34\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2"+
		"\2\u0129\63\3\2\2\2\u012a\u012b\t\16\2\2\u012b\65\3\2\2\2\u012c\u012d"+
		"\t\17\2\2\u012d\67\3\2\2\2\u012e\u0133\5$\23\2\u012f\u0130\7\21\2\2\u0130"+
		"\u0132\5$\23\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u01349\3\2\2\2\u0135\u0133\3\2\2\2\37=AEOSZ_"+
		"gpu\u0084\u008a\u008d\u0091\u0097\u00b1\u00c1\u00e7\u00e9\u00ee\u00f6"+
		"\u00fa\u00fc\u0105\u0113\u011a\u0122\u0128\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}