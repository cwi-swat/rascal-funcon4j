package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.List;
import java.util.ListIterator;

public interface ListAlg<E> {
    funcons.algebras.ListAlg<E> alg();

    @Syntax("exp = exp '@' exp") @Level(1509)
    default E listConcatExp(E l1, E l2) {
        return alg().listAppend(l1, l2);
    }

    @Syntax("exp = <assoc=right> exp '::' exp") @Level(2000)
    default E headTailListExp(E e1, E e2) {
        return alg().listPrefix(e1, e2);
    }

    @Syntax("exp = '[' exp@','+ ']'") @Level(1900)
    default E expList(java.util.List<E> exps) {
        ListIterator<E> expIt = exps.listIterator(exps.size());
        E list = alg().list();
        while (expIt.hasPrevious()) {
            E exp = expIt.previous();
            list = alg().listPrefix(exp, list);
        }
        return list;
    }
}
