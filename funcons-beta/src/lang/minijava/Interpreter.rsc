module lang::minijava::Interpreter

import lang::std::Layout;

import lang::minijava::Syntax;
import lang::minijava::AuxiliarySyntax;


Context exec(Program p, Context c) {
  return main(c, p);
}

Context main(Context c, (Program)
    `class <Identifier ID1> { 
 	'  public static void main ( String[] <Identifier ID2> ) { 
 	'    <Statement S> 
 	'  }
 	'} <ClassDecl* CDs>`) {
   env = class_sequence(c, CDs);
   c = override_env(c, env);
   c = exec(c, s);
   return c;	
} 
