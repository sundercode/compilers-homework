package visitor;

import syntaxtree.*;

import errorMsg.*;

import javax.jnlp.IntegrationService;
import java.io.*;
import java.text.Normalizer;

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

	/* Helper Methods */
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

	/* End Helper Methods */

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
    public Object visitNull(Null n) {
        code.indent(n);

        code.emit(n, "subu $sp, $sp, 4");
        stackHeight += 4;
        code.emit(n, "sw $zero, ($sp)");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitTrue(True n) {
        code.indent(n);

        code.emit(n, "subu $sp, $sp, 4");
        stackHeight += 4;
        code.emit(n, "li $t0,1"); //load 1 instead of the zero
        code.emit(n, "sw $t0, ($sp)");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitFalse(False n) {
        code.indent(n);

        code.emit(n, "subu $sp, $sp, 4");
        stackHeight += 4;
        code.emit(n, "sw $zero, ($sp)");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitNot(Not n) {
	    code.indent(n);

	    //generate subexpression
	    n.exp.accept(this);

	    code.emit(n, "lw $t0, ($sp)");
	    code.emit(n, "xor $t0, $t0, 1");
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
    public Object visitTimes(Times n){
        code.indent(n);

        //set left and right expressions
        n.left.accept(this);
        n.right.accept(this);

        code.emit(n, "lw $t0, ($sp)");
        code.emit(n, "lw $t1, 8($sp)");
        code.emit(n, "mult $t0, $t1");
        code.emit(n, "mflo $t0");
        code.emit(n, "addu $sp, $sp, 8");
        stackHeight -= 8;
        code.emit(n, "sw $t0, ($sp)");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitDivide(Divide n){
        code.indent(n);

        //set left and right expressions
        n.left.accept(this);
        n.right.accept(this);

        code.emit(n, "jal divide");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitRemainder(Remainder n){
        code.indent(n);

        //set left and right expressions
        n.left.accept(this);
        n.right.accept(this);

        code.emit(n, "jal remainder");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitEquals(Equals n){
        code.indent(n);

        //set left and right expressions
        n.left.accept(this);
        n.right.accept(this);

        //if integerType
        if (n.left.type instanceof IntegerType){
            code.emit(n, "lw $t0, ($sp)");
            code.emit(n, "lw $t1, 8($sp)");
            code.emit(n, "seq $t0, $t0, $t1");
            code.emit(n, "addu $sp, $sp, 12");
            stackHeight -= 12;
            code.emit(n, "sw $t0, ($sp)");
        }
        else {
            code.emit(n, "lw $t0, ($sp)");
            code.emit(n, "lw $t1, 4($sp)");
            code.emit(n, "seq $t0, $t0, $t1");
            code.emit(n, "addu $sp, $sp, 4");
            stackHeight -= 4;
            code.emit(n, "sw $t0, ($sp)");
        }

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitGreaterThan(GreaterThan n){
        code.indent(n);

        //set left and right expressions
        n.left.accept(this);
        n.right.accept(this);

        code.emit(n, "lw $t0, ($sp)");
        code.emit(n, "lw $t1, 8($sp)");
        code.emit(n, "sgt $t0, $t1, $t0");
        code.emit(n, "addu $sp, $sp, 12");
        stackHeight -= 12;
        code.emit(n, "sw $t0, ($sp)");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitLessThan(LessThan n){
        code.indent(n);

        //set left and right expressions
        n.left.accept(this);
        n.right.accept(this);

        code.emit(n, "lw $t0, ($sp)");
        code.emit(n, "lw $t1, 8($sp)");
        code.emit(n, "slt $t0, $t1, $t0");
        code.emit(n, "addu $sp, $sp, 12");
        stackHeight -= 12;
        code.emit(n, "sw $t0, ($sp)");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitAnd(And n){
        code.indent(n);

        //set left expression
        n.left.accept(this);

        code.emit(n, "lw $t0, ($sp)");
        code.emit(n, "beq $t0, $zero, skip_"+n.uniqueId);
        code.emit(n, "addu $sp, $sp, 4");
        stackHeight -= 4;

        //generate right expression
        n.right.accept(this);
        code.emit(n, "skip_"+n.uniqueId+":");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitOr(Or n){
        code.indent(n);

        //set left expression
        n.left.accept(this);

        code.emit(n, "lw $t0, ($sp)");
        code.emit(n, "bne $t0, $zero, skip_"+n.uniqueId);
        code.emit(n, "addu $sp, $sp, 4");
        stackHeight -= 4;

        //generate right expression
        n.right.accept(this);
        code.emit(n, "skip_"+n.uniqueId+":");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitArrayLength(ArrayLength n) {
        code.indent(n);

        n.exp.accept(this);
        code.emit(n, "lw $t0, ($sp)");
        code.emit(n, "beq $t0, $zero, nullPtrException");
        code.emit(n, "lw $t0, -4($t0)");
        code.emit(n, "sw $s5, ($sp)");
        code.emit(n, "subu $sp, 4");
        stackHeight += 4;
        code.emit(n, "sw $t0, ($t0)");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitArrayLookup(ArrayLookup n) {
        code.indent(n);

        //set arrExp and idExp fields
        n.arrExp.accept(this);
        n.idxExp.accept(this);

        code.emit(n, "lw $t0, 8($sp)");
        code.emit(n, "beq $t0, $zero, nullPtrException");
        code.emit(n, "lw $t1, -4($t0)");
        code.emit(n, "lw $t2, ($sp)");

        code.emit(n, "bgeu $t2, $t1, arrayIndexOutOfBounds");
        code.emit(n, "sll $t2, $t2, 2");
        code.emit(n, "addu $t2, $t2, $t0");
        code.emit(n, "lw $t0, ($t2)");

        if(n.arrExp.type instanceof IntegerType){
            code.emit(n, "sw $t0, 4($sp)");
            code.emit(n, "sw $s5, 8($sp)");
        }
        else {
            code.emit(n, "sw $t0, 8($sp)");
            code.emit(n, "addu $sp, $sp, 8");
            stackHeight -= 8;
        }

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitInstVarAccess(InstVarAccess n) {
        code.indent(n);

        //generate expression code
        n.exp.accept(this);

        //determine offset of variable
        code.emit(n, "lw $t0, ($sp)");
        code.emit(n, "beq $t0, $zero, nullPtrException");
        code.emit(n, "lw $t0, "+n.varDec.offset+"($t0)");

        if (n.type instanceof IntegerType){
            code.emit(n, "subu, $sp, $sp, 4");
            stackHeight += 4;
            code.emit(n, "sw $s5, 4($sp)");
            code.emit(n, "sw $t0, ($sp)");
        }
        else {
            code.emit(n, "sw $t0, ($sp)");
        }

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitInstanceOf(InstanceOf n) {
        code.indent(n);

        //generate expression code
        n.exp.accept(this);

        code.emit(n, "la $t0, CLASS_"+n.checkType.toString2());
        code.emit(n, "la $t0, CLASS_END_"+n.checkType.toString2());
        code.emit(n, "jal instanceOf");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitCast(Cast n) {
        code.indent(n);

        //generate expression code
        n.exp.accept(this);

        code.emit(n, "la $t0, CLASS_"+n.castType.toString2());
        code.emit(n, "la $t0, CLASS_END_"+n.castType.toString2());
        code.emit(n, "jal checkCast");

        code.unindent(n);
        return null;
    }


    @Override
    public Object visitNewObject(NewObject n) {
        code.indent(n);

        //get inst var count
        int instVars = n.objType.link.numDataInstVars;
        //data vars
        int dataVars = n.objType.link.numObjInstVars;

        code.emit(n, "li $s6, "+(dataVars+1));
        code.emit(n, "li $s7, "+instVars);
        code.emit(n, "jal newObject");

        stackHeight += 4;

        code.emit(n, "la $t0, CLASS_"+n.objType.name);
        code.emit(n, "sw $t0, -12($s7)");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitCall(Call n) { //treat all objects as supers for now
        code.indent(n);

        int currStackHeight = stackHeight;

        //generate obj expression
        n.obj.accept(this);

        for(Exp e: n.parms) {
            //accept all parameter expressions in the call
            e.accept(this);
        }

        //super version
        if(n.obj instanceof Super){
            //if method is a library method,
            if (n.methodLink.pos < 0) {
                code.emit(n, "jal " + n.methName + "_"+ n.methodLink.classDecl.name);
            }
            else {
                code.emit(n, "jal fcn_"+n.methodLink.uniqueId+"_"+ n.methName);
            }
        }
        else {
            code.emit(n,"lw $t0, "+(n.methodLink.thisPtrOffset-4)+"($sp)");
            code.emit(n,"beq $t0, $zero, nullPtrException");
            code.emit(n,"lw $t0, -12($t0)");
            code.emit(n,"lw $t0, "+(n.methodLink.vtableOffset*4)+"($t0)");
            code.emit(n,"jalr $t0");
        }

        //set stack height to saved, plus offset for type
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
    public Object visitCallStatement(CallStatement n) {
        code.indent(n);

        //generate code for exp
        n.callExp.accept(this);

        //pop unused return val off of stack
        if ( n.callExp.type instanceof IntegerType){
            code.emit(n, "addu $sp, $sp, 8");
            stackHeight -= 8;
        }
        else if (!(n.callExp.type instanceof VoidType)) {
            code.emit(n, "addu $sp, $sp, 4");
            stackHeight -= 4;
        }

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitBlock(Block n) {
        code.indent(n);

        //save stack height
        int currStackHeight = stackHeight;

        //generate code for all statements
        for (Statement s: n.stmts){
            s.accept(this);
        }

        if(stackHeight != currStackHeight){
            //if theyre not the same, take the difference off the stack
            int diff = currStackHeight - stackHeight;
            code.emit(n, "addu $sp "+diff);
        }

        stackHeight = currStackHeight;

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitIf(If n) {
        code.indent(n);

        //generate code for exp
        n.exp.accept(this);
        code.emit(n, "lw $t0, ($sp)");
        code.emit(n, "addu $sp, $sp, 4");
        stackHeight -= 4;
        code.emit(n, "beq $t0, $zero, if_else_"+n.uniqueId);

        //true statement
        n.trueStmt.accept(this);
        code.emit(n, "j if_done_"+n.uniqueId);
        code.emit(n, "if_else_"+n.uniqueId+":");

        //false statement
        n.falseStmt.accept(this);
        code.emit(n, "if_done_"+n.uniqueId+":");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitWhile(While n) {
        code.indent(n);

        n.stackHeight = stackHeight;

        code.emit(n, "j while_enter_"+n.uniqueId);
        code.emit(n, "while_top_"+n.uniqueId+":");

        //body
        n.body.accept(this);
        code.emit(n, "while_enter_"+n.uniqueId+":");

        //test exp
        n.exp.accept(this);
        code.emit(n, "lw $t0, ($sp)");
        code.emit(n, "addu $sp, $sp, 4");
        stackHeight -= 4;
        code.emit(n, "bne $t0, $zero, while_top_"+n.uniqueId);
        code.emit(n, "break_target_"+n.uniqueId+":");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitBreak(Break n) {
        code.indent(n);

        //compute stack height diff
        int stackDiff = stackHeight - n.breakLink.stackHeight;

        if (stackDiff != 0){
            code.emit(n, "addu $sp, "+stackDiff);
        }

        code.emit(n, "j break_target_"+n.breakLink.uniqueId);

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitAssign(Assign n) {
        code.indent(n);

        //target is an identifier exp
        if( n.lhs instanceof IdentifierExp){
            //generate code for RHS exp
            n.rhs.accept(this);
            code.emit(n, "lw $t0, ($sp)");

            if (((IdentifierExp) n.lhs).link instanceof InstVarDecl) {
                code.emit(n, "sw $t0, "+((IdentifierExp) n.lhs).link.offset+"($s2)");
            }
            else if (((IdentifierExp) n.lhs).link instanceof FormalDecl){
                code.emit(n, "sw $t0," + (((FormalDecl)((IdentifierExp)n.lhs).link).offset + stackHeight) + "($sp)");
            }
            else if (((IdentifierExp) n.lhs).link instanceof LocalVarDecl){
                code.emit(n, "sw $t0," + (((LocalVarDecl)((IdentifierExp)n.lhs).link).offset + stackHeight) + "($sp)");
            }

            if(n.lhs.type instanceof IntegerType) {
                code.emit(n, "addu $sp, $sp, 8");
                stackHeight -= 8;
            }
            else {
                code.emit(n, "addu $sp, $sp, 4");
                stackHeight -= 4;
            }
        } //LHS is an inst var access
        else if (n.lhs instanceof InstVarAccess){
            //generate expression and rhs
            ((InstVarAccess) n.lhs).exp.accept(this);
            n.rhs.accept(this);

            code.emit(n, "lw $t0, ($sp)");
            if(((InstVarAccess) n.lhs).type instanceof IntegerType) {
                code.emit(n, "lw $t1, 8($sp)");
            } else {
                code.emit(n, "lw $t1, 4($sp)");
            }

            code.emit(n, "beq $t1, $zero, nullPtrException");

            //determine offset within object
            code.emit(n, "sw $t0, "+((InstVarAccess) n.lhs).varDec.offset+"($t1)");

            if(n.lhs.type instanceof IntegerType) {
                code.emit(n, "addu $sp, $sp, 12");
                stackHeight -= 12;
            } else {
                code.emit(n, "addu $sp, $sp, 8");
                stackHeight -= 8;
            }

        } // LHS is an ArrayLookup
        else if (n.lhs instanceof ArrayLookup) {
            //array exp, array index, and RHS
            ((ArrayLookup) n.lhs).arrExp.accept(this);
            ((ArrayLookup) n.lhs).idxExp.accept(this);
            n.rhs.accept(this);

            code.emit(n, "lw $t0,($sp)");
            if(n.rhs.type instanceof IntegerType){
                code.emit(n, "lw $t1,16($sp)");
            }
            else{
                code.emit(n, "lw $t1,12($sp)");
            }

            code.emit(n, "beq $t1,$zero,nullPtrException");

            if(n.rhs.type instanceof IntegerType) {
                code.emit(n, "lw $t2,8($sp)");
            }
            else {
                code.emit(n, "lw $t2,4($sp)");
            }
            code.emit(n, "lw $t3,-4($t1)");
            code.emit(n, "bgeu $t2,$t3,arrayIndexOutOfBounds");
            code.emit(n, "sll $t2,$t2,2");
            code.emit(n, "addu $t2,$t2,$t1");
            code.emit(n, "sw $t0,($t2)");
            if(n.rhs.type instanceof IntegerType)
                code.emit(n, "addu $sp,$sp,20");
            else
                code.emit(n, "addu $sp,$sp,16");
        }
        code.unindent(n);
        return null;
    }

    @Override
    public Object visitLabel(Label n) {
        code.indent(n);

        //stack height to match enclosing switch
        stackHeight = n.enclosingSwitch.stackHeight;

        code.emit(n, "case_label_"+n.uniqueId+":");

        code.unindent(n);
        return null;
    }

    @Override
    public Object visitIdentifierExp(IdentifierExp n) {
        code.indent(n);

        if (n.link instanceof InstVarDecl) {
            code.emit(n, "lw $t0, "+n.link.offset+"($s2)");
        }
        else {
            //assume we have localVarDecl
            int stackDepth = stackHeight + n.link.offset;
            code.emit(n, "lw $t0, " + stackDepth + "($sp)");
        }

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

        //generate code for body (aka statements!)
        for(Statement s : md.stmts){
            s.accept(this);
        }

        //space for any local vars created
        int returnAddress = stackHeight + stackTopRel;
        int thisPointer = stackHeight + md.thisPtrOffset;
        code.emit(md, "lw $ra,"+returnAddress+"($sp)");
        code.emit(md, "lw $s2,"+thisPointer+"($sp)");

        //set amount to pop off stack based on parameters
        int toPop = stackHeight + 8;

        for (VarDecl formal: md.formals) {
            if (((FormalDecl)formal).type instanceof IntegerType) {
                toPop += 8;
            } else {
                toPop += 4;
            }
        }
        //pop the calculated # off of stack (do we adjust stack height?)
        code.emit(md, "addu $sp,$sp,"+ toPop);
        code.emit(md, "jr $ra");

        code.unindent(md);
        return null;
    }

    @Override
    public Object visitMethodDeclNonVoid(MethodDeclNonVoid md) {
        code.indent(md);

        code.emit(md, ".globl fcn_"+md.uniqueId+"_"+md.name);
        code.emit(md, "fcn_"+md.uniqueId+"_"+md.name+":");
        code.emit(md, "subu $sp,$sp,4");
        code.emit(md, "sw $s2,($sp)");

        int stackTopRel = md.thisPtrOffset;
        code.emit(md, "lw $s2, "+ stackTopRel +"($sp)");
        code.emit(md, "sw $ra, "+ stackTopRel +"($sp)");

        stackHeight = 0;

        //generate code for body (aka statements!)
        for(Statement s : md.stmts){
            s.accept(this);
        }
        //return statement
        md.rtnExp.accept(this);

        //space for any local vars created
        int returnAddress = stackHeight + stackTopRel;
        int thisPointer = stackHeight;
        code.emit(md, "lw $ra,"+returnAddress+"($sp)");
        code.emit(md, "lw $s2,"+thisPointer+"($sp)");

        //set amount to pop off stack based on parameters
        code.emit(md, "lw $t0, ($sp)");

        if(md.rtnType instanceof IntegerType) {
            code.emit(md, "sw $t0, "+(returnAddress - 4)+"($sp)");
            code.emit(md, "sw $s5, "+returnAddress+"($sp)");
        } else {
            code.emit(md, "sw $s5, "+returnAddress+"($sp)");
        }

        int toPop = stackHeight + 8;

        for (VarDecl formal: md.formals) {
            if (((FormalDecl)formal).type instanceof IntegerType) {
                toPop += 8;
            } else {
                toPop += 4;
            }
        }

        //set the pop amount based on the return type
        if(md.rtnType instanceof IntegerType) {
            toPop -= 8;
        } else {
            toPop -= 4;
        }

        //pop the calculated # off of stack (do we adjust stack height?)
        code.emit(md, "addu $sp,$sp,"+ toPop);
        code.emit(md, "jr $ra");

        code.unindent(md);
        return null;
    }
}


	
