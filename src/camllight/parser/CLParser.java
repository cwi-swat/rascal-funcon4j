// Generated from  by ANTLR 4.2.2

package camllight.parser;
import static camllight.parser.Tokens.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__72=1, T__71=2, T__70=3, T__69=4, T__68=5, T__67=6, T__66=7, T__65=8, 
		T__64=9, T__63=10, T__62=11, T__61=12, T__60=13, T__59=14, T__58=15, T__57=16, 
		T__56=17, T__55=18, T__54=19, T__53=20, T__52=21, T__51=22, T__50=23, 
		T__49=24, T__48=25, T__47=26, T__46=27, T__45=28, T__44=29, T__43=30, 
		T__42=31, T__41=32, T__40=33, T__39=34, T__38=35, T__37=36, T__36=37, 
		T__35=38, T__34=39, T__33=40, T__32=41, T__31=42, T__30=43, T__29=44, 
		T__28=45, T__27=46, T__26=47, T__25=48, T__24=49, T__23=50, T__22=51, 
		T__21=52, T__20=53, T__19=54, T__18=55, T__17=56, T__16=57, T__15=58, 
		T__14=59, T__13=60, T__12=61, T__11=62, T__10=63, T__9=64, T__8=65, T__7=66, 
		T__6=67, T__5=68, T__4=69, T__3=70, T__2=71, T__1=72, T__0=73, CHARTOKEN=74, 
		NULLTOKEN=75, EMPTYARRAYTOKEN=76, EMPTYLISTTOKEN=77, WILDCARDTOKEN=78, 
		BOOLTOKEN=79, CARRIAGERETURN=80, FORMFEED=81, WS=82, COMMENT=83, INTTOKEN=84, 
		STRINGTOKEN=85, FLOATTOKEN=86, LINEFEED=87, HORIZONTALTAB=88, IDTOKEN=89, 
		CONSTRTOKEN=90;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'!='", "'while'", "'{'", "'&&'", "'**'", "'::'", 
		"'='", "'for'", "'^'", "'do'", "'('", "'rec'", "','", "'<-'", "'done'", 
		"'mod'", "'>='", "'<'", "';;'", "']'", "'@'", "'*.'", "'type'", "'<>'", 
		"'|]'", "'let'", "'match'", "'function'", "'downto'", "'then'", "'+'", 
		"'/'", "'as'", "'of'", "'.('", "';'", "'||'", "'/.'", "'}'", "'if'", "'try'", 
		"':='", "'<='", "'[|'", "'&'", "'print'", "'''", "'*'", "'.'", "'exception'", 
		"'->'", "'to'", "'mutable'", "':'", "'['", "'=='", "'|'", "'with'", "'>'", 
		"'+.'", "'or'", "'-.'", "'!'", "'else'", "'begin'", "'in'", "'end'", "')'", 
		"'and'", "'not'", "'raise'", "'-'", "CHARTOKEN", "NULLTOKEN", "EMPTYARRAYTOKEN", 
		"EMPTYLISTTOKEN", "'_'", "BOOLTOKEN", "CARRIAGERETURN", "FORMFEED", "WS", 
		"COMMENT", "INTTOKEN", "STRINGTOKEN", "FLOATTOKEN", "LINEFEED", "HORIZONTALTAB", 
		"IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decllabeltype = 2, RULE_vartype = 3, 
		RULE_decl = 4, RULE_patt = 5, RULE_ident = 6, RULE_declorexp = 7, RULE_pattlist = 8, 
		RULE_emptylist = 9, RULE_pattmatchsingle = 10, RULE_type = 11, RULE_headtaillistpatt = 12, 
		RULE_recordsingle = 13, RULE_decltypeappendix = 14, RULE_declmono = 15, 
		RULE_letExp = 16, RULE_declnewtypeappendix = 17, RULE_decloptionalvartypes = 18, 
		RULE_patttuple = 19, RULE_declimpl = 20, RULE_function = 21, RULE_recanddecl = 22, 
		RULE_recordpattappendix = 23, RULE_exp = 24, RULE_anddecl = 25, RULE_varianttype = 26, 
		RULE_pattmatchcurried = 27, RULE_prog = 28, RULE_exparray = 29, RULE_functionapp = 30, 
		RULE_tupletypelist = 31, RULE_recdeclmono = 32, RULE_declexceptionappendix = 33, 
		RULE_recdecl = 34, RULE_declnewtype = 35;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decllabeltype", "vartype", "decl", "patt", "ident", 
		"declorexp", "pattlist", "emptylist", "pattmatchsingle", "type", "headtaillistpatt", 
		"recordsingle", "decltypeappendix", "declmono", "letExp", "declnewtypeappendix", 
		"decloptionalvartypes", "patttuple", "declimpl", "function", "recanddecl", 
		"recordpattappendix", "exp", "anddecl", "varianttype", "pattmatchcurried", 
		"prog", "exparray", "functionapp", "tupletypelist", "recdeclmono", "declexceptionappendix", 
		"recdecl", "declnewtype"
	};

	@Override
	public String getGrammarFileName() { return ""; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private camllight.algebras.AllAlg builder;
	public void setBuilder(camllight.algebras.AllAlg builder) { this.builder = builder; }
	private static <X> java.util.List<X> lift(String name, java.util.List<?> ctxs, X ...heads) {
	  java.util.List<X> l = new java.util.ArrayList<X>();
	  for (X h: heads) { l.add(h); }
	  for (Object ctx: ctxs) {
	    try {
	      l.add((X)ctx.getClass().getField(name).get(ctx));
	    } catch (Throwable e) {
	      throw new RuntimeException(e);
	    }
	  }
	  return l;
	}

	public CLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PattmatchContext extends ParserRuleContext {
		public Object _pattmatch;
		public PattmatchContext pattmatch_0;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchContext pattmatch_1;
		public PattmatchsingleContext pattmatchsingle() {
			return getRuleContext(PattmatchsingleContext.class,0);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public PattmatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatch; }
	}

	public final PattmatchContext pattmatch() throws RecognitionException {
		PattmatchContext _localctx = new PattmatchContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pattmatch);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); match(58);
				setState(73); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(77); match(58);
				setState(78); ((PattmatchContext)_localctx).pattmatch_1 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchMulti((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle),(((PattmatchContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
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

	public static class ConstantContext extends ParserRuleContext {
		public Object _constant;
		public Token FLOATTOKEN_0;
		public Token INTTOKEN_0;
		public Token CHARTOKEN_0;
		public Token NULLTOKEN_0;
		public Token STRINGTOKEN_0;
		public Token BOOLTOKEN_0;
		public Token CONSTRTOKEN_0;
		public EmptylistContext emptylist_0;
		public TerminalNode FLOATTOKEN() { return getToken(CLParser.FLOATTOKEN, 0); }
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TerminalNode NULLTOKEN() { return getToken(CLParser.NULLTOKEN, 0); }
		public TerminalNode INTTOKEN() { return getToken(CLParser.INTTOKEN, 0); }
		public TerminalNode CHARTOKEN() { return getToken(CLParser.CHARTOKEN, 0); }
		public TerminalNode BOOLTOKEN() { return getToken(CLParser.BOOLTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode STRINGTOKEN() { return getToken(CLParser.STRINGTOKEN, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
				((ConstantContext)_localctx)._constant =  builder.float_(floattoken((((ConstantContext)_localctx).FLOATTOKEN_0!=null?((ConstantContext)_localctx).FLOATTOKEN_0.getText():null)));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case CHARTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(90); ((ConstantContext)_localctx).CHARTOKEN_0 = match(CHARTOKEN);
				((ConstantContext)_localctx)._constant =  builder.char_(chartoken((((ConstantContext)_localctx).CHARTOKEN_0!=null?((ConstantContext)_localctx).CHARTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(92); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(94); ((ConstantContext)_localctx).STRINGTOKEN_0 = match(STRINGTOKEN);
				((ConstantContext)_localctx)._constant =  builder.string(stringtoken((((ConstantContext)_localctx).STRINGTOKEN_0!=null?((ConstantContext)_localctx).STRINGTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(96); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case CONSTRTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(98); ((ConstantContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((ConstantContext)_localctx)._constant =  builder.constr(constrtoken((((ConstantContext)_localctx).CONSTRTOKEN_0!=null?((ConstantContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(100); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
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

	public static class DecllabeltypeContext extends ParserRuleContext {
		public Object _decllabeltype;
		public Token IDTOKEN_0;
		public TypeContext type_1;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DecllabeltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decllabeltype; }
	}

	public final DecllabeltypeContext decllabeltype() throws RecognitionException {
		DecllabeltypeContext _localctx = new DecllabeltypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decllabeltype);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case 54:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); match(54);
				setState(106); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(107); match(55);
				setState(108); ((DecllabeltypeContext)_localctx).type_1 = type(0);
				((DecllabeltypeContext)_localctx)._decllabeltype =  builder.declMutableLabelType(idtoken((((DecllabeltypeContext)_localctx).IDTOKEN_0!=null?((DecllabeltypeContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabeltypeContext)_localctx).type_1._type));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(112); match(55);
				setState(113); ((DecllabeltypeContext)_localctx).type_1 = type(0);
				((DecllabeltypeContext)_localctx)._decllabeltype =  builder.declLabelType(idtoken((((DecllabeltypeContext)_localctx).IDTOKEN_0!=null?((DecllabeltypeContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabeltypeContext)_localctx).type_1._type));
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

	public static class VartypeContext extends ParserRuleContext {
		public Object _vartype;
		public Token IDTOKEN_0;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public VartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartype; }
	}

	public final VartypeContext vartype() throws RecognitionException {
		VartypeContext _localctx = new VartypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vartype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(48);
			setState(119); ((VartypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			((VartypeContext)_localctx)._vartype =  builder.varType(idtoken((((VartypeContext)_localctx).IDTOKEN_0!=null?((VartypeContext)_localctx).IDTOKEN_0.getText():null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Object _decl;
		public RecdeclContext recdecl_0;
		public DeclmonoContext declmono_0;
		public Token CONSTRTOKEN_0;
		public DeclexceptionappendixContext declexceptionappendix;
		public List<DeclexceptionappendixContext> declexceptionappendix_1_list = new ArrayList<DeclexceptionappendixContext>();
		public TypeContext type_1;
		public List<DeclexceptionappendixContext> declexceptionappendix_2_list = new ArrayList<DeclexceptionappendixContext>();
		public DecloptionalvartypesContext decloptionalvartypes_0;
		public DeclnewtypeappendixContext declnewtypeappendix;
		public List<DeclnewtypeappendixContext> declnewtypeappendix_1_list = new ArrayList<DeclnewtypeappendixContext>();
		public DeclContext decl_0;
		public AnddeclContext anddecl;
		public List<AnddeclContext> anddecl_1_list = new ArrayList<AnddeclContext>();
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public AnddeclContext anddecl(int i) {
			return getRuleContext(AnddeclContext.class,i);
		}
		public List<DeclexceptionappendixContext> declexceptionappendix() {
			return getRuleContexts(DeclexceptionappendixContext.class);
		}
		public DeclexceptionappendixContext declexceptionappendix(int i) {
			return getRuleContext(DeclexceptionappendixContext.class,i);
		}
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public DeclnewtypeappendixContext declnewtypeappendix(int i) {
			return getRuleContext(DeclnewtypeappendixContext.class,i);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public List<DeclnewtypeappendixContext> declnewtypeappendix() {
			return getRuleContexts(DeclnewtypeappendixContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DecloptionalvartypesContext decloptionalvartypes() {
			return getRuleContext(DecloptionalvartypesContext.class,0);
		}
		public List<AnddeclContext> anddecl() {
			return getRuleContexts(AnddeclContext.class);
		}
		public RecdeclContext recdecl() {
			return getRuleContext(RecdeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		int _la;
		try {
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); match(27);
				setState(123); match(13);
				setState(124); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130); match(51);
				setState(131); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==70) {
					{
					{
					setState(132); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_1_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declEnumException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_1_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139); match(51);
				setState(140); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(141); match(35);
				setState(142); ((DeclContext)_localctx).type_1 = type(0);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==70) {
					{
					{
					setState(143); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_2_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declConstrException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclContext)_localctx).type_1._type),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_2_list));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151); match(24);
				setState(152); ((DeclContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==70) {
					{
					{
					setState(153); ((DeclContext)_localctx).declnewtypeappendix = declnewtypeappendix();
					((DeclContext)_localctx).declnewtypeappendix_1_list.add(((DeclContext)_localctx).declnewtypeappendix);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declNewType((((DeclContext)_localctx).decloptionalvartypes_0._decloptionalvartypes),lift("_declnewtypeappendix", ((DeclContext)_localctx).declnewtypeappendix_1_list));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161); match(27);
				setState(162); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==70 );
				((DeclContext)_localctx)._decl =  builder.andDecl((((DeclContext)_localctx).declmono_0._declmono),lift("_anddecl", ((DeclContext)_localctx).anddecl_1_list));
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

	public static class PattContext extends ParserRuleContext {
		public Object _patt;
		public PattContext patt_0;
		public Token CONSTRTOKEN_0;
		public PattContext patt_1;
		public Token IDTOKEN_0;
		public RecordpattappendixContext recordpattappendix;
		public List<RecordpattappendixContext> recordpattappendix_2_list = new ArrayList<RecordpattappendixContext>();
		public IdentContext ident_0;
		public Token WILDCARDTOKEN_0;
		public TypeContext type_1;
		public ConstantContext constant_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public EmptylistContext emptylist_0;
		public PattlistContext pattlist_0;
		public HeadtaillistpattContext headtaillistpatt_0;
		public IdentContext ident_1;
		public PatttupleContext patttuple(int i) {
			return getRuleContext(PatttupleContext.class,i);
		}
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public RecordpattappendixContext recordpattappendix(int i) {
			return getRuleContext(RecordpattappendixContext.class,i);
		}
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public TerminalNode WILDCARDTOKEN() { return getToken(CLParser.WILDCARDTOKEN, 0); }
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public List<PatttupleContext> patttuple() {
			return getRuleContexts(PatttupleContext.class);
		}
		public PattlistContext pattlist() {
			return getRuleContext(PattlistContext.class,0);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public HeadtaillistpattContext headtaillistpatt() {
			return getRuleContext(HeadtaillistpattContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<RecordpattappendixContext> recordpattappendix() {
			return getRuleContexts(RecordpattappendixContext.class);
		}
		public PattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patt; }
	}

	public final PattContext patt() throws RecognitionException {
		return patt(0);
	}

	private PattContext patt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PattContext _localctx = new PattContext(_ctx, _parentState);
		PattContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_patt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(176); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(177); ((PattContext)_localctx).patt_1 = patt(6);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(180); match(4);
				setState(181); ((PattContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(182); match(8);
				setState(183); ((PattContext)_localctx).patt_1 = patt(0);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(184); ((PattContext)_localctx).recordpattappendix = recordpattappendix();
					((PattContext)_localctx).recordpattappendix_2_list.add(((PattContext)_localctx).recordpattappendix);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190); match(40);
				((PattContext)_localctx)._patt =  builder.recordPatt(idtoken((((PattContext)_localctx).IDTOKEN_0!=null?((PattContext)_localctx).IDTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt),lift("_recordpattappendix", ((PattContext)_localctx).recordpattappendix_2_list));
				}
				break;

			case 3:
				{
				setState(193); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(196); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(198); match(12);
				setState(199); ((PattContext)_localctx).patt_0 = patt(0);
				setState(200); match(69);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 6:
				{
				setState(203); match(12);
				setState(204); ((PattContext)_localctx).patt_0 = patt(0);
				setState(205); match(55);
				setState(206); ((PattContext)_localctx).type_1 = type(0);
				setState(207); match(69);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 7:
				{
				setState(210); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(213); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(215); match(12);
				setState(216); ((PattContext)_localctx).patt_0 = patt(0);
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(217); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(220); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==14 );
				setState(222); match(69);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 10:
				{
				setState(225); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 11:
				{
				setState(228); match(56);
				setState(229); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(230); match(21);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 12:
				{
				setState(233); match(56);
				setState(234); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(235); match(21);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(240);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(241); match(58);
						setState(242); ((PattContext)_localctx).patt_1 = patt(9);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(245);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(246); match(34);
						setState(247); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class IdentContext extends ParserRuleContext {
		public Object _ident;
		public Token IDTOKEN_0;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			((IdentContext)_localctx)._ident =  builder.id(idtoken((((IdentContext)_localctx).IDTOKEN_0!=null?((IdentContext)_localctx).IDTOKEN_0.getText():null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclorexpContext extends ParserRuleContext {
		public Object _declorexp;
		public ExpContext exp_0;
		public DeclContext decl_0;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclorexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declorexp; }
	}

	public final DeclorexpContext declorexp() throws RecognitionException {
		DeclorexpContext _localctx = new DeclorexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declorexp);
		try {
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261); ((DeclorexpContext)_localctx).decl_0 = decl();
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpDecl((((DeclorexpContext)_localctx).decl_0._decl));
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

	public static class PattlistContext extends ParserRuleContext {
		public Object _pattlist;
		public PattContext patt_0;
		public PattlistContext pattlist_1;
		public PattlistContext pattlist() {
			return getRuleContext(PattlistContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public PattlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattlist; }
	}

	public final PattlistContext pattlist() throws RecognitionException {
		PattlistContext _localctx = new PattlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pattlist);
		try {
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266); ((PattlistContext)_localctx).patt_0 = patt(0);
				((PattlistContext)_localctx)._pattlist =  builder.pattListSingle((((PattlistContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(270); match(14);
				setState(271); ((PattlistContext)_localctx).pattlist_1 = pattlist();
				((PattlistContext)_localctx)._pattlist =  builder.pattListMulti((((PattlistContext)_localctx).patt_0._patt),(((PattlistContext)_localctx).pattlist_1._pattlist));
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

	public static class EmptylistContext extends ParserRuleContext {
		public Object _emptylist;
		public Token EMPTYLISTTOKEN_0;
		public TerminalNode EMPTYLISTTOKEN() { return getToken(CLParser.EMPTYLISTTOKEN, 0); }
		public EmptylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptylist; }
	}

	public final EmptylistContext emptylist() throws RecognitionException {
		EmptylistContext _localctx = new EmptylistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_emptylist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
			((EmptylistContext)_localctx)._emptylist =  builder.emptyList(emptylisttoken((((EmptylistContext)_localctx).EMPTYLISTTOKEN_0!=null?((EmptylistContext)_localctx).EMPTYLISTTOKEN_0.getText():null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattmatchsingleContext extends ParserRuleContext {
		public Object _pattmatchsingle;
		public PattContext patt_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public PattmatchsingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatchsingle; }
	}

	public final PattmatchsingleContext pattmatchsingle() throws RecognitionException {
		PattmatchsingleContext _localctx = new PattmatchsingleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(280); match(52);
			setState(281); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
			((PattmatchsingleContext)_localctx)._pattmatchsingle =  builder.pattMatchSingle((((PattmatchsingleContext)_localctx).patt_0._patt),(((PattmatchsingleContext)_localctx).exp_1._exp));
			}
		}
		catch (RecognitionException re) {
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
		public Object _type;
		public TypeContext type_0;
		public TypeContext type;
		public List<TypeContext> type_0tail = new ArrayList<TypeContext>();
		public Token IDTOKEN_0;
		public VartypeContext vartype_0;
		public TypeContext type_1;
		public TupletypelistContext tupletypelist;
		public List<TupletypelistContext> tupletypelist_1_list = new ArrayList<TupletypelistContext>();
		public Token IDTOKEN_1;
		public TupletypelistContext tupletypelist(int i) {
			return getRuleContext(TupletypelistContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
		}
		public List<TupletypelistContext> tupletypelist() {
			return getRuleContexts(TupletypelistContext.class);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(285); match(12);
				setState(286); ((TypeContext)_localctx).type_0 = type(0);
				setState(287); match(69);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;

			case 2:
				{
				setState(290); match(12);
				{
				setState(291); ((TypeContext)_localctx).type_0 = type(0);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(292); match(14);
					setState(293); ((TypeContext)_localctx).type = type(0);
					((TypeContext)_localctx).type_0tail.add(((TypeContext)_localctx).type);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(299); match(69);
				setState(300); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typesIdType(lift("_type", ((TypeContext)_localctx).type_0tail, ((TypeContext)_localctx).type_0._type),idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;

			case 3:
				{
				setState(303); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;

			case 4:
				{
				setState(305); ((TypeContext)_localctx).vartype_0 = vartype();
				((TypeContext)_localctx)._type =  builder.varTypeType((((TypeContext)_localctx).vartype_0._vartype));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(326);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(310);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(311); match(52);
						setState(312); ((TypeContext)_localctx).type_1 = type(7);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(315);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(317); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(316); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(319); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;

					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(323);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(324); ((TypeContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((TypeContext)_localctx)._type =  builder.typeIdType((((TypeContext)_localctx).type_0._type),idtoken((((TypeContext)_localctx).IDTOKEN_1!=null?((TypeContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class HeadtaillistpattContext extends ParserRuleContext {
		public Object _headtaillistpatt;
		public PattContext patt_0;
		public HeadtaillistpattContext headtaillistpatt_1;
		public HeadtaillistpattContext headtaillistpatt() {
			return getRuleContext(HeadtaillistpattContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public HeadtaillistpattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headtaillistpatt; }
	}

	public final HeadtaillistpattContext headtaillistpatt() throws RecognitionException {
		HeadtaillistpattContext _localctx = new HeadtaillistpattContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_headtaillistpatt);
		try {
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(332); match(7);
				setState(333); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattSingle((((HeadtaillistpattContext)_localctx).patt_0._patt));
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

	public static class RecordsingleContext extends ParserRuleContext {
		public Object _recordsingle;
		public Token IDTOKEN_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public RecordsingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordsingle; }
	}

	public final RecordsingleContext recordsingle() throws RecognitionException {
		RecordsingleContext _localctx = new RecordsingleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_recordsingle);
		try {
			setState(352);
			switch (_input.LA(1)) {
			case 54:
				enterOuterAlt(_localctx, 1);
				{
				setState(341); match(54);
				setState(342); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(343); match(8);
				setState(344); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntryMutableSingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(347); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(348); match(8);
				setState(349); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntrySingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
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

	public static class DecltypeappendixContext extends ParserRuleContext {
		public Object _decltypeappendix;
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DecltypeappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypeappendix; }
	}

	public final DecltypeappendixContext decltypeappendix() throws RecognitionException {
		DecltypeappendixContext _localctx = new DecltypeappendixContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decltypeappendix);
		try {
			setState(363);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354); match(58);
				setState(355); ((DecltypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(356); match(35);
				setState(357); ((DecltypeappendixContext)_localctx).type_1 = type(0);
				((DecltypeappendixContext)_localctx)._decltypeappendix =  builder.declConstrTypeAppendix(constrtoken((((DecltypeappendixContext)_localctx).CONSTRTOKEN_0!=null?((DecltypeappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DecltypeappendixContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360); match(58);
				setState(361); ((DecltypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((DecltypeappendixContext)_localctx)._decltypeappendix =  builder.declEnumTypeAppendix(constrtoken((((DecltypeappendixContext)_localctx).CONSTRTOKEN_0!=null?((DecltypeappendixContext)_localctx).CONSTRTOKEN_0.getText():null)));
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

	public static class DeclmonoContext extends ParserRuleContext {
		public Object _declmono;
		public IdentContext ident_0;
		public PattContext patt;
		public List<PattContext> patt_1_list = new ArrayList<PattContext>();
		public ExpContext exp_2;
		public PattContext patt_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public DeclmonoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declmono; }
	}

	public final DeclmonoContext declmono() throws RecognitionException {
		DeclmonoContext _localctx = new DeclmonoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declmono);
		int _la;
		try {
			setState(380);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(366); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(369); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 12) | (1L << 56))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (CHARTOKEN - 74)) | (1L << (NULLTOKEN - 74)) | (1L << (EMPTYLISTTOKEN - 74)) | (1L << (WILDCARDTOKEN - 74)) | (1L << (BOOLTOKEN - 74)) | (1L << (INTTOKEN - 74)) | (1L << (STRINGTOKEN - 74)) | (1L << (FLOATTOKEN - 74)) | (1L << (IDTOKEN - 74)) | (1L << (CONSTRTOKEN - 74)))) != 0) );
				setState(371); match(8);
				setState(372); ((DeclmonoContext)_localctx).exp_2 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMonoFunc((((DeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((DeclmonoContext)_localctx).patt_1_list),(((DeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(376); match(8);
				setState(377); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
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

	public static class LetExpContext extends ParserRuleContext {
		public Object _letExp;
		public DeclContext decl_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public LetExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExp; }
	}

	public final LetExpContext letExp() throws RecognitionException {
		LetExpContext _localctx = new LetExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); ((LetExpContext)_localctx).decl_0 = decl();
			setState(383); match(67);
			setState(384); ((LetExpContext)_localctx).exp_1 = exp(0);
			((LetExpContext)_localctx)._letExp =  builder.letInExp((((LetExpContext)_localctx).decl_0._decl),(((LetExpContext)_localctx).exp_1._exp));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclnewtypeappendixContext extends ParserRuleContext {
		public Object _declnewtypeappendix;
		public DecloptionalvartypesContext decloptionalvartypes_0;
		public DecloptionalvartypesContext decloptionalvartypes() {
			return getRuleContext(DecloptionalvartypesContext.class,0);
		}
		public DeclnewtypeappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declnewtypeappendix; }
	}

	public final DeclnewtypeappendixContext declnewtypeappendix() throws RecognitionException {
		DeclnewtypeappendixContext _localctx = new DeclnewtypeappendixContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declnewtypeappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); match(70);
			setState(388); ((DeclnewtypeappendixContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
			((DeclnewtypeappendixContext)_localctx)._declnewtypeappendix =  builder.declNewTypeAppendix((((DeclnewtypeappendixContext)_localctx).decloptionalvartypes_0._decloptionalvartypes));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecloptionalvartypesContext extends ParserRuleContext {
		public Object _decloptionalvartypes;
		public VartypeContext vartype_0;
		public DeclnewtypeContext declnewtype_1;
		public VartypeContext vartype;
		public List<VartypeContext> vartype_0tail = new ArrayList<VartypeContext>();
		public DeclnewtypeContext declnewtype_0;
		public DeclnewtypeContext declnewtype() {
			return getRuleContext(DeclnewtypeContext.class,0);
		}
		public List<VartypeContext> vartype() {
			return getRuleContexts(VartypeContext.class);
		}
		public VartypeContext vartype(int i) {
			return getRuleContext(VartypeContext.class,i);
		}
		public DecloptionalvartypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decloptionalvartypes; }
	}

	public final DecloptionalvartypesContext decloptionalvartypes() throws RecognitionException {
		DecloptionalvartypesContext _localctx = new DecloptionalvartypesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decloptionalvartypes);
		int _la;
		try {
			setState(413);
			switch (_input.LA(1)) {
			case 48:
				enterOuterAlt(_localctx, 1);
				{
				setState(391); ((DecloptionalvartypesContext)_localctx).vartype_0 = vartype();
				setState(392); ((DecloptionalvartypesContext)_localctx).declnewtype_1 = declnewtype();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declNewTypeWithVarType((((DecloptionalvartypesContext)_localctx).vartype_0._vartype),(((DecloptionalvartypesContext)_localctx).declnewtype_1._declnewtype));
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 2);
				{
				setState(395); match(12);
				setState(404);
				_la = _input.LA(1);
				if (_la==48) {
					{
					setState(396); ((DecloptionalvartypesContext)_localctx).vartype_0 = vartype();
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==14) {
						{
						{
						setState(397); match(14);
						setState(398); ((DecloptionalvartypesContext)_localctx).vartype = vartype();
						((DecloptionalvartypesContext)_localctx).vartype_0tail.add(((DecloptionalvartypesContext)_localctx).vartype);
						}
						}
						setState(403);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(406); match(69);
				setState(407); ((DecloptionalvartypesContext)_localctx).declnewtype_0 = declnewtype();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declNewTypeWithVarTypes(lift("_vartype", ((DecloptionalvartypesContext)_localctx).vartype_0tail, ((DecloptionalvartypesContext)_localctx).vartype_0._vartype),(((DecloptionalvartypesContext)_localctx).declnewtype_0._declnewtype));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(410); ((DecloptionalvartypesContext)_localctx).declnewtype_0 = declnewtype();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declNewTypeWithoutVarTypes((((DecloptionalvartypesContext)_localctx).declnewtype_0._declnewtype));
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

	public static class PatttupleContext extends ParserRuleContext {
		public Object _patttuple;
		public PattContext patt_0;
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public PatttupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patttuple; }
	}

	public final PatttupleContext patttuple() throws RecognitionException {
		PatttupleContext _localctx = new PatttupleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); match(14);
			setState(416); ((PatttupleContext)_localctx).patt_0 = patt(0);
			((PatttupleContext)_localctx)._patttuple =  builder.pattTupleSingle((((PatttupleContext)_localctx).patt_0._patt));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclimplContext extends ParserRuleContext {
		public Object _declimpl;
		public DeclorexpContext declorexp_0;
		public DeclimplContext declimpl_1;
		public DeclorexpContext declorexp() {
			return getRuleContext(DeclorexpContext.class,0);
		}
		public DeclimplContext declimpl() {
			return getRuleContext(DeclimplContext.class,0);
		}
		public DeclimplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declimpl; }
	}

	public final DeclimplContext declimpl() throws RecognitionException {
		DeclimplContext _localctx = new DeclimplContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declimpl);
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(420); match(20);
				setState(421); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(425); match(20);
				((DeclimplContext)_localctx)._declimpl =  builder.declImplSingle((((DeclimplContext)_localctx).declorexp_0._declorexp));
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

	public static class FunctionContext extends ParserRuleContext {
		public Object _function;
		public PattmatchContext pattmatch_0;
		public FunctionContext function_0;
		public IdentContext ident_0;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchcurriedContext pattmatchcurried_0;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PattmatchsingleContext pattmatchsingle() {
			return getRuleContext(PattmatchsingleContext.class,0);
		}
		public PattmatchcurriedContext pattmatchcurried() {
			return getRuleContext(PattmatchcurriedContext.class,0);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function);
		try {
			setState(455);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430); match(29);
				setState(431); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434); match(12);
				setState(435); ((FunctionContext)_localctx).function_0 = function();
				setState(436); match(69);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(442); match(66);
				setState(443); ((FunctionContext)_localctx).function_0 = function();
				setState(444); match(68);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(447); match(1);
				setState(448); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(451); match(1);
				setState(452); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
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

	public static class RecanddeclContext extends ParserRuleContext {
		public Object _recanddecl;
		public RecdeclmonoContext recdeclmono_0;
		public RecdeclmonoContext recdeclmono() {
			return getRuleContext(RecdeclmonoContext.class,0);
		}
		public RecanddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recanddecl; }
	}

	public final RecanddeclContext recanddecl() throws RecognitionException {
		RecanddeclContext _localctx = new RecanddeclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_recanddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); match(70);
			setState(458); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
			((RecanddeclContext)_localctx)._recanddecl =  builder.recAndDeclSingle((((RecanddeclContext)_localctx).recdeclmono_0._recdeclmono));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordpattappendixContext extends ParserRuleContext {
		public Object _recordpattappendix;
		public Token IDTOKEN_0;
		public PattContext patt_1;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public RecordpattappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordpattappendix; }
	}

	public final RecordpattappendixContext recordpattappendix() throws RecognitionException {
		RecordpattappendixContext _localctx = new RecordpattappendixContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_recordpattappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); match(14);
			setState(462); ((RecordpattappendixContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			setState(463); match(8);
			setState(464); ((RecordpattappendixContext)_localctx).patt_1 = patt(0);
			((RecordpattappendixContext)_localctx)._recordpattappendix =  builder.recordPattAppendix(idtoken((((RecordpattappendixContext)_localctx).IDTOKEN_0!=null?((RecordpattappendixContext)_localctx).IDTOKEN_0.getText():null)),(((RecordpattappendixContext)_localctx).patt_1._patt));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public Object _exp;
		public ExpContext exp_0;
		public Token CONSTRTOKEN_0;
		public ExpContext exp_1;
		public ExpContext exp_2;
		public Token EMPTYARRAYTOKEN_0;
		public IdentContext ident_0;
		public ConstantContext constant_0;
		public TypeContext type_1;
		public ExpContext exp;
		public List<ExpContext> exp_0tail = new ArrayList<ExpContext>();
		public ExparrayContext exparray_0;
		public RecordsingleContext recordsingle_0;
		public RecordsingleContext recordsingle;
		public List<RecordsingleContext> recordsingle_0tail = new ArrayList<RecordsingleContext>();
		public FunctionappContext functionapp_0;
		public ExpContext exp_3;
		public PattmatchContext pattmatch_1;
		public FunctionContext function_0;
		public LetExpContext letExp_0;
		public Token op_1512;
		public Token op_1511;
		public Token op_1509;
		public Token op_1508;
		public Token IDTOKEN_1;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public List<RecordsingleContext> recordsingle() {
			return getRuleContexts(RecordsingleContext.class);
		}
		public RecordsingleContext recordsingle(int i) {
			return getRuleContext(RecordsingleContext.class,i);
		}
		public FunctionappContext functionapp() {
			return getRuleContext(FunctionappContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public TerminalNode EMPTYARRAYTOKEN() { return getToken(CLParser.EMPTYARRAYTOKEN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExparrayContext exparray() {
			return getRuleContext(ExparrayContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(468); match(47);
				setState(469); ((ExpContext)_localctx).exp_0 = exp(44);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(472); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(473); ((ExpContext)_localctx).exp_1 = exp(36);
				((ExpContext)_localctx)._exp =  builder.constrExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(476); match(64);
				setState(477); ((ExpContext)_localctx).exp_0 = exp(30);
				((ExpContext)_localctx)._exp =  builder.dereferenceExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(480); match(63);
				setState(481); ((ExpContext)_localctx).exp_0 = exp(28);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(484); match(73);
				setState(485); ((ExpContext)_localctx).exp_0 = exp(27);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 6:
				{
				setState(488); match(71);
				setState(489); ((ExpContext)_localctx).exp_0 = exp(20);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 7:
				{
				setState(492); match(41);
				setState(493); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(494); match(31);
				setState(495); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(496); match(65);
				setState(497); ((ExpContext)_localctx).exp_2 = exp(12);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 8:
				{
				setState(500); match(41);
				setState(501); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(502); match(31);
				setState(503); ((ExpContext)_localctx).exp_1 = exp(11);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 9:
				{
				setState(506); match(72);
				setState(507); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(508); ((ExpContext)_localctx).exp_1 = exp(4);
				((ExpContext)_localctx)._exp =  builder.raiseWithArgumentExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 10:
				{
				setState(511); ((ExpContext)_localctx).EMPTYARRAYTOKEN_0 = match(EMPTYARRAYTOKEN);
				((ExpContext)_localctx)._exp =  builder.emptyArray(emptyarraytoken((((ExpContext)_localctx).EMPTYARRAYTOKEN_0!=null?((ExpContext)_localctx).EMPTYARRAYTOKEN_0.getText():null)));
				}
				break;

			case 11:
				{
				setState(513); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 12:
				{
				setState(516); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 13:
				{
				setState(519); match(12);
				setState(520); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(521); match(69);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 14:
				{
				setState(524); match(66);
				setState(525); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(526); match(68);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 15:
				{
				setState(529); match(12);
				setState(530); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(531); match(55);
				setState(532); ((ExpContext)_localctx).type_1 = type(0);
				setState(533); match(69);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 16:
				{
				setState(536); match(12);
				{
				setState(537); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(538); match(14);
					setState(539); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(545); match(69);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 17:
				{
				setState(548); match(56);
				{
				setState(549); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(550); match(14);
					setState(551); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(557); match(21);
				((ExpContext)_localctx)._exp =  builder.expList(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 18:
				{
				setState(560); match(45);
				setState(561); ((ExpContext)_localctx).exparray_0 = exparray();
				setState(563);
				_la = _input.LA(1);
				if (_la==14) {
					{
					setState(562); match(14);
					}
				}

				setState(565); match(26);
				((ExpContext)_localctx)._exp =  builder.arrayMulti((((ExpContext)_localctx).exparray_0._exparray));
				}
				break;

			case 19:
				{
				setState(568); match(45);
				setState(569); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(571);
				_la = _input.LA(1);
				if (_la==14) {
					{
					setState(570); match(14);
					}
				}

				setState(573); match(26);
				((ExpContext)_localctx)._exp =  builder.arraySingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 20:
				{
				setState(576); match(4);
				{
				setState(577); ((ExpContext)_localctx).recordsingle_0 = recordsingle();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(578); match(14);
					setState(579); ((ExpContext)_localctx).recordsingle = recordsingle();
					((ExpContext)_localctx).recordsingle_0tail.add(((ExpContext)_localctx).recordsingle);
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(585); match(40);
				((ExpContext)_localctx)._exp =  builder.recordExp(lift("_recordsingle", ((ExpContext)_localctx).recordsingle_0tail, ((ExpContext)_localctx).recordsingle_0._recordsingle));
				}
				break;

			case 21:
				{
				setState(588); ((ExpContext)_localctx).functionapp_0 = functionapp(0);
				((ExpContext)_localctx)._exp =  builder.functionApplicationExp((((ExpContext)_localctx).functionapp_0._functionapp));
				}
				break;

			case 22:
				{
				setState(591); match(3);
				setState(592); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(593); match(11);
				setState(594); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(595); match(16);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 23:
				{
				setState(598); match(9);
				setState(599); ((ExpContext)_localctx).ident_0 = ident();
				setState(600); match(8);
				setState(601); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(602); match(30);
				setState(603); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(604); match(11);
				setState(605); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(606); match(16);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 24:
				{
				setState(609); match(9);
				setState(610); ((ExpContext)_localctx).ident_0 = ident();
				setState(611); match(8);
				setState(612); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(613); match(53);
				setState(614); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(615); match(11);
				setState(616); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(617); match(16);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 25:
				{
				setState(620); match(28);
				setState(621); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(622); match(59);
				setState(623); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 26:
				{
				setState(626); ((ExpContext)_localctx).function_0 = function();
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 27:
				{
				setState(629); match(72);
				setState(630); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((ExpContext)_localctx)._exp =  builder.raiseExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 28:
				{
				setState(632); match(42);
				setState(633); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(634); match(59);
				setState(635); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.tryWithExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 29:
				{
				setState(638); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(723);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(643);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(644); match(7);
						setState(645); ((ExpContext)_localctx).exp_1 = exp(35);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(648);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(649); match(6);
						setState(650); ((ExpContext)_localctx).exp_1 = exp(27);
						((ExpContext)_localctx)._exp =  builder.floatPowerExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(653);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(654); match(17);
						setState(655); ((ExpContext)_localctx).exp_1 = exp(26);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(658);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(659);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 23) | (1L << 33) | (1L << 39) | (1L << 49))) != 0)) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(660); ((ExpContext)_localctx).exp_1 = exp(25);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*.") ? builder.floatMultiplyExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/.") ? builder.floatDivideExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(663);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(664);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (32 - 32)) | (1L << (61 - 32)) | (1L << (63 - 32)) | (1L << (73 - 32)))) != 0)) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(665); ((ExpContext)_localctx).exp_1 = exp(24);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+.") ? builder.floatAddExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-.") ? builder.floatSubtractExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(668);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(669);
						((ExpContext)_localctx).op_1509 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==10 || _la==22) ) {
							((ExpContext)_localctx).op_1509 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(670); ((ExpContext)_localctx).exp_1 = exp(23);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1509!=null?((ExpContext)_localctx).op_1509.getText():null).equals("@") ? builder.listConcatExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1509!=null?((ExpContext)_localctx).op_1509.getText():null).equals("^") ? builder.stringAppendExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(673);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(674);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 8) | (1L << 18) | (1L << 19) | (1L << 25) | (1L << 44) | (1L << 57) | (1L << 60))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(675); ((ExpContext)_localctx).exp_1 = exp(22);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<>") ? builder.notEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("!=") ? builder.notPhysicalEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("==") ? builder.physicalEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(678);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(679);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==46) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(680); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(683);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(684);
						_la = _input.LA(1);
						if ( !(_la==38 || _la==62) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(685); ((ExpContext)_localctx).exp_1 = exp(19);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(688);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(689); match(43);
						setState(690); ((ExpContext)_localctx).exp_1 = exp(17);
						((ExpContext)_localctx)._exp =  builder.refAssignExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(693);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(694); match(50);
						setState(695); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						setState(696); match(15);
						setState(697); ((ExpContext)_localctx).exp_2 = exp(16);
						((ExpContext)_localctx)._exp =  builder.recordAssignExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(700);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(701); match(36);
						setState(702); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(703); match(69);
						setState(704); match(15);
						setState(705); ((ExpContext)_localctx).exp_2 = exp(14);
						((ExpContext)_localctx)._exp =  builder.arrayAssign((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 13:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(708);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(709); match(37);
						setState(710); ((ExpContext)_localctx).exp_1 = exp(7);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 14:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(713);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(714); match(50);
						setState(715); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((ExpContext)_localctx)._exp =  builder.recordSelectExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;

					case 15:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(717);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(718); match(36);
						setState(719); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(720); match(69);
						((ExpContext)_localctx)._exp =  builder.arraySelect((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class AnddeclContext extends ParserRuleContext {
		public Object _anddecl;
		public DeclmonoContext declmono_0;
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public AnddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anddecl; }
	}

	public final AnddeclContext anddecl() throws RecognitionException {
		AnddeclContext _localctx = new AnddeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_anddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728); match(70);
			setState(729); ((AnddeclContext)_localctx).declmono_0 = declmono();
			((AnddeclContext)_localctx)._anddecl =  builder.andDeclSingle((((AnddeclContext)_localctx).declmono_0._declmono));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarianttypeContext extends ParserRuleContext {
		public Object _varianttype;
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarianttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varianttype; }
	}

	public final VarianttypeContext varianttype() throws RecognitionException {
		VarianttypeContext _localctx = new VarianttypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_varianttype);
		try {
			setState(739);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(733); match(35);
				setState(734); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)));
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

	public static class PattmatchcurriedContext extends ParserRuleContext {
		public Object _pattmatchcurried;
		public PattContext patt;
		public List<PattContext> patt_0_list = new ArrayList<PattContext>();
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public PattmatchcurriedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatchcurried; }
	}

	public final PattmatchcurriedContext pattmatchcurried() throws RecognitionException {
		PattmatchcurriedContext _localctx = new PattmatchcurriedContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(741); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(744); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 12) | (1L << 56))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (CHARTOKEN - 74)) | (1L << (NULLTOKEN - 74)) | (1L << (EMPTYLISTTOKEN - 74)) | (1L << (WILDCARDTOKEN - 74)) | (1L << (BOOLTOKEN - 74)) | (1L << (INTTOKEN - 74)) | (1L << (STRINGTOKEN - 74)) | (1L << (FLOATTOKEN - 74)) | (1L << (IDTOKEN - 74)) | (1L << (CONSTRTOKEN - 74)))) != 0) );
			setState(746); match(52);
			setState(747); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
			((PattmatchcurriedContext)_localctx)._pattmatchcurried =  builder.pattMatchCurriedMulti(lift("_patt", ((PattmatchcurriedContext)_localctx).patt_0_list),(((PattmatchcurriedContext)_localctx).exp_1._exp));
			}
		}
		catch (RecognitionException re) {
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
		public Object _prog;
		public DeclimplContext declimpl_0;
		public DeclimplContext declimpl() {
			return getRuleContext(DeclimplContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750); ((ProgContext)_localctx).declimpl_0 = declimpl();
			((ProgContext)_localctx)._prog =  builder.start((((ProgContext)_localctx).declimpl_0._declimpl));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExparrayContext extends ParserRuleContext {
		public Object _exparray;
		public ExpContext exp_0;
		public ExparrayContext exparray_1;
		public ExpContext exp_1;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExparrayContext exparray() {
			return getRuleContext(ExparrayContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExparrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exparray; }
	}

	public final ExparrayContext exparray() throws RecognitionException {
		ExparrayContext _localctx = new ExparrayContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exparray);
		try {
			setState(763);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(754); match(14);
				setState(755); ((ExparrayContext)_localctx).exparray_1 = exparray();
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayMulti((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exparray_1._exparray));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(759); match(14);
				setState(760); ((ExparrayContext)_localctx).exp_1 = exp(0);
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayDouble((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exp_1._exp));
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

	public static class FunctionappContext extends ParserRuleContext {
		public Object _functionapp;
		public FunctionappContext functionapp_0;
		public FunctionContext function_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunctionappContext functionapp() {
			return getRuleContext(FunctionappContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionappContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionapp; }
	}

	public final FunctionappContext functionapp() throws RecognitionException {
		return functionapp(0);
	}

	private FunctionappContext functionapp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionappContext _localctx = new FunctionappContext(_ctx, _parentState);
		FunctionappContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_functionapp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(766); match(12);
				setState(767); ((FunctionappContext)_localctx).functionapp_0 = functionapp(0);
				setState(768); match(69);
				((FunctionappContext)_localctx)._functionapp =  builder.functionApplicationBracketed((((FunctionappContext)_localctx).functionapp_0._functionapp));
				}
				break;

			case 2:
				{
				setState(771); ((FunctionappContext)_localctx).function_0 = function();
				setState(772); ((FunctionappContext)_localctx).exp_1 = exp(0);
				((FunctionappContext)_localctx)._functionapp =  builder.functionApplication((((FunctionappContext)_localctx).function_0._function),(((FunctionappContext)_localctx).exp_1._exp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionappContext(_parentctx, _parentState);
					_localctx.functionapp_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_functionapp);
					setState(777);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(778); ((FunctionappContext)_localctx).exp_1 = exp(0);
					((FunctionappContext)_localctx)._functionapp =  builder.functionApplicationApplication((((FunctionappContext)_localctx).functionapp_0._functionapp),(((FunctionappContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class TupletypelistContext extends ParserRuleContext {
		public Object _tupletypelist;
		public TypeContext type_0;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TupletypelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupletypelist; }
	}

	public final TupletypelistContext tupletypelist() throws RecognitionException {
		TupletypelistContext _localctx = new TupletypelistContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tupletypelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786); match(49);
			setState(787); ((TupletypelistContext)_localctx).type_0 = type(0);
			((TupletypelistContext)_localctx)._tupletypelist =  builder.tupleTypeSingle((((TupletypelistContext)_localctx).type_0._type));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecdeclmonoContext extends ParserRuleContext {
		public Object _recdeclmono;
		public IdentContext ident_0;
		public ExpContext exp_1;
		public TypeContext type_1;
		public ExpContext exp_2;
		public PattContext patt;
		public List<PattContext> patt_1_list = new ArrayList<PattContext>();
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public RecdeclmonoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recdeclmono; }
	}

	public final RecdeclmonoContext recdeclmono() throws RecognitionException {
		RecdeclmonoContext _localctx = new RecdeclmonoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_recdeclmono);
		int _la;
		try {
			setState(814);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(791); match(8);
				setState(792); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795); match(12);
				setState(796); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(797); match(55);
				setState(798); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(799); match(69);
				setState(800); match(8);
				setState(801); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclPattTypeExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).type_1._type),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(804); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(806); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(805); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(808); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 12) | (1L << 56))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (CHARTOKEN - 74)) | (1L << (NULLTOKEN - 74)) | (1L << (EMPTYLISTTOKEN - 74)) | (1L << (WILDCARDTOKEN - 74)) | (1L << (BOOLTOKEN - 74)) | (1L << (INTTOKEN - 74)) | (1L << (STRINGTOKEN - 74)) | (1L << (FLOATTOKEN - 74)) | (1L << (IDTOKEN - 74)) | (1L << (CONSTRTOKEN - 74)))) != 0) );
				setState(810); match(8);
				setState(811); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentPattsExp((((RecdeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((RecdeclmonoContext)_localctx).patt_1_list),(((RecdeclmonoContext)_localctx).exp_2._exp));
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

	public static class DeclexceptionappendixContext extends ParserRuleContext {
		public Object _declexceptionappendix;
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclexceptionappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declexceptionappendix; }
	}

	public final DeclexceptionappendixContext declexceptionappendix() throws RecognitionException {
		DeclexceptionappendixContext _localctx = new DeclexceptionappendixContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declexceptionappendix);
		try {
			setState(825);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816); match(70);
				setState(817); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(818); match(35);
				setState(819); ((DeclexceptionappendixContext)_localctx).type_1 = type(0);
				((DeclexceptionappendixContext)_localctx)._declexceptionappendix =  builder.declConstrExceptionAppendix(constrtoken((((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0!=null?((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclexceptionappendixContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822); match(70);
				setState(823); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((DeclexceptionappendixContext)_localctx)._declexceptionappendix =  builder.declEnumExceptionAppendix(constrtoken((((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0!=null?((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0.getText():null)));
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

	public static class RecdeclContext extends ParserRuleContext {
		public Object _recdecl;
		public RecdeclmonoContext recdeclmono_0;
		public RecanddeclContext recanddecl;
		public List<RecanddeclContext> recanddecl_1_list = new ArrayList<RecanddeclContext>();
		public RecdeclmonoContext recdeclmono() {
			return getRuleContext(RecdeclmonoContext.class,0);
		}
		public RecanddeclContext recanddecl(int i) {
			return getRuleContext(RecanddeclContext.class,i);
		}
		public List<RecanddeclContext> recanddecl() {
			return getRuleContexts(RecanddeclContext.class);
		}
		public RecdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recdecl; }
	}

	public final RecdeclContext recdecl() throws RecognitionException {
		RecdeclContext _localctx = new RecdeclContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_recdecl);
		int _la;
		try {
			setState(838);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(830); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(832); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(831); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(834); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==70 );
				((RecdeclContext)_localctx)._recdecl =  builder.recAndDecl((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono),lift("_recanddecl", ((RecdeclContext)_localctx).recanddecl_1_list));
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

	public static class DeclnewtypeContext extends ParserRuleContext {
		public Object _declnewtype;
		public Token IDTOKEN_0;
		public Token CONSTRTOKEN_1;
		public TypeContext type_2;
		public DecltypeappendixContext decltypeappendix;
		public List<DecltypeappendixContext> decltypeappendix_3_list = new ArrayList<DecltypeappendixContext>();
		public TypeContext type_1;
		public IdentContext ident_0;
		public DecllabeltypeContext decllabeltype_1;
		public DecllabeltypeContext decllabeltype;
		public List<DecllabeltypeContext> decllabeltype_1tail = new ArrayList<DecllabeltypeContext>();
		public List<DecltypeappendixContext> decltypeappendix_2_list = new ArrayList<DecltypeappendixContext>();
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public DecllabeltypeContext decllabeltype(int i) {
			return getRuleContext(DecllabeltypeContext.class,i);
		}
		public DecltypeappendixContext decltypeappendix(int i) {
			return getRuleContext(DecltypeappendixContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<DecllabeltypeContext> decllabeltype() {
			return getRuleContexts(DecllabeltypeContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<DecltypeappendixContext> decltypeappendix() {
			return getRuleContexts(DecltypeappendixContext.class);
		}
		public DeclnewtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declnewtype; }
	}

	public final DeclnewtypeContext declnewtype() throws RecognitionException {
		DeclnewtypeContext _localctx = new DeclnewtypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declnewtype);
		int _la;
		try {
			setState(882);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(841); match(8);
				setState(842); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(843); match(35);
				setState(844); ((DeclnewtypeContext)_localctx).type_2 = type(0);
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==58) {
					{
					{
					setState(845); ((DeclnewtypeContext)_localctx).decltypeappendix = decltypeappendix();
					((DeclnewtypeContext)_localctx).decltypeappendix_3_list.add(((DeclnewtypeContext)_localctx).decltypeappendix);
					}
					}
					setState(850);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewConstrType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),(((DeclnewtypeContext)_localctx).type_2._type),lift("_decltypeappendix", ((DeclnewtypeContext)_localctx).decltypeappendix_3_list));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(854); match(57);
				setState(855); ((DeclnewtypeContext)_localctx).type_1 = type(0);
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declTypeDefEquals(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),(((DeclnewtypeContext)_localctx).type_1._type));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(858); ((DeclnewtypeContext)_localctx).ident_0 = ident();
				setState(859); match(8);
				setState(860); match(4);
				{
				setState(861); ((DeclnewtypeContext)_localctx).decllabeltype_1 = decllabeltype();
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(862); match(14);
					setState(863); ((DeclnewtypeContext)_localctx).decllabeltype = decllabeltype();
					((DeclnewtypeContext)_localctx).decllabeltype_1tail.add(((DeclnewtypeContext)_localctx).decllabeltype);
					}
					}
					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(869); match(40);
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declRecordType((((DeclnewtypeContext)_localctx).ident_0._ident),lift("_decllabeltype", ((DeclnewtypeContext)_localctx).decllabeltype_1tail, ((DeclnewtypeContext)_localctx).decllabeltype_1._decllabeltype));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(872); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(873); match(8);
				setState(874); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==58) {
					{
					{
					setState(875); ((DeclnewtypeContext)_localctx).decltypeappendix = decltypeappendix();
					((DeclnewtypeContext)_localctx).decltypeappendix_2_list.add(((DeclnewtypeContext)_localctx).decltypeappendix);
					}
					}
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewEnumType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),lift("_decltypeappendix", ((DeclnewtypeContext)_localctx).decltypeappendix_2_list));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return patt_sempred((PattContext)_localctx, predIndex);

		case 11: return type_sempred((TypeContext)_localctx, predIndex);

		case 24: return exp_sempred((ExpContext)_localctx, predIndex);

		case 30: return functionapp_sempred((FunctionappContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean functionapp_sempred(FunctionappContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);

		case 1: return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 6);

		case 3: return precpred(_ctx, 7);

		case 4: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 35);

		case 6: return precpred(_ctx, 26);

		case 7: return precpred(_ctx, 25);

		case 8: return precpred(_ctx, 24);

		case 9: return precpred(_ctx, 23);

		case 10: return precpred(_ctx, 22);

		case 11: return precpred(_ctx, 21);

		case 12: return precpred(_ctx, 19);

		case 13: return precpred(_ctx, 18);

		case 14: return precpred(_ctx, 17);

		case 15: return precpred(_ctx, 15);

		case 16: return precpred(_ctx, 13);

		case 17: return precpred(_ctx, 7);

		case 18: return precpred(_ctx, 16);

		case 19: return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\\\u0377\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2W\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3j\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4w\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0093\n"+
		"\6\f\6\16\6\u0096\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u009d\n\6\f\6\16\6\u00a0"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00aa\n\6\r\6\16\6\u00ab\3\6"+
		"\3\6\5\6\u00b0\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00bc\n"+
		"\7\f\7\16\7\u00bf\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00dd"+
		"\n\7\r\7\16\7\u00de\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00f1\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u00fd\n\7\f\7\16\7\u0100\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u010b\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0115\n\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0129"+
		"\n\r\f\r\16\r\u012c\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0137"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0140\n\r\r\r\16\r\u0141\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u0149\n\r\f\r\16\r\u014c\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0156\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0163\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u016e\n\20\3\21\3\21\6\21\u0172\n\21\r\21\16\21\u0173\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u017f\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0192\n\24\f\24\16\24\u0195\13\24\5\24\u0197\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u01a0\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01af\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01ca\n\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u021f\n\32\f\32\16\32\u0222"+
		"\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u022b\n\32\f\32\16\32\u022e"+
		"\13\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0236\n\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u023e\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u0247\n\32\f\32\16\32\u024a\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0284\n\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u02d6\n\32\f\32\16\32\u02d9\13\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u02e6\n\34"+
		"\3\35\6\35\u02e9\n\35\r\35\16\35\u02ea\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u02fe\n\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u030a\n \3 \3 \3 \3 \7 \u0310\n \f "+
		"\16 \u0313\13 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\6\"\u0329\n\"\r\"\16\"\u032a\3\"\3\"\3\"\3\"\5\""+
		"\u0331\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u033c\n#\3$\3$\3$\3$\3$\6$\u0343"+
		"\n$\r$\16$\u0344\3$\3$\5$\u0349\n$\3%\3%\3%\3%\3%\3%\7%\u0351\n%\f%\16"+
		"%\u0354\13%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0363\n%\f%\16%"+
		"\u0366\13%\3%\3%\3%\3%\3%\3%\3%\7%\u036f\n%\f%\16%\u0372\13%\3%\5%\u0375"+
		"\n%\3%\2\6\f\30\62>&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFH\2\b\6\2\31\31##))\63\63\6\2\"\"??AAKK\4\2\f\f\30\30"+
		"\t\2\4\4\n\n\24\25\33\33..;;>>\4\2\7\7\60\60\4\2((@@\u03cf\2V\3\2\2\2"+
		"\4i\3\2\2\2\6v\3\2\2\2\bx\3\2\2\2\n\u00af\3\2\2\2\f\u00f0\3\2\2\2\16\u0101"+
		"\3\2\2\2\20\u010a\3\2\2\2\22\u0114\3\2\2\2\24\u0116\3\2\2\2\26\u0119\3"+
		"\2\2\2\30\u0136\3\2\2\2\32\u0155\3\2\2\2\34\u0162\3\2\2\2\36\u016d\3\2"+
		"\2\2 \u017e\3\2\2\2\"\u0180\3\2\2\2$\u0185\3\2\2\2&\u019f\3\2\2\2(\u01a1"+
		"\3\2\2\2*\u01ae\3\2\2\2,\u01c9\3\2\2\2.\u01cb\3\2\2\2\60\u01cf\3\2\2\2"+
		"\62\u0283\3\2\2\2\64\u02da\3\2\2\2\66\u02e5\3\2\2\28\u02e8\3\2\2\2:\u02f0"+
		"\3\2\2\2<\u02fd\3\2\2\2>\u0309\3\2\2\2@\u0314\3\2\2\2B\u0330\3\2\2\2D"+
		"\u033b\3\2\2\2F\u0348\3\2\2\2H\u0374\3\2\2\2JK\7<\2\2KL\5\2\2\2LM\b\2"+
		"\1\2MW\3\2\2\2NO\5\26\f\2OP\7<\2\2PQ\5\2\2\2QR\b\2\1\2RW\3\2\2\2ST\5\26"+
		"\f\2TU\b\2\1\2UW\3\2\2\2VJ\3\2\2\2VN\3\2\2\2VS\3\2\2\2W\3\3\2\2\2XY\7"+
		"X\2\2Yj\b\3\1\2Z[\7V\2\2[j\b\3\1\2\\]\7L\2\2]j\b\3\1\2^_\7M\2\2_j\b\3"+
		"\1\2`a\7W\2\2aj\b\3\1\2bc\7Q\2\2cj\b\3\1\2de\7\\\2\2ej\b\3\1\2fg\5\24"+
		"\13\2gh\b\3\1\2hj\3\2\2\2iX\3\2\2\2iZ\3\2\2\2i\\\3\2\2\2i^\3\2\2\2i`\3"+
		"\2\2\2ib\3\2\2\2id\3\2\2\2if\3\2\2\2j\5\3\2\2\2kl\78\2\2lm\7[\2\2mn\7"+
		"9\2\2no\5\30\r\2op\b\4\1\2pw\3\2\2\2qr\7[\2\2rs\79\2\2st\5\30\r\2tu\b"+
		"\4\1\2uw\3\2\2\2vk\3\2\2\2vq\3\2\2\2w\7\3\2\2\2xy\7\62\2\2yz\7[\2\2z{"+
		"\b\5\1\2{\t\3\2\2\2|}\7\35\2\2}~\7\17\2\2~\177\5F$\2\177\u0080\b\6\1\2"+
		"\u0080\u00b0\3\2\2\2\u0081\u0082\5 \21\2\u0082\u0083\b\6\1\2\u0083\u00b0"+
		"\3\2\2\2\u0084\u0085\7\65\2\2\u0085\u0089\7\\\2\2\u0086\u0088\5D#\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u00b0\b\6\1\2\u008d"+
		"\u008e\7\65\2\2\u008e\u008f\7\\\2\2\u008f\u0090\7%\2\2\u0090\u0094\5\30"+
		"\r\2\u0091\u0093\5D#\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\b\6\1\2\u0098\u00b0\3\2\2\2\u0099\u009a\7\32\2\2\u009a\u009e\5"+
		"&\24\2\u009b\u009d\5$\23\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\b\6\1\2\u00a2\u00b0\3\2\2\2\u00a3\u00a4\7\35\2\2\u00a4"+
		"\u00a5\5\n\6\2\u00a5\u00a6\b\6\1\2\u00a6\u00b0\3\2\2\2\u00a7\u00a9\5 "+
		"\21\2\u00a8\u00aa\5\64\33\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\6"+
		"\1\2\u00ae\u00b0\3\2\2\2\u00af|\3\2\2\2\u00af\u0081\3\2\2\2\u00af\u0084"+
		"\3\2\2\2\u00af\u008d\3\2\2\2\u00af\u0099\3\2\2\2\u00af\u00a3\3\2\2\2\u00af"+
		"\u00a7\3\2\2\2\u00b0\13\3\2\2\2\u00b1\u00b2\b\7\1\2\u00b2\u00b3\7\\\2"+
		"\2\u00b3\u00b4\5\f\7\b\u00b4\u00b5\b\7\1\2\u00b5\u00f1\3\2\2\2\u00b6\u00b7"+
		"\7\6\2\2\u00b7\u00b8\7[\2\2\u00b8\u00b9\7\n\2\2\u00b9\u00bd\5\f\7\2\u00ba"+
		"\u00bc\5\60\31\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c1\7*\2\2\u00c1\u00c2\b\7\1\2\u00c2\u00f1\3\2\2\2\u00c3\u00c4\5\16"+
		"\b\2\u00c4\u00c5\b\7\1\2\u00c5\u00f1\3\2\2\2\u00c6\u00c7\7P\2\2\u00c7"+
		"\u00f1\b\7\1\2\u00c8\u00c9\7\16\2\2\u00c9\u00ca\5\f\7\2\u00ca\u00cb\7"+
		"G\2\2\u00cb\u00cc\b\7\1\2\u00cc\u00f1\3\2\2\2\u00cd\u00ce\7\16\2\2\u00ce"+
		"\u00cf\5\f\7\2\u00cf\u00d0\79\2\2\u00d0\u00d1\5\30\r\2\u00d1\u00d2\7G"+
		"\2\2\u00d2\u00d3\b\7\1\2\u00d3\u00f1\3\2\2\2\u00d4\u00d5\5\4\3\2\u00d5"+
		"\u00d6\b\7\1\2\u00d6\u00f1\3\2\2\2\u00d7\u00d8\7\\\2\2\u00d8\u00f1\b\7"+
		"\1\2\u00d9\u00da\7\16\2\2\u00da\u00dc\5\f\7\2\u00db\u00dd\5(\25\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7G\2\2\u00e1\u00e2\b\7\1\2\u00e2"+
		"\u00f1\3\2\2\2\u00e3\u00e4\5\24\13\2\u00e4\u00e5\b\7\1\2\u00e5\u00f1\3"+
		"\2\2\2\u00e6\u00e7\7:\2\2\u00e7\u00e8\5\22\n\2\u00e8\u00e9\7\27\2\2\u00e9"+
		"\u00ea\b\7\1\2\u00ea\u00f1\3\2\2\2\u00eb\u00ec\7:\2\2\u00ec\u00ed\5\32"+
		"\16\2\u00ed\u00ee\7\27\2\2\u00ee\u00ef\b\7\1\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00b1\3\2\2\2\u00f0\u00b6\3\2\2\2\u00f0\u00c3\3\2\2\2\u00f0\u00c6\3\2"+
		"\2\2\u00f0\u00c8\3\2\2\2\u00f0\u00cd\3\2\2\2\u00f0\u00d4\3\2\2\2\u00f0"+
		"\u00d7\3\2\2\2\u00f0\u00d9\3\2\2\2\u00f0\u00e3\3\2\2\2\u00f0\u00e6\3\2"+
		"\2\2\u00f0\u00eb\3\2\2\2\u00f1\u00fe\3\2\2\2\u00f2\u00f3\f\n\2\2\u00f3"+
		"\u00f4\7<\2\2\u00f4\u00f5\5\f\7\13\u00f5\u00f6\b\7\1\2\u00f6\u00fd\3\2"+
		"\2\2\u00f7\u00f8\f\r\2\2\u00f8\u00f9\7$\2\2\u00f9\u00fa\5\16\b\2\u00fa"+
		"\u00fb\b\7\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f7\3\2"+
		"\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\r\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7[\2\2\u0102\u0103\b\b\1\2"+
		"\u0103\17\3\2\2\2\u0104\u0105\5\62\32\2\u0105\u0106\b\t\1\2\u0106\u010b"+
		"\3\2\2\2\u0107\u0108\5\n\6\2\u0108\u0109\b\t\1\2\u0109\u010b\3\2\2\2\u010a"+
		"\u0104\3\2\2\2\u010a\u0107\3\2\2\2\u010b\21\3\2\2\2\u010c\u010d\5\f\7"+
		"\2\u010d\u010e\b\n\1\2\u010e\u0115\3\2\2\2\u010f\u0110\5\f\7\2\u0110\u0111"+
		"\7\20\2\2\u0111\u0112\5\22\n\2\u0112\u0113\b\n\1\2\u0113\u0115\3\2\2\2"+
		"\u0114\u010c\3\2\2\2\u0114\u010f\3\2\2\2\u0115\23\3\2\2\2\u0116\u0117"+
		"\7O\2\2\u0117\u0118\b\13\1\2\u0118\25\3\2\2\2\u0119\u011a\5\f\7\2\u011a"+
		"\u011b\7\66\2\2\u011b\u011c\5\62\32\2\u011c\u011d\b\f\1\2\u011d\27\3\2"+
		"\2\2\u011e\u011f\b\r\1\2\u011f\u0120\7\16\2\2\u0120\u0121\5\30\r\2\u0121"+
		"\u0122\7G\2\2\u0122\u0123\b\r\1\2\u0123\u0137\3\2\2\2\u0124\u0125\7\16"+
		"\2\2\u0125\u012a\5\30\r\2\u0126\u0127\7\20\2\2\u0127\u0129\5\30\r\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7G\2\2\u012e"+
		"\u012f\7[\2\2\u012f\u0130\b\r\1\2\u0130\u0137\3\2\2\2\u0131\u0132\7[\2"+
		"\2\u0132\u0137\b\r\1\2\u0133\u0134\5\b\5\2\u0134\u0135\b\r\1\2\u0135\u0137"+
		"\3\2\2\2\u0136\u011e\3\2\2\2\u0136\u0124\3\2\2\2\u0136\u0131\3\2\2\2\u0136"+
		"\u0133\3\2\2\2\u0137\u014a\3\2\2\2\u0138\u0139\f\b\2\2\u0139\u013a\7\66"+
		"\2\2\u013a\u013b\5\30\r\t\u013b\u013c\b\r\1\2\u013c\u0149\3\2\2\2\u013d"+
		"\u013f\f\t\2\2\u013e\u0140\5@!\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2"+
		"\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144"+
		"\b\r\1\2\u0144\u0149\3\2\2\2\u0145\u0146\f\5\2\2\u0146\u0147\7[\2\2\u0147"+
		"\u0149\b\r\1\2\u0148\u0138\3\2\2\2\u0148\u013d\3\2\2\2\u0148\u0145\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\31\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\5\f\7\2\u014e\u014f\7\t\2"+
		"\2\u014f\u0150\5\32\16\2\u0150\u0151\b\16\1\2\u0151\u0156\3\2\2\2\u0152"+
		"\u0153\5\f\7\2\u0153\u0154\b\16\1\2\u0154\u0156\3\2\2\2\u0155\u014d\3"+
		"\2\2\2\u0155\u0152\3\2\2\2\u0156\33\3\2\2\2\u0157\u0158\78\2\2\u0158\u0159"+
		"\7[\2\2\u0159\u015a\7\n\2\2\u015a\u015b\5\62\32\2\u015b\u015c\b\17\1\2"+
		"\u015c\u0163\3\2\2\2\u015d\u015e\7[\2\2\u015e\u015f\7\n\2\2\u015f\u0160"+
		"\5\62\32\2\u0160\u0161\b\17\1\2\u0161\u0163\3\2\2\2\u0162\u0157\3\2\2"+
		"\2\u0162\u015d\3\2\2\2\u0163\35\3\2\2\2\u0164\u0165\7<\2\2\u0165\u0166"+
		"\7\\\2\2\u0166\u0167\7%\2\2\u0167\u0168\5\30\r\2\u0168\u0169\b\20\1\2"+
		"\u0169\u016e\3\2\2\2\u016a\u016b\7<\2\2\u016b\u016c\7\\\2\2\u016c\u016e"+
		"\b\20\1\2\u016d\u0164\3\2\2\2\u016d\u016a\3\2\2\2\u016e\37\3\2\2\2\u016f"+
		"\u0171\5\16\b\2\u0170\u0172\5\f\7\2\u0171\u0170\3\2\2\2\u0172\u0173\3"+
		"\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\7\n\2\2\u0176\u0177\5\62\32\2\u0177\u0178\b\21\1\2\u0178\u017f"+
		"\3\2\2\2\u0179\u017a\5\f\7\2\u017a\u017b\7\n\2\2\u017b\u017c\5\62\32\2"+
		"\u017c\u017d\b\21\1\2\u017d\u017f\3\2\2\2\u017e\u016f\3\2\2\2\u017e\u0179"+
		"\3\2\2\2\u017f!\3\2\2\2\u0180\u0181\5\n\6\2\u0181\u0182\7E\2\2\u0182\u0183"+
		"\5\62\32\2\u0183\u0184\b\22\1\2\u0184#\3\2\2\2\u0185\u0186\7H\2\2\u0186"+
		"\u0187\5&\24\2\u0187\u0188\b\23\1\2\u0188%\3\2\2\2\u0189\u018a\5\b\5\2"+
		"\u018a\u018b\5H%\2\u018b\u018c\b\24\1\2\u018c\u01a0\3\2\2\2\u018d\u0196"+
		"\7\16\2\2\u018e\u0193\5\b\5\2\u018f\u0190\7\20\2\2\u0190\u0192\5\b\5\2"+
		"\u0191\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u018e\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7G\2\2\u0199\u019a\5H%"+
		"\2\u019a\u019b\b\24\1\2\u019b\u01a0\3\2\2\2\u019c\u019d\5H%\2\u019d\u019e"+
		"\b\24\1\2\u019e\u01a0\3\2\2\2\u019f\u0189\3\2\2\2\u019f\u018d\3\2\2\2"+
		"\u019f\u019c\3\2\2\2\u01a0\'\3\2\2\2\u01a1\u01a2\7\20\2\2\u01a2\u01a3"+
		"\5\f\7\2\u01a3\u01a4\b\25\1\2\u01a4)\3\2\2\2\u01a5\u01a6\5\20\t\2\u01a6"+
		"\u01a7\7\26\2\2\u01a7\u01a8\5*\26\2\u01a8\u01a9\b\26\1\2\u01a9\u01af\3"+
		"\2\2\2\u01aa\u01ab\5\20\t\2\u01ab\u01ac\7\26\2\2\u01ac\u01ad\b\26\1\2"+
		"\u01ad\u01af\3\2\2\2\u01ae\u01a5\3\2\2\2\u01ae\u01aa\3\2\2\2\u01af+\3"+
		"\2\2\2\u01b0\u01b1\7\37\2\2\u01b1\u01b2\5\2\2\2\u01b2\u01b3\b\27\1\2\u01b3"+
		"\u01ca\3\2\2\2\u01b4\u01b5\7\16\2\2\u01b5\u01b6\5,\27\2\u01b6\u01b7\7"+
		"G\2\2\u01b7\u01b8\b\27\1\2\u01b8\u01ca\3\2\2\2\u01b9\u01ba\5\16\b\2\u01ba"+
		"\u01bb\b\27\1\2\u01bb\u01ca\3\2\2\2\u01bc\u01bd\7D\2\2\u01bd\u01be\5,"+
		"\27\2\u01be\u01bf\7F\2\2\u01bf\u01c0\b\27\1\2\u01c0\u01ca\3\2\2\2\u01c1"+
		"\u01c2\7\3\2\2\u01c2\u01c3\5\26\f\2\u01c3\u01c4\b\27\1\2\u01c4\u01ca\3"+
		"\2\2\2\u01c5\u01c6\7\3\2\2\u01c6\u01c7\58\35\2\u01c7\u01c8\b\27\1\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u01b0\3\2\2\2\u01c9\u01b4\3\2\2\2\u01c9\u01b9\3\2"+
		"\2\2\u01c9\u01bc\3\2\2\2\u01c9\u01c1\3\2\2\2\u01c9\u01c5\3\2\2\2\u01ca"+
		"-\3\2\2\2\u01cb\u01cc\7H\2\2\u01cc\u01cd\5B\"\2\u01cd\u01ce\b\30\1\2\u01ce"+
		"/\3\2\2\2\u01cf\u01d0\7\20\2\2\u01d0\u01d1\7[\2\2\u01d1\u01d2\7\n\2\2"+
		"\u01d2\u01d3\5\f\7\2\u01d3\u01d4\b\31\1\2\u01d4\61\3\2\2\2\u01d5\u01d6"+
		"\b\32\1\2\u01d6\u01d7\7\61\2\2\u01d7\u01d8\5\62\32.\u01d8\u01d9\b\32\1"+
		"\2\u01d9\u0284\3\2\2\2\u01da\u01db\7\\\2\2\u01db\u01dc\5\62\32&\u01dc"+
		"\u01dd\b\32\1\2\u01dd\u0284\3\2\2\2\u01de\u01df\7B\2\2\u01df\u01e0\5\62"+
		"\32 \u01e0\u01e1\b\32\1\2\u01e1\u0284\3\2\2\2\u01e2\u01e3\7A\2\2\u01e3"+
		"\u01e4\5\62\32\36\u01e4\u01e5\b\32\1\2\u01e5\u0284\3\2\2\2\u01e6\u01e7"+
		"\7K\2\2\u01e7\u01e8\5\62\32\35\u01e8\u01e9\b\32\1\2\u01e9\u0284\3\2\2"+
		"\2\u01ea\u01eb\7I\2\2\u01eb\u01ec\5\62\32\26\u01ec\u01ed\b\32\1\2\u01ed"+
		"\u0284\3\2\2\2\u01ee\u01ef\7+\2\2\u01ef\u01f0\5\62\32\2\u01f0\u01f1\7"+
		"!\2\2\u01f1\u01f2\5\62\32\2\u01f2\u01f3\7C\2\2\u01f3\u01f4\5\62\32\16"+
		"\u01f4\u01f5\b\32\1\2\u01f5\u0284\3\2\2\2\u01f6\u01f7\7+\2\2\u01f7\u01f8"+
		"\5\62\32\2\u01f8\u01f9\7!\2\2\u01f9\u01fa\5\62\32\r\u01fa\u01fb\b\32\1"+
		"\2\u01fb\u0284\3\2\2\2\u01fc\u01fd\7J\2\2\u01fd\u01fe\7\\\2\2\u01fe\u01ff"+
		"\5\62\32\6\u01ff\u0200\b\32\1\2\u0200\u0284\3\2\2\2\u0201\u0202\7N\2\2"+
		"\u0202\u0284\b\32\1\2\u0203\u0204\5\16\b\2\u0204\u0205\b\32\1\2\u0205"+
		"\u0284\3\2\2\2\u0206\u0207\5\4\3\2\u0207\u0208\b\32\1\2\u0208\u0284\3"+
		"\2\2\2\u0209\u020a\7\16\2\2\u020a\u020b\5\62\32\2\u020b\u020c\7G\2\2\u020c"+
		"\u020d\b\32\1\2\u020d\u0284\3\2\2\2\u020e\u020f\7D\2\2\u020f\u0210\5\62"+
		"\32\2\u0210\u0211\7F\2\2\u0211\u0212\b\32\1\2\u0212\u0284\3\2\2\2\u0213"+
		"\u0214\7\16\2\2\u0214\u0215\5\62\32\2\u0215\u0216\79\2\2\u0216\u0217\5"+
		"\30\r\2\u0217\u0218\7G\2\2\u0218\u0219\b\32\1\2\u0219\u0284\3\2\2\2\u021a"+
		"\u021b\7\16\2\2\u021b\u0220\5\62\32\2\u021c\u021d\7\20\2\2\u021d\u021f"+
		"\5\62\32\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2"+
		"\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224"+
		"\7G\2\2\u0224\u0225\b\32\1\2\u0225\u0284\3\2\2\2\u0226\u0227\7:\2\2\u0227"+
		"\u022c\5\62\32\2\u0228\u0229\7\20\2\2\u0229\u022b\5\62\32\2\u022a\u0228"+
		"\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0230\7\27\2\2\u0230\u0231\b"+
		"\32\1\2\u0231\u0284\3\2\2\2\u0232\u0233\7/\2\2\u0233\u0235\5<\37\2\u0234"+
		"\u0236\7\20\2\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3"+
		"\2\2\2\u0237\u0238\7\34\2\2\u0238\u0239\b\32\1\2\u0239\u0284\3\2\2\2\u023a"+
		"\u023b\7/\2\2\u023b\u023d\5\62\32\2\u023c\u023e\7\20\2\2\u023d\u023c\3"+
		"\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\7\34\2\2\u0240"+
		"\u0241\b\32\1\2\u0241\u0284\3\2\2\2\u0242\u0243\7\6\2\2\u0243\u0248\5"+
		"\34\17\2\u0244\u0245\7\20\2\2\u0245\u0247\5\34\17\2\u0246\u0244\3\2\2"+
		"\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b"+
		"\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\7*\2\2\u024c\u024d\b\32\1\2\u024d"+
		"\u0284\3\2\2\2\u024e\u024f\5> \2\u024f\u0250\b\32\1\2\u0250\u0284\3\2"+
		"\2\2\u0251\u0252\7\5\2\2\u0252\u0253\5\62\32\2\u0253\u0254\7\r\2\2\u0254"+
		"\u0255\5\62\32\2\u0255\u0256\7\22\2\2\u0256\u0257\b\32\1\2\u0257\u0284"+
		"\3\2\2\2\u0258\u0259\7\13\2\2\u0259\u025a\5\16\b\2\u025a\u025b\7\n\2\2"+
		"\u025b\u025c\5\62\32\2\u025c\u025d\7 \2\2\u025d\u025e\5\62\32\2\u025e"+
		"\u025f\7\r\2\2\u025f\u0260\5\62\32\2\u0260\u0261\7\22\2\2\u0261\u0262"+
		"\b\32\1\2\u0262\u0284\3\2\2\2\u0263\u0264\7\13\2\2\u0264\u0265\5\16\b"+
		"\2\u0265\u0266\7\n\2\2\u0266\u0267\5\62\32\2\u0267\u0268\7\67\2\2\u0268"+
		"\u0269\5\62\32\2\u0269\u026a\7\r\2\2\u026a\u026b\5\62\32\2\u026b\u026c"+
		"\7\22\2\2\u026c\u026d\b\32\1\2\u026d\u0284\3\2\2\2\u026e\u026f\7\36\2"+
		"\2\u026f\u0270\5\62\32\2\u0270\u0271\7=\2\2\u0271\u0272\5\2\2\2\u0272"+
		"\u0273\b\32\1\2\u0273\u0284\3\2\2\2\u0274\u0275\5,\27\2\u0275\u0276\b"+
		"\32\1\2\u0276\u0284\3\2\2\2\u0277\u0278\7J\2\2\u0278\u0279\7\\\2\2\u0279"+
		"\u0284\b\32\1\2\u027a\u027b\7,\2\2\u027b\u027c\5\62\32\2\u027c\u027d\7"+
		"=\2\2\u027d\u027e\5\2\2\2\u027e\u027f\b\32\1\2\u027f\u0284\3\2\2\2\u0280"+
		"\u0281\5\"\22\2\u0281\u0282\b\32\1\2\u0282\u0284\3\2\2\2\u0283\u01d5\3"+
		"\2\2\2\u0283\u01da\3\2\2\2\u0283\u01de\3\2\2\2\u0283\u01e2\3\2\2\2\u0283"+
		"\u01e6\3\2\2\2\u0283\u01ea\3\2\2\2\u0283\u01ee\3\2\2\2\u0283\u01f6\3\2"+
		"\2\2\u0283\u01fc\3\2\2\2\u0283\u0201\3\2\2\2\u0283\u0203\3\2\2\2\u0283"+
		"\u0206\3\2\2\2\u0283\u0209\3\2\2\2\u0283\u020e\3\2\2\2\u0283\u0213\3\2"+
		"\2\2\u0283\u021a\3\2\2\2\u0283\u0226\3\2\2\2\u0283\u0232\3\2\2\2\u0283"+
		"\u023a\3\2\2\2\u0283\u0242\3\2\2\2\u0283\u024e\3\2\2\2\u0283\u0251\3\2"+
		"\2\2\u0283\u0258\3\2\2\2\u0283\u0263\3\2\2\2\u0283\u026e\3\2\2\2\u0283"+
		"\u0274\3\2\2\2\u0283\u0277\3\2\2\2\u0283\u027a\3\2\2\2\u0283\u0280\3\2"+
		"\2\2\u0284\u02d7\3\2\2\2\u0285\u0286\f%\2\2\u0286\u0287\7\t\2\2\u0287"+
		"\u0288\5\62\32%\u0288\u0289\b\32\1\2\u0289\u02d6\3\2\2\2\u028a\u028b\f"+
		"\34\2\2\u028b\u028c\7\b\2\2\u028c\u028d\5\62\32\35\u028d\u028e\b\32\1"+
		"\2\u028e\u02d6\3\2\2\2\u028f\u0290\f\33\2\2\u0290\u0291\7\23\2\2\u0291"+
		"\u0292\5\62\32\34\u0292\u0293\b\32\1\2\u0293\u02d6\3\2\2\2\u0294\u0295"+
		"\f\32\2\2\u0295\u0296\t\2\2\2\u0296\u0297\5\62\32\33\u0297\u0298\b\32"+
		"\1\2\u0298\u02d6\3\2\2\2\u0299\u029a\f\31\2\2\u029a\u029b\t\3\2\2\u029b"+
		"\u029c\5\62\32\32\u029c\u029d\b\32\1\2\u029d\u02d6\3\2\2\2\u029e\u029f"+
		"\f\30\2\2\u029f\u02a0\t\4\2\2\u02a0\u02a1\5\62\32\31\u02a1\u02a2\b\32"+
		"\1\2\u02a2\u02d6\3\2\2\2\u02a3\u02a4\f\27\2\2\u02a4\u02a5\t\5\2\2\u02a5"+
		"\u02a6\5\62\32\30\u02a6\u02a7\b\32\1\2\u02a7\u02d6\3\2\2\2\u02a8\u02a9"+
		"\f\25\2\2\u02a9\u02aa\t\6\2\2\u02aa\u02ab\5\62\32\26\u02ab\u02ac\b\32"+
		"\1\2\u02ac\u02d6\3\2\2\2\u02ad\u02ae\f\24\2\2\u02ae\u02af\t\7\2\2\u02af"+
		"\u02b0\5\62\32\25\u02b0\u02b1\b\32\1\2\u02b1\u02d6\3\2\2\2\u02b2\u02b3"+
		"\f\23\2\2\u02b3\u02b4\7-\2\2\u02b4\u02b5\5\62\32\23\u02b5\u02b6\b\32\1"+
		"\2\u02b6\u02d6\3\2\2\2\u02b7\u02b8\f\21\2\2\u02b8\u02b9\7\64\2\2\u02b9"+
		"\u02ba\7[\2\2\u02ba\u02bb\7\21\2\2\u02bb\u02bc\5\62\32\22\u02bc\u02bd"+
		"\b\32\1\2\u02bd\u02d6\3\2\2\2\u02be\u02bf\f\17\2\2\u02bf\u02c0\7&\2\2"+
		"\u02c0\u02c1\5\62\32\2\u02c1\u02c2\7G\2\2\u02c2\u02c3\7\21\2\2\u02c3\u02c4"+
		"\5\62\32\20\u02c4\u02c5\b\32\1\2\u02c5\u02d6\3\2\2\2\u02c6\u02c7\f\t\2"+
		"\2\u02c7\u02c8\7\'\2\2\u02c8\u02c9\5\62\32\t\u02c9\u02ca\b\32\1\2\u02ca"+
		"\u02d6\3\2\2\2\u02cb\u02cc\f\22\2\2\u02cc\u02cd\7\64\2\2\u02cd\u02ce\7"+
		"[\2\2\u02ce\u02d6\b\32\1\2\u02cf\u02d0\f\20\2\2\u02d0\u02d1\7&\2\2\u02d1"+
		"\u02d2\5\62\32\2\u02d2\u02d3\7G\2\2\u02d3\u02d4\b\32\1\2\u02d4\u02d6\3"+
		"\2\2\2\u02d5\u0285\3\2\2\2\u02d5\u028a\3\2\2\2\u02d5\u028f\3\2\2\2\u02d5"+
		"\u0294\3\2\2\2\u02d5\u0299\3\2\2\2\u02d5\u029e\3\2\2\2\u02d5\u02a3\3\2"+
		"\2\2\u02d5\u02a8\3\2\2\2\u02d5\u02ad\3\2\2\2\u02d5\u02b2\3\2\2\2\u02d5"+
		"\u02b7\3\2\2\2\u02d5\u02be\3\2\2\2\u02d5\u02c6\3\2\2\2\u02d5\u02cb\3\2"+
		"\2\2\u02d5\u02cf\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\63\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\7H\2\2"+
		"\u02db\u02dc\5 \21\2\u02dc\u02dd\b\33\1\2\u02dd\65\3\2\2\2\u02de\u02df"+
		"\7\\\2\2\u02df\u02e0\7%\2\2\u02e0\u02e1\5\30\r\2\u02e1\u02e2\b\34\1\2"+
		"\u02e2\u02e6\3\2\2\2\u02e3\u02e4\7\\\2\2\u02e4\u02e6\b\34\1\2\u02e5\u02de"+
		"\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\67\3\2\2\2\u02e7\u02e9\5\f\7\2\u02e8"+
		"\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\7\66\2\2\u02ed\u02ee\5\62\32\2\u02ee"+
		"\u02ef\b\35\1\2\u02ef9\3\2\2\2\u02f0\u02f1\5*\26\2\u02f1\u02f2\b\36\1"+
		"\2\u02f2;\3\2\2\2\u02f3\u02f4\5\62\32\2\u02f4\u02f5\7\20\2\2\u02f5\u02f6"+
		"\5<\37\2\u02f6\u02f7\b\37\1\2\u02f7\u02fe\3\2\2\2\u02f8\u02f9\5\62\32"+
		"\2\u02f9\u02fa\7\20\2\2\u02fa\u02fb\5\62\32\2\u02fb\u02fc\b\37\1\2\u02fc"+
		"\u02fe\3\2\2\2\u02fd\u02f3\3\2\2\2\u02fd\u02f8\3\2\2\2\u02fe=\3\2\2\2"+
		"\u02ff\u0300\b \1\2\u0300\u0301\7\16\2\2\u0301\u0302\5> \2\u0302\u0303"+
		"\7G\2\2\u0303\u0304\b \1\2\u0304\u030a\3\2\2\2\u0305\u0306\5,\27\2\u0306"+
		"\u0307\5\62\32\2\u0307\u0308\b \1\2\u0308\u030a\3\2\2\2\u0309\u02ff\3"+
		"\2\2\2\u0309\u0305\3\2\2\2\u030a\u0311\3\2\2\2\u030b\u030c\f\4\2\2\u030c"+
		"\u030d\5\62\32\2\u030d\u030e\b \1\2\u030e\u0310\3\2\2\2\u030f\u030b\3"+
		"\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"?\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u0315\7\63\2\2\u0315\u0316\5\30\r"+
		"\2\u0316\u0317\b!\1\2\u0317A\3\2\2\2\u0318\u0319\5\16\b\2\u0319\u031a"+
		"\7\n\2\2\u031a\u031b\5\62\32\2\u031b\u031c\b\"\1\2\u031c\u0331\3\2\2\2"+
		"\u031d\u031e\7\16\2\2\u031e\u031f\5\16\b\2\u031f\u0320\79\2\2\u0320\u0321"+
		"\5\30\r\2\u0321\u0322\7G\2\2\u0322\u0323\7\n\2\2\u0323\u0324\5\62\32\2"+
		"\u0324\u0325\b\"\1\2\u0325\u0331\3\2\2\2\u0326\u0328\5\16\b\2\u0327\u0329"+
		"\5\f\7\2\u0328\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0328\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\7\n\2\2\u032d\u032e\5\62"+
		"\32\2\u032e\u032f\b\"\1\2\u032f\u0331\3\2\2\2\u0330\u0318\3\2\2\2\u0330"+
		"\u031d\3\2\2\2\u0330\u0326\3\2\2\2\u0331C\3\2\2\2\u0332\u0333\7H\2\2\u0333"+
		"\u0334\7\\\2\2\u0334\u0335\7%\2\2\u0335\u0336\5\30\r\2\u0336\u0337\b#"+
		"\1\2\u0337\u033c\3\2\2\2\u0338\u0339\7H\2\2\u0339\u033a\7\\\2\2\u033a"+
		"\u033c\b#\1\2\u033b\u0332\3\2\2\2\u033b\u0338\3\2\2\2\u033cE\3\2\2\2\u033d"+
		"\u033e\5B\"\2\u033e\u033f\b$\1\2\u033f\u0349\3\2\2\2\u0340\u0342\5B\""+
		"\2\u0341\u0343\5.\30\2\u0342\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0342"+
		"\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\b$\1\2\u0347"+
		"\u0349\3\2\2\2\u0348\u033d\3\2\2\2\u0348\u0340\3\2\2\2\u0349G\3\2\2\2"+
		"\u034a\u034b\7[\2\2\u034b\u034c\7\n\2\2\u034c\u034d\7\\\2\2\u034d\u034e"+
		"\7%\2\2\u034e\u0352\5\30\r\2\u034f\u0351\5\36\20\2\u0350\u034f\3\2\2\2"+
		"\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355"+
		"\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0356\b%\1\2\u0356\u0375\3\2\2\2\u0357"+
		"\u0358\7[\2\2\u0358\u0359\7;\2\2\u0359\u035a\5\30\r\2\u035a\u035b\b%\1"+
		"\2\u035b\u0375\3\2\2\2\u035c\u035d\5\16\b\2\u035d\u035e\7\n\2\2\u035e"+
		"\u035f\7\6\2\2\u035f\u0364\5\6\4\2\u0360\u0361\7\20\2\2\u0361\u0363\5"+
		"\6\4\2\u0362\u0360\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0364"+
		"\u0365\3\2\2\2\u0365\u0367\3\2\2\2\u0366\u0364\3\2\2\2\u0367\u0368\7*"+
		"\2\2\u0368\u0369\b%\1\2\u0369\u0375\3\2\2\2\u036a\u036b\7[\2\2\u036b\u036c"+
		"\7\n\2\2\u036c\u0370\7\\\2\2\u036d\u036f\5\36\20\2\u036e\u036d\3\2\2\2"+
		"\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373"+
		"\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0375\b%\1\2\u0374\u034a\3\2\2\2\u0374"+
		"\u0357\3\2\2\2\u0374\u035c\3\2\2\2\u0374\u036a\3\2\2\2\u0375I\3\2\2\2"+
		"\66Viv\u0089\u0094\u009e\u00ab\u00af\u00bd\u00de\u00f0\u00fc\u00fe\u010a"+
		"\u0114\u012a\u0136\u0141\u0148\u014a\u0155\u0162\u016d\u0173\u017e\u0193"+
		"\u0196\u019f\u01ae\u01c9\u0220\u022c\u0235\u023d\u0248\u0283\u02d5\u02d7"+
		"\u02e5\u02ea\u02fd\u0309\u0311\u032a\u0330\u033b\u0344\u0348\u0352\u0364"+
		"\u0370\u0374";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}