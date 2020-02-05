// GeNeRaTeD fOr: ./Computations/Normal/Generating/Generating.cbs
module lang::funcon::Generating

data FunCon
  = initialise_generating__(list[FunCon] args)
  | fresh_atom_()
  | use_atom_not_in__(list[FunCon] args)
  | atoms_()
  ;
FunCon initialise_generating_(FunCon args...) = initialise_generating__(args);
FunCon use_atom_not_in_(FunCon args...) = use_atom_not_in__(args);