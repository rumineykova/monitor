# $ANTLR 3.2 Sep 23, 2009 12:02:23 /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g 2011-11-18 12:13:33

import sys
from antlr3 import *
from antlr3.tree import *
from antlr3.compat import set, frozenset
from antlr3.debug import *


# for convenience in actions
HIDDEN = BaseRecognizer.HIDDEN

# token types
T__29=29
T__28=28
T__27=27
T__26=26
T__25=25
RESV=10
T__24=24
T__23=23
ANNOTATION=15
ID=16
EOF=-1
INTERACTION=4
ML_COMMENT=21
FULLSTOP=9
SEND=11
PLUS=5
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




class BuildFSM(DebugTreeParser):
    grammarFileName = "/homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g"
    antlr_version = version_str_to_tuple("3.2 Sep 23, 2009 12:02:23")
    antlr_version_str = "3.2 Sep 23, 2009 12:02:23"
    tokenNames = tokenNames

    def __init__(self, input, state=None, *args, **kwargs):
        if state is None:
            state = RecognizerSharedState()

        debug_socket = kwargs.pop('debug_socket', None)
        port = kwargs.pop('port', None)
        super(BuildFSM, self).__init__(input, state, *args, **kwargs)






        self.ruleLevel = 0

        if self._dbg is None:
            proxy = DebugEventSocketProxy(self, adaptor=self.input.getTreeAdaptor(),
                                          debug=debug_socket, port=port)
            self.setDebugListener(proxy)
            proxy.handshake()




    ruleNames = [
        "invalidRule", "activityDef", "protocolDef", "blockDef", "description", 
        "roleName", "labelName", "protocolBlockDef"
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





    # $ANTLR start "description"
    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:10:1: description : protocolDef ;
    def description(self, ):

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "description")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(10, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:10:12: ( protocolDef )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:10:14: protocolDef
                    pass 
                    self._dbg.location(10, 14)
                    self._state.following.append(self.FOLLOW_protocolDef_in_description40)
                    self.protocolDef()

                    self._state.following.pop()
                    self._dbg.location(10, 26)
                    #action start
                    print "Enter protocol"
                    #action end




                except RecognitionException, re:
                    self.reportError(re)
                    self.recover(self.input, re)
            finally:

                pass

            self._dbg.location(10, 50)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "description")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return 

    # $ANTLR end "description"


    # $ANTLR start "protocolDef"
    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:13:1: protocolDef : ^( 'protocol' protocolBlockDef ( protocolDef )* ) ;
    def protocolDef(self, ):

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "protocolDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(13, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:13:12: ( ^( 'protocol' protocolBlockDef ( protocolDef )* ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:13:15: ^( 'protocol' protocolBlockDef ( protocolDef )* )
                    pass 
                    self._dbg.location(13, 15)
                    self._dbg.location(13, 17)
                    self.match(self.input, 24, self.FOLLOW_24_in_protocolDef52)

                    self.match(self.input, DOWN, None)
                    self._dbg.location(13, 28)
                    self._state.following.append(self.FOLLOW_protocolBlockDef_in_protocolDef54)
                    self.protocolBlockDef()

                    self._state.following.pop()
                    self._dbg.location(13, 45)
                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:13:45: ( protocolDef )*
                    try:
                        self._dbg.enterSubRule(1)
                        while True: #loop1
                            alt1 = 2
                            try:
                                self._dbg.enterDecision(1)
                                LA1_0 = self.input.LA(1)

                                if (LA1_0 == 24) :
                                    alt1 = 1


                            finally:
                                self._dbg.exitDecision(1)
                            if alt1 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:13:45: protocolDef
                                pass 
                                self._dbg.location(13, 45)
                                self._state.following.append(self.FOLLOW_protocolDef_in_protocolDef56)
                                self.protocolDef()

                                self._state.following.pop()


                            else:
                                break #loop1
                    finally:
                        self._dbg.exitSubRule(1)


                    self.match(self.input, UP, None)
                    self._dbg.location(13, 59)
                    #action start
                    print "ProtocolDefinition"
                    #action end




                except RecognitionException, re:
                    self.reportError(re)
                    self.recover(self.input, re)
            finally:

                pass

            self._dbg.location(13, 87)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "protocolDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return 

    # $ANTLR end "protocolDef"


    # $ANTLR start "activityDef"
    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:15:1: activityDef : ( ^( 'RESV' ( ID )+ roleName ) | ^( 'SEND' ( ID )+ roleName ) | ^( 'RECLABEL' labelName ) | ^( 'choice' ( blockDef )+ ) | ^( 'parallel' ( blockDef )+ ) | ^( 'UNORDERED' blockDef ) | ^( 'rec' blockDef ) | ^( 'repeat' blockDef ) );
    def activityDef(self, ):

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "activityDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(15, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:15:12: ( ^( 'RESV' ( ID )+ roleName ) | ^( 'SEND' ( ID )+ roleName ) | ^( 'RECLABEL' labelName ) | ^( 'choice' ( blockDef )+ ) | ^( 'parallel' ( blockDef )+ ) | ^( 'UNORDERED' blockDef ) | ^( 'rec' blockDef ) | ^( 'repeat' blockDef ) )
                    alt6 = 8
                    try:
                        self._dbg.enterDecision(6)
                        LA6 = self.input.LA(1)
                        if LA6 == RESV:
                            alt6 = 1
                        elif LA6 == SEND:
                            alt6 = 2
                        elif LA6 == RECLABEL:
                            alt6 = 3
                        elif LA6 == 37:
                            alt6 = 4
                        elif LA6 == 45:
                            alt6 = 5
                        elif LA6 == UNORDERED:
                            alt6 = 6
                        elif LA6 == 41:
                            alt6 = 7
                        elif LA6 == 40:
                            alt6 = 8
                        else:
                            nvae = NoViableAltException("", 6, 0, self.input)

                            self._dbg.recognitionException(nvae)
                            raise nvae

                    finally:
                        self._dbg.exitDecision(6)
                    if alt6 == 1:
                        self._dbg.enterAlt(1)

                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:17:2: ^( 'RESV' ( ID )+ roleName )
                        pass 
                        self._dbg.location(17, 2)
                        self._dbg.location(17, 4)
                        self.match(self.input, RESV, self.FOLLOW_RESV_in_activityDef71)

                        self.match(self.input, DOWN, None)
                        self._dbg.location(17, 11)
                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:17:11: ( ID )+
                        cnt2 = 0
                        try:
                            self._dbg.enterSubRule(2)
                            while True: #loop2
                                alt2 = 2
                                try:
                                    self._dbg.enterDecision(2)
                                    LA2_0 = self.input.LA(1)

                                    if (LA2_0 == ID) :
                                        LA2_1 = self.input.LA(2)

                                        if (LA2_1 == ID) :
                                            alt2 = 1




                                finally:
                                    self._dbg.exitDecision(2)
                                if alt2 == 1:
                                    self._dbg.enterAlt(1)

                                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:17:11: ID
                                    pass 
                                    self._dbg.location(17, 11)
                                    self.match(self.input, ID, self.FOLLOW_ID_in_activityDef73)


                                else:
                                    if cnt2 >= 1:
                                        break #loop2

                                    eee = EarlyExitException(2, self.input)
                                    self._dbg.recognitionException(eee)

                                    raise eee

                                cnt2 += 1
                        finally:
                            self._dbg.exitSubRule(2)

                        self._dbg.location(17, 15)
                        self._state.following.append(self.FOLLOW_roleName_in_activityDef76)
                        self.roleName()

                        self._state.following.pop()

                        self.match(self.input, UP, None)


                    elif alt6 == 2:
                        self._dbg.enterAlt(2)

                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:18:4: ^( 'SEND' ( ID )+ roleName )
                        pass 
                        self._dbg.location(18, 4)
                        self._dbg.location(18, 6)
                        self.match(self.input, SEND, self.FOLLOW_SEND_in_activityDef83)

                        self.match(self.input, DOWN, None)
                        self._dbg.location(18, 13)
                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:18:13: ( ID )+
                        cnt3 = 0
                        try:
                            self._dbg.enterSubRule(3)
                            while True: #loop3
                                alt3 = 2
                                try:
                                    self._dbg.enterDecision(3)
                                    LA3_0 = self.input.LA(1)

                                    if (LA3_0 == ID) :
                                        LA3_1 = self.input.LA(2)

                                        if (LA3_1 == ID) :
                                            alt3 = 1




                                finally:
                                    self._dbg.exitDecision(3)
                                if alt3 == 1:
                                    self._dbg.enterAlt(1)

                                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:18:13: ID
                                    pass 
                                    self._dbg.location(18, 13)
                                    self.match(self.input, ID, self.FOLLOW_ID_in_activityDef85)


                                else:
                                    if cnt3 >= 1:
                                        break #loop3

                                    eee = EarlyExitException(3, self.input)
                                    self._dbg.recognitionException(eee)

                                    raise eee

                                cnt3 += 1
                        finally:
                            self._dbg.exitSubRule(3)

                        self._dbg.location(18, 17)
                        self._state.following.append(self.FOLLOW_roleName_in_activityDef88)
                        self.roleName()

                        self._state.following.pop()

                        self.match(self.input, UP, None)


                    elif alt6 == 3:
                        self._dbg.enterAlt(3)

                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:20:3: ^( 'RECLABEL' labelName )
                        pass 
                        self._dbg.location(20, 3)
                        self._dbg.location(20, 5)
                        self.match(self.input, RECLABEL, self.FOLLOW_RECLABEL_in_activityDef96)

                        self.match(self.input, DOWN, None)
                        self._dbg.location(20, 16)
                        self._state.following.append(self.FOLLOW_labelName_in_activityDef98)
                        self.labelName()

                        self._state.following.pop()

                        self.match(self.input, UP, None)


                    elif alt6 == 4:
                        self._dbg.enterAlt(4)

                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:22:3: ^( 'choice' ( blockDef )+ )
                        pass 
                        self._dbg.location(22, 3)
                        self._dbg.location(22, 5)
                        self.match(self.input, 37, self.FOLLOW_37_in_activityDef106)

                        self.match(self.input, DOWN, None)
                        self._dbg.location(22, 14)
                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:22:14: ( blockDef )+
                        cnt4 = 0
                        try:
                            self._dbg.enterSubRule(4)
                            while True: #loop4
                                alt4 = 2
                                try:
                                    self._dbg.enterDecision(4)
                                    LA4_0 = self.input.LA(1)

                                    if (LA4_0 == BRANCH) :
                                        alt4 = 1


                                finally:
                                    self._dbg.exitDecision(4)
                                if alt4 == 1:
                                    self._dbg.enterAlt(1)

                                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:22:14: blockDef
                                    pass 
                                    self._dbg.location(22, 14)
                                    self._state.following.append(self.FOLLOW_blockDef_in_activityDef108)
                                    self.blockDef()

                                    self._state.following.pop()


                                else:
                                    if cnt4 >= 1:
                                        break #loop4

                                    eee = EarlyExitException(4, self.input)
                                    self._dbg.recognitionException(eee)

                                    raise eee

                                cnt4 += 1
                        finally:
                            self._dbg.exitSubRule(4)


                        self.match(self.input, UP, None)


                    elif alt6 == 5:
                        self._dbg.enterAlt(5)

                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:24:4: ^( 'parallel' ( blockDef )+ )
                        pass 
                        self._dbg.location(24, 4)
                        self._dbg.location(24, 6)
                        self.match(self.input, 45, self.FOLLOW_45_in_activityDef118)

                        self.match(self.input, DOWN, None)
                        self._dbg.location(24, 17)
                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:24:17: ( blockDef )+
                        cnt5 = 0
                        try:
                            self._dbg.enterSubRule(5)
                            while True: #loop5
                                alt5 = 2
                                try:
                                    self._dbg.enterDecision(5)
                                    LA5_0 = self.input.LA(1)

                                    if (LA5_0 == BRANCH) :
                                        alt5 = 1


                                finally:
                                    self._dbg.exitDecision(5)
                                if alt5 == 1:
                                    self._dbg.enterAlt(1)

                                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:24:17: blockDef
                                    pass 
                                    self._dbg.location(24, 17)
                                    self._state.following.append(self.FOLLOW_blockDef_in_activityDef120)
                                    self.blockDef()

                                    self._state.following.pop()


                                else:
                                    if cnt5 >= 1:
                                        break #loop5

                                    eee = EarlyExitException(5, self.input)
                                    self._dbg.recognitionException(eee)

                                    raise eee

                                cnt5 += 1
                        finally:
                            self._dbg.exitSubRule(5)


                        self.match(self.input, UP, None)


                    elif alt6 == 6:
                        self._dbg.enterAlt(6)

                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:26:3: ^( 'UNORDERED' blockDef )
                        pass 
                        self._dbg.location(26, 3)
                        self._dbg.location(26, 5)
                        self.match(self.input, UNORDERED, self.FOLLOW_UNORDERED_in_activityDef129)

                        self.match(self.input, DOWN, None)
                        self._dbg.location(26, 17)
                        self._state.following.append(self.FOLLOW_blockDef_in_activityDef131)
                        self.blockDef()

                        self._state.following.pop()

                        self.match(self.input, UP, None)


                    elif alt6 == 7:
                        self._dbg.enterAlt(7)

                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:28:3: ^( 'rec' blockDef )
                        pass 
                        self._dbg.location(28, 3)
                        self._dbg.location(28, 5)
                        self.match(self.input, 41, self.FOLLOW_41_in_activityDef139)

                        self.match(self.input, DOWN, None)
                        self._dbg.location(28, 11)
                        self._state.following.append(self.FOLLOW_blockDef_in_activityDef141)
                        self.blockDef()

                        self._state.following.pop()

                        self.match(self.input, UP, None)


                    elif alt6 == 8:
                        self._dbg.enterAlt(8)

                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:30:3: ^( 'repeat' blockDef )
                        pass 
                        self._dbg.location(30, 3)
                        self._dbg.location(30, 5)
                        self.match(self.input, 40, self.FOLLOW_40_in_activityDef149)

                        self.match(self.input, DOWN, None)
                        self._dbg.location(30, 14)
                        self._state.following.append(self.FOLLOW_blockDef_in_activityDef151)
                        self.blockDef()

                        self._state.following.pop()

                        self.match(self.input, UP, None)



                except RecognitionException, re:
                    self.reportError(re)
                    self.recover(self.input, re)
            finally:

                pass

            self._dbg.location(30, 23)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "activityDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return 

    # $ANTLR end "activityDef"


    # $ANTLR start "roleName"
    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:32:1: roleName : ID ;
    def roleName(self, ):

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "roleName")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(32, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:32:9: ( ID )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:32:11: ID
                    pass 
                    self._dbg.location(32, 11)
                    self.match(self.input, ID, self.FOLLOW_ID_in_roleName159)




                except RecognitionException, re:
                    self.reportError(re)
                    self.recover(self.input, re)
            finally:

                pass

            self._dbg.location(32, 13)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "roleName")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return 

    # $ANTLR end "roleName"


    # $ANTLR start "labelName"
    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:33:1: labelName : ID ;
    def labelName(self, ):

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "labelName")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(33, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:33:10: ( ID )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:33:12: ID
                    pass 
                    self._dbg.location(33, 12)
                    self.match(self.input, ID, self.FOLLOW_ID_in_labelName165)




                except RecognitionException, re:
                    self.reportError(re)
                    self.recover(self.input, re)
            finally:

                pass

            self._dbg.location(33, 15)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "labelName")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return 

    # $ANTLR end "labelName"


    # $ANTLR start "protocolBlockDef"
    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:36:1: protocolBlockDef : ( activityDef )+ ;
    def protocolBlockDef(self, ):

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "protocolBlockDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(36, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:36:17: ( ( activityDef )+ )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:36:19: ( activityDef )+
                    pass 
                    self._dbg.location(36, 19)
                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:36:19: ( activityDef )+
                    cnt7 = 0
                    try:
                        self._dbg.enterSubRule(7)
                        while True: #loop7
                            alt7 = 2
                            try:
                                self._dbg.enterDecision(7)
                                LA7_0 = self.input.LA(1)

                                if ((RESV <= LA7_0 <= SEND) or (UNORDERED <= LA7_0 <= RECLABEL) or LA7_0 == 37 or (40 <= LA7_0 <= 41) or LA7_0 == 45) :
                                    alt7 = 1


                            finally:
                                self._dbg.exitDecision(7)
                            if alt7 == 1:
                                self._dbg.enterAlt(1)

                                # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:36:19: activityDef
                                pass 
                                self._dbg.location(36, 19)
                                self._state.following.append(self.FOLLOW_activityDef_in_protocolBlockDef174)
                                self.activityDef()

                                self._state.following.pop()


                            else:
                                if cnt7 >= 1:
                                    break #loop7

                                eee = EarlyExitException(7, self.input)
                                self._dbg.recognitionException(eee)

                                raise eee

                            cnt7 += 1
                    finally:
                        self._dbg.exitSubRule(7)





                except RecognitionException, re:
                    self.reportError(re)
                    self.recover(self.input, re)
            finally:

                pass

            self._dbg.location(36, 31)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "protocolBlockDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return 

    # $ANTLR end "protocolBlockDef"


    # $ANTLR start "blockDef"
    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:37:1: blockDef : ^( 'BRANCH' ( activityDef )* ) ;
    def blockDef(self, ):

        try:
            self._dbg.enterRule(self.getGrammarFileName(), "blockDef")
            if self.getRuleLevel() == 0:
                self._dbg.commence();
            self.incRuleLevel()
            self._dbg.location(37, 1)

            try:
                try:
                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:37:9: ( ^( 'BRANCH' ( activityDef )* ) )
                    self._dbg.enterAlt(1)

                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:37:12: ^( 'BRANCH' ( activityDef )* )
                    pass 
                    self._dbg.location(37, 12)
                    self._dbg.location(37, 14)
                    self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_blockDef183)

                    if self.input.LA(1) == DOWN:
                        self.match(self.input, DOWN, None)
                        self._dbg.location(37, 23)
                        # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:37:23: ( activityDef )*
                        try:
                            self._dbg.enterSubRule(8)
                            while True: #loop8
                                alt8 = 2
                                try:
                                    self._dbg.enterDecision(8)
                                    LA8_0 = self.input.LA(1)

                                    if ((RESV <= LA8_0 <= SEND) or (UNORDERED <= LA8_0 <= RECLABEL) or LA8_0 == 37 or (40 <= LA8_0 <= 41) or LA8_0 == 45) :
                                        alt8 = 1


                                finally:
                                    self._dbg.exitDecision(8)
                                if alt8 == 1:
                                    self._dbg.enterAlt(1)

                                    # /homes/rn710/workspace/MonitorPrototype/src/BuildFSM.g:37:23: activityDef
                                    pass 
                                    self._dbg.location(37, 23)
                                    self._state.following.append(self.FOLLOW_activityDef_in_blockDef185)
                                    self.activityDef()

                                    self._state.following.pop()


                                else:
                                    break #loop8
                        finally:
                            self._dbg.exitSubRule(8)


                        self.match(self.input, UP, None)





                except RecognitionException, re:
                    self.reportError(re)
                    self.recover(self.input, re)
            finally:

                pass

            self._dbg.location(37, 36)
        finally:
            self._dbg.exitRule(self.getGrammarFileName(), "blockDef")
            self.decRuleLevel()
            if self.getRuleLevel() == 0:
                 self._dbg.terminate()

        return 

    # $ANTLR end "blockDef"


    # Delegated rules


 

    FOLLOW_protocolDef_in_description40 = frozenset([1])
    FOLLOW_24_in_protocolDef52 = frozenset([2])
    FOLLOW_protocolBlockDef_in_protocolDef54 = frozenset([3, 24])
    FOLLOW_protocolDef_in_protocolDef56 = frozenset([3, 24])
    FOLLOW_RESV_in_activityDef71 = frozenset([2])
    FOLLOW_ID_in_activityDef73 = frozenset([16])
    FOLLOW_roleName_in_activityDef76 = frozenset([3])
    FOLLOW_SEND_in_activityDef83 = frozenset([2])
    FOLLOW_ID_in_activityDef85 = frozenset([16])
    FOLLOW_roleName_in_activityDef88 = frozenset([3])
    FOLLOW_RECLABEL_in_activityDef96 = frozenset([2])
    FOLLOW_labelName_in_activityDef98 = frozenset([3])
    FOLLOW_37_in_activityDef106 = frozenset([2])
    FOLLOW_blockDef_in_activityDef108 = frozenset([3, 12])
    FOLLOW_45_in_activityDef118 = frozenset([2])
    FOLLOW_blockDef_in_activityDef120 = frozenset([3, 12])
    FOLLOW_UNORDERED_in_activityDef129 = frozenset([2])
    FOLLOW_blockDef_in_activityDef131 = frozenset([3])
    FOLLOW_41_in_activityDef139 = frozenset([2])
    FOLLOW_blockDef_in_activityDef141 = frozenset([3])
    FOLLOW_40_in_activityDef149 = frozenset([2])
    FOLLOW_blockDef_in_activityDef151 = frozenset([3])
    FOLLOW_ID_in_roleName159 = frozenset([1])
    FOLLOW_ID_in_labelName165 = frozenset([1])
    FOLLOW_activityDef_in_protocolBlockDef174 = frozenset([1, 10, 11, 13, 14, 37, 40, 41, 45])
    FOLLOW_BRANCH_in_blockDef183 = frozenset([2])
    FOLLOW_activityDef_in_blockDef185 = frozenset([3, 10, 11, 13, 14, 37, 40, 41, 45])



def main(argv, stdin=sys.stdin, stdout=sys.stdout, stderr=sys.stderr):
    from antlr3.main import WalkerMain
    main = WalkerMain(BuildFSM)
    main.stdin = stdin
    main.stdout = stdout
    main.stderr = stderr
    main.execute(argv)


if __name__ == '__main__':
    main(sys.argv)
