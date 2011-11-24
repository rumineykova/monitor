tree grammar BuildFSM;

options
{ 
 tokenVocab = Monitor;
 ASTLabelType = CommonTree;
 language= Python;
}

@init {
self.memory = []
self.isInSpecialState = False;
}

description: ^(PROTOCOL activityDef+) {print "ProtocolDefinition"};
activityDef:
	  ^(RESV rlabel = ID {self.memory.append('resv' + $rlabel.text)} ( rtype = ID {self.memory.append($rtype.text)})* roleName)

	| ^(SEND slabel = ID {self.memory.append('send' + $slabel.text)} ( stype = ID {self.memory.append($stype.text)})* roleName)

	|^('choice' 
	{self.memory.append('enter choice state')} 
	(^(BRANCH {self.memory.append('enter choice branch')} activityDef+) {self.memory.append('exit choice branch')})+) 
	{self.memory.append('exit choice state')}

	| ^(PARALLEL 
        {self.memory.append('enter parallel state')} 
	(^(BRANCH {self.memory.append('enter parallel branch')} activityDef+) {self.memory.append('exit parallel branch')})+) 
	{self.memory.append('exit parallel state')}

	|^(UNORDERED
	{self.memory.append('enter unordered state')} 
	(^(BRANCH (activityDef {self.memory.append('unordered statement')})+))) 
	{self.memory.append('exit unordered state')}

	|^('repeat'
	{self.memory.append('enter repeat state')} 
	(^(BRANCH (activityDef {self.memory.append('repeat statement')})+))) 
	{self.memory.append('exit repeat state')}

        |^('rec' label = ID
        {self.memory.append('enter rec state ' + $label.text)} 
	(^(BRANCH (activityDef {self.memory.append('rec statement')})+))) 
	{self.memory.append('exit rec state ' + $label.text)}
	
	|^('RECLABEL'  labelID = ID {self.memory.append('repeat rec again ' + $labelID.text)})
	;
roleName: ID;
labelName: ID;
roleDef: ID;


