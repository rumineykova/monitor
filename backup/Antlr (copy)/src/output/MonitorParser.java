// $ANTLR 3.2 Sep 23, 2009 12:02:23 /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g 2011-11-18 22:38:22

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INTERACTION", "PLUS", "MINUS", "MULT", "DIV", "FULLSTOP", "RESV", "SEND", "BRANCH", "UNORDERED", "RECLABEL", "PARALLEL", "PROTOCOL", "ANNOTATION", "ID", "StringLiteral", "NUMBER", "DIGIT", "WHITESPACE", "ML_COMMENT", "LINE_COMMENT", "'import'", "'protocol'", "','", "';'", "'from'", "'as'", "'at'", "'{'", "'}'", "'('", "')'", "'role'", "'introduces'", "'to'", "'choice'", "'or'", "':'", "'repeat'", "'rec'", "'end'", "'run'", "'inline'", "'parallel'", "'and'", "'do'", "'interrupt'", "'unordered'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RESV=10;
    public static final int ANNOTATION=17;
    public static final int PARALLEL=15;
    public static final int ID=18;
    public static final int EOF=-1;
    public static final int PROTOCOL=16;
    public static final int ML_COMMENT=23;
    public static final int INTERACTION=4;
    public static final int T__51=51;
    public static final int FULLSTOP=9;
    public static final int PLUS=5;
    public static final int SEND=11;
    public static final int DIGIT=21;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int LINE_COMMENT=24;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RECLABEL=14;
    public static final int NUMBER=20;
    public static final int WHITESPACE=22;
    public static final int MINUS=6;
    public static final int MULT=7;
    public static final int UNORDERED=13;
    public static final int StringLiteral=19;
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
        "invalidRule", "protocolName", "synpred5_Monitor", "synpred50_Monitor", 
        "onMessageDef", "synpred13_Monitor", "synpred10_Monitor", "synpred28_Monitor", 
        "synpred32_Monitor", "labelName", "synpred20_Monitor", "synpred29_Monitor", 
        "importTypeStatement", "synpred34_Monitor", "synpred8_Monitor", 
        "dataTypeDef", "protocolBlockDef", "synpred26_Monitor", "synpred49_Monitor", 
        "term", "roleDef", "protocolRefDef", "synpred46_Monitor", "synpred31_Monitor", 
        "synpred36_Monitor", "synpred3_Monitor", "synpred9_Monitor", "synpred25_Monitor", 
        "recBlockDef", "synpred33_Monitor", "synpred39_Monitor", "synpred54_Monitor", 
        "synpred22_Monitor", "parameterDef", "simpleName", "synpred1_Monitor", 
        "description", "synpred48_Monitor", "synpred2_Monitor", "synpred27_Monitor", 
        "synpred53_Monitor", "expr", "repeatDef", "synpred6_Monitor", "interruptDef", 
        "activityDef", "importProtocolDef", "unorderedDef", "synpred17_Monitor", 
        "synpred47_Monitor", "roleName", "synpred7_Monitor", "declarationName", 
        "synpred23_Monitor", "factor", "blockDef", "synpred30_Monitor", 
        "synpred21_Monitor", "parameter", "endDef", "protocolDef", "synpred12_Monitor", 
        "synpred38_Monitor", "synpred42_Monitor", "synpred40_Monitor", "importProtocolStatement", 
        "directedChoiceDef", "activityList", "globalEscapeDef", "inlineDef", 
        "synpred52_Monitor", "interactionSignatureDef", "synpred24_Monitor", 
        "runDef", "synpred35_Monitor", "parameterDefs", "synpred16_Monitor", 
        "synpred43_Monitor", "activityListDef", "interactionDef", "recursionDef", 
        "parallelDef", "synpred41_Monitor", "synpred37_Monitor", "introducesDef", 
        "synpred11_Monitor", "synpred15_Monitor", "choiceDef", "synpred45_Monitor", 
        "importTypeDef", "synpred55_Monitor", "typeReferenceDef", "synpred44_Monitor", 
        "synpred51_Monitor", "synpred14_Monitor", "synpred19_Monitor", "synpred4_Monitor", 
        "synpred18_Monitor"
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
    public String getGrammarFileName() { return "/homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g"; }


    public static class description_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "description"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:1: description : ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef ;
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
        dbg.location(29, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:12: ( ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef
            {
            dbg.location(29,14);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )*
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

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:16: ( ANNOTATION )* ( importProtocolStatement | importTypeStatement )
            	    {
            	    dbg.location(29,16);
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:16: ( ANNOTATION )*
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

            	    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:18: ANNOTATION
            	    	    {
            	    	    dbg.location(29,18);
            	    	    ANNOTATION1=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_description161); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION1);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(1);}

            	    dbg.location(29,32);
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:32: ( importProtocolStatement | importTypeStatement )
            	    int alt2=2;
            	    try { dbg.enterSubRule(2);
            	    try { dbg.enterDecision(2);

            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==25) ) {
            	        int LA2_1 = input.LA(2);

            	        if ( (LA2_1==26) ) {
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

            	            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:34: importProtocolStatement
            	            {
            	            dbg.location(29,34);
            	            pushFollow(FOLLOW_importProtocolStatement_in_description168);
            	            importProtocolStatement2=importProtocolStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_importProtocolStatement.add(importProtocolStatement2.getTree());

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:60: importTypeStatement
            	            {
            	            dbg.location(29,60);
            	            pushFollow(FOLLOW_importTypeStatement_in_description172);
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

            dbg.location(29,85);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:85: ( ANNOTATION )*
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

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:29:87: ANNOTATION
            	    {
            	    dbg.location(29,87);
            	    ANNOTATION4=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_description181); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION4);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(29,101);
            pushFollow(FOLLOW_protocolDef_in_description186);
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
            // 29:113: -> protocolDef
            {
                dbg.location(29,116);
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
        dbg.location(29, 127);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:31:1: importProtocolStatement : 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' ;
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
        dbg.location(31, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:31:24: ( 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:31:26: 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(31,26);
            string_literal6=(Token)match(input,25,FOLLOW_25_in_importProtocolStatement197); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal6_tree = (Object)adaptor.create(string_literal6);
            adaptor.addChild(root_0, string_literal6_tree);
            }
            dbg.location(31,35);
            string_literal7=(Token)match(input,26,FOLLOW_26_in_importProtocolStatement199); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal7_tree = (Object)adaptor.create(string_literal7);
            adaptor.addChild(root_0, string_literal7_tree);
            }
            dbg.location(31,46);
            pushFollow(FOLLOW_importProtocolDef_in_importProtocolStatement201);
            importProtocolDef8=importProtocolDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importProtocolDef8.getTree());
            dbg.location(31,64);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:31:64: ( ',' importProtocolDef )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:31:66: ',' importProtocolDef
            	    {
            	    dbg.location(31,69);
            	    char_literal9=(Token)match(input,27,FOLLOW_27_in_importProtocolStatement205); if (state.failed) return retval;
            	    dbg.location(31,71);
            	    pushFollow(FOLLOW_importProtocolDef_in_importProtocolStatement208);
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

            dbg.location(31,95);
            char_literal11=(Token)match(input,28,FOLLOW_28_in_importProtocolStatement213); if (state.failed) return retval;

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
        dbg.location(31, 97);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:33:1: importProtocolDef : ID 'from' StringLiteral ;
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
        dbg.location(33, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:33:18: ( ID 'from' StringLiteral )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:33:20: ID 'from' StringLiteral
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(33,20);
            ID12=(Token)match(input,ID,FOLLOW_ID_in_importProtocolDef222); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID12_tree = (Object)adaptor.create(ID12);
            adaptor.addChild(root_0, ID12_tree);
            }
            dbg.location(33,29);
            string_literal13=(Token)match(input,29,FOLLOW_29_in_importProtocolDef224); if (state.failed) return retval;
            dbg.location(33,31);
            StringLiteral14=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_importProtocolDef227); if (state.failed) return retval;
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
        dbg.location(33, 44);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:35:1: importTypeStatement : 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' ;
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
        dbg.location(35, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:35:20: ( 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:35:22: 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(35,22);
            string_literal15=(Token)match(input,25,FOLLOW_25_in_importTypeStatement240); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal15_tree = (Object)adaptor.create(string_literal15);
            adaptor.addChild(root_0, string_literal15_tree);
            }
            dbg.location(35,31);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:35:31: ( simpleName )?
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

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:35:33: simpleName
                    {
                    dbg.location(35,33);
                    pushFollow(FOLLOW_simpleName_in_importTypeStatement244);
                    simpleName16=simpleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleName16.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(35,47);
            pushFollow(FOLLOW_importTypeDef_in_importTypeStatement249);
            importTypeDef17=importTypeDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importTypeDef17.getTree());
            dbg.location(35,61);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:35:61: ( ',' importTypeDef )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:35:63: ',' importTypeDef
            	    {
            	    dbg.location(35,66);
            	    char_literal18=(Token)match(input,27,FOLLOW_27_in_importTypeStatement253); if (state.failed) return retval;
            	    dbg.location(35,68);
            	    pushFollow(FOLLOW_importTypeDef_in_importTypeStatement256);
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

            dbg.location(35,85);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:35:85: ( 'from' StringLiteral )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:35:87: 'from' StringLiteral
                    {
                    dbg.location(35,93);
                    string_literal20=(Token)match(input,29,FOLLOW_29_in_importTypeStatement263); if (state.failed) return retval;
                    dbg.location(35,95);
                    StringLiteral21=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_importTypeStatement266); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral21_tree = (Object)adaptor.create(StringLiteral21);
                    adaptor.addChild(root_0, StringLiteral21_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(35,115);
            char_literal22=(Token)match(input,28,FOLLOW_28_in_importTypeStatement271); if (state.failed) return retval;

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
        dbg.location(35, 117);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:37:1: importTypeDef : ( dataTypeDef 'as' )? ID ;
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
        dbg.location(37, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:37:14: ( ( dataTypeDef 'as' )? ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:37:16: ( dataTypeDef 'as' )? ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(37,16);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:37:16: ( dataTypeDef 'as' )?
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

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:37:18: dataTypeDef 'as'
                    {
                    dbg.location(37,18);
                    pushFollow(FOLLOW_dataTypeDef_in_importTypeDef282);
                    dataTypeDef23=dataTypeDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dataTypeDef23.getTree());
                    dbg.location(37,34);
                    string_literal24=(Token)match(input,30,FOLLOW_30_in_importTypeDef284); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(37,39);
            ID25=(Token)match(input,ID,FOLLOW_ID_in_importTypeDef290); if (state.failed) return retval;
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
        dbg.location(37, 42);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:39:1: dataTypeDef : StringLiteral ;
    public final MonitorParser.dataTypeDef_return dataTypeDef() throws RecognitionException {
        MonitorParser.dataTypeDef_return retval = new MonitorParser.dataTypeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral26=null;

        Object StringLiteral26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "dataTypeDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:39:12: ( StringLiteral )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:39:14: StringLiteral
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(39,14);
            StringLiteral26=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dataTypeDef298); if (state.failed) return retval;
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
        dbg.location(39, 28);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:41:1: simpleName : ID ;
    public final MonitorParser.simpleName_return simpleName() throws RecognitionException {
        MonitorParser.simpleName_return retval = new MonitorParser.simpleName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID27=null;

        Object ID27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "simpleName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:41:11: ( ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:41:13: ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(41,13);
            ID27=(Token)match(input,ID,FOLLOW_ID_in_simpleName306); if (state.failed) return retval;
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
        dbg.location(41, 16);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:43:1: protocolDef : 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( PROTOCOL ( protocolBlockDef )+ ) ;
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
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_parameterDefs=new RewriteRuleSubtreeStream(adaptor,"rule parameterDefs");
        RewriteRuleSubtreeStream stream_protocolDef=new RewriteRuleSubtreeStream(adaptor,"rule protocolDef");
        RewriteRuleSubtreeStream stream_protocolName=new RewriteRuleSubtreeStream(adaptor,"rule protocolName");
        RewriteRuleSubtreeStream stream_protocolBlockDef=new RewriteRuleSubtreeStream(adaptor,"rule protocolBlockDef");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        try { dbg.enterRule(getGrammarFileName(), "protocolDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:43:12: ( 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( PROTOCOL ( protocolBlockDef )+ ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:43:14: 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}'
            {
            dbg.location(43,14);
            string_literal28=(Token)match(input,26,FOLLOW_26_in_protocolDef314); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(string_literal28);

            dbg.location(43,25);
            pushFollow(FOLLOW_protocolName_in_protocolDef316);
            protocolName29=protocolName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protocolName.add(protocolName29.getTree());
            dbg.location(43,38);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:43:38: ( 'at' roleName )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:43:40: 'at' roleName
                    {
                    dbg.location(43,40);
                    string_literal30=(Token)match(input,31,FOLLOW_31_in_protocolDef320); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(string_literal30);

                    dbg.location(43,45);
                    pushFollow(FOLLOW_roleName_in_protocolDef322);
                    roleName31=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName31.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(43,57);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:43:57: ( parameterDefs )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:43:59: parameterDefs
                    {
                    dbg.location(43,59);
                    pushFollow(FOLLOW_parameterDefs_in_protocolDef329);
                    parameterDefs32=parameterDefs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameterDefs.add(parameterDefs32.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(43,76);
            char_literal33=(Token)match(input,32,FOLLOW_32_in_protocolDef334); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal33);

            dbg.location(43,80);
            pushFollow(FOLLOW_protocolBlockDef_in_protocolDef336);
            protocolBlockDef34=protocolBlockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protocolBlockDef.add(protocolBlockDef34.getTree());
            dbg.location(43,97);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:43:97: ( ( ANNOTATION )* protocolDef )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==ANNOTATION||LA13_0==26) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:43:99: ( ANNOTATION )* protocolDef
            	    {
            	    dbg.location(43,99);
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:43:99: ( ANNOTATION )*
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

            	    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:43:101: ANNOTATION
            	    	    {
            	    	    dbg.location(43,101);
            	    	    ANNOTATION35=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_protocolDef342); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION35);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(12);}

            	    dbg.location(43,115);
            	    pushFollow(FOLLOW_protocolDef_in_protocolDef347);
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

            dbg.location(43,130);
            char_literal37=(Token)match(input,33,FOLLOW_33_in_protocolDef352); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_33.add(char_literal37);



            // AST REWRITE
            // elements: protocolBlockDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 44:7: -> ^( PROTOCOL ( protocolBlockDef )+ )
            {
                dbg.location(44,10);
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:44:10: ^( PROTOCOL ( protocolBlockDef )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(44,12);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROTOCOL, "PROTOCOL"), root_1);

                dbg.location(44,21);
                if ( !(stream_protocolBlockDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_protocolBlockDef.hasNext() ) {
                    dbg.location(44,21);
                    adaptor.addChild(root_1, stream_protocolBlockDef.nextTree());

                }
                stream_protocolBlockDef.reset();

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
        dbg.location(44, 39);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:46:1: protocolName : ID ;
    public final MonitorParser.protocolName_return protocolName() throws RecognitionException {
        MonitorParser.protocolName_return retval = new MonitorParser.protocolName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID38=null;

        Object ID38_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "protocolName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:46:13: ( ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:46:15: ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(46,15);
            ID38=(Token)match(input,ID,FOLLOW_ID_in_protocolName374); if (state.failed) return retval;
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
        dbg.location(46, 18);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:48:1: parameterDefs : '(' parameterDef ( ',' parameterDef )* ')' ;
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
        dbg.location(48, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:48:14: ( '(' parameterDef ( ',' parameterDef )* ')' )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:48:16: '(' parameterDef ( ',' parameterDef )* ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(48,19);
            char_literal39=(Token)match(input,34,FOLLOW_34_in_parameterDefs382); if (state.failed) return retval;
            dbg.location(48,21);
            pushFollow(FOLLOW_parameterDef_in_parameterDefs385);
            parameterDef40=parameterDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameterDef40.getTree());
            dbg.location(48,34);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:48:34: ( ',' parameterDef )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:48:36: ',' parameterDef
            	    {
            	    dbg.location(48,39);
            	    char_literal41=(Token)match(input,27,FOLLOW_27_in_parameterDefs389); if (state.failed) return retval;
            	    dbg.location(48,41);
            	    pushFollow(FOLLOW_parameterDef_in_parameterDefs392);
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

            dbg.location(48,60);
            char_literal43=(Token)match(input,35,FOLLOW_35_in_parameterDefs397); if (state.failed) return retval;

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
        dbg.location(48, 62);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:1: parameterDef : ( typeReferenceDef | 'role' ) simpleName ;
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
        dbg.location(50, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:13: ( ( typeReferenceDef | 'role' ) simpleName )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:15: ( typeReferenceDef | 'role' ) simpleName
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(50,15);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:15: ( typeReferenceDef | 'role' )
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
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

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:17: typeReferenceDef
                    {
                    dbg.location(50,17);
                    pushFollow(FOLLOW_typeReferenceDef_in_parameterDef408);
                    typeReferenceDef44=typeReferenceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeReferenceDef44.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:36: 'role'
                    {
                    dbg.location(50,36);
                    string_literal45=(Token)match(input,36,FOLLOW_36_in_parameterDef412); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal45_tree = (Object)adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(50,45);
            pushFollow(FOLLOW_simpleName_in_parameterDef416);
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
        dbg.location(50, 56);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:52:1: protocolBlockDef : activityListDef -> activityListDef ;
    public final MonitorParser.protocolBlockDef_return protocolBlockDef() throws RecognitionException {
        MonitorParser.protocolBlockDef_return retval = new MonitorParser.protocolBlockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.activityListDef_return activityListDef47 = null;


        RewriteRuleSubtreeStream stream_activityListDef=new RewriteRuleSubtreeStream(adaptor,"rule activityListDef");
        try { dbg.enterRule(getGrammarFileName(), "protocolBlockDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:52:17: ( activityListDef -> activityListDef )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:52:19: activityListDef
            {
            dbg.location(52,19);
            pushFollow(FOLLOW_activityListDef_in_protocolBlockDef424);
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
            // 52:35: -> activityListDef
            {
                dbg.location(52,38);
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
        dbg.location(52, 53);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:54:1: blockDef : '{' activityListDef '}' -> ^( BRANCH activityListDef ) ;
    public final MonitorParser.blockDef_return blockDef() throws RecognitionException {
        MonitorParser.blockDef_return retval = new MonitorParser.blockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        MonitorParser.activityListDef_return activityListDef49 = null;


        Object char_literal48_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_activityListDef=new RewriteRuleSubtreeStream(adaptor,"rule activityListDef");
        try { dbg.enterRule(getGrammarFileName(), "blockDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:54:9: ( '{' activityListDef '}' -> ^( BRANCH activityListDef ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:54:11: '{' activityListDef '}'
            {
            dbg.location(54,11);
            char_literal48=(Token)match(input,32,FOLLOW_32_in_blockDef435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal48);

            dbg.location(54,15);
            pushFollow(FOLLOW_activityListDef_in_blockDef437);
            activityListDef49=activityListDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_activityListDef.add(activityListDef49.getTree());
            dbg.location(54,31);
            char_literal50=(Token)match(input,33,FOLLOW_33_in_blockDef439); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_33.add(char_literal50);



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
            // 54:35: -> ^( BRANCH activityListDef )
            {
                dbg.location(54,38);
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:54:38: ^( BRANCH activityListDef )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(54,40);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BRANCH, "BRANCH"), root_1);

                dbg.location(54,47);
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
        dbg.location(54, 63);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:56:1: activityListDef : ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ ;
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
        dbg.location(56, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:56:16: ( ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:56:18: ( ( ANNOTATION )* activityDef )*
            {
            dbg.location(56,18);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:56:18: ( ( ANNOTATION )* activityDef )*
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

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:56:20: ( ANNOTATION )* activityDef
            	    {
            	    dbg.location(56,20);
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:56:20: ( ANNOTATION )*
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

            	    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:56:22: ANNOTATION
            	    	    {
            	    	    dbg.location(56,22);
            	    	    ANNOTATION51=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_activityListDef458); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION51);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(16);}

            	    dbg.location(56,36);
            	    pushFollow(FOLLOW_activityDef_in_activityListDef463);
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
            // 56:51: -> ( activityDef )+
            {
                dbg.location(56,54);
                if ( !(stream_activityDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_activityDef.hasNext() ) {
                    dbg.location(56,54);
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
        dbg.location(56, 66);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:58:1: activityDef : ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef );
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
        dbg.location(58, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:58:12: ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef )
            int alt19=8;
            try { dbg.enterDecision(19);

            switch ( input.LA(1) ) {
            case ID:
            case 44:
            case 45:
            case 46:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 29:
            case 32:
            case 38:
                {
                alt19=3;
                }
                break;
            case 47:
                {
                alt19=4;
                }
                break;
            case 42:
                {
                alt19=5;
                }
                break;
            case 51:
                {
                alt19=6;
                }
                break;
            case 43:
                {
                alt19=7;
                }
                break;
            case 49:
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

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:58:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(58,14);
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:58:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef )
                    int alt18=6;
                    try { dbg.enterSubRule(18);
                    try { dbg.enterDecision(18);

                    switch ( input.LA(1) ) {
                    case ID:
                        {
                        switch ( input.LA(2) ) {
                        case 29:
                        case 34:
                        case 38:
                            {
                            alt18=2;
                            }
                            break;
                        case 28:
                            {
                            alt18=5;
                            }
                            break;
                        case 37:
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
                    case 46:
                        {
                        alt18=3;
                        }
                        break;
                    case 45:
                        {
                        alt18=4;
                        }
                        break;
                    case 44:
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

                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:58:16: introducesDef
                            {
                            dbg.location(58,16);
                            pushFollow(FOLLOW_introducesDef_in_activityDef480);
                            introducesDef53=introducesDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, introducesDef53.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:58:32: interactionDef
                            {
                            dbg.location(58,32);
                            pushFollow(FOLLOW_interactionDef_in_activityDef484);
                            interactionDef54=interactionDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, interactionDef54.getTree());

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:58:49: inlineDef
                            {
                            dbg.location(58,49);
                            pushFollow(FOLLOW_inlineDef_in_activityDef488);
                            inlineDef55=inlineDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, inlineDef55.getTree());

                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:58:61: runDef
                            {
                            dbg.location(58,61);
                            pushFollow(FOLLOW_runDef_in_activityDef492);
                            runDef56=runDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, runDef56.getTree());

                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:58:70: recursionDef
                            {
                            dbg.location(58,70);
                            pushFollow(FOLLOW_recursionDef_in_activityDef496);
                            recursionDef57=recursionDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, recursionDef57.getTree());

                            }
                            break;
                        case 6 :
                            dbg.enterAlt(6);

                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:58:85: endDef
                            {
                            dbg.location(58,85);
                            pushFollow(FOLLOW_endDef_in_activityDef500);
                            endDef58=endDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, endDef58.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(18);}

                    dbg.location(58,97);
                    char_literal59=(Token)match(input,28,FOLLOW_28_in_activityDef504); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:59:4: choiceDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(59,4);
                    pushFollow(FOLLOW_choiceDef_in_activityDef513);
                    choiceDef60=choiceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, choiceDef60.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:59:16: directedChoiceDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(59,16);
                    pushFollow(FOLLOW_directedChoiceDef_in_activityDef517);
                    directedChoiceDef61=directedChoiceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, directedChoiceDef61.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:59:36: parallelDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(59,36);
                    pushFollow(FOLLOW_parallelDef_in_activityDef521);
                    parallelDef62=parallelDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parallelDef62.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:59:50: repeatDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(59,50);
                    pushFollow(FOLLOW_repeatDef_in_activityDef525);
                    repeatDef63=repeatDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, repeatDef63.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:59:62: unorderedDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(59,62);
                    pushFollow(FOLLOW_unorderedDef_in_activityDef529);
                    unorderedDef64=unorderedDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unorderedDef64.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:60:4: recBlockDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(60,4);
                    pushFollow(FOLLOW_recBlockDef_in_activityDef536);
                    recBlockDef65=recBlockDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recBlockDef65.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:60:18: globalEscapeDef
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(60,18);
                    pushFollow(FOLLOW_globalEscapeDef_in_activityDef540);
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
        dbg.location(60, 34);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:62:1: introducesDef : roleDef 'introduces' roleDef ( ',' roleDef )* ;
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
        dbg.location(62, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:62:14: ( roleDef 'introduces' roleDef ( ',' roleDef )* )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:62:16: roleDef 'introduces' roleDef ( ',' roleDef )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(62,16);
            pushFollow(FOLLOW_roleDef_in_introducesDef548);
            roleDef67=roleDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, roleDef67.getTree());
            dbg.location(62,24);
            string_literal68=(Token)match(input,37,FOLLOW_37_in_introducesDef550); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal68_tree = (Object)adaptor.create(string_literal68);
            adaptor.addChild(root_0, string_literal68_tree);
            }
            dbg.location(62,37);
            pushFollow(FOLLOW_roleDef_in_introducesDef552);
            roleDef69=roleDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, roleDef69.getTree());
            dbg.location(62,45);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:62:45: ( ',' roleDef )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:62:47: ',' roleDef
            	    {
            	    dbg.location(62,47);
            	    char_literal70=(Token)match(input,27,FOLLOW_27_in_introducesDef556); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal70_tree = (Object)adaptor.create(char_literal70);
            	    adaptor.addChild(root_0, char_literal70_tree);
            	    }
            	    dbg.location(62,51);
            	    pushFollow(FOLLOW_roleDef_in_introducesDef558);
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
        dbg.location(62, 62);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:64:1: roleDef : ID -> ID ;
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
        dbg.location(64, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:64:8: ( ID -> ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:64:10: ID
            {
            dbg.location(64,10);
            ID72=(Token)match(input,ID,FOLLOW_ID_in_roleDef569); if (state.failed) return retval; 
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
            // 64:13: -> ID
            {
                dbg.location(64,16);
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
        dbg.location(64, 18);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:66:1: roleName : ID -> ID ;
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
        dbg.location(66, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:66:9: ( ID -> ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:66:11: ID
            {
            dbg.location(66,11);
            ID73=(Token)match(input,ID,FOLLOW_ID_in_roleName580); if (state.failed) return retval; 
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
            // 66:14: -> ID
            {
                dbg.location(66,17);
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
        dbg.location(66, 19);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:68:1: typeReferenceDef : ID -> ID ;
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
        dbg.location(68, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:68:17: ( ID -> ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:68:19: ID
            {
            dbg.location(68,19);
            ID74=(Token)match(input,ID,FOLLOW_ID_in_typeReferenceDef591); if (state.failed) return retval; 
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
            // 68:22: -> ID
            {
                dbg.location(68,25);
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
        dbg.location(68, 28);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:1: interactionSignatureDef : ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' ) ;
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
        dbg.location(70, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:24: ( ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:26: ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(70,26);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:26: ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' )
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==34) ) {
                    alt23=2;
                }
                else if ( (LA23_1==29||LA23_1==38||LA23_1==41) ) {
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

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:28: typeReferenceDef
                    {
                    dbg.location(70,28);
                    pushFollow(FOLLOW_typeReferenceDef_in_interactionSignatureDef605);
                    typeReferenceDef75=typeReferenceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeReferenceDef75.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:47: ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')'
                    {
                    dbg.location(70,47);
                    ID76=(Token)match(input,ID,FOLLOW_ID_in_interactionSignatureDef609); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID76_tree = (Object)adaptor.create(ID76);
                    adaptor.addChild(root_0, ID76_tree);
                    }
                    dbg.location(70,53);
                    char_literal77=(Token)match(input,34,FOLLOW_34_in_interactionSignatureDef611); if (state.failed) return retval;
                    dbg.location(70,55);
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:55: ( typeReferenceDef ( ',' typeReferenceDef )* )?
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

                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:57: typeReferenceDef ( ',' typeReferenceDef )*
                            {
                            dbg.location(70,57);
                            pushFollow(FOLLOW_typeReferenceDef_in_interactionSignatureDef616);
                            typeReferenceDef78=typeReferenceDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeReferenceDef78.getTree());
                            dbg.location(70,74);
                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:74: ( ',' typeReferenceDef )*
                            try { dbg.enterSubRule(21);

                            loop21:
                            do {
                                int alt21=2;
                                try { dbg.enterDecision(21);

                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==27) ) {
                                    alt21=1;
                                }


                                } finally {dbg.exitDecision(21);}

                                switch (alt21) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:76: ',' typeReferenceDef
                            	    {
                            	    dbg.location(70,79);
                            	    char_literal79=(Token)match(input,27,FOLLOW_27_in_interactionSignatureDef620); if (state.failed) return retval;
                            	    dbg.location(70,81);
                            	    pushFollow(FOLLOW_typeReferenceDef_in_interactionSignatureDef623);
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

                    dbg.location(70,107);
                    char_literal81=(Token)match(input,35,FOLLOW_35_in_interactionSignatureDef631); if (state.failed) return retval;

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
        dbg.location(70, 110);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:73:1: interactionDef : interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) ) ;
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
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_interactionSignatureDef=new RewriteRuleSubtreeStream(adaptor,"rule interactionSignatureDef");
        try { dbg.enterRule(getGrammarFileName(), "interactionDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:73:15: ( interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:74:7: interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) )
            {
            dbg.location(74,7);
            pushFollow(FOLLOW_interactionSignatureDef_in_interactionDef649);
            interactionSignatureDef82=interactionSignatureDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_interactionSignatureDef.add(interactionSignatureDef82.getTree());
            dbg.location(74,31);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:74:31: ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) )
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            else if ( (LA24_0==38) ) {
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

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:75:3: 'from' role= roleName
                    {
                    dbg.location(75,3);
                    string_literal83=(Token)match(input,29,FOLLOW_29_in_interactionDef655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(string_literal83);

                    dbg.location(75,14);
                    pushFollow(FOLLOW_roleName_in_interactionDef660);
                    role=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(role.getTree());


                    // AST REWRITE
                    // elements: interactionSignatureDef, role
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
                    // 75:26: -> ^( RESV interactionSignatureDef $role)
                    {
                        dbg.location(75,29);
                        // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:75:29: ^( RESV interactionSignatureDef $role)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(75,31);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RESV, "RESV"), root_1);

                        dbg.location(75,36);
                        adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree());
                        dbg.location(75,60);
                        adaptor.addChild(root_1, stream_role.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:76:10: 'to' roleName
                    {
                    dbg.location(76,10);
                    string_literal84=(Token)match(input,38,FOLLOW_38_in_interactionDef684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal84);

                    dbg.location(76,15);
                    pushFollow(FOLLOW_roleName_in_interactionDef686);
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
                    // 76:25: -> ^( SEND interactionSignatureDef roleName )
                    {
                        dbg.location(76,28);
                        // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:76:28: ^( SEND interactionSignatureDef roleName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(76,30);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEND, "SEND"), root_1);

                        dbg.location(76,35);
                        adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree());
                        dbg.location(76,59);
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
        dbg.location(76, 69);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:78:1: choiceDef : 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) ;
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
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try { dbg.enterRule(getGrammarFileName(), "choiceDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:78:10: ( 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:78:12: 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )*
            {
            dbg.location(78,12);
            string_literal86=(Token)match(input,39,FOLLOW_39_in_choiceDef705); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(string_literal86);

            dbg.location(78,21);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:78:21: ( 'at' roleName )?
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:78:23: 'at' roleName
                    {
                    dbg.location(78,23);
                    string_literal87=(Token)match(input,31,FOLLOW_31_in_choiceDef709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(string_literal87);

                    dbg.location(78,28);
                    pushFollow(FOLLOW_roleName_in_choiceDef711);
                    roleName88=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName88.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(78,40);
            pushFollow(FOLLOW_blockDef_in_choiceDef716);
            blockDef89=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef89.getTree());
            dbg.location(78,49);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:78:49: ( 'or' blockDef )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:78:51: 'or' blockDef
            	    {
            	    dbg.location(78,51);
            	    string_literal90=(Token)match(input,40,FOLLOW_40_in_choiceDef720); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_40.add(string_literal90);

            	    dbg.location(78,56);
            	    pushFollow(FOLLOW_blockDef_in_choiceDef722);
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
            // elements: blockDef, 39
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 78:68: -> ^( 'choice' ( blockDef )+ )
            {
                dbg.location(78,71);
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:78:71: ^( 'choice' ( blockDef )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(78,73);
                root_1 = (Object)adaptor.becomeRoot(stream_39.nextNode(), root_1);

                dbg.location(78,82);
                if ( !(stream_blockDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_blockDef.hasNext() ) {
                    dbg.location(78,82);
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
        dbg.location(78, 92);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:1: directedChoiceDef : ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' ;
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
        dbg.location(80, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:18: ( ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:20: ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(80,20);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:20: ( 'from' roleName )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:22: 'from' roleName
                    {
                    dbg.location(80,22);
                    string_literal92=(Token)match(input,29,FOLLOW_29_in_directedChoiceDef743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal92_tree = (Object)adaptor.create(string_literal92);
                    adaptor.addChild(root_0, string_literal92_tree);
                    }
                    dbg.location(80,29);
                    pushFollow(FOLLOW_roleName_in_directedChoiceDef745);
                    roleName93=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName93.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(80,41);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:41: ( 'to' roleName ( ',' roleName )* )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:43: 'to' roleName ( ',' roleName )*
                    {
                    dbg.location(80,43);
                    string_literal94=(Token)match(input,38,FOLLOW_38_in_directedChoiceDef752); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal94_tree = (Object)adaptor.create(string_literal94);
                    adaptor.addChild(root_0, string_literal94_tree);
                    }
                    dbg.location(80,48);
                    pushFollow(FOLLOW_roleName_in_directedChoiceDef754);
                    roleName95=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName95.getTree());
                    dbg.location(80,57);
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:57: ( ',' roleName )*
                    try { dbg.enterSubRule(28);

                    loop28:
                    do {
                        int alt28=2;
                        try { dbg.enterDecision(28);

                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==27) ) {
                            alt28=1;
                        }


                        } finally {dbg.exitDecision(28);}

                        switch (alt28) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:59: ',' roleName
                    	    {
                    	    dbg.location(80,62);
                    	    char_literal96=(Token)match(input,27,FOLLOW_27_in_directedChoiceDef758); if (state.failed) return retval;
                    	    dbg.location(80,64);
                    	    pushFollow(FOLLOW_roleName_in_directedChoiceDef761);
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

            dbg.location(80,79);
            char_literal98=(Token)match(input,32,FOLLOW_32_in_directedChoiceDef769); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal98_tree = (Object)adaptor.create(char_literal98);
            adaptor.addChild(root_0, char_literal98_tree);
            }
            dbg.location(80,83);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:83: ( onMessageDef )+
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

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:85: onMessageDef
            	    {
            	    dbg.location(80,85);
            	    pushFollow(FOLLOW_onMessageDef_in_directedChoiceDef773);
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

            dbg.location(80,101);
            char_literal100=(Token)match(input,33,FOLLOW_33_in_directedChoiceDef778); if (state.failed) return retval;
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
        dbg.location(80, 104);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:1: onMessageDef : interactionSignatureDef ':' activityList ;
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
        dbg.location(82, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:13: ( interactionSignatureDef ':' activityList )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:15: interactionSignatureDef ':' activityList
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(82,15);
            pushFollow(FOLLOW_interactionSignatureDef_in_onMessageDef785);
            interactionSignatureDef101=interactionSignatureDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interactionSignatureDef101.getTree());
            dbg.location(82,39);
            char_literal102=(Token)match(input,41,FOLLOW_41_in_onMessageDef787); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal102_tree = (Object)adaptor.create(char_literal102);
            adaptor.addChild(root_0, char_literal102_tree);
            }
            dbg.location(82,43);
            pushFollow(FOLLOW_activityList_in_onMessageDef789);
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
        dbg.location(82, 56);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:84:1: activityList : ( ( ANNOTATION )* activityDef )* ;
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
        dbg.location(84, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:84:13: ( ( ( ANNOTATION )* activityDef )* )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:84:15: ( ( ANNOTATION )* activityDef )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(84,15);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:84:15: ( ( ANNOTATION )* activityDef )*
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

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:84:17: ( ANNOTATION )* activityDef
            	    {
            	    dbg.location(84,17);
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:84:17: ( ANNOTATION )*
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

            	    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:84:19: ANNOTATION
            	    	    {
            	    	    dbg.location(84,19);
            	    	    ANNOTATION104=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_activityList802); if (state.failed) return retval;
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

            	    dbg.location(84,33);
            	    pushFollow(FOLLOW_activityDef_in_activityList807);
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
        dbg.location(84, 47);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:86:1: repeatDef : 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) ;
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
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try { dbg.enterRule(getGrammarFileName(), "repeatDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:86:10: ( 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:86:12: 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef
            {
            dbg.location(86,12);
            string_literal106=(Token)match(input,42,FOLLOW_42_in_repeatDef817); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(string_literal106);

            dbg.location(86,21);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:86:21: ( 'at' roleName ( ',' roleName )* )?
            int alt34=2;
            try { dbg.enterSubRule(34);
            try { dbg.enterDecision(34);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:86:23: 'at' roleName ( ',' roleName )*
                    {
                    dbg.location(86,23);
                    string_literal107=(Token)match(input,31,FOLLOW_31_in_repeatDef821); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(string_literal107);

                    dbg.location(86,28);
                    pushFollow(FOLLOW_roleName_in_repeatDef823);
                    roleName108=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName108.getTree());
                    dbg.location(86,37);
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:86:37: ( ',' roleName )*
                    try { dbg.enterSubRule(33);

                    loop33:
                    do {
                        int alt33=2;
                        try { dbg.enterDecision(33);

                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==27) ) {
                            alt33=1;
                        }


                        } finally {dbg.exitDecision(33);}

                        switch (alt33) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:86:39: ',' roleName
                    	    {
                    	    dbg.location(86,39);
                    	    char_literal109=(Token)match(input,27,FOLLOW_27_in_repeatDef827); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_27.add(char_literal109);

                    	    dbg.location(86,43);
                    	    pushFollow(FOLLOW_roleName_in_repeatDef829);
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

            dbg.location(86,58);
            pushFollow(FOLLOW_blockDef_in_repeatDef837);
            blockDef111=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef111.getTree());


            // AST REWRITE
            // elements: 42, blockDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:68: -> ^( 'repeat' blockDef )
            {
                dbg.location(86,71);
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:86:71: ^( 'repeat' blockDef )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(86,73);
                root_1 = (Object)adaptor.becomeRoot(stream_42.nextNode(), root_1);

                dbg.location(86,82);
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
        dbg.location(86, 91);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:88:1: recBlockDef : 'rec' labelName blockDef -> ^( 'rec' labelName blockDef ) ;
    public final MonitorParser.recBlockDef_return recBlockDef() throws RecognitionException {
        MonitorParser.recBlockDef_return retval = new MonitorParser.recBlockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal112=null;
        MonitorParser.labelName_return labelName113 = null;

        MonitorParser.blockDef_return blockDef114 = null;


        Object string_literal112_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_labelName=new RewriteRuleSubtreeStream(adaptor,"rule labelName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try { dbg.enterRule(getGrammarFileName(), "recBlockDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:88:12: ( 'rec' labelName blockDef -> ^( 'rec' labelName blockDef ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:88:14: 'rec' labelName blockDef
            {
            dbg.location(88,14);
            string_literal112=(Token)match(input,43,FOLLOW_43_in_recBlockDef853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(string_literal112);

            dbg.location(88,20);
            pushFollow(FOLLOW_labelName_in_recBlockDef855);
            labelName113=labelName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_labelName.add(labelName113.getTree());
            dbg.location(88,30);
            pushFollow(FOLLOW_blockDef_in_recBlockDef857);
            blockDef114=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef114.getTree());


            // AST REWRITE
            // elements: labelName, blockDef, 43
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 88:39: -> ^( 'rec' labelName blockDef )
            {
                dbg.location(88,42);
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:88:42: ^( 'rec' labelName blockDef )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(88,44);
                root_1 = (Object)adaptor.becomeRoot(stream_43.nextNode(), root_1);

                dbg.location(88,50);
                adaptor.addChild(root_1, stream_labelName.nextTree());
                dbg.location(88,60);
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
        dbg.location(88, 69);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:90:1: labelName : ID -> ID ;
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
        dbg.location(90, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:90:10: ( ID -> ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:90:12: ID
            {
            dbg.location(90,12);
            ID115=(Token)match(input,ID,FOLLOW_ID_in_labelName874); if (state.failed) return retval; 
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
            // 90:15: -> ID
            {
                dbg.location(90,18);
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
        dbg.location(90, 21);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:1: recursionDef : labelName -> ^( RECLABEL labelName ) ;
    public final MonitorParser.recursionDef_return recursionDef() throws RecognitionException {
        MonitorParser.recursionDef_return retval = new MonitorParser.recursionDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.labelName_return labelName116 = null;


        RewriteRuleSubtreeStream stream_labelName=new RewriteRuleSubtreeStream(adaptor,"rule labelName");
        try { dbg.enterRule(getGrammarFileName(), "recursionDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(92, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:13: ( labelName -> ^( RECLABEL labelName ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:15: labelName
            {
            dbg.location(92,15);
            pushFollow(FOLLOW_labelName_in_recursionDef886);
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
            // 92:25: -> ^( RECLABEL labelName )
            {
                dbg.location(92,28);
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:28: ^( RECLABEL labelName )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(92,30);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECLABEL, "RECLABEL"), root_1);

                dbg.location(92,39);
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
        dbg.location(92, 49);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:95:1: endDef : 'end' ;
    public final MonitorParser.endDef_return endDef() throws RecognitionException {
        MonitorParser.endDef_return retval = new MonitorParser.endDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal117=null;

        Object string_literal117_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "endDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:95:7: ( 'end' )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:95:9: 'end'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(95,14);
            string_literal117=(Token)match(input,44,FOLLOW_44_in_endDef902); if (state.failed) return retval;
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
        dbg.location(95, 16);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:1: runDef : 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName ;
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
        dbg.location(98, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:7: ( 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:9: 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(98,14);
            string_literal118=(Token)match(input,45,FOLLOW_45_in_runDef912); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal118_tree = (Object)adaptor.create(string_literal118);
            root_0 = (Object)adaptor.becomeRoot(string_literal118_tree, root_0);
            }
            dbg.location(98,16);
            pushFollow(FOLLOW_protocolRefDef_in_runDef915);
            protocolRefDef119=protocolRefDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolRefDef119.getTree());
            dbg.location(98,31);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:31: ( '(' parameter ( ',' parameter )* ')' )?
            int alt36=2;
            try { dbg.enterSubRule(36);
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:33: '(' parameter ( ',' parameter )* ')'
                    {
                    dbg.location(98,36);
                    char_literal120=(Token)match(input,34,FOLLOW_34_in_runDef919); if (state.failed) return retval;
                    dbg.location(98,38);
                    pushFollow(FOLLOW_parameter_in_runDef922);
                    parameter121=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter121.getTree());
                    dbg.location(98,48);
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:48: ( ',' parameter )*
                    try { dbg.enterSubRule(35);

                    loop35:
                    do {
                        int alt35=2;
                        try { dbg.enterDecision(35);

                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==27) ) {
                            alt35=1;
                        }


                        } finally {dbg.exitDecision(35);}

                        switch (alt35) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:50: ',' parameter
                    	    {
                    	    dbg.location(98,53);
                    	    char_literal122=(Token)match(input,27,FOLLOW_27_in_runDef926); if (state.failed) return retval;
                    	    dbg.location(98,55);
                    	    pushFollow(FOLLOW_parameter_in_runDef929);
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

                    dbg.location(98,71);
                    char_literal124=(Token)match(input,35,FOLLOW_35_in_runDef934); if (state.failed) return retval;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(36);}

            dbg.location(98,76);
            string_literal125=(Token)match(input,29,FOLLOW_29_in_runDef940); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal125_tree = (Object)adaptor.create(string_literal125);
            adaptor.addChild(root_0, string_literal125_tree);
            }
            dbg.location(98,83);
            pushFollow(FOLLOW_roleName_in_runDef942);
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
        dbg.location(98, 92);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:100:1: protocolRefDef : ID ( 'at' roleName )? ;
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
        dbg.location(100, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:100:15: ( ID ( 'at' roleName )? )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:100:17: ID ( 'at' roleName )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(100,17);
            ID127=(Token)match(input,ID,FOLLOW_ID_in_protocolRefDef950); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID127_tree = (Object)adaptor.create(ID127);
            adaptor.addChild(root_0, ID127_tree);
            }
            dbg.location(100,20);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:100:20: ( 'at' roleName )?
            int alt37=2;
            try { dbg.enterSubRule(37);
            try { dbg.enterDecision(37);

            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:100:22: 'at' roleName
                    {
                    dbg.location(100,22);
                    string_literal128=(Token)match(input,31,FOLLOW_31_in_protocolRefDef954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal128_tree = (Object)adaptor.create(string_literal128);
                    adaptor.addChild(root_0, string_literal128_tree);
                    }
                    dbg.location(100,27);
                    pushFollow(FOLLOW_roleName_in_protocolRefDef956);
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
        dbg.location(100, 39);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:102:1: declarationName : ID ;
    public final MonitorParser.declarationName_return declarationName() throws RecognitionException {
        MonitorParser.declarationName_return retval = new MonitorParser.declarationName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID130=null;

        Object ID130_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "declarationName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:102:16: ( ID )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:102:18: ID
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(102,18);
            ID130=(Token)match(input,ID,FOLLOW_ID_in_declarationName967); if (state.failed) return retval;
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
        dbg.location(102, 21);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:104:1: parameter : declarationName ;
    public final MonitorParser.parameter_return parameter() throws RecognitionException {
        MonitorParser.parameter_return retval = new MonitorParser.parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.declarationName_return declarationName131 = null;



        try { dbg.enterRule(getGrammarFileName(), "parameter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:104:10: ( declarationName )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:104:12: declarationName
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(104,12);
            pushFollow(FOLLOW_declarationName_in_parameter975);
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
        dbg.location(104, 28);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:107:1: inlineDef : 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? ;
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
        dbg.location(107, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:107:10: ( 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:107:12: 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(107,20);
            string_literal132=(Token)match(input,46,FOLLOW_46_in_inlineDef984); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal132_tree = (Object)adaptor.create(string_literal132);
            root_0 = (Object)adaptor.becomeRoot(string_literal132_tree, root_0);
            }
            dbg.location(107,22);
            pushFollow(FOLLOW_protocolRefDef_in_inlineDef987);
            protocolRefDef133=protocolRefDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolRefDef133.getTree());
            dbg.location(107,37);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:107:37: ( '(' parameter ( ',' parameter )* ')' )?
            int alt39=2;
            try { dbg.enterSubRule(39);
            try { dbg.enterDecision(39);

            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            } finally {dbg.exitDecision(39);}

            switch (alt39) {
                case 1 :
                    dbg.enterAlt(1);

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:107:39: '(' parameter ( ',' parameter )* ')'
                    {
                    dbg.location(107,42);
                    char_literal134=(Token)match(input,34,FOLLOW_34_in_inlineDef991); if (state.failed) return retval;
                    dbg.location(107,44);
                    pushFollow(FOLLOW_parameter_in_inlineDef994);
                    parameter135=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter135.getTree());
                    dbg.location(107,54);
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:107:54: ( ',' parameter )*
                    try { dbg.enterSubRule(38);

                    loop38:
                    do {
                        int alt38=2;
                        try { dbg.enterDecision(38);

                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==27) ) {
                            alt38=1;
                        }


                        } finally {dbg.exitDecision(38);}

                        switch (alt38) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:107:56: ',' parameter
                    	    {
                    	    dbg.location(107,59);
                    	    char_literal136=(Token)match(input,27,FOLLOW_27_in_inlineDef998); if (state.failed) return retval;
                    	    dbg.location(107,61);
                    	    pushFollow(FOLLOW_parameter_in_inlineDef1001);
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

                    dbg.location(107,77);
                    char_literal138=(Token)match(input,35,FOLLOW_35_in_inlineDef1006); if (state.failed) return retval;

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
        dbg.location(107, 82);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:109:1: parallelDef : 'parallel' blockDef ( 'and' blockDef )* -> ^( PARALLEL ( blockDef )+ ) ;
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
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try { dbg.enterRule(getGrammarFileName(), "parallelDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:109:12: ( 'parallel' blockDef ( 'and' blockDef )* -> ^( PARALLEL ( blockDef )+ ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:109:14: 'parallel' blockDef ( 'and' blockDef )*
            {
            dbg.location(109,14);
            string_literal139=(Token)match(input,47,FOLLOW_47_in_parallelDef1018); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(string_literal139);

            dbg.location(109,25);
            pushFollow(FOLLOW_blockDef_in_parallelDef1020);
            blockDef140=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef140.getTree());
            dbg.location(109,34);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:109:34: ( 'and' blockDef )*
            try { dbg.enterSubRule(40);

            loop40:
            do {
                int alt40=2;
                try { dbg.enterDecision(40);

                int LA40_0 = input.LA(1);

                if ( (LA40_0==48) ) {
                    alt40=1;
                }


                } finally {dbg.exitDecision(40);}

                switch (alt40) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:109:36: 'and' blockDef
            	    {
            	    dbg.location(109,36);
            	    string_literal141=(Token)match(input,48,FOLLOW_48_in_parallelDef1024); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(string_literal141);

            	    dbg.location(109,42);
            	    pushFollow(FOLLOW_blockDef_in_parallelDef1026);
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
            // 109:54: -> ^( PARALLEL ( blockDef )+ )
            {
                dbg.location(109,57);
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:109:57: ^( PARALLEL ( blockDef )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(109,59);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARALLEL, "PARALLEL"), root_1);

                dbg.location(109,68);
                if ( !(stream_blockDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_blockDef.hasNext() ) {
                    dbg.location(109,68);
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
        dbg.location(109, 78);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:112:1: globalEscapeDef : 'do' blockDef ( interruptDef )+ ;
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
        dbg.location(112, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:112:16: ( 'do' blockDef ( interruptDef )+ )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:112:18: 'do' blockDef ( interruptDef )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(112,22);
            string_literal143=(Token)match(input,49,FOLLOW_49_in_globalEscapeDef1046); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal143_tree = (Object)adaptor.create(string_literal143);
            root_0 = (Object)adaptor.becomeRoot(string_literal143_tree, root_0);
            }
            dbg.location(112,24);
            pushFollow(FOLLOW_blockDef_in_globalEscapeDef1049);
            blockDef144=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockDef144.getTree());
            dbg.location(112,33);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:112:33: ( interruptDef )+
            int cnt41=0;
            try { dbg.enterSubRule(41);

            loop41:
            do {
                int alt41=2;
                try { dbg.enterDecision(41);

                int LA41_0 = input.LA(1);

                if ( (LA41_0==50) ) {
                    alt41=1;
                }


                } finally {dbg.exitDecision(41);}

                switch (alt41) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:112:35: interruptDef
            	    {
            	    dbg.location(112,35);
            	    pushFollow(FOLLOW_interruptDef_in_globalEscapeDef1053);
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
        dbg.location(112, 51);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:115:1: interruptDef : 'interrupt' blockDef ;
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
        dbg.location(115, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:115:13: ( 'interrupt' blockDef )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:115:15: 'interrupt' blockDef
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(115,26);
            string_literal146=(Token)match(input,50,FOLLOW_50_in_interruptDef1065); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal146_tree = (Object)adaptor.create(string_literal146);
            root_0 = (Object)adaptor.becomeRoot(string_literal146_tree, root_0);
            }
            dbg.location(115,28);
            pushFollow(FOLLOW_blockDef_in_interruptDef1068);
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
        dbg.location(115, 37);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:117:1: unorderedDef : 'unordered' blockDef -> ^( UNORDERED blockDef ) ;
    public final MonitorParser.unorderedDef_return unorderedDef() throws RecognitionException {
        MonitorParser.unorderedDef_return retval = new MonitorParser.unorderedDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal148=null;
        MonitorParser.blockDef_return blockDef149 = null;


        Object string_literal148_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try { dbg.enterRule(getGrammarFileName(), "unorderedDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:117:13: ( 'unordered' blockDef -> ^( UNORDERED blockDef ) )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:117:15: 'unordered' blockDef
            {
            dbg.location(117,15);
            string_literal148=(Token)match(input,51,FOLLOW_51_in_unorderedDef1076); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(string_literal148);

            dbg.location(117,27);
            pushFollow(FOLLOW_blockDef_in_unorderedDef1078);
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
            // 117:36: -> ^( UNORDERED blockDef )
            {
                dbg.location(117,39);
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:117:39: ^( UNORDERED blockDef )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(117,41);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNORDERED, "UNORDERED"), root_1);

                dbg.location(117,51);
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
        dbg.location(117, 60);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:126:1: expr : term ( ( PLUS | MINUS ) term )* ;
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
        dbg.location(126, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:126:6: ( term ( ( PLUS | MINUS ) term )* )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:126:8: term ( ( PLUS | MINUS ) term )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(126,8);
            pushFollow(FOLLOW_term_in_expr1098);
            term150=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term150.getTree());
            dbg.location(126,13);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:126:13: ( ( PLUS | MINUS ) term )*
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

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:126:15: ( PLUS | MINUS ) term
            	    {
            	    dbg.location(126,15);
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

            	    dbg.location(126,33);
            	    pushFollow(FOLLOW_term_in_expr1113);
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
        dbg.location(126, 41);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:128:1: term : factor ( ( MULT | DIV ) factor )* ;
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
        dbg.location(128, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:128:6: ( factor ( ( MULT | DIV ) factor )* )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:128:8: factor ( ( MULT | DIV ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,8);
            pushFollow(FOLLOW_factor_in_term1125);
            factor153=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor153.getTree());
            dbg.location(128,15);
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:128:15: ( ( MULT | DIV ) factor )*
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

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:128:17: ( MULT | DIV ) factor
            	    {
            	    dbg.location(128,17);
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

            	    dbg.location(128,32);
            	    pushFollow(FOLLOW_factor_in_term1139);
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
        dbg.location(128, 42);

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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:130:1: factor : NUMBER ;
    public final MonitorParser.factor_return factor() throws RecognitionException {
        MonitorParser.factor_return retval = new MonitorParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER156=null;

        Object NUMBER156_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(130, 1);

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:130:8: ( NUMBER )
            dbg.enterAlt(1);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:130:10: NUMBER
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(130,10);
            NUMBER156=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1151); if (state.failed) return retval;
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
        dbg.location(130, 17);

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
        "\2\21\2\uffff";
    static final String DFA3_maxS =
        "\2\32\2\uffff";
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
            return "()* loopback of 29:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )*";
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
        "\2\21\2\uffff";
    static final String DFA17_maxS =
        "\2\63\2\uffff";
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
            return "()* loopback of 56:18: ( ( ANNOTATION )* activityDef )*";
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
        "\1\21\1\uffff\1\34\1\uffff\1\22\1\33\1\35\1\22\1\33";
    static final String DFA32_maxS =
        "\1\63\1\uffff\1\51\1\uffff\2\43\1\51\1\22\1\43";
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
            return "()* loopback of 84:15: ( ( ANNOTATION )* activityDef )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_ANNOTATION_in_description161 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_importProtocolStatement_in_description168 = new BitSet(new long[]{0x0000000006020000L});
    public static final BitSet FOLLOW_importTypeStatement_in_description172 = new BitSet(new long[]{0x0000000006020000L});
    public static final BitSet FOLLOW_ANNOTATION_in_description181 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_protocolDef_in_description186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_importProtocolStatement197 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_importProtocolStatement199 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_importProtocolDef_in_importProtocolStatement201 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_importProtocolStatement205 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_importProtocolDef_in_importProtocolStatement208 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_importProtocolStatement213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_importProtocolDef222 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_importProtocolDef224 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_StringLiteral_in_importProtocolDef227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_importTypeStatement240 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_simpleName_in_importTypeStatement244 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_importTypeDef_in_importTypeStatement249 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_27_in_importTypeStatement253 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_importTypeDef_in_importTypeStatement256 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_29_in_importTypeStatement263 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_StringLiteral_in_importTypeStatement266 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_importTypeStatement271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataTypeDef_in_importTypeDef282 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_importTypeDef284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_importTypeDef290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_dataTypeDef298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleName306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_protocolDef314 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_protocolName_in_protocolDef316 = new BitSet(new long[]{0x0000000580000000L});
    public static final BitSet FOLLOW_31_in_protocolDef320 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleName_in_protocolDef322 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_parameterDefs_in_protocolDef329 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_protocolDef334 = new BitSet(new long[]{0x000AFCC120060000L});
    public static final BitSet FOLLOW_protocolBlockDef_in_protocolDef336 = new BitSet(new long[]{0x0000000204020000L});
    public static final BitSet FOLLOW_ANNOTATION_in_protocolDef342 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_protocolDef_in_protocolDef347 = new BitSet(new long[]{0x0000000204020000L});
    public static final BitSet FOLLOW_33_in_protocolDef352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_protocolName374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parameterDefs382 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_parameterDef_in_parameterDefs385 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_27_in_parameterDefs389 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_parameterDef_in_parameterDefs392 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_35_in_parameterDefs397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeReferenceDef_in_parameterDef408 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_36_in_parameterDef412 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_simpleName_in_parameterDef416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activityListDef_in_protocolBlockDef424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_blockDef435 = new BitSet(new long[]{0x000AFCC320060000L});
    public static final BitSet FOLLOW_activityListDef_in_blockDef437 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_blockDef439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_in_activityListDef458 = new BitSet(new long[]{0x000AFCC120060000L});
    public static final BitSet FOLLOW_activityDef_in_activityListDef463 = new BitSet(new long[]{0x000AFCC120060002L});
    public static final BitSet FOLLOW_introducesDef_in_activityDef480 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_interactionDef_in_activityDef484 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_inlineDef_in_activityDef488 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_runDef_in_activityDef492 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_recursionDef_in_activityDef496 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_endDef_in_activityDef500 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_activityDef504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choiceDef_in_activityDef513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directedChoiceDef_in_activityDef517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallelDef_in_activityDef521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatDef_in_activityDef525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedDef_in_activityDef529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recBlockDef_in_activityDef536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalEscapeDef_in_activityDef540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef548 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_introducesDef550 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef552 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_introducesDef556 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef558 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ID_in_roleDef569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_roleName580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typeReferenceDef591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeReferenceDef_in_interactionSignatureDef605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_interactionSignatureDef609 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_interactionSignatureDef611 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_typeReferenceDef_in_interactionSignatureDef616 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_27_in_interactionSignatureDef620 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_typeReferenceDef_in_interactionSignatureDef623 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_35_in_interactionSignatureDef631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interactionSignatureDef_in_interactionDef649 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_29_in_interactionDef655 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleName_in_interactionDef660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_interactionDef684 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleName_in_interactionDef686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_choiceDef705 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_choiceDef709 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleName_in_choiceDef711 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_blockDef_in_choiceDef716 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_choiceDef720 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_blockDef_in_choiceDef722 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_29_in_directedChoiceDef743 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef745 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_38_in_directedChoiceDef752 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef754 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_27_in_directedChoiceDef758 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef761 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_32_in_directedChoiceDef769 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_onMessageDef_in_directedChoiceDef773 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_33_in_directedChoiceDef778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interactionSignatureDef_in_onMessageDef785 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_onMessageDef787 = new BitSet(new long[]{0x000AFCC120060000L});
    public static final BitSet FOLLOW_activityList_in_onMessageDef789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_in_activityList802 = new BitSet(new long[]{0x000AFCC120060000L});
    public static final BitSet FOLLOW_activityDef_in_activityList807 = new BitSet(new long[]{0x000AFCC120060002L});
    public static final BitSet FOLLOW_42_in_repeatDef817 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_repeatDef821 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleName_in_repeatDef823 = new BitSet(new long[]{0x0000000188000000L});
    public static final BitSet FOLLOW_27_in_repeatDef827 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleName_in_repeatDef829 = new BitSet(new long[]{0x0000000188000000L});
    public static final BitSet FOLLOW_blockDef_in_repeatDef837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_recBlockDef853 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_labelName_in_recBlockDef855 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_blockDef_in_recBlockDef857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_labelName874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelName_in_recursionDef886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_endDef902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_runDef912 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_protocolRefDef_in_runDef915 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_34_in_runDef919 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_in_runDef922 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_27_in_runDef926 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_in_runDef929 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_35_in_runDef934 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_runDef940 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleName_in_runDef942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_protocolRefDef950 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_protocolRefDef954 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_roleName_in_protocolRefDef956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarationName967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationName_in_parameter975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_inlineDef984 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_protocolRefDef_in_inlineDef987 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_inlineDef991 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_in_inlineDef994 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_27_in_inlineDef998 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_parameter_in_inlineDef1001 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_35_in_inlineDef1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_parallelDef1018 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_blockDef_in_parallelDef1020 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_parallelDef1024 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_blockDef_in_parallelDef1026 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_49_in_globalEscapeDef1046 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_blockDef_in_globalEscapeDef1049 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_interruptDef_in_globalEscapeDef1053 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_interruptDef1065 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_blockDef_in_interruptDef1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_unorderedDef1076 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_blockDef_in_unorderedDef1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr1098 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_set_in_expr1102 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_term_in_expr1113 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_factor_in_term1125 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_set_in_term1129 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_factor_in_term1139 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_NUMBER_in_factor1151 = new BitSet(new long[]{0x0000000000000002L});

}