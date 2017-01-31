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
public class TokenGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 166; }
public int getNttSym() { return 167; }
private String[] symNameTable = {
"$$start",
"start",
"ws*",
"$$0",
"token",
"`boolean",
"`class",
"`extends",
"`void",
"`int",
"`while",
"`if",
"`else",
"`for",
"`break",
"`this",
"`false",
"`true",
"`super",
"`null",
"`return",
"`instanceof",
"`new",
"`abstract",
"`assert",
"`byte",
"`case",
"`catch",
"`char",
"`const",
"`continue",
"`default",
"`do",
"`double",
"`enum",
"`final",
"`finally",
"`float",
"`goto",
"`implements",
"`import",
"`interface",
"`long",
"`native",
"`package",
"`private",
"`protected",
"`public",
"`short",
"`static",
"`strictfp",
"`switch",
"`synchronized",
"`throw",
"`throws",
"`transient",
"`try",
"`volatile",
"`!",
"`!=",
"`%",
"`&&",
"`*",
"`(",
"`)",
"`{",
"`}",
"`-",
"`+",
"`=",
"`==",
"`[",
"`]",
"`||",
"`<",
"`<=",
"`,",
"`>",
"`>=",
"`.",
"`;",
"`++",
"`--",
"`/",
"ID",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"\"c\"",
"\"l\"",
"\"a\"",
"\"s\"",
"idChar",
"reserved",
"\"e\"",
"\"b\"",
"\"o\"",
"\"n\"",
"\"r\"",
"\"k\"",
"\"x\"",
"\"t\"",
"\"d\"",
"\"p\"",
"\"u\"",
"\"i\"",
"\"v\"",
"\"f\"",
"\"w\"",
"\"h\"",
"\"y\"",
"\"m\"",
"\"g\"",
"\"z\"",
"\"!\"",
"\"=\"",
"\"*\"",
"\"%\"",
"\"&\"",
"\"(\"",
"\")\"",
"\"+\"",
"\",\"",
"\"-\"",
"\".\"",
"\"/\"",
"\";\"",
"\"<\"",
"\">\"",
"\"[\"",
"\"]\"",
"\"{\"",
"\"}\"",
"\"|\"",
"intLit2",
"\"0\"",
"digit++",
"letter",
"digit",
"\"_\"",
"stringPrintable",
"\" \"",
"{\"1\"..\"9\"}",
"{\":\" \"?\"..\"@\"}",
"{\"#\"..\"$\"}",
"{\"A\"..\"Z\"}",
"\"\'\"",
"{\"j\" \"q\"}",
"{\"^\" \"`\" \"~\"}",
"charPrintable",
"\'\"\'",
"ws",
"9",
"eol",
"10",
"13",
"letter++",
"idChar**",
"$$1",
"stringPrintable**",
"$$2",
"token*",
"digit+",
"idChar*",
"stringPrintable*",
"letter+",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 168;}
private static final int MIN_REDUCTION = 715;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+1;
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
0x80000000|215, // match move
0x80000000|165, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 2
2,396, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 3
  }
,
{ // state 4
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 5
94,311, // "e"
  }
,
{ // state 6
0x80000000|150, // match move
0x80000000|356, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 7
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 8
2,20, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 9
2,638, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 10
102,86, // "d"
  }
,
{ // state 11
0x80000000|277, // match move
0x80000000|364, // no-match move
0x80000000|42, // NT-test-match state for digit
  }
,
{ // state 12
167,MIN_REDUCTION+304, // $NT
  }
,
{ // state 13
98,536, // "r"
  }
,
{ // state 14
88,387, // "c"
  }
,
{ // state 15
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 16
2,575, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
157,305, // idChar**
158,523, // $$1
163,106, // idChar*
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 17
167,MIN_REDUCTION+201, // $NT
  }
,
{ // state 18
-1, // $$start
-1, // start
624, // ws*
-1, // $$0
MIN_REDUCTION+122, // token
444, // `boolean
549, // `class
349, // `extends
413, // `void
274, // `int
295, // `while
59, // `if
468, // `else
71, // `for
690, // `break
176, // `this
296, // `false
441, // `true
324, // `super
382, // `null
400, // `return
24, // `instanceof
448, // `new
21, // `abstract
30, // `assert
29, // `byte
611, // `case
639, // `catch
7, // `char
254, // `const
531, // `continue
550, // `default
79, // `do
226, // `double
694, // `enum
361, // `final
225, // `finally
299, // `float
192, // `goto
497, // `implements
501, // `import
62, // `interface
276, // `long
159, // `native
89, // `package
139, // `private
685, // `protected
43, // `public
635, // `short
450, // `static
326, // `strictfp
389, // `switch
691, // `synchronized
701, // `throw
459, // `throws
83, // `transient
671, // `try
208, // `volatile
698, // `!
123, // `!=
291, // `%
145, // `&&
72, // `*
676, // `(
70, // `)
1, // `{
668, // `}
50, // `-
404, // `+
463, // `=
154, // `==
289, // `[
151, // `]
147, // `||
201, // `<
612, // `<=
595, // `,
378, // `>
655, // `>=
452, // `.
271, // `;
577, // `++
25, // `--
266, // `/
-1, // ID
203, // INTLIT
282, // STRINGLIT
110, // CHARLIT
223, // "c"
486, // "l"
443, // "a"
442, // "s"
-1, // idChar
-1, // reserved
539, // "e"
484, // "b"
MIN_REDUCTION+122, // "o"
350, // "n"
219, // "r"
MIN_REDUCTION+122, // "k"
MIN_REDUCTION+122, // "x"
622, // "t"
320, // "d"
431, // "p"
MIN_REDUCTION+122, // "u"
26, // "i"
368, // "v"
233, // "f"
556, // "w"
MIN_REDUCTION+122, // "h"
MIN_REDUCTION+122, // "y"
MIN_REDUCTION+122, // "m"
525, // "g"
MIN_REDUCTION+122, // "z"
237, // "!"
641, // "="
35, // "*"
528, // "%"
205, // "&"
303, // "("
61, // ")"
601, // "+"
664, // ","
196, // "-"
152, // "."
256, // "/"
557, // ";"
178, // "<"
481, // ">"
267, // "["
553, // "]"
428, // "{"
263, // "}"
19, // "|"
-1, // intLit2
MIN_REDUCTION+122, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
175, // " "
MIN_REDUCTION+122, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+122, // {"A".."Z"}
376, // "'"
MIN_REDUCTION+122, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
335, // '"'
118, // ws
175, // {9}
427, // eol
438, // {10}
573, // {13}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 19
133,52, // "|"
  }
,
{ // state 20
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 21
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 22
2,351, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 23
0x80000000|3, // match move
0x80000000|97, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 24
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 25
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 26
97,628, // "n"
107,546, // "f"
111,173, // "m"
  }
,
{ // state 27
0x80000000|3, // match move
0x80000000|99, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 28
167,MIN_REDUCTION+108, // $NT
  }
,
{ // state 29
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 30
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 31
88,363, // "c"
  }
,
{ // state 32
146,81, // "'"
  }
,
{ // state 33
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 34
167,MIN_REDUCTION+138, // $NT
  }
,
{ // state 35
2,128, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 37
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 38
98,487, // "r"
  }
,
{ // state 39
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 40
0x80000000|3, // match move
0x80000000|115, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 41
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 42
135,336, // "0"
142,336, // {"1".."9"}
  }
,
{ // state 43
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 44
0x80000000|45, // match move
0x80000000|167, // no-match move
0x80000000|42, // NT-test-match state for digit
  }
,
{ // state 45
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 46
167,MIN_REDUCTION+96, // $NT
  }
,
{ // state 47
101,513, // "t"
  }
,
{ // state 48
167,MIN_REDUCTION+332, // $NT
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 49
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 51
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 52
2,136, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 53
1,98, // start
2,92, // ws*
3,220, // $$0
4,58, // token
58,698, // `!
59,123, // `!=
60,291, // `%
61,145, // `&&
62,72, // `*
63,676, // `(
64,70, // `)
65,1, // `{
66,668, // `}
67,50, // `-
68,404, // `+
69,463, // `=
70,154, // `==
71,289, // `[
72,151, // `]
73,147, // `||
74,201, // `<
75,612, // `<=
76,595, // `,
77,378, // `>
78,655, // `>=
79,452, // `.
80,271, // `;
81,577, // `++
82,25, // `--
83,266, // `/
84,41, // ID
85,203, // INTLIT
86,282, // STRINGLIT
87,110, // CHARLIT
137,344, // letter
151,118, // ws
153,427, // eol
156,181, // letter++
161,432, // token*
165,246, // letter+
  }
,
{ // state 54
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 55
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 56
94,429, // "e"
  }
,
{ // state 57
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 59
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 60
0x80000000|3, // match move
0x80000000|713, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 61
2,251, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 63
0x80000000|3, // match move
0x80000000|318, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 64
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 65
0x80000000|3, // match move
0x80000000|677, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 66
91,615, // "s"
  }
,
{ // state 67
105,247, // "i"
109,228, // "h"
  }
,
{ // state 68
167,MIN_REDUCTION+225, // $NT
  }
,
{ // state 69
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 72
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 73
94,264, // "e"
  }
,
{ // state 74
2,576, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 75
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 76
0x80000000|3, // match move
0x80000000|705, // no-match move
0x80000000|161, // NT-test-match state for letter
  }
,
{ // state 77
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 78
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 80
103,385, // "p"
  }
,
{ // state 81
2,491, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 83
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 84
167,MIN_REDUCTION+228, // $NT
  }
,
{ // state 85
94,412, // "e"
  }
,
{ // state 86
0x80000000|3, // match move
0x80000000|330, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 87
104,631, // "u"
  }
,
{ // state 88
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+136, // $NT
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 90
0x80000000|3, // match move
0x80000000|673, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 91
94,416, // "e"
  }
,
{ // state 92
0x80000000|462, // match move
0x80000000|319, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 93
89,471, // "l"
  }
,
{ // state 94
167,MIN_REDUCTION+207, // $NT
  }
,
{ // state 95
2,589, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 96
89,419, // "l"
  }
,
{ // state 97
2,395, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 98
166,MIN_REDUCTION+0, // $
  }
,
{ // state 99
2,689, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 100
3,570, // $$0
4,58, // token
5,444, // `boolean
6,549, // `class
7,349, // `extends
8,413, // `void
9,274, // `int
10,295, // `while
11,59, // `if
12,468, // `else
13,71, // `for
14,690, // `break
15,176, // `this
16,296, // `false
17,441, // `true
18,324, // `super
19,382, // `null
20,400, // `return
21,24, // `instanceof
22,448, // `new
23,21, // `abstract
24,30, // `assert
25,29, // `byte
26,611, // `case
27,639, // `catch
28,7, // `char
29,254, // `const
30,531, // `continue
31,550, // `default
32,79, // `do
33,226, // `double
34,694, // `enum
35,361, // `final
36,225, // `finally
37,299, // `float
38,192, // `goto
39,497, // `implements
40,501, // `import
41,62, // `interface
42,276, // `long
43,159, // `native
44,89, // `package
45,139, // `private
46,685, // `protected
47,43, // `public
48,635, // `short
49,450, // `static
50,326, // `strictfp
51,389, // `switch
52,691, // `synchronized
53,701, // `throw
54,459, // `throws
55,83, // `transient
56,671, // `try
57,208, // `volatile
161,432, // token*
  }
,
{ // state 101
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 103
0x80000000|3, // match move
0x80000000|355, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 104
104,257, // "u"
  }
,
{ // state 105
167,MIN_REDUCTION+117, // $NT
  }
,
{ // state 106
0x80000000|377, // match move
0x80000000|69, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 107
0x80000000|3, // match move
0x80000000|177, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 108
94,476, // "e"
  }
,
{ // state 109
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 111
-1, // $$start
-1, // start
447, // ws*
-1, // $$0
MIN_REDUCTION+176, // token
444, // `boolean
549, // `class
349, // `extends
413, // `void
274, // `int
295, // `while
59, // `if
468, // `else
71, // `for
690, // `break
176, // `this
296, // `false
441, // `true
324, // `super
382, // `null
400, // `return
24, // `instanceof
448, // `new
21, // `abstract
30, // `assert
29, // `byte
611, // `case
639, // `catch
7, // `char
254, // `const
531, // `continue
550, // `default
79, // `do
226, // `double
694, // `enum
361, // `final
225, // `finally
299, // `float
192, // `goto
497, // `implements
501, // `import
62, // `interface
276, // `long
159, // `native
89, // `package
139, // `private
685, // `protected
43, // `public
635, // `short
450, // `static
326, // `strictfp
389, // `switch
691, // `synchronized
701, // `throw
459, // `throws
83, // `transient
671, // `try
208, // `volatile
698, // `!
123, // `!=
291, // `%
145, // `&&
72, // `*
676, // `(
70, // `)
1, // `{
668, // `}
50, // `-
404, // `+
463, // `=
154, // `==
289, // `[
151, // `]
147, // `||
201, // `<
612, // `<=
595, // `,
378, // `>
655, // `>=
452, // `.
271, // `;
577, // `++
25, // `--
266, // `/
-1, // ID
203, // INTLIT
282, // STRINGLIT
110, // CHARLIT
223, // "c"
486, // "l"
443, // "a"
442, // "s"
-1, // idChar
-1, // reserved
479, // "e"
484, // "b"
MIN_REDUCTION+176, // "o"
350, // "n"
219, // "r"
MIN_REDUCTION+176, // "k"
MIN_REDUCTION+176, // "x"
622, // "t"
320, // "d"
431, // "p"
631, // "u"
26, // "i"
368, // "v"
233, // "f"
556, // "w"
MIN_REDUCTION+176, // "h"
MIN_REDUCTION+176, // "y"
MIN_REDUCTION+176, // "m"
525, // "g"
MIN_REDUCTION+176, // "z"
237, // "!"
641, // "="
35, // "*"
528, // "%"
205, // "&"
303, // "("
61, // ")"
601, // "+"
664, // ","
196, // "-"
152, // "."
256, // "/"
557, // ";"
178, // "<"
481, // ">"
267, // "["
553, // "]"
428, // "{"
263, // "}"
19, // "|"
-1, // intLit2
MIN_REDUCTION+176, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
175, // " "
MIN_REDUCTION+176, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+176, // {"A".."Z"}
376, // "'"
MIN_REDUCTION+176, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
335, // '"'
118, // ws
175, // {9}
427, // eol
438, // {10}
573, // {13}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 112
167,MIN_REDUCTION+306, // $NT
  }
,
{ // state 113
104,252, // "u"
  }
,
{ // state 114
101,117, // "t"
104,80, // "u"
108,618, // "w"
109,424, // "h"
110,401, // "y"
  }
,
{ // state 115
2,55, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 116
94,436, // "e"
  }
,
{ // state 117
90,658, // "a"
98,379, // "r"
  }
,
{ // state 118
167,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 119
2,590, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 120
97,446, // "n"
  }
,
{ // state 121
94,508, // "e"
  }
,
{ // state 122
167,MIN_REDUCTION+204, // $NT
  }
,
{ // state 123
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 124
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 125
0x80000000|504, // match move
0x80000000|353, // no-match move
0x80000000|161, // NT-test-match state for letter
  }
,
{ // state 126
139,MIN_REDUCTION+311, // "_"
157,MIN_REDUCTION+311, // idChar**
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 127
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 128
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 129
112,239, // "g"
  }
,
{ // state 130
167,MIN_REDUCTION+222, // $NT
  }
,
{ // state 131
107,457, // "f"
  }
,
{ // state 132
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 133
98,445, // "r"
  }
,
{ // state 134
2,312, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 135
102,211, // "d"
  }
,
{ // state 136
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 137
88,440, // "c"
  }
,
{ // state 138
88,63, // "c"
  }
,
{ // state 139
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 140
97,569, // "n"
  }
,
{ // state 141
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 142
101,499, // "t"
  }
,
{ // state 143
5,46, // `boolean
6,399, // `class
7,693, // `extends
8,28, // `void
9,449, // `int
10,483, // `while
11,584, // `if
12,706, // `else
13,466, // `for
14,572, // `break
15,521, // `this
16,105, // `false
17,321, // `true
18,592, // `super
19,366, // `null
20,495, // `return
21,334, // `instanceof
22,703, // `new
23,632, // `abstract
24,605, // `assert
25,502, // `byte
26,674, // `case
27,332, // `catch
28,651, // `char
29,275, // `const
30,352, // `continue
31,398, // `default
32,514, // `do
33,284, // `double
34,402, // `enum
35,327, // `final
36,255, // `finally
37,217, // `float
38,512, // `goto
39,406, // `implements
40,17, // `import
41,122, // `interface
42,94, // `long
43,405, // `native
44,534, // `package
45,580, // `private
46,591, // `protected
47,343, // `public
48,130, // `short
49,68, // `static
50,84, // `strictfp
51,34, // `switch
52,426, // `synchronized
53,258, // `throw
54,596, // `throws
55,563, // `transient
56,574, // `try
57,579, // `volatile
88,223, // "c"
89,486, // "l"
90,443, // "a"
91,442, // "s"
94,479, // "e"
95,484, // "b"
97,350, // "n"
98,219, // "r"
101,622, // "t"
102,320, // "d"
103,431, // "p"
105,26, // "i"
106,368, // "v"
107,233, // "f"
108,556, // "w"
112,525, // "g"
  }
,
{ // state 144
96,120, // "o"
110,238, // "y"
  }
,
{ // state 145
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 148
90,281, // "a"
104,599, // "u"
105,711, // "i"
110,103, // "y"
  }
,
{ // state 149
0x80000000|155, // match move
0x80000000|253, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 150
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 152
2,39, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 153
2,650, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 154
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 156
99,492, // "k"
  }
,
{ // state 157
2,667, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 158
91,191, // "s"
  }
,
{ // state 159
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 160
0x80000000|430, // match move
0x80000000|680, // no-match move
0x80000000|262, // NT-test-match state for stringPrintable
  }
,
{ // state 161
88,496, // "c"
89,496, // "l"
90,496, // "a"
91,496, // "s"
94,496, // "e"
95,496, // "b"
96,496, // "o"
97,496, // "n"
98,496, // "r"
99,496, // "k"
100,496, // "x"
101,496, // "t"
102,496, // "d"
103,496, // "p"
104,496, // "u"
105,496, // "i"
106,496, // "v"
107,496, // "f"
108,496, // "w"
109,496, // "h"
110,496, // "y"
111,496, // "m"
112,496, // "g"
113,496, // "z"
145,496, // {"A".."Z"}
147,496, // {"j" "q"}
  }
,
{ // state 162
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 163
2,306, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 165
0x80000000|610, // match move
0x80000000|216, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 166
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 168
91,695, // "s"
  }
,
{ // state 169
88,700, // "c"
  }
,
{ // state 170
94,603, // "e"
  }
,
{ // state 171
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 172
0x80000000|626, // match move
0x80000000|162, // no-match move
0x80000000|262, // NT-test-match state for stringPrintable
  }
,
{ // state 173
103,293, // "p"
  }
,
{ // state 174
94,552, // "e"
  }
,
{ // state 175
167,MIN_REDUCTION+313, // $NT
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 177
2,386, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 178
0x80000000|261, // match move
0x80000000|153, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 179
90,597, // "a"
  }
,
{ // state 180
0x80000000|657, // match move
0x80000000|506, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 181
0x80000000|666, // match move
0x80000000|16, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 182
108,467, // "w"
  }
,
{ // state 183
105,614, // "i"
  }
,
{ // state 184
101,571, // "t"
  }
,
{ // state 185
97,221, // "n"
  }
,
{ // state 186
101,158, // "t"
  }
,
{ // state 187
88,367, // "c"
89,367, // "l"
90,367, // "a"
91,367, // "s"
94,367, // "e"
95,367, // "b"
96,367, // "o"
97,367, // "n"
98,367, // "r"
99,367, // "k"
100,367, // "x"
101,367, // "t"
102,367, // "d"
103,367, // "p"
104,367, // "u"
105,367, // "i"
106,367, // "v"
107,367, // "f"
108,367, // "w"
109,367, // "h"
110,367, // "y"
111,367, // "m"
112,367, // "g"
113,367, // "z"
114,362, // "!"
115,160, // "="
116,160, // "*"
117,160, // "%"
118,160, // "&"
119,160, // "("
120,160, // ")"
121,160, // "+"
122,160, // ","
123,160, // "-"
124,160, // "."
125,160, // "/"
126,160, // ";"
127,160, // "<"
128,160, // ">"
129,160, // "["
130,367, // "]"
131,367, // "{"
132,367, // "}"
133,367, // "|"
135,160, // "0"
139,367, // "_"
140,629, // stringPrintable
141,362, // " "
142,160, // {"1".."9"}
143,160, // {":" "?".."@"}
144,160, // {"#".."$"}
145,160, // {"A".."Z"}
146,160, // "'"
147,367, // {"j" "q"}
148,367, // {"^" "`" "~"}
  }
,
{ // state 188
109,494, // "h"
  }
,
{ // state 189
105,708, // "i"
  }
,
{ // state 190
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 191
0x80000000|3, // match move
0x80000000|458, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 192
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 193
2,554, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 194
0x80000000|3, // match move
0x80000000|347, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 195
0x80000000|3, // match move
0x80000000|456, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 196
0x80000000|304, // match move
0x80000000|245, // no-match move
// T-test match for "-":
123,
  }
,
{ // state 197
0x80000000|333, // match move
0x80000000|132, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 198
2,453, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 199
0x80000000|3, // match move
0x80000000|288, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 200
0x80000000|3, // match move
0x80000000|594, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 201
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 202
106,529, // "v"
  }
,
{ // state 203
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 204
4,341, // token
5,444, // `boolean
6,549, // `class
7,349, // `extends
8,413, // `void
9,274, // `int
10,295, // `while
11,59, // `if
12,468, // `else
13,71, // `for
14,690, // `break
15,176, // `this
16,296, // `false
17,441, // `true
18,324, // `super
19,382, // `null
20,400, // `return
21,24, // `instanceof
22,448, // `new
23,21, // `abstract
24,30, // `assert
25,29, // `byte
26,611, // `case
27,639, // `catch
28,7, // `char
29,254, // `const
30,531, // `continue
31,550, // `default
32,79, // `do
33,226, // `double
34,694, // `enum
35,361, // `final
36,225, // `finally
37,299, // `float
38,192, // `goto
39,497, // `implements
40,501, // `import
41,62, // `interface
42,276, // `long
43,159, // `native
44,89, // `package
45,139, // `private
46,685, // `protected
47,43, // `public
48,635, // `short
49,450, // `static
50,326, // `strictfp
51,389, // `switch
52,691, // `synchronized
53,701, // `throw
54,459, // `throws
55,83, // `transient
56,671, // `try
57,208, // `volatile
  }
,
{ // state 205
118,259, // "&"
  }
,
{ // state 206
104,133, // "u"
  }
,
{ // state 207
115,283, // "="
  }
,
{ // state 208
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 209
101,578, // "t"
  }
,
{ // state 210
2,57, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 211
91,308, // "s"
  }
,
{ // state 212
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 213
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 214
103,23, // "p"
  }
,
{ // state 215
0x80000000|509, // match move
0x80000000|53, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 216
-1, // $$start
98, // start
92, // ws*
220, // $$0
58, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
698, // `!
123, // `!=
291, // `%
145, // `&&
72, // `*
676, // `(
70, // `)
1, // `{
668, // `}
50, // `-
404, // `+
463, // `=
154, // `==
289, // `[
151, // `]
147, // `||
201, // `<
612, // `<=
595, // `,
378, // `>
655, // `>=
452, // `.
271, // `;
577, // `++
25, // `--
266, // `/
41, // ID
203, // INTLIT
282, // STRINGLIT
110, // CHARLIT
537, // "c"
537, // "l"
537, // "a"
537, // "s"
-1, // idChar
-1, // reserved
537, // "e"
537, // "b"
537, // "o"
537, // "n"
537, // "r"
537, // "k"
537, // "x"
537, // "t"
537, // "d"
537, // "p"
537, // "u"
537, // "i"
537, // "v"
537, // "f"
537, // "w"
537, // "h"
537, // "y"
537, // "m"
537, // "g"
537, // "z"
237, // "!"
641, // "="
35, // "*"
528, // "%"
205, // "&"
303, // "("
61, // ")"
601, // "+"
664, // ","
196, // "-"
152, // "."
256, // "/"
557, // ";"
178, // "<"
481, // ">"
267, // "["
553, // "]"
428, // "{"
263, // "}"
19, // "|"
397, // intLit2
565, // "0"
272, // digit++
344, // letter
44, // digit
-1, // "_"
-1, // stringPrintable
175, // " "
565, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
537, // {"A".."Z"}
376, // "'"
537, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
335, // '"'
118, // ws
175, // {9}
427, // eol
438, // {10}
573, // {13}
181, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
432, // token*
11, // digit+
-1, // idChar*
-1, // stringPrintable*
246, // letter+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 217
167,MIN_REDUCTION+192, // $NT
  }
,
{ // state 218
2,475, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 219
94,530, // "e"
  }
,
{ // state 220
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 221
90,461, // "a"
  }
,
{ // state 222
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 223
89,561, // "l"
90,234, // "a"
96,488, // "o"
109,417, // "h"
  }
,
{ // state 224
96,182, // "o"
  }
,
{ // state 225
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 227
89,116, // "l"
  }
,
{ // state 228
105,96, // "i"
  }
,
{ // state 229
167,MIN_REDUCTION+302, // $NT
  }
,
{ // state 230
91,520, // "s"
  }
,
{ // state 231
98,519, // "r"
  }
,
{ // state 232
88,654, // "c"
  }
,
{ // state 233
89,329, // "l"
90,649, // "a"
96,522, // "o"
105,185, // "i"
  }
,
{ // state 234
91,581, // "s"
101,345, // "t"
  }
,
{ // state 235
98,567, // "r"
  }
,
{ // state 236
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 237
0x80000000|558, // match move
0x80000000|598, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 238
0x80000000|3, // match move
0x80000000|134, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 239
94,194, // "e"
  }
,
{ // state 240
101,617, // "t"
  }
,
{ // state 241
105,616, // "i"
  }
,
{ // state 242
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 243
94,568, // "e"
  }
,
{ // state 244
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 245
2,51, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 246
0x80000000|454, // match move
0x80000000|76, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 247
101,566, // "t"
  }
,
{ // state 248
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 249
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 250
101,394, // "t"
  }
,
{ // state 251
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 252
111,107, // "m"
  }
,
{ // state 253
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 254
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 255
167,MIN_REDUCTION+189, // $NT
  }
,
{ // state 256
2,15, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 257
89,545, // "l"
  }
,
{ // state 258
167,MIN_REDUCTION+234, // $NT
  }
,
{ // state 259
2,325, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 260
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 261
115,548, // "="
  }
,
{ // state 262
88,414, // "c"
89,414, // "l"
90,414, // "a"
91,414, // "s"
94,414, // "e"
95,414, // "b"
96,414, // "o"
97,414, // "n"
98,414, // "r"
99,414, // "k"
100,414, // "x"
101,414, // "t"
102,414, // "d"
103,414, // "p"
104,414, // "u"
105,414, // "i"
106,414, // "v"
107,414, // "f"
108,414, // "w"
109,414, // "h"
110,414, // "y"
111,414, // "m"
112,414, // "g"
113,414, // "z"
114,469, // "!"
115,112, // "="
116,112, // "*"
117,112, // "%"
118,112, // "&"
119,112, // "("
120,112, // ")"
121,112, // "+"
122,112, // ","
123,112, // "-"
124,112, // "."
125,112, // "/"
126,112, // ";"
127,112, // "<"
128,112, // ">"
129,112, // "["
130,414, // "]"
131,414, // "{"
132,414, // "}"
133,414, // "|"
135,112, // "0"
139,414, // "_"
141,469, // " "
142,112, // {"1".."9"}
143,112, // {":" "?".."@"}
144,112, // {"#".."$"}
145,112, // {"A".."Z"}
146,112, // "'"
147,414, // {"j" "q"}
148,414, // {"^" "`" "~"}
  }
,
{ // state 263
2,242, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 264
102,621, // "d"
  }
,
{ // state 265
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 266
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 267
2,64, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 268
121,313, // "+"
  }
,
{ // state 269
0x80000000|3, // match move
0x80000000|163, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 270
0x80000000|582, // match move
0x80000000|249, // no-match move
0x80000000|42, // NT-test-match state for digit
  }
,
{ // state 271
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 272
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 273
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 274
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 275
167,MIN_REDUCTION+168, // $NT
  }
,
{ // state 276
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 277
135,565, // "0"
138,270, // digit
142,565, // {"1".."9"}
  }
,
{ // state 278
105,702, // "i"
  }
,
{ // state 279
101,659, // "t"
  }
,
{ // state 280
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 281
97,660, // "n"
  }
,
{ // state 282
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 283
2,380, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 284
167,MIN_REDUCTION+180, // $NT
  }
,
{ // state 285
101,613, // "t"
  }
,
{ // state 286
96,710, // "o"
  }
,
{ // state 287
101,532, // "t"
  }
,
{ // state 288
2,338, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 290
88,537, // "c"
89,537, // "l"
90,537, // "a"
91,537, // "s"
94,537, // "e"
95,537, // "b"
96,537, // "o"
97,537, // "n"
98,537, // "r"
99,537, // "k"
100,537, // "x"
101,537, // "t"
102,537, // "d"
103,537, // "p"
104,537, // "u"
105,537, // "i"
106,537, // "v"
107,537, // "f"
108,537, // "w"
109,537, // "h"
110,537, // "y"
111,537, // "m"
112,537, // "g"
113,537, // "z"
137,683, // letter
145,537, // {"A".."Z"}
147,537, // {"j" "q"}
  }
,
{ // state 291
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 292
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 293
89,56, // "l"
96,645, // "o"
  }
,
{ // state 294
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 295
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 296
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 297
0x80000000|87, // match move
0x80000000|111, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 298
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 300
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 301
89,619, // "l"
  }
,
{ // state 302
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 303
2,307, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 304
123,375, // "-"
  }
,
{ // state 305
2,575, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
158,146, // $$1
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 306
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 307
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 308
0x80000000|3, // match move
0x80000000|210, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 309
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 310
0x80000000|3, // match move
0x80000000|126, // no-match move
0x80000000|161, // NT-test-match state for letter
  }
,
{ // state 311
0x80000000|3, // match move
0x80000000|472, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 312
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 313
2,317, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 314
167,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 315
90,551, // "a"
  }
,
{ // state 316
106,564, // "v"
  }
,
{ // state 317
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 318
2,260, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 319
0x80000000|633, // match move
0x80000000|393, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 320
94,131, // "e"
96,297, // "o"
  }
,
{ // state 321
167,MIN_REDUCTION+144, // $NT
  }
,
{ // state 322
0x80000000|3, // match move
0x80000000|119, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 323
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 325
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 326
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 327
167,MIN_REDUCTION+186, // $NT
  }
,
{ // state 328
97,648, // "n"
  }
,
{ // state 329
96,527, // "o"
  }
,
{ // state 330
2,222, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 331
105,712, // "i"
  }
,
{ // state 332
167,MIN_REDUCTION+162, // $NT
  }
,
{ // state 333
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 334
167,MIN_REDUCTION+114, // $NT
  }
,
{ // state 335
0x80000000|647, // match move
0x80000000|606, // no-match move
0x80000000|262, // NT-test-match state for stringPrintable
  }
,
{ // state 336
167,MIN_REDUCTION+312, // $NT
  }
,
{ // state 337
0x80000000|302, // match move
0x80000000|358, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 338
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 339
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 340
96,620, // "o"
  }
,
{ // state 341
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 342
104,5, // "u"
  }
,
{ // state 343
167,MIN_REDUCTION+105, // $NT
  }
,
{ // state 344
0x80000000|125, // match move
0x80000000|392, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 345
88,517, // "c"
  }
,
{ // state 346
89,675, // "l"
  }
,
{ // state 347
2,381, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 348
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 349
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 350
90,285, // "a"
94,560, // "e"
104,301, // "u"
  }
,
{ // state 351
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 352
167,MIN_REDUCTION+171, // $NT
  }
,
{ // state 353
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 354
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 355
2,516, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 358
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 359
150,669, // '"'
160,164, // $$2
  }
,
{ // state 360
88,156, // "c"
  }
,
{ // state 361
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 362
0x80000000|538, // match move
0x80000000|36, // no-match move
0x80000000|262, // NT-test-match state for stringPrintable
  }
,
{ // state 363
109,704, // "h"
  }
,
{ // state 364
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 365
91,585, // "s"
101,278, // "t"
  }
,
{ // state 366
167,MIN_REDUCTION+129, // $NT
  }
,
{ // state 367
0x80000000|82, // match move
0x80000000|354, // no-match move
0x80000000|262, // NT-test-match state for stringPrintable
  }
,
{ // state 368
96,451, // "o"
  }
,
{ // state 369
91,91, // "s"
  }
,
{ // state 370
91,644, // "s"
  }
,
{ // state 371
2,292, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 372
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 373
0x80000000|357, // match move
0x80000000|524, // no-match move
0x80000000|161, // NT-test-match state for letter
  }
,
{ // state 374
2,323, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 375
2,500, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 376
88,190, // "c"
89,190, // "l"
90,190, // "a"
91,190, // "s"
94,190, // "e"
95,190, // "b"
96,190, // "o"
97,190, // "n"
98,190, // "r"
99,190, // "k"
100,190, // "x"
101,190, // "t"
102,190, // "d"
103,190, // "p"
104,190, // "u"
105,190, // "i"
106,190, // "v"
107,190, // "f"
108,190, // "w"
109,190, // "h"
110,190, // "y"
111,190, // "m"
112,190, // "g"
113,190, // "z"
114,661, // "!"
115,503, // "="
116,503, // "*"
117,661, // "%"
118,661, // "&"
119,503, // "("
120,503, // ")"
121,503, // "+"
122,503, // ","
123,503, // "-"
124,503, // "."
125,503, // "/"
126,503, // ";"
127,503, // "<"
128,503, // ">"
129,503, // "["
130,190, // "]"
131,190, // "{"
132,190, // "}"
133,190, // "|"
135,503, // "0"
139,190, // "_"
141,661, // " "
142,503, // {"1".."9"}
143,503, // {":" "?".."@"}
144,661, // {"#".."$"}
145,503, // {"A".."Z"}
147,190, // {"j" "q"}
148,190, // {"^" "`" "~"}
149,32, // charPrintable
150,661, // '"'
  }
,
{ // state 377
88,149, // "c"
89,149, // "l"
90,149, // "a"
91,149, // "s"
92,197, // idChar
94,149, // "e"
95,149, // "b"
96,149, // "o"
97,149, // "n"
98,149, // "r"
99,149, // "k"
100,149, // "x"
101,149, // "t"
102,149, // "d"
103,149, // "p"
104,149, // "u"
105,149, // "i"
106,149, // "v"
107,149, // "f"
108,149, // "w"
109,149, // "h"
110,149, // "y"
111,149, // "m"
112,149, // "g"
113,149, // "z"
135,588, // "0"
137,493, // letter
138,337, // digit
139,6, // "_"
142,588, // {"1".."9"}
145,149, // {"A".."Z"}
147,149, // {"j" "q"}
  }
,
{ // state 378
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 379
105,711, // "i"
  }
,
{ // state 380
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 381
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 383
2,33, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 384
96,142, // "o"
105,316, // "i"
  }
,
{ // state 385
94,663, // "e"
  }
,
{ // state 386
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 387
101,73, // "t"
  }
,
{ // state 388
2,88, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 389
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 390
4,341, // token
58,698, // `!
59,123, // `!=
60,291, // `%
61,145, // `&&
62,72, // `*
63,676, // `(
64,70, // `)
65,1, // `{
66,668, // `}
67,50, // `-
68,404, // `+
69,463, // `=
70,154, // `==
71,289, // `[
72,151, // `]
73,147, // `||
74,201, // `<
75,612, // `<=
76,595, // `,
77,378, // `>
78,655, // `>=
79,452, // `.
80,271, // `;
81,577, // `++
82,25, // `--
83,266, // `/
84,41, // ID
85,203, // INTLIT
86,282, // STRINGLIT
87,110, // CHARLIT
137,344, // letter
156,181, // letter++
165,246, // letter+
  }
,
{ // state 391
110,238, // "y"
  }
,
{ // state 392
0x80000000|3, // match move
0x80000000|672, // no-match move
0x80000000|161, // NT-test-match state for letter
  }
,
{ // state 393
-1, // $$start
-1, // start
-1, // ws*
570, // $$0
58, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
698, // `!
123, // `!=
291, // `%
145, // `&&
72, // `*
676, // `(
70, // `)
1, // `{
668, // `}
50, // `-
404, // `+
463, // `=
154, // `==
289, // `[
151, // `]
147, // `||
201, // `<
612, // `<=
595, // `,
378, // `>
655, // `>=
452, // `.
271, // `;
577, // `++
25, // `--
266, // `/
41, // ID
203, // INTLIT
282, // STRINGLIT
110, // CHARLIT
537, // "c"
537, // "l"
537, // "a"
537, // "s"
-1, // idChar
-1, // reserved
537, // "e"
537, // "b"
537, // "o"
537, // "n"
537, // "r"
537, // "k"
537, // "x"
537, // "t"
537, // "d"
537, // "p"
537, // "u"
537, // "i"
537, // "v"
537, // "f"
537, // "w"
537, // "h"
537, // "y"
537, // "m"
537, // "g"
537, // "z"
237, // "!"
641, // "="
35, // "*"
528, // "%"
205, // "&"
303, // "("
61, // ")"
601, // "+"
664, // ","
196, // "-"
152, // "."
256, // "/"
557, // ";"
178, // "<"
481, // ">"
267, // "["
553, // "]"
428, // "{"
263, // "}"
19, // "|"
397, // intLit2
565, // "0"
272, // digit++
344, // letter
44, // digit
-1, // "_"
-1, // stringPrintable
175, // " "
565, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
537, // {"A".."Z"}
376, // "'"
537, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
335, // '"'
48, // ws
175, // {9}
427, // eol
438, // {10}
573, // {13}
181, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
432, // token*
11, // digit+
-1, // idChar*
-1, // stringPrintable*
246, // letter+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 394
0x80000000|3, // match move
0x80000000|218, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 395
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 396
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 397
2,678, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 398
167,MIN_REDUCTION+174, // $NT
  }
,
{ // state 399
167,MIN_REDUCTION+90, // $NT
  }
,
{ // state 400
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 401
97,31, // "n"
  }
,
{ // state 402
167,MIN_REDUCTION+183, // $NT
  }
,
{ // state 403
0x80000000|3, // match move
0x80000000|686, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 404
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 405
167,MIN_REDUCTION+210, // $NT
  }
,
{ // state 406
167,MIN_REDUCTION+198, // $NT
  }
,
{ // state 407
98,224, // "r"
105,370, // "i"
  }
,
{ // state 408
101,121, // "t"
  }
,
{ // state 409
2,236, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 410
0x80000000|609, // match move
0x80000000|18, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 411
2,37, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 412
98,47, // "r"
  }
,
{ // state 413
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 414
167,MIN_REDUCTION+307, // $NT
  }
,
{ // state 415
115,371, // "="
  }
,
{ // state 416
0x80000000|3, // match move
0x80000000|696, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 417
90,13, // "a"
  }
,
{ // state 418
0x80000000|3, // match move
0x80000000|498, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 419
94,474, // "e"
  }
,
{ // state 420
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 421
0x80000000|212, // match move
0x80000000|280, // no-match move
0x80000000|161, // NT-test-match state for letter
  }
,
{ // state 422
-1, // $$start
-1, // start
586, // ws*
-1, // $$0
MIN_REDUCTION+185, // token
444, // `boolean
549, // `class
349, // `extends
413, // `void
274, // `int
295, // `while
59, // `if
468, // `else
71, // `for
690, // `break
176, // `this
296, // `false
441, // `true
324, // `super
382, // `null
400, // `return
24, // `instanceof
448, // `new
21, // `abstract
30, // `assert
29, // `byte
611, // `case
639, // `catch
7, // `char
254, // `const
531, // `continue
550, // `default
79, // `do
226, // `double
694, // `enum
361, // `final
225, // `finally
299, // `float
192, // `goto
497, // `implements
501, // `import
62, // `interface
276, // `long
159, // `native
89, // `package
139, // `private
685, // `protected
43, // `public
635, // `short
450, // `static
326, // `strictfp
389, // `switch
691, // `synchronized
701, // `throw
459, // `throws
83, // `transient
671, // `try
208, // `volatile
698, // `!
123, // `!=
291, // `%
145, // `&&
72, // `*
676, // `(
70, // `)
1, // `{
668, // `}
50, // `-
404, // `+
463, // `=
154, // `==
289, // `[
151, // `]
147, // `||
201, // `<
612, // `<=
595, // `,
378, // `>
655, // `>=
452, // `.
271, // `;
577, // `++
25, // `--
266, // `/
-1, // ID
203, // INTLIT
282, // STRINGLIT
110, // CHARLIT
223, // "c"
144, // "l"
443, // "a"
442, // "s"
-1, // idChar
-1, // reserved
479, // "e"
484, // "b"
MIN_REDUCTION+185, // "o"
350, // "n"
219, // "r"
MIN_REDUCTION+185, // "k"
MIN_REDUCTION+185, // "x"
622, // "t"
320, // "d"
431, // "p"
MIN_REDUCTION+185, // "u"
26, // "i"
368, // "v"
233, // "f"
556, // "w"
MIN_REDUCTION+185, // "h"
MIN_REDUCTION+185, // "y"
MIN_REDUCTION+185, // "m"
525, // "g"
MIN_REDUCTION+185, // "z"
237, // "!"
641, // "="
35, // "*"
528, // "%"
205, // "&"
303, // "("
61, // ")"
601, // "+"
664, // ","
196, // "-"
152, // "."
256, // "/"
557, // ";"
178, // "<"
481, // ">"
267, // "["
553, // "]"
428, // "{"
263, // "}"
19, // "|"
-1, // intLit2
MIN_REDUCTION+185, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
175, // " "
MIN_REDUCTION+185, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+185, // {"A".."Z"}
376, // "'"
MIN_REDUCTION+185, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
335, // '"'
118, // ws
175, // {9}
427, // eol
438, // {10}
573, // {13}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 423
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 424
96,38, // "o"
  }
,
{ // state 425
2,665, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 426
167,MIN_REDUCTION+231, // $NT
  }
,
{ // state 427
167,MIN_REDUCTION+314, // $NT
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 428
2,339, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 429
111,108, // "m"
  }
,
{ // state 430
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 431
90,360, // "a"
98,384, // "r"
104,433, // "u"
  }
,
{ // state 432
0x80000000|480, // match move
0x80000000|180, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 433
95,93, // "b"
  }
,
{ // state 434
-1, // $$start
-1, // start
423, // ws*
-1, // $$0
MIN_REDUCTION+233, // token
444, // `boolean
549, // `class
349, // `extends
413, // `void
274, // `int
295, // `while
59, // `if
468, // `else
71, // `for
690, // `break
176, // `this
296, // `false
441, // `true
324, // `super
382, // `null
400, // `return
24, // `instanceof
448, // `new
21, // `abstract
30, // `assert
29, // `byte
611, // `case
639, // `catch
7, // `char
254, // `const
531, // `continue
550, // `default
79, // `do
226, // `double
694, // `enum
361, // `final
225, // `finally
299, // `float
192, // `goto
497, // `implements
501, // `import
62, // `interface
276, // `long
159, // `native
89, // `package
139, // `private
685, // `protected
43, // `public
635, // `short
450, // `static
326, // `strictfp
389, // `switch
691, // `synchronized
701, // `throw
459, // `throws
83, // `transient
671, // `try
208, // `volatile
698, // `!
123, // `!=
291, // `%
145, // `&&
72, // `*
676, // `(
70, // `)
1, // `{
668, // `}
50, // `-
404, // `+
463, // `=
154, // `==
289, // `[
151, // `]
147, // `||
201, // `<
612, // `<=
595, // `,
378, // `>
655, // `>=
452, // `.
271, // `;
577, // `++
25, // `--
266, // `/
-1, // ID
203, // INTLIT
282, // STRINGLIT
110, // CHARLIT
223, // "c"
486, // "l"
443, // "a"
490, // "s"
-1, // idChar
-1, // reserved
479, // "e"
484, // "b"
MIN_REDUCTION+233, // "o"
350, // "n"
219, // "r"
MIN_REDUCTION+233, // "k"
MIN_REDUCTION+233, // "x"
622, // "t"
320, // "d"
431, // "p"
MIN_REDUCTION+233, // "u"
26, // "i"
368, // "v"
233, // "f"
556, // "w"
MIN_REDUCTION+233, // "h"
MIN_REDUCTION+233, // "y"
MIN_REDUCTION+233, // "m"
525, // "g"
MIN_REDUCTION+233, // "z"
237, // "!"
641, // "="
35, // "*"
528, // "%"
205, // "&"
303, // "("
61, // ")"
601, // "+"
664, // ","
196, // "-"
152, // "."
256, // "/"
557, // ";"
178, // "<"
481, // ">"
267, // "["
553, // "]"
428, // "{"
263, // "}"
19, // "|"
-1, // intLit2
MIN_REDUCTION+233, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
175, // " "
MIN_REDUCTION+233, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+233, // {"A".."Z"}
376, // "'"
MIN_REDUCTION+233, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
335, // '"'
118, // ws
175, // {9}
427, // eol
438, // {10}
573, // {13}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 435
2,109, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 436
90,140, // "a"
  }
,
{ // state 437
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 438
167,MIN_REDUCTION+315, // $NT
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 439
0x80000000|3, // match move
0x80000000|374, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 440
94,630, // "e"
  }
,
{ // state 441
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 442
101,117, // "t"
104,80, // "u"
108,618, // "w"
109,424, // "h"
110,401, // "y"
  }
,
{ // state 443
91,623, // "s"
95,66, // "b"
  }
,
{ // state 444
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 445
97,518, // "n"
  }
,
{ // state 446
112,511, // "g"
  }
,
{ // state 447
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 448
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 449
167,MIN_REDUCTION+123, // $NT
  }
,
{ // state 450
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 451
89,315, // "l"
105,10, // "i"
  }
,
{ // state 452
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 453
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 454
0x80000000|290, // match move
0x80000000|102, // no-match move
0x80000000|161, // NT-test-match state for letter
  }
,
{ // state 455
2,75, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 456
2,78, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 457
90,104, // "a"
  }
,
{ // state 458
2,77, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 459
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 460
0x80000000|3, // match move
0x80000000|679, // no-match move
0x80000000|161, // NT-test-match state for letter
  }
,
{ // state 461
89,544, // "l"
  }
,
{ // state 462
0x80000000|100, // match move
0x80000000|533, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 463
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 464
99,485, // "k"
  }
,
{ // state 465
2,372, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 466
167,MIN_REDUCTION+111, // $NT
  }
,
{ // state 467
0x80000000|540, // match move
0x80000000|434, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 468
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 469
167,MIN_REDUCTION+305, // $NT
  }
,
{ // state 470
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 471
105,138, // "i"
  }
,
{ // state 472
2,684, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 473
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 474
0x80000000|3, // match move
0x80000000|198, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 475
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 476
97,186, // "n"
  }
,
{ // state 477
90,281, // "a"
104,599, // "u"
110,103, // "y"
  }
,
{ // state 478
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 479
89,369, // "l"
97,113, // "n"
100,408, // "x"
  }
,
{ // state 480
0x80000000|204, // match move
0x80000000|390, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 481
0x80000000|415, // match move
0x80000000|2, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 482
2,437, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 483
167,MIN_REDUCTION+147, // $NT
  }
,
{ // state 484
96,526, // "o"
98,170, // "r"
110,240, // "y"
  }
,
{ // state 485
0x80000000|3, // match move
0x80000000|435, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 486
96,120, // "o"
  }
,
{ // state 487
101,587, // "t"
  }
,
{ // state 488
97,365, // "n"
  }
,
{ // state 489
101,179, // "t"
  }
,
{ // state 490
0x80000000|114, // match move
0x80000000|670, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 491
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 492
90,129, // "a"
  }
,
{ // state 493
0x80000000|627, // match move
0x80000000|473, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 494
0x80000000|3, // match move
0x80000000|388, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 495
167,MIN_REDUCTION+132, // $NT
  }
,
{ // state 496
167,MIN_REDUCTION+311, // $NT
  }
,
{ // state 497
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 498
2,213, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 499
94,14, // "e"
  }
,
{ // state 500
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 501
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 502
167,MIN_REDUCTION+156, // $NT
  }
,
{ // state 503
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 504
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 505
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 506
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
341, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
698, // `!
123, // `!=
291, // `%
145, // `&&
72, // `*
676, // `(
70, // `)
1, // `{
668, // `}
50, // `-
404, // `+
463, // `=
154, // `==
289, // `[
151, // `]
147, // `||
201, // `<
612, // `<=
595, // `,
378, // `>
655, // `>=
452, // `.
271, // `;
577, // `++
25, // `--
266, // `/
41, // ID
203, // INTLIT
282, // STRINGLIT
110, // CHARLIT
537, // "c"
537, // "l"
537, // "a"
537, // "s"
-1, // idChar
-1, // reserved
537, // "e"
537, // "b"
537, // "o"
537, // "n"
537, // "r"
537, // "k"
537, // "x"
537, // "t"
537, // "d"
537, // "p"
537, // "u"
537, // "i"
537, // "v"
537, // "f"
537, // "w"
537, // "h"
537, // "y"
537, // "m"
537, // "g"
537, // "z"
237, // "!"
641, // "="
35, // "*"
528, // "%"
205, // "&"
303, // "("
61, // ")"
601, // "+"
664, // ","
196, // "-"
152, // "."
256, // "/"
557, // ";"
178, // "<"
481, // ">"
267, // "["
553, // "]"
428, // "{"
263, // "}"
19, // "|"
397, // intLit2
565, // "0"
272, // digit++
344, // letter
44, // digit
-1, // "_"
-1, // stringPrintable
-1, // " "
565, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
537, // {"A".."Z"}
376, // "'"
537, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
335, // '"'
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
181, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // token*
11, // digit+
-1, // idChar*
-1, // stringPrintable*
246, // letter+
MIN_REDUCTION+342, // $
-1, // $NT
  }
,
{ // state 507
90,137, // "a"
  }
,
{ // state 508
97,135, // "n"
  }
,
{ // state 509
1,98, // start
2,92, // ws*
3,220, // $$0
4,58, // token
5,444, // `boolean
6,549, // `class
7,349, // `extends
8,413, // `void
9,274, // `int
10,295, // `while
11,59, // `if
12,468, // `else
13,71, // `for
14,690, // `break
15,176, // `this
16,296, // `false
17,441, // `true
18,324, // `super
19,382, // `null
20,400, // `return
21,24, // `instanceof
22,448, // `new
23,21, // `abstract
24,30, // `assert
25,29, // `byte
26,611, // `case
27,639, // `catch
28,7, // `char
29,254, // `const
30,531, // `continue
31,550, // `default
32,79, // `do
33,226, // `double
34,694, // `enum
35,361, // `final
36,225, // `finally
37,299, // `float
38,192, // `goto
39,497, // `implements
40,501, // `import
41,62, // `interface
42,276, // `long
43,159, // `native
44,89, // `package
45,139, // `private
46,685, // `protected
47,43, // `public
48,635, // `short
49,450, // `static
50,326, // `strictfp
51,389, // `switch
52,691, // `synchronized
53,701, // `throw
54,459, // `throws
55,83, // `transient
56,671, // `try
57,208, // `volatile
161,432, // token*
  }
,
{ // state 510
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 511
0x80000000|3, // match move
0x80000000|411, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 512
167,MIN_REDUCTION+195, // $NT
  }
,
{ // state 513
0x80000000|3, // match move
0x80000000|409, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 514
167,MIN_REDUCTION+177, // $NT
  }
,
{ // state 515
90,658, // "a"
98,148, // "r"
109,407, // "h"
  }
,
{ // state 516
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 517
109,583, // "h"
  }
,
{ // state 518
0x80000000|3, // match move
0x80000000|625, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 519
107,507, // "f"
  }
,
{ // state 520
94,65, // "e"
  }
,
{ // state 521
167,MIN_REDUCTION+141, // $NT
  }
,
{ // state 522
98,642, // "r"
  }
,
{ // state 523
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 524
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 525
96,209, // "o"
  }
,
{ // state 526
96,227, // "o"
  }
,
{ // state 527
90,250, // "a"
  }
,
{ // state 528
2,248, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 529
94,195, // "e"
  }
,
{ // state 530
101,206, // "t"
  }
,
{ // state 531
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 532
0x80000000|3, // match move
0x80000000|653, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 533
3,570, // $$0
4,58, // token
58,698, // `!
59,123, // `!=
60,291, // `%
61,145, // `&&
62,72, // `*
63,676, // `(
64,70, // `)
65,1, // `{
66,668, // `}
67,50, // `-
68,404, // `+
69,463, // `=
70,154, // `==
71,289, // `[
72,151, // `]
73,147, // `||
74,201, // `<
75,612, // `<=
76,595, // `,
77,378, // `>
78,655, // `>=
79,452, // `.
80,271, // `;
81,577, // `++
82,25, // `--
83,266, // `/
84,41, // ID
85,203, // INTLIT
86,282, // STRINGLIT
87,110, // CHARLIT
137,344, // letter
151,48, // ws
153,427, // eol
156,181, // letter++
161,432, // token*
165,246, // letter+
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 534
167,MIN_REDUCTION+213, // $NT
  }
,
{ // state 535
0x80000000|187, // match move
0x80000000|470, // no-match move
0x80000000|262, // NT-test-match state for stringPrintable
  }
,
{ // state 536
0x80000000|3, // match move
0x80000000|95, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 537
0x80000000|373, // match move
0x80000000|310, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 538
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 539
89,369, // "l"
97,113, // "n"
98,519, // "r"
100,408, // "x"
  }
,
{ // state 540
91,60, // "s"
  }
,
{ // state 541
0x80000000|3, // match move
0x80000000|157, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 542
2,699, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 543
2,49, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 544
0x80000000|604, // match move
0x80000000|422, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 545
101,90, // "t"
  }
,
{ // state 546
0x80000000|3, // match move
0x80000000|646, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 547
88,496, // "c"
89,496, // "l"
90,496, // "a"
91,496, // "s"
94,496, // "e"
95,496, // "b"
96,496, // "o"
97,496, // "n"
98,496, // "r"
99,496, // "k"
100,496, // "x"
101,496, // "t"
102,496, // "d"
103,496, // "p"
104,496, // "u"
105,496, // "i"
106,496, // "v"
107,496, // "f"
108,496, // "w"
109,496, // "h"
110,496, // "y"
111,496, // "m"
112,496, // "g"
113,496, // "z"
135,336, // "0"
137,229, // letter
138,643, // digit
139,12, // "_"
142,336, // {"1".."9"}
145,496, // {"A".."Z"}
147,496, // {"j" "q"}
  }
,
{ // state 548
2,166, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 549
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 550
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 551
101,183, // "t"
  }
,
{ // state 552
102,562, // "d"
  }
,
{ // state 553
2,4, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 554
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 555
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 556
109,228, // "h"
  }
,
{ // state 557
2,171, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 558
115,193, // "="
  }
,
{ // state 559
2,300, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 560
108,688, // "w"
  }
,
{ // state 561
90,168, // "a"
  }
,
{ // state 562
0x80000000|3, // match move
0x80000000|652, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 563
167,MIN_REDUCTION+240, // $NT
  }
,
{ // state 564
90,184, // "a"
  }
,
{ // state 565
0x80000000|127, // match move
0x80000000|505, // no-match move
0x80000000|42, // NT-test-match state for digit
  }
,
{ // state 566
88,188, // "c"
  }
,
{ // state 567
90,169, // "a"
  }
,
{ // state 568
0x80000000|3, // match move
0x80000000|482, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 569
0x80000000|3, // match move
0x80000000|637, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 570
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 571
94,269, // "e"
  }
,
{ // state 572
167,MIN_REDUCTION+99, // $NT
  }
,
{ // state 573
0x80000000|607, // match move
0x80000000|314, // no-match move
// T-test match for 10:
154,
  }
,
{ // state 574
167,MIN_REDUCTION+243, // $NT
  }
,
{ // state 575
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 576
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 577
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 578
96,687, // "o"
  }
,
{ // state 579
167,MIN_REDUCTION+246, // $NT
  }
,
{ // state 580
167,MIN_REDUCTION+216, // $NT
  }
,
{ // state 581
94,322, // "e"
  }
,
{ // state 582
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 583
0x80000000|3, // match move
0x80000000|681, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 584
167,MIN_REDUCTION+120, // $NT
  }
,
{ // state 585
101,27, // "t"
  }
,
{ // state 586
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 587
0x80000000|3, // match move
0x80000000|455, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 588
0x80000000|662, // match move
0x80000000|54, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 589
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 590
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 591
167,MIN_REDUCTION+219, // $NT
  }
,
{ // state 592
167,MIN_REDUCTION+135, // $NT
  }
,
{ // state 593
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 594
2,348, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 595
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 596
167,MIN_REDUCTION+237, // $NT
  }
,
{ // state 597
97,232, // "n"
  }
,
{ // state 598
2,478, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 599
94,640, // "e"
  }
,
{ // state 600
0x80000000|141, // match move
0x80000000|273, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 601
0x80000000|268, // match move
0x80000000|465, // no-match move
// T-test match for "+":
121,
  }
,
{ // state 602
2,692, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 603
90,464, // "a"
  }
,
{ // state 604
89,391, // "l"
  }
,
{ // state 605
167,MIN_REDUCTION+153, // $NT
  }
,
{ // state 606
150,669, // '"'
159,359, // stringPrintable**
160,420, // $$2
164,535, // stringPrintable*
  }
,
{ // state 607
154,608, // {10}
  }
,
{ // state 608
167,MIN_REDUCTION+316, // $NT
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 609
94,231, // "e"
  }
,
{ // state 610
1,98, // start
2,92, // ws*
3,220, // $$0
4,58, // token
5,444, // `boolean
6,549, // `class
7,349, // `extends
8,413, // `void
9,274, // `int
10,295, // `while
11,59, // `if
12,468, // `else
13,71, // `for
14,690, // `break
15,176, // `this
16,296, // `false
17,441, // `true
18,324, // `super
19,382, // `null
20,400, // `return
21,24, // `instanceof
22,448, // `new
23,21, // `abstract
24,30, // `assert
25,29, // `byte
26,611, // `case
27,639, // `catch
28,7, // `char
29,254, // `const
30,531, // `continue
31,550, // `default
32,79, // `do
33,226, // `double
34,694, // `enum
35,361, // `final
36,225, // `finally
37,299, // `float
38,192, // `goto
39,497, // `implements
40,501, // `import
41,62, // `interface
42,276, // `long
43,159, // `native
44,89, // `package
45,139, // `private
46,685, // `protected
47,43, // `public
48,635, // `short
49,450, // `static
50,326, // `strictfp
51,389, // `switch
52,691, // `synchronized
53,701, // `throw
54,459, // `throws
55,83, // `transient
56,671, // `try
57,208, // `volatile
88,223, // "c"
89,486, // "l"
90,443, // "a"
91,442, // "s"
94,479, // "e"
95,484, // "b"
97,350, // "n"
98,219, // "r"
101,622, // "t"
102,320, // "d"
103,431, // "p"
105,26, // "i"
106,368, // "v"
107,233, // "f"
108,556, // "w"
112,525, // "g"
161,432, // token*
166,MIN_REDUCTION+1, // $
  }
,
{ // state 611
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 612
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 613
105,202, // "i"
  }
,
{ // state 614
89,243, // "l"
  }
,
{ // state 615
101,235, // "t"
  }
,
{ // state 616
113,174, // "z"
  }
,
{ // state 617
94,40, // "e"
  }
,
{ // state 618
105,247, // "i"
  }
,
{ // state 619
89,418, // "l"
  }
,
{ // state 620
97,241, // "n"
  }
,
{ // state 621
0x80000000|3, // match move
0x80000000|8, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 622
98,477, // "r"
109,407, // "h"
  }
,
{ // state 623
91,85, // "s"
  }
,
{ // state 624
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 625
2,265, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 626
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 627
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 628
91,489, // "s"
101,410, // "t"
  }
,
{ // state 629
0x80000000|707, // match move
0x80000000|298, // no-match move
0x80000000|262, // NT-test-match state for stringPrintable
  }
,
{ // state 630
0x80000000|3, // match move
0x80000000|9, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 631
95,346, // "b"
  }
,
{ // state 632
167,MIN_REDUCTION+150, // $NT
  }
,
{ // state 633
3,570, // $$0
4,58, // token
5,444, // `boolean
6,549, // `class
7,349, // `extends
8,413, // `void
9,274, // `int
10,295, // `while
11,59, // `if
12,468, // `else
13,71, // `for
14,690, // `break
15,176, // `this
16,296, // `false
17,441, // `true
18,324, // `super
19,382, // `null
20,400, // `return
21,24, // `instanceof
22,448, // `new
23,21, // `abstract
24,30, // `assert
25,29, // `byte
26,611, // `case
27,639, // `catch
28,7, // `char
29,254, // `const
30,531, // `continue
31,550, // `default
32,79, // `do
33,226, // `double
34,694, // `enum
35,361, // `final
36,225, // `finally
37,299, // `float
38,192, // `goto
39,497, // `implements
40,501, // `import
41,62, // `interface
42,276, // `long
43,159, // `native
44,89, // `package
45,139, // `private
46,685, // `protected
47,43, // `public
48,635, // `short
49,450, // `static
50,326, // `strictfp
51,389, // `switch
52,691, // `synchronized
53,701, // `throw
54,459, // `throws
55,83, // `transient
56,671, // `try
57,208, // `volatile
88,223, // "c"
89,486, // "l"
90,443, // "a"
91,442, // "s"
94,479, // "e"
95,484, // "b"
97,350, // "n"
98,219, // "r"
101,622, // "t"
102,320, // "d"
103,431, // "p"
105,26, // "i"
106,368, // "v"
107,233, // "f"
108,556, // "w"
112,525, // "g"
161,432, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 634
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 635
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 636
0x80000000|3, // match move
0x80000000|22, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 637
2,244, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 638
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 639
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 640
0x80000000|3, // match move
0x80000000|383, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 641
0x80000000|207, // match move
0x80000000|74, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 642
0x80000000|3, // match move
0x80000000|542, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 643
167,MIN_REDUCTION+303, // $NT
  }
,
{ // state 644
0x80000000|3, // match move
0x80000000|543, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 645
98,287, // "r"
  }
,
{ // state 646
2,294, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 647
88,367, // "c"
89,367, // "l"
90,367, // "a"
91,367, // "s"
94,367, // "e"
95,367, // "b"
96,367, // "o"
97,367, // "n"
98,367, // "r"
99,367, // "k"
100,367, // "x"
101,367, // "t"
102,367, // "d"
103,367, // "p"
104,367, // "u"
105,367, // "i"
106,367, // "v"
107,367, // "f"
108,367, // "w"
109,367, // "h"
110,367, // "y"
111,367, // "m"
112,367, // "g"
113,367, // "z"
114,362, // "!"
115,160, // "="
116,160, // "*"
117,160, // "%"
118,160, // "&"
119,160, // "("
120,160, // ")"
121,160, // "+"
122,160, // ","
123,160, // "-"
124,160, // "."
125,160, // "/"
126,160, // ";"
127,160, // "<"
128,160, // ">"
129,160, // "["
130,367, // "]"
131,367, // "{"
132,367, // "}"
133,367, // "|"
135,160, // "0"
139,367, // "_"
140,172, // stringPrintable
141,362, // " "
142,160, // {"1".."9"}
143,160, // {":" "?".."@"}
144,160, // {"#".."$"}
145,160, // {"A".."Z"}
146,160, // "'"
147,367, // {"j" "q"}
148,367, // {"^" "`" "~"}
159,359, // stringPrintable**
164,535, // stringPrintable*
  }
,
{ // state 648
101,403, // "t"
  }
,
{ // state 649
89,230, // "l"
  }
,
{ // state 650
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 651
167,MIN_REDUCTION+165, // $NT
  }
,
{ // state 652
2,593, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 653
2,510, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 654
94,286, // "e"
  }
,
{ // state 655
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 656
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 657
4,341, // token
5,444, // `boolean
6,549, // `class
7,349, // `extends
8,413, // `void
9,274, // `int
10,295, // `while
11,59, // `if
12,468, // `else
13,71, // `for
14,690, // `break
15,176, // `this
16,296, // `false
17,441, // `true
18,324, // `super
19,382, // `null
20,400, // `return
21,24, // `instanceof
22,448, // `new
23,21, // `abstract
24,30, // `assert
25,29, // `byte
26,611, // `case
27,639, // `catch
28,7, // `char
29,254, // `const
30,531, // `continue
31,550, // `default
32,79, // `do
33,226, // `double
34,694, // `enum
35,361, // `final
36,225, // `finally
37,299, // `float
38,192, // `goto
39,497, // `implements
40,501, // `import
41,62, // `interface
42,276, // `long
43,159, // `native
44,89, // `package
45,139, // `private
46,685, // `protected
47,43, // `public
48,635, // `short
49,450, // `static
50,326, // `strictfp
51,389, // `switch
52,691, // `synchronized
53,701, // `throw
54,459, // `throws
55,83, // `transient
56,671, // `try
57,208, // `volatile
88,223, // "c"
89,486, // "l"
90,443, // "a"
91,442, // "s"
94,479, // "e"
95,484, // "b"
97,350, // "n"
98,219, // "r"
101,622, // "t"
102,320, // "d"
103,431, // "p"
105,26, // "i"
106,368, // "v"
107,233, // "f"
108,556, // "w"
112,525, // "g"
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 658
101,331, // "t"
  }
,
{ // state 659
107,214, // "f"
  }
,
{ // state 660
91,189, // "s"
  }
,
{ // state 661
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 662
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 663
98,636, // "r"
  }
,
{ // state 664
2,124, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 665
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 666
88,149, // "c"
89,149, // "l"
90,149, // "a"
91,149, // "s"
92,600, // idChar
94,149, // "e"
95,149, // "b"
96,149, // "o"
97,149, // "n"
98,149, // "r"
99,149, // "k"
100,149, // "x"
101,149, // "t"
102,149, // "d"
103,149, // "p"
104,149, // "u"
105,149, // "i"
106,149, // "v"
107,149, // "f"
108,149, // "w"
109,149, // "h"
110,149, // "y"
111,149, // "m"
112,149, // "g"
113,149, // "z"
135,588, // "0"
137,493, // letter
138,337, // digit
139,6, // "_"
142,588, // {"1".."9"}
145,149, // {"A".."Z"}
147,149, // {"j" "q"}
157,305, // idChar**
163,106, // idChar*
  }
,
{ // state 667
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 668
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 669
2,101, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 670
-1, // $$start
-1, // start
709, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
444, // `boolean
549, // `class
349, // `extends
413, // `void
274, // `int
295, // `while
59, // `if
468, // `else
71, // `for
690, // `break
176, // `this
296, // `false
441, // `true
324, // `super
382, // `null
400, // `return
24, // `instanceof
448, // `new
21, // `abstract
30, // `assert
29, // `byte
611, // `case
639, // `catch
7, // `char
254, // `const
531, // `continue
550, // `default
79, // `do
226, // `double
694, // `enum
361, // `final
225, // `finally
299, // `float
192, // `goto
497, // `implements
501, // `import
62, // `interface
276, // `long
159, // `native
89, // `package
139, // `private
685, // `protected
43, // `public
635, // `short
450, // `static
326, // `strictfp
389, // `switch
691, // `synchronized
701, // `throw
459, // `throws
83, // `transient
671, // `try
208, // `volatile
698, // `!
123, // `!=
291, // `%
145, // `&&
72, // `*
676, // `(
70, // `)
1, // `{
668, // `}
50, // `-
404, // `+
463, // `=
154, // `==
289, // `[
151, // `]
147, // `||
201, // `<
612, // `<=
595, // `,
378, // `>
655, // `>=
452, // `.
271, // `;
577, // `++
25, // `--
266, // `/
-1, // ID
203, // INTLIT
282, // STRINGLIT
110, // CHARLIT
223, // "c"
486, // "l"
443, // "a"
442, // "s"
-1, // idChar
-1, // reserved
479, // "e"
484, // "b"
MIN_REDUCTION+236, // "o"
350, // "n"
219, // "r"
MIN_REDUCTION+236, // "k"
MIN_REDUCTION+236, // "x"
515, // "t"
320, // "d"
431, // "p"
80, // "u"
26, // "i"
368, // "v"
233, // "f"
67, // "w"
424, // "h"
401, // "y"
MIN_REDUCTION+236, // "m"
525, // "g"
MIN_REDUCTION+236, // "z"
237, // "!"
641, // "="
35, // "*"
528, // "%"
205, // "&"
303, // "("
61, // ")"
601, // "+"
664, // ","
196, // "-"
152, // "."
256, // "/"
557, // ";"
178, // "<"
481, // ">"
267, // "["
553, // "]"
428, // "{"
263, // "}"
19, // "|"
-1, // intLit2
MIN_REDUCTION+236, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
175, // " "
MIN_REDUCTION+236, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+236, // {"A".."Z"}
376, // "'"
MIN_REDUCTION+236, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
335, // '"'
118, // ws
175, // {9}
427, // eol
438, // {10}
573, // {13}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 671
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 672
4,MIN_REDUCTION+336, // token
114,MIN_REDUCTION+336, // "!"
115,MIN_REDUCTION+336, // "="
116,MIN_REDUCTION+336, // "*"
117,MIN_REDUCTION+336, // "%"
118,MIN_REDUCTION+336, // "&"
119,MIN_REDUCTION+336, // "("
120,MIN_REDUCTION+336, // ")"
121,MIN_REDUCTION+336, // "+"
122,MIN_REDUCTION+336, // ","
123,MIN_REDUCTION+336, // "-"
124,MIN_REDUCTION+336, // "."
125,MIN_REDUCTION+336, // "/"
126,MIN_REDUCTION+336, // ";"
127,MIN_REDUCTION+336, // "<"
128,MIN_REDUCTION+336, // ">"
129,MIN_REDUCTION+336, // "["
130,MIN_REDUCTION+336, // "]"
131,MIN_REDUCTION+336, // "{"
132,MIN_REDUCTION+336, // "}"
133,MIN_REDUCTION+336, // "|"
141,MIN_REDUCTION+336, // " "
146,MIN_REDUCTION+336, // "'"
150,MIN_REDUCTION+336, // '"'
152,MIN_REDUCTION+336, // {9}
154,MIN_REDUCTION+336, // {10}
155,MIN_REDUCTION+336, // {13}
158,MIN_REDUCTION+336, // $$1
166,MIN_REDUCTION+336, // $
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 673
2,309, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 674
167,MIN_REDUCTION+159, // $NT
  }
,
{ // state 675
94,439, // "e"
  }
,
{ // state 676
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 677
2,656, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 678
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 679
139,MIN_REDUCTION+337, // "_"
157,MIN_REDUCTION+337, // idChar**
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 680
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 681
2,682, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 682
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 683
0x80000000|421, // match move
0x80000000|460, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 684
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 685
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 686
2,634, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 687
0x80000000|3, // match move
0x80000000|559, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 688
0x80000000|3, // match move
0x80000000|425, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 689
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 690
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 691
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 692
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 693
167,MIN_REDUCTION+102, // $NT
  }
,
{ // state 694
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 695
91,697, // "s"
  }
,
{ // state 696
2,555, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 697
0x80000000|3, // match move
0x80000000|602, // no-match move
0x80000000|547, // NT-test-match state for idChar
  }
,
{ // state 698
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 699
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 700
101,199, // "t"
  }
,
{ // state 701
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 702
97,342, // "n"
  }
,
{ // state 703
167,MIN_REDUCTION+126, // $NT
  }
,
{ // state 704
98,340, // "r"
  }
,
{ // state 705
4,MIN_REDUCTION+331, // token
114,MIN_REDUCTION+331, // "!"
115,MIN_REDUCTION+331, // "="
116,MIN_REDUCTION+331, // "*"
117,MIN_REDUCTION+331, // "%"
118,MIN_REDUCTION+331, // "&"
119,MIN_REDUCTION+331, // "("
120,MIN_REDUCTION+331, // ")"
121,MIN_REDUCTION+331, // "+"
122,MIN_REDUCTION+331, // ","
123,MIN_REDUCTION+331, // "-"
124,MIN_REDUCTION+331, // "."
125,MIN_REDUCTION+331, // "/"
126,MIN_REDUCTION+331, // ";"
127,MIN_REDUCTION+331, // "<"
128,MIN_REDUCTION+331, // ">"
129,MIN_REDUCTION+331, // "["
130,MIN_REDUCTION+331, // "]"
131,MIN_REDUCTION+331, // "{"
132,MIN_REDUCTION+331, // "}"
133,MIN_REDUCTION+331, // "|"
141,MIN_REDUCTION+331, // " "
146,MIN_REDUCTION+331, // "'"
150,MIN_REDUCTION+331, // '"'
152,MIN_REDUCTION+331, // {9}
154,MIN_REDUCTION+331, // {10}
155,MIN_REDUCTION+331, // {13}
158,MIN_REDUCTION+331, // $$1
166,MIN_REDUCTION+331, // $
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 706
167,MIN_REDUCTION+93, // $NT
  }
,
{ // state 707
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 708
94,328, // "e"
  }
,
{ // state 709
141,175, // " "
151,48, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+235, // $NT
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 710
107,200, // "f"
  }
,
{ // state 711
88,279, // "c"
  }
,
{ // state 712
88,541, // "c"
  }
,
{ // state 713
2,709, // ws*
141,175, // " "
151,118, // ws
152,175, // {9}
153,427, // eol
154,438, // {10}
155,573, // {13}
167,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[714][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= start
(0<<16)+1,
// $$start ::=
(0<<16)+0,
// start ::= ws* $$0
(1<<16)+2,
// start ::= ws*
(1<<16)+1,
// start ::= $$0
(1<<16)+1,
// token ::= `boolean
(4<<16)+1,
// token ::= `class
(4<<16)+1,
// token ::= `extends
(4<<16)+1,
// token ::= `void
(4<<16)+1,
// token ::= `int
(4<<16)+1,
// token ::= `while
(4<<16)+1,
// token ::= `if
(4<<16)+1,
// token ::= `else
(4<<16)+1,
// token ::= `for
(4<<16)+1,
// token ::= `break
(4<<16)+1,
// token ::= `this
(4<<16)+1,
// token ::= `false
(4<<16)+1,
// token ::= `true
(4<<16)+1,
// token ::= `super
(4<<16)+1,
// token ::= `null
(4<<16)+1,
// token ::= `return
(4<<16)+1,
// token ::= `instanceof
(4<<16)+1,
// token ::= `new
(4<<16)+1,
// token ::= `abstract
(4<<16)+1,
// token ::= `assert
(4<<16)+1,
// token ::= `byte
(4<<16)+1,
// token ::= `case
(4<<16)+1,
// token ::= `catch
(4<<16)+1,
// token ::= `char
(4<<16)+1,
// token ::= `const
(4<<16)+1,
// token ::= `continue
(4<<16)+1,
// token ::= `default
(4<<16)+1,
// token ::= `do
(4<<16)+1,
// token ::= `double
(4<<16)+1,
// token ::= `enum
(4<<16)+1,
// token ::= `final
(4<<16)+1,
// token ::= `finally
(4<<16)+1,
// token ::= `float
(4<<16)+1,
// token ::= `goto
(4<<16)+1,
// token ::= `implements
(4<<16)+1,
// token ::= `import
(4<<16)+1,
// token ::= `interface
(4<<16)+1,
// token ::= `long
(4<<16)+1,
// token ::= `native
(4<<16)+1,
// token ::= `package
(4<<16)+1,
// token ::= `private
(4<<16)+1,
// token ::= `protected
(4<<16)+1,
// token ::= `public
(4<<16)+1,
// token ::= `short
(4<<16)+1,
// token ::= `static
(4<<16)+1,
// token ::= `strictfp
(4<<16)+1,
// token ::= `switch
(4<<16)+1,
// token ::= `synchronized
(4<<16)+1,
// token ::= `throw
(4<<16)+1,
// token ::= `throws
(4<<16)+1,
// token ::= `transient
(4<<16)+1,
// token ::= `try
(4<<16)+1,
// token ::= `volatile
(4<<16)+1,
// token ::= `!
(4<<16)+1,
// token ::= `!=
(4<<16)+1,
// token ::= `%
(4<<16)+1,
// token ::= `&&
(4<<16)+1,
// token ::= `*
(4<<16)+1,
// token ::= `(
(4<<16)+1,
// token ::= `)
(4<<16)+1,
// token ::= `{
(4<<16)+1,
// token ::= `}
(4<<16)+1,
// token ::= `-
(4<<16)+1,
// token ::= `+
(4<<16)+1,
// token ::= `=
(4<<16)+1,
// token ::= `==
(4<<16)+1,
// token ::= `[
(4<<16)+1,
// token ::= `]
(4<<16)+1,
// token ::= `||
(4<<16)+1,
// token ::= `<
(4<<16)+1,
// token ::= `<=
(4<<16)+1,
// token ::= `,
(4<<16)+1,
// token ::= `>
(4<<16)+1,
// token ::= `>=
(4<<16)+1,
// token ::= `.
(4<<16)+1,
// token ::= `;
(4<<16)+1,
// token ::= `++
(4<<16)+1,
// token ::= `--
(4<<16)+1,
// token ::= `/
(4<<16)+1,
// token ::= ID
(4<<16)+1,
// token ::= INTLIT
(4<<16)+1,
// token ::= STRINGLIT
(4<<16)+1,
// token ::= CHARLIT
(4<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar ws*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// reserved ::= `class
(93<<16)+1,
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// reserved ::= `else
(93<<16)+1,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// reserved ::= `boolean
(93<<16)+1,
// `break ::= "b" "r" "e" "a" "k" !idChar ws*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// reserved ::= `break
(93<<16)+1,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// reserved ::= `extends
(93<<16)+1,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar ws*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// reserved ::= `public
(93<<16)+1,
// `void ::= "v" "o" "i" "d" !idChar ws*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// reserved ::= `void
(93<<16)+1,
// `for ::= "f" "o" "r" !idChar ws*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// reserved ::= `for
(93<<16)+1,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// reserved ::= `instanceof
(93<<16)+1,
// `false ::= "f" "a" "l" "s" "e" !idChar ws*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// reserved ::= `false
(93<<16)+1,
// `if ::= "i" "f" !idChar ws*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// reserved ::= `if
(93<<16)+1,
// `int ::= "i" "n" "t" !idChar ws*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// reserved ::= `int
(93<<16)+1,
// `new ::= "n" "e" "w" !idChar ws*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// reserved ::= `new
(93<<16)+1,
// `null ::= "n" "u" "l" "l" !idChar ws*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// reserved ::= `null
(93<<16)+1,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar ws*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// reserved ::= `return
(93<<16)+1,
// `super ::= "s" "u" "p" "e" "r" !idChar ws*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// reserved ::= `super
(93<<16)+1,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// reserved ::= `switch
(93<<16)+1,
// `this ::= "t" "h" "i" "s" !idChar ws*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// reserved ::= `this
(93<<16)+1,
// `true ::= "t" "r" "u" "e" !idChar ws*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// reserved ::= `true
(93<<16)+1,
// `while ::= "w" "h" "i" "l" "e" !idChar ws*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// reserved ::= `while
(93<<16)+1,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// reserved ::= `abstract
(93<<16)+1,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// reserved ::= `assert
(93<<16)+1,
// `byte ::= "b" "y" "t" "e" !idChar ws*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// reserved ::= `byte
(93<<16)+1,
// `case ::= "c" "a" "s" "e" !idChar ws*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// reserved ::= `case
(93<<16)+1,
// `catch ::= "c" "a" "t" "c" "h" !idChar ws*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// reserved ::= `catch
(93<<16)+1,
// `char ::= "c" "h" "a" "r" !idChar ws*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// reserved ::= `char
(93<<16)+1,
// `const ::= "c" "o" "n" "s" "t" !idChar ws*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// reserved ::= `const
(93<<16)+1,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// reserved ::= `continue
(93<<16)+1,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// reserved ::= `default
(93<<16)+1,
// `do ::= "d" "o" !idChar ws*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// reserved ::= `do
(93<<16)+1,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar ws*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// reserved ::= `double
(93<<16)+1,
// `enum ::= "e" "n" "u" "m" !idChar ws*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// reserved ::= `enum
(93<<16)+1,
// `final ::= "f" "i" "n" "a" "l" !idChar ws*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// reserved ::= `final
(93<<16)+1,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// reserved ::= `finally
(93<<16)+1,
// `float ::= "f" "l" "o" "a" "t" !idChar ws*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// reserved ::= `float
(93<<16)+1,
// `goto ::= "g" "o" "t" "o" !idChar ws*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// reserved ::= `goto
(93<<16)+1,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// reserved ::= `implements
(93<<16)+1,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar ws*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// reserved ::= `import
(93<<16)+1,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// reserved ::= `interface
(93<<16)+1,
// `long ::= "l" "o" "n" "g" !idChar ws*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// reserved ::= `long
(93<<16)+1,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar ws*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// reserved ::= `native
(93<<16)+1,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// reserved ::= `package
(93<<16)+1,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// reserved ::= `private
(93<<16)+1,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// reserved ::= `protected
(93<<16)+1,
// `short ::= "s" "h" "o" "r" "t" !idChar ws*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// reserved ::= `short
(93<<16)+1,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar ws*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// reserved ::= `static
(93<<16)+1,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// reserved ::= `strictfp
(93<<16)+1,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// reserved ::= `synchronized
(93<<16)+1,
// `throw ::= "t" "h" "r" "o" "w" !idChar ws*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// reserved ::= `throw
(93<<16)+1,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// reserved ::= `throws
(93<<16)+1,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// reserved ::= `transient
(93<<16)+1,
// `try ::= "t" "r" "y" !idChar ws*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// reserved ::= `try
(93<<16)+1,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `volatile
(93<<16)+1,
// `!= ::= "!" "=" ws*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `! ::= "!" !"=" ws*
(58<<16)+2,
// `! ::= "!" !"="
(58<<16)+1,
// `* ::= "*" ws*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// `% ::= "%" ws*
(60<<16)+2,
// `% ::= "%"
(60<<16)+1,
// `&& ::= "&" "&" ws*
(61<<16)+3,
// `&& ::= "&" "&"
(61<<16)+2,
// `( ::= "(" ws*
(63<<16)+2,
// `( ::= "("
(63<<16)+1,
// `) ::= ")" ws*
(64<<16)+2,
// `) ::= ")"
(64<<16)+1,
// `+ ::= "+" !"+" ws*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// `++ ::= "+" "+" ws*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
// `, ::= "," ws*
(76<<16)+2,
// `, ::= ","
(76<<16)+1,
// `- ::= "-" !"-" ws*
(67<<16)+2,
// `- ::= "-" !"-"
(67<<16)+1,
// `-- ::= "-" "-" ws*
(82<<16)+3,
// `-- ::= "-" "-"
(82<<16)+2,
// `. ::= "." ws*
(79<<16)+2,
// `. ::= "."
(79<<16)+1,
// `/ ::= "/" ws*
(83<<16)+2,
// `/ ::= "/"
(83<<16)+1,
// `; ::= ";" ws*
(80<<16)+2,
// `; ::= ";"
(80<<16)+1,
// `< ::= "<" !"=" ws*
(74<<16)+2,
// `< ::= "<" !"="
(74<<16)+1,
// `<= ::= "<" "=" ws*
(75<<16)+3,
// `<= ::= "<" "="
(75<<16)+2,
// `= ::= "=" !"=" ws*
(69<<16)+2,
// `= ::= "=" !"="
(69<<16)+1,
// `== ::= "=" "=" ws*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `> ::= ">" !"=" ws*
(77<<16)+2,
// `> ::= ">" !"="
(77<<16)+1,
// `>= ::= ">" "=" ws*
(78<<16)+3,
// `>= ::= ">" "="
(78<<16)+2,
// `[ ::= "[" ws*
(71<<16)+2,
// `[ ::= "["
(71<<16)+1,
// `] ::= "]" ws*
(72<<16)+2,
// `] ::= "]"
(72<<16)+1,
// `{ ::= "{" ws*
(65<<16)+2,
// `{ ::= "{"
(65<<16)+1,
// `} ::= "}" ws*
(66<<16)+2,
// `} ::= "}"
(66<<16)+1,
// `|| ::= "|" "|" ws*
(73<<16)+3,
// `|| ::= "|" "|"
(73<<16)+2,
// INTLIT ::= intLit2 ws*
(85<<16)+2,
// INTLIT ::= intLit2
(85<<16)+1,
// intLit2 ::= !"0" digit++
(134<<16)+1,
// idChar ::= letter
(92<<16)+1,
// idChar ::= digit
(92<<16)+1,
// idChar ::= "_"
(92<<16)+1,
// stringPrintable ::= {" ".."!"}
(140<<16)+1,
// stringPrintable ::= {"#".."["}
(140<<16)+1,
// stringPrintable ::= {"]".."~"}
(140<<16)+1,
// charPrintable ::= {" ".."&"}
(149<<16)+1,
// charPrintable ::= {"(".."["}
(149<<16)+1,
// charPrintable ::= {"]".."~"}
(149<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(137<<16)+1,
// digit ::= {"0".."9"}
(138<<16)+1,
// ws ::= {9 " "}
(151<<16)+1,
// ws ::= eol
(151<<16)+1,
// eol ::= {10}
(153<<16)+1,
// eol ::= {13} {10}
(153<<16)+2,
// eol ::= {13} !10
(153<<16)+1,
// CHARLIT ::= "'" charPrintable "'" ws*
(87<<16)+4,
// CHARLIT ::= "'" charPrintable "'"
(87<<16)+3,
// ID ::= !reserved letter++ idChar** $$1
(84<<16)+3,
// ID ::= !reserved letter++ idChar**
(84<<16)+2,
// ID ::= !reserved letter++ !idChar $$1
(84<<16)+2,
// ID ::= !reserved letter++ !idChar
(84<<16)+1,
// STRINGLIT ::= '"' stringPrintable** $$2
(86<<16)+3,
// STRINGLIT ::= '"' !stringPrintable $$2
(86<<16)+2,
// token* ::= token* token
(161<<16)+2,
// token* ::= token
(161<<16)+1,
// digit++ ::= digit+ !digit
(136<<16)+1,
// idChar** ::= idChar* !idChar
(157<<16)+1,
// stringPrintable** ::= stringPrintable* !stringPrintable
(159<<16)+1,
// letter++ ::= letter+ !letter
(156<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(162<<16)+1,
// digit+ ::= digit+ digit
(162<<16)+2,
// letter+ ::= letter
(165<<16)+1,
// letter+ ::= letter+ letter
(165<<16)+2,
// idChar* ::= idChar* idChar
(163<<16)+2,
// idChar* ::= idChar
(163<<16)+1,
// stringPrintable* ::= stringPrintable* stringPrintable
(164<<16)+2,
// stringPrintable* ::= stringPrintable
(164<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= ws*
(158<<16)+1,
// $$2 ::= '"' ws*
(160<<16)+2,
// $$2 ::= '"'
(160<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
152, // 9
154, // 10
-1, // 11
-1, // 12
155, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
141, // " "
114, // "!"
150, // '"'
144, // "#"
144, // "$"
117, // "%"
118, // "&"
146, // "'"
119, // "("
120, // ")"
116, // "*"
121, // "+"
122, // ","
123, // "-"
124, // "."
125, // "/"
135, // "0"
142, // "1"
142, // "2"
142, // "3"
142, // "4"
142, // "5"
142, // "6"
142, // "7"
142, // "8"
142, // "9"
143, // ":"
126, // ";"
127, // "<"
115, // "="
128, // ">"
143, // "?"
143, // "@"
145, // "A"
145, // "B"
145, // "C"
145, // "D"
145, // "E"
145, // "F"
145, // "G"
145, // "H"
145, // "I"
145, // "J"
145, // "K"
145, // "L"
145, // "M"
145, // "N"
145, // "O"
145, // "P"
145, // "Q"
145, // "R"
145, // "S"
145, // "T"
145, // "U"
145, // "V"
145, // "W"
145, // "X"
145, // "Y"
145, // "Z"
129, // "["
-1, // "\"
130, // "]"
148, // "^"
139, // "_"
148, // "`"
90, // "a"
95, // "b"
88, // "c"
102, // "d"
94, // "e"
107, // "f"
112, // "g"
109, // "h"
105, // "i"
147, // "j"
99, // "k"
89, // "l"
111, // "m"
97, // "n"
96, // "o"
103, // "p"
147, // "q"
98, // "r"
91, // "s"
101, // "t"
104, // "u"
106, // "v"
108, // "w"
100, // "x"
110, // "y"
113, // "z"
131, // "{"
133, // "|"
132, // "}"
148, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
-1, // 176
-1, // 177
-1, // 178
-1, // 179
-1, // 180
-1, // 181
-1, // 182
-1, // 183
-1, // 184
-1, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
-1, // 193
-1, // 194
-1, // 195
-1, // 196
-1, // 197
-1, // 198
-1, // 199
-1, // 200
-1, // 201
-1, // 202
-1, // 203
-1, // 204
-1, // 205
-1, // 206
-1, // 207
-1, // 208
-1, // 209
-1, // 210
-1, // 211
-1, // 212
-1, // 213
-1, // 214
-1, // 215
-1, // 216
-1, // 217
-1, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
-1, // 223
-1, // 224
-1, // 225
-1, // 226
-1, // 227
-1, // 228
-1, // 229
-1, // 230
-1, // 231
-1, // 232
-1, // 233
-1, // 234
-1, // 235
-1, // 236
-1, // 237
-1, // 238
-1, // 239
-1, // 240
-1, // 241
-1, // 242
-1, // 243
-1, // 244
-1, // 245
-1, // 246
-1, // 247
-1, // 248
-1, // 249
-1, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"", // 1
"start ::= ws* token*", // 2
"start ::= ws* token*", // 3
"start ::= ws* token*", // 4
"token ::= # `boolean", // 5
"token ::= # `class", // 6
"token ::= # `extends", // 7
"token ::= # `void", // 8
"token ::= # `int", // 9
"token ::= # `while", // 10
"token ::= # `if", // 11
"token ::= # `else", // 12
"token ::= # `for", // 13
"token ::= # `break", // 14
"token ::= # `this", // 15
"token ::= # `false", // 16
"token ::= # `true", // 17
"token ::= # `super", // 18
"token ::= # `null", // 19
"token ::= # `return", // 20
"token ::= # `instanceof", // 21
"token ::= # `new", // 22
"token ::= # `abstract", // 23
"token ::= # `assert", // 24
"token ::= # `byte", // 25
"token ::= # `case", // 26
"token ::= # `catch", // 27
"token ::= # `char", // 28
"token ::= # `const", // 29
"token ::= # `continue", // 30
"token ::= # `default", // 31
"token ::= # `do", // 32
"token ::= # `double", // 33
"token ::= # `enum", // 34
"token ::= # `final", // 35
"token ::= # `finally", // 36
"token ::= # `float", // 37
"token ::= # `goto", // 38
"token ::= # `implements", // 39
"token ::= # `import", // 40
"token ::= # `interface", // 41
"token ::= # `long", // 42
"token ::= # `native", // 43
"token ::= # `package", // 44
"token ::= # `private", // 45
"token ::= # `protected", // 46
"token ::= # `public", // 47
"token ::= # `short", // 48
"token ::= # `static", // 49
"token ::= # `strictfp", // 50
"token ::= # `switch", // 51
"token ::= # `synchronized", // 52
"token ::= # `throw", // 53
"token ::= # `throws", // 54
"token ::= # `transient", // 55
"token ::= # `try", // 56
"token ::= # `volatile", // 57
"token ::= # `!", // 58
"token ::= # `!=", // 59
"token ::= # `%", // 60
"token ::= # `&&", // 61
"token ::= # `*", // 62
"token ::= # `(", // 63
"token ::= # `)", // 64
"token ::= # `{", // 65
"token ::= # `}", // 66
"token ::= # `-", // 67
"token ::= # `+", // 68
"token ::= # `=", // 69
"token ::= # `==", // 70
"token ::= # `[", // 71
"token ::= # `]", // 72
"token ::= # `||", // 73
"token ::= # `<", // 74
"token ::= # `<=", // 75
"token ::= # `,", // 76
"token ::= # `>", // 77
"token ::= # `>=", // 78
"token ::= # `.", // 79
"token ::= # `;", // 80
"token ::= # `++", // 81
"token ::= # `--", // 82
"token ::= # `/", // 83
"token ::= # ID", // 84
"token ::= # INTLIT", // 85
"token ::= # STRINGLIT", // 86
"token ::= # CHARLIT", // 87
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 88
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 89
"reserved ::= `class", // 90
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 91
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 92
"reserved ::= `else", // 93
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 94
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 95
"reserved ::= `boolean", // 96
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 97
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 98
"reserved ::= `break", // 99
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 100
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 101
"reserved ::= `extends", // 102
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 103
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 104
"reserved ::= `public", // 105
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 106
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 107
"reserved ::= `void", // 108
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 109
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 110
"reserved ::= `for", // 111
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 112
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 113
"reserved ::= `instanceof", // 114
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 115
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 116
"reserved ::= `false", // 117
"`if ::= \"i\" \"f\" !idChar ws*", // 118
"`if ::= \"i\" \"f\" !idChar ws*", // 119
"reserved ::= `if", // 120
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 121
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 122
"reserved ::= `int", // 123
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 124
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 125
"reserved ::= `new", // 126
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 127
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 128
"reserved ::= `null", // 129
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 130
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 131
"reserved ::= `return", // 132
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 133
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 134
"reserved ::= `super", // 135
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 136
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 137
"reserved ::= `switch", // 138
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 139
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 140
"reserved ::= `this", // 141
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 142
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 143
"reserved ::= `true", // 144
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 145
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 146
"reserved ::= `while", // 147
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 148
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 149
"reserved ::= `abstract", // 150
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 151
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 152
"reserved ::= `assert", // 153
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 154
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 155
"reserved ::= `byte", // 156
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 157
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 158
"reserved ::= `case", // 159
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 160
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 161
"reserved ::= `catch", // 162
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 163
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 164
"reserved ::= `char", // 165
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 166
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 167
"reserved ::= `const", // 168
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 169
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 170
"reserved ::= `continue", // 171
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 172
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 173
"reserved ::= `default", // 174
"`do ::= \"d\" \"o\" !idChar ws*", // 175
"`do ::= \"d\" \"o\" !idChar ws*", // 176
"reserved ::= `do", // 177
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 178
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 179
"reserved ::= `double", // 180
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 181
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 182
"reserved ::= `enum", // 183
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 184
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 185
"reserved ::= `final", // 186
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 187
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 188
"reserved ::= `finally", // 189
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 190
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 191
"reserved ::= `float", // 192
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 193
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 194
"reserved ::= `goto", // 195
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 196
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 197
"reserved ::= `implements", // 198
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 199
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 200
"reserved ::= `import", // 201
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 202
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 203
"reserved ::= `interface", // 204
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 205
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 206
"reserved ::= `long", // 207
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 208
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 209
"reserved ::= `native", // 210
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 211
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 212
"reserved ::= `package", // 213
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 214
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 215
"reserved ::= `private", // 216
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 217
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 218
"reserved ::= `protected", // 219
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 220
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 221
"reserved ::= `short", // 222
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 223
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 224
"reserved ::= `static", // 225
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 226
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 227
"reserved ::= `strictfp", // 228
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 229
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 230
"reserved ::= `synchronized", // 231
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 232
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 233
"reserved ::= `throw", // 234
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 235
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 236
"reserved ::= `throws", // 237
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 238
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 239
"reserved ::= `transient", // 240
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 241
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 242
"reserved ::= `try", // 243
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 244
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 245
"reserved ::= `volatile", // 246
"`!= ::= \"!\" \"=\" ws*", // 247
"`!= ::= \"!\" \"=\" ws*", // 248
"`! ::= \"!\" !\"=\" ws*", // 249
"`! ::= \"!\" !\"=\" ws*", // 250
"`* ::= \"*\" ws*", // 251
"`* ::= \"*\" ws*", // 252
"`% ::= \"%\" ws*", // 253
"`% ::= \"%\" ws*", // 254
"`&& ::= \"&\" \"&\" ws*", // 255
"`&& ::= \"&\" \"&\" ws*", // 256
"`( ::= \"(\" ws*", // 257
"`( ::= \"(\" ws*", // 258
"`) ::= \")\" ws*", // 259
"`) ::= \")\" ws*", // 260
"`+ ::= \"+\" !\"+\" ws*", // 261
"`+ ::= \"+\" !\"+\" ws*", // 262
"`++ ::= \"+\" \"+\" ws*", // 263
"`++ ::= \"+\" \"+\" ws*", // 264
"`, ::= \",\" ws*", // 265
"`, ::= \",\" ws*", // 266
"`- ::= \"-\" !\"-\" ws*", // 267
"`- ::= \"-\" !\"-\" ws*", // 268
"`-- ::= \"-\" \"-\" ws*", // 269
"`-- ::= \"-\" \"-\" ws*", // 270
"`. ::= \".\" ws*", // 271
"`. ::= \".\" ws*", // 272
"`/ ::= \"/\" ws*", // 273
"`/ ::= \"/\" ws*", // 274
"`; ::= \";\" ws*", // 275
"`; ::= \";\" ws*", // 276
"`< ::= \"<\" !\"=\" ws*", // 277
"`< ::= \"<\" !\"=\" ws*", // 278
"`<= ::= \"<\" \"=\" ws*", // 279
"`<= ::= \"<\" \"=\" ws*", // 280
"`= ::= \"=\" !\"=\" ws*", // 281
"`= ::= \"=\" !\"=\" ws*", // 282
"`== ::= \"=\" \"=\" ws*", // 283
"`== ::= \"=\" \"=\" ws*", // 284
"`> ::= \">\" !\"=\" ws*", // 285
"`> ::= \">\" !\"=\" ws*", // 286
"`>= ::= \">\" \"=\" ws*", // 287
"`>= ::= \">\" \"=\" ws*", // 288
"`[ ::= \"[\" ws*", // 289
"`[ ::= \"[\" ws*", // 290
"`] ::= \"]\" ws*", // 291
"`] ::= \"]\" ws*", // 292
"`{ ::= \"{\" ws*", // 293
"`{ ::= \"{\" ws*", // 294
"`} ::= \"}\" ws*", // 295
"`} ::= \"}\" ws*", // 296
"`|| ::= \"|\" \"|\" ws*", // 297
"`|| ::= \"|\" \"|\" ws*", // 298
"INTLIT ::= # intLit2 ws*", // 299
"INTLIT ::= # intLit2 ws*", // 300
"intLit2 ::= !\"0\" digit++", // 301
"idChar ::= letter", // 302
"idChar ::= digit", // 303
"idChar ::= \"_\"", // 304
"stringPrintable ::= {\" \"..\"!\"}", // 305
"stringPrintable ::= {\"#\"..\"[\"}", // 306
"stringPrintable ::= {\"]\"..\"~\"}", // 307
"charPrintable ::= {\" \"..\"&\"}", // 308
"charPrintable ::= {\"(\"..\"[\"}", // 309
"charPrintable ::= {\"]\"..\"~\"}", // 310
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 311
"digit ::= {\"0\"..\"9\"}", // 312
"ws ::= {9 \" \"}", // 313
"ws ::= eol", // 314
"eol ::= {10} registerNewline", // 315
"eol ::= {13} {10} registerNewline", // 316
"eol ::= {13} !10 registerNewline", // 317
"CHARLIT ::= \"\'\" charPrintable \"\'\" ws*", // 318
"CHARLIT ::= \"\'\" charPrintable \"\'\" ws*", // 319
"ID ::= !reserved letter++ idChar** ws*", // 320
"ID ::= !reserved letter++ idChar** ws*", // 321
"ID ::= !reserved letter++ idChar** ws*", // 322
"ID ::= !reserved letter++ idChar** ws*", // 323
"STRINGLIT ::= \'\"\' stringPrintable** \'\"\' ws*", // 324
"STRINGLIT ::= \'\"\' stringPrintable** \'\"\' ws*", // 325
"token* ::= token* token", // 326
"token* ::= token* token", // 327
"digit++ ::= digit+ !digit", // 328
"idChar** ::= idChar* !idChar", // 329
"stringPrintable** ::= stringPrintable* !stringPrintable", // 330
"letter++ ::= letter+ !letter", // 331
"ws* ::= ws* ws", // 332
"ws* ::= ws* ws", // 333
"digit+ ::= digit", // 334
"digit+ ::= digit+ digit", // 335
"letter+ ::= letter", // 336
"letter+ ::= letter+ letter", // 337
"idChar* ::= idChar* idChar", // 338
"idChar* ::= idChar* idChar", // 339
"stringPrintable* ::= stringPrintable* stringPrintable", // 340
"stringPrintable* ::= stringPrintable* stringPrintable", // 341
"", // 342
"", // 343
"", // 344
"", // 345
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: `class ::= "c" "l" "a" "s" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 89: `class ::= "c" "l" "a" "s" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 90: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 91: `else ::= "e" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 92: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 93: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 94: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 95: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 96: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 97: `break ::= "b" "r" "e" "a" "k" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 98: `break ::= "b" "r" "e" "a" "k" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 99: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 100: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 101: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 102: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 103: `public ::= "p" "u" "b" "l" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 104: `public ::= "p" "u" "b" "l" "i" "c" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 105: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 106: `void ::= "v" "o" "i" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 107: `void ::= "v" "o" "i" "d" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 108: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 109: `for ::= "f" "o" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `for ::= "f" "o" "r" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 112: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 113: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 114: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 115: `false ::= "f" "a" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 116: `false ::= "f" "a" "l" "s" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 117: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 118: `if ::= "i" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 119: `if ::= "i" "f" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 120: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 121: `int ::= "i" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 122: `int ::= "i" "n" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 123: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 124: `new ::= "n" "e" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 125: `new ::= "n" "e" "w" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 126: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 127: `null ::= "n" "u" "l" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 128: `null ::= "n" "u" "l" "l" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 129: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 130: `return ::= "r" "e" "t" "u" "r" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 131: `return ::= "r" "e" "t" "u" "r" "n" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 132: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 133: `super ::= "s" "u" "p" "e" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 134: `super ::= "s" "u" "p" "e" "r" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 135: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 136: `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 137: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 138: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 139: `this ::= "t" "h" "i" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 140: `this ::= "t" "h" "i" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 141: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 142: `true ::= "t" "r" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 143: `true ::= "t" "r" "u" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 144: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 145: `while ::= "w" "h" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 146: `while ::= "w" "h" "i" "l" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 147: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 148: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 149: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 150: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 151: `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 152: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 153: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 154: `byte ::= "b" "y" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 155: `byte ::= "b" "y" "t" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 156: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 157: `case ::= "c" "a" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 158: `case ::= "c" "a" "s" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 159: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 160: `catch ::= "c" "a" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 161: `catch ::= "c" "a" "t" "c" "h" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 162: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 163: `char ::= "c" "h" "a" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 164: `char ::= "c" "h" "a" "r" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 165: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 166: `const ::= "c" "o" "n" "s" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 167: `const ::= "c" "o" "n" "s" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 168: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 169: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 170: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 171: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 172: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 173: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 174: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 175: `do ::= "d" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 176: `do ::= "d" "o" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 178: `double ::= "d" "o" "u" "b" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 179: `double ::= "d" "o" "u" "b" "l" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 180: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 181: `enum ::= "e" "n" "u" "m" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 182: `enum ::= "e" "n" "u" "m" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 183: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 184: `final ::= "f" "i" "n" "a" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 185: `final ::= "f" "i" "n" "a" "l" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 186: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 187: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 188: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 189: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 190: `float ::= "f" "l" "o" "a" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 191: `float ::= "f" "l" "o" "a" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 192: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 193: `goto ::= "g" "o" "t" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 194: `goto ::= "g" "o" "t" "o" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 195: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 196: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 197: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 198: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 199: `import ::= "i" "m" "p" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 200: `import ::= "i" "m" "p" "o" "r" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 201: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 202: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 203: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 204: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 205: `long ::= "l" "o" "n" "g" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 206: `long ::= "l" "o" "n" "g" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 207: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 208: `native ::= "n" "a" "t" "i" "v" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 209: `native ::= "n" "a" "t" "i" "v" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 210: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 211: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 212: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 213: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 214: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 215: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 216: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 217: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 218: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 219: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 220: `short ::= "s" "h" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 221: `short ::= "s" "h" "o" "r" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 222: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 223: `static ::= "s" "t" "a" "t" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 224: `static ::= "s" "t" "a" "t" "i" "c" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 225: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 226: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 227: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 228: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 229: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 230: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 231: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 232: `throw ::= "t" "h" "r" "o" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 233: `throw ::= "t" "h" "r" "o" "w" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 234: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 235: `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 236: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 237: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 238: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 239: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 240: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 241: `try ::= "t" "r" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 242: `try ::= "t" "r" "y" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 243: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 244: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 245: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 246: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 247: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 248: `!= ::= "!" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 249: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: `! ::= "!" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 251: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 252: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `% ::= "%" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 255: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 256: `&& ::= "&" "&" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 257: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `+ ::= "+" !"+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `++ ::= "+" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 264: `++ ::= "+" "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 265: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: `, ::= "," [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `- ::= "-" !"-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 270: `-- ::= "-" "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 271: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 272: `. ::= "." [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `/ ::= "/" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `< ::= "<" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 280: `<= ::= "<" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 281: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 282: `= ::= "=" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 283: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 284: `== ::= "=" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 285: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 286: `> ::= ">" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 287: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 288: `>= ::= ">" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 289: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 290: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 291: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 292: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 293: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 296: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 297: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 298: `|| ::= "|" "|" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 299: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 300: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 301: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 302: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 303: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 304: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 305: stringPrintable ::= {" ".."!"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 306: stringPrintable ::= {"#".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 307: stringPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 308: charPrintable ::= {" ".."&"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 309: charPrintable ::= {"(".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 310: charPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 311: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 312: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 313: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 314: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 315: eol ::= {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 316: eol ::= {13} {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 317: eol ::= {13} !10 [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 318: CHARLIT ::= "'" charPrintable "'" ws* @zero(char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 319: CHARLIT ::= "'" charPrintable "'" [ws*] @zero(char,char,char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 320: ID ::= !reserved letter++ idChar** $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 321: ID ::= !reserved letter++ idChar** [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 322: ID ::= !reserved letter++ !idChar [idChar**] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 323: ID ::= !reserved letter++ !idChar [idChar**] [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 324: STRINGLIT ::= '"' stringPrintable** $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 325: STRINGLIT ::= '"' !stringPrintable [stringPrintable**] $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 326: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 327: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 328: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 329: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 330: stringPrintable** ::= stringPrintable* !stringPrintable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 331: letter++ ::= letter+ !letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 332: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 333: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 334: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 335: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 336: letter+ ::= letter @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 337: letter+ ::= letter+ letter @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 338: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 339: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 340: stringPrintable* ::= stringPrintable* stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 341: stringPrintable* ::= [stringPrintable*] stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 342: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 343: $$1 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 344: $$2 ::= '"' ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 345: $$2 ::= '"' [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "stringPrintable** ::= stringPrintable* !stringPrintable", // stringPrintable**
    "stringPrintable* ::=", // stringPrintable*
    "start ::= ws* token*", // start
    "ws* ::=", // ws*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "", // $$start
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // stringPrintable**
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // stringPrintable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // start
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // ws*
    },
    { // idChar**
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // $$start
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBoolean(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawClass(parm0);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawExtends(parm0);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVoid(parm0);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInt(parm0);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawWhile(parm0);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawIf(parm0);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawElse(parm0);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFor(parm0);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBreak(parm0);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThis(parm0);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFalse(parm0);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTrue(parm0);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSuper(parm0);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNull(parm0);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawReturn(parm0);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInstanceof(parm0);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNew(parm0);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAbstract(parm0);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssert(parm0);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawByte(parm0);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCase(parm0);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCatch(parm0);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawChar(parm0);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawConst(parm0);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawContinue(parm0);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDefault(parm0);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDo(parm0);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDouble(parm0);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEnum(parm0);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinal(parm0);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinally(parm0);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFloat(parm0);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGoto(parm0);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImplements(parm0);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImport(parm0);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInterface(parm0);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLong(parm0);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNative(parm0);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPackage(parm0);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPrivate(parm0);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawProtected(parm0);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPublic(parm0);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawShort(parm0);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStatic(parm0);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStrictfp(parm0);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSwitch(parm0);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSynchronized(parm0);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrow(parm0);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrows(parm0);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTransient(parm0);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTry(parm0);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVolatile(parm0);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNot(parm0);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNotEqual(parm0);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRemainder(parm0);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAnd(parm0);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTimes(parm0);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLpar(parm0);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRpar(parm0);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrace(parm0);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrace(parm0);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinus(parm0);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlus(parm0);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssign(parm0);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEqual(parm0);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrack(parm0);
    }
    break;
    case 67: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrack(parm0);
    }
    break;
    case 68: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawOr(parm0);
    }
    break;
    case 69: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLess(parm0);
    }
    break;
    case 70: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLessEq(parm0);
    }
    break;
    case 71: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawComma(parm0);
    }
    break;
    case 72: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreater(parm0);
    }
    break;
    case 73: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreaterEq(parm0);
    }
    break;
    case 74: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDot(parm0);
    }
    break;
    case 75: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSemi(parm0);
    }
    break;
    case 76: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlusPlus(parm0);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinusMinus(parm0);
    }
    break;
    case 78: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSlash(parm0);
    }
    break;
    case 79: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.identifier(parm0,parm1);
    }
    break;
    case 80: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.intLit(parm0,parm1);
    }
    break;
    case 81: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.stringLit(parm0,parm1);
    }
    break;
    case 82: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.charLit(parm0,parm1);
    }
    break;
    case 83: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 84: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.zero(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 85: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void sawBoolean(int)",
"void sawClass(int)",
"void sawExtends(int)",
"void sawVoid(int)",
"void sawInt(int)",
"void sawWhile(int)",
"void sawIf(int)",
"void sawElse(int)",
"void sawFor(int)",
"void sawBreak(int)",
"void sawThis(int)",
"void sawFalse(int)",
"void sawTrue(int)",
"void sawSuper(int)",
"void sawNull(int)",
"void sawReturn(int)",
"void sawInstanceof(int)",
"void sawNew(int)",
"void sawAbstract(int)",
"void sawAssert(int)",
"void sawByte(int)",
"void sawCase(int)",
"void sawCatch(int)",
"void sawChar(int)",
"void sawConst(int)",
"void sawContinue(int)",
"void sawDefault(int)",
"void sawDo(int)",
"void sawDouble(int)",
"void sawEnum(int)",
"void sawFinal(int)",
"void sawFinally(int)",
"void sawFloat(int)",
"void sawGoto(int)",
"void sawImplements(int)",
"void sawImport(int)",
"void sawInterface(int)",
"void sawLong(int)",
"void sawNative(int)",
"void sawPackage(int)",
"void sawPrivate(int)",
"void sawProtected(int)",
"void sawPublic(int)",
"void sawShort(int)",
"void sawStatic(int)",
"void sawStrictfp(int)",
"void sawSwitch(int)",
"void sawSynchronized(int)",
"void sawThrow(int)",
"void sawThrows(int)",
"void sawTransient(int)",
"void sawTry(int)",
"void sawVolatile(int)",
"void sawNot(int)",
"void sawNotEqual(int)",
"void sawRemainder(int)",
"void sawAnd(int)",
"void sawTimes(int)",
"void sawLpar(int)",
"void sawRpar(int)",
"void sawLbrace(int)",
"void sawRbrace(int)",
"void sawMinus(int)",
"void sawPlus(int)",
"void sawAssign(int)",
"void sawEqual(int)",
"void sawLbrack(int)",
"void sawRbrack(int)",
"void sawOr(int)",
"void sawLess(int)",
"void sawLessEq(int)",
"void sawComma(int)",
"void sawGreater(int)",
"void sawGreaterEq(int)",
"void sawDot(int)",
"void sawSemi(int)",
"void sawPlusPlus(int)",
"void sawMinusMinus(int)",
"void sawSlash(int)",
"void identifier(int,String)",
"void intLit(int,int)",
"void stringLit(int,String)",
"void charLit(int,int)",
"int convertToInt(int,String)",
"int zero(char,char,char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
2,0,
2,0,
2,0,
2,0,
2,1,
3,1,
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
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
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
    1,
    1,
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
    1,
    -1,
    0,
    -1,
    0,
    -1,
    -1,
    1,
    1,
    0,
    1,
    1,
    0,
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
