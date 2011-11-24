// $ANTLR 3.2 Sep 23, 2009 12:02:23 /homes/rn710/workspace/MonitorPrototype/src/Monitor.g 2011-11-17 17:27:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class MonitorParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INTERACTION", "PLUS", "MINUS", "MULT", "DIV", "FULLSTOP", "RESV", "SEND", "BRANCH", "UNORDERED", "RECLABEL", "ANNOTATION", "ID", "StringLiteral", "NUMBER", "DIGIT", "WHITESPACE", "ML_COMMENT", "LINE_COMMENT", "'import'", "'protocol'", "','", "';'", "'from'", "'as'", "'at'", "'{'", "'}'", "'('", "')'", "'role'", "'introduces'", "'to'", "'choice'", "'or'", "':'", "'repeat'", "'rec'", "'end'", "'run'", "'inline'", "'parallel'", "'and'", "'do'", "'interrupt'", "'unordered'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RESV=10;
    public static final int T__23=23;
    public static final int ANNOTATION=15;
    public static final int ID=16;
    public static final int EOF=-1;
    public static final int ML_COMMENT=21;
    public static final int INTERACTION=4;
    public static final int FULLSTOP=9;
    public static final int PLUS=5;
    public static final int SEND=11;
    public static final int DIGIT=19;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int LINE_COMMENT=22;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RECLABEL=14;
    public static final int NUMBER=18;
    public static final int WHITESPACE=20;
    public static final int MINUS=6;
    public static final int MULT=7;
    public static final int UNORDERED=13;
    public static final int StringLiteral=17;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int BRANCH=12;
    public static final int DIV=8;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "synpred29_Monitor", "synpred21_Monitor", "introducesDef", 
        "synpred23_Monitor", "importProtocolDef", "synpred48_Monitor", "simpleName", 
        "synpred17_Monitor", "parameterDefs", "synpred30_Monitor", "synpred10_Monitor", 
        "synpred27_Monitor", "synpred33_Monitor", "inlineDef", "synpred52_Monitor", 
        "recursionDef", "unorderedDef", "synpred28_Monitor", "dataTypeDef", 
        "synpred35_Monitor", "synpred20_Monitor", "synpred55_Monitor", "synpred47_Monitor", 
        "runDef", "parameterDef", "synpred53_Monitor", "activityDef", "choiceDef", 
        "typeReferenceDef", "activityList", "synpred22_Monitor", "blockDef", 
        "factor", "recBlockDef", "synpred24_Monitor", "synpred51_Monitor", 
        "interruptDef", "protocolRefDef", "description", "synpred49_Monitor", 
        "repeatDef", "importTypeStatement", "synpred11_Monitor", "synpred1_Monitor", 
        "synpred15_Monitor", "expr", "synpred13_Monitor", "interactionSignatureDef", 
        "synpred7_Monitor", "protocolBlockDef", "synpred41_Monitor", "globalEscapeDef", 
        "synpred42_Monitor", "synpred39_Monitor", "endDef", "synpred16_Monitor", 
        "synpred32_Monitor", "synpred46_Monitor", "parallelDef", "declarationName", 
        "synpred9_Monitor", "roleDef", "synpred26_Monitor", "synpred44_Monitor", 
        "term", "protocolDef", "synpred34_Monitor", "synpred38_Monitor", 
        "synpred4_Monitor", "synpred5_Monitor", "synpred50_Monitor", "synpred31_Monitor", 
        "synpred40_Monitor", "synpred6_Monitor", "synpred3_Monitor", "synpred36_Monitor", 
        "directedChoiceDef", "synpred45_Monitor", "roleName", "synpred54_Monitor", 
        "importTypeDef", "synpred18_Monitor", "synpred19_Monitor", "synpred43_Monitor", 
        "parameter", "importProtocolStatement", "synpred14_Monitor", "synpred25_Monitor", 
        "synpred2_Monitor", "synpred12_Monitor", "synpred37_Monitor", "activityListDef", 
        "labelName", "interactionDef", "onMessageDef", "protocolName", "synpred8_Monitor"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public MonitorParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public MonitorParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public MonitorParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return MonitorParser.tokenNames; }
    public String getGrammarFileName() { return "/homes/rn710/workspace/MonitorPrototype/src/Monitor.g"; }


    public static class description_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "description"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:1: description : ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef ;
    public final MonitorParser.description_return description() throws RecognitionException {
        MonitorParser.description_return retval = new MonitorParser.description_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANNOTATION1=null;
        Token ANNOTATION4=null;
        MonitorParser.importProtocolStatement_return importProtocolStatement2 = null;

        MonitorParser.importTypeStatement_return importTypeStatement3 = null;

        MonitorParser.protocolDef_return protocolDef5 = null;


        Object ANNOTATION1_tree=null;
        Object ANNOTATION4_tree=null;
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleSubtreeStream stream_importTypeStatement=new RewriteRuleSubtreeStream(adaptor,"rule importTypeStatement");
        RewriteRuleSubtreeStream stream_protocolDef=new RewriteRuleSubtreeStream(adaptor,"rule protocolDef");
        RewriteRuleSubtreeStream stream_importProtocolStatement=new RewriteRuleSubtreeStream(adaptor,"rule importProtocolStatement");
        try { dbg.enterRule(getGrammarFileName(), "description");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:12: ( ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef
            {
            dbg.location(27,14);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                try {
                    isCyclicDecision = true;
                    alt3 = dfa3.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:16: ( ANNOTATION )* ( importProtocolStatement | importTypeStatement )
            	    {
            	    dbg.location(27,16);
            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:16: ( ANNOTATION )*
            	    try { dbg.enterSubRule(1);

            	    loop1:
            	    do {
            	        int alt1=2;
            	        try { dbg.enterDecision(1);

            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==ANNOTATION) ) {
            	            alt1=1;
            	        }


            	        } finally {dbg.exitDecision(1);}

            	        switch (alt1) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:18: ANNOTATION
            	    	    {
            	    	    dbg.location(27,18);
            	    	    ANNOTATION1=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_description146); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION1);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(1);}

            	    dbg.location(27,32);
            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:32: ( importProtocolStatement | importTypeStatement )
            	    int alt2=2;
            	    try { dbg.enterSubRule(2);
            	    try { dbg.enterDecision(2);

            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==23) ) {
            	        int LA2_1 = input.LA(2);

            	        if ( (LA2_1==24) ) {
            	            alt2=1;
            	        }
            	        else if ( ((LA2_1>=ID && LA2_1<=StringLiteral)) ) {
            	            alt2=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 2, 1, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(2);}

            	    switch (alt2) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:34: importProtocolStatement
            	            {
            	            dbg.location(27,34);
            	            pushFollow(FOLLOW_importProtocolStatement_in_description153);
            	            importProtocolStatement2=importProtocolStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_importProtocolStatement.add(importProtocolStatement2.getTree());

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:60: importTypeStatement
            	            {
            	            dbg.location(27,60);
            	            pushFollow(FOLLOW_importTypeStatement_in_description157);
            	            importTypeStatement3=importTypeStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_importTypeStatement.add(importTypeStatement3.getTree());

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(2);}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(27,85);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:85: ( ANNOTATION )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==ANNOTATION) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:87: ANNOTATION
            	    {
            	    dbg.location(27,87);
            	    ANNOTATION4=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_description166); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION4);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(27,101);
            pushFollow(FOLLOW_protocolDef_in_description171);
            protocolDef5=protocolDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protocolDef.add(protocolDef5.getTree());


            // AST REWRITE
            // elements: protocolDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 27:113: -> protocolDef
            {
                dbg.location(27,116);
                adaptor.addChild(root_0, stream_protocolDef.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(27, 127);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "description");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "description"

    public static class importProtocolStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importProtocolStatement"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:29:1: importProtocolStatement : 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' ;
    public final MonitorParser.importProtocolStatement_return importProtocolStatement() throws RecognitionException {
        MonitorParser.importProtocolStatement_return retval = new MonitorParser.importProtocolStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal6=null;
        Token string_literal7=null;
        Token char_literal9=null;
        Token char_literal11=null;
        MonitorParser.importProtocolDef_return importProtocolDef8 = null;

        MonitorParser.importProtocolDef_return importProtocolDef10 = null;


        Object string_literal6_tree=null;
        Object string_literal7_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "importProtocolStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:29:24: ( 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:29:26: 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(29,26);
            string_literal6=(Token)match(input,23,FOLLOW_23_in_importProtocolStatement182); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal6_tree = (Object)adaptor.create(string_literal6);
            adaptor.addChild(root_0, string_literal6_tree);
            }
            dbg.location(29,35);
            string_literal7=(Token)match(input,24,FOLLOW_24_in_importProtocolStatement184); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal7_tree = (Object)adaptor.create(string_literal7);
            adaptor.addChild(root_0, string_literal7_tree);
            }
            dbg.location(29,46);
            pushFollow(FOLLOW_importProtocolDef_in_importProtocolStatement186);
            importProtocolDef8=importProtocolDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importProtocolDef8.getTree());
            dbg.location(29,64);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:29:64: ( ',' importProtocolDef )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:29:66: ',' importProtocolDef
            	    {
            	    dbg.location(29,69);
            	    char_literal9=(Token)match(input,25,FOLLOW_25_in_importProtocolStatement190); if (state.failed) return retval;
            	    dbg.location(29,71);
            	    pushFollow(FOLLOW_importProtocolDef_in_importProtocolStatement193);
            	    importProtocolDef10=importProtocolDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, importProtocolDef10.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(29,95);
            char_literal11=(Token)match(input,26,FOLLOW_26_in_importProtocolStatement198); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(29, 97);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "importProtocolStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "importProtocolStatement"

    public static class importProtocolDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importProtocolDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:31:1: importProtocolDef : ID 'from' StringLiteral ;
    public final MonitorParser.importProtocolDef_return importProtocolDef() throws RecognitionException {
        MonitorParser.importProtocolDef_return retval = new MonitorParser.importProtocolDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID12=null;
        Token string_literal13=null;
        Token StringLiteral14=null;

        Object ID12_tree=null;
        Object string_literal13_tree=null;
        Object StringLiteral14_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "importProtocolDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:31:18: ( ID 'from' StringLiteral )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:31:20: ID 'from' StringLiteral
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(31,20);
            ID12=(Token)match(input,ID,FOLLOW_ID_in_importProtocolDef207); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID12_tree = (Object)adaptor.create(ID12);
            adaptor.addChild(root_0, ID12_tree);
            }
            dbg.location(31,29);
            string_literal13=(Token)match(input,27,FOLLOW_27_in_importProtocolDef209); if (state.failed) return retval;
            dbg.location(31,31);
            StringLiteral14=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_importProtocolDef212); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral14_tree = (Object)adaptor.create(StringLiteral14);
            adaptor.addChild(root_0, StringLiteral14_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(31, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "importProtocolDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "importProtocolDef"

    public static class importTypeStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importTypeStatement"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:1: importTypeStatement : 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' ;
    public final MonitorParser.importTypeStatement_return importTypeStatement() throws RecognitionException {
        MonitorParser.importTypeStatement_return retval = new MonitorParser.importTypeStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal15=null;
        Token char_literal18=null;
        Token string_literal20=null;
        Token StringLiteral21=null;
        Token char_literal22=null;
        MonitorParser.simpleName_return simpleName16 = null;

        MonitorParser.importTypeDef_return importTypeDef17 = null;

        MonitorParser.importTypeDef_return importTypeDef19 = null;


        Object string_literal15_tree=null;
        Object char_literal18_tree=null;
        Object string_literal20_tree=null;
        Object StringLiteral21_tree=null;
        Object char_literal22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "importTypeStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:20: ( 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:22: 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(33,22);
            string_literal15=(Token)match(input,23,FOLLOW_23_in_importTypeStatement225); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal15_tree = (Object)adaptor.create(string_literal15);
            adaptor.addChild(root_0, string_literal15_tree);
            }
            dbg.location(33,31);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:31: ( simpleName )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=ID && LA6_1<=StringLiteral)) ) {
                    alt6=1;
                }
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:33: simpleName
                    {
                    dbg.location(33,33);
                    pushFollow(FOLLOW_simpleName_in_importTypeStatement229);
                    simpleName16=simpleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleName16.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(33,47);
            pushFollow(FOLLOW_importTypeDef_in_importTypeStatement234);
            importTypeDef17=importTypeDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importTypeDef17.getTree());
            dbg.location(33,61);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:61: ( ',' importTypeDef )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:63: ',' importTypeDef
            	    {
            	    dbg.location(33,66);
            	    char_literal18=(Token)match(input,25,FOLLOW_25_in_importTypeStatement238); if (state.failed) return retval;
            	    dbg.location(33,68);
            	    pushFollow(FOLLOW_importTypeDef_in_importTypeStatement241);
            	    importTypeDef19=importTypeDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, importTypeDef19.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(33,85);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:85: ( 'from' StringLiteral )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:87: 'from' StringLiteral
                    {
                    dbg.location(33,93);
                    string_literal20=(Token)match(input,27,FOLLOW_27_in_importTypeStatement248); if (state.failed) return retval;
                    dbg.location(33,95);
                    StringLiteral21=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_importTypeStatement251); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral21_tree = (Object)adaptor.create(StringLiteral21);
                    adaptor.addChild(root_0, StringLiteral21_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(33,115);
            char_literal22=(Token)match(input,26,FOLLOW_26_in_importTypeStatement256); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(33, 117);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "importTypeStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "importTypeStatement"

    public static class importTypeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importTypeDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:35:1: importTypeDef : ( dataTypeDef 'as' )? ID ;
    public final MonitorParser.importTypeDef_return importTypeDef() throws RecognitionException {
        MonitorParser.importTypeDef_return retval = new MonitorParser.importTypeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal24=null;
        Token ID25=null;
        MonitorParser.dataTypeDef_return dataTypeDef23 = null;


        Object string_literal24_tree=null;
        Object ID25_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "importTypeDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:35:14: ( ( dataTypeDef 'as' )? ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:35:16: ( dataTypeDef 'as' )? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(35,16);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:35:16: ( dataTypeDef 'as' )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==StringLiteral) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:35:18: dataTypeDef 'as'
                    {
                    dbg.location(35,18);
                    pushFollow(FOLLOW_dataTypeDef_in_importTypeDef267);
                    dataTypeDef23=dataTypeDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dataTypeDef23.getTree());
                    dbg.location(35,34);
                    string_literal24=(Token)match(input,28,FOLLOW_28_in_importTypeDef269); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(35,39);
            ID25=(Token)match(input,ID,FOLLOW_ID_in_importTypeDef275); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID25_tree = (Object)adaptor.create(ID25);
            adaptor.addChild(root_0, ID25_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(35, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "importTypeDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "importTypeDef"

    public static class dataTypeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dataTypeDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:37:1: dataTypeDef : StringLiteral ;
    public final MonitorParser.dataTypeDef_return dataTypeDef() throws RecognitionException {
        MonitorParser.dataTypeDef_return retval = new MonitorParser.dataTypeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral26=null;

        Object StringLiteral26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dataTypeDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:37:12: ( StringLiteral )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:37:14: StringLiteral
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(37,14);
            StringLiteral26=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dataTypeDef283); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral26_tree = (Object)adaptor.create(StringLiteral26);
            adaptor.addChild(root_0, StringLiteral26_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(37, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dataTypeDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dataTypeDef"

    public static class simpleName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleName"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:39:1: simpleName : ID ;
    public final MonitorParser.simpleName_return simpleName() throws RecognitionException {
        MonitorParser.simpleName_return retval = new MonitorParser.simpleName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID27=null;

        Object ID27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "simpleName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:39:11: ( ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:39:13: ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(39,13);
            ID27=(Token)match(input,ID,FOLLOW_ID_in_simpleName291); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID27_tree = (Object)adaptor.create(ID27);
            adaptor.addChild(root_0, ID27_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(39, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "simpleName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "simpleName"

    public static class protocolDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protocolDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:1: protocolDef : 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( 'protocol' protocolBlockDef ( protocolDef )* ) ;
    public final MonitorParser.protocolDef_return protocolDef() throws RecognitionException {
        MonitorParser.protocolDef_return retval = new MonitorParser.protocolDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal28=null;
        Token string_literal30=null;
        Token char_literal33=null;
        Token ANNOTATION35=null;
        Token char_literal37=null;
        MonitorParser.protocolName_return protocolName29 = null;

        MonitorParser.roleName_return roleName31 = null;

        MonitorParser.parameterDefs_return parameterDefs32 = null;

        MonitorParser.protocolBlockDef_return protocolBlockDef34 = null;

        MonitorParser.protocolDef_return protocolDef36 = null;


        Object string_literal28_tree=null;
        Object string_literal30_tree=null;
        Object char_literal33_tree=null;
        Object ANNOTATION35_tree=null;
        Object char_literal37_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_parameterDefs=new RewriteRuleSubtreeStream(adaptor,"rule parameterDefs");
        RewriteRuleSubtreeStream stream_protocolDef=new RewriteRuleSubtreeStream(adaptor,"rule protocolDef");
        RewriteRuleSubtreeStream stream_protocolName=new RewriteRuleSubtreeStream(adaptor,"rule protocolName");
        RewriteRuleSubtreeStream stream_protocolBlockDef=new RewriteRuleSubtreeStream(adaptor,"rule protocolBlockDef");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        try { dbg.enterRule(getGrammarFileName(), "protocolDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:12: ( 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( 'protocol' protocolBlockDef ( protocolDef )* ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:14: 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}'
            {
            dbg.location(41,14);
            string_literal28=(Token)match(input,24,FOLLOW_24_in_protocolDef299); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_24.add(string_literal28);

            dbg.location(41,25);
            pushFollow(FOLLOW_protocolName_in_protocolDef301);
            protocolName29=protocolName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protocolName.add(protocolName29.getTree());
            dbg.location(41,38);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:38: ( 'at' roleName )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:40: 'at' roleName
                    {
                    dbg.location(41,40);
                    string_literal30=(Token)match(input,29,FOLLOW_29_in_protocolDef305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(string_literal30);

                    dbg.location(41,45);
                    pushFollow(FOLLOW_roleName_in_protocolDef307);
                    roleName31=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName31.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(41,57);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:57: ( parameterDefs )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:59: parameterDefs
                    {
                    dbg.location(41,59);
                    pushFollow(FOLLOW_parameterDefs_in_protocolDef314);
                    parameterDefs32=parameterDefs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameterDefs.add(parameterDefs32.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(41,76);
            char_literal33=(Token)match(input,30,FOLLOW_30_in_protocolDef319); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal33);

            dbg.location(41,80);
            pushFollow(FOLLOW_protocolBlockDef_in_protocolDef321);
            protocolBlockDef34=protocolBlockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protocolBlockDef.add(protocolBlockDef34.getTree());
            dbg.location(41,97);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:97: ( ( ANNOTATION )* protocolDef )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==ANNOTATION||LA13_0==24) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:99: ( ANNOTATION )* protocolDef
            	    {
            	    dbg.location(41,99);
            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:99: ( ANNOTATION )*
            	    try { dbg.enterSubRule(12);

            	    loop12:
            	    do {
            	        int alt12=2;
            	        try { dbg.enterDecision(12);

            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==ANNOTATION) ) {
            	            alt12=1;
            	        }


            	        } finally {dbg.exitDecision(12);}

            	        switch (alt12) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:101: ANNOTATION
            	    	    {
            	    	    dbg.location(41,101);
            	    	    ANNOTATION35=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_protocolDef327); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION35);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(12);}

            	    dbg.location(41,115);
            	    pushFollow(FOLLOW_protocolDef_in_protocolDef332);
            	    protocolDef36=protocolDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protocolDef.add(protocolDef36.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}

            dbg.location(41,130);
            char_literal37=(Token)match(input,31,FOLLOW_31_in_protocolDef337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(char_literal37);



            // AST REWRITE
            // elements: 24, protocolDef, protocolBlockDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 42:7: -> ^( 'protocol' protocolBlockDef ( protocolDef )* )
            {
                dbg.location(42,10);
                // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:42:10: ^( 'protocol' protocolBlockDef ( protocolDef )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(42,12);
                root_1 = (Object)adaptor.becomeRoot(stream_24.nextNode(), root_1);

                dbg.location(42,23);
                adaptor.addChild(root_1, stream_protocolBlockDef.nextTree());
                dbg.location(42,40);
                // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:42:40: ( protocolDef )*
                while ( stream_protocolDef.hasNext() ) {
                    dbg.location(42,40);
                    adaptor.addChild(root_1, stream_protocolDef.nextTree());

                }
                stream_protocolDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(42, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "protocolDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "protocolDef"

    public static class protocolName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protocolName"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:44:1: protocolName : ID ;
    public final MonitorParser.protocolName_return protocolName() throws RecognitionException {
        MonitorParser.protocolName_return retval = new MonitorParser.protocolName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID38=null;

        Object ID38_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "protocolName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:44:13: ( ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:44:15: ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(44,15);
            ID38=(Token)match(input,ID,FOLLOW_ID_in_protocolName361); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID38_tree = (Object)adaptor.create(ID38);
            adaptor.addChild(root_0, ID38_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(44, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "protocolName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "protocolName"

    public static class parameterDefs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterDefs"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:46:1: parameterDefs : '(' parameterDef ( ',' parameterDef )* ')' ;
    public final MonitorParser.parameterDefs_return parameterDefs() throws RecognitionException {
        MonitorParser.parameterDefs_return retval = new MonitorParser.parameterDefs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal39=null;
        Token char_literal41=null;
        Token char_literal43=null;
        MonitorParser.parameterDef_return parameterDef40 = null;

        MonitorParser.parameterDef_return parameterDef42 = null;


        Object char_literal39_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "parameterDefs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:46:14: ( '(' parameterDef ( ',' parameterDef )* ')' )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:46:16: '(' parameterDef ( ',' parameterDef )* ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(46,19);
            char_literal39=(Token)match(input,32,FOLLOW_32_in_parameterDefs369); if (state.failed) return retval;
            dbg.location(46,21);
            pushFollow(FOLLOW_parameterDef_in_parameterDefs372);
            parameterDef40=parameterDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameterDef40.getTree());
            dbg.location(46,34);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:46:34: ( ',' parameterDef )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:46:36: ',' parameterDef
            	    {
            	    dbg.location(46,39);
            	    char_literal41=(Token)match(input,25,FOLLOW_25_in_parameterDefs376); if (state.failed) return retval;
            	    dbg.location(46,41);
            	    pushFollow(FOLLOW_parameterDef_in_parameterDefs379);
            	    parameterDef42=parameterDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameterDef42.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}

            dbg.location(46,60);
            char_literal43=(Token)match(input,33,FOLLOW_33_in_parameterDefs384); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(46, 62);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parameterDefs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parameterDefs"

    public static class parameterDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:1: parameterDef : ( typeReferenceDef | 'role' ) simpleName ;
    public final MonitorParser.parameterDef_return parameterDef() throws RecognitionException {
        MonitorParser.parameterDef_return retval = new MonitorParser.parameterDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal45=null;
        MonitorParser.typeReferenceDef_return typeReferenceDef44 = null;

        MonitorParser.simpleName_return simpleName46 = null;


        Object string_literal45_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "parameterDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:13: ( ( typeReferenceDef | 'role' ) simpleName )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:15: ( typeReferenceDef | 'role' ) simpleName
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(48,15);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:15: ( typeReferenceDef | 'role' )
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==34) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:17: typeReferenceDef
                    {
                    dbg.location(48,17);
                    pushFollow(FOLLOW_typeReferenceDef_in_parameterDef395);
                    typeReferenceDef44=typeReferenceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeReferenceDef44.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:36: 'role'
                    {
                    dbg.location(48,36);
                    string_literal45=(Token)match(input,34,FOLLOW_34_in_parameterDef399); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal45_tree = (Object)adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(48,45);
            pushFollow(FOLLOW_simpleName_in_parameterDef403);
            simpleName46=simpleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleName46.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(48, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parameterDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parameterDef"

    public static class protocolBlockDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protocolBlockDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:50:1: protocolBlockDef : activityListDef -> activityListDef ;
    public final MonitorParser.protocolBlockDef_return protocolBlockDef() throws RecognitionException {
        MonitorParser.protocolBlockDef_return retval = new MonitorParser.protocolBlockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.activityListDef_return activityListDef47 = null;


        RewriteRuleSubtreeStream stream_activityListDef=new RewriteRuleSubtreeStream(adaptor,"rule activityListDef");
        try { dbg.enterRule(getGrammarFileName(), "protocolBlockDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:50:17: ( activityListDef -> activityListDef )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:50:19: activityListDef
            {
            dbg.location(50,19);
            pushFollow(FOLLOW_activityListDef_in_protocolBlockDef411);
            activityListDef47=activityListDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_activityListDef.add(activityListDef47.getTree());


            // AST REWRITE
            // elements: activityListDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:35: -> activityListDef
            {
                dbg.location(50,38);
                adaptor.addChild(root_0, stream_activityListDef.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(50, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "protocolBlockDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "protocolBlockDef"

    public static class blockDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:52:1: blockDef : '{' activityListDef '}' -> ^( BRANCH activityListDef ) ;
    public final MonitorParser.blockDef_return blockDef() throws RecognitionException {
        MonitorParser.blockDef_return retval = new MonitorParser.blockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        MonitorParser.activityListDef_return activityListDef49 = null;


        Object char_literal48_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_activityListDef=new RewriteRuleSubtreeStream(adaptor,"rule activityListDef");
        try { dbg.enterRule(getGrammarFileName(), "blockDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:52:9: ( '{' activityListDef '}' -> ^( BRANCH activityListDef ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:52:11: '{' activityListDef '}'
            {
            dbg.location(52,11);
            char_literal48=(Token)match(input,30,FOLLOW_30_in_blockDef422); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_30.add(char_literal48);

            dbg.location(52,15);
            pushFollow(FOLLOW_activityListDef_in_blockDef424);
            activityListDef49=activityListDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_activityListDef.add(activityListDef49.getTree());
            dbg.location(52,31);
            char_literal50=(Token)match(input,31,FOLLOW_31_in_blockDef426); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_31.add(char_literal50);



            // AST REWRITE
            // elements: activityListDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 52:35: -> ^( BRANCH activityListDef )
            {
                dbg.location(52,38);
                // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:52:38: ^( BRANCH activityListDef )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(52,40);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BRANCH, "BRANCH"), root_1);

                dbg.location(52,47);
                adaptor.addChild(root_1, stream_activityListDef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(52, 63);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blockDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "blockDef"

    public static class activityListDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "activityListDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:1: activityListDef : ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ ;
    public final MonitorParser.activityListDef_return activityListDef() throws RecognitionException {
        MonitorParser.activityListDef_return retval = new MonitorParser.activityListDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANNOTATION51=null;
        MonitorParser.activityDef_return activityDef52 = null;


        Object ANNOTATION51_tree=null;
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleSubtreeStream stream_activityDef=new RewriteRuleSubtreeStream(adaptor,"rule activityDef");
        try { dbg.enterRule(getGrammarFileName(), "activityListDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:16: ( ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:18: ( ( ANNOTATION )* activityDef )*
            {
            dbg.location(54,18);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:18: ( ( ANNOTATION )* activityDef )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                try {
                    isCyclicDecision = true;
                    alt17 = dfa17.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:20: ( ANNOTATION )* activityDef
            	    {
            	    dbg.location(54,20);
            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:20: ( ANNOTATION )*
            	    try { dbg.enterSubRule(16);

            	    loop16:
            	    do {
            	        int alt16=2;
            	        try { dbg.enterDecision(16);

            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==ANNOTATION) ) {
            	            alt16=1;
            	        }


            	        } finally {dbg.exitDecision(16);}

            	        switch (alt16) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:22: ANNOTATION
            	    	    {
            	    	    dbg.location(54,22);
            	    	    ANNOTATION51=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_activityListDef445); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION51);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(16);}

            	    dbg.location(54,36);
            	    pushFollow(FOLLOW_activityDef_in_activityListDef450);
            	    activityDef52=activityDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_activityDef.add(activityDef52.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}



            // AST REWRITE
            // elements: activityDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 54:51: -> ( activityDef )+
            {
                dbg.location(54,54);
                if ( !(stream_activityDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_activityDef.hasNext() ) {
                    dbg.location(54,54);
                    adaptor.addChild(root_0, stream_activityDef.nextTree());

                }
                stream_activityDef.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(54, 66);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "activityListDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "activityListDef"

    public static class activityDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "activityDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:1: activityDef : ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef );
    public final MonitorParser.activityDef_return activityDef() throws RecognitionException {
        MonitorParser.activityDef_return retval = new MonitorParser.activityDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal59=null;
        MonitorParser.introducesDef_return introducesDef53 = null;

        MonitorParser.interactionDef_return interactionDef54 = null;

        MonitorParser.inlineDef_return inlineDef55 = null;

        MonitorParser.runDef_return runDef56 = null;

        MonitorParser.recursionDef_return recursionDef57 = null;

        MonitorParser.endDef_return endDef58 = null;

        MonitorParser.choiceDef_return choiceDef60 = null;

        MonitorParser.directedChoiceDef_return directedChoiceDef61 = null;

        MonitorParser.parallelDef_return parallelDef62 = null;

        MonitorParser.repeatDef_return repeatDef63 = null;

        MonitorParser.unorderedDef_return unorderedDef64 = null;

        MonitorParser.recBlockDef_return recBlockDef65 = null;

        MonitorParser.globalEscapeDef_return globalEscapeDef66 = null;


        Object char_literal59_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "activityDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:12: ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef )
            int alt19=8;
            try { dbg.enterDecision(19);

            switch ( input.LA(1) ) {
            case ID:
            case 42:
            case 43:
            case 44:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case 27:
            case 30:
            case 36:
                {
                alt19=3;
                }
                break;
            case 45:
                {
                alt19=4;
                }
                break;
            case 40:
                {
                alt19=5;
                }
                break;
            case 49:
                {
                alt19=6;
                }
                break;
            case 41:
                {
                alt19=7;
                }
                break;
            case 47:
                {
                alt19=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(56,14);
                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef )
                    int alt18=6;
                    try { dbg.enterSubRule(18);
                    try { dbg.enterDecision(18);

                    switch ( input.LA(1) ) {
                    case ID:
                        {
                        switch ( input.LA(2) ) {
                        case 27:
                        case 32:
                        case 36:
                            {
                            alt18=2;
                            }
                            break;
                        case 26:
                            {
                            alt18=5;
                            }
                            break;
                        case 35:
                            {
                            alt18=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 1, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }

                        }
                        break;
                    case 44:
                        {
                        alt18=3;
                        }
                        break;
                    case 43:
                        {
                        alt18=4;
                        }
                        break;
                    case 42:
                        {
                        alt18=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(18);}

                    switch (alt18) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:16: introducesDef
                            {
                            dbg.location(56,16);
                            pushFollow(FOLLOW_introducesDef_in_activityDef467);
                            introducesDef53=introducesDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, introducesDef53.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:32: interactionDef
                            {
                            dbg.location(56,32);
                            pushFollow(FOLLOW_interactionDef_in_activityDef471);
                            interactionDef54=interactionDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, interactionDef54.getTree());

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:49: inlineDef
                            {
                            dbg.location(56,49);
                            pushFollow(FOLLOW_inlineDef_in_activityDef475);
                            inlineDef55=inlineDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, inlineDef55.getTree());

                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:61: runDef
                            {
                            dbg.location(56,61);
                            pushFollow(FOLLOW_runDef_in_activityDef479);
                            runDef56=runDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, runDef56.getTree());

                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:70: recursionDef
                            {
                            dbg.location(56,70);
                            pushFollow(FOLLOW_recursionDef_in_activityDef483);
                            recursionDef57=recursionDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, recursionDef57.getTree());

                            }
                            break;
                        case 6 :
                            dbg.enterAlt(6);

                            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:85: endDef
                            {
                            dbg.location(56,85);
                            pushFollow(FOLLOW_endDef_in_activityDef487);
                            endDef58=endDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, endDef58.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(18);}

                    dbg.location(56,97);
                    char_literal59=(Token)match(input,26,FOLLOW_26_in_activityDef491); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:57:4: choiceDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(57,4);
                    pushFollow(FOLLOW_choiceDef_in_activityDef500);
                    choiceDef60=choiceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, choiceDef60.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:57:16: directedChoiceDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(57,16);
                    pushFollow(FOLLOW_directedChoiceDef_in_activityDef504);
                    directedChoiceDef61=directedChoiceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, directedChoiceDef61.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:57:36: parallelDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(57,36);
                    pushFollow(FOLLOW_parallelDef_in_activityDef508);
                    parallelDef62=parallelDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parallelDef62.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:57:50: repeatDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(57,50);
                    pushFollow(FOLLOW_repeatDef_in_activityDef512);
                    repeatDef63=repeatDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, repeatDef63.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:57:62: unorderedDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(57,62);
                    pushFollow(FOLLOW_unorderedDef_in_activityDef516);
                    unorderedDef64=unorderedDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unorderedDef64.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:58:4: recBlockDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(58,4);
                    pushFollow(FOLLOW_recBlockDef_in_activityDef523);
                    recBlockDef65=recBlockDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recBlockDef65.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:58:18: globalEscapeDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(58,18);
                    pushFollow(FOLLOW_globalEscapeDef_in_activityDef527);
                    globalEscapeDef66=globalEscapeDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, globalEscapeDef66.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(58, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "activityDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "activityDef"

    public static class introducesDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "introducesDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:60:1: introducesDef : roleDef 'introduces' roleDef ( ',' roleDef )* ;
    public final MonitorParser.introducesDef_return introducesDef() throws RecognitionException {
        MonitorParser.introducesDef_return retval = new MonitorParser.introducesDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal68=null;
        Token char_literal70=null;
        MonitorParser.roleDef_return roleDef67 = null;

        MonitorParser.roleDef_return roleDef69 = null;

        MonitorParser.roleDef_return roleDef71 = null;


        Object string_literal68_tree=null;
        Object char_literal70_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "introducesDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:60:14: ( roleDef 'introduces' roleDef ( ',' roleDef )* )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:60:16: roleDef 'introduces' roleDef ( ',' roleDef )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(60,16);
            pushFollow(FOLLOW_roleDef_in_introducesDef535);
            roleDef67=roleDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, roleDef67.getTree());
            dbg.location(60,24);
            string_literal68=(Token)match(input,35,FOLLOW_35_in_introducesDef537); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal68_tree = (Object)adaptor.create(string_literal68);
            adaptor.addChild(root_0, string_literal68_tree);
            }
            dbg.location(60,37);
            pushFollow(FOLLOW_roleDef_in_introducesDef539);
            roleDef69=roleDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, roleDef69.getTree());
            dbg.location(60,45);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:60:45: ( ',' roleDef )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:60:47: ',' roleDef
            	    {
            	    dbg.location(60,50);
            	    char_literal70=(Token)match(input,25,FOLLOW_25_in_introducesDef543); if (state.failed) return retval;
            	    dbg.location(60,52);
            	    pushFollow(FOLLOW_roleDef_in_introducesDef546);
            	    roleDef71=roleDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleDef71.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);
            } finally {dbg.exitSubRule(20);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(60, 63);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "introducesDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "introducesDef"

    public static class roleDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "roleDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:62:1: roleDef : ID -> ID ;
    public final MonitorParser.roleDef_return roleDef() throws RecognitionException {
        MonitorParser.roleDef_return retval = new MonitorParser.roleDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID72=null;

        Object ID72_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try { dbg.enterRule(getGrammarFileName(), "roleDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:62:8: ( ID -> ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:62:10: ID
            {
            dbg.location(62,10);
            ID72=(Token)match(input,ID,FOLLOW_ID_in_roleDef557); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID72);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:13: -> ID
            {
                dbg.location(62,16);
                adaptor.addChild(root_0, stream_ID.nextNode());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(62, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "roleDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "roleDef"

    public static class roleName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "roleName"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:64:1: roleName : ID -> ID ;
    public final MonitorParser.roleName_return roleName() throws RecognitionException {
        MonitorParser.roleName_return retval = new MonitorParser.roleName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID73=null;

        Object ID73_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try { dbg.enterRule(getGrammarFileName(), "roleName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:64:9: ( ID -> ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:64:11: ID
            {
            dbg.location(64,11);
            ID73=(Token)match(input,ID,FOLLOW_ID_in_roleName568); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID73);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 64:14: -> ID
            {
                dbg.location(64,17);
                adaptor.addChild(root_0, stream_ID.nextNode());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(64, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "roleName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "roleName"

    public static class typeReferenceDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeReferenceDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:66:1: typeReferenceDef : ID -> ID ;
    public final MonitorParser.typeReferenceDef_return typeReferenceDef() throws RecognitionException {
        MonitorParser.typeReferenceDef_return retval = new MonitorParser.typeReferenceDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID74=null;

        Object ID74_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try { dbg.enterRule(getGrammarFileName(), "typeReferenceDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:66:17: ( ID -> ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:66:19: ID
            {
            dbg.location(66,19);
            ID74=(Token)match(input,ID,FOLLOW_ID_in_typeReferenceDef579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID74);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:22: -> ID
            {
                dbg.location(66,25);
                adaptor.addChild(root_0, stream_ID.nextNode());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(66, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeReferenceDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeReferenceDef"

    public static class interactionSignatureDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interactionSignatureDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:1: interactionSignatureDef : ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' ) ;
    public final MonitorParser.interactionSignatureDef_return interactionSignatureDef() throws RecognitionException {
        MonitorParser.interactionSignatureDef_return retval = new MonitorParser.interactionSignatureDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID76=null;
        Token char_literal77=null;
        Token char_literal79=null;
        Token char_literal81=null;
        MonitorParser.typeReferenceDef_return typeReferenceDef75 = null;

        MonitorParser.typeReferenceDef_return typeReferenceDef78 = null;

        MonitorParser.typeReferenceDef_return typeReferenceDef80 = null;


        Object ID76_tree=null;
        Object char_literal77_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "interactionSignatureDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:24: ( ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:26: ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(68,26);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:26: ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' )
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==32) ) {
                    alt23=2;
                }
                else if ( (LA23_1==27||LA23_1==36||LA23_1==39) ) {
                    alt23=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:28: typeReferenceDef
                    {
                    dbg.location(68,28);
                    pushFollow(FOLLOW_typeReferenceDef_in_interactionSignatureDef593);
                    typeReferenceDef75=typeReferenceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeReferenceDef75.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:47: ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')'
                    {
                    dbg.location(68,47);
                    ID76=(Token)match(input,ID,FOLLOW_ID_in_interactionSignatureDef597); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID76_tree = (Object)adaptor.create(ID76);
                    adaptor.addChild(root_0, ID76_tree);
                    }
                    dbg.location(68,53);
                    char_literal77=(Token)match(input,32,FOLLOW_32_in_interactionSignatureDef599); if (state.failed) return retval;
                    dbg.location(68,55);
                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:55: ( typeReferenceDef ( ',' typeReferenceDef )* )?
                    int alt22=2;
                    try { dbg.enterSubRule(22);
                    try { dbg.enterDecision(22);

                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==ID) ) {
                        alt22=1;
                    }
                    } finally {dbg.exitDecision(22);}

                    switch (alt22) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:57: typeReferenceDef ( ',' typeReferenceDef )*
                            {
                            dbg.location(68,57);
                            pushFollow(FOLLOW_typeReferenceDef_in_interactionSignatureDef604);
                            typeReferenceDef78=typeReferenceDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeReferenceDef78.getTree());
                            dbg.location(68,74);
                            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:74: ( ',' typeReferenceDef )*
                            try { dbg.enterSubRule(21);

                            loop21:
                            do {
                                int alt21=2;
                                try { dbg.enterDecision(21);

                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==25) ) {
                                    alt21=1;
                                }


                                } finally {dbg.exitDecision(21);}

                                switch (alt21) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:76: ',' typeReferenceDef
                            	    {
                            	    dbg.location(68,79);
                            	    char_literal79=(Token)match(input,25,FOLLOW_25_in_interactionSignatureDef608); if (state.failed) return retval;
                            	    dbg.location(68,81);
                            	    pushFollow(FOLLOW_typeReferenceDef_in_interactionSignatureDef611);
                            	    typeReferenceDef80=typeReferenceDef();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeReferenceDef80.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(21);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(22);}

                    dbg.location(68,107);
                    char_literal81=(Token)match(input,33,FOLLOW_33_in_interactionSignatureDef619); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(68, 111);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "interactionSignatureDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "interactionSignatureDef"

    public static class interactionDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interactionDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:71:1: interactionDef : interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) ) ;
    public final MonitorParser.interactionDef_return interactionDef() throws RecognitionException {
        MonitorParser.interactionDef_return retval = new MonitorParser.interactionDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal83=null;
        Token string_literal84=null;
        MonitorParser.roleName_return role = null;

        MonitorParser.interactionSignatureDef_return interactionSignatureDef82 = null;

        MonitorParser.roleName_return roleName85 = null;


        Object string_literal83_tree=null;
        Object string_literal84_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_interactionSignatureDef=new RewriteRuleSubtreeStream(adaptor,"rule interactionSignatureDef");
        try { dbg.enterRule(getGrammarFileName(), "interactionDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:71:15: ( interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:72:7: interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) )
            {
            dbg.location(72,7);
            pushFollow(FOLLOW_interactionSignatureDef_in_interactionDef638);
            interactionSignatureDef82=interactionSignatureDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_interactionSignatureDef.add(interactionSignatureDef82.getTree());
            dbg.location(72,31);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:72:31: ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) )
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:73:3: 'from' role= roleName
                    {
                    dbg.location(73,3);
                    string_literal83=(Token)match(input,27,FOLLOW_27_in_interactionDef644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(string_literal83);

                    dbg.location(73,14);
                    pushFollow(FOLLOW_roleName_in_interactionDef649);
                    role=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(role.getTree());


                    // AST REWRITE
                    // elements: role, interactionSignatureDef
                    // token labels: 
                    // rule labels: retval, role
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_role=new RewriteRuleSubtreeStream(adaptor,"rule role",role!=null?role.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:26: -> ^( RESV interactionSignatureDef $role)
                    {
                        dbg.location(73,29);
                        // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:73:29: ^( RESV interactionSignatureDef $role)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(73,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RESV, "RESV"), root_1);

                        dbg.location(73,36);
                        adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree());
                        dbg.location(73,60);
                        adaptor.addChild(root_1, stream_role.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:74:10: 'to' roleName
                    {
                    dbg.location(74,10);
                    string_literal84=(Token)match(input,36,FOLLOW_36_in_interactionDef673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(string_literal84);

                    dbg.location(74,15);
                    pushFollow(FOLLOW_roleName_in_interactionDef675);
                    roleName85=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName85.getTree());


                    // AST REWRITE
                    // elements: interactionSignatureDef, roleName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:25: -> ^( SEND interactionSignatureDef roleName )
                    {
                        dbg.location(74,28);
                        // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:74:28: ^( SEND interactionSignatureDef roleName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(74,30);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEND, "SEND"), root_1);

                        dbg.location(74,35);
                        adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree());
                        dbg.location(74,59);
                        adaptor.addChild(root_1, stream_roleName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(74, 69);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "interactionDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "interactionDef"

    public static class choiceDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "choiceDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:1: choiceDef : 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) ;
    public final MonitorParser.choiceDef_return choiceDef() throws RecognitionException {
        MonitorParser.choiceDef_return retval = new MonitorParser.choiceDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal86=null;
        Token string_literal87=null;
        Token string_literal90=null;
        MonitorParser.roleName_return roleName88 = null;

        MonitorParser.blockDef_return blockDef89 = null;

        MonitorParser.blockDef_return blockDef91 = null;


        Object string_literal86_tree=null;
        Object string_literal87_tree=null;
        Object string_literal90_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try { dbg.enterRule(getGrammarFileName(), "choiceDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:10: ( 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:12: 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )*
            {
            dbg.location(76,12);
            string_literal86=(Token)match(input,37,FOLLOW_37_in_choiceDef694); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_37.add(string_literal86);

            dbg.location(76,21);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:21: ( 'at' roleName )?
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:23: 'at' roleName
                    {
                    dbg.location(76,23);
                    string_literal87=(Token)match(input,29,FOLLOW_29_in_choiceDef698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(string_literal87);

                    dbg.location(76,28);
                    pushFollow(FOLLOW_roleName_in_choiceDef700);
                    roleName88=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName88.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(76,40);
            pushFollow(FOLLOW_blockDef_in_choiceDef705);
            blockDef89=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef89.getTree());
            dbg.location(76,49);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:49: ( 'or' blockDef )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==38) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:51: 'or' blockDef
            	    {
            	    dbg.location(76,51);
            	    string_literal90=(Token)match(input,38,FOLLOW_38_in_choiceDef709); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_38.add(string_literal90);

            	    dbg.location(76,56);
            	    pushFollow(FOLLOW_blockDef_in_choiceDef711);
            	    blockDef91=blockDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockDef.add(blockDef91.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}



            // AST REWRITE
            // elements: blockDef, 37
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:68: -> ^( 'choice' ( blockDef )+ )
            {
                dbg.location(76,71);
                // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:71: ^( 'choice' ( blockDef )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(76,73);
                root_1 = (Object)adaptor.becomeRoot(stream_37.nextNode(), root_1);

                dbg.location(76,82);
                if ( !(stream_blockDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_blockDef.hasNext() ) {
                    dbg.location(76,82);
                    adaptor.addChild(root_1, stream_blockDef.nextTree());

                }
                stream_blockDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(76, 92);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "choiceDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "choiceDef"

    public static class directedChoiceDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directedChoiceDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:1: directedChoiceDef : ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' ;
    public final MonitorParser.directedChoiceDef_return directedChoiceDef() throws RecognitionException {
        MonitorParser.directedChoiceDef_return retval = new MonitorParser.directedChoiceDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal92=null;
        Token string_literal94=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token char_literal100=null;
        MonitorParser.roleName_return roleName93 = null;

        MonitorParser.roleName_return roleName95 = null;

        MonitorParser.roleName_return roleName97 = null;

        MonitorParser.onMessageDef_return onMessageDef99 = null;


        Object string_literal92_tree=null;
        Object string_literal94_tree=null;
        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        Object char_literal100_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "directedChoiceDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:18: ( ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:20: ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(78,20);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:20: ( 'from' roleName )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:22: 'from' roleName
                    {
                    dbg.location(78,22);
                    string_literal92=(Token)match(input,27,FOLLOW_27_in_directedChoiceDef732); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal92_tree = (Object)adaptor.create(string_literal92);
                    adaptor.addChild(root_0, string_literal92_tree);
                    }
                    dbg.location(78,29);
                    pushFollow(FOLLOW_roleName_in_directedChoiceDef734);
                    roleName93=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName93.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(78,41);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:41: ( 'to' roleName ( ',' roleName )* )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:43: 'to' roleName ( ',' roleName )*
                    {
                    dbg.location(78,43);
                    string_literal94=(Token)match(input,36,FOLLOW_36_in_directedChoiceDef741); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal94_tree = (Object)adaptor.create(string_literal94);
                    adaptor.addChild(root_0, string_literal94_tree);
                    }
                    dbg.location(78,48);
                    pushFollow(FOLLOW_roleName_in_directedChoiceDef743);
                    roleName95=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName95.getTree());
                    dbg.location(78,57);
                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:57: ( ',' roleName )*
                    try { dbg.enterSubRule(28);

                    loop28:
                    do {
                        int alt28=2;
                        try { dbg.enterDecision(28);

                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==25) ) {
                            alt28=1;
                        }


                        } finally {dbg.exitDecision(28);}

                        switch (alt28) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:59: ',' roleName
                    	    {
                    	    dbg.location(78,62);
                    	    char_literal96=(Token)match(input,25,FOLLOW_25_in_directedChoiceDef747); if (state.failed) return retval;
                    	    dbg.location(78,64);
                    	    pushFollow(FOLLOW_roleName_in_directedChoiceDef750);
                    	    roleName97=roleName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName97.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(28);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}

            dbg.location(78,79);
            char_literal98=(Token)match(input,30,FOLLOW_30_in_directedChoiceDef758); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal98_tree = (Object)adaptor.create(char_literal98);
            adaptor.addChild(root_0, char_literal98_tree);
            }
            dbg.location(78,83);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:83: ( onMessageDef )+
            int cnt30=0;
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==ID) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:85: onMessageDef
            	    {
            	    dbg.location(78,85);
            	    pushFollow(FOLLOW_onMessageDef_in_directedChoiceDef762);
            	    onMessageDef99=onMessageDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, onMessageDef99.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt30++;
            } while (true);
            } finally {dbg.exitSubRule(30);}

            dbg.location(78,101);
            char_literal100=(Token)match(input,31,FOLLOW_31_in_directedChoiceDef767); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal100_tree = (Object)adaptor.create(char_literal100);
            adaptor.addChild(root_0, char_literal100_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(78, 104);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "directedChoiceDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "directedChoiceDef"

    public static class onMessageDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "onMessageDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:80:1: onMessageDef : interactionSignatureDef ':' activityList ;
    public final MonitorParser.onMessageDef_return onMessageDef() throws RecognitionException {
        MonitorParser.onMessageDef_return retval = new MonitorParser.onMessageDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal102=null;
        MonitorParser.interactionSignatureDef_return interactionSignatureDef101 = null;

        MonitorParser.activityList_return activityList103 = null;


        Object char_literal102_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "onMessageDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:80:13: ( interactionSignatureDef ':' activityList )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:80:15: interactionSignatureDef ':' activityList
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(80,15);
            pushFollow(FOLLOW_interactionSignatureDef_in_onMessageDef774);
            interactionSignatureDef101=interactionSignatureDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interactionSignatureDef101.getTree());
            dbg.location(80,39);
            char_literal102=(Token)match(input,39,FOLLOW_39_in_onMessageDef776); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal102_tree = (Object)adaptor.create(char_literal102);
            adaptor.addChild(root_0, char_literal102_tree);
            }
            dbg.location(80,43);
            pushFollow(FOLLOW_activityList_in_onMessageDef778);
            activityList103=activityList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, activityList103.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(80, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "onMessageDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "onMessageDef"

    public static class activityList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "activityList"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:1: activityList : ( ( ANNOTATION )* activityDef )* ;
    public final MonitorParser.activityList_return activityList() throws RecognitionException {
        MonitorParser.activityList_return retval = new MonitorParser.activityList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANNOTATION104=null;
        MonitorParser.activityDef_return activityDef105 = null;


        Object ANNOTATION104_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "activityList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:13: ( ( ( ANNOTATION )* activityDef )* )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:15: ( ( ANNOTATION )* activityDef )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(82,15);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:15: ( ( ANNOTATION )* activityDef )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32);

                try {
                    isCyclicDecision = true;
                    alt32 = dfa32.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:17: ( ANNOTATION )* activityDef
            	    {
            	    dbg.location(82,17);
            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:17: ( ANNOTATION )*
            	    try { dbg.enterSubRule(31);

            	    loop31:
            	    do {
            	        int alt31=2;
            	        try { dbg.enterDecision(31);

            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==ANNOTATION) ) {
            	            alt31=1;
            	        }


            	        } finally {dbg.exitDecision(31);}

            	        switch (alt31) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:19: ANNOTATION
            	    	    {
            	    	    dbg.location(82,19);
            	    	    ANNOTATION104=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_activityList791); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    ANNOTATION104_tree = (Object)adaptor.create(ANNOTATION104);
            	    	    adaptor.addChild(root_0, ANNOTATION104_tree);
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(31);}

            	    dbg.location(82,33);
            	    pushFollow(FOLLOW_activityDef_in_activityList796);
            	    activityDef105=activityDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, activityDef105.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(82, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "activityList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "activityList"

    public static class repeatDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "repeatDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:1: repeatDef : 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) ;
    public final MonitorParser.repeatDef_return repeatDef() throws RecognitionException {
        MonitorParser.repeatDef_return retval = new MonitorParser.repeatDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal106=null;
        Token string_literal107=null;
        Token char_literal109=null;
        MonitorParser.roleName_return roleName108 = null;

        MonitorParser.roleName_return roleName110 = null;

        MonitorParser.blockDef_return blockDef111 = null;


        Object string_literal106_tree=null;
        Object string_literal107_tree=null;
        Object char_literal109_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try { dbg.enterRule(getGrammarFileName(), "repeatDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:10: ( 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:12: 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef
            {
            dbg.location(84,12);
            string_literal106=(Token)match(input,40,FOLLOW_40_in_repeatDef806); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(string_literal106);

            dbg.location(84,21);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:21: ( 'at' roleName ( ',' roleName )* )?
            int alt34=2;
            try { dbg.enterSubRule(34);
            try { dbg.enterDecision(34);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==29) ) {
                alt34=1;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:23: 'at' roleName ( ',' roleName )*
                    {
                    dbg.location(84,23);
                    string_literal107=(Token)match(input,29,FOLLOW_29_in_repeatDef810); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(string_literal107);

                    dbg.location(84,28);
                    pushFollow(FOLLOW_roleName_in_repeatDef812);
                    roleName108=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName108.getTree());
                    dbg.location(84,37);
                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:37: ( ',' roleName )*
                    try { dbg.enterSubRule(33);

                    loop33:
                    do {
                        int alt33=2;
                        try { dbg.enterDecision(33);

                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==25) ) {
                            alt33=1;
                        }


                        } finally {dbg.exitDecision(33);}

                        switch (alt33) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:39: ',' roleName
                    	    {
                    	    dbg.location(84,39);
                    	    char_literal109=(Token)match(input,25,FOLLOW_25_in_repeatDef816); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_25.add(char_literal109);

                    	    dbg.location(84,43);
                    	    pushFollow(FOLLOW_roleName_in_repeatDef818);
                    	    roleName110=roleName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_roleName.add(roleName110.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(33);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(34);}

            dbg.location(84,58);
            pushFollow(FOLLOW_blockDef_in_repeatDef826);
            blockDef111=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef111.getTree());


            // AST REWRITE
            // elements: 40, blockDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 84:68: -> ^( 'repeat' blockDef )
            {
                dbg.location(84,71);
                // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:71: ^( 'repeat' blockDef )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(84,73);
                root_1 = (Object)adaptor.becomeRoot(stream_40.nextNode(), root_1);

                dbg.location(84,82);
                adaptor.addChild(root_1, stream_blockDef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(84, 91);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "repeatDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "repeatDef"

    public static class recBlockDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recBlockDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:86:1: recBlockDef : 'rec' labelName blockDef -> ^( 'rec' blockDef ) ;
    public final MonitorParser.recBlockDef_return recBlockDef() throws RecognitionException {
        MonitorParser.recBlockDef_return retval = new MonitorParser.recBlockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal112=null;
        MonitorParser.labelName_return labelName113 = null;

        MonitorParser.blockDef_return blockDef114 = null;


        Object string_literal112_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_labelName=new RewriteRuleSubtreeStream(adaptor,"rule labelName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try { dbg.enterRule(getGrammarFileName(), "recBlockDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:86:12: ( 'rec' labelName blockDef -> ^( 'rec' blockDef ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:86:14: 'rec' labelName blockDef
            {
            dbg.location(86,14);
            string_literal112=(Token)match(input,41,FOLLOW_41_in_recBlockDef842); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(string_literal112);

            dbg.location(86,20);
            pushFollow(FOLLOW_labelName_in_recBlockDef844);
            labelName113=labelName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_labelName.add(labelName113.getTree());
            dbg.location(86,30);
            pushFollow(FOLLOW_blockDef_in_recBlockDef846);
            blockDef114=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef114.getTree());


            // AST REWRITE
            // elements: 41, blockDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:39: -> ^( 'rec' blockDef )
            {
                dbg.location(86,42);
                // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:86:42: ^( 'rec' blockDef )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(86,44);
                root_1 = (Object)adaptor.becomeRoot(stream_41.nextNode(), root_1);

                dbg.location(86,50);
                adaptor.addChild(root_1, stream_blockDef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(86, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "recBlockDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "recBlockDef"

    public static class labelName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "labelName"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:88:1: labelName : ID -> ID ;
    public final MonitorParser.labelName_return labelName() throws RecognitionException {
        MonitorParser.labelName_return retval = new MonitorParser.labelName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID115=null;

        Object ID115_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try { dbg.enterRule(getGrammarFileName(), "labelName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:88:10: ( ID -> ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:88:12: ID
            {
            dbg.location(88,12);
            ID115=(Token)match(input,ID,FOLLOW_ID_in_labelName861); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID115);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 88:15: -> ID
            {
                dbg.location(88,18);
                adaptor.addChild(root_0, stream_ID.nextNode());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(88, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "labelName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "labelName"

    public static class recursionDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recursionDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:90:1: recursionDef : labelName -> ^( RECLABEL labelName ) ;
    public final MonitorParser.recursionDef_return recursionDef() throws RecognitionException {
        MonitorParser.recursionDef_return retval = new MonitorParser.recursionDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.labelName_return labelName116 = null;


        RewriteRuleSubtreeStream stream_labelName=new RewriteRuleSubtreeStream(adaptor,"rule labelName");
        try { dbg.enterRule(getGrammarFileName(), "recursionDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:90:13: ( labelName -> ^( RECLABEL labelName ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:90:15: labelName
            {
            dbg.location(90,15);
            pushFollow(FOLLOW_labelName_in_recursionDef873);
            labelName116=labelName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_labelName.add(labelName116.getTree());


            // AST REWRITE
            // elements: labelName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:25: -> ^( RECLABEL labelName )
            {
                dbg.location(90,28);
                // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:90:28: ^( RECLABEL labelName )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(90,30);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECLABEL, "RECLABEL"), root_1);

                dbg.location(90,39);
                adaptor.addChild(root_1, stream_labelName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(90, 49);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "recursionDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "recursionDef"

    public static class endDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:93:1: endDef : 'end' ;
    public final MonitorParser.endDef_return endDef() throws RecognitionException {
        MonitorParser.endDef_return retval = new MonitorParser.endDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal117=null;

        Object string_literal117_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "endDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:93:7: ( 'end' )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:93:9: 'end'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(93,14);
            string_literal117=(Token)match(input,42,FOLLOW_42_in_endDef889); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal117_tree = (Object)adaptor.create(string_literal117);
            root_0 = (Object)adaptor.becomeRoot(string_literal117_tree, root_0);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(93, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "endDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "endDef"

    public static class runDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "runDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:1: runDef : 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName ;
    public final MonitorParser.runDef_return runDef() throws RecognitionException {
        MonitorParser.runDef_return retval = new MonitorParser.runDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        Token char_literal124=null;
        Token string_literal125=null;
        MonitorParser.protocolRefDef_return protocolRefDef119 = null;

        MonitorParser.parameter_return parameter121 = null;

        MonitorParser.parameter_return parameter123 = null;

        MonitorParser.roleName_return roleName126 = null;


        Object string_literal118_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;
        Object string_literal125_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "runDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(96, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:7: ( 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:9: 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(96,14);
            string_literal118=(Token)match(input,43,FOLLOW_43_in_runDef899); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal118_tree = (Object)adaptor.create(string_literal118);
            root_0 = (Object)adaptor.becomeRoot(string_literal118_tree, root_0);
            }
            dbg.location(96,16);
            pushFollow(FOLLOW_protocolRefDef_in_runDef902);
            protocolRefDef119=protocolRefDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolRefDef119.getTree());
            dbg.location(96,31);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:31: ( '(' parameter ( ',' parameter )* ')' )?
            int alt36=2;
            try { dbg.enterSubRule(36);
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:33: '(' parameter ( ',' parameter )* ')'
                    {
                    dbg.location(96,36);
                    char_literal120=(Token)match(input,32,FOLLOW_32_in_runDef906); if (state.failed) return retval;
                    dbg.location(96,38);
                    pushFollow(FOLLOW_parameter_in_runDef909);
                    parameter121=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter121.getTree());
                    dbg.location(96,48);
                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:48: ( ',' parameter )*
                    try { dbg.enterSubRule(35);

                    loop35:
                    do {
                        int alt35=2;
                        try { dbg.enterDecision(35);

                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==25) ) {
                            alt35=1;
                        }


                        } finally {dbg.exitDecision(35);}

                        switch (alt35) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:50: ',' parameter
                    	    {
                    	    dbg.location(96,53);
                    	    char_literal122=(Token)match(input,25,FOLLOW_25_in_runDef913); if (state.failed) return retval;
                    	    dbg.location(96,55);
                    	    pushFollow(FOLLOW_parameter_in_runDef916);
                    	    parameter123=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter123.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(35);}

                    dbg.location(96,71);
                    char_literal124=(Token)match(input,33,FOLLOW_33_in_runDef921); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(36);}

            dbg.location(96,76);
            string_literal125=(Token)match(input,27,FOLLOW_27_in_runDef927); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal125_tree = (Object)adaptor.create(string_literal125);
            adaptor.addChild(root_0, string_literal125_tree);
            }
            dbg.location(96,83);
            pushFollow(FOLLOW_roleName_in_runDef929);
            roleName126=roleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName126.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(96, 92);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "runDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "runDef"

    public static class protocolRefDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protocolRefDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:98:1: protocolRefDef : ID ( 'at' roleName )? ;
    public final MonitorParser.protocolRefDef_return protocolRefDef() throws RecognitionException {
        MonitorParser.protocolRefDef_return retval = new MonitorParser.protocolRefDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID127=null;
        Token string_literal128=null;
        MonitorParser.roleName_return roleName129 = null;


        Object ID127_tree=null;
        Object string_literal128_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "protocolRefDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:98:15: ( ID ( 'at' roleName )? )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:98:17: ID ( 'at' roleName )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(98,17);
            ID127=(Token)match(input,ID,FOLLOW_ID_in_protocolRefDef937); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID127_tree = (Object)adaptor.create(ID127);
            adaptor.addChild(root_0, ID127_tree);
            }
            dbg.location(98,20);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:98:20: ( 'at' roleName )?
            int alt37=2;
            try { dbg.enterSubRule(37);
            try { dbg.enterDecision(37);

            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:98:22: 'at' roleName
                    {
                    dbg.location(98,22);
                    string_literal128=(Token)match(input,29,FOLLOW_29_in_protocolRefDef941); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal128_tree = (Object)adaptor.create(string_literal128);
                    adaptor.addChild(root_0, string_literal128_tree);
                    }
                    dbg.location(98,27);
                    pushFollow(FOLLOW_roleName_in_protocolRefDef943);
                    roleName129=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName129.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(37);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(98, 39);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "protocolRefDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "protocolRefDef"

    public static class declarationName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarationName"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:100:1: declarationName : ID ;
    public final MonitorParser.declarationName_return declarationName() throws RecognitionException {
        MonitorParser.declarationName_return retval = new MonitorParser.declarationName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID130=null;

        Object ID130_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "declarationName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:100:16: ( ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:100:18: ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(100,18);
            ID130=(Token)match(input,ID,FOLLOW_ID_in_declarationName954); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID130_tree = (Object)adaptor.create(ID130);
            adaptor.addChild(root_0, ID130_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(100, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarationName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declarationName"

    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:102:1: parameter : declarationName ;
    public final MonitorParser.parameter_return parameter() throws RecognitionException {
        MonitorParser.parameter_return retval = new MonitorParser.parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.declarationName_return declarationName131 = null;



        try { dbg.enterRule(getGrammarFileName(), "parameter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:102:10: ( declarationName )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:102:12: declarationName
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(102,12);
            pushFollow(FOLLOW_declarationName_in_parameter962);
            declarationName131=declarationName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarationName131.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(102, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parameter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parameter"

    public static class inlineDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inlineDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:1: inlineDef : 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? ;
    public final MonitorParser.inlineDef_return inlineDef() throws RecognitionException {
        MonitorParser.inlineDef_return retval = new MonitorParser.inlineDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal132=null;
        Token char_literal134=null;
        Token char_literal136=null;
        Token char_literal138=null;
        MonitorParser.protocolRefDef_return protocolRefDef133 = null;

        MonitorParser.parameter_return parameter135 = null;

        MonitorParser.parameter_return parameter137 = null;


        Object string_literal132_tree=null;
        Object char_literal134_tree=null;
        Object char_literal136_tree=null;
        Object char_literal138_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inlineDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:10: ( 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:12: 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(105,20);
            string_literal132=(Token)match(input,44,FOLLOW_44_in_inlineDef971); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal132_tree = (Object)adaptor.create(string_literal132);
            root_0 = (Object)adaptor.becomeRoot(string_literal132_tree, root_0);
            }
            dbg.location(105,22);
            pushFollow(FOLLOW_protocolRefDef_in_inlineDef974);
            protocolRefDef133=protocolRefDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolRefDef133.getTree());
            dbg.location(105,37);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:37: ( '(' parameter ( ',' parameter )* ')' )?
            int alt39=2;
            try { dbg.enterSubRule(39);
            try { dbg.enterDecision(39);

            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            } finally {dbg.exitDecision(39);}

            switch (alt39) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:39: '(' parameter ( ',' parameter )* ')'
                    {
                    dbg.location(105,42);
                    char_literal134=(Token)match(input,32,FOLLOW_32_in_inlineDef978); if (state.failed) return retval;
                    dbg.location(105,44);
                    pushFollow(FOLLOW_parameter_in_inlineDef981);
                    parameter135=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter135.getTree());
                    dbg.location(105,54);
                    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:54: ( ',' parameter )*
                    try { dbg.enterSubRule(38);

                    loop38:
                    do {
                        int alt38=2;
                        try { dbg.enterDecision(38);

                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==25) ) {
                            alt38=1;
                        }


                        } finally {dbg.exitDecision(38);}

                        switch (alt38) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:56: ',' parameter
                    	    {
                    	    dbg.location(105,59);
                    	    char_literal136=(Token)match(input,25,FOLLOW_25_in_inlineDef985); if (state.failed) return retval;
                    	    dbg.location(105,61);
                    	    pushFollow(FOLLOW_parameter_in_inlineDef988);
                    	    parameter137=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter137.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(38);}

                    dbg.location(105,77);
                    char_literal138=(Token)match(input,33,FOLLOW_33_in_inlineDef993); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(39);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(105, 82);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inlineDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inlineDef"

    public static class parallelDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parallelDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:1: parallelDef : 'parallel' blockDef ( 'and' blockDef )* -> ^( 'parallel' ( blockDef )+ ) ;
    public final MonitorParser.parallelDef_return parallelDef() throws RecognitionException {
        MonitorParser.parallelDef_return retval = new MonitorParser.parallelDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal139=null;
        Token string_literal141=null;
        MonitorParser.blockDef_return blockDef140 = null;

        MonitorParser.blockDef_return blockDef142 = null;


        Object string_literal139_tree=null;
        Object string_literal141_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try { dbg.enterRule(getGrammarFileName(), "parallelDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:12: ( 'parallel' blockDef ( 'and' blockDef )* -> ^( 'parallel' ( blockDef )+ ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:14: 'parallel' blockDef ( 'and' blockDef )*
            {
            dbg.location(107,14);
            string_literal139=(Token)match(input,45,FOLLOW_45_in_parallelDef1005); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_45.add(string_literal139);

            dbg.location(107,25);
            pushFollow(FOLLOW_blockDef_in_parallelDef1007);
            blockDef140=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef140.getTree());
            dbg.location(107,34);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:34: ( 'and' blockDef )*
            try { dbg.enterSubRule(40);

            loop40:
            do {
                int alt40=2;
                try { dbg.enterDecision(40);

                int LA40_0 = input.LA(1);

                if ( (LA40_0==46) ) {
                    alt40=1;
                }


                } finally {dbg.exitDecision(40);}

                switch (alt40) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:36: 'and' blockDef
            	    {
            	    dbg.location(107,36);
            	    string_literal141=(Token)match(input,46,FOLLOW_46_in_parallelDef1011); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(string_literal141);

            	    dbg.location(107,42);
            	    pushFollow(FOLLOW_blockDef_in_parallelDef1013);
            	    blockDef142=blockDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockDef.add(blockDef142.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);
            } finally {dbg.exitSubRule(40);}



            // AST REWRITE
            // elements: blockDef, 45
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 107:54: -> ^( 'parallel' ( blockDef )+ )
            {
                dbg.location(107,57);
                // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:57: ^( 'parallel' ( blockDef )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(107,59);
                root_1 = (Object)adaptor.becomeRoot(stream_45.nextNode(), root_1);

                dbg.location(107,70);
                if ( !(stream_blockDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_blockDef.hasNext() ) {
                    dbg.location(107,70);
                    adaptor.addChild(root_1, stream_blockDef.nextTree());

                }
                stream_blockDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(107, 80);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parallelDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parallelDef"

    public static class globalEscapeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "globalEscapeDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:110:1: globalEscapeDef : 'do' blockDef ( interruptDef )+ ;
    public final MonitorParser.globalEscapeDef_return globalEscapeDef() throws RecognitionException {
        MonitorParser.globalEscapeDef_return retval = new MonitorParser.globalEscapeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal143=null;
        MonitorParser.blockDef_return blockDef144 = null;

        MonitorParser.interruptDef_return interruptDef145 = null;


        Object string_literal143_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "globalEscapeDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:110:16: ( 'do' blockDef ( interruptDef )+ )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:110:18: 'do' blockDef ( interruptDef )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(110,22);
            string_literal143=(Token)match(input,47,FOLLOW_47_in_globalEscapeDef1033); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal143_tree = (Object)adaptor.create(string_literal143);
            root_0 = (Object)adaptor.becomeRoot(string_literal143_tree, root_0);
            }
            dbg.location(110,24);
            pushFollow(FOLLOW_blockDef_in_globalEscapeDef1036);
            blockDef144=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockDef144.getTree());
            dbg.location(110,33);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:110:33: ( interruptDef )+
            int cnt41=0;
            try { dbg.enterSubRule(41);

            loop41:
            do {
                int alt41=2;
                try { dbg.enterDecision(41);

                int LA41_0 = input.LA(1);

                if ( (LA41_0==48) ) {
                    alt41=1;
                }


                } finally {dbg.exitDecision(41);}

                switch (alt41) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:110:35: interruptDef
            	    {
            	    dbg.location(110,35);
            	    pushFollow(FOLLOW_interruptDef_in_globalEscapeDef1040);
            	    interruptDef145=interruptDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, interruptDef145.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt41++;
            } while (true);
            } finally {dbg.exitSubRule(41);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(110, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "globalEscapeDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "globalEscapeDef"

    public static class interruptDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interruptDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:113:1: interruptDef : 'interrupt' blockDef ;
    public final MonitorParser.interruptDef_return interruptDef() throws RecognitionException {
        MonitorParser.interruptDef_return retval = new MonitorParser.interruptDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal146=null;
        MonitorParser.blockDef_return blockDef147 = null;


        Object string_literal146_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "interruptDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:113:13: ( 'interrupt' blockDef )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:113:15: 'interrupt' blockDef
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(113,26);
            string_literal146=(Token)match(input,48,FOLLOW_48_in_interruptDef1052); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal146_tree = (Object)adaptor.create(string_literal146);
            root_0 = (Object)adaptor.becomeRoot(string_literal146_tree, root_0);
            }
            dbg.location(113,28);
            pushFollow(FOLLOW_blockDef_in_interruptDef1055);
            blockDef147=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockDef147.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(113, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "interruptDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "interruptDef"

    public static class unorderedDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unorderedDef"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:115:1: unorderedDef : 'unordered' blockDef -> ^( UNORDERED blockDef ) ;
    public final MonitorParser.unorderedDef_return unorderedDef() throws RecognitionException {
        MonitorParser.unorderedDef_return retval = new MonitorParser.unorderedDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal148=null;
        MonitorParser.blockDef_return blockDef149 = null;


        Object string_literal148_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try { dbg.enterRule(getGrammarFileName(), "unorderedDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:115:13: ( 'unordered' blockDef -> ^( UNORDERED blockDef ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:115:15: 'unordered' blockDef
            {
            dbg.location(115,15);
            string_literal148=(Token)match(input,49,FOLLOW_49_in_unorderedDef1063); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(string_literal148);

            dbg.location(115,27);
            pushFollow(FOLLOW_blockDef_in_unorderedDef1065);
            blockDef149=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef149.getTree());


            // AST REWRITE
            // elements: blockDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 115:36: -> ^( UNORDERED blockDef )
            {
                dbg.location(115,39);
                // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:115:39: ^( UNORDERED blockDef )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(115,41);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNORDERED, "UNORDERED"), root_1);

                dbg.location(115,51);
                adaptor.addChild(root_1, stream_blockDef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(115, 60);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unorderedDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unorderedDef"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:124:1: expr : term ( ( PLUS | MINUS ) term )* ;
    public final MonitorParser.expr_return expr() throws RecognitionException {
        MonitorParser.expr_return retval = new MonitorParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set151=null;
        MonitorParser.term_return term150 = null;

        MonitorParser.term_return term152 = null;


        Object set151_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:124:6: ( term ( ( PLUS | MINUS ) term )* )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:124:8: term ( ( PLUS | MINUS ) term )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(124,8);
            pushFollow(FOLLOW_term_in_expr1085);
            term150=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term150.getTree());
            dbg.location(124,13);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:124:13: ( ( PLUS | MINUS ) term )*
            try { dbg.enterSubRule(42);

            loop42:
            do {
                int alt42=2;
                try { dbg.enterDecision(42);

                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=PLUS && LA42_0<=MINUS)) ) {
                    alt42=1;
                }


                } finally {dbg.exitDecision(42);}

                switch (alt42) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:124:15: ( PLUS | MINUS ) term
            	    {
            	    dbg.location(124,15);
            	    set151=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set151));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(124,33);
            	    pushFollow(FOLLOW_term_in_expr1100);
            	    term152=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term152.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);
            } finally {dbg.exitSubRule(42);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(124, 41);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:126:1: term : factor ( ( MULT | DIV ) factor )* ;
    public final MonitorParser.term_return term() throws RecognitionException {
        MonitorParser.term_return retval = new MonitorParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set154=null;
        MonitorParser.factor_return factor153 = null;

        MonitorParser.factor_return factor155 = null;


        Object set154_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:126:6: ( factor ( ( MULT | DIV ) factor )* )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:126:8: factor ( ( MULT | DIV ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(126,8);
            pushFollow(FOLLOW_factor_in_term1112);
            factor153=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor153.getTree());
            dbg.location(126,15);
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:126:15: ( ( MULT | DIV ) factor )*
            try { dbg.enterSubRule(43);

            loop43:
            do {
                int alt43=2;
                try { dbg.enterDecision(43);

                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=MULT && LA43_0<=DIV)) ) {
                    alt43=1;
                }


                } finally {dbg.exitDecision(43);}

                switch (alt43) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:126:17: ( MULT | DIV ) factor
            	    {
            	    dbg.location(126,17);
            	    set154=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set154));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(126,32);
            	    pushFollow(FOLLOW_factor_in_term1126);
            	    factor155=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor155.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);
            } finally {dbg.exitSubRule(43);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(126, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:128:1: factor : NUMBER ;
    public final MonitorParser.factor_return factor() throws RecognitionException {
        MonitorParser.factor_return retval = new MonitorParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER156=null;

        Object NUMBER156_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:128:8: ( NUMBER )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:128:10: NUMBER
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,10);
            NUMBER156=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1138); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER156_tree = (Object)adaptor.create(NUMBER156);
            adaptor.addChild(root_0, NUMBER156_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(128, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "factor"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA3_eotS =
        "\4\uffff";
    static final String DFA3_eofS =
        "\4\uffff";
    static final String DFA3_minS =
        "\2\17\2\uffff";
    static final String DFA3_maxS =
        "\2\30\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\7\uffff\1\3\1\2",
            "\1\1\7\uffff\1\3\1\2",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 27:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA17_eotS =
        "\4\uffff";
    static final String DFA17_eofS =
        "\4\uffff";
    static final String DFA17_minS =
        "\2\17\2\uffff";
    static final String DFA17_maxS =
        "\2\61\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA17_specialS =
        "\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\3\7\uffff\1\2\2\uffff\1\3\2\uffff\1\3\1\2\4\uffff\2\3"+
            "\2\uffff\6\3\1\uffff\1\3\1\uffff\1\3",
            "\1\1\1\3\7\uffff\1\2\2\uffff\1\3\2\uffff\1\3\5\uffff\2\3\2"+
            "\uffff\6\3\1\uffff\1\3\1\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 54:18: ( ( ANNOTATION )* activityDef )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA32_eotS =
        "\11\uffff";
    static final String DFA32_eofS =
        "\1\1\10\uffff";
    static final String DFA32_minS =
        "\1\17\1\uffff\1\32\1\uffff\1\20\1\31\1\33\1\20\1\31";
    static final String DFA32_maxS =
        "\1\61\1\uffff\1\47\1\uffff\2\41\1\47\1\20\1\41";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\5\uffff";
    static final String DFA32_specialS =
        "\11\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\3\1\2\12\uffff\1\3\2\uffff\1\3\1\1\4\uffff\2\3\2\uffff\6"+
            "\3\1\uffff\1\3\1\uffff\1\3",
            "",
            "\2\3\4\uffff\1\4\2\uffff\2\3\2\uffff\1\1",
            "",
            "\1\5\20\uffff\1\6",
            "\1\7\7\uffff\1\6",
            "\1\3\10\uffff\1\3\2\uffff\1\1",
            "\1\10",
            "\1\7\7\uffff\1\6"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 82:15: ( ( ANNOTATION )* activityDef )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_ANNOTATION_in_description146 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_importProtocolStatement_in_description153 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_importTypeStatement_in_description157 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_ANNOTATION_in_description166 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_protocolDef_in_description171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_importProtocolStatement182 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_importProtocolStatement184 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_importProtocolDef_in_importProtocolStatement186 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_importProtocolStatement190 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_importProtocolDef_in_importProtocolStatement193 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_importProtocolStatement198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_importProtocolDef207 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_importProtocolDef209 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_StringLiteral_in_importProtocolDef212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_importTypeStatement225 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_simpleName_in_importTypeStatement229 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_importTypeDef_in_importTypeStatement234 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_25_in_importTypeStatement238 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_importTypeDef_in_importTypeStatement241 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_27_in_importTypeStatement248 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_StringLiteral_in_importTypeStatement251 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_importTypeStatement256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataTypeDef_in_importTypeDef267 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_importTypeDef269 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_importTypeDef275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_dataTypeDef283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleName291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_protocolDef299 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_protocolName_in_protocolDef301 = new BitSet(new long[]{0x0000000160000000L});
    public static final BitSet FOLLOW_29_in_protocolDef305 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleName_in_protocolDef307 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_parameterDefs_in_protocolDef314 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_protocolDef319 = new BitSet(new long[]{0x0002BF3048018000L});
    public static final BitSet FOLLOW_protocolBlockDef_in_protocolDef321 = new BitSet(new long[]{0x0000000081008000L});
    public static final BitSet FOLLOW_ANNOTATION_in_protocolDef327 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_protocolDef_in_protocolDef332 = new BitSet(new long[]{0x0000000081008000L});
    public static final BitSet FOLLOW_31_in_protocolDef337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_protocolName361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parameterDefs369 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_parameterDef_in_parameterDefs372 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_25_in_parameterDefs376 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_parameterDef_in_parameterDefs379 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_33_in_parameterDefs384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeReferenceDef_in_parameterDef395 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_34_in_parameterDef399 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_simpleName_in_parameterDef403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activityListDef_in_protocolBlockDef411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_blockDef422 = new BitSet(new long[]{0x0002BF30C8018000L});
    public static final BitSet FOLLOW_activityListDef_in_blockDef424 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_blockDef426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_in_activityListDef445 = new BitSet(new long[]{0x0002BF3048018000L});
    public static final BitSet FOLLOW_activityDef_in_activityListDef450 = new BitSet(new long[]{0x0002BF3048018002L});
    public static final BitSet FOLLOW_introducesDef_in_activityDef467 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_interactionDef_in_activityDef471 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_inlineDef_in_activityDef475 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_runDef_in_activityDef479 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_recursionDef_in_activityDef483 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_endDef_in_activityDef487 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_activityDef491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choiceDef_in_activityDef500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directedChoiceDef_in_activityDef504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallelDef_in_activityDef508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatDef_in_activityDef512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedDef_in_activityDef516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recBlockDef_in_activityDef523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalEscapeDef_in_activityDef527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef535 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_introducesDef537 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef539 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_introducesDef543 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef546 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ID_in_roleDef557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_roleName568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typeReferenceDef579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeReferenceDef_in_interactionSignatureDef593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_interactionSignatureDef597 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_interactionSignatureDef599 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_typeReferenceDef_in_interactionSignatureDef604 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_25_in_interactionSignatureDef608 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_typeReferenceDef_in_interactionSignatureDef611 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_33_in_interactionSignatureDef619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interactionSignatureDef_in_interactionDef638 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_27_in_interactionDef644 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleName_in_interactionDef649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_interactionDef673 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleName_in_interactionDef675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_choiceDef694 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_choiceDef698 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleName_in_choiceDef700 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_blockDef_in_choiceDef705 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_choiceDef709 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_blockDef_in_choiceDef711 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_27_in_directedChoiceDef732 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef734 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_36_in_directedChoiceDef741 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef743 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_25_in_directedChoiceDef747 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef750 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_30_in_directedChoiceDef758 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_onMessageDef_in_directedChoiceDef762 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_31_in_directedChoiceDef767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interactionSignatureDef_in_onMessageDef774 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_onMessageDef776 = new BitSet(new long[]{0x0002BF3048018000L});
    public static final BitSet FOLLOW_activityList_in_onMessageDef778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_in_activityList791 = new BitSet(new long[]{0x0002BF3048018000L});
    public static final BitSet FOLLOW_activityDef_in_activityList796 = new BitSet(new long[]{0x0002BF3048018002L});
    public static final BitSet FOLLOW_40_in_repeatDef806 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_repeatDef810 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleName_in_repeatDef812 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_25_in_repeatDef816 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleName_in_repeatDef818 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_blockDef_in_repeatDef826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_recBlockDef842 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_labelName_in_recBlockDef844 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_blockDef_in_recBlockDef846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_labelName861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelName_in_recursionDef873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_endDef889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_runDef899 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_protocolRefDef_in_runDef902 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_32_in_runDef906 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_parameter_in_runDef909 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_25_in_runDef913 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_parameter_in_runDef916 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_33_in_runDef921 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_runDef927 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleName_in_runDef929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_protocolRefDef937 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_protocolRefDef941 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_roleName_in_protocolRefDef943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarationName954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationName_in_parameter962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_inlineDef971 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_protocolRefDef_in_inlineDef974 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_inlineDef978 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_parameter_in_inlineDef981 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_25_in_inlineDef985 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_parameter_in_inlineDef988 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_33_in_inlineDef993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_parallelDef1005 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_blockDef_in_parallelDef1007 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_parallelDef1011 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_blockDef_in_parallelDef1013 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_47_in_globalEscapeDef1033 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_blockDef_in_globalEscapeDef1036 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_interruptDef_in_globalEscapeDef1040 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_interruptDef1052 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_blockDef_in_interruptDef1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_unorderedDef1063 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_blockDef_in_unorderedDef1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr1085 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_set_in_expr1089 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_term_in_expr1100 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_factor_in_term1112 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_set_in_term1116 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_factor_in_term1126 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_NUMBER_in_factor1138 = new BitSet(new long[]{0x0000000000000002L});

}