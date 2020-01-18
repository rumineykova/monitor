tree grammar BuildFSM;

options
{ 
 tokenVocab = Monitor;
 ASTLabelType = CommonTree;
 language= Python;
}

@header{
from core.fsm import FSM
from core.transition import TransitionFactory
from core.LocalType import LocalType
def checkMessages(fsm):
	print "Message is checked: \%s" \%(fsm.input_symbol)

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
}

@init {
# memory here is used only for logging and debugging purposes. 
# We append bebugging information to memory so we can print it later. 
self.memory = []
self.main_fsm = FSMBuilderState()
self.current_fsm = main_fsm
}

description: ^(PROTOCOL activityDef+) {print "ProtocolDefinition"};
activityDef:
	  ^(RESV 
	  ^(VALUE (val=ID type= ID)*){self.memory.append('In RESV value')} 
	  rlabel = ID 
	  {#INFO: This is the way to write comments in actions self.memory.append('resv' + $rlabel.text)} 
	  ( rtype = ID {self.memory.append($rtype.text)})* role = ID
	  {self.current_fsm.add_transition(TransitionFactory.create(LocalType.RESV,$rlabel, $role))}
	  ^(ASSERT (assertion=ASSERTION)?)	  {self.memory.append('In RESV assertion')} )

	| ^(SEND 
	^(VALUE (val=ID type= primitivetype)*) {self.memory.append('In SEND value')} 
	slabel = ID {self.memory.append('send' + $slabel.text)} ( stype = ID {self.memory.append($stype.text)})* role = ID
	{self.current_fsm.add_transition(TransitionFactory.create(LocalType.SEND,$slabel, $role))} 
	^(ASSERT (assertion=ASSERTION)?) {self.memory.append('In SEND assertion')} )
	
	|^('choice' 
	{self.memory.append('enter choice state')
	 self.current_fsm.choice_start_stat. = self.current_fsm.get_current_state()
	 self.current_fsm.choice_end_state = self.current_fsm.state_gen.next()
	} 
	(^(BRANCH 
	{
	self.memory.append('enter choice branch and save the current state')
	self.current_fsm.move_current_state(self.current_fsm.choice_start_state)
	} activityDef+)
	{
	self.memory.append('exit choice branch and set the current state to the end state for the choice')
	self.current_fsm.add_transition(self.fsm.EMPTY_TRANSITION, self.current_fsm.get_current_state(), nothing, self.current_fsm.choice_end_state)
	})+) 
	{
	self.memory.append('set the current state to be equal to the end state for the choice')
	self.current_fsm.move_current_state(self.choice_end_state)
	}

	| ^(PARALLEL 
        {
        self.memory.append('enter parallel state')
        self.current_fsm.processing_par_state = True
        } 
	(^(BRANCH 
	{
	self.memory.append('enter parallel branch')
	self.current_fsm.start_new_par_branch = True
	nested_fsm = FSMBuilderState(self.fsm)
	self.current_fsm.add_fsm_to_memory(self.current_fsm.get_current_state(), nested_fsm)
	self.current_fsm = nested_fsm
	
	} 
	(activityDef {self.start_new_branch = False}) +) 
	{
	self.memory.append('exit parallel branch')
	self.current_fsm.start_new_par_branch = True})+) 
	{self.memory.append('exit parallel state')
	 self.current_fsm.processing_par_state = False
	 self.current_fsm = self.current_fsm.parent
	 self.current_fsm.add_transition(self.fsm.EMPTY_TRANSITION, self.current_fsm.get_current_state(), nothing, self.current_fsm.move_current_state())
	}

	|^('repeat'
	{self.memory.append('enter repeat state')} 
	(^(BRANCH (activityDef {self.memory.append('repeat statement')})+))) 
	{self.memory.append('exit repeat state')}

        |^('rec' label = ID
        {self.memory.append('enter rec state ' + $label.text)
         self.current_fsm.recursions_states.setdefault($label.text, self.current_fsm.get_current_state())
        } 
	(^(BRANCH (activityDef {self.memory.append('rec statement')})+))) 
	{self.memory.append('exit rec state ' + $label.text)}
	
	|^('RECLABEL'  labelID = ID {
	self.memory.append('repeat rec again ' + $labelID.text)
	self.current_fsm.copy_transitions(self.current_fsm.recursions_states[$labelID.text], self.current_fsm.get_current_state())
	})
	;
roleName: ID;
labelName: ID;
roleDef: ID;
primitivetype : INT
		|STRING;


