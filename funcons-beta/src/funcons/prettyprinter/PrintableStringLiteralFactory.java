package funcons.prettyprinter;

import funcons.algebras.StringLiteralAlg;
import funcons.carriers.IPrint;

public interface PrintableStringLiteralFactory extends StringLiteralAlg<IPrint> {
  @Override
  default IPrint literal(String s) {
	  return () -> s;
  }
  @Override
  default IPrint ident(String s) {
	  return () -> "\"" + s + "\"";
  }
  @Override
  default IPrint star(IPrint f) {
	  return () -> f.toFCT() + "*";
  }
}
