// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 src\\SavedFSM\\Monitor.g 2012-01-20 10:24:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class MonitorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INTERACTION", "INT", "STRING", "PLUS", "MINUS", "MULT", "DIV", "FULLSTOP", "RESV", "SEND", "TYPE", "VALUE", "BRANCH", "UNORDERED", "RECLABEL", "PARALLEL", "PROTOCOL", "ASSERT", "GLOBAL_ESCAPE", "ANNOTATION", "ID", "StringLiteral", "ASSERTION", "NUMBER", "DIGIT", "WHITESPACE", "ML_COMMENT", "LINE_COMMENT", "'import'", "'protocol'", "','", "';'", "'from'", "'as'", "'at'", "'{'", "'}'", "'('", "')'", "'role'", "'introduces'", "':'", "'to'", "'choice'", "'or'", "'repeat'", "'rec'", "'end'", "'run'", "'inline'", "'parallel'", "'and'", "'do'", "'interrupt'", "'by'", "'unordered'"
    };
    public static final int RESV=12;
    public static final int ANNOTATION=23;
    public static final int ASSERTION=26;
    public static final int PARALLEL=19;
    public static final int ID=24;
    public static final int EOF=-1;
    public static final int PROTOCOL=20;
    public static final int TYPE=14;
    public static final int T__55=55;
    public static final int ML_COMMENT=30;
    public static final int T__56=56;
    public static final int INTERACTION=4;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int FULLSTOP=11;
    public static final int PLUS=7;
    public static final int SEND=13;
    public static final int DIGIT=28;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int LINE_COMMENT=31;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RECLABEL=18;
    public static final int NUMBER=27;
    public static final int WHITESPACE=29;
    public static final int INT=5;
    public static final int MINUS=8;
    public static final int MULT=9;
    public static final int VALUE=15;
    public static final int ASSERT=21;
    public static final int UNORDERED=17;
    public static final int StringLiteral=25;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int GLOBAL_ESCAPE=22;
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
    public String getGrammarFileName() { return "src\\SavedFSM\\Monitor.g"; }


    public static class description_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "description"
    // src\\SavedFSM\\Monitor.g:38:1: description : ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef ;
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
            // src\\SavedFSM\\Monitor.g:38:12: ( ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef )
            // src\\SavedFSM\\Monitor.g:38:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef
            {
            // src\\SavedFSM\\Monitor.g:38:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:38:16: ( ANNOTATION )* ( importProtocolStatement | importTypeStatement )
            	    {
            	    // src\\SavedFSM\\Monitor.g:38:16: ( ANNOTATION )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==ANNOTATION) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // src\\SavedFSM\\Monitor.g:38:18: ANNOTATION
            	    	    {
            	    	    ANNOTATION1=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_description226); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION1);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    // src\\SavedFSM\\Monitor.g:38:32: ( importProtocolStatement | importTypeStatement )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==32) ) {
            	        int LA2_1 = input.LA(2);

            	        if ( (LA2_1==33) ) {
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
            	            // src\\SavedFSM\\Monitor.g:38:34: importProtocolStatement
            	            {
            	            pushFollow(FOLLOW_importProtocolStatement_in_description233);
            	            importProtocolStatement2=importProtocolStatement();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_importProtocolStatement.add(importProtocolStatement2.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // src\\SavedFSM\\Monitor.g:38:60: importTypeStatement
            	            {
            	            pushFollow(FOLLOW_importTypeStatement_in_description237);
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

            // src\\SavedFSM\\Monitor.g:38:85: ( ANNOTATION )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ANNOTATION) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:38:87: ANNOTATION
            	    {
            	    ANNOTATION4=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_description246); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION4);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            pushFollow(FOLLOW_protocolDef_in_description251);
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
            // 38:113: -> protocolDef
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
    // src\\SavedFSM\\Monitor.g:40:1: importProtocolStatement : 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' ;
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
            // src\\SavedFSM\\Monitor.g:40:24: ( 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' )
            // src\\SavedFSM\\Monitor.g:40:26: 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal6=(Token)match(input,32,FOLLOW_32_in_importProtocolStatement262); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal6_tree = (Object)adaptor.create(string_literal6);
            adaptor.addChild(root_0, string_literal6_tree);
            }
            string_literal7=(Token)match(input,33,FOLLOW_33_in_importProtocolStatement264); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal7_tree = (Object)adaptor.create(string_literal7);
            adaptor.addChild(root_0, string_literal7_tree);
            }
            pushFollow(FOLLOW_importProtocolDef_in_importProtocolStatement266);
            importProtocolDef8=importProtocolDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importProtocolDef8.getTree());
            // src\\SavedFSM\\Monitor.g:40:64: ( ',' importProtocolDef )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:40:66: ',' importProtocolDef
            	    {
            	    char_literal9=(Token)match(input,34,FOLLOW_34_in_importProtocolStatement270); if (state.failed) return retval;
            	    pushFollow(FOLLOW_importProtocolDef_in_importProtocolStatement273);
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

            char_literal11=(Token)match(input,35,FOLLOW_35_in_importProtocolStatement278); if (state.failed) return retval;

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
    // src\\SavedFSM\\Monitor.g:42:1: importProtocolDef : ID 'from' StringLiteral ;
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
            // src\\SavedFSM\\Monitor.g:42:18: ( ID 'from' StringLiteral )
            // src\\SavedFSM\\Monitor.g:42:20: ID 'from' StringLiteral
            {
            root_0 = (Object)adaptor.nil();

            ID12=(Token)match(input,ID,FOLLOW_ID_in_importProtocolDef287); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID12_tree = (Object)adaptor.create(ID12);
            adaptor.addChild(root_0, ID12_tree);
            }
            string_literal13=(Token)match(input,36,FOLLOW_36_in_importProtocolDef289); if (state.failed) return retval;
            StringLiteral14=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_importProtocolDef292); if (state.failed) return retval;
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
    // src\\SavedFSM\\Monitor.g:44:1: importTypeStatement : 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' ;
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
            // src\\SavedFSM\\Monitor.g:44:20: ( 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' )
            // src\\SavedFSM\\Monitor.g:44:22: 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal15=(Token)match(input,32,FOLLOW_32_in_importTypeStatement305); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal15_tree = (Object)adaptor.create(string_literal15);
            adaptor.addChild(root_0, string_literal15_tree);
            }
            // src\\SavedFSM\\Monitor.g:44:31: ( simpleName )?
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
                    // src\\SavedFSM\\Monitor.g:44:33: simpleName
                    {
                    pushFollow(FOLLOW_simpleName_in_importTypeStatement309);
                    simpleName16=simpleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleName16.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_importTypeDef_in_importTypeStatement314);
            importTypeDef17=importTypeDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importTypeDef17.getTree());
            // src\\SavedFSM\\Monitor.g:44:61: ( ',' importTypeDef )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:44:63: ',' importTypeDef
            	    {
            	    char_literal18=(Token)match(input,34,FOLLOW_34_in_importTypeStatement318); if (state.failed) return retval;
            	    pushFollow(FOLLOW_importTypeDef_in_importTypeStatement321);
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

            // src\\SavedFSM\\Monitor.g:44:85: ( 'from' StringLiteral )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:44:87: 'from' StringLiteral
                    {
                    string_literal20=(Token)match(input,36,FOLLOW_36_in_importTypeStatement328); if (state.failed) return retval;
                    StringLiteral21=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_importTypeStatement331); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral21_tree = (Object)adaptor.create(StringLiteral21);
                    adaptor.addChild(root_0, StringLiteral21_tree);
                    }

                    }
                    break;

            }

            char_literal22=(Token)match(input,35,FOLLOW_35_in_importTypeStatement336); if (state.failed) return retval;

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
    // src\\SavedFSM\\Monitor.g:46:1: importTypeDef : ( dataTypeDef 'as' )? ID ;
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
            // src\\SavedFSM\\Monitor.g:46:14: ( ( dataTypeDef 'as' )? ID )
            // src\\SavedFSM\\Monitor.g:46:16: ( dataTypeDef 'as' )? ID
            {
            root_0 = (Object)adaptor.nil();

            // src\\SavedFSM\\Monitor.g:46:16: ( dataTypeDef 'as' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==StringLiteral) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:46:18: dataTypeDef 'as'
                    {
                    pushFollow(FOLLOW_dataTypeDef_in_importTypeDef347);
                    dataTypeDef23=dataTypeDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dataTypeDef23.getTree());
                    string_literal24=(Token)match(input,37,FOLLOW_37_in_importTypeDef349); if (state.failed) return retval;

                    }
                    break;

            }

            ID25=(Token)match(input,ID,FOLLOW_ID_in_importTypeDef355); if (state.failed) return retval;
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
    // src\\SavedFSM\\Monitor.g:48:1: dataTypeDef : StringLiteral ;
    public final MonitorParser.dataTypeDef_return dataTypeDef() throws RecognitionException {
        MonitorParser.dataTypeDef_return retval = new MonitorParser.dataTypeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral26=null;

        Object StringLiteral26_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:48:12: ( StringLiteral )
            // src\\SavedFSM\\Monitor.g:48:14: StringLiteral
            {
            root_0 = (Object)adaptor.nil();

            StringLiteral26=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dataTypeDef363); if (state.failed) return retval;
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
    // src\\SavedFSM\\Monitor.g:50:1: simpleName : ID ;
    public final MonitorParser.simpleName_return simpleName() throws RecognitionException {
        MonitorParser.simpleName_return retval = new MonitorParser.simpleName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID27=null;

        Object ID27_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:50:11: ( ID )
            // src\\SavedFSM\\Monitor.g:50:13: ID
            {
            root_0 = (Object)adaptor.nil();

            ID27=(Token)match(input,ID,FOLLOW_ID_in_simpleName371); if (state.failed) return retval;
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
    // src\\SavedFSM\\Monitor.g:52:1: protocolDef : 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( PROTOCOL ( protocolBlockDef )+ ) ;
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
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_parameterDefs=new RewriteRuleSubtreeStream(adaptor,"rule parameterDefs");
        RewriteRuleSubtreeStream stream_protocolDef=new RewriteRuleSubtreeStream(adaptor,"rule protocolDef");
        RewriteRuleSubtreeStream stream_protocolName=new RewriteRuleSubtreeStream(adaptor,"rule protocolName");
        RewriteRuleSubtreeStream stream_protocolBlockDef=new RewriteRuleSubtreeStream(adaptor,"rule protocolBlockDef");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        try {
            // src\\SavedFSM\\Monitor.g:52:12: ( 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( PROTOCOL ( protocolBlockDef )+ ) )
            // src\\SavedFSM\\Monitor.g:52:14: 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}'
            {
            string_literal28=(Token)match(input,33,FOLLOW_33_in_protocolDef379); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_33.add(string_literal28);

            pushFollow(FOLLOW_protocolName_in_protocolDef381);
            protocolName29=protocolName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protocolName.add(protocolName29.getTree());
            // src\\SavedFSM\\Monitor.g:52:38: ( 'at' roleName )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:52:40: 'at' roleName
                    {
                    string_literal30=(Token)match(input,38,FOLLOW_38_in_protocolDef385); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal30);

                    pushFollow(FOLLOW_roleName_in_protocolDef387);
                    roleName31=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName31.getTree());

                    }
                    break;

            }

            // src\\SavedFSM\\Monitor.g:52:57: ( parameterDefs )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:52:59: parameterDefs
                    {
                    pushFollow(FOLLOW_parameterDefs_in_protocolDef394);
                    parameterDefs32=parameterDefs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameterDefs.add(parameterDefs32.getTree());

                    }
                    break;

            }

            char_literal33=(Token)match(input,39,FOLLOW_39_in_protocolDef399); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(char_literal33);

            pushFollow(FOLLOW_protocolBlockDef_in_protocolDef401);
            protocolBlockDef34=protocolBlockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protocolBlockDef.add(protocolBlockDef34.getTree());
            // src\\SavedFSM\\Monitor.g:52:97: ( ( ANNOTATION )* protocolDef )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ANNOTATION||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:52:99: ( ANNOTATION )* protocolDef
            	    {
            	    // src\\SavedFSM\\Monitor.g:52:99: ( ANNOTATION )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==ANNOTATION) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // src\\SavedFSM\\Monitor.g:52:101: ANNOTATION
            	    	    {
            	    	    ANNOTATION35=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_protocolDef407); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION35);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_protocolDef_in_protocolDef412);
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

            char_literal37=(Token)match(input,40,FOLLOW_40_in_protocolDef417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(char_literal37);



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
            // 53:7: -> ^( PROTOCOL ( protocolBlockDef )+ )
            {
                // src\\SavedFSM\\Monitor.g:53:10: ^( PROTOCOL ( protocolBlockDef )+ )
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
    // src\\SavedFSM\\Monitor.g:55:1: protocolName : ID ;
    public final MonitorParser.protocolName_return protocolName() throws RecognitionException {
        MonitorParser.protocolName_return retval = new MonitorParser.protocolName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID38=null;

        Object ID38_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:55:13: ( ID )
            // src\\SavedFSM\\Monitor.g:55:15: ID
            {
            root_0 = (Object)adaptor.nil();

            ID38=(Token)match(input,ID,FOLLOW_ID_in_protocolName439); if (state.failed) return retval;
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
    // src\\SavedFSM\\Monitor.g:57:1: parameterDefs : '(' parameterDef ( ',' parameterDef )* ')' ;
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
            // src\\SavedFSM\\Monitor.g:57:14: ( '(' parameterDef ( ',' parameterDef )* ')' )
            // src\\SavedFSM\\Monitor.g:57:16: '(' parameterDef ( ',' parameterDef )* ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal39=(Token)match(input,41,FOLLOW_41_in_parameterDefs447); if (state.failed) return retval;
            pushFollow(FOLLOW_parameterDef_in_parameterDefs450);
            parameterDef40=parameterDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameterDef40.getTree());
            // src\\SavedFSM\\Monitor.g:57:34: ( ',' parameterDef )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:57:36: ',' parameterDef
            	    {
            	    char_literal41=(Token)match(input,34,FOLLOW_34_in_parameterDefs454); if (state.failed) return retval;
            	    pushFollow(FOLLOW_parameterDef_in_parameterDefs457);
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

            char_literal43=(Token)match(input,42,FOLLOW_42_in_parameterDefs462); if (state.failed) return retval;

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
    // src\\SavedFSM\\Monitor.g:59:1: parameterDef : ( typeReferenceDef | 'role' ) simpleName ;
    public final MonitorParser.parameterDef_return parameterDef() throws RecognitionException {
        MonitorParser.parameterDef_return retval = new MonitorParser.parameterDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal45=null;
        MonitorParser.typeReferenceDef_return typeReferenceDef44 = null;

        MonitorParser.simpleName_return simpleName46 = null;


        Object string_literal45_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:59:13: ( ( typeReferenceDef | 'role' ) simpleName )
            // src\\SavedFSM\\Monitor.g:59:15: ( typeReferenceDef | 'role' ) simpleName
            {
            root_0 = (Object)adaptor.nil();

            // src\\SavedFSM\\Monitor.g:59:15: ( typeReferenceDef | 'role' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==43) ) {
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
                    // src\\SavedFSM\\Monitor.g:59:17: typeReferenceDef
                    {
                    pushFollow(FOLLOW_typeReferenceDef_in_parameterDef473);
                    typeReferenceDef44=typeReferenceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeReferenceDef44.getTree());

                    }
                    break;
                case 2 :
                    // src\\SavedFSM\\Monitor.g:59:36: 'role'
                    {
                    string_literal45=(Token)match(input,43,FOLLOW_43_in_parameterDef477); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal45_tree = (Object)adaptor.create(string_literal45);
                    adaptor.addChild(root_0, string_literal45_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_simpleName_in_parameterDef481);
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
    // src\\SavedFSM\\Monitor.g:61:1: protocolBlockDef : activityListDef -> activityListDef ;
    public final MonitorParser.protocolBlockDef_return protocolBlockDef() throws RecognitionException {
        MonitorParser.protocolBlockDef_return retval = new MonitorParser.protocolBlockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.activityListDef_return activityListDef47 = null;


        RewriteRuleSubtreeStream stream_activityListDef=new RewriteRuleSubtreeStream(adaptor,"rule activityListDef");
        try {
            // src\\SavedFSM\\Monitor.g:61:17: ( activityListDef -> activityListDef )
            // src\\SavedFSM\\Monitor.g:61:19: activityListDef
            {
            pushFollow(FOLLOW_activityListDef_in_protocolBlockDef489);
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
            // 61:35: -> activityListDef
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
    // src\\SavedFSM\\Monitor.g:63:1: blockDef : '{' activityListDef '}' -> ^( BRANCH activityListDef ) ;
    public final MonitorParser.blockDef_return blockDef() throws RecognitionException {
        MonitorParser.blockDef_return retval = new MonitorParser.blockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        MonitorParser.activityListDef_return activityListDef49 = null;


        Object char_literal48_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_activityListDef=new RewriteRuleSubtreeStream(adaptor,"rule activityListDef");
        try {
            // src\\SavedFSM\\Monitor.g:63:9: ( '{' activityListDef '}' -> ^( BRANCH activityListDef ) )
            // src\\SavedFSM\\Monitor.g:63:11: '{' activityListDef '}'
            {
            char_literal48=(Token)match(input,39,FOLLOW_39_in_blockDef500); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(char_literal48);

            pushFollow(FOLLOW_activityListDef_in_blockDef502);
            activityListDef49=activityListDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_activityListDef.add(activityListDef49.getTree());
            char_literal50=(Token)match(input,40,FOLLOW_40_in_blockDef504); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(char_literal50);



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
            // 63:35: -> ^( BRANCH activityListDef )
            {
                // src\\SavedFSM\\Monitor.g:63:38: ^( BRANCH activityListDef )
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
    // src\\SavedFSM\\Monitor.g:65:1: assertDef : ( ASSERTION )? -> ^( ASSERT ( ASSERTION )? ) ;
    public final MonitorParser.assertDef_return assertDef() throws RecognitionException {
        MonitorParser.assertDef_return retval = new MonitorParser.assertDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSERTION51=null;

        Object ASSERTION51_tree=null;
        RewriteRuleTokenStream stream_ASSERTION=new RewriteRuleTokenStream(adaptor,"token ASSERTION");

        try {
            // src\\SavedFSM\\Monitor.g:65:11: ( ( ASSERTION )? -> ^( ASSERT ( ASSERTION )? ) )
            // src\\SavedFSM\\Monitor.g:65:13: ( ASSERTION )?
            {
            // src\\SavedFSM\\Monitor.g:65:13: ( ASSERTION )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ASSERTION) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:65:14: ASSERTION
                    {
                    ASSERTION51=(Token)match(input,ASSERTION,FOLLOW_ASSERTION_in_assertDef526); if (state.failed) return retval; 
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
            // 65:26: -> ^( ASSERT ( ASSERTION )? )
            {
                // src\\SavedFSM\\Monitor.g:65:29: ^( ASSERT ( ASSERTION )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSERT, "ASSERT"), root_1);

                // src\\SavedFSM\\Monitor.g:65:38: ( ASSERTION )?
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
    // src\\SavedFSM\\Monitor.g:67:1: activityListDef : ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ ;
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
            // src\\SavedFSM\\Monitor.g:67:16: ( ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ )
            // src\\SavedFSM\\Monitor.g:67:18: ( ( ANNOTATION )* activityDef )*
            {
            // src\\SavedFSM\\Monitor.g:67:18: ( ( ANNOTATION )* activityDef )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:67:20: ( ANNOTATION )* activityDef
            	    {
            	    // src\\SavedFSM\\Monitor.g:67:20: ( ANNOTATION )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==ANNOTATION) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // src\\SavedFSM\\Monitor.g:67:22: ANNOTATION
            	    	    {
            	    	    ANNOTATION52=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_activityListDef548); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION52);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_activityDef_in_activityListDef553);
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
            // 67:51: -> ( activityDef )+
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
    // src\\SavedFSM\\Monitor.g:69:1: primitivetype : ( INT -> INT | STRING -> STRING ) ;
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
            // src\\SavedFSM\\Monitor.g:69:15: ( ( INT -> INT | STRING -> STRING ) )
            // src\\SavedFSM\\Monitor.g:69:16: ( INT -> INT | STRING -> STRING )
            {
            // src\\SavedFSM\\Monitor.g:69:16: ( INT -> INT | STRING -> STRING )
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
                    // src\\SavedFSM\\Monitor.g:69:17: INT
                    {
                    INT54=(Token)match(input,INT,FOLLOW_INT_in_primitivetype569); if (state.failed) return retval; 
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
                    // 69:21: -> INT
                    {
                        adaptor.addChild(root_0, stream_INT.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // src\\SavedFSM\\Monitor.g:69:28: STRING
                    {
                    STRING55=(Token)match(input,STRING,FOLLOW_STRING_in_primitivetype575); if (state.failed) return retval; 
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
                    // 69:34: -> STRING
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
    // src\\SavedFSM\\Monitor.g:71:1: activityDef : ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef | RECLABEL ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef );
    public final MonitorParser.activityDef_return activityDef() throws RecognitionException {
        MonitorParser.activityDef_return retval = new MonitorParser.activityDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RECLABEL62=null;
        Token char_literal63=null;
        MonitorParser.introducesDef_return introducesDef56 = null;

        MonitorParser.interactionDef_return interactionDef57 = null;

        MonitorParser.inlineDef_return inlineDef58 = null;

        MonitorParser.runDef_return runDef59 = null;

        MonitorParser.recursionDef_return recursionDef60 = null;

        MonitorParser.endDef_return endDef61 = null;

        MonitorParser.choiceDef_return choiceDef64 = null;

        MonitorParser.directedChoiceDef_return directedChoiceDef65 = null;

        MonitorParser.parallelDef_return parallelDef66 = null;

        MonitorParser.repeatDef_return repeatDef67 = null;

        MonitorParser.unorderedDef_return unorderedDef68 = null;

        MonitorParser.recBlockDef_return recBlockDef69 = null;

        MonitorParser.globalEscapeDef_return globalEscapeDef70 = null;


        Object RECLABEL62_tree=null;
        Object char_literal63_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:71:12: ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef | RECLABEL ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef )
            int alt21=8;
            switch ( input.LA(1) ) {
            case RECLABEL:
            case ID:
            case 51:
            case 52:
            case 53:
                {
                alt21=1;
                }
                break;
            case 47:
                {
                alt21=2;
                }
                break;
            case 36:
            case 39:
            case 46:
                {
                alt21=3;
                }
                break;
            case 54:
                {
                alt21=4;
                }
                break;
            case 49:
                {
                alt21=5;
                }
                break;
            case 59:
                {
                alt21=6;
                }
                break;
            case 50:
                {
                alt21=7;
                }
                break;
            case 56:
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
                    // src\\SavedFSM\\Monitor.g:71:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef | RECLABEL ) ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    // src\\SavedFSM\\Monitor.g:71:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef | RECLABEL )
                    int alt20=7;
                    switch ( input.LA(1) ) {
                    case ID:
                        {
                        switch ( input.LA(2) ) {
                        case 44:
                            {
                            alt20=1;
                            }
                            break;
                        case 36:
                        case 41:
                        case 46:
                            {
                            alt20=2;
                            }
                            break;
                        case 35:
                            {
                            alt20=5;
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
                    case 53:
                        {
                        alt20=3;
                        }
                        break;
                    case 52:
                        {
                        alt20=4;
                        }
                        break;
                    case 51:
                        {
                        alt20=6;
                        }
                        break;
                    case RECLABEL:
                        {
                        alt20=7;
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
                            // src\\SavedFSM\\Monitor.g:71:16: introducesDef
                            {
                            pushFollow(FOLLOW_introducesDef_in_activityDef588);
                            introducesDef56=introducesDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, introducesDef56.getTree());

                            }
                            break;
                        case 2 :
                            // src\\SavedFSM\\Monitor.g:71:32: interactionDef
                            {
                            pushFollow(FOLLOW_interactionDef_in_activityDef592);
                            interactionDef57=interactionDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, interactionDef57.getTree());

                            }
                            break;
                        case 3 :
                            // src\\SavedFSM\\Monitor.g:71:49: inlineDef
                            {
                            pushFollow(FOLLOW_inlineDef_in_activityDef596);
                            inlineDef58=inlineDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, inlineDef58.getTree());

                            }
                            break;
                        case 4 :
                            // src\\SavedFSM\\Monitor.g:71:61: runDef
                            {
                            pushFollow(FOLLOW_runDef_in_activityDef600);
                            runDef59=runDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, runDef59.getTree());

                            }
                            break;
                        case 5 :
                            // src\\SavedFSM\\Monitor.g:71:70: recursionDef
                            {
                            pushFollow(FOLLOW_recursionDef_in_activityDef604);
                            recursionDef60=recursionDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, recursionDef60.getTree());

                            }
                            break;
                        case 6 :
                            // src\\SavedFSM\\Monitor.g:71:85: endDef
                            {
                            pushFollow(FOLLOW_endDef_in_activityDef608);
                            endDef61=endDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, endDef61.getTree());

                            }
                            break;
                        case 7 :
                            // src\\SavedFSM\\Monitor.g:71:94: RECLABEL
                            {
                            RECLABEL62=(Token)match(input,RECLABEL,FOLLOW_RECLABEL_in_activityDef612); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            RECLABEL62_tree = (Object)adaptor.create(RECLABEL62);
                            adaptor.addChild(root_0, RECLABEL62_tree);
                            }

                            }
                            break;

                    }

                    char_literal63=(Token)match(input,35,FOLLOW_35_in_activityDef616); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // src\\SavedFSM\\Monitor.g:72:4: choiceDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_choiceDef_in_activityDef625);
                    choiceDef64=choiceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, choiceDef64.getTree());

                    }
                    break;
                case 3 :
                    // src\\SavedFSM\\Monitor.g:72:16: directedChoiceDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_directedChoiceDef_in_activityDef629);
                    directedChoiceDef65=directedChoiceDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, directedChoiceDef65.getTree());

                    }
                    break;
                case 4 :
                    // src\\SavedFSM\\Monitor.g:72:36: parallelDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parallelDef_in_activityDef633);
                    parallelDef66=parallelDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parallelDef66.getTree());

                    }
                    break;
                case 5 :
                    // src\\SavedFSM\\Monitor.g:72:50: repeatDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_repeatDef_in_activityDef637);
                    repeatDef67=repeatDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, repeatDef67.getTree());

                    }
                    break;
                case 6 :
                    // src\\SavedFSM\\Monitor.g:72:62: unorderedDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unorderedDef_in_activityDef641);
                    unorderedDef68=unorderedDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unorderedDef68.getTree());

                    }
                    break;
                case 7 :
                    // src\\SavedFSM\\Monitor.g:73:4: recBlockDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_recBlockDef_in_activityDef648);
                    recBlockDef69=recBlockDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recBlockDef69.getTree());

                    }
                    break;
                case 8 :
                    // src\\SavedFSM\\Monitor.g:73:18: globalEscapeDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_globalEscapeDef_in_activityDef652);
                    globalEscapeDef70=globalEscapeDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, globalEscapeDef70.getTree());

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
    // src\\SavedFSM\\Monitor.g:75:1: introducesDef : roleDef 'introduces' roleDef ( ',' roleDef )* ;
    public final MonitorParser.introducesDef_return introducesDef() throws RecognitionException {
        MonitorParser.introducesDef_return retval = new MonitorParser.introducesDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal72=null;
        Token char_literal74=null;
        MonitorParser.roleDef_return roleDef71 = null;

        MonitorParser.roleDef_return roleDef73 = null;

        MonitorParser.roleDef_return roleDef75 = null;


        Object string_literal72_tree=null;
        Object char_literal74_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:75:14: ( roleDef 'introduces' roleDef ( ',' roleDef )* )
            // src\\SavedFSM\\Monitor.g:75:16: roleDef 'introduces' roleDef ( ',' roleDef )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_roleDef_in_introducesDef660);
            roleDef71=roleDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, roleDef71.getTree());
            string_literal72=(Token)match(input,44,FOLLOW_44_in_introducesDef662); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal72_tree = (Object)adaptor.create(string_literal72);
            adaptor.addChild(root_0, string_literal72_tree);
            }
            pushFollow(FOLLOW_roleDef_in_introducesDef664);
            roleDef73=roleDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, roleDef73.getTree());
            // src\\SavedFSM\\Monitor.g:75:45: ( ',' roleDef )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:75:47: ',' roleDef
            	    {
            	    char_literal74=(Token)match(input,34,FOLLOW_34_in_introducesDef668); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal74_tree = (Object)adaptor.create(char_literal74);
            	    adaptor.addChild(root_0, char_literal74_tree);
            	    }
            	    pushFollow(FOLLOW_roleDef_in_introducesDef670);
            	    roleDef75=roleDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleDef75.getTree());

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
    // src\\SavedFSM\\Monitor.g:77:1: roleDef : ID -> ID ;
    public final MonitorParser.roleDef_return roleDef() throws RecognitionException {
        MonitorParser.roleDef_return retval = new MonitorParser.roleDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID76=null;

        Object ID76_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src\\SavedFSM\\Monitor.g:77:8: ( ID -> ID )
            // src\\SavedFSM\\Monitor.g:77:10: ID
            {
            ID76=(Token)match(input,ID,FOLLOW_ID_in_roleDef681); if (state.failed) return retval; 
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
            // 77:13: -> ID
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
    // src\\SavedFSM\\Monitor.g:79:1: roleName : ID -> ID ;
    public final MonitorParser.roleName_return roleName() throws RecognitionException {
        MonitorParser.roleName_return retval = new MonitorParser.roleName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID77=null;

        Object ID77_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src\\SavedFSM\\Monitor.g:79:9: ( ID -> ID )
            // src\\SavedFSM\\Monitor.g:79:11: ID
            {
            ID77=(Token)match(input,ID,FOLLOW_ID_in_roleName692); if (state.failed) return retval; 
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
            // 79:14: -> ID
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
    // src\\SavedFSM\\Monitor.g:81:1: typeReferenceDef : ID -> ID ;
    public final MonitorParser.typeReferenceDef_return typeReferenceDef() throws RecognitionException {
        MonitorParser.typeReferenceDef_return retval = new MonitorParser.typeReferenceDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID78=null;

        Object ID78_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src\\SavedFSM\\Monitor.g:81:17: ( ID -> ID )
            // src\\SavedFSM\\Monitor.g:81:19: ID
            {
            ID78=(Token)match(input,ID,FOLLOW_ID_in_typeReferenceDef703); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID78);



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
            // 81:22: -> ID
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
    // src\\SavedFSM\\Monitor.g:83:1: interactionSignatureDef : ( typeReferenceDef ( '(' ( valueDecl ( ',' )? )* ')' )? -> ^( VALUE ( valueDecl )* ) typeReferenceDef ) ;
    public final MonitorParser.interactionSignatureDef_return interactionSignatureDef() throws RecognitionException {
        MonitorParser.interactionSignatureDef_return retval = new MonitorParser.interactionSignatureDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal80=null;
        Token char_literal82=null;
        Token char_literal83=null;
        MonitorParser.typeReferenceDef_return typeReferenceDef79 = null;

        MonitorParser.valueDecl_return valueDecl81 = null;


        Object char_literal80_tree=null;
        Object char_literal82_tree=null;
        Object char_literal83_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_typeReferenceDef=new RewriteRuleSubtreeStream(adaptor,"rule typeReferenceDef");
        RewriteRuleSubtreeStream stream_valueDecl=new RewriteRuleSubtreeStream(adaptor,"rule valueDecl");
        try {
            // src\\SavedFSM\\Monitor.g:83:24: ( ( typeReferenceDef ( '(' ( valueDecl ( ',' )? )* ')' )? -> ^( VALUE ( valueDecl )* ) typeReferenceDef ) )
            // src\\SavedFSM\\Monitor.g:83:26: ( typeReferenceDef ( '(' ( valueDecl ( ',' )? )* ')' )? -> ^( VALUE ( valueDecl )* ) typeReferenceDef )
            {
            // src\\SavedFSM\\Monitor.g:83:26: ( typeReferenceDef ( '(' ( valueDecl ( ',' )? )* ')' )? -> ^( VALUE ( valueDecl )* ) typeReferenceDef )
            // src\\SavedFSM\\Monitor.g:83:27: typeReferenceDef ( '(' ( valueDecl ( ',' )? )* ')' )?
            {
            pushFollow(FOLLOW_typeReferenceDef_in_interactionSignatureDef715);
            typeReferenceDef79=typeReferenceDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeReferenceDef.add(typeReferenceDef79.getTree());
            // src\\SavedFSM\\Monitor.g:83:44: ( '(' ( valueDecl ( ',' )? )* ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:83:45: '(' ( valueDecl ( ',' )? )* ')'
                    {
                    char_literal80=(Token)match(input,41,FOLLOW_41_in_interactionSignatureDef718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal80);

                    // src\\SavedFSM\\Monitor.g:83:49: ( valueDecl ( ',' )? )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // src\\SavedFSM\\Monitor.g:83:50: valueDecl ( ',' )?
                    	    {
                    	    pushFollow(FOLLOW_valueDecl_in_interactionSignatureDef721);
                    	    valueDecl81=valueDecl();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_valueDecl.add(valueDecl81.getTree());
                    	    // src\\SavedFSM\\Monitor.g:83:60: ( ',' )?
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==34) ) {
                    	        alt23=1;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // src\\SavedFSM\\Monitor.g:0:0: ','
                    	            {
                    	            char_literal82=(Token)match(input,34,FOLLOW_34_in_interactionSignatureDef723); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_34.add(char_literal82);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    char_literal83=(Token)match(input,42,FOLLOW_42_in_interactionSignatureDef728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal83);


                    }
                    break;

            }



            // AST REWRITE
            // elements: valueDecl, typeReferenceDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 83:73: -> ^( VALUE ( valueDecl )* ) typeReferenceDef
            {
                // src\\SavedFSM\\Monitor.g:83:76: ^( VALUE ( valueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VALUE, "VALUE"), root_1);

                // src\\SavedFSM\\Monitor.g:83:84: ( valueDecl )*
                while ( stream_valueDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_valueDecl.nextTree());

                }
                stream_valueDecl.reset();

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

    public static class valueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "valueDecl"
    // src\\SavedFSM\\Monitor.g:85:1: valueDecl : ID ':' primitivetype ;
    public final MonitorParser.valueDecl_return valueDecl() throws RecognitionException {
        MonitorParser.valueDecl_return retval = new MonitorParser.valueDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID84=null;
        Token char_literal85=null;
        MonitorParser.primitivetype_return primitivetype86 = null;


        Object ID84_tree=null;
        Object char_literal85_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:85:11: ( ID ':' primitivetype )
            // src\\SavedFSM\\Monitor.g:85:13: ID ':' primitivetype
            {
            root_0 = (Object)adaptor.nil();

            ID84=(Token)match(input,ID,FOLLOW_ID_in_valueDecl750); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID84_tree = (Object)adaptor.create(ID84);
            adaptor.addChild(root_0, ID84_tree);
            }
            char_literal85=(Token)match(input,45,FOLLOW_45_in_valueDecl752); if (state.failed) return retval;
            pushFollow(FOLLOW_primitivetype_in_valueDecl755);
            primitivetype86=primitivetype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primitivetype86.getTree());

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
    // $ANTLR end "valueDecl"

    public static class interactionDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interactionDef"
    // src\\SavedFSM\\Monitor.g:88:1: interactionDef : interactionSignatureDef ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) ) ;
    public final MonitorParser.interactionDef_return interactionDef() throws RecognitionException {
        MonitorParser.interactionDef_return retval = new MonitorParser.interactionDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal88=null;
        Token string_literal90=null;
        MonitorParser.roleName_return role = null;

        MonitorParser.interactionSignatureDef_return interactionSignatureDef87 = null;

        MonitorParser.assertDef_return assertDef89 = null;

        MonitorParser.roleName_return roleName91 = null;

        MonitorParser.assertDef_return assertDef92 = null;


        Object string_literal88_tree=null;
        Object string_literal90_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_assertDef=new RewriteRuleSubtreeStream(adaptor,"rule assertDef");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_interactionSignatureDef=new RewriteRuleSubtreeStream(adaptor,"rule interactionSignatureDef");
        try {
            // src\\SavedFSM\\Monitor.g:88:15: ( interactionSignatureDef ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) ) )
            // src\\SavedFSM\\Monitor.g:89:7: interactionSignatureDef ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) )
            {
            pushFollow(FOLLOW_interactionSignatureDef_in_interactionDef772);
            interactionSignatureDef87=interactionSignatureDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_interactionSignatureDef.add(interactionSignatureDef87.getTree());
            // src\\SavedFSM\\Monitor.g:89:31: ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            else if ( (LA26_0==46) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:90:3: 'from' role= roleName ( assertDef )
                    {
                    string_literal88=(Token)match(input,36,FOLLOW_36_in_interactionDef778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(string_literal88);

                    pushFollow(FOLLOW_roleName_in_interactionDef783);
                    role=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(role.getTree());
                    // src\\SavedFSM\\Monitor.g:90:26: ( assertDef )
                    // src\\SavedFSM\\Monitor.g:90:27: assertDef
                    {
                    pushFollow(FOLLOW_assertDef_in_interactionDef787);
                    assertDef89=assertDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assertDef.add(assertDef89.getTree());

                    }



                    // AST REWRITE
                    // elements: assertDef, role, interactionSignatureDef
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
                    // 90:37: -> ^( RESV interactionSignatureDef $role assertDef )
                    {
                        // src\\SavedFSM\\Monitor.g:90:40: ^( RESV interactionSignatureDef $role assertDef )
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
                    // src\\SavedFSM\\Monitor.g:91:10: 'to' roleName ( assertDef )
                    {
                    string_literal90=(Token)match(input,46,FOLLOW_46_in_interactionDef811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_46.add(string_literal90);

                    pushFollow(FOLLOW_roleName_in_interactionDef813);
                    roleName91=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName91.getTree());
                    // src\\SavedFSM\\Monitor.g:91:25: ( assertDef )
                    // src\\SavedFSM\\Monitor.g:91:26: assertDef
                    {
                    pushFollow(FOLLOW_assertDef_in_interactionDef817);
                    assertDef92=assertDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assertDef.add(assertDef92.getTree());

                    }



                    // AST REWRITE
                    // elements: interactionSignatureDef, roleName, assertDef
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:37: -> ^( SEND interactionSignatureDef roleName assertDef )
                    {
                        // src\\SavedFSM\\Monitor.g:91:40: ^( SEND interactionSignatureDef roleName assertDef )
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
    // src\\SavedFSM\\Monitor.g:93:1: choiceDef : 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) ;
    public final MonitorParser.choiceDef_return choiceDef() throws RecognitionException {
        MonitorParser.choiceDef_return retval = new MonitorParser.choiceDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal93=null;
        Token string_literal94=null;
        Token string_literal97=null;
        MonitorParser.roleName_return roleName95 = null;

        MonitorParser.blockDef_return blockDef96 = null;

        MonitorParser.blockDef_return blockDef98 = null;


        Object string_literal93_tree=null;
        Object string_literal94_tree=null;
        Object string_literal97_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try {
            // src\\SavedFSM\\Monitor.g:93:10: ( 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) )
            // src\\SavedFSM\\Monitor.g:93:12: 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )*
            {
            string_literal93=(Token)match(input,47,FOLLOW_47_in_choiceDef838); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(string_literal93);

            // src\\SavedFSM\\Monitor.g:93:21: ( 'at' roleName )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:93:23: 'at' roleName
                    {
                    string_literal94=(Token)match(input,38,FOLLOW_38_in_choiceDef842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal94);

                    pushFollow(FOLLOW_roleName_in_choiceDef844);
                    roleName95=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName95.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_blockDef_in_choiceDef849);
            blockDef96=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef96.getTree());
            // src\\SavedFSM\\Monitor.g:93:49: ( 'or' blockDef )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:93:51: 'or' blockDef
            	    {
            	    string_literal97=(Token)match(input,48,FOLLOW_48_in_choiceDef853); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(string_literal97);

            	    pushFollow(FOLLOW_blockDef_in_choiceDef855);
            	    blockDef98=blockDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockDef.add(blockDef98.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);



            // AST REWRITE
            // elements: blockDef, 47
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 93:68: -> ^( 'choice' ( blockDef )+ )
            {
                // src\\SavedFSM\\Monitor.g:93:71: ^( 'choice' ( blockDef )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_47.nextNode(), root_1);

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
    // src\\SavedFSM\\Monitor.g:95:1: directedChoiceDef : ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' ;
    public final MonitorParser.directedChoiceDef_return directedChoiceDef() throws RecognitionException {
        MonitorParser.directedChoiceDef_return retval = new MonitorParser.directedChoiceDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal99=null;
        Token string_literal101=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token char_literal107=null;
        MonitorParser.roleName_return roleName100 = null;

        MonitorParser.roleName_return roleName102 = null;

        MonitorParser.roleName_return roleName104 = null;

        MonitorParser.onMessageDef_return onMessageDef106 = null;


        Object string_literal99_tree=null;
        Object string_literal101_tree=null;
        Object char_literal103_tree=null;
        Object char_literal105_tree=null;
        Object char_literal107_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:95:18: ( ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' )
            // src\\SavedFSM\\Monitor.g:95:20: ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}'
            {
            root_0 = (Object)adaptor.nil();

            // src\\SavedFSM\\Monitor.g:95:20: ( 'from' roleName )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:95:22: 'from' roleName
                    {
                    string_literal99=(Token)match(input,36,FOLLOW_36_in_directedChoiceDef876); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal99_tree = (Object)adaptor.create(string_literal99);
                    adaptor.addChild(root_0, string_literal99_tree);
                    }
                    pushFollow(FOLLOW_roleName_in_directedChoiceDef878);
                    roleName100=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName100.getTree());

                    }
                    break;

            }

            // src\\SavedFSM\\Monitor.g:95:41: ( 'to' roleName ( ',' roleName )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:95:43: 'to' roleName ( ',' roleName )*
                    {
                    string_literal101=(Token)match(input,46,FOLLOW_46_in_directedChoiceDef885); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal101_tree = (Object)adaptor.create(string_literal101);
                    adaptor.addChild(root_0, string_literal101_tree);
                    }
                    pushFollow(FOLLOW_roleName_in_directedChoiceDef887);
                    roleName102=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName102.getTree());
                    // src\\SavedFSM\\Monitor.g:95:57: ( ',' roleName )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==34) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // src\\SavedFSM\\Monitor.g:95:59: ',' roleName
                    	    {
                    	    char_literal103=(Token)match(input,34,FOLLOW_34_in_directedChoiceDef891); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_roleName_in_directedChoiceDef894);
                    	    roleName104=roleName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName104.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal105=(Token)match(input,39,FOLLOW_39_in_directedChoiceDef902); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal105_tree = (Object)adaptor.create(char_literal105);
            adaptor.addChild(root_0, char_literal105_tree);
            }
            // src\\SavedFSM\\Monitor.g:95:83: ( onMessageDef )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:95:85: onMessageDef
            	    {
            	    pushFollow(FOLLOW_onMessageDef_in_directedChoiceDef906);
            	    onMessageDef106=onMessageDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, onMessageDef106.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            char_literal107=(Token)match(input,40,FOLLOW_40_in_directedChoiceDef911); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal107_tree = (Object)adaptor.create(char_literal107);
            adaptor.addChild(root_0, char_literal107_tree);
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
    // src\\SavedFSM\\Monitor.g:97:1: onMessageDef : interactionSignatureDef ':' activityList ;
    public final MonitorParser.onMessageDef_return onMessageDef() throws RecognitionException {
        MonitorParser.onMessageDef_return retval = new MonitorParser.onMessageDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal109=null;
        MonitorParser.interactionSignatureDef_return interactionSignatureDef108 = null;

        MonitorParser.activityList_return activityList110 = null;


        Object char_literal109_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:97:13: ( interactionSignatureDef ':' activityList )
            // src\\SavedFSM\\Monitor.g:97:15: interactionSignatureDef ':' activityList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_interactionSignatureDef_in_onMessageDef918);
            interactionSignatureDef108=interactionSignatureDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interactionSignatureDef108.getTree());
            char_literal109=(Token)match(input,45,FOLLOW_45_in_onMessageDef920); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal109_tree = (Object)adaptor.create(char_literal109);
            adaptor.addChild(root_0, char_literal109_tree);
            }
            pushFollow(FOLLOW_activityList_in_onMessageDef922);
            activityList110=activityList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, activityList110.getTree());

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
    // src\\SavedFSM\\Monitor.g:99:1: activityList : ( ( ANNOTATION )* activityDef )* ;
    public final MonitorParser.activityList_return activityList() throws RecognitionException {
        MonitorParser.activityList_return retval = new MonitorParser.activityList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANNOTATION111=null;
        MonitorParser.activityDef_return activityDef112 = null;


        Object ANNOTATION111_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:99:13: ( ( ( ANNOTATION )* activityDef )* )
            // src\\SavedFSM\\Monitor.g:99:15: ( ( ANNOTATION )* activityDef )*
            {
            root_0 = (Object)adaptor.nil();

            // src\\SavedFSM\\Monitor.g:99:15: ( ( ANNOTATION )* activityDef )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:99:17: ( ANNOTATION )* activityDef
            	    {
            	    // src\\SavedFSM\\Monitor.g:99:17: ( ANNOTATION )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==ANNOTATION) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // src\\SavedFSM\\Monitor.g:99:19: ANNOTATION
            	    	    {
            	    	    ANNOTATION111=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_activityList935); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    ANNOTATION111_tree = (Object)adaptor.create(ANNOTATION111);
            	    	    adaptor.addChild(root_0, ANNOTATION111_tree);
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_activityDef_in_activityList940);
            	    activityDef112=activityDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, activityDef112.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // src\\SavedFSM\\Monitor.g:101:1: repeatDef : 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) ;
    public final MonitorParser.repeatDef_return repeatDef() throws RecognitionException {
        MonitorParser.repeatDef_return retval = new MonitorParser.repeatDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal113=null;
        Token string_literal114=null;
        Token char_literal116=null;
        MonitorParser.roleName_return roleName115 = null;

        MonitorParser.roleName_return roleName117 = null;

        MonitorParser.blockDef_return blockDef118 = null;


        Object string_literal113_tree=null;
        Object string_literal114_tree=null;
        Object char_literal116_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try {
            // src\\SavedFSM\\Monitor.g:101:10: ( 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) )
            // src\\SavedFSM\\Monitor.g:101:12: 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef
            {
            string_literal113=(Token)match(input,49,FOLLOW_49_in_repeatDef950); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(string_literal113);

            // src\\SavedFSM\\Monitor.g:101:21: ( 'at' roleName ( ',' roleName )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:101:23: 'at' roleName ( ',' roleName )*
                    {
                    string_literal114=(Token)match(input,38,FOLLOW_38_in_repeatDef954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal114);

                    pushFollow(FOLLOW_roleName_in_repeatDef956);
                    roleName115=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_roleName.add(roleName115.getTree());
                    // src\\SavedFSM\\Monitor.g:101:37: ( ',' roleName )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==34) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // src\\SavedFSM\\Monitor.g:101:39: ',' roleName
                    	    {
                    	    char_literal116=(Token)match(input,34,FOLLOW_34_in_repeatDef960); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_34.add(char_literal116);

                    	    pushFollow(FOLLOW_roleName_in_repeatDef962);
                    	    roleName117=roleName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_roleName.add(roleName117.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            pushFollow(FOLLOW_blockDef_in_repeatDef970);
            blockDef118=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef118.getTree());


            // AST REWRITE
            // elements: 49, blockDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 101:68: -> ^( 'repeat' blockDef )
            {
                // src\\SavedFSM\\Monitor.g:101:71: ^( 'repeat' blockDef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_49.nextNode(), root_1);

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
    // src\\SavedFSM\\Monitor.g:103:1: recBlockDef : 'rec' labelName blockDef -> ^( 'rec' labelName blockDef ) ;
    public final MonitorParser.recBlockDef_return recBlockDef() throws RecognitionException {
        MonitorParser.recBlockDef_return retval = new MonitorParser.recBlockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal119=null;
        MonitorParser.labelName_return labelName120 = null;

        MonitorParser.blockDef_return blockDef121 = null;


        Object string_literal119_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_labelName=new RewriteRuleSubtreeStream(adaptor,"rule labelName");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try {
            // src\\SavedFSM\\Monitor.g:103:12: ( 'rec' labelName blockDef -> ^( 'rec' labelName blockDef ) )
            // src\\SavedFSM\\Monitor.g:103:14: 'rec' labelName blockDef
            {
            string_literal119=(Token)match(input,50,FOLLOW_50_in_recBlockDef986); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(string_literal119);

            pushFollow(FOLLOW_labelName_in_recBlockDef988);
            labelName120=labelName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_labelName.add(labelName120.getTree());
            pushFollow(FOLLOW_blockDef_in_recBlockDef990);
            blockDef121=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef121.getTree());


            // AST REWRITE
            // elements: blockDef, 50, labelName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 103:39: -> ^( 'rec' labelName blockDef )
            {
                // src\\SavedFSM\\Monitor.g:103:42: ^( 'rec' labelName blockDef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_50.nextNode(), root_1);

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
    // src\\SavedFSM\\Monitor.g:105:1: labelName : ID -> ID ;
    public final MonitorParser.labelName_return labelName() throws RecognitionException {
        MonitorParser.labelName_return retval = new MonitorParser.labelName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID122=null;

        Object ID122_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // src\\SavedFSM\\Monitor.g:105:10: ( ID -> ID )
            // src\\SavedFSM\\Monitor.g:105:12: ID
            {
            ID122=(Token)match(input,ID,FOLLOW_ID_in_labelName1007); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID122);



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
            // 105:15: -> ID
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
    // src\\SavedFSM\\Monitor.g:107:1: recursionDef : labelName -> ^( RECLABEL labelName ) ;
    public final MonitorParser.recursionDef_return recursionDef() throws RecognitionException {
        MonitorParser.recursionDef_return retval = new MonitorParser.recursionDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.labelName_return labelName123 = null;


        RewriteRuleSubtreeStream stream_labelName=new RewriteRuleSubtreeStream(adaptor,"rule labelName");
        try {
            // src\\SavedFSM\\Monitor.g:107:13: ( labelName -> ^( RECLABEL labelName ) )
            // src\\SavedFSM\\Monitor.g:107:15: labelName
            {
            pushFollow(FOLLOW_labelName_in_recursionDef1019);
            labelName123=labelName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_labelName.add(labelName123.getTree());


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
            // 107:25: -> ^( RECLABEL labelName )
            {
                // src\\SavedFSM\\Monitor.g:107:28: ^( RECLABEL labelName )
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
    // src\\SavedFSM\\Monitor.g:110:1: endDef : 'end' ;
    public final MonitorParser.endDef_return endDef() throws RecognitionException {
        MonitorParser.endDef_return retval = new MonitorParser.endDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal124=null;

        Object string_literal124_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:110:7: ( 'end' )
            // src\\SavedFSM\\Monitor.g:110:9: 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal124=(Token)match(input,51,FOLLOW_51_in_endDef1035); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal124_tree = (Object)adaptor.create(string_literal124);
            root_0 = (Object)adaptor.becomeRoot(string_literal124_tree, root_0);
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
    // src\\SavedFSM\\Monitor.g:113:1: runDef : 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName ;
    public final MonitorParser.runDef_return runDef() throws RecognitionException {
        MonitorParser.runDef_return retval = new MonitorParser.runDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal125=null;
        Token char_literal127=null;
        Token char_literal129=null;
        Token char_literal131=null;
        Token string_literal132=null;
        MonitorParser.protocolRefDef_return protocolRefDef126 = null;

        MonitorParser.parameter_return parameter128 = null;

        MonitorParser.parameter_return parameter130 = null;

        MonitorParser.roleName_return roleName133 = null;


        Object string_literal125_tree=null;
        Object char_literal127_tree=null;
        Object char_literal129_tree=null;
        Object char_literal131_tree=null;
        Object string_literal132_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:113:7: ( 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName )
            // src\\SavedFSM\\Monitor.g:113:9: 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName
            {
            root_0 = (Object)adaptor.nil();

            string_literal125=(Token)match(input,52,FOLLOW_52_in_runDef1045); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal125_tree = (Object)adaptor.create(string_literal125);
            root_0 = (Object)adaptor.becomeRoot(string_literal125_tree, root_0);
            }
            pushFollow(FOLLOW_protocolRefDef_in_runDef1048);
            protocolRefDef126=protocolRefDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolRefDef126.getTree());
            // src\\SavedFSM\\Monitor.g:113:31: ( '(' parameter ( ',' parameter )* ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:113:33: '(' parameter ( ',' parameter )* ')'
                    {
                    char_literal127=(Token)match(input,41,FOLLOW_41_in_runDef1052); if (state.failed) return retval;
                    pushFollow(FOLLOW_parameter_in_runDef1055);
                    parameter128=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter128.getTree());
                    // src\\SavedFSM\\Monitor.g:113:48: ( ',' parameter )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==34) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // src\\SavedFSM\\Monitor.g:113:50: ',' parameter
                    	    {
                    	    char_literal129=(Token)match(input,34,FOLLOW_34_in_runDef1059); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_parameter_in_runDef1062);
                    	    parameter130=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter130.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    char_literal131=(Token)match(input,42,FOLLOW_42_in_runDef1067); if (state.failed) return retval;

                    }
                    break;

            }

            string_literal132=(Token)match(input,36,FOLLOW_36_in_runDef1073); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal132_tree = (Object)adaptor.create(string_literal132);
            adaptor.addChild(root_0, string_literal132_tree);
            }
            pushFollow(FOLLOW_roleName_in_runDef1075);
            roleName133=roleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName133.getTree());

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
    // src\\SavedFSM\\Monitor.g:115:1: protocolRefDef : ID ( 'at' roleName )? ;
    public final MonitorParser.protocolRefDef_return protocolRefDef() throws RecognitionException {
        MonitorParser.protocolRefDef_return retval = new MonitorParser.protocolRefDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID134=null;
        Token string_literal135=null;
        MonitorParser.roleName_return roleName136 = null;


        Object ID134_tree=null;
        Object string_literal135_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:115:15: ( ID ( 'at' roleName )? )
            // src\\SavedFSM\\Monitor.g:115:17: ID ( 'at' roleName )?
            {
            root_0 = (Object)adaptor.nil();

            ID134=(Token)match(input,ID,FOLLOW_ID_in_protocolRefDef1083); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID134_tree = (Object)adaptor.create(ID134);
            adaptor.addChild(root_0, ID134_tree);
            }
            // src\\SavedFSM\\Monitor.g:115:20: ( 'at' roleName )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:115:22: 'at' roleName
                    {
                    string_literal135=(Token)match(input,38,FOLLOW_38_in_protocolRefDef1087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal135_tree = (Object)adaptor.create(string_literal135);
                    adaptor.addChild(root_0, string_literal135_tree);
                    }
                    pushFollow(FOLLOW_roleName_in_protocolRefDef1089);
                    roleName136=roleName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, roleName136.getTree());

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
    // src\\SavedFSM\\Monitor.g:117:1: declarationName : ID ;
    public final MonitorParser.declarationName_return declarationName() throws RecognitionException {
        MonitorParser.declarationName_return retval = new MonitorParser.declarationName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID137=null;

        Object ID137_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:117:16: ( ID )
            // src\\SavedFSM\\Monitor.g:117:18: ID
            {
            root_0 = (Object)adaptor.nil();

            ID137=(Token)match(input,ID,FOLLOW_ID_in_declarationName1100); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID137_tree = (Object)adaptor.create(ID137);
            adaptor.addChild(root_0, ID137_tree);
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
    // src\\SavedFSM\\Monitor.g:119:1: parameter : declarationName ;
    public final MonitorParser.parameter_return parameter() throws RecognitionException {
        MonitorParser.parameter_return retval = new MonitorParser.parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.declarationName_return declarationName138 = null;



        try {
            // src\\SavedFSM\\Monitor.g:119:10: ( declarationName )
            // src\\SavedFSM\\Monitor.g:119:12: declarationName
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declarationName_in_parameter1108);
            declarationName138=declarationName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarationName138.getTree());

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
    // src\\SavedFSM\\Monitor.g:122:1: inlineDef : 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? ;
    public final MonitorParser.inlineDef_return inlineDef() throws RecognitionException {
        MonitorParser.inlineDef_return retval = new MonitorParser.inlineDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal139=null;
        Token char_literal141=null;
        Token char_literal143=null;
        Token char_literal145=null;
        MonitorParser.protocolRefDef_return protocolRefDef140 = null;

        MonitorParser.parameter_return parameter142 = null;

        MonitorParser.parameter_return parameter144 = null;


        Object string_literal139_tree=null;
        Object char_literal141_tree=null;
        Object char_literal143_tree=null;
        Object char_literal145_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:122:10: ( 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? )
            // src\\SavedFSM\\Monitor.g:122:12: 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal139=(Token)match(input,53,FOLLOW_53_in_inlineDef1117); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal139_tree = (Object)adaptor.create(string_literal139);
            root_0 = (Object)adaptor.becomeRoot(string_literal139_tree, root_0);
            }
            pushFollow(FOLLOW_protocolRefDef_in_inlineDef1120);
            protocolRefDef140=protocolRefDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolRefDef140.getTree());
            // src\\SavedFSM\\Monitor.g:122:37: ( '(' parameter ( ',' parameter )* ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // src\\SavedFSM\\Monitor.g:122:39: '(' parameter ( ',' parameter )* ')'
                    {
                    char_literal141=(Token)match(input,41,FOLLOW_41_in_inlineDef1124); if (state.failed) return retval;
                    pushFollow(FOLLOW_parameter_in_inlineDef1127);
                    parameter142=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter142.getTree());
                    // src\\SavedFSM\\Monitor.g:122:54: ( ',' parameter )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==34) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // src\\SavedFSM\\Monitor.g:122:56: ',' parameter
                    	    {
                    	    char_literal143=(Token)match(input,34,FOLLOW_34_in_inlineDef1131); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_parameter_in_inlineDef1134);
                    	    parameter144=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter144.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    char_literal145=(Token)match(input,42,FOLLOW_42_in_inlineDef1139); if (state.failed) return retval;

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
    // src\\SavedFSM\\Monitor.g:124:1: parallelDef : 'parallel' blockDef ( 'and' blockDef )* -> ^( PARALLEL ( blockDef )+ ) ;
    public final MonitorParser.parallelDef_return parallelDef() throws RecognitionException {
        MonitorParser.parallelDef_return retval = new MonitorParser.parallelDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal146=null;
        Token string_literal148=null;
        MonitorParser.blockDef_return blockDef147 = null;

        MonitorParser.blockDef_return blockDef149 = null;


        Object string_literal146_tree=null;
        Object string_literal148_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_blockDef=new RewriteRuleSubtreeStream(adaptor,"rule blockDef");
        try {
            // src\\SavedFSM\\Monitor.g:124:12: ( 'parallel' blockDef ( 'and' blockDef )* -> ^( PARALLEL ( blockDef )+ ) )
            // src\\SavedFSM\\Monitor.g:124:14: 'parallel' blockDef ( 'and' blockDef )*
            {
            string_literal146=(Token)match(input,54,FOLLOW_54_in_parallelDef1151); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(string_literal146);

            pushFollow(FOLLOW_blockDef_in_parallelDef1153);
            blockDef147=blockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_blockDef.add(blockDef147.getTree());
            // src\\SavedFSM\\Monitor.g:124:34: ( 'and' blockDef )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==55) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:124:36: 'and' blockDef
            	    {
            	    string_literal148=(Token)match(input,55,FOLLOW_55_in_parallelDef1157); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(string_literal148);

            	    pushFollow(FOLLOW_blockDef_in_parallelDef1159);
            	    blockDef149=blockDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockDef.add(blockDef149.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
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
            // 124:54: -> ^( PARALLEL ( blockDef )+ )
            {
                // src\\SavedFSM\\Monitor.g:124:57: ^( PARALLEL ( blockDef )+ )
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

    public static class doBlockDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doBlockDef"
    // src\\SavedFSM\\Monitor.g:127:1: doBlockDef : 'do' '{' activityListDef '}' -> ^( 'do' activityListDef ) ;
    public final MonitorParser.doBlockDef_return doBlockDef() throws RecognitionException {
        MonitorParser.doBlockDef_return retval = new MonitorParser.doBlockDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal150=null;
        Token char_literal151=null;
        Token char_literal153=null;
        MonitorParser.activityListDef_return activityListDef152 = null;


        Object string_literal150_tree=null;
        Object char_literal151_tree=null;
        Object char_literal153_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_activityListDef=new RewriteRuleSubtreeStream(adaptor,"rule activityListDef");
        try {
            // src\\SavedFSM\\Monitor.g:127:11: ( 'do' '{' activityListDef '}' -> ^( 'do' activityListDef ) )
            // src\\SavedFSM\\Monitor.g:127:13: 'do' '{' activityListDef '}'
            {
            string_literal150=(Token)match(input,56,FOLLOW_56_in_doBlockDef1179); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_56.add(string_literal150);

            char_literal151=(Token)match(input,39,FOLLOW_39_in_doBlockDef1181); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(char_literal151);

            pushFollow(FOLLOW_activityListDef_in_doBlockDef1183);
            activityListDef152=activityListDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_activityListDef.add(activityListDef152.getTree());
            char_literal153=(Token)match(input,40,FOLLOW_40_in_doBlockDef1186); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(char_literal153);



            // AST REWRITE
            // elements: activityListDef, 56
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 127:43: -> ^( 'do' activityListDef )
            {
                // src\\SavedFSM\\Monitor.g:127:46: ^( 'do' activityListDef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_56.nextNode(), root_1);

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
    // $ANTLR end "doBlockDef"

    public static class interruptDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interruptDef"
    // src\\SavedFSM\\Monitor.g:129:1: interruptDef : 'interrupt' 'by' roleName '{' activityListDef '}' -> ^( 'interrupt' roleName activityListDef ) ;
    public final MonitorParser.interruptDef_return interruptDef() throws RecognitionException {
        MonitorParser.interruptDef_return retval = new MonitorParser.interruptDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal154=null;
        Token string_literal155=null;
        Token char_literal157=null;
        Token char_literal159=null;
        MonitorParser.roleName_return roleName156 = null;

        MonitorParser.activityListDef_return activityListDef158 = null;


        Object string_literal154_tree=null;
        Object string_literal155_tree=null;
        Object char_literal157_tree=null;
        Object char_literal159_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_activityListDef=new RewriteRuleSubtreeStream(adaptor,"rule activityListDef");
        RewriteRuleSubtreeStream stream_roleName=new RewriteRuleSubtreeStream(adaptor,"rule roleName");
        try {
            // src\\SavedFSM\\Monitor.g:129:13: ( 'interrupt' 'by' roleName '{' activityListDef '}' -> ^( 'interrupt' roleName activityListDef ) )
            // src\\SavedFSM\\Monitor.g:129:15: 'interrupt' 'by' roleName '{' activityListDef '}'
            {
            string_literal154=(Token)match(input,57,FOLLOW_57_in_interruptDef1204); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(string_literal154);

            string_literal155=(Token)match(input,58,FOLLOW_58_in_interruptDef1206); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_58.add(string_literal155);

            pushFollow(FOLLOW_roleName_in_interruptDef1208);
            roleName156=roleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_roleName.add(roleName156.getTree());
            char_literal157=(Token)match(input,39,FOLLOW_39_in_interruptDef1210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(char_literal157);

            pushFollow(FOLLOW_activityListDef_in_interruptDef1212);
            activityListDef158=activityListDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_activityListDef.add(activityListDef158.getTree());
            char_literal159=(Token)match(input,40,FOLLOW_40_in_interruptDef1214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(char_literal159);



            // AST REWRITE
            // elements: roleName, 57, activityListDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 129:65: -> ^( 'interrupt' roleName activityListDef )
            {
                // src\\SavedFSM\\Monitor.g:129:68: ^( 'interrupt' roleName activityListDef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_57.nextNode(), root_1);

                adaptor.addChild(root_1, stream_roleName.nextTree());
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
    // $ANTLR end "interruptDef"

    public static class globalEscapeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "globalEscapeDef"
    // src\\SavedFSM\\Monitor.g:131:1: globalEscapeDef : doBlockDef interruptDef -> ^( GLOBAL_ESCAPE doBlockDef interruptDef ) ;
    public final MonitorParser.globalEscapeDef_return globalEscapeDef() throws RecognitionException {
        MonitorParser.globalEscapeDef_return retval = new MonitorParser.globalEscapeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MonitorParser.doBlockDef_return doBlockDef160 = null;

        MonitorParser.interruptDef_return interruptDef161 = null;


        RewriteRuleSubtreeStream stream_interruptDef=new RewriteRuleSubtreeStream(adaptor,"rule interruptDef");
        RewriteRuleSubtreeStream stream_doBlockDef=new RewriteRuleSubtreeStream(adaptor,"rule doBlockDef");
        try {
            // src\\SavedFSM\\Monitor.g:131:16: ( doBlockDef interruptDef -> ^( GLOBAL_ESCAPE doBlockDef interruptDef ) )
            // src\\SavedFSM\\Monitor.g:131:19: doBlockDef interruptDef
            {
            pushFollow(FOLLOW_doBlockDef_in_globalEscapeDef1232);
            doBlockDef160=doBlockDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_doBlockDef.add(doBlockDef160.getTree());
            pushFollow(FOLLOW_interruptDef_in_globalEscapeDef1235);
            interruptDef161=interruptDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_interruptDef.add(interruptDef161.getTree());


            // AST REWRITE
            // elements: doBlockDef, interruptDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 131:44: -> ^( GLOBAL_ESCAPE doBlockDef interruptDef )
            {
                // src\\SavedFSM\\Monitor.g:131:47: ^( GLOBAL_ESCAPE doBlockDef interruptDef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GLOBAL_ESCAPE, "GLOBAL_ESCAPE"), root_1);

                adaptor.addChild(root_1, stream_doBlockDef.nextTree());
                adaptor.addChild(root_1, stream_interruptDef.nextTree());

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
    // $ANTLR end "globalEscapeDef"

    public static class unorderedDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unorderedDef"
    // src\\SavedFSM\\Monitor.g:133:1: unorderedDef : 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}' -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ ) ;
    public final MonitorParser.unorderedDef_return unorderedDef() throws RecognitionException {
        MonitorParser.unorderedDef_return retval = new MonitorParser.unorderedDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal162=null;
        Token char_literal163=null;
        Token ANNOTATION164=null;
        Token char_literal166=null;
        MonitorParser.activityDef_return activityDef165 = null;


        Object string_literal162_tree=null;
        Object char_literal163_tree=null;
        Object ANNOTATION164_tree=null;
        Object char_literal166_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ANNOTATION=new RewriteRuleTokenStream(adaptor,"token ANNOTATION");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_activityDef=new RewriteRuleSubtreeStream(adaptor,"rule activityDef");
        try {
            // src\\SavedFSM\\Monitor.g:133:13: ( 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}' -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ ) )
            // src\\SavedFSM\\Monitor.g:133:15: 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}'
            {
            string_literal162=(Token)match(input,59,FOLLOW_59_in_unorderedDef1252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(string_literal162);

            char_literal163=(Token)match(input,39,FOLLOW_39_in_unorderedDef1254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(char_literal163);

            // src\\SavedFSM\\Monitor.g:133:31: ( ( ANNOTATION )* activityDef )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RECLABEL||(LA44_0>=ANNOTATION && LA44_0<=ID)||LA44_0==36||LA44_0==39||(LA44_0>=46 && LA44_0<=47)||(LA44_0>=49 && LA44_0<=54)||LA44_0==56||LA44_0==59) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:133:33: ( ANNOTATION )* activityDef
            	    {
            	    // src\\SavedFSM\\Monitor.g:133:33: ( ANNOTATION )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==ANNOTATION) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // src\\SavedFSM\\Monitor.g:133:35: ANNOTATION
            	    	    {
            	    	    ANNOTATION164=(Token)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_unorderedDef1260); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_ANNOTATION.add(ANNOTATION164);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_activityDef_in_unorderedDef1265);
            	    activityDef165=activityDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_activityDef.add(activityDef165.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            char_literal166=(Token)match(input,40,FOLLOW_40_in_unorderedDef1270); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_40.add(char_literal166);



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
            // 133:68: -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ )
            {
                // src\\SavedFSM\\Monitor.g:133:71: ^( PARALLEL ( ^( BRANCH activityDef ) )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARALLEL, "PARALLEL"), root_1);

                if ( !(stream_activityDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_activityDef.hasNext() ) {
                    // src\\SavedFSM\\Monitor.g:133:82: ^( BRANCH activityDef )
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
    // src\\SavedFSM\\Monitor.g:142:1: expr : term ( ( PLUS | MINUS ) term )* ;
    public final MonitorParser.expr_return expr() throws RecognitionException {
        MonitorParser.expr_return retval = new MonitorParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set168=null;
        MonitorParser.term_return term167 = null;

        MonitorParser.term_return term169 = null;


        Object set168_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:142:6: ( term ( ( PLUS | MINUS ) term )* )
            // src\\SavedFSM\\Monitor.g:142:8: term ( ( PLUS | MINUS ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_expr1295);
            term167=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term167.getTree());
            // src\\SavedFSM\\Monitor.g:142:13: ( ( PLUS | MINUS ) term )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=PLUS && LA45_0<=MINUS)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:142:15: ( PLUS | MINUS ) term
            	    {
            	    set168=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set168));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_expr1310);
            	    term169=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term169.getTree());

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
    // $ANTLR end "expr"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // src\\SavedFSM\\Monitor.g:144:1: term : factor ( ( MULT | DIV ) factor )* ;
    public final MonitorParser.term_return term() throws RecognitionException {
        MonitorParser.term_return retval = new MonitorParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set171=null;
        MonitorParser.factor_return factor170 = null;

        MonitorParser.factor_return factor172 = null;


        Object set171_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:144:6: ( factor ( ( MULT | DIV ) factor )* )
            // src\\SavedFSM\\Monitor.g:144:8: factor ( ( MULT | DIV ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term1322);
            factor170=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor170.getTree());
            // src\\SavedFSM\\Monitor.g:144:15: ( ( MULT | DIV ) factor )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=MULT && LA46_0<=DIV)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // src\\SavedFSM\\Monitor.g:144:17: ( MULT | DIV ) factor
            	    {
            	    set171=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set171));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term1336);
            	    factor172=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor172.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // src\\SavedFSM\\Monitor.g:146:1: factor : NUMBER ;
    public final MonitorParser.factor_return factor() throws RecognitionException {
        MonitorParser.factor_return retval = new MonitorParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER173=null;

        Object NUMBER173_tree=null;

        try {
            // src\\SavedFSM\\Monitor.g:146:8: ( NUMBER )
            // src\\SavedFSM\\Monitor.g:146:10: NUMBER
            {
            root_0 = (Object)adaptor.nil();

            NUMBER173=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1348); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER173_tree = (Object)adaptor.create(NUMBER173);
            adaptor.addChild(root_0, NUMBER173_tree);
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
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA3_eotS =
        "\4\uffff";
    static final String DFA3_eofS =
        "\4\uffff";
    static final String DFA3_minS =
        "\2\27\2\uffff";
    static final String DFA3_maxS =
        "\2\41\2\uffff";
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
            return "()* loopback of 38:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )*";
        }
    }
    static final String DFA18_eotS =
        "\4\uffff";
    static final String DFA18_eofS =
        "\4\uffff";
    static final String DFA18_minS =
        "\2\22\2\uffff";
    static final String DFA18_maxS =
        "\2\73\2\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA18_specialS =
        "\4\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\3\4\uffff\1\1\1\3\10\uffff\1\2\2\uffff\1\3\2\uffff\1\3\1"+
            "\2\5\uffff\2\3\1\uffff\6\3\1\uffff\1\3\2\uffff\1\3",
            "\1\3\4\uffff\1\1\1\3\10\uffff\1\2\2\uffff\1\3\2\uffff\1\3"+
            "\6\uffff\2\3\1\uffff\6\3\1\uffff\1\3\2\uffff\1\3",
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
            return "()* loopback of 67:18: ( ( ANNOTATION )* activityDef )*";
        }
    }
    static final String DFA34_eotS =
        "\13\uffff";
    static final String DFA34_eofS =
        "\1\1\12\uffff";
    static final String DFA34_minS =
        "\1\22\1\uffff\1\43\1\uffff\1\30\1\55\1\44\1\5\3\30";
    static final String DFA34_maxS =
        "\1\73\1\uffff\1\56\1\uffff\1\52\1\55\1\56\1\6\3\52";
    static final String DFA34_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\7\uffff";
    static final String DFA34_specialS =
        "\13\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\3\4\uffff\1\3\1\2\13\uffff\1\3\2\uffff\1\3\1\1\5\uffff\2"+
            "\3\1\uffff\6\3\1\uffff\1\3\2\uffff\1\3",
            "",
            "\2\3\4\uffff\1\4\2\uffff\1\3\1\1\1\3",
            "",
            "\1\5\21\uffff\1\6",
            "\1\7",
            "\1\3\10\uffff\1\1\1\3",
            "\1\10\1\11",
            "\1\5\11\uffff\1\12\7\uffff\1\6",
            "\1\5\11\uffff\1\12\7\uffff\1\6",
            "\1\5\21\uffff\1\6"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "()* loopback of 99:15: ( ( ANNOTATION )* activityDef )*";
        }
    }
 

    public static final BitSet FOLLOW_ANNOTATION_in_description226 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_importProtocolStatement_in_description233 = new BitSet(new long[]{0x0000000300800000L});
    public static final BitSet FOLLOW_importTypeStatement_in_description237 = new BitSet(new long[]{0x0000000300800000L});
    public static final BitSet FOLLOW_ANNOTATION_in_description246 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_protocolDef_in_description251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_importProtocolStatement262 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_importProtocolStatement264 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_importProtocolDef_in_importProtocolStatement266 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_importProtocolStatement270 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_importProtocolDef_in_importProtocolStatement273 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_importProtocolStatement278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_importProtocolDef287 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_importProtocolDef289 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_StringLiteral_in_importProtocolDef292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_importTypeStatement305 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_simpleName_in_importTypeStatement309 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_importTypeDef_in_importTypeStatement314 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_34_in_importTypeStatement318 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_importTypeDef_in_importTypeStatement321 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_36_in_importTypeStatement328 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_StringLiteral_in_importTypeStatement331 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_importTypeStatement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataTypeDef_in_importTypeDef347 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_importTypeDef349 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_importTypeDef355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_dataTypeDef363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleName371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_protocolDef379 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_protocolName_in_protocolDef381 = new BitSet(new long[]{0x000002C000000000L});
    public static final BitSet FOLLOW_38_in_protocolDef385 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_protocolDef387 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_parameterDefs_in_protocolDef394 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_protocolDef399 = new BitSet(new long[]{0x097EC09001840000L});
    public static final BitSet FOLLOW_protocolBlockDef_in_protocolDef401 = new BitSet(new long[]{0x0000010200800000L});
    public static final BitSet FOLLOW_ANNOTATION_in_protocolDef407 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_protocolDef_in_protocolDef412 = new BitSet(new long[]{0x0000010200800000L});
    public static final BitSet FOLLOW_40_in_protocolDef417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_protocolName439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_parameterDefs447 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_parameterDef_in_parameterDefs450 = new BitSet(new long[]{0x0000040400000000L});
    public static final BitSet FOLLOW_34_in_parameterDefs454 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_parameterDef_in_parameterDefs457 = new BitSet(new long[]{0x0000040400000000L});
    public static final BitSet FOLLOW_42_in_parameterDefs462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeReferenceDef_in_parameterDef473 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_43_in_parameterDef477 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_simpleName_in_parameterDef481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activityListDef_in_protocolBlockDef489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_blockDef500 = new BitSet(new long[]{0x097EC19001840000L});
    public static final BitSet FOLLOW_activityListDef_in_blockDef502 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_blockDef504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERTION_in_assertDef526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_in_activityListDef548 = new BitSet(new long[]{0x097EC09001840000L});
    public static final BitSet FOLLOW_activityDef_in_activityListDef553 = new BitSet(new long[]{0x097EC09001840002L});
    public static final BitSet FOLLOW_INT_in_primitivetype569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitivetype575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_introducesDef_in_activityDef588 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_interactionDef_in_activityDef592 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_inlineDef_in_activityDef596 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_runDef_in_activityDef600 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_recursionDef_in_activityDef604 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_endDef_in_activityDef608 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RECLABEL_in_activityDef612 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_activityDef616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choiceDef_in_activityDef625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directedChoiceDef_in_activityDef629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallelDef_in_activityDef633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatDef_in_activityDef637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedDef_in_activityDef641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recBlockDef_in_activityDef648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalEscapeDef_in_activityDef652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef660 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_introducesDef662 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef664 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_introducesDef668 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleDef_in_introducesDef670 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ID_in_roleDef681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_roleName692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typeReferenceDef703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeReferenceDef_in_interactionSignatureDef715 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_interactionSignatureDef718 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_valueDecl_in_interactionSignatureDef721 = new BitSet(new long[]{0x0000040401000000L});
    public static final BitSet FOLLOW_34_in_interactionSignatureDef723 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_42_in_interactionSignatureDef728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_valueDecl750 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_valueDecl752 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_primitivetype_in_valueDecl755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interactionSignatureDef_in_interactionDef772 = new BitSet(new long[]{0x0000401000000000L});
    public static final BitSet FOLLOW_36_in_interactionDef778 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_interactionDef783 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_assertDef_in_interactionDef787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_interactionDef811 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_interactionDef813 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_assertDef_in_interactionDef817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_choiceDef838 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_choiceDef842 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_choiceDef844 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_blockDef_in_choiceDef849 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_choiceDef853 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_blockDef_in_choiceDef855 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_36_in_directedChoiceDef876 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef878 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_46_in_directedChoiceDef885 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef887 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_34_in_directedChoiceDef891 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_directedChoiceDef894 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_39_in_directedChoiceDef902 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_onMessageDef_in_directedChoiceDef906 = new BitSet(new long[]{0x0000010001000000L});
    public static final BitSet FOLLOW_40_in_directedChoiceDef911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interactionSignatureDef_in_onMessageDef918 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_onMessageDef920 = new BitSet(new long[]{0x097EC09001840000L});
    public static final BitSet FOLLOW_activityList_in_onMessageDef922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_in_activityList935 = new BitSet(new long[]{0x097EC09001840000L});
    public static final BitSet FOLLOW_activityDef_in_activityList940 = new BitSet(new long[]{0x097EC09001840002L});
    public static final BitSet FOLLOW_49_in_repeatDef950 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_repeatDef954 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_repeatDef956 = new BitSet(new long[]{0x000000C400000000L});
    public static final BitSet FOLLOW_34_in_repeatDef960 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_repeatDef962 = new BitSet(new long[]{0x000000C400000000L});
    public static final BitSet FOLLOW_blockDef_in_repeatDef970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_recBlockDef986 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_labelName_in_recBlockDef988 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_blockDef_in_recBlockDef990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_labelName1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelName_in_recursionDef1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_endDef1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_runDef1045 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_protocolRefDef_in_runDef1048 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_41_in_runDef1052 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parameter_in_runDef1055 = new BitSet(new long[]{0x0000040400000000L});
    public static final BitSet FOLLOW_34_in_runDef1059 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parameter_in_runDef1062 = new BitSet(new long[]{0x0000040400000000L});
    public static final BitSet FOLLOW_42_in_runDef1067 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_runDef1073 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_runDef1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_protocolRefDef1083 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_protocolRefDef1087 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_protocolRefDef1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarationName1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationName_in_parameter1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_inlineDef1117 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_protocolRefDef_in_inlineDef1120 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_inlineDef1124 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parameter_in_inlineDef1127 = new BitSet(new long[]{0x0000040400000000L});
    public static final BitSet FOLLOW_34_in_inlineDef1131 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_parameter_in_inlineDef1134 = new BitSet(new long[]{0x0000040400000000L});
    public static final BitSet FOLLOW_42_in_inlineDef1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_parallelDef1151 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_blockDef_in_parallelDef1153 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_parallelDef1157 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_blockDef_in_parallelDef1159 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_56_in_doBlockDef1179 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_doBlockDef1181 = new BitSet(new long[]{0x097EC19001840000L});
    public static final BitSet FOLLOW_activityListDef_in_doBlockDef1183 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_doBlockDef1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_interruptDef1204 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_interruptDef1206 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_roleName_in_interruptDef1208 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_interruptDef1210 = new BitSet(new long[]{0x097EC19001840000L});
    public static final BitSet FOLLOW_activityListDef_in_interruptDef1212 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_interruptDef1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doBlockDef_in_globalEscapeDef1232 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_interruptDef_in_globalEscapeDef1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_unorderedDef1252 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_unorderedDef1254 = new BitSet(new long[]{0x097EC19001840000L});
    public static final BitSet FOLLOW_ANNOTATION_in_unorderedDef1260 = new BitSet(new long[]{0x097EC09001840000L});
    public static final BitSet FOLLOW_activityDef_in_unorderedDef1265 = new BitSet(new long[]{0x097EC19001840000L});
    public static final BitSet FOLLOW_40_in_unorderedDef1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr1295 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_set_in_expr1299 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_term_in_expr1310 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_factor_in_term1322 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_set_in_term1326 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_factor_in_term1336 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_NUMBER_in_factor1348 = new BitSet(new long[]{0x0000000000000002L});

}