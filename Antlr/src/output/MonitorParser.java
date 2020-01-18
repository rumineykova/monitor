// $ANTLR 3.2 Sep 23, 2009 12:02:23 /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g 2011-12-08 17:39:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class MonitorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INTERACTION", "INT", "STRING", "PLUS", "MINUS", "MULT", "DIV", "FULLSTOP", "RESV", "SEND", "TYPE", "VALUE", "BRANCH", "UNORDERED", "RECLABEL", "PARALLEL", "PROTOCOL", "ASSERT", "ANNOTATION", "ID", "StringLiteral", "ASSERTION", "NUMBER", "DIGIT", "WHITESPACE", "ML_COMMENT", "LINE_COMMENT", "'import'", "'protocol'", "','", "';'", "'from'", "'as'", "'at'", "'{'", "'}'", "'('", "')'", "'role'", "'introduces'", "':'", "'to'", "'choice'", "'or'", "'repeat'", "'rec'", "'end'", "'run'", "'inline'", "'parallel'", "'and'", "'do'", "'interrupt'", "'unordered'"
    };
    public static final int RESV=12;
    public static final int ANNOTATION=22;
    public static final int ASSERTION=25;
    public static final int PARALLEL=19;
    public static final int ID=23;
    public static final int EOF=-1;
    public static final int PROTOCOL=20;
    public static final int TYPE=14;
    public static final int T__55=55;
    public static final int ML_COMMENT=29;
    public static final int T__56=56;
    public static final int INTERACTION=4;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int FULLSTOP=11;
    public static final int PLUS=7;
    public static final int SEND=13;
    public static final int DIGIT=27;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int LINE_COMMENT=30;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RECLABEL=18;
    public static final int NUMBER=26;
    public static final int WHITESPACE=28;
    public static final int INT=5;
    public static final int MINUS=8;
    public static final int MULT=9;
    public static final int VALUE=15;
    public static final int ASSERT=21;
    public static final int UNORDERED=17;
    public static final int StringLiteral=24;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int BRANCH=16;
    public static final int DIV=10;
    public static final int STRING=6;

    // delegates
    // delegators


        public MonitorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MonitorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
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
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:1: description : ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef ;
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
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:12: ( ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef
            {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:16: ( ANNOTATION )* ( importProtocolStatement | importTypeStatement )
            	    {
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:16: ( ANNOTATION )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==ANNOTATION) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:18: ANNOTATION
            	    	    {
            	    	    ANNOTATION1=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_description217); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION1);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:32: ( importProtocolStatement | importTypeStatement )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==31) ) {
            	        int LA2_1 = input.LA(2);

            	        if ( (LA2_1==32) ) {
            	            alt2=1;
            	        }
            	        else if ( ((LA2_1>=ID && LA2_1<=StringLiteral)) ) {
            	            alt2=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 2, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:34: importProtocolStatement
            	            {
            	            pushFollow(FOLLOW_importProtocolStatement_in_description224);
            	            importProtocolStatement2=importProtocolStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_importProtocolStatement.add(importProtocolStatement2.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:60: importTypeStatement
            	            {
            	            pushFollow(FOLLOW_importTypeStatement_in_description228);
            	            importTypeStatement3=importTypeStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_importTypeStatement.add(importTypeStatement3.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:85: ( ANNOTATION )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ANNOTATION) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:36:87: ANNOTATION
            	    {
            	    ANNOTATION4=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_description237); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION4);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            pushFollow(FOLLOW_protocolDef_in_description242);
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
            // 36:113: -> protocolDef
            {
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
        return retval;
    }
    // $ANTLR end "description"

    public static class importProtocolStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importProtocolStatement"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:38:1: importProtocolStatement : 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' ;
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

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:38:24: ( 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:38:26: 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal6=(Token)match(input,31,FOLLOW_31_in_importProtocolStatement253); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal6_tree = (Object)adaptor.create(string_literal6);
            adaptor.addChild(root_0, string_literal6_tree);
            }
            string_literal7=(Token)match(input,32,FOLLOW_32_in_importProtocolStatement255); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal7_tree = (Object)adaptor.create(string_literal7);
            adaptor.addChild(root_0, string_literal7_tree);
            }
            pushFollow(FOLLOW_importProtocolDef_in_importProtocolStatement257);
            importProtocolDef8=importProtocolDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importProtocolDef8.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:38:64: ( ',' importProtocolDef )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:38:66: ',' importProtocolDef
            	    {
            	    char_literal9=(Token)match(input,33,FOLLOW_33_in_importProtocolStatement261); if (state.failed) return retval;
            	    pushFollow(FOLLOW_importProtocolDef_in_importProtocolStatement264);
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

            char_literal11=(Token)match(input,34,FOLLOW_34_in_importProtocolStatement269); if (state.failed) return retval;

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
        return retval;
    }
    // $ANTLR end "importProtocolStatement"

    public static class importProtocolDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importProtocolDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:40:1: importProtocolDef : ID 'from' StringLiteral ;
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

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:40:18: ( ID 'from' StringLiteral )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:40:20: ID 'from' StringLiteral
            {
            root_0 = (Object)adaptor.nil();

            ID12=(Token)match(input,ID,FOLLOW_ID_in_importProtocolDef278); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID12_tree = (Object)adaptor.create(ID12);
            adaptor.addChild(root_0, ID12_tree);
            }
            string_literal13=(Token)match(input,35,FOLLOW_35_in_importProtocolDef280); if (state.failed) return retval;
            StringLiteral14=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_importProtocolDef283); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "importProtocolDef"

    public static class importTypeStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importTypeStatement"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:42:1: importTypeStatement : 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' ;
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

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:42:20: ( 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:42:22: 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal15=(Token)match(input,31,FOLLOW_31_in_importTypeStatement296); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal15_tree = (Object)adaptor.create(string_literal15);
            adaptor.addChild(root_0, string_literal15_tree);
            }
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:42:31: ( simpleName )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=ID && LA6_1<=StringLiteral)) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:42:33: simpleName
                    {
                    pushFollow(FOLLOW_simpleName_in_importTypeStatement300);
                    simpleName16=simpleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleName16.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_importTypeDef_in_importTypeStatement305);
            importTypeDef17=importTypeDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importTypeDef17.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:42:61: ( ',' importTypeDef )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:42:63: ',' importTypeDef
            	    {
            	    char_literal18=(Token)match(input,33,FOLLOW_33_in_importTypeStatement309); if (state.failed) return retval;
            	    pushFollow(FOLLOW_importTypeDef_in_importTypeStatement312);
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

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:42:85: ( 'from' StringLiteral )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:42:87: 'from' StringLiteral
                    {
                    string_literal20=(Token)match(input,35,FOLLOW_35_in_importTypeStatement319); if (state.failed) return retval;
                    StringLiteral21=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_importTypeStatement322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral21_tree = (Object)adaptor.create(StringLiteral21);
                    adaptor.addChild(root_0, StringLiteral21_tree);
                    }

                    }
                    break;

            }

            char_literal22=(Token)match(input,34,FOLLOW_34_in_importTypeStatement327); if (state.failed) return retval;

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
        return retval;
    }
    // $ANTLR end "importTypeStatement"

    public static class importTypeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importTypeDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:44:1: importTypeDef : ( dataTypeDef 'as' )? ID ;
    public final MonitorParser.importTypeDef_return importTypeDef() throws RecognitionException {
        MonitorParser.importTypeDef_return retval = new MonitorParser.importTypeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal24=null;
        Token ID25=null;
        MonitorParser.dataTypeDef_return dataTypeDef23 = null;


        Object string_literal24_tree=null;
        Object ID25_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:44:14: ( ( dataTypeDef 'as' )? ID )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:44:16: ( dataTypeDef 'as' )? ID
            {
            root_0 = (Object)adaptor.nil();

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:44:16: ( dataTypeDef 'as' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==StringLiteral) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:44:18: dataTypeDef 'as'
                    {
                    pushFollow(FOLLOW_dataTypeDef_in_importTypeDef338);
                    dataTypeDef23=dataTypeDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dataTypeDef23.getTree());
                    string_literal24=(Token)match(input,36,FOLLOW_36_in_importTypeDef340); if (state.failed) return retval;

                    }
                    break;

            }

            ID25=(Token)match(input,ID,FOLLOW_ID_in_importTypeDef346); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "importTypeDef"

    public static class dataTypeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dataTypeDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:46:1: dataTypeDef : StringLiteral ;
    public final MonitorParser.dataTypeDef_return dataTypeDef() throws RecognitionException {
        MonitorParser.dataTypeDef_return retval = new MonitorParser.dataTypeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral26=null;

        Object StringLiteral26_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:46:12: ( StringLiteral )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:46:14: StringLiteral
            {
            root_0 = (Object)adaptor.nil();

            StringLiteral26=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dataTypeDef354); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "dataTypeDef"

    public static class simpleName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleName"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:48:1: simpleName : ID ;
    public final MonitorParser.simpleName_return simpleName() throws RecognitionException {
        MonitorParser.simpleName_return retval = new MonitorParser.simpleName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID27=null;

        Object ID27_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:48:11: ( ID )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:48:13: ID
            {
            root_0 = (Object)adaptor.nil();

            ID27=(Token)match(input,ID,FOLLOW_ID_in_simpleName362); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "simpleName"

    public static class protocolDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protocolDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:1: protocolDef : 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( PROTOCOL ( protocolBlockDef )+ ) ;
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
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_parameterDefs=new RewriteRuleSubtreeStream(adaptor,"rule parameterDefs");
        RewriteRuleSubtreeStream stream_protocolDef=new RewriteRuleSubtreeStream(adaptor,"rule protocolDef");
        RewriteRuleSubtreeStream stream_protocolName=new RewriteRuleSubtreeStream(adaptor,"rule protocolName");
        RewriteRuleSubtreeStream stream_protocolBlockDef=new RewriteRuleSubtreeStream(adaptor,"rule protocolBlockDef");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:12: ( 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( PROTOCOL ( protocolBlockDef )+ ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:14: 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}'
            {
            string_literal28=(Token)match(input,32,FOLLOW_32_in_protocolDef370); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(string_literal28);

            pushFollow(FOLLOW_protocolName_in_protocolDef372);
            protocolName29=protocolName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protocolName.add(protocolName29.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:38: ( 'at' roleName )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:40: 'at' roleName
                    {
                    string_literal30=(Token)match(input,37,FOLLOW_37_in_protocolDef376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(string_literal30);

                    pushFollow(FOLLOW_roleName_in_protocolDef378);
                    roleName31=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName31.getTree());

                    }
                    break;

            }

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:57: ( parameterDefs )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:59: parameterDefs
                    {
                    pushFollow(FOLLOW_parameterDefs_in_protocolDef385);
                    parameterDefs32=parameterDefs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameterDefs.add(parameterDefs32.getTree());

                    }
                    break;

            }

            char_literal33=(Token)match(input,38,FOLLOW_38_in_protocolDef390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_38.add(char_literal33);

            pushFollow(FOLLOW_protocolBlockDef_in_protocolDef392);
            protocolBlockDef34=protocolBlockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protocolBlockDef.add(protocolBlockDef34.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:97: ( ( ANNOTATION )* protocolDef )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ANNOTATION||LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:99: ( ANNOTATION )* protocolDef
            	    {
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:99: ( ANNOTATION )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==ANNOTATION) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:50:101: ANNOTATION
            	    	    {
            	    	    ANNOTATION35=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_protocolDef398); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION35);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_protocolDef_in_protocolDef403);
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

            char_literal37=(Token)match(input,39,FOLLOW_39_in_protocolDef408); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(char_literal37);



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
            // 51:7: -> ^( PROTOCOL ( protocolBlockDef )+ )
            {
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:51:10: ^( PROTOCOL ( protocolBlockDef )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROTOCOL, "PROTOCOL"), root_1);

                if ( !(stream_protocolBlockDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_protocolBlockDef.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "protocolDef"

    public static class protocolName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protocolName"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:53:1: protocolName : ID ;
    public final MonitorParser.protocolName_return protocolName() throws RecognitionException {
        MonitorParser.protocolName_return retval = new MonitorParser.protocolName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID38=null;

        Object ID38_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:53:13: ( ID )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:53:15: ID
            {
            root_0 = (Object)adaptor.nil();

            ID38=(Token)match(input,ID,FOLLOW_ID_in_protocolName430); if (state.failed) return retval;
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
        return retval;
    }
    // $ANTLR end "protocolName"

    public static class parameterDefs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterDefs"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:55:1: parameterDefs : '(' parameterDef ( ',' parameterDef )* ')' ;
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

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:55:14: ( '(' parameterDef ( ',' parameterDef )* ')' )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:55:16: '(' parameterDef ( ',' parameterDef )* ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal39=(Token)match(input,40,FOLLOW_40_in_parameterDefs438); if (state.failed) return retval;
            pushFollow(FOLLOW_parameterDef_in_parameterDefs441);
            parameterDef40=parameterDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameterDef40.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:55:34: ( ',' parameterDef )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:55:36: ',' parameterDef
            	    {
            	    char_literal41=(Token)match(input,33,FOLLOW_33_in_parameterDefs445); if (state.failed) return retval;
            	    pushFollow(FOLLOW_parameterDef_in_parameterDefs448);
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

            char_literal43=(Token)match(input,41,FOLLOW_41_in_parameterDefs453); if (state.failed) return retval;

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
        return retval;
    }
    // $ANTLR end "parameterDefs"

    public static class parameterDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:57:1: parameterDef : ( typeReferenceDef | 'role' ) simpleName ;
    public final MonitorParser.parameterDef_return parameterDef() throws RecognitionException {
        MonitorParser.parameterDef_return retval = new MonitorParser.parameterDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal45=null;
        MonitorParser.typeReferenceDef_return typeReferenceDef44 = null;

        MonitorParser.simpleName_return simpleName46 = null;


        Object string_literal45_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:57:13: ( ( typeReferenceDef | 'role' ) simpleName )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:57:15: ( typeReferenceDef | 'role' ) simpleName
            {
            root_0 = (Object)adaptor.nil();

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:57:15: ( typeReferenceDef | 'role' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==42) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:57:17: typeReferenceDef
                    {
                    pushFollow(FOLLOW_typeReferenceDef_in_parameterDef464);
                    typeReferenceDef44=typeReferenceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeReferenceDef44.getTree());

                    }
                    break;
                case 2 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:57:36: 'role'
                    {
                    string_literal45=(Token)match(input,42,FOLLOW_42_in_parameterDef468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal45_tree = (Object)adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_simpleName_in_parameterDef472);
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
        return retval;
    }
    // $ANTLR end "parameterDef"

    public static class protocolBlockDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protocolBlockDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:59:1: protocolBlockDef : activityListDef -> activityListDef ;
    public final MonitorParser.protocolBlockDef_return protocolBlockDef() throws RecognitionException {
        MonitorParser.protocolBlockDef_return retval = new MonitorParser.protocolBlockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.activityListDef_return activityListDef47 = null;


        RewriteRuleSubtreeStream stream_activityListDef=new RewriteRuleSubtreeStream(adaptor,"rule activityListDef");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:59:17: ( activityListDef -> activityListDef )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:59:19: activityListDef
            {
            pushFollow(FOLLOW_activityListDef_in_protocolBlockDef480);
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
            // 59:35: -> activityListDef
            {
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
        return retval;
    }
    // $ANTLR end "protocolBlockDef"

    public static class blockDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:61:1: blockDef : '{' activityListDef '}' -> ^( BRANCH activityListDef ) ;
    public final MonitorParser.blockDef_return blockDef() throws RecognitionException {
        MonitorParser.blockDef_return retval = new MonitorParser.blockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        MonitorParser.activityListDef_return activityListDef49 = null;


        Object char_literal48_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_activityListDef=new RewriteRuleSubtreeStream(adaptor,"rule activityListDef");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:61:9: ( '{' activityListDef '}' -> ^( BRANCH activityListDef ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:61:11: '{' activityListDef '}'
            {
            char_literal48=(Token)match(input,38,FOLLOW_38_in_blockDef491); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_38.add(char_literal48);

            pushFollow(FOLLOW_activityListDef_in_blockDef493);
            activityListDef49=activityListDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_activityListDef.add(activityListDef49.getTree());
            char_literal50=(Token)match(input,39,FOLLOW_39_in_blockDef495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(char_literal50);



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
            // 61:35: -> ^( BRANCH activityListDef )
            {
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:61:38: ^( BRANCH activityListDef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BRANCH, "BRANCH"), root_1);

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
        return retval;
    }
    // $ANTLR end "blockDef"

    public static class assertDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assertDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:63:1: assertDef : ( ASSERTION )? -> ^( ASSERT ( ASSERTION )? ) ;
    public final MonitorParser.assertDef_return assertDef() throws RecognitionException {
        MonitorParser.assertDef_return retval = new MonitorParser.assertDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSERTION51=null;

        Object ASSERTION51_tree=null;
        RewriteRuleTokenStream stream_ASSERTION=new RewriteRuleTokenStream(adaptor,"token ASSERTION");

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:63:11: ( ( ASSERTION )? -> ^( ASSERT ( ASSERTION )? ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:63:13: ( ASSERTION )?
            {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:63:13: ( ASSERTION )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ASSERTION) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:63:14: ASSERTION
                    {
                    ASSERTION51=(Token)match(input,ASSERTION,FOLLOW_ASSERTION_in_assertDef517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSERTION.add(ASSERTION51);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ASSERTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:26: -> ^( ASSERT ( ASSERTION )? )
            {
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:63:29: ^( ASSERT ( ASSERTION )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSERT, "ASSERT"), root_1);

                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:63:38: ( ASSERTION )?
                if ( stream_ASSERTION.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASSERTION.nextNode());

                }
                stream_ASSERTION.reset();

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
        return retval;
    }
    // $ANTLR end "assertDef"

    public static class activityListDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "activityListDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:65:1: activityListDef : ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ ;
    public final MonitorParser.activityListDef_return activityListDef() throws RecognitionException {
        MonitorParser.activityListDef_return retval = new MonitorParser.activityListDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANNOTATION52=null;
        MonitorParser.activityDef_return activityDef53 = null;


        Object ANNOTATION52_tree=null;
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleSubtreeStream stream_activityDef=new RewriteRuleSubtreeStream(adaptor,"rule activityDef");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:65:16: ( ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:65:18: ( ( ANNOTATION )* activityDef )*
            {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:65:18: ( ( ANNOTATION )* activityDef )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:65:20: ( ANNOTATION )* activityDef
            	    {
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:65:20: ( ANNOTATION )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==ANNOTATION) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:65:22: ANNOTATION
            	    	    {
            	    	    ANNOTATION52=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_activityListDef539); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION52);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_activityDef_in_activityListDef544);
            	    activityDef53=activityDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_activityDef.add(activityDef53.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);



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
            // 65:51: -> ( activityDef )+
            {
                if ( !(stream_activityDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_activityDef.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "activityListDef"

    public static class primitivetype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitivetype"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:67:1: primitivetype : ( INT -> INT | STRING -> STRING ) ;
    public final MonitorParser.primitivetype_return primitivetype() throws RecognitionException {
        MonitorParser.primitivetype_return retval = new MonitorParser.primitivetype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT54=null;
        Token STRING55=null;

        Object INT54_tree=null;
        Object STRING55_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:67:15: ( ( INT -> INT | STRING -> STRING ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:67:16: ( INT -> INT | STRING -> STRING )
            {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:67:16: ( INT -> INT | STRING -> STRING )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==INT) ) {
                alt19=1;
            }
            else if ( (LA19_0==STRING) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:67:17: INT
                    {
                    INT54=(Token)match(input,INT,FOLLOW_INT_in_primitivetype560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT54);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:21: -> INT
                    {
                        adaptor.addChild(root_0, stream_INT.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:68:17: STRING
                    {
                    STRING55=(Token)match(input,STRING,FOLLOW_STRING_in_primitivetype582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING55);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:23: -> STRING
                    {
                        adaptor.addChild(root_0, stream_STRING.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "primitivetype"

    public static class activityDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "activityDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:1: activityDef : ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef );
    public final MonitorParser.activityDef_return activityDef() throws RecognitionException {
        MonitorParser.activityDef_return retval = new MonitorParser.activityDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal62=null;
        MonitorParser.introducesDef_return introducesDef56 = null;

        MonitorParser.interactionDef_return interactionDef57 = null;

        MonitorParser.inlineDef_return inlineDef58 = null;

        MonitorParser.runDef_return runDef59 = null;

        MonitorParser.recursionDef_return recursionDef60 = null;

        MonitorParser.endDef_return endDef61 = null;

        MonitorParser.choiceDef_return choiceDef63 = null;

        MonitorParser.directedChoiceDef_return directedChoiceDef64 = null;

        MonitorParser.parallelDef_return parallelDef65 = null;

        MonitorParser.repeatDef_return repeatDef66 = null;

        MonitorParser.unorderedDef_return unorderedDef67 = null;

        MonitorParser.recBlockDef_return recBlockDef68 = null;

        MonitorParser.globalEscapeDef_return globalEscapeDef69 = null;


        Object char_literal62_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:12: ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef )
            int alt21=8;
            switch ( input.LA(1) ) {
            case ID:
            case 50:
            case 51:
            case 52:
                {
                alt21=1;
                }
                break;
            case 46:
                {
                alt21=2;
                }
                break;
            case 35:
            case 38:
            case 45:
                {
                alt21=3;
                }
                break;
            case 53:
                {
                alt21=4;
                }
                break;
            case 48:
                {
                alt21=5;
                }
                break;
            case 57:
                {
                alt21=6;
                }
                break;
            case 49:
                {
                alt21=7;
                }
                break;
            case 55:
                {
                alt21=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef )
                    int alt20=6;
                    switch ( input.LA(1) ) {
                    case ID:
                        {
                        switch ( input.LA(2) ) {
                        case 43:
                            {
                            alt20=1;
                            }
                            break;
                        case 34:
                            {
                            alt20=5;
                            }
                            break;
                        case 35:
                        case 40:
                        case 45:
                            {
                            alt20=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 1, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 52:
                        {
                        alt20=3;
                        }
                        break;
                    case 51:
                        {
                        alt20=4;
                        }
                        break;
                    case 50:
                        {
                        alt20=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }

                    switch (alt20) {
                        case 1 :
                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:16: introducesDef
                            {
                            pushFollow(FOLLOW_introducesDef_in_activityDef595);
                            introducesDef56=introducesDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, introducesDef56.getTree());

                            }
                            break;
                        case 2 :
                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:32: interactionDef
                            {
                            pushFollow(FOLLOW_interactionDef_in_activityDef599);
                            interactionDef57=interactionDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, interactionDef57.getTree());

                            }
                            break;
                        case 3 :
                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:49: inlineDef
                            {
                            pushFollow(FOLLOW_inlineDef_in_activityDef603);
                            inlineDef58=inlineDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, inlineDef58.getTree());

                            }
                            break;
                        case 4 :
                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:61: runDef
                            {
                            pushFollow(FOLLOW_runDef_in_activityDef607);
                            runDef59=runDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, runDef59.getTree());

                            }
                            break;
                        case 5 :
                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:70: recursionDef
                            {
                            pushFollow(FOLLOW_recursionDef_in_activityDef611);
                            recursionDef60=recursionDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, recursionDef60.getTree());

                            }
                            break;
                        case 6 :
                            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:70:85: endDef
                            {
                            pushFollow(FOLLOW_endDef_in_activityDef615);
                            endDef61=endDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, endDef61.getTree());

                            }
                            break;

                    }

                    char_literal62=(Token)match(input,34,FOLLOW_34_in_activityDef619); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:71:4: choiceDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_choiceDef_in_activityDef628);
                    choiceDef63=choiceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, choiceDef63.getTree());

                    }
                    break;
                case 3 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:71:16: directedChoiceDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_directedChoiceDef_in_activityDef632);
                    directedChoiceDef64=directedChoiceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, directedChoiceDef64.getTree());

                    }
                    break;
                case 4 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:71:36: parallelDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parallelDef_in_activityDef636);
                    parallelDef65=parallelDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parallelDef65.getTree());

                    }
                    break;
                case 5 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:71:50: repeatDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_repeatDef_in_activityDef640);
                    repeatDef66=repeatDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, repeatDef66.getTree());

                    }
                    break;
                case 6 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:71:62: unorderedDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unorderedDef_in_activityDef644);
                    unorderedDef67=unorderedDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unorderedDef67.getTree());

                    }
                    break;
                case 7 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:72:4: recBlockDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_recBlockDef_in_activityDef651);
                    recBlockDef68=recBlockDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recBlockDef68.getTree());

                    }
                    break;
                case 8 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:72:18: globalEscapeDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_globalEscapeDef_in_activityDef655);
                    globalEscapeDef69=globalEscapeDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, globalEscapeDef69.getTree());

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
        return retval;
    }
    // $ANTLR end "activityDef"

    public static class introducesDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "introducesDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:74:1: introducesDef : roleDef 'introduces' roleDef ( ',' roleDef )* ;
    public final MonitorParser.introducesDef_return introducesDef() throws RecognitionException {
        MonitorParser.introducesDef_return retval = new MonitorParser.introducesDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal71=null;
        Token char_literal73=null;
        MonitorParser.roleDef_return roleDef70 = null;

        MonitorParser.roleDef_return roleDef72 = null;

        MonitorParser.roleDef_return roleDef74 = null;


        Object string_literal71_tree=null;
        Object char_literal73_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:74:14: ( roleDef 'introduces' roleDef ( ',' roleDef )* )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:74:16: roleDef 'introduces' roleDef ( ',' roleDef )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_roleDef_in_introducesDef663);
            roleDef70=roleDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, roleDef70.getTree());
            string_literal71=(Token)match(input,43,FOLLOW_43_in_introducesDef665); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal71_tree = (Object)adaptor.create(string_literal71);
            adaptor.addChild(root_0, string_literal71_tree);
            }
            pushFollow(FOLLOW_roleDef_in_introducesDef667);
            roleDef72=roleDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, roleDef72.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:74:45: ( ',' roleDef )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:74:47: ',' roleDef
            	    {
            	    char_literal73=(Token)match(input,33,FOLLOW_33_in_introducesDef671); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal73_tree = (Object)adaptor.create(char_literal73);
            	    adaptor.addChild(root_0, char_literal73_tree);
            	    }
            	    pushFollow(FOLLOW_roleDef_in_introducesDef673);
            	    roleDef74=roleDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleDef74.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "introducesDef"

    public static class roleDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "roleDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:76:1: roleDef : ID -> ID ;
    public final MonitorParser.roleDef_return roleDef() throws RecognitionException {
        MonitorParser.roleDef_return retval = new MonitorParser.roleDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID75=null;

        Object ID75_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:76:8: ( ID -> ID )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:76:10: ID
            {
            ID75=(Token)match(input,ID,FOLLOW_ID_in_roleDef684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID75);



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
            // 76:13: -> ID
            {
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
        return retval;
    }
    // $ANTLR end "roleDef"

    public static class roleName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "roleName"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:78:1: roleName : ID -> ID ;
    public final MonitorParser.roleName_return roleName() throws RecognitionException {
        MonitorParser.roleName_return retval = new MonitorParser.roleName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID76=null;

        Object ID76_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:78:9: ( ID -> ID )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:78:11: ID
            {
            ID76=(Token)match(input,ID,FOLLOW_ID_in_roleName695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID76);



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
            // 78:14: -> ID
            {
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
        return retval;
    }
    // $ANTLR end "roleName"

    public static class typeReferenceDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeReferenceDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:1: typeReferenceDef : ID -> ID ;
    public final MonitorParser.typeReferenceDef_return typeReferenceDef() throws RecognitionException {
        MonitorParser.typeReferenceDef_return retval = new MonitorParser.typeReferenceDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID77=null;

        Object ID77_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:17: ( ID -> ID )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:80:19: ID
            {
            ID77=(Token)match(input,ID,FOLLOW_ID_in_typeReferenceDef706); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID77);



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
            // 80:22: -> ID
            {
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
        return retval;
    }
    // $ANTLR end "typeReferenceDef"

    public static class interactionSignatureDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interactionSignatureDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:1: interactionSignatureDef : ( typeReferenceDef ( '(' ID ':' primitivetype ')' )? -> ^( VALUE ( ID )* ( primitivetype )* ) typeReferenceDef ) ;
    public final MonitorParser.interactionSignatureDef_return interactionSignatureDef() throws RecognitionException {
        MonitorParser.interactionSignatureDef_return retval = new MonitorParser.interactionSignatureDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal79=null;
        Token ID80=null;
        Token char_literal81=null;
        Token char_literal83=null;
        MonitorParser.typeReferenceDef_return typeReferenceDef78 = null;

        MonitorParser.primitivetype_return primitivetype82 = null;


        Object char_literal79_tree=null;
        Object ID80_tree=null;
        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_primitivetype=new RewriteRuleSubtreeStream(adaptor,"rule primitivetype");
        RewriteRuleSubtreeStream stream_typeReferenceDef=new RewriteRuleSubtreeStream(adaptor,"rule typeReferenceDef");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:24: ( ( typeReferenceDef ( '(' ID ':' primitivetype ')' )? -> ^( VALUE ( ID )* ( primitivetype )* ) typeReferenceDef ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:26: ( typeReferenceDef ( '(' ID ':' primitivetype ')' )? -> ^( VALUE ( ID )* ( primitivetype )* ) typeReferenceDef )
            {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:26: ( typeReferenceDef ( '(' ID ':' primitivetype ')' )? -> ^( VALUE ( ID )* ( primitivetype )* ) typeReferenceDef )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:27: typeReferenceDef ( '(' ID ':' primitivetype ')' )?
            {
            pushFollow(FOLLOW_typeReferenceDef_in_interactionSignatureDef718);
            typeReferenceDef78=typeReferenceDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeReferenceDef.add(typeReferenceDef78.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:44: ( '(' ID ':' primitivetype ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:45: '(' ID ':' primitivetype ')'
                    {
                    char_literal79=(Token)match(input,40,FOLLOW_40_in_interactionSignatureDef721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal79);

                    ID80=(Token)match(input,ID,FOLLOW_ID_in_interactionSignatureDef723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID80);

                    char_literal81=(Token)match(input,44,FOLLOW_44_in_interactionSignatureDef725); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(char_literal81);

                    pushFollow(FOLLOW_primitivetype_in_interactionSignatureDef727);
                    primitivetype82=primitivetype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitivetype.add(primitivetype82.getTree());
                    char_literal83=(Token)match(input,41,FOLLOW_41_in_interactionSignatureDef729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal83);


                    }
                    break;

            }



            // AST REWRITE
            // elements: typeReferenceDef, primitivetype, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:76: -> ^( VALUE ( ID )* ( primitivetype )* ) typeReferenceDef
            {
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:79: ^( VALUE ( ID )* ( primitivetype )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VALUE, "VALUE"), root_1);

                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:87: ( ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:82:91: ( primitivetype )*
                while ( stream_primitivetype.hasNext() ) {
                    adaptor.addChild(root_1, stream_primitivetype.nextTree());

                }
                stream_primitivetype.reset();

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_typeReferenceDef.nextTree());

            }

            retval.tree = root_0;}
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
        return retval;
    }
    // $ANTLR end "interactionSignatureDef"

    public static class interactionDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interactionDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:85:1: interactionDef : interactionSignatureDef ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) ) ;
    public final MonitorParser.interactionDef_return interactionDef() throws RecognitionException {
        MonitorParser.interactionDef_return retval = new MonitorParser.interactionDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal85=null;
        Token string_literal87=null;
        MonitorParser.roleName_return role = null;

        MonitorParser.interactionSignatureDef_return interactionSignatureDef84 = null;

        MonitorParser.assertDef_return assertDef86 = null;

        MonitorParser.roleName_return roleName88 = null;

        MonitorParser.assertDef_return assertDef89 = null;


        Object string_literal85_tree=null;
        Object string_literal87_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_assertDef=new RewriteRuleSubtreeStream(adaptor,"rule assertDef");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_interactionSignatureDef=new RewriteRuleSubtreeStream(adaptor,"rule interactionSignatureDef");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:85:15: ( interactionSignatureDef ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:86:7: interactionSignatureDef ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) )
            {
            pushFollow(FOLLOW_interactionSignatureDef_in_interactionDef761);
            interactionSignatureDef84=interactionSignatureDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_interactionSignatureDef.add(interactionSignatureDef84.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:86:31: ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            else if ( (LA24_0==45) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:87:3: 'from' role= roleName ( assertDef )
                    {
                    string_literal85=(Token)match(input,35,FOLLOW_35_in_interactionDef767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(string_literal85);

                    pushFollow(FOLLOW_roleName_in_interactionDef772);
                    role=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(role.getTree());
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:87:26: ( assertDef )
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:87:27: assertDef
                    {
                    pushFollow(FOLLOW_assertDef_in_interactionDef776);
                    assertDef86=assertDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assertDef.add(assertDef86.getTree());

                    }



                    // AST REWRITE
                    // elements: assertDef, interactionSignatureDef, role
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
                    // 87:37: -> ^( RESV interactionSignatureDef $role assertDef )
                    {
                        // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:87:40: ^( RESV interactionSignatureDef $role assertDef )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RESV, "RESV"), root_1);

                        adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree());
                        adaptor.addChild(root_1, stream_role.nextTree());
                        adaptor.addChild(root_1, stream_assertDef.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:88:10: 'to' roleName ( assertDef )
                    {
                    string_literal87=(Token)match(input,45,FOLLOW_45_in_interactionDef800); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_45.add(string_literal87);

                    pushFollow(FOLLOW_roleName_in_interactionDef802);
                    roleName88=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName88.getTree());
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:88:25: ( assertDef )
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:88:26: assertDef
                    {
                    pushFollow(FOLLOW_assertDef_in_interactionDef806);
                    assertDef89=assertDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assertDef.add(assertDef89.getTree());

                    }



                    // AST REWRITE
                    // elements: interactionSignatureDef, assertDef, roleName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:37: -> ^( SEND interactionSignatureDef roleName assertDef )
                    {
                        // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:88:40: ^( SEND interactionSignatureDef roleName assertDef )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEND, "SEND"), root_1);

                        adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree());
                        adaptor.addChild(root_1, stream_roleName.nextTree());
                        adaptor.addChild(root_1, stream_assertDef.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "interactionDef"

    public static class choiceDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "choiceDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:90:1: choiceDef : 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) ;
    public final MonitorParser.choiceDef_return choiceDef() throws RecognitionException {
        MonitorParser.choiceDef_return retval = new MonitorParser.choiceDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal90=null;
        Token string_literal91=null;
        Token string_literal94=null;
        MonitorParser.roleName_return roleName92 = null;

        MonitorParser.blockDef_return blockDef93 = null;

        MonitorParser.blockDef_return blockDef95 = null;


        Object string_literal90_tree=null;
        Object string_literal91_tree=null;
        Object string_literal94_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:90:10: ( 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:90:12: 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )*
            {
            string_literal90=(Token)match(input,46,FOLLOW_46_in_choiceDef827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(string_literal90);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:90:21: ( 'at' roleName )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:90:23: 'at' roleName
                    {
                    string_literal91=(Token)match(input,37,FOLLOW_37_in_choiceDef831); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(string_literal91);

                    pushFollow(FOLLOW_roleName_in_choiceDef833);
                    roleName92=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName92.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_blockDef_in_choiceDef838);
            blockDef93=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef93.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:90:49: ( 'or' blockDef )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==47) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:90:51: 'or' blockDef
            	    {
            	    string_literal94=(Token)match(input,47,FOLLOW_47_in_choiceDef842); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_47.add(string_literal94);

            	    pushFollow(FOLLOW_blockDef_in_choiceDef844);
            	    blockDef95=blockDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockDef.add(blockDef95.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);



            // AST REWRITE
            // elements: 46, blockDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:68: -> ^( 'choice' ( blockDef )+ )
            {
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:90:71: ^( 'choice' ( blockDef )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_46.nextNode(), root_1);

                if ( !(stream_blockDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_blockDef.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "choiceDef"

    public static class directedChoiceDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directedChoiceDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:1: directedChoiceDef : ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' ;
    public final MonitorParser.directedChoiceDef_return directedChoiceDef() throws RecognitionException {
        MonitorParser.directedChoiceDef_return retval = new MonitorParser.directedChoiceDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal96=null;
        Token string_literal98=null;
        Token char_literal100=null;
        Token char_literal102=null;
        Token char_literal104=null;
        MonitorParser.roleName_return roleName97 = null;

        MonitorParser.roleName_return roleName99 = null;

        MonitorParser.roleName_return roleName101 = null;

        MonitorParser.onMessageDef_return onMessageDef103 = null;


        Object string_literal96_tree=null;
        Object string_literal98_tree=null;
        Object char_literal100_tree=null;
        Object char_literal102_tree=null;
        Object char_literal104_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:18: ( ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:20: ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}'
            {
            root_0 = (Object)adaptor.nil();

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:20: ( 'from' roleName )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:22: 'from' roleName
                    {
                    string_literal96=(Token)match(input,35,FOLLOW_35_in_directedChoiceDef865); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal96_tree = (Object)adaptor.create(string_literal96);
                    adaptor.addChild(root_0, string_literal96_tree);
                    }
                    pushFollow(FOLLOW_roleName_in_directedChoiceDef867);
                    roleName97=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName97.getTree());

                    }
                    break;

            }

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:41: ( 'to' roleName ( ',' roleName )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:43: 'to' roleName ( ',' roleName )*
                    {
                    string_literal98=(Token)match(input,45,FOLLOW_45_in_directedChoiceDef874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal98_tree = (Object)adaptor.create(string_literal98);
                    adaptor.addChild(root_0, string_literal98_tree);
                    }
                    pushFollow(FOLLOW_roleName_in_directedChoiceDef876);
                    roleName99=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName99.getTree());
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:57: ( ',' roleName )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==33) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:59: ',' roleName
                    	    {
                    	    char_literal100=(Token)match(input,33,FOLLOW_33_in_directedChoiceDef880); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_roleName_in_directedChoiceDef883);
                    	    roleName101=roleName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName101.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal102=(Token)match(input,38,FOLLOW_38_in_directedChoiceDef891); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal102_tree = (Object)adaptor.create(char_literal102);
            adaptor.addChild(root_0, char_literal102_tree);
            }
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:83: ( onMessageDef )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:92:85: onMessageDef
            	    {
            	    pushFollow(FOLLOW_onMessageDef_in_directedChoiceDef895);
            	    onMessageDef103=onMessageDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, onMessageDef103.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            char_literal104=(Token)match(input,39,FOLLOW_39_in_directedChoiceDef900); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal104_tree = (Object)adaptor.create(char_literal104);
            adaptor.addChild(root_0, char_literal104_tree);
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
        return retval;
    }
    // $ANTLR end "directedChoiceDef"

    public static class onMessageDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "onMessageDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:94:1: onMessageDef : interactionSignatureDef ':' activityList ;
    public final MonitorParser.onMessageDef_return onMessageDef() throws RecognitionException {
        MonitorParser.onMessageDef_return retval = new MonitorParser.onMessageDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal106=null;
        MonitorParser.interactionSignatureDef_return interactionSignatureDef105 = null;

        MonitorParser.activityList_return activityList107 = null;


        Object char_literal106_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:94:13: ( interactionSignatureDef ':' activityList )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:94:15: interactionSignatureDef ':' activityList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_interactionSignatureDef_in_onMessageDef907);
            interactionSignatureDef105=interactionSignatureDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interactionSignatureDef105.getTree());
            char_literal106=(Token)match(input,44,FOLLOW_44_in_onMessageDef909); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal106_tree = (Object)adaptor.create(char_literal106);
            adaptor.addChild(root_0, char_literal106_tree);
            }
            pushFollow(FOLLOW_activityList_in_onMessageDef911);
            activityList107=activityList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, activityList107.getTree());

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
        return retval;
    }
    // $ANTLR end "onMessageDef"

    public static class activityList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "activityList"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:96:1: activityList : ( ( ANNOTATION )* activityDef )* ;
    public final MonitorParser.activityList_return activityList() throws RecognitionException {
        MonitorParser.activityList_return retval = new MonitorParser.activityList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANNOTATION108=null;
        MonitorParser.activityDef_return activityDef109 = null;


        Object ANNOTATION108_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:96:13: ( ( ( ANNOTATION )* activityDef )* )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:96:15: ( ( ANNOTATION )* activityDef )*
            {
            root_0 = (Object)adaptor.nil();

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:96:15: ( ( ANNOTATION )* activityDef )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:96:17: ( ANNOTATION )* activityDef
            	    {
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:96:17: ( ANNOTATION )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==ANNOTATION) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:96:19: ANNOTATION
            	    	    {
            	    	    ANNOTATION108=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_activityList924); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    ANNOTATION108_tree = (Object)adaptor.create(ANNOTATION108);
            	    	    adaptor.addChild(root_0, ANNOTATION108_tree);
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_activityDef_in_activityList929);
            	    activityDef109=activityDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, activityDef109.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "activityList"

    public static class repeatDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "repeatDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:1: repeatDef : 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) ;
    public final MonitorParser.repeatDef_return repeatDef() throws RecognitionException {
        MonitorParser.repeatDef_return retval = new MonitorParser.repeatDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal110=null;
        Token string_literal111=null;
        Token char_literal113=null;
        MonitorParser.roleName_return roleName112 = null;

        MonitorParser.roleName_return roleName114 = null;

        MonitorParser.blockDef_return blockDef115 = null;


        Object string_literal110_tree=null;
        Object string_literal111_tree=null;
        Object char_literal113_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:10: ( 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:12: 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef
            {
            string_literal110=(Token)match(input,48,FOLLOW_48_in_repeatDef939); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(string_literal110);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:21: ( 'at' roleName ( ',' roleName )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:23: 'at' roleName ( ',' roleName )*
                    {
                    string_literal111=(Token)match(input,37,FOLLOW_37_in_repeatDef943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(string_literal111);

                    pushFollow(FOLLOW_roleName_in_repeatDef945);
                    roleName112=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName112.getTree());
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:37: ( ',' roleName )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==33) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:39: ',' roleName
                    	    {
                    	    char_literal113=(Token)match(input,33,FOLLOW_33_in_repeatDef949); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_33.add(char_literal113);

                    	    pushFollow(FOLLOW_roleName_in_repeatDef951);
                    	    roleName114=roleName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_roleName.add(roleName114.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            pushFollow(FOLLOW_blockDef_in_repeatDef959);
            blockDef115=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef115.getTree());


            // AST REWRITE
            // elements: blockDef, 48
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:68: -> ^( 'repeat' blockDef )
            {
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:98:71: ^( 'repeat' blockDef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_48.nextNode(), root_1);

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
        return retval;
    }
    // $ANTLR end "repeatDef"

    public static class recBlockDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recBlockDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:100:1: recBlockDef : 'rec' labelName blockDef -> ^( 'rec' labelName blockDef ) ;
    public final MonitorParser.recBlockDef_return recBlockDef() throws RecognitionException {
        MonitorParser.recBlockDef_return retval = new MonitorParser.recBlockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal116=null;
        MonitorParser.labelName_return labelName117 = null;

        MonitorParser.blockDef_return blockDef118 = null;


        Object string_literal116_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_labelName=new RewriteRuleSubtreeStream(adaptor,"rule labelName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:100:12: ( 'rec' labelName blockDef -> ^( 'rec' labelName blockDef ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:100:14: 'rec' labelName blockDef
            {
            string_literal116=(Token)match(input,49,FOLLOW_49_in_recBlockDef975); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(string_literal116);

            pushFollow(FOLLOW_labelName_in_recBlockDef977);
            labelName117=labelName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_labelName.add(labelName117.getTree());
            pushFollow(FOLLOW_blockDef_in_recBlockDef979);
            blockDef118=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef118.getTree());


            // AST REWRITE
            // elements: blockDef, labelName, 49
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 100:39: -> ^( 'rec' labelName blockDef )
            {
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:100:42: ^( 'rec' labelName blockDef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_49.nextNode(), root_1);

                adaptor.addChild(root_1, stream_labelName.nextTree());
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
        return retval;
    }
    // $ANTLR end "recBlockDef"

    public static class labelName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "labelName"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:102:1: labelName : ID -> ID ;
    public final MonitorParser.labelName_return labelName() throws RecognitionException {
        MonitorParser.labelName_return retval = new MonitorParser.labelName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID119=null;

        Object ID119_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:102:10: ( ID -> ID )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:102:12: ID
            {
            ID119=(Token)match(input,ID,FOLLOW_ID_in_labelName996); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID119);



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
            // 102:15: -> ID
            {
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
        return retval;
    }
    // $ANTLR end "labelName"

    public static class recursionDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recursionDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:104:1: recursionDef : labelName -> ^( RECLABEL labelName ) ;
    public final MonitorParser.recursionDef_return recursionDef() throws RecognitionException {
        MonitorParser.recursionDef_return retval = new MonitorParser.recursionDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.labelName_return labelName120 = null;


        RewriteRuleSubtreeStream stream_labelName=new RewriteRuleSubtreeStream(adaptor,"rule labelName");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:104:13: ( labelName -> ^( RECLABEL labelName ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:104:15: labelName
            {
            pushFollow(FOLLOW_labelName_in_recursionDef1008);
            labelName120=labelName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_labelName.add(labelName120.getTree());


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
            // 104:25: -> ^( RECLABEL labelName )
            {
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:104:28: ^( RECLABEL labelName )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECLABEL, "RECLABEL"), root_1);

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
        return retval;
    }
    // $ANTLR end "recursionDef"

    public static class endDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:107:1: endDef : 'end' ;
    public final MonitorParser.endDef_return endDef() throws RecognitionException {
        MonitorParser.endDef_return retval = new MonitorParser.endDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal121=null;

        Object string_literal121_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:107:7: ( 'end' )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:107:9: 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal121=(Token)match(input,50,FOLLOW_50_in_endDef1024); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal121_tree = (Object)adaptor.create(string_literal121);
            root_0 = (Object)adaptor.becomeRoot(string_literal121_tree, root_0);
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
        return retval;
    }
    // $ANTLR end "endDef"

    public static class runDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "runDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:110:1: runDef : 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName ;
    public final MonitorParser.runDef_return runDef() throws RecognitionException {
        MonitorParser.runDef_return retval = new MonitorParser.runDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal122=null;
        Token char_literal124=null;
        Token char_literal126=null;
        Token char_literal128=null;
        Token string_literal129=null;
        MonitorParser.protocolRefDef_return protocolRefDef123 = null;

        MonitorParser.parameter_return parameter125 = null;

        MonitorParser.parameter_return parameter127 = null;

        MonitorParser.roleName_return roleName130 = null;


        Object string_literal122_tree=null;
        Object char_literal124_tree=null;
        Object char_literal126_tree=null;
        Object char_literal128_tree=null;
        Object string_literal129_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:110:7: ( 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:110:9: 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName
            {
            root_0 = (Object)adaptor.nil();

            string_literal122=(Token)match(input,51,FOLLOW_51_in_runDef1034); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal122_tree = (Object)adaptor.create(string_literal122);
            root_0 = (Object)adaptor.becomeRoot(string_literal122_tree, root_0);
            }
            pushFollow(FOLLOW_protocolRefDef_in_runDef1037);
            protocolRefDef123=protocolRefDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolRefDef123.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:110:31: ( '(' parameter ( ',' parameter )* ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:110:33: '(' parameter ( ',' parameter )* ')'
                    {
                    char_literal124=(Token)match(input,40,FOLLOW_40_in_runDef1041); if (state.failed) return retval;
                    pushFollow(FOLLOW_parameter_in_runDef1044);
                    parameter125=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter125.getTree());
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:110:48: ( ',' parameter )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==33) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:110:50: ',' parameter
                    	    {
                    	    char_literal126=(Token)match(input,33,FOLLOW_33_in_runDef1048); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_parameter_in_runDef1051);
                    	    parameter127=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter127.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    char_literal128=(Token)match(input,41,FOLLOW_41_in_runDef1056); if (state.failed) return retval;

                    }
                    break;

            }

            string_literal129=(Token)match(input,35,FOLLOW_35_in_runDef1062); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal129_tree = (Object)adaptor.create(string_literal129);
            adaptor.addChild(root_0, string_literal129_tree);
            }
            pushFollow(FOLLOW_roleName_in_runDef1064);
            roleName130=roleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName130.getTree());

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
        return retval;
    }
    // $ANTLR end "runDef"

    public static class protocolRefDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protocolRefDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:112:1: protocolRefDef : ID ( 'at' roleName )? ;
    public final MonitorParser.protocolRefDef_return protocolRefDef() throws RecognitionException {
        MonitorParser.protocolRefDef_return retval = new MonitorParser.protocolRefDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID131=null;
        Token string_literal132=null;
        MonitorParser.roleName_return roleName133 = null;


        Object ID131_tree=null;
        Object string_literal132_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:112:15: ( ID ( 'at' roleName )? )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:112:17: ID ( 'at' roleName )?
            {
            root_0 = (Object)adaptor.nil();

            ID131=(Token)match(input,ID,FOLLOW_ID_in_protocolRefDef1072); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID131_tree = (Object)adaptor.create(ID131);
            adaptor.addChild(root_0, ID131_tree);
            }
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:112:20: ( 'at' roleName )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:112:22: 'at' roleName
                    {
                    string_literal132=(Token)match(input,37,FOLLOW_37_in_protocolRefDef1076); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal132_tree = (Object)adaptor.create(string_literal132);
                    adaptor.addChild(root_0, string_literal132_tree);
                    }
                    pushFollow(FOLLOW_roleName_in_protocolRefDef1078);
                    roleName133=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName133.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "protocolRefDef"

    public static class declarationName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarationName"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:114:1: declarationName : ID ;
    public final MonitorParser.declarationName_return declarationName() throws RecognitionException {
        MonitorParser.declarationName_return retval = new MonitorParser.declarationName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID134=null;

        Object ID134_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:114:16: ( ID )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:114:18: ID
            {
            root_0 = (Object)adaptor.nil();

            ID134=(Token)match(input,ID,FOLLOW_ID_in_declarationName1089); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID134_tree = (Object)adaptor.create(ID134);
            adaptor.addChild(root_0, ID134_tree);
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
        return retval;
    }
    // $ANTLR end "declarationName"

    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:116:1: parameter : declarationName ;
    public final MonitorParser.parameter_return parameter() throws RecognitionException {
        MonitorParser.parameter_return retval = new MonitorParser.parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.declarationName_return declarationName135 = null;



        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:116:10: ( declarationName )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:116:12: declarationName
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declarationName_in_parameter1097);
            declarationName135=declarationName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarationName135.getTree());

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
        return retval;
    }
    // $ANTLR end "parameter"

    public static class inlineDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inlineDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:119:1: inlineDef : 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? ;
    public final MonitorParser.inlineDef_return inlineDef() throws RecognitionException {
        MonitorParser.inlineDef_return retval = new MonitorParser.inlineDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal136=null;
        Token char_literal138=null;
        Token char_literal140=null;
        Token char_literal142=null;
        MonitorParser.protocolRefDef_return protocolRefDef137 = null;

        MonitorParser.parameter_return parameter139 = null;

        MonitorParser.parameter_return parameter141 = null;


        Object string_literal136_tree=null;
        Object char_literal138_tree=null;
        Object char_literal140_tree=null;
        Object char_literal142_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:119:10: ( 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:119:12: 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal136=(Token)match(input,52,FOLLOW_52_in_inlineDef1106); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal136_tree = (Object)adaptor.create(string_literal136);
            root_0 = (Object)adaptor.becomeRoot(string_literal136_tree, root_0);
            }
            pushFollow(FOLLOW_protocolRefDef_in_inlineDef1109);
            protocolRefDef137=protocolRefDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolRefDef137.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:119:37: ( '(' parameter ( ',' parameter )* ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:119:39: '(' parameter ( ',' parameter )* ')'
                    {
                    char_literal138=(Token)match(input,40,FOLLOW_40_in_inlineDef1113); if (state.failed) return retval;
                    pushFollow(FOLLOW_parameter_in_inlineDef1116);
                    parameter139=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter139.getTree());
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:119:54: ( ',' parameter )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==33) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:119:56: ',' parameter
                    	    {
                    	    char_literal140=(Token)match(input,33,FOLLOW_33_in_inlineDef1120); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_parameter_in_inlineDef1123);
                    	    parameter141=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter141.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    char_literal142=(Token)match(input,41,FOLLOW_41_in_inlineDef1128); if (state.failed) return retval;

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "inlineDef"

    public static class parallelDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parallelDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:121:1: parallelDef : 'parallel' blockDef ( 'and' blockDef )* -> ^( PARALLEL ( blockDef )+ ) ;
    public final MonitorParser.parallelDef_return parallelDef() throws RecognitionException {
        MonitorParser.parallelDef_return retval = new MonitorParser.parallelDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal143=null;
        Token string_literal145=null;
        MonitorParser.blockDef_return blockDef144 = null;

        MonitorParser.blockDef_return blockDef146 = null;


        Object string_literal143_tree=null;
        Object string_literal145_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:121:12: ( 'parallel' blockDef ( 'and' blockDef )* -> ^( PARALLEL ( blockDef )+ ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:121:14: 'parallel' blockDef ( 'and' blockDef )*
            {
            string_literal143=(Token)match(input,53,FOLLOW_53_in_parallelDef1140); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(string_literal143);

            pushFollow(FOLLOW_blockDef_in_parallelDef1142);
            blockDef144=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef144.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:121:34: ( 'and' blockDef )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==54) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:121:36: 'and' blockDef
            	    {
            	    string_literal145=(Token)match(input,54,FOLLOW_54_in_parallelDef1146); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_54.add(string_literal145);

            	    pushFollow(FOLLOW_blockDef_in_parallelDef1148);
            	    blockDef146=blockDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockDef.add(blockDef146.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);



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
            // 121:54: -> ^( PARALLEL ( blockDef )+ )
            {
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:121:57: ^( PARALLEL ( blockDef )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARALLEL, "PARALLEL"), root_1);

                if ( !(stream_blockDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_blockDef.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "parallelDef"

    public static class globalEscapeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "globalEscapeDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:124:1: globalEscapeDef : 'do' blockDef ( interruptDef )+ ;
    public final MonitorParser.globalEscapeDef_return globalEscapeDef() throws RecognitionException {
        MonitorParser.globalEscapeDef_return retval = new MonitorParser.globalEscapeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal147=null;
        MonitorParser.blockDef_return blockDef148 = null;

        MonitorParser.interruptDef_return interruptDef149 = null;


        Object string_literal147_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:124:16: ( 'do' blockDef ( interruptDef )+ )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:124:18: 'do' blockDef ( interruptDef )+
            {
            root_0 = (Object)adaptor.nil();

            string_literal147=(Token)match(input,55,FOLLOW_55_in_globalEscapeDef1168); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal147_tree = (Object)adaptor.create(string_literal147);
            root_0 = (Object)adaptor.becomeRoot(string_literal147_tree, root_0);
            }
            pushFollow(FOLLOW_blockDef_in_globalEscapeDef1171);
            blockDef148=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockDef148.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:124:33: ( interruptDef )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==56) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:124:35: interruptDef
            	    {
            	    pushFollow(FOLLOW_interruptDef_in_globalEscapeDef1175);
            	    interruptDef149=interruptDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, interruptDef149.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);


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
        return retval;
    }
    // $ANTLR end "globalEscapeDef"

    public static class interruptDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interruptDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:127:1: interruptDef : 'interrupt' blockDef ;
    public final MonitorParser.interruptDef_return interruptDef() throws RecognitionException {
        MonitorParser.interruptDef_return retval = new MonitorParser.interruptDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal150=null;
        MonitorParser.blockDef_return blockDef151 = null;


        Object string_literal150_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:127:13: ( 'interrupt' blockDef )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:127:15: 'interrupt' blockDef
            {
            root_0 = (Object)adaptor.nil();

            string_literal150=(Token)match(input,56,FOLLOW_56_in_interruptDef1187); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal150_tree = (Object)adaptor.create(string_literal150);
            root_0 = (Object)adaptor.becomeRoot(string_literal150_tree, root_0);
            }
            pushFollow(FOLLOW_blockDef_in_interruptDef1190);
            blockDef151=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, blockDef151.getTree());

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
        return retval;
    }
    // $ANTLR end "interruptDef"

    public static class unorderedDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unorderedDef"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:129:1: unorderedDef : 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}' -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ ) ;
    public final MonitorParser.unorderedDef_return unorderedDef() throws RecognitionException {
        MonitorParser.unorderedDef_return retval = new MonitorParser.unorderedDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal152=null;
        Token char_literal153=null;
        Token ANNOTATION154=null;
        Token char_literal156=null;
        MonitorParser.activityDef_return activityDef155 = null;


        Object string_literal152_tree=null;
        Object char_literal153_tree=null;
        Object ANNOTATION154_tree=null;
        Object char_literal156_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_activityDef=new RewriteRuleSubtreeStream(adaptor,"rule activityDef");
        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:129:13: ( 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}' -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ ) )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:129:15: 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}'
            {
            string_literal152=(Token)match(input,57,FOLLOW_57_in_unorderedDef1198); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(string_literal152);

            char_literal153=(Token)match(input,38,FOLLOW_38_in_unorderedDef1200); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_38.add(char_literal153);

            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:129:31: ( ( ANNOTATION )* activityDef )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=ANNOTATION && LA43_0<=ID)||LA43_0==35||LA43_0==38||(LA43_0>=45 && LA43_0<=46)||(LA43_0>=48 && LA43_0<=53)||LA43_0==55||LA43_0==57) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:129:33: ( ANNOTATION )* activityDef
            	    {
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:129:33: ( ANNOTATION )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==ANNOTATION) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:129:35: ANNOTATION
            	    	    {
            	    	    ANNOTATION154=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_unorderedDef1206); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION154);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop42;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_activityDef_in_unorderedDef1211);
            	    activityDef155=activityDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_activityDef.add(activityDef155.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            char_literal156=(Token)match(input,39,FOLLOW_39_in_unorderedDef1216); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(char_literal156);



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
            // 129:68: -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ )
            {
                // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:129:71: ^( PARALLEL ( ^( BRANCH activityDef ) )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARALLEL, "PARALLEL"), root_1);

                if ( !(stream_activityDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_activityDef.hasNext() ) {
                    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:129:82: ^( BRANCH activityDef )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BRANCH, "BRANCH"), root_2);

                    adaptor.addChild(root_2, stream_activityDef.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_activityDef.reset();

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
        return retval;
    }
    // $ANTLR end "unorderedDef"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:138:1: expr : term ( ( PLUS | MINUS ) term )* ;
    public final MonitorParser.expr_return expr() throws RecognitionException {
        MonitorParser.expr_return retval = new MonitorParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set158=null;
        MonitorParser.term_return term157 = null;

        MonitorParser.term_return term159 = null;


        Object set158_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:138:6: ( term ( ( PLUS | MINUS ) term )* )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:138:8: term ( ( PLUS | MINUS ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_expr1241);
            term157=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term157.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:138:13: ( ( PLUS | MINUS ) term )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=PLUS && LA44_0<=MINUS)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:138:15: ( PLUS | MINUS ) term
            	    {
            	    set158=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set158));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_expr1256);
            	    term159=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term159.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "expr"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:140:1: term : factor ( ( MULT | DIV ) factor )* ;
    public final MonitorParser.term_return term() throws RecognitionException {
        MonitorParser.term_return retval = new MonitorParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set161=null;
        MonitorParser.factor_return factor160 = null;

        MonitorParser.factor_return factor162 = null;


        Object set161_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:140:6: ( factor ( ( MULT | DIV ) factor )* )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:140:8: factor ( ( MULT | DIV ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term1268);
            factor160=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor160.getTree());
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:140:15: ( ( MULT | DIV ) factor )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=MULT && LA45_0<=DIV)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:140:17: ( MULT | DIV ) factor
            	    {
            	    set161=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set161));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term1282);
            	    factor162=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor162.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:142:1: factor : NUMBER ;
    public final MonitorParser.factor_return factor() throws RecognitionException {
        MonitorParser.factor_return retval = new MonitorParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER163=null;

        Object NUMBER163_tree=null;

        try {
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:142:8: ( NUMBER )
            // /homes/rn710/workspace/MonitorPrototype/Antlr/src/Monitor.g:142:10: NUMBER
            {
            root_0 = (Object)adaptor.nil();

            NUMBER163=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1294); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER163_tree = (Object)adaptor.create(NUMBER163);
            adaptor.addChild(root_0, NUMBER163_tree);
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
        return retval;
    }
    // $ANTLR end "factor"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA3_eotS =
        "\4\uffff";
    static final String DFA3_eofS =
        "\4\uffff";
    static final String DFA3_minS =
        "\2\26\2\uffff";
    static final String DFA3_maxS =
        "\2\40\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\10\uffff\1\3\1\2",
            "\1\1\10\uffff\1\3\1\2",
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
            return "()* loopback of 36:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )*";
        }
    }
    static final String DFA18_eotS =
        "\4\uffff";
    static final String DFA18_eofS =
        "\4\uffff";
    static final String DFA18_minS =
        "\2\26\2\uffff";
    static final String DFA18_maxS =
        "\2\71\2\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA18_specialS =
        "\4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\3\10\uffff\1\2\2\uffff\1\3\2\uffff\1\3\1\2\5\uffff\2"+
            "\3\1\uffff\6\3\1\uffff\1\3\1\uffff\1\3",
            "\1\1\1\3\10\uffff\1\2\2\uffff\1\3\2\uffff\1\3\6\uffff\2\3\1"+
            "\uffff\6\3\1\uffff\1\3\1\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 65:18: ( ( ANNOTATION )* activityDef )*";
        }
    }
    static final String DFA32_eotS =
        "\12\uffff";
    static final String DFA32_eofS =
        "\1\1\11\uffff";
    static final String DFA32_minS =
        "\1\26\1\uffff\1\42\1\uffff\1\27\1\54\1\5\2\51\1\43";
    static final String DFA32_maxS =
        "\1\71\1\uffff\1\55\1\uffff\1\27\1\54\1\6\2\51\1\55";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String DFA32_specialS =
        "\12\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\3\1\2\13\uffff\1\3\2\uffff\1\3\1\1\5\uffff\2\3\1\uffff\6"+
            "\3\1\uffff\1\3\1\uffff\1\3",
            "",
            "\2\3\4\uffff\1\4\2\uffff\1\3\1\1\1\3",
            "",
            "\1\5",
            "\1\6",
            "\1\7\1\10",
            "\1\11",
            "\1\11",
            "\1\3\10\uffff\1\1\1\3"
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
            return "()* loopback of 96:15: ( ( ANNOTATION )* activityDef )*";
        }
    }
 

    public static final BitSet FOLLOW_ANNOTATION_in_description217 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_importProtocolStatement_in_description224 = new BitSet(new long[]{0x0000000180400000L});
    public static final BitSet FOLLOW_importTypeStatement_in_description228 = new BitSet(new long[]{0x0000000180400000L});
    public static final BitSet FOLLOW_ANNOTATION_in_description237 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_protocolDef_in_description242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_importProtocolStatement253 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_importProtocolStatement255 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_importProtocolDef_in_importProtocolStatement257 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33_in_importProtocolStatement261 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_importProtocolDef_in_importProtocolStatement264 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_34_in_importProtocolStatement269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_importProtocolDef278 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_importProtocolDef280 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_StringLiteral_in_importProtocolDef283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_importTypeStatement296 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_simpleName_in_importTypeStatement300 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_importTypeDef_in_importTypeStatement305 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_33_in_importTypeStatement309 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_importTypeDef_in_importTypeStatement312 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_35_in_importTypeStatement319 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_StringLiteral_in_importTypeStatement322 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_importTypeStatement327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataTypeDef_in_importTypeDef338 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_importTypeDef340 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_importTypeDef346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_dataTypeDef354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleName362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_protocolDef370 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_protocolName_in_protocolDef372 = new BitSet(new long[]{0x0000016000000000L});
    public static final BitSet FOLLOW_37_in_protocolDef376 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleName_in_protocolDef378 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_parameterDefs_in_protocolDef385 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_protocolDef390 = new BitSet(new long[]{0x02BF604800C00000L});
    public static final BitSet FOLLOW_protocolBlockDef_in_protocolDef392 = new BitSet(new long[]{0x0000008100400000L});
    public static final BitSet FOLLOW_ANNOTATION_in_protocolDef398 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_protocolDef_in_protocolDef403 = new BitSet(new long[]{0x0000008100400000L});
    public static final BitSet FOLLOW_39_in_protocolDef408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_protocolName430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parameterDefs438 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_parameterDef_in_parameterDefs441 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_33_in_parameterDefs445 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_parameterDef_in_parameterDefs448 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_41_in_parameterDefs453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeReferenceDef_in_parameterDef464 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_42_in_parameterDef468 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_simpleName_in_parameterDef472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activityListDef_in_protocolBlockDef480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_blockDef491 = new BitSet(new long[]{0x02BF60C800C00000L});
    public static final BitSet FOLLOW_activityListDef_in_blockDef493 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_blockDef495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERTION_in_assertDef517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_in_activityListDef539 = new BitSet(new long[]{0x02BF604800C00000L});
    public static final BitSet FOLLOW_activityDef_in_activityListDef544 = new BitSet(new long[]{0x02BF604800C00002L});
    public static final BitSet FOLLOW_INT_in_primitivetype560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitivetype582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_introducesDef_in_activityDef595 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_interactionDef_in_activityDef599 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_inlineDef_in_activityDef603 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_runDef_in_activityDef607 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_recursionDef_in_activityDef611 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_endDef_in_activityDef615 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_activityDef619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choiceDef_in_activityDef628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directedChoiceDef_in_activityDef632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallelDef_in_activityDef636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatDef_in_activityDef640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedDef_in_activityDef644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recBlockDef_in_activityDef651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalEscapeDef_in_activityDef655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef663 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_introducesDef665 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef667 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_introducesDef671 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef673 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ID_in_roleDef684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_roleName695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typeReferenceDef706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeReferenceDef_in_interactionSignatureDef718 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_interactionSignatureDef721 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_interactionSignatureDef723 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_interactionSignatureDef725 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_primitivetype_in_interactionSignatureDef727 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_interactionSignatureDef729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interactionSignatureDef_in_interactionDef761 = new BitSet(new long[]{0x0000200800000000L});
    public static final BitSet FOLLOW_35_in_interactionDef767 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleName_in_interactionDef772 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_assertDef_in_interactionDef776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_interactionDef800 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleName_in_interactionDef802 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_assertDef_in_interactionDef806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_choiceDef827 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_choiceDef831 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleName_in_choiceDef833 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_blockDef_in_choiceDef838 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_choiceDef842 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_blockDef_in_choiceDef844 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_35_in_directedChoiceDef865 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef867 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_45_in_directedChoiceDef874 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef876 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_33_in_directedChoiceDef880 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef883 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_38_in_directedChoiceDef891 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_onMessageDef_in_directedChoiceDef895 = new BitSet(new long[]{0x0000008000800000L});
    public static final BitSet FOLLOW_39_in_directedChoiceDef900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interactionSignatureDef_in_onMessageDef907 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_onMessageDef909 = new BitSet(new long[]{0x02BF604800C00000L});
    public static final BitSet FOLLOW_activityList_in_onMessageDef911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_in_activityList924 = new BitSet(new long[]{0x02BF604800C00000L});
    public static final BitSet FOLLOW_activityDef_in_activityList929 = new BitSet(new long[]{0x02BF604800C00002L});
    public static final BitSet FOLLOW_48_in_repeatDef939 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_repeatDef943 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleName_in_repeatDef945 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_33_in_repeatDef949 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleName_in_repeatDef951 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_blockDef_in_repeatDef959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_recBlockDef975 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_labelName_in_recBlockDef977 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_blockDef_in_recBlockDef979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_labelName996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelName_in_recursionDef1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_endDef1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_runDef1034 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_protocolRefDef_in_runDef1037 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_40_in_runDef1041 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_parameter_in_runDef1044 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_33_in_runDef1048 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_parameter_in_runDef1051 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_41_in_runDef1056 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_runDef1062 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleName_in_runDef1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_protocolRefDef1072 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_protocolRefDef1076 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_roleName_in_protocolRefDef1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarationName1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationName_in_parameter1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_inlineDef1106 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_protocolRefDef_in_inlineDef1109 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_inlineDef1113 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_parameter_in_inlineDef1116 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_33_in_inlineDef1120 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_parameter_in_inlineDef1123 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_41_in_inlineDef1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_parallelDef1140 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_blockDef_in_parallelDef1142 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_parallelDef1146 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_blockDef_in_parallelDef1148 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_55_in_globalEscapeDef1168 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_blockDef_in_globalEscapeDef1171 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_interruptDef_in_globalEscapeDef1175 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_interruptDef1187 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_blockDef_in_interruptDef1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_unorderedDef1198 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_unorderedDef1200 = new BitSet(new long[]{0x02BF60C800C00000L});
    public static final BitSet FOLLOW_ANNOTATION_in_unorderedDef1206 = new BitSet(new long[]{0x02BF604800C00000L});
    public static final BitSet FOLLOW_activityDef_in_unorderedDef1211 = new BitSet(new long[]{0x02BF60C800C00000L});
    public static final BitSet FOLLOW_39_in_unorderedDef1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr1241 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_set_in_expr1245 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_expr1256 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_factor_in_term1268 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_set_in_term1272 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_factor_in_term1282 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_NUMBER_in_factor1294 = new BitSet(new long[]{0x0000000000000002L});

}