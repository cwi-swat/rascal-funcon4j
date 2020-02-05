// GeNeRaTeD fOr: ./Computations/Abnormal/Abrupting/Abrupting.cbs
package funcons.algebras;

public interface AbruptingAlg<E> {
  E stuck_();
  E finalise_abrupting__(E[] args);
  E abrupt__(E[] args);
  E handle_abrupt__(E[] args);
  E finally__(E[] args);
}