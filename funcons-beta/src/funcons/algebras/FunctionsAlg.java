// GeNeRaTeD fOr: ./Values/Abstraction/Functions/Functions.cbs
package funcons.algebras;

public interface FunctionsAlg<E> {
  E function__(E[] args);
  E apply__(E[] args);
  E supply__(E[] args);
  E compose__(E[] args);
  E uncurry__(E[] args);
  E curry__(E[] args);
  E partial_apply__(E[] args);
  E functions__(E[] args);
}