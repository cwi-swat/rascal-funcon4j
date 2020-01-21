package funcons.interpreter;

import funcons.algebras.ElseAlg;
import funcons.carriers.IEval;
import funcons.values.Bool;
import funcons.values.Environment;

public interface ElseFactory extends ExceptionFactory, ElseAlg<IEval> {

    @Override
    default IEval only(IEval v) {
        return abs(ifTrue(equal(given(), v), (env, forward, store, given) -> new Environment(), fail()));
    }

    @Override
    default IEval any() {
        return abs((env, forward, store, given) -> new Environment());
    }

    @Override
    default IEval whenTrue(IEval exp, IEval x) {
        return ifTrue(exp, x, fail());
    }

    @Override
    default IEval match(IEval exp, IEval pat) {
        return apply(pat, exp);
    }

    @Override
    default IEval pattAbs(IEval pat, IEval x) {
        return abs(scope(match(given(), pat), x));
    }

    @Override
    default IEval pattUnion(IEval pat1, IEval pat2) {
        return abs((env, forward, store, given) -> {
            Environment env1 = (Environment)unAbs(pat1, env, forward, store, given).eval(env, forward, store, given);
            Environment env2 = (Environment)unAbs(pat2, env, forward, store, given).eval(env, forward, store, given);
            return env1.extend(env2);
        });
    }

    @Override
    default IEval pattNonBinding(IEval patt) {
        return abs((env, forward, store, given) -> {
            unAbs(patt, env, forward, store, given).eval(env, forward, store, given);
            return new Environment();
        });
    }
}
