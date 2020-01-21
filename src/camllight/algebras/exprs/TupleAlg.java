package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.ListIterator;

public interface TupleAlg<E> {
    funcons.algebras.TupleAlg<E> alg();

    @Syntax("exp = '(' exp@','+ ')'") @Level(2300) // Love your brackets.
    default E exprTupleMulti(java.util.List<E> exps) {
        ListIterator<E> it = exps.listIterator(exps.size());
        E tuple = alg().tuple();
        while (it.hasPrevious()) {
            tuple = alg().tuplePrefix(it.previous(), tuple);
        }
        return tuple;
    }
}