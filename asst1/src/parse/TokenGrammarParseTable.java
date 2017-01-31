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
private static final int MIN_REDUCTION = 746;
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
0x80000000|219, // match move
0x80000000|169, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 2
2,404, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 3
  }
,
{ // state 4
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 5
94,314, // "e"
  }
,
{ // state 6
0x80000000|707, // match move
0x80000000|32, // no-match move
// T-test match for ".":
124,
  }
,
{ // state 7
0x80000000|151, // match move
0x80000000|360, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 8
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 9
2,19, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 10
2,663, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 11
102,86, // "d"
  }
,
{ // state 12
167,MIN_REDUCTION+306, // $NT
  }
,
{ // state 13
98,556, // "r"
  }
,
{ // state 14
88,393, // "c"
  }
,
{ // state 15
2,599, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
157,305, // idChar**
158,543, // $$1
163,107, // idChar*
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 16
167,MIN_REDUCTION+201, // $NT
  }
,
{ // state 17
-1, // $$start
-1, // start
648, // ws*
-1, // $$0
MIN_REDUCTION+122, // token
458, // `boolean
569, // `class
353, // `extends
423, // `void
274, // `int
295, // `while
58, // `if
483, // `else
71, // `for
720, // `break
179, // `this
296, // `false
453, // `true
326, // `super
388, // `null
408, // `return
23, // `instanceof
462, // `new
20, // `abstract
29, // `assert
28, // `byte
635, // `case
664, // `catch
8, // `char
258, // `const
551, // `continue
570, // `default
79, // `do
230, // `double
724, // `enum
366, // `final
229, // `finally
299, // `float
196, // `goto
515, // `implements
520, // `import
61, // `interface
277, // `long
160, // `native
89, // `package
139, // `private
715, // `protected
44, // `public
660, // `short
464, // `static
328, // `strictfp
397, // `switch
721, // `synchronized
732, // `throw
473, // `throws
83, // `transient
699, // `try
212, // `volatile
729, // `!
124, // `!=
291, // `%
145, // `&&
72, // `*
704, // `(
70, // `)
1, // `{
696, // `}
49, // `-
413, // `+
478, // `=
155, // `==
289, // `[
152, // `]
147, // `||
205, // `<
636, // `<=
620, // `,
384, // `>
681, // `>=
466, // `.
272, // `;
601, // `++
24, // `--
269, // `/
-1, // ID
207, // INTLIT
282, // STRINGLIT
111, // CHARLIT
227, // "c"
501, // "l"
457, // "a"
456, // "s"
-1, // idChar
-1, // reserved
559, // "e"
499, // "b"
MIN_REDUCTION+122, // "o"
354, // "n"
223, // "r"
MIN_REDUCTION+122, // "k"
MIN_REDUCTION+122, // "x"
646, // "t"
322, // "d"
442, // "p"
MIN_REDUCTION+122, // "u"
25, // "i"
372, // "v"
237, // "f"
576, // "w"
MIN_REDUCTION+122, // "h"
MIN_REDUCTION+122, // "y"
MIN_REDUCTION+122, // "m"
545, // "g"
MIN_REDUCTION+122, // "z"
534, // "!"
666, // "="
35, // "*"
548, // "%"
209, // "&"
303, // "("
60, // ")"
587, // "+"
692, // ","
200, // "-"
153, // "."
588, // "/"
577, // ";"
181, // "<"
496, // ">"
270, // "["
573, // "]"
439, // "{"
266, // "}"
18, // "|"
-1, // intLit2
MIN_REDUCTION+122, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
178, // " "
MIN_REDUCTION+122, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+122, // {"A".."Z"}
381, // "'"
MIN_REDUCTION+122, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
339, // '"'
119, // ws
178, // {9}
438, // eol
449, // {10}
597, // {13}
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
{ // state 18
133,51, // "|"
  }
,
{ // state 19
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 20
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 21
2,355, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 22
0x80000000|3, // match move
0x80000000|97, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 23
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 25
97,653, // "n"
107,566, // "f"
111,176, // "m"
  }
,
{ // state 26
0x80000000|3, // match move
0x80000000|99, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 27
167,MIN_REDUCTION+108, // $NT
  }
,
{ // state 28
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 29
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 30
88,368, // "c"
  }
,
{ // state 31
146,81, // "'"
  }
,
{ // state 32
0x80000000|333, // match move
0x80000000|712, // no-match move
0x80000000|43, // NT-test-match state for digit
  }
,
{ // state 33
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
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
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 37
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 38
98,502, // "r"
  }
,
{ // state 39
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 40
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 41
0x80000000|3, // match move
0x80000000|116, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 42
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 43
135,340, // "0"
142,340, // {"1".."9"}
  }
,
{ // state 44
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 45
167,MIN_REDUCTION+96, // $NT
  }
,
{ // state 46
101,531, // "t"
  }
,
{ // state 47
167,MIN_REDUCTION+334, // $NT
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 48
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 49
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 50
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 51
2,136, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 52
1,98, // start
2,92, // ws*
3,224, // $$0
4,57, // token
58,729, // `!
59,124, // `!=
60,291, // `%
61,145, // `&&
62,72, // `*
63,704, // `(
64,70, // `)
65,1, // `{
66,696, // `}
67,49, // `-
68,413, // `+
69,478, // `=
70,155, // `==
71,289, // `[
72,152, // `]
73,147, // `||
74,205, // `<
75,636, // `<=
76,620, // `,
77,384, // `>
78,681, // `>=
79,466, // `.
80,272, // `;
81,601, // `++
82,24, // `--
83,269, // `/
84,42, // ID
85,207, // INTLIT
86,282, // STRINGLIT
87,111, // CHARLIT
137,348, // letter
151,119, // ws
153,438, // eol
156,185, // letter++
161,443, // token*
165,251, // letter+
  }
,
{ // state 53
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 54
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 55
94,440, // "e"
  }
,
{ // state 56
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 59
0x80000000|3, // match move
0x80000000|744, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 60
2,255, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 62
0x80000000|310, // match move
0x80000000|682, // no-match move
// T-test match for ".":
124,
  }
,
{ // state 63
0x80000000|3, // match move
0x80000000|320, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 64
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 65
0x80000000|3, // match move
0x80000000|705, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 66
91,639, // "s"
  }
,
{ // state 67
105,252, // "i"
109,232, // "h"
  }
,
{ // state 68
167,MIN_REDUCTION+225, // $NT
  }
,
{ // state 69
MIN_REDUCTION+331, // (default reduction)
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
94,267, // "e"
  }
,
{ // state 74
2,600, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 75
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 76
0x80000000|3, // match move
0x80000000|736, // no-match move
0x80000000|164, // NT-test-match state for letter
  }
,
{ // state 77
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 78
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 80
103,391, // "p"
  }
,
{ // state 81
2,509, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+309, // (default reduction)
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
94,422, // "e"
  }
,
{ // state 86
0x80000000|3, // match move
0x80000000|332, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 87
104,656, // "u"
  }
,
{ // state 88
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
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
0x80000000|701, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 91
94,426, // "e"
  }
,
{ // state 92
0x80000000|477, // match move
0x80000000|321, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 93
89,486, // "l"
  }
,
{ // state 94
167,MIN_REDUCTION+207, // $NT
  }
,
{ // state 95
2,614, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 96
89,429, // "l"
  }
,
{ // state 97
2,403, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 98
166,MIN_REDUCTION+0, // $
  }
,
{ // state 99
2,719, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 100
3,592, // $$0
4,57, // token
5,458, // `boolean
6,569, // `class
7,353, // `extends
8,423, // `void
9,274, // `int
10,295, // `while
11,58, // `if
12,483, // `else
13,71, // `for
14,720, // `break
15,179, // `this
16,296, // `false
17,453, // `true
18,326, // `super
19,388, // `null
20,408, // `return
21,23, // `instanceof
22,462, // `new
23,20, // `abstract
24,29, // `assert
25,28, // `byte
26,635, // `case
27,664, // `catch
28,8, // `char
29,258, // `const
30,551, // `continue
31,570, // `default
32,79, // `do
33,230, // `double
34,724, // `enum
35,366, // `final
36,229, // `finally
37,299, // `float
38,196, // `goto
39,515, // `implements
40,520, // `import
41,61, // `interface
42,277, // `long
43,160, // `native
44,89, // `package
45,139, // `private
46,715, // `protected
47,44, // `public
48,660, // `short
49,464, // `static
50,328, // `strictfp
51,397, // `switch
52,721, // `synchronized
53,732, // `throw
54,473, // `throws
55,83, // `transient
56,699, // `try
57,212, // `volatile
161,443, // token*
  }
,
{ // state 101
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 103
0x80000000|3, // match move
0x80000000|359, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 104
104,260, // "u"
  }
,
{ // state 105
0x80000000|3, // match move
0x80000000|727, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 106
167,MIN_REDUCTION+117, // $NT
  }
,
{ // state 107
0x80000000|382, // match move
0x80000000|69, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 108
0x80000000|3, // match move
0x80000000|180, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 109
94,492, // "e"
  }
,
{ // state 110
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 112
-1, // $$start
-1, // start
461, // ws*
-1, // $$0
MIN_REDUCTION+176, // token
458, // `boolean
569, // `class
353, // `extends
423, // `void
274, // `int
295, // `while
58, // `if
483, // `else
71, // `for
720, // `break
179, // `this
296, // `false
453, // `true
326, // `super
388, // `null
408, // `return
23, // `instanceof
462, // `new
20, // `abstract
29, // `assert
28, // `byte
635, // `case
664, // `catch
8, // `char
258, // `const
551, // `continue
570, // `default
79, // `do
230, // `double
724, // `enum
366, // `final
229, // `finally
299, // `float
196, // `goto
515, // `implements
520, // `import
61, // `interface
277, // `long
160, // `native
89, // `package
139, // `private
715, // `protected
44, // `public
660, // `short
464, // `static
328, // `strictfp
397, // `switch
721, // `synchronized
732, // `throw
473, // `throws
83, // `transient
699, // `try
212, // `volatile
729, // `!
124, // `!=
291, // `%
145, // `&&
72, // `*
704, // `(
70, // `)
1, // `{
696, // `}
49, // `-
413, // `+
478, // `=
155, // `==
289, // `[
152, // `]
147, // `||
205, // `<
636, // `<=
620, // `,
384, // `>
681, // `>=
466, // `.
272, // `;
601, // `++
24, // `--
269, // `/
-1, // ID
207, // INTLIT
282, // STRINGLIT
111, // CHARLIT
227, // "c"
501, // "l"
457, // "a"
456, // "s"
-1, // idChar
-1, // reserved
494, // "e"
499, // "b"
MIN_REDUCTION+176, // "o"
354, // "n"
223, // "r"
MIN_REDUCTION+176, // "k"
MIN_REDUCTION+176, // "x"
646, // "t"
322, // "d"
442, // "p"
656, // "u"
25, // "i"
372, // "v"
237, // "f"
576, // "w"
MIN_REDUCTION+176, // "h"
MIN_REDUCTION+176, // "y"
MIN_REDUCTION+176, // "m"
545, // "g"
MIN_REDUCTION+176, // "z"
534, // "!"
666, // "="
35, // "*"
548, // "%"
209, // "&"
303, // "("
60, // ")"
587, // "+"
692, // ","
200, // "-"
153, // "."
588, // "/"
577, // ";"
181, // "<"
496, // ">"
270, // "["
573, // "]"
439, // "{"
266, // "}"
18, // "|"
-1, // intLit2
MIN_REDUCTION+176, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
178, // " "
MIN_REDUCTION+176, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+176, // {"A".."Z"}
381, // "'"
MIN_REDUCTION+176, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
339, // '"'
119, // ws
178, // {9}
438, // eol
449, // {10}
597, // {13}
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
{ // state 113
167,MIN_REDUCTION+308, // $NT
  }
,
{ // state 114
104,256, // "u"
  }
,
{ // state 115
101,118, // "t"
104,80, // "u"
108,642, // "w"
109,434, // "h"
110,410, // "y"
  }
,
{ // state 116
2,54, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 117
94,447, // "e"
  }
,
{ // state 118
90,685, // "a"
98,385, // "r"
  }
,
{ // state 119
167,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 120
2,615, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 121
97,460, // "n"
  }
,
{ // state 122
94,526, // "e"
  }
,
{ // state 123
167,MIN_REDUCTION+204, // $NT
  }
,
{ // state 124
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 125
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 126
0x80000000|523, // match move
0x80000000|357, // no-match move
0x80000000|164, // NT-test-match state for letter
  }
,
{ // state 127
139,MIN_REDUCTION+313, // "_"
157,MIN_REDUCTION+313, // idChar**
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 128
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 129
112,242, // "g"
  }
,
{ // state 130
167,MIN_REDUCTION+222, // $NT
  }
,
{ // state 131
107,471, // "f"
  }
,
{ // state 132
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 133
98,459, // "r"
  }
,
{ // state 134
2,315, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 135
102,215, // "d"
  }
,
{ // state 136
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 137
88,452, // "c"
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
97,591, // "n"
  }
,
{ // state 141
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 142
101,517, // "t"
  }
,
{ // state 143
5,45, // `boolean
6,407, // `class
7,723, // `extends
8,27, // `void
9,463, // `int
10,498, // `while
11,608, // `if
12,737, // `else
13,480, // `for
14,596, // `break
15,540, // `this
16,106, // `false
17,323, // `true
18,617, // `super
19,370, // `null
20,513, // `return
21,338, // `instanceof
22,734, // `new
23,657, // `abstract
24,628, // `assert
25,521, // `byte
26,702, // `case
27,335, // `catch
28,676, // `char
29,275, // `const
30,356, // `continue
31,406, // `default
32,532, // `do
33,284, // `double
34,411, // `enum
35,329, // `final
36,259, // `finally
37,221, // `float
38,530, // `goto
39,415, // `implements
40,16, // `import
41,123, // `interface
42,94, // `long
43,414, // `native
44,554, // `package
45,604, // `private
46,616, // `protected
47,347, // `public
48,130, // `short
49,68, // `static
50,84, // `strictfp
51,34, // `switch
52,437, // `synchronized
53,261, // `throw
54,621, // `throws
55,582, // `transient
56,598, // `try
57,603, // `volatile
88,227, // "c"
89,501, // "l"
90,457, // "a"
91,456, // "s"
94,494, // "e"
95,499, // "b"
97,354, // "n"
98,223, // "r"
101,646, // "t"
102,322, // "d"
103,442, // "p"
105,25, // "i"
106,372, // "v"
107,237, // "f"
108,576, // "w"
112,545, // "g"
  }
,
{ // state 144
96,121, // "o"
110,241, // "y"
  }
,
{ // state 145
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 148
90,281, // "a"
104,623, // "u"
105,742, // "i"
110,103, // "y"
  }
,
{ // state 149
0x80000000|593, // match move
0x80000000|162, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 150
0x80000000|156, // match move
0x80000000|257, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 151
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 152
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 153
2,40, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 154
2,675, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 157
99,510, // "k"
  }
,
{ // state 158
2,695, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 159
91,195, // "s"
  }
,
{ // state 160
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 161
0x80000000|441, // match move
0x80000000|709, // no-match move
0x80000000|265, // NT-test-match state for stringPrintable
  }
,
{ // state 162
0x80000000|508, // match move
0x80000000|450, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 163
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 164
88,514, // "c"
89,514, // "l"
90,514, // "a"
91,514, // "s"
94,514, // "e"
95,514, // "b"
96,514, // "o"
97,514, // "n"
98,514, // "r"
99,514, // "k"
100,514, // "x"
101,514, // "t"
102,514, // "d"
103,514, // "p"
104,514, // "u"
105,514, // "i"
106,514, // "v"
107,514, // "f"
108,514, // "w"
109,514, // "h"
110,514, // "y"
111,514, // "m"
112,514, // "g"
113,514, // "z"
145,514, // {"A".."Z"}
147,514, // {"j" "q"}
  }
,
{ // state 165
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 166
0x80000000|589, // match move
0x80000000|631, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 167
2,306, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 169
0x80000000|634, // match move
0x80000000|220, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 170
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 171
91,725, // "s"
  }
,
{ // state 172
88,731, // "c"
  }
,
{ // state 173
94,626, // "e"
  }
,
{ // state 174
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 175
0x80000000|651, // match move
0x80000000|165, // no-match move
0x80000000|265, // NT-test-match state for stringPrintable
  }
,
{ // state 176
103,293, // "p"
  }
,
{ // state 177
94,572, // "e"
  }
,
{ // state 178
167,MIN_REDUCTION+315, // $NT
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 180
2,392, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 181
0x80000000|264, // match move
0x80000000|154, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 182
138,590, // digit
  }
,
{ // state 183
90,622, // "a"
  }
,
{ // state 184
0x80000000|684, // match move
0x80000000|524, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 185
0x80000000|694, // match move
0x80000000|15, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 186
108,481, // "w"
  }
,
{ // state 187
105,638, // "i"
  }
,
{ // state 188
101,594, // "t"
  }
,
{ // state 189
97,225, // "n"
  }
,
{ // state 190
101,159, // "t"
  }
,
{ // state 191
88,371, // "c"
89,371, // "l"
90,371, // "a"
91,371, // "s"
94,371, // "e"
95,371, // "b"
96,371, // "o"
97,371, // "n"
98,371, // "r"
99,371, // "k"
100,371, // "x"
101,371, // "t"
102,371, // "d"
103,371, // "p"
104,371, // "u"
105,371, // "i"
106,371, // "v"
107,371, // "f"
108,371, // "w"
109,371, // "h"
110,371, // "y"
111,371, // "m"
112,371, // "g"
113,371, // "z"
114,367, // "!"
115,161, // "="
116,161, // "*"
117,161, // "%"
118,161, // "&"
119,161, // "("
120,161, // ")"
121,161, // "+"
122,161, // ","
123,161, // "-"
124,161, // "."
125,161, // "/"
126,161, // ";"
127,161, // "<"
128,161, // ">"
129,161, // "["
130,371, // "]"
131,371, // "{"
132,371, // "}"
133,371, // "|"
135,161, // "0"
139,371, // "_"
140,654, // stringPrintable
141,367, // " "
142,161, // {"1".."9"}
143,161, // {":" "?".."@"}
144,161, // {"#".."$"}
145,161, // {"A".."Z"}
146,161, // "'"
147,371, // {"j" "q"}
148,371, // {"^" "`" "~"}
  }
,
{ // state 192
109,512, // "h"
  }
,
{ // state 193
105,739, // "i"
  }
,
{ // state 194
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 195
0x80000000|3, // match move
0x80000000|472, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 196
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 197
2,574, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 198
0x80000000|3, // match move
0x80000000|351, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 199
0x80000000|3, // match move
0x80000000|470, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 200
0x80000000|304, // match move
0x80000000|250, // no-match move
// T-test match for "-":
123,
  }
,
{ // state 201
0x80000000|337, // match move
0x80000000|132, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 202
2,467, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 203
0x80000000|3, // match move
0x80000000|288, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 204
0x80000000|3, // match move
0x80000000|619, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 205
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 206
106,549, // "v"
  }
,
{ // state 207
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 208
4,345, // token
5,458, // `boolean
6,569, // `class
7,353, // `extends
8,423, // `void
9,274, // `int
10,295, // `while
11,58, // `if
12,483, // `else
13,71, // `for
14,720, // `break
15,179, // `this
16,296, // `false
17,453, // `true
18,326, // `super
19,388, // `null
20,408, // `return
21,23, // `instanceof
22,462, // `new
23,20, // `abstract
24,29, // `assert
25,28, // `byte
26,635, // `case
27,664, // `catch
28,8, // `char
29,258, // `const
30,551, // `continue
31,570, // `default
32,79, // `do
33,230, // `double
34,724, // `enum
35,366, // `final
36,229, // `finally
37,299, // `float
38,196, // `goto
39,515, // `implements
40,520, // `import
41,61, // `interface
42,277, // `long
43,160, // `native
44,89, // `package
45,139, // `private
46,715, // `protected
47,44, // `public
48,660, // `short
49,464, // `static
50,328, // `strictfp
51,397, // `switch
52,721, // `synchronized
53,732, // `throw
54,473, // `throws
55,83, // `transient
56,699, // `try
57,212, // `volatile
  }
,
{ // state 209
118,262, // "&"
  }
,
{ // state 210
104,133, // "u"
  }
,
{ // state 211
115,283, // "="
  }
,
{ // state 212
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 213
101,602, // "t"
  }
,
{ // state 214
2,56, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 215
91,308, // "s"
  }
,
{ // state 216
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 217
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 218
103,22, // "p"
  }
,
{ // state 219
0x80000000|527, // match move
0x80000000|52, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 220
-1, // $$start
98, // start
92, // ws*
224, // $$0
57, // token
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
729, // `!
124, // `!=
291, // `%
145, // `&&
72, // `*
704, // `(
70, // `)
1, // `{
696, // `}
49, // `-
413, // `+
478, // `=
155, // `==
289, // `[
152, // `]
147, // `||
205, // `<
636, // `<=
620, // `,
384, // `>
681, // `>=
466, // `.
272, // `;
601, // `++
24, // `--
269, // `/
42, // ID
207, // INTLIT
282, // STRINGLIT
111, // CHARLIT
557, // "c"
557, // "l"
557, // "a"
557, // "s"
-1, // idChar
-1, // reserved
557, // "e"
557, // "b"
557, // "o"
557, // "n"
557, // "r"
557, // "k"
557, // "x"
557, // "t"
557, // "d"
557, // "p"
557, // "u"
557, // "i"
557, // "v"
557, // "f"
557, // "w"
557, // "h"
557, // "y"
557, // "m"
557, // "g"
557, // "z"
534, // "!"
666, // "="
35, // "*"
548, // "%"
209, // "&"
303, // "("
60, // ")"
587, // "+"
692, // ","
200, // "-"
153, // "."
588, // "/"
577, // ";"
181, // "<"
496, // ">"
270, // "["
573, // "]"
439, // "{"
266, // "}"
18, // "|"
405, // intLit2
62, // "0"
336, // digit++
348, // letter
6, // digit
-1, // "_"
-1, // stringPrintable
178, // " "
62, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
557, // {"A".."Z"}
381, // "'"
557, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
339, // '"'
119, // ws
178, // {9}
438, // eol
449, // {10}
597, // {13}
185, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
443, // token*
474, // digit+
-1, // idChar*
-1, // stringPrintable*
251, // letter+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 221
167,MIN_REDUCTION+192, // $NT
  }
,
{ // state 222
2,491, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 223
94,550, // "e"
  }
,
{ // state 224
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 225
90,476, // "a"
  }
,
{ // state 226
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 227
89,580, // "l"
90,238, // "a"
96,504, // "o"
109,427, // "h"
  }
,
{ // state 228
96,186, // "o"
  }
,
{ // state 229
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 231
89,117, // "l"
  }
,
{ // state 232
105,96, // "i"
  }
,
{ // state 233
167,MIN_REDUCTION+304, // $NT
  }
,
{ // state 234
91,539, // "s"
  }
,
{ // state 235
98,538, // "r"
  }
,
{ // state 236
88,680, // "c"
  }
,
{ // state 237
89,331, // "l"
90,674, // "a"
96,541, // "o"
105,189, // "i"
  }
,
{ // state 238
91,605, // "s"
101,349, // "t"
  }
,
{ // state 239
98,585, // "r"
  }
,
{ // state 240
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 241
0x80000000|3, // match move
0x80000000|134, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 242
94,198, // "e"
  }
,
{ // state 243
101,641, // "t"
  }
,
{ // state 244
105,640, // "i"
  }
,
{ // state 245
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 246
94,586, // "e"
  }
,
{ // state 247
2,613, // ws*
58,729, // `!
59,124, // `!=
60,291, // `%
61,145, // `&&
62,72, // `*
63,704, // `(
64,70, // `)
65,1, // `{
66,696, // `}
67,49, // `-
68,413, // `+
70,155, // `==
71,289, // `[
72,152, // `]
73,147, // `||
75,636, // `<=
76,620, // `,
78,681, // `>=
79,466, // `.
80,272, // `;
81,601, // `++
82,24, // `--
83,269, // `/
84,42, // ID
85,207, // INTLIT
86,282, // STRINGLIT
87,111, // CHARLIT
115,166, // "="
134,405, // intLit2
136,336, // digit++
137,348, // letter
138,6, // digit
151,119, // ws
153,438, // eol
156,185, // letter++
162,474, // digit+
165,251, // letter+
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 248
2,574, // ws*
5,458, // `boolean
6,569, // `class
7,353, // `extends
8,423, // `void
9,274, // `int
10,295, // `while
11,58, // `if
12,483, // `else
13,71, // `for
14,720, // `break
15,179, // `this
16,296, // `false
17,453, // `true
18,326, // `super
19,388, // `null
20,408, // `return
21,23, // `instanceof
22,462, // `new
23,20, // `abstract
24,29, // `assert
25,28, // `byte
26,635, // `case
27,664, // `catch
28,8, // `char
29,258, // `const
30,551, // `continue
31,570, // `default
32,79, // `do
33,230, // `double
34,724, // `enum
35,366, // `final
36,229, // `finally
37,299, // `float
38,196, // `goto
39,515, // `implements
40,520, // `import
41,61, // `interface
42,277, // `long
43,160, // `native
44,89, // `package
45,139, // `private
46,715, // `protected
47,44, // `public
48,660, // `short
49,464, // `static
50,328, // `strictfp
51,397, // `switch
52,721, // `synchronized
53,732, // `throw
54,473, // `throws
55,83, // `transient
56,699, // `try
57,212, // `volatile
88,227, // "c"
89,501, // "l"
90,457, // "a"
91,456, // "s"
94,494, // "e"
95,499, // "b"
97,354, // "n"
98,223, // "r"
101,646, // "t"
102,322, // "d"
103,442, // "p"
105,25, // "i"
106,372, // "v"
107,237, // "f"
108,576, // "w"
112,545, // "g"
115,283, // "="
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 249
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 250
2,50, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 251
0x80000000|468, // match move
0x80000000|76, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 252
101,584, // "t"
  }
,
{ // state 253
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 254
101,402, // "t"
  }
,
{ // state 255
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 256
111,108, // "m"
  }
,
{ // state 257
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 258
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 259
167,MIN_REDUCTION+189, // $NT
  }
,
{ // state 260
89,565, // "l"
  }
,
{ // state 261
167,MIN_REDUCTION+234, // $NT
  }
,
{ // state 262
2,327, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 263
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 264
115,568, // "="
  }
,
{ // state 265
88,424, // "c"
89,424, // "l"
90,424, // "a"
91,424, // "s"
94,424, // "e"
95,424, // "b"
96,424, // "o"
97,424, // "n"
98,424, // "r"
99,424, // "k"
100,424, // "x"
101,424, // "t"
102,424, // "d"
103,424, // "p"
104,424, // "u"
105,424, // "i"
106,424, // "v"
107,424, // "f"
108,424, // "w"
109,424, // "h"
110,424, // "y"
111,424, // "m"
112,424, // "g"
113,424, // "z"
114,484, // "!"
115,113, // "="
116,113, // "*"
117,113, // "%"
118,113, // "&"
119,113, // "("
120,113, // ")"
121,113, // "+"
122,113, // ","
123,113, // "-"
124,113, // "."
125,113, // "/"
126,113, // ";"
127,113, // "<"
128,113, // ">"
129,113, // "["
130,424, // "]"
131,424, // "{"
132,424, // "}"
133,424, // "|"
135,113, // "0"
139,424, // "_"
141,484, // " "
142,113, // {"1".."9"}
143,113, // {":" "?".."@"}
144,113, // {"#".."$"}
145,113, // {"A".."Z"}
146,113, // "'"
147,424, // {"j" "q"}
148,424, // {"^" "`" "~"}
  }
,
{ // state 266
2,245, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 267
102,645, // "d"
  }
,
{ // state 268
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 269
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 270
2,64, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 271
0x80000000|3, // match move
0x80000000|167, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 272
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 273
MIN_REDUCTION+341, // (default reduction)
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
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 277
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 278
105,733, // "i"
  }
,
{ // state 279
101,686, // "t"
  }
,
{ // state 280
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 281
97,687, // "n"
  }
,
{ // state 282
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 283
2,386, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 284
167,MIN_REDUCTION+180, // $NT
  }
,
{ // state 285
101,637, // "t"
  }
,
{ // state 286
96,741, // "o"
  }
,
{ // state 287
101,552, // "t"
  }
,
{ // state 288
2,342, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 290
88,557, // "c"
89,557, // "l"
90,557, // "a"
91,557, // "s"
94,557, // "e"
95,557, // "b"
96,557, // "o"
97,557, // "n"
98,557, // "r"
99,557, // "k"
100,557, // "x"
101,557, // "t"
102,557, // "d"
103,557, // "p"
104,557, // "u"
105,557, // "i"
106,557, // "v"
107,557, // "f"
108,557, // "w"
109,557, // "h"
110,557, // "y"
111,557, // "m"
112,557, // "g"
113,557, // "z"
137,713, // letter
145,557, // {"A".."Z"}
147,557, // {"j" "q"}
  }
,
{ // state 291
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 292
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 293
89,55, // "l"
96,670, // "o"
  }
,
{ // state 294
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
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
0x80000000|112, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 298
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 300
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 301
89,643, // "l"
  }
,
{ // state 302
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 303
2,307, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 304
123,380, // "-"
  }
,
{ // state 305
2,599, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
158,146, // $$1
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 306
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 307
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 308
0x80000000|3, // match move
0x80000000|214, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 309
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 310
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 311
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 312
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 313
0x80000000|3, // match move
0x80000000|127, // no-match move
0x80000000|164, // NT-test-match state for letter
  }
,
{ // state 314
0x80000000|3, // match move
0x80000000|488, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 315
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 316
0x80000000|105, // match move
0x80000000|487, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 317
167,MIN_REDUCTION+319, // $NT
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 318
90,571, // "a"
  }
,
{ // state 319
106,583, // "v"
  }
,
{ // state 320
2,263, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 321
0x80000000|658, // match move
0x80000000|401, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 322
94,131, // "e"
96,297, // "o"
  }
,
{ // state 323
167,MIN_REDUCTION+144, // $NT
  }
,
{ // state 324
0x80000000|3, // match move
0x80000000|120, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 325
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 326
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 327
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 328
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 329
167,MIN_REDUCTION+186, // $NT
  }
,
{ // state 330
97,673, // "n"
  }
,
{ // state 331
96,547, // "o"
  }
,
{ // state 332
2,226, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 334
105,743, // "i"
  }
,
{ // state 335
167,MIN_REDUCTION+162, // $NT
  }
,
{ // state 336
0x80000000|3, // match move
0x80000000|39, // no-match move
// T-test match for ".":
124,
  }
,
{ // state 337
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 338
167,MIN_REDUCTION+114, // $NT
  }
,
{ // state 339
0x80000000|672, // match move
0x80000000|629, // no-match move
0x80000000|265, // NT-test-match state for stringPrintable
  }
,
{ // state 340
167,MIN_REDUCTION+314, // $NT
  }
,
{ // state 341
0x80000000|302, // match move
0x80000000|363, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 342
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 343
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 344
96,644, // "o"
  }
,
{ // state 345
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 346
104,5, // "u"
  }
,
{ // state 347
167,MIN_REDUCTION+105, // $NT
  }
,
{ // state 348
0x80000000|126, // match move
0x80000000|400, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 349
88,536, // "c"
  }
,
{ // state 350
89,703, // "l"
  }
,
{ // state 351
2,387, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 352
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 354
90,285, // "a"
94,579, // "e"
104,301, // "u"
  }
,
{ // state 355
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 356
167,MIN_REDUCTION+171, // $NT
  }
,
{ // state 357
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 358
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 359
2,535, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 360
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 361
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 362
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 363
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 364
150,697, // '"'
160,168, // $$2
  }
,
{ // state 365
88,157, // "c"
  }
,
{ // state 366
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 367
0x80000000|558, // match move
0x80000000|36, // no-match move
0x80000000|265, // NT-test-match state for stringPrintable
  }
,
{ // state 368
109,735, // "h"
  }
,
{ // state 369
91,609, // "s"
101,278, // "t"
  }
,
{ // state 370
167,MIN_REDUCTION+129, // $NT
  }
,
{ // state 371
0x80000000|82, // match move
0x80000000|358, // no-match move
0x80000000|265, // NT-test-match state for stringPrintable
  }
,
{ // state 372
96,465, // "o"
  }
,
{ // state 373
91,91, // "s"
  }
,
{ // state 374
91,669, // "s"
  }
,
{ // state 375
2,292, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 376
0x80000000|361, // match move
0x80000000|544, // no-match move
0x80000000|164, // NT-test-match state for letter
  }
,
{ // state 377
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 378
2,325, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 379
2,163, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 380
2,518, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 381
88,194, // "c"
89,194, // "l"
90,194, // "a"
91,194, // "s"
94,194, // "e"
95,194, // "b"
96,194, // "o"
97,194, // "n"
98,194, // "r"
99,194, // "k"
100,194, // "x"
101,194, // "t"
102,194, // "d"
103,194, // "p"
104,194, // "u"
105,194, // "i"
106,194, // "v"
107,194, // "f"
108,194, // "w"
109,194, // "h"
110,194, // "y"
111,194, // "m"
112,194, // "g"
113,194, // "z"
114,688, // "!"
115,522, // "="
116,522, // "*"
117,688, // "%"
118,688, // "&"
119,522, // "("
120,522, // ")"
121,522, // "+"
122,522, // ","
123,522, // "-"
124,522, // "."
125,522, // "/"
126,522, // ";"
127,522, // "<"
128,522, // ">"
129,522, // "["
130,194, // "]"
131,194, // "{"
132,194, // "}"
133,194, // "|"
135,522, // "0"
139,194, // "_"
141,688, // " "
142,522, // {"1".."9"}
143,522, // {":" "?".."@"}
144,688, // {"#".."$"}
145,522, // {"A".."Z"}
147,194, // {"j" "q"}
148,194, // {"^" "`" "~"}
149,31, // charPrintable
150,688, // '"'
  }
,
{ // state 382
88,150, // "c"
89,150, // "l"
90,150, // "a"
91,150, // "s"
92,201, // idChar
94,150, // "e"
95,150, // "b"
96,150, // "o"
97,150, // "n"
98,150, // "r"
99,150, // "k"
100,150, // "x"
101,150, // "t"
102,150, // "d"
103,150, // "p"
104,150, // "u"
105,150, // "i"
106,150, // "v"
107,150, // "f"
108,150, // "w"
109,150, // "h"
110,150, // "y"
111,150, // "m"
112,150, // "g"
113,150, // "z"
135,612, // "0"
137,511, // letter
138,341, // digit
139,7, // "_"
142,612, // {"1".."9"}
145,150, // {"A".."Z"}
147,150, // {"j" "q"}
  }
,
{ // state 383
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 384
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 385
105,742, // "i"
  }
,
{ // state 386
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 387
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 388
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 389
2,33, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 390
96,142, // "o"
105,319, // "i"
  }
,
{ // state 391
94,691, // "e"
  }
,
{ // state 392
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 393
101,73, // "t"
  }
,
{ // state 394
2,88, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 395
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 396
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 397
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 398
4,345, // token
58,729, // `!
59,124, // `!=
60,291, // `%
61,145, // `&&
62,72, // `*
63,704, // `(
64,70, // `)
65,1, // `{
66,696, // `}
67,49, // `-
68,413, // `+
69,478, // `=
70,155, // `==
71,289, // `[
72,152, // `]
73,147, // `||
74,205, // `<
75,636, // `<=
76,620, // `,
77,384, // `>
78,681, // `>=
79,466, // `.
80,272, // `;
81,601, // `++
82,24, // `--
83,269, // `/
84,42, // ID
85,207, // INTLIT
86,282, // STRINGLIT
87,111, // CHARLIT
137,348, // letter
156,185, // letter++
165,251, // letter+
  }
,
{ // state 399
110,241, // "y"
  }
,
{ // state 400
0x80000000|3, // match move
0x80000000|700, // no-match move
0x80000000|164, // NT-test-match state for letter
  }
,
{ // state 401
-1, // $$start
-1, // start
-1, // ws*
592, // $$0
57, // token
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
729, // `!
124, // `!=
291, // `%
145, // `&&
72, // `*
704, // `(
70, // `)
1, // `{
696, // `}
49, // `-
413, // `+
478, // `=
155, // `==
289, // `[
152, // `]
147, // `||
205, // `<
636, // `<=
620, // `,
384, // `>
681, // `>=
466, // `.
272, // `;
601, // `++
24, // `--
269, // `/
42, // ID
207, // INTLIT
282, // STRINGLIT
111, // CHARLIT
557, // "c"
557, // "l"
557, // "a"
557, // "s"
-1, // idChar
-1, // reserved
557, // "e"
557, // "b"
557, // "o"
557, // "n"
557, // "r"
557, // "k"
557, // "x"
557, // "t"
557, // "d"
557, // "p"
557, // "u"
557, // "i"
557, // "v"
557, // "f"
557, // "w"
557, // "h"
557, // "y"
557, // "m"
557, // "g"
557, // "z"
534, // "!"
666, // "="
35, // "*"
548, // "%"
209, // "&"
303, // "("
60, // ")"
587, // "+"
692, // ","
200, // "-"
153, // "."
588, // "/"
577, // ";"
181, // "<"
496, // ">"
270, // "["
573, // "]"
439, // "{"
266, // "}"
18, // "|"
405, // intLit2
62, // "0"
336, // digit++
348, // letter
6, // digit
-1, // "_"
-1, // stringPrintable
178, // " "
62, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
557, // {"A".."Z"}
381, // "'"
557, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
339, // '"'
47, // ws
178, // {9}
438, // eol
449, // {10}
597, // {13}
185, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
443, // token*
474, // digit+
-1, // idChar*
-1, // stringPrintable*
251, // letter+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 402
0x80000000|3, // match move
0x80000000|222, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 403
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 404
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 405
2,706, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 406
167,MIN_REDUCTION+174, // $NT
  }
,
{ // state 407
167,MIN_REDUCTION+90, // $NT
  }
,
{ // state 408
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 409
2,362, // ws*
151,119, // ws
153,438, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 410
97,30, // "n"
  }
,
{ // state 411
167,MIN_REDUCTION+183, // $NT
  }
,
{ // state 412
0x80000000|3, // match move
0x80000000|716, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 413
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 414
167,MIN_REDUCTION+210, // $NT
  }
,
{ // state 415
167,MIN_REDUCTION+198, // $NT
  }
,
{ // state 416
98,228, // "r"
105,374, // "i"
  }
,
{ // state 417
2,386, // ws*
5,458, // `boolean
6,569, // `class
7,353, // `extends
8,423, // `void
9,274, // `int
10,295, // `while
11,58, // `if
12,483, // `else
13,71, // `for
14,720, // `break
15,179, // `this
16,296, // `false
17,453, // `true
18,326, // `super
19,388, // `null
20,408, // `return
21,23, // `instanceof
22,462, // `new
23,20, // `abstract
24,29, // `assert
25,28, // `byte
26,635, // `case
27,664, // `catch
28,8, // `char
29,258, // `const
30,551, // `continue
31,570, // `default
32,79, // `do
33,230, // `double
34,724, // `enum
35,366, // `final
36,229, // `finally
37,299, // `float
38,196, // `goto
39,515, // `implements
40,520, // `import
41,61, // `interface
42,277, // `long
43,160, // `native
44,89, // `package
45,139, // `private
46,715, // `protected
47,44, // `public
48,660, // `short
49,464, // `static
50,328, // `strictfp
51,397, // `switch
52,721, // `synchronized
53,732, // `throw
54,473, // `throws
55,83, // `transient
56,699, // `try
57,212, // `volatile
115,283, // "="
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 418
101,122, // "t"
  }
,
{ // state 419
2,240, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 420
0x80000000|633, // match move
0x80000000|17, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 421
2,37, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 422
98,46, // "r"
  }
,
{ // state 423
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 424
167,MIN_REDUCTION+309, // $NT
  }
,
{ // state 425
115,375, // "="
  }
,
{ // state 426
0x80000000|3, // match move
0x80000000|726, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 427
90,13, // "a"
  }
,
{ // state 428
0x80000000|3, // match move
0x80000000|516, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 429
94,490, // "e"
  }
,
{ // state 430
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 431
0x80000000|216, // match move
0x80000000|280, // no-match move
0x80000000|164, // NT-test-match state for letter
  }
,
{ // state 432
-1, // $$start
-1, // start
610, // ws*
-1, // $$0
MIN_REDUCTION+185, // token
458, // `boolean
569, // `class
353, // `extends
423, // `void
274, // `int
295, // `while
58, // `if
483, // `else
71, // `for
720, // `break
179, // `this
296, // `false
453, // `true
326, // `super
388, // `null
408, // `return
23, // `instanceof
462, // `new
20, // `abstract
29, // `assert
28, // `byte
635, // `case
664, // `catch
8, // `char
258, // `const
551, // `continue
570, // `default
79, // `do
230, // `double
724, // `enum
366, // `final
229, // `finally
299, // `float
196, // `goto
515, // `implements
520, // `import
61, // `interface
277, // `long
160, // `native
89, // `package
139, // `private
715, // `protected
44, // `public
660, // `short
464, // `static
328, // `strictfp
397, // `switch
721, // `synchronized
732, // `throw
473, // `throws
83, // `transient
699, // `try
212, // `volatile
729, // `!
124, // `!=
291, // `%
145, // `&&
72, // `*
704, // `(
70, // `)
1, // `{
696, // `}
49, // `-
413, // `+
478, // `=
155, // `==
289, // `[
152, // `]
147, // `||
205, // `<
636, // `<=
620, // `,
384, // `>
681, // `>=
466, // `.
272, // `;
601, // `++
24, // `--
269, // `/
-1, // ID
207, // INTLIT
282, // STRINGLIT
111, // CHARLIT
227, // "c"
144, // "l"
457, // "a"
456, // "s"
-1, // idChar
-1, // reserved
494, // "e"
499, // "b"
MIN_REDUCTION+185, // "o"
354, // "n"
223, // "r"
MIN_REDUCTION+185, // "k"
MIN_REDUCTION+185, // "x"
646, // "t"
322, // "d"
442, // "p"
MIN_REDUCTION+185, // "u"
25, // "i"
372, // "v"
237, // "f"
576, // "w"
MIN_REDUCTION+185, // "h"
MIN_REDUCTION+185, // "y"
MIN_REDUCTION+185, // "m"
545, // "g"
MIN_REDUCTION+185, // "z"
534, // "!"
666, // "="
35, // "*"
548, // "%"
209, // "&"
303, // "("
60, // ")"
587, // "+"
692, // ","
200, // "-"
153, // "."
588, // "/"
577, // ";"
181, // "<"
496, // ">"
270, // "["
573, // "]"
439, // "{"
266, // "}"
18, // "|"
-1, // intLit2
MIN_REDUCTION+185, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
178, // " "
MIN_REDUCTION+185, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+185, // {"A".."Z"}
381, // "'"
MIN_REDUCTION+185, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
339, // '"'
119, // ws
178, // {9}
438, // eol
449, // {10}
597, // {13}
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
{ // state 433
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 434
96,38, // "o"
  }
,
{ // state 435
2,383, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 436
2,693, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 437
167,MIN_REDUCTION+231, // $NT
  }
,
{ // state 438
167,MIN_REDUCTION+316, // $NT
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 439
2,343, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 440
111,109, // "m"
  }
,
{ // state 441
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 442
90,365, // "a"
98,390, // "r"
104,444, // "u"
  }
,
{ // state 443
0x80000000|495, // match move
0x80000000|184, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 444
95,93, // "b"
  }
,
{ // state 445
-1, // $$start
-1, // start
433, // ws*
-1, // $$0
MIN_REDUCTION+233, // token
458, // `boolean
569, // `class
353, // `extends
423, // `void
274, // `int
295, // `while
58, // `if
483, // `else
71, // `for
720, // `break
179, // `this
296, // `false
453, // `true
326, // `super
388, // `null
408, // `return
23, // `instanceof
462, // `new
20, // `abstract
29, // `assert
28, // `byte
635, // `case
664, // `catch
8, // `char
258, // `const
551, // `continue
570, // `default
79, // `do
230, // `double
724, // `enum
366, // `final
229, // `finally
299, // `float
196, // `goto
515, // `implements
520, // `import
61, // `interface
277, // `long
160, // `native
89, // `package
139, // `private
715, // `protected
44, // `public
660, // `short
464, // `static
328, // `strictfp
397, // `switch
721, // `synchronized
732, // `throw
473, // `throws
83, // `transient
699, // `try
212, // `volatile
729, // `!
124, // `!=
291, // `%
145, // `&&
72, // `*
704, // `(
70, // `)
1, // `{
696, // `}
49, // `-
413, // `+
478, // `=
155, // `==
289, // `[
152, // `]
147, // `||
205, // `<
636, // `<=
620, // `,
384, // `>
681, // `>=
466, // `.
272, // `;
601, // `++
24, // `--
269, // `/
-1, // ID
207, // INTLIT
282, // STRINGLIT
111, // CHARLIT
227, // "c"
501, // "l"
457, // "a"
507, // "s"
-1, // idChar
-1, // reserved
494, // "e"
499, // "b"
MIN_REDUCTION+233, // "o"
354, // "n"
223, // "r"
MIN_REDUCTION+233, // "k"
MIN_REDUCTION+233, // "x"
646, // "t"
322, // "d"
442, // "p"
MIN_REDUCTION+233, // "u"
25, // "i"
372, // "v"
237, // "f"
576, // "w"
MIN_REDUCTION+233, // "h"
MIN_REDUCTION+233, // "y"
MIN_REDUCTION+233, // "m"
545, // "g"
MIN_REDUCTION+233, // "z"
534, // "!"
666, // "="
35, // "*"
548, // "%"
209, // "&"
303, // "("
60, // ")"
587, // "+"
692, // ","
200, // "-"
153, // "."
588, // "/"
577, // ";"
181, // "<"
496, // ">"
270, // "["
573, // "]"
439, // "{"
266, // "}"
18, // "|"
-1, // intLit2
MIN_REDUCTION+233, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
178, // " "
MIN_REDUCTION+233, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+233, // {"A".."Z"}
381, // "'"
MIN_REDUCTION+233, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
339, // '"'
119, // ws
178, // {9}
438, // eol
449, // {10}
597, // {13}
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
{ // state 446
2,110, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 447
90,140, // "a"
  }
,
{ // state 448
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 449
167,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 450
-1, // $$start
-1, // start
386, // ws*
-1, // $$0
MIN_REDUCTION+286, // token
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
729, // `!
124, // `!=
291, // `%
145, // `&&
72, // `*
704, // `(
70, // `)
1, // `{
696, // `}
49, // `-
413, // `+
478, // `=
155, // `==
289, // `[
152, // `]
147, // `||
205, // `<
636, // `<=
620, // `,
384, // `>
681, // `>=
466, // `.
272, // `;
601, // `++
24, // `--
269, // `/
42, // ID
207, // INTLIT
282, // STRINGLIT
111, // CHARLIT
557, // "c"
557, // "l"
557, // "a"
557, // "s"
-1, // idChar
-1, // reserved
557, // "e"
557, // "b"
557, // "o"
557, // "n"
557, // "r"
557, // "k"
557, // "x"
557, // "t"
557, // "d"
557, // "p"
557, // "u"
557, // "i"
557, // "v"
557, // "f"
557, // "w"
557, // "h"
557, // "y"
557, // "m"
557, // "g"
557, // "z"
534, // "!"
316, // "="
35, // "*"
548, // "%"
209, // "&"
303, // "("
60, // ")"
587, // "+"
692, // ","
200, // "-"
153, // "."
588, // "/"
577, // ";"
181, // "<"
496, // ">"
270, // "["
573, // "]"
439, // "{"
266, // "}"
18, // "|"
405, // intLit2
62, // "0"
336, // digit++
348, // letter
6, // digit
-1, // "_"
-1, // stringPrintable
178, // " "
62, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
557, // {"A".."Z"}
381, // "'"
557, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
339, // '"'
119, // ws
178, // {9}
438, // eol
449, // {10}
597, // {13}
185, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // token*
474, // digit+
-1, // idChar*
-1, // stringPrintable*
251, // letter+
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 451
0x80000000|3, // match move
0x80000000|378, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 452
94,655, // "e"
  }
,
{ // state 453
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 454
0x80000000|3, // match move
0x80000000|595, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 455
0x80000000|3, // match move
0x80000000|379, // no-match move
// T-test match for "/":
125,
  }
,
{ // state 456
101,118, // "t"
104,80, // "u"
108,642, // "w"
109,434, // "h"
110,410, // "y"
  }
,
{ // state 457
91,647, // "s"
95,66, // "b"
  }
,
{ // state 458
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 459
97,537, // "n"
  }
,
{ // state 460
112,529, // "g"
  }
,
{ // state 461
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 462
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 463
167,MIN_REDUCTION+123, // $NT
  }
,
{ // state 464
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 465
89,318, // "l"
105,11, // "i"
  }
,
{ // state 466
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 467
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 468
0x80000000|290, // match move
0x80000000|102, // no-match move
0x80000000|164, // NT-test-match state for letter
  }
,
{ // state 469
2,75, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 470
2,78, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 471
90,104, // "a"
  }
,
{ // state 472
2,77, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 473
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 474
0x80000000|182, // match move
0x80000000|606, // no-match move
// T-test match for ".":
124,
  }
,
{ // state 475
0x80000000|3, // match move
0x80000000|708, // no-match move
0x80000000|164, // NT-test-match state for letter
  }
,
{ // state 476
89,564, // "l"
  }
,
{ // state 477
0x80000000|100, // match move
0x80000000|553, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 478
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 479
99,500, // "k"
  }
,
{ // state 480
167,MIN_REDUCTION+111, // $NT
  }
,
{ // state 481
0x80000000|560, // match move
0x80000000|445, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 482
2,613, // ws*
5,458, // `boolean
6,569, // `class
7,353, // `extends
8,423, // `void
9,274, // `int
10,295, // `while
11,58, // `if
12,483, // `else
13,71, // `for
14,720, // `break
15,179, // `this
16,296, // `false
17,453, // `true
18,326, // `super
19,388, // `null
20,408, // `return
21,23, // `instanceof
22,462, // `new
23,20, // `abstract
24,29, // `assert
25,28, // `byte
26,635, // `case
27,664, // `catch
28,8, // `char
29,258, // `const
30,551, // `continue
31,570, // `default
32,79, // `do
33,230, // `double
34,724, // `enum
35,366, // `final
36,229, // `finally
37,299, // `float
38,196, // `goto
39,515, // `implements
40,520, // `import
41,61, // `interface
42,277, // `long
43,160, // `native
44,89, // `package
45,139, // `private
46,715, // `protected
47,44, // `public
48,660, // `short
49,464, // `static
50,328, // `strictfp
51,397, // `switch
52,721, // `synchronized
53,732, // `throw
54,473, // `throws
55,83, // `transient
56,699, // `try
57,212, // `volatile
115,197, // "="
MIN_REDUCTION+254, // (default reduction)
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
{ // state 483
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 484
167,MIN_REDUCTION+307, // $NT
  }
,
{ // state 485
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 486
105,138, // "i"
  }
,
{ // state 487
2,309, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 488
2,714, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 489
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 490
0x80000000|3, // match move
0x80000000|202, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 491
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 492
97,190, // "n"
  }
,
{ // state 493
90,281, // "a"
104,623, // "u"
110,103, // "y"
  }
,
{ // state 494
89,373, // "l"
97,114, // "n"
100,418, // "x"
  }
,
{ // state 495
0x80000000|208, // match move
0x80000000|398, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 496
0x80000000|425, // match move
0x80000000|2, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 497
2,448, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 498
167,MIN_REDUCTION+147, // $NT
  }
,
{ // state 499
96,546, // "o"
98,173, // "r"
110,243, // "y"
  }
,
{ // state 500
0x80000000|3, // match move
0x80000000|446, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 501
96,121, // "o"
  }
,
{ // state 502
101,611, // "t"
  }
,
{ // state 503
0x80000000|276, // match move
0x80000000|395, // no-match move
0x80000000|43, // NT-test-match state for digit
  }
,
{ // state 504
97,369, // "n"
  }
,
{ // state 505
-1, // $$start
-1, // start
574, // ws*
-1, // $$0
MIN_REDUCTION+250, // token
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
729, // `!
124, // `!=
291, // `%
145, // `&&
72, // `*
704, // `(
70, // `)
1, // `{
696, // `}
49, // `-
413, // `+
478, // `=
155, // `==
289, // `[
152, // `]
147, // `||
205, // `<
636, // `<=
620, // `,
384, // `>
681, // `>=
466, // `.
272, // `;
601, // `++
24, // `--
269, // `/
42, // ID
207, // INTLIT
282, // STRINGLIT
111, // CHARLIT
557, // "c"
557, // "l"
557, // "a"
557, // "s"
-1, // idChar
-1, // reserved
557, // "e"
557, // "b"
557, // "o"
557, // "n"
557, // "r"
557, // "k"
557, // "x"
557, // "t"
557, // "d"
557, // "p"
557, // "u"
557, // "i"
557, // "v"
557, // "f"
557, // "w"
557, // "h"
557, // "y"
557, // "m"
557, // "g"
557, // "z"
534, // "!"
316, // "="
35, // "*"
548, // "%"
209, // "&"
303, // "("
60, // ")"
587, // "+"
692, // ","
200, // "-"
153, // "."
588, // "/"
577, // ";"
181, // "<"
496, // ">"
270, // "["
573, // "]"
439, // "{"
266, // "}"
18, // "|"
405, // intLit2
62, // "0"
336, // digit++
348, // letter
6, // digit
-1, // "_"
-1, // stringPrintable
178, // " "
62, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
557, // {"A".."Z"}
381, // "'"
557, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
339, // '"'
119, // ws
178, // {9}
438, // eol
449, // {10}
597, // {13}
185, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // token*
474, // digit+
-1, // idChar*
-1, // stringPrintable*
251, // letter+
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 506
101,183, // "t"
  }
,
{ // state 507
0x80000000|115, // match move
0x80000000|698, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 508
2,386, // ws*
5,458, // `boolean
6,569, // `class
7,353, // `extends
8,423, // `void
9,274, // `int
10,295, // `while
11,58, // `if
12,483, // `else
13,71, // `for
14,720, // `break
15,179, // `this
16,296, // `false
17,453, // `true
18,326, // `super
19,388, // `null
20,408, // `return
21,23, // `instanceof
22,462, // `new
23,20, // `abstract
24,29, // `assert
25,28, // `byte
26,635, // `case
27,664, // `catch
28,8, // `char
29,258, // `const
30,551, // `continue
31,570, // `default
32,79, // `do
33,230, // `double
34,724, // `enum
35,366, // `final
36,229, // `finally
37,299, // `float
38,196, // `goto
39,515, // `implements
40,520, // `import
41,61, // `interface
42,277, // `long
43,160, // `native
44,89, // `package
45,139, // `private
46,715, // `protected
47,44, // `public
48,660, // `short
49,464, // `static
50,328, // `strictfp
51,397, // `switch
52,721, // `synchronized
53,732, // `throw
54,473, // `throws
55,83, // `transient
56,699, // `try
57,212, // `volatile
88,227, // "c"
89,501, // "l"
90,457, // "a"
91,456, // "s"
94,494, // "e"
95,499, // "b"
97,354, // "n"
98,223, // "r"
101,646, // "t"
102,322, // "d"
103,442, // "p"
105,25, // "i"
106,372, // "v"
107,237, // "f"
108,576, // "w"
112,545, // "g"
115,283, // "="
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 509
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 510
90,129, // "a"
  }
,
{ // state 511
0x80000000|652, // match move
0x80000000|489, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 512
0x80000000|3, // match move
0x80000000|394, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 513
167,MIN_REDUCTION+132, // $NT
  }
,
{ // state 514
167,MIN_REDUCTION+313, // $NT
  }
,
{ // state 515
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 516
2,217, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 517
94,14, // "e"
  }
,
{ // state 518
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 519
2,396, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
166,MIN_REDUCTION+254, // $
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 520
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 521
167,MIN_REDUCTION+156, // $NT
  }
,
{ // state 522
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 523
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 524
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
345, // token
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
729, // `!
124, // `!=
291, // `%
145, // `&&
72, // `*
704, // `(
70, // `)
1, // `{
696, // `}
49, // `-
413, // `+
478, // `=
155, // `==
289, // `[
152, // `]
147, // `||
205, // `<
636, // `<=
620, // `,
384, // `>
681, // `>=
466, // `.
272, // `;
601, // `++
24, // `--
269, // `/
42, // ID
207, // INTLIT
282, // STRINGLIT
111, // CHARLIT
557, // "c"
557, // "l"
557, // "a"
557, // "s"
-1, // idChar
-1, // reserved
557, // "e"
557, // "b"
557, // "o"
557, // "n"
557, // "r"
557, // "k"
557, // "x"
557, // "t"
557, // "d"
557, // "p"
557, // "u"
557, // "i"
557, // "v"
557, // "f"
557, // "w"
557, // "h"
557, // "y"
557, // "m"
557, // "g"
557, // "z"
534, // "!"
666, // "="
35, // "*"
548, // "%"
209, // "&"
303, // "("
60, // ")"
587, // "+"
692, // ","
200, // "-"
153, // "."
588, // "/"
577, // ";"
181, // "<"
496, // ">"
270, // "["
573, // "]"
439, // "{"
266, // "}"
18, // "|"
405, // intLit2
62, // "0"
336, // digit++
348, // letter
6, // digit
-1, // "_"
-1, // stringPrintable
-1, // " "
62, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
557, // {"A".."Z"}
381, // "'"
557, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
339, // '"'
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
185, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // token*
474, // digit+
-1, // idChar*
-1, // stringPrintable*
251, // letter+
MIN_REDUCTION+344, // $
-1, // $NT
  }
,
{ // state 525
90,137, // "a"
  }
,
{ // state 526
97,135, // "n"
  }
,
{ // state 527
1,98, // start
2,92, // ws*
3,224, // $$0
4,57, // token
5,458, // `boolean
6,569, // `class
7,353, // `extends
8,423, // `void
9,274, // `int
10,295, // `while
11,58, // `if
12,483, // `else
13,71, // `for
14,720, // `break
15,179, // `this
16,296, // `false
17,453, // `true
18,326, // `super
19,388, // `null
20,408, // `return
21,23, // `instanceof
22,462, // `new
23,20, // `abstract
24,29, // `assert
25,28, // `byte
26,635, // `case
27,664, // `catch
28,8, // `char
29,258, // `const
30,551, // `continue
31,570, // `default
32,79, // `do
33,230, // `double
34,724, // `enum
35,366, // `final
36,229, // `finally
37,299, // `float
38,196, // `goto
39,515, // `implements
40,520, // `import
41,61, // `interface
42,277, // `long
43,160, // `native
44,89, // `package
45,139, // `private
46,715, // `protected
47,44, // `public
48,660, // `short
49,464, // `static
50,328, // `strictfp
51,397, // `switch
52,721, // `synchronized
53,732, // `throw
54,473, // `throws
55,83, // `transient
56,699, // `try
57,212, // `volatile
161,443, // token*
  }
,
{ // state 528
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 529
0x80000000|3, // match move
0x80000000|421, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 530
167,MIN_REDUCTION+195, // $NT
  }
,
{ // state 531
0x80000000|3, // match move
0x80000000|419, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 532
167,MIN_REDUCTION+177, // $NT
  }
,
{ // state 533
90,685, // "a"
98,148, // "r"
109,416, // "h"
  }
,
{ // state 534
0x80000000|454, // match move
0x80000000|519, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 535
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 536
109,607, // "h"
  }
,
{ // state 537
0x80000000|3, // match move
0x80000000|649, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 538
107,525, // "f"
  }
,
{ // state 539
94,65, // "e"
  }
,
{ // state 540
167,MIN_REDUCTION+141, // $NT
  }
,
{ // state 541
98,667, // "r"
  }
,
{ // state 542
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 543
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 544
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 545
96,213, // "o"
  }
,
{ // state 546
96,231, // "o"
  }
,
{ // state 547
90,254, // "a"
  }
,
{ // state 548
2,253, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 549
94,199, // "e"
  }
,
{ // state 550
101,210, // "t"
  }
,
{ // state 551
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 552
0x80000000|3, // match move
0x80000000|679, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 553
3,592, // $$0
4,57, // token
58,729, // `!
59,124, // `!=
60,291, // `%
61,145, // `&&
62,72, // `*
63,704, // `(
64,70, // `)
65,1, // `{
66,696, // `}
67,49, // `-
68,413, // `+
69,478, // `=
70,155, // `==
71,289, // `[
72,152, // `]
73,147, // `||
74,205, // `<
75,636, // `<=
76,620, // `,
77,384, // `>
78,681, // `>=
79,466, // `.
80,272, // `;
81,601, // `++
82,24, // `--
83,269, // `/
84,42, // ID
85,207, // INTLIT
86,282, // STRINGLIT
87,111, // CHARLIT
137,348, // letter
151,47, // ws
153,438, // eol
156,185, // letter++
161,443, // token*
165,251, // letter+
  }
,
{ // state 554
167,MIN_REDUCTION+213, // $NT
  }
,
{ // state 555
0x80000000|191, // match move
0x80000000|485, // no-match move
0x80000000|265, // NT-test-match state for stringPrintable
  }
,
{ // state 556
0x80000000|3, // match move
0x80000000|95, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 557
0x80000000|376, // match move
0x80000000|313, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 558
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 559
89,373, // "l"
97,114, // "n"
98,538, // "r"
100,418, // "x"
  }
,
{ // state 560
91,59, // "s"
  }
,
{ // state 561
0x80000000|3, // match move
0x80000000|158, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 562
2,730, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 563
2,48, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 564
0x80000000|627, // match move
0x80000000|432, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 565
101,90, // "t"
  }
,
{ // state 566
0x80000000|3, // match move
0x80000000|671, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 567
88,514, // "c"
89,514, // "l"
90,514, // "a"
91,514, // "s"
94,514, // "e"
95,514, // "b"
96,514, // "o"
97,514, // "n"
98,514, // "r"
99,514, // "k"
100,514, // "x"
101,514, // "t"
102,514, // "d"
103,514, // "p"
104,514, // "u"
105,514, // "i"
106,514, // "v"
107,514, // "f"
108,514, // "w"
109,514, // "h"
110,514, // "y"
111,514, // "m"
112,514, // "g"
113,514, // "z"
135,340, // "0"
137,233, // letter
138,668, // digit
139,12, // "_"
142,340, // {"1".."9"}
145,514, // {"A".."Z"}
147,514, // {"j" "q"}
  }
,
{ // state 568
2,170, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 569
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 570
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 571
101,187, // "t"
  }
,
{ // state 572
102,581, // "d"
  }
,
{ // state 573
2,4, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 574
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 575
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 576
109,232, // "h"
  }
,
{ // state 577
2,174, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 578
2,300, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 579
108,718, // "w"
  }
,
{ // state 580
90,171, // "a"
  }
,
{ // state 581
0x80000000|3, // match move
0x80000000|678, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 582
167,MIN_REDUCTION+240, // $NT
  }
,
{ // state 583
90,188, // "a"
  }
,
{ // state 584
88,192, // "c"
  }
,
{ // state 585
90,172, // "a"
  }
,
{ // state 586
0x80000000|3, // match move
0x80000000|497, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 587
0x80000000|409, // match move
0x80000000|435, // no-match move
// T-test match for "+":
121,
  }
,
{ // state 588
0x80000000|3, // match move
0x80000000|455, // no-match move
// T-test match for "*":
116,
  }
,
{ // state 589
2,574, // ws*
151,119, // ws
153,438, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 590
0x80000000|312, // match move
0x80000000|503, // no-match move
// T-test match for ".":
124,
  }
,
{ // state 591
0x80000000|3, // match move
0x80000000|662, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 592
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 593
2,386, // ws*
151,119, // ws
153,438, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 594
94,271, // "e"
  }
,
{ // state 595
0x80000000|482, // match move
0x80000000|247, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 596
167,MIN_REDUCTION+99, // $NT
  }
,
{ // state 597
0x80000000|630, // match move
0x80000000|317, // no-match move
// T-test match for 10:
154,
  }
,
{ // state 598
167,MIN_REDUCTION+243, // $NT
  }
,
{ // state 599
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 600
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 601
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 602
96,717, // "o"
  }
,
{ // state 603
167,MIN_REDUCTION+246, // $NT
  }
,
{ // state 604
167,MIN_REDUCTION+216, // $NT
  }
,
{ // state 605
94,324, // "e"
  }
,
{ // state 606
0x80000000|677, // match move
0x80000000|690, // no-match move
0x80000000|43, // NT-test-match state for digit
  }
,
{ // state 607
0x80000000|3, // match move
0x80000000|710, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 608
167,MIN_REDUCTION+120, // $NT
  }
,
{ // state 609
101,26, // "t"
  }
,
{ // state 610
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 611
0x80000000|3, // match move
0x80000000|469, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 612
0x80000000|689, // match move
0x80000000|53, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 613
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 614
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 615
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 616
167,MIN_REDUCTION+219, // $NT
  }
,
{ // state 617
167,MIN_REDUCTION+135, // $NT
  }
,
{ // state 618
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 619
2,352, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 620
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 621
167,MIN_REDUCTION+237, // $NT
  }
,
{ // state 622
97,236, // "n"
  }
,
{ // state 623
94,665, // "e"
  }
,
{ // state 624
0x80000000|141, // match move
0x80000000|273, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 625
2,722, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 626
90,479, // "a"
  }
,
{ // state 627
89,399, // "l"
  }
,
{ // state 628
167,MIN_REDUCTION+153, // $NT
  }
,
{ // state 629
150,697, // '"'
159,364, // stringPrintable**
160,430, // $$2
164,555, // stringPrintable*
  }
,
{ // state 630
154,632, // {10}
  }
,
{ // state 631
0x80000000|248, // match move
0x80000000|505, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 632
167,MIN_REDUCTION+318, // $NT
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 633
94,235, // "e"
  }
,
{ // state 634
1,98, // start
2,92, // ws*
3,224, // $$0
4,57, // token
5,458, // `boolean
6,569, // `class
7,353, // `extends
8,423, // `void
9,274, // `int
10,295, // `while
11,58, // `if
12,483, // `else
13,71, // `for
14,720, // `break
15,179, // `this
16,296, // `false
17,453, // `true
18,326, // `super
19,388, // `null
20,408, // `return
21,23, // `instanceof
22,462, // `new
23,20, // `abstract
24,29, // `assert
25,28, // `byte
26,635, // `case
27,664, // `catch
28,8, // `char
29,258, // `const
30,551, // `continue
31,570, // `default
32,79, // `do
33,230, // `double
34,724, // `enum
35,366, // `final
36,229, // `finally
37,299, // `float
38,196, // `goto
39,515, // `implements
40,520, // `import
41,61, // `interface
42,277, // `long
43,160, // `native
44,89, // `package
45,139, // `private
46,715, // `protected
47,44, // `public
48,660, // `short
49,464, // `static
50,328, // `strictfp
51,397, // `switch
52,721, // `synchronized
53,732, // `throw
54,473, // `throws
55,83, // `transient
56,699, // `try
57,212, // `volatile
88,227, // "c"
89,501, // "l"
90,457, // "a"
91,456, // "s"
94,494, // "e"
95,499, // "b"
97,354, // "n"
98,223, // "r"
101,646, // "t"
102,322, // "d"
103,442, // "p"
105,25, // "i"
106,372, // "v"
107,237, // "f"
108,576, // "w"
112,545, // "g"
161,443, // token*
166,MIN_REDUCTION+1, // $
  }
,
{ // state 635
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 636
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 637
105,206, // "i"
  }
,
{ // state 638
89,246, // "l"
  }
,
{ // state 639
101,239, // "t"
  }
,
{ // state 640
113,177, // "z"
  }
,
{ // state 641
94,41, // "e"
  }
,
{ // state 642
105,252, // "i"
  }
,
{ // state 643
89,428, // "l"
  }
,
{ // state 644
97,244, // "n"
  }
,
{ // state 645
0x80000000|3, // match move
0x80000000|9, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 646
98,493, // "r"
109,416, // "h"
  }
,
{ // state 647
91,85, // "s"
  }
,
{ // state 648
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 649
2,268, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 650
2,386, // ws*
58,729, // `!
59,124, // `!=
60,291, // `%
61,145, // `&&
62,72, // `*
63,704, // `(
64,70, // `)
65,1, // `{
66,696, // `}
67,49, // `-
68,413, // `+
70,155, // `==
71,289, // `[
72,152, // `]
73,147, // `||
75,636, // `<=
76,620, // `,
78,681, // `>=
79,466, // `.
80,272, // `;
81,601, // `++
82,24, // `--
83,269, // `/
84,42, // ID
85,207, // INTLIT
86,282, // STRINGLIT
87,111, // CHARLIT
115,149, // "="
134,405, // intLit2
136,336, // digit++
137,348, // letter
138,6, // digit
151,119, // ws
153,438, // eol
156,185, // letter++
162,474, // digit+
165,251, // letter+
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 651
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 652
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 653
91,506, // "s"
101,420, // "t"
  }
,
{ // state 654
0x80000000|738, // match move
0x80000000|298, // no-match move
0x80000000|265, // NT-test-match state for stringPrintable
  }
,
{ // state 655
0x80000000|3, // match move
0x80000000|10, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 656
95,350, // "b"
  }
,
{ // state 657
167,MIN_REDUCTION+150, // $NT
  }
,
{ // state 658
3,592, // $$0
4,57, // token
5,458, // `boolean
6,569, // `class
7,353, // `extends
8,423, // `void
9,274, // `int
10,295, // `while
11,58, // `if
12,483, // `else
13,71, // `for
14,720, // `break
15,179, // `this
16,296, // `false
17,453, // `true
18,326, // `super
19,388, // `null
20,408, // `return
21,23, // `instanceof
22,462, // `new
23,20, // `abstract
24,29, // `assert
25,28, // `byte
26,635, // `case
27,664, // `catch
28,8, // `char
29,258, // `const
30,551, // `continue
31,570, // `default
32,79, // `do
33,230, // `double
34,724, // `enum
35,366, // `final
36,229, // `finally
37,299, // `float
38,196, // `goto
39,515, // `implements
40,520, // `import
41,61, // `interface
42,277, // `long
43,160, // `native
44,89, // `package
45,139, // `private
46,715, // `protected
47,44, // `public
48,660, // `short
49,464, // `static
50,328, // `strictfp
51,397, // `switch
52,721, // `synchronized
53,732, // `throw
54,473, // `throws
55,83, // `transient
56,699, // `try
57,212, // `volatile
88,227, // "c"
89,501, // "l"
90,457, // "a"
91,456, // "s"
94,494, // "e"
95,499, // "b"
97,354, // "n"
98,223, // "r"
101,646, // "t"
102,322, // "d"
103,442, // "p"
105,25, // "i"
106,372, // "v"
107,237, // "f"
108,576, // "w"
112,545, // "g"
161,443, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 659
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 660
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 661
0x80000000|3, // match move
0x80000000|21, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 662
2,249, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 663
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 664
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 665
0x80000000|3, // match move
0x80000000|389, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 666
0x80000000|211, // match move
0x80000000|74, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 667
0x80000000|3, // match move
0x80000000|562, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 668
167,MIN_REDUCTION+305, // $NT
  }
,
{ // state 669
0x80000000|3, // match move
0x80000000|563, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 670
98,287, // "r"
  }
,
{ // state 671
2,294, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 672
88,371, // "c"
89,371, // "l"
90,371, // "a"
91,371, // "s"
94,371, // "e"
95,371, // "b"
96,371, // "o"
97,371, // "n"
98,371, // "r"
99,371, // "k"
100,371, // "x"
101,371, // "t"
102,371, // "d"
103,371, // "p"
104,371, // "u"
105,371, // "i"
106,371, // "v"
107,371, // "f"
108,371, // "w"
109,371, // "h"
110,371, // "y"
111,371, // "m"
112,371, // "g"
113,371, // "z"
114,367, // "!"
115,161, // "="
116,161, // "*"
117,161, // "%"
118,161, // "&"
119,161, // "("
120,161, // ")"
121,161, // "+"
122,161, // ","
123,161, // "-"
124,161, // "."
125,161, // "/"
126,161, // ";"
127,161, // "<"
128,161, // ">"
129,161, // "["
130,371, // "]"
131,371, // "{"
132,371, // "}"
133,371, // "|"
135,161, // "0"
139,371, // "_"
140,175, // stringPrintable
141,367, // " "
142,161, // {"1".."9"}
143,161, // {":" "?".."@"}
144,161, // {"#".."$"}
145,161, // {"A".."Z"}
146,161, // "'"
147,371, // {"j" "q"}
148,371, // {"^" "`" "~"}
159,364, // stringPrintable**
164,555, // stringPrintable*
  }
,
{ // state 673
101,412, // "t"
  }
,
{ // state 674
89,234, // "l"
  }
,
{ // state 675
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 676
167,MIN_REDUCTION+165, // $NT
  }
,
{ // state 677
135,62, // "0"
138,590, // digit
142,62, // {"1".."9"}
  }
,
{ // state 678
2,618, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 679
2,528, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 680
94,286, // "e"
  }
,
{ // state 681
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 682
0x80000000|377, // match move
0x80000000|542, // no-match move
0x80000000|43, // NT-test-match state for digit
  }
,
{ // state 683
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 684
4,345, // token
5,458, // `boolean
6,569, // `class
7,353, // `extends
8,423, // `void
9,274, // `int
10,295, // `while
11,58, // `if
12,483, // `else
13,71, // `for
14,720, // `break
15,179, // `this
16,296, // `false
17,453, // `true
18,326, // `super
19,388, // `null
20,408, // `return
21,23, // `instanceof
22,462, // `new
23,20, // `abstract
24,29, // `assert
25,28, // `byte
26,635, // `case
27,664, // `catch
28,8, // `char
29,258, // `const
30,551, // `continue
31,570, // `default
32,79, // `do
33,230, // `double
34,724, // `enum
35,366, // `final
36,229, // `finally
37,299, // `float
38,196, // `goto
39,515, // `implements
40,520, // `import
41,61, // `interface
42,277, // `long
43,160, // `native
44,89, // `package
45,139, // `private
46,715, // `protected
47,44, // `public
48,660, // `short
49,464, // `static
50,328, // `strictfp
51,397, // `switch
52,721, // `synchronized
53,732, // `throw
54,473, // `throws
55,83, // `transient
56,699, // `try
57,212, // `volatile
88,227, // "c"
89,501, // "l"
90,457, // "a"
91,456, // "s"
94,494, // "e"
95,499, // "b"
97,354, // "n"
98,223, // "r"
101,646, // "t"
102,322, // "d"
103,442, // "p"
105,25, // "i"
106,372, // "v"
107,237, // "f"
108,576, // "w"
112,545, // "g"
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 685
101,334, // "t"
  }
,
{ // state 686
107,218, // "f"
  }
,
{ // state 687
91,193, // "s"
  }
,
{ // state 688
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 689
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 690
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 691
98,661, // "r"
  }
,
{ // state 692
2,125, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 693
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 694
88,150, // "c"
89,150, // "l"
90,150, // "a"
91,150, // "s"
92,624, // idChar
94,150, // "e"
95,150, // "b"
96,150, // "o"
97,150, // "n"
98,150, // "r"
99,150, // "k"
100,150, // "x"
101,150, // "t"
102,150, // "d"
103,150, // "p"
104,150, // "u"
105,150, // "i"
106,150, // "v"
107,150, // "f"
108,150, // "w"
109,150, // "h"
110,150, // "y"
111,150, // "m"
112,150, // "g"
113,150, // "z"
135,612, // "0"
137,511, // letter
138,341, // digit
139,7, // "_"
142,612, // {"1".."9"}
145,150, // {"A".."Z"}
147,150, // {"j" "q"}
157,305, // idChar**
163,107, // idChar*
  }
,
{ // state 695
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 696
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 697
2,101, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 698
-1, // $$start
-1, // start
740, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
458, // `boolean
569, // `class
353, // `extends
423, // `void
274, // `int
295, // `while
58, // `if
483, // `else
71, // `for
720, // `break
179, // `this
296, // `false
453, // `true
326, // `super
388, // `null
408, // `return
23, // `instanceof
462, // `new
20, // `abstract
29, // `assert
28, // `byte
635, // `case
664, // `catch
8, // `char
258, // `const
551, // `continue
570, // `default
79, // `do
230, // `double
724, // `enum
366, // `final
229, // `finally
299, // `float
196, // `goto
515, // `implements
520, // `import
61, // `interface
277, // `long
160, // `native
89, // `package
139, // `private
715, // `protected
44, // `public
660, // `short
464, // `static
328, // `strictfp
397, // `switch
721, // `synchronized
732, // `throw
473, // `throws
83, // `transient
699, // `try
212, // `volatile
729, // `!
124, // `!=
291, // `%
145, // `&&
72, // `*
704, // `(
70, // `)
1, // `{
696, // `}
49, // `-
413, // `+
478, // `=
155, // `==
289, // `[
152, // `]
147, // `||
205, // `<
636, // `<=
620, // `,
384, // `>
681, // `>=
466, // `.
272, // `;
601, // `++
24, // `--
269, // `/
-1, // ID
207, // INTLIT
282, // STRINGLIT
111, // CHARLIT
227, // "c"
501, // "l"
457, // "a"
456, // "s"
-1, // idChar
-1, // reserved
494, // "e"
499, // "b"
MIN_REDUCTION+236, // "o"
354, // "n"
223, // "r"
MIN_REDUCTION+236, // "k"
MIN_REDUCTION+236, // "x"
533, // "t"
322, // "d"
442, // "p"
80, // "u"
25, // "i"
372, // "v"
237, // "f"
67, // "w"
434, // "h"
410, // "y"
MIN_REDUCTION+236, // "m"
545, // "g"
MIN_REDUCTION+236, // "z"
534, // "!"
666, // "="
35, // "*"
548, // "%"
209, // "&"
303, // "("
60, // ")"
587, // "+"
692, // ","
200, // "-"
153, // "."
588, // "/"
577, // ";"
181, // "<"
496, // ">"
270, // "["
573, // "]"
439, // "{"
266, // "}"
18, // "|"
-1, // intLit2
MIN_REDUCTION+236, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
178, // " "
MIN_REDUCTION+236, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+236, // {"A".."Z"}
381, // "'"
MIN_REDUCTION+236, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
339, // '"'
119, // ws
178, // {9}
438, // eol
449, // {10}
597, // {13}
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
{ // state 699
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 700
4,MIN_REDUCTION+338, // token
114,MIN_REDUCTION+338, // "!"
115,MIN_REDUCTION+338, // "="
116,MIN_REDUCTION+338, // "*"
117,MIN_REDUCTION+338, // "%"
118,MIN_REDUCTION+338, // "&"
119,MIN_REDUCTION+338, // "("
120,MIN_REDUCTION+338, // ")"
121,MIN_REDUCTION+338, // "+"
122,MIN_REDUCTION+338, // ","
123,MIN_REDUCTION+338, // "-"
124,MIN_REDUCTION+338, // "."
125,MIN_REDUCTION+338, // "/"
126,MIN_REDUCTION+338, // ";"
127,MIN_REDUCTION+338, // "<"
128,MIN_REDUCTION+338, // ">"
129,MIN_REDUCTION+338, // "["
130,MIN_REDUCTION+338, // "]"
131,MIN_REDUCTION+338, // "{"
132,MIN_REDUCTION+338, // "}"
133,MIN_REDUCTION+338, // "|"
141,MIN_REDUCTION+338, // " "
146,MIN_REDUCTION+338, // "'"
150,MIN_REDUCTION+338, // '"'
152,MIN_REDUCTION+338, // {9}
154,MIN_REDUCTION+338, // {10}
155,MIN_REDUCTION+338, // {13}
158,MIN_REDUCTION+338, // $$1
166,MIN_REDUCTION+338, // $
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 701
2,311, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 702
167,MIN_REDUCTION+159, // $NT
  }
,
{ // state 703
94,451, // "e"
  }
,
{ // state 704
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 705
2,683, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 706
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 707
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 708
139,MIN_REDUCTION+339, // "_"
157,MIN_REDUCTION+339, // idChar**
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 709
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 710
2,711, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 711
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 712
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 713
0x80000000|431, // match move
0x80000000|475, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 714
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 715
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 716
2,659, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 717
0x80000000|3, // match move
0x80000000|578, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 718
0x80000000|3, // match move
0x80000000|436, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 719
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 720
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 721
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 722
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 723
167,MIN_REDUCTION+102, // $NT
  }
,
{ // state 724
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 725
91,728, // "s"
  }
,
{ // state 726
2,575, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 727
0x80000000|417, // match move
0x80000000|650, // no-match move
0x80000000|143, // NT-test-match state for reserved
  }
,
{ // state 728
0x80000000|3, // match move
0x80000000|625, // no-match move
0x80000000|567, // NT-test-match state for idChar
  }
,
{ // state 729
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 730
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 731
101,203, // "t"
  }
,
{ // state 732
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 733
97,346, // "n"
  }
,
{ // state 734
167,MIN_REDUCTION+126, // $NT
  }
,
{ // state 735
98,344, // "r"
  }
,
{ // state 736
4,MIN_REDUCTION+333, // token
114,MIN_REDUCTION+333, // "!"
115,MIN_REDUCTION+333, // "="
116,MIN_REDUCTION+333, // "*"
117,MIN_REDUCTION+333, // "%"
118,MIN_REDUCTION+333, // "&"
119,MIN_REDUCTION+333, // "("
120,MIN_REDUCTION+333, // ")"
121,MIN_REDUCTION+333, // "+"
122,MIN_REDUCTION+333, // ","
123,MIN_REDUCTION+333, // "-"
124,MIN_REDUCTION+333, // "."
125,MIN_REDUCTION+333, // "/"
126,MIN_REDUCTION+333, // ";"
127,MIN_REDUCTION+333, // "<"
128,MIN_REDUCTION+333, // ">"
129,MIN_REDUCTION+333, // "["
130,MIN_REDUCTION+333, // "]"
131,MIN_REDUCTION+333, // "{"
132,MIN_REDUCTION+333, // "}"
133,MIN_REDUCTION+333, // "|"
141,MIN_REDUCTION+333, // " "
146,MIN_REDUCTION+333, // "'"
150,MIN_REDUCTION+333, // '"'
152,MIN_REDUCTION+333, // {9}
154,MIN_REDUCTION+333, // {10}
155,MIN_REDUCTION+333, // {13}
158,MIN_REDUCTION+333, // $$1
166,MIN_REDUCTION+333, // $
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 737
167,MIN_REDUCTION+93, // $NT
  }
,
{ // state 738
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 739
94,330, // "e"
  }
,
{ // state 740
141,178, // " "
151,47, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+235, // $NT
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 741
107,204, // "f"
  }
,
{ // state 742
88,279, // "c"
  }
,
{ // state 743
88,561, // "c"
  }
,
{ // state 744
2,740, // ws*
141,178, // " "
151,119, // ws
152,178, // {9}
153,438, // eol
154,449, // {10}
155,597, // {13}
167,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[745][];
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
// `! ::= "!" !"=" ws*
(58<<16)+2,
// `! ::= "!" !"="
(58<<16)+1,
// `!= ::= "!" "=" ws*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `* ::= "*" ws*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// `! ::= "!" ws*
(58<<16)+2,
// `! ::= "!"
(58<<16)+1,
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
// `++ ::= "+" ws*
(81<<16)+2,
// `++ ::= "+"
(81<<16)+1,
// `+ ::= "+" !"+" ws*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
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
// `/ ::= "/" !"*" !"/" ws*
(83<<16)+2,
// `/ ::= "/" !"*" !"/"
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
// intLit2 ::= !"0" digit++ !"."
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
"`! ::= \"!\" !\"=\" ws*", // 247
"`! ::= \"!\" !\"=\" ws*", // 248
"`!= ::= \"!\" \"=\" ws*", // 249
"`!= ::= \"!\" \"=\" ws*", // 250
"`* ::= \"*\" ws*", // 251
"`* ::= \"*\" ws*", // 252
"`! ::= \"!\" ws*", // 253
"`! ::= \"!\" ws*", // 254
"`% ::= \"%\" ws*", // 255
"`% ::= \"%\" ws*", // 256
"`&& ::= \"&\" \"&\" ws*", // 257
"`&& ::= \"&\" \"&\" ws*", // 258
"`( ::= \"(\" ws*", // 259
"`( ::= \"(\" ws*", // 260
"`) ::= \")\" ws*", // 261
"`) ::= \")\" ws*", // 262
"`++ ::= \"+\" ws*", // 263
"`++ ::= \"+\" ws*", // 264
"`+ ::= \"+\" !\"+\" ws*", // 265
"`+ ::= \"+\" !\"+\" ws*", // 266
"`, ::= \",\" ws*", // 267
"`, ::= \",\" ws*", // 268
"`- ::= \"-\" !\"-\" ws*", // 269
"`- ::= \"-\" !\"-\" ws*", // 270
"`-- ::= \"-\" \"-\" ws*", // 271
"`-- ::= \"-\" \"-\" ws*", // 272
"`. ::= \".\" ws*", // 273
"`. ::= \".\" ws*", // 274
"`/ ::= \"/\" !\"*\" !\"/\" ws*", // 275
"`/ ::= \"/\" !\"*\" !\"/\" ws*", // 276
"`; ::= \";\" ws*", // 277
"`; ::= \";\" ws*", // 278
"`< ::= \"<\" !\"=\" ws*", // 279
"`< ::= \"<\" !\"=\" ws*", // 280
"`<= ::= \"<\" \"=\" ws*", // 281
"`<= ::= \"<\" \"=\" ws*", // 282
"`= ::= \"=\" !\"=\" ws*", // 283
"`= ::= \"=\" !\"=\" ws*", // 284
"`== ::= \"=\" \"=\" ws*", // 285
"`== ::= \"=\" \"=\" ws*", // 286
"`> ::= \">\" !\"=\" ws*", // 287
"`> ::= \">\" !\"=\" ws*", // 288
"`>= ::= \">\" \"=\" ws*", // 289
"`>= ::= \">\" \"=\" ws*", // 290
"`[ ::= \"[\" ws*", // 291
"`[ ::= \"[\" ws*", // 292
"`] ::= \"]\" ws*", // 293
"`] ::= \"]\" ws*", // 294
"`{ ::= \"{\" ws*", // 295
"`{ ::= \"{\" ws*", // 296
"`} ::= \"}\" ws*", // 297
"`} ::= \"}\" ws*", // 298
"`|| ::= \"|\" \"|\" ws*", // 299
"`|| ::= \"|\" \"|\" ws*", // 300
"INTLIT ::= # intLit2 ws*", // 301
"INTLIT ::= # intLit2 ws*", // 302
"intLit2 ::= !\"0\" digit++ !\".\"", // 303
"idChar ::= letter", // 304
"idChar ::= digit", // 305
"idChar ::= \"_\"", // 306
"stringPrintable ::= {\" \"..\"!\"}", // 307
"stringPrintable ::= {\"#\"..\"[\"}", // 308
"stringPrintable ::= {\"]\"..\"~\"}", // 309
"charPrintable ::= {\" \"..\"&\"}", // 310
"charPrintable ::= {\"(\"..\"[\"}", // 311
"charPrintable ::= {\"]\"..\"~\"}", // 312
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 313
"digit ::= {\"0\"..\"9\"}", // 314
"ws ::= {9 \" \"}", // 315
"ws ::= eol", // 316
"eol ::= {10} registerNewline", // 317
"eol ::= {13} {10} registerNewline", // 318
"eol ::= {13} !10 registerNewline", // 319
"CHARLIT ::= \"\'\" charPrintable \"\'\" ws*", // 320
"CHARLIT ::= \"\'\" charPrintable \"\'\" ws*", // 321
"ID ::= !reserved letter++ idChar** ws*", // 322
"ID ::= !reserved letter++ idChar** ws*", // 323
"ID ::= !reserved letter++ idChar** ws*", // 324
"ID ::= !reserved letter++ idChar** ws*", // 325
"STRINGLIT ::= \'\"\' stringPrintable** \'\"\' ws*", // 326
"STRINGLIT ::= \'\"\' stringPrintable** \'\"\' ws*", // 327
"token* ::= token* token", // 328
"token* ::= token* token", // 329
"digit++ ::= digit+ !digit", // 330
"idChar** ::= idChar* !idChar", // 331
"stringPrintable** ::= stringPrintable* !stringPrintable", // 332
"letter++ ::= letter+ !letter", // 333
"ws* ::= ws* ws", // 334
"ws* ::= ws* ws", // 335
"digit+ ::= digit", // 336
"digit+ ::= digit+ digit", // 337
"letter+ ::= letter", // 338
"letter+ ::= letter+ letter", // 339
"idChar* ::= idChar* idChar", // 340
"idChar* ::= idChar* idChar", // 341
"stringPrintable* ::= stringPrintable* stringPrintable", // 342
"stringPrintable* ::= stringPrintable* stringPrintable", // 343
"", // 344
"", // 345
"", // 346
"", // 347
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
    { // 247: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 248: `! ::= "!" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 250: `!= ::= "!" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
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
    { // 253: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `! ::= "!" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 255: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 256: `% ::= "%" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 258: `&& ::= "&" "&" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 259: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `++ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 264: `++ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 265: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: `+ ::= "+" !"+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `, ::= "," [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 270: `- ::= "-" !"-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 271: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 272: `-- ::= "-" "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 273: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `. ::= "." [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `/ ::= "/" !"*" !"/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `/ ::= "/" !"*" !"/" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 280: `< ::= "<" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 281: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 282: `<= ::= "<" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 283: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 284: `= ::= "=" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 285: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 286: `== ::= "=" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 287: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 288: `> ::= ">" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 289: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 290: `>= ::= ">" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 291: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 292: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 293: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 296: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 297: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 298: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 299: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 300: `|| ::= "|" "|" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 301: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 302: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 303: intLit2 ::= !"0" digit++ !"." @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 304: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 305: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 306: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 307: stringPrintable ::= {" ".."!"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 308: stringPrintable ::= {"#".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 309: stringPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 310: charPrintable ::= {" ".."&"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 311: charPrintable ::= {"(".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 312: charPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 313: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 314: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 315: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 316: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 317: eol ::= {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 318: eol ::= {13} {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 319: eol ::= {13} !10 [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 320: CHARLIT ::= "'" charPrintable "'" ws* @zero(char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 321: CHARLIT ::= "'" charPrintable "'" [ws*] @zero(char,char,char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 322: ID ::= !reserved letter++ idChar** $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 323: ID ::= !reserved letter++ idChar** [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 324: ID ::= !reserved letter++ !idChar [idChar**] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 325: ID ::= !reserved letter++ !idChar [idChar**] [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 326: STRINGLIT ::= '"' stringPrintable** $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 327: STRINGLIT ::= '"' !stringPrintable [stringPrintable**] $$2 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 328: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 329: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 330: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 331: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 332: stringPrintable** ::= stringPrintable* !stringPrintable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 333: letter++ ::= letter+ !letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 334: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 335: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 336: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 337: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 338: letter+ ::= letter @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 339: letter+ ::= letter+ letter @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 340: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 341: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 342: stringPrintable* ::= stringPrintable* stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 343: stringPrintable* ::= [stringPrintable*] stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 344: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 345: $$1 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 346: $$2 ::= '"' ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 347: $$2 ::= '"' [ws*] @pass
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
