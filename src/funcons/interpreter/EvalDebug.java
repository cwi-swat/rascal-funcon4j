package funcons.interpreter;

import org.rascalmpl.value.ISourceLocation;

import funcons.algebras.DebugAlg;
import funcons.carriers.IEval;

public interface EvalDebug extends EvalFuncon, DebugAlg<IEval> {
	@Override
	default IEval debug(ISourceLocation loc, IEval x) {
		return (env, fw, sto, given) -> {
			System.err.println("DEBUG: " + loc);
			return x.eval(env, fw, sto, given);
		};
	}
}
