# $ANTLR 3.1.3 Mar 18, 2009 10:09:25 src\\BuildFSM.g 2012-01-22 21:27:30

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

class FSMBuilderState(object):
    def __init__(self, parent= None):
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
        self.parent = parentFSM
        
	def move_current_state(self, value = None):
		if value is None:
			self.current_state = self.state_gen.next()
		else: 
			self.current_state = value
		return self.current_state
	def get_current_state(self):
		return self.current_state
		
	def add_transition(self, transition):
		elif self.current_fsm.parent is not None: 
			self.fsm.add_nested_transition(transition, 
	  					       self.parent.get_current_state()
						       self.get_current_state(),
		  				       checkMessages, self.move_current_state())
		else:
			self.fsm.add_transition(transition, 
						self.get_current_state(), 
						checkMessages, self.move_current_state())



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
INTERACTION=4
T__56=56
ML_COMMENT=30
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
VALUE=15
MINUS=8
MULT=9
ASSERT=21
UNORDERED=17
StringLiteral=25
T__32=32
T__33=33
T__34=34
GLOBAL_ESCAPE=22
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




class BuildFSM(TreeParser):
    grammarFileName = "src\\BuildFSM.g"
    antlr_version = version_str_to_tuple("3.1.3 Mar 18, 2009 10:09:25")
    antlr_version_str = "3.1.3 Mar 18, 2009 10:09:25"
    tokenNames = tokenNames

    def __init__(self, input, state=None, *args, **kwargs):
        if state is None:
            state = RecognizerSharedState()

        super(BuildFSM, self).__init__(input, state, *args, **kwargs)



               
        # memory here is used only for logging and debugging purposes. 
        # We append bebugging information to memory so we can print it later. 
        self.memory = []
        self.main_fsm = FSMBuilderState()
        self.current_fsm = main_fsm




                


        



    # $ANTLR start "description"
    # src\\BuildFSM.g:68:1: description : ^( PROTOCOL ( activityDef )+ ) ;
    def description(self, ):

        try:
            try:
                # src\\BuildFSM.g:68:12: ( ^( PROTOCOL ( activityDef )+ ) )
                # src\\BuildFSM.g:68:14: ^( PROTOCOL ( activityDef )+ )
                pass 
                self.match(self.input, PROTOCOL, self.FOLLOW_PROTOCOL_in_description52)

                self.match(self.input, DOWN, None)
                # src\\BuildFSM.g:68:25: ( activityDef )+
                cnt1 = 0
                while True: #loop1
                    alt1 = 2
                    LA1_0 = self.input.LA(1)

                    if ((RESV <= LA1_0 <= SEND) or (RECLABEL <= LA1_0 <= PARALLEL) or LA1_0 == 47 or (49 <= LA1_0 <= 50)) :
                        alt1 = 1


                    if alt1 == 1:
                        # src\\BuildFSM.g:68:25: activityDef
                        pass 
                        self._state.following.append(self.FOLLOW_activityDef_in_description54)
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
    # src\\BuildFSM.g:69:1: activityDef : ( ^( RESV ^( VALUE (val= ID type= ID )* ) rlabel= ID (rtype= ID )* role= ID ^( ASSERT (assertion= ASSERTION )? ) ) | ^( SEND ^( VALUE (val= ID type= ID )* ) slabel= ID (stype= ID )* role= ID ^( ASSERT (assertion= ASSERTION )? ) ) | ^( 'choice' ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( PARALLEL ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( 'repeat' ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'rec' label= ID ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'RECLABEL' labelID= ID ) );
    def activityDef(self, ):

        val = None
        type = None
        rlabel = None
        rtype = None
        role = None
        assertion = None
        slabel = None
        stype = None
        label = None
        labelID = None

        try:
            try:
                # src\\BuildFSM.g:69:12: ( ^( RESV ^( VALUE (val= ID type= ID )* ) rlabel= ID (rtype= ID )* role= ID ^( ASSERT (assertion= ASSERTION )? ) ) | ^( SEND ^( VALUE (val= ID type= ID )* ) slabel= ID (stype= ID )* role= ID ^( ASSERT (assertion= ASSERTION )? ) ) | ^( 'choice' ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( PARALLEL ( ^( BRANCH ( activityDef )+ ) )+ ) | ^( 'repeat' ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'rec' label= ID ( ^( BRANCH ( activityDef )+ ) ) ) | ^( 'RECLABEL' labelID= ID ) )
                alt14 = 7
                LA14 = self.input.LA(1)
                if LA14 == RESV:
                    alt14 = 1
                elif LA14 == SEND:
                    alt14 = 2
                elif LA14 == 47:
                    alt14 = 3
                elif LA14 == PARALLEL:
                    alt14 = 4
                elif LA14 == 49:
                    alt14 = 5
                elif LA14 == 50:
                    alt14 = 6
                elif LA14 == RECLABEL:
                    alt14 = 7
                else:
                    nvae = NoViableAltException("", 14, 0, self.input)

                    raise nvae

                if alt14 == 1:
                    # src\\BuildFSM.g:70:4: ^( RESV ^( VALUE (val= ID type= ID )* ) rlabel= ID (rtype= ID )* role= ID ^( ASSERT (assertion= ASSERTION )? ) )
                    pass 
                    self.match(self.input, RESV, self.FOLLOW_RESV_in_activityDef68)

                    self.match(self.input, DOWN, None)
                    self.match(self.input, VALUE, self.FOLLOW_VALUE_in_activityDef75)

                    if self.input.LA(1) == DOWN:
                        self.match(self.input, DOWN, None)
                        # src\\BuildFSM.g:71:12: (val= ID type= ID )*
                        while True: #loop2
                            alt2 = 2
                            LA2_0 = self.input.LA(1)

                            if (LA2_0 == ID) :
                                alt2 = 1


                            if alt2 == 1:
                                # src\\BuildFSM.g:71:13: val= ID type= ID
                                pass 
                                val=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef80)
                                type=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef85)


                            else:
                                break #loop2

                        self.match(self.input, UP, None)

                    #action start
                    self.memory.append('In RESV value')
                    #action end
                    rlabel=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef99)
                    #action start
                    #INFO: This is the way to write comments in actions self.memory.append('resv' + rlabel.text)
                    #action end
                    # src\\BuildFSM.g:74:4: (rtype= ID )*
                    while True: #loop3
                        alt3 = 2
                        LA3_0 = self.input.LA(1)

                        if (LA3_0 == ID) :
                            LA3_1 = self.input.LA(2)

                            if (LA3_1 == ID) :
                                alt3 = 1




                        if alt3 == 1:
                            # src\\BuildFSM.g:74:6: rtype= ID
                            pass 
                            rtype=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef117)
                            #action start
                            self.memory.append(rtype.text)
                            #action end


                        else:
                            break #loop3
                    role=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef127)
                    #action start
                    self.current_fsm.add_transition(TransitionFactory.create(LocalType.RESV,rlabel, role))
                    #action end
                    self.match(self.input, ASSERT, self.FOLLOW_ASSERT_in_activityDef138)

                    if self.input.LA(1) == DOWN:
                        self.match(self.input, DOWN, None)
                        # src\\BuildFSM.g:76:13: (assertion= ASSERTION )?
                        alt4 = 2
                        LA4_0 = self.input.LA(1)

                        if (LA4_0 == ASSERTION) :
                            alt4 = 1
                        if alt4 == 1:
                            # src\\BuildFSM.g:76:14: assertion= ASSERTION
                            pass 
                            assertion=self.match(self.input, ASSERTION, self.FOLLOW_ASSERTION_in_activityDef143)




                        self.match(self.input, UP, None)

                    #action start
                    self.memory.append('In RESV assertion')
                    #action end

                    self.match(self.input, UP, None)


                elif alt14 == 2:
                    # src\\BuildFSM.g:78:4: ^( SEND ^( VALUE (val= ID type= ID )* ) slabel= ID (stype= ID )* role= ID ^( ASSERT (assertion= ASSERTION )? ) )
                    pass 
                    self.match(self.input, SEND, self.FOLLOW_SEND_in_activityDef159)

                    self.match(self.input, DOWN, None)
                    self.match(self.input, VALUE, self.FOLLOW_VALUE_in_activityDef164)

                    if self.input.LA(1) == DOWN:
                        self.match(self.input, DOWN, None)
                        # src\\BuildFSM.g:79:10: (val= ID type= ID )*
                        while True: #loop5
                            alt5 = 2
                            LA5_0 = self.input.LA(1)

                            if (LA5_0 == ID) :
                                alt5 = 1


                            if alt5 == 1:
                                # src\\BuildFSM.g:79:11: val= ID type= ID
                                pass 
                                val=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef169)
                                type=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef174)


                            else:
                                break #loop5

                        self.match(self.input, UP, None)

                    #action start
                    self.memory.append('In SEND value')
                    #action end
                    slabel=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef187)
                    #action start
                    self.memory.append('send' + slabel.text)
                    #action end
                    # src\\BuildFSM.g:80:58: (stype= ID )*
                    while True: #loop6
                        alt6 = 2
                        LA6_0 = self.input.LA(1)

                        if (LA6_0 == ID) :
                            LA6_1 = self.input.LA(2)

                            if (LA6_1 == ID) :
                                alt6 = 1




                        if alt6 == 1:
                            # src\\BuildFSM.g:80:60: stype= ID
                            pass 
                            stype=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef197)
                            #action start
                            self.memory.append(stype.text)
                            #action end


                        else:
                            break #loop6
                    role=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef207)
                    #action start
                    self.current_fsm.add_transition(TransitionFactory.create(LocalType.SEND,slabel, role))
                    #action end
                    self.match(self.input, ASSERT, self.FOLLOW_ASSERT_in_activityDef215)

                    if self.input.LA(1) == DOWN:
                        self.match(self.input, DOWN, None)
                        # src\\BuildFSM.g:82:11: (assertion= ASSERTION )?
                        alt7 = 2
                        LA7_0 = self.input.LA(1)

                        if (LA7_0 == ASSERTION) :
                            alt7 = 1
                        if alt7 == 1:
                            # src\\BuildFSM.g:82:12: assertion= ASSERTION
                            pass 
                            assertion=self.match(self.input, ASSERTION, self.FOLLOW_ASSERTION_in_activityDef220)




                        self.match(self.input, UP, None)

                    #action start
                    self.memory.append('In SEND assertion')
                    #action end

                    self.match(self.input, UP, None)


                elif alt14 == 3:
                    # src\\BuildFSM.g:84:3: ^( 'choice' ( ^( BRANCH ( activityDef )+ ) )+ )
                    pass 
                    self.match(self.input, 47, self.FOLLOW_47_in_activityDef234)

                    #action start
                    self.memory.append('enter choice state')
                    self.current_fsm.choice_start_stat. = self.current_fsm.get_current_state()
                    self.current_fsm.choice_end_state = self.current_fsm.state_gen.next()
                    	
                    #action end

                    self.match(self.input, DOWN, None)
                    # src\\BuildFSM.g:89:2: ( ^( BRANCH ( activityDef )+ ) )+
                    cnt9 = 0
                    while True: #loop9
                        alt9 = 2
                        LA9_0 = self.input.LA(1)

                        if (LA9_0 == BRANCH) :
                            alt9 = 1


                        if alt9 == 1:
                            # src\\BuildFSM.g:89:3: ^( BRANCH ( activityDef )+ )
                            pass 
                            self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef244)

                            #action start
                              
                            self.memory.append('enter choice branch and save the current state')
                            self.current_fsm.move_current_state(self.current_fsm.choice_start_state)
                            	
                            #action end

                            self.match(self.input, DOWN, None)
                            # src\\BuildFSM.g:93:4: ( activityDef )+
                            cnt8 = 0
                            while True: #loop8
                                alt8 = 2
                                LA8_0 = self.input.LA(1)

                                if ((RESV <= LA8_0 <= SEND) or (RECLABEL <= LA8_0 <= PARALLEL) or LA8_0 == 47 or (49 <= LA8_0 <= 50)) :
                                    alt8 = 1


                                if alt8 == 1:
                                    # src\\BuildFSM.g:93:4: activityDef
                                    pass 
                                    self._state.following.append(self.FOLLOW_activityDef_in_activityDef250)
                                    self.activityDef()

                                    self._state.following.pop()


                                else:
                                    if cnt8 >= 1:
                                        break #loop8

                                    eee = EarlyExitException(8, self.input)
                                    raise eee

                                cnt8 += 1

                            self.match(self.input, UP, None)
                            #action start
                              
                            self.memory.append('exit choice branch and set the current state to the end state for the choice')
                            self.current_fsm.add_transition(self.fsm.EMPTY_TRANSITION, self.current_fsm.get_current_state(), nothing, self.current_fsm.choice_end_state)
                            	
                            #action end


                        else:
                            if cnt9 >= 1:
                                break #loop9

                            eee = EarlyExitException(9, self.input)
                            raise eee

                        cnt9 += 1

                    self.match(self.input, UP, None)
                    #action start
                      
                    self.memory.append('set the current state to be equal to the end state for the choice')
                    self.current_fsm.move_current_state(self.choice_end_state)
                    	
                    #action end


                elif alt14 == 4:
                    # src\\BuildFSM.g:103:4: ^( PARALLEL ( ^( BRANCH ( activityDef )+ ) )+ )
                    pass 
                    self.match(self.input, PARALLEL, self.FOLLOW_PARALLEL_in_activityDef269)

                    #action start
                             
                    self.memory.append('enter parallel state')
                    self.current_fsm.processing_par_state = True
                            
                    #action end

                    self.match(self.input, DOWN, None)
                    # src\\BuildFSM.g:108:2: ( ^( BRANCH ( activityDef )+ ) )+
                    cnt11 = 0
                    while True: #loop11
                        alt11 = 2
                        LA11_0 = self.input.LA(1)

                        if (LA11_0 == BRANCH) :
                            alt11 = 1


                        if alt11 == 1:
                            # src\\BuildFSM.g:108:3: ^( BRANCH ( activityDef )+ )
                            pass 
                            self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef286)

                            #action start
                              
                            self.memory.append('enter parallel branch')
                            self.current_fsm.start_new_par_branch = True
                            nested_fsm = FSMBuilderState(self.fsm)
                            self.current_fsm.add_fsm_to_memory(self.current_fsm.get_current_state(), nested_fsm)
                            self.current_fsm = nested_fsm
                            	
                            	
                            #action end

                            self.match(self.input, DOWN, None)
                            # src\\BuildFSM.g:117:2: ( activityDef )+
                            cnt10 = 0
                            while True: #loop10
                                alt10 = 2
                                LA10_0 = self.input.LA(1)

                                if ((RESV <= LA10_0 <= SEND) or (RECLABEL <= LA10_0 <= PARALLEL) or LA10_0 == 47 or (49 <= LA10_0 <= 50)) :
                                    alt10 = 1


                                if alt10 == 1:
                                    # src\\BuildFSM.g:117:3: activityDef
                                    pass 
                                    self._state.following.append(self.FOLLOW_activityDef_in_activityDef295)
                                    self.activityDef()

                                    self._state.following.pop()
                                    #action start
                                    self.start_new_branch = False
                                    #action end


                                else:
                                    if cnt10 >= 1:
                                        break #loop10

                                    eee = EarlyExitException(10, self.input)
                                    raise eee

                                cnt10 += 1

                            self.match(self.input, UP, None)
                            #action start
                              
                            self.memory.append('exit parallel branch')
                            self.current_fsm.start_new_par_branch = True
                            #action end


                        else:
                            if cnt11 >= 1:
                                break #loop11

                            eee = EarlyExitException(11, self.input)
                            raise eee

                        cnt11 += 1

                    self.match(self.input, UP, None)
                    #action start
                    self.memory.append('exit parallel state')
                    self.current_fsm.processing_par_state = False
                    self.current_fsm = self.current_fsm.parent
                    self.current_fsm.add_transition(self.fsm.EMPTY_TRANSITION, self.current_fsm.get_current_state(), nothing, self.current_fsm.move_current_state())
                    	
                    #action end


                elif alt14 == 5:
                    # src\\BuildFSM.g:127:3: ^( 'repeat' ( ^( BRANCH ( activityDef )+ ) ) )
                    pass 
                    self.match(self.input, 49, self.FOLLOW_49_in_activityDef318)

                    #action start
                    self.memory.append('enter repeat state')
                    #action end

                    self.match(self.input, DOWN, None)
                    # src\\BuildFSM.g:129:2: ( ^( BRANCH ( activityDef )+ ) )
                    # src\\BuildFSM.g:129:3: ^( BRANCH ( activityDef )+ )
                    pass 
                    self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef327)

                    self.match(self.input, DOWN, None)
                    # src\\BuildFSM.g:129:12: ( activityDef )+
                    cnt12 = 0
                    while True: #loop12
                        alt12 = 2
                        LA12_0 = self.input.LA(1)

                        if ((RESV <= LA12_0 <= SEND) or (RECLABEL <= LA12_0 <= PARALLEL) or LA12_0 == 47 or (49 <= LA12_0 <= 50)) :
                            alt12 = 1


                        if alt12 == 1:
                            # src\\BuildFSM.g:129:13: activityDef
                            pass 
                            self._state.following.append(self.FOLLOW_activityDef_in_activityDef330)
                            self.activityDef()

                            self._state.following.pop()
                            #action start
                            self.memory.append('repeat statement')
                            #action end


                        else:
                            if cnt12 >= 1:
                                break #loop12

                            eee = EarlyExitException(12, self.input)
                            raise eee

                        cnt12 += 1

                    self.match(self.input, UP, None)




                    self.match(self.input, UP, None)
                    #action start
                    self.memory.append('exit repeat state')
                    #action end


                elif alt14 == 6:
                    # src\\BuildFSM.g:132:10: ^( 'rec' label= ID ( ^( BRANCH ( activityDef )+ ) ) )
                    pass 
                    self.match(self.input, 50, self.FOLLOW_50_in_activityDef354)

                    self.match(self.input, DOWN, None)
                    label=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef360)
                    #action start
                    self.memory.append('enter rec state ' + label.text)
                    self.current_fsm.recursions_states.setdefault(label.text, self.current_fsm.get_current_state())
                            
                    #action end
                    # src\\BuildFSM.g:136:2: ( ^( BRANCH ( activityDef )+ ) )
                    # src\\BuildFSM.g:136:3: ^( BRANCH ( activityDef )+ )
                    pass 
                    self.match(self.input, BRANCH, self.FOLLOW_BRANCH_in_activityDef376)

                    self.match(self.input, DOWN, None)
                    # src\\BuildFSM.g:136:12: ( activityDef )+
                    cnt13 = 0
                    while True: #loop13
                        alt13 = 2
                        LA13_0 = self.input.LA(1)

                        if ((RESV <= LA13_0 <= SEND) or (RECLABEL <= LA13_0 <= PARALLEL) or LA13_0 == 47 or (49 <= LA13_0 <= 50)) :
                            alt13 = 1


                        if alt13 == 1:
                            # src\\BuildFSM.g:136:13: activityDef
                            pass 
                            self._state.following.append(self.FOLLOW_activityDef_in_activityDef379)
                            self.activityDef()

                            self._state.following.pop()
                            #action start
                            self.memory.append('rec statement')
                            #action end


                        else:
                            if cnt13 >= 1:
                                break #loop13

                            eee = EarlyExitException(13, self.input)
                            raise eee

                        cnt13 += 1

                    self.match(self.input, UP, None)




                    self.match(self.input, UP, None)
                    #action start
                    self.memory.append('exit rec state ' + label.text)
                    #action end


                elif alt14 == 7:
                    # src\\BuildFSM.g:139:3: ^( 'RECLABEL' labelID= ID )
                    pass 
                    self.match(self.input, RECLABEL, self.FOLLOW_RECLABEL_in_activityDef397)

                    self.match(self.input, DOWN, None)
                    labelID=self.match(self.input, ID, self.FOLLOW_ID_in_activityDef404)
                    #action start
                                                  
                    self.memory.append('repeat rec again ' + labelID.text)
                    self.current_fsm.copy_transitions(self.current_fsm.recursions_states[labelID.text], self.current_fsm.get_current_state())
                    	
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
    # src\\BuildFSM.g:144:1: roleName : ID ;
    def roleName(self, ):

        try:
            try:
                # src\\BuildFSM.g:144:9: ( ID )
                # src\\BuildFSM.g:144:11: ID
                pass 
                self.match(self.input, ID, self.FOLLOW_ID_in_roleName415)




            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
        finally:

            pass
        return 

    # $ANTLR end "roleName"


    # $ANTLR start "labelName"
    # src\\BuildFSM.g:145:1: labelName : ID ;
    def labelName(self, ):

        try:
            try:
                # src\\BuildFSM.g:145:10: ( ID )
                # src\\BuildFSM.g:145:12: ID
                pass 
                self.match(self.input, ID, self.FOLLOW_ID_in_labelName421)




            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
        finally:

            pass
        return 

    # $ANTLR end "labelName"


    # $ANTLR start "roleDef"
    # src\\BuildFSM.g:146:1: roleDef : ID ;
    def roleDef(self, ):

        try:
            try:
                # src\\BuildFSM.g:146:8: ( ID )
                # src\\BuildFSM.g:146:10: ID
                pass 
                self.match(self.input, ID, self.FOLLOW_ID_in_roleDef427)




            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)
        finally:

            pass
        return 

    # $ANTLR end "roleDef"


    # Delegated rules


 

    FOLLOW_PROTOCOL_in_description52 = frozenset([2])
    FOLLOW_activityDef_in_description54 = frozenset([3, 12, 13, 18, 19, 47, 49, 50])
    FOLLOW_RESV_in_activityDef68 = frozenset([2])
    FOLLOW_VALUE_in_activityDef75 = frozenset([2])
    FOLLOW_ID_in_activityDef80 = frozenset([24])
    FOLLOW_ID_in_activityDef85 = frozenset([3, 24])
    FOLLOW_ID_in_activityDef99 = frozenset([24])
    FOLLOW_ID_in_activityDef117 = frozenset([24])
    FOLLOW_ID_in_activityDef127 = frozenset([21])
    FOLLOW_ASSERT_in_activityDef138 = frozenset([2])
    FOLLOW_ASSERTION_in_activityDef143 = frozenset([3])
    FOLLOW_SEND_in_activityDef159 = frozenset([2])
    FOLLOW_VALUE_in_activityDef164 = frozenset([2])
    FOLLOW_ID_in_activityDef169 = frozenset([24])
    FOLLOW_ID_in_activityDef174 = frozenset([3, 24])
    FOLLOW_ID_in_activityDef187 = frozenset([24])
    FOLLOW_ID_in_activityDef197 = frozenset([24])
    FOLLOW_ID_in_activityDef207 = frozenset([21])
    FOLLOW_ASSERT_in_activityDef215 = frozenset([2])
    FOLLOW_ASSERTION_in_activityDef220 = frozenset([3])
    FOLLOW_47_in_activityDef234 = frozenset([2])
    FOLLOW_BRANCH_in_activityDef244 = frozenset([2])
    FOLLOW_activityDef_in_activityDef250 = frozenset([3, 12, 13, 18, 19, 47, 49, 50])
    FOLLOW_PARALLEL_in_activityDef269 = frozenset([2])
    FOLLOW_BRANCH_in_activityDef286 = frozenset([2])
    FOLLOW_activityDef_in_activityDef295 = frozenset([3, 12, 13, 18, 19, 47, 49, 50])
    FOLLOW_49_in_activityDef318 = frozenset([2])
    FOLLOW_BRANCH_in_activityDef327 = frozenset([2])
    FOLLOW_activityDef_in_activityDef330 = frozenset([3, 12, 13, 18, 19, 47, 49, 50])
    FOLLOW_50_in_activityDef354 = frozenset([2])
    FOLLOW_ID_in_activityDef360 = frozenset([16])
    FOLLOW_BRANCH_in_activityDef376 = frozenset([2])
    FOLLOW_activityDef_in_activityDef379 = frozenset([3, 12, 13, 18, 19, 47, 49, 50])
    FOLLOW_RECLABEL_in_activityDef397 = frozenset([2])
    FOLLOW_ID_in_activityDef404 = frozenset([3])
    FOLLOW_ID_in_roleName415 = frozenset([1])
    FOLLOW_ID_in_labelName421 = frozenset([1])
    FOLLOW_ID_in_roleDef427 = frozenset([1])



def main(argv, stdin=sys.stdin, stdout=sys.stdout, stderr=sys.stderr):
    from antlr3.main import WalkerMain
    main = WalkerMain(BuildFSM)
    main.stdin = stdin
    main.stdout = stdout
    main.stderr = stderr
    main.execute(argv)


if __name__ == '__main__':
    main(sys.argv)
