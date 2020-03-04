module lang::minijava::AuxiliarySyntax

import lang::minijava::Syntax;

alias Env = map[str,Ref];
alias Sto = map[Ref,Val];
alias Out = list[str];

data Context = ctx(Env env, Sto sto, int seed, Out out, Val given, bool failed, Val res);

data Val = ref(Ref r) 
         | intlit(int i) 
         | boollit(bool b) 
         | vec(list[Ref] vec)
         | closure(Closure closure)
         | class(Class class)
         | object(Object obj)
         | nothing();
          
alias Ref = int;
data Closure = closure(Env, Context(Context) body);
data Class   = class(Closure cons, Env members, list[str] parents);
data Object  = object(int id, str class_name, Env fields, list[Object] parents);  

Context empty_context() {
  Env env = ();
  Sto sto = ();
  return ctx(env, sto, 0, [], nothing(), false, nothing());
} 

Context env_override(Context c, Env env) = ctx(c.env + env, c.sto, c.seed, c.out, c.given, c.failed, c.res);

Context sto_override(Context c, Sto sto) = ctx(c.env, c.sto + sto, c.seed, c.out, c.given, c.failed, c.res);

tuple[Ref, Context] fresh_atom(Context c) = <c.seed, ctx(c.env, c.sto, c.seed + 1, c.out, c.given, c.failed, c.res)>;

Context append_output(Context c, Out out) = ctx(c.env, c.sto, c.seed, c.out + out, c.given, c.failed, c.res);

Context give(Context c, Val given) = ctx(c.env, c.sto, c.seed, c.out, given, c.failed, c.res);

Context set_fail(Context c) = ctx(c.env, c.sto, c.seed, c.out, c.given, true, nothing());

Val get_result(Context c) = c.res;
Context set_result(Context c, Val res) = ctx(c.env, c.sto, c.seed, c.out, c.given, c.failed, res);