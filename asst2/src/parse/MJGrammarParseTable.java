package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
import
syntaxtree
.
*
;
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 129; }
public int getNttSym() { return 130; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<class decl>",
"`class",
"ID",
"`{",
"<decl in class>*",
"`}",
"<decl in class>",
"<method decl>",
"`public",
"`void",
"`(",
"`)",
"<stmt>*",
"<type>",
"`int",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"<exp>",
"`=",
"<exp8>",
"`||",
"<exp7>",
"`&&",
"<exp6>",
"`!=",
"<exp5>",
"`==",
"`>",
"<exp4>",
"`<",
"`>=",
"`<=",
"`instanceof",
"`+",
"<exp3>",
"`-",
"`*",
"<exp2>",
"`/",
"`%",
"<cast exp>",
"<unary exp>",
"<exp1>",
"`!",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"`null",
"`true",
"`false",
"`this",
"letter",
"\"a\"",
"\"p\"",
"\"v\"",
"\"c\"",
"\"f\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"{\"A\"..\"Z\" \"d\"..\"e\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"s\" \"w\"..\"z\"}",
"\"b\"",
"\"h\"",
"\"n\"",
"\"t\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"any",
"\"[\"",
"\"-\"",
"\"<\"",
"{0..9 11..31 \"$\" \",\" \".\" \":\" \"?\" \"\\\" \"^\" \"`\" \"~\"..127}",
"\"|\"",
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\"]\"",
"\"/\"",
"\";\"",
"\">\"",
"\"{\"",
"\"%\"",
"\"(\"",
"\"+\"",
"\"_\"",
"\"=\"",
"\"@\"",
"10",
"\"}\"",
"\"!\"",
"\"\'\"",
"\'\"\'",
"\"*\"",
"any128",
"{223}",
"{128..175 186..192 219..222 224 251..255}",
"ws",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"any*",
"$$3",
"idChar",
"idChar128",
"hexDigit",
"hexDigit128",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 131;}
private static final int MIN_REDUCTION = 366;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+0;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
1,285, // <start>
2,353, // ws*
3,237, // <program>
4,113, // <class decl>+
5,266, // <class decl>
6,33, // `class
92,105, // " "
93,271, // "#"
107,7, // {10}
116,101, // ws
  }
,
{ // state 1
  }
,
{ // state 2
7,248, // ID
21,111, // <empty bracket pair>
22,26, // `[
62,277, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,311, // letter128
79,209, // {199..218 231..250}
80,209, // {193..198 225..230}
87,244, // "["
  }
,
{ // state 3
2,134, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 4
91,303, // "|"
94,230, // "&"
  }
,
{ // state 5
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 6
92,105, // " "
107,7, // {10}
116,50, // ws
130,MIN_REDUCTION+114, // $NT
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 7
130,MIN_REDUCTION+65, // $NT
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 8
22,MIN_REDUCTION+55, // `[
87,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 9
0x80000000|333, // match move
0x80000000|155, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 10
7,321, // ID
62,277, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,311, // letter128
79,209, // {199..218 231..250}
80,209, // {193..198 225..230}
  }
,
{ // state 11
0x80000000|1, // match move
0x80000000|291, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 13
0x80000000|1, // match move
0x80000000|149, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 14
68,324, // "i"
74,88, // "b"
  }
,
{ // state 15
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 17
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 18
63,53, // "a"
64,53, // "p"
65,53, // "v"
66,53, // "c"
67,53, // "f"
68,53, // "i"
69,53, // "l"
70,53, // "o"
71,53, // "r"
72,53, // "u"
73,53, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,53, // "b"
75,53, // "h"
76,53, // "n"
77,53, // "t"
79,361, // {199..218 231..250}
80,361, // {193..198 225..230}
82,53, // {"1".."9"}
83,53, // "0"
85,361, // {176..185}
86,5, // any
87,53, // "["
88,53, // "-"
89,53, // "<"
90,53, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "~"..127}
91,53, // "|"
92,53, // " "
93,53, // "#"
94,53, // "&"
95,53, // ")"
96,53, // "]"
97,53, // "/"
98,53, // ";"
99,53, // ">"
100,53, // "{"
101,53, // "%"
102,53, // "("
103,53, // "+"
104,53, // "_"
105,53, // "="
106,53, // "@"
107,53, // {10}
108,53, // "}"
109,53, // "!"
110,53, // "'"
111,53, // '"'
112,53, // "*"
113,322, // any128
114,361, // {223}
115,361, // {128..175 186..192 219..222 224 251..255}
124,346, // $$3
  }
,
{ // state 19
22,MIN_REDUCTION+143, // `[
87,MIN_REDUCTION+143, // "["
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 20
22,MIN_REDUCTION+64, // `[
87,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 21
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 22
2,227, // ws*
22,MIN_REDUCTION+75, // `[
87,MIN_REDUCTION+75, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 23
38,146, // `>
40,66, // `<
41,147, // `>=
42,24, // `<=
43,10, // `instanceof
89,156, // "<"
93,133, // "#"
99,273, // ">"
106,169, // "@"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 24
7,42, // ID
15,290, // `(
39,84, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 25
16,354, // `)
21,111, // <empty bracket pair>
22,26, // `[
87,244, // "["
95,330, // ")"
  }
,
{ // state 26
23,142, // `]
96,184, // "]"
  }
,
{ // state 27
22,MIN_REDUCTION+169, // `[
87,MIN_REDUCTION+169, // "["
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 28
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 29
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 30
0x80000000|306, // match move
0x80000000|139, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 31
22,MIN_REDUCTION+134, // `[
87,MIN_REDUCTION+134, // "["
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 32
0x80000000|1, // match move
0x80000000|19, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 33
7,51, // ID
62,277, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,311, // letter128
79,209, // {199..218 231..250}
80,209, // {193..198 225..230}
  }
,
{ // state 34
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 35
2,167, // ws*
  }
,
{ // state 36
22,MIN_REDUCTION+62, // `[
87,MIN_REDUCTION+62, // "["
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 37
0x80000000|1, // match move
0x80000000|279, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 39
0x80000000|1, // match move
0x80000000|109, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 40
0x80000000|201, // match move
0x80000000|228, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 41
29,190, // `=
105,122, // "="
  }
,
{ // state 42
0x80000000|1, // match move
0x80000000|356, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
8,192, // `{
100,54, // "{"
  }
,
{ // state 44
2,240, // ws*
  }
,
{ // state 45
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 46
47,69, // `*
49,76, // `/
50,360, // `%
97,207, // "/"
101,335, // "%"
112,3, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 47
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 48
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 49
47,69, // `*
49,76, // `/
50,360, // `%
97,207, // "/"
101,335, // "%"
112,3, // "*"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 50
130,MIN_REDUCTION+168, // $NT
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 51
8,270, // `{
100,54, // "{"
  }
,
{ // state 52
0x80000000|1, // match move
0x80000000|276, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 53
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 54
2,340, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 55
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 56
7,42, // ID
15,290, // `(
34,238, // <exp6>
36,225, // <exp5>
39,116, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 57
0x80000000|212, // match move
0x80000000|206, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 58
0x80000000|326, // match move
0x80000000|239, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 59
63,53, // "a"
64,53, // "p"
65,53, // "v"
66,53, // "c"
67,53, // "f"
68,53, // "i"
69,53, // "l"
70,53, // "o"
71,53, // "r"
72,53, // "u"
73,53, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,53, // "b"
75,53, // "h"
76,53, // "n"
77,53, // "t"
79,361, // {199..218 231..250}
80,361, // {193..198 225..230}
82,53, // {"1".."9"}
83,53, // "0"
85,361, // {176..185}
86,287, // any
87,53, // "["
88,53, // "-"
89,53, // "<"
90,53, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "~"..127}
91,53, // "|"
92,53, // " "
93,53, // "#"
94,53, // "&"
95,53, // ")"
96,53, // "]"
97,53, // "/"
98,53, // ";"
99,53, // ">"
100,53, // "{"
101,53, // "%"
102,53, // "("
103,53, // "+"
104,53, // "_"
105,53, // "="
106,53, // "@"
107,53, // {10}
108,53, // "}"
109,53, // "!"
110,53, // "'"
111,53, // '"'
112,53, // "*"
113,322, // any128
114,361, // {223}
115,361, // {128..175 186..192 219..222 224 251..255}
123,18, // any*
124,32, // $$3
  }
,
{ // state 60
0x80000000|264, // match move
0x80000000|132, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 61
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 62
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 63
7,42, // ID
44,63, // `+
46,218, // `-
52,135, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 64
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 65
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 66
7,42, // ID
15,290, // `(
39,300, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 67
0x80000000|299, // match move
0x80000000|20, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 68
0x80000000|327, // match move
0x80000000|22, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 69
7,42, // ID
15,290, // `(
44,63, // `+
46,218, // `-
48,115, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 70
22,MIN_REDUCTION+140, // `[
87,MIN_REDUCTION+140, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 72
16,43, // `)
95,330, // ")"
  }
,
{ // state 73
2,307, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 75
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 76
7,42, // ID
15,290, // `(
44,63, // `+
46,218, // `-
48,16, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 77
2,104, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 78
0x80000000|272, // match move
0x80000000|97, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 79
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 80
7,42, // ID
15,290, // `(
28,28, // <exp>
30,359, // <exp8>
32,226, // <exp7>
34,337, // <exp6>
36,225, // <exp5>
39,116, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 81
0x80000000|313, // match move
0x80000000|128, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 82
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 83
22,MIN_REDUCTION+139, // `[
87,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 84
44,223, // `+
46,161, // `-
88,305, // "-"
103,150, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 85
22,141, // `[
87,244, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 86
2,52, // ws*
  }
,
{ // state 87
72,325, // "u"
  }
,
{ // state 88
70,77, // "o"
  }
,
{ // state 89
22,MIN_REDUCTION+114, // `[
87,MIN_REDUCTION+114, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 90
0x80000000|1, // match move
0x80000000|208, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 91
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 93
0x80000000|288, // match move
0x80000000|118, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 94
0x80000000|1, // match move
0x80000000|319, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 95
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 96
15,72, // `(
102,73, // "("
  }
,
{ // state 97
2,301, // ws*
22,MIN_REDUCTION+115, // `[
87,MIN_REDUCTION+115, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 98
67,171, // "f"
68,324, // "i"
74,88, // "b"
76,87, // "n"
77,229, // "t"
  }
,
{ // state 99
7,42, // ID
15,290, // `(
32,339, // <exp7>
34,337, // <exp6>
36,225, // <exp5>
39,116, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 100
0x80000000|1, // match move
0x80000000|349, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 101
130,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 102
22,141, // `[
87,244, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 103
22,MIN_REDUCTION+78, // `[
87,MIN_REDUCTION+78, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 104
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 105
130,MIN_REDUCTION+64, // $NT
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 106
2,11, // ws*
  }
,
{ // state 107
62,233, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,243, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
81,289, // digit
82,332, // {"1".."9"}
83,332, // "0"
84,215, // digit128
85,58, // {176..185}
104,12, // "_"
114,81, // {223}
118,202, // $$0
125,357, // idChar
126,30, // idChar128
  }
,
{ // state 108
2,57, // ws*
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 109
22,MIN_REDUCTION+135, // `[
87,MIN_REDUCTION+135, // "["
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 110
76,196, // "n"
  }
,
{ // state 111
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 113
5,323, // <class decl>
6,33, // `class
93,271, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 116
44,223, // `+
46,161, // `-
88,305, // "-"
103,150, // "+"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 117
0x80000000|44, // match move
0x80000000|204, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 118
22,MIN_REDUCTION+170, // `[
87,MIN_REDUCTION+170, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 119
0x80000000|314, // match move
0x80000000|36, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 120
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 121
2,144, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 122
2,217, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 124
0x80000000|1, // match move
0x80000000|31, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 125
2,138, // ws*
22,MIN_REDUCTION+79, // `[
87,MIN_REDUCTION+79, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 126
2,52, // ws*
22,MIN_REDUCTION+137, // `[
87,MIN_REDUCTION+137, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 127
22,MIN_REDUCTION+153, // `[
87,MIN_REDUCTION+153, // "["
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 128
22,MIN_REDUCTION+151, // `[
87,MIN_REDUCTION+151, // "["
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 129
63,119, // "a"
64,119, // "p"
65,119, // "v"
66,119, // "c"
67,119, // "f"
68,119, // "i"
69,119, // "l"
70,119, // "o"
71,119, // "r"
72,119, // "u"
73,119, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,119, // "b"
75,119, // "h"
76,119, // "n"
77,119, // "t"
82,119, // {"1".."9"}
83,119, // "0"
86,168, // any
87,119, // "["
88,119, // "-"
89,119, // "<"
90,119, // {0..9 11..31 "$" "," "." ":" "?" "\" "^" "`" "~"..127}
91,119, // "|"
92,119, // " "
93,119, // "#"
94,119, // "&"
95,119, // ")"
96,119, // "]"
97,119, // "/"
98,119, // ";"
99,119, // ">"
100,119, // "{"
101,119, // "%"
102,119, // "("
103,119, // "+"
104,119, // "_"
105,119, // "="
106,119, // "@"
107,119, // {10}
108,119, // "}"
109,119, // "!"
110,119, // "'"
111,119, // '"'
112,119, // "*"
  }
,
{ // state 130
22,MIN_REDUCTION+150, // `[
87,MIN_REDUCTION+150, // "["
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 131
0x80000000|1, // match move
0x80000000|70, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 132
22,MIN_REDUCTION+65, // `[
87,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 133
68,110, // "i"
  }
,
{ // state 134
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 137
0x80000000|1, // match move
0x80000000|200, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 138
0x80000000|1, // match move
0x80000000|103, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 139
2,93, // ws*
22,MIN_REDUCTION+171, // `[
87,MIN_REDUCTION+171, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 140
2,11, // ws*
22,MIN_REDUCTION+173, // `[
87,MIN_REDUCTION+173, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 141
7,42, // ID
15,290, // `(
28,197, // <exp>
30,359, // <exp8>
32,226, // <exp7>
34,337, // <exp6>
36,225, // <exp5>
39,116, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 142
130,MIN_REDUCTION+13, // $NT
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 143
2,57, // ws*
22,MIN_REDUCTION+131, // `[
87,MIN_REDUCTION+131, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 144
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 146
7,42, // ID
15,290, // `(
39,216, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 147
7,42, // ID
15,290, // `(
39,343, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 148
2,362, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 149
22,MIN_REDUCTION+80, // `[
87,MIN_REDUCTION+80, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 150
2,172, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 152
62,233, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,260, // letter128
79,209, // {199..218 231..250}
80,209, // {193..198 225..230}
81,289, // digit
82,332, // {"1".."9"}
83,332, // "0"
84,136, // digit128
85,191, // {176..185}
104,12, // "_"
114,296, // {223}
118,91, // $$0
125,357, // idChar
126,148, // idChar128
  }
,
{ // state 153
62,233, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,243, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
81,289, // digit
82,332, // {"1".."9"}
83,332, // "0"
84,215, // digit128
85,58, // {176..185}
104,12, // "_"
114,81, // {223}
117,107, // idChar*
118,269, // $$0
125,123, // idChar
126,30, // idChar128
  }
,
{ // state 154
10,92, // `}
11,329, // <decl in class>
12,295, // <method decl>
13,180, // `public
93,247, // "#"
108,246, // "}"
  }
,
{ // state 155
2,131, // ws*
22,MIN_REDUCTION+141, // `[
87,MIN_REDUCTION+141, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 156
2,174, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 157
26,45, // `;
98,178, // ";"
  }
,
{ // state 158
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 159
0x80000000|163, // match move
0x80000000|127, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 160
81,79, // digit
82,332, // {"1".."9"}
83,332, // "0"
84,165, // digit128
85,58, // {176..185}
120,124, // $$1
  }
,
{ // state 161
7,42, // ID
15,290, // `(
44,63, // `+
45,342, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 162
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 165
0x80000000|106, // match move
0x80000000|140, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 166
2,188, // ws*
  }
,
{ // state 167
0x80000000|1, // match move
0x80000000|213, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 168
0x80000000|250, // match move
0x80000000|294, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 169
89,203, // "<"
91,303, // "|"
94,230, // "&"
99,297, // ">"
105,222, // "="
109,121, // "!"
  }
,
{ // state 170
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 171
63,117, // "a"
  }
,
{ // state 172
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 173
65,199, // "v"
  }
,
{ // state 174
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 175
22,26, // `[
87,244, // "["
  }
,
{ // state 176
0x80000000|86, // match move
0x80000000|126, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 177
2,13, // ws*
22,MIN_REDUCTION+81, // `[
87,MIN_REDUCTION+81, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 178
2,179, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 179
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 180
14,232, // `void
93,173, // "#"
  }
,
{ // state 181
111,9, // '"'
  }
,
{ // state 182
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 183
0x80000000|350, // match move
0x80000000|195, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 184
2,6, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
130,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 185
2,48, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 186
7,42, // ID
15,290, // `(
36,23, // <exp5>
39,116, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 187
22,MIN_REDUCTION+54, // `[
87,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 188
0x80000000|1, // match move
0x80000000|256, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 189
2,182, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 190
7,42, // ID
15,290, // `(
28,348, // <exp>
30,359, // <exp8>
32,226, // <exp7>
34,337, // <exp6>
36,225, // <exp5>
39,116, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 191
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 192
7,183, // ID
8,198, // `{
10,275, // `}
15,290, // `(
17,316, // <stmt>*
18,2, // <type>
19,245, // `int
20,145, // `boolean
24,221, // <stmt>
25,157, // <assign>
27,284, // <local var decl>
28,41, // <exp>
30,359, // <exp8>
32,226, // <exp7>
34,337, // <exp6>
36,225, // <exp5>
39,116, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,98, // "#"
100,54, // "{"
102,73, // "("
103,150, // "+"
106,181, // "@"
108,246, // "}"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 193
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 194
22,MIN_REDUCTION+133, // `[
87,MIN_REDUCTION+133, // "["
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 195
7,MIN_REDUCTION+11, // ID
22,MIN_REDUCTION+49, // `[
63,MIN_REDUCTION+11, // "a"
64,MIN_REDUCTION+11, // "p"
65,MIN_REDUCTION+11, // "v"
66,MIN_REDUCTION+11, // "c"
67,MIN_REDUCTION+11, // "f"
68,MIN_REDUCTION+11, // "i"
69,MIN_REDUCTION+11, // "l"
70,MIN_REDUCTION+11, // "o"
71,MIN_REDUCTION+11, // "r"
72,MIN_REDUCTION+11, // "u"
73,MIN_REDUCTION+11, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,MIN_REDUCTION+11, // "b"
75,MIN_REDUCTION+11, // "h"
76,MIN_REDUCTION+11, // "n"
77,MIN_REDUCTION+11, // "t"
79,MIN_REDUCTION+11, // {199..218 231..250}
80,MIN_REDUCTION+11, // {193..198 225..230}
87,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 196
2,47, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 197
23,137, // `]
96,78, // "]"
  }
,
{ // state 198
7,183, // ID
8,198, // `{
10,274, // `}
15,290, // `(
17,235, // <stmt>*
18,2, // <type>
19,245, // `int
20,145, // `boolean
24,221, // <stmt>
25,157, // <assign>
27,284, // <local var decl>
28,41, // <exp>
30,359, // <exp8>
32,226, // <exp7>
34,337, // <exp6>
36,225, // <exp5>
39,116, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,98, // "#"
100,54, // "{"
102,73, // "("
103,150, // "+"
106,181, // "@"
108,246, // "}"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 199
70,236, // "o"
  }
,
{ // state 200
22,MIN_REDUCTION+50, // `[
87,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 201
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 202
0x80000000|151, // match move
0x80000000|210, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 203
2,38, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 204
2,240, // ws*
22,MIN_REDUCTION+77, // `[
87,MIN_REDUCTION+77, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 205
22,MIN_REDUCTION+168, // `[
87,MIN_REDUCTION+168, // "["
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 206
22,MIN_REDUCTION+130, // `[
87,MIN_REDUCTION+130, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 207
2,15, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 208
22,MIN_REDUCTION+53, // `[
87,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 210
22,MIN_REDUCTION+132, // `[
87,MIN_REDUCTION+132, // "["
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 211
2,82, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 213
22,MIN_REDUCTION+176, // `[
87,MIN_REDUCTION+176, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 214
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 215
0x80000000|75, // match move
0x80000000|130, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 216
44,223, // `+
46,161, // `-
88,305, // "-"
103,150, // "+"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 217
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 218
7,42, // ID
44,63, // `+
46,218, // `-
52,162, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 219
0x80000000|108, // match move
0x80000000|143, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 220
2,167, // ws*
22,MIN_REDUCTION+177, // `[
87,MIN_REDUCTION+177, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 222
2,17, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 223
7,42, // ID
15,290, // `(
44,63, // `+
45,49, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 224
22,MIN_REDUCTION+76, // `[
87,MIN_REDUCTION+76, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 225
38,146, // `>
40,66, // `<
41,147, // `>=
42,24, // `<=
43,10, // `instanceof
89,156, // "<"
93,133, // "#"
99,273, // ">"
106,169, // "@"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 226
33,56, // `&&
106,4, // "@"
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 227
0x80000000|1, // match move
0x80000000|234, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 228
22,MIN_REDUCTION+59, // `[
87,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 229
71,308, // "r"
75,68, // "h"
  }
,
{ // state 230
2,65, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 231
2,13, // ws*
  }
,
{ // state 232
7,96, // ID
62,277, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,311, // letter128
79,209, // {199..218 231..250}
80,209, // {193..198 225..230}
  }
,
{ // state 233
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 234
22,MIN_REDUCTION+74, // `[
87,MIN_REDUCTION+74, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 235
7,183, // ID
8,198, // `{
10,170, // `}
15,290, // `(
18,2, // <type>
19,245, // `int
20,145, // `boolean
24,112, // <stmt>
25,157, // <assign>
27,284, // <local var decl>
28,41, // <exp>
30,359, // <exp8>
32,226, // <exp7>
34,337, // <exp6>
36,225, // <exp5>
39,116, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,98, // "#"
100,54, // "{"
102,73, // "("
103,150, // "+"
106,181, // "@"
108,246, // "}"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 236
2,331, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 238
35,186, // `!=
37,309, // `==
106,347, // "@"
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 239
22,MIN_REDUCTION+61, // `[
87,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 240
0x80000000|1, // match move
0x80000000|224, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 241
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 242
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 243
0x80000000|95, // match move
0x80000000|345, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 244
2,64, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 246
2,242, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 247
64,310, // "p"
  }
,
{ // state 248
29,80, // `=
105,122, // "="
  }
,
{ // state 249
22,MIN_REDUCTION+57, // `[
87,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 250
2,37, // ws*
  }
,
{ // state 251
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 252
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 253
22,MIN_REDUCTION+142, // `[
87,MIN_REDUCTION+142, // "["
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 254
0x80000000|298, // match move
0x80000000|205, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 255
0x80000000|1, // match move
0x80000000|83, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 256
22,MIN_REDUCTION+174, // `[
87,MIN_REDUCTION+174, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 258
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 259
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 260
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 261
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 262
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 263
2,188, // ws*
22,MIN_REDUCTION+175, // `[
87,MIN_REDUCTION+175, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 264
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 265
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 266
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 267
81,34, // digit
82,332, // {"1".."9"}
83,332, // "0"
84,165, // digit128
85,58, // {176..185}
119,160, // digit*
120,39, // $$1
  }
,
{ // state 268
0x80000000|1, // match move
0x80000000|286, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 269
0x80000000|265, // match move
0x80000000|194, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 270
9,154, // <decl in class>*
10,283, // `}
11,74, // <decl in class>
12,295, // <method decl>
13,180, // `public
93,247, // "#"
108,246, // "}"
  }
,
{ // state 271
66,292, // "c"
  }
,
{ // state 272
2,301, // ws*
  }
,
{ // state 273
0x80000000|1, // match move
0x80000000|185, // no-match move
// T-test match for "=":
105,
  }
,
{ // state 274
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 276
22,MIN_REDUCTION+136, // `[
87,MIN_REDUCTION+136, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 277
62,233, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,260, // letter128
79,209, // {199..218 231..250}
80,209, // {193..198 225..230}
81,289, // digit
82,332, // {"1".."9"}
83,332, // "0"
84,136, // digit128
85,191, // {176..185}
104,12, // "_"
114,296, // {223}
117,152, // idChar*
118,251, // $$0
125,123, // idChar
126,148, // idChar128
  }
,
{ // state 278
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 279
22,MIN_REDUCTION+144, // `[
87,MIN_REDUCTION+144, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 280
63,71, // "a"
64,71, // "p"
65,71, // "v"
66,71, // "c"
67,71, // "f"
68,71, // "i"
69,71, // "l"
70,71, // "o"
71,71, // "r"
72,71, // "u"
73,71, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,71, // "b"
75,71, // "h"
76,71, // "n"
77,71, // "t"
80,159, // {193..198 225..230}
82,71, // {"1".."9"}
83,71, // "0"
85,159, // {176..185}
121,334, // hexDigit*
122,255, // $$2
127,120, // hexDigit
128,352, // hexDigit128
  }
,
{ // state 281
2,241, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 282
2,138, // ws*
  }
,
{ // state 283
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 284
26,336, // `;
98,178, // ";"
  }
,
{ // state 285
129,MIN_REDUCTION+0, // $
  }
,
{ // state 286
22,MIN_REDUCTION+138, // `[
87,MIN_REDUCTION+138, // "["
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 287
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 288
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 290
7,344, // ID
18,25, // <type>
19,245, // `int
20,145, // `boolean
62,277, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,311, // letter128
79,209, // {199..218 231..250}
80,209, // {193..198 225..230}
93,14, // "#"
  }
,
{ // state 291
22,MIN_REDUCTION+172, // `[
87,MIN_REDUCTION+172, // "["
92,67, // " "
107,60, // {10}
116,254, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 292
69,189, // "l"
  }
,
{ // state 293
22,MIN_REDUCTION+56, // `[
87,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 294
2,37, // ws*
22,MIN_REDUCTION+145, // `[
87,MIN_REDUCTION+145, // "["
92,67, // " "
107,60, // {10}
116,315, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 295
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 296
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 297
2,62, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 298
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 300
44,223, // `+
46,161, // `-
88,305, // "-"
103,150, // "+"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 301
0x80000000|1, // match move
0x80000000|89, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 302
0x80000000|1, // match move
0x80000000|85, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 303
2,61, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 304
0x80000000|1, // match move
0x80000000|187, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 305
2,55, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 306
2,93, // ws*
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 307
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 308
0x80000000|282, // match move
0x80000000|125, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 309
7,42, // ID
15,290, // `(
36,341, // <exp5>
39,116, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 310
72,358, // "u"
  }
,
{ // state 311
2,214, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 312
67,171, // "f"
76,87, // "n"
77,229, // "t"
  }
,
{ // state 313
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 314
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 315
0x80000000|164, // match move
0x80000000|27, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 316
7,183, // ID
8,198, // `{
10,193, // `}
15,290, // `(
18,2, // <type>
19,245, // `int
20,145, // `boolean
24,112, // <stmt>
25,157, // <assign>
27,284, // <local var decl>
28,41, // <exp>
30,359, // <exp8>
32,226, // <exp7>
34,337, // <exp6>
36,225, // <exp5>
39,116, // <exp4>
44,63, // `+
45,46, // <exp3>
46,218, // `-
48,261, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,98, // "#"
100,54, // "{"
102,73, // "("
103,150, // "+"
106,181, // "@"
108,246, // "}"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 317
0x80000000|1, // match move
0x80000000|8, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 318
22,MIN_REDUCTION+63, // `[
87,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 319
22,MIN_REDUCTION+51, // `[
87,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 320
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 321
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 322
0x80000000|35, // match move
0x80000000|220, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 323
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 324
77,211, // "t"
  }
,
{ // state 325
0x80000000|231, // match move
0x80000000|177, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 326
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 327
2,227, // ws*
  }
,
{ // state 328
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 329
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 330
2,259, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 331
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 333
2,131, // ws*
  }
,
{ // state 334
63,71, // "a"
64,71, // "p"
65,71, // "v"
66,71, // "c"
67,71, // "f"
68,71, // "i"
69,71, // "l"
70,71, // "o"
71,71, // "r"
72,71, // "u"
73,71, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,71, // "b"
75,71, // "h"
76,71, // "n"
77,71, // "t"
80,159, // {193..198 225..230}
82,71, // {"1".."9"}
83,71, // "0"
85,159, // {176..185}
122,268, // $$2
127,328, // hexDigit
128,352, // hexDigit128
  }
,
{ // state 335
2,252, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 336
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 337
35,186, // `!=
37,309, // `==
106,347, // "@"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 338
0x80000000|1, // match move
0x80000000|293, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 339
33,56, // `&&
106,4, // "@"
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 340
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 341
38,146, // `>
40,66, // `<
41,147, // `>=
42,24, // `<=
43,10, // `instanceof
89,156, // "<"
93,133, // "#"
99,273, // ">"
106,169, // "@"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 342
47,69, // `*
49,76, // `/
50,360, // `%
97,207, // "/"
101,335, // "%"
112,3, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 343
44,223, // `+
46,161, // `-
88,305, // "-"
103,150, // "+"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 344
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 345
22,MIN_REDUCTION+149, // `[
87,MIN_REDUCTION+149, // "["
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 346
0x80000000|1, // match move
0x80000000|253, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 347
91,303, // "|"
94,230, // "&"
105,222, // "="
109,121, // "!"
  }
,
{ // state 348
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 349
22,MIN_REDUCTION+52, // `[
87,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 351
0x80000000|1, // match move
0x80000000|249, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 352
0x80000000|166, // match move
0x80000000|263, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 353
3,262, // <program>
4,113, // <class decl>+
5,266, // <class decl>
6,33, // `class
92,105, // " "
93,271, // "#"
107,7, // {10}
116,50, // ws
  }
,
{ // state 354
7,42, // ID
15,290, // `(
51,257, // <cast exp>
53,355, // <exp1>
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
93,312, // "#"
102,73, // "("
106,181, // "@"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 355
0x80000000|1, // match move
0x80000000|102, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 356
22,MIN_REDUCTION+49, // `[
87,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 358
2,278, // ws*
92,105, // " "
107,7, // {10}
116,101, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 359
31,99, // `||
106,363, // "@"
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 360
7,42, // ID
15,290, // `(
44,63, // `+
46,218, // `-
48,320, // <exp2>
51,21, // <cast exp>
52,258, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
102,73, // "("
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
{ // state 361
0x80000000|114, // match move
0x80000000|318, // no-match move
0x80000000|175, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 362
92,105, // " "
107,7, // {10}
116,50, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 363
91,303, // "|"
  }
,
{ // state 364
7,42, // ID
44,63, // `+
46,218, // `-
52,29, // <unary exp>
53,302, // <exp1>
54,364, // `!
55,94, // INTLIT
56,100, // STRINGLIT
57,90, // CHARLIT
58,304, // `null
59,317, // `true
60,338, // `false
61,351, // `this
62,153, // letter
63,158, // "a"
64,158, // "p"
65,158, // "v"
66,158, // "c"
67,158, // "f"
68,158, // "i"
69,158, // "l"
70,158, // "o"
71,158, // "r"
72,158, // "u"
73,158, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
74,158, // "b"
75,158, // "h"
76,158, // "n"
77,158, // "t"
78,219, // letter128
79,40, // {199..218 231..250}
80,40, // {193..198 225..230}
82,267, // {"1".."9"}
83,280, // "0"
84,176, // digit128
85,58, // {176..185}
88,305, // "-"
93,312, // "#"
103,150, // "+"
106,181, // "@"
109,281, // "!"
110,129, // "'"
111,59, // '"'
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[365][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= <start>
(0<<16)+1,
// <start> ::= ws* <program>
(1<<16)+2,
// <start> ::= <program>
(1<<16)+1,
// <program> ::= <class decl>+
(3<<16)+1,
// <class decl> ::= `class ID `{ <decl in class>* `}
(5<<16)+5,
// <class decl> ::= `class ID `{ `}
(5<<16)+4,
// <decl in class> ::= <method decl>
(11<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(12<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(12<<16)+7,
// <type> ::= `int
(18<<16)+1,
// <type> ::= `boolean
(18<<16)+1,
// <type> ::= ID
(18<<16)+1,
// <type> ::= <type> <empty bracket pair>
(18<<16)+2,
// <empty bracket pair> ::= `[ `]
(21<<16)+2,
// <stmt> ::= <assign> `;
(24<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(24<<16)+3,
// <stmt> ::= `{ `}
(24<<16)+2,
// <stmt> ::= <local var decl> `;
(24<<16)+2,
// <assign> ::= <exp> `= <exp>
(25<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(27<<16)+4,
// <exp> ::= <exp8>
(28<<16)+1,
// <exp8> ::= <exp8> `|| <exp7>
(30<<16)+3,
// <exp8> ::= <exp7>
(30<<16)+1,
// <exp7> ::= <exp7> `&& <exp6>
(32<<16)+3,
// <exp7> ::= <exp6>
(32<<16)+1,
// <exp6> ::= <exp6> `!= <exp5>
(34<<16)+3,
// <exp6> ::= <exp6> `== <exp5>
(34<<16)+3,
// <exp6> ::= <exp5>
(34<<16)+1,
// <exp5> ::= <exp5> `> <exp4>
(36<<16)+3,
// <exp5> ::= <exp5> `< <exp4>
(36<<16)+3,
// <exp5> ::= <exp5> `>= <exp4>
(36<<16)+3,
// <exp5> ::= <exp5> `<= <exp4>
(36<<16)+3,
// <exp5> ::= <exp5> `instanceof ID
(36<<16)+3,
// <exp5> ::= <exp4>
(36<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(39<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(39<<16)+3,
// <exp4> ::= <exp3>
(39<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(45<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(45<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(45<<16)+3,
// <exp3> ::= <exp2>
(45<<16)+1,
// <exp2> ::= <cast exp>
(48<<16)+1,
// <exp2> ::= <unary exp>
(48<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(51<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(51<<16)+4,
// <unary exp> ::= `- <unary exp>
(52<<16)+2,
// <unary exp> ::= `+ <unary exp>
(52<<16)+2,
// <unary exp> ::= `! <unary exp>
(52<<16)+2,
// <unary exp> ::= <exp1>
(52<<16)+1,
// <exp1> ::= ID
(53<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(53<<16)+4,
// <exp1> ::= INTLIT
(53<<16)+1,
// <exp1> ::= STRINGLIT
(53<<16)+1,
// <exp1> ::= CHARLIT
(53<<16)+1,
// <exp1> ::= `null
(53<<16)+1,
// <exp1> ::= `true
(53<<16)+1,
// <exp1> ::= `false
(53<<16)+1,
// <exp1> ::= `this
(53<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(62<<16)+1,
// letter128 ::= {193..218 225..250}
(78<<16)+1,
// digit ::= {"0".."9"}
(81<<16)+1,
// digit128 ::= {176..185}
(84<<16)+1,
// any ::= {0..127}
(86<<16)+1,
// any128 ::= {128..255}
(113<<16)+1,
// ws ::= " "
(116<<16)+1,
// ws ::= {10}
(116<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(20<<16)+4,
// `boolean ::= "#" "b" "o"
(20<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(19<<16)+4,
// `int ::= "#" "i" "t"
(19<<16)+3,
// `this ::= "#" "t" "h" ws*
(61<<16)+4,
// `this ::= "#" "t" "h"
(61<<16)+3,
// `false ::= "#" "f" "a" ws*
(60<<16)+4,
// `false ::= "#" "f" "a"
(60<<16)+3,
// `true ::= "#" "t" "r" ws*
(59<<16)+4,
// `true ::= "#" "t" "r"
(59<<16)+3,
// `null ::= "#" "n" "u" ws*
(58<<16)+4,
// `null ::= "#" "n" "u"
(58<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(43<<16)+4,
// `instanceof ::= "#" "i" "n"
(43<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `! ::= "!" ws*
(54<<16)+2,
// `! ::= "!"
(54<<16)+1,
// `!= ::= "@" "!" ws*
(35<<16)+3,
// `!= ::= "@" "!"
(35<<16)+2,
// `% ::= "%" ws*
(50<<16)+2,
// `% ::= "%"
(50<<16)+1,
// `&& ::= "@" "&" ws*
(33<<16)+3,
// `&& ::= "@" "&"
(33<<16)+2,
// `* ::= "*" ws*
(47<<16)+2,
// `* ::= "*"
(47<<16)+1,
// `( ::= "(" ws*
(15<<16)+2,
// `( ::= "("
(15<<16)+1,
// `) ::= ")" ws*
(16<<16)+2,
// `) ::= ")"
(16<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(46<<16)+2,
// `- ::= "-"
(46<<16)+1,
// `+ ::= "+" ws*
(44<<16)+2,
// `+ ::= "+"
(44<<16)+1,
// `= ::= "=" ws*
(29<<16)+2,
// `= ::= "="
(29<<16)+1,
// `== ::= "@" "=" ws*
(37<<16)+3,
// `== ::= "@" "="
(37<<16)+2,
// `[ ::= "[" ws*
(22<<16)+2,
// `[ ::= "["
(22<<16)+1,
// `] ::= "]" ws*
(23<<16)+2,
// `] ::= "]"
(23<<16)+1,
// `|| ::= "@" "|" ws*
(31<<16)+3,
// `|| ::= "@" "|"
(31<<16)+2,
// `< ::= "<" ws*
(40<<16)+2,
// `< ::= "<"
(40<<16)+1,
// `<= ::= "@" "<" ws*
(42<<16)+3,
// `<= ::= "@" "<"
(42<<16)+2,
// `> ::= ">" !"=" ws*
(38<<16)+2,
// `> ::= ">" !"="
(38<<16)+1,
// `>= ::= "@" ">" ws*
(41<<16)+3,
// `>= ::= "@" ">"
(41<<16)+2,
// `; ::= ";" ws*
(26<<16)+2,
// `; ::= ";"
(26<<16)+1,
// `/ ::= "/" ws*
(49<<16)+2,
// `/ ::= "/"
(49<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(55<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(55<<16)+2,
// INTLIT ::= digit128 ws*
(55<<16)+2,
// INTLIT ::= digit128
(55<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(55<<16)+3,
// INTLIT ::= "0" $$2
(55<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(56<<16)+3,
// STRINGLIT ::= "@" '"'
(56<<16)+2,
// STRINGLIT ::= '"' any* $$3
(56<<16)+3,
// STRINGLIT ::= '"' $$3
(56<<16)+2,
// CHARLIT ::= "'" any ws*
(57<<16)+3,
// CHARLIT ::= "'" any
(57<<16)+2,
// idChar ::= letter
(125<<16)+1,
// idChar ::= digit
(125<<16)+1,
// idChar ::= "_"
(125<<16)+1,
// idChar128 ::= letter128
(126<<16)+1,
// idChar128 ::= digit128
(126<<16)+1,
// idChar128 ::= {223}
(126<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(127<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(128<<16)+1,
// digit* ::= digit* digit
(119<<16)+2,
// digit* ::= digit
(119<<16)+1,
// any* ::= any* any
(123<<16)+2,
// any* ::= any
(123<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(121<<16)+2,
// hexDigit* ::= hexDigit
(121<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// idChar* ::= idChar* idChar
(117<<16)+2,
// idChar* ::= idChar
(117<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(118<<16)+2,
// $$0 ::= idChar128
(118<<16)+1,
// $$1 ::= digit128 ws*
(120<<16)+2,
// $$1 ::= digit128
(120<<16)+1,
// $$2 ::= hexDigit128 ws*
(122<<16)+2,
// $$2 ::= hexDigit128
(122<<16)+1,
// $$3 ::= any128 ws*
(124<<16)+2,
// $$3 ::= any128
(124<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
90, // 0
90, // 1
90, // 2
90, // 3
90, // 4
90, // 5
90, // 6
90, // 7
90, // 8
90, // 9
107, // 10
90, // 11
90, // 12
90, // 13
90, // 14
90, // 15
90, // 16
90, // 17
90, // 18
90, // 19
90, // 20
90, // 21
90, // 22
90, // 23
90, // 24
90, // 25
90, // 26
90, // 27
90, // 28
90, // 29
90, // 30
90, // 31
92, // " "
109, // "!"
111, // '"'
93, // "#"
90, // "$"
101, // "%"
94, // "&"
110, // "'"
102, // "("
95, // ")"
112, // "*"
103, // "+"
90, // ","
88, // "-"
90, // "."
97, // "/"
83, // "0"
82, // "1"
82, // "2"
82, // "3"
82, // "4"
82, // "5"
82, // "6"
82, // "7"
82, // "8"
82, // "9"
90, // ":"
98, // ";"
89, // "<"
105, // "="
99, // ">"
90, // "?"
106, // "@"
73, // "A"
73, // "B"
73, // "C"
73, // "D"
73, // "E"
73, // "F"
73, // "G"
73, // "H"
73, // "I"
73, // "J"
73, // "K"
73, // "L"
73, // "M"
73, // "N"
73, // "O"
73, // "P"
73, // "Q"
73, // "R"
73, // "S"
73, // "T"
73, // "U"
73, // "V"
73, // "W"
73, // "X"
73, // "Y"
73, // "Z"
87, // "["
90, // "\"
96, // "]"
90, // "^"
104, // "_"
90, // "`"
63, // "a"
74, // "b"
66, // "c"
73, // "d"
73, // "e"
67, // "f"
73, // "g"
75, // "h"
68, // "i"
73, // "j"
73, // "k"
69, // "l"
73, // "m"
76, // "n"
70, // "o"
64, // "p"
73, // "q"
71, // "r"
73, // "s"
77, // "t"
72, // "u"
65, // "v"
73, // "w"
73, // "x"
73, // "y"
73, // "z"
100, // "{"
91, // "|"
108, // "}"
90, // "~"
90, // 127
115, // 128
115, // 129
115, // 130
115, // 131
115, // 132
115, // 133
115, // 134
115, // 135
115, // 136
115, // 137
115, // 138
115, // 139
115, // 140
115, // 141
115, // 142
115, // 143
115, // 144
115, // 145
115, // 146
115, // 147
115, // 148
115, // 149
115, // 150
115, // 151
115, // 152
115, // 153
115, // 154
115, // 155
115, // 156
115, // 157
115, // 158
115, // 159
115, // 160
115, // 161
115, // 162
115, // 163
115, // 164
115, // 165
115, // 166
115, // 167
115, // 168
115, // 169
115, // 170
115, // 171
115, // 172
115, // 173
115, // 174
115, // 175
85, // 176
85, // 177
85, // 178
85, // 179
85, // 180
85, // 181
85, // 182
85, // 183
85, // 184
85, // 185
115, // 186
115, // 187
115, // 188
115, // 189
115, // 190
115, // 191
115, // 192
80, // 193
80, // 194
80, // 195
80, // 196
80, // 197
80, // 198
79, // 199
79, // 200
79, // 201
79, // 202
79, // 203
79, // 204
79, // 205
79, // 206
79, // 207
79, // 208
79, // 209
79, // 210
79, // 211
79, // 212
79, // 213
79, // 214
79, // 215
79, // 216
79, // 217
79, // 218
115, // 219
115, // 220
115, // 221
115, // 222
114, // 223
115, // 224
80, // 225
80, // 226
80, // 227
80, // 228
80, // 229
80, // 230
79, // 231
79, // 232
79, // 233
79, // 234
79, // 235
79, // 236
79, // 237
79, // 238
79, // 239
79, // 240
79, // 241
79, // 242
79, // 243
79, // 244
79, // 245
79, // 246
79, // 247
79, // 248
79, // 249
79, // 250
115, // 251
115, // 252
115, // 253
115, // 254
115, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"<start> ::= ws* <program>", // 1
"<start> ::= ws* <program>", // 2
"<program> ::= # <class decl>+", // 3
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 4
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 5
"<decl in class> ::= <method decl>", // 6
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 7
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 8
"<type> ::= # `int", // 9
"<type> ::= # `boolean", // 10
"<type> ::= # ID", // 11
"<type> ::= # <type> <empty bracket pair>", // 12
"<empty bracket pair> ::= `[ `]", // 13
"<stmt> ::= <assign> `;", // 14
"<stmt> ::= # `{ <stmt>* `}", // 15
"<stmt> ::= # `{ <stmt>* `}", // 16
"<stmt> ::= <local var decl> `;", // 17
"<assign> ::= <exp> # `= <exp>", // 18
"<local var decl> ::= <type> # ID `= <exp>", // 19
"<exp> ::= <exp8>", // 20
"<exp8> ::= <exp8> # `|| <exp7>", // 21
"<exp8> ::= <exp7>", // 22
"<exp7> ::= <exp7> # `&& <exp6>", // 23
"<exp7> ::= <exp6>", // 24
"<exp6> ::= <exp6> # `!= <exp5>", // 25
"<exp6> ::= <exp6> # `== <exp5>", // 26
"<exp6> ::= <exp5>", // 27
"<exp5> ::= <exp5> # `> <exp4>", // 28
"<exp5> ::= <exp5> # `< <exp4>", // 29
"<exp5> ::= <exp5> # `>= <exp4>", // 30
"<exp5> ::= <exp5> # `<= <exp4>", // 31
"<exp5> ::= <exp5> # `instanceof ID", // 32
"<exp5> ::= <exp4>", // 33
"<exp4> ::= <exp4> # `+ <exp3>", // 34
"<exp4> ::= <exp4> # `- <exp3>", // 35
"<exp4> ::= <exp3>", // 36
"<exp3> ::= <exp3> # `* <exp2>", // 37
"<exp3> ::= <exp3> # `/ <exp2>", // 38
"<exp3> ::= <exp3> # `% <exp2>", // 39
"<exp3> ::= <exp2>", // 40
"<exp2> ::= <cast exp>", // 41
"<exp2> ::= <unary exp>", // 42
"<cast exp> ::= # `( <type> `) <cast exp>", // 43
"<cast exp> ::= # `( <type> `) <exp1>", // 44
"<unary exp> ::= # `- <unary exp>", // 45
"<unary exp> ::= # `+ <unary exp>", // 46
"<unary exp> ::= # `! <unary exp>", // 47
"<unary exp> ::= <exp1>", // 48
"<exp1> ::= # ID", // 49
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 50
"<exp1> ::= # INTLIT", // 51
"<exp1> ::= # STRINGLIT", // 52
"<exp1> ::= # CHARLIT", // 53
"<exp1> ::= # `null", // 54
"<exp1> ::= # `true", // 55
"<exp1> ::= # `false", // 56
"<exp1> ::= # `this", // 57
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 58
"letter128 ::= {193..218 225..250}", // 59
"digit ::= {\"0\"..\"9\"}", // 60
"digit128 ::= {176..185}", // 61
"any ::= {0..127}", // 62
"any128 ::= {128..255}", // 63
"ws ::= \" \"", // 64
"ws ::= {10} registerNewline", // 65
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 66
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 67
"`class ::= \"#\" \"c\" \"l\" ws*", // 68
"`class ::= \"#\" \"c\" \"l\" ws*", // 69
"`void ::= \"#\" \"v\" \"o\" ws*", // 70
"`void ::= \"#\" \"v\" \"o\" ws*", // 71
"`int ::= \"#\" \"i\" \"t\" ws*", // 72
"`int ::= \"#\" \"i\" \"t\" ws*", // 73
"`this ::= \"#\" \"t\" \"h\" ws*", // 74
"`this ::= \"#\" \"t\" \"h\" ws*", // 75
"`false ::= \"#\" \"f\" \"a\" ws*", // 76
"`false ::= \"#\" \"f\" \"a\" ws*", // 77
"`true ::= \"#\" \"t\" \"r\" ws*", // 78
"`true ::= \"#\" \"t\" \"r\" ws*", // 79
"`null ::= \"#\" \"n\" \"u\" ws*", // 80
"`null ::= \"#\" \"n\" \"u\" ws*", // 81
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 82
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 83
"`public ::= \"#\" \"p\" \"u\" ws*", // 84
"`public ::= \"#\" \"p\" \"u\" ws*", // 85
"`! ::= \"!\" ws*", // 86
"`! ::= \"!\" ws*", // 87
"`!= ::= \"@\" \"!\" ws*", // 88
"`!= ::= \"@\" \"!\" ws*", // 89
"`% ::= \"%\" ws*", // 90
"`% ::= \"%\" ws*", // 91
"`&& ::= \"@\" \"&\" ws*", // 92
"`&& ::= \"@\" \"&\" ws*", // 93
"`* ::= \"*\" ws*", // 94
"`* ::= \"*\" ws*", // 95
"`( ::= \"(\" ws*", // 96
"`( ::= \"(\" ws*", // 97
"`) ::= \")\" ws*", // 98
"`) ::= \")\" ws*", // 99
"`{ ::= \"{\" ws*", // 100
"`{ ::= \"{\" ws*", // 101
"`} ::= \"}\" ws*", // 102
"`} ::= \"}\" ws*", // 103
"`- ::= \"-\" ws*", // 104
"`- ::= \"-\" ws*", // 105
"`+ ::= \"+\" ws*", // 106
"`+ ::= \"+\" ws*", // 107
"`= ::= \"=\" ws*", // 108
"`= ::= \"=\" ws*", // 109
"`== ::= \"@\" \"=\" ws*", // 110
"`== ::= \"@\" \"=\" ws*", // 111
"`[ ::= \"[\" ws*", // 112
"`[ ::= \"[\" ws*", // 113
"`] ::= \"]\" ws*", // 114
"`] ::= \"]\" ws*", // 115
"`|| ::= \"@\" \"|\" ws*", // 116
"`|| ::= \"@\" \"|\" ws*", // 117
"`< ::= \"<\" ws*", // 118
"`< ::= \"<\" ws*", // 119
"`<= ::= \"@\" \"<\" ws*", // 120
"`<= ::= \"@\" \"<\" ws*", // 121
"`> ::= \">\" !\"=\" ws*", // 122
"`> ::= \">\" !\"=\" ws*", // 123
"`>= ::= \"@\" \">\" ws*", // 124
"`>= ::= \"@\" \">\" ws*", // 125
"`; ::= \";\" ws*", // 126
"`; ::= \";\" ws*", // 127
"`/ ::= \"/\" ws*", // 128
"`/ ::= \"/\" ws*", // 129
"ID ::= letter128 ws*", // 130
"ID ::= letter128 ws*", // 131
"ID ::= letter idChar* idChar128 ws*", // 132
"ID ::= letter idChar* idChar128 ws*", // 133
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 134
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 135
"INTLIT ::= digit128 ws*", // 136
"INTLIT ::= digit128 ws*", // 137
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 138
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 139
"STRINGLIT ::= \"@\" \'\"\' ws*", // 140
"STRINGLIT ::= \"@\" \'\"\' ws*", // 141
"STRINGLIT ::= \'\"\' any* any128 ws*", // 142
"STRINGLIT ::= \'\"\' any* any128 ws*", // 143
"CHARLIT ::= \"\'\" any ws*", // 144
"CHARLIT ::= \"\'\" any ws*", // 145
"idChar ::= letter", // 146
"idChar ::= digit", // 147
"idChar ::= \"_\"", // 148
"idChar128 ::= letter128", // 149
"idChar128 ::= digit128", // 150
"idChar128 ::= {223}", // 151
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 152
"hexDigit128 ::= {176..185 193..198 225..230}", // 153
"digit* ::= digit* digit", // 154
"digit* ::= digit* digit", // 155
"any* ::= any* any", // 156
"any* ::= any* any", // 157
"<decl in class>* ::= <decl in class>* <decl in class>", // 158
"<decl in class>* ::= <decl in class>* <decl in class>", // 159
"hexDigit* ::= hexDigit* hexDigit", // 160
"hexDigit* ::= hexDigit* hexDigit", // 161
"<stmt>* ::= <stmt>* <stmt>", // 162
"<stmt>* ::= <stmt>* <stmt>", // 163
"idChar* ::= idChar* idChar", // 164
"idChar* ::= idChar* idChar", // 165
"<class decl>+ ::= <class decl>", // 166
"<class decl>+ ::= <class decl>+ <class decl>", // 167
"ws* ::= ws* ws", // 168
"ws* ::= ws* ws", // 169
"", // 170
"", // 171
"", // 172
"", // 173
"", // 174
"", // 175
"", // 176
"", // 177
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= <start> @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: <start> ::= ws* <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 2: <start> ::= [ws*] <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 7: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 14: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 15: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 16: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 17: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 18: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 19: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 20: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 21: <exp8> ::= <exp8> [#] `|| <exp7> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <exp7> ::= <exp7> [#] `&& <exp6> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 24: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <exp6> ::= <exp6> [#] `!= <exp5> @newBangEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 26: <exp6> ::= <exp6> [#] `== <exp5> @newEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 27: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 29: <exp5> ::= <exp5> [#] `< <exp4> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 30: <exp5> ::= <exp5> [#] `>= <exp4> @newGreaterEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 31: <exp5> ::= <exp5> [#] `<= <exp4> @newLessEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 32: <exp5> ::= <exp5> [#] `instanceof ID @newInstanceOf(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 33: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 35: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 36: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 38: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 39: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 40: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 44: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 45: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 46: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 47: <unary exp> ::= [#] `! <unary exp> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 48: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 49: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 50: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 51: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 52: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 53: <exp1> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 54: <exp1> ::= [#] `null @newNull(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 55: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 56: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 57: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 58: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 59: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 60: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 61: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 62: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 63: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 64: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 65: ws ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 66: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 69: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 72: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 73: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 74: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 75: `this ::= "#" "t" "h" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 76: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 77: `false ::= "#" "f" "a" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 78: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 79: `true ::= "#" "t" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 80: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 81: `null ::= "#" "n" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 82: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 83: `instanceof ::= "#" "i" "n" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 84: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 85: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `! ::= "!" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 89: `!= ::= "@" "!" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 90: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 93: `&& ::= "@" "&" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 94: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 95: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 96: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 97: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 100: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 101: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 102: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 103: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 104: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 105: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 106: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 107: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 108: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 111: `== ::= "@" "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 112: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 117: `|| ::= "@" "|" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 118: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `< ::= "<" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 121: `<= ::= "@" "<" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 122: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `> ::= ">" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `>= ::= "@" ">" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 125: `>= ::= "@" ">" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 126: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `/ ::= "/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 131: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 132: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 133: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 134: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 135: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 136: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 137: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 138: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 139: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 140: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 141: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 142: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 143: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 144: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 145: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 146: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 147: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 148: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 149: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 150: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 151: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 152: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 153: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 154: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 155: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 156: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 157: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 158: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 159: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 160: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 161: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 162: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 163: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 164: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 165: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 166: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 167: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 168: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 169: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 170: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 171: $$0 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 172: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 173: $$1 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 174: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 175: $$2 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 176: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 177: $$3 ::= any128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // any*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      Program parm0 = (Program)si.popPb();
      actionObject.topLevel(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      List<ClassDecl> parm1 = (List<ClassDecl>)si.popPb();
      Program result = actionObject.createProgram(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Decl> parm2 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 9: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 10: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 11: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newBangEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 30: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNull(parm0);
      si.pushPb(result);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 38: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 39: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 40: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 41: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 42: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 43: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 44: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 45: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,List<Statement>)",
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlock(int,List<Statement>)",
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
"Exp newOr(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newBangEquals(Exp,int,Exp)",
"Exp newEquals(Exp,int,Exp)",
"Exp newGreaterThan(Exp,int,Exp)",
"Exp newLessThan(Exp,int,Exp)",
"Exp newGreaterEquals(Exp,int,Exp)",
"Exp newLessEquals(Exp,int,Exp)",
"Exp newInstanceOf(Exp,int,String)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newRemainder(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryPlus(int,Exp)",
"Exp newUnaryNot(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"Exp newStringLiteral(int,String)",
"Exp newCharLiteral(int,int)",
"Exp newNull(int)",
"Exp newTrue(int)",
"Exp newFalse(int)",
"Exp newThis(int)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"String emptyString(char,char)",
"String string(char,List<Character>,char)",
"int charVal(char,char)",
"char underscore(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
2,1,
3,1,
3,1,
1,1,
1,1,
2,1,
3,1,
2,1,
3,1,
4,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
2,1,
2,1,
2,1,
2,1,
3,1,
2,1,
2,1,
2,1,
1,1,
1,1,
1,1,
1,1,
1,1,
3,1,
1,1,
3,1,
2,1,
3,1,
2,1,
1,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    0,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    0,
    0,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.Vector<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
