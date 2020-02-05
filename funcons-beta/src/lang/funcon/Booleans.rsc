// GeNeRaTeD fOr: ./Values/Primitive/Booleans/Booleans.cbs
module lang::funcon::Booleans

data FunCon
  = true_()
  | false_()
  | not__(list[FunCon] args)
  | implies__(list[FunCon] args)
  | and__(list[FunCon] args)
  | or__(list[FunCon] args)
  | exclusive_or__(list[FunCon] args)
  | xor__(list[FunCon] args)
  | booleans_()
  | bools_()
  ;
FunCon not_(FunCon args...) = not__(args);
FunCon implies_(FunCon args...) = implies__(args);
FunCon and_(FunCon args...) = and__(args);
FunCon or_(FunCon args...) = or__(args);
FunCon exclusive_or_(FunCon args...) = exclusive_or__(args);
FunCon xor_(FunCon args...) = xor__(args);