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

	//computes the number of total methods that cd has seen.
    //TODO: this method needs to be finished!!
	public int numMethods(ClassDecl cd) {

	    if (cd == null) {
	        return 0;
        }

        int totalMethods = 0;

        totalMethods = cd.methodTable.size();//methods on current class

		//recursively finds the number of methods for its super class
        int superClassMethods = numMethods(cd.superLink);

        //then adds in the number of methods defined in cd that do not override existing in super
        for (String name : cd.superLink.methodTable.keySet()) {
            //see if its not in our current class table
            if (!(cd.methodTable.containsKey(name))) {
                //increment the totalMethods
                totalMethods ++;
            }
        }
        return totalMethods;
    }

	//stores the method's label in the currentMethodTable vector -- based on vtable offset
	public void registerMethodInTable( MethodDecl md) {

		//may require enlarging the currentMethodTable, so that it has room for new entry
        if(md.pos < 0) {
            currentMethodTable.add(md.vtableOffset - 1, md.name + "_" + md.classDecl.name);
        }
        else{
            currentMethodTable.add(md.vtableOffset - 1, "fcn_" + md.uniqueId + "_" + md.name);
        }

        //TODO: grow the currentMethodTable?? please check this
	}

	//computes the # of words that vdl's variable declarations would place on the stack frame
	public int wordsOnStackFrame(VarDeclList vdl) {
        int numWords = 0;

        for(VarDecl v : vdl){
            numWords += wordsOnStackFrame(v.type);
        }

        return numWords;
	}

	/*
	computes # of words that an object of type t would grow the stack by
	void = 0, abject/array/boolean = 1, int = 2
	*/
	public int wordsOnStackFrame(Type t) {

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

    private ClassDecl findClassDecl (ClassDecl cd) {
	    if (cd.superLink == null) return cd;
	    else return findClassDecl(cd.superLink);
    }

    @Override
    public Object visitProgram(Program n) {
	    code.emit(n, ".data");
	    //traverse classDecl
        findClassDecl(n.classDecls.elementAt(0)).accept(this);

        code.flush();
        return null;
    }

    @Override
    public Object visitClassDecl(ClassDecl cd) {

	    //TODO: check how this is supposed to be called
	    currentMethodTable = new Vector<String>(superclassMethodTables.peek());
	    currentMethodOffset = 1 + currentMethodTable.size(); //numMethods(cd.superLink);

        //set data and object offsets
        if(cd.superLink == null) {
            currentDataInstVarOffset = -16;
            currentObjInstVarOffset = 0;
        } else {
            currentDataInstVarOffset = -16 - 4*(cd.superLink.numDataInstVars);
            currentObjInstVarOffset = 4*(cd.superLink.numObjInstVars);
        }

        //super call, subnode traversal
        super.visitClassDecl(cd);

        cd.numDataInstVars = (-16-currentDataInstVarOffset)/4;
        cd.numObjInstVars = currentObjInstVarOffset/4;

        code.emit(cd, "CLASS_"+cd.name+":");

        if (cd.superLink == null) {
            code.emit(cd, ".word 0");
        } else {
            code.emit(cd, ".word CLASS_"+cd.superName);
        }
        //loop through currentmethodtable vector to emit each method address
        for (String addr : currentMethodTable) {
            code.emit(cd,".word"+ addr);
        }

        //push method table onto the super method tables
        superclassMethodTables.push(currentMethodTable);
        cd.subclasses.accept(this); //subclasses

        superclassMethodTables.pop();
        code.emit(cd, "CLASS_END_"+cd.name+":");

        return null;
    }

    @Override
    public Object visitMethodDecl(MethodDecl md) {

	    md.thisPtrOffset = 4*(1+wordsOnStackFrame(md.formals));
	    currentMethodOffset = md.thisPtrOffset;

	    //subclasses
        super.visitMethodDecl(md);

        if(md.superMethod == null) {
            md.vtableOffset = currentMethodOffset;
            currentMethodOffset++;
        } else {
            md.vtableOffset = md.superMethod.vtableOffset;
        }

        //method labels
        registerMethodInTable(md);

	    return null;
    }

    @Override
    public Object visitInstVarDecl(InstVarDecl n) {
        super.visitInstVarDecl(n);

        //int or boolean
        if(isDataType(n.type)) {
            n.offset = currentDataInstVarOffset;
            currentDataInstVarOffset = currentDataInstVarOffset - 4;
        } else if (isObjectType(n.type)) { //object/array types
            n.offset = currentObjInstVarOffset;
            currentObjInstVarOffset = currentObjInstVarOffset + 4;
        }
        return null;
    }

    @Override
    public Object visitFormalDecl(FormalDecl n) {
        super.visitFormalDecl(n);

        //set the offset based on type in parameters
        if (n.type instanceof IntegerType) {
            currentFormalVarOffset = currentFormalVarOffset - 8;
        } else {
            currentFormalVarOffset = currentFormalVarOffset - 4;
        }

        n.offset = currentFormalVarOffset;
        return null;
    }
}
