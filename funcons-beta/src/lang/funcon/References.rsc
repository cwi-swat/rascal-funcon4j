// GeNeRaTeD fOr: ./Values/Composite/References/References.cbs
module lang::funcon::References

data FunCon
  = reference__(list[FunCon] args)
  | pointer_null_()
  | dereference__(list[FunCon] args)
  | references__(list[FunCon] args)
  | pointers__(list[FunCon] args)
  ;
FunCon reference_(FunCon args...) = reference__(args);
FunCon dereference_(FunCon args...) = dereference__(args);
FunCon references_(FunCon args...) = references__(args);
FunCon pointers_(FunCon args...) = pointers__(args);