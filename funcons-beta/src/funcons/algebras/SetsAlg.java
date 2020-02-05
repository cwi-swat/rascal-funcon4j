// GeNeRaTeD fOr: ./Values/Composite/Sets/Sets.cbs
package funcons.algebras;

public interface SetsAlg<E> {
  E set__(E[] args);
  E set_elements__(E[] args);
  E is_in_set__(E[] args);
  E is_subset__(E[] args);
  E set_insert__(E[] args);
  E set_unite__(E[] args);
  E set_intersect__(E[] args);
  E set_difference__(E[] args);
  E set_size__(E[] args);
  E some_element__(E[] args);
  E element_not_in__(E[] args);
  E sets__(E[] args);
}