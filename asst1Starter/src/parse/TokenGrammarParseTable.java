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
public int getEofSym() { return 190; }
public int getNttSym() { return 191; }
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
"\"e\"",
"\"!\"",
"\"=\"",
"\"*\"",
"intLit2",
"\"0\"",
"digit++",
"letter",
"digit",
"\"_\"",
"{\"A\"..\"Z\" \"b\" \"d\" \"f\"..\"k\" \"m\"..\"r\" \"t\"..\"z\"}",
"{\"1\"..\"9\"}",
"ws",
"{9 \" \"}",
"eol",
"10",
"13",
"130",
"131",
"132",
"133",
"134",
"135",
"136",
"137",
"138",
"139",
"140",
"141",
"142",
"143",
"144",
"145",
"146",
"147",
"148",
"149",
"150",
"151",
"152",
"153",
"154",
"155",
"156",
"157",
"158",
"159",
"160",
"161",
"162",
"163",
"164",
"165",
"166",
"167",
"168",
"169",
"170",
"171",
"172",
"173",
"174",
"175",
"176",
"177",
"178",
"179",
"180",
"181",
"182",
"183",
"184",
"185",
"186",
"187",
"188",
"189",
"190",
"191",
"192",
"193",
"194",
"195",
"196",
"197",
"198",
"199",
"200",
"201",
"202",
"203",
"204",
"205",
"206",
"207",
"token*",
"digit+",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 192;}
private static final int MIN_REDUCTION = 226;
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
0x80000000|138, // match move
0x80000000|107, // no-match move
// T-test match for "0":
98,
  }
,
{ // state 1
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 2
  }
,
{ // state 3
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 4
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 5
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 6
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 7
0x80000000|172, // match move
0x80000000|10, // no-match move
0x80000000|24, // NT-test-match state for digit
  }
,
{ // state 8
191,MIN_REDUCTION+101, // $NT
  }
,
{ // state 9
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 10
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 11
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 12
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 13
91,59, // "s"
  }
,
{ // state 14
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 17
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 20
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 21
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 22
2,80, // ws*
105,73, // ws
106,111, // {9 " "}
107,55, // eol
108,62, // {10}
109,139, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 23
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 24
98,207, // "0"
104,207, // {"1".."9"}
  }
,
{ // state 25
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 26
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 27
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 28
0x80000000|29, // match move
0x80000000|109, // no-match move
0x80000000|24, // NT-test-match state for digit
  }
,
{ // state 29
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 30
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 33
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 34
2,199, // ws*
105,73, // ws
106,111, // {9 " "}
107,55, // eol
108,62, // {10}
109,139, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 35
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 37
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 38
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 39
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 40
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 42
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 46
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 47
0x80000000|2, // match move
0x80000000|213, // no-match move
0x80000000|123, // NT-test-match state for idChar
  }
,
{ // state 48
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 49
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 58
0x80000000|83, // match move
0x80000000|117, // no-match move
// T-test match for "0":
98,
  }
,
{ // state 59
93,47, // "e"
  }
,
{ // state 60
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 61
0x80000000|74, // match move
0x80000000|197, // no-match move
// T-test match for "0":
98,
  }
,
{ // state 62
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 63
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 64
190,MIN_REDUCTION+0, // $
  }
,
{ // state 65
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 66
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 67
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 69
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 72
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 73
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 74
3,137, // $$0
4,38, // token
5,66, // `boolean
6,124, // `class
7,221, // `extends
8,45, // `void
9,169, // `int
10,182, // `while
11,40, // `if
12,76, // `else
13,50, // `for
14,205, // `break
15,113, // `this
16,183, // `false
17,65, // `true
18,198, // `super
19,20, // `null
20,36, // `return
21,15, // `instanceof
22,67, // `new
23,14, // `abstract
24,17, // `assert
25,18, // `byte
26,160, // `case
27,176, // `catch
28,5, // `char
29,158, // `const
30,116, // `continue
31,125, // `default
32,52, // `do
33,144, // `double
34,210, // `enum
35,6, // `final
36,145, // `finally
37,184, // `float
38,121, // `goto
39,95, // `implements
40,100, // `import
41,42, // `interface
42,171, // `long
43,105, // `native
44,57, // `package
45,89, // `private
46,202, // `protected
47,27, // `public
48,173, // `short
49,68, // `static
50,201, // `strictfp
51,25, // `switch
52,206, // `synchronized
53,219, // `throw
54,72, // `throws
55,56, // `transient
56,192, // `try
57,131, // `volatile
58,217, // `!
59,78, // `!=
60,180, // `%
61,92, // `&&
62,49, // `*
63,194, // `(
64,48, // `)
65,1, // `{
66,191, // `}
67,35, // `-
68,41, // `+
69,75, // `=
70,103, // `==
71,179, // `[
72,101, // `]
73,96, // `||
74,126, // `<
75,161, // `<=
76,151, // `,
77,19, // `>
78,186, // `>=
79,70, // `.
80,167, // `;
81,141, // `++
82,16, // `--
83,164, // `/
84,23, // ID
85,128, // INTLIT
86,174, // STRINGLIT
87,69, // CHARLIT
105,33, // ws
107,55, // eol
188,58, // token*
  }
,
{ // state 75
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 80
105,33, // ws
106,111, // {9 " "}
107,55, // eol
108,62, // {10}
109,139, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 81
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 83
4,214, // token
5,66, // `boolean
6,124, // `class
7,221, // `extends
8,45, // `void
9,169, // `int
10,182, // `while
11,40, // `if
12,76, // `else
13,50, // `for
14,205, // `break
15,113, // `this
16,183, // `false
17,65, // `true
18,198, // `super
19,20, // `null
20,36, // `return
21,15, // `instanceof
22,67, // `new
23,14, // `abstract
24,17, // `assert
25,18, // `byte
26,160, // `case
27,176, // `catch
28,5, // `char
29,158, // `const
30,116, // `continue
31,125, // `default
32,52, // `do
33,144, // `double
34,210, // `enum
35,6, // `final
36,145, // `finally
37,184, // `float
38,121, // `goto
39,95, // `implements
40,100, // `import
41,42, // `interface
42,171, // `long
43,105, // `native
44,57, // `package
45,89, // `private
46,202, // `protected
47,27, // `public
48,173, // `short
49,68, // `static
50,201, // `strictfp
51,25, // `switch
52,206, // `synchronized
53,219, // `throw
54,72, // `throws
55,56, // `transient
56,192, // `try
57,131, // `volatile
58,217, // `!
59,78, // `!=
60,180, // `%
61,92, // `&&
62,49, // `*
63,194, // `(
64,48, // `)
65,1, // `{
66,191, // `}
67,35, // `-
68,41, // `+
69,75, // `=
70,103, // `==
71,179, // `[
72,101, // `]
73,96, // `||
74,126, // `<
75,161, // `<=
76,151, // `,
77,19, // `>
78,186, // `>=
79,70, // `.
80,167, // `;
81,141, // `++
82,16, // `--
83,164, // `/
84,23, // ID
85,128, // INTLIT
86,174, // STRINGLIT
87,69, // CHARLIT
  }
,
{ // state 84
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 85
89,13, // "l"
  }
,
{ // state 86
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 90
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 94
191,MIN_REDUCTION+102, // $NT
  }
,
{ // state 95
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 97
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 98
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 99
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 101
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 103
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 107
-1, // $$start
64, // start
61, // ws*
140, // $$0
38, // token
66, // `boolean
124, // `class
221, // `extends
45, // `void
169, // `int
182, // `while
40, // `if
76, // `else
50, // `for
205, // `break
113, // `this
183, // `false
65, // `true
198, // `super
20, // `null
36, // `return
15, // `instanceof
67, // `new
14, // `abstract
17, // `assert
18, // `byte
160, // `case
176, // `catch
5, // `char
158, // `const
116, // `continue
125, // `default
52, // `do
144, // `double
210, // `enum
6, // `final
145, // `finally
184, // `float
121, // `goto
95, // `implements
100, // `import
42, // `interface
171, // `long
105, // `native
57, // `package
89, // `private
202, // `protected
27, // `public
173, // `short
68, // `static
201, // `strictfp
25, // `switch
206, // `synchronized
219, // `throw
72, // `throws
56, // `transient
192, // `try
131, // `volatile
217, // `!
78, // `!=
180, // `%
92, // `&&
49, // `*
194, // `(
48, // `)
1, // `{
191, // `}
35, // `-
41, // `+
75, // `=
103, // `==
179, // `[
101, // `]
96, // `||
126, // `<
161, // `<=
151, // `,
19, // `>
186, // `>=
70, // `.
167, // `;
141, // `++
16, // `--
164, // `/
23, // ID
128, // INTLIT
174, // STRINGLIT
69, // CHARLIT
155, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
85, // "e"
146, // "!"
-1, // "="
22, // "*"
34, // intLit2
135, // "0"
168, // digit++
-1, // letter
28, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
135, // {"1".."9"}
73, // ws
111, // {9 " "}
55, // eol
62, // {10}
139, // {13}
97, // {130}
46, // {131}
32, // {132}
115, // {133}
98, // {134}
178, // {135}
37, // {136}
26, // {137}
149, // {138}
223, // {139}
120, // {140}
81, // {141}
82, // {142}
162, // {143}
91, // {144}
112, // {145}
196, // {146}
39, // {147}
63, // {148}
224, // {149}
71, // {150}
143, // {151}
190, // {152}
108, // {153}
204, // {154}
156, // {155}
150, // {156}
9, // {157}
181, // {158}
88, // {159}
185, // {160}
3, // {161}
203, // {162}
188, // {163}
51, // {164}
216, // {165}
218, // {166}
60, // {167}
200, // {168}
31, // {169}
211, // {170}
104, // {171}
106, // {172}
133, // {173}
154, // {174}
165, // {175}
4, // {176}
87, // {177}
195, // {178}
43, // {179}
12, // {180}
163, // {181}
54, // {182}
142, // {183}
93, // {184}
220, // {185}
99, // {186}
21, // {187}
187, // {188}
136, // {189}
118, // {190}
134, // {191}
44, // {192}
84, // {193}
77, // {194}
175, // {195}
86, // {196}
130, // {197}
209, // {198}
53, // {199}
222, // {200}
90, // {201}
170, // {202}
189, // {203}
11, // {204}
119, // {205}
30, // {206}
114, // {207}
58, // token*
7, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 108
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 110
91,212, // "s"
  }
,
{ // state 111
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 113
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 116
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 117
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
214, // token
66, // `boolean
124, // `class
221, // `extends
45, // `void
169, // `int
182, // `while
40, // `if
76, // `else
50, // `for
205, // `break
113, // `this
183, // `false
65, // `true
198, // `super
20, // `null
36, // `return
15, // `instanceof
67, // `new
14, // `abstract
17, // `assert
18, // `byte
160, // `case
176, // `catch
5, // `char
158, // `const
116, // `continue
125, // `default
52, // `do
144, // `double
210, // `enum
6, // `final
145, // `finally
184, // `float
121, // `goto
95, // `implements
100, // `import
42, // `interface
171, // `long
105, // `native
57, // `package
89, // `private
202, // `protected
27, // `public
173, // `short
68, // `static
201, // `strictfp
25, // `switch
206, // `synchronized
219, // `throw
72, // `throws
56, // `transient
192, // `try
131, // `volatile
217, // `!
78, // `!=
180, // `%
92, // `&&
49, // `*
194, // `(
48, // `)
1, // `{
191, // `}
35, // `-
41, // `+
75, // `=
103, // `==
179, // `[
101, // `]
96, // `||
126, // `<
161, // `<=
151, // `,
19, // `>
186, // `>=
70, // `.
167, // `;
141, // `++
16, // `--
164, // `/
23, // ID
128, // INTLIT
174, // STRINGLIT
69, // CHARLIT
155, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
85, // "e"
146, // "!"
-1, // "="
22, // "*"
34, // intLit2
135, // "0"
168, // digit++
-1, // letter
28, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
135, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
97, // {130}
46, // {131}
32, // {132}
115, // {133}
98, // {134}
178, // {135}
37, // {136}
26, // {137}
149, // {138}
223, // {139}
120, // {140}
81, // {141}
82, // {142}
162, // {143}
91, // {144}
112, // {145}
196, // {146}
39, // {147}
63, // {148}
224, // {149}
71, // {150}
143, // {151}
190, // {152}
108, // {153}
204, // {154}
156, // {155}
150, // {156}
9, // {157}
181, // {158}
88, // {159}
185, // {160}
3, // {161}
203, // {162}
188, // {163}
51, // {164}
216, // {165}
218, // {166}
60, // {167}
200, // {168}
31, // {169}
211, // {170}
104, // {171}
106, // {172}
133, // {173}
154, // {174}
165, // {175}
4, // {176}
87, // {177}
195, // {178}
43, // {179}
12, // {180}
163, // {181}
54, // {182}
142, // {183}
93, // {184}
220, // {185}
99, // {186}
21, // {187}
187, // {188}
136, // {189}
118, // {190}
134, // {191}
44, // {192}
84, // {193}
77, // {194}
175, // {195}
86, // {196}
130, // {197}
209, // {198}
53, // {199}
222, // {200}
90, // {201}
170, // {202}
189, // {203}
11, // {204}
119, // {205}
30, // {206}
114, // {207}
-1, // token*
7, // digit+
MIN_REDUCTION+194, // $
-1, // $NT
  }
,
{ // state 118
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 121
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 122
2,127, // ws*
105,73, // ws
106,111, // {9 " "}
107,55, // eol
108,62, // {10}
109,139, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 123
88,94, // "c"
89,94, // "l"
90,94, // "a"
91,94, // "s"
93,94, // "e"
98,207, // "0"
100,147, // letter
101,177, // digit
102,8, // "_"
103,94, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
104,207, // {"1".."9"}
  }
,
{ // state 124
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 126
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 127
105,33, // ws
106,111, // {9 " "}
107,55, // eol
108,62, // {10}
109,139, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 129
105,33, // ws
106,111, // {9 " "}
107,55, // eol
108,62, // {10}
109,139, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 130
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 132
90,110, // "a"
  }
,
{ // state 133
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 135
0x80000000|79, // match move
0x80000000|102, // no-match move
0x80000000|24, // NT-test-match state for digit
  }
,
{ // state 136
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 138
1,64, // start
2,61, // ws*
3,140, // $$0
4,38, // token
5,66, // `boolean
6,124, // `class
7,221, // `extends
8,45, // `void
9,169, // `int
10,182, // `while
11,40, // `if
12,76, // `else
13,50, // `for
14,205, // `break
15,113, // `this
16,183, // `false
17,65, // `true
18,198, // `super
19,20, // `null
20,36, // `return
21,15, // `instanceof
22,67, // `new
23,14, // `abstract
24,17, // `assert
25,18, // `byte
26,160, // `case
27,176, // `catch
28,5, // `char
29,158, // `const
30,116, // `continue
31,125, // `default
32,52, // `do
33,144, // `double
34,210, // `enum
35,6, // `final
36,145, // `finally
37,184, // `float
38,121, // `goto
39,95, // `implements
40,100, // `import
41,42, // `interface
42,171, // `long
43,105, // `native
44,57, // `package
45,89, // `private
46,202, // `protected
47,27, // `public
48,173, // `short
49,68, // `static
50,201, // `strictfp
51,25, // `switch
52,206, // `synchronized
53,219, // `throw
54,72, // `throws
55,56, // `transient
56,192, // `try
57,131, // `volatile
58,217, // `!
59,78, // `!=
60,180, // `%
61,92, // `&&
62,49, // `*
63,194, // `(
64,48, // `)
65,1, // `{
66,191, // `}
67,35, // `-
68,41, // `+
69,75, // `=
70,103, // `==
71,179, // `[
72,101, // `]
73,96, // `||
74,126, // `<
75,161, // `<=
76,151, // `,
77,19, // `>
78,186, // `>=
79,70, // `.
80,167, // `;
81,141, // `++
82,16, // `--
83,164, // `/
84,23, // ID
85,128, // INTLIT
86,174, // STRINGLIT
87,69, // CHARLIT
105,73, // ws
107,55, // eol
188,58, // token*
  }
,
{ // state 139
0x80000000|157, // match move
0x80000000|193, // no-match move
// T-test match for 10:
108,
  }
,
{ // state 140
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 143
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 146
95,122, // "="
  }
,
{ // state 147
191,MIN_REDUCTION+99, // $NT
  }
,
{ // state 148
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 152
2,208, // ws*
105,73, // ws
106,111, // {9 " "}
107,55, // eol
108,62, // {10}
109,139, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 153
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 154
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 155
89,132, // "l"
  }
,
{ // state 156
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 157
108,159, // {10}
  }
,
{ // state 158
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 166
0x80000000|148, // match move
0x80000000|153, // no-match move
0x80000000|24, // NT-test-match state for digit
  }
,
{ // state 167
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 171
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 172
98,135, // "0"
101,166, // digit
104,135, // {"1".."9"}
  }
,
{ // state 173
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 174
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 175
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 177
191,MIN_REDUCTION+100, // $NT
  }
,
{ // state 178
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 185
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 186
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 190
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 197
-1, // $$start
-1, // start
-1, // ws*
137, // $$0
38, // token
66, // `boolean
124, // `class
221, // `extends
45, // `void
169, // `int
182, // `while
40, // `if
76, // `else
50, // `for
205, // `break
113, // `this
183, // `false
65, // `true
198, // `super
20, // `null
36, // `return
15, // `instanceof
67, // `new
14, // `abstract
17, // `assert
18, // `byte
160, // `case
176, // `catch
5, // `char
158, // `const
116, // `continue
125, // `default
52, // `do
144, // `double
210, // `enum
6, // `final
145, // `finally
184, // `float
121, // `goto
95, // `implements
100, // `import
42, // `interface
171, // `long
105, // `native
57, // `package
89, // `private
202, // `protected
27, // `public
173, // `short
68, // `static
201, // `strictfp
25, // `switch
206, // `synchronized
219, // `throw
72, // `throws
56, // `transient
192, // `try
131, // `volatile
217, // `!
78, // `!=
180, // `%
92, // `&&
49, // `*
194, // `(
48, // `)
1, // `{
191, // `}
35, // `-
41, // `+
75, // `=
103, // `==
179, // `[
101, // `]
96, // `||
126, // `<
161, // `<=
151, // `,
19, // `>
186, // `>=
70, // `.
167, // `;
141, // `++
16, // `--
164, // `/
23, // ID
128, // INTLIT
174, // STRINGLIT
69, // CHARLIT
155, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
85, // "e"
146, // "!"
-1, // "="
22, // "*"
34, // intLit2
135, // "0"
168, // digit++
-1, // letter
28, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
135, // {"1".."9"}
33, // ws
111, // {9 " "}
55, // eol
62, // {10}
139, // {13}
97, // {130}
46, // {131}
32, // {132}
115, // {133}
98, // {134}
178, // {135}
37, // {136}
26, // {137}
149, // {138}
223, // {139}
120, // {140}
81, // {141}
82, // {142}
162, // {143}
91, // {144}
112, // {145}
196, // {146}
39, // {147}
63, // {148}
224, // {149}
71, // {150}
143, // {151}
190, // {152}
108, // {153}
204, // {154}
156, // {155}
150, // {156}
9, // {157}
181, // {158}
88, // {159}
185, // {160}
3, // {161}
203, // {162}
188, // {163}
51, // {164}
216, // {165}
218, // {166}
60, // {167}
200, // {168}
31, // {169}
211, // {170}
104, // {171}
106, // {172}
133, // {173}
154, // {174}
165, // {175}
4, // {176}
87, // {177}
195, // {178}
43, // {179}
12, // {180}
163, // {181}
54, // {182}
142, // {183}
93, // {184}
220, // {185}
99, // {186}
21, // {187}
187, // {188}
136, // {189}
118, // {190}
134, // {191}
44, // {192}
84, // {193}
77, // {194}
175, // {195}
86, // {196}
130, // {197}
209, // {198}
53, // {199}
222, // {200}
90, // {201}
170, // {202}
189, // {203}
11, // {204}
119, // {205}
30, // {206}
114, // {207}
58, // token*
7, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 198
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 199
105,33, // ws
106,111, // {9 " "}
107,55, // eol
108,62, // {10}
109,139, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 201
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 206
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 207
191,MIN_REDUCTION+103, // $NT
  }
,
{ // state 208
105,33, // ws
106,111, // {9 " "}
107,55, // eol
108,62, // {10}
109,139, // {13}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 210
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 211
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 212
91,215, // "s"
  }
,
{ // state 213
2,129, // ws*
105,73, // ws
106,111, // {9 " "}
107,55, // eol
108,62, // {10}
109,139, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 214
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 215
0x80000000|2, // match move
0x80000000|152, // no-match move
0x80000000|123, // NT-test-match state for idChar
  }
,
{ // state 216
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 219
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+128, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[225][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
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
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// `!= ::= "!" "=" ws*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `* ::= "*" ws*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// INTLIT ::= intLit2 ws*
(85<<16)+2,
// INTLIT ::= intLit2
(85<<16)+1,
// intLit2 ::= !"0" digit++
(97<<16)+1,
// idChar ::= letter
(92<<16)+1,
// idChar ::= digit
(92<<16)+1,
// idChar ::= "_"
(92<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(100<<16)+1,
// digit ::= {"0".."9"}
(101<<16)+1,
// ws ::= {9 " "}
(105<<16)+1,
// ws ::= eol
(105<<16)+1,
// eol ::= {10}
(107<<16)+1,
// eol ::= {13} {10}
(107<<16)+2,
// eol ::= {13} !10
(107<<16)+1,
// CHARLIT ::= {130}
(87<<16)+1,
// ID ::= {131}
(84<<16)+1,
// STRINGLIT ::= {132}
(86<<16)+1,
// `! ::= {133}
(58<<16)+1,
// `% ::= {134}
(60<<16)+1,
// `&& ::= {135}
(61<<16)+1,
// `( ::= {136}
(63<<16)+1,
// `) ::= {137}
(64<<16)+1,
// `+ ::= {138}
(68<<16)+1,
// `++ ::= {139}
(81<<16)+1,
// `, ::= {140}
(76<<16)+1,
// `- ::= {141}
(67<<16)+1,
// `-- ::= {142}
(82<<16)+1,
// `. ::= {143}
(79<<16)+1,
// `/ ::= {144}
(83<<16)+1,
// `; ::= {145}
(80<<16)+1,
// `< ::= {146}
(74<<16)+1,
// `<= ::= {147}
(75<<16)+1,
// `= ::= {148}
(69<<16)+1,
// `== ::= {149}
(70<<16)+1,
// `> ::= {150}
(77<<16)+1,
// `>= ::= {151}
(78<<16)+1,
// `[ ::= {152}
(71<<16)+1,
// `] ::= {153}
(72<<16)+1,
// `{ ::= {154}
(65<<16)+1,
// `|| ::= {155}
(73<<16)+1,
// `} ::= {156}
(66<<16)+1,
// `abstract ::= {157}
(23<<16)+1,
// `assert ::= {158}
(24<<16)+1,
// `boolean ::= {159}
(5<<16)+1,
// `break ::= {160}
(14<<16)+1,
// `byte ::= {161}
(25<<16)+1,
// `case ::= {162}
(26<<16)+1,
// `catch ::= {163}
(27<<16)+1,
// `char ::= {164}
(28<<16)+1,
// `const ::= {165}
(29<<16)+1,
// `continue ::= {166}
(30<<16)+1,
// `default ::= {167}
(31<<16)+1,
// `do ::= {168}
(32<<16)+1,
// `double ::= {169}
(33<<16)+1,
// `enum ::= {170}
(34<<16)+1,
// `extends ::= {171}
(7<<16)+1,
// `false ::= {172}
(16<<16)+1,
// `final ::= {173}
(35<<16)+1,
// `finally ::= {174}
(36<<16)+1,
// `float ::= {175}
(37<<16)+1,
// `for ::= {176}
(13<<16)+1,
// `goto ::= {177}
(38<<16)+1,
// `if ::= {178}
(11<<16)+1,
// `implements ::= {179}
(39<<16)+1,
// `import ::= {180}
(40<<16)+1,
// `instanceof ::= {181}
(21<<16)+1,
// `int ::= {182}
(9<<16)+1,
// `interface ::= {183}
(41<<16)+1,
// `long ::= {184}
(42<<16)+1,
// `native ::= {185}
(43<<16)+1,
// `new ::= {186}
(22<<16)+1,
// `null ::= {187}
(19<<16)+1,
// `package ::= {188}
(44<<16)+1,
// `private ::= {189}
(45<<16)+1,
// `protected ::= {190}
(46<<16)+1,
// `public ::= {191}
(47<<16)+1,
// `return ::= {192}
(20<<16)+1,
// `short ::= {193}
(48<<16)+1,
// `static ::= {194}
(49<<16)+1,
// `strictfp ::= {195}
(50<<16)+1,
// `super ::= {196}
(18<<16)+1,
// `switch ::= {197}
(51<<16)+1,
// `synchronized ::= {198}
(52<<16)+1,
// `this ::= {199}
(15<<16)+1,
// `throw ::= {200}
(53<<16)+1,
// `throws ::= {201}
(54<<16)+1,
// `transient ::= {202}
(55<<16)+1,
// `true ::= {203}
(17<<16)+1,
// `try ::= {204}
(56<<16)+1,
// `void ::= {205}
(8<<16)+1,
// `volatile ::= {206}
(57<<16)+1,
// `while ::= {207}
(10<<16)+1,
// token* ::= token* token
(188<<16)+2,
// token* ::= token
(188<<16)+1,
// digit++ ::= digit+ !digit
(99<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(189<<16)+1,
// digit+ ::= digit+ digit
(189<<16)+2,
// $$0 ::= token*
(3<<16)+1,
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
106, // 9
108, // 10
-1, // 11
-1, // 12
109, // 13
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
106, // " "
94, // "!"
-1, // '"'
-1, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
-1, // "("
-1, // ")"
96, // "*"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // "/"
98, // "0"
104, // "1"
104, // "2"
104, // "3"
104, // "4"
104, // "5"
104, // "6"
104, // "7"
104, // "8"
104, // "9"
-1, // ":"
-1, // ";"
-1, // "<"
95, // "="
-1, // ">"
-1, // "?"
-1, // "@"
103, // "A"
103, // "B"
103, // "C"
103, // "D"
103, // "E"
103, // "F"
103, // "G"
103, // "H"
103, // "I"
103, // "J"
103, // "K"
103, // "L"
103, // "M"
103, // "N"
103, // "O"
103, // "P"
103, // "Q"
103, // "R"
103, // "S"
103, // "T"
103, // "U"
103, // "V"
103, // "W"
103, // "X"
103, // "Y"
103, // "Z"
-1, // "["
-1, // "\"
-1, // "]"
-1, // "^"
102, // "_"
-1, // "`"
90, // "a"
103, // "b"
88, // "c"
103, // "d"
93, // "e"
103, // "f"
103, // "g"
103, // "h"
103, // "i"
103, // "j"
103, // "k"
89, // "l"
103, // "m"
103, // "n"
103, // "o"
103, // "p"
103, // "q"
103, // "r"
91, // "s"
103, // "t"
103, // "u"
103, // "v"
103, // "w"
103, // "x"
103, // "y"
103, // "z"
-1, // "{"
-1, // "|"
-1, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
110, // 130
111, // 131
112, // 132
113, // 133
114, // 134
115, // 135
116, // 136
117, // 137
118, // 138
119, // 139
120, // 140
121, // 141
122, // 142
123, // 143
124, // 144
125, // 145
126, // 146
127, // 147
128, // 148
129, // 149
130, // 150
131, // 151
132, // 152
133, // 153
134, // 154
135, // 155
136, // 156
137, // 157
138, // 158
139, // 159
140, // 160
141, // 161
142, // 162
143, // 163
144, // 164
145, // 165
146, // 166
147, // 167
148, // 168
149, // 169
150, // 170
151, // 171
152, // 172
153, // 173
154, // 174
155, // 175
156, // 176
157, // 177
158, // 178
159, // 179
160, // 180
161, // 181
162, // 182
163, // 183
164, // 184
165, // 185
166, // 186
167, // 187
168, // 188
169, // 189
170, // 190
171, // 191
172, // 192
173, // 193
174, // 194
175, // 195
176, // 196
177, // 197
178, // 198
179, // 199
180, // 200
181, // 201
182, // 202
183, // 203
184, // 204
185, // 205
186, // 206
187, // 207
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
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 90
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 91
"`!= ::= \"!\" \"=\" ws*", // 92
"`!= ::= \"!\" \"=\" ws*", // 93
"`* ::= \"*\" ws*", // 94
"`* ::= \"*\" ws*", // 95
"INTLIT ::= # intLit2 ws*", // 96
"INTLIT ::= # intLit2 ws*", // 97
"intLit2 ::= !\"0\" digit++", // 98
"idChar ::= letter", // 99
"idChar ::= digit", // 100
"idChar ::= \"_\"", // 101
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 102
"digit ::= {\"0\"..\"9\"}", // 103
"ws ::= {9 \" \"}", // 104
"ws ::= eol", // 105
"eol ::= {10} registerNewline", // 106
"eol ::= {13} {10} registerNewline", // 107
"eol ::= {13} !10 registerNewline", // 108
"CHARLIT ::= {130}", // 109
"ID ::= {131}", // 110
"STRINGLIT ::= {132}", // 111
"`! ::= {133}", // 112
"`% ::= {134}", // 113
"`&& ::= {135}", // 114
"`( ::= {136}", // 115
"`) ::= {137}", // 116
"`+ ::= {138}", // 117
"`++ ::= {139}", // 118
"`, ::= {140}", // 119
"`- ::= {141}", // 120
"`-- ::= {142}", // 121
"`. ::= {143}", // 122
"`/ ::= {144}", // 123
"`; ::= {145}", // 124
"`< ::= {146}", // 125
"`<= ::= {147}", // 126
"`= ::= {148}", // 127
"`== ::= {149}", // 128
"`> ::= {150}", // 129
"`>= ::= {151}", // 130
"`[ ::= {152}", // 131
"`] ::= {153}", // 132
"`{ ::= {154}", // 133
"`|| ::= {155}", // 134
"`} ::= {156}", // 135
"`abstract ::= {157}", // 136
"`assert ::= {158}", // 137
"`boolean ::= {159}", // 138
"`break ::= {160}", // 139
"`byte ::= {161}", // 140
"`case ::= {162}", // 141
"`catch ::= {163}", // 142
"`char ::= {164}", // 143
"`const ::= {165}", // 144
"`continue ::= {166}", // 145
"`default ::= {167}", // 146
"`do ::= {168}", // 147
"`double ::= {169}", // 148
"`enum ::= {170}", // 149
"`extends ::= {171}", // 150
"`false ::= {172}", // 151
"`final ::= {173}", // 152
"`finally ::= {174}", // 153
"`float ::= {175}", // 154
"`for ::= {176}", // 155
"`goto ::= {177}", // 156
"`if ::= {178}", // 157
"`implements ::= {179}", // 158
"`import ::= {180}", // 159
"`instanceof ::= {181}", // 160
"`int ::= {182}", // 161
"`interface ::= {183}", // 162
"`long ::= {184}", // 163
"`native ::= {185}", // 164
"`new ::= {186}", // 165
"`null ::= {187}", // 166
"`package ::= {188}", // 167
"`private ::= {189}", // 168
"`protected ::= {190}", // 169
"`public ::= {191}", // 170
"`return ::= {192}", // 171
"`short ::= {193}", // 172
"`static ::= {194}", // 173
"`strictfp ::= {195}", // 174
"`super ::= {196}", // 175
"`switch ::= {197}", // 176
"`synchronized ::= {198}", // 177
"`this ::= {199}", // 178
"`throw ::= {200}", // 179
"`throws ::= {201}", // 180
"`transient ::= {202}", // 181
"`true ::= {203}", // 182
"`try ::= {204}", // 183
"`void ::= {205}", // 184
"`volatile ::= {206}", // 185
"`while ::= {207}", // 186
"token* ::= token* token", // 187
"token* ::= token* token", // 188
"digit++ ::= digit+ !digit", // 189
"ws* ::= ws* ws", // 190
"ws* ::= ws* ws", // 191
"digit+ ::= digit", // 192
"digit+ ::= digit+ digit", // 193
"", // 194
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 90: `else ::= "e" "l" "s" "e" !idChar ws* @void
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
    { // 91: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 92: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 93: `!= ::= "!" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 96: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 97: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 98: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 99: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 100: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 101: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 102: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 103: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 104: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 105: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 106: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 107: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 108: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 110: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 111: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 112: `! ::= {133} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: `% ::= {134} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `&& ::= {135} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `( ::= {136} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `) ::= {137} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `+ ::= {138} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `++ ::= {139} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `, ::= {140} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `- ::= {141} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `-- ::= {142} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `. ::= {143} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `; ::= {145} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `< ::= {146} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `<= ::= {147} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `= ::= {148} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `== ::= {149} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `> ::= {150} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `>= ::= {151} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `[ ::= {152} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `] ::= {153} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `{ ::= {154} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `|| ::= {155} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `} ::= {156} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `abstract ::= {157} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `assert ::= {158} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `boolean ::= {159} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `break ::= {160} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `byte ::= {161} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `case ::= {162} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `catch ::= {163} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `char ::= {164} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `const ::= {165} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `continue ::= {166} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `default ::= {167} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `do ::= {168} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `double ::= {169} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `enum ::= {170} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `extends ::= {171} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `false ::= {172} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `final ::= {173} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `finally ::= {174} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `float ::= {175} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `for ::= {176} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `goto ::= {177} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `if ::= {178} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `implements ::= {179} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `import ::= {180} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `instanceof ::= {181} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `int ::= {182} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `interface ::= {183} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `long ::= {184} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `native ::= {185} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `new ::= {186} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `null ::= {187} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `package ::= {188} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `private ::= {189} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `protected ::= {190} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `public ::= {191} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `return ::= {192} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `short ::= {193} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `static ::= {194} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `strictfp ::= {195} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `super ::= {196} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `switch ::= {197} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `synchronized ::= {198} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `this ::= {199} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `throw ::= {200} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `throws ::= {201} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: `transient ::= {202} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 182: `true ::= {203} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 183: `try ::= {204} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 184: `void ::= {205} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 185: `volatile ::= {206} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `while ::= {207} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 188: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 189: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 190: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 191: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 192: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 193: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 194: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "start ::= ws* token*", // start
    "ws* ::=", // ws*
    "token* ::=", // token*
    "", // $$start
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // start
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // ws*
    },
    { // token*
    },
    { // $$start
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      int result = actionObject.zero(parm0);
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
"int zero(char)",
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
    -1,
    -1,
    0,
    -1,
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
    0,
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
