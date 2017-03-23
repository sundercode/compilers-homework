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
			errorMsg.error(pos, "Incompatible types.");
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
        else if (src instanceof IdentifierType) {
		    IdentifierType srcCast = (IdentifierType) src;
		    IdentifierType targetCast = (IdentifierType) target;
		    //use the helper method isSuperClass to check for links in the class
		    if (isSuperClass(srcCast.link, targetCast.link)){
		        return true;
            }
        }
        //return error message otherwise
        if (pos >= 0) {
            errorMsg.error(pos, "Incompatible types on assignment.");
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
	private boolean matchTypesCompare(Type t1, Type t2, int pos) {

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

}
	
