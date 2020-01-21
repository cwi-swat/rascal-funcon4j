package camllight.algebras.patts;

import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.List;
import java.util.ListIterator;

public interface TuplePattAlg<E> {
    funcons.algebras.TupleAlg<E> alg();

    @Syntax("patt = '(' patt patttuple+ ')'") @Level(50)
    default E pattTuple(E patt, List<E> patts) {

        ListIterator<E> it = patts.listIterator(patts.size());
        E tuple = alg().tuplePrefixPatt(it.previous(), alg().only(alg().tuple()));
        while (it.hasPrevious()) {
            tuple = alg().tuplePrefixPatt(it.previous(), tuple);
        }

        return alg().tuplePrefixPatt(patt, tuple);
    }

    @Syntax("patttuple = ',' patt")
    default E pattTupleSingle(E patt) {
        return patt;
    }
}
