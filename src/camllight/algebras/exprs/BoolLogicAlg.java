package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface BoolLogicAlg<E> {
    funcons.algebras.LogicControlAlg<E> alg();

    @Syntax("exp = exp ('&' | '&&') exp") @Level(1506)
    default E lAnd(E e1, E e2) {
        return alg().ifTrue(e1, e2, alg().bool(false));
    }

    @Syntax("exp = exp ('||' | 'or') exp") @Level(1505)
    default E lOr(E e1, E e2) {
        alg().bool(false);
        return alg().ifTrue(e1, alg().bool(true), e2);
    }

    @Syntax("exp = 'not' exp") @Level(1507)
    default E lNot(E e1) {
        return alg().not(e1);
    }

    @Syntax("exp = exp '>' exp") @Level(1508)
    default E greater(E e1, E e2) {
        return alg().greater(e1, e2);
    }

    @Syntax("exp = exp '<' exp") @Level(1508)
    default E smaller(E e1, E e2) {
        return alg().smaller(e1, e2);
    }

    @Syntax("exp = exp '>=' exp") @Level(1508)
    default E greaterEqual(E e1, E e2) {
        return alg().greaterEqual(e1, e2);
    }

    @Syntax("exp = exp '<=' exp") @Level(1508)
    default E smallerEqual(E e1, E e2) {
        return alg().smallerEqual(e1, e2);
    }

    @Syntax("exp = exp '==' exp") @Level(1508)
    default E physicalEqual(E e1, E e2) {
        return alg().physicalEqual(e1, e2);
    }

    @Syntax("exp = exp '=' exp") @Level(1508)
    default E equal(E e1, E e2) {
        return alg().equal(e1, e2);
    }

    @Syntax("exp = exp '!=' exp") @Level(1508)
    default E notPhysicalEqual(E e1, E e2) {
        return alg().not(alg().physicalEqual(e1, e2));
    }

    @Syntax("exp = exp '<>' exp") @Level(1508)
    default E notEqual(E e1, E e2) {
        return alg().not(alg().equal(e1, e2));
    }

}
