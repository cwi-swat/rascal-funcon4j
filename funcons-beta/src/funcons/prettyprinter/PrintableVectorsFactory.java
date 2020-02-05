// GeNeRaTeD fOr: ./Values/Composite/Vectors/Vectors.cbs
package funcons.prettyprinter;

import funcons.algebras.VectorsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintableVectorsFactory extends VectorsAlg<IPrint> {
  @Override
  default IPrint vector__(IPrint[] args) {
    return FCTPrinter.variadic("vector",args);
  }
  
  @Override
  default IPrint vector_elements__(IPrint[] args) {
    return FCTPrinter.variadic("vector-elements",args);
  }
  
  @Override
  default IPrint vectors__(IPrint[] args) {
    return FCTPrinter.variadic("vectors",args);
  }
}