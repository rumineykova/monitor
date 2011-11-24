# $ANTLR 3.1.3 Mar 18, 2009 10:09:25 src/BuildFSM.g 2011-11-18 22:48:10

import sys
from antlr3 import *
from antlr3.tree import *
from antlr3.compat import set, frozenset


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
INTERACTION=4
ML_COMMENT=23
T__51=51
FULLSTOP=9
SEND=11
PLUS=5
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
    "INTERACTION", "PLUS", "MINUS", "MULT", "DIV", "FULLSTOP", "RESV", "SEND", 
    "BRANCH", "UNORDERED", "RECLABEL", "PARALLEL", "PROTOCOL", "ANNOTATION", 
    "ID", "StringLiteral", "NUMBER", "DIGIT", "WHITESPACE", "ML_COMMENT", 
    "LINE_COMMENT", "'import'", "'protocol'", "','", "';'", "'from'", "'as'", 
    "'at'", "'{'", "'}'", "'('", "')'", "'role'", "'introduces'", "'to'", 
    "'choice'", "'or'", "':'", "'repeat'", "'rec'", "'end'", "'run'", "'inline'", 
    "'parallel'", "'and'", "'do'", "'interrupt'", "'unordered'"
]




class BuildFSM(TreeParser):
    grammarFileName = "src/BuildFSM.g"
    antlr_version = version_str_to_tuple("3.1.3 Mar 18, 2009 10:09:25")
    antlr_version_str = "3.1.3 Mar 18, 2009 10:09:25"
    tokenNames = tokenNames

    def __init__(self, input, state=None, *args, **kwargs):
        if state is None:
            state = RecognizerSharedState()

        super(BuildFSM, self).__init__(input, state, *args, **kwargs)



               
        self.memory = []
        self.isInSpecialState = False;




                


        



    # $ANTLR start "description"
    # src/BuildFSM.g:15:1: description : ^( PROTOCOL ( activityDef )+ ) ;
    def description(self, ):

        try:
            try:
                # src/BuildFSM.g:15:12: ( ^( PROTOCOL ( activityDef )+ ) )
                # src/BuildFSM.g:15:14: ^( PROTOCOL ( activityDef )+ )
                pass 
                self.match(self.input, PROTOCOL, self.FOLLOW_PROTOCOL_in_description47)

                self.match(self.input, DOWN, None)
                # src/BuildFSM.g:15:25: ( activityDef )+
                cnt1 = 0
                while True: #loop1
                    alt1 = 2
                    LA1_0 = self.input.LA(1)

                    if ((RESV <= LA1_0 <= SEND) or (UNORDERED <= LA1_0 <= PARALLEL) or LA1_0 == 39 or (42 <= LA1_0 <= 43)) :
                        alt1 = 1


                    if alt1 == 1:
                        # src/BuildFSM.g:15:25: activityDef
                        pass 
                        self._state.following.append(self.FOLLOW_activityDef_in_description49)
                        self.activityDef()

                        self._state.following.pop()


                    else:
                        if cnt1 >= 1:
                            break #loop1

                        eee = EarlyExitException(1, self.input)
                        raise eee

                    cnt1 += 1

                self.match(self.input, UP, None)
                #action start
                print "ProtocolDefinition"
                #action end




            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
        finally:

            pass
        return 

    # $ANTLR end "description"


    # $ANTLR start "activityDef"
    # src/BuildFSM.g:16:1: activityDef : ( ^( RESV rlabel= ID (rtype= ID )* roleName ) | ^( SEND slabel= ID (stype= ID )* roleName ) | ^( 'choice' ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( PARALLEL ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( UNORDERED ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'repeat' ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'rec' label= ID ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'RECLABEL' labelID= ID ) );
    def activityDef(self, ):

        rlabel = None
        rtype = None
        slabel = None
        stype = None
        label = None
        labelID = None

        try:
            try:
                # src/BuildFSM.g:16:12: ( ^( RESV rlabel= ID (rtype= ID )* roleName ) | ^( SEND slabel= ID (stype= ID )* roleName ) | ^( 'choice' ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( PARALLEL ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( UNORDERED ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'repeat' ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'rec' label= ID ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'RECLABEL' labelID= ID ) )
                alt11 = 8
                LA11 = self.input.LA(1)
                if LA11 == RESV:
                    alt11 = 1
                elif LA11 == SEND:
                    alt11 = 2
                elif LA11 == 39:
                    alt11 = 3
                elif LA11 == PARALLEL:
                    alt11 = 4
                elif LA11 == UNORDERED:
                    alt11 = 5
                elif LA11 == 42:
                    alt11 = 6
                elif LA11 == 43:
                    alt11 = 7
                elif LA11 == RECLABEL:
                    alt11 = 8
                else:
                    nvae = NoViableAltException("", 11, 0, self.input)

                    raise nvae

                if alt11 == 1:
                    # src/BuildFSM.g:17:4: ^( RESV rlabel= ID (rtype= ID )* roleName )
                    pass 
                    self.match(self.input, RESV, self.FOLLOW_RESV_in_activityDef63)

                    self.match(self.input, DOWN, None)
                    rlabel=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef69)
                    #action start
                    self.memory.append('resv' + rlabel.text)
                    #action end
                    # src/BuildFSM.g:17:67: (rtype= ID )*
                    while True: #loop2
                        alt2 = 2
                        LA2_0 = self.input.LA(1)

                        if (LA2_0 == ID) :
                            LA2_1 = self.input.LA(2)

                            if (LA2_1 == ID) :
                                alt2 = 1




                        if alt2 == 1:
                            # src/BuildFSM.g:17:69: rtype= ID
                            pass 
                            rtype=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef79)
                            #action start
                            self.memory.append(rtype.text)
                            #action end


                        else:
                            break #loop2
                    self._state.following.append(self.FOLLOW_roleName_in_activityDef85)
                    self.roleName()

                    self._state.following.pop()

                    self.match(self.input, UP, None)


                elif alt11 == 2:
                    # src/BuildFSM.g:19:4: ^( SEND slabel= ID (stype= ID )* roleName )
                    pass 
                    self.match(self.input, SEND, self.FOLLOW_SEND_in_activityDef93)

                    self.match(self.input, DOWN, None)
                    slabel=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef99)
                    #action start
                    self.memory.append('send' + slabel.text)
                    #action end
                    # src/BuildFSM.g:19:67: (stype= ID )*
                    while True: #loop3
                        alt3 = 2
                        LA3_0 = self.input.LA(1)

                        if (LA3_0 == ID) :
                            LA3_1 = self.input.LA(2)

                            if (LA3_1 == ID) :
                                alt3 = 1




                        if alt3 == 1:
                            # src/BuildFSM.g:19:69: stype= ID
                            pass 
                            stype=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef109)
                            #action start
                            self.memory.append(stype.text)
                            #action end


                        else:
                            break #loop3
                    self._state.following.append(self.FOLLOW_roleName_in_activityDef115)
                    self.roleName()

                    self._state.following.pop()

                    self.match(self.input, UP, None)


                elif alt11 == 3:
                    # src/BuildFSM.g:21:3: ^( 'choice' ( ^( BRANCH ( activityDef )+ ) )+ )
                    pass 
                    self.match(self.input, 39, self.FOLLOW_39_in_activityDef122)

                    #action start
                    self.memory.append('enter choice state')
                    #action end

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:23:2: ( ^( BRANCH ( activityDef )+ ) )+
                    cnt5 = 0
                    while True: #loop5
                        alt5 = 2
                        LA5_0 = self.input.LA(1)

                        if (LA5_0 == BRANCH) :
                            alt5 = 1


                        if alt5 == 1:
                            # src/BuildFSM.g:23:3: ^( BRANCH ( activityDef )+ )
                            pass 
                            self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef132)

                            #action start
                            self.memory.append('enter choice branch')
                            #action end

                            self.match(self.input, DOWN, None)
                            # src/BuildFSM.g:23:56: ( activityDef )+
                            cnt4 = 0
                            while True: #loop4
                                alt4 = 2
                                LA4_0 = self.input.LA(1)

                                if ((RESV <= LA4_0 <= SEND) or (UNORDERED <= LA4_0 <= PARALLEL) or LA4_0 == 39 or (42 <= LA4_0 <= 43)) :
                                    alt4 = 1


                                if alt4 == 1:
                                    # src/BuildFSM.g:23:56: activityDef
                                    pass 
                                    self._state.following.append(self.FOLLOW_activityDef_in_activityDef136)
                                    self.activityDef()

                                    self._state.following.pop()


                                else:
                                    if cnt4 >= 1:
                                        break #loop4

                                    eee = EarlyExitException(4, self.input)
                                    raise eee

                                cnt4 += 1

                            self.match(self.input, UP, None)
                            #action start
                            self.memory.append('exit choice branch')
                            #action end


                        else:
                            if cnt5 >= 1:
                                break #loop5

                            eee = EarlyExitException(5, self.input)
                            raise eee

                        cnt5 += 1

                    self.match(self.input, UP, None)
                    #action start
                    self.memory.append('exit choice state')
                    #action end


                elif alt11 == 4:
                    # src/BuildFSM.g:26:4: ^( PARALLEL ( ^( BRANCH ( activityDef )+ ) )+ )
                    pass 
                    self.match(self.input, PARALLEL, self.FOLLOW_PARALLEL_in_activityDef154)

                    #action start
                    self.memory.append('enter parallel state')
                    #action end

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:28:2: ( ^( BRANCH ( activityDef )+ ) )+
                    cnt7 = 0
                    while True: #loop7
                        alt7 = 2
                        LA7_0 = self.input.LA(1)

                        if (LA7_0 == BRANCH) :
                            alt7 = 1


                        if alt7 == 1:
                            # src/BuildFSM.g:28:3: ^( BRANCH ( activityDef )+ )
                            pass 
                            self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef171)

                            #action start
                            self.memory.append('enter parallel branch')
                            #action end

                            self.match(self.input, DOWN, None)
                            # src/BuildFSM.g:28:58: ( activityDef )+
                            cnt6 = 0
                            while True: #loop6
                                alt6 = 2
                                LA6_0 = self.input.LA(1)

                                if ((RESV <= LA6_0 <= SEND) or (UNORDERED <= LA6_0 <= PARALLEL) or LA6_0 == 39 or (42 <= LA6_0 <= 43)) :
                                    alt6 = 1


                                if alt6 == 1:
                                    # src/BuildFSM.g:28:58: activityDef
                                    pass 
                                    self._state.following.append(self.FOLLOW_activityDef_in_activityDef175)
                                    self.activityDef()

                                    self._state.following.pop()


                                else:
                                    if cnt6 >= 1:
                                        break #loop6

                                    eee = EarlyExitException(6, self.input)
                                    raise eee

                                cnt6 += 1

                            self.match(self.input, UP, None)
                            #action start
                            self.memory.append('exit parallel branch')
                            #action end


                        else:
                            if cnt7 >= 1:
                                break #loop7

                            eee = EarlyExitException(7, self.input)
                            raise eee

                        cnt7 += 1

                    self.match(self.input, UP, None)
                    #action start
                    self.memory.append('exit parallel state')
                    #action end


                elif alt11 == 5:
                    # src/BuildFSM.g:31:3: ^( UNORDERED ( ^( BRANCH ( activityDef )+ ) ) )
                    pass 
                    self.match(self.input, UNORDERED, self.FOLLOW_UNORDERED_in_activityDef192)

                    #action start
                    self.memory.append('enter unordered state')
                    #action end

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:33:2: ( ^( BRANCH ( activityDef )+ ) )
                    # src/BuildFSM.g:33:3: ^( BRANCH ( activityDef )+ )
                    pass 
                    self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef201)

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:33:12: ( activityDef )+
                    cnt8 = 0
                    while True: #loop8
                        alt8 = 2
                        LA8_0 = self.input.LA(1)

                        if ((RESV <= LA8_0 <= SEND) or (UNORDERED <= LA8_0 <= PARALLEL) or LA8_0 == 39 or (42 <= LA8_0 <= 43)) :
                            alt8 = 1


                        if alt8 == 1:
                            # src/BuildFSM.g:33:13: activityDef
                            pass 
                            self._state.following.append(self.FOLLOW_activityDef_in_activityDef204)
                            self.activityDef()

                            self._state.following.pop()
                            #action start
                            self.memory.append('unordered statement')
                            #action end


                        else:
                            if cnt8 >= 1:
                                break #loop8

                            eee = EarlyExitException(8, self.input)
                            raise eee

                        cnt8 += 1

                    self.match(self.input, UP, None)




                    self.match(self.input, UP, None)
                    #action start
                    self.memory.append('exit unordered state')
                    #action end


                elif alt11 == 6:
                    # src/BuildFSM.g:36:3: ^( 'repeat' ( ^( BRANCH ( activityDef )+ ) ) )
                    pass 
                    self.match(self.input, 42, self.FOLLOW_42_in_activityDef221)

                    #action start
                    self.memory.append('enter repeat state')
                    #action end

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:38:2: ( ^( BRANCH ( activityDef )+ ) )
                    # src/BuildFSM.g:38:3: ^( BRANCH ( activityDef )+ )
                    pass 
                    self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef230)

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:38:12: ( activityDef )+
                    cnt9 = 0
                    while True: #loop9
                        alt9 = 2
                        LA9_0 = self.input.LA(1)

                        if ((RESV <= LA9_0 <= SEND) or (UNORDERED <= LA9_0 <= PARALLEL) or LA9_0 == 39 or (42 <= LA9_0 <= 43)) :
                            alt9 = 1


                        if alt9 == 1:
                            # src/BuildFSM.g:38:13: activityDef
                            pass 
                            self._state.following.append(self.FOLLOW_activityDef_in_activityDef233)
                            self.activityDef()

                            self._state.following.pop()
                            #action start
                            self.memory.append('repeat statement')
                            #action end


                        else:
                            if cnt9 >= 1:
                                break #loop9

                            eee = EarlyExitException(9, self.input)
                            raise eee

                        cnt9 += 1

                    self.match(self.input, UP, None)




                    self.match(self.input, UP, None)
                    #action start
                    self.memory.append('exit repeat state')
                    #action end


                elif alt11 == 7:
                    # src/BuildFSM.g:41:10: ^( 'rec' label= ID ( ^( BRANCH ( activityDef )+ ) ) )
                    pass 
                    self.match(self.input, 43, self.FOLLOW_43_in_activityDef257)

                    self.match(self.input, DOWN, None)
                    label=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef263)
                    #action start
                    self.memory.append('enter rec state ' + label.text)
                    #action end
                    # src/BuildFSM.g:43:2: ( ^( BRANCH ( activityDef )+ ) )
                    # src/BuildFSM.g:43:3: ^( BRANCH ( activityDef )+ )
                    pass 
                    self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef279)

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:43:12: ( activityDef )+
                    cnt10 = 0
                    while True: #loop10
                        alt10 = 2
                        LA10_0 = self.input.LA(1)

                        if ((RESV <= LA10_0 <= SEND) or (UNORDERED <= LA10_0 <= PARALLEL) or LA10_0 == 39 or (42 <= LA10_0 <= 43)) :
                            alt10 = 1


                        if alt10 == 1:
                            # src/BuildFSM.g:43:13: activityDef
                            pass 
                            self._state.following.append(self.FOLLOW_activityDef_in_activityDef282)
                            self.activityDef()

                            self._state.following.pop()
                            #action start
                            self.memory.append('rec statement')
                            #action end


                        else:
                            if cnt10 >= 1:
                                break #loop10

                            eee = EarlyExitException(10, self.input)
                            raise eee

                        cnt10 += 1

                    self.match(self.input, UP, None)




                    self.match(self.input, UP, None)
                    #action start
                    self.memory.append('exit rec state ' + label.text)
                    #action end


                elif alt11 == 8:
                    # src/BuildFSM.g:46:3: ^( 'RECLABEL' labelID= ID )
                    pass 
                    self.match(self.input, RECLABEL, self.FOLLOW_RECLABEL_in_activityDef300)

                    self.match(self.input, DOWN, None)
                    labelID=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef307)
                    #action start
                    self.memory.append('repeat rec again ' + labelID.text)
                    #action end

                    self.match(self.input, UP, None)



            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
        finally:

            pass
        return 

    # $ANTLR end "activityDef"


    # $ANTLR start "roleName"
    # src/BuildFSM.g:48:1: roleName : ID ;
    def roleName(self, ):

        try:
            try:
                # src/BuildFSM.g:48:9: ( ID )
                # src/BuildFSM.g:48:11: ID
                pass 
                self.match(self.input, ID, self.FOLLOW_ID_in_roleName318)




            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
        finally:

            pass
        return 

    # $ANTLR end "roleName"


    # $ANTLR start "labelName"
    # src/BuildFSM.g:49:1: labelName : ID ;
    def labelName(self, ):

        try:
            try:
                # src/BuildFSM.g:49:10: ( ID )
                # src/BuildFSM.g:49:12: ID
                pass 
                self.match(self.input, ID, self.FOLLOW_ID_in_labelName324)




            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
        finally:

            pass
        return 

    # $ANTLR end "labelName"


    # $ANTLR start "roleDef"
    # src/BuildFSM.g:50:1: roleDef : ID ;
    def roleDef(self, ):

        try:
            try:
                # src/BuildFSM.g:50:8: ( ID )
                # src/BuildFSM.g:50:10: ID
                pass 
                self.match(self.input, ID, self.FOLLOW_ID_in_roleDef330)




            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
        finally:

            pass
        return 

    # $ANTLR end "roleDef"


    # Delegated rules


 

    FOLLOW_PROTOCOL_in_description47 = frozenset([2])
    FOLLOW_activityDef_in_description49 = frozenset([3, 10, 11, 13, 14, 15, 39, 42, 43])
    FOLLOW_RESV_in_activityDef63 = frozenset([2])
    FOLLOW_ID_in_activityDef69 = frozenset([18])
    FOLLOW_ID_in_activityDef79 = frozenset([18])
    FOLLOW_roleName_in_activityDef85 = frozenset([3])
    FOLLOW_SEND_in_activityDef93 = frozenset([2])
    FOLLOW_ID_in_activityDef99 = frozenset([18])
    FOLLOW_ID_in_activityDef109 = frozenset([18])
    FOLLOW_roleName_in_activityDef115 = frozenset([3])
    FOLLOW_39_in_activityDef122 = frozenset([2])
    FOLLOW_BRANCH_in_activityDef132 = frozenset([2])
    FOLLOW_activityDef_in_activityDef136 = frozenset([3, 10, 11, 13, 14, 15, 39, 42, 43])
    FOLLOW_PARALLEL_in_activityDef154 = frozenset([2])
    FOLLOW_BRANCH_in_activityDef171 = frozenset([2])
    FOLLOW_activityDef_in_activityDef175 = frozenset([3, 10, 11, 13, 14, 15, 39, 42, 43])
    FOLLOW_UNORDERED_in_activityDef192 = frozenset([2])
    FOLLOW_BRANCH_in_activityDef201 = frozenset([2])
    FOLLOW_activityDef_in_activityDef204 = frozenset([3, 10, 11, 13, 14, 15, 39, 42, 43])
    FOLLOW_42_in_activityDef221 = frozenset([2])
    FOLLOW_BRANCH_in_activityDef230 = frozenset([2])
    FOLLOW_activityDef_in_activityDef233 = frozenset([3, 10, 11, 13, 14, 15, 39, 42, 43])
    FOLLOW_43_in_activityDef257 = frozenset([2])
    FOLLOW_ID_in_activityDef263 = frozenset([12])
    FOLLOW_BRANCH_in_activityDef279 = frozenset([2])
    FOLLOW_activityDef_in_activityDef282 = frozenset([3, 10, 11, 13, 14, 15, 39, 42, 43])
    FOLLOW_RECLABEL_in_activityDef300 = frozenset([2])
    FOLLOW_ID_in_activityDef307 = frozenset([3])
    FOLLOW_ID_in_roleName318 = frozenset([1])
    FOLLOW_ID_in_labelName324 = frozenset([1])
    FOLLOW_ID_in_roleDef330 = frozenset([1])



def main(argv, stdin=sys.stdin, stdout=sys.stdout, stderr=sys.stderr):
    from antlr3.main import WalkerMain
    main = WalkerMain(BuildFSM)
    main.stdin = stdin
    main.stdout = stdout
    main.stderr = stderr
    main.execute(argv)


if __name__ == '__main__':
    main(sys.argv)
