grammar Monitor;

options {
        language=Python;
	output=AST;
	backtrack=true;
}

tokens {
	INTERACTION = 'interaction';
	PLUS 	= '+' ;
	MINUS	= '-' ;
	MULT	= '*' ;
	DIV	= '/' ;
	FULLSTOP = '.' ;
	RESV = 'RESV';
	SEND = 'SEND';
	BRANCH = 'BRANCH';
	UNORDERED = 'UNORDERED';
	RECLABEL = 'RECLABEL';
	PARALLEL = 'PARALLEL';
	PROTOCOL = 'PROTOCOL';
}

/*------------------------------------------------------------------
 * PARSER RULES
*------------------------------------------------------------------*/

description: ( ( ANNOTATION )* ( importProtocolStatement | importTypeStatement ) )* ( ANNOTATION )* protocolDef -> protocolDef;

importProtocolStatement: 'import' 'protocol' importProtocolDef ( ','! importProtocolDef )* ';'! ;

importProtocolDef: ID 'from'! StringLiteral;
						
importTypeStatement: 'import' ( simpleName )? importTypeDef ( ','! importTypeDef )* ( 'from'! StringLiteral )? ';'! ;

importTypeDef: ( dataTypeDef 'as'! )? ID ;

dataTypeDef: StringLiteral ;

simpleName: ID ;

protocolDef: 'protocol' protocolName ( 'at' roleName )? ( parameterDefs )? '{' protocolBlockDef ( ( ANNOTATION )* protocolDef )* '}'
	     -> ^(PROTOCOL protocolBlockDef+);

protocolName: ID ;

parameterDefs: '('! parameterDef ( ','! parameterDef )* ')'! ;

parameterDef: ( typeReferenceDef | 'role' ) simpleName ;

protocolBlockDef: activityListDef -> activityListDef;

blockDef: '{' activityListDef '}' -> ^(BRANCH activityListDef);

activityListDef: ( ( ANNOTATION )* activityDef )* -> activityDef+;

activityDef: ( introducesDef | interactionDef | inlineDef | runDef | recursionDef | endDef ) ';'! | 
			choiceDef | directedChoiceDef | parallelDef | repeatDef | unorderedDef |
			recBlockDef | globalEscapeDef ;

introducesDef: roleDef 'introduces' roleDef ( ',' roleDef )* ;

roleDef: ID -> ID;

roleName: ID -> ID;

typeReferenceDef: ID -> ID ;

interactionSignatureDef: ( typeReferenceDef | ID '('! ( typeReferenceDef ( ','! typeReferenceDef )* )? ')'! );

// TODO: add the to roleNames
interactionDef: 
	     interactionSignatureDef (
		'from' role= roleName  -> ^(RESV interactionSignatureDef $role )
	      | 'to' roleName  -> ^(SEND interactionSignatureDef roleName));

choiceDef: 'choice' ( 'at' roleName )? blockDef ( 'or' blockDef )* -> ^('choice' blockDef+);

directedChoiceDef: ( 'from' roleName )? ( 'to' roleName ( ','! roleName )* )? '{' ( onMessageDef )+ '}';

onMessageDef: interactionSignatureDef ':' activityList ; 

activityList: ( ( ANNOTATION )* activityDef )*;

repeatDef: 'repeat' ( 'at' roleName ( ',' roleName )* )? blockDef  -> ^('repeat' blockDef);

recBlockDef: 'rec' labelName blockDef -> ^('rec' labelName blockDef);

labelName: ID -> ID ;

recursionDef: labelName -> ^(RECLABEL labelName);

// TODO: check end
endDef: 'end'^ ;

// TODO: run
runDef: 'run'^ protocolRefDef ( '('! parameter ( ','! parameter )* ')'! )? 'from' roleName ;

protocolRefDef: ID ( 'at' roleName )? ;

declarationName: ID ;

parameter: declarationName ;

// TODO: inline
inlineDef: 'inline'^ protocolRefDef ( '('! parameter ( ','! parameter )* ')'! )? ;

parallelDef: 'parallel' blockDef ( 'and' blockDef )* -> ^(PARALLEL blockDef+);

// TODO: interruptDef
globalEscapeDef: 'do'^ blockDef ( interruptDef )+ ;

// TODO: interruptDef
interruptDef: 'interrupt'^ blockDef ;

unorderedDef: 'unordered' '{' ( ( ANNOTATION )* activityDef )* '}' -> ^(PARALLEL ^(BRANCH activityDef)+);


/*-----------------------------------------------
TO DO:
Declaration (variables) possibly - but that may need
lookahead to avoid conflict with interactions.
-------------------------------------------------*/

expr	: term ( ( PLUS | MINUS )  term )* ;

term	: factor ( ( MULT | DIV ) factor )* ;

factor	: NUMBER ;


/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

ID : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

NUMBER	: (DIGIT)+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;

fragment DIGIT	: '0'..'9' ;

ANNOTATION : '[[' (options {greedy=false;} : .)* ']]' ;

ML_COMMENT
    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT : '//' (options {greedy=false;} : .)* '\n' {$channel=HIDDEN;} ;

StringLiteral: '"' ( ~('\\'|'"') )* '"' ;
