package funcons.debug;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import camllight.CamlLight;
import camllight.algebras.AllAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.values.Environment;
import funcons.values.properties.Value;
import funcons.values.signals.FunconException;

public class Tracer<A> implements InvocationHandler{

	private Class<?>[] ifaces;
	private A alg;


	public Tracer(A alg, Class<?>[] ifaces) {
		this.alg = alg;
		this.ifaces = ifaces;
	}
	
	@SuppressWarnings("unchecked")
	public A make() {
		return (A) Proxy.newProxyInstance(this.getClass().getClassLoader(), ifaces, this);
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("creating " + method.getName());
		IEval myEval = (IEval) method.invoke(alg, args);
		return Proxy.newProxyInstance(Tracer.class.getClassLoader(), new Class<?>[] {IEval.class}, (Object p, Method m, Object[] as) -> {
			 //eval(Environment env, Forwards forward, Store store, Value given) throws FunconException;
			Environment env = (Environment) as[0];
			Forwards forwards = (Forwards) as[1];
			Store store = (Store)as[2];
			Value given = (Value)as[3];
			System.out.println("Given to " + method.getName() + ": " + given);
			Value result = myEval.eval(env, forwards, store, given);
			System.out.println("  Evaluates to: " + result);
			return result;
		});
	}
	
	
	public static void main(String[] args) throws FunconException {
		AllAlg<IEval> myalg = (camllight.algebras.AllAlg<IEval>) () -> new funcons.interpreter.RecordFactory() {};
		Value v = CamlLight.eval("let add x y = x + y;; add 1 2;;", new Tracer<AllAlg<IEval>>(myalg, new Class<?>[] {AllAlg.class}).make());
		System.out.println(v);
	}
	

}
