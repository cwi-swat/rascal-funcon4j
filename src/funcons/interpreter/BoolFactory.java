package funcons.interpreter;

import funcons.algebras.BoolAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.values.Bool;
import funcons.values.Environment;
import funcons.values.Null;
import funcons.values.properties.Comparable;

public interface BoolFactory extends FloatCalcFactory, BoolAlg<IEval> {
    @Override
    default IEval bool(java.lang.Boolean b) {
        return (env, forward, store, given) -> new Bool(b);
    }

    @Override
    default IEval not(IEval bool) {
        return (env, forward, store, given) -> new Bool(!((Bool)bool.eval(env, forward, store, given)).boolValue());
    }

    @Override
    default IEval greater(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Comparable)a.eval(env, forward, store, given)).greaterThan(
                            (b.eval(env, forward, store, given))));
    }

    @Override
    default IEval smaller(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Comparable)a.eval(env, forward, store, given)).smallerThan(
                                (b.eval(env, forward, store, given))));
    }

    @Override
    default IEval greaterEqual(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Comparable)a.eval(env, forward, store, given)).greaterEqualThan(
                                (b.eval(env, forward, store, given))));
    }

    @Override
    default IEval smallerEqual(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Comparable)a.eval(env, forward, store, given)).smallerEqualThan(
                                (b.eval(env, forward, store, given))));
    }

    @Override
    default IEval equal(IEval x1, IEval x2) {
        return (env, forward, store, given) -> {
            //System.out.println(x1.eval(env, forward, store, given));
            //System.out.println(x2.eval(env, forward, store, given));
            return new Bool(
                            x1.eval(env, forward, store, given).equals(
                                    x2.eval(env, forward, store, given)));
        };
    }

    @Override
    default IEval physicalEqual(IEval e1, IEval e2) {
        return (env, forward, store, given) -> {
            System.out.println(e1.eval(env, forward, store, given) == e2.eval(env, forward, store, given));
            System.out.println(e1.eval(env, forward, store, given));
            System.out.println(e2.eval(env, forward, store, given));
            return new Bool(
                            e1.eval(env, forward, store, given)
                            ==
                            e2.eval(env, forward, store, given)
            );
        };
    }
}
