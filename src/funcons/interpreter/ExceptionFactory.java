package funcons.interpreter;

import funcons.algebras.ExceptionAlg;
import funcons.carriers.IEval;
import funcons.values.signals.FailureTrue;
import funcons.values.cl.CLMatchFailureException;
import funcons.values.signals.RunTimeFunconException;

public interface ExceptionFactory extends ApplyFactory, ExceptionAlg<IEval> {

    @Override
    default IEval fail() {
        return (env, forward, store, given) -> {
            throw new FailureTrue();
        };
    }

    @Override
    default IEval matchFailure() {
        return (env, forward, store, given) -> new CLMatchFailureException();
    }

    @Override
    default IEval exception(java.lang.String message) {
        return (env, forward, store, given) -> new RunTimeFunconException(message);
    }

    @Override
    default IEval exception(java.lang.String message, IEval val) {
        return (env, forward, store, given) -> new RunTimeFunconException(message, val.eval(env, forward, store, given));
    }

    @Override
    default IEval throw_(IEval s) {
        return (env, forward, store, given) -> {
            throw (RunTimeFunconException)s.eval(env, forward, store, given);
        };
    }

    @Override
    default IEval catch_(IEval x, IEval abs) {
        return (env, forward, store, given) -> {
            try {
                return x.eval(env, forward, store, given);
            } catch (RunTimeFunconException e) {
                return apply(abs, (env1, forward1, store1, given1) -> e).eval(env, forward, store, given);
            }
        };
    }

    @Override
    default IEval catchElseRethrow(IEval x, IEval abs) {
        return catch_(x, preferOver(abs, abs(throw_(given()))));
    }

    @Override
    default IEval else_(IEval x1, IEval x2) {
        return (env, forward, store, given) -> {
            try {
                return x1.eval(env, forward, store, given);
            } catch(FailureTrue f) {
                return x2.eval(env, forward, store, given);
            }
        };
    }

    @Override
    default IEval preferOver(IEval a1, IEval a2) {
        return (env, forward, store, given) ->
                abs(else_(
                        unAbs(a1, env, forward, store, given),
                        unAbs(a2, env, forward, store, given))
                ).eval(env, forward, store, given);
    }
}
