// GeNeRaTeD fOr: ./Computations/Normal/Binding/Binding.cbs
module lang::funcon::Binding

data FunCon
  = environments_()
  | envs_()
  | identifier_tagged__(list[FunCon] args)
  | id_tagged__(list[FunCon] args)
  | fresh_identifier_()
  | initialise_binding__(list[FunCon] args)
  | bind_value__(list[FunCon] args)
  | bind__(list[FunCon] args)
  | unbind__(list[FunCon] args)
  | bound_directly__(list[FunCon] args)
  | bound_value__(list[FunCon] args)
  | bound__(list[FunCon] args)
  | closed__(list[FunCon] args)
  | scope_(FunCon arg1,FunCon arg2)
  | accumulate__(list[FunCon] args)
  | collateral__(list[FunCon] args)
  | bind_recursively_(FunCon arg1,FunCon arg2)
  | recursive_(FunCon arg1,FunCon arg2)
  | re_close_(FunCon arg1,FunCon arg2)
  | bind_to_forward_links__(list[FunCon] args)
  | set_forward_links__(list[FunCon] args)
  | identifiers_()
  | ids_()
  ;
FunCon identifier_tagged_(FunCon args...) = identifier_tagged__(args);
FunCon id_tagged_(FunCon args...) = id_tagged__(args);
FunCon initialise_binding_(FunCon args...) = initialise_binding__(args);
FunCon bind_value_(FunCon args...) = bind_value__(args);
FunCon bind_(FunCon args...) = bind__(args);
FunCon unbind_(FunCon args...) = unbind__(args);
FunCon bound_directly_(FunCon args...) = bound_directly__(args);
FunCon bound_value_(FunCon args...) = bound_value__(args);
FunCon bound_(FunCon args...) = bound__(args);
FunCon closed_(FunCon args...) = closed__(args);
FunCon accumulate_(FunCon args...) = accumulate__(args);
FunCon collateral_(FunCon args...) = collateral__(args);
FunCon bind_to_forward_links_(FunCon args...) = bind_to_forward_links__(args);
FunCon set_forward_links_(FunCon args...) = set_forward_links__(args);