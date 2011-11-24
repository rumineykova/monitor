# $ANTLR 3.1.3 Mar 18, 2009 10:09:25 src/BuildFSM.g 2011-11-20 16:20:18

import sys
from antlr3 import *
from antlr3.tree import *
from antlr3.compat import set, frozenset
        
from core.fsm import FSM
from core.transition import TransitionFactory
from core.LocalType import LocalType
def checkMessages(fsm):
	print "Message is checked: %s" %(fsm.input_symbol)

def nothing(fsm):
	print "I am invoked for empty transition"
def generate_ints():
	x = 1
    	while True:
        	yield x
        	x += 1



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
    "INTERACTION", "PLUS", "MINUS", "MULT", "DIV", "FULLSTOP", "RESV", 
    "SEND", "BRANCH", "UNORDERED", "RECLABEL", "PARALLEL", "PROTOCOL", "ANNOTATION", 
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
        self.current_state = 1
        self.fsm = FSM(self.current_state)
        self.processing_par_state = False
        self.start_new_par_branch = False
        self.state_gen = generate_ints()
        # Choice States
        self.choice_start_state = -1
        self.choice_end_state = -1
        # Recursion states
        self.recursions_states = {}




                


        

             
    def move_current_state(self, value = None):
    	if value is None:
    		self.current_state = self.state_gen.next()
    	else: 
    		self.current_state = value
    	return self.current_state
    def get_current_state(self):
    	return self.current_state
    	
    def add_transition(self, transition):
    	if self.processing_par_state:
    	  	self.fsm.add_transition_to_memory(transition, 
    					self.get_current_state(),
    	  				self.start_new_par_branch,  
    	  				checkMessages)
    	else:
    		self.fsm.add_transition(transition, 
    					self.get_current_state(), 
    					checkMessages, self.move_current_state())



    # $ANTLR start "description"
    # src/BuildFSM.g:62:1: description : ^( PROTOCOL ( activityDef )+ ) ;
    def description(self, ):

        try:
            try:
                # src/BuildFSM.g:62:12: ( ^( PROTOCOL ( activityDef )+ ) )
                # src/BuildFSM.g:62:14: ^( PROTOCOL ( activityDef )+ )
                pass 
                self.match(self.input, PROTOCOL, self.FOLLOW_PROTOCOL_in_description57)

                self.match(self.input, DOWN, None)
                # src/BuildFSM.g:62:25: ( activityDef )+
                cnt1 = 0
                while True: #loop1
                    alt1 = 2
                    LA1_0 = self.input.LA(1)

                    if ((RESV <= LA1_0 <= SEND) or (RECLABEL <= LA1_0 <= PARALLEL) or LA1_0 == 39 or (42 <= LA1_0 <= 43)) :
                        alt1 = 1


                    if alt1 == 1:
                        # src/BuildFSM.g:62:25: activityDef
                        pass 
                        self._state.following.append(self.FOLLOW_activityDef_in_description59)
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
    # src/BuildFSM.g:63:1: activityDef : ( ^( RESV rlabel= ID (rtype= ID )* role= ID ) | ^( SEND slabel= ID (stype= ID )* role= ID ) | ^( 'choice' ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( PARALLEL ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( 'repeat' ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'rec' label= ID ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'RECLABEL' labelID= ID ) );
    def activityDef(self, ):

        rlabel = None
        rtype = None
        role = None
        slabel = None
        stype = None
        label = None
        labelID = None

        try:
            try:
                # src/BuildFSM.g:63:12: ( ^( RESV rlabel= ID (rtype= ID )* role= ID ) | ^( SEND slabel= ID (stype= ID )* role= ID ) | ^( 'choice' ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( PARALLEL ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( 'repeat' ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'rec' label= ID ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'RECLABEL' labelID= ID ) )
                alt10 = 7
                LA10 = self.input.LA(1)
                if LA10 == RESV:
                    alt10 = 1
                elif LA10 == SEND:
                    alt10 = 2
                elif LA10 == 39:
                    alt10 = 3
                elif LA10 == PARALLEL:
                    alt10 = 4
                elif LA10 == 42:
                    alt10 = 5
                elif LA10 == 43:
                    alt10 = 6
                elif LA10 == RECLABEL:
                    alt10 = 7
                else:
                    nvae = NoViableAltException("", 10, 0, self.input)

                    raise nvae

                if alt10 == 1:
                    # src/BuildFSM.g:64:4: ^( RESV rlabel= ID (rtype= ID )* role= ID )
                    pass 
                    self.match(self.input, RESV, self.FOLLOW_RESV_in_activityDef73)

                    self.match(self.input, DOWN, None)
                    rlabel=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef79)
                    #action start
                    #check this comments
                    self.memory.append('resv' + rlabel.text)
                    #action end
                    # src/BuildFSM.g:66:48: (rtype= ID )*
                    while True: #loop2
                        alt2 = 2
                        LA2_0 = self.input.LA(1)

                        if (LA2_0 == ID) :
                            LA2_1 = self.input.LA(2)

                            if (LA2_1 == ID) :
                                alt2 = 1




                        if alt2 == 1:
                            # src/BuildFSM.g:66:50: rtype= ID
                            pass 
                            rtype=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef93)
                            #action start
                            self.memory.append(rtype.text)
                            #action end


                        else:
                            break #loop2
                    role=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef103)

                    self.match(self.input, UP, None)
                    #action start
                    self.add_transition(TransitionFactory.create(LocalType.RESV,rlabel, role))
                    #action end


                elif alt10 == 2:
                    # src/BuildFSM.g:69:4: ^( SEND slabel= ID (stype= ID )* role= ID )
                    pass 
                    self.match(self.input, SEND, self.FOLLOW_SEND_in_activityDef117)

                    self.match(self.input, DOWN, None)
                    slabel=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef123)
                    #action start
                    self.memory.append('send' + slabel.text)
                    #action end
                    # src/BuildFSM.g:69:67: (stype= ID )*
                    while True: #loop3
                        alt3 = 2
                        LA3_0 = self.input.LA(1)

                        if (LA3_0 == ID) :
                            LA3_1 = self.input.LA(2)

                            if (LA3_1 == ID) :
                                alt3 = 1




                        if alt3 == 1:
                            # src/BuildFSM.g:69:69: stype= ID
                            pass 
                            stype=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef133)
                            #action start
                            self.memory.append(stype.text)
                            #action end


                        else:
                            break #loop3
                    role=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef143)

                    self.match(self.input, UP, None)
                    #action start
                    self.add_transition(TransitionFactory.create(LocalType.SEND,slabel, role))
                    #action end


                elif alt10 == 3:
                    # src/BuildFSM.g:72:3: ^( 'choice' ( ^( BRANCH ( activityDef )+ ) )+ )
                    pass 
                    self.match(self.input, 39, self.FOLLOW_39_in_activityDef158)

                    #action start
                    self.memory.append('enter choice state')
                    self.choice_start_state = self.get_current_state()
                    self.choice_end_state = self.state_gen.next()
                    	
                    #action end

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:77:2: ( ^( BRANCH ( activityDef )+ ) )+
                    cnt5 = 0
                    while True: #loop5
                        alt5 = 2
                        LA5_0 = self.input.LA(1)

                        if (LA5_0 == BRANCH) :
                            alt5 = 1


                        if alt5 == 1:
                            # src/BuildFSM.g:77:3: ^( BRANCH ( activityDef )+ )
                            pass 
                            self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef168)

                            #action start
                              
                            self.memory.append('enter choice branch and save the current state')
                            self.move_current_state(self.choice_start_state)
                            	
                            #action end

                            self.match(self.input, DOWN, None)
                            # src/BuildFSM.g:81:4: ( activityDef )+
                            cnt4 = 0
                            while True: #loop4
                                alt4 = 2
                                LA4_0 = self.input.LA(1)

                                if ((RESV <= LA4_0 <= SEND) or (RECLABEL <= LA4_0 <= PARALLEL) or LA4_0 == 39 or (42 <= LA4_0 <= 43)) :
                                    alt4 = 1


                                if alt4 == 1:
                                    # src/BuildFSM.g:81:4: activityDef
                                    pass 
                                    self._state.following.append(self.FOLLOW_activityDef_in_activityDef174)
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
                              
                            self.memory.append('exit choice branch and set the current state to the end state for the choice')
                            self.fsm.add_transition(self.fsm.EMPTY_TRANSITION, self.get_current_state(), nothing, self.choice_end_state)
                            	
                            #action end


                        else:
                            if cnt5 >= 1:
                                break #loop5

                            eee = EarlyExitException(5, self.input)
                            raise eee

                        cnt5 += 1

                    self.match(self.input, UP, None)
                    #action start
                      
                    self.memory.append('set the current state to be equal to the end state for the choice')
                    self.move_current_state(self.choice_end_state)
                    	
                    #action end


                elif alt10 == 4:
                    # src/BuildFSM.g:91:4: ^( PARALLEL ( ^( BRANCH ( activityDef )+ ) )+ )
                    pass 
                    self.match(self.input, PARALLEL, self.FOLLOW_PARALLEL_in_activityDef193)

                    #action start
                             
                    self.memory.append('enter parallel state')
                    self.processing_par_state = True
                            
                    #action end

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:96:2: ( ^( BRANCH ( activityDef )+ ) )+
                    cnt7 = 0
                    while True: #loop7
                        alt7 = 2
                        LA7_0 = self.input.LA(1)

                        if (LA7_0 == BRANCH) :
                            alt7 = 1


                        if alt7 == 1:
                            # src/BuildFSM.g:96:3: ^( BRANCH ( activityDef )+ )
                            pass 
                            self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef210)

                            #action start
                              
                            self.memory.append('enter parallel branch')
                            self.start_new_par_branch = True
                            	
                            #action end

                            self.match(self.input, DOWN, None)
                            # src/BuildFSM.g:101:2: ( activityDef )+
                            cnt6 = 0
                            while True: #loop6
                                alt6 = 2
                                LA6_0 = self.input.LA(1)

                                if ((RESV <= LA6_0 <= SEND) or (RECLABEL <= LA6_0 <= PARALLEL) or LA6_0 == 39 or (42 <= LA6_0 <= 43)) :
                                    alt6 = 1


                                if alt6 == 1:
                                    # src/BuildFSM.g:101:3: activityDef
                                    pass 
                                    self._state.following.append(self.FOLLOW_activityDef_in_activityDef219)
                                    self.activityDef()

                                    self._state.following.pop()
                                    #action start
                                    self.start_new_branch = False
                                    #action end


                                else:
                                    if cnt6 >= 1:
                                        break #loop6

                                    eee = EarlyExitException(6, self.input)
                                    raise eee

                                cnt6 += 1

                            self.match(self.input, UP, None)
                            #action start
                              
                            self.memory.append('exit parallel branch')
                            self.start_new_par_branch = True
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
                    self.processing_par_state = False
                    self.fsm.add_transition(self.fsm.EMPTY_TRANSITION, self.get_current_state(), nothing, self.move_current_state())
                    	
                    #action end


                elif alt10 == 5:
                    # src/BuildFSM.g:110:3: ^( 'repeat' ( ^( BRANCH ( activityDef )+ ) ) )
                    pass 
                    self.match(self.input, 42, self.FOLLOW_42_in_activityDef242)

                    #action start
                    self.memory.append('enter repeat state')
                    #action end

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:112:2: ( ^( BRANCH ( activityDef )+ ) )
                    # src/BuildFSM.g:112:3: ^( BRANCH ( activityDef )+ )
                    pass 
                    self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef251)

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:112:12: ( activityDef )+
                    cnt8 = 0
                    while True: #loop8
                        alt8 = 2
                        LA8_0 = self.input.LA(1)

                        if ((RESV <= LA8_0 <= SEND) or (RECLABEL <= LA8_0 <= PARALLEL) or LA8_0 == 39 or (42 <= LA8_0 <= 43)) :
                            alt8 = 1


                        if alt8 == 1:
                            # src/BuildFSM.g:112:13: activityDef
                            pass 
                            self._state.following.append(self.FOLLOW_activityDef_in_activityDef254)
                            self.activityDef()

                            self._state.following.pop()
                            #action start
                            self.memory.append('repeat statement')
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
                    self.memory.append('exit repeat state')
                    #action end


                elif alt10 == 6:
                    # src/BuildFSM.g:115:10: ^( 'rec' label= ID ( ^( BRANCH ( activityDef )+ ) ) )
                    pass 
                    self.match(self.input, 43, self.FOLLOW_43_in_activityDef278)

                    self.match(self.input, DOWN, None)
                    label=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef284)
                    #action start
                    self.memory.append('enter rec state ' + label.text)
                    self.recursions_states.setdefault(label.text, self.get_current_state())
                            
                    #action end
                    # src/BuildFSM.g:119:2: ( ^( BRANCH ( activityDef )+ ) )
                    # src/BuildFSM.g:119:3: ^( BRANCH ( activityDef )+ )
                    pass 
                    self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef300)

                    self.match(self.input, DOWN, None)
                    # src/BuildFSM.g:119:12: ( activityDef )+
                    cnt9 = 0
                    while True: #loop9
                        alt9 = 2
                        LA9_0 = self.input.LA(1)

                        if ((RESV <= LA9_0 <= SEND) or (RECLABEL <= LA9_0 <= PARALLEL) or LA9_0 == 39 or (42 <= LA9_0 <= 43)) :
                            alt9 = 1


                        if alt9 == 1:
                            # src/BuildFSM.g:119:13: activityDef
                            pass 
                            self._state.following.append(self.FOLLOW_activityDef_in_activityDef303)
                            self.activityDef()

                            self._state.following.pop()
                            #action start
                            self.memory.append('rec statement')
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
                    self.memory.append('exit rec state ' + label.text)
                    #action end


                elif alt10 == 7:
                    # src/BuildFSM.g:122:3: ^( 'RECLABEL' labelID= ID )
                    pass 
                    self.match(self.input, RECLABEL, self.FOLLOW_RECLABEL_in_activityDef321)

                    self.match(self.input, DOWN, None)
                    labelID=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef328)
                    #action start
                                                  
                    self.memory.append('repeat rec again ' + labelID.text)
                    self.fsm.copy_transitions(self.recursions_states[labelID.text], self.get_current_state())
                    	
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
    # src/BuildFSM.g:127:1: roleName : ID ;
    def roleName(self, ):

        try:
            try:
                # src/BuildFSM.g:127:9: ( ID )
                # src/BuildFSM.g:127:11: ID
                pass 
                self.match(self.input, ID, self.FOLLOW_ID_in_roleName339)




            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
        finally:

            pass
        return 

    # $ANTLR end "roleName"


    # $ANTLR start "labelName"
    # src/BuildFSM.g:128:1: labelName : ID ;
    def labelName(self, ):

        try:
            try:
                # src/BuildFSM.g:128:10: ( ID )
                # src/BuildFSM.g:128:12: ID
                pass 
                self.match(self.input, ID, self.FOLLOW_ID_in_labelName345)




            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
        finally:

            pass
        return 

    # $ANTLR end "labelName"


    # $ANTLR start "roleDef"
    # src/BuildFSM.g:129:1: roleDef : ID ;
    def roleDef(self, ):

        try:
            try:
                # src/BuildFSM.g:129:8: ( ID )
                # src/BuildFSM.g:129:10: ID
                pass 
                self.match(self.input, ID, self.FOLLOW_ID_in_roleDef351)




            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
        finally:

            pass
        return 

    # $ANTLR end "roleDef"


    # Delegated rules


 

    FOLLOW_PROTOCOL_in_description57 = frozenset([2])
    FOLLOW_activityDef_in_description59 = frozenset([3, 10, 11, 14, 15, 39, 42, 43])
    FOLLOW_RESV_in_activityDef73 = frozenset([2])
    FOLLOW_ID_in_activityDef79 = frozenset([18])
    FOLLOW_ID_in_activityDef93 = frozenset([18])
    FOLLOW_ID_in_activityDef103 = frozenset([3])
    FOLLOW_SEND_in_activityDef117 = frozenset([2])
    FOLLOW_ID_in_activityDef123 = frozenset([18])
    FOLLOW_ID_in_activityDef133 = frozenset([18])
    FOLLOW_ID_in_activityDef143 = frozenset([3])
    FOLLOW_39_in_activityDef158 = frozenset([2])
    FOLLOW_BRANCH_in_activityDef168 = frozenset([2])
    FOLLOW_activityDef_in_activityDef174 = frozenset([3, 10, 11, 14, 15, 39, 42, 43])
    FOLLOW_PARALLEL_in_activityDef193 = frozenset([2])
    FOLLOW_BRANCH_in_activityDef210 = frozenset([2])
    FOLLOW_activityDef_in_activityDef219 = frozenset([3, 10, 11, 14, 15, 39, 42, 43])
    FOLLOW_42_in_activityDef242 = frozenset([2])
    FOLLOW_BRANCH_in_activityDef251 = frozenset([2])
    FOLLOW_activityDef_in_activityDef254 = frozenset([3, 10, 11, 14, 15, 39, 42, 43])
    FOLLOW_43_in_activityDef278 = frozenset([2])
    FOLLOW_ID_in_activityDef284 = frozenset([12])
    FOLLOW_BRANCH_in_activityDef300 = frozenset([2])
    FOLLOW_activityDef_in_activityDef303 = frozenset([3, 10, 11, 14, 15, 39, 42, 43])
    FOLLOW_RECLABEL_in_activityDef321 = frozenset([2])
    FOLLOW_ID_in_activityDef328 = frozenset([3])
    FOLLOW_ID_in_roleName339 = frozenset([1])
    FOLLOW_ID_in_labelName345 = frozenset([1])
    FOLLOW_ID_in_roleDef351 = frozenset([1])



def main(argv, stdin=sys.stdin, stdout=sys.stdout, stderr=sys.stderr):
    from antlr3.main import WalkerMain
    main = WalkerMain(BuildFSM)
    main.stdin = stdin
    main.stdout = stdout
    main.stderr = stderr
    main.execute(argv)


if __name__ == '__main__':
    main(sys.argv)
