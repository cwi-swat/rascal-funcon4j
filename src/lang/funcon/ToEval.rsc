module lang::funcon::ToEval

import lang::funcon::Funcons;


alias IEval = value(value given);

@reflect{for some reason}
@javaClass{lang.funcon.ToEval}
java IEval toEval(FunCon funCon, str alg = "lang.funcon.EvalFuncon");

