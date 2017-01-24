================================================================
To set up an Eclipse project for Assignment 1
================================================================
- Run Eclipse.
  - Select (or create) a workspace folder.
    - (Close the "Welcome" window if it os open
  - New -> Project ... Java ... Java Project
  - Next
  - Project name: asst1
    - Create new project in workspace
    - JRE: should be at least 1.6
    - Project layout: create separate ...
    - Finish
  - Unzip the starter file, creating the folder asst1Starter
  - Drag all folders from asst1Starter/src onto the 'src' icon in the package
    explorer.
  - Drag the asstiStarter/jars folder onto the 'asst1' icon in the package
    explorer
  - Set up the WrangLR JAR file by:
    - click on the 'asst1' icon in the package explorer.
    - Project -> Properties
    - Java Build Path
    - Libraries tab
    - Add JARs ...
    - open up 'asst1', then 'jars' in the pop-up window
    - click on wrangLRv0_8.jar (or whatever the JAR file name is) in the
      pop-up window
    - OK
    - OK
    - Drag the test files, Test0.java and Test1.java onto the 'asst1' icon
      in the package explorer
    
You now should be ready to run WrangLR on the starter-grammar:
  - your WrangLR grammar file is src/parser/TokenGrammar.java

================================================================
Running WrangLR on the grammar file
================================================================
 - right-click on GenTokenGrammarParser.java under src/gen
   - if it warns you that the project has errors, say "Proceed", as the
     hope is that this fix the errors.
 - Run As -> Java Application
   - This will create (or update) the file TokenGrammarParseTable.java
   - Select 'asst1' and press the F5 key so that Eclipse does a "refresh",
     and realizes that that file has been created or updated.

================================================================
Running the generated parser.
================================================================
- right-click on Main.java under src/main
- Run As -> Java Application
  - The first time WrangLR will report that is needs a file-name argument, so
    add one:
    - Run -> Run Configurations ...
    - Arguments tab
    - Type in the name of the input file (e.g., Test0.java) into the
      "Program arguments:" text-field
    - Eclipse will remember this argument, so you don't need to do this
      step unless you want to change argument.
