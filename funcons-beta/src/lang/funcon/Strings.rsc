// GeNeRaTeD fOr: ./Values/Composite/Strings/Strings.cbs
module lang::funcon::Strings

data FunCon
  = strings_()
  | string__(list[FunCon] args)
  | string_append__(list[FunCon] args)
  | to_string__(list[FunCon] args)
  ;
FunCon string_(FunCon args...) = string__(args);
FunCon string_append_(FunCon args...) = string_append__(args);
FunCon to_string_(FunCon args...) = to_string__(args);