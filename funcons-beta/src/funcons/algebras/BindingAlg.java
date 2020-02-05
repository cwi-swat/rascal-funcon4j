// GeNeRaTeD fOr: ./Computations/Normal/Binding/Binding.cbs
package funcons.algebras;

public interface BindingAlg<E> {
  E environments_();
  E envs_();
  E identifier_tagged__(E[] args);
  E id_tagged__(E[] args);
  E fresh_identifier_();
  E initialise_binding__(E[] args);
  E bind_value__(E[] args);
  E bind__(E[] args);
  E unbind__(E[] args);
  E bound_directly__(E[] args);
  E bound_value__(E[] args);
  E bound__(E[] args);
  E closed__(E[] args);
  E scope_(E arg1,E arg2);
  E accumulate__(E[] args);
  E collateral__(E[] args);
  E bind_recursively_(E arg1,E arg2);
  E recursive_(E arg1,E arg2);
  E re_close_(E arg1,E arg2);
  E bind_to_forward_links__(E[] args);
  E set_forward_links__(E[] args);
  E identifiers_();
  E ids_();
}