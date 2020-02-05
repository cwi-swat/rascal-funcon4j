// GeNeRaTeD fOr: ./Values/Composite/References/References.cbs
package funcons.algebras;

public interface ReferencesAlg<E> {
  E reference__(E[] args);
  E pointer_null_();
  E dereference__(E[] args);
  E references__(E[] args);
  E pointers__(E[] args);
}