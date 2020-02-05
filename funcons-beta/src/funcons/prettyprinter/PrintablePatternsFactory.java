// GeNeRaTeD fOr: ./Values/Abstraction/Patterns/Patterns.cbs
package funcons.prettyprinter;

import funcons.algebras.PatternsAlg;
import funcons.carriers.IPrint;
import funcons.prettyprinter.FCTPrinter;
public interface PrintablePatternsFactory extends PatternsAlg<IPrint> {
  @Override
  default IPrint pattern__(IPrint[] args) {
    return FCTPrinter.variadic("pattern",args);
  }
  
  @Override
  default IPrint pattern_any_() {
    return FCTPrinter.nullary("pattern-any");
  }
  
  @Override
  default IPrint pattern_bind__(IPrint[] args) {
    return FCTPrinter.variadic("pattern-bind",args);
  }
  
  @Override
  default IPrint pattern_type__(IPrint[] args) {
    return FCTPrinter.variadic("pattern-type",args);
  }
  
  @Override
  default IPrint pattern_else__(IPrint[] args) {
    return FCTPrinter.variadic("pattern-else",args);
  }
  
  @Override
  default IPrint pattern_unite__(IPrint[] args) {
    return FCTPrinter.variadic("pattern-unite",args);
  }
  
  @Override
  default IPrint match__(IPrint[] args) {
    return FCTPrinter.variadic("match",args);
  }
  
  @Override
  default IPrint match_loosely__(IPrint[] args) {
    return FCTPrinter.variadic("match-loosely",args);
  }
  
  @Override
  default IPrint case_match_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("case-match",arg1, arg2);
  }
  
  @Override
  default IPrint case_match_loosely_(IPrint arg1,IPrint arg2) {
    return FCTPrinter.fixed("case-match-loosely",arg1, arg2);
  }
  
  @Override
  default IPrint case_variant_value__(IPrint[] args) {
    return FCTPrinter.variadic("case-variant-value",args);
  }
  
  @Override
  default IPrint patterns_() {
    return FCTPrinter.nullary("patterns");
  }
}