// GeNeRaTeD fOr: ./Values/Composite/Vectors/Vectors.cbs
module lang::funcon::Vectors

data FunCon
  = vector__(list[FunCon] args)
  | vector_elements__(list[FunCon] args)
  | vectors__(list[FunCon] args)
  ;
FunCon vector_(FunCon args...) = vector__(args);
FunCon vector_elements_(FunCon args...) = vector_elements__(args);
FunCon vectors_(FunCon args...) = vectors__(args);