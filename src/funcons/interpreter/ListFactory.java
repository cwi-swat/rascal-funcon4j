package funcons.interpreter;

import funcons.algebras.ListAlg;
import funcons.carriers.IEval;
import funcons.values.*;
import funcons.values.properties.Value;

public interface ListFactory extends TupleFactory, ListAlg<IEval> {
    @Override
    default IEval list() {
        return (env, forward, store, given) -> new List();
    }

    @Override
    default IEval list(IEval x) {
        return (env, forward, store, given) -> new List(x.eval(env, forward, store, given));
    }

    @Override
    default IEval list(IEval x1, IEval x2) {
        return (env, forward, store, given) -> new List(x1.eval(env, forward, store, given), x2.eval(env, forward, store, given));
    }

    @Override
    default IEval listPrefix(IEval x, IEval l) {
        return (env, forward, store, given) ->
                ((List)l.eval(env, forward, store, given)).prepend(x.eval(env, forward, store, given));
    }

    @Override
    default IEval applyToEach(IEval a, IEval l) {
        return (env, forward, store, given) -> {
            List list = (List)l.eval(env, forward, store, given);
            Value head = list.head();
            List tail = list.tail();

            if (list.equals(new List())) {
                return new Null();
            }

            return seq(apply(a, (e,f,s,g) -> head), applyToEach(a, (e,f,s,g) -> tail)).eval(env, forward, store, given);
        };
    }

    @Override
    default IEval listPrefixMatch(IEval l, IEval p1, IEval p2) {
        return (env, forward, store, given) -> {
            List list = (List)l.eval(env, forward, store, given);
            Environment e1 = (Environment)match((e, f, s, g) -> list.head(), p1).eval(env, forward, store, given);
            Environment e2 = (Environment)match((e, f, s, g) -> list.tail(), p2).eval(env, forward, store, given);
            return e1.extend(e2);
        };
    }

    @Override
    default IEval listPrefixPatt(IEval p1, IEval p2) {
        return abs(listPrefixMatch(given(), p1, p2));
    }

    @Override
    default IEval intClosedInterval(IEval m, IEval n) {
        return (env, forward, store, given) -> {
            Int mValue = (Int)m.eval(env, forward, store, given);
            Int nValue = (Int)n.eval(env, forward, store, given);

            if (((Bool)greater((e,f,s,g) -> mValue, (e,f,s,g) -> nValue).eval(env, forward, store, given)).boolValue()) {
                return new List();
            }

            return listPrefix(m, intClosedInterval(intAdd((e,f,s,g) -> mValue, lit(1)), (e,f,s,g) -> nValue)).eval(env, forward, store, given);
        };
    }

    @Override
    default IEval listReverse(IEval l) {
        return (env, forward, store, given) -> ((List)l.eval(env, forward, store, given)).reverse();
    }

    @Override
    default IEval listAppend(IEval list1, IEval list2) {
        return (env, forward, store, given) -> {
            List l1 = (List)list1.eval(env, forward, store, given);
            List l2 = (List)list2.eval(env, forward, store, given);
            return l1.append(l2);
        };
    }
}
