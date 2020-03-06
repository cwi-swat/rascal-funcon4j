module lang::minijava::Interpreter

import lang::std::Layout;

import lang::minijava::Syntax;
import lang::minijava::AuxiliarySyntax;

import util::Maybe;
import String;
import List;
import IO;

Context exec(Program p) = exec(p, empty_context());
Context exec(Program p, Context c) {
  return main(c, p);
}

Context main(Context c, (Program)
    `class <Identifier ID1> { 
 	'  public static void main ( String[] <Identifier ID2> ) { 
 	'    <Statement S> 
 	'  }
 	'} <ClassDecl* CDs>`) {
   c = class_sequence(c, CDs);
   if (!c.failed && envlit(env) := get_result(c)) {
     return in_environment(c, env, Context(Context c) {    
       return exec(c, S);
     });
   }
   else return set_fail(c);	
} 

// classes
Context class_sequence(Context c, CDs) {
  c = bind_class_occurrences(c, class_occurrences(CDs));
  if (!c.failed && envlit(env) := get_result(c)) {
    return in_environment(c, env, Context(Context local_c) {
      return declare_classes(local_c, CDs);
    });
  }
  else return set_fail(c);
}
    
Context bind_class_occurrences(Context c, class_names) {
  Env res = ();
  for (class_name <- class_names) {
    <r, c> = fresh_atom(c);
    c = sto_override(c, ( r : nothing() ));
    res = res + ("<class_name>" : ref(r));
  }
  return set_result(c, envlit(res));
}

list[str] class_occurrences(d) {
    res = [];
    top-down visit(d) {
       case (Expression) `new <Identifier ID> ()` : {
         res = res + ["<ID>"];
       }
       case (ClassDecl) `class <Identifier ID1>  {
                        '    <VarDecl* VDs> <MethodDecl* MDs>  
                        '}` : {
         res = res + ["<ID1>"];               
       }     
       case (ClassDecl) `class <Identifier ID1> extends <Identifier ID2> {
                        '    <VarDecl* VDs> <MethodDecl* MDs>  
                        '}` : {
         res = res + ["<ID1>"];               
       }
    };
    return res;
  }

Context declare_classes(Context c, ClassDecl CD) = declare_class(c, CD);
Context declare_classes(Context c, ClassDecl* CDs) = declare_classes(c, [ CD | CD <- CDs]);
Context declare_classes(Context c, []) = c;
Context declare_classes(Context c, [CD, *CDs]) {
  c = declare_class(c, CD);
  if (!c.failed && envlit(env1) := get_result(c)) {
      c =  declare_classes(c, CDs);
      if (!c.failed && envlit(env2) := get_result(c)) {
        return set_result(c, envlit(env1 + env2));
      }
      else return set_fail(c);
  }
  else return set_fail(c);
}

Context declare_class(Context c, (ClassDecl) 
  `class <Identifier ID> extends <Identifier ID2> {
  '    <VarDecl* VDs> <MethodDecl* MDs>  
  '}`) = declare_class(c,ID,VDs,MDs,just("<ID2>")); 
Context declare_class(Context c, (ClassDecl) 
  `class <Identifier ID>  {
  '    <VarDecl* VDs> <MethodDecl* MDs>  
  '}`) = declare_class(c,ID,VDs,MDs,Maybe::nothing()); 

Context declare_class(Context c, ID, VDs, MDs, Maybe[str] mID2) {
  cons = Context(Context local_c) {
    <obj_id, local_c> = fresh_atom(local_c);
    local_c = declare_variables(local_c,VDs);
    if (!c.failed && envlit(field_map) := get_result(local_c)) {
      if (just(ID2) := mID2) {
        try {
          if (ref(r) := local_c.env["<ID2>"]) {
            if (class(pc) := local_c.sto[r]) {
              local_c = pc.cons(local_c);
              if(!local_c.failed && object(po) := get_result(local_c))
                list[Object] parents = [po];
              else
                return set_fail(c);
            }
            else return set_fail(c);
          }
          else return set_fail(c);
        }
        catch: return set_fail(c);
      }
      else {
        list[Object] parents = [];
      }
      return set_result(local_c, object(obj_id, "<ID>", field_map, parents));
    }
  };
  c = declare_methods(c,MDs);
  if (!c.failed && envlit(method_map) := get_result(c)) {
	  if (just(ID2) := mID2)
	    class_val = class(cons,method_map,["<ID2>"]);
	  else
	    class_val = class(cons,method_map,[]);
	  try {
	    if(ref(r) := c.env["<ID>"]) {
	  	  return sto_override(c, ( r : class(class_val) ));
	    }
	    else return set_fail(c);
	  }
	  catch exc: return set_fail(c);
  }
  else return set_fail(c);
}


// methods
Context declare_methods(Context c, MethodDecl* MDs) = declare_methods(c, [ MD | MD <- MDs]);
Context declare_methods(Context c, []) = set_result(c, envlit(()));
Context declare_methods(Context c, [MD, *MDs]) {
  c = declare_method(c, MD);
  if (!c.failed && envlit(env1) := get_result(c)) {
    c =  declare_methods(c, MDs);
    if (!c.failed && envlit(env2) := get_result(c)) {
        return set_result(c, envlit(env1 + env2));
    }
    else return set_fail(c);
  }
  else return set_fail(c);
}
Context declare_method(Context c0, (MethodDecl) 
	`public <Type T> <Identifier ID> ( <FormalList? FLs> ) { 
	'  <VarDecl* VDs> <Statement* Ss> return <Expression E> ;
	'}`) {
	clos = closure(Context(Context local_c) {
	  return in_environment(local_c, c0.env, Context(Context local_c) {
	    if (listlit([ref(r), *ARGS]) := get_given(local_c)) {
	      local_c = match_formals(local_c, formal_list(FLs), ARGS);
          if(!local_c.failed && envlit(args_map) := get_result(local_c)) {
	        //fields_map = retrieve_fields(local_c, r);
	        local_c = declare_variables(local_c, [VD | VD <- VDs]);	
	        if (!local_c.failed && envlit(local_map) := get_result(local_c)) {
	          return in_environment(local_c, ("this" : ref(r)) + args_map /* + fields_map*/ + local_map, Context(Context local_c) {
	            return eval(exec(local_c, [ s | s <- Ss] ), E);
	          });
	        }
	        else return set_fail(local_c);
          } 
          else return set_fail(local_c);
	    }
	    else return set_fail(local_c);
	  });
	});
	return set_result(c0, envlit( ("<ID>":clos) ));
}

Context match_formals(Context c, [], []) = set_result(c, envlit(()));
Context match_formals(Context c, [ID, *IDs], [A, *As]) {
  <r, c> = fresh_atom(c);
  c = sto_override(c, ( r : A ));
  c = match_formals(c, IDs, As);
  if (!c.failed && envlit(env) := get_result(c)) {
    return set_result(c, envlit(("<ID>":ref(r)) + env));
  }
  else return set_fail(c);
}
default Context match_formals(c, Xs, Ys) = set_fail(c);

list[str] formal_list([]) = [];
list[str] formal_list([FL]) = formal_list(FL);
list[str] formal_list(opt(FL)) = formal_list(FL);
list[str] formal_list(FormalList? FLs) = [ x | FL <- FLs, x <- formal_list(FL)];
list[str] formal_list((FormalList) `<Type T> <Identifier ID>`) = ["<ID>"];
list[str] formal_list((FormalList)`<Type T> <Identifier ID> , <FormalList FLs>`) = ["<ID>"] + formal_list(FLs);

Env retrieve_fields(Context c, r) {
  if (object(obj) := c.sto[r]) {
    p_env = ( () | it + env | par <- obj.parents, env <- retrieve_fields(c, par));
    return p_env + obj.fields;
  }
}

Context declare_variables(Context c, VarDecl* VDs) = declare_variables(c, [ VD | VD <- VDs]);
Context declare_variables(Context c, []) = set_result(c, envlit(()));
Context declare_variables(Context c, [(VarDecl) `<Type T> <Identifier ID>;`,*Vs]) {
  <r, c> = fresh_atom(c);
  c = sto_override(c, (r : initial_value(T)));
  c = declare_variables(c, Vs);
  if (!c.failed && envlit(env) := get_result(c)) {
    return set_result(c, envlit(("<ID>" : ref(r)) + env));
  }
  else return set_fail(c);
}

Val initial_value((Type) `int[]`) = vec([]);
Val initial_value((Type) `boolean`) = boollit(false);
Val initial_value((Type) `int`) = intlit(0);
Val initial_value((Type) `<Identifier ID>`) = nothing();

// statements
Context exec(Context c, (Statement) `{ <Statement* Stmts> }`) = exec(c, [ s | s <- Stmts ]);
Context exec(Context c, list[Statement] ss) = set_result(( c | exec(it, s) | s <- ss ), nothing());
Context exec(Context c, (Statement) `<Identifier ID> = <Expression E>;`) {
  c = eval(c, E);
  try    {
    if (!c.failed && ref(r) := c.env["<ID>"]) {
      return set_result(sto_override(c, ( r  : get_result(c) )), nothing());
    }
    else return set_fail(c);
  }
  catch: return set_fail(c); 
}
Context exec(Context c, (Statement) `System.out.println(<Expression E>);`) {
  c = eval(c, E);
  return set_result(append_output(c, [to_string(get_result(c)), "\n"]), nothing());
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
  try    if (ref(r) := c0.env["<ID>"]) return set_result(c0, c0.sto[r]); 
         else return set_fail(c0);
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
Context eval(Context c, (Expression) `<Expression E1> * <Expression E2>`) {
  c = eval(c, E1); 
  if(!c.failed && intlit(x) := get_result(c)) {
	  c = eval(c, E2);
	  if (!c.failed && intlit(y) := get_result(c2))
	    return set_result(c2, intlit(x * y));
	  else
	    return set_fail(c2);  
  }
  else return set_fail(c2);
}
Context eval(Context c0, (Expression) `new int [ <Expression E1> ]`) {
  c1 = eval(c0, E1); 
  if (!c.failed && intlit(x) := get_result(c1)) {
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

data OptEnv = Some(Env e) | Empty();
