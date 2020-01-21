package funcons.interpreter;

import funcons.algebras.IntCalcAlg;
import funcons.carriers.IEval;
import funcons.values.properties.Number;
import funcons.values.Int;

public interface IntCalcFactory extends NullFactory, IntCalcAlg<IEval> {
    @Override
    default IEval lit(java.lang.Integer i) {
        return (env, forward, store, given) -> new Int(i);
    }

    @Override
    default IEval intAdd(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                +
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intNegate(IEval x) {
        return (env, forward, store, given) ->
                new Int(-((Number)x.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intSubtract(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                -
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intMultiply(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                *
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intDivide(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                /
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intModulo(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                %
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }
}
