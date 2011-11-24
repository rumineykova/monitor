# $ANTLR 3.1.3 Mar 18, 2009 10:09:25 src/Monitor.g 2011-11-20 16:01:49

import sys
from antlr3 import *
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


class MonitorLexer(Lexer):

    grammarFileName = "src/Monitor.g"
    antlr_version = version_str_to_tuple("3.1.3 Mar 18, 2009 10:09:25")
    antlr_version_str = "3.1.3 Mar 18, 2009 10:09:25"

    def __init__(self, input=None, state=None):
        if state is None:
            state = RecognizerSharedState()
        super(MonitorLexer, self).__init__(input, state)


        self.dfa8 = self.DFA8(
            self, 8,
            eot = self.DFA8_eot,
            eof = self.DFA8_eof,
            min = self.DFA8_min,
            max = self.DFA8_max,
            accept = self.DFA8_accept,
            special = self.DFA8_special,
            transition = self.DFA8_transition
            )






    # $ANTLR start "INTERACTION"
    def mINTERACTION(self, ):

        try:
            _type = INTERACTION
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:7:13: ( 'interaction' )
            # src/Monitor.g:7:15: 'interaction'
            pass 
            self.match("interaction")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "INTERACTION"



    # $ANTLR start "PLUS"
    def mPLUS(self, ):

        try:
            _type = PLUS
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:8:6: ( '+' )
            # src/Monitor.g:8:8: '+'
            pass 
            self.match(43)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "PLUS"



    # $ANTLR start "MINUS"
    def mMINUS(self, ):

        try:
            _type = MINUS
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:9:7: ( '-' )
            # src/Monitor.g:9:9: '-'
            pass 
            self.match(45)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "MINUS"



    # $ANTLR start "MULT"
    def mMULT(self, ):

        try:
            _type = MULT
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:10:6: ( '*' )
            # src/Monitor.g:10:8: '*'
            pass 
            self.match(42)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "MULT"



    # $ANTLR start "DIV"
    def mDIV(self, ):

        try:
            _type = DIV
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:11:5: ( '/' )
            # src/Monitor.g:11:7: '/'
            pass 
            self.match(47)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "DIV"



    # $ANTLR start "FULLSTOP"
    def mFULLSTOP(self, ):

        try:
            _type = FULLSTOP
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:12:10: ( '.' )
            # src/Monitor.g:12:12: '.'
            pass 
            self.match(46)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "FULLSTOP"



    # $ANTLR start "RESV"
    def mRESV(self, ):

        try:
            _type = RESV
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:13:6: ( 'RESV' )
            # src/Monitor.g:13:8: 'RESV'
            pass 
            self.match("RESV")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "RESV"



    # $ANTLR start "SEND"
    def mSEND(self, ):

        try:
            _type = SEND
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:14:6: ( 'SEND' )
            # src/Monitor.g:14:8: 'SEND'
            pass 
            self.match("SEND")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "SEND"



    # $ANTLR start "BRANCH"
    def mBRANCH(self, ):

        try:
            _type = BRANCH
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:15:8: ( 'BRANCH' )
            # src/Monitor.g:15:10: 'BRANCH'
            pass 
            self.match("BRANCH")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "BRANCH"



    # $ANTLR start "UNORDERED"
    def mUNORDERED(self, ):

        try:
            _type = UNORDERED
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:16:11: ( 'UNORDERED' )
            # src/Monitor.g:16:13: 'UNORDERED'
            pass 
            self.match("UNORDERED")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "UNORDERED"



    # $ANTLR start "RECLABEL"
    def mRECLABEL(self, ):

        try:
            _type = RECLABEL
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:17:10: ( 'RECLABEL' )
            # src/Monitor.g:17:12: 'RECLABEL'
            pass 
            self.match("RECLABEL")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "RECLABEL"



    # $ANTLR start "PARALLEL"
    def mPARALLEL(self, ):

        try:
            _type = PARALLEL
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:18:10: ( 'PARALLEL' )
            # src/Monitor.g:18:12: 'PARALLEL'
            pass 
            self.match("PARALLEL")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "PARALLEL"



    # $ANTLR start "PROTOCOL"
    def mPROTOCOL(self, ):

        try:
            _type = PROTOCOL
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:19:10: ( 'PROTOCOL' )
            # src/Monitor.g:19:12: 'PROTOCOL'
            pass 
            self.match("PROTOCOL")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "PROTOCOL"



    # $ANTLR start "T__25"
    def mT__25(self, ):

        try:
            _type = T__25
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:20:7: ( 'import' )
            # src/Monitor.g:20:9: 'import'
            pass 
            self.match("import")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__25"



    # $ANTLR start "T__26"
    def mT__26(self, ):

        try:
            _type = T__26
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:21:7: ( 'protocol' )
            # src/Monitor.g:21:9: 'protocol'
            pass 
            self.match("protocol")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__26"



    # $ANTLR start "T__27"
    def mT__27(self, ):

        try:
            _type = T__27
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:22:7: ( ',' )
            # src/Monitor.g:22:9: ','
            pass 
            self.match(44)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__27"



    # $ANTLR start "T__28"
    def mT__28(self, ):

        try:
            _type = T__28
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:23:7: ( ';' )
            # src/Monitor.g:23:9: ';'
            pass 
            self.match(59)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__28"



    # $ANTLR start "T__29"
    def mT__29(self, ):

        try:
            _type = T__29
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:24:7: ( 'from' )
            # src/Monitor.g:24:9: 'from'
            pass 
            self.match("from")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__29"



    # $ANTLR start "T__30"
    def mT__30(self, ):

        try:
            _type = T__30
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:25:7: ( 'as' )
            # src/Monitor.g:25:9: 'as'
            pass 
            self.match("as")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__30"



    # $ANTLR start "T__31"
    def mT__31(self, ):

        try:
            _type = T__31
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:26:7: ( 'at' )
            # src/Monitor.g:26:9: 'at'
            pass 
            self.match("at")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__31"



    # $ANTLR start "T__32"
    def mT__32(self, ):

        try:
            _type = T__32
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:27:7: ( '{' )
            # src/Monitor.g:27:9: '{'
            pass 
            self.match(123)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__32"



    # $ANTLR start "T__33"
    def mT__33(self, ):

        try:
            _type = T__33
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:28:7: ( '}' )
            # src/Monitor.g:28:9: '}'
            pass 
            self.match(125)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__33"



    # $ANTLR start "T__34"
    def mT__34(self, ):

        try:
            _type = T__34
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:29:7: ( '(' )
            # src/Monitor.g:29:9: '('
            pass 
            self.match(40)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__34"



    # $ANTLR start "T__35"
    def mT__35(self, ):

        try:
            _type = T__35
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:30:7: ( ')' )
            # src/Monitor.g:30:9: ')'
            pass 
            self.match(41)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__35"



    # $ANTLR start "T__36"
    def mT__36(self, ):

        try:
            _type = T__36
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:31:7: ( 'role' )
            # src/Monitor.g:31:9: 'role'
            pass 
            self.match("role")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__36"



    # $ANTLR start "T__37"
    def mT__37(self, ):

        try:
            _type = T__37
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:32:7: ( 'introduces' )
            # src/Monitor.g:32:9: 'introduces'
            pass 
            self.match("introduces")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__37"



    # $ANTLR start "T__38"
    def mT__38(self, ):

        try:
            _type = T__38
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:33:7: ( 'to' )
            # src/Monitor.g:33:9: 'to'
            pass 
            self.match("to")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__38"



    # $ANTLR start "T__39"
    def mT__39(self, ):

        try:
            _type = T__39
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:34:7: ( 'choice' )
            # src/Monitor.g:34:9: 'choice'
            pass 
            self.match("choice")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__39"



    # $ANTLR start "T__40"
    def mT__40(self, ):

        try:
            _type = T__40
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:35:7: ( 'or' )
            # src/Monitor.g:35:9: 'or'
            pass 
            self.match("or")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__40"



    # $ANTLR start "T__41"
    def mT__41(self, ):

        try:
            _type = T__41
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:36:7: ( ':' )
            # src/Monitor.g:36:9: ':'
            pass 
            self.match(58)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__41"



    # $ANTLR start "T__42"
    def mT__42(self, ):

        try:
            _type = T__42
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:37:7: ( 'repeat' )
            # src/Monitor.g:37:9: 'repeat'
            pass 
            self.match("repeat")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__42"



    # $ANTLR start "T__43"
    def mT__43(self, ):

        try:
            _type = T__43
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:38:7: ( 'rec' )
            # src/Monitor.g:38:9: 'rec'
            pass 
            self.match("rec")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__43"



    # $ANTLR start "T__44"
    def mT__44(self, ):

        try:
            _type = T__44
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:39:7: ( 'end' )
            # src/Monitor.g:39:9: 'end'
            pass 
            self.match("end")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__44"



    # $ANTLR start "T__45"
    def mT__45(self, ):

        try:
            _type = T__45
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:40:7: ( 'run' )
            # src/Monitor.g:40:9: 'run'
            pass 
            self.match("run")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__45"



    # $ANTLR start "T__46"
    def mT__46(self, ):

        try:
            _type = T__46
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:41:7: ( 'inline' )
            # src/Monitor.g:41:9: 'inline'
            pass 
            self.match("inline")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__46"



    # $ANTLR start "T__47"
    def mT__47(self, ):

        try:
            _type = T__47
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:42:7: ( 'parallel' )
            # src/Monitor.g:42:9: 'parallel'
            pass 
            self.match("parallel")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__47"



    # $ANTLR start "T__48"
    def mT__48(self, ):

        try:
            _type = T__48
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:43:7: ( 'and' )
            # src/Monitor.g:43:9: 'and'
            pass 
            self.match("and")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__48"



    # $ANTLR start "T__49"
    def mT__49(self, ):

        try:
            _type = T__49
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:44:7: ( 'do' )
            # src/Monitor.g:44:9: 'do'
            pass 
            self.match("do")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__49"



    # $ANTLR start "T__50"
    def mT__50(self, ):

        try:
            _type = T__50
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:45:7: ( 'interrupt' )
            # src/Monitor.g:45:9: 'interrupt'
            pass 
            self.match("interrupt")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__50"



    # $ANTLR start "T__51"
    def mT__51(self, ):

        try:
            _type = T__51
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:46:7: ( 'unordered' )
            # src/Monitor.g:46:9: 'unordered'
            pass 
            self.match("unordered")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "T__51"



    # $ANTLR start "ID"
    def mID(self, ):

        try:
            _type = ID
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:137:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            # src/Monitor.g:137:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            pass 
            if (65 <= self.input.LA(1) <= 90) or self.input.LA(1) == 95 or (97 <= self.input.LA(1) <= 122):
                self.input.consume()
            else:
                mse = MismatchedSetException(None, self.input)
                self.recover(mse)
                raise mse

            # src/Monitor.g:137:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            while True: #loop1
                alt1 = 2
                LA1_0 = self.input.LA(1)

                if ((48 <= LA1_0 <= 57) or (65 <= LA1_0 <= 90) or LA1_0 == 95 or (97 <= LA1_0 <= 122)) :
                    alt1 = 1


                if alt1 == 1:
                    # src/Monitor.g:
                    pass 
                    if (48 <= self.input.LA(1) <= 57) or (65 <= self.input.LA(1) <= 90) or self.input.LA(1) == 95 or (97 <= self.input.LA(1) <= 122):
                        self.input.consume()
                    else:
                        mse = MismatchedSetException(None, self.input)
                        self.recover(mse)
                        raise mse



                else:
                    break #loop1



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "ID"



    # $ANTLR start "NUMBER"
    def mNUMBER(self, ):

        try:
            _type = NUMBER
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:139:8: ( ( DIGIT )+ )
            # src/Monitor.g:139:10: ( DIGIT )+
            pass 
            # src/Monitor.g:139:10: ( DIGIT )+
            cnt2 = 0
            while True: #loop2
                alt2 = 2
                LA2_0 = self.input.LA(1)

                if ((48 <= LA2_0 <= 57)) :
                    alt2 = 1


                if alt2 == 1:
                    # src/Monitor.g:139:11: DIGIT
                    pass 
                    self.mDIGIT()


                else:
                    if cnt2 >= 1:
                        break #loop2

                    eee = EarlyExitException(2, self.input)
                    raise eee

                cnt2 += 1



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "NUMBER"



    # $ANTLR start "WHITESPACE"
    def mWHITESPACE(self, ):

        try:
            _type = WHITESPACE
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:141:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            # src/Monitor.g:141:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            pass 
            # src/Monitor.g:141:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            cnt3 = 0
            while True: #loop3
                alt3 = 2
                LA3_0 = self.input.LA(1)

                if ((9 <= LA3_0 <= 10) or (12 <= LA3_0 <= 13) or LA3_0 == 32) :
                    alt3 = 1


                if alt3 == 1:
                    # src/Monitor.g:
                    pass 
                    if (9 <= self.input.LA(1) <= 10) or (12 <= self.input.LA(1) <= 13) or self.input.LA(1) == 32:
                        self.input.consume()
                    else:
                        mse = MismatchedSetException(None, self.input)
                        self.recover(mse)
                        raise mse



                else:
                    if cnt3 >= 1:
                        break #loop3

                    eee = EarlyExitException(3, self.input)
                    raise eee

                cnt3 += 1
            #action start
            _channel = HIDDEN; 
            #action end



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "WHITESPACE"



    # $ANTLR start "DIGIT"
    def mDIGIT(self, ):

        try:
            # src/Monitor.g:143:16: ( '0' .. '9' )
            # src/Monitor.g:143:18: '0' .. '9'
            pass 
            self.matchRange(48, 57)




        finally:

            pass

    # $ANTLR end "DIGIT"



    # $ANTLR start "ANNOTATION"
    def mANNOTATION(self, ):

        try:
            _type = ANNOTATION
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:145:12: ( '[[' ( options {greedy=false; } : . )* ']]' )
            # src/Monitor.g:145:14: '[[' ( options {greedy=false; } : . )* ']]'
            pass 
            self.match("[[")
            # src/Monitor.g:145:19: ( options {greedy=false; } : . )*
            while True: #loop4
                alt4 = 2
                LA4_0 = self.input.LA(1)

                if (LA4_0 == 93) :
                    LA4_1 = self.input.LA(2)

                    if (LA4_1 == 93) :
                        alt4 = 2
                    elif ((0 <= LA4_1 <= 92) or (94 <= LA4_1 <= 65535)) :
                        alt4 = 1


                elif ((0 <= LA4_0 <= 92) or (94 <= LA4_0 <= 65535)) :
                    alt4 = 1


                if alt4 == 1:
                    # src/Monitor.g:145:46: .
                    pass 
                    self.matchAny()


                else:
                    break #loop4
            self.match("]]")



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "ANNOTATION"



    # $ANTLR start "ML_COMMENT"
    def mML_COMMENT(self, ):

        try:
            _type = ML_COMMENT
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:148:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            # src/Monitor.g:148:9: '/*' ( options {greedy=false; } : . )* '*/'
            pass 
            self.match("/*")
            # src/Monitor.g:148:14: ( options {greedy=false; } : . )*
            while True: #loop5
                alt5 = 2
                LA5_0 = self.input.LA(1)

                if (LA5_0 == 42) :
                    LA5_1 = self.input.LA(2)

                    if (LA5_1 == 47) :
                        alt5 = 2
                    elif ((0 <= LA5_1 <= 46) or (48 <= LA5_1 <= 65535)) :
                        alt5 = 1


                elif ((0 <= LA5_0 <= 41) or (43 <= LA5_0 <= 65535)) :
                    alt5 = 1


                if alt5 == 1:
                    # src/Monitor.g:148:41: .
                    pass 
                    self.matchAny()


                else:
                    break #loop5
            self.match("*/")
            #action start
            _channel=HIDDEN;
            #action end



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "ML_COMMENT"



    # $ANTLR start "LINE_COMMENT"
    def mLINE_COMMENT(self, ):

        try:
            _type = LINE_COMMENT
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:151:14: ( '//' ( options {greedy=false; } : . )* '\\n' )
            # src/Monitor.g:151:16: '//' ( options {greedy=false; } : . )* '\\n'
            pass 
            self.match("//")
            # src/Monitor.g:151:21: ( options {greedy=false; } : . )*
            while True: #loop6
                alt6 = 2
                LA6_0 = self.input.LA(1)

                if (LA6_0 == 10) :
                    alt6 = 2
                elif ((0 <= LA6_0 <= 9) or (11 <= LA6_0 <= 65535)) :
                    alt6 = 1


                if alt6 == 1:
                    # src/Monitor.g:151:48: .
                    pass 
                    self.matchAny()


                else:
                    break #loop6
            self.match(10)
            #action start
            _channel=HIDDEN;
            #action end



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "LINE_COMMENT"



    # $ANTLR start "StringLiteral"
    def mStringLiteral(self, ):

        try:
            _type = StringLiteral
            _channel = DEFAULT_CHANNEL

            # src/Monitor.g:153:14: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            # src/Monitor.g:153:16: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            pass 
            self.match(34)
            # src/Monitor.g:153:20: (~ ( '\\\\' | '\"' ) )*
            while True: #loop7
                alt7 = 2
                LA7_0 = self.input.LA(1)

                if ((0 <= LA7_0 <= 33) or (35 <= LA7_0 <= 91) or (93 <= LA7_0 <= 65535)) :
                    alt7 = 1


                if alt7 == 1:
                    # src/Monitor.g:153:22: ~ ( '\\\\' | '\"' )
                    pass 
                    if (0 <= self.input.LA(1) <= 33) or (35 <= self.input.LA(1) <= 91) or (93 <= self.input.LA(1) <= 65535):
                        self.input.consume()
                    else:
                        mse = MismatchedSetException(None, self.input)
                        self.recover(mse)
                        raise mse



                else:
                    break #loop7
            self.match(34)



            self._state.type = _type
            self._state.channel = _channel

        finally:

            pass

    # $ANTLR end "StringLiteral"



    def mTokens(self):
        # src/Monitor.g:1:8: ( INTERACTION | PLUS | MINUS | MULT | DIV | FULLSTOP | RESV | SEND | BRANCH | UNORDERED | RECLABEL | PARALLEL | PROTOCOL | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | ID | NUMBER | WHITESPACE | ANNOTATION | ML_COMMENT | LINE_COMMENT | StringLiteral )
        alt8 = 47
        alt8 = self.dfa8.predict(self.input)
        if alt8 == 1:
            # src/Monitor.g:1:10: INTERACTION
            pass 
            self.mINTERACTION()


        elif alt8 == 2:
            # src/Monitor.g:1:22: PLUS
            pass 
            self.mPLUS()


        elif alt8 == 3:
            # src/Monitor.g:1:27: MINUS
            pass 
            self.mMINUS()


        elif alt8 == 4:
            # src/Monitor.g:1:33: MULT
            pass 
            self.mMULT()


        elif alt8 == 5:
            # src/Monitor.g:1:38: DIV
            pass 
            self.mDIV()


        elif alt8 == 6:
            # src/Monitor.g:1:42: FULLSTOP
            pass 
            self.mFULLSTOP()


        elif alt8 == 7:
            # src/Monitor.g:1:51: RESV
            pass 
            self.mRESV()


        elif alt8 == 8:
            # src/Monitor.g:1:56: SEND
            pass 
            self.mSEND()


        elif alt8 == 9:
            # src/Monitor.g:1:61: BRANCH
            pass 
            self.mBRANCH()


        elif alt8 == 10:
            # src/Monitor.g:1:68: UNORDERED
            pass 
            self.mUNORDERED()


        elif alt8 == 11:
            # src/Monitor.g:1:78: RECLABEL
            pass 
            self.mRECLABEL()


        elif alt8 == 12:
            # src/Monitor.g:1:87: PARALLEL
            pass 
            self.mPARALLEL()


        elif alt8 == 13:
            # src/Monitor.g:1:96: PROTOCOL
            pass 
            self.mPROTOCOL()


        elif alt8 == 14:
            # src/Monitor.g:1:105: T__25
            pass 
            self.mT__25()


        elif alt8 == 15:
            # src/Monitor.g:1:111: T__26
            pass 
            self.mT__26()


        elif alt8 == 16:
            # src/Monitor.g:1:117: T__27
            pass 
            self.mT__27()


        elif alt8 == 17:
            # src/Monitor.g:1:123: T__28
            pass 
            self.mT__28()


        elif alt8 == 18:
            # src/Monitor.g:1:129: T__29
            pass 
            self.mT__29()


        elif alt8 == 19:
            # src/Monitor.g:1:135: T__30
            pass 
            self.mT__30()


        elif alt8 == 20:
            # src/Monitor.g:1:141: T__31
            pass 
            self.mT__31()


        elif alt8 == 21:
            # src/Monitor.g:1:147: T__32
            pass 
            self.mT__32()


        elif alt8 == 22:
            # src/Monitor.g:1:153: T__33
            pass 
            self.mT__33()


        elif alt8 == 23:
            # src/Monitor.g:1:159: T__34
            pass 
            self.mT__34()


        elif alt8 == 24:
            # src/Monitor.g:1:165: T__35
            pass 
            self.mT__35()


        elif alt8 == 25:
            # src/Monitor.g:1:171: T__36
            pass 
            self.mT__36()


        elif alt8 == 26:
            # src/Monitor.g:1:177: T__37
            pass 
            self.mT__37()


        elif alt8 == 27:
            # src/Monitor.g:1:183: T__38
            pass 
            self.mT__38()


        elif alt8 == 28:
            # src/Monitor.g:1:189: T__39
            pass 
            self.mT__39()


        elif alt8 == 29:
            # src/Monitor.g:1:195: T__40
            pass 
            self.mT__40()


        elif alt8 == 30:
            # src/Monitor.g:1:201: T__41
            pass 
            self.mT__41()


        elif alt8 == 31:
            # src/Monitor.g:1:207: T__42
            pass 
            self.mT__42()


        elif alt8 == 32:
            # src/Monitor.g:1:213: T__43
            pass 
            self.mT__43()


        elif alt8 == 33:
            # src/Monitor.g:1:219: T__44
            pass 
            self.mT__44()


        elif alt8 == 34:
            # src/Monitor.g:1:225: T__45
            pass 
            self.mT__45()


        elif alt8 == 35:
            # src/Monitor.g:1:231: T__46
            pass 
            self.mT__46()


        elif alt8 == 36:
            # src/Monitor.g:1:237: T__47
            pass 
            self.mT__47()


        elif alt8 == 37:
            # src/Monitor.g:1:243: T__48
            pass 
            self.mT__48()


        elif alt8 == 38:
            # src/Monitor.g:1:249: T__49
            pass 
            self.mT__49()


        elif alt8 == 39:
            # src/Monitor.g:1:255: T__50
            pass 
            self.mT__50()


        elif alt8 == 40:
            # src/Monitor.g:1:261: T__51
            pass 
            self.mT__51()


        elif alt8 == 41:
            # src/Monitor.g:1:267: ID
            pass 
            self.mID()


        elif alt8 == 42:
            # src/Monitor.g:1:270: NUMBER
            pass 
            self.mNUMBER()


        elif alt8 == 43:
            # src/Monitor.g:1:277: WHITESPACE
            pass 
            self.mWHITESPACE()


        elif alt8 == 44:
            # src/Monitor.g:1:288: ANNOTATION
            pass 
            self.mANNOTATION()


        elif alt8 == 45:
            # src/Monitor.g:1:299: ML_COMMENT
            pass 
            self.mML_COMMENT()


        elif alt8 == 46:
            # src/Monitor.g:1:310: LINE_COMMENT
            pass 
            self.mLINE_COMMENT()


        elif alt8 == 47:
            # src/Monitor.g:1:323: StringLiteral
            pass 
            self.mStringLiteral()







    # lookup tables for DFA #8

    DFA8_eot = DFA.unpack(
        u"\1\uffff\1\35\3\uffff\1\46\1\uffff\6\35\2\uffff\2\35\4\uffff\4"
        u"\35\1\uffff\3\35\5\uffff\2\35\3\uffff\11\35\1\111\1\112\4\35\1"
        u"\120\1\35\1\122\1\35\1\124\16\35\2\uffff\1\144\2\35\1\147\1\150"
        u"\1\uffff\1\35\1\uffff\1\152\1\uffff\5\35\1\160\1\35\1\162\6\35"
        u"\1\171\1\uffff\1\172\1\35\2\uffff\1\35\1\uffff\5\35\1\uffff\1\35"
        u"\1\uffff\6\35\2\uffff\6\35\1\u0090\1\u0091\1\35\1\u0093\5\35\1"
        u"\u0099\1\u009a\4\35\2\uffff\1\35\1\uffff\5\35\2\uffff\4\35\1\u00a9"
        u"\1\35\1\u00ab\1\u00ac\1\u00ad\1\u00ae\2\35\1\u00b1\1\35\1\uffff"
        u"\1\u00b3\4\uffff\1\u00b4\1\35\1\uffff\1\u00b6\2\uffff\1\u00b7\2"
        u"\uffff"
        )

    DFA8_eof = DFA.unpack(
        u"\u00b8\uffff"
        )

    DFA8_min = DFA.unpack(
        u"\1\11\1\155\3\uffff\1\52\1\uffff\2\105\1\122\1\116\1\101\1\141"
        u"\2\uffff\1\162\1\156\4\uffff\1\145\1\157\1\150\1\162\1\uffff\1"
        u"\156\1\157\1\156\5\uffff\1\154\1\160\3\uffff\1\103\1\116\1\101"
        u"\1\117\1\122\1\117\1\157\1\162\1\157\2\60\1\144\1\154\1\143\1\156"
        u"\1\60\1\157\1\60\1\144\1\60\1\157\1\145\1\151\1\157\1\126\1\114"
        u"\1\104\1\116\1\122\1\101\1\124\1\164\1\141\1\155\2\uffff\1\60\2"
        u"\145\2\60\1\uffff\1\151\1\uffff\1\60\1\uffff\2\162\1\157\1\156"
        u"\1\162\1\60\1\101\1\60\1\103\1\104\1\114\1\117\1\157\1\154\1\60"
        u"\1\uffff\1\60\1\141\2\uffff\1\143\1\uffff\1\144\1\141\1\144\1\145"
        u"\1\164\1\uffff\1\102\1\uffff\1\110\1\105\1\114\1\103\1\143\1\154"
        u"\2\uffff\1\164\2\145\1\143\2\165\2\60\1\105\1\60\1\122\1\105\1"
        u"\117\1\157\1\145\2\60\1\162\1\164\1\160\1\143\2\uffff\1\114\1\uffff"
        u"\1\105\2\114\2\154\2\uffff\1\145\1\151\1\164\1\145\1\60\1\104\4"
        u"\60\1\144\1\157\1\60\1\163\1\uffff\1\60\4\uffff\1\60\1\156\1\uffff"
        u"\1\60\2\uffff\1\60\2\uffff"
        )

    DFA8_max = DFA.unpack(
        u"\1\175\1\156\3\uffff\1\57\1\uffff\2\105\1\122\1\116\1\122\1\162"
        u"\2\uffff\1\162\1\164\4\uffff\1\165\1\157\1\150\1\162\1\uffff\1"
        u"\156\1\157\1\156\5\uffff\1\164\1\160\3\uffff\1\123\1\116\1\101"
        u"\1\117\1\122\1\117\1\157\1\162\1\157\2\172\1\144\1\154\1\160\1"
        u"\156\1\172\1\157\1\172\1\144\1\172\1\157\1\162\1\151\1\157\1\126"
        u"\1\114\1\104\1\116\1\122\1\101\1\124\1\164\1\141\1\155\2\uffff"
        u"\1\172\2\145\2\172\1\uffff\1\151\1\uffff\1\172\1\uffff\2\162\1"
        u"\157\1\156\1\162\1\172\1\101\1\172\1\103\1\104\1\114\1\117\1\157"
        u"\1\154\1\172\1\uffff\1\172\1\141\2\uffff\1\143\1\uffff\1\144\1"
        u"\162\1\144\1\145\1\164\1\uffff\1\102\1\uffff\1\110\1\105\1\114"
        u"\1\103\1\143\1\154\2\uffff\1\164\2\145\1\143\2\165\2\172\1\105"
        u"\1\172\1\122\1\105\1\117\1\157\1\145\2\172\1\162\1\164\1\160\1"
        u"\143\2\uffff\1\114\1\uffff\1\105\2\114\2\154\2\uffff\1\145\1\151"
        u"\1\164\1\145\1\172\1\104\4\172\1\144\1\157\1\172\1\163\1\uffff"
        u"\1\172\4\uffff\1\172\1\156\1\uffff\1\172\2\uffff\1\172\2\uffff"
        )

    DFA8_accept = DFA.unpack(
        u"\2\uffff\1\2\1\3\1\4\1\uffff\1\6\6\uffff\1\20\1\21\2\uffff\1\25"
        u"\1\26\1\27\1\30\4\uffff\1\36\3\uffff\1\51\1\52\1\53\1\54\1\57\2"
        u"\uffff\1\55\1\56\1\5\42\uffff\1\23\1\24\5\uffff\1\33\1\uffff\1"
        u"\35\1\uffff\1\46\17\uffff\1\45\2\uffff\1\40\1\42\1\uffff\1\41\5"
        u"\uffff\1\7\1\uffff\1\10\6\uffff\1\22\1\31\25\uffff\1\43\1\16\1"
        u"\uffff\1\11\5\uffff\1\37\1\34\16\uffff\1\13\1\uffff\1\14\1\15\1"
        u"\17\1\44\2\uffff\1\47\1\uffff\1\12\1\50\1\uffff\1\32\1\1"
        )

    DFA8_special = DFA.unpack(
        u"\u00b8\uffff"
        )

            
    DFA8_transition = [
        DFA.unpack(u"\2\37\1\uffff\2\37\22\uffff\1\37\1\uffff\1\41\5\uffff"
        u"\1\23\1\24\1\4\1\2\1\15\1\3\1\6\1\5\12\36\1\31\1\16\5\uffff\1\35"
        u"\1\11\15\35\1\13\1\35\1\7\1\10\1\35\1\12\5\35\1\40\3\uffff\1\35"
        u"\1\uffff\1\20\1\35\1\27\1\33\1\32\1\17\2\35\1\1\5\35\1\30\1\14"
        u"\1\35\1\25\1\35\1\26\1\34\5\35\1\21\1\uffff\1\22"),
        DFA.unpack(u"\1\43\1\42"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\1\44\4\uffff\1\45"),
        DFA.unpack(u""),
        DFA.unpack(u"\1\47"),
        DFA.unpack(u"\1\50"),
        DFA.unpack(u"\1\51"),
        DFA.unpack(u"\1\52"),
        DFA.unpack(u"\1\53\20\uffff\1\54"),
        DFA.unpack(u"\1\56\20\uffff\1\55"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\1\57"),
        DFA.unpack(u"\1\62\4\uffff\1\60\1\61"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\1\64\11\uffff\1\63\5\uffff\1\65"),
        DFA.unpack(u"\1\66"),
        DFA.unpack(u"\1\67"),
        DFA.unpack(u"\1\70"),
        DFA.unpack(u""),
        DFA.unpack(u"\1\71"),
        DFA.unpack(u"\1\72"),
        DFA.unpack(u"\1\73"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\1\75\7\uffff\1\74"),
        DFA.unpack(u"\1\76"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\1\100\17\uffff\1\77"),
        DFA.unpack(u"\1\101"),
        DFA.unpack(u"\1\102"),
        DFA.unpack(u"\1\103"),
        DFA.unpack(u"\1\104"),
        DFA.unpack(u"\1\105"),
        DFA.unpack(u"\1\106"),
        DFA.unpack(u"\1\107"),
        DFA.unpack(u"\1\110"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\113"),
        DFA.unpack(u"\1\114"),
        DFA.unpack(u"\1\116\14\uffff\1\115"),
        DFA.unpack(u"\1\117"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\121"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\123"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\125"),
        DFA.unpack(u"\1\126\14\uffff\1\127"),
        DFA.unpack(u"\1\130"),
        DFA.unpack(u"\1\131"),
        DFA.unpack(u"\1\132"),
        DFA.unpack(u"\1\133"),
        DFA.unpack(u"\1\134"),
        DFA.unpack(u"\1\135"),
        DFA.unpack(u"\1\136"),
        DFA.unpack(u"\1\137"),
        DFA.unpack(u"\1\140"),
        DFA.unpack(u"\1\141"),
        DFA.unpack(u"\1\142"),
        DFA.unpack(u"\1\143"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\145"),
        DFA.unpack(u"\1\146"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u""),
        DFA.unpack(u"\1\151"),
        DFA.unpack(u""),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u""),
        DFA.unpack(u"\1\153"),
        DFA.unpack(u"\1\154"),
        DFA.unpack(u"\1\155"),
        DFA.unpack(u"\1\156"),
        DFA.unpack(u"\1\157"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\161"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\163"),
        DFA.unpack(u"\1\164"),
        DFA.unpack(u"\1\165"),
        DFA.unpack(u"\1\166"),
        DFA.unpack(u"\1\167"),
        DFA.unpack(u"\1\170"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u""),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\173"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\1\174"),
        DFA.unpack(u""),
        DFA.unpack(u"\1\175"),
        DFA.unpack(u"\1\176\20\uffff\1\177"),
        DFA.unpack(u"\1\u0080"),
        DFA.unpack(u"\1\u0081"),
        DFA.unpack(u"\1\u0082"),
        DFA.unpack(u""),
        DFA.unpack(u"\1\u0083"),
        DFA.unpack(u""),
        DFA.unpack(u"\1\u0084"),
        DFA.unpack(u"\1\u0085"),
        DFA.unpack(u"\1\u0086"),
        DFA.unpack(u"\1\u0087"),
        DFA.unpack(u"\1\u0088"),
        DFA.unpack(u"\1\u0089"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\1\u008a"),
        DFA.unpack(u"\1\u008b"),
        DFA.unpack(u"\1\u008c"),
        DFA.unpack(u"\1\u008d"),
        DFA.unpack(u"\1\u008e"),
        DFA.unpack(u"\1\u008f"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\u0092"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\u0094"),
        DFA.unpack(u"\1\u0095"),
        DFA.unpack(u"\1\u0096"),
        DFA.unpack(u"\1\u0097"),
        DFA.unpack(u"\1\u0098"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\u009b"),
        DFA.unpack(u"\1\u009c"),
        DFA.unpack(u"\1\u009d"),
        DFA.unpack(u"\1\u009e"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\1\u009f"),
        DFA.unpack(u""),
        DFA.unpack(u"\1\u00a0"),
        DFA.unpack(u"\1\u00a1"),
        DFA.unpack(u"\1\u00a2"),
        DFA.unpack(u"\1\u00a3"),
        DFA.unpack(u"\1\u00a4"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\1\u00a5"),
        DFA.unpack(u"\1\u00a6"),
        DFA.unpack(u"\1\u00a7"),
        DFA.unpack(u"\1\u00a8"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\u00aa"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\u00af"),
        DFA.unpack(u"\1\u00b0"),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\u00b2"),
        DFA.unpack(u""),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u"\1\u00b5"),
        DFA.unpack(u""),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u""),
        DFA.unpack(u""),
        DFA.unpack(u"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35"),
        DFA.unpack(u""),
        DFA.unpack(u"")
    ]

    # class definition for DFA #8

    class DFA8(DFA):
        pass


 



def main(argv, stdin=sys.stdin, stdout=sys.stdout, stderr=sys.stderr):
    from antlr3.main import LexerMain
    main = LexerMain(MonitorLexer)
    main.stdin = stdin
    main.stdout = stdout
    main.stderr = stderr
    main.execute(argv)


if __name__ == '__main__':
    main(sys.argv)
