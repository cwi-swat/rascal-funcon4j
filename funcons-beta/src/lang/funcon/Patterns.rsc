// GeNeRaTeD fOr: ./Values/Abstraction/Patterns/Patterns.cbs
module lang::funcon::Patterns

data FunCon
  = pattern__(list[FunCon] args)
  | pattern_any_()
  | pattern_bind__(list[FunCon] args)
  | pattern_type__(list[FunCon] args)
  | pattern_else__(list[FunCon] args)
  | pattern_unite__(list[FunCon] args)
  | match__(list[FunCon] args)
  | match_loosely__(list[FunCon] args)
  | case_match_(FunCon arg1,FunCon arg2)
  | case_match_loosely_(FunCon arg1,FunCon arg2)
  | case_variant_value__(list[FunCon] args)
  | patterns_()
  ;
FunCon pattern_(FunCon args...) = pattern__(args);
FunCon pattern_bind_(FunCon args...) = pattern_bind__(args);
FunCon pattern_type_(FunCon args...) = pattern_type__(args);
FunCon pattern_else_(FunCon args...) = pattern_else__(args);
FunCon pattern_unite_(FunCon args...) = pattern_unite__(args);
FunCon match_(FunCon args...) = match__(args);
FunCon match_loosely_(FunCon args...) = match_loosely__(args);
FunCon case_variant_value_(FunCon args...) = case_variant_value__(args);