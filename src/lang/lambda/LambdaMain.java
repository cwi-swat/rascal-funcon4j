package lang.lambda;

import funcons.algebras.ApplyAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.ApplyFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.ids.Id;
import funcons.values.properties.Value;
import funcons.values.signals.FunconException;

interface Lambda<T, A extends ApplyAlg<T>> {
	A alg();
	
	default T Var(String x) {
		return alg().boundValue(alg().id(x));
	}

	default T Apply(T e1, T e2) {
		return alg().apply(e1, e2);
	}
	
	default T Lambda(String x, T e) {
		return alg().abs(alg().bind(alg().id(x)), e);
	}
}


public class LambdaMain {
	
	interface EvalBinding extends ApplyFactory {}
	
	public static void main(String[] args) {
		Lambda<IEval, EvalBinding> ev = () -> new EvalBinding() {};
				
		IEval exp = ev.Apply(ev.Lambda("x", ev.Var("x")), ev.Var("y"));
		
		try {
			Value result = exp.eval(new Environment(new Id("y"), new Int(3)), new Forwards(), new Store(), new Null());
			System.out.println(result);
		} catch (FunconException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}