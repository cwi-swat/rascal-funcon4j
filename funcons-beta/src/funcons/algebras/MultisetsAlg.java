// GeNeRaTeD fOr: ./Values/Composite/Multisets/Multisets.cbs
package funcons.algebras;

public interface MultisetsAlg<E> {
  E multiset__(E[] args);
  E multiset_elements__(E[] args);
  E multiset_occurrences__(E[] args);
  E multiset_insert__(E[] args);
  E multiset_delete__(E[] args);
  E is_submultiset__(E[] args);
  E multisets__(E[] args);
}