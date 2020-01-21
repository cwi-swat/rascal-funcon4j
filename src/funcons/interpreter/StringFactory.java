package funcons.interpreter;

import funcons.algebras.StringAlg;
import funcons.carriers.IEval;
import funcons.values.Char;
import funcons.values.cl.CLChar;
import funcons.values.cl.CLString;
import funcons.values.String;

public interface StringFactory extends BoolFactory, StringAlg<IEval> {
    @Override
    default IEval string(java.lang.String s) {
        return (env, forwards, store, given) -> new String(s);
    }

    @Override
    default IEval char_(Character c) {
        return (env, forwards, store, given) -> new Char(c);
    }

    @Override
    default IEval camlLightString(java.lang.String s) {
        return (env, forwards, store, given) -> new CLString(s);
    }

    @Override
    default IEval camlLightChar(java.lang.String s) {
        return (env, forwards, store, given) -> new CLChar(s);
    }

    @Override
    default IEval stringAppend(IEval str1, IEval str2) {
        return (env, forwards, store, given) -> {
            funcons.values.String s1 = (funcons.values.String)str1.eval(env, forwards, store, given);
            funcons.values.String s2 = (funcons.values.String)str2.eval(env, forwards, store, given);
            return s1.append(s2);
        };
    }
}
