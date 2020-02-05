// GeNeRaTeD fOr: ./Values/Abstraction/Patterns/Patterns.cbs
package funcons.algebras;

public interface PatternsAlg<E> {
  E pattern__(E[] args);
  E pattern_any_();
  E pattern_bind__(E[] args);
  E pattern_type__(E[] args);
  E pattern_else__(E[] args);
  E pattern_unite__(E[] args);
  E match__(E[] args);
  E match_loosely__(E[] args);
  E case_match_(E arg1,E arg2);
  E case_match_loosely_(E arg1,E arg2);
  E case_variant_value__(E[] args);
  E patterns_();
}