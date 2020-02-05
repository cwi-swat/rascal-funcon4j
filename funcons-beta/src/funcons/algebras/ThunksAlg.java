// GeNeRaTeD fOr: ./Values/Abstraction/Thunks/Thunks.cbs
package funcons.algebras;

public interface ThunksAlg<E> {
  E thunk__(E[] args);
  E force__(E[] args);
  E thunks__(E[] args);
}