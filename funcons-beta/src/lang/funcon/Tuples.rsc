// GeNeRaTeD fOr: ./Values/Composite/Tuples/Tuples.cbs
module lang::funcon::Tuples

data FunCon
  = tuple__(list[FunCon] args)
  | tuple_elements__(list[FunCon] args)
  | tuple_zip__(list[FunCon] args)
  | tuples__(list[FunCon] args)
  ;
FunCon tuple_(FunCon args...) = tuple__(args);
FunCon tuple_elements_(FunCon args...) = tuple_elements__(args);
FunCon tuple_zip_(FunCon args...) = tuple_zip__(args);
FunCon tuples_(FunCon args...) = tuples__(args);