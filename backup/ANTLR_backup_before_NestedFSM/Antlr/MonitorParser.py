# $ANTLR 3.1.3 Mar 18, 2009 10:09:25 src/Monitor.g 2011-11-20 16:01:48

import sys
from antlr3 import *
from antlr3.compat import set, frozenset

from antlr3.tree import *



# for convenience in actions
HIDDEN = BaseRecognizer.HIDDEN

# token types
T__29=29
T__28=28
T__27=27
T__26=26
T__25=25
RESV=10
ANNOTATION=17
PARALLEL=15
ID=18
EOF=-1
PROTOCOL=16
ML_COMMENT=23
INTERACTION=4
T__51=51
FULLSTOP=9
PLUS=5
SEND=11
DIGIT=21
T__50=50
T__42=42
T__43=43
T__40=40
T__41=41
T__46=46
T__47=47
T__44=44
T__45=45
LINE_COMMENT=24
T__48=48
T__49=49
RECLABEL=14
NUMBER=20
WHITESPACE=22
MINUS=6
MULT=7
UNORDERED=13
StringLiteral=19
T__30=30
T__31=31
T__32=32
T__33=33
T__34=34
T__35=35
T__36=36
T__37=37
T__38=38
T__39=39
BRANCH=12
DIV=8

# token names
tokenNames = [
    "<invalid>", "<EOR>", "<DOWN>", "<UP>", 
    "INTERACTION", "PLUS", "MINUS", "MULT", "DIV", "FULLSTOP", "RESV", 
    "SEND", "BRANCH", "UNORDERED", "RECLABEL", "PARALLEL", "PROTOCOL", "ANNOTATION", 
    "ID", "StringLiteral", "NUMBER", "DIGIT", "WHITESPACE", "ML_COMMENT", 
    "LINE_COMMENT", "'import'", "'protocol'", "','", "';'", "'from'", "'as'", 
    "'at'", "'{'", "'}'", "'('", "')'", "'role'", "'introduces'", "'to'", 
    "'choice'", "'or'", "':'", "'repeat'", "'rec'", "'end'", "'run'", "'inline'", 
    "'parallel'", "'and'", "'do'", "'interrupt'", "'unordered'"
]




class MonitorParser(Parser):
    grammarFileName = "src/Monitor.g"
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

        self.dfa17 = self.DFA17(
            self, 17,
            eot = self.DFA17_eot,
            eof = self.DFA17_eof,
            min = self.DFA17_min,
            max = self.DFA17_max,
            accept = self.DFA17_accept,
            special = self.DFA17_special,
            transition = self.DFA17_transition
            )

        self.dfa32 = self.DFA32(
            self, 32,
            eot = self.DFA32_eot,
            eof = self.DFA32_eof,
            min = self.DFA32_min,
            max = self.DFA32_max,
            accept = self.DFA32_accept,
            special = self.DFA32_special,
            transition = self.DFA32_transition
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
    # src/Monitor.g:29:1: description : ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef ;
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
                # src/Monitor.g:29:12: ( ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef )
                # src/Monitor.g:29:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef
                pass 
                # src/Monitor.g:29:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )*
                while True: #loop3
                    alt3 = 2
                    alt3 = self.dfa3.predict(self.input)
                    if alt3 == 1:
                        # src/Monitor.g:29:16: ( ANNOTATION )* ( importProtocolStatement | importTypeStatement )
                        pass 
                        # src/Monitor.g:29:16: ( ANNOTATION )*
                        while True: #loop1
                            alt1 = 2
                            LA1_0 = self.input.LA(1)

                            if (LA1_0 == ANNOTATION) :
                                alt1 = 1


                            if alt1 == 1:
                                # src/Monitor.g:29:18: ANNOTATION
                                pass 
                                ANNOTATION1=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_description161) 
                                if self._state.backtracking == 0:
                                    stream_ANNOTATION.add(ANNOTATION1)


                            else:
                                break #loop1
                        # src/Monitor.g:29:32: ( importProtocolStatement | importTypeStatement )
                        alt2 = 2
                        LA2_0 = self.input.LA(1)

                        if (LA2_0 == 25) :
                            LA2_1 = self.input.LA(2)

                            if (LA2_1 == 26) :
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
                            # src/Monitor.g:29:34: importProtocolStatement
                            pass 
                            self._state.following.append(self.FOLLOW_importProtocolStatement_in_description168)
                            importProtocolStatement2 = self.importProtocolStatement()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_importProtocolStatement.add(importProtocolStatement2.tree)


                        elif alt2 == 2:
                            # src/Monitor.g:29:60: importTypeStatement
                            pass 
                            self._state.following.append(self.FOLLOW_importTypeStatement_in_description172)
                            importTypeStatement3 = self.importTypeStatement()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_importTypeStatement.add(importTypeStatement3.tree)





                    else:
                        break #loop3
                # src/Monitor.g:29:85: ( ANNOTATION )*
                while True: #loop4
                    alt4 = 2
                    LA4_0 = self.input.LA(1)

                    if (LA4_0 == ANNOTATION) :
                        alt4 = 1


                    if alt4 == 1:
                        # src/Monitor.g:29:87: ANNOTATION
                        pass 
                        ANNOTATION4=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_description181) 
                        if self._state.backtracking == 0:
                            stream_ANNOTATION.add(ANNOTATION4)


                    else:
                        break #loop4
                self._state.following.append(self.FOLLOW_protocolDef_in_description186)
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
                    # 29:113: -> protocolDef
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
    # src/Monitor.g:31:1: importProtocolStatement : 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' ;
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
                # src/Monitor.g:31:24: ( 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' )
                # src/Monitor.g:31:26: 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';'
                pass 
                root_0 = self._adaptor.nil()

                string_literal6=self.match(self.input, 25, self.FOLLOW_25_in_importProtocolStatement197)
                if self._state.backtracking == 0:

                    string_literal6_tree = self._adaptor.createWithPayload(string_literal6)
                    self._adaptor.addChild(root_0, string_literal6_tree)

                string_literal7=self.match(self.input, 26, self.FOLLOW_26_in_importProtocolStatement199)
                if self._state.backtracking == 0:

                    string_literal7_tree = self._adaptor.createWithPayload(string_literal7)
                    self._adaptor.addChild(root_0, string_literal7_tree)

                self._state.following.append(self.FOLLOW_importProtocolDef_in_importProtocolStatement201)
                importProtocolDef8 = self.importProtocolDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, importProtocolDef8.tree)
                # src/Monitor.g:31:64: ( ',' importProtocolDef )*
                while True: #loop5
                    alt5 = 2
                    LA5_0 = self.input.LA(1)

                    if (LA5_0 == 27) :
                        alt5 = 1


                    if alt5 == 1:
                        # src/Monitor.g:31:66: ',' importProtocolDef
                        pass 
                        char_literal9=self.match(self.input, 27, self.FOLLOW_27_in_importProtocolStatement205)
                        self._state.following.append(self.FOLLOW_importProtocolDef_in_importProtocolStatement208)
                        importProtocolDef10 = self.importProtocolDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, importProtocolDef10.tree)


                    else:
                        break #loop5
                char_literal11=self.match(self.input, 28, self.FOLLOW_28_in_importProtocolStatement213)



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
    # src/Monitor.g:33:1: importProtocolDef : ID 'from' StringLiteral ;
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
                # src/Monitor.g:33:18: ( ID 'from' StringLiteral )
                # src/Monitor.g:33:20: ID 'from' StringLiteral
                pass 
                root_0 = self._adaptor.nil()

                ID12=self.match(self.input, ID, self.FOLLOW_ID_in_importProtocolDef222)
                if self._state.backtracking == 0:

                    ID12_tree = self._adaptor.createWithPayload(ID12)
                    self._adaptor.addChild(root_0, ID12_tree)

                string_literal13=self.match(self.input, 29, self.FOLLOW_29_in_importProtocolDef224)
                StringLiteral14=self.match(self.input, StringLiteral, self.FOLLOW_StringLiteral_in_importProtocolDef227)
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
    # src/Monitor.g:35:1: importTypeStatement : 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' ;
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
                # src/Monitor.g:35:20: ( 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' )
                # src/Monitor.g:35:22: 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';'
                pass 
                root_0 = self._adaptor.nil()

                string_literal15=self.match(self.input, 25, self.FOLLOW_25_in_importTypeStatement240)
                if self._state.backtracking == 0:

                    string_literal15_tree = self._adaptor.createWithPayload(string_literal15)
                    self._adaptor.addChild(root_0, string_literal15_tree)

                # src/Monitor.g:35:31: ( simpleName )?
                alt6 = 2
                LA6_0 = self.input.LA(1)

                if (LA6_0 == ID) :
                    LA6_1 = self.input.LA(2)

                    if ((ID <= LA6_1 <= StringLiteral)) :
                        alt6 = 1
                if alt6 == 1:
                    # src/Monitor.g:35:33: simpleName
                    pass 
                    self._state.following.append(self.FOLLOW_simpleName_in_importTypeStatement244)
                    simpleName16 = self.simpleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, simpleName16.tree)



                self._state.following.append(self.FOLLOW_importTypeDef_in_importTypeStatement249)
                importTypeDef17 = self.importTypeDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, importTypeDef17.tree)
                # src/Monitor.g:35:61: ( ',' importTypeDef )*
                while True: #loop7
                    alt7 = 2
                    LA7_0 = self.input.LA(1)

                    if (LA7_0 == 27) :
                        alt7 = 1


                    if alt7 == 1:
                        # src/Monitor.g:35:63: ',' importTypeDef
                        pass 
                        char_literal18=self.match(self.input, 27, self.FOLLOW_27_in_importTypeStatement253)
                        self._state.following.append(self.FOLLOW_importTypeDef_in_importTypeStatement256)
                        importTypeDef19 = self.importTypeDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, importTypeDef19.tree)


                    else:
                        break #loop7
                # src/Monitor.g:35:85: ( 'from' StringLiteral )?
                alt8 = 2
                LA8_0 = self.input.LA(1)

                if (LA8_0 == 29) :
                    alt8 = 1
                if alt8 == 1:
                    # src/Monitor.g:35:87: 'from' StringLiteral
                    pass 
                    string_literal20=self.match(self.input, 29, self.FOLLOW_29_in_importTypeStatement263)
                    StringLiteral21=self.match(self.input, StringLiteral, self.FOLLOW_StringLiteral_in_importTypeStatement266)
                    if self._state.backtracking == 0:

                        StringLiteral21_tree = self._adaptor.createWithPayload(StringLiteral21)
                        self._adaptor.addChild(root_0, StringLiteral21_tree)




                char_literal22=self.match(self.input, 28, self.FOLLOW_28_in_importTypeStatement271)



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
    # src/Monitor.g:37:1: importTypeDef : ( dataTypeDef 'as' )? ID ;
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
                # src/Monitor.g:37:14: ( ( dataTypeDef 'as' )? ID )
                # src/Monitor.g:37:16: ( dataTypeDef 'as' )? ID
                pass 
                root_0 = self._adaptor.nil()

                # src/Monitor.g:37:16: ( dataTypeDef 'as' )?
                alt9 = 2
                LA9_0 = self.input.LA(1)

                if (LA9_0 == StringLiteral) :
                    alt9 = 1
                if alt9 == 1:
                    # src/Monitor.g:37:18: dataTypeDef 'as'
                    pass 
                    self._state.following.append(self.FOLLOW_dataTypeDef_in_importTypeDef282)
                    dataTypeDef23 = self.dataTypeDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, dataTypeDef23.tree)
                    string_literal24=self.match(self.input, 30, self.FOLLOW_30_in_importTypeDef284)



                ID25=self.match(self.input, ID, self.FOLLOW_ID_in_importTypeDef290)
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
    # src/Monitor.g:39:1: dataTypeDef : StringLiteral ;
    def dataTypeDef(self, ):

        retval = self.dataTypeDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        StringLiteral26 = None

        StringLiteral26_tree = None

        try:
            try:
                # src/Monitor.g:39:12: ( StringLiteral )
                # src/Monitor.g:39:14: StringLiteral
                pass 
                root_0 = self._adaptor.nil()

                StringLiteral26=self.match(self.input, StringLiteral, self.FOLLOW_StringLiteral_in_dataTypeDef298)
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
    # src/Monitor.g:41:1: simpleName : ID ;
    def simpleName(self, ):

        retval = self.simpleName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID27 = None

        ID27_tree = None

        try:
            try:
                # src/Monitor.g:41:11: ( ID )
                # src/Monitor.g:41:13: ID
                pass 
                root_0 = self._adaptor.nil()

                ID27=self.match(self.input, ID, self.FOLLOW_ID_in_simpleName306)
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
    # src/Monitor.g:43:1: protocolDef : 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( PROTOCOL ( protocolBlockDef )+ ) ;
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
        stream_32 = RewriteRuleTokenStream(self._adaptor, "token 32")
        stream_31 = RewriteRuleTokenStream(self._adaptor, "token 31")
        stream_33 = RewriteRuleTokenStream(self._adaptor, "token 33")
        stream_ANNOTATION = RewriteRuleTokenStream(self._adaptor, "token ANNOTATION")
        stream_26 = RewriteRuleTokenStream(self._adaptor, "token 26")
        stream_parameterDefs = RewriteRuleSubtreeStream(self._adaptor, "rule parameterDefs")
        stream_protocolDef = RewriteRuleSubtreeStream(self._adaptor, "rule protocolDef")
        stream_protocolName = RewriteRuleSubtreeStream(self._adaptor, "rule protocolName")
        stream_protocolBlockDef = RewriteRuleSubtreeStream(self._adaptor, "rule protocolBlockDef")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        try:
            try:
                # src/Monitor.g:43:12: ( 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( PROTOCOL ( protocolBlockDef )+ ) )
                # src/Monitor.g:43:14: 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}'
                pass 
                string_literal28=self.match(self.input, 26, self.FOLLOW_26_in_protocolDef314) 
                if self._state.backtracking == 0:
                    stream_26.add(string_literal28)
                self._state.following.append(self.FOLLOW_protocolName_in_protocolDef316)
                protocolName29 = self.protocolName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_protocolName.add(protocolName29.tree)
                # src/Monitor.g:43:38: ( 'at' roleName )?
                alt10 = 2
                LA10_0 = self.input.LA(1)

                if (LA10_0 == 31) :
                    alt10 = 1
                if alt10 == 1:
                    # src/Monitor.g:43:40: 'at' roleName
                    pass 
                    string_literal30=self.match(self.input, 31, self.FOLLOW_31_in_protocolDef320) 
                    if self._state.backtracking == 0:
                        stream_31.add(string_literal30)
                    self._state.following.append(self.FOLLOW_roleName_in_protocolDef322)
                    roleName31 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_roleName.add(roleName31.tree)



                # src/Monitor.g:43:57: ( parameterDefs )?
                alt11 = 2
                LA11_0 = self.input.LA(1)

                if (LA11_0 == 34) :
                    alt11 = 1
                if alt11 == 1:
                    # src/Monitor.g:43:59: parameterDefs
                    pass 
                    self._state.following.append(self.FOLLOW_parameterDefs_in_protocolDef329)
                    parameterDefs32 = self.parameterDefs()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_parameterDefs.add(parameterDefs32.tree)



                char_literal33=self.match(self.input, 32, self.FOLLOW_32_in_protocolDef334) 
                if self._state.backtracking == 0:
                    stream_32.add(char_literal33)
                self._state.following.append(self.FOLLOW_protocolBlockDef_in_protocolDef336)
                protocolBlockDef34 = self.protocolBlockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_protocolBlockDef.add(protocolBlockDef34.tree)
                # src/Monitor.g:43:97: ( ( ANNOTATION )* protocolDef )*
                while True: #loop13
                    alt13 = 2
                    LA13_0 = self.input.LA(1)

                    if (LA13_0 == ANNOTATION or LA13_0 == 26) :
                        alt13 = 1


                    if alt13 == 1:
                        # src/Monitor.g:43:99: ( ANNOTATION )* protocolDef
                        pass 
                        # src/Monitor.g:43:99: ( ANNOTATION )*
                        while True: #loop12
                            alt12 = 2
                            LA12_0 = self.input.LA(1)

                            if (LA12_0 == ANNOTATION) :
                                alt12 = 1


                            if alt12 == 1:
                                # src/Monitor.g:43:101: ANNOTATION
                                pass 
                                ANNOTATION35=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_protocolDef342) 
                                if self._state.backtracking == 0:
                                    stream_ANNOTATION.add(ANNOTATION35)


                            else:
                                break #loop12
                        self._state.following.append(self.FOLLOW_protocolDef_in_protocolDef347)
                        protocolDef36 = self.protocolDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            stream_protocolDef.add(protocolDef36.tree)


                    else:
                        break #loop13
                char_literal37=self.match(self.input, 33, self.FOLLOW_33_in_protocolDef352) 
                if self._state.backtracking == 0:
                    stream_33.add(char_literal37)

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
                    # 44:7: -> ^( PROTOCOL ( protocolBlockDef )+ )
                    # src/Monitor.g:44:10: ^( PROTOCOL ( protocolBlockDef )+ )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(PROTOCOL, "PROTOCOL"), root_1)

                    # src/Monitor.g:44:21: ( protocolBlockDef )+
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
    # src/Monitor.g:46:1: protocolName : ID ;
    def protocolName(self, ):

        retval = self.protocolName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID38 = None

        ID38_tree = None

        try:
            try:
                # src/Monitor.g:46:13: ( ID )
                # src/Monitor.g:46:15: ID
                pass 
                root_0 = self._adaptor.nil()

                ID38=self.match(self.input, ID, self.FOLLOW_ID_in_protocolName374)
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
    # src/Monitor.g:48:1: parameterDefs : '(' parameterDef ( ',' parameterDef )* ')' ;
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
                # src/Monitor.g:48:14: ( '(' parameterDef ( ',' parameterDef )* ')' )
                # src/Monitor.g:48:16: '(' parameterDef ( ',' parameterDef )* ')'
                pass 
                root_0 = self._adaptor.nil()

                char_literal39=self.match(self.input, 34, self.FOLLOW_34_in_parameterDefs382)
                self._state.following.append(self.FOLLOW_parameterDef_in_parameterDefs385)
                parameterDef40 = self.parameterDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, parameterDef40.tree)
                # src/Monitor.g:48:34: ( ',' parameterDef )*
                while True: #loop14
                    alt14 = 2
                    LA14_0 = self.input.LA(1)

                    if (LA14_0 == 27) :
                        alt14 = 1


                    if alt14 == 1:
                        # src/Monitor.g:48:36: ',' parameterDef
                        pass 
                        char_literal41=self.match(self.input, 27, self.FOLLOW_27_in_parameterDefs389)
                        self._state.following.append(self.FOLLOW_parameterDef_in_parameterDefs392)
                        parameterDef42 = self.parameterDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, parameterDef42.tree)


                    else:
                        break #loop14
                char_literal43=self.match(self.input, 35, self.FOLLOW_35_in_parameterDefs397)



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
    # src/Monitor.g:50:1: parameterDef : ( typeReferenceDef | 'role' ) simpleName ;
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
                # src/Monitor.g:50:13: ( ( typeReferenceDef | 'role' ) simpleName )
                # src/Monitor.g:50:15: ( typeReferenceDef | 'role' ) simpleName
                pass 
                root_0 = self._adaptor.nil()

                # src/Monitor.g:50:15: ( typeReferenceDef | 'role' )
                alt15 = 2
                LA15_0 = self.input.LA(1)

                if (LA15_0 == ID) :
                    alt15 = 1
                elif (LA15_0 == 36) :
                    alt15 = 2
                else:
                    if self._state.backtracking > 0:
                        raise BacktrackingFailed

                    nvae = NoViableAltException("", 15, 0, self.input)

                    raise nvae

                if alt15 == 1:
                    # src/Monitor.g:50:17: typeReferenceDef
                    pass 
                    self._state.following.append(self.FOLLOW_typeReferenceDef_in_parameterDef408)
                    typeReferenceDef44 = self.typeReferenceDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, typeReferenceDef44.tree)


                elif alt15 == 2:
                    # src/Monitor.g:50:36: 'role'
                    pass 
                    string_literal45=self.match(self.input, 36, self.FOLLOW_36_in_parameterDef412)
                    if self._state.backtracking == 0:

                        string_literal45_tree = self._adaptor.createWithPayload(string_literal45)
                        self._adaptor.addChild(root_0, string_literal45_tree)




                self._state.following.append(self.FOLLOW_simpleName_in_parameterDef416)
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
    # src/Monitor.g:52:1: protocolBlockDef : activityListDef -> activityListDef ;
    def protocolBlockDef(self, ):

        retval = self.protocolBlockDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        activityListDef47 = None


        stream_activityListDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityListDef")
        try:
            try:
                # src/Monitor.g:52:17: ( activityListDef -> activityListDef )
                # src/Monitor.g:52:19: activityListDef
                pass 
                self._state.following.append(self.FOLLOW_activityListDef_in_protocolBlockDef424)
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
                    # 52:35: -> activityListDef
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
    # src/Monitor.g:54:1: blockDef : '{' activityListDef '}' -> ^( BRANCH activityListDef ) ;
    def blockDef(self, ):

        retval = self.blockDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        char_literal48 = None
        char_literal50 = None
        activityListDef49 = None


        char_literal48_tree = None
        char_literal50_tree = None
        stream_32 = RewriteRuleTokenStream(self._adaptor, "token 32")
        stream_33 = RewriteRuleTokenStream(self._adaptor, "token 33")
        stream_activityListDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityListDef")
        try:
            try:
                # src/Monitor.g:54:9: ( '{' activityListDef '}' -> ^( BRANCH activityListDef ) )
                # src/Monitor.g:54:11: '{' activityListDef '}'
                pass 
                char_literal48=self.match(self.input, 32, self.FOLLOW_32_in_blockDef435) 
                if self._state.backtracking == 0:
                    stream_32.add(char_literal48)
                self._state.following.append(self.FOLLOW_activityListDef_in_blockDef437)
                activityListDef49 = self.activityListDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_activityListDef.add(activityListDef49.tree)
                char_literal50=self.match(self.input, 33, self.FOLLOW_33_in_blockDef439) 
                if self._state.backtracking == 0:
                    stream_33.add(char_literal50)

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
                    # 54:35: -> ^( BRANCH activityListDef )
                    # src/Monitor.g:54:38: ^( BRANCH activityListDef )
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

    class activityListDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.activityListDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "activityListDef"
    # src/Monitor.g:56:1: activityListDef : ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ ;
    def activityListDef(self, ):

        retval = self.activityListDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ANNOTATION51 = None
        activityDef52 = None


        ANNOTATION51_tree = None
        stream_ANNOTATION = RewriteRuleTokenStream(self._adaptor, "token ANNOTATION")
        stream_activityDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityDef")
        try:
            try:
                # src/Monitor.g:56:16: ( ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ )
                # src/Monitor.g:56:18: ( ( ANNOTATION )* activityDef )*
                pass 
                # src/Monitor.g:56:18: ( ( ANNOTATION )* activityDef )*
                while True: #loop17
                    alt17 = 2
                    alt17 = self.dfa17.predict(self.input)
                    if alt17 == 1:
                        # src/Monitor.g:56:20: ( ANNOTATION )* activityDef
                        pass 
                        # src/Monitor.g:56:20: ( ANNOTATION )*
                        while True: #loop16
                            alt16 = 2
                            LA16_0 = self.input.LA(1)

                            if (LA16_0 == ANNOTATION) :
                                alt16 = 1


                            if alt16 == 1:
                                # src/Monitor.g:56:22: ANNOTATION
                                pass 
                                ANNOTATION51=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_activityListDef458) 
                                if self._state.backtracking == 0:
                                    stream_ANNOTATION.add(ANNOTATION51)


                            else:
                                break #loop16
                        self._state.following.append(self.FOLLOW_activityDef_in_activityListDef463)
                        activityDef52 = self.activityDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            stream_activityDef.add(activityDef52.tree)


                    else:
                        break #loop17

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
                    # 56:51: -> ( activityDef )+
                    # src/Monitor.g:56:54: ( activityDef )+
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

    class activityDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.activityDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "activityDef"
    # src/Monitor.g:58:1: activityDef : ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef );
    def activityDef(self, ):

        retval = self.activityDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        char_literal59 = None
        introducesDef53 = None

        interactionDef54 = None

        inlineDef55 = None

        runDef56 = None

        recursionDef57 = None

        endDef58 = None

        choiceDef60 = None

        directedChoiceDef61 = None

        parallelDef62 = None

        repeatDef63 = None

        unorderedDef64 = None

        recBlockDef65 = None

        globalEscapeDef66 = None


        char_literal59_tree = None

        try:
            try:
                # src/Monitor.g:58:12: ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef )
                alt19 = 8
                LA19 = self.input.LA(1)
                if LA19 == ID or LA19 == 44 or LA19 == 45 or LA19 == 46:
                    alt19 = 1
                elif LA19 == 39:
                    alt19 = 2
                elif LA19 == 29 or LA19 == 32 or LA19 == 38:
                    alt19 = 3
                elif LA19 == 47:
                    alt19 = 4
                elif LA19 == 42:
                    alt19 = 5
                elif LA19 == 51:
                    alt19 = 6
                elif LA19 == 43:
                    alt19 = 7
                elif LA19 == 49:
                    alt19 = 8
                else:
                    if self._state.backtracking > 0:
                        raise BacktrackingFailed

                    nvae = NoViableAltException("", 19, 0, self.input)

                    raise nvae

                if alt19 == 1:
                    # src/Monitor.g:58:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';'
                    pass 
                    root_0 = self._adaptor.nil()

                    # src/Monitor.g:58:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef )
                    alt18 = 6
                    LA18 = self.input.LA(1)
                    if LA18 == ID:
                        LA18 = self.input.LA(2)
                        if LA18 == 29 or LA18 == 34 or LA18 == 38:
                            alt18 = 2
                        elif LA18 == 37:
                            alt18 = 1
                        elif LA18 == 28:
                            alt18 = 5
                        else:
                            if self._state.backtracking > 0:
                                raise BacktrackingFailed

                            nvae = NoViableAltException("", 18, 1, self.input)

                            raise nvae

                    elif LA18 == 46:
                        alt18 = 3
                    elif LA18 == 45:
                        alt18 = 4
                    elif LA18 == 44:
                        alt18 = 6
                    else:
                        if self._state.backtracking > 0:
                            raise BacktrackingFailed

                        nvae = NoViableAltException("", 18, 0, self.input)

                        raise nvae

                    if alt18 == 1:
                        # src/Monitor.g:58:16: introducesDef
                        pass 
                        self._state.following.append(self.FOLLOW_introducesDef_in_activityDef480)
                        introducesDef53 = self.introducesDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, introducesDef53.tree)


                    elif alt18 == 2:
                        # src/Monitor.g:58:32: interactionDef
                        pass 
                        self._state.following.append(self.FOLLOW_interactionDef_in_activityDef484)
                        interactionDef54 = self.interactionDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, interactionDef54.tree)


                    elif alt18 == 3:
                        # src/Monitor.g:58:49: inlineDef
                        pass 
                        self._state.following.append(self.FOLLOW_inlineDef_in_activityDef488)
                        inlineDef55 = self.inlineDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, inlineDef55.tree)


                    elif alt18 == 4:
                        # src/Monitor.g:58:61: runDef
                        pass 
                        self._state.following.append(self.FOLLOW_runDef_in_activityDef492)
                        runDef56 = self.runDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, runDef56.tree)


                    elif alt18 == 5:
                        # src/Monitor.g:58:70: recursionDef
                        pass 
                        self._state.following.append(self.FOLLOW_recursionDef_in_activityDef496)
                        recursionDef57 = self.recursionDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, recursionDef57.tree)


                    elif alt18 == 6:
                        # src/Monitor.g:58:85: endDef
                        pass 
                        self._state.following.append(self.FOLLOW_endDef_in_activityDef500)
                        endDef58 = self.endDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, endDef58.tree)



                    char_literal59=self.match(self.input, 28, self.FOLLOW_28_in_activityDef504)


                elif alt19 == 2:
                    # src/Monitor.g:59:4: choiceDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_choiceDef_in_activityDef513)
                    choiceDef60 = self.choiceDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, choiceDef60.tree)


                elif alt19 == 3:
                    # src/Monitor.g:59:16: directedChoiceDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_directedChoiceDef_in_activityDef517)
                    directedChoiceDef61 = self.directedChoiceDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, directedChoiceDef61.tree)


                elif alt19 == 4:
                    # src/Monitor.g:59:36: parallelDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_parallelDef_in_activityDef521)
                    parallelDef62 = self.parallelDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, parallelDef62.tree)


                elif alt19 == 5:
                    # src/Monitor.g:59:50: repeatDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_repeatDef_in_activityDef525)
                    repeatDef63 = self.repeatDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, repeatDef63.tree)


                elif alt19 == 6:
                    # src/Monitor.g:59:62: unorderedDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_unorderedDef_in_activityDef529)
                    unorderedDef64 = self.unorderedDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, unorderedDef64.tree)


                elif alt19 == 7:
                    # src/Monitor.g:60:4: recBlockDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_recBlockDef_in_activityDef536)
                    recBlockDef65 = self.recBlockDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, recBlockDef65.tree)


                elif alt19 == 8:
                    # src/Monitor.g:60:18: globalEscapeDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._state.following.append(self.FOLLOW_globalEscapeDef_in_activityDef540)
                    globalEscapeDef66 = self.globalEscapeDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, globalEscapeDef66.tree)


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
    # src/Monitor.g:62:1: introducesDef : roleDef 'introduces' roleDef ( ',' roleDef )* ;
    def introducesDef(self, ):

        retval = self.introducesDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal68 = None
        char_literal70 = None
        roleDef67 = None

        roleDef69 = None

        roleDef71 = None


        string_literal68_tree = None
        char_literal70_tree = None

        try:
            try:
                # src/Monitor.g:62:14: ( roleDef 'introduces' roleDef ( ',' roleDef )* )
                # src/Monitor.g:62:16: roleDef 'introduces' roleDef ( ',' roleDef )*
                pass 
                root_0 = self._adaptor.nil()

                self._state.following.append(self.FOLLOW_roleDef_in_introducesDef548)
                roleDef67 = self.roleDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, roleDef67.tree)
                string_literal68=self.match(self.input, 37, self.FOLLOW_37_in_introducesDef550)
                if self._state.backtracking == 0:

                    string_literal68_tree = self._adaptor.createWithPayload(string_literal68)
                    self._adaptor.addChild(root_0, string_literal68_tree)

                self._state.following.append(self.FOLLOW_roleDef_in_introducesDef552)
                roleDef69 = self.roleDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, roleDef69.tree)
                # src/Monitor.g:62:45: ( ',' roleDef )*
                while True: #loop20
                    alt20 = 2
                    LA20_0 = self.input.LA(1)

                    if (LA20_0 == 27) :
                        alt20 = 1


                    if alt20 == 1:
                        # src/Monitor.g:62:47: ',' roleDef
                        pass 
                        char_literal70=self.match(self.input, 27, self.FOLLOW_27_in_introducesDef556)
                        if self._state.backtracking == 0:

                            char_literal70_tree = self._adaptor.createWithPayload(char_literal70)
                            self._adaptor.addChild(root_0, char_literal70_tree)

                        self._state.following.append(self.FOLLOW_roleDef_in_introducesDef558)
                        roleDef71 = self.roleDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, roleDef71.tree)


                    else:
                        break #loop20



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
    # src/Monitor.g:64:1: roleDef : ID -> ID ;
    def roleDef(self, ):

        retval = self.roleDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID72 = None

        ID72_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            try:
                # src/Monitor.g:64:8: ( ID -> ID )
                # src/Monitor.g:64:10: ID
                pass 
                ID72=self.match(self.input, ID, self.FOLLOW_ID_in_roleDef569) 
                if self._state.backtracking == 0:
                    stream_ID.add(ID72)

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
                    # 64:13: -> ID
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
    # src/Monitor.g:66:1: roleName : ID -> ID ;
    def roleName(self, ):

        retval = self.roleName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID73 = None

        ID73_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            try:
                # src/Monitor.g:66:9: ( ID -> ID )
                # src/Monitor.g:66:11: ID
                pass 
                ID73=self.match(self.input, ID, self.FOLLOW_ID_in_roleName580) 
                if self._state.backtracking == 0:
                    stream_ID.add(ID73)

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
                    # 66:14: -> ID
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
    # src/Monitor.g:68:1: typeReferenceDef : ID -> ID ;
    def typeReferenceDef(self, ):

        retval = self.typeReferenceDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID74 = None

        ID74_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            try:
                # src/Monitor.g:68:17: ( ID -> ID )
                # src/Monitor.g:68:19: ID
                pass 
                ID74=self.match(self.input, ID, self.FOLLOW_ID_in_typeReferenceDef591) 
                if self._state.backtracking == 0:
                    stream_ID.add(ID74)

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
                    # 68:22: -> ID
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
    # src/Monitor.g:70:1: interactionSignatureDef : ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' ) ;
    def interactionSignatureDef(self, ):

        retval = self.interactionSignatureDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID76 = None
        char_literal77 = None
        char_literal79 = None
        char_literal81 = None
        typeReferenceDef75 = None

        typeReferenceDef78 = None

        typeReferenceDef80 = None


        ID76_tree = None
        char_literal77_tree = None
        char_literal79_tree = None
        char_literal81_tree = None

        try:
            try:
                # src/Monitor.g:70:24: ( ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' ) )
                # src/Monitor.g:70:26: ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' )
                pass 
                root_0 = self._adaptor.nil()

                # src/Monitor.g:70:26: ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' )
                alt23 = 2
                LA23_0 = self.input.LA(1)

                if (LA23_0 == ID) :
                    LA23_1 = self.input.LA(2)

                    if (LA23_1 == 34) :
                        alt23 = 2
                    elif (LA23_1 == 29 or LA23_1 == 38 or LA23_1 == 41) :
                        alt23 = 1
                    else:
                        if self._state.backtracking > 0:
                            raise BacktrackingFailed

                        nvae = NoViableAltException("", 23, 1, self.input)

                        raise nvae

                else:
                    if self._state.backtracking > 0:
                        raise BacktrackingFailed

                    nvae = NoViableAltException("", 23, 0, self.input)

                    raise nvae

                if alt23 == 1:
                    # src/Monitor.g:70:28: typeReferenceDef
                    pass 
                    self._state.following.append(self.FOLLOW_typeReferenceDef_in_interactionSignatureDef605)
                    typeReferenceDef75 = self.typeReferenceDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, typeReferenceDef75.tree)


                elif alt23 == 2:
                    # src/Monitor.g:70:47: ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')'
                    pass 
                    ID76=self.match(self.input, ID, self.FOLLOW_ID_in_interactionSignatureDef609)
                    if self._state.backtracking == 0:

                        ID76_tree = self._adaptor.createWithPayload(ID76)
                        self._adaptor.addChild(root_0, ID76_tree)

                    char_literal77=self.match(self.input, 34, self.FOLLOW_34_in_interactionSignatureDef611)
                    # src/Monitor.g:70:55: ( typeReferenceDef ( ',' typeReferenceDef )* )?
                    alt22 = 2
                    LA22_0 = self.input.LA(1)

                    if (LA22_0 == ID) :
                        alt22 = 1
                    if alt22 == 1:
                        # src/Monitor.g:70:57: typeReferenceDef ( ',' typeReferenceDef )*
                        pass 
                        self._state.following.append(self.FOLLOW_typeReferenceDef_in_interactionSignatureDef616)
                        typeReferenceDef78 = self.typeReferenceDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, typeReferenceDef78.tree)
                        # src/Monitor.g:70:74: ( ',' typeReferenceDef )*
                        while True: #loop21
                            alt21 = 2
                            LA21_0 = self.input.LA(1)

                            if (LA21_0 == 27) :
                                alt21 = 1


                            if alt21 == 1:
                                # src/Monitor.g:70:76: ',' typeReferenceDef
                                pass 
                                char_literal79=self.match(self.input, 27, self.FOLLOW_27_in_interactionSignatureDef620)
                                self._state.following.append(self.FOLLOW_typeReferenceDef_in_interactionSignatureDef623)
                                typeReferenceDef80 = self.typeReferenceDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, typeReferenceDef80.tree)


                            else:
                                break #loop21



                    char_literal81=self.match(self.input, 35, self.FOLLOW_35_in_interactionSignatureDef631)






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

    class interactionDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.interactionDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "interactionDef"
    # src/Monitor.g:73:1: interactionDef : interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) ) ;
    def interactionDef(self, ):

        retval = self.interactionDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal83 = None
        string_literal84 = None
        role = None

        interactionSignatureDef82 = None

        roleName85 = None


        string_literal83_tree = None
        string_literal84_tree = None
        stream_29 = RewriteRuleTokenStream(self._adaptor, "token 29")
        stream_38 = RewriteRuleTokenStream(self._adaptor, "token 38")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        stream_interactionSignatureDef = RewriteRuleSubtreeStream(self._adaptor, "rule interactionSignatureDef")
        try:
            try:
                # src/Monitor.g:73:15: ( interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) ) )
                # src/Monitor.g:74:7: interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) )
                pass 
                self._state.following.append(self.FOLLOW_interactionSignatureDef_in_interactionDef649)
                interactionSignatureDef82 = self.interactionSignatureDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_interactionSignatureDef.add(interactionSignatureDef82.tree)
                # src/Monitor.g:74:31: ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) )
                alt24 = 2
                LA24_0 = self.input.LA(1)

                if (LA24_0 == 29) :
                    alt24 = 1
                elif (LA24_0 == 38) :
                    alt24 = 2
                else:
                    if self._state.backtracking > 0:
                        raise BacktrackingFailed

                    nvae = NoViableAltException("", 24, 0, self.input)

                    raise nvae

                if alt24 == 1:
                    # src/Monitor.g:75:3: 'from' role= roleName
                    pass 
                    string_literal83=self.match(self.input, 29, self.FOLLOW_29_in_interactionDef655) 
                    if self._state.backtracking == 0:
                        stream_29.add(string_literal83)
                    self._state.following.append(self.FOLLOW_roleName_in_interactionDef660)
                    role = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_roleName.add(role.tree)

                    # AST Rewrite
                    # elements: role, interactionSignatureDef
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
                        # 75:26: -> ^( RESV interactionSignatureDef $role)
                        # src/Monitor.g:75:29: ^( RESV interactionSignatureDef $role)
                        root_1 = self._adaptor.nil()
                        root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(RESV, "RESV"), root_1)

                        self._adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree())
                        self._adaptor.addChild(root_1, stream_role.nextTree())

                        self._adaptor.addChild(root_0, root_1)



                        retval.tree = root_0


                elif alt24 == 2:
                    # src/Monitor.g:76:10: 'to' roleName
                    pass 
                    string_literal84=self.match(self.input, 38, self.FOLLOW_38_in_interactionDef684) 
                    if self._state.backtracking == 0:
                        stream_38.add(string_literal84)
                    self._state.following.append(self.FOLLOW_roleName_in_interactionDef686)
                    roleName85 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_roleName.add(roleName85.tree)

                    # AST Rewrite
                    # elements: interactionSignatureDef, roleName
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
                        # 76:25: -> ^( SEND interactionSignatureDef roleName )
                        # src/Monitor.g:76:28: ^( SEND interactionSignatureDef roleName )
                        root_1 = self._adaptor.nil()
                        root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(SEND, "SEND"), root_1)

                        self._adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree())
                        self._adaptor.addChild(root_1, stream_roleName.nextTree())

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
    # src/Monitor.g:78:1: choiceDef : 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) ;
    def choiceDef(self, ):

        retval = self.choiceDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal86 = None
        string_literal87 = None
        string_literal90 = None
        roleName88 = None

        blockDef89 = None

        blockDef91 = None


        string_literal86_tree = None
        string_literal87_tree = None
        string_literal90_tree = None
        stream_31 = RewriteRuleTokenStream(self._adaptor, "token 31")
        stream_40 = RewriteRuleTokenStream(self._adaptor, "token 40")
        stream_39 = RewriteRuleTokenStream(self._adaptor, "token 39")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            try:
                # src/Monitor.g:78:10: ( 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) )
                # src/Monitor.g:78:12: 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )*
                pass 
                string_literal86=self.match(self.input, 39, self.FOLLOW_39_in_choiceDef705) 
                if self._state.backtracking == 0:
                    stream_39.add(string_literal86)
                # src/Monitor.g:78:21: ( 'at' roleName )?
                alt25 = 2
                LA25_0 = self.input.LA(1)

                if (LA25_0 == 31) :
                    alt25 = 1
                if alt25 == 1:
                    # src/Monitor.g:78:23: 'at' roleName
                    pass 
                    string_literal87=self.match(self.input, 31, self.FOLLOW_31_in_choiceDef709) 
                    if self._state.backtracking == 0:
                        stream_31.add(string_literal87)
                    self._state.following.append(self.FOLLOW_roleName_in_choiceDef711)
                    roleName88 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_roleName.add(roleName88.tree)



                self._state.following.append(self.FOLLOW_blockDef_in_choiceDef716)
                blockDef89 = self.blockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_blockDef.add(blockDef89.tree)
                # src/Monitor.g:78:49: ( 'or' blockDef )*
                while True: #loop26
                    alt26 = 2
                    LA26_0 = self.input.LA(1)

                    if (LA26_0 == 40) :
                        alt26 = 1


                    if alt26 == 1:
                        # src/Monitor.g:78:51: 'or' blockDef
                        pass 
                        string_literal90=self.match(self.input, 40, self.FOLLOW_40_in_choiceDef720) 
                        if self._state.backtracking == 0:
                            stream_40.add(string_literal90)
                        self._state.following.append(self.FOLLOW_blockDef_in_choiceDef722)
                        blockDef91 = self.blockDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            stream_blockDef.add(blockDef91.tree)


                    else:
                        break #loop26

                # AST Rewrite
                # elements: blockDef, 39
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
                    # 78:68: -> ^( 'choice' ( blockDef )+ )
                    # src/Monitor.g:78:71: ^( 'choice' ( blockDef )+ )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(stream_39.nextNode(), root_1)

                    # src/Monitor.g:78:82: ( blockDef )+
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
    # src/Monitor.g:80:1: directedChoiceDef : ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' ;
    def directedChoiceDef(self, ):

        retval = self.directedChoiceDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal92 = None
        string_literal94 = None
        char_literal96 = None
        char_literal98 = None
        char_literal100 = None
        roleName93 = None

        roleName95 = None

        roleName97 = None

        onMessageDef99 = None


        string_literal92_tree = None
        string_literal94_tree = None
        char_literal96_tree = None
        char_literal98_tree = None
        char_literal100_tree = None

        try:
            try:
                # src/Monitor.g:80:18: ( ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' )
                # src/Monitor.g:80:20: ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}'
                pass 
                root_0 = self._adaptor.nil()

                # src/Monitor.g:80:20: ( 'from' roleName )?
                alt27 = 2
                LA27_0 = self.input.LA(1)

                if (LA27_0 == 29) :
                    alt27 = 1
                if alt27 == 1:
                    # src/Monitor.g:80:22: 'from' roleName
                    pass 
                    string_literal92=self.match(self.input, 29, self.FOLLOW_29_in_directedChoiceDef743)
                    if self._state.backtracking == 0:

                        string_literal92_tree = self._adaptor.createWithPayload(string_literal92)
                        self._adaptor.addChild(root_0, string_literal92_tree)

                    self._state.following.append(self.FOLLOW_roleName_in_directedChoiceDef745)
                    roleName93 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, roleName93.tree)



                # src/Monitor.g:80:41: ( 'to' roleName ( ',' roleName )* )?
                alt29 = 2
                LA29_0 = self.input.LA(1)

                if (LA29_0 == 38) :
                    alt29 = 1
                if alt29 == 1:
                    # src/Monitor.g:80:43: 'to' roleName ( ',' roleName )*
                    pass 
                    string_literal94=self.match(self.input, 38, self.FOLLOW_38_in_directedChoiceDef752)
                    if self._state.backtracking == 0:

                        string_literal94_tree = self._adaptor.createWithPayload(string_literal94)
                        self._adaptor.addChild(root_0, string_literal94_tree)

                    self._state.following.append(self.FOLLOW_roleName_in_directedChoiceDef754)
                    roleName95 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, roleName95.tree)
                    # src/Monitor.g:80:57: ( ',' roleName )*
                    while True: #loop28
                        alt28 = 2
                        LA28_0 = self.input.LA(1)

                        if (LA28_0 == 27) :
                            alt28 = 1


                        if alt28 == 1:
                            # src/Monitor.g:80:59: ',' roleName
                            pass 
                            char_literal96=self.match(self.input, 27, self.FOLLOW_27_in_directedChoiceDef758)
                            self._state.following.append(self.FOLLOW_roleName_in_directedChoiceDef761)
                            roleName97 = self.roleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, roleName97.tree)


                        else:
                            break #loop28



                char_literal98=self.match(self.input, 32, self.FOLLOW_32_in_directedChoiceDef769)
                if self._state.backtracking == 0:

                    char_literal98_tree = self._adaptor.createWithPayload(char_literal98)
                    self._adaptor.addChild(root_0, char_literal98_tree)

                # src/Monitor.g:80:83: ( onMessageDef )+
                cnt30 = 0
                while True: #loop30
                    alt30 = 2
                    LA30_0 = self.input.LA(1)

                    if (LA30_0 == ID) :
                        alt30 = 1


                    if alt30 == 1:
                        # src/Monitor.g:80:85: onMessageDef
                        pass 
                        self._state.following.append(self.FOLLOW_onMessageDef_in_directedChoiceDef773)
                        onMessageDef99 = self.onMessageDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, onMessageDef99.tree)


                    else:
                        if cnt30 >= 1:
                            break #loop30

                        if self._state.backtracking > 0:
                            raise BacktrackingFailed

                        eee = EarlyExitException(30, self.input)
                        raise eee

                    cnt30 += 1
                char_literal100=self.match(self.input, 33, self.FOLLOW_33_in_directedChoiceDef778)
                if self._state.backtracking == 0:

                    char_literal100_tree = self._adaptor.createWithPayload(char_literal100)
                    self._adaptor.addChild(root_0, char_literal100_tree)




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
    # src/Monitor.g:82:1: onMessageDef : interactionSignatureDef ':' activityList ;
    def onMessageDef(self, ):

        retval = self.onMessageDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        char_literal102 = None
        interactionSignatureDef101 = None

        activityList103 = None


        char_literal102_tree = None

        try:
            try:
                # src/Monitor.g:82:13: ( interactionSignatureDef ':' activityList )
                # src/Monitor.g:82:15: interactionSignatureDef ':' activityList
                pass 
                root_0 = self._adaptor.nil()

                self._state.following.append(self.FOLLOW_interactionSignatureDef_in_onMessageDef785)
                interactionSignatureDef101 = self.interactionSignatureDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, interactionSignatureDef101.tree)
                char_literal102=self.match(self.input, 41, self.FOLLOW_41_in_onMessageDef787)
                if self._state.backtracking == 0:

                    char_literal102_tree = self._adaptor.createWithPayload(char_literal102)
                    self._adaptor.addChild(root_0, char_literal102_tree)

                self._state.following.append(self.FOLLOW_activityList_in_onMessageDef789)
                activityList103 = self.activityList()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, activityList103.tree)



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
    # src/Monitor.g:84:1: activityList : ( ( ANNOTATION )* activityDef )* ;
    def activityList(self, ):

        retval = self.activityList_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ANNOTATION104 = None
        activityDef105 = None


        ANNOTATION104_tree = None

        try:
            try:
                # src/Monitor.g:84:13: ( ( ( ANNOTATION )* activityDef )* )
                # src/Monitor.g:84:15: ( ( ANNOTATION )* activityDef )*
                pass 
                root_0 = self._adaptor.nil()

                # src/Monitor.g:84:15: ( ( ANNOTATION )* activityDef )*
                while True: #loop32
                    alt32 = 2
                    alt32 = self.dfa32.predict(self.input)
                    if alt32 == 1:
                        # src/Monitor.g:84:17: ( ANNOTATION )* activityDef
                        pass 
                        # src/Monitor.g:84:17: ( ANNOTATION )*
                        while True: #loop31
                            alt31 = 2
                            LA31_0 = self.input.LA(1)

                            if (LA31_0 == ANNOTATION) :
                                alt31 = 1


                            if alt31 == 1:
                                # src/Monitor.g:84:19: ANNOTATION
                                pass 
                                ANNOTATION104=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_activityList802)
                                if self._state.backtracking == 0:

                                    ANNOTATION104_tree = self._adaptor.createWithPayload(ANNOTATION104)
                                    self._adaptor.addChild(root_0, ANNOTATION104_tree)



                            else:
                                break #loop31
                        self._state.following.append(self.FOLLOW_activityDef_in_activityList807)
                        activityDef105 = self.activityDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, activityDef105.tree)


                    else:
                        break #loop32



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
    # src/Monitor.g:86:1: repeatDef : 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) ;
    def repeatDef(self, ):

        retval = self.repeatDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal106 = None
        string_literal107 = None
        char_literal109 = None
        roleName108 = None

        roleName110 = None

        blockDef111 = None


        string_literal106_tree = None
        string_literal107_tree = None
        char_literal109_tree = None
        stream_42 = RewriteRuleTokenStream(self._adaptor, "token 42")
        stream_31 = RewriteRuleTokenStream(self._adaptor, "token 31")
        stream_27 = RewriteRuleTokenStream(self._adaptor, "token 27")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            try:
                # src/Monitor.g:86:10: ( 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) )
                # src/Monitor.g:86:12: 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef
                pass 
                string_literal106=self.match(self.input, 42, self.FOLLOW_42_in_repeatDef817) 
                if self._state.backtracking == 0:
                    stream_42.add(string_literal106)
                # src/Monitor.g:86:21: ( 'at' roleName ( ',' roleName )* )?
                alt34 = 2
                LA34_0 = self.input.LA(1)

                if (LA34_0 == 31) :
                    alt34 = 1
                if alt34 == 1:
                    # src/Monitor.g:86:23: 'at' roleName ( ',' roleName )*
                    pass 
                    string_literal107=self.match(self.input, 31, self.FOLLOW_31_in_repeatDef821) 
                    if self._state.backtracking == 0:
                        stream_31.add(string_literal107)
                    self._state.following.append(self.FOLLOW_roleName_in_repeatDef823)
                    roleName108 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_roleName.add(roleName108.tree)
                    # src/Monitor.g:86:37: ( ',' roleName )*
                    while True: #loop33
                        alt33 = 2
                        LA33_0 = self.input.LA(1)

                        if (LA33_0 == 27) :
                            alt33 = 1


                        if alt33 == 1:
                            # src/Monitor.g:86:39: ',' roleName
                            pass 
                            char_literal109=self.match(self.input, 27, self.FOLLOW_27_in_repeatDef827) 
                            if self._state.backtracking == 0:
                                stream_27.add(char_literal109)
                            self._state.following.append(self.FOLLOW_roleName_in_repeatDef829)
                            roleName110 = self.roleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_roleName.add(roleName110.tree)


                        else:
                            break #loop33



                self._state.following.append(self.FOLLOW_blockDef_in_repeatDef837)
                blockDef111 = self.blockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_blockDef.add(blockDef111.tree)

                # AST Rewrite
                # elements: 42, blockDef
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
                    # 86:68: -> ^( 'repeat' blockDef )
                    # src/Monitor.g:86:71: ^( 'repeat' blockDef )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(stream_42.nextNode(), root_1)

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
    # src/Monitor.g:88:1: recBlockDef : 'rec' labelName blockDef -> ^( 'rec' labelName blockDef ) ;
    def recBlockDef(self, ):

        retval = self.recBlockDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal112 = None
        labelName113 = None

        blockDef114 = None


        string_literal112_tree = None
        stream_43 = RewriteRuleTokenStream(self._adaptor, "token 43")
        stream_labelName = RewriteRuleSubtreeStream(self._adaptor, "rule labelName")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            try:
                # src/Monitor.g:88:12: ( 'rec' labelName blockDef -> ^( 'rec' labelName blockDef ) )
                # src/Monitor.g:88:14: 'rec' labelName blockDef
                pass 
                string_literal112=self.match(self.input, 43, self.FOLLOW_43_in_recBlockDef853) 
                if self._state.backtracking == 0:
                    stream_43.add(string_literal112)
                self._state.following.append(self.FOLLOW_labelName_in_recBlockDef855)
                labelName113 = self.labelName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_labelName.add(labelName113.tree)
                self._state.following.append(self.FOLLOW_blockDef_in_recBlockDef857)
                blockDef114 = self.blockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_blockDef.add(blockDef114.tree)

                # AST Rewrite
                # elements: blockDef, 43, labelName
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
                    # 88:39: -> ^( 'rec' labelName blockDef )
                    # src/Monitor.g:88:42: ^( 'rec' labelName blockDef )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(stream_43.nextNode(), root_1)

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
    # src/Monitor.g:90:1: labelName : ID -> ID ;
    def labelName(self, ):

        retval = self.labelName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID115 = None

        ID115_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            try:
                # src/Monitor.g:90:10: ( ID -> ID )
                # src/Monitor.g:90:12: ID
                pass 
                ID115=self.match(self.input, ID, self.FOLLOW_ID_in_labelName874) 
                if self._state.backtracking == 0:
                    stream_ID.add(ID115)

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
                    # 90:15: -> ID
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
    # src/Monitor.g:92:1: recursionDef : labelName -> ^( RECLABEL labelName ) ;
    def recursionDef(self, ):

        retval = self.recursionDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        labelName116 = None


        stream_labelName = RewriteRuleSubtreeStream(self._adaptor, "rule labelName")
        try:
            try:
                # src/Monitor.g:92:13: ( labelName -> ^( RECLABEL labelName ) )
                # src/Monitor.g:92:15: labelName
                pass 
                self._state.following.append(self.FOLLOW_labelName_in_recursionDef886)
                labelName116 = self.labelName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_labelName.add(labelName116.tree)

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
                    # 92:25: -> ^( RECLABEL labelName )
                    # src/Monitor.g:92:28: ^( RECLABEL labelName )
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
    # src/Monitor.g:95:1: endDef : 'end' ;
    def endDef(self, ):

        retval = self.endDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal117 = None

        string_literal117_tree = None

        try:
            try:
                # src/Monitor.g:95:7: ( 'end' )
                # src/Monitor.g:95:9: 'end'
                pass 
                root_0 = self._adaptor.nil()

                string_literal117=self.match(self.input, 44, self.FOLLOW_44_in_endDef902)
                if self._state.backtracking == 0:

                    string_literal117_tree = self._adaptor.createWithPayload(string_literal117)
                    root_0 = self._adaptor.becomeRoot(string_literal117_tree, root_0)




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
    # src/Monitor.g:98:1: runDef : 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName ;
    def runDef(self, ):

        retval = self.runDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal118 = None
        char_literal120 = None
        char_literal122 = None
        char_literal124 = None
        string_literal125 = None
        protocolRefDef119 = None

        parameter121 = None

        parameter123 = None

        roleName126 = None


        string_literal118_tree = None
        char_literal120_tree = None
        char_literal122_tree = None
        char_literal124_tree = None
        string_literal125_tree = None

        try:
            try:
                # src/Monitor.g:98:7: ( 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName )
                # src/Monitor.g:98:9: 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName
                pass 
                root_0 = self._adaptor.nil()

                string_literal118=self.match(self.input, 45, self.FOLLOW_45_in_runDef912)
                if self._state.backtracking == 0:

                    string_literal118_tree = self._adaptor.createWithPayload(string_literal118)
                    root_0 = self._adaptor.becomeRoot(string_literal118_tree, root_0)

                self._state.following.append(self.FOLLOW_protocolRefDef_in_runDef915)
                protocolRefDef119 = self.protocolRefDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, protocolRefDef119.tree)
                # src/Monitor.g:98:31: ( '(' parameter ( ',' parameter )* ')' )?
                alt36 = 2
                LA36_0 = self.input.LA(1)

                if (LA36_0 == 34) :
                    alt36 = 1
                if alt36 == 1:
                    # src/Monitor.g:98:33: '(' parameter ( ',' parameter )* ')'
                    pass 
                    char_literal120=self.match(self.input, 34, self.FOLLOW_34_in_runDef919)
                    self._state.following.append(self.FOLLOW_parameter_in_runDef922)
                    parameter121 = self.parameter()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, parameter121.tree)
                    # src/Monitor.g:98:48: ( ',' parameter )*
                    while True: #loop35
                        alt35 = 2
                        LA35_0 = self.input.LA(1)

                        if (LA35_0 == 27) :
                            alt35 = 1


                        if alt35 == 1:
                            # src/Monitor.g:98:50: ',' parameter
                            pass 
                            char_literal122=self.match(self.input, 27, self.FOLLOW_27_in_runDef926)
                            self._state.following.append(self.FOLLOW_parameter_in_runDef929)
                            parameter123 = self.parameter()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, parameter123.tree)


                        else:
                            break #loop35
                    char_literal124=self.match(self.input, 35, self.FOLLOW_35_in_runDef934)



                string_literal125=self.match(self.input, 29, self.FOLLOW_29_in_runDef940)
                if self._state.backtracking == 0:

                    string_literal125_tree = self._adaptor.createWithPayload(string_literal125)
                    self._adaptor.addChild(root_0, string_literal125_tree)

                self._state.following.append(self.FOLLOW_roleName_in_runDef942)
                roleName126 = self.roleName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, roleName126.tree)



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
    # src/Monitor.g:100:1: protocolRefDef : ID ( 'at' roleName )? ;
    def protocolRefDef(self, ):

        retval = self.protocolRefDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID127 = None
        string_literal128 = None
        roleName129 = None


        ID127_tree = None
        string_literal128_tree = None

        try:
            try:
                # src/Monitor.g:100:15: ( ID ( 'at' roleName )? )
                # src/Monitor.g:100:17: ID ( 'at' roleName )?
                pass 
                root_0 = self._adaptor.nil()

                ID127=self.match(self.input, ID, self.FOLLOW_ID_in_protocolRefDef950)
                if self._state.backtracking == 0:

                    ID127_tree = self._adaptor.createWithPayload(ID127)
                    self._adaptor.addChild(root_0, ID127_tree)

                # src/Monitor.g:100:20: ( 'at' roleName )?
                alt37 = 2
                LA37_0 = self.input.LA(1)

                if (LA37_0 == 31) :
                    alt37 = 1
                if alt37 == 1:
                    # src/Monitor.g:100:22: 'at' roleName
                    pass 
                    string_literal128=self.match(self.input, 31, self.FOLLOW_31_in_protocolRefDef954)
                    if self._state.backtracking == 0:

                        string_literal128_tree = self._adaptor.createWithPayload(string_literal128)
                        self._adaptor.addChild(root_0, string_literal128_tree)

                    self._state.following.append(self.FOLLOW_roleName_in_protocolRefDef956)
                    roleName129 = self.roleName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, roleName129.tree)






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
    # src/Monitor.g:102:1: declarationName : ID ;
    def declarationName(self, ):

        retval = self.declarationName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID130 = None

        ID130_tree = None

        try:
            try:
                # src/Monitor.g:102:16: ( ID )
                # src/Monitor.g:102:18: ID
                pass 
                root_0 = self._adaptor.nil()

                ID130=self.match(self.input, ID, self.FOLLOW_ID_in_declarationName967)
                if self._state.backtracking == 0:

                    ID130_tree = self._adaptor.createWithPayload(ID130)
                    self._adaptor.addChild(root_0, ID130_tree)




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
    # src/Monitor.g:104:1: parameter : declarationName ;
    def parameter(self, ):

        retval = self.parameter_return()
        retval.start = self.input.LT(1)

        root_0 = None

        declarationName131 = None



        try:
            try:
                # src/Monitor.g:104:10: ( declarationName )
                # src/Monitor.g:104:12: declarationName
                pass 
                root_0 = self._adaptor.nil()

                self._state.following.append(self.FOLLOW_declarationName_in_parameter975)
                declarationName131 = self.declarationName()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, declarationName131.tree)



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
    # src/Monitor.g:107:1: inlineDef : 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? ;
    def inlineDef(self, ):

        retval = self.inlineDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal132 = None
        char_literal134 = None
        char_literal136 = None
        char_literal138 = None
        protocolRefDef133 = None

        parameter135 = None

        parameter137 = None


        string_literal132_tree = None
        char_literal134_tree = None
        char_literal136_tree = None
        char_literal138_tree = None

        try:
            try:
                # src/Monitor.g:107:10: ( 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? )
                # src/Monitor.g:107:12: 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )?
                pass 
                root_0 = self._adaptor.nil()

                string_literal132=self.match(self.input, 46, self.FOLLOW_46_in_inlineDef984)
                if self._state.backtracking == 0:

                    string_literal132_tree = self._adaptor.createWithPayload(string_literal132)
                    root_0 = self._adaptor.becomeRoot(string_literal132_tree, root_0)

                self._state.following.append(self.FOLLOW_protocolRefDef_in_inlineDef987)
                protocolRefDef133 = self.protocolRefDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, protocolRefDef133.tree)
                # src/Monitor.g:107:37: ( '(' parameter ( ',' parameter )* ')' )?
                alt39 = 2
                LA39_0 = self.input.LA(1)

                if (LA39_0 == 34) :
                    alt39 = 1
                if alt39 == 1:
                    # src/Monitor.g:107:39: '(' parameter ( ',' parameter )* ')'
                    pass 
                    char_literal134=self.match(self.input, 34, self.FOLLOW_34_in_inlineDef991)
                    self._state.following.append(self.FOLLOW_parameter_in_inlineDef994)
                    parameter135 = self.parameter()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, parameter135.tree)
                    # src/Monitor.g:107:54: ( ',' parameter )*
                    while True: #loop38
                        alt38 = 2
                        LA38_0 = self.input.LA(1)

                        if (LA38_0 == 27) :
                            alt38 = 1


                        if alt38 == 1:
                            # src/Monitor.g:107:56: ',' parameter
                            pass 
                            char_literal136=self.match(self.input, 27, self.FOLLOW_27_in_inlineDef998)
                            self._state.following.append(self.FOLLOW_parameter_in_inlineDef1001)
                            parameter137 = self.parameter()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, parameter137.tree)


                        else:
                            break #loop38
                    char_literal138=self.match(self.input, 35, self.FOLLOW_35_in_inlineDef1006)






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
    # src/Monitor.g:109:1: parallelDef : 'parallel' blockDef ( 'and' blockDef )* -> ^( PARALLEL ( blockDef )+ ) ;
    def parallelDef(self, ):

        retval = self.parallelDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal139 = None
        string_literal141 = None
        blockDef140 = None

        blockDef142 = None


        string_literal139_tree = None
        string_literal141_tree = None
        stream_48 = RewriteRuleTokenStream(self._adaptor, "token 48")
        stream_47 = RewriteRuleTokenStream(self._adaptor, "token 47")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            try:
                # src/Monitor.g:109:12: ( 'parallel' blockDef ( 'and' blockDef )* -> ^( PARALLEL ( blockDef )+ ) )
                # src/Monitor.g:109:14: 'parallel' blockDef ( 'and' blockDef )*
                pass 
                string_literal139=self.match(self.input, 47, self.FOLLOW_47_in_parallelDef1018) 
                if self._state.backtracking == 0:
                    stream_47.add(string_literal139)
                self._state.following.append(self.FOLLOW_blockDef_in_parallelDef1020)
                blockDef140 = self.blockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    stream_blockDef.add(blockDef140.tree)
                # src/Monitor.g:109:34: ( 'and' blockDef )*
                while True: #loop40
                    alt40 = 2
                    LA40_0 = self.input.LA(1)

                    if (LA40_0 == 48) :
                        alt40 = 1


                    if alt40 == 1:
                        # src/Monitor.g:109:36: 'and' blockDef
                        pass 
                        string_literal141=self.match(self.input, 48, self.FOLLOW_48_in_parallelDef1024) 
                        if self._state.backtracking == 0:
                            stream_48.add(string_literal141)
                        self._state.following.append(self.FOLLOW_blockDef_in_parallelDef1026)
                        blockDef142 = self.blockDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            stream_blockDef.add(blockDef142.tree)


                    else:
                        break #loop40

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
                    # 109:54: -> ^( PARALLEL ( blockDef )+ )
                    # src/Monitor.g:109:57: ^( PARALLEL ( blockDef )+ )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(PARALLEL, "PARALLEL"), root_1)

                    # src/Monitor.g:109:68: ( blockDef )+
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

    class globalEscapeDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.globalEscapeDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "globalEscapeDef"
    # src/Monitor.g:112:1: globalEscapeDef : 'do' blockDef ( interruptDef )+ ;
    def globalEscapeDef(self, ):

        retval = self.globalEscapeDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal143 = None
        blockDef144 = None

        interruptDef145 = None


        string_literal143_tree = None

        try:
            try:
                # src/Monitor.g:112:16: ( 'do' blockDef ( interruptDef )+ )
                # src/Monitor.g:112:18: 'do' blockDef ( interruptDef )+
                pass 
                root_0 = self._adaptor.nil()

                string_literal143=self.match(self.input, 49, self.FOLLOW_49_in_globalEscapeDef1046)
                if self._state.backtracking == 0:

                    string_literal143_tree = self._adaptor.createWithPayload(string_literal143)
                    root_0 = self._adaptor.becomeRoot(string_literal143_tree, root_0)

                self._state.following.append(self.FOLLOW_blockDef_in_globalEscapeDef1049)
                blockDef144 = self.blockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, blockDef144.tree)
                # src/Monitor.g:112:33: ( interruptDef )+
                cnt41 = 0
                while True: #loop41
                    alt41 = 2
                    LA41_0 = self.input.LA(1)

                    if (LA41_0 == 50) :
                        alt41 = 1


                    if alt41 == 1:
                        # src/Monitor.g:112:35: interruptDef
                        pass 
                        self._state.following.append(self.FOLLOW_interruptDef_in_globalEscapeDef1053)
                        interruptDef145 = self.interruptDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, interruptDef145.tree)


                    else:
                        if cnt41 >= 1:
                            break #loop41

                        if self._state.backtracking > 0:
                            raise BacktrackingFailed

                        eee = EarlyExitException(41, self.input)
                        raise eee

                    cnt41 += 1



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

    class interruptDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.interruptDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "interruptDef"
    # src/Monitor.g:115:1: interruptDef : 'interrupt' blockDef ;
    def interruptDef(self, ):

        retval = self.interruptDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal146 = None
        blockDef147 = None


        string_literal146_tree = None

        try:
            try:
                # src/Monitor.g:115:13: ( 'interrupt' blockDef )
                # src/Monitor.g:115:15: 'interrupt' blockDef
                pass 
                root_0 = self._adaptor.nil()

                string_literal146=self.match(self.input, 50, self.FOLLOW_50_in_interruptDef1065)
                if self._state.backtracking == 0:

                    string_literal146_tree = self._adaptor.createWithPayload(string_literal146)
                    root_0 = self._adaptor.becomeRoot(string_literal146_tree, root_0)

                self._state.following.append(self.FOLLOW_blockDef_in_interruptDef1068)
                blockDef147 = self.blockDef()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, blockDef147.tree)



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

    class unorderedDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.unorderedDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "unorderedDef"
    # src/Monitor.g:117:1: unorderedDef : 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}' -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ ) ;
    def unorderedDef(self, ):

        retval = self.unorderedDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal148 = None
        char_literal149 = None
        ANNOTATION150 = None
        char_literal152 = None
        activityDef151 = None


        string_literal148_tree = None
        char_literal149_tree = None
        ANNOTATION150_tree = None
        char_literal152_tree = None
        stream_32 = RewriteRuleTokenStream(self._adaptor, "token 32")
        stream_51 = RewriteRuleTokenStream(self._adaptor, "token 51")
        stream_33 = RewriteRuleTokenStream(self._adaptor, "token 33")
        stream_ANNOTATION = RewriteRuleTokenStream(self._adaptor, "token ANNOTATION")
        stream_activityDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityDef")
        try:
            try:
                # src/Monitor.g:117:13: ( 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}' -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ ) )
                # src/Monitor.g:117:15: 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}'
                pass 
                string_literal148=self.match(self.input, 51, self.FOLLOW_51_in_unorderedDef1076) 
                if self._state.backtracking == 0:
                    stream_51.add(string_literal148)
                char_literal149=self.match(self.input, 32, self.FOLLOW_32_in_unorderedDef1078) 
                if self._state.backtracking == 0:
                    stream_32.add(char_literal149)
                # src/Monitor.g:117:31: ( ( ANNOTATION )* activityDef )*
                while True: #loop43
                    alt43 = 2
                    LA43_0 = self.input.LA(1)

                    if ((ANNOTATION <= LA43_0 <= ID) or LA43_0 == 29 or LA43_0 == 32 or (38 <= LA43_0 <= 39) or (42 <= LA43_0 <= 47) or LA43_0 == 49 or LA43_0 == 51) :
                        alt43 = 1


                    if alt43 == 1:
                        # src/Monitor.g:117:33: ( ANNOTATION )* activityDef
                        pass 
                        # src/Monitor.g:117:33: ( ANNOTATION )*
                        while True: #loop42
                            alt42 = 2
                            LA42_0 = self.input.LA(1)

                            if (LA42_0 == ANNOTATION) :
                                alt42 = 1


                            if alt42 == 1:
                                # src/Monitor.g:117:35: ANNOTATION
                                pass 
                                ANNOTATION150=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_unorderedDef1084) 
                                if self._state.backtracking == 0:
                                    stream_ANNOTATION.add(ANNOTATION150)


                            else:
                                break #loop42
                        self._state.following.append(self.FOLLOW_activityDef_in_unorderedDef1089)
                        activityDef151 = self.activityDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            stream_activityDef.add(activityDef151.tree)


                    else:
                        break #loop43
                char_literal152=self.match(self.input, 33, self.FOLLOW_33_in_unorderedDef1094) 
                if self._state.backtracking == 0:
                    stream_33.add(char_literal152)

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
                    # 117:68: -> ^( PARALLEL ( ^( BRANCH activityDef ) )+ )
                    # src/Monitor.g:117:71: ^( PARALLEL ( ^( BRANCH activityDef ) )+ )
                    root_1 = self._adaptor.nil()
                    root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(PARALLEL, "PARALLEL"), root_1)

                    # src/Monitor.g:117:82: ( ^( BRANCH activityDef ) )+
                    if not (stream_activityDef.hasNext()):
                        raise RewriteEarlyExitException()

                    while stream_activityDef.hasNext():
                        # src/Monitor.g:117:82: ^( BRANCH activityDef )
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
    # src/Monitor.g:126:1: expr : term ( ( PLUS | MINUS ) term )* ;
    def expr(self, ):

        retval = self.expr_return()
        retval.start = self.input.LT(1)

        root_0 = None

        set154 = None
        term153 = None

        term155 = None


        set154_tree = None

        try:
            try:
                # src/Monitor.g:126:6: ( term ( ( PLUS | MINUS ) term )* )
                # src/Monitor.g:126:8: term ( ( PLUS | MINUS ) term )*
                pass 
                root_0 = self._adaptor.nil()

                self._state.following.append(self.FOLLOW_term_in_expr1119)
                term153 = self.term()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, term153.tree)
                # src/Monitor.g:126:13: ( ( PLUS | MINUS ) term )*
                while True: #loop44
                    alt44 = 2
                    LA44_0 = self.input.LA(1)

                    if ((PLUS <= LA44_0 <= MINUS)) :
                        alt44 = 1


                    if alt44 == 1:
                        # src/Monitor.g:126:15: ( PLUS | MINUS ) term
                        pass 
                        set154 = self.input.LT(1)
                        if (PLUS <= self.input.LA(1) <= MINUS):
                            self.input.consume()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, self._adaptor.createWithPayload(set154))
                            self._state.errorRecovery = False

                        else:
                            if self._state.backtracking > 0:
                                raise BacktrackingFailed

                            mse = MismatchedSetException(None, self.input)
                            raise mse


                        self._state.following.append(self.FOLLOW_term_in_expr1134)
                        term155 = self.term()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, term155.tree)


                    else:
                        break #loop44



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
    # src/Monitor.g:128:1: term : factor ( ( MULT | DIV ) factor )* ;
    def term(self, ):

        retval = self.term_return()
        retval.start = self.input.LT(1)

        root_0 = None

        set157 = None
        factor156 = None

        factor158 = None


        set157_tree = None

        try:
            try:
                # src/Monitor.g:128:6: ( factor ( ( MULT | DIV ) factor )* )
                # src/Monitor.g:128:8: factor ( ( MULT | DIV ) factor )*
                pass 
                root_0 = self._adaptor.nil()

                self._state.following.append(self.FOLLOW_factor_in_term1146)
                factor156 = self.factor()

                self._state.following.pop()
                if self._state.backtracking == 0:
                    self._adaptor.addChild(root_0, factor156.tree)
                # src/Monitor.g:128:15: ( ( MULT | DIV ) factor )*
                while True: #loop45
                    alt45 = 2
                    LA45_0 = self.input.LA(1)

                    if ((MULT <= LA45_0 <= DIV)) :
                        alt45 = 1


                    if alt45 == 1:
                        # src/Monitor.g:128:17: ( MULT | DIV ) factor
                        pass 
                        set157 = self.input.LT(1)
                        if (MULT <= self.input.LA(1) <= DIV):
                            self.input.consume()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, self._adaptor.createWithPayload(set157))
                            self._state.errorRecovery = False

                        else:
                            if self._state.backtracking > 0:
                                raise BacktrackingFailed

                            mse = MismatchedSetException(None, self.input)
                            raise mse


                        self._state.following.append(self.FOLLOW_factor_in_term1160)
                        factor158 = self.factor()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, factor158.tree)


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

    # $ANTLR end "term"

    class factor_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.factor_return, self).__init__()

            self.tree = None




    # $ANTLR start "factor"
    # src/Monitor.g:130:1: factor : NUMBER ;
    def factor(self, ):

        retval = self.factor_return()
        retval.start = self.input.LT(1)

        root_0 = None

        NUMBER159 = None

        NUMBER159_tree = None

        try:
            try:
                # src/Monitor.g:130:8: ( NUMBER )
                # src/Monitor.g:130:10: NUMBER
                pass 
                root_0 = self._adaptor.nil()

                NUMBER159=self.match(self.input, NUMBER, self.FOLLOW_NUMBER_in_factor1172)
                if self._state.backtracking == 0:

                    NUMBER159_tree = self._adaptor.createWithPayload(NUMBER159)
                    self._adaptor.addChild(root_0, NUMBER159_tree)




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
        u"\2\21\2\uffff"
        )

    DFA3_max = DFA.unpack(
        u"\2\32\2\uffff"
        )

    DFA3_accept = DFA.unpack(
        u"\2\uffff\1\2\1\1"
        )

    DFA3_special = DFA.unpack(
        u"\4\uffff"
        )

            
    DFA3_transition = [
        DFA.unpack(u"\1\1\7\uffff\1\3\1\2"),
        DFA.unpack(u"\1\1\7\uffff\1\3\1\2"),
        DFA.unpack(u""),
        DFA.unpack(u"")
    ]

    # class definition for DFA #3

    class DFA3(DFA):
        pass


    # lookup tables for DFA #17

    DFA17_eot = DFA.unpack(
        u"\4\uffff"
        )

    DFA17_eof = DFA.unpack(
        u"\4\uffff"
        )

    DFA17_min = DFA.unpack(
        u"\2\21\2\uffff"
        )

    DFA17_max = DFA.unpack(
        u"\2\63\2\uffff"
        )

    DFA17_accept = DFA.unpack(
        u"\2\uffff\1\2\1\1"
        )

    DFA17_special = DFA.unpack(
        u"\4\uffff"
        )

            
    DFA17_transition = [
        DFA.unpack(u"\1\1\1\3\7\uffff\1\2\2\uffff\1\3\2\uffff\1\3\1\2\4"
        u"\uffff\2\3\2\uffff\6\3\1\uffff\1\3\1\uffff\1\3"),
        DFA.unpack(u"\1\1\1\3\7\uffff\1\2\2\uffff\1\3\2\uffff\1\3\5\uffff"
        u"\2\3\2\uffff\6\3\1\uffff\1\3\1\uffff\1\3"),
        DFA.unpack(u""),
        DFA.unpack(u"")
    ]

    # class definition for DFA #17

    class DFA17(DFA):
        pass


    # lookup tables for DFA #32

    DFA32_eot = DFA.unpack(
        u"\11\uffff"
        )

    DFA32_eof = DFA.unpack(
        u"\1\1\10\uffff"
        )

    DFA32_min = DFA.unpack(
        u"\1\21\1\uffff\1\34\1\uffff\1\22\1\33\1\35\1\22\1\33"
        )

    DFA32_max = DFA.unpack(
        u"\1\63\1\uffff\1\51\1\uffff\2\43\1\51\1\22\1\43"
        )

    DFA32_accept = DFA.unpack(
        u"\1\uffff\1\2\1\uffff\1\1\5\uffff"
        )

    DFA32_special = DFA.unpack(
        u"\11\uffff"
        )

            
    DFA32_transition = [
        DFA.unpack(u"\1\3\1\2\12\uffff\1\3\2\uffff\1\3\1\1\4\uffff\2\3\2"
        u"\uffff\6\3\1\uffff\1\3\1\uffff\1\3"),
        DFA.unpack(u""),
        DFA.unpack(u"\2\3\4\uffff\1\4\2\uffff\2\3\2\uffff\1\1"),
        DFA.unpack(u""),
        DFA.unpack(u"\1\5\20\uffff\1\6"),
        DFA.unpack(u"\1\7\7\uffff\1\6"),
        DFA.unpack(u"\1\3\10\uffff\1\3\2\uffff\1\1"),
        DFA.unpack(u"\1\10"),
        DFA.unpack(u"\1\7\7\uffff\1\6")
    ]

    # class definition for DFA #32

    class DFA32(DFA):
        pass


 

    FOLLOW_ANNOTATION_in_description161 = frozenset([17, 25])
    FOLLOW_importProtocolStatement_in_description168 = frozenset([17, 25, 26])
    FOLLOW_importTypeStatement_in_description172 = frozenset([17, 25, 26])
    FOLLOW_ANNOTATION_in_description181 = frozenset([17, 26])
    FOLLOW_protocolDef_in_description186 = frozenset([1])
    FOLLOW_25_in_importProtocolStatement197 = frozenset([26])
    FOLLOW_26_in_importProtocolStatement199 = frozenset([18])
    FOLLOW_importProtocolDef_in_importProtocolStatement201 = frozenset([27, 28])
    FOLLOW_27_in_importProtocolStatement205 = frozenset([18])
    FOLLOW_importProtocolDef_in_importProtocolStatement208 = frozenset([27, 28])
    FOLLOW_28_in_importProtocolStatement213 = frozenset([1])
    FOLLOW_ID_in_importProtocolDef222 = frozenset([29])
    FOLLOW_29_in_importProtocolDef224 = frozenset([19])
    FOLLOW_StringLiteral_in_importProtocolDef227 = frozenset([1])
    FOLLOW_25_in_importTypeStatement240 = frozenset([18, 19])
    FOLLOW_simpleName_in_importTypeStatement244 = frozenset([18, 19])
    FOLLOW_importTypeDef_in_importTypeStatement249 = frozenset([27, 28, 29])
    FOLLOW_27_in_importTypeStatement253 = frozenset([18, 19])
    FOLLOW_importTypeDef_in_importTypeStatement256 = frozenset([27, 28, 29])
    FOLLOW_29_in_importTypeStatement263 = frozenset([19])
    FOLLOW_StringLiteral_in_importTypeStatement266 = frozenset([28])
    FOLLOW_28_in_importTypeStatement271 = frozenset([1])
    FOLLOW_dataTypeDef_in_importTypeDef282 = frozenset([30])
    FOLLOW_30_in_importTypeDef284 = frozenset([18])
    FOLLOW_ID_in_importTypeDef290 = frozenset([1])
    FOLLOW_StringLiteral_in_dataTypeDef298 = frozenset([1])
    FOLLOW_ID_in_simpleName306 = frozenset([1])
    FOLLOW_26_in_protocolDef314 = frozenset([18])
    FOLLOW_protocolName_in_protocolDef316 = frozenset([31, 32, 34])
    FOLLOW_31_in_protocolDef320 = frozenset([18])
    FOLLOW_roleName_in_protocolDef322 = frozenset([32, 34])
    FOLLOW_parameterDefs_in_protocolDef329 = frozenset([32])
    FOLLOW_32_in_protocolDef334 = frozenset([17, 18, 29, 32, 38, 39, 42, 43, 44, 45, 46, 47, 49, 51])
    FOLLOW_protocolBlockDef_in_protocolDef336 = frozenset([17, 26, 33])
    FOLLOW_ANNOTATION_in_protocolDef342 = frozenset([17, 26])
    FOLLOW_protocolDef_in_protocolDef347 = frozenset([17, 26, 33])
    FOLLOW_33_in_protocolDef352 = frozenset([1])
    FOLLOW_ID_in_protocolName374 = frozenset([1])
    FOLLOW_34_in_parameterDefs382 = frozenset([18, 36])
    FOLLOW_parameterDef_in_parameterDefs385 = frozenset([27, 35])
    FOLLOW_27_in_parameterDefs389 = frozenset([18, 36])
    FOLLOW_parameterDef_in_parameterDefs392 = frozenset([27, 35])
    FOLLOW_35_in_parameterDefs397 = frozenset([1])
    FOLLOW_typeReferenceDef_in_parameterDef408 = frozenset([18])
    FOLLOW_36_in_parameterDef412 = frozenset([18])
    FOLLOW_simpleName_in_parameterDef416 = frozenset([1])
    FOLLOW_activityListDef_in_protocolBlockDef424 = frozenset([1])
    FOLLOW_32_in_blockDef435 = frozenset([17, 18, 29, 32, 33, 38, 39, 42, 43, 44, 45, 46, 47, 49, 51])
    FOLLOW_activityListDef_in_blockDef437 = frozenset([33])
    FOLLOW_33_in_blockDef439 = frozenset([1])
    FOLLOW_ANNOTATION_in_activityListDef458 = frozenset([17, 18, 29, 32, 38, 39, 42, 43, 44, 45, 46, 47, 49, 51])
    FOLLOW_activityDef_in_activityListDef463 = frozenset([1, 17, 18, 29, 32, 38, 39, 42, 43, 44, 45, 46, 47, 49, 51])
    FOLLOW_introducesDef_in_activityDef480 = frozenset([28])
    FOLLOW_interactionDef_in_activityDef484 = frozenset([28])
    FOLLOW_inlineDef_in_activityDef488 = frozenset([28])
    FOLLOW_runDef_in_activityDef492 = frozenset([28])
    FOLLOW_recursionDef_in_activityDef496 = frozenset([28])
    FOLLOW_endDef_in_activityDef500 = frozenset([28])
    FOLLOW_28_in_activityDef504 = frozenset([1])
    FOLLOW_choiceDef_in_activityDef513 = frozenset([1])
    FOLLOW_directedChoiceDef_in_activityDef517 = frozenset([1])
    FOLLOW_parallelDef_in_activityDef521 = frozenset([1])
    FOLLOW_repeatDef_in_activityDef525 = frozenset([1])
    FOLLOW_unorderedDef_in_activityDef529 = frozenset([1])
    FOLLOW_recBlockDef_in_activityDef536 = frozenset([1])
    FOLLOW_globalEscapeDef_in_activityDef540 = frozenset([1])
    FOLLOW_roleDef_in_introducesDef548 = frozenset([37])
    FOLLOW_37_in_introducesDef550 = frozenset([18])
    FOLLOW_roleDef_in_introducesDef552 = frozenset([1, 27])
    FOLLOW_27_in_introducesDef556 = frozenset([18])
    FOLLOW_roleDef_in_introducesDef558 = frozenset([1, 27])
    FOLLOW_ID_in_roleDef569 = frozenset([1])
    FOLLOW_ID_in_roleName580 = frozenset([1])
    FOLLOW_ID_in_typeReferenceDef591 = frozenset([1])
    FOLLOW_typeReferenceDef_in_interactionSignatureDef605 = frozenset([1])
    FOLLOW_ID_in_interactionSignatureDef609 = frozenset([34])
    FOLLOW_34_in_interactionSignatureDef611 = frozenset([18, 35])
    FOLLOW_typeReferenceDef_in_interactionSignatureDef616 = frozenset([27, 35])
    FOLLOW_27_in_interactionSignatureDef620 = frozenset([18])
    FOLLOW_typeReferenceDef_in_interactionSignatureDef623 = frozenset([27, 35])
    FOLLOW_35_in_interactionSignatureDef631 = frozenset([1])
    FOLLOW_interactionSignatureDef_in_interactionDef649 = frozenset([29, 38])
    FOLLOW_29_in_interactionDef655 = frozenset([18])
    FOLLOW_roleName_in_interactionDef660 = frozenset([1])
    FOLLOW_38_in_interactionDef684 = frozenset([18])
    FOLLOW_roleName_in_interactionDef686 = frozenset([1])
    FOLLOW_39_in_choiceDef705 = frozenset([31, 32])
    FOLLOW_31_in_choiceDef709 = frozenset([18])
    FOLLOW_roleName_in_choiceDef711 = frozenset([31, 32])
    FOLLOW_blockDef_in_choiceDef716 = frozenset([1, 40])
    FOLLOW_40_in_choiceDef720 = frozenset([31, 32])
    FOLLOW_blockDef_in_choiceDef722 = frozenset([1, 40])
    FOLLOW_29_in_directedChoiceDef743 = frozenset([18])
    FOLLOW_roleName_in_directedChoiceDef745 = frozenset([32, 38])
    FOLLOW_38_in_directedChoiceDef752 = frozenset([18])
    FOLLOW_roleName_in_directedChoiceDef754 = frozenset([27, 32])
    FOLLOW_27_in_directedChoiceDef758 = frozenset([18])
    FOLLOW_roleName_in_directedChoiceDef761 = frozenset([27, 32])
    FOLLOW_32_in_directedChoiceDef769 = frozenset([18])
    FOLLOW_onMessageDef_in_directedChoiceDef773 = frozenset([18, 33])
    FOLLOW_33_in_directedChoiceDef778 = frozenset([1])
    FOLLOW_interactionSignatureDef_in_onMessageDef785 = frozenset([41])
    FOLLOW_41_in_onMessageDef787 = frozenset([17, 18, 29, 32, 38, 39, 42, 43, 44, 45, 46, 47, 49, 51])
    FOLLOW_activityList_in_onMessageDef789 = frozenset([1])
    FOLLOW_ANNOTATION_in_activityList802 = frozenset([17, 18, 29, 32, 38, 39, 42, 43, 44, 45, 46, 47, 49, 51])
    FOLLOW_activityDef_in_activityList807 = frozenset([1, 17, 18, 29, 32, 38, 39, 42, 43, 44, 45, 46, 47, 49, 51])
    FOLLOW_42_in_repeatDef817 = frozenset([31, 32])
    FOLLOW_31_in_repeatDef821 = frozenset([18])
    FOLLOW_roleName_in_repeatDef823 = frozenset([27, 31, 32])
    FOLLOW_27_in_repeatDef827 = frozenset([18])
    FOLLOW_roleName_in_repeatDef829 = frozenset([27, 31, 32])
    FOLLOW_blockDef_in_repeatDef837 = frozenset([1])
    FOLLOW_43_in_recBlockDef853 = frozenset([18])
    FOLLOW_labelName_in_recBlockDef855 = frozenset([31, 32])
    FOLLOW_blockDef_in_recBlockDef857 = frozenset([1])
    FOLLOW_ID_in_labelName874 = frozenset([1])
    FOLLOW_labelName_in_recursionDef886 = frozenset([1])
    FOLLOW_44_in_endDef902 = frozenset([1])
    FOLLOW_45_in_runDef912 = frozenset([18])
    FOLLOW_protocolRefDef_in_runDef915 = frozenset([29, 34])
    FOLLOW_34_in_runDef919 = frozenset([18])
    FOLLOW_parameter_in_runDef922 = frozenset([27, 35])
    FOLLOW_27_in_runDef926 = frozenset([18])
    FOLLOW_parameter_in_runDef929 = frozenset([27, 35])
    FOLLOW_35_in_runDef934 = frozenset([29])
    FOLLOW_29_in_runDef940 = frozenset([18])
    FOLLOW_roleName_in_runDef942 = frozenset([1])
    FOLLOW_ID_in_protocolRefDef950 = frozenset([1, 31])
    FOLLOW_31_in_protocolRefDef954 = frozenset([18])
    FOLLOW_roleName_in_protocolRefDef956 = frozenset([1])
    FOLLOW_ID_in_declarationName967 = frozenset([1])
    FOLLOW_declarationName_in_parameter975 = frozenset([1])
    FOLLOW_46_in_inlineDef984 = frozenset([18])
    FOLLOW_protocolRefDef_in_inlineDef987 = frozenset([1, 34])
    FOLLOW_34_in_inlineDef991 = frozenset([18])
    FOLLOW_parameter_in_inlineDef994 = frozenset([27, 35])
    FOLLOW_27_in_inlineDef998 = frozenset([18])
    FOLLOW_parameter_in_inlineDef1001 = frozenset([27, 35])
    FOLLOW_35_in_inlineDef1006 = frozenset([1])
    FOLLOW_47_in_parallelDef1018 = frozenset([31, 32])
    FOLLOW_blockDef_in_parallelDef1020 = frozenset([1, 48])
    FOLLOW_48_in_parallelDef1024 = frozenset([31, 32])
    FOLLOW_blockDef_in_parallelDef1026 = frozenset([1, 48])
    FOLLOW_49_in_globalEscapeDef1046 = frozenset([31, 32])
    FOLLOW_blockDef_in_globalEscapeDef1049 = frozenset([50])
    FOLLOW_interruptDef_in_globalEscapeDef1053 = frozenset([1, 50])
    FOLLOW_50_in_interruptDef1065 = frozenset([31, 32])
    FOLLOW_blockDef_in_interruptDef1068 = frozenset([1])
    FOLLOW_51_in_unorderedDef1076 = frozenset([32])
    FOLLOW_32_in_unorderedDef1078 = frozenset([17, 18, 29, 32, 33, 38, 39, 42, 43, 44, 45, 46, 47, 49, 51])
    FOLLOW_ANNOTATION_in_unorderedDef1084 = frozenset([17, 18, 29, 32, 38, 39, 42, 43, 44, 45, 46, 47, 49, 51])
    FOLLOW_activityDef_in_unorderedDef1089 = frozenset([17, 18, 29, 32, 33, 38, 39, 42, 43, 44, 45, 46, 47, 49, 51])
    FOLLOW_33_in_unorderedDef1094 = frozenset([1])
    FOLLOW_term_in_expr1119 = frozenset([1, 5, 6])
    FOLLOW_set_in_expr1123 = frozenset([20])
    FOLLOW_term_in_expr1134 = frozenset([1, 5, 6])
    FOLLOW_factor_in_term1146 = frozenset([1, 7, 8])
    FOLLOW_set_in_term1150 = frozenset([20])
    FOLLOW_factor_in_term1160 = frozenset([1, 7, 8])
    FOLLOW_NUMBER_in_factor1172 = frozenset([1])



def main(argv, stdin=sys.stdin, stdout=sys.stdout, stderr=sys.stderr):
    from antlr3.main import ParserMain
    main = ParserMain("MonitorLexer", MonitorParser)
    main.stdin = stdin
    main.stdout = stdout
    main.stderr = stderr
    main.execute(argv)


if __name__ == '__main__':
    main(sys.argv)
