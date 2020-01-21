module lang::funcon::Assign

data FunCon
  = assign(FunCon var, FunCon x)
  | assignedValue(FunCon var)
  | assignedValueIfVar(FunCon v)
  | alloc(FunCon x)
  ;