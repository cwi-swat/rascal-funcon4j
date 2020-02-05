// GeNeRaTeD fOr: ./Computations/Normal/Generating/Generating.cbs
package funcons.algebras;

public interface GeneratingAlg<E> {
  E initialise_generating__(E[] args);
  E fresh_atom_();
  E use_atom_not_in__(E[] args);
  E atoms_();
}