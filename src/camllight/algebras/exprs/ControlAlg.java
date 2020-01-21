package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface ControlAlg<E> {
    funcons.algebras.ListAlg<E> alg();

    @Syntax("exp = 'if' exp 'then' exp") @Level(800)
    default E if_(E e1, E e2) {
        return ifElse(e1, e2, alg().null_());
    }

    @Syntax("exp = 'if' exp 'then' exp 'else' exp") @Level(801)
    default E ifElse(E e1, E e2, E e3) {
        return alg().ifTrue(e1, e2, e3);
    }

    @Syntax("exp = 'while' exp 'do' exp 'done'") @Level(700)
    default E whileTrue(E e, E c) {
        return alg().whileTrue(e, alg().effect(c));
    }

    @Syntax("exp = 'for' ident '=' exp 'to' exp 'do' exp 'done'") @Level(600)
    default E for_(E id, E start, E finish, E exp) {
        return alg().applyToEach(alg().abs(alg().bind(id), alg().effect(exp)), alg().intClosedInterval(start, finish));
    }

    @Syntax("exp = 'for' ident '=' exp 'downto' exp 'do' exp 'done'") @Level(601)
    default E forDownto(E id, E finish, E start, E exp) {
        return alg().applyToEach(alg().abs(alg().bind(id), alg().effect(exp)), alg().listReverse(alg().intClosedInterval(start, finish)));
    }

    @Syntax("exp = 'match' exp 'with' pattmatch") @Level(400)
    default E matchWith(E exp, E patt) {
        return alg().apply(alg().preferOver(patt, alg().abs(alg().throw_(alg().matchFailure()))), exp);
    }

    @Syntax("exp = <assoc=right> exp ';' exp") @Level(500)
    default E seq(E e1, E e2) {
        return alg().seq(alg().effect(e1), e2);
    }
}