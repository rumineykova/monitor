class FSMBuilderState(object):
    def __init__(self):
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
    