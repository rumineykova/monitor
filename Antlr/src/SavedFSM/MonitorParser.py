# $ANTLR 3.1.3 Mar 18, 2009 10:09:25 src\\SavedFSM\\Monitor.g 2012-01-20 10:24:52

import sys
from antlr3 import *
from antlr3.compat import set, frozenset

from antlr3.tree import *



# for convenience in actions
HIDDEN = BaseRecognizer.HIDDEN

# token types
RESV=12
ANNOTATION=23
ASSERTION=26
PARALLEL=19
ID=24
EOF=-1
PROTOCOL=20
TYPE=14
T__55=55
ML_COMMENT=30
T__56=56
INTERACTION=4
T__57=57
T__58=58
T__51=51
T__52=52
T__53=53
T__54=54
T__59=59
FULLSTOP=11
PLUS=7
SEND=13
DIGIT=28
T__50=50
T__42=42
T__43=43
T__40=40
T__41=41
T__46=46
T__47=47
T__44=44
T__45=45
LINE_COMMENT=31
T__48=48
T__49=49
RECLABEL=18
NUMBER=27
WHITESPACE=29
INT=5
MINUS=8
MULT=9
VALUE=15
ASSERT=21
UNORDERED=17
StringLiteral=25
T__32=32
T__33=33
GLOBAL_ESCAPE=22
T__34=34
T__35=35
T__36=36
T__37=37
T__38=38
T__39=39
BRANCH=16
DIV=10
STRING=6

# token names
tokenNames = [
    "<invalid>", "<EOR>", "<DOWN>", "<UP>", 
    "INTERACTION", "INT", "STRING", "PLUS", "MINUS", "MULT", "DIV", "FULLSTOP", 
    "RESV", "SEND", "TYPE", "VALUE", "BRANCH", "UNORDERED", "RECLABEL", 
    "PARALLEL", "PROTOCOL", "ASSERT", "GLOBAL_ESCAPE", "ANNOTATION", "ID", 
    "StringLiteral", "ASSERTION", "NUMBER", "DIGIT", "WHITESPACE", "ML_COMMENT", 
    "LINE_COMMENT", "'import'", "'protocol'", "','", "';'", "'from'", "'as'", 
    "'at'", "'{'", "'}'", "'('", "')'", "'role'", "'introduces'", "':'", 
    "'to'", "'choice'", "'or'", "'repeat'", "'rec'", "'end'", "'run'", "'inline'", 
    "'parallel'", "'and'", "'do'", "'interrupt'", "'by'", "'unordered'"
]




class MonitorParser(Parser):
    grammarFileName = "src\\SavedFSM\\Monitor.g"
    antlr_version = version_str_to_tuple("3.1.3 Mar 18, 2009 10:09:25")
    antlr_version_str = "3.1.3 Mar 18, 2009 10:09:25"
    tokenNames = tokenNames

    def __init__(self, input, state=None, *args, **kwargs):
        if state is None:
            state = RecognizerSharedState()

        super(MonitorParser, self).__init__(input, state, *args, **kwargs)

        self.dfa3 = self.DFA3(
            self, 3,
            eot = self.DFA3_eot,
            eof = self.DFA3_eof,
            min = self.DFA3_min,
            max = self.DFA3_max,
            accept = self.DFA3_accept,
            special = self.DFA3_special,
            transition = self.DFA3_transition
            )

        self.dfa18 = self.DFA18(
            self, 18,
            eot = self.DFA18_eot,
            eof = self.DFA18_eof,
            min = self.DFA18_min,
            max = self.DFA18_max,
            accept = self.DFA18_accept,
            special = self.DFA18_special,
            transition = self.DFA18_transition
            )

        self.dfa34 = self.DFA34(
            self, 34,
            eot = self.DFA34_eot,
            eof = self.DFA34_eof,
            min = self.DFA34_min,
            max = self.DFA34_max,
            accept = self.DFA34_accept,
            special = self.DFA34_special,
            transition = self.DFA34_transition
            )






        self._adaptor = None
        self.adaptor = CommonTreeAdaptor()
                


        
    def getTreeAdaptor(self):
        return self._adaptor

    def setTreeAdaptor(self, adaptor):
        self._adaptor = adaptor

    adaptor = property(getTreeAdaptor, setTreeAdaptor)


    class description_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.description_return, self).__init__()

            self.tree = None




    # $ANTLR start "description"
    # src\\SavedFSM\\Monitor.g:38:1: description : ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef ;
    def description(self, ):

        retval = self.description_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ANNOTATION1 = None
        ANNOTATION4 = None
        importProtocolStatement2 = None

        importTypeStatement3 = None

        protocolDef5 = None


        ANNOTATION1_tree = None
        ANNOTATION4_tree = None
        stream_ANNOTATION = RewriteRuleTokenStream(self._adaptor, "token ANNOTATION")
        stream_importTypeStatement = RewriteRuleSubtreeStream(self._adaptor, "rule importTypeStatement")
        stream_protocolDef = RewriteRuleSubtreeStream(self._adaptor, "rule protocolDef")
        stream_importProtocolStatement = RewriteRuleSubtreeStream(self._adaptor, "rule importProtocolStatement")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:38:12: ( ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef )
                # src\\SavedFSM\\Monitor.g:38:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef
                pass 
                # src\\SavedFSM\\Monitor.g:38:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )*
                while True: #loop3
                    alt3 = 2
                    alt3 = self.dfa3.predict(self.input)
                    if alt3 == 1:
                        # src\\SavedFSM\\Monitor.g:38:16: ( ANNOTATION )* ( importProtocolStatement | importTypeStatement )
                        pass 
                        # src\\SavedFSM\\Monitor.g:38:16: ( ANNOTATION )*
                        while True: #loop1
                            alt1 = 2
                            LA1_0 = self.input.LA(1)

                            if (LA1_0 == ANNOTATION) :
                                alt1 = 1


                            if alt1 == 1:
                                # src\\SavedFSM\\Monitor.g:38:18: ANNOTATION
                                pass 
                                ANNOTATION1=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_description226) 
                                if self._state.backtracking == 0:
                                    stream_ANNOTATION.add(ANNOTATION1)


                            else:
                                break #loop1
                        # src\\SavedFSM\\Monitor.g:38:32: ( importProtocolStatement | importTypeStatement )
                        alt2 = 2
                        LA2_0 = self.input.LA(1)

                        if (LA2_0 == 32) :
                            LA2_1 = self.input.LA(2)

                            if (LA2_1 == 33) :
                                alt2 = 1
                            elif ((ID <= LA2_1 <= StringLiteral)) :
                                alt2 = 2
                            else:
                                if self._state.backtracking > 0:
                                    raise BacktrackingFailed

                                nvae = NoViableAltException("", 2, 1, self.input)

                                raise nvae

                        else:
                            if self._state.backtracking > 0:
                                raise BacktrackingFailed

                            nvae = NoViableAltException("", 2, 0, self.input)

                            raise nvae

                        if alt2 == 1:
                            # src\\SavedFSM\\Monitor.g:38:34: importProtocolStatement
                            pass 
                            self._state.following.append(self.FOLLOW_importProtocolStatement_in_description233)
                            importProtocolStatement2 = self.importProtocolStatement()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_importProtocolStatement.add(importProtocolStatement2.tree)


                        elif alt2 == 2:
                            # src\\SavedFSM\\Monitor.g:38:60: importTypeStatement
                            pass 
                            self._state.following.append(self.FOLLOW_importTypeStatement_in_description237)
                            importTypeStatement3 = self.importTypeStatement()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_importTypeStatement.add(importTypeStatement3.tree)





                    else:
                        break #loop3
                # src\\SavedFSM\\Monitor.g:38:85: ( ANNOTATION )*
                while True: #loop4
                    alt4 = 2
                    LA4_0 = self.input.LA(1)

                    if (LA4_0 == ANNOTATION) :
                        alt4 = 1


                    if alt4 == 1:
                        # src\\SavedFSM\\Monitor.g:38:87: ANNOTATION
                        pass 
                        ANNOTATION4=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_description246) 
                        if self._state.backtracking == 0:
                            stream_ANNOTATION.add(ANNOTATION4)


                    else:
                        break #loop4
                self._state.following.append(self.FOLLOW_protocolDef_in_description251)
                protocolDef5 = self.protocolDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_protocolDef.add(protocolDef5.tree)

                # AST Rewrite
                # elements: protocolDef
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 38:113: -> protocolDef
                    self._adaptor.addChild(root_0, stream_protocolDef.nextTree())



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "description"

    class importProtocolStatement_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.importProtocolStatement_return, self).__init__()

            self.tree = None




    # $ANTLR start "importProtocolStatement"
    # src\\SavedFSM\\Monitor.g:40:1: importProtocolStatement : 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' ;
    def importProtocolStatement(self, ):

        retval = self.importProtocolStatement_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal6 = None
        string_literal7 = None
        char_literal9 = None
        char_literal11 = None
        importProtocolDef8 = None

        importProtocolDef10 = None


        string_literal6_tree = None
        string_literal7_tree = None
        char_literal9_tree = None
        char_literal11_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:40:24: ( 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' )
                # src\\SavedFSM\\Monitor.g:40:26: 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';'
                pass 
                root_0 = self._adaptor.nil()

                string_literal6=self.match(self.input, 32, self.FOLLOW_32_in_importProtocolStatement262)
                if self._state.backtracking == 0:

                    string_literal6_tree = self._adaptor.createWithPayload(string_literal6)
                    self._adaptor.addChild(root_0, string_literal6_tree)

                string_literal7=self.match(self.input, 33, self.FOLLOW_33_in_importProtocolStatement264)
                if self._state.backtracking == 0:

                    string_literal7_tree = self._adaptor.createWithPayload(string_literal7)
                    self._adaptor.addChild(root_0, string_literal7_tree)

                self._state.following.append(self.FOLLOW_importProtocolDef_in_importProtocolStatement266)
                importProtocolDef8 = self.importProtocolDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, importProtocolDef8.tree)
                # src\\SavedFSM\\Monitor.g:40:64: ( ',' importProtocolDef )*
                while True: #loop5
                    alt5 = 2
                    LA5_0 = self.input.LA(1)

                    if (LA5_0 == 34) :
                        alt5 = 1


                    if alt5 == 1:
                        # src\\SavedFSM\\Monitor.g:40:66: ',' importProtocolDef
                        pass 
                        char_literal9=self.match(self.input, 34, self.FOLLOW_34_in_importProtocolStatement270)
                        self._state.following.append(self.FOLLOW_importProtocolDef_in_importProtocolStatement273)
                        importProtocolDef10 = self.importProtocolDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, importProtocolDef10.tree)


                    else:
                        break #loop5
                char_literal11=self.match(self.input, 35, self.FOLLOW_35_in_importProtocolStatement278)



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "importProtocolStatement"

    class importProtocolDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.importProtocolDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "importProtocolDef"
    # src\\SavedFSM\\Monitor.g:42:1: importProtocolDef : ID 'from' StringLiteral ;
    def importProtocolDef(self, ):

        retval = self.importProtocolDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID12 = None
        string_literal13 = None
        StringLiteral14 = None

        ID12_tree = None
        string_literal13_tree = None
        StringLiteral14_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:42:18: ( ID 'from' StringLiteral )
                # src\\SavedFSM\\Monitor.g:42:20: ID 'from' StringLiteral
                pass 
                root_0 = self._adaptor.nil()

                ID12=self.match(self.input, ID, self.FOLLOW_ID_in_importProtocolDef287)
                if self._state.backtracking == 0:

                    ID12_tree = self._adaptor.createWithPayload(ID12)
                    self._adaptor.addChild(root_0, ID12_tree)

                string_literal13=self.match(self.input, 36, self.FOLLOW_36_in_importProtocolDef289)
                StringLiteral14=self.match(self.input, StringLiteral, self.FOLLOW_StringLiteral_in_importProtocolDef292)
                if self._state.backtracking == 0:

                    StringLiteral14_tree = self._adaptor.createWithPayload(StringLiteral14)
                    self._adaptor.addChild(root_0, StringLiteral14_tree)




                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "importProtocolDef"

    class importTypeStatement_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.importTypeStatement_return, self).__init__()

            self.tree = None




    # $ANTLR start "importTypeStatement"
    # src\\SavedFSM\\Monitor.g:44:1: importTypeStatement : 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' ;
    def importTypeStatement(self, ):

        retval = self.importTypeStatement_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal15 = None
        char_literal18 = None
        string_literal20 = None
        StringLiteral21 = None
        char_literal22 = None
        simpleName16 = None

        importTypeDef17 = None

        importTypeDef19 = None


        string_literal15_tree = None
        char_literal18_tree = None
        string_literal20_tree = None
        StringLiteral21_tree = None
        char_literal22_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:44:20: ( 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' )
                # src\\SavedFSM\\Monitor.g:44:22: 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';'
                pass 
                root_0 = self._adaptor.nil()

                string_literal15=self.match(self.input, 32, self.FOLLOW_32_in_importTypeStatement305)
                if self._state.backtracking == 0:

                    string_literal15_tree = self._adaptor.createWithPayload(string_literal15)
                    self._adaptor.addChild(root_0, string_literal15_tree)

                # src\\SavedFSM\\Monitor.g:44:31: ( simpleName )?
                alt6 = 2
                LA6_0 = self.input.LA(1)

                if (LA6_0 == ID) :
                    LA6_1 = self.input.LA(2)

                    if ((ID <= LA6_1 <= StringLiteral)) :
                        alt6 = 1
                if alt6 == 1:
                    # src\\SavedFSM\\Monitor.g:44:33: simpleName
                    pass 
                    self._state.following.append(self.FOLLOW_simpleName_in_importTypeStatement309)
                    simpleName16 = self.simpleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, simpleName16.tree)



                self._state.following.append(self.FOLLOW_importTypeDef_in_importTypeStatement314)
                importTypeDef17 = self.importTypeDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, importTypeDef17.tree)
                # src\\SavedFSM\\Monitor.g:44:61: ( ',' importTypeDef )*
                while True: #loop7
                    alt7 = 2
                    LA7_0 = self.input.LA(1)

                    if (LA7_0 == 34) :
                        alt7 = 1


                    if alt7 == 1:
                        # src\\SavedFSM\\Monitor.g:44:63: ',' importTypeDef
                        pass 
                        char_literal18=self.match(self.input, 34, self.FOLLOW_34_in_importTypeStatement318)
                        self._state.following.append(self.FOLLOW_importTypeDef_in_importTypeStatement321)
                        importTypeDef19 = self.importTypeDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, importTypeDef19.tree)


                    else:
                        break #loop7
                # src\\SavedFSM\\Monitor.g:44:85: ( 'from' StringLiteral )?
                alt8 = 2
                LA8_0 = self.input.LA(1)

                if (LA8_0 == 36) :
                    alt8 = 1
                if alt8 == 1:
                    # src\\SavedFSM\\Monitor.g:44:87: 'from' StringLiteral
                    pass 
                    string_literal20=self.match(self.input, 36, self.FOLLOW_36_in_importTypeStatement328)
                    StringLiteral21=self.match(self.input, StringLiteral, self.FOLLOW_StringLiteral_in_importTypeStatement331)
                    if self._state.backtracking == 0:

                        StringLiteral21_tree = self._adaptor.createWithPayload(StringLiteral21)
                        self._adaptor.addChild(root_0, StringLiteral21_tree)




                char_literal22=self.match(self.input, 35, self.FOLLOW_35_in_importTypeStatement336)



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "importTypeStatement"

    class importTypeDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.importTypeDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "importTypeDef"
    # src\\SavedFSM\\Monitor.g:46:1: importTypeDef : ( dataTypeDef 'as' )? ID ;
    def importTypeDef(self, ):

        retval = self.importTypeDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal24 = None
        ID25 = None
        dataTypeDef23 = None


        string_literal24_tree = None
        ID25_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:46:14: ( ( dataTypeDef 'as' )? ID )
                # src\\SavedFSM\\Monitor.g:46:16: ( dataTypeDef 'as' )? ID
                pass 
                root_0 = self._adaptor.nil()

                # src\\SavedFSM\\Monitor.g:46:16: ( dataTypeDef 'as' )?
                alt9 = 2
                LA9_0 = self.input.LA(1)

                if (LA9_0 == StringLiteral) :
                    alt9 = 1
                if alt9 == 1:
                    # src\\SavedFSM\\Monitor.g:46:18: dataTypeDef 'as'
                    pass 
                    self._state.following.append(self.FOLLOW_dataTypeDef_in_importTypeDef347)
                    dataTypeDef23 = self.dataTypeDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, dataTypeDef23.tree)
                    string_literal24=self.match(self.input, 37, self.FOLLOW_37_in_importTypeDef349)



                ID25=self.match(self.input, ID, self.FOLLOW_ID_in_importTypeDef355)
                if self._state.backtracking == 0:

                    ID25_tree = self._adaptor.createWithPayload(ID25)
                    self._adaptor.addChild(root_0, ID25_tree)




                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "importTypeDef"

    class dataTypeDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.dataTypeDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "dataTypeDef"
    # src\\SavedFSM\\Monitor.g:48:1: dataTypeDef : StringLiteral ;
    def dataTypeDef(self, ):

        retval = self.dataTypeDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        StringLiteral26 = None

        StringLiteral26_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:48:12: ( StringLiteral )
                # src\\SavedFSM\\Monitor.g:48:14: StringLiteral
                pass 
                root_0 = self._adaptor.nil()

                StringLiteral26=self.match(self.input, StringLiteral, self.FOLLOW_StringLiteral_in_dataTypeDef363)
                if self._state.backtracking == 0:

                    StringLiteral26_tree = self._adaptor.createWithPayload(StringLiteral26)
                    self._adaptor.addChild(root_0, StringLiteral26_tree)




                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "dataTypeDef"

    class simpleName_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.simpleName_return, self).__init__()

            self.tree = None




    # $ANTLR start "simpleName"
    # src\\SavedFSM\\Monitor.g:50:1: simpleName : ID ;
    def simpleName(self, ):

        retval = self.simpleName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID27 = None

        ID27_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:50:11: ( ID )
                # src\\SavedFSM\\Monitor.g:50:13: ID
                pass 
                root_0 = self._adaptor.nil()

                ID27=self.match(self.input, ID, self.FOLLOW_ID_in_simpleName371)
                if self._state.backtracking == 0:

                    ID27_tree = self._adaptor.createWithPayload(ID27)
                    self._adaptor.addChild(root_0, ID27_tree)




                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "simpleName"

    class protocolDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.protocolDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "protocolDef"
    # src\\SavedFSM\\Monitor.g:52:1: protocolDef : 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( PROTOCOL ( protocolBlockDef )+ ) ;
    def protocolDef(self, ):

        retval = self.protocolDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal28 = None
        string_literal30 = None
        char_literal33 = None
        ANNOTATION35 = None
        char_literal37 = None
        protocolName29 = None

        roleName31 = None

        parameterDefs32 = None

        protocolBlockDef34 = None

        protocolDef36 = None


        string_literal28_tree = None
        string_literal30_tree = None
        char_literal33_tree = None
        ANNOTATION35_tree = None
        char_literal37_tree = None
        stream_40 = RewriteRuleTokenStream(self._adaptor, "token 40")
        stream_33 = RewriteRuleTokenStream(self._adaptor, "token 33")
        stream_ANNOTATION = RewriteRuleTokenStream(self._adaptor, "token ANNOTATION")
        stream_39 = RewriteRuleTokenStream(self._adaptor, "token 39")
        stream_38 = RewriteRuleTokenStream(self._adaptor, "token 38")
        stream_parameterDefs = RewriteRuleSubtreeStream(self._adaptor, "rule parameterDefs")
        stream_protocolDef = RewriteRuleSubtreeStream(self._adaptor, "rule protocolDef")
        stream_protocolName = RewriteRuleSubtreeStream(self._adaptor, "rule protocolName")
        stream_protocolBlockDef = RewriteRuleSubtreeStream(self._adaptor, "rule protocolBlockDef")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:52:12: ( 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( PROTOCOL ( protocolBlockDef )+ ) )
                # src\\SavedFSM\\Monitor.g:52:14: 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}'
                pass 
                string_literal28=self.match(self.input, 33, self.FOLLOW_33_in_protocolDef379) 
                if self._state.backtracking == 0:
                    stream_33.add(string_literal28)
                self._state.following.append(self.FOLLOW_protocolName_in_protocolDef381)
                protocolName29 = self.protocolName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_protocolName.add(protocolName29.tree)
                # src\\SavedFSM\\Monitor.g:52:38: ( 'at' roleName )?
                alt10 = 2
                LA10_0 = self.input.LA(1)

                if (LA10_0 == 38) :
                    alt10 = 1
                if alt10 == 1:
                    # src\\SavedFSM\\Monitor.g:52:40: 'at' roleName
                    pass 
                    string_literal30=self.match(self.input, 38, self.FOLLOW_38_in_protocolDef385) 
                    if self._state.backtracking == 0:
                        stream_38.add(string_literal30)
                    self._state.following.append(self.FOLLOW_roleName_in_protocolDef387)
                    roleName31 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_roleName.add(roleName31.tree)



                # src\\SavedFSM\\Monitor.g:52:57: ( parameterDefs )?
                alt11 = 2
                LA11_0 = self.input.LA(1)

                if (LA11_0 == 41) :
                    alt11 = 1
                if alt11 == 1:
                    # src\\SavedFSM\\Monitor.g:52:59: parameterDefs
                    pass 
                    self._state.following.append(self.FOLLOW_parameterDefs_in_protocolDef394)
                    parameterDefs32 = self.parameterDefs()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_parameterDefs.add(parameterDefs32.tree)



                char_literal33=self.match(self.input, 39, self.FOLLOW_39_in_protocolDef399) 
                if self._state.backtracking == 0:
                    stream_39.add(char_literal33)
                self._state.following.append(self.FOLLOW_protocolBlockDef_in_protocolDef401)
                protocolBlockDef34 = self.protocolBlockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_protocolBlockDef.add(protocolBlockDef34.tree)
                # src\\SavedFSM\\Monitor.g:52:97: ( ( ANNOTATION )* protocolDef )*
                while True: #loop13
                    alt13 = 2
                    LA13_0 = self.input.LA(1)

                    if (LA13_0 == ANNOTATION or LA13_0 == 33) :
                        alt13 = 1


                    if alt13 == 1:
                        # src\\SavedFSM\\Monitor.g:52:99: ( ANNOTATION )* protocolDef
                        pass 
                        # src\\SavedFSM\\Monitor.g:52:99: ( ANNOTATION )*
                        while True: #loop12
                            alt12 = 2
                            LA12_0 = self.input.LA(1)

                            if (LA12_0 == ANNOTATION) :
                                alt12 = 1


                            if alt12 == 1:
                                # src\\SavedFSM\\Monitor.g:52:101: ANNOTATION
                                pass 
                                ANNOTATION35=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_protocolDef407) 
                                if self._state.backtracking == 0:
                                    stream_ANNOTATION.add(ANNOTATION35)


                            else:
                                break #loop12
                        self._state.following.append(self.FOLLOW_protocolDef_in_protocolDef412)
                        protocolDef36 = self.protocolDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            stream_protocolDef.add(protocolDef36.tree)


                    else:
                        break #loop13
                char_literal37=self.match(self.input, 40, self.FOLLOW_40_in_protocolDef417) 
                if self._state.backtracking == 0:
                    stream_40.add(char_literal37)

                # AST Rewrite
                # elements: protocolBlockDef
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 53:7: -> ^( PROTOCOL ( protocolBlockDef )+ )
                    # src\\SavedFSM\\Monitor.g:53:10: ^( PROTOCOL ( protocolBlockDef )+ )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(PROTOCOL, "PROTOCOL"), root_1)

                    # src\\SavedFSM\\Monitor.g:53:21: ( protocolBlockDef )+
                    if not (stream_protocolBlockDef.hasNext()):
                        raise RewriteEarlyExitException()

                    while stream_protocolBlockDef.hasNext():
                        self._adaptor.addChild(root_1, stream_protocolBlockDef.nextTree())


                    stream_protocolBlockDef.reset()

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "protocolDef"

    class protocolName_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.protocolName_return, self).__init__()

            self.tree = None




    # $ANTLR start "protocolName"
    # src\\SavedFSM\\Monitor.g:55:1: protocolName : ID ;
    def protocolName(self, ):

        retval = self.protocolName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID38 = None

        ID38_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:55:13: ( ID )
                # src\\SavedFSM\\Monitor.g:55:15: ID
                pass 
                root_0 = self._adaptor.nil()

                ID38=self.match(self.input, ID, self.FOLLOW_ID_in_protocolName439)
                if self._state.backtracking == 0:

                    ID38_tree = self._adaptor.createWithPayload(ID38)
                    self._adaptor.addChild(root_0, ID38_tree)




                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "protocolName"

    class parameterDefs_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.parameterDefs_return, self).__init__()

            self.tree = None




    # $ANTLR start "parameterDefs"
    # src\\SavedFSM\\Monitor.g:57:1: parameterDefs : '(' parameterDef ( ',' parameterDef )* ')' ;
    def parameterDefs(self, ):

        retval = self.parameterDefs_return()
        retval.start = self.input.LT(1)

        root_0 = None

        char_literal39 = None
        char_literal41 = None
        char_literal43 = None
        parameterDef40 = None

        parameterDef42 = None


        char_literal39_tree = None
        char_literal41_tree = None
        char_literal43_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:57:14: ( '(' parameterDef ( ',' parameterDef )* ')' )
                # src\\SavedFSM\\Monitor.g:57:16: '(' parameterDef ( ',' parameterDef )* ')'
                pass 
                root_0 = self._adaptor.nil()

                char_literal39=self.match(self.input, 41, self.FOLLOW_41_in_parameterDefs447)
                self._state.following.append(self.FOLLOW_parameterDef_in_parameterDefs450)
                parameterDef40 = self.parameterDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, parameterDef40.tree)
                # src\\SavedFSM\\Monitor.g:57:34: ( ',' parameterDef )*
                while True: #loop14
                    alt14 = 2
                    LA14_0 = self.input.LA(1)

                    if (LA14_0 == 34) :
                        alt14 = 1


                    if alt14 == 1:
                        # src\\SavedFSM\\Monitor.g:57:36: ',' parameterDef
                        pass 
                        char_literal41=self.match(self.input, 34, self.FOLLOW_34_in_parameterDefs454)
                        self._state.following.append(self.FOLLOW_parameterDef_in_parameterDefs457)
                        parameterDef42 = self.parameterDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, parameterDef42.tree)


                    else:
                        break #loop14
                char_literal43=self.match(self.input, 42, self.FOLLOW_42_in_parameterDefs462)



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "parameterDefs"

    class parameterDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.parameterDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "parameterDef"
    # src\\SavedFSM\\Monitor.g:59:1: parameterDef : ( typeReferenceDef | 'role' ) simpleName ;
    def parameterDef(self, ):

        retval = self.parameterDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal45 = None
        typeReferenceDef44 = None

        simpleName46 = None


        string_literal45_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:59:13: ( ( typeReferenceDef | 'role' ) simpleName )
                # src\\SavedFSM\\Monitor.g:59:15: ( typeReferenceDef | 'role' ) simpleName
                pass 
                root_0 = self._adaptor.nil()

                # src\\SavedFSM\\Monitor.g:59:15: ( typeReferenceDef | 'role' )
                alt15 = 2
                LA15_0 = self.input.LA(1)

                if (LA15_0 == ID) :
                    alt15 = 1
                elif (LA15_0 == 43) :
                    alt15 = 2
                else:
                    if self._state.backtracking > 0:
                        raise BacktrackingFailed

                    nvae = NoViableAltException("", 15, 0, self.input)

                    raise nvae

                if alt15 == 1:
                    # src\\SavedFSM\\Monitor.g:59:17: typeReferenceDef
                    pass 
                    self._state.following.append(self.FOLLOW_typeReferenceDef_in_parameterDef473)
                    typeReferenceDef44 = self.typeReferenceDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, typeReferenceDef44.tree)


                elif alt15 == 2:
                    # src\\SavedFSM\\Monitor.g:59:36: 'role'
                    pass 
                    string_literal45=self.match(self.input, 43, self.FOLLOW_43_in_parameterDef477)
                    if self._state.backtracking == 0:

                        string_literal45_tree = self._adaptor.createWithPayload(string_literal45)
                        self._adaptor.addChild(root_0, string_literal45_tree)




                self._state.following.append(self.FOLLOW_simpleName_in_parameterDef481)
                simpleName46 = self.simpleName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, simpleName46.tree)



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "parameterDef"

    class protocolBlockDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.protocolBlockDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "protocolBlockDef"
    # src\\SavedFSM\\Monitor.g:61:1: protocolBlockDef : activityListDef -> activityListDef ;
    def protocolBlockDef(self, ):

        retval = self.protocolBlockDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        activityListDef47 = None


        stream_activityListDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityListDef")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:61:17: ( activityListDef -> activityListDef )
                # src\\SavedFSM\\Monitor.g:61:19: activityListDef
                pass 
                self._state.following.append(self.FOLLOW_activityListDef_in_protocolBlockDef489)
                activityListDef47 = self.activityListDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_activityListDef.add(activityListDef47.tree)

                # AST Rewrite
                # elements: activityListDef
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 61:35: -> activityListDef
                    self._adaptor.addChild(root_0, stream_activityListDef.nextTree())



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "protocolBlockDef"

    class blockDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.blockDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "blockDef"
    # src\\SavedFSM\\Monitor.g:63:1: blockDef : '{' activityListDef '}' -> ^( BRANCH activityListDef ) ;
    def blockDef(self, ):

        retval = self.blockDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        char_literal48 = None
        char_literal50 = None
        activityListDef49 = None


        char_literal48_tree = None
        char_literal50_tree = None
        stream_40 = RewriteRuleTokenStream(self._adaptor, "token 40")
        stream_39 = RewriteRuleTokenStream(self._adaptor, "token 39")
        stream_activityListDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityListDef")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:63:9: ( '{' activityListDef '}' -> ^( BRANCH activityListDef ) )
                # src\\SavedFSM\\Monitor.g:63:11: '{' activityListDef '}'
                pass 
                char_literal48=self.match(self.input, 39, self.FOLLOW_39_in_blockDef500) 
                if self._state.backtracking == 0:
                    stream_39.add(char_literal48)
                self._state.following.append(self.FOLLOW_activityListDef_in_blockDef502)
                activityListDef49 = self.activityListDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_activityListDef.add(activityListDef49.tree)
                char_literal50=self.match(self.input, 40, self.FOLLOW_40_in_blockDef504) 
                if self._state.backtracking == 0:
                    stream_40.add(char_literal50)

                # AST Rewrite
                # elements: activityListDef
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 63:35: -> ^( BRANCH activityListDef )
                    # src\\SavedFSM\\Monitor.g:63:38: ^( BRANCH activityListDef )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(BRANCH, "BRANCH"), root_1)

                    self._adaptor.addChild(root_1, stream_activityListDef.nextTree())

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "blockDef"

    class assertDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.assertDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "assertDef"
    # src\\SavedFSM\\Monitor.g:65:1: assertDef : ( ASSERTION )? -> ^( ASSERT ( ASSERTION )? ) ;
    def assertDef(self, ):

        retval = self.assertDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ASSERTION51 = None

        ASSERTION51_tree = None
        stream_ASSERTION = RewriteRuleTokenStream(self._adaptor, "token ASSERTION")

        try:
            try:
                # src\\SavedFSM\\Monitor.g:65:11: ( ( ASSERTION )? -> ^( ASSERT ( ASSERTION )? ) )
                # src\\SavedFSM\\Monitor.g:65:13: ( ASSERTION )?
                pass 
                # src\\SavedFSM\\Monitor.g:65:13: ( ASSERTION )?
                alt16 = 2
                LA16_0 = self.input.LA(1)

                if (LA16_0 == ASSERTION) :
                    alt16 = 1
                if alt16 == 1:
                    # src\\SavedFSM\\Monitor.g:65:14: ASSERTION
                    pass 
                    ASSERTION51=self.match(self.input, ASSERTION, self.FOLLOW_ASSERTION_in_assertDef526) 
                    if self._state.backtracking == 0:
                        stream_ASSERTION.add(ASSERTION51)




                # AST Rewrite
                # elements: ASSERTION
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 65:26: -> ^( ASSERT ( ASSERTION )? )
                    # src\\SavedFSM\\Monitor.g:65:29: ^( ASSERT ( ASSERTION )? )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(ASSERT, "ASSERT"), root_1)

                    # src\\SavedFSM\\Monitor.g:65:38: ( ASSERTION )?
                    if stream_ASSERTION.hasNext():
                        self._adaptor.addChild(root_1, stream_ASSERTION.nextNode())


                    stream_ASSERTION.reset();

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "assertDef"

    class activityListDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.activityListDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "activityListDef"
    # src\\SavedFSM\\Monitor.g:67:1: activityListDef : ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ ;
    def activityListDef(self, ):

        retval = self.activityListDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ANNOTATION52 = None
        activityDef53 = None


        ANNOTATION52_tree = None
        stream_ANNOTATION = RewriteRuleTokenStream(self._adaptor, "token ANNOTATION")
        stream_activityDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityDef")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:67:16: ( ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ )
                # src\\SavedFSM\\Monitor.g:67:18: ( ( ANNOTATION )* activityDef )*
                pass 
                # src\\SavedFSM\\Monitor.g:67:18: ( ( ANNOTATION )* activityDef )*
                while True: #loop18
                    alt18 = 2
                    alt18 = self.dfa18.predict(self.input)
                    if alt18 == 1:
                        # src\\SavedFSM\\Monitor.g:67:20: ( ANNOTATION )* activityDef
                        pass 
                        # src\\SavedFSM\\Monitor.g:67:20: ( ANNOTATION )*
                        while True: #loop17
                            alt17 = 2
                            LA17_0 = self.input.LA(1)

                            if (LA17_0 == ANNOTATION) :
                                alt17 = 1


                            if alt17 == 1:
                                # src\\SavedFSM\\Monitor.g:67:22: ANNOTATION
                                pass 
                                ANNOTATION52=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_activityListDef548) 
                                if self._state.backtracking == 0:
                                    stream_ANNOTATION.add(ANNOTATION52)


                            else:
                                break #loop17
                        self._state.following.append(self.FOLLOW_activityDef_in_activityListDef553)
                        activityDef53 = self.activityDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            stream_activityDef.add(activityDef53.tree)


                    else:
                        break #loop18

                # AST Rewrite
                # elements: activityDef
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 67:51: -> ( activityDef )+
                    # src\\SavedFSM\\Monitor.g:67:54: ( activityDef )+
                    if not (stream_activityDef.hasNext()):
                        raise RewriteEarlyExitException()

                    while stream_activityDef.hasNext():
                        self._adaptor.addChild(root_0, stream_activityDef.nextTree())


                    stream_activityDef.reset()



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "activityListDef"

    class primitivetype_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.primitivetype_return, self).__init__()

            self.tree = None




    # $ANTLR start "primitivetype"
    # src\\SavedFSM\\Monitor.g:69:1: primitivetype : ( INT -> INT | STRING -> STRING ) ;
    def primitivetype(self, ):

        retval = self.primitivetype_return()
        retval.start = self.input.LT(1)

        root_0 = None

        INT54 = None
        STRING55 = None

        INT54_tree = None
        STRING55_tree = None
        stream_INT = RewriteRuleTokenStream(self._adaptor, "token INT")
        stream_STRING = RewriteRuleTokenStream(self._adaptor, "token STRING")

        try:
            try:
                # src\\SavedFSM\\Monitor.g:69:15: ( ( INT -> INT | STRING -> STRING ) )
                # src\\SavedFSM\\Monitor.g:69:16: ( INT -> INT | STRING -> STRING )
                pass 
                # src\\SavedFSM\\Monitor.g:69:16: ( INT -> INT | STRING -> STRING )
                alt19 = 2
                LA19_0 = self.input.LA(1)

                if (LA19_0 == INT) :
                    alt19 = 1
                elif (LA19_0 == STRING) :
                    alt19 = 2
                else:
                    if self._state.backtracking > 0:
                        raise BacktrackingFailed

                    nvae = NoViableAltException("", 19, 0, self.input)

                    raise nvae

                if alt19 == 1:
                    # src\\SavedFSM\\Monitor.g:69:17: INT
                    pass 
                    INT54=self.match(self.input, INT, self.FOLLOW_INT_in_primitivetype569) 
                    if self._state.backtracking == 0:
                        stream_INT.add(INT54)

                    # AST Rewrite
                    # elements: INT
                    # token labels: 
                    # rule labels: retval
                    # token list labels: 
                    # rule list labels: 
                    # wildcard labels: 
                    if self._state.backtracking == 0:

                        retval.tree = root_0

                        if retval is not None:
                            stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                        else:
                            stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                        root_0 = self._adaptor.nil()
                        # 69:21: -> INT
                        self._adaptor.addChild(root_0, stream_INT.nextNode())



                        retval.tree = root_0


                elif alt19 == 2:
                    # src\\SavedFSM\\Monitor.g:69:28: STRING
                    pass 
                    STRING55=self.match(self.input, STRING, self.FOLLOW_STRING_in_primitivetype575) 
                    if self._state.backtracking == 0:
                        stream_STRING.add(STRING55)

                    # AST Rewrite
                    # elements: STRING
                    # token labels: 
                    # rule labels: retval
                    # token list labels: 
                    # rule list labels: 
                    # wildcard labels: 
                    if self._state.backtracking == 0:

                        retval.tree = root_0

                        if retval is not None:
                            stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                        else:
                            stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                        root_0 = self._adaptor.nil()
                        # 69:34: -> STRING
                        self._adaptor.addChild(root_0, stream_STRING.nextNode())



                        retval.tree = root_0






                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "primitivetype"

    class activityDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.activityDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "activityDef"
    # src\\SavedFSM\\Monitor.g:71:1: activityDef : ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef | RECLABEL ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef );
    def activityDef(self, ):

        retval = self.activityDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        RECLABEL62 = None
        char_literal63 = None
        introducesDef56 = None

        interactionDef57 = None

        inlineDef58 = None

        runDef59 = None

        recursionDef60 = None

        endDef61 = None

        choiceDef64 = None

        directedChoiceDef65 = None

        parallelDef66 = None

        repeatDef67 = None

        unorderedDef68 = None

        recBlockDef69 = None

        globalEscapeDef70 = None


        RECLABEL62_tree = None
        char_literal63_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:71:12: ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef | RECLABEL ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef )
                alt21 = 8
                LA21 = self.input.LA(1)
                if LA21 == RECLABEL or LA21 == ID or LA21 == 51 or LA21 == 52 or LA21 == 53:
                    alt21 = 1
                elif LA21 == 47:
                    alt21 = 2
                elif LA21 == 36 or LA21 == 39 or LA21 == 46:
                    alt21 = 3
                elif LA21 == 54:
                    alt21 = 4
                elif LA21 == 49:
                    alt21 = 5
                elif LA21 == 59:
                    alt21 = 6
                elif LA21 == 50:
                    alt21 = 7
                elif LA21 == 56:
                    alt21 = 8
                else:
                    if self._state.backtracking > 0:
                        raise BacktrackingFailed

                    nvae = NoViableAltException("", 21, 0, self.input)

                    raise nvae

                if alt21 == 1:
                    # src\\SavedFSM\\Monitor.g:71:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef | RECLABEL ) ';'
                    pass 
                    root_0 = self._adaptor.nil()

                    # src\\SavedFSM\\Monitor.g:71:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef | RECLABEL )
                    alt20 = 7
                    LA20 = self.input.LA(1)
                    if LA20 == ID:
                        LA20 = self.input.LA(2)
                        if LA20 == 44:
                            alt20 = 1
                        elif LA20 == 36 or LA20 == 41 or LA20 == 46:
                            alt20 = 2
                        elif LA20 == 35:
                            alt20 = 5
                        else:
                            if self._state.backtracking > 0:
                                raise BacktrackingFailed

                            nvae = NoViableAltException("", 20, 1, self.input)

                            raise nvae

                    elif LA20 == 53:
                        alt20 = 3
                    elif LA20 == 52:
                        alt20 = 4
                    elif LA20 == 51:
                        alt20 = 6
                    elif LA20 == RECLABEL:
                        alt20 = 7
                    else:
                        if self._state.backtracking > 0:
                            raise BacktrackingFailed

                        nvae = NoViableAltException("", 20, 0, self.input)

                        raise nvae

                    if alt20 == 1:
                        # src\\SavedFSM\\Monitor.g:71:16: introducesDef
                        pass 
                        self._state.following.append(self.FOLLOW_introducesDef_in_activityDef588)
                        introducesDef56 = self.introducesDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, introducesDef56.tree)


                    elif alt20 == 2:
                        # src\\SavedFSM\\Monitor.g:71:32: interactionDef
                        pass 
                        self._state.following.append(self.FOLLOW_interactionDef_in_activityDef592)
                        interactionDef57 = self.interactionDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, interactionDef57.tree)


                    elif alt20 == 3:
                        # src\\SavedFSM\\Monitor.g:71:49: inlineDef
                        pass 
                        self._state.following.append(self.FOLLOW_inlineDef_in_activityDef596)
                        inlineDef58 = self.inlineDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, inlineDef58.tree)


                    elif alt20 == 4:
                        # src\\SavedFSM\\Monitor.g:71:61: runDef
                        pass 
                        self._state.following.append(self.FOLLOW_runDef_in_activityDef600)
                        runDef59 = self.runDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, runDef59.tree)


                    elif alt20 == 5:
                        # src\\SavedFSM\\Monitor.g:71:70: recursionDef
                        pass 
                        self._state.following.append(self.FOLLOW_recursionDef_in_activityDef604)
                        recursionDef60 = self.recursionDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, recursionDef60.tree)


                    elif alt20 == 6:
                        # src\\SavedFSM\\Monitor.g:71:85: endDef
                        pass 
                        self._state.following.append(self.FOLLOW_endDef_in_activityDef608)
                        endDef61 = self.endDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, endDef61.tree)


                    elif alt20 == 7:
                        # src\\SavedFSM\\Monitor.g:71:94: RECLABEL
                        pass 
                        RECLABEL62=self.match(self.input, RECLABEL, self.FOLLOW_RECLABEL_in_activityDef612)
                        if self._state.backtracking == 0:

                            RECLABEL62_tree = self._adaptor.createWithPayload(RECLABEL62)
                            self._adaptor.addChild(root_0, RECLABEL62_tree)




                    char_literal63=self.match(self.input, 35, self.FOLLOW_35_in_activityDef616)


                elif alt21 == 2:
                    # src\\SavedFSM\\Monitor.g:72:4: choiceDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_choiceDef_in_activityDef625)
                    choiceDef64 = self.choiceDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, choiceDef64.tree)


                elif alt21 == 3:
                    # src\\SavedFSM\\Monitor.g:72:16: directedChoiceDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_directedChoiceDef_in_activityDef629)
                    directedChoiceDef65 = self.directedChoiceDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, directedChoiceDef65.tree)


                elif alt21 == 4:
                    # src\\SavedFSM\\Monitor.g:72:36: parallelDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_parallelDef_in_activityDef633)
                    parallelDef66 = self.parallelDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, parallelDef66.tree)


                elif alt21 == 5:
                    # src\\SavedFSM\\Monitor.g:72:50: repeatDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_repeatDef_in_activityDef637)
                    repeatDef67 = self.repeatDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, repeatDef67.tree)


                elif alt21 == 6:
                    # src\\SavedFSM\\Monitor.g:72:62: unorderedDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_unorderedDef_in_activityDef641)
                    unorderedDef68 = self.unorderedDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, unorderedDef68.tree)


                elif alt21 == 7:
                    # src\\SavedFSM\\Monitor.g:73:4: recBlockDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_recBlockDef_in_activityDef648)
                    recBlockDef69 = self.recBlockDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, recBlockDef69.tree)


                elif alt21 == 8:
                    # src\\SavedFSM\\Monitor.g:73:18: globalEscapeDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_globalEscapeDef_in_activityDef652)
                    globalEscapeDef70 = self.globalEscapeDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, globalEscapeDef70.tree)


                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "activityDef"

    class introducesDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.introducesDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "introducesDef"
    # src\\SavedFSM\\Monitor.g:75:1: introducesDef : roleDef 'introduces' roleDef ( ',' roleDef )* ;
    def introducesDef(self, ):

        retval = self.introducesDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal72 = None
        char_literal74 = None
        roleDef71 = None

        roleDef73 = None

        roleDef75 = None


        string_literal72_tree = None
        char_literal74_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:75:14: ( roleDef 'introduces' roleDef ( ',' roleDef )* )
                # src\\SavedFSM\\Monitor.g:75:16: roleDef 'introduces' roleDef ( ',' roleDef )*
                pass 
                root_0 = self._adaptor.nil()

                self._state.following.append(self.FOLLOW_roleDef_in_introducesDef660)
                roleDef71 = self.roleDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, roleDef71.tree)
                string_literal72=self.match(self.input, 44, self.FOLLOW_44_in_introducesDef662)
                if self._state.backtracking == 0:

                    string_literal72_tree = self._adaptor.createWithPayload(string_literal72)
                    self._adaptor.addChild(root_0, string_literal72_tree)

                self._state.following.append(self.FOLLOW_roleDef_in_introducesDef664)
                roleDef73 = self.roleDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, roleDef73.tree)
                # src\\SavedFSM\\Monitor.g:75:45: ( ',' roleDef )*
                while True: #loop22
                    alt22 = 2
                    LA22_0 = self.input.LA(1)

                    if (LA22_0 == 34) :
                        alt22 = 1


                    if alt22 == 1:
                        # src\\SavedFSM\\Monitor.g:75:47: ',' roleDef
                        pass 
                        char_literal74=self.match(self.input, 34, self.FOLLOW_34_in_introducesDef668)
                        if self._state.backtracking == 0:

                            char_literal74_tree = self._adaptor.createWithPayload(char_literal74)
                            self._adaptor.addChild(root_0, char_literal74_tree)

                        self._state.following.append(self.FOLLOW_roleDef_in_introducesDef670)
                        roleDef75 = self.roleDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, roleDef75.tree)


                    else:
                        break #loop22



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "introducesDef"

    class roleDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.roleDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "roleDef"
    # src\\SavedFSM\\Monitor.g:77:1: roleDef : ID -> ID ;
    def roleDef(self, ):

        retval = self.roleDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID76 = None

        ID76_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            try:
                # src\\SavedFSM\\Monitor.g:77:8: ( ID -> ID )
                # src\\SavedFSM\\Monitor.g:77:10: ID
                pass 
                ID76=self.match(self.input, ID, self.FOLLOW_ID_in_roleDef681) 
                if self._state.backtracking == 0:
                    stream_ID.add(ID76)

                # AST Rewrite
                # elements: ID
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 77:13: -> ID
                    self._adaptor.addChild(root_0, stream_ID.nextNode())



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "roleDef"

    class roleName_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.roleName_return, self).__init__()

            self.tree = None




    # $ANTLR start "roleName"
    # src\\SavedFSM\\Monitor.g:79:1: roleName : ID -> ID ;
    def roleName(self, ):

        retval = self.roleName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID77 = None

        ID77_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            try:
                # src\\SavedFSM\\Monitor.g:79:9: ( ID -> ID )
                # src\\SavedFSM\\Monitor.g:79:11: ID
                pass 
                ID77=self.match(self.input, ID, self.FOLLOW_ID_in_roleName692) 
                if self._state.backtracking == 0:
                    stream_ID.add(ID77)

                # AST Rewrite
                # elements: ID
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 79:14: -> ID
                    self._adaptor.addChild(root_0, stream_ID.nextNode())



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "roleName"

    class typeReferenceDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.typeReferenceDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "typeReferenceDef"
    # src\\SavedFSM\\Monitor.g:81:1: typeReferenceDef : ID -> ID ;
    def typeReferenceDef(self, ):

        retval = self.typeReferenceDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID78 = None

        ID78_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            try:
                # src\\SavedFSM\\Monitor.g:81:17: ( ID -> ID )
                # src\\SavedFSM\\Monitor.g:81:19: ID
                pass 
                ID78=self.match(self.input, ID, self.FOLLOW_ID_in_typeReferenceDef703) 
                if self._state.backtracking == 0:
                    stream_ID.add(ID78)

                # AST Rewrite
                # elements: ID
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 81:22: -> ID
                    self._adaptor.addChild(root_0, stream_ID.nextNode())



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "typeReferenceDef"

    class interactionSignatureDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.interactionSignatureDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "interactionSignatureDef"
    # src\\SavedFSM\\Monitor.g:83:1: interactionSignatureDef : ( typeReferenceDef ( '(' ( valueDecl ( ',' )? )* ')' )? -> ^( VALUE ( valueDecl )* ) typeReferenceDef ) ;
    def interactionSignatureDef(self, ):

        retval = self.interactionSignatureDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        char_literal80 = None
        char_literal82 = None
        char_literal83 = None
        typeReferenceDef79 = None

        valueDecl81 = None


        char_literal80_tree = None
        char_literal82_tree = None
        char_literal83_tree = None
        stream_42 = RewriteRuleTokenStream(self._adaptor, "token 42")
        stream_41 = RewriteRuleTokenStream(self._adaptor, "token 41")
        stream_34 = RewriteRuleTokenStream(self._adaptor, "token 34")
        stream_typeReferenceDef = RewriteRuleSubtreeStream(self._adaptor, "rule typeReferenceDef")
        stream_valueDecl = RewriteRuleSubtreeStream(self._adaptor, "rule valueDecl")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:83:24: ( ( typeReferenceDef ( '(' ( valueDecl ( ',' )? )* ')' )? -> ^( VALUE ( valueDecl )* ) typeReferenceDef ) )
                # src\\SavedFSM\\Monitor.g:83:26: ( typeReferenceDef ( '(' ( valueDecl ( ',' )? )* ')' )? -> ^( VALUE ( valueDecl )* ) typeReferenceDef )
                pass 
                # src\\SavedFSM\\Monitor.g:83:26: ( typeReferenceDef ( '(' ( valueDecl ( ',' )? )* ')' )? -> ^( VALUE ( valueDecl )* ) typeReferenceDef )
                # src\\SavedFSM\\Monitor.g:83:27: typeReferenceDef ( '(' ( valueDecl ( ',' )? )* ')' )?
                pass 
                self._state.following.append(self.FOLLOW_typeReferenceDef_in_interactionSignatureDef715)
                typeReferenceDef79 = self.typeReferenceDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_typeReferenceDef.add(typeReferenceDef79.tree)
                # src\\SavedFSM\\Monitor.g:83:44: ( '(' ( valueDecl ( ',' )? )* ')' )?
                alt25 = 2
                LA25_0 = self.input.LA(1)

                if (LA25_0 == 41) :
                    alt25 = 1
                if alt25 == 1:
                    # src\\SavedFSM\\Monitor.g:83:45: '(' ( valueDecl ( ',' )? )* ')'
                    pass 
                    char_literal80=self.match(self.input, 41, self.FOLLOW_41_in_interactionSignatureDef718) 
                    if self._state.backtracking == 0:
                        stream_41.add(char_literal80)
                    # src\\SavedFSM\\Monitor.g:83:49: ( valueDecl ( ',' )? )*
                    while True: #loop24
                        alt24 = 2
                        LA24_0 = self.input.LA(1)

                        if (LA24_0 == ID) :
                            alt24 = 1


                        if alt24 == 1:
                            # src\\SavedFSM\\Monitor.g:83:50: valueDecl ( ',' )?
                            pass 
                            self._state.following.append(self.FOLLOW_valueDecl_in_interactionSignatureDef721)
                            valueDecl81 = self.valueDecl()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_valueDecl.add(valueDecl81.tree)
                            # src\\SavedFSM\\Monitor.g:83:60: ( ',' )?
                            alt23 = 2
                            LA23_0 = self.input.LA(1)

                            if (LA23_0 == 34) :
                                alt23 = 1
                            if alt23 == 1:
                                # src\\SavedFSM\\Monitor.g:0:0: ','
                                pass 
                                char_literal82=self.match(self.input, 34, self.FOLLOW_34_in_interactionSignatureDef723) 
                                if self._state.backtracking == 0:
                                    stream_34.add(char_literal82)





                        else:
                            break #loop24
                    char_literal83=self.match(self.input, 42, self.FOLLOW_42_in_interactionSignatureDef728) 
                    if self._state.backtracking == 0:
                        stream_42.add(char_literal83)




                # AST Rewrite
                # elements: valueDecl, typeReferenceDef
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 83:73: -> ^( VALUE ( valueDecl )* ) typeReferenceDef
                    # src\\SavedFSM\\Monitor.g:83:76: ^( VALUE ( valueDecl )* )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(VALUE, "VALUE"), root_1)

                    # src\\SavedFSM\\Monitor.g:83:84: ( valueDecl )*
                    while stream_valueDecl.hasNext():
                        self._adaptor.addChild(root_1, stream_valueDecl.nextTree())


                    stream_valueDecl.reset();

                    self._adaptor.addChild(root_0, root_1)
                    self._adaptor.addChild(root_0, stream_typeReferenceDef.nextTree())



                    retval.tree = root_0






                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "interactionSignatureDef"

    class valueDecl_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.valueDecl_return, self).__init__()

            self.tree = None




    # $ANTLR start "valueDecl"
    # src\\SavedFSM\\Monitor.g:85:1: valueDecl : ID ':' primitivetype ;
    def valueDecl(self, ):

        retval = self.valueDecl_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID84 = None
        char_literal85 = None
        primitivetype86 = None


        ID84_tree = None
        char_literal85_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:85:11: ( ID ':' primitivetype )
                # src\\SavedFSM\\Monitor.g:85:13: ID ':' primitivetype
                pass 
                root_0 = self._adaptor.nil()

                ID84=self.match(self.input, ID, self.FOLLOW_ID_in_valueDecl750)
                if self._state.backtracking == 0:

                    ID84_tree = self._adaptor.createWithPayload(ID84)
                    self._adaptor.addChild(root_0, ID84_tree)

                char_literal85=self.match(self.input, 45, self.FOLLOW_45_in_valueDecl752)
                self._state.following.append(self.FOLLOW_primitivetype_in_valueDecl755)
                primitivetype86 = self.primitivetype()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, primitivetype86.tree)



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "valueDecl"

    class interactionDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.interactionDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "interactionDef"
    # src\\SavedFSM\\Monitor.g:88:1: interactionDef : interactionSignatureDef ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) ) ;
    def interactionDef(self, ):

        retval = self.interactionDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal88 = None
        string_literal90 = None
        role = None

        interactionSignatureDef87 = None

        assertDef89 = None

        roleName91 = None

        assertDef92 = None


        string_literal88_tree = None
        string_literal90_tree = None
        stream_46 = RewriteRuleTokenStream(self._adaptor, "token 46")
        stream_36 = RewriteRuleTokenStream(self._adaptor, "token 36")
        stream_assertDef = RewriteRuleSubtreeStream(self._adaptor, "rule assertDef")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        stream_interactionSignatureDef = RewriteRuleSubtreeStream(self._adaptor, "rule interactionSignatureDef")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:88:15: ( interactionSignatureDef ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) ) )
                # src\\SavedFSM\\Monitor.g:89:7: interactionSignatureDef ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) )
                pass 
                self._state.following.append(self.FOLLOW_interactionSignatureDef_in_interactionDef772)
                interactionSignatureDef87 = self.interactionSignatureDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_interactionSignatureDef.add(interactionSignatureDef87.tree)
                # src\\SavedFSM\\Monitor.g:89:31: ( 'from' role= roleName ( assertDef ) -> ^( RESV interactionSignatureDef $role assertDef ) | 'to' roleName ( assertDef ) -> ^( SEND interactionSignatureDef roleName assertDef ) )
                alt26 = 2
                LA26_0 = self.input.LA(1)

                if (LA26_0 == 36) :
                    alt26 = 1
                elif (LA26_0 == 46) :
                    alt26 = 2
                else:
                    if self._state.backtracking > 0:
                        raise BacktrackingFailed

                    nvae = NoViableAltException("", 26, 0, self.input)

                    raise nvae

                if alt26 == 1:
                    # src\\SavedFSM\\Monitor.g:90:3: 'from' role= roleName ( assertDef )
                    pass 
                    string_literal88=self.match(self.input, 36, self.FOLLOW_36_in_interactionDef778) 
                    if self._state.backtracking == 0:
                        stream_36.add(string_literal88)
                    self._state.following.append(self.FOLLOW_roleName_in_interactionDef783)
                    role = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_roleName.add(role.tree)
                    # src\\SavedFSM\\Monitor.g:90:26: ( assertDef )
                    # src\\SavedFSM\\Monitor.g:90:27: assertDef
                    pass 
                    self._state.following.append(self.FOLLOW_assertDef_in_interactionDef787)
                    assertDef89 = self.assertDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_assertDef.add(assertDef89.tree)




                    # AST Rewrite
                    # elements: assertDef, role, interactionSignatureDef
                    # token labels: 
                    # rule labels: retval, role
                    # token list labels: 
                    # rule list labels: 
                    # wildcard labels: 
                    if self._state.backtracking == 0:

                        retval.tree = root_0

                        if retval is not None:
                            stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                        else:
                            stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                        if role is not None:
                            stream_role = RewriteRuleSubtreeStream(self._adaptor, "rule role", role.tree)
                        else:
                            stream_role = RewriteRuleSubtreeStream(self._adaptor, "token role", None)


                        root_0 = self._adaptor.nil()
                        # 90:37: -> ^( RESV interactionSignatureDef $role assertDef )
                        # src\\SavedFSM\\Monitor.g:90:40: ^( RESV interactionSignatureDef $role assertDef )
                        root_1 = self._adaptor.nil()
                        root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(RESV, "RESV"), root_1)

                        self._adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree())
                        self._adaptor.addChild(root_1, stream_role.nextTree())
                        self._adaptor.addChild(root_1, stream_assertDef.nextTree())

                        self._adaptor.addChild(root_0, root_1)



                        retval.tree = root_0


                elif alt26 == 2:
                    # src\\SavedFSM\\Monitor.g:91:10: 'to' roleName ( assertDef )
                    pass 
                    string_literal90=self.match(self.input, 46, self.FOLLOW_46_in_interactionDef811) 
                    if self._state.backtracking == 0:
                        stream_46.add(string_literal90)
                    self._state.following.append(self.FOLLOW_roleName_in_interactionDef813)
                    roleName91 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_roleName.add(roleName91.tree)
                    # src\\SavedFSM\\Monitor.g:91:25: ( assertDef )
                    # src\\SavedFSM\\Monitor.g:91:26: assertDef
                    pass 
                    self._state.following.append(self.FOLLOW_assertDef_in_interactionDef817)
                    assertDef92 = self.assertDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_assertDef.add(assertDef92.tree)




                    # AST Rewrite
                    # elements: interactionSignatureDef, roleName, assertDef
                    # token labels: 
                    # rule labels: retval
                    # token list labels: 
                    # rule list labels: 
                    # wildcard labels: 
                    if self._state.backtracking == 0:

                        retval.tree = root_0

                        if retval is not None:
                            stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                        else:
                            stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                        root_0 = self._adaptor.nil()
                        # 91:37: -> ^( SEND interactionSignatureDef roleName assertDef )
                        # src\\SavedFSM\\Monitor.g:91:40: ^( SEND interactionSignatureDef roleName assertDef )
                        root_1 = self._adaptor.nil()
                        root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(SEND, "SEND"), root_1)

                        self._adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree())
                        self._adaptor.addChild(root_1, stream_roleName.nextTree())
                        self._adaptor.addChild(root_1, stream_assertDef.nextTree())

                        self._adaptor.addChild(root_0, root_1)



                        retval.tree = root_0






                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "interactionDef"

    class choiceDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.choiceDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "choiceDef"
    # src\\SavedFSM\\Monitor.g:93:1: choiceDef : 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) ;
    def choiceDef(self, ):

        retval = self.choiceDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal93 = None
        string_literal94 = None
        string_literal97 = None
        roleName95 = None

        blockDef96 = None

        blockDef98 = None


        string_literal93_tree = None
        string_literal94_tree = None
        string_literal97_tree = None
        stream_48 = RewriteRuleTokenStream(self._adaptor, "token 48")
        stream_47 = RewriteRuleTokenStream(self._adaptor, "token 47")
        stream_38 = RewriteRuleTokenStream(self._adaptor, "token 38")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:93:10: ( 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) )
                # src\\SavedFSM\\Monitor.g:93:12: 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )*
                pass 
                string_literal93=self.match(self.input, 47, self.FOLLOW_47_in_choiceDef838) 
                if self._state.backtracking == 0:
                    stream_47.add(string_literal93)
                # src\\SavedFSM\\Monitor.g:93:21: ( 'at' roleName )?
                alt27 = 2
                LA27_0 = self.input.LA(1)

                if (LA27_0 == 38) :
                    alt27 = 1
                if alt27 == 1:
                    # src\\SavedFSM\\Monitor.g:93:23: 'at' roleName
                    pass 
                    string_literal94=self.match(self.input, 38, self.FOLLOW_38_in_choiceDef842) 
                    if self._state.backtracking == 0:
                        stream_38.add(string_literal94)
                    self._state.following.append(self.FOLLOW_roleName_in_choiceDef844)
                    roleName95 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_roleName.add(roleName95.tree)



                self._state.following.append(self.FOLLOW_blockDef_in_choiceDef849)
                blockDef96 = self.blockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_blockDef.add(blockDef96.tree)
                # src\\SavedFSM\\Monitor.g:93:49: ( 'or' blockDef )*
                while True: #loop28
                    alt28 = 2
                    LA28_0 = self.input.LA(1)

                    if (LA28_0 == 48) :
                        alt28 = 1


                    if alt28 == 1:
                        # src\\SavedFSM\\Monitor.g:93:51: 'or' blockDef
                        pass 
                        string_literal97=self.match(self.input, 48, self.FOLLOW_48_in_choiceDef853) 
                        if self._state.backtracking == 0:
                            stream_48.add(string_literal97)
                        self._state.following.append(self.FOLLOW_blockDef_in_choiceDef855)
                        blockDef98 = self.blockDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            stream_blockDef.add(blockDef98.tree)


                    else:
                        break #loop28

                # AST Rewrite
                # elements: blockDef, 47
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 93:68: -> ^( 'choice' ( blockDef )+ )
                    # src\\SavedFSM\\Monitor.g:93:71: ^( 'choice' ( blockDef )+ )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(stream_47.nextNode(), root_1)

                    # src\\SavedFSM\\Monitor.g:93:82: ( blockDef )+
                    if not (stream_blockDef.hasNext()):
                        raise RewriteEarlyExitException()

                    while stream_blockDef.hasNext():
                        self._adaptor.addChild(root_1, stream_blockDef.nextTree())


                    stream_blockDef.reset()

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "choiceDef"

    class directedChoiceDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.directedChoiceDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "directedChoiceDef"
    # src\\SavedFSM\\Monitor.g:95:1: directedChoiceDef : ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' ;
    def directedChoiceDef(self, ):

        retval = self.directedChoiceDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal99 = None
        string_literal101 = None
        char_literal103 = None
        char_literal105 = None
        char_literal107 = None
        roleName100 = None

        roleName102 = None

        roleName104 = None

        onMessageDef106 = None


        string_literal99_tree = None
        string_literal101_tree = None
        char_literal103_tree = None
        char_literal105_tree = None
        char_literal107_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:95:18: ( ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' )
                # src\\SavedFSM\\Monitor.g:95:20: ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}'
                pass 
                root_0 = self._adaptor.nil()

                # src\\SavedFSM\\Monitor.g:95:20: ( 'from' roleName )?
                alt29 = 2
                LA29_0 = self.input.LA(1)

                if (LA29_0 == 36) :
                    alt29 = 1
                if alt29 == 1:
                    # src\\SavedFSM\\Monitor.g:95:22: 'from' roleName
                    pass 
                    string_literal99=self.match(self.input, 36, self.FOLLOW_36_in_directedChoiceDef876)
                    if self._state.backtracking == 0:

                        string_literal99_tree = self._adaptor.createWithPayload(string_literal99)
                        self._adaptor.addChild(root_0, string_literal99_tree)

                    self._state.following.append(self.FOLLOW_roleName_in_directedChoiceDef878)
                    roleName100 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, roleName100.tree)



                # src\\SavedFSM\\Monitor.g:95:41: ( 'to' roleName ( ',' roleName )* )?
                alt31 = 2
                LA31_0 = self.input.LA(1)

                if (LA31_0 == 46) :
                    alt31 = 1
                if alt31 == 1:
                    # src\\SavedFSM\\Monitor.g:95:43: 'to' roleName ( ',' roleName )*
                    pass 
                    string_literal101=self.match(self.input, 46, self.FOLLOW_46_in_directedChoiceDef885)
                    if self._state.backtracking == 0:

                        string_literal101_tree = self._adaptor.createWithPayload(string_literal101)
                        self._adaptor.addChild(root_0, string_literal101_tree)

                    self._state.following.append(self.FOLLOW_roleName_in_directedChoiceDef887)
                    roleName102 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, roleName102.tree)
                    # src\\SavedFSM\\Monitor.g:95:57: ( ',' roleName )*
                    while True: #loop30
                        alt30 = 2
                        LA30_0 = self.input.LA(1)

                        if (LA30_0 == 34) :
                            alt30 = 1


                        if alt30 == 1:
                            # src\\SavedFSM\\Monitor.g:95:59: ',' roleName
                            pass 
                            char_literal103=self.match(self.input, 34, self.FOLLOW_34_in_directedChoiceDef891)
                            self._state.following.append(self.FOLLOW_roleName_in_directedChoiceDef894)
                            roleName104 = self.roleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, roleName104.tree)


                        else:
                            break #loop30



                char_literal105=self.match(self.input, 39, self.FOLLOW_39_in_directedChoiceDef902)
                if self._state.backtracking == 0:

                    char_literal105_tree = self._adaptor.createWithPayload(char_literal105)
                    self._adaptor.addChild(root_0, char_literal105_tree)

                # src\\SavedFSM\\Monitor.g:95:83: ( onMessageDef )+
                cnt32 = 0
                while True: #loop32
                    alt32 = 2
                    LA32_0 = self.input.LA(1)

                    if (LA32_0 == ID) :
                        alt32 = 1


                    if alt32 == 1:
                        # src\\SavedFSM\\Monitor.g:95:85: onMessageDef
                        pass 
                        self._state.following.append(self.FOLLOW_onMessageDef_in_directedChoiceDef906)
                        onMessageDef106 = self.onMessageDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, onMessageDef106.tree)


                    else:
                        if cnt32 >= 1:
                            break #loop32

                        if self._state.backtracking > 0:
                            raise BacktrackingFailed

                        eee = EarlyExitException(32, self.input)
                        raise eee

                    cnt32 += 1
                char_literal107=self.match(self.input, 40, self.FOLLOW_40_in_directedChoiceDef911)
                if self._state.backtracking == 0:

                    char_literal107_tree = self._adaptor.createWithPayload(char_literal107)
                    self._adaptor.addChild(root_0, char_literal107_tree)




                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "directedChoiceDef"

    class onMessageDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.onMessageDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "onMessageDef"
    # src\\SavedFSM\\Monitor.g:97:1: onMessageDef : interactionSignatureDef ':' activityList ;
    def onMessageDef(self, ):

        retval = self.onMessageDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        char_literal109 = None
        interactionSignatureDef108 = None

        activityList110 = None


        char_literal109_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:97:13: ( interactionSignatureDef ':' activityList )
                # src\\SavedFSM\\Monitor.g:97:15: interactionSignatureDef ':' activityList
                pass 
                root_0 = self._adaptor.nil()

                self._state.following.append(self.FOLLOW_interactionSignatureDef_in_onMessageDef918)
                interactionSignatureDef108 = self.interactionSignatureDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, interactionSignatureDef108.tree)
                char_literal109=self.match(self.input, 45, self.FOLLOW_45_in_onMessageDef920)
                if self._state.backtracking == 0:

                    char_literal109_tree = self._adaptor.createWithPayload(char_literal109)
                    self._adaptor.addChild(root_0, char_literal109_tree)

                self._state.following.append(self.FOLLOW_activityList_in_onMessageDef922)
                activityList110 = self.activityList()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, activityList110.tree)



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "onMessageDef"

    class activityList_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.activityList_return, self).__init__()

            self.tree = None




    # $ANTLR start "activityList"
    # src\\SavedFSM\\Monitor.g:99:1: activityList : ( ( ANNOTATION )* activityDef )* ;
    def activityList(self, ):

        retval = self.activityList_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ANNOTATION111 = None
        activityDef112 = None


        ANNOTATION111_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:99:13: ( ( ( ANNOTATION )* activityDef )* )
                # src\\SavedFSM\\Monitor.g:99:15: ( ( ANNOTATION )* activityDef )*
                pass 
                root_0 = self._adaptor.nil()

                # src\\SavedFSM\\Monitor.g:99:15: ( ( ANNOTATION )* activityDef )*
                while True: #loop34
                    alt34 = 2
                    alt34 = self.dfa34.predict(self.input)
                    if alt34 == 1:
                        # src\\SavedFSM\\Monitor.g:99:17: ( ANNOTATION )* activityDef
                        pass 
                        # src\\SavedFSM\\Monitor.g:99:17: ( ANNOTATION )*
                        while True: #loop33
                            alt33 = 2
                            LA33_0 = self.input.LA(1)

                            if (LA33_0 == ANNOTATION) :
                                alt33 = 1


                            if alt33 == 1:
                                # src\\SavedFSM\\Monitor.g:99:19: ANNOTATION
                                pass 
                                ANNOTATION111=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_activityList935)
                                if self._state.backtracking == 0:

                                    ANNOTATION111_tree = self._adaptor.createWithPayload(ANNOTATION111)
                                    self._adaptor.addChild(root_0, ANNOTATION111_tree)



                            else:
                                break #loop33
                        self._state.following.append(self.FOLLOW_activityDef_in_activityList940)
                        activityDef112 = self.activityDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, activityDef112.tree)


                    else:
                        break #loop34



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "activityList"

    class repeatDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.repeatDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "repeatDef"
    # src\\SavedFSM\\Monitor.g:101:1: repeatDef : 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) ;
    def repeatDef(self, ):

        retval = self.repeatDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal113 = None
        string_literal114 = None
        char_literal116 = None
        roleName115 = None

        roleName117 = None

        blockDef118 = None


        string_literal113_tree = None
        string_literal114_tree = None
        char_literal116_tree = None
        stream_49 = RewriteRuleTokenStream(self._adaptor, "token 49")
        stream_34 = RewriteRuleTokenStream(self._adaptor, "token 34")
        stream_38 = RewriteRuleTokenStream(self._adaptor, "token 38")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:101:10: ( 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) )
                # src\\SavedFSM\\Monitor.g:101:12: 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef
                pass 
                string_literal113=self.match(self.input, 49, self.FOLLOW_49_in_repeatDef950) 
                if self._state.backtracking == 0:
                    stream_49.add(string_literal113)
                # src\\SavedFSM\\Monitor.g:101:21: ( 'at' roleName ( ',' roleName )* )?
                alt36 = 2
                LA36_0 = self.input.LA(1)

                if (LA36_0 == 38) :
                    alt36 = 1
                if alt36 == 1:
                    # src\\SavedFSM\\Monitor.g:101:23: 'at' roleName ( ',' roleName )*
                    pass 
                    string_literal114=self.match(self.input, 38, self.FOLLOW_38_in_repeatDef954) 
                    if self._state.backtracking == 0:
                        stream_38.add(string_literal114)
                    self._state.following.append(self.FOLLOW_roleName_in_repeatDef956)
                    roleName115 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_roleName.add(roleName115.tree)
                    # src\\SavedFSM\\Monitor.g:101:37: ( ',' roleName )*
                    while True: #loop35
                        alt35 = 2
                        LA35_0 = self.input.LA(1)

                        if (LA35_0 == 34) :
                            alt35 = 1


                        if alt35 == 1:
                            # src\\SavedFSM\\Monitor.g:101:39: ',' roleName
                            pass 
                            char_literal116=self.match(self.input, 34, self.FOLLOW_34_in_repeatDef960) 
                            if self._state.backtracking == 0:
                                stream_34.add(char_literal116)
                            self._state.following.append(self.FOLLOW_roleName_in_repeatDef962)
                            roleName117 = self.roleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_roleName.add(roleName117.tree)


                        else:
                            break #loop35



                self._state.following.append(self.FOLLOW_blockDef_in_repeatDef970)
                blockDef118 = self.blockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_blockDef.add(blockDef118.tree)

                # AST Rewrite
                # elements: 49, blockDef
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 101:68: -> ^( 'repeat' blockDef )
                    # src\\SavedFSM\\Monitor.g:101:71: ^( 'repeat' blockDef )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(stream_49.nextNode(), root_1)

                    self._adaptor.addChild(root_1, stream_blockDef.nextTree())

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "repeatDef"

    class recBlockDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.recBlockDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "recBlockDef"
    # src\\SavedFSM\\Monitor.g:103:1: recBlockDef : 'rec' labelName blockDef -> ^( 'rec' labelName blockDef ) ;
    def recBlockDef(self, ):

        retval = self.recBlockDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal119 = None
        labelName120 = None

        blockDef121 = None


        string_literal119_tree = None
        stream_50 = RewriteRuleTokenStream(self._adaptor, "token 50")
        stream_labelName = RewriteRuleSubtreeStream(self._adaptor, "rule labelName")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:103:12: ( 'rec' labelName blockDef -> ^( 'rec' labelName blockDef ) )
                # src\\SavedFSM\\Monitor.g:103:14: 'rec' labelName blockDef
                pass 
                string_literal119=self.match(self.input, 50, self.FOLLOW_50_in_recBlockDef986) 
                if self._state.backtracking == 0:
                    stream_50.add(string_literal119)
                self._state.following.append(self.FOLLOW_labelName_in_recBlockDef988)
                labelName120 = self.labelName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_labelName.add(labelName120.tree)
                self._state.following.append(self.FOLLOW_blockDef_in_recBlockDef990)
                blockDef121 = self.blockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_blockDef.add(blockDef121.tree)

                # AST Rewrite
                # elements: blockDef, 50, labelName
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 103:39: -> ^( 'rec' labelName blockDef )
                    # src\\SavedFSM\\Monitor.g:103:42: ^( 'rec' labelName blockDef )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(stream_50.nextNode(), root_1)

                    self._adaptor.addChild(root_1, stream_labelName.nextTree())
                    self._adaptor.addChild(root_1, stream_blockDef.nextTree())

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "recBlockDef"

    class labelName_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.labelName_return, self).__init__()

            self.tree = None




    # $ANTLR start "labelName"
    # src\\SavedFSM\\Monitor.g:105:1: labelName : ID -> ID ;
    def labelName(self, ):

        retval = self.labelName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID122 = None

        ID122_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            try:
                # src\\SavedFSM\\Monitor.g:105:10: ( ID -> ID )
                # src\\SavedFSM\\Monitor.g:105:12: ID
                pass 
                ID122=self.match(self.input, ID, self.FOLLOW_ID_in_labelName1007) 
                if self._state.backtracking == 0:
                    stream_ID.add(ID122)

                # AST Rewrite
                # elements: ID
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 105:15: -> ID
                    self._adaptor.addChild(root_0, stream_ID.nextNode())



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "labelName"

    class recursionDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.recursionDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "recursionDef"
    # src\\SavedFSM\\Monitor.g:107:1: recursionDef : labelName -> ^( RECLABEL labelName ) ;
    def recursionDef(self, ):

        retval = self.recursionDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        labelName123 = None


        stream_labelName = RewriteRuleSubtreeStream(self._adaptor, "rule labelName")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:107:13: ( labelName -> ^( RECLABEL labelName ) )
                # src\\SavedFSM\\Monitor.g:107:15: labelName
                pass 
                self._state.following.append(self.FOLLOW_labelName_in_recursionDef1019)
                labelName123 = self.labelName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_labelName.add(labelName123.tree)

                # AST Rewrite
                # elements: labelName
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 107:25: -> ^( RECLABEL labelName )
                    # src\\SavedFSM\\Monitor.g:107:28: ^( RECLABEL labelName )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(RECLABEL, "RECLABEL"), root_1)

                    self._adaptor.addChild(root_1, stream_labelName.nextTree())

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "recursionDef"

    class endDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.endDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "endDef"
    # src\\SavedFSM\\Monitor.g:110:1: endDef : 'end' ;
    def endDef(self, ):

        retval = self.endDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal124 = None

        string_literal124_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:110:7: ( 'end' )
                # src\\SavedFSM\\Monitor.g:110:9: 'end'
                pass 
                root_0 = self._adaptor.nil()

                string_literal124=self.match(self.input, 51, self.FOLLOW_51_in_endDef1035)
                if self._state.backtracking == 0:

                    string_literal124_tree = self._adaptor.createWithPayload(string_literal124)
                    root_0 = self._adaptor.becomeRoot(string_literal124_tree, root_0)




                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "endDef"

    class runDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.runDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "runDef"
    # src\\SavedFSM\\Monitor.g:113:1: runDef : 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName ;
    def runDef(self, ):

        retval = self.runDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal125 = None
        char_literal127 = None
        char_literal129 = None
        char_literal131 = None
        string_literal132 = None
        protocolRefDef126 = None

        parameter128 = None

        parameter130 = None

        roleName133 = None


        string_literal125_tree = None
        char_literal127_tree = None
        char_literal129_tree = None
        char_literal131_tree = None
        string_literal132_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:113:7: ( 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName )
                # src\\SavedFSM\\Monitor.g:113:9: 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName
                pass 
                root_0 = self._adaptor.nil()

                string_literal125=self.match(self.input, 52, self.FOLLOW_52_in_runDef1045)
                if self._state.backtracking == 0:

                    string_literal125_tree = self._adaptor.createWithPayload(string_literal125)
                    root_0 = self._adaptor.becomeRoot(string_literal125_tree, root_0)

                self._state.following.append(self.FOLLOW_protocolRefDef_in_runDef1048)
                protocolRefDef126 = self.protocolRefDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, protocolRefDef126.tree)
                # src\\SavedFSM\\Monitor.g:113:31: ( '(' parameter ( ',' parameter )* ')' )?
                alt38 = 2
                LA38_0 = self.input.LA(1)

                if (LA38_0 == 41) :
                    alt38 = 1
                if alt38 == 1:
                    # src\\SavedFSM\\Monitor.g:113:33: '(' parameter ( ',' parameter )* ')'
                    pass 
                    char_literal127=self.match(self.input, 41, self.FOLLOW_41_in_runDef1052)
                    self._state.following.append(self.FOLLOW_parameter_in_runDef1055)
                    parameter128 = self.parameter()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, parameter128.tree)
                    # src\\SavedFSM\\Monitor.g:113:48: ( ',' parameter )*
                    while True: #loop37
                        alt37 = 2
                        LA37_0 = self.input.LA(1)

                        if (LA37_0 == 34) :
                            alt37 = 1


                        if alt37 == 1:
                            # src\\SavedFSM\\Monitor.g:113:50: ',' parameter
                            pass 
                            char_literal129=self.match(self.input, 34, self.FOLLOW_34_in_runDef1059)
                            self._state.following.append(self.FOLLOW_parameter_in_runDef1062)
                            parameter130 = self.parameter()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, parameter130.tree)


                        else:
                            break #loop37
                    char_literal131=self.match(self.input, 42, self.FOLLOW_42_in_runDef1067)



                string_literal132=self.match(self.input, 36, self.FOLLOW_36_in_runDef1073)
                if self._state.backtracking == 0:

                    string_literal132_tree = self._adaptor.createWithPayload(string_literal132)
                    self._adaptor.addChild(root_0, string_literal132_tree)

                self._state.following.append(self.FOLLOW_roleName_in_runDef1075)
                roleName133 = self.roleName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, roleName133.tree)



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "runDef"

    class protocolRefDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.protocolRefDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "protocolRefDef"
    # src\\SavedFSM\\Monitor.g:115:1: protocolRefDef : ID ( 'at' roleName )? ;
    def protocolRefDef(self, ):

        retval = self.protocolRefDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID134 = None
        string_literal135 = None
        roleName136 = None


        ID134_tree = None
        string_literal135_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:115:15: ( ID ( 'at' roleName )? )
                # src\\SavedFSM\\Monitor.g:115:17: ID ( 'at' roleName )?
                pass 
                root_0 = self._adaptor.nil()

                ID134=self.match(self.input, ID, self.FOLLOW_ID_in_protocolRefDef1083)
                if self._state.backtracking == 0:

                    ID134_tree = self._adaptor.createWithPayload(ID134)
                    self._adaptor.addChild(root_0, ID134_tree)

                # src\\SavedFSM\\Monitor.g:115:20: ( 'at' roleName )?
                alt39 = 2
                LA39_0 = self.input.LA(1)

                if (LA39_0 == 38) :
                    alt39 = 1
                if alt39 == 1:
                    # src\\SavedFSM\\Monitor.g:115:22: 'at' roleName
                    pass 
                    string_literal135=self.match(self.input, 38, self.FOLLOW_38_in_protocolRefDef1087)
                    if self._state.backtracking == 0:

                        string_literal135_tree = self._adaptor.createWithPayload(string_literal135)
                        self._adaptor.addChild(root_0, string_literal135_tree)

                    self._state.following.append(self.FOLLOW_roleName_in_protocolRefDef1089)
                    roleName136 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, roleName136.tree)






                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "protocolRefDef"

    class declarationName_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.declarationName_return, self).__init__()

            self.tree = None




    # $ANTLR start "declarationName"
    # src\\SavedFSM\\Monitor.g:117:1: declarationName : ID ;
    def declarationName(self, ):

        retval = self.declarationName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID137 = None

        ID137_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:117:16: ( ID )
                # src\\SavedFSM\\Monitor.g:117:18: ID
                pass 
                root_0 = self._adaptor.nil()

                ID137=self.match(self.input, ID, self.FOLLOW_ID_in_declarationName1100)
                if self._state.backtracking == 0:

                    ID137_tree = self._adaptor.createWithPayload(ID137)
                    self._adaptor.addChild(root_0, ID137_tree)




                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "declarationName"

    class parameter_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.parameter_return, self).__init__()

            self.tree = None




    # $ANTLR start "parameter"
    # src\\SavedFSM\\Monitor.g:119:1: parameter : declarationName ;
    def parameter(self, ):

        retval = self.parameter_return()
        retval.start = self.input.LT(1)

        root_0 = None

        declarationName138 = None



        try:
            try:
                # src\\SavedFSM\\Monitor.g:119:10: ( declarationName )
                # src\\SavedFSM\\Monitor.g:119:12: declarationName
                pass 
                root_0 = self._adaptor.nil()

                self._state.following.append(self.FOLLOW_declarationName_in_parameter1108)
                declarationName138 = self.declarationName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, declarationName138.tree)



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "parameter"

    class inlineDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.inlineDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "inlineDef"
    # src\\SavedFSM\\Monitor.g:122:1: inlineDef : 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? ;
    def inlineDef(self, ):

        retval = self.inlineDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal139 = None
        char_literal141 = None
        char_literal143 = None
        char_literal145 = None
        protocolRefDef140 = None

        parameter142 = None

        parameter144 = None


        string_literal139_tree = None
        char_literal141_tree = None
        char_literal143_tree = None
        char_literal145_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:122:10: ( 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? )
                # src\\SavedFSM\\Monitor.g:122:12: 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )?
                pass 
                root_0 = self._adaptor.nil()

                string_literal139=self.match(self.input, 53, self.FOLLOW_53_in_inlineDef1117)
                if self._state.backtracking == 0:

                    string_literal139_tree = self._adaptor.createWithPayload(string_literal139)
                    root_0 = self._adaptor.becomeRoot(string_literal139_tree, root_0)

                self._state.following.append(self.FOLLOW_protocolRefDef_in_inlineDef1120)
                protocolRefDef140 = self.protocolRefDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, protocolRefDef140.tree)
                # src\\SavedFSM\\Monitor.g:122:37: ( '(' parameter ( ',' parameter )* ')' )?
                alt41 = 2
                LA41_0 = self.input.LA(1)

                if (LA41_0 == 41) :
                    alt41 = 1
                if alt41 == 1:
                    # src\\SavedFSM\\Monitor.g:122:39: '(' parameter ( ',' parameter )* ')'
                    pass 
                    char_literal141=self.match(self.input, 41, self.FOLLOW_41_in_inlineDef1124)
                    self._state.following.append(self.FOLLOW_parameter_in_inlineDef1127)
                    parameter142 = self.parameter()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, parameter142.tree)
                    # src\\SavedFSM\\Monitor.g:122:54: ( ',' parameter )*
                    while True: #loop40
                        alt40 = 2
                        LA40_0 = self.input.LA(1)

                        if (LA40_0 == 34) :
                            alt40 = 1


                        if alt40 == 1:
                            # src\\SavedFSM\\Monitor.g:122:56: ',' parameter
                            pass 
                            char_literal143=self.match(self.input, 34, self.FOLLOW_34_in_inlineDef1131)
                            self._state.following.append(self.FOLLOW_parameter_in_inlineDef1134)
                            parameter144 = self.parameter()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, parameter144.tree)


                        else:
                            break #loop40
                    char_literal145=self.match(self.input, 42, self.FOLLOW_42_in_inlineDef1139)






                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "inlineDef"

    class parallelDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.parallelDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "parallelDef"
    # src\\SavedFSM\\Monitor.g:124:1: parallelDef : 'parallel' blockDef ( 'and' blockDef )* -> ^( PARALLEL ( blockDef )+ ) ;
    def parallelDef(self, ):

        retval = self.parallelDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal146 = None
        string_literal148 = None
        blockDef147 = None

        blockDef149 = None


        string_literal146_tree = None
        string_literal148_tree = None
        stream_55 = RewriteRuleTokenStream(self._adaptor, "token 55")
        stream_54 = RewriteRuleTokenStream(self._adaptor, "token 54")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:124:12: ( 'parallel' blockDef ( 'and' blockDef )* -> ^( PARALLEL ( blockDef )+ ) )
                # src\\SavedFSM\\Monitor.g:124:14: 'parallel' blockDef ( 'and' blockDef )*
                pass 
                string_literal146=self.match(self.input, 54, self.FOLLOW_54_in_parallelDef1151) 
                if self._state.backtracking == 0:
                    stream_54.add(string_literal146)
                self._state.following.append(self.FOLLOW_blockDef_in_parallelDef1153)
                blockDef147 = self.blockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_blockDef.add(blockDef147.tree)
                # src\\SavedFSM\\Monitor.g:124:34: ( 'and' blockDef )*
                while True: #loop42
                    alt42 = 2
                    LA42_0 = self.input.LA(1)

                    if (LA42_0 == 55) :
                        alt42 = 1


                    if alt42 == 1:
                        # src\\SavedFSM\\Monitor.g:124:36: 'and' blockDef
                        pass 
                        string_literal148=self.match(self.input, 55, self.FOLLOW_55_in_parallelDef1157) 
                        if self._state.backtracking == 0:
                            stream_55.add(string_literal148)
                        self._state.following.append(self.FOLLOW_blockDef_in_parallelDef1159)
                        blockDef149 = self.blockDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            stream_blockDef.add(blockDef149.tree)


                    else:
                        break #loop42

                # AST Rewrite
                # elements: blockDef
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 124:54: -> ^( PARALLEL ( blockDef )+ )
                    # src\\SavedFSM\\Monitor.g:124:57: ^( PARALLEL ( blockDef )+ )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(PARALLEL, "PARALLEL"), root_1)

                    # src\\SavedFSM\\Monitor.g:124:68: ( blockDef )+
                    if not (stream_blockDef.hasNext()):
                        raise RewriteEarlyExitException()

                    while stream_blockDef.hasNext():
                        self._adaptor.addChild(root_1, stream_blockDef.nextTree())


                    stream_blockDef.reset()

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "parallelDef"

    class doBlockDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.doBlockDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "doBlockDef"
    # src\\SavedFSM\\Monitor.g:127:1: doBlockDef : 'do' '{' activityListDef '}' -> ^( 'do' activityListDef ) ;
    def doBlockDef(self, ):

        retval = self.doBlockDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal150 = None
        char_literal151 = None
        char_literal153 = None
        activityListDef152 = None


        string_literal150_tree = None
        char_literal151_tree = None
        char_literal153_tree = None
        stream_56 = RewriteRuleTokenStream(self._adaptor, "token 56")
        stream_40 = RewriteRuleTokenStream(self._adaptor, "token 40")
        stream_39 = RewriteRuleTokenStream(self._adaptor, "token 39")
        stream_activityListDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityListDef")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:127:11: ( 'do' '{' activityListDef '}' -> ^( 'do' activityListDef ) )
                # src\\SavedFSM\\Monitor.g:127:13: 'do' '{' activityListDef '}'
                pass 
                string_literal150=self.match(self.input, 56, self.FOLLOW_56_in_doBlockDef1179) 
                if self._state.backtracking == 0:
                    stream_56.add(string_literal150)
                char_literal151=self.match(self.input, 39, self.FOLLOW_39_in_doBlockDef1181) 
                if self._state.backtracking == 0:
                    stream_39.add(char_literal151)
                self._state.following.append(self.FOLLOW_activityListDef_in_doBlockDef1183)
                activityListDef152 = self.activityListDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_activityListDef.add(activityListDef152.tree)
                char_literal153=self.match(self.input, 40, self.FOLLOW_40_in_doBlockDef1186) 
                if self._state.backtracking == 0:
                    stream_40.add(char_literal153)

                # AST Rewrite
                # elements: activityListDef, 56
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 127:43: -> ^( 'do' activityListDef )
                    # src\\SavedFSM\\Monitor.g:127:46: ^( 'do' activityListDef )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(stream_56.nextNode(), root_1)

                    self._adaptor.addChild(root_1, stream_activityListDef.nextTree())

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "doBlockDef"

    class interruptDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.interruptDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "interruptDef"
    # src\\SavedFSM\\Monitor.g:129:1: interruptDef : 'interrupt' 'by' roleName '{' activityListDef '}' -> ^( 'interrupt' roleName activityListDef ) ;
    def interruptDef(self, ):

        retval = self.interruptDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal154 = None
        string_literal155 = None
        char_literal157 = None
        char_literal159 = None
        roleName156 = None

        activityListDef158 = None


        string_literal154_tree = None
        string_literal155_tree = None
        char_literal157_tree = None
        char_literal159_tree = None
        stream_58 = RewriteRuleTokenStream(self._adaptor, "token 58")
        stream_57 = RewriteRuleTokenStream(self._adaptor, "token 57")
        stream_40 = RewriteRuleTokenStream(self._adaptor, "token 40")
        stream_39 = RewriteRuleTokenStream(self._adaptor, "token 39")
        stream_activityListDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityListDef")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:129:13: ( 'interrupt' 'by' roleName '{' activityListDef '}' -> ^( 'interrupt' roleName activityListDef ) )
                # src\\SavedFSM\\Monitor.g:129:15: 'interrupt' 'by' roleName '{' activityListDef '}'
                pass 
                string_literal154=self.match(self.input, 57, self.FOLLOW_57_in_interruptDef1204) 
                if self._state.backtracking == 0:
                    stream_57.add(string_literal154)
                string_literal155=self.match(self.input, 58, self.FOLLOW_58_in_interruptDef1206) 
                if self._state.backtracking == 0:
                    stream_58.add(string_literal155)
                self._state.following.append(self.FOLLOW_roleName_in_interruptDef1208)
                roleName156 = self.roleName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_roleName.add(roleName156.tree)
                char_literal157=self.match(self.input, 39, self.FOLLOW_39_in_interruptDef1210) 
                if self._state.backtracking == 0:
                    stream_39.add(char_literal157)
                self._state.following.append(self.FOLLOW_activityListDef_in_interruptDef1212)
                activityListDef158 = self.activityListDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_activityListDef.add(activityListDef158.tree)
                char_literal159=self.match(self.input, 40, self.FOLLOW_40_in_interruptDef1214) 
                if self._state.backtracking == 0:
                    stream_40.add(char_literal159)

                # AST Rewrite
                # elements: roleName, 57, activityListDef
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 129:65: -> ^( 'interrupt' roleName activityListDef )
                    # src\\SavedFSM\\Monitor.g:129:68: ^( 'interrupt' roleName activityListDef )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(stream_57.nextNode(), root_1)

                    self._adaptor.addChild(root_1, stream_roleName.nextTree())
                    self._adaptor.addChild(root_1, stream_activityListDef.nextTree())

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "interruptDef"

    class globalEscapeDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.globalEscapeDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "globalEscapeDef"
    # src\\SavedFSM\\Monitor.g:131:1: globalEscapeDef : doBlockDef interruptDef -> ^( GLOBAL_ESCAPE doBlockDef interruptDef ) ;
    def globalEscapeDef(self, ):

        retval = self.globalEscapeDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        doBlockDef160 = None

        interruptDef161 = None


        stream_interruptDef = RewriteRuleSubtreeStream(self._adaptor, "rule interruptDef")
        stream_doBlockDef = RewriteRuleSubtreeStream(self._adaptor, "rule doBlockDef")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:131:16: ( doBlockDef interruptDef -> ^( GLOBAL_ESCAPE doBlockDef interruptDef ) )
                # src\\SavedFSM\\Monitor.g:131:19: doBlockDef interruptDef
                pass 
                self._state.following.append(self.FOLLOW_doBlockDef_in_globalEscapeDef1232)
                doBlockDef160 = self.doBlockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_doBlockDef.add(doBlockDef160.tree)
                self._state.following.append(self.FOLLOW_interruptDef_in_globalEscapeDef1235)
                interruptDef161 = self.interruptDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_interruptDef.add(interruptDef161.tree)

                # AST Rewrite
                # elements: doBlockDef, interruptDef
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 131:44: -> ^( GLOBAL_ESCAPE doBlockDef interruptDef )
                    # src\\SavedFSM\\Monitor.g:131:47: ^( GLOBAL_ESCAPE doBlockDef interruptDef )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(GLOBAL_ESCAPE, "GLOBAL_ESCAPE"), root_1)

                    self._adaptor.addChild(root_1, stream_doBlockDef.nextTree())
                    self._adaptor.addChild(root_1, stream_interruptDef.nextTree())

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "globalEscapeDef"

    class unorderedDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.unorderedDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "unorderedDef"
    # src\\SavedFSM\\Monitor.g:133:1: unorderedDef : 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}' -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ ) ;
    def unorderedDef(self, ):

        retval = self.unorderedDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal162 = None
        char_literal163 = None
        ANNOTATION164 = None
        char_literal166 = None
        activityDef165 = None


        string_literal162_tree = None
        char_literal163_tree = None
        ANNOTATION164_tree = None
        char_literal166_tree = None
        stream_59 = RewriteRuleTokenStream(self._adaptor, "token 59")
        stream_40 = RewriteRuleTokenStream(self._adaptor, "token 40")
        stream_ANNOTATION = RewriteRuleTokenStream(self._adaptor, "token ANNOTATION")
        stream_39 = RewriteRuleTokenStream(self._adaptor, "token 39")
        stream_activityDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityDef")
        try:
            try:
                # src\\SavedFSM\\Monitor.g:133:13: ( 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}' -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ ) )
                # src\\SavedFSM\\Monitor.g:133:15: 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}'
                pass 
                string_literal162=self.match(self.input, 59, self.FOLLOW_59_in_unorderedDef1252) 
                if self._state.backtracking == 0:
                    stream_59.add(string_literal162)
                char_literal163=self.match(self.input, 39, self.FOLLOW_39_in_unorderedDef1254) 
                if self._state.backtracking == 0:
                    stream_39.add(char_literal163)
                # src\\SavedFSM\\Monitor.g:133:31: ( ( ANNOTATION )* activityDef )*
                while True: #loop44
                    alt44 = 2
                    LA44_0 = self.input.LA(1)

                    if (LA44_0 == RECLABEL or (ANNOTATION <= LA44_0 <= ID) or LA44_0 == 36 or LA44_0 == 39 or (46 <= LA44_0 <= 47) or (49 <= LA44_0 <= 54) or LA44_0 == 56 or LA44_0 == 59) :
                        alt44 = 1


                    if alt44 == 1:
                        # src\\SavedFSM\\Monitor.g:133:33: ( ANNOTATION )* activityDef
                        pass 
                        # src\\SavedFSM\\Monitor.g:133:33: ( ANNOTATION )*
                        while True: #loop43
                            alt43 = 2
                            LA43_0 = self.input.LA(1)

                            if (LA43_0 == ANNOTATION) :
                                alt43 = 1


                            if alt43 == 1:
                                # src\\SavedFSM\\Monitor.g:133:35: ANNOTATION
                                pass 
                                ANNOTATION164=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_unorderedDef1260) 
                                if self._state.backtracking == 0:
                                    stream_ANNOTATION.add(ANNOTATION164)


                            else:
                                break #loop43
                        self._state.following.append(self.FOLLOW_activityDef_in_unorderedDef1265)
                        activityDef165 = self.activityDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            stream_activityDef.add(activityDef165.tree)


                    else:
                        break #loop44
                char_literal166=self.match(self.input, 40, self.FOLLOW_40_in_unorderedDef1270) 
                if self._state.backtracking == 0:
                    stream_40.add(char_literal166)

                # AST Rewrite
                # elements: activityDef
                # token labels: 
                # rule labels: retval
                # token list labels: 
                # rule list labels: 
                # wildcard labels: 
                if self._state.backtracking == 0:

                    retval.tree = root_0

                    if retval is not None:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "rule retval", retval.tree)
                    else:
                        stream_retval = RewriteRuleSubtreeStream(self._adaptor, "token retval", None)


                    root_0 = self._adaptor.nil()
                    # 133:68: -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ )
                    # src\\SavedFSM\\Monitor.g:133:71: ^( PARALLEL ( ^( BRANCH activityDef ) )+ )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(PARALLEL, "PARALLEL"), root_1)

                    # src\\SavedFSM\\Monitor.g:133:82: ( ^( BRANCH activityDef ) )+
                    if not (stream_activityDef.hasNext()):
                        raise RewriteEarlyExitException()

                    while stream_activityDef.hasNext():
                        # src\\SavedFSM\\Monitor.g:133:82: ^( BRANCH activityDef )
                        root_2 = self._adaptor.nil()
                        root_2 = self._adaptor.becomeRoot(self._adaptor.createFromType(BRANCH, "BRANCH"), root_2)

                        self._adaptor.addChild(root_2, stream_activityDef.nextTree())

                        self._adaptor.addChild(root_1, root_2)


                    stream_activityDef.reset()

                    self._adaptor.addChild(root_0, root_1)



                    retval.tree = root_0



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "unorderedDef"

    class expr_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.expr_return, self).__init__()

            self.tree = None




    # $ANTLR start "expr"
    # src\\SavedFSM\\Monitor.g:142:1: expr : term ( ( PLUS | MINUS ) term )* ;
    def expr(self, ):

        retval = self.expr_return()
        retval.start = self.input.LT(1)

        root_0 = None

        set168 = None
        term167 = None

        term169 = None


        set168_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:142:6: ( term ( ( PLUS | MINUS ) term )* )
                # src\\SavedFSM\\Monitor.g:142:8: term ( ( PLUS | MINUS ) term )*
                pass 
                root_0 = self._adaptor.nil()

                self._state.following.append(self.FOLLOW_term_in_expr1295)
                term167 = self.term()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, term167.tree)
                # src\\SavedFSM\\Monitor.g:142:13: ( ( PLUS | MINUS ) term )*
                while True: #loop45
                    alt45 = 2
                    LA45_0 = self.input.LA(1)

                    if ((PLUS <= LA45_0 <= MINUS)) :
                        alt45 = 1


                    if alt45 == 1:
                        # src\\SavedFSM\\Monitor.g:142:15: ( PLUS | MINUS ) term
                        pass 
                        set168 = self.input.LT(1)
                        if (PLUS <= self.input.LA(1) <= MINUS):
                            self.input.consume()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, self._adaptor.createWithPayload(set168))
                            self._state.errorRecovery = False

                        else:
                            if self._state.backtracking > 0:
                                raise BacktrackingFailed

                            mse = MismatchedSetException(None, self.input)
                            raise mse


                        self._state.following.append(self.FOLLOW_term_in_expr1310)
                        term169 = self.term()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, term169.tree)


                    else:
                        break #loop45



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "expr"

    class term_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.term_return, self).__init__()

            self.tree = None




    # $ANTLR start "term"
    # src\\SavedFSM\\Monitor.g:144:1: term : factor ( ( MULT | DIV ) factor )* ;
    def term(self, ):

        retval = self.term_return()
        retval.start = self.input.LT(1)

        root_0 = None

        set171 = None
        factor170 = None

        factor172 = None


        set171_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:144:6: ( factor ( ( MULT | DIV ) factor )* )
                # src\\SavedFSM\\Monitor.g:144:8: factor ( ( MULT | DIV ) factor )*
                pass 
                root_0 = self._adaptor.nil()

                self._state.following.append(self.FOLLOW_factor_in_term1322)
                factor170 = self.factor()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, factor170.tree)
                # src\\SavedFSM\\Monitor.g:144:15: ( ( MULT | DIV ) factor )*
                while True: #loop46
                    alt46 = 2
                    LA46_0 = self.input.LA(1)

                    if ((MULT <= LA46_0 <= DIV)) :
                        alt46 = 1


                    if alt46 == 1:
                        # src\\SavedFSM\\Monitor.g:144:17: ( MULT | DIV ) factor
                        pass 
                        set171 = self.input.LT(1)
                        if (MULT <= self.input.LA(1) <= DIV):
                            self.input.consume()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, self._adaptor.createWithPayload(set171))
                            self._state.errorRecovery = False

                        else:
                            if self._state.backtracking > 0:
                                raise BacktrackingFailed

                            mse = MismatchedSetException(None, self.input)
                            raise mse


                        self._state.following.append(self.FOLLOW_factor_in_term1336)
                        factor172 = self.factor()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, factor172.tree)


                    else:
                        break #loop46



                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "term"

    class factor_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.factor_return, self).__init__()

            self.tree = None




    # $ANTLR start "factor"
    # src\\SavedFSM\\Monitor.g:146:1: factor : NUMBER ;
    def factor(self, ):

        retval = self.factor_return()
        retval.start = self.input.LT(1)

        root_0 = None

        NUMBER173 = None

        NUMBER173_tree = None

        try:
            try:
                # src\\SavedFSM\\Monitor.g:146:8: ( NUMBER )
                # src\\SavedFSM\\Monitor.g:146:10: NUMBER
                pass 
                root_0 = self._adaptor.nil()

                NUMBER173=self.match(self.input, NUMBER, self.FOLLOW_NUMBER_in_factor1348)
                if self._state.backtracking == 0:

                    NUMBER173_tree = self._adaptor.createWithPayload(NUMBER173)
                    self._adaptor.addChild(root_0, NUMBER173_tree)




                retval.stop = self.input.LT(-1)

                if self._state.backtracking == 0:

                    retval.tree = self._adaptor.rulePostProcessing(root_0)
                    self._adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop)


            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
                retval.tree = self._adaptor.errorNode(self.input, retval.start, self.input.LT(-1), re)
        finally:

            pass
        return retval

    # $ANTLR end "factor"


    # Delegated rules


    # lookup tables for DFA #3

    DFA3_eot = DFA.unpack(
        u"\4\uffff"
        )

    DFA3_eof = DFA.unpack(
        u"\4\uffff"
        )

    DFA3_min = DFA.unpack(
        u"\2\27\2\uffff"
        )

    DFA3_max = DFA.unpack(
        u"\2\41\2\uffff"
        )

    DFA3_accept = DFA.unpack(
        u"\2\uffff\1\2\1\1"
        )

    DFA3_special = DFA.unpack(
        u"\4\uffff"
        )

            
    DFA3_transition = [
        DFA.unpack(u"\1\1\10\uffff\1\3\1\2"),
        DFA.unpack(u"\1\1\10\uffff\1\3\1\2"),
        DFA.unpack(u""),
        DFA.unpack(u"")
    ]

    # class definition for DFA #3

    class DFA3(DFA):
        pass


    # lookup tables for DFA #18

    DFA18_eot = DFA.unpack(
        u"\4\uffff"
        )

    DFA18_eof = DFA.unpack(
        u"\4\uffff"
        )

    DFA18_min = DFA.unpack(
        u"\2\22\2\uffff"
        )

    DFA18_max = DFA.unpack(
        u"\2\73\2\uffff"
        )

    DFA18_accept = DFA.unpack(
        u"\2\uffff\1\2\1\1"
        )

    DFA18_special = DFA.unpack(
        u"\4\uffff"
        )

            
    DFA18_transition = [
        DFA.unpack(u"\1\3\4\uffff\1\1\1\3\10\uffff\1\2\2\uffff\1\3\2\uffff"
        u"\1\3\1\2\5\uffff\2\3\1\uffff\6\3\1\uffff\1\3\2\uffff\1\3"),
        DFA.unpack(u"\1\3\4\uffff\1\1\1\3\10\uffff\1\2\2\uffff\1\3\2\uffff"
        u"\1\3\6\uffff\2\3\1\uffff\6\3\1\uffff\1\3\2\uffff\1\3"),
        DFA.unpack(u""),
        DFA.unpack(u"")
    ]

    # class definition for DFA #18

    class DFA18(DFA):
        pass


    # lookup tables for DFA #34

    DFA34_eot = DFA.unpack(
        u"\13\uffff"
        )

    DFA34_eof = DFA.unpack(
        u"\1\1\12\uffff"
        )

    DFA34_min = DFA.unpack(
        u"\1\22\1\uffff\1\43\1\uffff\1\30\1\55\1\44\1\5\3\30"
        )

    DFA34_max = DFA.unpack(
        u"\1\73\1\uffff\1\56\1\uffff\1\52\1\55\1\56\1\6\3\52"
        )

    DFA34_accept = DFA.unpack(
        u"\1\uffff\1\2\1\uffff\1\1\7\uffff"
        )

    DFA34_special = DFA.unpack(
        u"\13\uffff"
        )

            
    DFA34_transition = [
        DFA.unpack(u"\1\3\4\uffff\1\3\1\2\13\uffff\1\3\2\uffff\1\3\1\1\5"
        u"\uffff\2\3\1\uffff\6\3\1\uffff\1\3\2\uffff\1\3"),
        DFA.unpack(u""),
        DFA.unpack(u"\2\3\4\uffff\1\4\2\uffff\1\3\1\1\1\3"),
        DFA.unpack(u""),
        DFA.unpack(u"\1\5\21\uffff\1\6"),
        DFA.unpack(u"\1\7"),
        DFA.unpack(u"\1\3\10\uffff\1\1\1\3"),
        DFA.unpack(u"\1\10\1\11"),
        DFA.unpack(u"\1\5\11\uffff\1\12\7\uffff\1\6"),
        DFA.unpack(u"\1\5\11\uffff\1\12\7\uffff\1\6"),
        DFA.unpack(u"\1\5\21\uffff\1\6")
    ]

    # class definition for DFA #34

    class DFA34(DFA):
        pass


 

    FOLLOW_ANNOTATION_in_description226 = frozenset([23, 32])
    FOLLOW_importProtocolStatement_in_description233 = frozenset([23, 32, 33])
    FOLLOW_importTypeStatement_in_description237 = frozenset([23, 32, 33])
    FOLLOW_ANNOTATION_in_description246 = frozenset([23, 33])
    FOLLOW_protocolDef_in_description251 = frozenset([1])
    FOLLOW_32_in_importProtocolStatement262 = frozenset([33])
    FOLLOW_33_in_importProtocolStatement264 = frozenset([24])
    FOLLOW_importProtocolDef_in_importProtocolStatement266 = frozenset([34, 35])
    FOLLOW_34_in_importProtocolStatement270 = frozenset([24])
    FOLLOW_importProtocolDef_in_importProtocolStatement273 = frozenset([34, 35])
    FOLLOW_35_in_importProtocolStatement278 = frozenset([1])
    FOLLOW_ID_in_importProtocolDef287 = frozenset([36])
    FOLLOW_36_in_importProtocolDef289 = frozenset([25])
    FOLLOW_StringLiteral_in_importProtocolDef292 = frozenset([1])
    FOLLOW_32_in_importTypeStatement305 = frozenset([24, 25])
    FOLLOW_simpleName_in_importTypeStatement309 = frozenset([24, 25])
    FOLLOW_importTypeDef_in_importTypeStatement314 = frozenset([34, 35, 36])
    FOLLOW_34_in_importTypeStatement318 = frozenset([24, 25])
    FOLLOW_importTypeDef_in_importTypeStatement321 = frozenset([34, 35, 36])
    FOLLOW_36_in_importTypeStatement328 = frozenset([25])
    FOLLOW_StringLiteral_in_importTypeStatement331 = frozenset([35])
    FOLLOW_35_in_importTypeStatement336 = frozenset([1])
    FOLLOW_dataTypeDef_in_importTypeDef347 = frozenset([37])
    FOLLOW_37_in_importTypeDef349 = frozenset([24])
    FOLLOW_ID_in_importTypeDef355 = frozenset([1])
    FOLLOW_StringLiteral_in_dataTypeDef363 = frozenset([1])
    FOLLOW_ID_in_simpleName371 = frozenset([1])
    FOLLOW_33_in_protocolDef379 = frozenset([24])
    FOLLOW_protocolName_in_protocolDef381 = frozenset([38, 39, 41])
    FOLLOW_38_in_protocolDef385 = frozenset([24])
    FOLLOW_roleName_in_protocolDef387 = frozenset([39, 41])
    FOLLOW_parameterDefs_in_protocolDef394 = frozenset([39])
    FOLLOW_39_in_protocolDef399 = frozenset([18, 23, 24, 36, 39, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_protocolBlockDef_in_protocolDef401 = frozenset([23, 33, 40])
    FOLLOW_ANNOTATION_in_protocolDef407 = frozenset([23, 33])
    FOLLOW_protocolDef_in_protocolDef412 = frozenset([23, 33, 40])
    FOLLOW_40_in_protocolDef417 = frozenset([1])
    FOLLOW_ID_in_protocolName439 = frozenset([1])
    FOLLOW_41_in_parameterDefs447 = frozenset([24, 43])
    FOLLOW_parameterDef_in_parameterDefs450 = frozenset([34, 42])
    FOLLOW_34_in_parameterDefs454 = frozenset([24, 43])
    FOLLOW_parameterDef_in_parameterDefs457 = frozenset([34, 42])
    FOLLOW_42_in_parameterDefs462 = frozenset([1])
    FOLLOW_typeReferenceDef_in_parameterDef473 = frozenset([24])
    FOLLOW_43_in_parameterDef477 = frozenset([24])
    FOLLOW_simpleName_in_parameterDef481 = frozenset([1])
    FOLLOW_activityListDef_in_protocolBlockDef489 = frozenset([1])
    FOLLOW_39_in_blockDef500 = frozenset([18, 23, 24, 36, 39, 40, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_activityListDef_in_blockDef502 = frozenset([40])
    FOLLOW_40_in_blockDef504 = frozenset([1])
    FOLLOW_ASSERTION_in_assertDef526 = frozenset([1])
    FOLLOW_ANNOTATION_in_activityListDef548 = frozenset([18, 23, 24, 36, 39, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_activityDef_in_activityListDef553 = frozenset([1, 18, 23, 24, 36, 39, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_INT_in_primitivetype569 = frozenset([1])
    FOLLOW_STRING_in_primitivetype575 = frozenset([1])
    FOLLOW_introducesDef_in_activityDef588 = frozenset([35])
    FOLLOW_interactionDef_in_activityDef592 = frozenset([35])
    FOLLOW_inlineDef_in_activityDef596 = frozenset([35])
    FOLLOW_runDef_in_activityDef600 = frozenset([35])
    FOLLOW_recursionDef_in_activityDef604 = frozenset([35])
    FOLLOW_endDef_in_activityDef608 = frozenset([35])
    FOLLOW_RECLABEL_in_activityDef612 = frozenset([35])
    FOLLOW_35_in_activityDef616 = frozenset([1])
    FOLLOW_choiceDef_in_activityDef625 = frozenset([1])
    FOLLOW_directedChoiceDef_in_activityDef629 = frozenset([1])
    FOLLOW_parallelDef_in_activityDef633 = frozenset([1])
    FOLLOW_repeatDef_in_activityDef637 = frozenset([1])
    FOLLOW_unorderedDef_in_activityDef641 = frozenset([1])
    FOLLOW_recBlockDef_in_activityDef648 = frozenset([1])
    FOLLOW_globalEscapeDef_in_activityDef652 = frozenset([1])
    FOLLOW_roleDef_in_introducesDef660 = frozenset([44])
    FOLLOW_44_in_introducesDef662 = frozenset([24])
    FOLLOW_roleDef_in_introducesDef664 = frozenset([1, 34])
    FOLLOW_34_in_introducesDef668 = frozenset([24])
    FOLLOW_roleDef_in_introducesDef670 = frozenset([1, 34])
    FOLLOW_ID_in_roleDef681 = frozenset([1])
    FOLLOW_ID_in_roleName692 = frozenset([1])
    FOLLOW_ID_in_typeReferenceDef703 = frozenset([1])
    FOLLOW_typeReferenceDef_in_interactionSignatureDef715 = frozenset([1, 41])
    FOLLOW_41_in_interactionSignatureDef718 = frozenset([24, 42])
    FOLLOW_valueDecl_in_interactionSignatureDef721 = frozenset([24, 34, 42])
    FOLLOW_34_in_interactionSignatureDef723 = frozenset([24, 42])
    FOLLOW_42_in_interactionSignatureDef728 = frozenset([1])
    FOLLOW_ID_in_valueDecl750 = frozenset([45])
    FOLLOW_45_in_valueDecl752 = frozenset([5, 6])
    FOLLOW_primitivetype_in_valueDecl755 = frozenset([1])
    FOLLOW_interactionSignatureDef_in_interactionDef772 = frozenset([36, 46])
    FOLLOW_36_in_interactionDef778 = frozenset([24])
    FOLLOW_roleName_in_interactionDef783 = frozenset([26])
    FOLLOW_assertDef_in_interactionDef787 = frozenset([1])
    FOLLOW_46_in_interactionDef811 = frozenset([24])
    FOLLOW_roleName_in_interactionDef813 = frozenset([26])
    FOLLOW_assertDef_in_interactionDef817 = frozenset([1])
    FOLLOW_47_in_choiceDef838 = frozenset([38, 39])
    FOLLOW_38_in_choiceDef842 = frozenset([24])
    FOLLOW_roleName_in_choiceDef844 = frozenset([38, 39])
    FOLLOW_blockDef_in_choiceDef849 = frozenset([1, 48])
    FOLLOW_48_in_choiceDef853 = frozenset([38, 39])
    FOLLOW_blockDef_in_choiceDef855 = frozenset([1, 48])
    FOLLOW_36_in_directedChoiceDef876 = frozenset([24])
    FOLLOW_roleName_in_directedChoiceDef878 = frozenset([39, 46])
    FOLLOW_46_in_directedChoiceDef885 = frozenset([24])
    FOLLOW_roleName_in_directedChoiceDef887 = frozenset([34, 39])
    FOLLOW_34_in_directedChoiceDef891 = frozenset([24])
    FOLLOW_roleName_in_directedChoiceDef894 = frozenset([34, 39])
    FOLLOW_39_in_directedChoiceDef902 = frozenset([24])
    FOLLOW_onMessageDef_in_directedChoiceDef906 = frozenset([24, 40])
    FOLLOW_40_in_directedChoiceDef911 = frozenset([1])
    FOLLOW_interactionSignatureDef_in_onMessageDef918 = frozenset([45])
    FOLLOW_45_in_onMessageDef920 = frozenset([18, 23, 24, 36, 39, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_activityList_in_onMessageDef922 = frozenset([1])
    FOLLOW_ANNOTATION_in_activityList935 = frozenset([18, 23, 24, 36, 39, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_activityDef_in_activityList940 = frozenset([1, 18, 23, 24, 36, 39, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_49_in_repeatDef950 = frozenset([38, 39])
    FOLLOW_38_in_repeatDef954 = frozenset([24])
    FOLLOW_roleName_in_repeatDef956 = frozenset([34, 38, 39])
    FOLLOW_34_in_repeatDef960 = frozenset([24])
    FOLLOW_roleName_in_repeatDef962 = frozenset([34, 38, 39])
    FOLLOW_blockDef_in_repeatDef970 = frozenset([1])
    FOLLOW_50_in_recBlockDef986 = frozenset([24])
    FOLLOW_labelName_in_recBlockDef988 = frozenset([38, 39])
    FOLLOW_blockDef_in_recBlockDef990 = frozenset([1])
    FOLLOW_ID_in_labelName1007 = frozenset([1])
    FOLLOW_labelName_in_recursionDef1019 = frozenset([1])
    FOLLOW_51_in_endDef1035 = frozenset([1])
    FOLLOW_52_in_runDef1045 = frozenset([24])
    FOLLOW_protocolRefDef_in_runDef1048 = frozenset([36, 41])
    FOLLOW_41_in_runDef1052 = frozenset([24])
    FOLLOW_parameter_in_runDef1055 = frozenset([34, 42])
    FOLLOW_34_in_runDef1059 = frozenset([24])
    FOLLOW_parameter_in_runDef1062 = frozenset([34, 42])
    FOLLOW_42_in_runDef1067 = frozenset([36])
    FOLLOW_36_in_runDef1073 = frozenset([24])
    FOLLOW_roleName_in_runDef1075 = frozenset([1])
    FOLLOW_ID_in_protocolRefDef1083 = frozenset([1, 38])
    FOLLOW_38_in_protocolRefDef1087 = frozenset([24])
    FOLLOW_roleName_in_protocolRefDef1089 = frozenset([1])
    FOLLOW_ID_in_declarationName1100 = frozenset([1])
    FOLLOW_declarationName_in_parameter1108 = frozenset([1])
    FOLLOW_53_in_inlineDef1117 = frozenset([24])
    FOLLOW_protocolRefDef_in_inlineDef1120 = frozenset([1, 41])
    FOLLOW_41_in_inlineDef1124 = frozenset([24])
    FOLLOW_parameter_in_inlineDef1127 = frozenset([34, 42])
    FOLLOW_34_in_inlineDef1131 = frozenset([24])
    FOLLOW_parameter_in_inlineDef1134 = frozenset([34, 42])
    FOLLOW_42_in_inlineDef1139 = frozenset([1])
    FOLLOW_54_in_parallelDef1151 = frozenset([38, 39])
    FOLLOW_blockDef_in_parallelDef1153 = frozenset([1, 55])
    FOLLOW_55_in_parallelDef1157 = frozenset([38, 39])
    FOLLOW_blockDef_in_parallelDef1159 = frozenset([1, 55])
    FOLLOW_56_in_doBlockDef1179 = frozenset([39])
    FOLLOW_39_in_doBlockDef1181 = frozenset([18, 23, 24, 36, 39, 40, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_activityListDef_in_doBlockDef1183 = frozenset([40])
    FOLLOW_40_in_doBlockDef1186 = frozenset([1])
    FOLLOW_57_in_interruptDef1204 = frozenset([58])
    FOLLOW_58_in_interruptDef1206 = frozenset([24])
    FOLLOW_roleName_in_interruptDef1208 = frozenset([39])
    FOLLOW_39_in_interruptDef1210 = frozenset([18, 23, 24, 36, 39, 40, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_activityListDef_in_interruptDef1212 = frozenset([40])
    FOLLOW_40_in_interruptDef1214 = frozenset([1])
    FOLLOW_doBlockDef_in_globalEscapeDef1232 = frozenset([57])
    FOLLOW_interruptDef_in_globalEscapeDef1235 = frozenset([1])
    FOLLOW_59_in_unorderedDef1252 = frozenset([39])
    FOLLOW_39_in_unorderedDef1254 = frozenset([18, 23, 24, 36, 39, 40, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_ANNOTATION_in_unorderedDef1260 = frozenset([18, 23, 24, 36, 39, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_activityDef_in_unorderedDef1265 = frozenset([18, 23, 24, 36, 39, 40, 46, 47, 49, 50, 51, 52, 53, 54, 56, 59])
    FOLLOW_40_in_unorderedDef1270 = frozenset([1])
    FOLLOW_term_in_expr1295 = frozenset([1, 7, 8])
    FOLLOW_set_in_expr1299 = frozenset([27])
    FOLLOW_term_in_expr1310 = frozenset([1, 7, 8])
    FOLLOW_factor_in_term1322 = frozenset([1, 9, 10])
    FOLLOW_set_in_term1326 = frozenset([27])
    FOLLOW_factor_in_term1336 = frozenset([1, 9, 10])
    FOLLOW_NUMBER_in_factor1348 = frozenset([1])



def main(argv, stdin=sys.stdin, stdout=sys.stdout, stderr=sys.stderr):
    from antlr3.main import ParserMain
    main = ParserMain("MonitorLexer", MonitorParser)
    main.stdin = stdin
    main.stdout = stdout
    main.stderr = stderr
    main.execute(argv)


if __name__ == '__main__':
    main(sys.argv)
