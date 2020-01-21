module lang::\while::While

extend lang::std::Layout;
extend lang::std::Id;
import lang::funcon::FunCons;
  
import String;
import util::Math;

syntax AExp
  = nat: Nat
  | var: Id
  | left mul: AExp "*" AExp 
  > left (
    add: AExp "+" AExp
  | sub: AExp "-" AExp
  );
  
syntax BExp
  = t: "true"
  | f: "false"
  | eq: AExp "=" AExp
  | lt: AExp "\<" AExp
  | not: "¬" BExp
  > left and: BExp "∧" BExp
  > left or: BExp "∨" BExp
  ;
  
  
syntax Comm
  = skip: "skip"
  | assign: Id x ":=" AExp exp
  | right seq: Comm ";" Comm
  | ifThenElse: "if" BExp cond "then" Comm then "else" Comm els "end"
  | whileDo: "while" BExp cond "do" Comm body "end"
  ;  
  
lexical Nat
  = [0-9]+ !>> [0-9]
  ;


FunCon sem((AExp)`<Nat n>`) 
  = lit(toInt("<n>"));

FunCon sem((AExp)`<Id x>`) 
  = assignedValue(id("<x>"));

FunCon sem((AExp)`<AExp l> * <AExp r>`) 
  = intMultiply(sem(l), sem(r));

FunCon sem((AExp)`<AExp l> + <AExp r>`) 
  = intAdd(sem(l), sem(r));

FunCon sem((AExp)`<AExp l> - <AExp r>`) 
  = intSubtract(sem(l), sem(r));

FunCon sem((BExp)`true`) 
  = \bool(true);

FunCon sem((BExp)`false`) 
  = \bool(false);

FunCon sem((BExp)`<AExp l> = <AExp r>`) 
  = equal(sem(l), sem(r));
  
FunCon sem((BExp)`<AExp l> \< <AExp r>`) 
  = smaller(sem(l), sem(r));

FunCon sem((BExp)`<BExp l> ∧ <BExp r>`) 
  = ifTrue(sem(l), sem(r), sem(l));

FunCon sem((BExp)`<BExp l> ∨ <BExp r>`) 
  = ifTrue(sem(l), sem(l), sem(r));

FunCon sem((Comm)`skip`)
  = null();
  
FunCon sem((Comm)`<Id x> := <AExp e>`)
  = assign(id("<x>"), sem(e));
  
FunCon sem((Comm)`if <BExp c> then <Comm t> else <Comm e> end`)
  = ifTrue(sem(c), effect(sem(t)), effect(sem(e)));
  

FunCon sem((Comm)`<Comm c1>; <Comm c2>`)
  = seq(sem(c1), sem(c2));
  
  