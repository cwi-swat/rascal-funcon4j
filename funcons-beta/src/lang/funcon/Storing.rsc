// GeNeRaTeD fOr: ./Computations/Normal/Storing/Storing.cbs
module lang::funcon::Storing

data FunCon
  = locations_()
  | locs_()
  | stores_()
  | store_clear_()
  | initialise_storing__(list[FunCon] args)
  | init_storing__(list[FunCon] args)
  | variable__(list[FunCon] args)
  | var__(list[FunCon] args)
  | allocate_variable__(list[FunCon] args)
  | alloc__(list[FunCon] args)
  | recycle_variables__(list[FunCon] args)
  | recycle__(list[FunCon] args)
  | initialise_variable__(list[FunCon] args)
  | init__(list[FunCon] args)
  | allocate_initialised_variable_(FunCon arg1,FunCon arg2)
  | alloc_init_(FunCon arg1,FunCon arg2)
  | assign__(list[FunCon] args)
  | assigned__(list[FunCon] args)
  | current_value__(list[FunCon] args)
  | un_assign__(list[FunCon] args)
  | structural_assign__(list[FunCon] args)
  | structural_assigned__(list[FunCon] args)
  | variables_()
  | vars_()
  ;
FunCon initialise_storing_(FunCon args...) = initialise_storing__(args);
FunCon init_storing_(FunCon args...) = init_storing__(args);
FunCon variable_(FunCon args...) = variable__(args);
FunCon var_(FunCon args...) = var__(args);
FunCon allocate_variable_(FunCon args...) = allocate_variable__(args);
FunCon alloc_(FunCon args...) = alloc__(args);
FunCon recycle_variables_(FunCon args...) = recycle_variables__(args);
FunCon recycle_(FunCon args...) = recycle__(args);
FunCon initialise_variable_(FunCon args...) = initialise_variable__(args);
FunCon init_(FunCon args...) = init__(args);
FunCon assign_(FunCon args...) = assign__(args);
FunCon assigned_(FunCon args...) = assigned__(args);
FunCon current_value_(FunCon args...) = current_value__(args);
FunCon un_assign_(FunCon args...) = un_assign__(args);
FunCon structural_assign_(FunCon args...) = structural_assign__(args);
FunCon structural_assigned_(FunCon args...) = structural_assigned__(args);