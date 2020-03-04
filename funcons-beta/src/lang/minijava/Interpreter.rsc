module lang::minijava::Interpreter

import lang::std::Layout;

import lang::minijava::Syntax;
import lang::minijava::AuxiliarySyntax;

import String;
import List;
import IO;

Context exec(Program p) = exec(Program, empty_context());
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

// statements
Context exec(Context c, (Statement) `{ <Statement* Stmts> }`) = set_result(( c | exec(it, s) | s <- Stmts ), nothing());
Context exec(Context c, (Statement) `<Identifier ID> = <Expression E>;`) {
  c = eval(c, E);
  try    return set_result(sto_override(c, ( c.env["<ID>"] : get_result(c) )), nothing());
  catch: return set_fail(c); 
}
Context exec(Context c, (Statement) `System.out.println(<Expression E>);`) {
  c = eval(c, E);
  try    return set_result(append_output(c, [to_string(get_result(c)), "\n"]), nothing());
  catch: return set_fail(c); 
}
Context exec(Context c, (Statement) `while( <Expression E> ) <Statement S>`) {
  b = true;
  while(b) {
    c = eval(c, E);
    if (boollit(b) := get_result(c)) {
      if (b) {
        c = exec(c, S);
      }
    }
    else return set_fail(c);
  }
  return set_result(c, nothing());
}
Context exec(Context c, (Statement) `if ( <Expression E> ) <Statement S1> else <Statement S2>`) {
  c = eval(c, E);
  if(boollit(b) := get_result(c)) {
    if (b) return exec(c, S1);
    else   return exec(c, S2);
  }
  else return set_fail(c);
}

// expressions
Context eval(Context c0, (Expression) `<Identifier ID>`) {
  try    return set_result(c0, c0.sto[c0.env[ID]]);
  catch: return set_fail(c0);
}
Context eval(Context c0, (Expression) `this`) {
  try    return set_result(c0, c0.sto[c0.env["this"]]);
  catch: return set_fail(c0);
}
Context eval(Context c, (Expression) `(<Expression E>)`) = eval(c, E);
Context eval(Context c, (Expression) `<Integer I>`) = set_result(c, intlit(toInt("<I>")));
Context eval(Context c, (Expression) `true`) = set_result(c, boollit(true));
Context eval(Context c, (Expression) `false`) = set_result(c, boollit(false));
Context eval(Context c0, (Expression) `!<Expression E>`) {
	c1 = eval(c0, E);
	if (boollit(b) := get_result(c1)) {
	  return set_result(c0, boollit(!b));
	}
	return set_fail(c1);
}
Context eval(Context c0, (Expression) `<Expression E1> && <Expression E2>`) {
  c1 = eval(c0, E1);
  if (boollit(b1) := get_result(c1)) {
    if(!b1) return set_result(c1, boollit(false));
    c2 = eval(c1, E2);
    if (boollit(b2) := get_result(c2)) {
      return c2;
    }
    return set_fail(c2);
  } 
  return set_fail(c1);
}
Context eval(Context c0, (Expression) `<Expression E1> \< <Expression E2>`) {
  c1 = eval(c0, E1); 
  c2 = eval(c1, E2);
  if (<intlit(x), intlit(y)> := <get_result(c1), get_result(c2)>)
    return set_result(c2, boollit(x < y));
  else
    return set_fail(c2);
}
Context eval(Context c0, (Expression) `<Expression E1> + <Expression E2>`) {
  c1 = eval(c0, E1); 
  c2 = eval(c1, E2);
  if (<intlit(x), intlit(y)> := <get_result(c1), get_result(c2)>)
    return set_result(c2, intlit(x + y));
  else
    return set_fail(c2);
}
Context eval(Context c0, (Expression) `<Expression E1> - <Expression E2>`) {
  c1 = eval(c0, E1); 
  c2 = eval(c1, E2);
  if (<intlit(x), intlit(y)> := <get_result(c1), get_result(c2)>)
    return set_result(c2, intlit(x - y));
  else
    return set_fail(c2);
}
Context eval(Context c0, (Expression) `<Expression E1> * <Expression E2>`) {
  c1 = eval(c0, E1); 
  c2 = eval(c1, E2);
  if (<intlit(x), intlit(y)> := <get_result(c1), get_result(c2)>)
    return set_result(c2, intlit(x * y));
  else
    return set_fail(c2);
}
Context eval(Context c0, (Expression) `new int [ <Expression E1> ]`) {
  c1 = eval(c0, E1); 
  if (intlit(x) := get_result(c1)) {
    c = c1;
    res = [];
    for(int _ <- [0..x]) {
      <r, c> = fresh_atom(c);
      c = sto_override(c, ( r : intlit(0) ));
      res = res + r;
    }
    return set_result(c, vec(res));
  }
  else
    return set_fail(c1);
}
Context eval(Context c0, (Expression) `<Expression E1> [ <Expression E2> ]`) {
  c1 = eval(c0, E2); 
  c2 = eval(c1, E1);
  if (<intlit(x), vec(y)> := <get_result(c1), get_result(c2)>) {
    try    return set_result(c2, c2.sto[y[x]]);
    catch: return set_fail(c2);
  }
  else
    return set_fail(c2);
}
Context eval(Context c0, (Expression) `<Expression E1> . length`) {
  c1 = eval(c0, E1);
  if (vec(x) := get_result(c1)) {
    return set_result(c1, intlit(size(x)));
  }
  else
    return set_fail(c1);
}

str to_string(ref(n)) = "ref@<n>";
str to_string(intlit(n)) = "<n>";
str to_string(boollit(b)) = "<b>";


