// GeNeRaTeD fOr: ./Values/Composite/Variants/Variants.cbs
module lang::funcon::Variants

data FunCon
  = variant__(list[FunCon] args)
  | variant_id__(list[FunCon] args)
  | variant_value__(list[FunCon] args)
  | variants__(list[FunCon] args)
  ;
FunCon variant_(FunCon args...) = variant__(args);
FunCon variant_id_(FunCon args...) = variant_id__(args);
FunCon variant_value_(FunCon args...) = variant_value__(args);
FunCon variants_(FunCon args...) = variants__(args);