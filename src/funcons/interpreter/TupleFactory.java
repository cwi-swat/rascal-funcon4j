package funcons.interpreter;

import funcons.algebras.TupleAlg;
import funcons.carriers.IEval;
import funcons.values.*;
import funcons.values.properties.Value;

import java.util.NoSuchElementException;

public interface TupleFactory extends AssignFactory, TupleAlg<IEval> {

    @Override
    default IEval tuple() {
        return (env, forward, store, given) -> new Tuple();
    }

    @Override
    default IEval tuple(IEval x) {
        return (env, forward, store, given) -> new Tuple(x.eval(env, forward, store, given));
    }

    @Override
    default IEval tuple(IEval x1, IEval x2) {
        return (env, forward, store, given) -> new Tuple(
                x1.eval(env, forward, store, given),
                x2.eval(env, forward, store, given)
        );
    }

    @Override
    default IEval tuple(IEval x1, IEval x2, IEval x3) {
        return (env, forward, store, given) -> new Tuple(
                x1.eval(env, forward, store, given),
                x2.eval(env, forward, store, given),
                x3.eval(env, forward, store, given)
        );
    }

    @Override
    default IEval tuplePrefix(IEval x, IEval tup) {
        return (env, forward, store, given) -> {
            Tuple t = (Tuple)tup.eval(env, forward, store, given);
            return t.prepend(x.eval(env, forward, store, given));
        };
    }

    @Override
    default IEval tupleTail(IEval tup) {
        return (env, forward, store, given) -> {
            Tuple t = (Tuple)tup.eval(env, forward, store, given);
            Tuple tail = t.tail();
            if (tail == null) {
                throw new NoSuchElementException();
            }
            return tail;
        };
    }

    @Override
    default IEval tupleHead(IEval tup) {
        return (env, forward, store, given) -> {
            Tuple t = (Tuple)tup.eval(env, forward, store, given);
            Value head = t.head();
            if (head == null) {
                throw new NoSuchElementException();
            }
            return head;
        };
    }

    //@Override
    //default IEval invert(IEval tup) {
    //    return (env, store, given) -> ((Tuple)tup.eval(env, store,given)).invert();
    //}

    @Override
    default IEval project(IEval index, IEval tup) {
        return (env, forward, store, given) ->
                ((Tuple)tup.eval(env, forward, store, given)).get((Int) index.eval(env, forward, store, given));
    }

    @Override
    default IEval partialApp(IEval f, IEval x) {
        return abs(apply(f, tuple(x, given())));
    }

    @Override
    default IEval partialAppN(IEval f, IEval x) {
        return abs(apply(f, tuplePrefix(x, given())));
    }

    @Override
    default IEval curry(IEval a) {
        return abs((env, forward, store, given) -> partialApp(a, (e,f,s,g) -> given).eval(env, forward, store, given));
    }

    @Override
    default IEval curryN(IEval n, IEval a) {
        return (env, forward, store, given) -> {
            Int index = (Int)n.eval(env, forward, store, given);
            if (index.intValue() == 0) {
                return apply(a, tuple()).eval(env, forward, store, given);
            }

            return new Abs<IEval>(
                    (localEnv, localForward, localStore, localGiven) -> curryN(
                            intSubtract(n, lit(1)),
                            partialAppN(a, (e,f,s,g) -> localGiven))
                            .eval(env, forward, store, given)
            );
        };
    }

    @Override
    default IEval uncurry(IEval f) {
        return abs(apply(apply(f, project(lit(0), given())), project(lit(1), given())));
    }

    @Override
    default IEval tuplePrefixMatch(IEval tup, IEval p1, IEval p2) {
        return (env, forward, store, given) -> {
            Tuple t = (Tuple)tup.eval(env, forward, store, given);
            Environment e1 = (Environment)match((e, f, s, g) -> t.head(), p1).eval(env, forward, store, given);
            Environment e2 = (Environment)match((e, f, s, g) -> t.tail(), p2).eval(env, forward, store, given);
            return e1.extend(e2);
        };
    }

    @Override
    default IEval tuplePrefixPatt(IEval p1, IEval p2) {
        return abs(tuplePrefixMatch(given(), p1, p2));
    }
}
