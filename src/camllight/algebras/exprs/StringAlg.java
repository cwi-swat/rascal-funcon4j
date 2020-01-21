package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface StringAlg<E> {
    funcons.algebras.StringAlg<E> alg();

    @Syntax("exp = exp '^' exp") @Level(1509)
    default E stringAppendExp(E str1, E str2) {
        return alg().stringAppend(str1, str2);
    }
}
