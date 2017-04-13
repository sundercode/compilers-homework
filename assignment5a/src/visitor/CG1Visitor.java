package visitor;

import syntaxtree.*;

import java.util.*;

import errorMsg.*;
import java.io.*;
import java.awt.Point;

//the purpose here is to annotate things with their offsets:
// - formal parameters, with respect to the (callee) frame
// - instance variables, with respect to their slot in the object
// - methods, with respect to their slot in the v-table
public class CG1Visitor extends ASTvisitor {
	
	// Error message object
	ErrorMsg errorMsg;
	
	// IO stream to which we will emit code
	CodeStream code;
	
	// v-table offset of next method we encounter
	int currentMethodOffset;
	
	// offset in object of next "object" instance variable we encounter
	int currentObjInstVarOffset;
	
	// offset in object of next "data" instance variable we encounter
	int currentDataInstVarOffset;
	
	// stack-offset of next formal parameter we encounter
	int currentFormalVarOffset;
	
	// stack method tables for current class and all superclasses
	Stack<Vector<String>> superclassMethodTables;
	
	// current method table
	Vector<String> currentMethodTable;
	
	public CG1Visitor(ErrorMsg e, PrintStream out) {
		errorMsg = e;
		initInstanceVars(e, out);
	}
	
	private void initInstanceVars(ErrorMsg e, PrintStream out) {
		errorMsg = e;
		currentMethodOffset = 0;
		currentObjInstVarOffset = 0;
		currentDataInstVarOffset = 0;
		code = new CodeStream(out, e);
		superclassMethodTables = new Stack<Vector<String>>();
		superclassMethodTables.addElement(new Vector<String>());
	}

	///////////////// Helper Methods /////////////////////////////
	public int numMethods(ClassDecl cd) {
		//computes the number of total methods that cd has seen.
        int totalMethods = 0;

        totalMethods = cd.methodTable.size();

		//recursively finds the number of methods for its super class
        numMethods(cd.superLink);

        //then adds in the number of methods defined in cd that do not override
        // an existing method

        return totalMethods;
    }

	public void registerMethodInTable( MethodDecl md) {
		//stores the method's label in the currentMethodTable vector -- based on vtable offset

		//may require enlarging the currentMEthodTable, so that it has room for new entry
        if(md.pos < 0)
            currentMethodTable.add(md.vtableOffset - 1, md.name + "_" + md.classDecl.name);
        else
            currentMethodTable.add(md.vtableOffset - 1, "fcn_" + md.uniqueId + "_" + md.name);
	}

	public int wordsOnStackFrame(VarDeclList vdl) {
		//computes the # of words that vdl's variable declarations would place on the stack frame
        int numWords = 0;

        for(VarDecl v : vdl){
            numWords += wordsOnStackFrame(v.type);
        }

        return numWords;
	}

	public int wordsOnStackFrame(Type t) {
	    //computes # of words that an object of type t would grow the stack by if it was pushed
        //on the stack by if it were pushed onto the stack.
        //void = 0, abject/array/boolean = 1, int = 2

        if(t instanceof IntegerType){
            return 2;
        }
        else if(!(t instanceof VoidType)){
            return 1;
        }
        return 0;
    }

    public boolean isDataType(Type t) {
	    //returns true if and only if t represents the int or boolean type
        if(t instanceof IntegerType || t instanceof BooleanType){
            return true;
        }
        return false;
    }

    public boolean isObjectType(Type t) {
	    //returns true unless t represents one of the types int, boolean, or void
        if((t instanceof BooleanType || t instanceof IntegerType) || t instanceof VoidType){
            return false;
        }
        return true;
    }

    ///////////////// Helper Methods /////////////////////////////
}
