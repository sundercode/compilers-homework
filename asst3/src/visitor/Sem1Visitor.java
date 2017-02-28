package visitor;

import syntaxtree.*;
import java.util.*;
import errorMsg.*;
// The purpose of the Sem1Visitor class is to:
// - enter each class declaration into the global symbol table)
//   - duplicate class names are detected
// - enter each method declaration into the method symbol table
//   for its class
//   - duplicate method names for a class are detected
// - enter each instance variable declaration into the respective
//   instance-variable symbol table for its class
//   - duplicate instance variable names for a class are detected
// - all of the above are also done for the predefined classes
//   (Object, String and Lib)
public class Sem1Visitor extends ASTvisitor {
	
	public static final boolean doStringMethods = true;
	
	Hashtable<String,ClassDecl> globalSymTab;
	ClassDecl currentClass;
	ErrorMsg errorMsg;
	
	public Sem1Visitor(ErrorMsg e) {
		errorMsg = e;
		initInstanceVars();
		initGlobalSymTab();
	}
	
	public Hashtable<String,ClassDecl> getGlobalSymTab() {
		return globalSymTab;
	}

    public Object visitClassDecl(ClassDecl decl) {
        //add the class to the table
        addClass(globalSymTab, decl.name, decl);
        //mark this class as the current
        this.currentClass = decl;

        //call the super visit
        Object temp = super.visitClassDecl(decl);

        //add in the method and inst var tables?

        this.currentClass = null;
        return temp;

    }

    //helper method to add a class to the table
    //given a table, add the class decl
    private void addClass(Hashtable<String, ClassDecl> table, String className, ClassDecl decl) {
        //if we already see the classname throw an err
        if (table.containsKey(className)){
            errorMsg.error(decl.pos, "Error: There is already a class with this name");
        }

        //otherwise, insert this class into the table object
        table.put(className, decl);
    }

    //overrides method in ASTvisitor --> do we need to do this for void?
    public Object visitMethodDecl(MethodDecl m) {
        //match up the method name with our current class
        m.classDecl = this.currentClass;

        //throw error if we've seen the method before
        if (currentClass.methodTable.containsKey(m)) {
            errorMsg.error(m.pos, "Error: duplicate method name in class");
        }
        currentClass.methodTable.put(m.name, m);

        //since we dont want to override previous returned, give null
        return null;
    }

    //overrides method in InhVisitor
    public Object visitInstVarDecl(InstVarDecl i) {

        //throw error if we've seen this guy before
        if (currentClass.instVarTable.containsKey(i.name)) {
            errorMsg.error(i.pos, "Error: duplicate inst var name in class");
        }
        currentClass.instVarTable.put(i.name, i);
        return null;
    }


	//initialize the global symbol table, using a java Hashtable object
	protected void initGlobalSymTab() {
		ClassDecl classObjectDecl = createClass("Object", "");
		ClassDecl classStringDecl = createClass("String", "Object");
		ClassDecl classLibDecl = createClass("Lib", "Object");
		ClassDecl classRunMainDecl = createClass("RunMain", "Object");

		//init the data array and object array classes
		ClassDecl classDataArrayDecl = createClass("_DataArray", "Object");
		ClassDecl classObjectArrayDecl = createClass("_ObjectArray", "Object");

		//fill in method declarations for object type
		addDummyMethod(classObjectDecl, "equals", "boolean", new String[]{"Object"});

		//fill in methods for our Lib classes
	    addDummyMethod(classLibDecl, "readLine", "String", new String[]{});
	    addDummyMethod(classLibDecl, "readInt", "int", new String[]{});
	    addDummyMethod(classLibDecl, "readChar", "int", new String[]{});
		addDummyMethod(classLibDecl, "printStr", "void", new String[]{"String"});
		addDummyMethod(classLibDecl, "printBool", "void", new String[]{"boolean"});
		addDummyMethod(classLibDecl, "printInt", "void", new String[]{"int"});
		addDummyMethod(classLibDecl, "intToString", "String",
				new String[]{"int"});
		addDummyMethod(classLibDecl,"intToChar", "String",
				new String[]{"int"});

		//fill in our string methods
		addDummyMethod(classStringDecl, "equals", "boolean", new String[]{"Object"});
		addDummyMethod(classStringDecl, "concat", "String",
				new String[]{"String"});
		addDummyMethod(classStringDecl, "substring", "String",
				new String[]{"int","int"});
		addDummyMethod(classStringDecl, "length", "int", new String[]{});
		addDummyMethod(classStringDecl, "charAt", "int",
				new String[]{"int"});
		addDummyMethod(classStringDecl, "compareTo", "int",
				new String[]{"String"});

		//tell our visitor to go find these class declarations, and put them in the table
		this.visitClassDecl(classObjectDecl);
		this.visitClassDecl(classLibDecl);
		this.visitClassDecl(classStringDecl);
		this.visitClassDecl(classRunMainDecl);
		this.visitClassDecl(classDataArrayDecl);
		this.visitClassDecl(classObjectArrayDecl);

		Sem2Visitor s2 = new Sem2Visitor(globalSymTab, errorMsg);
		s2.visit(classObjectDecl);
		s2.visit(classLibDecl);
		s2.visit(classStringDecl);
		s2.visit(classRunMainDecl);
		s2.visitClassDecl(classDataArrayDecl);
		s2.visitClassDecl(classObjectArrayDecl);
		
		Sem3Visitor s3 = new Sem3Visitor(globalSymTab, errorMsg);
		s3.visit(classObjectDecl);
		s3.visit(classLibDecl);
		s3.visit(classStringDecl);
		s3.visit(classRunMainDecl);
		s3.visitClassDecl(classDataArrayDecl);
		s3.visitClassDecl(classObjectArrayDecl);
		
	}


	//this method creates a class for the given name and the super name if it extends from anything
	protected static ClassDecl createClass(String name, String superName) {
		return new ClassDecl(-1, name, superName, new DeclList());
	}


	//this method should add the corrct class declaration, method name, etc.
	protected static void addDummyMethod(ClassDecl dec, String methName,
				String rtnTypeName, String[] parmTypeNames) {
		VarDeclList parmDecls = new VarDeclList();
		for (int i = 0; i < parmTypeNames.length; i++) {
			Type t = convertToType(parmTypeNames[i]);
			String parmName = "parm"+i;
			VarDecl vd = new FormalDecl(-1, t, parmName);
			parmDecls.addElement(vd);
		}
		Type t = convertToType(rtnTypeName);
		StatementList sl = new StatementList(); // dummied up
		MethodDecl md;
		if (t == null) { // void return-type
			md = new MethodDeclVoid(-1, methName, parmDecls, sl);
		}
		else { // non-void return type
			Exp rtnExpr = new Null(-1);
			md = new MethodDeclNonVoid(-1, t, methName, parmDecls, sl, rtnExpr);
		}
		dec.decls.addElement(md);
	}
	
	private static Type convertToType(String s) {
		if (s.equals("void")) {
			return null;
		}
		else if (s.equals("boolean")) {
			return new BooleanType(-1);
		}
		else if (s.equals("int")) {
			return new IntegerType(-1);
		}
		else {
			return new IdentifierType(-1, s);
		}
	}

	private void initInstanceVars() {
		globalSymTab = new Hashtable<String,ClassDecl>();
		currentClass = null;
	}
}
