package visitor;

import syntaxtree.*;
import java.util.*;
import errorMsg.*;

// the purpose of this class is to
// - link each ClassDecl to the ClassDecl for its superclass (via
//   its 'superLink'
// - link each ClassDecl to each of its subclasses (via the
//   'subclasses' instance variable
// - ensure that there are no cycles in the inheritance hierarchy
// - ensure that no class has 'String' or 'RunMain' as a superclass
public class Sem2Visitor extends ASTvisitor {
	
	Hashtable<String,ClassDecl> globalSymTab;
	ErrorMsg errorMsg;
	
	public Sem2Visitor(Hashtable<String,ClassDecl> globalSymTb, ErrorMsg e) {
		errorMsg = e;
		initInstanceVars(globalSymTb);
	}

	private void initInstanceVars(Hashtable<String,ClassDecl> globalTab) {
		globalSymTab = globalTab;
	}

	//override visitProgram
    //call findCycles in visitProgram
    @Override
    public Object visitProgram(Program p) {
	    //set our temporary class
	    Object temp = super.visitProgram(p);

	    //throw err if we see String or RunMain
        if (!globalSymTab.get("String").subclasses.isEmpty()) {
            errorMsg.error(p.pos, "Cannot have String as superclass");
        }
        if (!globalSymTab.get("RunMain").subclasses.isEmpty()) {
            errorMsg.error(p.pos, "Cannot have RunMain as superclass");
        }

        //check for cycles in all of the program's class decls
        for(ClassDecl decl : p.classDecls) {
            findCycles(decl.superLink , decl.name, globalSymTab.size() -1  );
        }

        return temp;
    }

    //create helper method to find circularities
    private void findCycles(ClassDecl decl, String className, int numClasses){
	    //base case: our decl is null, return and break out of this method
        if (decl == null) {
            return;
        }
        //base case: if numClasses is 0 and we see the name, its a cycle, throw error
        else if(numClasses == 0 || decl.name.equals(className)) {
            errorMsg.error(decl.pos, "Circular reference found: " + decl.name);
        }
        else { //recursive case, call findCycles on the remaining links
            findCycles(decl.superLink, className, numClasses - 1);
        }
    }

    //override visitClassDecl again, this time putting in links
    @Override
    public Object visitClassDecl(ClassDecl decl) {
        //look up the superclass name int he GST
        if (decl.superName == null || decl.superName.equals("")) {
            return null;
        }
        //throw an error if there is no super name

        if (!globalSymTab.containsKey(decl.superName)) {
            errorMsg.error(decl.pos, "Undefined class declaration.");
        }
        //add the class to the list of subclasses from the GST
        else {
            decl.superLink = globalSymTab.get(decl.superName);
            decl.superLink.subclasses.addElement(decl);
        }
        return null;
    }

	
}

	
