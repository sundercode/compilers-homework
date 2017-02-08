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
public int getEofSym() { return 175; }
public int getNttSym() { return 176; }
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
"comment1Printable",
"\"\\\"",
"9",
"comment2Printable",
"eol",
"ws",
"comment",
"10",
"13",
"12",
"letter++",
"idChar**",
"$$1",
"stringPrintable**",
"$$2",
"comment2Printable**",
"comment1Printable**",
"token*",
"comment1Printable*",
"digit+",
"comment2Printable*",
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
public int numSymbols() { return 177;}
private static final int MIN_REDUCTION = 1256;
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
0x80000000|196, // match move
0x80000000|772, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|263, // match move
0x80000000|1074, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 3
2,1127, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
163,753, // $$1
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 4
0x80000000|1197, // match move
0x80000000|1142, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 5
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+289, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 6
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 7
0x80000000|156, // match move
0x80000000|771, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 8
-1, // $$start
-1, // start
1185, // ws*
-1, // $$0
MIN_REDUCTION+203, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+203, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+203, // "k"
MIN_REDUCTION+203, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+203, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+203, // "h"
MIN_REDUCTION+203, // "y"
MIN_REDUCTION+203, // "m"
464, // "g"
MIN_REDUCTION+203, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+203, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+203, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+203, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+203, // $
MIN_REDUCTION+203, // $NT
  }
,
{ // state 9
2,660, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 10
102,83, // "d"
  }
,
{ // state 11
0x80000000|867, // match move
0x80000000|935, // no-match move
0x80000000|43, // NT-test-match state for digit
  }
,
{ // state 12
98,474, // "r"
  }
,
{ // state 13
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 14
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 15
-1, // $$start
-1, // start
1171, // ws*
-1, // $$0
MIN_REDUCTION+122, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
1096, // "e"
427, // "b"
MIN_REDUCTION+122, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+122, // "k"
MIN_REDUCTION+122, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+122, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+122, // "h"
MIN_REDUCTION+122, // "y"
MIN_REDUCTION+122, // "m"
464, // "g"
MIN_REDUCTION+122, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+122, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+122, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+122, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 16
0x80000000|135, // match move
0x80000000|283, // no-match move
0x80000000|1249, // NT-test-match state for comment1Printable
  }
,
{ // state 17
176,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 18
0x80000000|353, // match move
0x80000000|1167, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 19
0x80000000|997, // match move
0x80000000|645, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 20
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 21
-1, // $$start
-1, // start
740, // ws*
-1, // $$0
MIN_REDUCTION+266, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 22
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 23
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 24
0x80000000|893, // match move
0x80000000|165, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 25
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 26
2,912, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 27
97,1174, // "n"
107,479, // "f"
111,781, // "m"
  }
,
{ // state 28
176,MIN_REDUCTION+108, // $NT
  }
,
{ // state 29
88,934, // "c"
  }
,
{ // state 30
0x80000000|992, // match move
0x80000000|59, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 31
2,501, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 32
146,688, // "'"
  }
,
{ // state 33
176,MIN_REDUCTION+138, // $NT
  }
,
{ // state 34
0x80000000|338, // match move
0x80000000|19, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 35
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 36
0x80000000|1017, // match move
0x80000000|694, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 37
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 38
98,429, // "r"
  }
,
{ // state 39
116,532, // "*"
  }
,
{ // state 40
0x80000000|1, // match move
0x80000000|95, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 41
0x80000000|655, // match move
0x80000000|152, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 42
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 43
135,290, // "0"
142,290, // {"1".."9"}
  }
,
{ // state 44
2,278, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 46
0x80000000|48, // match move
0x80000000|157, // no-match move
0x80000000|43, // NT-test-match state for digit
  }
,
{ // state 47
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 48
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 49
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+91, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+91, // $
MIN_REDUCTION+91, // $NT
  }
,
{ // state 50
0x80000000|206, // match move
0x80000000|288, // no-match move
// T-test match for 10:
158,
  }
,
{ // state 51
101,450, // "t"
  }
,
{ // state 52
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 53
0x80000000|393, // match move
0x80000000|1245, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 54
2,833, // ws*
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 55
176,MIN_REDUCTION+315, // $NT
  }
,
{ // state 56
0x80000000|626, // match move
0x80000000|976, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 57
94,995, // "e"
  }
,
{ // state 58
176,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 59
-1, // $$start
-1, // start
1042, // ws*
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
-1, // `=
-1, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
MIN_REDUCTION+250, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 60
0x80000000|1, // match move
0x80000000|617, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 61
0x80000000|550, // match move
0x80000000|1002, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 62
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 63
0x80000000|971, // match move
0x80000000|628, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 64
2,649, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 65
176,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 66
2,746, // ws*
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 67
0x80000000|1, // match move
0x80000000|241, // no-match move
// T-test match for "/":
125,
  }
,
{ // state 68
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 69
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+187, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+187, // $
MIN_REDUCTION+187, // $NT
  }
,
{ // state 70
2,432, // ws*
MIN_REDUCTION+328, // (default reduction)
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
94,230, // "e"
  }
,
{ // state 74
0x80000000|404, // match move
0x80000000|647, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 75
0x80000000|1, // match move
0x80000000|612, // no-match move
0x80000000|769, // NT-test-match state for letter
  }
,
{ // state 76
0x80000000|1238, // match move
0x80000000|125, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 77
0x80000000|250, // match move
0x80000000|330, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 78
103,951, // "p"
  }
,
{ // state 79
0x80000000|824, // match move
0x80000000|400, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 80
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 81
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 82
176,MIN_REDUCTION+228, // $NT
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|284, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 84
0x80000000|816, // match move
0x80000000|1154, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 85
176,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 86
176,MIN_REDUCTION+207, // $NT
  }
,
{ // state 87
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 88
0x80000000|705, // match move
0x80000000|1071, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 89
3,1122, // $$0
4,665, // token
5,388, // `boolean
6,480, // `class
7,922, // `extends
8,357, // `void
9,864, // `int
10,251, // `while
11,666, // `if
12,412, // `else
13,71, // `for
14,597, // `break
15,785, // `this
16,882, // `false
17,1007, // `true
18,903, // `super
19,947, // `null
20,966, // `return
21,25, // `instanceof
22,1014, // `new
23,20, // `abstract
24,642, // `assert
25,641, // `byte
26,529, // `case
27,552, // `catch
28,6, // `char
29,849, // `const
30,470, // `continue
31,481, // `default
32,687, // `do
33,820, // `double
34,1232, // `enum
35,932, // `final
36,205, // `finally
37,884, // `float
38,796, // `goto
39,1055, // `implements
40,1061, // `import
41,62, // `interface
42,235, // `long
43,150, // `native
44,695, // `package
45,749, // `private
46,1229, // `protected
47,45, // `public
48,1178, // `short
49,392, // `static
50,279, // `strictfp
51,335, // `switch
52,598, // `synchronized
53,608, // `throw
54,1024, // `throws
55,81, // `transient
56,582, // `try
57,806, // `volatile
168,1000, // token*
  }
,
{ // state 90
0x80000000|605, // match move
0x80000000|929, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 91
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 92
0x80000000|1, // match move
0x80000000|162, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 93
176,MIN_REDUCTION+307, // $NT
  }
,
{ // state 94
0x80000000|747, // match move
0x80000000|69, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 95
-1, // $$start
-1, // start
56, // ws*
-1, // $$0
MIN_REDUCTION+155, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+155, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+155, // "k"
MIN_REDUCTION+155, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+155, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+155, // "h"
MIN_REDUCTION+155, // "y"
MIN_REDUCTION+155, // "m"
464, // "g"
MIN_REDUCTION+155, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+155, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+155, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+155, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+155, // $
MIN_REDUCTION+155, // $NT
  }
,
{ // state 96
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 97
0x80000000|96, // match move
0x80000000|1068, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 98
176,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 99
90,1204, // "a"
98,323, // "r"
  }
,
{ // state 100
-1, // $$start
-1, // start
514, // ws*
-1, // $$0
MIN_REDUCTION+158, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+158, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+158, // "k"
MIN_REDUCTION+158, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+158, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+158, // "h"
MIN_REDUCTION+158, // "y"
MIN_REDUCTION+158, // "m"
464, // "g"
MIN_REDUCTION+158, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+158, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+158, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+158, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+158, // $
MIN_REDUCTION+158, // $NT
  }
,
{ // state 101
2,440, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 102
97,389, // "n"
  }
,
{ // state 103
116,532, // "*"
125,16, // "/"
  }
,
{ // state 104
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+238, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+238, // $
MIN_REDUCTION+238, // $NT
  }
,
{ // state 105
176,MIN_REDUCTION+204, // $NT
  }
,
{ // state 106
0x80000000|1065, // match move
0x80000000|302, // no-match move
0x80000000|769, // NT-test-match state for letter
  }
,
{ // state 107
0x80000000|472, // match move
0x80000000|558, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 108
176,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 109
139,MIN_REDUCTION+318, // "_"
162,MIN_REDUCTION+318, // idChar**
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 111
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+257, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 112
176,MIN_REDUCTION+222, // $NT
  }
,
{ // state 113
107,403, // "f"
  }
,
{ // state 114
-1, // $$start
-1, // start
892, // ws*
-1, // $$0
MIN_REDUCTION+258, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 115
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 116
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 117
176,MIN_REDUCTION+314, // $NT
  }
,
{ // state 118
98,1012, // "r"
  }
,
{ // state 119
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 120
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 121
102,187, // "d"
  }
,
{ // state 122
88,385, // "c"
  }
,
{ // state 123
0x80000000|266, // match move
0x80000000|374, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 124
88,668, // "c"
  }
,
{ // state 125
0x80000000|108, // match move
0x80000000|682, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 126
97,1121, // "n"
  }
,
{ // state 127
176,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 128
101,439, // "t"
  }
,
{ // state 129
0x80000000|1219, // match move
0x80000000|1177, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 130
0x80000000|225, // match move
0x80000000|959, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 131
150,581, // '"'
165,1097, // $$2
  }
,
{ // state 132
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 133
0x80000000|145, // match move
0x80000000|848, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 134
0x80000000|491, // match move
0x80000000|958, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 135
88,763, // "c"
89,763, // "l"
90,763, // "a"
91,763, // "s"
94,763, // "e"
95,763, // "b"
96,763, // "o"
97,763, // "n"
98,763, // "r"
99,763, // "k"
100,763, // "x"
101,763, // "t"
102,763, // "d"
103,763, // "p"
104,763, // "u"
105,763, // "i"
106,763, // "v"
107,763, // "f"
108,763, // "w"
109,763, // "h"
110,763, // "y"
111,763, // "m"
112,763, // "g"
113,763, // "z"
114,763, // "!"
115,763, // "="
116,763, // "*"
117,763, // "%"
118,763, // "&"
119,763, // "("
120,763, // ")"
121,763, // "+"
122,763, // ","
123,763, // "-"
124,763, // "."
125,763, // "/"
126,763, // ";"
127,763, // "<"
128,763, // ">"
129,763, // "["
130,763, // "]"
131,763, // "{"
132,763, // "}"
133,763, // "|"
135,763, // "0"
139,763, // "_"
141,763, // " "
142,763, // {"1".."9"}
143,763, // {":" "?".."@"}
144,763, // {"#".."$"}
145,763, // {"A".."Z"}
146,763, // "'"
147,763, // {"j" "q"}
148,763, // {"^" "`" "~"}
150,763, // '"'
151,519, // comment1Printable
152,763, // "\"
153,733, // {9}
167,887, // comment1Printable**
169,471, // comment1Printable*
  }
,
{ // state 136
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 138
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 139
0x80000000|64, // match move
0x80000000|378, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 140
0x80000000|54, // match move
0x80000000|989, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 141
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 142
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+285, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 143
0x80000000|703, // match move
0x80000000|151, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 144
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 146
99,1052, // "k"
  }
,
{ // state 147
-1, // $$start
-1, // start
580, // ws*
-1, // $$0
MIN_REDUCTION+224, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+224, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+224, // "k"
MIN_REDUCTION+224, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+224, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+224, // "h"
MIN_REDUCTION+224, // "y"
MIN_REDUCTION+224, // "m"
464, // "g"
MIN_REDUCTION+224, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+224, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+224, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+224, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+224, // $
MIN_REDUCTION+224, // $NT
  }
,
{ // state 148
91,795, // "s"
  }
,
{ // state 149
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 151
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+279, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 152
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+103, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+103, // $
MIN_REDUCTION+103, // $NT
  }
,
{ // state 153
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 154
0x80000000|915, // match move
0x80000000|143, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 155
176,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 156
2,90, // ws*
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 158
94,522, // "e"
  }
,
{ // state 159
176,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 160
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+157, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+157, // $
MIN_REDUCTION+157, // $NT
  }
,
{ // state 161
176,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 162
-1, // $$start
-1, // start
331, // ws*
-1, // $$0
MIN_REDUCTION+182, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+182, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+182, // "k"
MIN_REDUCTION+182, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+182, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+182, // "h"
MIN_REDUCTION+182, // "y"
MIN_REDUCTION+182, // "m"
464, // "g"
MIN_REDUCTION+182, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+182, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+182, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+182, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 163
0x80000000|855, // match move
0x80000000|766, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 164
0x80000000|828, // match move
0x80000000|303, // no-match move
0x80000000|228, // NT-test-match state for stringPrintable
  }
,
{ // state 165
-1, // $$start
-1, // start
961, // ws*
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
-1, // `=
-1, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
MIN_REDUCTION+286, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 166
105,1160, // "i"
  }
,
{ // state 167
101,1124, // "t"
  }
,
{ // state 168
97,818, // "n"
  }
,
{ // state 169
101,148, // "t"
  }
,
{ // state 170
88,312, // "c"
89,312, // "l"
90,312, // "a"
91,312, // "s"
94,312, // "e"
95,312, // "b"
96,312, // "o"
97,312, // "n"
98,312, // "r"
99,312, // "k"
100,312, // "x"
101,312, // "t"
102,312, // "d"
103,312, // "p"
104,312, // "u"
105,312, // "i"
106,312, // "v"
107,312, // "f"
108,312, // "w"
109,312, // "h"
110,312, // "y"
111,312, // "m"
112,312, // "g"
113,312, // "z"
114,933, // "!"
115,767, // "="
116,767, // "*"
117,767, // "%"
118,767, // "&"
119,767, // "("
120,767, // ")"
121,767, // "+"
122,767, // ","
123,767, // "-"
124,767, // "."
125,767, // "/"
126,767, // ";"
127,767, // "<"
128,767, // ">"
129,767, // "["
130,312, // "]"
131,312, // "{"
132,312, // "}"
133,312, // "|"
135,767, // "0"
139,312, // "_"
140,540, // stringPrintable
141,933, // " "
142,767, // {"1".."9"}
143,767, // {":" "?".."@"}
144,767, // {"#".."$"}
145,767, // {"A".."Z"}
146,767, // "'"
147,312, // {"j" "q"}
148,312, // {"^" "`" "~"}
  }
,
{ // state 171
109,433, // "h"
  }
,
{ // state 172
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 174
0x80000000|1, // match move
0x80000000|296, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 175
0x80000000|1, // match move
0x80000000|402, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 176
0x80000000|889, // match move
0x80000000|839, // no-match move
// T-test match for "-":
123,
  }
,
{ // state 177
-1, // $$start
-1, // start
398, // ws*
-1, // $$0
MIN_REDUCTION+146, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+146, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+146, // "k"
MIN_REDUCTION+146, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+146, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+146, // "h"
MIN_REDUCTION+146, // "y"
MIN_REDUCTION+146, // "m"
464, // "g"
MIN_REDUCTION+146, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+146, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+146, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+146, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
  }
,
{ // state 178
0x80000000|1, // match move
0x80000000|244, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 179
106,1088, // "v"
  }
,
{ // state 180
-1, // $$start
-1, // start
324, // ws*
-1, // $$0
MIN_REDUCTION+284, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 181
104,118, // "u"
  }
,
{ // state 182
2,778, // ws*
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 183
-1, // $$start
-1, // start
501, // ws*
-1, // $$0
MIN_REDUCTION+282, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
-1, // `=
-1, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
MIN_REDUCTION+282, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 184
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+267, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 185
-1, // $$start
-1, // start
664, // ws*
-1, // $$0
MIN_REDUCTION+101, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+101, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+101, // "k"
MIN_REDUCTION+101, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+101, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+101, // "h"
MIN_REDUCTION+101, // "y"
MIN_REDUCTION+101, // "m"
464, // "g"
MIN_REDUCTION+101, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+101, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+101, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+101, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+101, // $
MIN_REDUCTION+101, // $NT
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
{ // state 186
0x80000000|515, // match move
0x80000000|861, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 187
91,260, // "s"
  }
,
{ // state 188
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 189
2,315, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 190
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 191
176,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 192
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+283, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 193
176,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 194
0x80000000|1019, // match move
0x80000000|993, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 195
176,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 196
0x80000000|447, // match move
0x80000000|662, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 197
-1, // $$start
710, // start
699, // ws*
200, // $$0
665, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
1000, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 198
-1, // $$start
-1, // start
778, // ws*
-1, // $$0
MIN_REDUCTION+276, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+276, // $
-1, // $NT
  }
,
{ // state 199
-1, // $$start
-1, // start
1040, // ws*
-1, // $$0
MIN_REDUCTION+191, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+191, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+191, // "k"
MIN_REDUCTION+191, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+191, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+191, // "h"
MIN_REDUCTION+191, // "y"
MIN_REDUCTION+191, // "m"
464, // "g"
MIN_REDUCTION+191, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+191, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+191, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+191, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+191, // $
MIN_REDUCTION+191, // $NT
  }
,
{ // state 200
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 201
0x80000000|676, // match move
0x80000000|1034, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 202
89,1112, // "l"
90,210, // "a"
96,430, // "o"
109,361, // "h"
  }
,
{ // state 203
2,1196, // ws*
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 204
96,791, // "o"
  }
,
{ // state 205
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 206
158,134, // {10}
  }
,
{ // state 207
91,460, // "s"
  }
,
{ // state 208
88,569, // "c"
  }
,
{ // state 209
89,905, // "l"
90,1195, // "a"
96,463, // "o"
105,168, // "i"
  }
,
{ // state 210
91,506, // "s"
101,295, // "t"
  }
,
{ // state 211
98,497, // "r"
  }
,
{ // state 212
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+115, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+115, // $
MIN_REDUCTION+115, // $NT
  }
,
{ // state 213
0x80000000|488, // match move
0x80000000|518, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 214
101,531, // "t"
  }
,
{ // state 215
105,1162, // "i"
  }
,
{ // state 216
0x80000000|401, // match move
0x80000000|286, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 217
176,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 218
176,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 219
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+297, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 220
101,957, // "t"
  }
,
{ // state 221
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 222
176,MIN_REDUCTION+234, // $NT
  }
,
{ // state 223
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 224
0x80000000|44, // match move
0x80000000|986, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 225
176,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 226
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 227
0x80000000|942, // match move
0x80000000|41, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 228
88,980, // "c"
89,980, // "l"
90,980, // "a"
91,980, // "s"
94,980, // "e"
95,980, // "b"
96,980, // "o"
97,980, // "n"
98,980, // "r"
99,980, // "k"
100,980, // "x"
101,980, // "t"
102,980, // "d"
103,980, // "p"
104,980, // "u"
105,980, // "i"
106,980, // "v"
107,980, // "f"
108,980, // "w"
109,980, // "h"
110,980, // "y"
111,980, // "m"
112,980, // "g"
113,980, // "z"
114,1033, // "!"
115,93, // "="
116,93, // "*"
117,93, // "%"
118,93, // "&"
119,93, // "("
120,93, // ")"
121,93, // "+"
122,93, // ","
123,93, // "-"
124,93, // "."
125,93, // "/"
126,93, // ";"
127,93, // "<"
128,93, // ">"
129,93, // "["
130,980, // "]"
131,980, // "{"
132,980, // "}"
133,980, // "|"
135,93, // "0"
139,980, // "_"
141,1033, // " "
142,93, // {"1".."9"}
143,93, // {":" "?".."@"}
144,93, // {"#".."$"}
145,93, // {"A".."Z"}
146,93, // "'"
147,980, // {"j" "q"}
148,980, // {"^" "`" "~"}
  }
,
{ // state 229
0x80000000|792, // match move
0x80000000|140, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 230
102,534, // "d"
  }
,
{ // state 231
0x80000000|963, // match move
0x80000000|693, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 232
121,271, // "+"
  }
,
{ // state 233
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 234
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 236
105,1242, // "i"
  }
,
{ // state 237
101,1206, // "t"
  }
,
{ // state 238
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 239
97,572, // "n"
  }
,
{ // state 240
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 241
176,MIN_REDUCTION+317, // $NT
  }
,
{ // state 242
176,MIN_REDUCTION+180, // $NT
  }
,
{ // state 243
101,1090, // "t"
  }
,
{ // state 244
-1, // $$start
-1, // start
910, // ws*
-1, // $$0
MIN_REDUCTION+149, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+149, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+149, // "k"
MIN_REDUCTION+149, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+149, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+149, // "h"
MIN_REDUCTION+149, // "y"
MIN_REDUCTION+149, // "m"
464, // "g"
MIN_REDUCTION+149, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+149, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+149, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+149, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+149, // $
MIN_REDUCTION+149, // $NT
  }
,
{ // state 245
88,1094, // "c"
89,1094, // "l"
90,1094, // "a"
91,1094, // "s"
94,1094, // "e"
95,1094, // "b"
96,1094, // "o"
97,1094, // "n"
98,1094, // "r"
99,1094, // "k"
100,1094, // "x"
101,1094, // "t"
102,1094, // "d"
103,1094, // "p"
104,1094, // "u"
105,1094, // "i"
106,1094, // "v"
107,1094, // "f"
108,1094, // "w"
109,1094, // "h"
110,1094, // "y"
111,1094, // "m"
112,1094, // "g"
113,1094, // "z"
137,591, // letter
145,1094, // {"A".."Z"}
147,1094, // {"j" "q"}
  }
,
{ // state 246
-1, // $$start
-1, // start
63, // ws*
-1, // $$0
MIN_REDUCTION+290, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 247
89,57, // "l"
96,556, // "o"
  }
,
{ // state 248
0x80000000|611, // match move
0x80000000|49, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 249
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+109, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+109, // $
MIN_REDUCTION+109, // $NT
  }
,
{ // state 250
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 251
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 252
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+261, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+261, // $
-1, // $NT
  }
,
{ // state 253
0x80000000|691, // match move
0x80000000|722, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 254
0x80000000|745, // match move
0x80000000|310, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 255
176,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 256
0x80000000|465, // match move
0x80000000|758, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 257
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 258
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 259
0x80000000|292, // match move
0x80000000|107, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 260
0x80000000|1, // match move
0x80000000|185, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 261
176,MIN_REDUCTION+235, // $NT
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 262
0x80000000|1015, // match move
0x80000000|977, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 263
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 264
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+363, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+363, // $
-1, // $NT
  }
,
{ // state 265
0x80000000|1, // match move
0x80000000|109, // no-match move
0x80000000|769, // NT-test-match state for letter
  }
,
{ // state 266
176,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 267
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+281, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 268
0x80000000|1, // match move
0x80000000|415, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 269
0x80000000|543, // match move
0x80000000|94, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 270
0x80000000|411, // match move
0x80000000|438, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 271
0x80000000|776, // match move
0x80000000|452, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 272
0x80000000|1176, // match move
0x80000000|956, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 273
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 274
94,113, // "e"
96,253, // "o"
  }
,
{ // state 275
0x80000000|1, // match move
0x80000000|100, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 276
0x80000000|727, // match move
0x80000000|541, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 277
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 278
0x80000000|759, // match move
0x80000000|1247, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 279
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 280
176,MIN_REDUCTION+186, // $NT
  }
,
{ // state 281
97,561, // "n"
  }
,
{ // state 282
0x80000000|876, // match move
0x80000000|311, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 283
155,603, // eol
158,382, // {10}
159,500, // {13}
160,322, // {12}
167,887, // comment1Printable**
169,471, // comment1Printable*
  }
,
{ // state 284
-1, // $$start
-1, // start
201, // ws*
-1, // $$0
MIN_REDUCTION+107, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+107, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+107, // "k"
MIN_REDUCTION+107, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+107, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+107, // "h"
MIN_REDUCTION+107, // "y"
MIN_REDUCTION+107, // "m"
464, // "g"
MIN_REDUCTION+107, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+107, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+107, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+107, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+107, // $
MIN_REDUCTION+107, // $NT
  }
,
{ // state 285
105,616, // "i"
  }
,
{ // state 286
0x80000000|551, // match move
0x80000000|683, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 287
176,MIN_REDUCTION+162, // $NT
  }
,
{ // state 288
0x80000000|871, // match move
0x80000000|486, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 289
176,MIN_REDUCTION+114, // $NT
  }
,
{ // state 290
176,MIN_REDUCTION+319, // $NT
  }
,
{ // state 291
0x80000000|886, // match move
0x80000000|930, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 292
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 293
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+249, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+249, // $
-1, // $NT
  }
,
{ // state 294
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 295
88,456, // "c"
  }
,
{ // state 296
-1, // $$start
-1, // start
325, // ws*
-1, // $$0
MIN_REDUCTION+212, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+212, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+212, // "k"
MIN_REDUCTION+212, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+212, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+212, // "h"
MIN_REDUCTION+212, // "y"
MIN_REDUCTION+212, // "m"
464, // "g"
MIN_REDUCTION+212, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+212, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+212, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+212, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+212, // $
MIN_REDUCTION+212, // $NT
  }
,
{ // state 297
0x80000000|258, // match move
0x80000000|1151, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 298
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 299
90,872, // "a"
94,490, // "e"
104,885, // "u"
  }
,
{ // state 300
0x80000000|678, // match move
0x80000000|1099, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 301
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 303
150,581, // '"'
164,131, // stringPrintable**
165,1205, // $$2
173,1093, // stringPrintable*
  }
,
{ // state 304
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 305
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 306
0x80000000|255, // match move
0x80000000|784, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 307
88,146, // "c"
  }
,
{ // state 308
0x80000000|810, // match move
0x80000000|422, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 309
2,1042, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 310
0x80000000|127, // match move
0x80000000|625, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 311
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+199, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+199, // $
MIN_REDUCTION+199, // $NT
  }
,
{ // state 312
0x80000000|80, // match move
0x80000000|927, // no-match move
0x80000000|228, // NT-test-match state for stringPrintable
  }
,
{ // state 313
91,555, // "s"
  }
,
{ // state 314
0x80000000|1193, // match move
0x80000000|383, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 315
0x80000000|631, // match move
0x80000000|1220, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 316
0x80000000|305, // match move
0x80000000|1085, // no-match move
0x80000000|769, // NT-test-match state for letter
  }
,
{ // state 317
0x80000000|1, // match move
0x80000000|888, // no-match move
// T-test match for "/":
125,
  }
,
{ // state 318
-1, // $$start
-1, // start
276, // ws*
-1, // $$0
MIN_REDUCTION+179, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+179, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+179, // "k"
MIN_REDUCTION+179, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+179, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+179, // "h"
MIN_REDUCTION+179, // "y"
MIN_REDUCTION+179, // "m"
464, // "g"
MIN_REDUCTION+179, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+179, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+179, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+179, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
,
{ // state 319
88,173, // "c"
89,173, // "l"
90,173, // "a"
91,173, // "s"
94,173, // "e"
95,173, // "b"
96,173, // "o"
97,173, // "n"
98,173, // "r"
99,173, // "k"
100,173, // "x"
101,173, // "t"
102,173, // "d"
103,173, // "p"
104,173, // "u"
105,173, // "i"
106,173, // "v"
107,173, // "f"
108,173, // "w"
109,173, // "h"
110,173, // "y"
111,173, // "m"
112,173, // "g"
113,173, // "z"
114,573, // "!"
115,1064, // "="
116,1064, // "*"
117,573, // "%"
118,573, // "&"
119,1064, // "("
120,1064, // ")"
121,1064, // "+"
122,1064, // ","
123,1064, // "-"
124,1064, // "."
125,1064, // "/"
126,1064, // ";"
127,1064, // "<"
128,1064, // ">"
129,1064, // "["
130,173, // "]"
131,173, // "{"
132,173, // "}"
133,173, // "|"
135,1064, // "0"
139,173, // "_"
141,573, // " "
142,1064, // {"1".."9"}
143,1064, // {":" "?".."@"}
144,573, // {"#".."$"}
145,1064, // {"A".."Z"}
147,173, // {"j" "q"}
148,173, // {"^" "`" "~"}
149,32, // charPrintable
150,573, // '"'
  }
,
{ // state 320
2,1222, // ws*
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 321
88,133, // "c"
89,133, // "l"
90,133, // "a"
91,133, // "s"
92,798, // idChar
94,133, // "e"
95,133, // "b"
96,133, // "o"
97,133, // "n"
98,133, // "r"
99,133, // "k"
100,133, // "x"
101,133, // "t"
102,133, // "d"
103,133, // "p"
104,133, // "u"
105,133, // "i"
106,133, // "v"
107,133, // "f"
108,133, // "w"
109,133, // "h"
110,133, // "y"
111,133, // "m"
112,133, // "g"
113,133, // "z"
135,1137, // "0"
137,1053, // letter
138,291, // digit
139,622, // "_"
142,1137, // {"1".."9"}
145,133, // {"A".."Z"}
147,133, // {"j" "q"}
  }
,
{ // state 322
176,MIN_REDUCTION+326, // $NT
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 323
105,615, // "i"
  }
,
{ // state 324
0x80000000|874, // match move
0x80000000|738, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 325
0x80000000|1173, // match move
0x80000000|505, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 326
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 327
125,924, // "/"
  }
,
{ // state 328
0x80000000|261, // match move
0x80000000|926, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 329
0x80000000|643, // match move
0x80000000|1140, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 330
0x80000000|1175, // match move
0x80000000|1221, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 331
0x80000000|692, // match move
0x80000000|306, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 332
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 333
-1, // $$start
-1, // start
84, // ws*
-1, // $$0
MIN_REDUCTION+137, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+137, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+137, // "k"
MIN_REDUCTION+137, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+137, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+137, // "h"
MIN_REDUCTION+137, // "y"
MIN_REDUCTION+137, // "m"
464, // "g"
MIN_REDUCTION+137, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+137, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+137, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+137, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
  }
,
{ // state 334
0x80000000|762, // match move
0x80000000|931, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 335
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 336
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 337
2,961, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 338
2,742, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 339
176,MIN_REDUCTION+174, // $NT
  }
,
{ // state 340
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 342
97,29, // "n"
  }
,
{ // state 343
0x80000000|1, // match move
0x80000000|594, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 344
88,1252, // "c"
89,1252, // "l"
90,1252, // "a"
91,1252, // "s"
94,1252, // "e"
95,1252, // "b"
96,1252, // "o"
97,1252, // "n"
98,1252, // "r"
99,1252, // "k"
100,1252, // "x"
101,1252, // "t"
102,1252, // "d"
103,1252, // "p"
104,1252, // "u"
105,1252, // "i"
106,1252, // "v"
107,1252, // "f"
108,1252, // "w"
109,1252, // "h"
110,1252, // "y"
111,1252, // "m"
112,1252, // "g"
113,1252, // "z"
114,1252, // "!"
115,1252, // "="
116,1252, // "*"
117,1252, // "%"
118,1252, // "&"
119,1252, // "("
120,1252, // ")"
121,1252, // "+"
122,1252, // ","
123,1252, // "-"
124,1252, // "."
125,1252, // "/"
126,1252, // ";"
127,1252, // "<"
128,1252, // ">"
129,1252, // "["
130,1252, // "]"
131,1252, // "{"
132,1252, // "}"
133,1252, // "|"
135,1252, // "0"
139,1252, // "_"
141,1252, // " "
142,1252, // {"1".."9"}
143,1252, // {":" "?".."@"}
144,1252, // {"#".."$"}
145,1252, // {"A".."Z"}
146,1252, // "'"
147,1252, // {"j" "q"}
148,1252, // {"^" "`" "~"}
150,1252, // '"'
151,55, // comment1Printable
152,1252, // "\"
153,671, // {9}
155,117, // eol
158,382, // {10}
159,500, // {13}
160,322, // {12}
  }
,
{ // state 345
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 346
176,MIN_REDUCTION+198, // $NT
  }
,
{ // state 347
98,204, // "r"
105,313, // "i"
  }
,
{ // state 348
-1, // $$start
-1, // start
432, // ws*
-1, // $$0
MIN_REDUCTION+328, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+328, // $
-1, // $NT
  }
,
{ // state 349
0x80000000|1047, // match move
0x80000000|948, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 350
0x80000000|999, // match move
0x80000000|1035, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 351
101,737, // "t"
  }
,
{ // state 352
-1, // $$start
-1, // start
827, // ws*
-1, // $$0
MIN_REDUCTION+152, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+152, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+152, // "k"
MIN_REDUCTION+152, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+152, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+152, // "h"
MIN_REDUCTION+152, // "y"
MIN_REDUCTION+152, // "m"
464, // "g"
MIN_REDUCTION+152, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+152, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+152, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+152, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+152, // $
MIN_REDUCTION+152, // $NT
  }
,
{ // state 353
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 354
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 355
0x80000000|528, // match move
0x80000000|15, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 356
176,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 358
2,90, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 359
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 360
115,314, // "="
  }
,
{ // state 361
90,12, // "a"
  }
,
{ // state 362
94,1039, // "e"
  }
,
{ // state 363
0x80000000|811, // match move
0x80000000|238, // no-match move
0x80000000|769, // NT-test-match state for letter
  }
,
{ // state 364
-1, // $$start
-1, // start
1133, // ws*
-1, // $$0
MIN_REDUCTION+185, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
751, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+185, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+185, // "k"
MIN_REDUCTION+185, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+185, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+185, // "h"
MIN_REDUCTION+185, // "y"
MIN_REDUCTION+185, // "m"
464, // "g"
MIN_REDUCTION+185, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+185, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+185, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+185, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 365
0x80000000|14, // match move
0x80000000|349, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 366
176,MIN_REDUCTION+231, // $NT
  }
,
{ // state 367
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 368
0x80000000|1228, // match move
0x80000000|774, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 369
176,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 370
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+223, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+223, // $
MIN_REDUCTION+223, // $NT
  }
,
{ // state 371
0x80000000|26, // match move
0x80000000|334, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 372
-1, // $$start
-1, // start
746, // ws*
-1, // $$0
MIN_REDUCTION+298, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+298, // $
-1, // $NT
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 373
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 374
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+166, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+166, // $
MIN_REDUCTION+166, // $NT
  }
,
{ // state 375
0x80000000|793, // match move
0x80000000|1076, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 376
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+277, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 377
90,307, // "a"
98,950, // "r"
104,1001, // "u"
  }
,
{ // state 378
0x80000000|998, // match move
0x80000000|633, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 379
-1, // $$start
-1, // start
720, // ws*
-1, // $$0
MIN_REDUCTION+98, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+98, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+98, // "k"
MIN_REDUCTION+98, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+98, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+98, // "h"
MIN_REDUCTION+98, // "y"
MIN_REDUCTION+98, // "m"
464, // "g"
MIN_REDUCTION+98, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+98, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+98, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+98, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
,
{ // state 380
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+184, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+184, // $
MIN_REDUCTION+184, // $NT
  }
,
{ // state 381
90,126, // "a"
  }
,
{ // state 382
176,MIN_REDUCTION+323, // $NT
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 383
0x80000000|512, // match move
0x80000000|773, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 384
0x80000000|1, // match move
0x80000000|318, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 385
94,544, // "e"
  }
,
{ // state 386
101,99, // "t"
104,78, // "u"
108,1163, // "w"
109,990, // "h"
110,342, // "y"
  }
,
{ // state 387
2,315, // ws*
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 388
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 389
112,1072, // "g"
  }
,
{ // state 390
0x80000000|728, // match move
0x80000000|920, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 391
176,MIN_REDUCTION+123, // $NT
  }
,
{ // state 392
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 393
2,746, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 394
89,896, // "l"
105,10, // "i"
  }
,
{ // state 395
0x80000000|332, // match move
0x80000000|836, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 396
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+148, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+148, // $
MIN_REDUCTION+148, // $NT
  }
,
{ // state 397
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 398
0x80000000|190, // match move
0x80000000|789, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 399
0x80000000|245, // match move
0x80000000|91, // no-match move
0x80000000|769, // NT-test-match state for letter
  }
,
{ // state 400
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+151, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+151, // $
MIN_REDUCTION+151, // $NT
  }
,
{ // state 401
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 402
-1, // $$start
-1, // start
77, // ws*
-1, // $$0
MIN_REDUCTION+209, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+209, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+209, // "k"
MIN_REDUCTION+209, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+209, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+209, // "h"
MIN_REDUCTION+209, // "y"
MIN_REDUCTION+209, // "m"
464, // "g"
MIN_REDUCTION+209, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+209, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+209, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+209, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+209, // $
MIN_REDUCTION+209, // $NT
  }
,
{ // state 403
90,716, // "a"
  }
,
{ // state 404
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 405
0x80000000|1, // match move
0x80000000|588, // no-match move
0x80000000|769, // NT-test-match state for letter
  }
,
{ // state 406
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 407
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 408
99,428, // "k"
  }
,
{ // state 409
0x80000000|475, // match move
0x80000000|1003, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 410
0x80000000|1150, // match move
0x80000000|648, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 411
176,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 412
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 413
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 414
105,124, // "i"
  }
,
{ // state 415
-1, // $$start
-1, // start
593, // ws*
-1, // $$0
MIN_REDUCTION+170, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+170, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+170, // "k"
MIN_REDUCTION+170, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+170, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+170, // "h"
MIN_REDUCTION+170, // "y"
MIN_REDUCTION+170, // "m"
464, // "g"
MIN_REDUCTION+170, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+170, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+170, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+170, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+170, // $
MIN_REDUCTION+170, // $NT
  }
,
{ // state 416
2,843, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 417
0x80000000|579, // match move
0x80000000|493, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 418
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 419
97,169, // "n"
  }
,
{ // state 420
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 421
90,239, // "a"
104,1145, // "u"
110,715, // "y"
  }
,
{ // state 422
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+251, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 423
89,941, // "l"
97,723, // "n"
100,351, // "x"
  }
,
{ // state 424
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 425
0x80000000|360, // match move
0x80000000|619, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 426
176,MIN_REDUCTION+147, // $NT
  }
,
{ // state 427
96,1086, // "o"
98,158, // "r"
110,214, // "y"
  }
,
{ // state 428
0x80000000|1, // match move
0x80000000|379, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 429
101,1134, // "t"
  }
,
{ // state 430
97,936, // "n"
  }
,
{ // state 431
101,786, // "t"
  }
,
{ // state 432
0x80000000|965, // match move
0x80000000|563, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 433
0x80000000|1, // match move
0x80000000|333, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 434
176,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 435
176,MIN_REDUCTION+132, // $NT
  }
,
{ // state 436
176,MIN_REDUCTION+318, // $NT
  }
,
{ // state 437
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 438
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+226, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+226, // $
MIN_REDUCTION+226, // $NT
  }
,
{ // state 439
94,629, // "e"
  }
,
{ // state 440
0x80000000|1236, // match move
0x80000000|446, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 441
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 442
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 443
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 444
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
294, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
1118, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
-1, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
-1, // {9}
-1, // comment2Printable
-1, // eol
-1, // ws
-1, // comment
-1, // {10}
-1, // {13}
-1, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+361, // $
-1, // $NT
  }
,
{ // state 445
0x80000000|907, // match move
0x80000000|455, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 446
0x80000000|144, // match move
0x80000000|1026, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 447
1,710, // start
2,699, // ws*
3,200, // $$0
4,665, // token
5,388, // `boolean
6,480, // `class
7,922, // `extends
8,357, // `void
9,864, // `int
10,251, // `while
11,666, // `if
12,412, // `else
13,71, // `for
14,597, // `break
15,785, // `this
16,882, // `false
17,1007, // `true
18,903, // `super
19,947, // `null
20,966, // `return
21,25, // `instanceof
22,1014, // `new
23,20, // `abstract
24,642, // `assert
25,641, // `byte
26,529, // `case
27,552, // `catch
28,6, // `char
29,849, // `const
30,470, // `continue
31,481, // `default
32,687, // `do
33,820, // `double
34,1232, // `enum
35,932, // `final
36,205, // `finally
37,884, // `float
38,796, // `goto
39,1055, // `implements
40,1061, // `import
41,62, // `interface
42,235, // `long
43,150, // `native
44,695, // `package
45,749, // `private
46,1229, // `protected
47,45, // `public
48,1178, // `short
49,392, // `static
50,279, // `strictfp
51,335, // `switch
52,598, // `synchronized
53,608, // `throw
54,1024, // `throws
55,81, // `transient
56,582, // `try
57,806, // `volatile
168,1000, // token*
  }
,
{ // state 448
0x80000000|406, // match move
0x80000000|282, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 449
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+327, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+327, // $
-1, // $NT
  }
,
{ // state 450
0x80000000|1, // match move
0x80000000|352, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 451
90,1204, // "a"
98,755, // "r"
109,347, // "h"
  }
,
{ // state 452
0x80000000|507, // match move
0x80000000|1004, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 453
2,740, // ws*
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 454
0x80000000|851, // match move
0x80000000|267, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 455
-1, // $$start
-1, // start
660, // ws*
-1, // $$0
MIN_REDUCTION+268, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
-1, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
-1, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
MIN_REDUCTION+268, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 456
109,509, // "h"
  }
,
{ // state 457
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 458
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+100, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+100, // $
MIN_REDUCTION+100, // $NT
  }
,
{ // state 459
0x80000000|1, // match move
0x80000000|538, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 460
94,672, // "e"
  }
,
{ // state 461
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 462
116,67, // "*"
155,117, // eol
  }
,
{ // state 463
98,1188, // "r"
  }
,
{ // state 464
96,807, // "o"
  }
,
{ // state 465
2,892, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 466
90,220, // "a"
  }
,
{ // state 467
0x80000000|416, // match move
0x80000000|1227, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 468
2,324, // ws*
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 469
101,181, // "t"
  }
,
{ // state 470
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 471
0x80000000|621, // match move
0x80000000|713, // no-match move
0x80000000|1249, // NT-test-match state for comment1Printable
  }
,
{ // state 472
176,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 473
176,MIN_REDUCTION+213, // $NT
  }
,
{ // state 474
0x80000000|1, // match move
0x80000000|704, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 475
91,60, // "s"
  }
,
{ // state 476
0x80000000|434, // match move
0x80000000|458, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 477
-1, // $$start
-1, // start
659, // ws*
-1, // $$0
MIN_REDUCTION+140, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+140, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+140, // "k"
MIN_REDUCTION+140, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+140, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+140, // "h"
MIN_REDUCTION+140, // "y"
MIN_REDUCTION+140, // "m"
464, // "g"
MIN_REDUCTION+140, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+140, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+140, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+140, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+140, // $
MIN_REDUCTION+140, // $NT
  }
,
{ // state 478
0x80000000|837, // match move
0x80000000|104, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 479
0x80000000|1, // match move
0x80000000|559, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 480
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 481
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 482
101,166, // "t"
  }
,
{ // state 483
2,485, // ws*
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 484
102,1114, // "d"
  }
,
{ // state 485
0x80000000|354, // match move
0x80000000|88, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 486
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 487
109,822, // "h"
  }
,
{ // state 488
115,797, // "="
  }
,
{ // state 489
125,829, // "/"
  }
,
{ // state 490
108,1231, // "w"
  }
,
{ // state 491
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 492
176,MIN_REDUCTION+240, // $NT
  }
,
{ // state 493
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+127, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+127, // $
MIN_REDUCTION+127, // $NT
  }
,
{ // state 494
90,167, // "a"
  }
,
{ // state 495
0x80000000|110, // match move
0x80000000|443, // no-match move
0x80000000|43, // NT-test-match state for digit
  }
,
{ // state 496
88,171, // "c"
  }
,
{ // state 497
90,777, // "a"
  }
,
{ // state 498
0x80000000|155, // match move
0x80000000|1041, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 499
176,MIN_REDUCTION+99, // $NT
  }
,
{ // state 500
0x80000000|1155, // match move
0x80000000|895, // no-match move
// T-test match for 10:
158,
  }
,
{ // state 501
0x80000000|1189, // match move
0x80000000|454, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 502
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 503
176,MIN_REDUCTION+246, // $NT
  }
,
{ // state 504
176,MIN_REDUCTION+216, // $NT
  }
,
{ // state 505
0x80000000|217, // match move
0x80000000|730, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 506
94,275, // "e"
  }
,
{ // state 507
2,899, // ws*
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 508
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 509
0x80000000|1, // match move
0x80000000|590, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 510
0x80000000|23, // match move
0x80000000|595, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 511
101,640, // "t"
  }
,
{ // state 512
2,878, // ws*
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 513
0x80000000|1013, // match move
0x80000000|498, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 514
0x80000000|277, // match move
0x80000000|1070, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 515
2,2, // ws*
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 516
0x80000000|1165, // match move
0x80000000|350, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 517
-1, // $$start
-1, // start
297, // ws*
-1, // $$0
MIN_REDUCTION+113, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+113, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+113, // "k"
MIN_REDUCTION+113, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+113, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+113, // "h"
MIN_REDUCTION+113, // "y"
MIN_REDUCTION+113, // "m"
464, // "g"
MIN_REDUCTION+113, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+113, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+113, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+113, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+113, // $
MIN_REDUCTION+113, // $NT
  }
,
{ // state 518
0x80000000|309, // match move
0x80000000|30, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 519
0x80000000|570, // match move
0x80000000|1058, // no-match move
0x80000000|1249, // NT-test-match state for comment1Printable
  }
,
{ // state 520
2,154, // ws*
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 521
-1, // $$start
-1, // start
599, // ws*
-1, // $$0
MIN_REDUCTION+89, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+89, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+89, // "k"
MIN_REDUCTION+89, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+89, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+89, // "h"
MIN_REDUCTION+89, // "y"
MIN_REDUCTION+89, // "m"
464, // "g"
MIN_REDUCTION+89, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+89, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+89, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+89, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+89, // $
MIN_REDUCTION+89, // $NT
  }
,
{ // state 522
90,408, // "a"
  }
,
{ // state 523
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+88, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+88, // $
MIN_REDUCTION+88, // $NT
  }
,
{ // state 524
89,954, // "l"
  }
,
{ // state 525
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 526
-1, // $$start
-1, // start
1196, // ws*
-1, // $$0
MIN_REDUCTION+278, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
-1, // `=
-1, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
MIN_REDUCTION+278, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 527
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 528
94,825, // "e"
  }
,
{ // state 529
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 530
105,179, // "i"
  }
,
{ // state 531
94,40, // "e"
  }
,
{ // state 532
0x80000000|410, // match move
0x80000000|756, // no-match move
// T-test match for "*":
116,
  }
,
{ // state 533
97,215, // "n"
  }
,
{ // state 534
0x80000000|1, // match move
0x80000000|623, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 535
98,421, // "r"
109,347, // "h"
  }
,
{ // state 536
91,690, // "s"
  }
,
{ // state 537
0x80000000|1100, // match move
0x80000000|22, // no-match move
0x80000000|228, // NT-test-match state for stringPrintable
  }
,
{ // state 538
-1, // $$start
-1, // start
856, // ws*
-1, // $$0
MIN_REDUCTION+131, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+131, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+131, // "k"
MIN_REDUCTION+131, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+131, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+131, // "h"
MIN_REDUCTION+131, // "y"
MIN_REDUCTION+131, // "m"
464, // "g"
MIN_REDUCTION+131, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+131, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+131, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+131, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+131, // $
MIN_REDUCTION+131, // $NT
  }
,
{ // state 539
2,278, // ws*
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 540
0x80000000|1250, // match move
0x80000000|883, // no-match move
0x80000000|228, // NT-test-match state for stringPrintable
  }
,
{ // state 541
0x80000000|589, // match move
0x80000000|560, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 542
2,778, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 543
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 544
0x80000000|1, // match move
0x80000000|8, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 545
95,919, // "b"
  }
,
{ // state 546
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 547
176,MIN_REDUCTION+150, // $NT
  }
,
{ // state 548
0x80000000|223, // match move
0x80000000|478, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 549
0x80000000|1149, // match move
0x80000000|970, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 550
2,845, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 551
176,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 552
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 553
0x80000000|457, // match move
0x80000000|111, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 554
176,MIN_REDUCTION+304, // $NT
  }
,
{ // state 555
0x80000000|1, // match move
0x80000000|477, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 556
98,243, // "r"
  }
,
{ // state 557
0x80000000|736, // match move
0x80000000|142, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 558
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+214, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+214, // $
MIN_REDUCTION+214, // $NT
  }
,
{ // state 559
-1, // $$start
-1, // start
880, // ws*
-1, // $$0
MIN_REDUCTION+119, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+119, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+119, // "k"
MIN_REDUCTION+119, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+119, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+119, // "h"
MIN_REDUCTION+119, // "y"
MIN_REDUCTION+119, // "m"
464, // "g"
MIN_REDUCTION+119, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+119, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+119, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+119, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
,
{ // state 560
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+178, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+178, // $
MIN_REDUCTION+178, // $NT
  }
,
{ // state 561
101,343, // "t"
  }
,
{ // state 562
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 563
0x80000000|336, // match move
0x80000000|449, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 564
0x80000000|638, // match move
0x80000000|212, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 565
176,MIN_REDUCTION+165, // $NT
  }
,
{ // state 566
0x80000000|578, // match move
0x80000000|1020, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 567
176,MIN_REDUCTION+313, // $NT
  }
,
{ // state 568
0x80000000|437, // match move
0x80000000|1183, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 569
94,873, // "e"
  }
,
{ // state 570
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 571
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 572
91,794, // "s"
  }
,
{ // state 573
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 574
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 575
0x80000000|988, // match move
0x80000000|424, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 576
0x80000000|120, // match move
0x80000000|300, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 577
0x80000000|675, // match move
0x80000000|725, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 578
88,133, // "c"
89,133, // "l"
90,133, // "a"
91,133, // "s"
92,1091, // idChar
94,133, // "e"
95,133, // "b"
96,133, // "o"
97,133, // "n"
98,133, // "r"
99,133, // "k"
100,133, // "x"
101,133, // "t"
102,133, // "d"
103,133, // "p"
104,133, // "u"
105,133, // "i"
106,133, // "v"
107,133, // "f"
108,133, // "w"
109,133, // "h"
110,133, // "y"
111,133, // "m"
112,133, // "g"
113,133, // "z"
135,1137, // "0"
137,1053, // letter
138,291, // digit
139,622, // "_"
142,1137, // {"1".."9"}
145,133, // {"A".."Z"}
147,133, // {"j" "q"}
162,890, // idChar**
172,718, // idChar*
  }
,
{ // state 579
176,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 580
0x80000000|132, // match move
0x80000000|897, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 581
0x80000000|358, // match move
0x80000000|7, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 582
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 583
176,MIN_REDUCTION+159, // $NT
  }
,
{ // state 584
176,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 585
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 586
-1, // $$start
-1, // start
1202, // ws*
-1, // $$0
MIN_REDUCTION+116, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+116, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+116, // "k"
MIN_REDUCTION+116, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+116, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+116, // "h"
MIN_REDUCTION+116, // "y"
MIN_REDUCTION+116, // "m"
464, // "g"
MIN_REDUCTION+116, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+116, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+116, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+116, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 587
2,1222, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 588
139,MIN_REDUCTION+352, // "_"
162,MIN_REDUCTION+352, // idChar**
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 589
176,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 590
-1, // $$start
-1, // start
1226, // ws*
-1, // $$0
MIN_REDUCTION+161, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+161, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+161, // "k"
MIN_REDUCTION+161, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+161, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+161, // "h"
MIN_REDUCTION+161, // "y"
MIN_REDUCTION+161, // "m"
464, // "g"
MIN_REDUCTION+161, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+161, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+161, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+161, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+161, // $
MIN_REDUCTION+161, // $NT
  }
,
{ // state 591
0x80000000|363, // match move
0x80000000|405, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 592
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 593
0x80000000|780, // match move
0x80000000|129, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 594
-1, // $$start
-1, // start
548, // ws*
-1, // $$0
MIN_REDUCTION+239, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+239, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+239, // "k"
MIN_REDUCTION+239, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+239, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+239, // "h"
MIN_REDUCTION+239, // "y"
MIN_REDUCTION+239, // "m"
464, // "g"
MIN_REDUCTION+239, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+239, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+239, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+239, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+239, // $
MIN_REDUCTION+239, // $NT
  }
,
{ // state 595
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+259, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 596
0x80000000|604, // match move
0x80000000|123, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 597
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 599
0x80000000|1050, // match move
0x80000000|614, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 600
176,MIN_REDUCTION+102, // $NT
  }
,
{ // state 601
91,602, // "s"
  }
,
{ // state 602
0x80000000|1, // match move
0x80000000|521, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 603
176,MIN_REDUCTION+338, // $NT
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 604
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 605
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 606
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+142, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+142, // $
MIN_REDUCTION+142, // $NT
  }
,
{ // state 607
0x80000000|138, // match move
0x80000000|916, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 608
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 609
176,MIN_REDUCTION+126, // $NT
  }
,
{ // state 610
2,892, // ws*
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 611
176,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 612
88,MIN_REDUCTION+346, // "c"
89,MIN_REDUCTION+346, // "l"
90,MIN_REDUCTION+346, // "a"
91,MIN_REDUCTION+346, // "s"
94,MIN_REDUCTION+346, // "e"
95,MIN_REDUCTION+346, // "b"
96,MIN_REDUCTION+346, // "o"
97,MIN_REDUCTION+346, // "n"
98,MIN_REDUCTION+346, // "r"
99,MIN_REDUCTION+346, // "k"
100,MIN_REDUCTION+346, // "x"
101,MIN_REDUCTION+346, // "t"
102,MIN_REDUCTION+346, // "d"
103,MIN_REDUCTION+346, // "p"
104,MIN_REDUCTION+346, // "u"
105,MIN_REDUCTION+346, // "i"
106,MIN_REDUCTION+346, // "v"
107,MIN_REDUCTION+346, // "f"
108,MIN_REDUCTION+346, // "w"
109,MIN_REDUCTION+346, // "h"
110,MIN_REDUCTION+346, // "y"
111,MIN_REDUCTION+346, // "m"
112,MIN_REDUCTION+346, // "g"
113,MIN_REDUCTION+346, // "z"
135,MIN_REDUCTION+346, // "0"
139,MIN_REDUCTION+346, // "_"
142,MIN_REDUCTION+346, // {"1".."9"}
145,MIN_REDUCTION+346, // {"A".."Z"}
147,MIN_REDUCTION+346, // {"j" "q"}
162,MIN_REDUCTION+346, // idChar**
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 613
176,MIN_REDUCTION+93, // $NT
  }
,
{ // state 614
0x80000000|584, // match move
0x80000000|523, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 615
88,237, // "c"
  }
,
{ // state 616
88,1098, // "c"
  }
,
{ // state 617
-1, // $$start
-1, // start
1253, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+236, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+236, // "k"
MIN_REDUCTION+236, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+236, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+236, // "h"
MIN_REDUCTION+236, // "y"
MIN_REDUCTION+236, // "m"
464, // "g"
MIN_REDUCTION+236, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+236, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+236, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+236, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 618
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 619
0x80000000|337, // match move
0x80000000|24, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 620
94,268, // "e"
  }
,
{ // state 621
88,763, // "c"
89,763, // "l"
90,763, // "a"
91,763, // "s"
94,763, // "e"
95,763, // "b"
96,763, // "o"
97,763, // "n"
98,763, // "r"
99,763, // "k"
100,763, // "x"
101,763, // "t"
102,763, // "d"
103,763, // "p"
104,763, // "u"
105,763, // "i"
106,763, // "v"
107,763, // "f"
108,763, // "w"
109,763, // "h"
110,763, // "y"
111,763, // "m"
112,763, // "g"
113,763, // "z"
114,763, // "!"
115,763, // "="
116,763, // "*"
117,763, // "%"
118,763, // "&"
119,763, // "("
120,763, // ")"
121,763, // "+"
122,763, // ","
123,763, // "-"
124,763, // "."
125,763, // "/"
126,763, // ";"
127,763, // "<"
128,763, // ">"
129,763, // "["
130,763, // "]"
131,763, // "{"
132,763, // "}"
133,763, // "|"
135,763, // "0"
139,763, // "_"
141,763, // " "
142,763, // {"1".."9"}
143,763, // {":" "?".."@"}
144,763, // {"#".."$"}
145,763, // {"A".."Z"}
146,763, // "'"
147,763, // {"j" "q"}
148,763, // {"^" "`" "~"}
150,763, // '"'
151,854, // comment1Printable
152,763, // "\"
153,733, // {9}
  }
,
{ // state 622
0x80000000|136, // match move
0x80000000|304, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 623
-1, // $$start
-1, // start
18, // ws*
-1, // $$0
MIN_REDUCTION+218, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+218, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+218, // "k"
MIN_REDUCTION+218, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+218, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+218, // "h"
MIN_REDUCTION+218, // "y"
MIN_REDUCTION+218, // "m"
464, // "g"
MIN_REDUCTION+218, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+218, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+218, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+218, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+218, // $
MIN_REDUCTION+218, // $NT
  }
,
{ // state 624
0x80000000|1218, // match move
0x80000000|1087, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 625
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+193, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+193, // $
MIN_REDUCTION+193, // $NT
  }
,
{ // state 626
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 627
176,MIN_REDUCTION+305, // $NT
  }
,
{ // state 628
0x80000000|527, // match move
0x80000000|5, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 629
88,952, // "c"
  }
,
{ // state 630
176,MIN_REDUCTION+201, // $NT
  }
,
{ // state 631
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 632
133,53, // "|"
  }
,
{ // state 633
-1, // $$start
-1, // start
649, // ws*
-1, // $$0
MIN_REDUCTION+272, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 634
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 635
0x80000000|58, // match move
0x80000000|707, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 636
-1, // $$start
-1, // start
923, // ws*
-1, // $$0
MIN_REDUCTION+134, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+134, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+134, // "k"
MIN_REDUCTION+134, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+134, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+134, // "h"
MIN_REDUCTION+134, // "y"
MIN_REDUCTION+134, // "m"
464, // "g"
MIN_REDUCTION+134, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+134, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+134, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+134, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+134, // $
MIN_REDUCTION+134, // $NT
  }
,
{ // state 637
0x80000000|1, // match move
0x80000000|708, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 638
176,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 639
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 640
0x80000000|1, // match move
0x80000000|712, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 641
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 642
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 643
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 644
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+130, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+130, // $
MIN_REDUCTION+130, // $NT
  }
,
{ // state 645
-1, // $$start
-1, // start
742, // ws*
-1, // $$0
MIN_REDUCTION+252, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+252, // $
-1, // $NT
  }
,
{ // state 646
0x80000000|729, // match move
0x80000000|869, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 647
0x80000000|1214, // match move
0x80000000|1169, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 648
116,327, // "*"
166,937, // comment2Printable**
171,982, // comment2Printable*
  }
,
{ // state 649
0x80000000|1131, // match move
0x80000000|790, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 650
176,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 651
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 652
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+265, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 653
0x80000000|356, // match move
0x80000000|380, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 654
2,843, // ws*
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 655
176,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 656
176,MIN_REDUCTION+96, // $NT
  }
,
{ // state 657
2,845, // ws*
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 658
176,MIN_REDUCTION+347, // $NT
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 659
0x80000000|345, // match move
0x80000000|635, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 660
0x80000000|340, // match move
0x80000000|689, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 661
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 662
1,710, // start
2,699, // ws*
3,200, // $$0
4,665, // token
58,1239, // `!
59,739, // `!=
60,877, // `%
61,752, // `&&
62,72, // `*
63,585, // `(
64,684, // `)
65,618, // `{
66,1211, // `}
67,52, // `-
68,972, // `+
69,407, // `=
70,141, // `==
71,875, // `[
72,764, // `]
73,754, // `||
74,800, // `<
75,1159, // `<=
76,1141, // `,
77,946, // `>
78,1201, // `>=
79,397, // `.
80,862, // `;
81,1128, // `++
82,639, // `--
83,857, // `/
84,42, // ID
85,801, // INTLIT
86,240, // STRINGLIT
87,721, // CHARLIT
134,962, // intLit2
135,221, // "0"
137,918, // letter
155,369, // eol
156,734, // ws
157,939, // comment
161,566, // letter++
168,1000, // token*
174,841, // letter+
  }
,
{ // state 663
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 664
0x80000000|298, // match move
0x80000000|476, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 665
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 666
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 667
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 668
0x80000000|1, // match move
0x80000000|900, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 669
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+145, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+145, // $
MIN_REDUCTION+145, // $NT
  }
,
{ // state 670
176,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 671
176,MIN_REDUCTION+316, // $NT
  }
,
{ // state 672
0x80000000|1, // match move
0x80000000|586, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 673
91,1161, // "s"
  }
,
{ // state 674
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 675
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 676
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 677
105,842, // "i"
109,822, // "h"
  }
,
{ // state 678
176,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 679
176,MIN_REDUCTION+225, // $NT
  }
,
{ // state 680
0x80000000|520, // match move
0x80000000|1135, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 681
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 682
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+196, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+196, // $
MIN_REDUCTION+196, // $NT
  }
,
{ // state 683
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+94, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+94, // $
MIN_REDUCTION+94, // $NT
  }
,
{ // state 684
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 685
0x80000000|31, // match move
0x80000000|975, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 686
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 687
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 688
0x80000000|846, // match move
0x80000000|1108, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 689
0x80000000|686, // match move
0x80000000|184, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 690
94,979, // "e"
  }
,
{ // state 691
104,545, // "u"
  }
,
{ // state 692
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 693
0x80000000|1009, // match move
0x80000000|246, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 694
0x80000000|65, // match move
0x80000000|831, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 695
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 696
0x80000000|1, // match move
0x80000000|1216, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 697
94,983, // "e"
  }
,
{ // state 698
0x80000000|203, // match move
0x80000000|526, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 699
0x80000000|1027, // match move
0x80000000|272, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 700
89,414, // "l"
  }
,
{ // state 701
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 702
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+255, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 703
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 704
-1, // $$start
-1, // start
513, // ws*
-1, // $$0
MIN_REDUCTION+164, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+164, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+164, // "k"
MIN_REDUCTION+164, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+164, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+164, // "h"
MIN_REDUCTION+164, // "y"
MIN_REDUCTION+164, // "m"
464, // "g"
MIN_REDUCTION+164, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+164, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+164, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+164, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+164, // $
MIN_REDUCTION+164, // $NT
  }
,
{ // state 705
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 706
89,362, // "l"
  }
,
{ // state 707
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+139, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+139, // $
MIN_REDUCTION+139, // $NT
  }
,
{ // state 708
-1, // $$start
-1, // start
960, // ws*
-1, // $$0
MIN_REDUCTION+227, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+227, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+227, // "k"
MIN_REDUCTION+227, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+227, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+227, // "h"
MIN_REDUCTION+227, // "y"
MIN_REDUCTION+227, // "m"
464, // "g"
MIN_REDUCTION+227, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+227, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+227, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+227, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+227, // $
MIN_REDUCTION+227, // $NT
  }
,
{ // state 709
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 710
175,MIN_REDUCTION+0, // $
  }
,
{ // state 711
0x80000000|1146, // match move
0x80000000|652, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 712
-1, // $$start
-1, // start
596, // ws*
-1, // $$0
MIN_REDUCTION+167, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+167, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+167, // "k"
MIN_REDUCTION+167, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+167, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+167, // "h"
MIN_REDUCTION+167, // "y"
MIN_REDUCTION+167, // "m"
464, // "g"
MIN_REDUCTION+167, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+167, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+167, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+167, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+167, // $
MIN_REDUCTION+167, // $NT
  }
,
{ // state 713
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 714
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 715
0x80000000|1, // match move
0x80000000|928, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 716
104,852, // "u"
  }
,
{ // state 717
176,MIN_REDUCTION+117, // $NT
  }
,
{ // state 718
0x80000000|321, // match move
0x80000000|68, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 719
94,419, // "e"
  }
,
{ // state 720
0x80000000|502, // match move
0x80000000|1148, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 721
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 722
-1, // $$start
-1, // start
390, // ws*
-1, // $$0
MIN_REDUCTION+176, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+176, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+176, // "k"
MIN_REDUCTION+176, // "x"
535, // "t"
274, // "d"
377, // "p"
545, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+176, // "h"
MIN_REDUCTION+176, // "y"
MIN_REDUCTION+176, // "m"
464, // "g"
MIN_REDUCTION+176, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+176, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+176, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+176, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 723
104,847, // "u"
  }
,
{ // state 724
101,99, // "t"
104,78, // "u"
108,1163, // "w"
109,990, // "h"
110,342, // "y"
  }
,
{ // state 725
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 726
0x80000000|840, // match move
0x80000000|592, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 727
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 728
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 729
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 730
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+211, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+211, // $
MIN_REDUCTION+211, // $NT
  }
,
{ // state 731
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 732
94,381, // "e"
  }
,
{ // state 733
0x80000000|634, // match move
0x80000000|902, // no-match move
0x80000000|1249, // NT-test-match state for comment1Printable
  }
,
{ // state 734
176,MIN_REDUCTION+348, // $NT
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 735
125,16, // "/"
  }
,
{ // state 736
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 737
94,1069, // "e"
  }
,
{ // state 738
0x80000000|1079, // match move
0x80000000|192, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 739
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 740
0x80000000|1244, // match move
0x80000000|711, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 741
0x80000000|808, // match move
0x80000000|782, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 742
0x80000000|674, // match move
0x80000000|308, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 743
112,832, // "g"
  }
,
{ // state 744
-1, // $$start
-1, // start
269, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+188, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+188, // "k"
MIN_REDUCTION+188, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+188, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+188, // "h"
MIN_REDUCTION+188, // "y"
MIN_REDUCTION+188, // "m"
464, // "g"
MIN_REDUCTION+188, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+188, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+188, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+188, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+188, // $
MIN_REDUCTION+188, // $NT
  }
,
{ // state 745
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 746
0x80000000|651, // match move
0x80000000|1191, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 747
176,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 748
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+202, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+202, // $
MIN_REDUCTION+202, // $NT
  }
,
{ // state 749
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 750
5,656, // `boolean
6,964, // `class
7,600, // `extends
8,28, // `void
9,391, // `int
10,426, // `while
11,1132, // `if
12,613, // `else
13,1031, // `for
14,499, // `break
15,1084, // `this
16,717, // `false
17,901, // `true
18,1139, // `super
19,938, // `null
20,435, // `return
21,289, // `instanceof
22,609, // `new
23,547, // `abstract
24,1152, // `assert
25,1063, // `byte
26,583, // `case
27,287, // `catch
28,565, // `char
29,865, // `const
30,925, // `continue
31,339, // `default
32,1075, // `do
33,242, // `double
34,969, // `enum
35,280, // `final
36,850, // `finally
37,815, // `float
38,1073, // `goto
39,346, // `implements
40,630, // `import
41,105, // `interface
42,86, // `long
43,973, // `native
44,473, // `package
45,504, // `private
46,1138, // `protected
47,917, // `public
48,112, // `short
49,679, // `static
50,82, // `strictfp
51,33, // `switch
52,366, // `synchronized
53,222, // `throw
54,1143, // `throws
55,492, // `transient
56,1126, // `try
57,503, // `volatile
88,202, // "c"
89,1046, // "l"
90,1010, // "a"
91,386, // "s"
94,423, // "e"
95,427, // "b"
97,299, // "n"
98,817, // "r"
101,535, // "t"
102,274, // "d"
103,377, // "p"
105,27, // "i"
106,940, // "v"
107,209, // "f"
108,487, // "w"
112,464, // "g"
  }
};
}
private class Initter5{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 751
96,102, // "o"
110,830, // "y"
  }
,
{ // state 752
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 753
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 754
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 755
90,239, // "a"
104,1145, // "u"
105,615, // "i"
110,715, // "y"
  }
,
{ // state 756
88,1077, // "c"
89,1077, // "l"
90,1077, // "a"
91,1077, // "s"
94,1077, // "e"
95,1077, // "b"
96,1077, // "o"
97,1077, // "n"
98,1077, // "r"
99,1077, // "k"
100,1077, // "x"
101,1077, // "t"
102,1077, // "d"
103,1077, // "p"
104,1077, // "u"
105,1077, // "i"
106,1077, // "v"
107,1077, // "f"
108,1077, // "w"
109,1077, // "h"
110,1077, // "y"
111,1077, // "m"
112,1077, // "g"
113,1077, // "z"
114,1077, // "!"
115,1077, // "="
116,1077, // "*"
117,1077, // "%"
118,1077, // "&"
119,1077, // "("
120,1077, // ")"
121,1077, // "+"
122,1077, // ","
123,1077, // "-"
124,1077, // "."
125,1077, // "/"
126,1077, // ";"
127,1077, // "<"
128,1077, // ">"
129,1077, // "["
130,1077, // "]"
131,1077, // "{"
132,1077, // "}"
133,1077, // "|"
135,1077, // "0"
139,1077, // "_"
141,1077, // " "
142,1077, // {"1".."9"}
143,1077, // {":" "?".."@"}
144,1077, // {"#".."$"}
145,1077, // {"A".."Z"}
146,1077, // "'"
147,1077, // {"j" "q"}
148,1077, // {"^" "`" "~"}
150,1077, // '"'
151,568, // comment1Printable
152,1077, // "\"
153,909, // {9}
154,741, // comment2Printable
155,761, // eol
158,1120, // {10}
159,50, // {13}
160,577, // {12}
166,937, // comment2Printable**
171,982, // comment2Printable*
  }
,
{ // state 757
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+154, // $
MIN_REDUCTION+154, // $NT
  }
,
{ // state 758
0x80000000|610, // match move
0x80000000|114, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 759
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 760
0x80000000|681, // match move
0x80000000|1116, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 761
0x80000000|879, // match move
0x80000000|1234, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 762
2,912, // ws*
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 763
0x80000000|667, // match move
0x80000000|714, // no-match move
0x80000000|1249, // NT-test-match state for comment1Printable
  }
,
{ // state 764
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 765
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+112, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+112, // $
MIN_REDUCTION+112, // $NT
  }
,
{ // state 766
0x80000000|981, // match move
0x80000000|698, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 767
0x80000000|373, // match move
0x80000000|1224, // no-match move
0x80000000|228, // NT-test-match state for stringPrintable
  }
,
{ // state 768
0x80000000|461, // match move
0x80000000|1111, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 769
88,436, // "c"
89,436, // "l"
90,436, // "a"
91,436, // "s"
94,436, // "e"
95,436, // "b"
96,436, // "o"
97,436, // "n"
98,436, // "r"
99,436, // "k"
100,436, // "x"
101,436, // "t"
102,436, // "d"
103,436, // "p"
104,436, // "u"
105,436, // "i"
106,436, // "v"
107,436, // "f"
108,436, // "w"
109,436, // "h"
110,436, // "y"
111,436, // "m"
112,436, // "g"
113,436, // "z"
145,436, // {"A".."Z"}
147,436, // {"j" "q"}
  }
,
{ // state 770
-1, // $$start
-1, // start
259, // ws*
-1, // $$0
MIN_REDUCTION+215, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+215, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+215, // "k"
MIN_REDUCTION+215, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+215, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+215, // "h"
MIN_REDUCTION+215, // "y"
MIN_REDUCTION+215, // "m"
464, // "g"
MIN_REDUCTION+215, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+215, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+215, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+215, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+215, // $
MIN_REDUCTION+215, // $NT
  }
,
{ // state 771
-1, // $$start
-1, // start
90, // ws*
-1, // $$0
MIN_REDUCTION+364, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+364, // $
-1, // $NT
  }
,
{ // state 772
0x80000000|1158, // match move
0x80000000|197, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 773
-1, // $$start
-1, // start
878, // ws*
-1, // $$0
MIN_REDUCTION+288, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 774
-1, // $$start
-1, // start
440, // ws*
-1, // $$0
MIN_REDUCTION+270, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 775
91,601, // "s"
  }
,
{ // state 776
2,899, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 777
88,1241, // "c"
  }
,
{ // state 778
0x80000000|442, // match move
0x80000000|1113, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 779
0x80000000|483, // match move
0x80000000|1028, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 780
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 781
103,247, // "p"
  }
,
{ // state 782
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 783
94,484, // "e"
  }
,
{ // state 784
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+181, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+181, // $
MIN_REDUCTION+181, // $NT
  }
,
{ // state 785
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 786
90,1144, // "a"
  }
,
{ // state 787
0x80000000|1203, // match move
0x80000000|444, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 788
0x80000000|468, // match move
0x80000000|180, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 789
0x80000000|159, // match move
0x80000000|669, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 790
0x80000000|188, // match move
0x80000000|984, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 791
108,409, // "w"
  }
,
{ // state 792
2,833, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 793
2,1127, // ws*
163,753, // $$1
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 794
105,1251, // "i"
  }
,
{ // state 795
0x80000000|1, // match move
0x80000000|1023, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 796
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 797
0x80000000|1119, // match move
0x80000000|779, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 798
0x80000000|908, // match move
0x80000000|116, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 799
0x80000000|1, // match move
0x80000000|517, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 800
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 801
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 802
4,294, // token
5,388, // `boolean
6,480, // `class
7,922, // `extends
8,357, // `void
9,864, // `int
10,251, // `while
11,666, // `if
12,412, // `else
13,71, // `for
14,597, // `break
15,785, // `this
16,882, // `false
17,1007, // `true
18,903, // `super
19,947, // `null
20,966, // `return
21,25, // `instanceof
22,1014, // `new
23,20, // `abstract
24,642, // `assert
25,641, // `byte
26,529, // `case
27,552, // `catch
28,6, // `char
29,849, // `const
30,470, // `continue
31,481, // `default
32,687, // `do
33,820, // `double
34,1232, // `enum
35,932, // `final
36,205, // `finally
37,884, // `float
38,796, // `goto
39,1055, // `implements
40,1061, // `import
41,62, // `interface
42,235, // `long
43,150, // `native
44,695, // `package
45,749, // `private
46,1229, // `protected
47,45, // `public
48,1178, // `short
49,392, // `static
50,279, // `strictfp
51,335, // `switch
52,598, // `synchronized
53,608, // `throw
54,1024, // `throws
55,81, // `transient
56,582, // `try
57,806, // `volatile
  }
,
{ // state 803
118,224, // "&"
  }
,
{ // state 804
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 805
115,870, // "="
  }
,
{ // state 806
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 807
101,1129, // "t"
  }
,
{ // state 808
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 809
0x80000000|453, // match move
0x80000000|21, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 810
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 811
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 812
0x80000000|1213, // match move
0x80000000|417, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 813
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 814
103,637, // "p"
  }
,
{ // state 815
176,MIN_REDUCTION+192, // $NT
  }
,
{ // state 816
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 817
94,469, // "e"
  }
,
{ // state 818
90,1025, // "a"
  }
,
{ // state 819
2,740, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 820
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 821
89,732, // "l"
  }
,
{ // state 822
105,706, // "i"
  }
,
{ // state 823
176,MIN_REDUCTION+303, // $NT
  }
,
{ // state 824
176,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 825
98,1083, // "r"
  }
,
{ // state 826
0x80000000|193, // match move
0x80000000|396, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 827
0x80000000|1016, // match move
0x80000000|79, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 828
88,312, // "c"
89,312, // "l"
90,312, // "a"
91,312, // "s"
94,312, // "e"
95,312, // "b"
96,312, // "o"
97,312, // "n"
98,312, // "r"
99,312, // "k"
100,312, // "x"
101,312, // "t"
102,312, // "d"
103,312, // "p"
104,312, // "u"
105,312, // "i"
106,312, // "v"
107,312, // "f"
108,312, // "w"
109,312, // "h"
110,312, // "y"
111,312, // "m"
112,312, // "g"
113,312, // "z"
114,933, // "!"
115,767, // "="
116,767, // "*"
117,767, // "%"
118,767, // "&"
119,767, // "("
120,767, // ")"
121,767, // "+"
122,767, // ","
123,767, // "-"
124,767, // "."
125,767, // "/"
126,767, // ";"
127,767, // "<"
128,767, // ">"
129,767, // "["
130,312, // "]"
131,312, // "{"
132,312, // "}"
133,312, // "|"
135,767, // "0"
139,312, // "_"
140,537, // stringPrintable
141,933, // " "
142,767, // {"1".."9"}
143,767, // {":" "?".."@"}
144,767, // {"#".."$"}
145,767, // {"A".."Z"}
146,767, // "'"
147,312, // {"j" "q"}
148,312, // {"^" "`" "~"}
164,131, // stringPrintable**
173,1093, // stringPrintable*
  }
,
{ // state 829
176,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 830
0x80000000|1, // match move
0x80000000|744, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 831
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+205, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+205, // $
MIN_REDUCTION+205, // $NT
  }
,
{ // state 832
94,174, // "e"
  }
,
{ // state 833
0x80000000|1190, // match move
0x80000000|395, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 834
94,1117, // "e"
  }
,
{ // state 835
0x80000000|387, // match move
0x80000000|1209, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 836
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+295, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 837
176,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 838
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 839
0x80000000|9, // match move
0x80000000|445, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 840
116,317, // "*"
154,575, // comment2Printable
155,761, // eol
  }
,
{ // state 841
0x80000000|399, // match move
0x80000000|75, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 842
101,496, // "t"
  }
,
{ // state 843
0x80000000|661, // match move
0x80000000|329, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 844
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 845
0x80000000|1153, // match move
0x80000000|510, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 846
2,432, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 847
111,92, // "m"
  }
,
{ // state 848
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 849
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 850
176,MIN_REDUCTION+189, // $NT
  }
,
{ // state 851
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 852
89,1103, // "l"
  }
,
{ // state 853
0x80000000|39, // match move
0x80000000|1060, // no-match move
// T-test match for "*":
116,
  }
,
{ // state 854
0x80000000|137, // match move
0x80000000|257, // no-match move
0x80000000|1249, // NT-test-match state for comment1Printable
  }
,
{ // state 855
115,1105, // "="
  }
,
{ // state 856
0x80000000|838, // match move
0x80000000|1125, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 857
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 858
0x80000000|1, // match move
0x80000000|770, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 859
0x80000000|508, // match move
0x80000000|844, // no-match move
0x80000000|43, // NT-test-match state for digit
  }
,
{ // state 860
0x80000000|571, // match move
0x80000000|376, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 861
-1, // $$start
-1, // start
2, // ws*
-1, // $$0
MIN_REDUCTION+292, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 862
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 863
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 864
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 865
176,MIN_REDUCTION+168, // $NT
  }
,
{ // state 866
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 867
135,495, // "0"
138,859, // digit
142,495, // {"1".."9"}
  }
,
{ // state 868
0x80000000|1184, // match move
0x80000000|1210, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 869
0x80000000|650, // match move
0x80000000|606, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 870
0x80000000|1123, // match move
0x80000000|788, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 871
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 872
101,530, // "t"
  }
,
{ // state 873
96,1254, // "o"
  }
,
{ // state 874
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 875
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 876
176,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 877
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 878
0x80000000|172, // match move
0x80000000|194, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 879
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 880
0x80000000|418, // match move
0x80000000|1225, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 881
0x80000000|234, // match move
0x80000000|904, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 882
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 883
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 884
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 885
89,1164, // "l"
  }
,
{ // state 886
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 887
155,1180, // eol
158,382, // {10}
159,500, // {13}
160,322, // {12}
  }
,
{ // state 888
0x80000000|866, // match move
0x80000000|420, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 889
123,945, // "-"
  }
,
{ // state 890
0x80000000|3, // match move
0x80000000|375, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 891
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 892
0x80000000|1036, // match move
0x80000000|553, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 893
2,961, // ws*
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 894
0x80000000|967, // match move
0x80000000|262, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 895
176,MIN_REDUCTION+325, // $NT
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 896
90,482, // "a"
  }
,
{ // state 897
0x80000000|195, // match move
0x80000000|370, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 898
106,494, // "v"
  }
,
{ // state 899
0x80000000|562, // match move
0x80000000|97, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 900
-1, // $$start
-1, // start
227, // ws*
-1, // $$0
MIN_REDUCTION+104, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+104, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+104, // "k"
MIN_REDUCTION+104, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+104, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+104, // "h"
MIN_REDUCTION+104, // "y"
MIN_REDUCTION+104, // "m"
464, // "g"
MIN_REDUCTION+104, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+104, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+104, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+104, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+104, // $
MIN_REDUCTION+104, // $NT
  }
,
{ // state 901
176,MIN_REDUCTION+144, // $NT
  }
,
{ // state 902
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 903
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 904
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+362, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+362, // $
-1, // $NT
  }
,
{ // state 905
96,466, // "o"
  }
,
{ // state 906
0x80000000|1078, // match move
0x80000000|1115, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 907
2,660, // ws*
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 908
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 909
0x80000000|359, // match move
0x80000000|149, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 910
0x80000000|226, // match move
0x80000000|826, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 911
176,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 912
0x80000000|1089, // match move
0x80000000|760, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 913
96,533, // "o"
  }
,
{ // state 914
104,620, // "u"
  }
,
{ // state 915
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 916
0x80000000|911, // match move
0x80000000|249, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 917
176,MIN_REDUCTION+105, // $NT
  }
,
{ // state 918
0x80000000|106, // match move
0x80000000|955, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 919
89,1217, // "l"
  }
,
{ // state 920
0x80000000|191, // match move
0x80000000|1080, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 921
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 922
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 923
0x80000000|441, // match move
0x80000000|868, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 924
176,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 925
176,MIN_REDUCTION+171, // $NT
  }
,
{ // state 926
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+235, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+235, // $
MIN_REDUCTION+235, // $NT
  }
,
{ // state 927
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 928
-1, // $$start
-1, // start
1081, // ws*
-1, // $$0
MIN_REDUCTION+242, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+242, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+242, // "k"
MIN_REDUCTION+242, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+242, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+242, // "h"
MIN_REDUCTION+242, // "y"
MIN_REDUCTION+242, // "m"
464, // "g"
MIN_REDUCTION+242, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+242, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+242, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+242, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+242, // $
MIN_REDUCTION+242, // $NT
  }
,
{ // state 929
0x80000000|233, // match move
0x80000000|264, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 930
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 931
-1, // $$start
-1, // start
912, // ws*
-1, // $$0
MIN_REDUCTION+294, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 932
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 933
0x80000000|1095, // match move
0x80000000|35, // no-match move
0x80000000|228, // NT-test-match state for stringPrintable
  }
,
{ // state 934
109,1246, // "h"
  }
,
{ // state 935
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 936
91,511, // "s"
101,236, // "t"
  }
,
{ // state 937
116,489, // "*"
  }
,
{ // state 938
176,MIN_REDUCTION+129, // $NT
  }
,
{ // state 939
176,MIN_REDUCTION+322, // $NT
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 940
96,394, // "o"
  }
,
{ // state 941
91,697, // "s"
  }
,
{ // state 942
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 943
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+136, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+136, // $
MIN_REDUCTION+136, // $NT
  }
,
{ // state 944
2,768, // ws*
141,161, // " "
153,161, // {9}
155,369, // eol
156,734, // ws
158,382, // {10}
159,500, // {13}
160,322, // {12}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 945
0x80000000|101, // match move
0x80000000|368, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 946
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 947
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 948
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+232, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+232, // $
MIN_REDUCTION+232, // $NT
  }
,
{ // state 949
-1, // $$start
-1, // start
646, // ws*
-1, // $$0
MIN_REDUCTION+143, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+143, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+143, // "k"
MIN_REDUCTION+143, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+143, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+143, // "h"
MIN_REDUCTION+143, // "y"
MIN_REDUCTION+143, // "m"
464, // "g"
MIN_REDUCTION+143, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+143, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+143, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+143, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+143, // $
MIN_REDUCTION+143, // $NT
  }
,
{ // state 950
96,128, // "o"
105,898, // "i"
  }
,
{ // state 951
94,1207, // "e"
  }
,
{ // state 952
101,73, // "t"
  }
,
{ // state 953
4,294, // token
58,1239, // `!
59,739, // `!=
60,877, // `%
61,752, // `&&
62,72, // `*
63,585, // `(
64,684, // `)
65,618, // `{
66,1211, // `}
67,52, // `-
68,972, // `+
69,407, // `=
70,141, // `==
71,875, // `[
72,764, // `]
73,754, // `||
74,800, // `<
75,1159, // `<=
76,1141, // `,
77,946, // `>
78,1201, // `>=
79,397, // `.
80,862, // `;
81,1128, // `++
82,639, // `--
83,857, // `/
84,42, // ID
85,801, // INTLIT
86,240, // STRINGLIT
87,721, // CHARLIT
134,962, // intLit2
135,221, // "0"
137,918, // letter
161,566, // letter++
174,841, // letter+
  }
,
{ // state 954
110,830, // "y"
  }
,
{ // state 955
0x80000000|1, // match move
0x80000000|1215, // no-match move
0x80000000|769, // NT-test-match state for letter
  }
,
{ // state 956
-1, // $$start
-1, // start
-1, // ws*
1122, // $$0
665, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
1000, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 957
0x80000000|1, // match move
0x80000000|199, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 958
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 959
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+190, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+190, // $
MIN_REDUCTION+190, // $NT
  }
,
{ // state 960
0x80000000|1057, // match move
0x80000000|270, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 961
0x80000000|709, // match move
0x80000000|557, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 962
0x80000000|587, // match move
0x80000000|1062, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 963
2,63, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 964
176,MIN_REDUCTION+90, // $NT
  }
,
{ // state 965
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 966
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 967
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 968
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 969
176,MIN_REDUCTION+183, // $NT
  }
,
{ // state 970
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+299, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 971
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 972
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 973
176,MIN_REDUCTION+210, // $NT
  }
,
{ // state 974
176,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 975
0x80000000|1082, // match move
0x80000000|183, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 976
0x80000000|17, // match move
0x80000000|757, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 977
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+172, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+172, // $
MIN_REDUCTION+172, // $NT
  }
,
{ // state 978
-1, // $$start
-1, // start
36, // ws*
-1, // $$0
MIN_REDUCTION+206, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+206, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+206, // "k"
MIN_REDUCTION+206, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+206, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+206, // "h"
MIN_REDUCTION+206, // "y"
MIN_REDUCTION+206, // "m"
464, // "g"
MIN_REDUCTION+206, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+206, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+206, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+206, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+206, // $
MIN_REDUCTION+206, // $NT
  }
};
}
private class Initter6{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 979
98,51, // "r"
  }
,
{ // state 980
176,MIN_REDUCTION+308, // $NT
  }
,
{ // state 981
2,1196, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 982
0x80000000|726, // match move
0x80000000|1066, // no-match move
// T-test match for "*":
116,
  }
,
{ // state 983
0x80000000|1, // match move
0x80000000|1235, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 984
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+271, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 985
0x80000000|1, // match move
0x80000000|1056, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 986
0x80000000|539, // match move
0x80000000|1030, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 987
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 988
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 989
-1, // $$start
-1, // start
833, // ws*
-1, // $$0
MIN_REDUCTION+296, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 990
96,38, // "o"
  }
,
{ // state 991
-1, // $$start
-1, // start
576, // ws*
-1, // $$0
MIN_REDUCTION+125, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+125, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+125, // "k"
MIN_REDUCTION+125, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+125, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+125, // "h"
MIN_REDUCTION+125, // "y"
MIN_REDUCTION+125, // "m"
464, // "g"
MIN_REDUCTION+125, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+125, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+125, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+125, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+125, // $
MIN_REDUCTION+125, // $NT
  }
,
{ // state 992
2,1042, // ws*
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 993
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+287, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 994
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+291, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 995
111,719, // "m"
  }
,
{ // state 996
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 997
2,742, // ws*
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 998
2,649, // ws*
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 999
176,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 1000
0x80000000|1043, // match move
0x80000000|787, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1001
95,700, // "b"
  }
,
{ // state 1002
0x80000000|657, // match move
0x80000000|1051, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1003
-1, // $$start
-1, // start
365, // ws*
-1, // $$0
MIN_REDUCTION+233, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
1048, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+233, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+233, // "k"
MIN_REDUCTION+233, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+233, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+233, // "h"
MIN_REDUCTION+233, // "y"
MIN_REDUCTION+233, // "m"
464, // "g"
MIN_REDUCTION+233, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+233, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+233, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+233, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 1004
-1, // $$start
-1, // start
899, // ws*
-1, // $$0
MIN_REDUCTION+264, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 1005
0x80000000|701, // match move
0x80000000|906, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1006
2,154, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1007
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1008
0x80000000|1, // match move
0x80000000|944, // no-match move
// T-test match for "/":
125,
  }
,
{ // state 1009
2,63, // ws*
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1010
91,536, // "s"
95,673, // "b"
  }
,
{ // state 1011
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+273, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 1012
97,459, // "n"
  }
,
{ // state 1013
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1014
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1015
176,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1016
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1017
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1018
0x80000000|182, // match move
0x80000000|198, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1019
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1020
-1, // $$start
-1, // start
1127, // ws*
-1, // $$0
MIN_REDUCTION+332, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+332, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+332, // "k"
MIN_REDUCTION+332, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+332, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+332, // "h"
MIN_REDUCTION+332, // "y"
MIN_REDUCTION+332, // "m"
464, // "g"
MIN_REDUCTION+332, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+332, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+332, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+332, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
890, // idChar**
731, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
718, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+332, // $
-1, // $NT
  }
,
{ // state 1021
-1, // $$start
-1, // start
74, // ws*
-1, // $$0
MIN_REDUCTION+221, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+221, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+221, // "k"
MIN_REDUCTION+221, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+221, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+221, // "h"
MIN_REDUCTION+221, // "y"
MIN_REDUCTION+221, // "m"
464, // "g"
MIN_REDUCTION+221, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+221, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+221, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+221, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+221, // $
MIN_REDUCTION+221, // $NT
  }
,
{ // state 1022
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+217, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+217, // $
MIN_REDUCTION+217, // $NT
  }
,
{ // state 1023
-1, // $$start
-1, // start
76, // ws*
-1, // $$0
MIN_REDUCTION+197, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+197, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+197, // "k"
MIN_REDUCTION+197, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+197, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+197, // "h"
MIN_REDUCTION+197, // "y"
MIN_REDUCTION+197, // "m"
464, // "g"
MIN_REDUCTION+197, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+197, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+197, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+197, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+197, // $
MIN_REDUCTION+197, // $NT
  }
,
{ // state 1024
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1025
89,1102, // "l"
  }
,
{ // state 1026
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+269, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 1027
0x80000000|89, // match move
0x80000000|1092, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1028
-1, // $$start
-1, // start
485, // ws*
-1, // $$0
MIN_REDUCTION+248, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 1029
0x80000000|189, // match move
0x80000000|835, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1030
-1, // $$start
-1, // start
278, // ws*
-1, // $$0
MIN_REDUCTION+256, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 1031
176,MIN_REDUCTION+111, // $NT
  }
,
{ // state 1032
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1033
176,MIN_REDUCTION+306, // $NT
  }
,
{ // state 1034
0x80000000|1194, // match move
0x80000000|1240, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1035
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+229, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+229, // $
MIN_REDUCTION+229, // $NT
  }
,
{ // state 1036
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1037
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 1038
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 1039
0x80000000|1, // match move
0x80000000|177, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1040
0x80000000|813, // match move
0x80000000|130, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1041
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+163, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+163, // $
MIN_REDUCTION+163, // $NT
  }
,
{ // state 1042
0x80000000|804, // match move
0x80000000|1243, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1043
0x80000000|802, // match move
0x80000000|953, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1044
-1, // $$start
-1, // start
1005, // ws*
-1, // $$0
MIN_REDUCTION+245, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+245, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+245, // "k"
MIN_REDUCTION+245, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+245, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+245, // "h"
MIN_REDUCTION+245, // "y"
MIN_REDUCTION+245, // "m"
464, // "g"
MIN_REDUCTION+245, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+245, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+245, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+245, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+245, // $
MIN_REDUCTION+245, // $NT
  }
,
{ // state 1045
0x80000000|462, // match move
0x80000000|344, // no-match move
// T-test match for "*":
116,
  }
,
{ // state 1046
96,102, // "o"
  }
,
{ // state 1047
176,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 1048
0x80000000|724, // match move
0x80000000|1212, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1049
176,MIN_REDUCTION+136, // $NT
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1050
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1051
-1, // $$start
-1, // start
845, // ws*
-1, // $$0
MIN_REDUCTION+260, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 1052
90,743, // "a"
  }
,
{ // state 1053
0x80000000|1172, // match move
0x80000000|1038, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1054
2,2, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1055
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1056
-1, // $$start
-1, // start
812, // ws*
-1, // $$0
MIN_REDUCTION+128, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+128, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+128, // "k"
MIN_REDUCTION+128, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+128, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+128, // "h"
MIN_REDUCTION+128, // "y"
MIN_REDUCTION+128, // "m"
464, // "g"
MIN_REDUCTION+128, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+128, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+128, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+128, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+128, // $
MIN_REDUCTION+128, // $NT
  }
,
{ // state 1057
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1058
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 1059
176,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1060
0x80000000|735, // match move
0x80000000|944, // no-match move
// T-test match for "/":
125,
  }
,
{ // state 1061
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1062
0x80000000|320, // match move
0x80000000|1248, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1063
176,MIN_REDUCTION+156, // $NT
  }
,
{ // state 1064
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1065
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1066
88,1077, // "c"
89,1077, // "l"
90,1077, // "a"
91,1077, // "s"
94,1077, // "e"
95,1077, // "b"
96,1077, // "o"
97,1077, // "n"
98,1077, // "r"
99,1077, // "k"
100,1077, // "x"
101,1077, // "t"
102,1077, // "d"
103,1077, // "p"
104,1077, // "u"
105,1077, // "i"
106,1077, // "v"
107,1077, // "f"
108,1077, // "w"
109,1077, // "h"
110,1077, // "y"
111,1077, // "m"
112,1077, // "g"
113,1077, // "z"
114,1077, // "!"
115,1077, // "="
116,1077, // "*"
117,1077, // "%"
118,1077, // "&"
119,1077, // "("
120,1077, // ")"
121,1077, // "+"
122,1077, // ","
123,1077, // "-"
124,1077, // "."
125,1077, // "/"
126,1077, // ";"
127,1077, // "<"
128,1077, // ">"
129,1077, // "["
130,1077, // "]"
131,1077, // "{"
132,1077, // "}"
133,1077, // "|"
135,1077, // "0"
139,1077, // "_"
141,1077, // " "
142,1077, // {"1".."9"}
143,1077, // {":" "?".."@"}
144,1077, // {"#".."$"}
145,1077, // {"A".."Z"}
146,1077, // "'"
147,1077, // {"j" "q"}
148,1077, // {"^" "`" "~"}
150,1077, // '"'
151,568, // comment1Printable
152,1077, // "\"
153,909, // {9}
154,575, // comment2Printable
155,761, // eol
158,1120, // {10}
159,50, // {13}
160,577, // {12}
  }
,
{ // state 1067
90,122, // "a"
  }
,
{ // state 1068
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+263, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 1069
97,121, // "n"
  }
,
{ // state 1070
0x80000000|670, // match move
0x80000000|160, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1071
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+247, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+247, // $
-1, // $NT
  }
,
{ // state 1072
0x80000000|1, // match move
0x80000000|978, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1073
176,MIN_REDUCTION+195, // $NT
  }
,
{ // state 1074
0x80000000|1037, // match move
0x80000000|994, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1075
176,MIN_REDUCTION+177, // $NT
  }
,
{ // state 1076
-1, // $$start
-1, // start
1127, // ws*
-1, // $$0
MIN_REDUCTION+330, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
753, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+330, // $
-1, // $NT
  }
,
{ // state 1077
0x80000000|301, // match move
0x80000000|1032, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 1078
176,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1079
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1080
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+175, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+175, // $
MIN_REDUCTION+175, // $NT
  }
,
{ // state 1081
0x80000000|367, // match move
0x80000000|624, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1082
2,501, // ws*
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1083
107,1067, // "f"
  }
,
{ // state 1084
176,MIN_REDUCTION+141, // $NT
  }
,
{ // state 1085
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1086
96,821, // "o"
  }
,
{ // state 1087
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+241, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+241, // $
MIN_REDUCTION+241, // $NT
  }
,
{ // state 1088
94,175, // "e"
  }
,
{ // state 1089
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1090
0x80000000|1, // match move
0x80000000|1200, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1091
0x80000000|341, // match move
0x80000000|47, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1092
3,1122, // $$0
4,665, // token
58,1239, // `!
59,739, // `!=
60,877, // `%
61,752, // `&&
62,72, // `*
63,585, // `(
64,684, // `)
65,618, // `{
66,1211, // `}
67,52, // `-
68,972, // `+
69,407, // `=
70,141, // `==
71,875, // `[
72,764, // `]
73,754, // `||
74,800, // `<
75,1159, // `<=
76,1141, // `,
77,946, // `>
78,1201, // `>=
79,397, // `.
80,862, // `;
81,1128, // `++
82,639, // `--
83,857, // `/
84,42, // ID
85,801, // INTLIT
86,240, // STRINGLIT
87,721, // CHARLIT
134,962, // intLit2
135,221, // "0"
137,918, // letter
155,369, // eol
156,658, // ws
157,939, // comment
161,566, // letter++
168,1000, // token*
174,841, // letter+
  }
,
{ // state 1093
0x80000000|170, // match move
0x80000000|413, // no-match move
0x80000000|228, // NT-test-match state for stringPrintable
  }
,
{ // state 1094
0x80000000|316, // match move
0x80000000|265, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1095
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 1096
89,941, // "l"
97,723, // "n"
98,1083, // "r"
100,351, // "x"
  }
,
{ // state 1097
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1098
0x80000000|1, // match move
0x80000000|147, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1099
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+124, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+124, // $
MIN_REDUCTION+124, // $NT
  }
};
}
private class Initter7{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1100
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 1101
-1, // $$start
-1, // start
607, // ws*
-1, // $$0
MIN_REDUCTION+110, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+110, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+110, // "k"
MIN_REDUCTION+110, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+110, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+110, // "h"
MIN_REDUCTION+110, // "y"
MIN_REDUCTION+110, // "m"
464, // "g"
MIN_REDUCTION+110, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+110, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+110, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+110, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+110, // $
MIN_REDUCTION+110, // $NT
  }
,
{ // state 1102
0x80000000|524, // match move
0x80000000|364, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1103
101,696, // "t"
  }
,
{ // state 1104
88,436, // "c"
89,436, // "l"
90,436, // "a"
91,436, // "s"
94,436, // "e"
95,436, // "b"
96,436, // "o"
97,436, // "n"
98,436, // "r"
99,436, // "k"
100,436, // "x"
101,436, // "t"
102,436, // "d"
103,436, // "p"
104,436, // "u"
105,436, // "i"
106,436, // "v"
107,436, // "f"
108,436, // "w"
109,436, // "h"
110,436, // "y"
111,436, // "m"
112,436, // "g"
113,436, // "z"
135,290, // "0"
137,823, // letter
138,554, // digit
139,627, // "_"
142,290, // {"1".."9"}
145,436, // {"A".."Z"}
147,436, // {"j" "q"}
  }
,
{ // state 1105
0x80000000|1006, // match move
0x80000000|680, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1106
0x80000000|1054, // match move
0x80000000|186, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1107
0x80000000|525, // match move
0x80000000|248, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1108
0x80000000|70, // match move
0x80000000|348, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1109
0x80000000|542, // match move
0x80000000|1018, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1110
-1, // $$start
-1, // start
254, // ws*
-1, // $$0
MIN_REDUCTION+194, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+194, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+194, // "k"
MIN_REDUCTION+194, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+194, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+194, // "h"
MIN_REDUCTION+194, // "y"
MIN_REDUCTION+194, // "m"
464, // "g"
MIN_REDUCTION+194, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+194, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+194, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+194, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+194, // $
MIN_REDUCTION+194, // $NT
  }
,
{ // state 1111
0x80000000|1130, // match move
0x80000000|1011, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1112
90,775, // "a"
  }
,
{ // state 1113
0x80000000|1166, // match move
0x80000000|1223, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1114
0x80000000|1, // match move
0x80000000|1199, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1115
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+244, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+244, // $
MIN_REDUCTION+244, // $NT
  }
,
{ // state 1116
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+293, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 1117
0x80000000|1, // match move
0x80000000|1044, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1118
0x80000000|1, // match move
0x80000000|1008, // no-match move
// T-test match for "*":
116,
  }
,
{ // state 1119
2,485, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1120
0x80000000|968, // match move
0x80000000|546, // no-match move
0x80000000|1045, // NT-test-match state for comment2Printable
  }
,
{ // state 1121
0x80000000|1, // match move
0x80000000|1182, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1122
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 1123
2,324, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1124
94,858, // "e"
  }
,
{ // state 1125
0x80000000|218, // match move
0x80000000|644, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1126
176,MIN_REDUCTION+243, // $NT
  }
,
{ // state 1127
0x80000000|37, // match move
0x80000000|881, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1128
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1129
96,1230, // "o"
  }
,
{ // state 1130
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1131
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1132
176,MIN_REDUCTION+120, // $NT
  }
,
{ // state 1133
0x80000000|273, // match move
0x80000000|653, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1134
0x80000000|1, // match move
0x80000000|1021, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1135
-1, // $$start
-1, // start
154, // ws*
-1, // $$0
MIN_REDUCTION+280, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 1136
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+160, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+160, // $
MIN_REDUCTION+160, // $NT
  }
,
{ // state 1137
0x80000000|574, // match move
0x80000000|663, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1138
176,MIN_REDUCTION+219, // $NT
  }
,
{ // state 1139
176,MIN_REDUCTION+135, // $NT
  }
,
{ // state 1140
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+253, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 1141
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1142
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+121, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+121, // $
MIN_REDUCTION+121, // $NT
  }
,
{ // state 1143
176,MIN_REDUCTION+237, // $NT
  }
,
{ // state 1144
97,208, // "n"
  }
,
{ // state 1145
94,1186, // "e"
  }
,
{ // state 1146
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1147
0x80000000|232, // match move
0x80000000|1029, // no-match move
// T-test match for "+":
121,
  }
,
{ // state 1148
0x80000000|974, // match move
0x80000000|1170, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1149
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1150
116,317, // "*"
154,741, // comment2Printable
155,761, // eol
166,937, // comment2Printable**
171,982, // comment2Printable*
  }
,
{ // state 1151
0x80000000|98, // match move
0x80000000|765, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1152
176,MIN_REDUCTION+153, // $NT
  }
,
{ // state 1153
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1154
0x80000000|1049, // match move
0x80000000|943, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1155
158,1157, // {10}
  }
,
{ // state 1156
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1157
176,MIN_REDUCTION+324, // $NT
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1158
1,710, // start
2,699, // ws*
3,200, // $$0
4,665, // token
5,388, // `boolean
6,480, // `class
7,922, // `extends
8,357, // `void
9,864, // `int
10,251, // `while
11,666, // `if
12,412, // `else
13,71, // `for
14,597, // `break
15,785, // `this
16,882, // `false
17,1007, // `true
18,903, // `super
19,947, // `null
20,966, // `return
21,25, // `instanceof
22,1014, // `new
23,20, // `abstract
24,642, // `assert
25,641, // `byte
26,529, // `case
27,552, // `catch
28,6, // `char
29,849, // `const
30,470, // `continue
31,481, // `default
32,687, // `do
33,820, // `double
34,1232, // `enum
35,932, // `final
36,205, // `finally
37,884, // `float
38,796, // `goto
39,1055, // `implements
40,1061, // `import
41,62, // `interface
42,235, // `long
43,150, // `native
44,695, // `package
45,749, // `private
46,1229, // `protected
47,45, // `public
48,1178, // `short
49,392, // `static
50,279, // `strictfp
51,335, // `switch
52,598, // `synchronized
53,608, // `throw
54,1024, // `throws
55,81, // `transient
56,582, // `try
57,806, // `volatile
88,202, // "c"
89,1046, // "l"
90,1010, // "a"
91,386, // "s"
94,423, // "e"
95,427, // "b"
97,299, // "n"
98,817, // "r"
101,535, // "t"
102,274, // "d"
103,377, // "p"
105,27, // "i"
106,940, // "v"
107,209, // "f"
108,487, // "w"
112,464, // "g"
168,1000, // token*
175,MIN_REDUCTION+1, // $
  }
,
{ // state 1159
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 1160
89,834, // "l"
  }
,
{ // state 1161
101,211, // "t"
  }
,
{ // state 1162
113,783, // "z"
  }
,
{ // state 1163
105,842, // "i"
  }
,
{ // state 1164
89,985, // "l"
  }
,
{ // state 1165
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 1166
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1167
0x80000000|1059, // match move
0x80000000|1022, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1168
0x80000000|85, // match move
0x80000000|748, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1169
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+220, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+220, // $
MIN_REDUCTION+220, // $NT
  }
,
{ // state 1170
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+97, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+97, // $
MIN_REDUCTION+97, // $NT
  }
,
{ // state 1171
0x80000000|987, // match move
0x80000000|4, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1172
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 1173
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 1174
91,431, // "s"
101,355, // "t"
  }
,
{ // state 1175
176,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1176
3,1122, // $$0
4,665, // token
5,388, // `boolean
6,480, // `class
7,922, // `extends
8,357, // `void
9,864, // `int
10,251, // `while
11,666, // `if
12,412, // `else
13,71, // `for
14,597, // `break
15,785, // `this
16,882, // `false
17,1007, // `true
18,903, // `super
19,947, // `null
20,966, // `return
21,25, // `instanceof
22,1014, // `new
23,20, // `abstract
24,642, // `assert
25,641, // `byte
26,529, // `case
27,552, // `catch
28,6, // `char
29,849, // `const
30,470, // `continue
31,481, // `default
32,687, // `do
33,820, // `double
34,1232, // `enum
35,932, // `final
36,205, // `finally
37,884, // `float
38,796, // `goto
39,1055, // `implements
40,1061, // `import
41,62, // `interface
42,235, // `long
43,150, // `native
44,695, // `package
45,749, // `private
46,1229, // `protected
47,45, // `public
48,1178, // `short
49,392, // `static
50,279, // `strictfp
51,335, // `switch
52,598, // `synchronized
53,608, // `throw
54,1024, // `throws
55,81, // `transient
56,582, // `try
57,806, // `volatile
88,202, // "c"
89,1046, // "l"
90,1010, // "a"
91,386, // "s"
94,423, // "e"
95,427, // "b"
97,299, // "n"
98,817, // "r"
101,535, // "t"
102,274, // "d"
103,377, // "p"
105,27, // "i"
106,940, // "v"
107,209, // "f"
108,487, // "w"
112,464, // "g"
168,1000, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 1177
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+169, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+169, // $
MIN_REDUCTION+169, // $NT
  }
,
{ // state 1178
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1179
176,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1180
176,MIN_REDUCTION+337, // $NT
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1181
0x80000000|1, // match move
0x80000000|636, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1182
-1, // $$start
-1, // start
216, // ws*
-1, // $$0
MIN_REDUCTION+95, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+95, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+95, // "k"
MIN_REDUCTION+95, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+95, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+95, // "h"
MIN_REDUCTION+95, // "y"
MIN_REDUCTION+95, // "m"
464, // "g"
MIN_REDUCTION+95, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+95, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+95, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+95, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+95, // $
MIN_REDUCTION+95, // $NT
  }
,
{ // state 1183
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1184
176,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1185
0x80000000|153, // match move
0x80000000|1168, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1186
0x80000000|1, // match move
0x80000000|949, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1187
0x80000000|805, // match move
0x80000000|685, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 1188
0x80000000|1, // match move
0x80000000|1101, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1189
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1190
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1191
0x80000000|326, // match move
0x80000000|219, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1192
176,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 1193
2,878, // ws*
155,369, // eol
156,734, // ws
157,939, // comment
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1194
176,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1195
89,207, // "l"
  }
,
{ // state 1196
0x80000000|1156, // match move
0x80000000|860, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1197
176,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1198
0x80000000|1179, // match move
0x80000000|1136, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1199
-1, // $$start
-1, // start
516, // ws*
-1, // $$0
MIN_REDUCTION+230, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+230, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+230, // "k"
MIN_REDUCTION+230, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+230, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+230, // "h"
MIN_REDUCTION+230, // "y"
MIN_REDUCTION+230, // "m"
464, // "g"
MIN_REDUCTION+230, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+230, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+230, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+230, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+230, // $
MIN_REDUCTION+230, // $NT
  }
,
{ // state 1200
-1, // $$start
-1, // start
448, // ws*
-1, // $$0
MIN_REDUCTION+200, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+200, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+200, // "k"
MIN_REDUCTION+200, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+200, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+200, // "h"
MIN_REDUCTION+200, // "y"
MIN_REDUCTION+200, // "m"
464, // "g"
MIN_REDUCTION+200, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+200, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+200, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+200, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+200, // $
MIN_REDUCTION+200, // $NT
  }
,
{ // state 1201
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 1202
0x80000000|996, // match move
0x80000000|564, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1203
4,294, // token
5,388, // `boolean
6,480, // `class
7,922, // `extends
8,357, // `void
9,864, // `int
10,251, // `while
11,666, // `if
12,412, // `else
13,71, // `for
14,597, // `break
15,785, // `this
16,882, // `false
17,1007, // `true
18,903, // `super
19,947, // `null
20,966, // `return
21,25, // `instanceof
22,1014, // `new
23,20, // `abstract
24,642, // `assert
25,641, // `byte
26,529, // `case
27,552, // `catch
28,6, // `char
29,849, // `const
30,470, // `continue
31,481, // `default
32,687, // `do
33,820, // `double
34,1232, // `enum
35,932, // `final
36,205, // `finally
37,884, // `float
38,796, // `goto
39,1055, // `implements
40,1061, // `import
41,62, // `interface
42,235, // `long
43,150, // `native
44,695, // `package
45,749, // `private
46,1229, // `protected
47,45, // `public
48,1178, // `short
49,392, // `static
50,279, // `strictfp
51,335, // `switch
52,598, // `synchronized
53,608, // `throw
54,1024, // `throws
55,81, // `transient
56,582, // `try
57,806, // `volatile
88,202, // "c"
89,1046, // "l"
90,1010, // "a"
91,386, // "s"
94,423, // "e"
95,427, // "b"
97,299, // "n"
98,817, // "r"
101,535, // "t"
102,274, // "d"
103,377, // "p"
105,27, // "i"
106,940, // "v"
107,209, // "f"
108,487, // "w"
112,464, // "g"
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 1204
101,285, // "t"
  }
,
{ // state 1205
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1206
107,814, // "f"
  }
,
{ // state 1207
98,1181, // "r"
  }
,
{ // state 1208
0x80000000|819, // match move
0x80000000|809, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1209
-1, // $$start
-1, // start
315, // ws*
-1, // $$0
MIN_REDUCTION+262, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
-1, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
-1, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
MIN_REDUCTION+262, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 1210
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+133, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+133, // $
MIN_REDUCTION+133, // $NT
  }
,
{ // state 1211
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1212
-1, // $$start
-1, // start
1253, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+236, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+236, // "k"
MIN_REDUCTION+236, // "x"
451, // "t"
274, // "d"
377, // "p"
78, // "u"
27, // "i"
940, // "v"
209, // "f"
677, // "w"
990, // "h"
342, // "y"
MIN_REDUCTION+236, // "m"
464, // "g"
MIN_REDUCTION+236, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+236, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+236, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+236, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 1213
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1214
176,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1215
4,MIN_REDUCTION+351, // token
114,MIN_REDUCTION+351, // "!"
115,MIN_REDUCTION+351, // "="
116,MIN_REDUCTION+351, // "*"
117,MIN_REDUCTION+351, // "%"
118,MIN_REDUCTION+351, // "&"
119,MIN_REDUCTION+351, // "("
120,MIN_REDUCTION+351, // ")"
121,MIN_REDUCTION+351, // "+"
122,MIN_REDUCTION+351, // ","
123,MIN_REDUCTION+351, // "-"
124,MIN_REDUCTION+351, // "."
125,MIN_REDUCTION+351, // "/"
126,MIN_REDUCTION+351, // ";"
127,MIN_REDUCTION+351, // "<"
128,MIN_REDUCTION+351, // ">"
129,MIN_REDUCTION+351, // "["
130,MIN_REDUCTION+351, // "]"
131,MIN_REDUCTION+351, // "{"
132,MIN_REDUCTION+351, // "}"
133,MIN_REDUCTION+351, // "|"
141,MIN_REDUCTION+351, // " "
146,MIN_REDUCTION+351, // "'"
150,MIN_REDUCTION+351, // '"'
153,MIN_REDUCTION+351, // {9}
158,MIN_REDUCTION+351, // {10}
159,MIN_REDUCTION+351, // {13}
160,MIN_REDUCTION+351, // {12}
163,MIN_REDUCTION+351, // $$1
175,MIN_REDUCTION+351, // $
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1216
-1, // $$start
-1, // start
894, // ws*
-1, // $$0
MIN_REDUCTION+173, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+173, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+173, // "k"
MIN_REDUCTION+173, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+173, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+173, // "h"
MIN_REDUCTION+173, // "y"
MIN_REDUCTION+173, // "m"
464, // "g"
MIN_REDUCTION+173, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+173, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+173, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+173, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 1217
94,384, // "e"
  }
,
{ // state 1218
176,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1219
176,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1220
0x80000000|921, // match move
0x80000000|252, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1221
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+208, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+208, // $
MIN_REDUCTION+208, // $NT
  }
,
{ // state 1222
0x80000000|115, // match move
0x80000000|549, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1223
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+275, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+275, // $
-1, // $NT
  }
,
{ // state 1224
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1225
0x80000000|1192, // match move
0x80000000|1237, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1226
0x80000000|87, // match move
0x80000000|1198, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1227
0x80000000|654, // match move
0x80000000|1233, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1228
2,440, // ws*
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1229
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 1230
0x80000000|1, // match move
0x80000000|1110, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1231
0x80000000|1, // match move
0x80000000|991, // no-match move
0x80000000|1104, // NT-test-match state for idChar
  }
,
{ // state 1232
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1233
-1, // $$start
-1, // start
843, // ws*
-1, // $$0
MIN_REDUCTION+254, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 1234
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1235
-1, // $$start
-1, // start
1107, // ws*
-1, // $$0
MIN_REDUCTION+92, // token
388, // `boolean
480, // `class
922, // `extends
357, // `void
864, // `int
251, // `while
666, // `if
412, // `else
71, // `for
597, // `break
785, // `this
882, // `false
1007, // `true
903, // `super
947, // `null
966, // `return
25, // `instanceof
1014, // `new
20, // `abstract
642, // `assert
641, // `byte
529, // `case
552, // `catch
6, // `char
849, // `const
470, // `continue
481, // `default
687, // `do
820, // `double
1232, // `enum
932, // `final
205, // `finally
884, // `float
796, // `goto
1055, // `implements
1061, // `import
62, // `interface
235, // `long
150, // `native
695, // `package
749, // `private
1229, // `protected
45, // `public
1178, // `short
392, // `static
279, // `strictfp
335, // `switch
598, // `synchronized
608, // `throw
1024, // `throws
81, // `transient
582, // `try
806, // `volatile
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
-1, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
202, // "c"
1046, // "l"
1010, // "a"
386, // "s"
-1, // idChar
-1, // reserved
423, // "e"
427, // "b"
MIN_REDUCTION+92, // "o"
299, // "n"
817, // "r"
MIN_REDUCTION+92, // "k"
MIN_REDUCTION+92, // "x"
535, // "t"
274, // "d"
377, // "p"
MIN_REDUCTION+92, // "u"
27, // "i"
940, // "v"
209, // "f"
487, // "w"
MIN_REDUCTION+92, // "h"
MIN_REDUCTION+92, // "y"
MIN_REDUCTION+92, // "m"
464, // "g"
MIN_REDUCTION+92, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
221, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
MIN_REDUCTION+92, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
MIN_REDUCTION+92, // {"A".."Z"}
319, // "'"
MIN_REDUCTION+92, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
-1, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
-1, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
-1, // letter+
MIN_REDUCTION+92, // $
MIN_REDUCTION+92, // $NT
  }
,
{ // state 1236
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1237
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+118, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+118, // $
MIN_REDUCTION+118, // $NT
  }
,
{ // state 1238
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1239
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 1240
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+106, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
658, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+106, // $
MIN_REDUCTION+106, // $NT
  }
};
}
private class Initter8{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1241
101,178, // "t"
  }
,
{ // state 1242
97,914, // "n"
  }
,
{ // state 1243
0x80000000|891, // match move
0x80000000|293, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1244
155,369, // eol
156,658, // ws
157,939, // comment
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1245
0x80000000|66, // match move
0x80000000|372, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1246
98,913, // "r"
  }
,
{ // state 1247
0x80000000|119, // match move
0x80000000|702, // no-match move
0x80000000|750, // NT-test-match state for reserved
  }
,
{ // state 1248
-1, // $$start
-1, // start
1222, // ws*
-1, // $$0
MIN_REDUCTION+300, // token
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
1239, // `!
739, // `!=
877, // `%
752, // `&&
72, // `*
585, // `(
684, // `)
618, // `{
1211, // `}
52, // `-
972, // `+
407, // `=
141, // `==
875, // `[
764, // `]
754, // `||
800, // `<
1159, // `<=
1141, // `,
946, // `>
1201, // `>=
397, // `.
862, // `;
1128, // `++
639, // `--
857, // `/
42, // ID
801, // INTLIT
240, // STRINGLIT
721, // CHARLIT
1094, // "c"
1094, // "l"
1094, // "a"
1094, // "s"
-1, // idChar
-1, // reserved
1094, // "e"
1094, // "b"
1094, // "o"
1094, // "n"
1094, // "r"
1094, // "k"
1094, // "x"
1094, // "t"
1094, // "d"
1094, // "p"
1094, // "u"
1094, // "i"
1094, // "v"
1094, // "f"
1094, // "w"
1094, // "h"
1094, // "y"
1094, // "m"
1094, // "g"
1094, // "z"
213, // "!"
1187, // "="
34, // "*"
467, // "%"
803, // "&"
256, // "("
61, // ")"
1147, // "+"
1208, // ","
176, // "-"
139, // "."
853, // "/"
1109, // ";"
163, // "<"
425, // ">"
231, // "["
1106, // "]"
371, // "{"
229, // "}"
632, // "|"
962, // intLit2
495, // "0"
863, // digit++
918, // letter
46, // digit
-1, // "_"
-1, // stringPrintable
161, // " "
495, // {"1".."9"}
-1, // {":" "?".."@"}
-1, // {"#".."$"}
1094, // {"A".."Z"}
319, // "'"
1094, // {"j" "q"}
-1, // {"^" "`" "~"}
-1, // charPrintable
164, // '"'
-1, // comment1Printable
-1, // "\"
161, // {9}
-1, // comment2Printable
369, // eol
734, // ws
939, // comment
382, // {10}
500, // {13}
322, // {12}
566, // letter++
-1, // idChar**
-1, // $$1
-1, // stringPrintable**
-1, // $$2
-1, // comment2Printable**
-1, // comment1Printable**
-1, // token*
-1, // comment1Printable*
11, // digit+
-1, // comment2Printable*
-1, // idChar*
-1, // stringPrintable*
841, // letter+
MIN_REDUCTION+300, // $
-1, // $NT
  }
,
{ // state 1249
88,1252, // "c"
89,1252, // "l"
90,1252, // "a"
91,1252, // "s"
94,1252, // "e"
95,1252, // "b"
96,1252, // "o"
97,1252, // "n"
98,1252, // "r"
99,1252, // "k"
100,1252, // "x"
101,1252, // "t"
102,1252, // "d"
103,1252, // "p"
104,1252, // "u"
105,1252, // "i"
106,1252, // "v"
107,1252, // "f"
108,1252, // "w"
109,1252, // "h"
110,1252, // "y"
111,1252, // "m"
112,1252, // "g"
113,1252, // "z"
114,1252, // "!"
115,1252, // "="
116,1252, // "*"
117,1252, // "%"
118,1252, // "&"
119,1252, // "("
120,1252, // ")"
121,1252, // "+"
122,1252, // ","
123,1252, // "-"
124,1252, // "."
125,1252, // "/"
126,1252, // ";"
127,1252, // "<"
128,1252, // ">"
129,1252, // "["
130,1252, // "]"
131,1252, // "{"
132,1252, // "}"
133,1252, // "|"
135,1252, // "0"
139,1252, // "_"
141,1252, // " "
142,1252, // {"1".."9"}
143,1252, // {":" "?".."@"}
144,1252, // {"#".."$"}
145,1252, // {"A".."Z"}
146,1252, // "'"
147,1252, // {"j" "q"}
148,1252, // {"^" "`" "~"}
150,1252, // '"'
152,1252, // "\"
153,567, // {9}
  }
,
{ // state 1250
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 1251
94,281, // "e"
  }
,
{ // state 1252
176,MIN_REDUCTION+312, // $NT
  }
,
{ // state 1253
0x80000000|13, // match move
0x80000000|328, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1254
107,799, // "f"
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1255][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
  doneSoFar += new Initter5().doInit(doneSoFar);
  doneSoFar += new Initter6().doInit(doneSoFar);
  doneSoFar += new Initter7().doInit(doneSoFar);
  doneSoFar += new Initter8().doInit(doneSoFar);
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
// intLit2 ::= !"0" digit++
(134<<16)+1,
// intLit2 ::= "0"
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
// comment1Printable ::= {" ".."~"}
(151<<16)+1,
// comment1Printable ::= {9}
(151<<16)+1,
// comment2Printable ::= eol
(154<<16)+1,
// comment2Printable ::= !"*" comment1Printable
(154<<16)+1,
// comment2Printable ::= {9}
(154<<16)+1,
// comment2Printable ::= "*" !"/"
(154<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(137<<16)+1,
// digit ::= {"0".."9"}
(138<<16)+1,
// ws ::= {9 " "}
(156<<16)+1,
// ws ::= eol
(156<<16)+1,
// ws ::= comment
(156<<16)+1,
// eol ::= {10}
(155<<16)+1,
// eol ::= {13} {10}
(155<<16)+2,
// eol ::= {13} !10
(155<<16)+1,
// eol ::= {12}
(155<<16)+1,
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
// comment ::= "/" "*" comment2Printable** "*" "/"
(157<<16)+5,
// comment ::= "/" "*" !comment2Printable "*" "/"
(157<<16)+4,
// comment ::= "/" "/" comment1Printable** eol
(157<<16)+4,
// comment ::= "/" "/" !comment1Printable eol
(157<<16)+3,
// token* ::= token* token
(168<<16)+2,
// token* ::= token
(168<<16)+1,
// comment1Printable** ::= comment1Printable* !comment1Printable
(167<<16)+1,
// digit++ ::= digit+ !digit
(136<<16)+1,
// comment2Printable** ::= comment2Printable* !comment2Printable
(166<<16)+1,
// idChar** ::= idChar* !idChar
(162<<16)+1,
// stringPrintable** ::= stringPrintable* !stringPrintable
(164<<16)+1,
// letter++ ::= letter+ !letter
(161<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(170<<16)+1,
// digit+ ::= digit+ digit
(170<<16)+2,
// letter+ ::= letter
(174<<16)+1,
// letter+ ::= letter+ letter
(174<<16)+2,
// idChar* ::= idChar* idChar
(172<<16)+2,
// idChar* ::= idChar
(172<<16)+1,
// comment2Printable* ::= comment2Printable* comment2Printable
(171<<16)+2,
// comment2Printable* ::= comment2Printable
(171<<16)+1,
// comment1Printable* ::= comment1Printable* comment1Printable
(169<<16)+2,
// comment1Printable* ::= comment1Printable
(169<<16)+1,
// stringPrintable* ::= stringPrintable* stringPrintable
(173<<16)+2,
// stringPrintable* ::= stringPrintable
(173<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= ws*
(163<<16)+1,
// $$2 ::= '"' ws*
(165<<16)+2,
// $$2 ::= '"'
(165<<16)+1,
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
153, // 9
158, // 10
-1, // 11
160, // 12
159, // 13
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
152, // "\"
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
"`/ ::= \"/\" !\"*\" !\"/\" ws*", // 273
"`/ ::= \"/\" !\"*\" !\"/\" ws*", // 274
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
"intLit2 ::= \"0\"", // 302
"idChar ::= letter", // 303
"idChar ::= digit", // 304
"idChar ::= \"_\"", // 305
"stringPrintable ::= {\" \"..\"!\"}", // 306
"stringPrintable ::= {\"#\"..\"[\"}", // 307
"stringPrintable ::= {\"]\"..\"~\"}", // 308
"charPrintable ::= {\" \"..\"&\"}", // 309
"charPrintable ::= {\"(\"..\"[\"}", // 310
"charPrintable ::= {\"]\"..\"~\"}", // 311
"comment1Printable ::= {\" \"..\"~\"}", // 312
"comment1Printable ::= {9}", // 313
"comment2Printable ::= eol", // 314
"comment2Printable ::= !\"*\" comment1Printable", // 315
"comment2Printable ::= {9}", // 316
"comment2Printable ::= \"*\" !\"/\"", // 317
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 318
"digit ::= {\"0\"..\"9\"}", // 319
"ws ::= {9 \" \"}", // 320
"ws ::= eol", // 321
"ws ::= comment", // 322
"eol ::= {10} registerNewline", // 323
"eol ::= {13} {10} registerNewline", // 324
"eol ::= {13} !10 registerNewline", // 325
"eol ::= {12} registerNewline", // 326
"CHARLIT ::= \"\'\" charPrintable \"\'\" ws*", // 327
"CHARLIT ::= \"\'\" charPrintable \"\'\" ws*", // 328
"ID ::= !reserved letter++ idChar** ws*", // 329
"ID ::= !reserved letter++ idChar** ws*", // 330
"ID ::= !reserved letter++ idChar** ws*", // 331
"ID ::= !reserved letter++ idChar** ws*", // 332
"STRINGLIT ::= \'\"\' stringPrintable** \'\"\' ws*", // 333
"STRINGLIT ::= \'\"\' stringPrintable** \'\"\' ws*", // 334
"comment ::= \"/\" \"*\" comment2Printable** \"*\" \"/\"", // 335
"comment ::= \"/\" \"*\" comment2Printable** \"*\" \"/\"", // 336
"comment ::= \"/\" \"/\" comment1Printable** eol", // 337
"comment ::= \"/\" \"/\" comment1Printable** eol", // 338
"token* ::= token* token", // 339
"token* ::= token* token", // 340
"comment1Printable** ::= comment1Printable* !comment1Printable", // 341
"digit++ ::= digit+ !digit", // 342
"comment2Printable** ::= comment2Printable* !comment2Printable", // 343
"idChar** ::= idChar* !idChar", // 344
"stringPrintable** ::= stringPrintable* !stringPrintable", // 345
"letter++ ::= letter+ !letter", // 346
"ws* ::= ws* ws", // 347
"ws* ::= ws* ws", // 348
"digit+ ::= digit", // 349
"digit+ ::= digit+ digit", // 350
"letter+ ::= letter", // 351
"letter+ ::= letter+ letter", // 352
"idChar* ::= idChar* idChar", // 353
"idChar* ::= idChar* idChar", // 354
"comment2Printable* ::= comment2Printable* comment2Printable", // 355
"comment2Printable* ::= comment2Printable* comment2Printable", // 356
"comment1Printable* ::= comment1Printable* comment1Printable", // 357
"comment1Printable* ::= comment1Printable* comment1Printable", // 358
"stringPrintable* ::= stringPrintable* stringPrintable", // 359
"stringPrintable* ::= stringPrintable* stringPrintable", // 360
"", // 361
"", // 362
"", // 363
"", // 364
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `/ ::= "/" !"*" !"/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `/ ::= "/" !"*" !"/" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 300: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 301: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 302: intLit2 ::= "0" @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 303: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 304: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 305: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 306: stringPrintable ::= {" ".."!"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 307: stringPrintable ::= {"#".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 308: stringPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 309: charPrintable ::= {" ".."&"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 310: charPrintable ::= {"(".."["} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 311: charPrintable ::= {"]".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 312: comment1Printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 313: comment1Printable ::= {9} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 314: comment2Printable ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 315: comment2Printable ::= !"*" comment1Printable @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 316: comment2Printable ::= {9} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 317: comment2Printable ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 318: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 319: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 320: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 321: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 322: ws ::= comment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 323: eol ::= {10} [registerNewline] @void
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 324: eol ::= {13} {10} [registerNewline] @void
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 325: eol ::= {13} !10 [registerNewline] @void
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 326: eol ::= {12} [registerNewline] @void
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 327: CHARLIT ::= "'" charPrintable "'" ws* @zero(char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 328: CHARLIT ::= "'" charPrintable "'" [ws*] @zero(char,char,char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 329: ID ::= !reserved letter++ idChar** $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 330: ID ::= !reserved letter++ idChar** [ws*] @text
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 331: ID ::= !reserved letter++ !idChar [idChar**] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 332: ID ::= !reserved letter++ !idChar [idChar**] [ws*] @text
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 333: STRINGLIT ::= '"' stringPrintable** $$2 @remove(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 334: STRINGLIT ::= '"' !stringPrintable [stringPrintable**] $$2 @remove(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 335: comment ::= "/" "*" comment2Printable** "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 336: comment ::= "/" "*" !comment2Printable [comment2Printable**] "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 337: comment ::= "/" "/" comment1Printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 338: comment ::= "/" "/" !comment1Printable [comment1Printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 339: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 340: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 341: comment1Printable** ::= comment1Printable* !comment1Printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 342: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 343: comment2Printable** ::= comment2Printable* !comment2Printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 344: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 345: stringPrintable** ::= stringPrintable* !stringPrintable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 346: letter++ ::= letter+ !letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 347: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 348: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 349: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 350: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 351: letter+ ::= letter @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 352: letter+ ::= letter+ letter @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 353: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 354: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 355: comment2Printable* ::= comment2Printable* comment2Printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 356: comment2Printable* ::= [comment2Printable*] comment2Printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
    },
    { // 357: comment1Printable* ::= comment1Printable* comment1Printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 358: comment1Printable* ::= [comment1Printable*] comment1Printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 359: stringPrintable* ::= stringPrintable* stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 360: stringPrintable* ::= [stringPrintable*] stringPrintable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 361: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 362: $$1 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 363: $$2 ::= '"' ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 364: $$2 ::= '"' [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "comment1Printable** ::= comment1Printable* !comment1Printable", // comment1Printable**
    "comment1Printable* ::=", // comment1Printable*
    "stringPrintable** ::= stringPrintable* !stringPrintable", // stringPrintable**
    "stringPrintable* ::=", // stringPrintable*
    "start ::= ws* token*", // start
    "comment2Printable** ::= comment2Printable* !comment2Printable", // comment2Printable**
    "ws* ::=", // ws*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "comment2Printable* ::=", // comment2Printable*
    "", // $$start
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // comment1Printable**
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // comment1Printable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // stringPrintable**
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // stringPrintable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // start
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // comment2Printable**
      ((10<<5)|0x6)/*nullProductionAction:10*/,
    },
    { // ws*
    },
    { // idChar**
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // comment2Printable*
    },
    { // $$start
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((86<<5)|0x5)/*methodCall:86*/,
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
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.remove(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 86: {
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
"String remove(char,List<Character>,char)",
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
    1,
    -1,
    -1,
    0,
    0,
    0,
    0,
    -1,
    -1,
    -1,
    1,
    1,
    0,
    1,
    1,
    0,
    1,
    0,
    1,
    1,
    0,
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
