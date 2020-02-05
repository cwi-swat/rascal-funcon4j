// GeNeRaTeD fOr: ./Values/Composite/Strings/Strings.cbs
package funcons.algebras;

public interface StringLiteralAlg<E> {
  E literal(String s);
  E ident(String s);
  E star(E f);
}