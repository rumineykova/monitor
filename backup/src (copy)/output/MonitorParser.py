# $ANTLR 3.2 Sep 23, 2009 12:02:23 /homes/rn710/workspace/MonitorPrototype/src/Monitor.g 2011-11-18 12:13:02

import sys
from antlr3 import *
from antlr3.compat import set, frozenset
from antlr3.debug import *

from antlr3.tree import *



# for convenience in actions
HIDDEN = BaseRecognizer.HIDDEN

# token types
T__29=29
T__28=28
T__27=27
T__26=26
T__25=25
T__24=24
RESV=10
T__23=23
ANNOTATION=15
ID=16
EOF=-1
ML_COMMENT=21
INTERACTION=4
FULLSTOP=9
PLUS=5
SEND=11
DIGIT=19
T__42=42
T__43=43
T__40=40
T__41=41
T__46=46
T__47=47
T__44=44
T__45=45
LINE_COMMENT=22
T__48=48
T__49=49
RECLABEL=14
NUMBER=18
WHITESPACE=20
MINUS=6
MULT=7
UNORDERED=13
StringLiteral=17
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
    "INTERACTION", "PLUS", "MINUS", "MULT", "DIV", "FULLSTOP", "RESV", "SEND", 
    "BRANCH", "UNORDERED", "RECLABEL", "ANNOTATION", "ID", "StringLiteral", 
    "NUMBER", "DIGIT", "WHITESPACE", "ML_COMMENT", "LINE_COMMENT", "'import'", 
    "'protocol'", "','", "';'", "'from'", "'as'", "'at'", "'{'", "'}'", 
    "'('", "')'", "'role'", "'introduces'", "'to'", "'choice'", "'or'", 
    "':'", "'repeat'", "'rec'", "'end'", "'run'", "'inline'", "'parallel'", 
    "'and'", "'do'", "'interrupt'", "'unordered'"
]




class MonitorParser(DebugParser):
    grammarFileName = "/homes/rn710/workspace/MonitorPrototype/src/Monitor.g"
    antlr_version = version_str_to_tuple("3.2 Sep 23, 2009 12:02:23")
    antlr_version_str = "3.2 Sep 23, 2009 12:02:23"
    tokenNames = tokenNames

    def __init__(self, input, state=None, *args, **kwargs):
        if state is None:
            state = RecognizerSharedState()

        debug_socket = kwargs.pop('debug_socket', None)
        port = kwargs.pop('port', None)
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
        self.ruleLevel = 0

        if self._dbg is None:
            proxy = DebugEventSocketProxy(self, adaptor=self._adaptor,
                                          debug=debug_socket, port=port)
            self.setDebugListener(proxy)
            self.adaptor.setDebugListener(proxy)
            self.input.setDebugListener(proxy)
            #self.setTokenStream(DebugTokenStream(self.input, proxy))
            proxy.handshake()



    ruleNames = [
        "invalidRule", "synpred31_Monitor", "synpred6_Monitor", "roleName", 
        "synpred26_Monitor", "synpred4_Monitor", "synpred43_Monitor", "globalEscapeDef", 
        "synpred8_Monitor", "synpred11_Monitor", "synpred29_Monitor", "interactionSignatureDef", 
        "synpred39_Monitor", "inlineDef", "synpred16_Monitor", "synpred13_Monitor", 
        "synpred46_Monitor", "importProtocolDef", "synpred5_Monitor", "synpred49_Monitor", 
        "synpred41_Monitor", "introducesDef", "recursionDef", "synpred45_Monitor", 
        "parameterDef", "synpred34_Monitor", "synpred12_Monitor", "simpleName", 
        "interruptDef", "synpred47_Monitor", "description", "protocolRefDef", 
        "directedChoiceDef", "onMessageDef", "activityList", "roleDef", 
        "recBlockDef", "synpred17_Monitor", "parallelDef", "synpred37_Monitor", 
        "endDef", "synpred20_Monitor", "synpred55_Monitor", "unorderedDef", 
        "expr", "synpred35_Monitor", "runDef", "synpred32_Monitor", "activityListDef", 
        "importProtocolStatement", "synpred22_Monitor", "synpred51_Monitor", 
        "typeReferenceDef", "protocolDef", "synpred1_Monitor", "labelName", 
        "synpred21_Monitor", "synpred36_Monitor", "dataTypeDef", "synpred14_Monitor", 
        "interactionDef", "synpred7_Monitor", "term", "protocolBlockDef", 
        "protocolName", "declarationName", "synpred33_Monitor", "synpred48_Monitor", 
        "parameter", "synpred15_Monitor", "synpred18_Monitor", "synpred54_Monitor", 
        "choiceDef", "synpred38_Monitor", "parameterDefs", "synpred10_Monitor", 
        "synpred25_Monitor", "factor", "synpred44_Monitor", "repeatDef", 
        "synpred40_Monitor", "synpred9_Monitor", "synpred52_Monitor", "importTypeDef", 
        "synpred24_Monitor", "synpred23_Monitor", "importTypeStatement", 
        "synpred28_Monitor", "activityDef", "synpred30_Monitor", "synpred2_Monitor", 
        "synpred53_Monitor", "synpred27_Monitor", "synpred42_Monitor", "synpred50_Monitor", 
        "synpred19_Monitor", "blockDef", "synpred3_Monitor"
        ]
     
    def getRuleLevel(self):
        return self.ruleLevel

    def incRuleLevel(self):
        self.ruleLevel += 1

    def decRuleLevel(self):
        self.ruleLevel -= 1

    def evalPredicate(self, result, predicate):
        self._dbg.semanticPredicate(result, predicate)
        return result


    def setTreeAdaptor(self, adaptor):
        self._adaptor = DebugTreeAdaptor(self.dbg, adaptor)

    def getTreeAdaptor(self):
        return self._adaptor

    adaptor = property(getTreeAdaptor, setTreeAdaptor)



    class description_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.description_return, self).__init__()

            self.tree = None




    # $ANTLR start "description"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:1: description : ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "description")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(27, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:12: ( ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef
                    pass 
                    self._dbg.location(27, 14)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:14: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )*
                    try:
                        self._dbg.enterSubRule(3)
                        while True: #loop3
                            alt3 = 2
                            try:
                                self._dbg.enterDecision(3)
                                try:
                                    self.isCyclicDecision = True
                                    alt3 = self.dfa3.predict(self.input)

                                except NoViableAltException, nvae:
                                    self._dbg.recognitionException(nvae)
                                    raise

                            finally:
                                self._dbg.exitDecision(3)
                            if alt3 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:16: ( ANNOTATION )* ( importProtocolStatement | importTypeStatement )
                                pass 
                                self._dbg.location(27, 16)
                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:16: ( ANNOTATION )*
                                try:
                                    self._dbg.enterSubRule(1)
                                    while True: #loop1
                                        alt1 = 2
                                        try:
                                            self._dbg.enterDecision(1)
                                            LA1_0 = self.input.LA(1)

                                            if (LA1_0 == ANNOTATION) :
                                                alt1 = 1


                                        finally:
                                            self._dbg.exitDecision(1)
                                        if alt1 == 1:
                                            self._dbg.enterAlt(1)

                                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:18: ANNOTATION
                                            pass 
                                            self._dbg.location(27, 18)
                                            ANNOTATION1=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_description146) 
                                            if self._state.backtracking == 0:
                                                stream_ANNOTATION.add(ANNOTATION1)


                                        else:
                                            break #loop1
                                finally:
                                    self._dbg.exitSubRule(1)

                                self._dbg.location(27, 32)
                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:32: ( importProtocolStatement | importTypeStatement )
                                alt2 = 2
                                try:
                                    self._dbg.enterSubRule(2)
                                    try:
                                        self._dbg.enterDecision(2)
                                        LA2_0 = self.input.LA(1)

                                        if (LA2_0 == 23) :
                                            LA2_1 = self.input.LA(2)

                                            if (LA2_1 == 24) :
                                                alt2 = 1
                                            elif ((ID <= LA2_1 <= StringLiteral)) :
                                                alt2 = 2
                                            else:
                                                if self._state.backtracking > 0:
                                                    raise BacktrackingFailed

                                                nvae = NoViableAltException("", 2, 1, self.input)

                                                self._dbg.recognitionException(nvae)
                                                raise nvae

                                        else:
                                            if self._state.backtracking > 0:
                                                raise BacktrackingFailed

                                            nvae = NoViableAltException("", 2, 0, self.input)

                                            self._dbg.recognitionException(nvae)
                                            raise nvae

                                    finally:
                                        self._dbg.exitDecision(2)
                                    if alt2 == 1:
                                        self._dbg.enterAlt(1)

                                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:34: importProtocolStatement
                                        pass 
                                        self._dbg.location(27, 34)
                                        self._state.following.append(self.FOLLOW_importProtocolStatement_in_description153)
                                        importProtocolStatement2 = self.importProtocolStatement()

                                        self._state.following.pop()
                                        if self._state.backtracking == 0:
                                            stream_importProtocolStatement.add(importProtocolStatement2.tree)


                                    elif alt2 == 2:
                                        self._dbg.enterAlt(2)

                                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:60: importTypeStatement
                                        pass 
                                        self._dbg.location(27, 60)
                                        self._state.following.append(self.FOLLOW_importTypeStatement_in_description157)
                                        importTypeStatement3 = self.importTypeStatement()

                                        self._state.following.pop()
                                        if self._state.backtracking == 0:
                                            stream_importTypeStatement.add(importTypeStatement3.tree)



                                finally:
                                    self._dbg.exitSubRule(2)


                            else:
                                break #loop3
                    finally:
                        self._dbg.exitSubRule(3)

                    self._dbg.location(27, 85)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:85: ( ANNOTATION )*
                    try:
                        self._dbg.enterSubRule(4)
                        while True: #loop4
                            alt4 = 2
                            try:
                                self._dbg.enterDecision(4)
                                LA4_0 = self.input.LA(1)

                                if (LA4_0 == ANNOTATION) :
                                    alt4 = 1


                            finally:
                                self._dbg.exitDecision(4)
                            if alt4 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:27:87: ANNOTATION
                                pass 
                                self._dbg.location(27, 87)
                                ANNOTATION4=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_description166) 
                                if self._state.backtracking == 0:
                                    stream_ANNOTATION.add(ANNOTATION4)


                            else:
                                break #loop4
                    finally:
                        self._dbg.exitSubRule(4)

                    self._dbg.location(27, 101)
                    self._state.following.append(self.FOLLOW_protocolDef_in_description171)
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
                        # 27:113: -> protocolDef
                        self._dbg.location(27, 116)
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

            self._dbg.location(27, 127)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "description")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "description"

    class importProtocolStatement_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.importProtocolStatement_return, self).__init__()

            self.tree = None




    # $ANTLR start "importProtocolStatement"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:29:1: importProtocolStatement : 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "importProtocolStatement")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(29, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:29:24: ( 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';' )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:29:26: 'import' 'protocol' importProtocolDef ( ',' importProtocolDef )* ';'
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(29, 26)
                    string_literal6=self.match(self.input, 23, self.FOLLOW_23_in_importProtocolStatement182)
                    if self._state.backtracking == 0:

                        string_literal6_tree = self._adaptor.createWithPayload(string_literal6)
                        self._adaptor.addChild(root_0, string_literal6_tree)

                    self._dbg.location(29, 35)
                    string_literal7=self.match(self.input, 24, self.FOLLOW_24_in_importProtocolStatement184)
                    if self._state.backtracking == 0:

                        string_literal7_tree = self._adaptor.createWithPayload(string_literal7)
                        self._adaptor.addChild(root_0, string_literal7_tree)

                    self._dbg.location(29, 46)
                    self._state.following.append(self.FOLLOW_importProtocolDef_in_importProtocolStatement186)
                    importProtocolDef8 = self.importProtocolDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, importProtocolDef8.tree)
                    self._dbg.location(29, 64)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:29:64: ( ',' importProtocolDef )*
                    try:
                        self._dbg.enterSubRule(5)
                        while True: #loop5
                            alt5 = 2
                            try:
                                self._dbg.enterDecision(5)
                                LA5_0 = self.input.LA(1)

                                if (LA5_0 == 25) :
                                    alt5 = 1


                            finally:
                                self._dbg.exitDecision(5)
                            if alt5 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:29:66: ',' importProtocolDef
                                pass 
                                self._dbg.location(29, 69)
                                char_literal9=self.match(self.input, 25, self.FOLLOW_25_in_importProtocolStatement190)
                                self._dbg.location(29, 71)
                                self._state.following.append(self.FOLLOW_importProtocolDef_in_importProtocolStatement193)
                                importProtocolDef10 = self.importProtocolDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, importProtocolDef10.tree)


                            else:
                                break #loop5
                    finally:
                        self._dbg.exitSubRule(5)

                    self._dbg.location(29, 95)
                    char_literal11=self.match(self.input, 26, self.FOLLOW_26_in_importProtocolStatement198)



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

            self._dbg.location(29, 97)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "importProtocolStatement")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "importProtocolStatement"

    class importProtocolDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.importProtocolDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "importProtocolDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:31:1: importProtocolDef : ID 'from' StringLiteral ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "importProtocolDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(31, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:31:18: ( ID 'from' StringLiteral )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:31:20: ID 'from' StringLiteral
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(31, 20)
                    ID12=self.match(self.input, ID, self.FOLLOW_ID_in_importProtocolDef207)
                    if self._state.backtracking == 0:

                        ID12_tree = self._adaptor.createWithPayload(ID12)
                        self._adaptor.addChild(root_0, ID12_tree)

                    self._dbg.location(31, 29)
                    string_literal13=self.match(self.input, 27, self.FOLLOW_27_in_importProtocolDef209)
                    self._dbg.location(31, 31)
                    StringLiteral14=self.match(self.input, StringLiteral, self.FOLLOW_StringLiteral_in_importProtocolDef212)
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

            self._dbg.location(31, 44)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "importProtocolDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "importProtocolDef"

    class importTypeStatement_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.importTypeStatement_return, self).__init__()

            self.tree = None




    # $ANTLR start "importTypeStatement"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:1: importTypeStatement : 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "importTypeStatement")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(33, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:20: ( 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';' )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:22: 'import' ( simpleName )? importTypeDef ( ',' importTypeDef )* ( 'from' StringLiteral )? ';'
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(33, 22)
                    string_literal15=self.match(self.input, 23, self.FOLLOW_23_in_importTypeStatement225)
                    if self._state.backtracking == 0:

                        string_literal15_tree = self._adaptor.createWithPayload(string_literal15)
                        self._adaptor.addChild(root_0, string_literal15_tree)

                    self._dbg.location(33, 31)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:31: ( simpleName )?
                    alt6 = 2
                    try:
                        self._dbg.enterSubRule(6)
                        try:
                            self._dbg.enterDecision(6)
                            LA6_0 = self.input.LA(1)

                            if (LA6_0 == ID) :
                                LA6_1 = self.input.LA(2)

                                if ((ID <= LA6_1 <= StringLiteral)) :
                                    alt6 = 1
                        finally:
                            self._dbg.exitDecision(6)
                        if alt6 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:33: simpleName
                            pass 
                            self._dbg.location(33, 33)
                            self._state.following.append(self.FOLLOW_simpleName_in_importTypeStatement229)
                            simpleName16 = self.simpleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, simpleName16.tree)



                    finally:
                        self._dbg.exitSubRule(6)
                    self._dbg.location(33, 47)
                    self._state.following.append(self.FOLLOW_importTypeDef_in_importTypeStatement234)
                    importTypeDef17 = self.importTypeDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, importTypeDef17.tree)
                    self._dbg.location(33, 61)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:61: ( ',' importTypeDef )*
                    try:
                        self._dbg.enterSubRule(7)
                        while True: #loop7
                            alt7 = 2
                            try:
                                self._dbg.enterDecision(7)
                                LA7_0 = self.input.LA(1)

                                if (LA7_0 == 25) :
                                    alt7 = 1


                            finally:
                                self._dbg.exitDecision(7)
                            if alt7 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:63: ',' importTypeDef
                                pass 
                                self._dbg.location(33, 66)
                                char_literal18=self.match(self.input, 25, self.FOLLOW_25_in_importTypeStatement238)
                                self._dbg.location(33, 68)
                                self._state.following.append(self.FOLLOW_importTypeDef_in_importTypeStatement241)
                                importTypeDef19 = self.importTypeDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, importTypeDef19.tree)


                            else:
                                break #loop7
                    finally:
                        self._dbg.exitSubRule(7)

                    self._dbg.location(33, 85)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:85: ( 'from' StringLiteral )?
                    alt8 = 2
                    try:
                        self._dbg.enterSubRule(8)
                        try:
                            self._dbg.enterDecision(8)
                            LA8_0 = self.input.LA(1)

                            if (LA8_0 == 27) :
                                alt8 = 1
                        finally:
                            self._dbg.exitDecision(8)
                        if alt8 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:33:87: 'from' StringLiteral
                            pass 
                            self._dbg.location(33, 93)
                            string_literal20=self.match(self.input, 27, self.FOLLOW_27_in_importTypeStatement248)
                            self._dbg.location(33, 95)
                            StringLiteral21=self.match(self.input, StringLiteral, self.FOLLOW_StringLiteral_in_importTypeStatement251)
                            if self._state.backtracking == 0:

                                StringLiteral21_tree = self._adaptor.createWithPayload(StringLiteral21)
                                self._adaptor.addChild(root_0, StringLiteral21_tree)




                    finally:
                        self._dbg.exitSubRule(8)
                    self._dbg.location(33, 115)
                    char_literal22=self.match(self.input, 26, self.FOLLOW_26_in_importTypeStatement256)



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

            self._dbg.location(33, 117)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "importTypeStatement")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "importTypeStatement"

    class importTypeDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.importTypeDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "importTypeDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:35:1: importTypeDef : ( dataTypeDef 'as' )? ID ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "importTypeDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(35, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:35:14: ( ( dataTypeDef 'as' )? ID )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:35:16: ( dataTypeDef 'as' )? ID
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(35, 16)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:35:16: ( dataTypeDef 'as' )?
                    alt9 = 2
                    try:
                        self._dbg.enterSubRule(9)
                        try:
                            self._dbg.enterDecision(9)
                            LA9_0 = self.input.LA(1)

                            if (LA9_0 == StringLiteral) :
                                alt9 = 1
                        finally:
                            self._dbg.exitDecision(9)
                        if alt9 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:35:18: dataTypeDef 'as'
                            pass 
                            self._dbg.location(35, 18)
                            self._state.following.append(self.FOLLOW_dataTypeDef_in_importTypeDef267)
                            dataTypeDef23 = self.dataTypeDef()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, dataTypeDef23.tree)
                            self._dbg.location(35, 34)
                            string_literal24=self.match(self.input, 28, self.FOLLOW_28_in_importTypeDef269)



                    finally:
                        self._dbg.exitSubRule(9)
                    self._dbg.location(35, 39)
                    ID25=self.match(self.input, ID, self.FOLLOW_ID_in_importTypeDef275)
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

            self._dbg.location(35, 42)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "importTypeDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "importTypeDef"

    class dataTypeDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.dataTypeDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "dataTypeDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:37:1: dataTypeDef : StringLiteral ;
    def dataTypeDef(self, ):

        retval = self.dataTypeDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        StringLiteral26 = None

        StringLiteral26_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "dataTypeDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(37, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:37:12: ( StringLiteral )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:37:14: StringLiteral
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(37, 14)
                    StringLiteral26=self.match(self.input, StringLiteral, self.FOLLOW_StringLiteral_in_dataTypeDef283)
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

            self._dbg.location(37, 28)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "dataTypeDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "dataTypeDef"

    class simpleName_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.simpleName_return, self).__init__()

            self.tree = None




    # $ANTLR start "simpleName"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:39:1: simpleName : ID ;
    def simpleName(self, ):

        retval = self.simpleName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID27 = None

        ID27_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "simpleName")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(39, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:39:11: ( ID )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:39:13: ID
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(39, 13)
                    ID27=self.match(self.input, ID, self.FOLLOW_ID_in_simpleName291)
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

            self._dbg.location(39, 16)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "simpleName")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "simpleName"

    class protocolDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.protocolDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "protocolDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:1: protocolDef : 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( 'protocol' protocolBlockDef ( protocolDef )* ) ;
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
        stream_30 = RewriteRuleTokenStream(self._adaptor, "token 30")
        stream_31 = RewriteRuleTokenStream(self._adaptor, "token 31")
        stream_24 = RewriteRuleTokenStream(self._adaptor, "token 24")
        stream_ANNOTATION = RewriteRuleTokenStream(self._adaptor, "token ANNOTATION")
        stream_29 = RewriteRuleTokenStream(self._adaptor, "token 29")
        stream_parameterDefs = RewriteRuleSubtreeStream(self._adaptor, "rule parameterDefs")
        stream_protocolDef = RewriteRuleSubtreeStream(self._adaptor, "rule protocolDef")
        stream_protocolName = RewriteRuleSubtreeStream(self._adaptor, "rule protocolName")
        stream_protocolBlockDef = RewriteRuleSubtreeStream(self._adaptor, "rule protocolBlockDef")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        try:
            self._dbg.enterRule(self.getGrammarFileName(), "protocolDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(41, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:12: ( 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}' -> ^( 'protocol' protocolBlockDef ( protocolDef )* ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:14: 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}'
                    pass 
                    self._dbg.location(41, 14)
                    string_literal28=self.match(self.input, 24, self.FOLLOW_24_in_protocolDef299) 
                    if self._state.backtracking == 0:
                        stream_24.add(string_literal28)
                    self._dbg.location(41, 25)
                    self._state.following.append(self.FOLLOW_protocolName_in_protocolDef301)
                    protocolName29 = self.protocolName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_protocolName.add(protocolName29.tree)
                    self._dbg.location(41, 38)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:38: ( 'at' roleName )?
                    alt10 = 2
                    try:
                        self._dbg.enterSubRule(10)
                        try:
                            self._dbg.enterDecision(10)
                            LA10_0 = self.input.LA(1)

                            if (LA10_0 == 29) :
                                alt10 = 1
                        finally:
                            self._dbg.exitDecision(10)
                        if alt10 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:40: 'at' roleName
                            pass 
                            self._dbg.location(41, 40)
                            string_literal30=self.match(self.input, 29, self.FOLLOW_29_in_protocolDef305) 
                            if self._state.backtracking == 0:
                                stream_29.add(string_literal30)
                            self._dbg.location(41, 45)
                            self._state.following.append(self.FOLLOW_roleName_in_protocolDef307)
                            roleName31 = self.roleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_roleName.add(roleName31.tree)



                    finally:
                        self._dbg.exitSubRule(10)
                    self._dbg.location(41, 57)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:57: ( parameterDefs )?
                    alt11 = 2
                    try:
                        self._dbg.enterSubRule(11)
                        try:
                            self._dbg.enterDecision(11)
                            LA11_0 = self.input.LA(1)

                            if (LA11_0 == 32) :
                                alt11 = 1
                        finally:
                            self._dbg.exitDecision(11)
                        if alt11 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:59: parameterDefs
                            pass 
                            self._dbg.location(41, 59)
                            self._state.following.append(self.FOLLOW_parameterDefs_in_protocolDef314)
                            parameterDefs32 = self.parameterDefs()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_parameterDefs.add(parameterDefs32.tree)



                    finally:
                        self._dbg.exitSubRule(11)
                    self._dbg.location(41, 76)
                    char_literal33=self.match(self.input, 30, self.FOLLOW_30_in_protocolDef319) 
                    if self._state.backtracking == 0:
                        stream_30.add(char_literal33)
                    self._dbg.location(41, 80)
                    self._state.following.append(self.FOLLOW_protocolBlockDef_in_protocolDef321)
                    protocolBlockDef34 = self.protocolBlockDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_protocolBlockDef.add(protocolBlockDef34.tree)
                    self._dbg.location(41, 97)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:97: ( ( ANNOTATION )* protocolDef )*
                    try:
                        self._dbg.enterSubRule(13)
                        while True: #loop13
                            alt13 = 2
                            try:
                                self._dbg.enterDecision(13)
                                LA13_0 = self.input.LA(1)

                                if (LA13_0 == ANNOTATION or LA13_0 == 24) :
                                    alt13 = 1


                            finally:
                                self._dbg.exitDecision(13)
                            if alt13 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:99: ( ANNOTATION )* protocolDef
                                pass 
                                self._dbg.location(41, 99)
                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:99: ( ANNOTATION )*
                                try:
                                    self._dbg.enterSubRule(12)
                                    while True: #loop12
                                        alt12 = 2
                                        try:
                                            self._dbg.enterDecision(12)
                                            LA12_0 = self.input.LA(1)

                                            if (LA12_0 == ANNOTATION) :
                                                alt12 = 1


                                        finally:
                                            self._dbg.exitDecision(12)
                                        if alt12 == 1:
                                            self._dbg.enterAlt(1)

                                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:41:101: ANNOTATION
                                            pass 
                                            self._dbg.location(41, 101)
                                            ANNOTATION35=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_protocolDef327) 
                                            if self._state.backtracking == 0:
                                                stream_ANNOTATION.add(ANNOTATION35)


                                        else:
                                            break #loop12
                                finally:
                                    self._dbg.exitSubRule(12)

                                self._dbg.location(41, 115)
                                self._state.following.append(self.FOLLOW_protocolDef_in_protocolDef332)
                                protocolDef36 = self.protocolDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    stream_protocolDef.add(protocolDef36.tree)


                            else:
                                break #loop13
                    finally:
                        self._dbg.exitSubRule(13)

                    self._dbg.location(41, 130)
                    char_literal37=self.match(self.input, 31, self.FOLLOW_31_in_protocolDef337) 
                    if self._state.backtracking == 0:
                        stream_31.add(char_literal37)

                    # AST Rewrite
                    # elements: protocolBlockDef, 24, protocolDef
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
                        # 42:7: -> ^( 'protocol' protocolBlockDef ( protocolDef )* )
                        self._dbg.location(42, 10)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:42:10: ^( 'protocol' protocolBlockDef ( protocolDef )* )
                        root_1 = self._adaptor.nil()
                        self._dbg.location(42, 12)
                        root_1 = self._adaptor.becomeRoot(stream_24.nextNode(), root_1)

                        self._dbg.location(42, 23)
                        self._adaptor.addChild(root_1, stream_protocolBlockDef.nextTree())
                        self._dbg.location(42, 40)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:42:40: ( protocolDef )*
                        while stream_protocolDef.hasNext():
                            self._dbg.location(42, 40)
                            self._adaptor.addChild(root_1, stream_protocolDef.nextTree())


                        stream_protocolDef.reset();

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

            self._dbg.location(42, 53)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "protocolDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "protocolDef"

    class protocolName_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.protocolName_return, self).__init__()

            self.tree = None




    # $ANTLR start "protocolName"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:44:1: protocolName : ID ;
    def protocolName(self, ):

        retval = self.protocolName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID38 = None

        ID38_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "protocolName")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(44, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:44:13: ( ID )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:44:15: ID
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(44, 15)
                    ID38=self.match(self.input, ID, self.FOLLOW_ID_in_protocolName361)
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

            self._dbg.location(44, 18)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "protocolName")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "protocolName"

    class parameterDefs_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.parameterDefs_return, self).__init__()

            self.tree = None




    # $ANTLR start "parameterDefs"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:46:1: parameterDefs : '(' parameterDef ( ',' parameterDef )* ')' ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "parameterDefs")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(46, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:46:14: ( '(' parameterDef ( ',' parameterDef )* ')' )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:46:16: '(' parameterDef ( ',' parameterDef )* ')'
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(46, 19)
                    char_literal39=self.match(self.input, 32, self.FOLLOW_32_in_parameterDefs369)
                    self._dbg.location(46, 21)
                    self._state.following.append(self.FOLLOW_parameterDef_in_parameterDefs372)
                    parameterDef40 = self.parameterDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, parameterDef40.tree)
                    self._dbg.location(46, 34)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:46:34: ( ',' parameterDef )*
                    try:
                        self._dbg.enterSubRule(14)
                        while True: #loop14
                            alt14 = 2
                            try:
                                self._dbg.enterDecision(14)
                                LA14_0 = self.input.LA(1)

                                if (LA14_0 == 25) :
                                    alt14 = 1


                            finally:
                                self._dbg.exitDecision(14)
                            if alt14 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:46:36: ',' parameterDef
                                pass 
                                self._dbg.location(46, 39)
                                char_literal41=self.match(self.input, 25, self.FOLLOW_25_in_parameterDefs376)
                                self._dbg.location(46, 41)
                                self._state.following.append(self.FOLLOW_parameterDef_in_parameterDefs379)
                                parameterDef42 = self.parameterDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, parameterDef42.tree)


                            else:
                                break #loop14
                    finally:
                        self._dbg.exitSubRule(14)

                    self._dbg.location(46, 60)
                    char_literal43=self.match(self.input, 33, self.FOLLOW_33_in_parameterDefs384)



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

            self._dbg.location(46, 62)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "parameterDefs")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "parameterDefs"

    class parameterDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.parameterDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "parameterDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:1: parameterDef : ( typeReferenceDef | 'role' ) simpleName ;
    def parameterDef(self, ):

        retval = self.parameterDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal45 = None
        typeReferenceDef44 = None

        simpleName46 = None


        string_literal45_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "parameterDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(48, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:13: ( ( typeReferenceDef | 'role' ) simpleName )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:15: ( typeReferenceDef | 'role' ) simpleName
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(48, 15)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:15: ( typeReferenceDef | 'role' )
                    alt15 = 2
                    try:
                        self._dbg.enterSubRule(15)
                        try:
                            self._dbg.enterDecision(15)
                            LA15_0 = self.input.LA(1)

                            if (LA15_0 == ID) :
                                alt15 = 1
                            elif (LA15_0 == 34) :
                                alt15 = 2
                            else:
                                if self._state.backtracking > 0:
                                    raise BacktrackingFailed

                                nvae = NoViableAltException("", 15, 0, self.input)

                                self._dbg.recognitionException(nvae)
                                raise nvae

                        finally:
                            self._dbg.exitDecision(15)
                        if alt15 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:17: typeReferenceDef
                            pass 
                            self._dbg.location(48, 17)
                            self._state.following.append(self.FOLLOW_typeReferenceDef_in_parameterDef395)
                            typeReferenceDef44 = self.typeReferenceDef()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, typeReferenceDef44.tree)


                        elif alt15 == 2:
                            self._dbg.enterAlt(2)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:48:36: 'role'
                            pass 
                            self._dbg.location(48, 36)
                            string_literal45=self.match(self.input, 34, self.FOLLOW_34_in_parameterDef399)
                            if self._state.backtracking == 0:

                                string_literal45_tree = self._adaptor.createWithPayload(string_literal45)
                                self._adaptor.addChild(root_0, string_literal45_tree)




                    finally:
                        self._dbg.exitSubRule(15)
                    self._dbg.location(48, 45)
                    self._state.following.append(self.FOLLOW_simpleName_in_parameterDef403)
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

            self._dbg.location(48, 56)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "parameterDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "parameterDef"

    class protocolBlockDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.protocolBlockDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "protocolBlockDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:50:1: protocolBlockDef : activityListDef -> activityListDef ;
    def protocolBlockDef(self, ):

        retval = self.protocolBlockDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        activityListDef47 = None


        stream_activityListDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityListDef")
        try:
            self._dbg.enterRule(self.getGrammarFileName(), "protocolBlockDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(50, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:50:17: ( activityListDef -> activityListDef )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:50:19: activityListDef
                    pass 
                    self._dbg.location(50, 19)
                    self._state.following.append(self.FOLLOW_activityListDef_in_protocolBlockDef411)
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
                        # 50:35: -> activityListDef
                        self._dbg.location(50, 38)
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

            self._dbg.location(50, 53)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "protocolBlockDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "protocolBlockDef"

    class blockDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.blockDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "blockDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:52:1: blockDef : '{' activityListDef '}' -> ^( BRANCH activityListDef ) ;
    def blockDef(self, ):

        retval = self.blockDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        char_literal48 = None
        char_literal50 = None
        activityListDef49 = None


        char_literal48_tree = None
        char_literal50_tree = None
        stream_30 = RewriteRuleTokenStream(self._adaptor, "token 30")
        stream_31 = RewriteRuleTokenStream(self._adaptor, "token 31")
        stream_activityListDef = RewriteRuleSubtreeStream(self._adaptor, "rule activityListDef")
        try:
            self._dbg.enterRule(self.getGrammarFileName(), "blockDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(52, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:52:9: ( '{' activityListDef '}' -> ^( BRANCH activityListDef ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:52:11: '{' activityListDef '}'
                    pass 
                    self._dbg.location(52, 11)
                    char_literal48=self.match(self.input, 30, self.FOLLOW_30_in_blockDef422) 
                    if self._state.backtracking == 0:
                        stream_30.add(char_literal48)
                    self._dbg.location(52, 15)
                    self._state.following.append(self.FOLLOW_activityListDef_in_blockDef424)
                    activityListDef49 = self.activityListDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_activityListDef.add(activityListDef49.tree)
                    self._dbg.location(52, 31)
                    char_literal50=self.match(self.input, 31, self.FOLLOW_31_in_blockDef426) 
                    if self._state.backtracking == 0:
                        stream_31.add(char_literal50)

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
                        # 52:35: -> ^( BRANCH activityListDef )
                        self._dbg.location(52, 38)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:52:38: ^( BRANCH activityListDef )
                        root_1 = self._adaptor.nil()
                        self._dbg.location(52, 40)
                        root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(BRANCH, "BRANCH"), root_1)

                        self._dbg.location(52, 47)
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

            self._dbg.location(52, 63)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "blockDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "blockDef"

    class activityListDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.activityListDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "activityListDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:1: activityListDef : ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "activityListDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(54, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:16: ( ( ( ANNOTATION )* activityDef )* -> ( activityDef )+ )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:18: ( ( ANNOTATION )* activityDef )*
                    pass 
                    self._dbg.location(54, 18)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:18: ( ( ANNOTATION )* activityDef )*
                    try:
                        self._dbg.enterSubRule(17)
                        while True: #loop17
                            alt17 = 2
                            try:
                                self._dbg.enterDecision(17)
                                try:
                                    self.isCyclicDecision = True
                                    alt17 = self.dfa17.predict(self.input)

                                except NoViableAltException, nvae:
                                    self._dbg.recognitionException(nvae)
                                    raise

                            finally:
                                self._dbg.exitDecision(17)
                            if alt17 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:20: ( ANNOTATION )* activityDef
                                pass 
                                self._dbg.location(54, 20)
                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:20: ( ANNOTATION )*
                                try:
                                    self._dbg.enterSubRule(16)
                                    while True: #loop16
                                        alt16 = 2
                                        try:
                                            self._dbg.enterDecision(16)
                                            LA16_0 = self.input.LA(1)

                                            if (LA16_0 == ANNOTATION) :
                                                alt16 = 1


                                        finally:
                                            self._dbg.exitDecision(16)
                                        if alt16 == 1:
                                            self._dbg.enterAlt(1)

                                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:22: ANNOTATION
                                            pass 
                                            self._dbg.location(54, 22)
                                            ANNOTATION51=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_activityListDef445) 
                                            if self._state.backtracking == 0:
                                                stream_ANNOTATION.add(ANNOTATION51)


                                        else:
                                            break #loop16
                                finally:
                                    self._dbg.exitSubRule(16)

                                self._dbg.location(54, 36)
                                self._state.following.append(self.FOLLOW_activityDef_in_activityListDef450)
                                activityDef52 = self.activityDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    stream_activityDef.add(activityDef52.tree)


                            else:
                                break #loop17
                    finally:
                        self._dbg.exitSubRule(17)


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
                        # 54:51: -> ( activityDef )+
                        self._dbg.location(54, 54)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:54:54: ( activityDef )+
                        if not (stream_activityDef.hasNext()):
                            raise RewriteEarlyExitException()

                        while stream_activityDef.hasNext():
                            self._dbg.location(54, 54)
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

            self._dbg.location(54, 66)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "activityListDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "activityListDef"

    class activityDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.activityDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "activityDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:1: activityDef : ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef );
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
            self._dbg.enterRule(self.getGrammarFileName(), "activityDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(56, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:12: ( ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';' | choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef | recBlockDef | globalEscapeDef )
                    alt19 = 8
                    try:
                        self._dbg.enterDecision(19)
                        LA19 = self.input.LA(1)
                        if LA19 == ID or LA19 == 42 or LA19 == 43 or LA19 == 44:
                            alt19 = 1
                        elif LA19 == 37:
                            alt19 = 2
                        elif LA19 == 27 or LA19 == 30 or LA19 == 36:
                            alt19 = 3
                        elif LA19 == 45:
                            alt19 = 4
                        elif LA19 == 40:
                            alt19 = 5
                        elif LA19 == 49:
                            alt19 = 6
                        elif LA19 == 41:
                            alt19 = 7
                        elif LA19 == 47:
                            alt19 = 8
                        else:
                            if self._state.backtracking > 0:
                                raise BacktrackingFailed

                            nvae = NoViableAltException("", 19, 0, self.input)

                            self._dbg.recognitionException(nvae)
                            raise nvae

                    finally:
                        self._dbg.exitDecision(19)
                    if alt19 == 1:
                        self._dbg.enterAlt(1)

                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';'
                        pass 
                        root_0 = self._adaptor.nil()

                        self._dbg.location(56, 14)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:14: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef )
                        alt18 = 6
                        try:
                            self._dbg.enterSubRule(18)
                            try:
                                self._dbg.enterDecision(18)
                                LA18 = self.input.LA(1)
                                if LA18 == ID:
                                    LA18 = self.input.LA(2)
                                    if LA18 == 27 or LA18 == 32 or LA18 == 36:
                                        alt18 = 2
                                    elif LA18 == 26:
                                        alt18 = 5
                                    elif LA18 == 35:
                                        alt18 = 1
                                    else:
                                        if self._state.backtracking > 0:
                                            raise BacktrackingFailed

                                        nvae = NoViableAltException("", 18, 1, self.input)

                                        self._dbg.recognitionException(nvae)
                                        raise nvae

                                elif LA18 == 44:
                                    alt18 = 3
                                elif LA18 == 43:
                                    alt18 = 4
                                elif LA18 == 42:
                                    alt18 = 6
                                else:
                                    if self._state.backtracking > 0:
                                        raise BacktrackingFailed

                                    nvae = NoViableAltException("", 18, 0, self.input)

                                    self._dbg.recognitionException(nvae)
                                    raise nvae

                            finally:
                                self._dbg.exitDecision(18)
                            if alt18 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:16: introducesDef
                                pass 
                                self._dbg.location(56, 16)
                                self._state.following.append(self.FOLLOW_introducesDef_in_activityDef467)
                                introducesDef53 = self.introducesDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, introducesDef53.tree)


                            elif alt18 == 2:
                                self._dbg.enterAlt(2)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:32: interactionDef
                                pass 
                                self._dbg.location(56, 32)
                                self._state.following.append(self.FOLLOW_interactionDef_in_activityDef471)
                                interactionDef54 = self.interactionDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, interactionDef54.tree)


                            elif alt18 == 3:
                                self._dbg.enterAlt(3)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:49: inlineDef
                                pass 
                                self._dbg.location(56, 49)
                                self._state.following.append(self.FOLLOW_inlineDef_in_activityDef475)
                                inlineDef55 = self.inlineDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, inlineDef55.tree)


                            elif alt18 == 4:
                                self._dbg.enterAlt(4)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:61: runDef
                                pass 
                                self._dbg.location(56, 61)
                                self._state.following.append(self.FOLLOW_runDef_in_activityDef479)
                                runDef56 = self.runDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, runDef56.tree)


                            elif alt18 == 5:
                                self._dbg.enterAlt(5)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:70: recursionDef
                                pass 
                                self._dbg.location(56, 70)
                                self._state.following.append(self.FOLLOW_recursionDef_in_activityDef483)
                                recursionDef57 = self.recursionDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, recursionDef57.tree)


                            elif alt18 == 6:
                                self._dbg.enterAlt(6)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:56:85: endDef
                                pass 
                                self._dbg.location(56, 85)
                                self._state.following.append(self.FOLLOW_endDef_in_activityDef487)
                                endDef58 = self.endDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, endDef58.tree)



                        finally:
                            self._dbg.exitSubRule(18)
                        self._dbg.location(56, 97)
                        char_literal59=self.match(self.input, 26, self.FOLLOW_26_in_activityDef491)


                    elif alt19 == 2:
                        self._dbg.enterAlt(2)

                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:57:4: choiceDef
                        pass 
                        root_0 = self._adaptor.nil()

                        self._dbg.location(57, 4)
                        self._state.following.append(self.FOLLOW_choiceDef_in_activityDef500)
                        choiceDef60 = self.choiceDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, choiceDef60.tree)


                    elif alt19 == 3:
                        self._dbg.enterAlt(3)

                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:57:16: directedChoiceDef
                        pass 
                        root_0 = self._adaptor.nil()

                        self._dbg.location(57, 16)
                        self._state.following.append(self.FOLLOW_directedChoiceDef_in_activityDef504)
                        directedChoiceDef61 = self.directedChoiceDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, directedChoiceDef61.tree)


                    elif alt19 == 4:
                        self._dbg.enterAlt(4)

                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:57:36: parallelDef
                        pass 
                        root_0 = self._adaptor.nil()

                        self._dbg.location(57, 36)
                        self._state.following.append(self.FOLLOW_parallelDef_in_activityDef508)
                        parallelDef62 = self.parallelDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, parallelDef62.tree)


                    elif alt19 == 5:
                        self._dbg.enterAlt(5)

                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:57:50: repeatDef
                        pass 
                        root_0 = self._adaptor.nil()

                        self._dbg.location(57, 50)
                        self._state.following.append(self.FOLLOW_repeatDef_in_activityDef512)
                        repeatDef63 = self.repeatDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, repeatDef63.tree)


                    elif alt19 == 6:
                        self._dbg.enterAlt(6)

                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:57:62: unorderedDef
                        pass 
                        root_0 = self._adaptor.nil()

                        self._dbg.location(57, 62)
                        self._state.following.append(self.FOLLOW_unorderedDef_in_activityDef516)
                        unorderedDef64 = self.unorderedDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, unorderedDef64.tree)


                    elif alt19 == 7:
                        self._dbg.enterAlt(7)

                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:58:4: recBlockDef
                        pass 
                        root_0 = self._adaptor.nil()

                        self._dbg.location(58, 4)
                        self._state.following.append(self.FOLLOW_recBlockDef_in_activityDef523)
                        recBlockDef65 = self.recBlockDef()

                        self._state.following.pop()
                        if self._state.backtracking == 0:
                            self._adaptor.addChild(root_0, recBlockDef65.tree)


                    elif alt19 == 8:
                        self._dbg.enterAlt(8)

                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:58:18: globalEscapeDef
                        pass 
                        root_0 = self._adaptor.nil()

                        self._dbg.location(58, 18)
                        self._state.following.append(self.FOLLOW_globalEscapeDef_in_activityDef527)
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

            self._dbg.location(58, 34)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "activityDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "activityDef"

    class introducesDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.introducesDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "introducesDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:60:1: introducesDef : roleDef 'introduces' roleDef ( ',' roleDef )* ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "introducesDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(60, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:60:14: ( roleDef 'introduces' roleDef ( ',' roleDef )* )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:60:16: roleDef 'introduces' roleDef ( ',' roleDef )*
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(60, 16)
                    self._state.following.append(self.FOLLOW_roleDef_in_introducesDef535)
                    roleDef67 = self.roleDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, roleDef67.tree)
                    self._dbg.location(60, 24)
                    string_literal68=self.match(self.input, 35, self.FOLLOW_35_in_introducesDef537)
                    if self._state.backtracking == 0:

                        string_literal68_tree = self._adaptor.createWithPayload(string_literal68)
                        self._adaptor.addChild(root_0, string_literal68_tree)

                    self._dbg.location(60, 37)
                    self._state.following.append(self.FOLLOW_roleDef_in_introducesDef539)
                    roleDef69 = self.roleDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, roleDef69.tree)
                    self._dbg.location(60, 45)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:60:45: ( ',' roleDef )*
                    try:
                        self._dbg.enterSubRule(20)
                        while True: #loop20
                            alt20 = 2
                            try:
                                self._dbg.enterDecision(20)
                                LA20_0 = self.input.LA(1)

                                if (LA20_0 == 25) :
                                    alt20 = 1


                            finally:
                                self._dbg.exitDecision(20)
                            if alt20 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:60:47: ',' roleDef
                                pass 
                                self._dbg.location(60, 50)
                                char_literal70=self.match(self.input, 25, self.FOLLOW_25_in_introducesDef543)
                                self._dbg.location(60, 52)
                                self._state.following.append(self.FOLLOW_roleDef_in_introducesDef546)
                                roleDef71 = self.roleDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, roleDef71.tree)


                            else:
                                break #loop20
                    finally:
                        self._dbg.exitSubRule(20)




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

            self._dbg.location(60, 63)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "introducesDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "introducesDef"

    class roleDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.roleDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "roleDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:62:1: roleDef : ID -> ID ;
    def roleDef(self, ):

        retval = self.roleDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID72 = None

        ID72_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "roleDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(62, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:62:8: ( ID -> ID )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:62:10: ID
                    pass 
                    self._dbg.location(62, 10)
                    ID72=self.match(self.input, ID, self.FOLLOW_ID_in_roleDef557) 
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
                        # 62:13: -> ID
                        self._dbg.location(62, 16)
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

            self._dbg.location(62, 18)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "roleDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "roleDef"

    class roleName_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.roleName_return, self).__init__()

            self.tree = None




    # $ANTLR start "roleName"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:64:1: roleName : ID -> ID ;
    def roleName(self, ):

        retval = self.roleName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID73 = None

        ID73_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "roleName")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(64, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:64:9: ( ID -> ID )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:64:11: ID
                    pass 
                    self._dbg.location(64, 11)
                    ID73=self.match(self.input, ID, self.FOLLOW_ID_in_roleName568) 
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
                        # 64:14: -> ID
                        self._dbg.location(64, 17)
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

            self._dbg.location(64, 19)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "roleName")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "roleName"

    class typeReferenceDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.typeReferenceDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "typeReferenceDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:66:1: typeReferenceDef : ID -> ID ;
    def typeReferenceDef(self, ):

        retval = self.typeReferenceDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID74 = None

        ID74_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "typeReferenceDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(66, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:66:17: ( ID -> ID )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:66:19: ID
                    pass 
                    self._dbg.location(66, 19)
                    ID74=self.match(self.input, ID, self.FOLLOW_ID_in_typeReferenceDef579) 
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
                        # 66:22: -> ID
                        self._dbg.location(66, 25)
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

            self._dbg.location(66, 28)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "typeReferenceDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "typeReferenceDef"

    class interactionSignatureDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.interactionSignatureDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "interactionSignatureDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:1: interactionSignatureDef : ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' ) ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "interactionSignatureDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(68, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:24: ( ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:26: ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' )
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(68, 26)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:26: ( typeReferenceDef | ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')' )
                    alt23 = 2
                    try:
                        self._dbg.enterSubRule(23)
                        try:
                            self._dbg.enterDecision(23)
                            LA23_0 = self.input.LA(1)

                            if (LA23_0 == ID) :
                                LA23_1 = self.input.LA(2)

                                if (LA23_1 == 32) :
                                    alt23 = 2
                                elif (LA23_1 == 27 or LA23_1 == 36 or LA23_1 == 39) :
                                    alt23 = 1
                                else:
                                    if self._state.backtracking > 0:
                                        raise BacktrackingFailed

                                    nvae = NoViableAltException("", 23, 1, self.input)

                                    self._dbg.recognitionException(nvae)
                                    raise nvae

                            else:
                                if self._state.backtracking > 0:
                                    raise BacktrackingFailed

                                nvae = NoViableAltException("", 23, 0, self.input)

                                self._dbg.recognitionException(nvae)
                                raise nvae

                        finally:
                            self._dbg.exitDecision(23)
                        if alt23 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:28: typeReferenceDef
                            pass 
                            self._dbg.location(68, 28)
                            self._state.following.append(self.FOLLOW_typeReferenceDef_in_interactionSignatureDef593)
                            typeReferenceDef75 = self.typeReferenceDef()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, typeReferenceDef75.tree)


                        elif alt23 == 2:
                            self._dbg.enterAlt(2)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:47: ID '(' ( typeReferenceDef ( ',' typeReferenceDef )* )? ')'
                            pass 
                            self._dbg.location(68, 47)
                            ID76=self.match(self.input, ID, self.FOLLOW_ID_in_interactionSignatureDef597)
                            if self._state.backtracking == 0:

                                ID76_tree = self._adaptor.createWithPayload(ID76)
                                self._adaptor.addChild(root_0, ID76_tree)

                            self._dbg.location(68, 53)
                            char_literal77=self.match(self.input, 32, self.FOLLOW_32_in_interactionSignatureDef599)
                            self._dbg.location(68, 55)
                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:55: ( typeReferenceDef ( ',' typeReferenceDef )* )?
                            alt22 = 2
                            try:
                                self._dbg.enterSubRule(22)
                                try:
                                    self._dbg.enterDecision(22)
                                    LA22_0 = self.input.LA(1)

                                    if (LA22_0 == ID) :
                                        alt22 = 1
                                finally:
                                    self._dbg.exitDecision(22)
                                if alt22 == 1:
                                    self._dbg.enterAlt(1)

                                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:57: typeReferenceDef ( ',' typeReferenceDef )*
                                    pass 
                                    self._dbg.location(68, 57)
                                    self._state.following.append(self.FOLLOW_typeReferenceDef_in_interactionSignatureDef604)
                                    typeReferenceDef78 = self.typeReferenceDef()

                                    self._state.following.pop()
                                    if self._state.backtracking == 0:
                                        self._adaptor.addChild(root_0, typeReferenceDef78.tree)
                                    self._dbg.location(68, 74)
                                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:74: ( ',' typeReferenceDef )*
                                    try:
                                        self._dbg.enterSubRule(21)
                                        while True: #loop21
                                            alt21 = 2
                                            try:
                                                self._dbg.enterDecision(21)
                                                LA21_0 = self.input.LA(1)

                                                if (LA21_0 == 25) :
                                                    alt21 = 1


                                            finally:
                                                self._dbg.exitDecision(21)
                                            if alt21 == 1:
                                                self._dbg.enterAlt(1)

                                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:68:76: ',' typeReferenceDef
                                                pass 
                                                self._dbg.location(68, 79)
                                                char_literal79=self.match(self.input, 25, self.FOLLOW_25_in_interactionSignatureDef608)
                                                self._dbg.location(68, 81)
                                                self._state.following.append(self.FOLLOW_typeReferenceDef_in_interactionSignatureDef611)
                                                typeReferenceDef80 = self.typeReferenceDef()

                                                self._state.following.pop()
                                                if self._state.backtracking == 0:
                                                    self._adaptor.addChild(root_0, typeReferenceDef80.tree)


                                            else:
                                                break #loop21
                                    finally:
                                        self._dbg.exitSubRule(21)




                            finally:
                                self._dbg.exitSubRule(22)
                            self._dbg.location(68, 107)
                            char_literal81=self.match(self.input, 33, self.FOLLOW_33_in_interactionSignatureDef619)



                    finally:
                        self._dbg.exitSubRule(23)



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

            self._dbg.location(68, 110)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "interactionSignatureDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "interactionSignatureDef"

    class interactionDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.interactionDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "interactionDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:71:1: interactionDef : interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) ) ;
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
        stream_36 = RewriteRuleTokenStream(self._adaptor, "token 36")
        stream_27 = RewriteRuleTokenStream(self._adaptor, "token 27")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        stream_interactionSignatureDef = RewriteRuleSubtreeStream(self._adaptor, "rule interactionSignatureDef")
        try:
            self._dbg.enterRule(self.getGrammarFileName(), "interactionDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(71, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:71:15: ( interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:72:7: interactionSignatureDef ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) )
                    pass 
                    self._dbg.location(72, 7)
                    self._state.following.append(self.FOLLOW_interactionSignatureDef_in_interactionDef637)
                    interactionSignatureDef82 = self.interactionSignatureDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_interactionSignatureDef.add(interactionSignatureDef82.tree)
                    self._dbg.location(72, 31)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:72:31: ( 'from' role= roleName -> ^( RESV interactionSignatureDef $role) | 'to' roleName -> ^( SEND interactionSignatureDef roleName ) )
                    alt24 = 2
                    try:
                        self._dbg.enterSubRule(24)
                        try:
                            self._dbg.enterDecision(24)
                            LA24_0 = self.input.LA(1)

                            if (LA24_0 == 27) :
                                alt24 = 1
                            elif (LA24_0 == 36) :
                                alt24 = 2
                            else:
                                if self._state.backtracking > 0:
                                    raise BacktrackingFailed

                                nvae = NoViableAltException("", 24, 0, self.input)

                                self._dbg.recognitionException(nvae)
                                raise nvae

                        finally:
                            self._dbg.exitDecision(24)
                        if alt24 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:73:3: 'from' role= roleName
                            pass 
                            self._dbg.location(73, 3)
                            string_literal83=self.match(self.input, 27, self.FOLLOW_27_in_interactionDef643) 
                            if self._state.backtracking == 0:
                                stream_27.add(string_literal83)
                            self._dbg.location(73, 14)
                            self._state.following.append(self.FOLLOW_roleName_in_interactionDef648)
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
                                # 73:26: -> ^( RESV interactionSignatureDef $role)
                                self._dbg.location(73, 29)
                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:73:29: ^( RESV interactionSignatureDef $role)
                                root_1 = self._adaptor.nil()
                                self._dbg.location(73, 31)
                                root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(RESV, "RESV"), root_1)

                                self._dbg.location(73, 36)
                                self._adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree())
                                self._dbg.location(73, 60)
                                self._adaptor.addChild(root_1, stream_role.nextTree())

                                self._adaptor.addChild(root_0, root_1)



                                retval.tree = root_0


                        elif alt24 == 2:
                            self._dbg.enterAlt(2)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:74:10: 'to' roleName
                            pass 
                            self._dbg.location(74, 10)
                            string_literal84=self.match(self.input, 36, self.FOLLOW_36_in_interactionDef672) 
                            if self._state.backtracking == 0:
                                stream_36.add(string_literal84)
                            self._dbg.location(74, 15)
                            self._state.following.append(self.FOLLOW_roleName_in_interactionDef674)
                            roleName85 = self.roleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_roleName.add(roleName85.tree)

                            # AST Rewrite
                            # elements: roleName, interactionSignatureDef
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
                                # 74:25: -> ^( SEND interactionSignatureDef roleName )
                                self._dbg.location(74, 28)
                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:74:28: ^( SEND interactionSignatureDef roleName )
                                root_1 = self._adaptor.nil()
                                self._dbg.location(74, 30)
                                root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(SEND, "SEND"), root_1)

                                self._dbg.location(74, 35)
                                self._adaptor.addChild(root_1, stream_interactionSignatureDef.nextTree())
                                self._dbg.location(74, 59)
                                self._adaptor.addChild(root_1, stream_roleName.nextTree())

                                self._adaptor.addChild(root_0, root_1)



                                retval.tree = root_0



                    finally:
                        self._dbg.exitSubRule(24)



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

            self._dbg.location(74, 69)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "interactionDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "interactionDef"

    class choiceDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.choiceDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "choiceDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:1: choiceDef : 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) ;
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
        stream_37 = RewriteRuleTokenStream(self._adaptor, "token 37")
        stream_29 = RewriteRuleTokenStream(self._adaptor, "token 29")
        stream_38 = RewriteRuleTokenStream(self._adaptor, "token 38")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            self._dbg.enterRule(self.getGrammarFileName(), "choiceDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(76, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:10: ( 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^( 'choice' ( blockDef )+ ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:12: 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )*
                    pass 
                    self._dbg.location(76, 12)
                    string_literal86=self.match(self.input, 37, self.FOLLOW_37_in_choiceDef693) 
                    if self._state.backtracking == 0:
                        stream_37.add(string_literal86)
                    self._dbg.location(76, 21)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:21: ( 'at' roleName )?
                    alt25 = 2
                    try:
                        self._dbg.enterSubRule(25)
                        try:
                            self._dbg.enterDecision(25)
                            LA25_0 = self.input.LA(1)

                            if (LA25_0 == 29) :
                                alt25 = 1
                        finally:
                            self._dbg.exitDecision(25)
                        if alt25 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:23: 'at' roleName
                            pass 
                            self._dbg.location(76, 23)
                            string_literal87=self.match(self.input, 29, self.FOLLOW_29_in_choiceDef697) 
                            if self._state.backtracking == 0:
                                stream_29.add(string_literal87)
                            self._dbg.location(76, 28)
                            self._state.following.append(self.FOLLOW_roleName_in_choiceDef699)
                            roleName88 = self.roleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_roleName.add(roleName88.tree)



                    finally:
                        self._dbg.exitSubRule(25)
                    self._dbg.location(76, 40)
                    self._state.following.append(self.FOLLOW_blockDef_in_choiceDef704)
                    blockDef89 = self.blockDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_blockDef.add(blockDef89.tree)
                    self._dbg.location(76, 49)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:49: ( 'or' blockDef )*
                    try:
                        self._dbg.enterSubRule(26)
                        while True: #loop26
                            alt26 = 2
                            try:
                                self._dbg.enterDecision(26)
                                LA26_0 = self.input.LA(1)

                                if (LA26_0 == 38) :
                                    alt26 = 1


                            finally:
                                self._dbg.exitDecision(26)
                            if alt26 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:51: 'or' blockDef
                                pass 
                                self._dbg.location(76, 51)
                                string_literal90=self.match(self.input, 38, self.FOLLOW_38_in_choiceDef708) 
                                if self._state.backtracking == 0:
                                    stream_38.add(string_literal90)
                                self._dbg.location(76, 56)
                                self._state.following.append(self.FOLLOW_blockDef_in_choiceDef710)
                                blockDef91 = self.blockDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    stream_blockDef.add(blockDef91.tree)


                            else:
                                break #loop26
                    finally:
                        self._dbg.exitSubRule(26)


                    # AST Rewrite
                    # elements: 37, blockDef
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
                        # 76:68: -> ^( 'choice' ( blockDef )+ )
                        self._dbg.location(76, 71)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:71: ^( 'choice' ( blockDef )+ )
                        root_1 = self._adaptor.nil()
                        self._dbg.location(76, 73)
                        root_1 = self._adaptor.becomeRoot(stream_37.nextNode(), root_1)

                        self._dbg.location(76, 82)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:76:82: ( blockDef )+
                        if not (stream_blockDef.hasNext()):
                            raise RewriteEarlyExitException()

                        while stream_blockDef.hasNext():
                            self._dbg.location(76, 82)
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

            self._dbg.location(76, 92)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "choiceDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "choiceDef"

    class directedChoiceDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.directedChoiceDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "directedChoiceDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:1: directedChoiceDef : ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "directedChoiceDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(78, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:18: ( ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}' )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:20: ( 'from' roleName )? ( 'to' roleName ( ',' roleName )* )? '{' ( onMessageDef )+ '}'
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(78, 20)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:20: ( 'from' roleName )?
                    alt27 = 2
                    try:
                        self._dbg.enterSubRule(27)
                        try:
                            self._dbg.enterDecision(27)
                            LA27_0 = self.input.LA(1)

                            if (LA27_0 == 27) :
                                alt27 = 1
                        finally:
                            self._dbg.exitDecision(27)
                        if alt27 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:22: 'from' roleName
                            pass 
                            self._dbg.location(78, 22)
                            string_literal92=self.match(self.input, 27, self.FOLLOW_27_in_directedChoiceDef731)
                            if self._state.backtracking == 0:

                                string_literal92_tree = self._adaptor.createWithPayload(string_literal92)
                                self._adaptor.addChild(root_0, string_literal92_tree)

                            self._dbg.location(78, 29)
                            self._state.following.append(self.FOLLOW_roleName_in_directedChoiceDef733)
                            roleName93 = self.roleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, roleName93.tree)



                    finally:
                        self._dbg.exitSubRule(27)
                    self._dbg.location(78, 41)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:41: ( 'to' roleName ( ',' roleName )* )?
                    alt29 = 2
                    try:
                        self._dbg.enterSubRule(29)
                        try:
                            self._dbg.enterDecision(29)
                            LA29_0 = self.input.LA(1)

                            if (LA29_0 == 36) :
                                alt29 = 1
                        finally:
                            self._dbg.exitDecision(29)
                        if alt29 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:43: 'to' roleName ( ',' roleName )*
                            pass 
                            self._dbg.location(78, 43)
                            string_literal94=self.match(self.input, 36, self.FOLLOW_36_in_directedChoiceDef740)
                            if self._state.backtracking == 0:

                                string_literal94_tree = self._adaptor.createWithPayload(string_literal94)
                                self._adaptor.addChild(root_0, string_literal94_tree)

                            self._dbg.location(78, 48)
                            self._state.following.append(self.FOLLOW_roleName_in_directedChoiceDef742)
                            roleName95 = self.roleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, roleName95.tree)
                            self._dbg.location(78, 57)
                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:57: ( ',' roleName )*
                            try:
                                self._dbg.enterSubRule(28)
                                while True: #loop28
                                    alt28 = 2
                                    try:
                                        self._dbg.enterDecision(28)
                                        LA28_0 = self.input.LA(1)

                                        if (LA28_0 == 25) :
                                            alt28 = 1


                                    finally:
                                        self._dbg.exitDecision(28)
                                    if alt28 == 1:
                                        self._dbg.enterAlt(1)

                                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:59: ',' roleName
                                        pass 
                                        self._dbg.location(78, 62)
                                        char_literal96=self.match(self.input, 25, self.FOLLOW_25_in_directedChoiceDef746)
                                        self._dbg.location(78, 64)
                                        self._state.following.append(self.FOLLOW_roleName_in_directedChoiceDef749)
                                        roleName97 = self.roleName()

                                        self._state.following.pop()
                                        if self._state.backtracking == 0:
                                            self._adaptor.addChild(root_0, roleName97.tree)


                                    else:
                                        break #loop28
                            finally:
                                self._dbg.exitSubRule(28)




                    finally:
                        self._dbg.exitSubRule(29)
                    self._dbg.location(78, 79)
                    char_literal98=self.match(self.input, 30, self.FOLLOW_30_in_directedChoiceDef757)
                    if self._state.backtracking == 0:

                        char_literal98_tree = self._adaptor.createWithPayload(char_literal98)
                        self._adaptor.addChild(root_0, char_literal98_tree)

                    self._dbg.location(78, 83)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:83: ( onMessageDef )+
                    cnt30 = 0
                    try:
                        self._dbg.enterSubRule(30)
                        while True: #loop30
                            alt30 = 2
                            try:
                                self._dbg.enterDecision(30)
                                LA30_0 = self.input.LA(1)

                                if (LA30_0 == ID) :
                                    alt30 = 1


                            finally:
                                self._dbg.exitDecision(30)
                            if alt30 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:78:85: onMessageDef
                                pass 
                                self._dbg.location(78, 85)
                                self._state.following.append(self.FOLLOW_onMessageDef_in_directedChoiceDef761)
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
                                self._dbg.recognitionException(eee)

                                raise eee

                            cnt30 += 1
                    finally:
                        self._dbg.exitSubRule(30)

                    self._dbg.location(78, 101)
                    char_literal100=self.match(self.input, 31, self.FOLLOW_31_in_directedChoiceDef766)
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

            self._dbg.location(78, 104)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "directedChoiceDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "directedChoiceDef"

    class onMessageDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.onMessageDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "onMessageDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:80:1: onMessageDef : interactionSignatureDef ':' activityList ;
    def onMessageDef(self, ):

        retval = self.onMessageDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        char_literal102 = None
        interactionSignatureDef101 = None

        activityList103 = None


        char_literal102_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "onMessageDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(80, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:80:13: ( interactionSignatureDef ':' activityList )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:80:15: interactionSignatureDef ':' activityList
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(80, 15)
                    self._state.following.append(self.FOLLOW_interactionSignatureDef_in_onMessageDef773)
                    interactionSignatureDef101 = self.interactionSignatureDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, interactionSignatureDef101.tree)
                    self._dbg.location(80, 39)
                    char_literal102=self.match(self.input, 39, self.FOLLOW_39_in_onMessageDef775)
                    if self._state.backtracking == 0:

                        char_literal102_tree = self._adaptor.createWithPayload(char_literal102)
                        self._adaptor.addChild(root_0, char_literal102_tree)

                    self._dbg.location(80, 43)
                    self._state.following.append(self.FOLLOW_activityList_in_onMessageDef777)
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

            self._dbg.location(80, 56)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "onMessageDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "onMessageDef"

    class activityList_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.activityList_return, self).__init__()

            self.tree = None




    # $ANTLR start "activityList"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:1: activityList : ( ( ANNOTATION )* activityDef )* ;
    def activityList(self, ):

        retval = self.activityList_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ANNOTATION104 = None
        activityDef105 = None


        ANNOTATION104_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "activityList")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(82, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:13: ( ( ( ANNOTATION )* activityDef )* )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:15: ( ( ANNOTATION )* activityDef )*
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(82, 15)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:15: ( ( ANNOTATION )* activityDef )*
                    try:
                        self._dbg.enterSubRule(32)
                        while True: #loop32
                            alt32 = 2
                            try:
                                self._dbg.enterDecision(32)
                                try:
                                    self.isCyclicDecision = True
                                    alt32 = self.dfa32.predict(self.input)

                                except NoViableAltException, nvae:
                                    self._dbg.recognitionException(nvae)
                                    raise

                            finally:
                                self._dbg.exitDecision(32)
                            if alt32 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:17: ( ANNOTATION )* activityDef
                                pass 
                                self._dbg.location(82, 17)
                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:17: ( ANNOTATION )*
                                try:
                                    self._dbg.enterSubRule(31)
                                    while True: #loop31
                                        alt31 = 2
                                        try:
                                            self._dbg.enterDecision(31)
                                            LA31_0 = self.input.LA(1)

                                            if (LA31_0 == ANNOTATION) :
                                                alt31 = 1


                                        finally:
                                            self._dbg.exitDecision(31)
                                        if alt31 == 1:
                                            self._dbg.enterAlt(1)

                                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:82:19: ANNOTATION
                                            pass 
                                            self._dbg.location(82, 19)
                                            ANNOTATION104=self.match(self.input, ANNOTATION, self.FOLLOW_ANNOTATION_in_activityList790)
                                            if self._state.backtracking == 0:

                                                ANNOTATION104_tree = self._adaptor.createWithPayload(ANNOTATION104)
                                                self._adaptor.addChild(root_0, ANNOTATION104_tree)



                                        else:
                                            break #loop31
                                finally:
                                    self._dbg.exitSubRule(31)

                                self._dbg.location(82, 33)
                                self._state.following.append(self.FOLLOW_activityDef_in_activityList795)
                                activityDef105 = self.activityDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, activityDef105.tree)


                            else:
                                break #loop32
                    finally:
                        self._dbg.exitSubRule(32)




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

            self._dbg.location(82, 47)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "activityList")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "activityList"

    class repeatDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.repeatDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "repeatDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:1: repeatDef : 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) ;
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
        stream_40 = RewriteRuleTokenStream(self._adaptor, "token 40")
        stream_25 = RewriteRuleTokenStream(self._adaptor, "token 25")
        stream_29 = RewriteRuleTokenStream(self._adaptor, "token 29")
        stream_roleName = RewriteRuleSubtreeStream(self._adaptor, "rule roleName")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            self._dbg.enterRule(self.getGrammarFileName(), "repeatDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(84, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:10: ( 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef -> ^( 'repeat' blockDef ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:12: 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef
                    pass 
                    self._dbg.location(84, 12)
                    string_literal106=self.match(self.input, 40, self.FOLLOW_40_in_repeatDef805) 
                    if self._state.backtracking == 0:
                        stream_40.add(string_literal106)
                    self._dbg.location(84, 21)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:21: ( 'at' roleName ( ',' roleName )* )?
                    alt34 = 2
                    try:
                        self._dbg.enterSubRule(34)
                        try:
                            self._dbg.enterDecision(34)
                            LA34_0 = self.input.LA(1)

                            if (LA34_0 == 29) :
                                alt34 = 1
                        finally:
                            self._dbg.exitDecision(34)
                        if alt34 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:23: 'at' roleName ( ',' roleName )*
                            pass 
                            self._dbg.location(84, 23)
                            string_literal107=self.match(self.input, 29, self.FOLLOW_29_in_repeatDef809) 
                            if self._state.backtracking == 0:
                                stream_29.add(string_literal107)
                            self._dbg.location(84, 28)
                            self._state.following.append(self.FOLLOW_roleName_in_repeatDef811)
                            roleName108 = self.roleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                stream_roleName.add(roleName108.tree)
                            self._dbg.location(84, 37)
                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:37: ( ',' roleName )*
                            try:
                                self._dbg.enterSubRule(33)
                                while True: #loop33
                                    alt33 = 2
                                    try:
                                        self._dbg.enterDecision(33)
                                        LA33_0 = self.input.LA(1)

                                        if (LA33_0 == 25) :
                                            alt33 = 1


                                    finally:
                                        self._dbg.exitDecision(33)
                                    if alt33 == 1:
                                        self._dbg.enterAlt(1)

                                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:39: ',' roleName
                                        pass 
                                        self._dbg.location(84, 39)
                                        char_literal109=self.match(self.input, 25, self.FOLLOW_25_in_repeatDef815) 
                                        if self._state.backtracking == 0:
                                            stream_25.add(char_literal109)
                                        self._dbg.location(84, 43)
                                        self._state.following.append(self.FOLLOW_roleName_in_repeatDef817)
                                        roleName110 = self.roleName()

                                        self._state.following.pop()
                                        if self._state.backtracking == 0:
                                            stream_roleName.add(roleName110.tree)


                                    else:
                                        break #loop33
                            finally:
                                self._dbg.exitSubRule(33)




                    finally:
                        self._dbg.exitSubRule(34)
                    self._dbg.location(84, 58)
                    self._state.following.append(self.FOLLOW_blockDef_in_repeatDef825)
                    blockDef111 = self.blockDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_blockDef.add(blockDef111.tree)

                    # AST Rewrite
                    # elements: blockDef, 40
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
                        # 84:68: -> ^( 'repeat' blockDef )
                        self._dbg.location(84, 71)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:84:71: ^( 'repeat' blockDef )
                        root_1 = self._adaptor.nil()
                        self._dbg.location(84, 73)
                        root_1 = self._adaptor.becomeRoot(stream_40.nextNode(), root_1)

                        self._dbg.location(84, 82)
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

            self._dbg.location(84, 91)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "repeatDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "repeatDef"

    class recBlockDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.recBlockDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "recBlockDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:86:1: recBlockDef : 'rec' labelName blockDef -> ^( 'rec' blockDef ) ;
    def recBlockDef(self, ):

        retval = self.recBlockDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal112 = None
        labelName113 = None

        blockDef114 = None


        string_literal112_tree = None
        stream_41 = RewriteRuleTokenStream(self._adaptor, "token 41")
        stream_labelName = RewriteRuleSubtreeStream(self._adaptor, "rule labelName")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            self._dbg.enterRule(self.getGrammarFileName(), "recBlockDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(86, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:86:12: ( 'rec' labelName blockDef -> ^( 'rec' blockDef ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:86:14: 'rec' labelName blockDef
                    pass 
                    self._dbg.location(86, 14)
                    string_literal112=self.match(self.input, 41, self.FOLLOW_41_in_recBlockDef841) 
                    if self._state.backtracking == 0:
                        stream_41.add(string_literal112)
                    self._dbg.location(86, 20)
                    self._state.following.append(self.FOLLOW_labelName_in_recBlockDef843)
                    labelName113 = self.labelName()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_labelName.add(labelName113.tree)
                    self._dbg.location(86, 30)
                    self._state.following.append(self.FOLLOW_blockDef_in_recBlockDef845)
                    blockDef114 = self.blockDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_blockDef.add(blockDef114.tree)

                    # AST Rewrite
                    # elements: 41, blockDef
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
                        # 86:39: -> ^( 'rec' blockDef )
                        self._dbg.location(86, 42)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:86:42: ^( 'rec' blockDef )
                        root_1 = self._adaptor.nil()
                        self._dbg.location(86, 44)
                        root_1 = self._adaptor.becomeRoot(stream_41.nextNode(), root_1)

                        self._dbg.location(86, 50)
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

            self._dbg.location(86, 59)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "recBlockDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "recBlockDef"

    class labelName_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.labelName_return, self).__init__()

            self.tree = None




    # $ANTLR start "labelName"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:88:1: labelName : ID -> ID ;
    def labelName(self, ):

        retval = self.labelName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID115 = None

        ID115_tree = None
        stream_ID = RewriteRuleTokenStream(self._adaptor, "token ID")

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "labelName")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(88, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:88:10: ( ID -> ID )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:88:12: ID
                    pass 
                    self._dbg.location(88, 12)
                    ID115=self.match(self.input, ID, self.FOLLOW_ID_in_labelName860) 
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
                        # 88:15: -> ID
                        self._dbg.location(88, 18)
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

            self._dbg.location(88, 21)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "labelName")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "labelName"

    class recursionDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.recursionDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "recursionDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:90:1: recursionDef : labelName -> ^( RECLABEL labelName ) ;
    def recursionDef(self, ):

        retval = self.recursionDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        labelName116 = None


        stream_labelName = RewriteRuleSubtreeStream(self._adaptor, "rule labelName")
        try:
            self._dbg.enterRule(self.getGrammarFileName(), "recursionDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(90, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:90:13: ( labelName -> ^( RECLABEL labelName ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:90:15: labelName
                    pass 
                    self._dbg.location(90, 15)
                    self._state.following.append(self.FOLLOW_labelName_in_recursionDef872)
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
                        # 90:25: -> ^( RECLABEL labelName )
                        self._dbg.location(90, 28)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:90:28: ^( RECLABEL labelName )
                        root_1 = self._adaptor.nil()
                        self._dbg.location(90, 30)
                        root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(RECLABEL, "RECLABEL"), root_1)

                        self._dbg.location(90, 39)
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

            self._dbg.location(90, 49)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "recursionDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "recursionDef"

    class endDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.endDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "endDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:93:1: endDef : 'end' ;
    def endDef(self, ):

        retval = self.endDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal117 = None

        string_literal117_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "endDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(93, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:93:7: ( 'end' )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:93:9: 'end'
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(93, 14)
                    string_literal117=self.match(self.input, 42, self.FOLLOW_42_in_endDef888)
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

            self._dbg.location(93, 16)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "endDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "endDef"

    class runDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.runDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "runDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:1: runDef : 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "runDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(96, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:7: ( 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:9: 'run' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? 'from' roleName
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(96, 14)
                    string_literal118=self.match(self.input, 43, self.FOLLOW_43_in_runDef898)
                    if self._state.backtracking == 0:

                        string_literal118_tree = self._adaptor.createWithPayload(string_literal118)
                        root_0 = self._adaptor.becomeRoot(string_literal118_tree, root_0)

                    self._dbg.location(96, 16)
                    self._state.following.append(self.FOLLOW_protocolRefDef_in_runDef901)
                    protocolRefDef119 = self.protocolRefDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, protocolRefDef119.tree)
                    self._dbg.location(96, 31)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:31: ( '(' parameter ( ',' parameter )* ')' )?
                    alt36 = 2
                    try:
                        self._dbg.enterSubRule(36)
                        try:
                            self._dbg.enterDecision(36)
                            LA36_0 = self.input.LA(1)

                            if (LA36_0 == 32) :
                                alt36 = 1
                        finally:
                            self._dbg.exitDecision(36)
                        if alt36 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:33: '(' parameter ( ',' parameter )* ')'
                            pass 
                            self._dbg.location(96, 36)
                            char_literal120=self.match(self.input, 32, self.FOLLOW_32_in_runDef905)
                            self._dbg.location(96, 38)
                            self._state.following.append(self.FOLLOW_parameter_in_runDef908)
                            parameter121 = self.parameter()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, parameter121.tree)
                            self._dbg.location(96, 48)
                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:48: ( ',' parameter )*
                            try:
                                self._dbg.enterSubRule(35)
                                while True: #loop35
                                    alt35 = 2
                                    try:
                                        self._dbg.enterDecision(35)
                                        LA35_0 = self.input.LA(1)

                                        if (LA35_0 == 25) :
                                            alt35 = 1


                                    finally:
                                        self._dbg.exitDecision(35)
                                    if alt35 == 1:
                                        self._dbg.enterAlt(1)

                                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:96:50: ',' parameter
                                        pass 
                                        self._dbg.location(96, 53)
                                        char_literal122=self.match(self.input, 25, self.FOLLOW_25_in_runDef912)
                                        self._dbg.location(96, 55)
                                        self._state.following.append(self.FOLLOW_parameter_in_runDef915)
                                        parameter123 = self.parameter()

                                        self._state.following.pop()
                                        if self._state.backtracking == 0:
                                            self._adaptor.addChild(root_0, parameter123.tree)


                                    else:
                                        break #loop35
                            finally:
                                self._dbg.exitSubRule(35)

                            self._dbg.location(96, 71)
                            char_literal124=self.match(self.input, 33, self.FOLLOW_33_in_runDef920)



                    finally:
                        self._dbg.exitSubRule(36)
                    self._dbg.location(96, 76)
                    string_literal125=self.match(self.input, 27, self.FOLLOW_27_in_runDef926)
                    if self._state.backtracking == 0:

                        string_literal125_tree = self._adaptor.createWithPayload(string_literal125)
                        self._adaptor.addChild(root_0, string_literal125_tree)

                    self._dbg.location(96, 83)
                    self._state.following.append(self.FOLLOW_roleName_in_runDef928)
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

            self._dbg.location(96, 92)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "runDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "runDef"

    class protocolRefDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.protocolRefDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "protocolRefDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:98:1: protocolRefDef : ID ( 'at' roleName )? ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "protocolRefDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(98, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:98:15: ( ID ( 'at' roleName )? )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:98:17: ID ( 'at' roleName )?
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(98, 17)
                    ID127=self.match(self.input, ID, self.FOLLOW_ID_in_protocolRefDef936)
                    if self._state.backtracking == 0:

                        ID127_tree = self._adaptor.createWithPayload(ID127)
                        self._adaptor.addChild(root_0, ID127_tree)

                    self._dbg.location(98, 20)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:98:20: ( 'at' roleName )?
                    alt37 = 2
                    try:
                        self._dbg.enterSubRule(37)
                        try:
                            self._dbg.enterDecision(37)
                            LA37_0 = self.input.LA(1)

                            if (LA37_0 == 29) :
                                alt37 = 1
                        finally:
                            self._dbg.exitDecision(37)
                        if alt37 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:98:22: 'at' roleName
                            pass 
                            self._dbg.location(98, 22)
                            string_literal128=self.match(self.input, 29, self.FOLLOW_29_in_protocolRefDef940)
                            if self._state.backtracking == 0:

                                string_literal128_tree = self._adaptor.createWithPayload(string_literal128)
                                self._adaptor.addChild(root_0, string_literal128_tree)

                            self._dbg.location(98, 27)
                            self._state.following.append(self.FOLLOW_roleName_in_protocolRefDef942)
                            roleName129 = self.roleName()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, roleName129.tree)



                    finally:
                        self._dbg.exitSubRule(37)



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

            self._dbg.location(98, 39)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "protocolRefDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "protocolRefDef"

    class declarationName_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.declarationName_return, self).__init__()

            self.tree = None




    # $ANTLR start "declarationName"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:100:1: declarationName : ID ;
    def declarationName(self, ):

        retval = self.declarationName_return()
        retval.start = self.input.LT(1)

        root_0 = None

        ID130 = None

        ID130_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "declarationName")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(100, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:100:16: ( ID )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:100:18: ID
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(100, 18)
                    ID130=self.match(self.input, ID, self.FOLLOW_ID_in_declarationName953)
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

            self._dbg.location(100, 21)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "declarationName")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "declarationName"

    class parameter_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.parameter_return, self).__init__()

            self.tree = None




    # $ANTLR start "parameter"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:102:1: parameter : declarationName ;
    def parameter(self, ):

        retval = self.parameter_return()
        retval.start = self.input.LT(1)

        root_0 = None

        declarationName131 = None



        try:
            self._dbg.enterRule(self.getGrammarFileName(), "parameter")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(102, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:102:10: ( declarationName )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:102:12: declarationName
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(102, 12)
                    self._state.following.append(self.FOLLOW_declarationName_in_parameter961)
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

            self._dbg.location(102, 28)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "parameter")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "parameter"

    class inlineDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.inlineDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "inlineDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:1: inlineDef : 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? ;
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
            self._dbg.enterRule(self.getGrammarFileName(), "inlineDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(105, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:10: ( 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )? )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:12: 'inline' protocolRefDef ( '(' parameter ( ',' parameter )* ')' )?
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(105, 20)
                    string_literal132=self.match(self.input, 44, self.FOLLOW_44_in_inlineDef970)
                    if self._state.backtracking == 0:

                        string_literal132_tree = self._adaptor.createWithPayload(string_literal132)
                        root_0 = self._adaptor.becomeRoot(string_literal132_tree, root_0)

                    self._dbg.location(105, 22)
                    self._state.following.append(self.FOLLOW_protocolRefDef_in_inlineDef973)
                    protocolRefDef133 = self.protocolRefDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, protocolRefDef133.tree)
                    self._dbg.location(105, 37)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:37: ( '(' parameter ( ',' parameter )* ')' )?
                    alt39 = 2
                    try:
                        self._dbg.enterSubRule(39)
                        try:
                            self._dbg.enterDecision(39)
                            LA39_0 = self.input.LA(1)

                            if (LA39_0 == 32) :
                                alt39 = 1
                        finally:
                            self._dbg.exitDecision(39)
                        if alt39 == 1:
                            self._dbg.enterAlt(1)

                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:39: '(' parameter ( ',' parameter )* ')'
                            pass 
                            self._dbg.location(105, 42)
                            char_literal134=self.match(self.input, 32, self.FOLLOW_32_in_inlineDef977)
                            self._dbg.location(105, 44)
                            self._state.following.append(self.FOLLOW_parameter_in_inlineDef980)
                            parameter135 = self.parameter()

                            self._state.following.pop()
                            if self._state.backtracking == 0:
                                self._adaptor.addChild(root_0, parameter135.tree)
                            self._dbg.location(105, 54)
                            # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:54: ( ',' parameter )*
                            try:
                                self._dbg.enterSubRule(38)
                                while True: #loop38
                                    alt38 = 2
                                    try:
                                        self._dbg.enterDecision(38)
                                        LA38_0 = self.input.LA(1)

                                        if (LA38_0 == 25) :
                                            alt38 = 1


                                    finally:
                                        self._dbg.exitDecision(38)
                                    if alt38 == 1:
                                        self._dbg.enterAlt(1)

                                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:105:56: ',' parameter
                                        pass 
                                        self._dbg.location(105, 59)
                                        char_literal136=self.match(self.input, 25, self.FOLLOW_25_in_inlineDef984)
                                        self._dbg.location(105, 61)
                                        self._state.following.append(self.FOLLOW_parameter_in_inlineDef987)
                                        parameter137 = self.parameter()

                                        self._state.following.pop()
                                        if self._state.backtracking == 0:
                                            self._adaptor.addChild(root_0, parameter137.tree)


                                    else:
                                        break #loop38
                            finally:
                                self._dbg.exitSubRule(38)

                            self._dbg.location(105, 77)
                            char_literal138=self.match(self.input, 33, self.FOLLOW_33_in_inlineDef992)



                    finally:
                        self._dbg.exitSubRule(39)



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

            self._dbg.location(105, 82)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "inlineDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "inlineDef"

    class parallelDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.parallelDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "parallelDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:1: parallelDef : 'parallel' blockDef ( 'and' blockDef )* -> ^( 'parallel' ( blockDef )+ ) ;
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
        stream_45 = RewriteRuleTokenStream(self._adaptor, "token 45")
        stream_46 = RewriteRuleTokenStream(self._adaptor, "token 46")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            self._dbg.enterRule(self.getGrammarFileName(), "parallelDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(107, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:12: ( 'parallel' blockDef ( 'and' blockDef )* -> ^( 'parallel' ( blockDef )+ ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:14: 'parallel' blockDef ( 'and' blockDef )*
                    pass 
                    self._dbg.location(107, 14)
                    string_literal139=self.match(self.input, 45, self.FOLLOW_45_in_parallelDef1004) 
                    if self._state.backtracking == 0:
                        stream_45.add(string_literal139)
                    self._dbg.location(107, 25)
                    self._state.following.append(self.FOLLOW_blockDef_in_parallelDef1006)
                    blockDef140 = self.blockDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_blockDef.add(blockDef140.tree)
                    self._dbg.location(107, 34)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:34: ( 'and' blockDef )*
                    try:
                        self._dbg.enterSubRule(40)
                        while True: #loop40
                            alt40 = 2
                            try:
                                self._dbg.enterDecision(40)
                                LA40_0 = self.input.LA(1)

                                if (LA40_0 == 46) :
                                    alt40 = 1


                            finally:
                                self._dbg.exitDecision(40)
                            if alt40 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:36: 'and' blockDef
                                pass 
                                self._dbg.location(107, 36)
                                string_literal141=self.match(self.input, 46, self.FOLLOW_46_in_parallelDef1010) 
                                if self._state.backtracking == 0:
                                    stream_46.add(string_literal141)
                                self._dbg.location(107, 42)
                                self._state.following.append(self.FOLLOW_blockDef_in_parallelDef1012)
                                blockDef142 = self.blockDef()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    stream_blockDef.add(blockDef142.tree)


                            else:
                                break #loop40
                    finally:
                        self._dbg.exitSubRule(40)


                    # AST Rewrite
                    # elements: 45, blockDef
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
                        # 107:54: -> ^( 'parallel' ( blockDef )+ )
                        self._dbg.location(107, 57)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:57: ^( 'parallel' ( blockDef )+ )
                        root_1 = self._adaptor.nil()
                        self._dbg.location(107, 59)
                        root_1 = self._adaptor.becomeRoot(stream_45.nextNode(), root_1)

                        self._dbg.location(107, 70)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:107:70: ( blockDef )+
                        if not (stream_blockDef.hasNext()):
                            raise RewriteEarlyExitException()

                        while stream_blockDef.hasNext():
                            self._dbg.location(107, 70)
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

            self._dbg.location(107, 80)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "parallelDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "parallelDef"

    class globalEscapeDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.globalEscapeDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "globalEscapeDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:110:1: globalEscapeDef : 'do' blockDef ( interruptDef )+ ;
    def globalEscapeDef(self, ):

        retval = self.globalEscapeDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal143 = None
        blockDef144 = None

        interruptDef145 = None


        string_literal143_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "globalEscapeDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(110, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:110:16: ( 'do' blockDef ( interruptDef )+ )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:110:18: 'do' blockDef ( interruptDef )+
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(110, 22)
                    string_literal143=self.match(self.input, 47, self.FOLLOW_47_in_globalEscapeDef1032)
                    if self._state.backtracking == 0:

                        string_literal143_tree = self._adaptor.createWithPayload(string_literal143)
                        root_0 = self._adaptor.becomeRoot(string_literal143_tree, root_0)

                    self._dbg.location(110, 24)
                    self._state.following.append(self.FOLLOW_blockDef_in_globalEscapeDef1035)
                    blockDef144 = self.blockDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, blockDef144.tree)
                    self._dbg.location(110, 33)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:110:33: ( interruptDef )+
                    cnt41 = 0
                    try:
                        self._dbg.enterSubRule(41)
                        while True: #loop41
                            alt41 = 2
                            try:
                                self._dbg.enterDecision(41)
                                LA41_0 = self.input.LA(1)

                                if (LA41_0 == 48) :
                                    alt41 = 1


                            finally:
                                self._dbg.exitDecision(41)
                            if alt41 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:110:35: interruptDef
                                pass 
                                self._dbg.location(110, 35)
                                self._state.following.append(self.FOLLOW_interruptDef_in_globalEscapeDef1039)
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
                                self._dbg.recognitionException(eee)

                                raise eee

                            cnt41 += 1
                    finally:
                        self._dbg.exitSubRule(41)




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

            self._dbg.location(110, 51)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "globalEscapeDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "globalEscapeDef"

    class interruptDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.interruptDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "interruptDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:113:1: interruptDef : 'interrupt' blockDef ;
    def interruptDef(self, ):

        retval = self.interruptDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal146 = None
        blockDef147 = None


        string_literal146_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "interruptDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(113, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:113:13: ( 'interrupt' blockDef )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:113:15: 'interrupt' blockDef
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(113, 26)
                    string_literal146=self.match(self.input, 48, self.FOLLOW_48_in_interruptDef1051)
                    if self._state.backtracking == 0:

                        string_literal146_tree = self._adaptor.createWithPayload(string_literal146)
                        root_0 = self._adaptor.becomeRoot(string_literal146_tree, root_0)

                    self._dbg.location(113, 28)
                    self._state.following.append(self.FOLLOW_blockDef_in_interruptDef1054)
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

            self._dbg.location(113, 37)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "interruptDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "interruptDef"

    class unorderedDef_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.unorderedDef_return, self).__init__()

            self.tree = None




    # $ANTLR start "unorderedDef"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:115:1: unorderedDef : 'unordered' blockDef -> ^( UNORDERED blockDef ) ;
    def unorderedDef(self, ):

        retval = self.unorderedDef_return()
        retval.start = self.input.LT(1)

        root_0 = None

        string_literal148 = None
        blockDef149 = None


        string_literal148_tree = None
        stream_49 = RewriteRuleTokenStream(self._adaptor, "token 49")
        stream_blockDef = RewriteRuleSubtreeStream(self._adaptor, "rule blockDef")
        try:
            self._dbg.enterRule(self.getGrammarFileName(), "unorderedDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(115, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:115:13: ( 'unordered' blockDef -> ^( UNORDERED blockDef ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:115:15: 'unordered' blockDef
                    pass 
                    self._dbg.location(115, 15)
                    string_literal148=self.match(self.input, 49, self.FOLLOW_49_in_unorderedDef1062) 
                    if self._state.backtracking == 0:
                        stream_49.add(string_literal148)
                    self._dbg.location(115, 27)
                    self._state.following.append(self.FOLLOW_blockDef_in_unorderedDef1064)
                    blockDef149 = self.blockDef()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        stream_blockDef.add(blockDef149.tree)

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
                        # 115:36: -> ^( UNORDERED blockDef )
                        self._dbg.location(115, 39)
                        # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:115:39: ^( UNORDERED blockDef )
                        root_1 = self._adaptor.nil()
                        self._dbg.location(115, 41)
                        root_1 = self._adaptor.becomeRoot(self._adaptor.createFromType(UNORDERED, "UNORDERED"), root_1)

                        self._dbg.location(115, 51)
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

            self._dbg.location(115, 60)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "unorderedDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "unorderedDef"

    class expr_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.expr_return, self).__init__()

            self.tree = None




    # $ANTLR start "expr"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:124:1: expr : term ( ( PLUS | MINUS ) term )* ;
    def expr(self, ):

        retval = self.expr_return()
        retval.start = self.input.LT(1)

        root_0 = None

        set151 = None
        term150 = None

        term152 = None


        set151_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "expr")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(124, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:124:6: ( term ( ( PLUS | MINUS ) term )* )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:124:8: term ( ( PLUS | MINUS ) term )*
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(124, 8)
                    self._state.following.append(self.FOLLOW_term_in_expr1084)
                    term150 = self.term()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, term150.tree)
                    self._dbg.location(124, 13)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:124:13: ( ( PLUS | MINUS ) term )*
                    try:
                        self._dbg.enterSubRule(42)
                        while True: #loop42
                            alt42 = 2
                            try:
                                self._dbg.enterDecision(42)
                                LA42_0 = self.input.LA(1)

                                if ((PLUS <= LA42_0 <= MINUS)) :
                                    alt42 = 1


                            finally:
                                self._dbg.exitDecision(42)
                            if alt42 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:124:15: ( PLUS | MINUS ) term
                                pass 
                                self._dbg.location(124, 15)
                                set151 = self.input.LT(1)
                                if (PLUS <= self.input.LA(1) <= MINUS):
                                    self.input.consume()
                                    if self._state.backtracking == 0:
                                        self._adaptor.addChild(root_0, self._adaptor.createWithPayload(set151))
                                    self._state.errorRecovery = False

                                else:
                                    if self._state.backtracking > 0:
                                        raise BacktrackingFailed

                                    mse = MismatchedSetException(None, self.input)
                                    self._dbg.recognitionException(mse)
                                    raise mse


                                self._dbg.location(124, 33)
                                self._state.following.append(self.FOLLOW_term_in_expr1099)
                                term152 = self.term()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, term152.tree)


                            else:
                                break #loop42
                    finally:
                        self._dbg.exitSubRule(42)




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

            self._dbg.location(124, 41)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "expr")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "expr"

    class term_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.term_return, self).__init__()

            self.tree = None




    # $ANTLR start "term"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:126:1: term : factor ( ( MULT | DIV ) factor )* ;
    def term(self, ):

        retval = self.term_return()
        retval.start = self.input.LT(1)

        root_0 = None

        set154 = None
        factor153 = None

        factor155 = None


        set154_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "term")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(126, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:126:6: ( factor ( ( MULT | DIV ) factor )* )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:126:8: factor ( ( MULT | DIV ) factor )*
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(126, 8)
                    self._state.following.append(self.FOLLOW_factor_in_term1111)
                    factor153 = self.factor()

                    self._state.following.pop()
                    if self._state.backtracking == 0:
                        self._adaptor.addChild(root_0, factor153.tree)
                    self._dbg.location(126, 15)
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:126:15: ( ( MULT | DIV ) factor )*
                    try:
                        self._dbg.enterSubRule(43)
                        while True: #loop43
                            alt43 = 2
                            try:
                                self._dbg.enterDecision(43)
                                LA43_0 = self.input.LA(1)

                                if ((MULT <= LA43_0 <= DIV)) :
                                    alt43 = 1


                            finally:
                                self._dbg.exitDecision(43)
                            if alt43 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:126:17: ( MULT | DIV ) factor
                                pass 
                                self._dbg.location(126, 17)
                                set154 = self.input.LT(1)
                                if (MULT <= self.input.LA(1) <= DIV):
                                    self.input.consume()
                                    if self._state.backtracking == 0:
                                        self._adaptor.addChild(root_0, self._adaptor.createWithPayload(set154))
                                    self._state.errorRecovery = False

                                else:
                                    if self._state.backtracking > 0:
                                        raise BacktrackingFailed

                                    mse = MismatchedSetException(None, self.input)
                                    self._dbg.recognitionException(mse)
                                    raise mse


                                self._dbg.location(126, 32)
                                self._state.following.append(self.FOLLOW_factor_in_term1125)
                                factor155 = self.factor()

                                self._state.following.pop()
                                if self._state.backtracking == 0:
                                    self._adaptor.addChild(root_0, factor155.tree)


                            else:
                                break #loop43
                    finally:
                        self._dbg.exitSubRule(43)




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

            self._dbg.location(126, 42)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "term")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return retval

    # $ANTLR end "term"

    class factor_return(ParserRuleReturnScope):
        def __init__(self):
            super(MonitorParser.factor_return, self).__init__()

            self.tree = None




    # $ANTLR start "factor"
    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:128:1: factor : NUMBER ;
    def factor(self, ):

        retval = self.factor_return()
        retval.start = self.input.LT(1)

        root_0 = None

        NUMBER156 = None

        NUMBER156_tree = None

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "factor")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(128, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:128:8: ( NUMBER )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/Monitor.g:128:10: NUMBER
                    pass 
                    root_0 = self._adaptor.nil()

                    self._dbg.location(128, 10)
                    NUMBER156=self.match(self.input, NUMBER, self.FOLLOW_NUMBER_in_factor1137)
                    if self._state.backtracking == 0:

                        NUMBER156_tree = self._adaptor.createWithPayload(NUMBER156)
                        self._adaptor.addChild(root_0, NUMBER156_tree)




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

            self._dbg.location(128, 17)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "factor")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

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
        u"\2\17\2\uffff"
        )

    DFA3_max = DFA.unpack(
        u"\2\30\2\uffff"
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

        def error(self, nvae):
            self._dbg.recognitionException(nvae)


    # lookup tables for DFA #17

    DFA17_eot = DFA.unpack(
        u"\4\uffff"
        )

    DFA17_eof = DFA.unpack(
        u"\4\uffff"
        )

    DFA17_min = DFA.unpack(
        u"\2\17\2\uffff"
        )

    DFA17_max = DFA.unpack(
        u"\2\61\2\uffff"
        )

    DFA17_accept = DFA.unpack(
        u"\2\uffff\1\2\1\1"
        )

    DFA17_special = DFA.unpack(
        u"\4\uffff"
        )

            
    DFA17_transition = [
        DFA.unpack(u"\1\1\1\3\7\uffff\1\2\2\uffff\1\3\2\uffff\1\3\1\2\4\uffff"
        u"\2\3\2\uffff\6\3\1\uffff\1\3\1\uffff\1\3"),
        DFA.unpack(u"\1\1\1\3\7\uffff\1\2\2\uffff\1\3\2\uffff\1\3\5\uffff"
        u"\2\3\2\uffff\6\3\1\uffff\1\3\1\uffff\1\3"),
        DFA.unpack(u""),
        DFA.unpack(u"")
    ]

    # class definition for DFA #17

    class DFA17(DFA):
        pass

        def error(self, nvae):
            self._dbg.recognitionException(nvae)


    # lookup tables for DFA #32

    DFA32_eot = DFA.unpack(
        u"\11\uffff"
        )

    DFA32_eof = DFA.unpack(
        u"\1\1\10\uffff"
        )

    DFA32_min = DFA.unpack(
        u"\1\17\1\uffff\1\32\1\uffff\1\20\1\31\1\33\1\20\1\31"
        )

    DFA32_max = DFA.unpack(
        u"\1\61\1\uffff\1\47\1\uffff\2\41\1\47\1\20\1\41"
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

        def error(self, nvae):
            self._dbg.recognitionException(nvae)


 

    FOLLOW_ANNOTATION_in_description146 = frozenset([15, 23])
    FOLLOW_importProtocolStatement_in_description153 = frozenset([15, 23, 24])
    FOLLOW_importTypeStatement_in_description157 = frozenset([15, 23, 24])
    FOLLOW_ANNOTATION_in_description166 = frozenset([15, 24])
    FOLLOW_protocolDef_in_description171 = frozenset([1])
    FOLLOW_23_in_importProtocolStatement182 = frozenset([24])
    FOLLOW_24_in_importProtocolStatement184 = frozenset([16])
    FOLLOW_importProtocolDef_in_importProtocolStatement186 = frozenset([25, 26])
    FOLLOW_25_in_importProtocolStatement190 = frozenset([16])
    FOLLOW_importProtocolDef_in_importProtocolStatement193 = frozenset([25, 26])
    FOLLOW_26_in_importProtocolStatement198 = frozenset([1])
    FOLLOW_ID_in_importProtocolDef207 = frozenset([27])
    FOLLOW_27_in_importProtocolDef209 = frozenset([17])
    FOLLOW_StringLiteral_in_importProtocolDef212 = frozenset([1])
    FOLLOW_23_in_importTypeStatement225 = frozenset([16, 17])
    FOLLOW_simpleName_in_importTypeStatement229 = frozenset([16, 17])
    FOLLOW_importTypeDef_in_importTypeStatement234 = frozenset([25, 26, 27])
    FOLLOW_25_in_importTypeStatement238 = frozenset([16, 17])
    FOLLOW_importTypeDef_in_importTypeStatement241 = frozenset([25, 26, 27])
    FOLLOW_27_in_importTypeStatement248 = frozenset([17])
    FOLLOW_StringLiteral_in_importTypeStatement251 = frozenset([26])
    FOLLOW_26_in_importTypeStatement256 = frozenset([1])
    FOLLOW_dataTypeDef_in_importTypeDef267 = frozenset([28])
    FOLLOW_28_in_importTypeDef269 = frozenset([16])
    FOLLOW_ID_in_importTypeDef275 = frozenset([1])
    FOLLOW_StringLiteral_in_dataTypeDef283 = frozenset([1])
    FOLLOW_ID_in_simpleName291 = frozenset([1])
    FOLLOW_24_in_protocolDef299 = frozenset([16])
    FOLLOW_protocolName_in_protocolDef301 = frozenset([29, 30, 32])
    FOLLOW_29_in_protocolDef305 = frozenset([16])
    FOLLOW_roleName_in_protocolDef307 = frozenset([30, 32])
    FOLLOW_parameterDefs_in_protocolDef314 = frozenset([30])
    FOLLOW_30_in_protocolDef319 = frozenset([15, 16, 27, 30, 36, 37, 40, 41, 42, 43, 44, 45, 47, 49])
    FOLLOW_protocolBlockDef_in_protocolDef321 = frozenset([15, 24, 31])
    FOLLOW_ANNOTATION_in_protocolDef327 = frozenset([15, 24])
    FOLLOW_protocolDef_in_protocolDef332 = frozenset([15, 24, 31])
    FOLLOW_31_in_protocolDef337 = frozenset([1])
    FOLLOW_ID_in_protocolName361 = frozenset([1])
    FOLLOW_32_in_parameterDefs369 = frozenset([16, 34])
    FOLLOW_parameterDef_in_parameterDefs372 = frozenset([25, 33])
    FOLLOW_25_in_parameterDefs376 = frozenset([16, 34])
    FOLLOW_parameterDef_in_parameterDefs379 = frozenset([25, 33])
    FOLLOW_33_in_parameterDefs384 = frozenset([1])
    FOLLOW_typeReferenceDef_in_parameterDef395 = frozenset([16])
    FOLLOW_34_in_parameterDef399 = frozenset([16])
    FOLLOW_simpleName_in_parameterDef403 = frozenset([1])
    FOLLOW_activityListDef_in_protocolBlockDef411 = frozenset([1])
    FOLLOW_30_in_blockDef422 = frozenset([15, 16, 27, 30, 31, 36, 37, 40, 41, 42, 43, 44, 45, 47, 49])
    FOLLOW_activityListDef_in_blockDef424 = frozenset([31])
    FOLLOW_31_in_blockDef426 = frozenset([1])
    FOLLOW_ANNOTATION_in_activityListDef445 = frozenset([15, 16, 27, 30, 36, 37, 40, 41, 42, 43, 44, 45, 47, 49])
    FOLLOW_activityDef_in_activityListDef450 = frozenset([1, 15, 16, 27, 30, 36, 37, 40, 41, 42, 43, 44, 45, 47, 49])
    FOLLOW_introducesDef_in_activityDef467 = frozenset([26])
    FOLLOW_interactionDef_in_activityDef471 = frozenset([26])
    FOLLOW_inlineDef_in_activityDef475 = frozenset([26])
    FOLLOW_runDef_in_activityDef479 = frozenset([26])
    FOLLOW_recursionDef_in_activityDef483 = frozenset([26])
    FOLLOW_endDef_in_activityDef487 = frozenset([26])
    FOLLOW_26_in_activityDef491 = frozenset([1])
    FOLLOW_choiceDef_in_activityDef500 = frozenset([1])
    FOLLOW_directedChoiceDef_in_activityDef504 = frozenset([1])
    FOLLOW_parallelDef_in_activityDef508 = frozenset([1])
    FOLLOW_repeatDef_in_activityDef512 = frozenset([1])
    FOLLOW_unorderedDef_in_activityDef516 = frozenset([1])
    FOLLOW_recBlockDef_in_activityDef523 = frozenset([1])
    FOLLOW_globalEscapeDef_in_activityDef527 = frozenset([1])
    FOLLOW_roleDef_in_introducesDef535 = frozenset([35])
    FOLLOW_35_in_introducesDef537 = frozenset([16])
    FOLLOW_roleDef_in_introducesDef539 = frozenset([1, 25])
    FOLLOW_25_in_introducesDef543 = frozenset([16])
    FOLLOW_roleDef_in_introducesDef546 = frozenset([1, 25])
    FOLLOW_ID_in_roleDef557 = frozenset([1])
    FOLLOW_ID_in_roleName568 = frozenset([1])
    FOLLOW_ID_in_typeReferenceDef579 = frozenset([1])
    FOLLOW_typeReferenceDef_in_interactionSignatureDef593 = frozenset([1])
    FOLLOW_ID_in_interactionSignatureDef597 = frozenset([32])
    FOLLOW_32_in_interactionSignatureDef599 = frozenset([16, 33])
    FOLLOW_typeReferenceDef_in_interactionSignatureDef604 = frozenset([25, 33])
    FOLLOW_25_in_interactionSignatureDef608 = frozenset([16])
    FOLLOW_typeReferenceDef_in_interactionSignatureDef611 = frozenset([25, 33])
    FOLLOW_33_in_interactionSignatureDef619 = frozenset([1])
    FOLLOW_interactionSignatureDef_in_interactionDef637 = frozenset([27, 36])
    FOLLOW_27_in_interactionDef643 = frozenset([16])
    FOLLOW_roleName_in_interactionDef648 = frozenset([1])
    FOLLOW_36_in_interactionDef672 = frozenset([16])
    FOLLOW_roleName_in_interactionDef674 = frozenset([1])
    FOLLOW_37_in_choiceDef693 = frozenset([29, 30])
    FOLLOW_29_in_choiceDef697 = frozenset([16])
    FOLLOW_roleName_in_choiceDef699 = frozenset([29, 30])
    FOLLOW_blockDef_in_choiceDef704 = frozenset([1, 38])
    FOLLOW_38_in_choiceDef708 = frozenset([29, 30])
    FOLLOW_blockDef_in_choiceDef710 = frozenset([1, 38])
    FOLLOW_27_in_directedChoiceDef731 = frozenset([16])
    FOLLOW_roleName_in_directedChoiceDef733 = frozenset([30, 36])
    FOLLOW_36_in_directedChoiceDef740 = frozenset([16])
    FOLLOW_roleName_in_directedChoiceDef742 = frozenset([25, 30])
    FOLLOW_25_in_directedChoiceDef746 = frozenset([16])
    FOLLOW_roleName_in_directedChoiceDef749 = frozenset([25, 30])
    FOLLOW_30_in_directedChoiceDef757 = frozenset([16])
    FOLLOW_onMessageDef_in_directedChoiceDef761 = frozenset([16, 31])
    FOLLOW_31_in_directedChoiceDef766 = frozenset([1])
    FOLLOW_interactionSignatureDef_in_onMessageDef773 = frozenset([39])
    FOLLOW_39_in_onMessageDef775 = frozenset([15, 16, 27, 30, 36, 37, 40, 41, 42, 43, 44, 45, 47, 49])
    FOLLOW_activityList_in_onMessageDef777 = frozenset([1])
    FOLLOW_ANNOTATION_in_activityList790 = frozenset([15, 16, 27, 30, 36, 37, 40, 41, 42, 43, 44, 45, 47, 49])
    FOLLOW_activityDef_in_activityList795 = frozenset([1, 15, 16, 27, 30, 36, 37, 40, 41, 42, 43, 44, 45, 47, 49])
    FOLLOW_40_in_repeatDef805 = frozenset([29, 30])
    FOLLOW_29_in_repeatDef809 = frozenset([16])
    FOLLOW_roleName_in_repeatDef811 = frozenset([25, 29, 30])
    FOLLOW_25_in_repeatDef815 = frozenset([16])
    FOLLOW_roleName_in_repeatDef817 = frozenset([25, 29, 30])
    FOLLOW_blockDef_in_repeatDef825 = frozenset([1])
    FOLLOW_41_in_recBlockDef841 = frozenset([16])
    FOLLOW_labelName_in_recBlockDef843 = frozenset([29, 30])
    FOLLOW_blockDef_in_recBlockDef845 = frozenset([1])
    FOLLOW_ID_in_labelName860 = frozenset([1])
    FOLLOW_labelName_in_recursionDef872 = frozenset([1])
    FOLLOW_42_in_endDef888 = frozenset([1])
    FOLLOW_43_in_runDef898 = frozenset([16])
    FOLLOW_protocolRefDef_in_runDef901 = frozenset([27, 32])
    FOLLOW_32_in_runDef905 = frozenset([16])
    FOLLOW_parameter_in_runDef908 = frozenset([25, 33])
    FOLLOW_25_in_runDef912 = frozenset([16])
    FOLLOW_parameter_in_runDef915 = frozenset([25, 33])
    FOLLOW_33_in_runDef920 = frozenset([27])
    FOLLOW_27_in_runDef926 = frozenset([16])
    FOLLOW_roleName_in_runDef928 = frozenset([1])
    FOLLOW_ID_in_protocolRefDef936 = frozenset([1, 29])
    FOLLOW_29_in_protocolRefDef940 = frozenset([16])
    FOLLOW_roleName_in_protocolRefDef942 = frozenset([1])
    FOLLOW_ID_in_declarationName953 = frozenset([1])
    FOLLOW_declarationName_in_parameter961 = frozenset([1])
    FOLLOW_44_in_inlineDef970 = frozenset([16])
    FOLLOW_protocolRefDef_in_inlineDef973 = frozenset([1, 32])
    FOLLOW_32_in_inlineDef977 = frozenset([16])
    FOLLOW_parameter_in_inlineDef980 = frozenset([25, 33])
    FOLLOW_25_in_inlineDef984 = frozenset([16])
    FOLLOW_parameter_in_inlineDef987 = frozenset([25, 33])
    FOLLOW_33_in_inlineDef992 = frozenset([1])
    FOLLOW_45_in_parallelDef1004 = frozenset([29, 30])
    FOLLOW_blockDef_in_parallelDef1006 = frozenset([1, 46])
    FOLLOW_46_in_parallelDef1010 = frozenset([29, 30])
    FOLLOW_blockDef_in_parallelDef1012 = frozenset([1, 46])
    FOLLOW_47_in_globalEscapeDef1032 = frozenset([29, 30])
    FOLLOW_blockDef_in_globalEscapeDef1035 = frozenset([48])
    FOLLOW_interruptDef_in_globalEscapeDef1039 = frozenset([1, 48])
    FOLLOW_48_in_interruptDef1051 = frozenset([29, 30])
    FOLLOW_blockDef_in_interruptDef1054 = frozenset([1])
    FOLLOW_49_in_unorderedDef1062 = frozenset([29, 30])
    FOLLOW_blockDef_in_unorderedDef1064 = frozenset([1])
    FOLLOW_term_in_expr1084 = frozenset([1, 5, 6])
    FOLLOW_set_in_expr1088 = frozenset([18])
    FOLLOW_term_in_expr1099 = frozenset([1, 5, 6])
    FOLLOW_factor_in_term1111 = frozenset([1, 7, 8])
    FOLLOW_set_in_term1115 = frozenset([18])
    FOLLOW_factor_in_term1125 = frozenset([1, 7, 8])
    FOLLOW_NUMBER_in_factor1137 = frozenset([1])



def main(argv, stdin=sys.stdin, stdout=sys.stdout, stderr=sys.stderr):
    from antlr3.main import ParserMain
    main = ParserMain("MonitorLexer", MonitorParser)
    main.stdin = stdin
    main.stdout = stdout
    main.stderr = stderr
    main.execute(argv)


if __name__ == '__main__':
    main(sys.argv)
