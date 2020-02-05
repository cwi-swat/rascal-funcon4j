// GeNeRaTeD fOr: ./Computations/Normal/Storing/Storing.cbs
package funcons.algebras;

public interface StoringAlg<E> {
  E locations_();
  E locs_();
  E stores_();
  E store_clear_();
  E initialise_storing__(E[] args);
  E init_storing__(E[] args);
  E variable__(E[] args);
  E var__(E[] args);
  E allocate_variable__(E[] args);
  E alloc__(E[] args);
  E recycle_variables__(E[] args);
  E recycle__(E[] args);
  E initialise_variable__(E[] args);
  E init__(E[] args);
  E allocate_initialised_variable_(E arg1,E arg2);
  E alloc_init_(E arg1,E arg2);
  E assign__(E[] args);
  E assigned__(E[] args);
  E current_value__(E[] args);
  E un_assign__(E[] args);
  E structural_assign__(E[] args);
  E structural_assigned__(E[] args);
  E variables_();
  E vars_();
}