module lang::funcon::LogicControl

data FunCon
  = effect(FunCon e)
  | seq(FunCon c, FunCon x)
  | ifTrue(FunCon e, FunCon c1, FunCon c2)
  | whileTrue(FunCon e, FunCon c)
  ;