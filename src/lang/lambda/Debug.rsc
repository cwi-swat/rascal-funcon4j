module lang::lambda::Debug

extend lang::funcon::Funcons;

data FunCon = debug(loc src, FunCon x);

