package parse;
import java.util.List;
import errorMsg.*;
import syntaxtree.*;

import javax.swing.plaf.nimbus.State;

public class MJGrammar
		implements wrangLR.runtime.MessageObject, wrangLR.runtime.FilePosObject {
	
	public static final boolean FILTER_GRAMMAR = true;
	
	// constructor
	public MJGrammar(ErrorMsg em) {
		errorMsg = em;
		topObject = null;
	}
	
	// error message object
	private ErrorMsg errorMsg;
	
	// object to be returned by the parser
	private Program topObject;

	// method for printing error message
	public void error(int pos, String msg) {
		errorMsg.error(pos, msg);
	}

	// method for printing warning message
	public void warning(int pos, String msg) {
		errorMsg.warning(pos, msg);
	}

	// method for converting file position to line/char position
	public String filePosString(int pos) {
		return errorMsg.lineAndChar(pos);
	}
	
	// method that registers a newline
	public void registerNewline(int pos) {
		errorMsg.newline(pos-1);
	}

	// returns the object produced by the parse
	public Program parseResult() {
		return topObject;
	}
	
	//===============================================================
	// start symbol
	//===============================================================

	//: <start> ::= ws* <program> =>
	public void topLevel(Program obj) {
		topObject = obj;
	}
	
	//================================================================
	// top-level program constructs ----> use syntaxtree folder to see all classes
	//================================================================

	//: <program> ::= # <class decl>+ =>
	public Program createProgram(int pos, List<ClassDecl> vec) {
		return new Program(pos, new ClassDeclList(vec));
	}

	//: <class decl> ::= `class # ID <extends ID>? `{ <decl in class>* `} =>
	public ClassDecl createClassDecl(int pos, String name, String ext, List<Decl> vec) {
	    if (ext == null) {
	        //make object the extended class
            return new ClassDecl(pos, name, "Object", new DeclList(vec));
        }
        //if the extends part is not null, we give it the class name it extends from
		return new ClassDecl(pos,name, ext, new DeclList(vec));
	}

	//EXTENDS and OBJECT implicit tree nodes
    //: <extends ID> ::= `extends ID => pass

    //: <decl in class> ::= <inst var decl> => pass
	//: <decl in class> ::= <method decl> => pass

    //================================================================
    // Method Declaration
    //================================================================

	//: <method decl> ::= `public `void # ID `( `) `{ <stmtDecl>* `} =>
	public Decl createMethodDeclVoid(int pos, String name, List<Statement> stmts) {
		return new MethodDeclVoid(pos, name, new VarDeclList(new VarDeclList()),
				new StatementList(stmts));
	}

	//: <method decl> ::= `public `void # ID <formalList> `{ <stmtDecl>* `} =>
    public Decl createMethodDeclVoidParams(int pos, String name, VarDeclList formalLst,
                                           List<Statement> stmtLst) {
	    return new MethodDeclVoid(pos, name, formalLst, new StatementList(stmtLst));
    }

    //: <method decl> ::= `public <type> # ID `( `) `{ <stmtDecl>* `return <exp>`; `} =>
    public Decl createMethodDevlNonVoid(Type t, int pos, String name, List<Statement> stmtLst, Exp e) {
	    return new MethodDeclNonVoid(pos, t, name, new VarDeclList(new VarDeclList()), new StatementList(stmtLst), e);
    }

	//: <method decl> ::= `public <type> # ID <formalList> `{ <stmtDecl>* `return <exp> `; `} =>
    public Decl createMethodDeclParams(Type t, int pos, String name, VarDeclList formalLst,
                                       List<Statement> stmtList, Exp e) {
	    return new MethodDeclNonVoid(pos, t, name, formalLst, new StatementList(stmtList), e);
    }

    //================================================================
    // Type Declaration
    //================================================================

	//: <type> ::= # `int =>
	public Type intType(int pos) {
		return new IntegerType(pos);
	}
	//: <type> ::= # `boolean =>
	public Type booleanType(int pos) {
		return new BooleanType(pos);
	}
	//: <type> ::= # ID =>
	public Type identifierType(int pos, String name) {
		return new IdentifierType(pos, name);
	}
	//: <type> ::= # <type> <empty bracket pair> =>
	public Type newArrayType(int pos, Type t, Object dummy) {
		return new ArrayType(pos, t);
	}

	//: <empty bracket pair> ::= `[ `] => null

	//================================================================
	// statement-level program constructs
	//================================================================

	//: <stmt> ::= <assign> `; => pass

    //: <stmt> ::= # <callExp> `; =>
    public Statement createExpStmt(int pos, Exp cexp) {
	    return new CallStatement(pos, (Call)cexp);
    }

    //: <stmt> ::= # `break `; =>
    public Statement createBreak(int pos) {
	    return new Break(pos);
    }
	
	//: <stmt> ::= # `{ <stmtDecl>* `} =>
	public Statement newBlock(int pos, List<Statement> sl) {
		return new Block(pos, new StatementList(sl));
	}

	//: <stmtDecl> ::= <local var decl> `; => pass
    //: <stmtDecl> ::= <stmt> => pass

    //: <stmt> ::= # `; =>
    public Statement emptyStatement(int pos) {
        return new Block(pos, new StatementList());
    }

    //If statements
    //: <stmt> ::= # `if `( <exp> `) <stmt> # `else <stmt> =>
    public Statement newIfElse( int ifpos, Exp e, Statement st1, int epos, Statement st2) {
        return new If(ifpos, e, st1, st2);
    }

    //: <stmt> ::= # `if `( <exp> `) <stmt> # !`else =>
    public Statement newIfNoElse(int ifpos, Exp e, Statement st1, int epos) {
	    //treat the no-else like a new block statement
	    return new If(ifpos, e, st1, new Block(epos, new StatementList()));
    }

    //for loop
    //: <stmt> ::= # `for `( <forLoop1>? `; <exp>? `; <forLoop2>? `) # <stmt> =>
    public Statement newFor(int pos, Statement st1, Exp e, Statement st2, int pos2, Statement body) {

	    //body of the loop
        StatementList statements = new StatementList();
        statements.add(body);

        //second param
        StatementList body2 = new StatementList();
        //add all of the previous statements to be looked at in the innermost section
        body2.addAll(statements);

        Statement stmt2 = st2;
        if( stmt2 == null) {
            //make a new block representing the operation on the loop
            stmt2 = new Block(pos, new StatementList());
        }
        body2.add(stmt2);

        //implicit while block, goes in the body
        StatementList whileBlock = new StatementList();

        Exp exp = e;
        if (e == null){
            //always evaluate true if left blank
            exp = new True(pos2);
        }
        whileBlock.add(new While(pos2, exp, new Block(pos2, body2)));

        //first parameter goes in the block
        StatementList param1 = new StatementList();
        Statement stmt1 = st1;

        if (st1 == null) {
            stmt1 = new Block(pos, new StatementList());
        }
        param1.add(stmt1);
        param1.addAll(whileBlock);

        return new Block(pos, param1);
    }

    //for loop helpers
    //: <forLoop1> ::= <local var decl> => pass
    //: <forLoop1> ::= <assign> => pass

    //: <forLoop1> ::= # <callExp> =>
    public Statement forLoopInit(int pos, Exp e) {
	    return new CallStatement(pos, (Call)e);
    }

    //: <forLoop2> ::= <assign> => pass
    //: <forLoop2> ::= # <callExp> =>
    public Statement callToStatement(int pos, Exp e) {
	    return new CallStatement(pos, (Call)e);
    }

    //while statement
    //: <stmt> ::= # `while `( <exp> `) <stmt> =>
    public Statement newWhile(int pos, Exp e, Statement stbody) {
	    return new While(pos, e, stbody);
    }

    //================================================================
    // assignments
    //================================================================

    //: <assign> ::= <exp> # `= <exp> =>
    public Statement assign(Exp lhs, int pos, Exp rhs) {
        return new Assign(pos, lhs, rhs);
    }

    //: <assign> ::= # `++ ID =>
    public Statement assignPrefixPlus(int pos, String name) {
	    IdentifierExp ID = new IdentifierExp(pos, name);
	    return new Assign(pos, ID, new Plus(pos, ID, new IntegerLiteral(pos, 1)));
	}

	//: <assign> ::= ID # `++ =>
    public Statement assignPostPlus(String name, int pos) {
	    IdentifierExp ID = new IdentifierExp(pos, name);
	    return new Assign(pos, ID, new Plus(pos, ID, new IntegerLiteral(pos, 1)));
    }

    //: <assign> ::= # `-- ID =>
    public Statement assignPreMinus(int pos, String name) {
	    IdentifierExp ID = new IdentifierExp(pos, name);
	    return new Assign(pos, ID, new Minus(pos, ID, new IntegerLiteral(pos, 1)));
    }

    //: <assign> ::= ID # `-- =>
    public Statement assignPostMinus(String name, int pos) {
	    IdentifierExp ID = new IdentifierExp(pos, name);
        return new Assign(pos, ID, new Minus(pos, ID, new IntegerLiteral(pos, 1)));
    }

    //: <local var decl> ::= <type> # ID `= <exp> =>
    public Statement localVarDecl(Type t, int pos, String name, Exp init) {
        return new LocalDeclStatement(pos, new LocalVarDecl(pos, t, name, init));
    }

    //: <inst var decl> ::= <type> # ID `; =>
    public Decl instVarDecl(Type t, int pos, String name) {
	    return new InstVarDecl(pos, t, name);
    }

    //: <formalList> ::= `( <type> # ID <paramList>* `) =>
    public VarDeclList newFormalList(Type t, int pos, String name, List<VarDecl> params) {
	    //add the right decls to our param list
	    params.add(new FormalDecl(pos, t, name));

	    return new VarDeclList(params);
    }

    //: <paramList> ::= `, <type> # ID =>
    public VarDecl newParamList(Type t, int pos, String name) {
	    return new FormalDecl(pos, t, name);
    }


	//================================================================
	// expressions
	//================================================================

	//low priority is exp8, gets higher as we go down

	//: <exp> ::= <exp8> => pass

    //ExpLists
    //: <expList> ::= # <exp> <expPartial>* =>
    public ExpList newExpList(int pos, Exp e, List<Exp> exps) {
        exps.add(e);
        return new ExpList(exps);
    }

    //: <expPartial> ::= `, <exp> => pass

    //callExps
    //: <callExp> ::= # ID `( <expList>?`) =>
    public Exp newThisCallExp(int pos, String name, ExpList exps) {
        if (exps == null) {
            exps = new ExpList();
        }
        return new Call(pos, new This(pos), name, exps);
    }
    //: <callExp> ::= <exp1> # `. ID `( <expList>? `) =>
    public Exp newCallExp(Exp e, int pos, String name, ExpList exps ) {
        if (exps == null) {
            exps = new ExpList();
        }
        return new Call(pos, e, name, exps);
    }

    //: <callExp> ::= # `super `. ID `( <expList>? `) =>
    public Exp newSuperCallExp(int pos, String name, ExpList exps) {
        if (exps == null) {
            exps = new ExpList();
        }
        return new Call(pos, new Super(pos), name, exps);
    }

    //: <exp8> ::= <exp8> # `|| <exp7> =>
    public Exp newOr(Exp e1, int pos, Exp e2) { return new Or(pos, e1, e2); }

    //: <exp8> ::= <exp7> => pass

    //: <exp7> ::= <exp7> # `&& <exp6> =>
    public Exp newAnd(Exp e1, int pos, Exp e2) { return new And(pos, e1, e2); }

    //: <exp7> ::= <exp6> => pass

    //: <exp6> ::= <exp6> # `!= <exp5> =>
    public Exp newBangEquals(Exp e1, int pos, Exp e2) {
        return new Not(pos, new Equals(pos, e1, e2));
    }

    //: <exp6> ::= <exp6> # `== <exp5> =>
    public Exp newEquals(Exp e1, int pos, Exp e2) {
        return new Equals(pos, e1, e2);
    }

    //: <exp6> ::= <exp5> => pass

    //: <exp5> ::= <exp5> # `> <exp4> =>
    public Exp newGreaterThan(Exp e1, int pos, Exp e2) { return new GreaterThan(pos, e1, e2); }

    //: <exp5> ::= <exp5> # `< <exp4> =>
    public Exp newLessThan(Exp e1, int pos, Exp e2) { return new LessThan(pos, e1, e2); }

    //: <exp5> ::= <exp5> # `>= <exp4> =>
    public Exp newGreaterEquals(Exp e1, int pos, Exp e2) {
        return new Not(pos, new LessThan(pos, e1, e2));
    }

    //: <exp5> ::= <exp5> # `<= <exp4> =>
	public Exp newLessEquals(Exp e1, int pos, Exp e2) {
    	return new Not(pos, new GreaterThan(pos, e1, e2));
	}

	//: <exp5> ::= <exp5> # `instanceof ID =>
    public Exp newInstanceOf(Exp e1, int pos, String var) {
        return new InstanceOf(pos, e1, new IdentifierType(pos, var));
    }

	//: <exp5> ::= <exp4> => pass
	
	//: <exp4> ::= <exp4> # `+ <exp3> =>
	public Exp newPlus(Exp e1, int pos, Exp e2) {
		return new Plus(pos, e1, e2);
	}

    //: <exp4> ::= <exp4> # `- <exp3> =>
    public Exp newMinus(Exp e1, int pos, Exp e2) {
        return new Minus(pos, e1, e2);
    }
	//: <exp4> ::= <exp3> => pass

	//: <exp3> ::= <exp3> # `* <exp2> =>
	public Exp newTimes(Exp e1, int pos, Exp e2) {
		return new Times(pos, e1, e2);
	}

    //: <exp3> ::= <exp3> # `/ <exp2> =>
	public Exp newDivide(Exp e1, int pos, Exp e2) { return new Divide(pos, e1, e2); }

	//: <exp3> ::= <exp3> # `% <exp2> =>
    public Exp newRemainder(Exp e1, int pos, Exp e2) { return new Remainder(pos, e1, e2); }
	//: <exp3> ::= <exp2> => pass

	//: <exp2> ::= <cast exp> => pass

	//: <cast exp> ::= # `( <type> `) <cast exp> =>
	public Exp newCast(int pos, Type t, Exp e) {
		return new Cast(pos, t, e);
	}
	//: <cast exp> ::= # `( <type> `) <exp1> => Exp newCast(int, Type, Exp)

    //: <exp2> ::= <unary exp> => pass

	//: <unary exp> ::= # `- <unary exp> =>
	public Exp newUnaryMinus(int pos, Exp e) {
		return new Minus(pos, new IntegerLiteral(pos, 0), e);
	}

    //: <unary exp> ::= # `+ <unary exp> =>
    public Exp newUnaryPlus(int pos, Exp e) {
        return new Plus(pos, new IntegerLiteral(pos, 0), e);
    }

    //: <unary exp> ::= # `! <unary exp> =>
	public Exp newUnaryNot(int pos, Exp e) { return new Not(pos, e); }

	//: <unary exp> ::= <exp1> => pass

    //: <exp1> ::= !<cast exp> `( <exp> `) => pass

    //: <exp1> ::= <callExp> => pass

	//: <exp1> ::= # ID  =>
	public Exp newIdentfierExp(int pos, String name) {
		return new IdentifierExp(pos, name);
	}

	//: <exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `] =>
	public Exp newArrayLookup(Exp e1, int pos, Exp e2) {
		return new ArrayLookup(pos, e1, e2);
	}

	//: <exp1> ::= # INTLIT =>
	public Exp newIntegerLiteral(int pos, int n) {
		return new IntegerLiteral(pos, n);
	}

    //: <exp1> ::= # STRINGLIT =>
    public Exp newStringLiteral(int pos, String str) { return new StringLiteral(pos, str); }

    //: <exp1> ::= # CHARLIT =>
    public Exp newCharLiteral(int pos, int charVal) { return new IntegerLiteral(pos, charVal); }

    //: <exp1> ::= # `null =>
    public Exp newNull(int pos) { return new Null(pos); }

    //: <exp1> ::= # `true =>
    public Exp newTrue(int pos) { return new True(pos); }

    //: <exp1> ::= # `false =>
    public Exp newFalse(int pos) { return new False(pos); }

    //: <exp1> ::= # `this =>
    public Exp newThis(int pos) {return new This(pos); }

	//: <exp1> ::= # <exp1> `. ID =>
	public Exp newInstVarAccess( int pos, Exp e, String name) {
		return new InstVarAccess(pos, e, name);
	}

	//: <exp1> ::= # `new ID `( `) =>
	public Exp newObject( int pos, String name ) {
		return new NewObject(pos, new IdentifierType(pos, name));
	}

	//: <exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>** =>
	public Exp createArray(Type t, int pos, Exp e1, List<Object> objs) {
	    //make the new array
        ArrayType arr = new ArrayType(pos, t);

        //for each object in the list, match the types
        for (int i = 0; i < objs.size(); i++) {
            arr = new ArrayType(pos, arr);
        }
        return new NewArray(pos, arr, e1);
    }


	//================================================================
	// Lexical grammar for filtered language begins here: DO NOT MODIFY
	// ANYTHING BELOW THIS, UNLESS YOU REPLACE IT WITH YOUR ENTIRE
	// LEXICAL GRAMMAR, and set the constant FILTER_GRAMMAR (defined
	// near the top of this file) to false.
	//================================================================

	//: letter ::= {"a".."z" "A".."Z"} => pass
	//: letter128 ::= {225..250 193..218} =>
	public char sub128(char orig) {
		return (char)(orig-128);
	}
	//: digit ::= {"0".."9"} => pass
	//: digit128 ::= {176..185} => char sub128(char)
	//: any ::= {0..127} => pass
	//: any128 ::= {128..255} => char sub128(char)
	//: ws ::= " "
	//: ws ::= {10} registerNewline
	//: registerNewline ::= # => void registerNewline(int)
	//: `boolean ::= "#bo" ws*
	//: `class ::= "#cl" ws*
	//: `extends ::= "#ex" ws*
	//: `void ::= "#vo" ws*
	//: `int ::= "#it" ws*
	//: `while ::= "#wh" ws*
	//: `if ::= '#+' ws*
	//: `else ::= "#el" ws*
	//: `for ::= "#fo" ws*
	//: `break ::= "#br" ws*
	//: `this ::= "#th" ws*
	//: `false ::= '#fa' ws*
	//: `true ::= "#tr" ws*
	//: `super ::= "#su" ws*
	//: `null ::= "#nu" ws*
	//: `return ::= "#re" ws*
	//: `instanceof ::= "#in" ws*
	//: `new ::= "#ne" ws*
	//: `abstract ::= "#ab" ws*
	//: `assert ::= "#as" ws*
	//: `byte ::= "#by" ws*
	//: `case ::= "#ce" ws*
	//: `catch ::= "#ca" ws*
	//: `char ::= "#ch" ws*
	//: `const ::= "#ct" ws*
	//: `continue ::= "#co" ws*
	//: `default ::= "#de" ws*
	//: `do ::= "#-" ws*
	//: `double ::= "#do" ws*
	//: `enum ::= "#en" ws*
	//: `final ::= "#fi" ws*
	//: `finally ::= "#fy" ws*
	//: `float ::= "#fl" ws*
	//: `goto ::= "#go" ws*
	//: `implements ::= "#is" ws*
	//: `import ::= "#im" ws*
	//: `interface ::= "#ie" ws*
	//: `long ::= "#lo" ws*
	//: `native ::= "#na" ws*
	//: `package ::= "#pa" ws*
	//: `private ::= "#pr" ws*
	//: `protected ::= "#pd" ws*
	//: `public ::= "#pu" ws*
	//: `short ::= "#sh" ws*
	//: `static ::= '#sc' ws*
	//: `strictfp ::= "#st" ws*
	//: `switch ::= "#sw" ws*
	//: `synchronized ::= "#sy" ws*
	//: `throw ::= "#tw" ws*
	//: `throws ::= "#ts" ws*
	//: `transient ::= "#tt" ws*
	//: `try ::= "#ty" ws*
	//: `volatile ::= "#ve" ws*
	
	//: `! ::=  "!" ws* => void
	//: `!= ::=  "@!" ws* => void
	//: `% ::= "%" ws* => void
	//: `&& ::= "@&" ws* => void
	//: `* ::= "*" ws* => void
	//: `( ::= "(" ws* => void
	//: `) ::= ")" ws* => void
	//: `{ ::= "{" ws* => void
	//: `} ::= "}" ws* => void
	//: `- ::= "-" ws* => void
	//: `+ ::= "+" ws* => void
	//: `= ::= "=" ws* => void
	//: `== ::= "@=" ws* => void
	//: `[ ::= "[" ws* => void
	//: `] ::= "]" ws* => void
	//: `|| ::= "@|" ws* => void
	//: `< ::= "<" ws* => void
	//: `<= ::= "@<" ws* => void
	//: `, ::= "," ws* => void
	//: `> ::= ">"  !'=' ws* => void
	//: `>= ::= "@>" ws* => void
	//: `: ::= ":" ws* => void
	//: `. ::= "." ws* => void
	//: `; ::= ";" ws* => void
	//: `++ ::= "@+" ws* => void
	//: `-- ::= "@-" ws* => void
	//: `/ ::= "/" ws* => void

	
	//: ID ::= letter128 ws* => text
	//: ID ::= letter idChar* idChar128 ws* => text
	
	//: INTLIT ::= {"1".."9"} digit* digit128 ws* => 
	public int convertToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last);
	}
	//: INTLIT ::= digit128 ws* => 
	public int convertToInt(char c) {
		return Integer.parseInt(""+c);
	}
	//: INTLIT ::= "0" hexDigit* hexDigit128 ws* => 
	public int convert16ToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last, 16);
	}
	//: STRINGLIT ::= '@"' ws* =>
	public String emptyString(char x, char xx) {
		return "";
	}
	//: STRINGLIT ::= '"' any* any128 ws* =>
	public String string(char x, List<Character> mid, char last) {
		return ""+mid+last;
	}
	//: CHARLIT ::= "'" any ws* =>
	public int charVal(char x, char val) {
		return val;
	}
	
	//: idChar ::= letter => pass
	//: idChar ::= digit => pass
	//: idChar ::= "_" => pass
	//: idChar128 ::= letter128 => pass
	//: idChar128 ::= digit128 => pass
	//: idChar128 ::= {223} => 
	public char underscore(char x) {
		return '_';
	}
	//: hexDigit ::= {"0".."9" "a".."z" "A".."Z"} => pass
	//: hexDigit128 ::= {176..185 225..230 193..198} => char sub128(char)

}

