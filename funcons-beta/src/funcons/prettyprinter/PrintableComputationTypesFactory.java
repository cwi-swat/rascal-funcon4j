// GeNeRaTeD fOr: ./Computations/Computation-Types/Computation-Types.cbs
package funcons.prettyprinter;

import funcons.algebras.ComputationTypesAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableComputationTypesFactory extends ComputationTypesAlg<IPrint> {
  @Override
  default IPrint computation_types_() {
    return FCTPrinter.nullary("computation-types");
  }
}