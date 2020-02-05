// GeNeRaTeD fOr: ./Values/Primitive/Booleans/Booleans.cbs
package funcons.algebras;

public interface BooleansAlg<E> {
  E true_();
  E false_();
  E not__(E[] args);
  E implies__(E[] args);
  E and__(E[] args);
  E or__(E[] args);
  E exclusive_or__(E[] args);
  E xor__(E[] args);
  E booleans_();
  E bools_();
}