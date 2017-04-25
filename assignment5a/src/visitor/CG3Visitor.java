package visitor;

import syntaxtree.*;

import errorMsg.*;
import java.io.*;

public class CG3Visitor extends ASTvisitor {

	// the purpose here is to annotate things with their offsets:
	// - formal parameters, with respect to the (callee) frame
	// - local variables, with respect to the frame
	// - instance variables, with respect to their slot in the object
	// - methods, with respect to their slot in the v-table
	// - while statements, with respect to the stack-size at the time
	//   of loop-exit
	
	// Error message object
	ErrorMsg errorMsg;
	
	// IO stream to which we will emit code
	CodeStream code;

	// current stack height
	int stackHeight;
	
	// for constant evaluation
	ConstEvalVisitor conEvalVis;
	
	public CG3Visitor(ErrorMsg e, PrintStream out) {
		errorMsg = e;
		initInstanceVars(out);
		conEvalVis = new ConstEvalVisitor();
	}
	
	private void initInstanceVars(PrintStream out) {
		code = new CodeStream(out, errorMsg);
		stackHeight = 0;
	}

	@Override
    public Object visitLocalVarDecl(LocalVarDecl n) {
        code.indent(n);

        //set up the offset and the exp inside
        n.initExp.accept(this);
        n.offset = -stackHeight;

        code.unindent(n);
        return null;
    }

	@Override
    public Object visitThis(This n) {
	    code.indent(n);

	    code.emit(n, "subu $sp, $sp, 4");
	    stackHeight += 4;
	    code.emit(n, "sw $s2, ($sp)");

	    code.unindent(n);
	    return null;
    }

    @Override
    public Object visitSuper(Super n) {
        code.indent(n);

        code.emit(n, "subu $sp, $sp, 4");
        stackHeight += 4;
        code.emit(n, "sw $s2, ($sp)");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitStringLiteral(StringLiteral n) {
	    code.indent(n);

	    code.emit(n, "subu $sp, $sp, 4");
	    stackHeight+= 4;
	    code.emit(n, "la $t0, strLit_" + n.uniqueCgRep.uniqueId);
	    code.emit(n, "sw $t0, ($sp)");

	    code.unindent(n);
	    return null;
    }

    @Override
    public Object visitIntegerLiteral(IntegerLiteral n) {
	    code.indent(n);

	    code.emit(n, "subu $sp, $sp, 8");
	    stackHeight += 8;
	    code.emit(n, "sw $s5, 4($sp)");
	    code.emit(n, "li $t0, "+ n.val);
	    code.emit(n, "sw $t0, ($sp)");

	    code.unindent(n);
	    return null;
    }

    @Override
    public Object visitPlus(Plus n) {
	    code.indent(n);

	    //set left and right expressions
        n.left.accept(this);
        n.right.accept(this);

	    code.emit(n, "lw $t0, ($sp)");
	    code.emit(n, "lw $t1, 8($sp)");
	    code.emit(n, "addu $t0, $t0, $t1");
	    code.emit(n, "addu $sp, $sp, 8");
	    stackHeight -= 8;
	    code.emit(n, "sw $t0, ($sp)");

	    code.unindent(n);
	    return null;
    }

    @Override
    public Object visitMinus(Minus n){
	    code.indent(n);

        //set left and right expressions
        n.left.accept(this);
        n.right.accept(this);

        code.emit(n, "lw $t0, ($sp)");
        code.emit(n, "lw $t1, 8($sp)");
        code.emit(n, "subu $t0, $t1, $t0");
        code.emit(n, "addu $sp, $sp, 8");
        stackHeight -= 8;
        code.emit(n, "sw $t0, ($sp)");

	    code.unindent(n);
	    return null;
    }

    @Override
    public Object visitNewObject(NewObject n) {
        code.indent(n);

        //just push a zero onto the stack for now
        code.emit(n, "subu $sp, $sp, 4");
        stackHeight += 4;
        code.emit(n, "sw $zero, ($sp)");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitCall(Call n) { //treat all objects as supers for now
        code.indent(n);

        int currStackHeight = stackHeight;

        n.obj.accept(this);
        for(Exp e: n.parms) {
            //accept all parameter expressions in the call
            e.accept(this);
        }

        //if method is a library method,
        if (n.methodLink.pos < 0) {
            code.emit(n, "jal " + n.methName + "_"+ n.methodLink.classDecl.name);
        }
        else {
            code.emit(n, "jal fcn_"+n.methodLink.uniqueId+"_"+ n.methName);
        }

        if(n.type instanceof VoidType) {
            stackHeight = currStackHeight;
        }
        else if(n.type instanceof IntegerType) {
            stackHeight = currStackHeight + 8;
        }
        else {
            stackHeight = currStackHeight + 4;
        }

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitIdentifierExp(IdentifierExp n) {
        code.indent(n);

        //assume we have localVarDecl
        int stackDepth = stackHeight + n.link.offset;
        code.emit(n, "lw $t0, "+ stackDepth+"($sp)");

        //get the types, work from there
        if (n.type instanceof IntegerType) {
            code.emit(n, "subu $sp, $sp, 8");
            stackHeight += 8;
            code.emit(n, "sw $s5, 4($sp)");
            code.emit(n, "sw $t0, ($sp)");
        }
        else {
            code.emit(n, "subu $sp, $sp, 4");
            stackHeight += 4;
            code.emit(n, "sw $t0, ($sp)");
        }

        code.unindent(n);
        return null;
    }

    //visitProgram
    @Override
    public Object visitProgram(Program n) {
        code.indent(n);

        code.emit(n, ".text");
        code.emit(n, ".globl main");
        code.emit(n, "main:");
        code.emit(n, "#initialize registers, etc.");
        code.emit(n, "jal vm_init");
        stackHeight = 0;
        n.mainStatement.accept(this); //code for the mainStatement

        //emit dummy labels for CLASS_String and CLASS_Object
        code.emit(n, "CLASS_String:");
        code.emit(n, "CLASS_Object:");

        code.emit(n, "#exit program");
        code.emit(n, "li $v0, 10");
        code.emit(n, "syscall");

        //generate all class decls
        for( ClassDecl c: n.classDecls) {
            c.accept(this);
        }

        //flush the codestream --> do we need to indent?
        code.flush();
        return null;
    }

    //visitMethodDeclVoid
    @Override
    public Object visitMethodDeclVoid(MethodDeclVoid md) {
        code.indent(md);

        code.emit(md, ".globl fcn_"+md.uniqueId+"_"+md.name);
        code.emit(md, "fcn_"+md.uniqueId+"_"+md.name+":");
        code.emit(md, "subu $sp,$sp,4");
        code.emit(md, "sw $s2,($sp)");

        int stackTopRel = md.thisPtrOffset;
        code.emit(md, "lw $s2, "+ stackTopRel +"($sp)");
        code.emit(md, "sw $ra, "+ stackTopRel +"($sp)");

        stackHeight = 0;

        //generate code for body (aka statements!) - localvardecls?
        for(Statement s : md.stmts){
            s.accept(this);
        }

        //space for any local vars created
        int returnAddress = stackHeight + stackTopRel;
        int thisPointer = stackHeight + md.thisPtrOffset;
        code.emit(md, "lw $ra,"+returnAddress+"($sp)");
        code.emit(md, "lw $s2,"+thisPointer+"($sp)");

        //right now, we are just popping off two words from the stack
        int toPop = stackHeight + 8;


        code.emit(md, "addu $sp,$sp,"+ toPop);
        code.emit(md, "jr $ra");

        code.unindent(md);
        return null;
    }
}


	
