module lang::minijava::AuxiliarySyntax

import lang::minijava::Syntax;

alias Env = map[str,Val];
alias Sto = map[Ref,Val];
alias Out = list[Val];

data Context = ctx(Env env, Sto sto, Out out, Val given, bool failed);

data Val = ref(Ref r) 
         | intlit(int i) 
         | boollit(bool b) 
         | vec(list[Ref] vec)
         | closure(Closure closure)
         | class(Class class)
         | object(Object obj);
          
alias Ref = int;
data Closure = closure(Env, Context(Context) body);
data Class   = class(Closure cons, Env members, list[str] parents);
data Object  = object(int id, str class_name, Env fields, list[Object] parents);  

Context env_override(Context c, Env env) = ctx(c.env + env, c.sto, c.out, c.given, c.failed);

Context sto_override(Context c, Sto sto) = ctx(c.env, c.sto + sto, c.out, c.given, c.failed);

Context append_output(Context c, Out out) = ctx(c.env, c.sto, c.out + out, c.given, c.failed);

Context give(Context c, Val given) = ctx(c.env, c.sto, c.out, given, c.failed);

Context set_fail(Context ct) = ctx(c.env, c.sto, c.out, c.given, true);