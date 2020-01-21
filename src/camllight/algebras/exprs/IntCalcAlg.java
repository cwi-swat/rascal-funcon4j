package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface IntCalcAlg<E> {
    funcons.algebras.IntCalcAlg<E> alg();

    @Syntax("exp = '-' exp") @Level(1515)
    default E intUnarySub(E exp) {
        return alg().intNegate(exp);
    }

    @Syntax("exp = exp '+' exp") @Level(1511)
    default E intAdd(E a, E b) {
        return alg().intAdd(a, b);
    }

    @Syntax("exp = exp '-' exp") @Level(1511)
    default E intSub(E a, E b) {
        return alg().intSubtract(a, b);
    }

    @Syntax("exp = exp '*' exp") @Level(1512)
    default E intMultiply(E a, E b) {
        return alg().intMultiply(a, b);
    }

    @Syntax("exp = exp '/' exp") @Level(1512)
    default E intDivide(E a, E b) {
        return alg().intDivide(a, b);
    }

    @Syntax("exp = exp 'mod' exp") @Level(1513)
    default E intMod(E a, E b) {
        return alg().intModulo(a, b);
    }
}
