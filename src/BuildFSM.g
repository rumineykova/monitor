tree grammar BuildFSM;

options
{ 
 tokenVocab = Monitor;
 ASTLabelType = CommonTree;
 language= Python;
}

description: protocolDef {print "Enter protocol"};


protocolDef:  ^('protocol' protocolBlockDef) {print "ProtocolDefinition"};

activityDef:
	// interactionDef 
	^('RESV' ID+ roleName)
	| ^('SEND' ID+ roleName)
	// recursionDef 
	|^('RECLABEL' labelName)
	// choiceDef 
	|^('choice' blockDef+)
	// parallelDef 
	| ^('parallel' blockDef+)
	//| unorderedDef 
	|^('UNORDERED' blockDef)
	// recBlockDef 
	|^('rec' blockDef)
	// repeatDef 
	|^('repeat' blockDef);

roleName: ID;
labelName: ID ;


protocolBlockDef: activityDef+;
blockDef:  ^('BRANCH' activityDef*);


