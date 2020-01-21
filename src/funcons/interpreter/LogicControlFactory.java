package funcons.interpreter;

import funcons.algebras.LogicControlAlg;
import funcons.carriers.IEval;
import funcons.values.Bool;
import funcons.values.Null;

public interface LogicControlFactory extends PrintFactory, LogicControlAlg<IEval> {
    @Override
    default IEval effect(IEval e) {
        return (env, forward, store, given) -> {
            e.eval(env, forward, store, given);
            return new Null();
        };
    }

    @Override
    default IEval seq(IEval c, IEval t) {
        return (env, forward, store, given) -> {
            c.eval(env, forward, store, given);
            return t.eval(env, forward, store, given);
        };
    }

    @Override
    default IEval ifTrue(IEval e, IEval c1, IEval c2) {
        return (env, forward, store, given) ->
                (((Bool)e.eval(env, forward, store, given)).boolValue() ? c1 : c2).eval(env, forward, store, given);
    }

    @Override
    default IEval whileTrue(IEval e, IEval c) {
        return ifTrue(
                e,
                seq(c, (env, forward, store, given) -> whileTrue(e, c).eval(env, forward, store, given)),
                null_()
        );
    }
}
