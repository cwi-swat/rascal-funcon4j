// GeNeRaTeD fOr: ./Values/Composite/Datatypes/Datatypes.cbs
module lang::funcon::Datatypes

data FunCon
  = datatype_value__(list[FunCon] args)
  | datatype_value_id__(list[FunCon] args)
  | datatype_value_elements__(list[FunCon] args)
  | datatype_values_()
  ;
FunCon datatype_value_(FunCon args...) = datatype_value__(args);
FunCon datatype_value_id_(FunCon args...) = datatype_value_id__(args);
FunCon datatype_value_elements_(FunCon args...) = datatype_value_elements__(args);