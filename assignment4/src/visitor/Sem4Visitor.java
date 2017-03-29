package visitor;

import syntaxtree.*;

import java.util.*;

import errorMsg.*;
// The purpose of this class is to do type-checking and related
// actions.  These include:
// - evaluate the type for each expression, filling in the 'type'
//   link for each
// - ensure that each expression follows MiniJava's type rules (e.g.,
//   that the arguments to '*' are both integer, the argument to
//   '.length' is an array, etc.)
// - ensure that each method-call follows Java's type rules:
//   - there exists a method for the given class (or a superclass)
//     for the receiver's object type
//   - the method has the correct number of parameters
//   - the type of each actual parameter is compatible with that
//     of its corresponding formal parameter
// - ensure that for each instance variable access (e.g., abc.foo),
//   there is an instance variable defined for the given class (or
//   in a superclass
//   - sets the 'varDec' link in the InstVarAccess to refer to the
//     method
// - ensure that the RHS expression in each assignment statement is
//   type-compatible with its corresponding LHS
//   - also checks that the LHS is an lvalue
// - ensure that if a method with a given name is defined in both
//   a subclass and a superclass, that they have the same parameters
//   (with identical types) and the same return type
// - ensure that the declared return-type of a method is compatible
//   with its "return" expression
// - ensuring that the type of the control expression for an if- or
//   while-statement is boolean
public class Sem4Visitor extends ASTvisitor {

	ClassDecl currentClass;
	IdentifierType currentClassType;
	IdentifierType currentSuperclassType;
	ErrorMsg errorMsg;
	Hashtable<String,ClassDecl> globalSymTab;

	//convenient class types
	BooleanType theBoolType = new BooleanType(-1);
	IntegerType theIntType = new IntegerType(-1);
	NullType theNullType = new NullType(-1);
	VoidType theVoidType = new VoidType(-1);
	IdentifierType theStringType;


	public Sem4Visitor(Hashtable<String,ClassDecl> globalSymTb, ErrorMsg e) {
		globalSymTab = globalSymTb;
		errorMsg = e;
		initInstanceVars();
	}

	private void initInstanceVars() {
		currentClass = null;
	}

	// HELPER METHODS TO ASSIST WITH IMPLEMENTATION

	/*
	one that returns a boolean to tell us whether the types match, prints error message
	by passing in file position. suppress this error if either of the types are null

	This group below helps with these tasks.
	*/
	private boolean matchTypesExact(Type have, Type need, int pos) {
		//checks whether 2 type objects represent exactly the same type (strict equivalence)

		//if either type is null, return false
		if (have == null || need == null) {
			return false;
		}

		//if they are equal, return true,
		if (have.equals(need)) {
			return true;
		}

		// otherwise print an "incompatible" error and return false
		else {
			errorMsg.error(pos, "Incompatible types: "+ have+ " and "+ need);
			return false;
		}
	}

	private boolean matchTypesAssign(Type src, Type target, int pos) {
		//checks whether src is assignment compatible with target.

		if (src == null || target == null) {
			return false;
		}
		//return false if VoidType
		else if (src instanceof VoidType || target instanceof VoidType) {
			errorMsg.error(pos, "Cannot assign to or from VoidType");
			return false;
		}
		//if the types are == (using .equals) return true
		else if (src.equals(target)) {
			return true;
		}
		//if src is NullType, return true if the target is an identifierType or ArrayType
		else if (src instanceof NullType) {
			if (target instanceof IdentifierType || target instanceof ArrayType) {
				return true;
			}
		}
		//if src is an ArrayType and target is IdentifierType with name Object, return true
		else if (src instanceof ArrayType && target instanceof IdentifierType) {
		    if (((IdentifierType) target).name.equals("Object")) {
		        return true;
            }
        }
		//if src is an IDType, return true if target is a superclass (direct or indirect)
        else if (src instanceof IdentifierType && target instanceof IdentifierType) {
		    IdentifierType srcCast = (IdentifierType) src;
		    IdentifierType targetCast = (IdentifierType) target;
		    //use the helper method isSuperClass to check for links in the class
		    if (isSuperClass(srcCast.link, targetCast.link)){
		        return true;
            }
        }
        //return error message otherwise
        if (pos >= 0) {
            errorMsg.error(pos, "Incompatible types on assignment: "+ src.toString()+ " and "+ target.toString());
        }
        return false;
	}

	private boolean isSuperClass(ClassDecl superClass, ClassDecl target) {
	    if (superClass == null) {
	        return false;
        }
        else if (superClass == target) return true;
	    else {
	        //recurse up the class links if there are a lot
	        return isSuperClass(superClass.superLink, target);
        }
    }

	//checks whether t1, t2, can be compared using == or !=
	private boolean matchTypesEqCompare(Type t1, Type t2, int pos) {

		//if either type is null, return false.
		if (t1 == null || t2 == null) {
			return false;
		}
		// call matchTypes Assign
		if (matchTypesAssign(t1, t2, pos) || matchTypesAssign(t2, t1, -pos)) {
			return true;
		}

		else {
            if (pos >= 0) {
                errorMsg.error(pos, "Incompatible types" + t1.toString() + " and " + t2.toString());
            }
            return false;
		}
	}

	private InstVarDecl instVarLookup(String name, ClassDecl clas, int pos, String msg) {
	    if (clas == null) {
	        if (pos >= 0) errorMsg.error(pos, msg);
	        return null;
        }
        else if (clas.instVarTable.containsKey(name)) {
	        return clas.instVarTable.get(name);
        }
        else {
	        return instVarLookup(name, clas.superLink, pos, msg);
        }
    }

    private InstVarDecl instVarLookup(String name, Type t, int pos, String msg) {
	    if (t == null) {
	        return null;
        }

        else if (!(t instanceof IdentifierType)) {
	        errorMsg.error(pos, msg);
	        return null;
        }
        else {
	        return instVarLookup(name, globalSymTab.get(((IdentifierType) t).name), pos, msg);
        }
    }

    private MethodDecl methodLookup(String name, ClassDecl clas, int pos, String msg) {
        if (clas == null) {
            if (pos >= 0) errorMsg.error(pos, msg);
            return null;
        }
        //check if the method table contains the name we are looking for, get that method
        else if (clas.methodTable.containsKey(name)) {
            return clas.methodTable.get(name);
        }
        else {
            return methodLookup(name, clas.superLink, pos, msg);
        }
    }

    private MethodDecl methodLookup(String name, Type t, int pos, String msg) {
        if (t == null) {
            return null;
        }

        else if (!(t instanceof IdentifierType)) {
            errorMsg.error(pos, msg);
            return null;
        }
        else {
            return methodLookup(name, globalSymTab.get(((IdentifierType) t).name), pos, msg);
        }
    }

    private Type returnTypeFor( MethodDecl md) {
        if (md instanceof MethodDeclVoid) {
            return theVoidType;
        }
        //we know md is non void now, so cast and return the rtnType
        return ((MethodDeclNonVoid) md).rtnType;
    }

	/// BELOW THIS POINT WE ARE VISITING THE NODES IN THE AST AND ADDING THEIR TYPES ///
	@Override
	public Object visitIntegerLiteral(IntegerLiteral n) {
		Object visitor = super.visitIntegerLiteral(n);

		n.type = theIntType;
		return visitor;
	}

	@Override
	public Object visitNull(Null n) {
		Object visitor = super.visitNull(n);

		n.type = theNullType;
		return visitor;
	}

	@Override
	public Object visitStringLiteral(StringLiteral n) {
		Object visitor = super.visitStringLiteral(n);

		n.type = theStringType;
		return visitor;
	}

	@Override
    public Object visitTrue(True n) {
	    Object visitor = super.visitTrue(n);

	    n.type = theBoolType;
	    return visitor;
    }

    @Override
    public Object visitFalse(False n) {
	    Object visitor = super.visitFalse(n);

	    n.type = theBoolType;
	    return visitor;
    }

    @Override
    public Object visitIdentifierExp(IdentifierExp n) {
	    Object visitor = super.visitIdentifierExp(n);

	    n.type = n.link.type;
	    return visitor;
    }

    @Override
    public Object visitThis(This n) {
	    Object visitor = super.visitThis(n);

	    n.type = currentClassType;
	    return visitor;
    }

    @Override
    public Object visitSuper(Super n){
	    Object visitor = super.visitSuper(n);

	    n.type = currentSuperclassType;
	    return visitor;
    }

    @Override
    public Object visitPlus(Plus n) {
        Object visitor = super.visitPlus(n);

        //check that both operands match exact types
        matchTypesExact(n.left.type, theIntType, n.left.pos);
        matchTypesExact(n.right.type, theIntType, n.right.pos);

        n.type = theIntType;
        return visitor;
    }

    @Override
    public Object visitMinus(Minus n) {
        Object visitor = super.visitMinus(n);

        //check that both operands match exact types
        matchTypesExact(n.left.type, theIntType, n.left.pos);
        matchTypesExact(n.right.type, theIntType, n.right.pos);

        n.type = theIntType;
        return visitor;
    }

    @Override
    public Object visitTimes(Times n) {
        Object visitor = super.visitTimes(n);

        //check that both operands match exact types
        matchTypesExact(n.left.type, theIntType, n.left.pos);
        matchTypesExact(n.right.type, theIntType, n.right.pos);

        n.type = theIntType;
        return visitor;
    }

    @Override
    public Object visitDivide(Divide n) {
        Object visitor = super.visitDivide(n);

        //check that both operands match exact types
        matchTypesExact(n.left.type, theIntType, n.left.pos);
        matchTypesExact(n.right.type, theIntType, n.right.pos);

        n.type = theIntType;
        return visitor;
    }

    @Override
    public Object visitRemainder(Remainder n) {
        Object visitor = super.visitRemainder(n);

        //check that both operands match exact types
        matchTypesExact(n.left.type, theIntType, n.left.pos);
        matchTypesExact(n.right.type, theIntType, n.right.pos);

        n.type = theIntType;
        return visitor;
    }

    @Override
    public Object visitGreaterThan(GreaterThan n) {
        Object visitor = super.visitGreaterThan(n);

        matchTypesExact(n.left.type, theIntType, n.left.pos);
        matchTypesExact(n.right.type, theIntType, n.right.pos);

        n.type = theBoolType;
        return visitor;
    }

    @Override
    public Object visitLessThan(LessThan n) {
        Object visitor = super.visitLessThan(n);

        matchTypesExact(n.left.type, theIntType, n.left.pos);
        matchTypesExact(n.right.type, theIntType, n.right.pos);

        n.type = theBoolType;
        return visitor;
    }

    @Override
    public Object visitEquals(Equals n) {
        Object visitor = super.visitEquals(n);

        matchTypesEqCompare(n.left.type, n.right.type, n.pos);

        n.type = theBoolType;
        return visitor;

    }

    @Override
    public Object visitNot(Not n){
        Object visitor = super.visitNot(n);

        matchTypesExact(n.type, theBoolType, n.pos);

        n.type = theBoolType;
        return visitor;
    }

    @Override
    public Object visitAnd(And n) {
        Object visitor = super.visitAnd(n);

        matchTypesExact(n.left.type, theBoolType, n.pos);
        matchTypesExact(n.right.type, theBoolType, n.pos);

        n.type = theBoolType;
        return visitor;
    }

    @Override
    public Object visitOr(Or n) {
        Object visitor = super.visitOr(n);

        matchTypesExact(n.left.type, theBoolType, n.pos);
        matchTypesExact(n.right.type, theBoolType, n.pos);

        n.type = theBoolType;
        return visitor;
    }

    @Override
    public Object visitArrayLength(ArrayLength n) {

        Object visitor = super.visitArrayLength(n);

        //check that n.exp is not null, and is ArrayType
        if (n.exp.type == null || !(n.exp.type instanceof ArrayType)){
            errorMsg.error(n.pos, "ArrayType needed");
        }

        n.type = theIntType;
        return visitor;
    }

    @Override
    public Object visitArrayLookup(ArrayLookup n) {
        Object visitor = super.visitArrayLookup(n);

        //check idExp field is not null and exactly matches theIntType
        matchTypesExact(n.idxExp.type, theIntType, n.pos);

        if(n.arrExp.type == null || !(n.arrExp.type instanceof ArrayType)) {
            errorMsg.error(n.pos, "ArrayLookup with invalid type");
        }

        n.type = n.arrExp.type;
        return visitor;
    }

    @Override
    public Object visitInstVarAccess(InstVarAccess n) {
        Object visitor = super.visitInstVarAccess(n);

        //if exp field is null return visitor
        if (n.exp.type == null){
            return visitor;
        }

        n.varDec = instVarLookup(n.varName,n.exp.type, n.pos, "Instance Variable " + n.varName + " not defined" );

        if (n.varDec != null) {
            n.type = n.varDec.type;
        }

        return visitor;
    }

    @Override
    public Object visitCast(Cast n) {
        Object visitor = super.visitCast(n);

        //check assignment compatibility
        boolean assign = matchTypesAssign(n.exp.type, n.castType, -1);

        if (!assign) {
            errorMsg.error(n.pos, "Cast expression " + n.castType + " not compatible with " + n.exp.type);
        }

        n.type = n.castType;
        return visitor;
    }

    @Override
    public Object visitInstanceOf(InstanceOf n) {
        Object visitor = super.visitInstanceOf(n);

        matchTypesAssign(n.exp.type, n.checkType, -1);

        n.type = theBoolType;
        return visitor;
    }

    @Override
    public Object visitNewObject(NewObject n) {
        Object visitor = super.visitNewObject(n);

        n.type = n.objType;

        return visitor;
    }

    @Override
    public Object visitNewArray(NewArray n) {
        Object visitor = super.visitNewArray(n);

        boolean match = matchTypesExact(n.sizeExp.type, theIntType, -1);
        if (!match) {
            errorMsg.error(n.pos, "New Array size declaration type not an integer");
        }

        n.type = n.objType;
        return visitor;
    }

    @Override
    public Object visitCall(Call n) {
        Object visitor = super.visitCall(n);

        //return if obj type is null
        if(n.obj.type == null) return visitor;

        //set methodLink
        n.methodLink = methodLookup(n.methName, n.obj.type, n.pos, "Method "+ n.methName+ " invalid");
        if(n.methodLink == null) return visitor;

        //check # of parameters in the call matches formal # parameters
        if(n.parms.size() != n.methodLink.formals.size()) {
            errorMsg.error(n.pos, "Method parameter length in " + n.methName + " does not match with formal declaration");
        }
        else {
            //check actual parameter in the call is assignment compatible w formal parameters
            for (int i = 0; i < n.parms.size(); i++) {
                matchTypesAssign(n.parms.get(i).type, n.methodLink.formals.get(i).type, n.pos);
            }
        }

        //set type field to ne methods declared return type
        if(n.methodLink instanceof MethodDeclVoid){
            n.type = theVoidType;
        } else {
            n.type = ((MethodDeclNonVoid) n.methodLink).rtnType;
        }
        return visitor;

    }

    @Override
    public Object visitAssign(Assign n) {
        Object visitor = super.visitAssign(n);

        //check that LHS is an l-value
        if (!(n.lhs instanceof IdentifierExp || n.lhs instanceof InstVarAccess || n.lhs instanceof ArrayLookup)) {
            errorMsg.error(n.pos, "Assignment LHS not valid l-value.");
        }

        matchTypesAssign(n.rhs.type, n.lhs.type, n.pos);
        return visitor;
    }

    @Override
    public Object visitLocalVarDecl(LocalVarDecl n){
        Object visitor = super.visitLocalVarDecl(n);

        //check type of initialization exp
        boolean assign = matchTypesAssign(n.initExp.type, n.type, n.pos);
        if (!assign) {
            errorMsg.error(n.pos, "Invalid local variable statement " + n.initExp.type+ " with "+ n.type);
        }

        return visitor;
    }

    @Override
    public Object visitIf(If n) {
        Object visitor = super.visitIf(n);

        //check that condition exp is explicitly boolean
        matchTypesExact(n.exp.type, theBoolType, n.pos);

        return visitor;
    }

    @Override
    public Object visitWhile(While n) {
        Object visitor = super.visitWhile(n);

        //check that condition exp is explicitly boolean
        matchTypesExact(n.exp.type, theBoolType, n.pos);

        return visitor;
    }

    @Override
    public Object visitCase(Case n){
        Object visitor = super.visitCase(n);

        //check exp type matches int type
        matchTypesExact(n.exp.type, theIntType, n.pos);

        return visitor;
    }

    @Override
    public Object visitMethodDeclVoid(MethodDeclVoid n) {
        Object visitor = super.visitMethodDeclVoid(n);

        //check superclass method is also void
        MethodDecl md = methodLookup(n.name, n.classDecl.superLink, -1, "");
        if (md != null) {
            if (md instanceof MethodDeclNonVoid) {
                errorMsg.error(n.pos, "Method return type must match return type of method in Superclass");
            }

            //check # params match
            if (n.formals.size() != md.formals.size()){
                errorMsg.error(n.pos, "Method must match same # of parameters as "+ md.name);
            }
            else {
                //check type of each param matches
                for (int i = 0; i < n.formals.size(); i++) {
                    if(!(n.formals.get(i).type.equals(md.formals.get(i).type))) {
                        errorMsg.error(n.pos, "Parameter type " + n.formals.get(i).type.toString() + " does not match super method param type "+ md.formals.get(i).type.toString() );
                    }
                }
            }
            n.superMethod = md;
        }
        return visitor;
    }

    @Override
    public Object visitMethodDeclNonVoid(MethodDeclNonVoid n) {
        Object visitor = super.visitMethodDeclNonVoid(n);

        //check return exp is assign compatible w declared rtn type
        if (!matchTypesAssign(n.rtnExp.type, n.rtnType, n.pos)) {
            errorMsg.error(n.pos, "Return type for method "+ n.name+ " must be of type "+ n.rtnType);
        }

        MethodDecl md = methodLookup(n.name, n.classDecl.superLink, -1, "");
        if(md != null){
            if(md instanceof MethodDeclVoid){
                errorMsg.error(n.pos, "Method return type must match return type of method in superclass");
            }
            if(n.formals.size() != md.formals.size()){
                errorMsg.error(n.pos, "Method must match same # of parameters as "+ md.name);
            }
            else{
                for(int i = 0; i < n.formals.size(); i++){
                    if(!n.formals.get(i).type.equals(md.formals.get(i).type))
                        errorMsg.error(n.pos, "Formal parameter type " + n.formals.get(i).toString() + " does not match " + md.formals.get(i).toString());
                }
            }

            if(md instanceof MethodDeclVoid || !(n.rtnType.equals(returnTypeFor(md)))){
                errorMsg.error(n.pos, "Method return type must match super method return type");
            }
            n.superMethod = md;
        }
        return visitor;
    }

    @Override
    public Object visitClassDecl(ClassDecl n) {
        currentClass = n;
        //set current class type to new Id type that refers to this class
        currentClassType = new IdentifierType(-1, n.name);
        //set link field to refer back to this classDecl object
        currentClassType.link = n;

        //set the supertype
        currentSuperclassType = new IdentifierType(-1, n.superName);
        currentSuperclassType.link = n.superLink;

        //traverse subnodes
        return super.visitClassDecl(n);
    }
}
