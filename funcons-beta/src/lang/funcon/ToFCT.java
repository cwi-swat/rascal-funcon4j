package lang.funcon;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

import org.rascalmpl.interpreter.IEvaluator;
import org.rascalmpl.interpreter.IEvaluatorContext;
import org.rascalmpl.interpreter.control_exceptions.MatchFailed;
import org.rascalmpl.interpreter.env.Environment;
import org.rascalmpl.interpreter.result.AbstractFunction;
import org.rascalmpl.interpreter.result.ICallableValue;
import org.rascalmpl.interpreter.result.Result;
import org.rascalmpl.interpreter.result.ResultFactory;
import org.rascalmpl.interpreter.types.FunctionType;
import org.rascalmpl.interpreter.utils.RuntimeExceptionFactory;

import funcons.carriers.IPrint;
import funcons.prettyprinter.PrintableFactory;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IConstructor;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IReal;
import io.usethesource.vallang.IString;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.type.Type;
import io.usethesource.vallang.visitors.VisitorAdapter;

public class ToFCT {
	
	public IValueFactory value_factory;
	
	public ToFCT(IValueFactory factory) {
		this.value_factory = factory;
	}
	
	private static Type lookupAliasedType(IEvaluator<?> eval, String mod, String ty) {
		Type found = eval.getCurrentEnvt().lookupAlias(ty);
		while (found != null && found.isAliased()) {
			found = found.getAliased();
		}
		if (found == null) {
			throw new IllegalStateException("Could not find the IPrint type");
		}
		return found;
	}

	
	private class IPrintClosure extends AbstractFunction {
		
		private final IPrint printer;
		
		public IPrintClosure(IEvaluator<Result<IValue>> eval, IPrint printer) {
			super(eval.getCurrentAST(), eval, (FunctionType)lookupAliasedType(eval, "lang::funcon::ToFCT", "IPrint"), Collections.emptyList(), false, eval.getCurrentEnvt());
			this.printer = printer;
		}

		@Override
		public Result<IValue> call(Type[] arg1, IValue[] args, Map<String, IValue> keyArgValues)
				throws MatchFailed {
	          return ResultFactory.makeResult(functionType.getReturnType(), value_factory.string(printer.toFCT()), ctx);
		}

		@Override
		public int getArity() {
			return 0;
		}
		
		@Override
		public boolean isStatic() {
			return false;
		}
		
		@Override
		public ICallableValue cloneInto(Environment arg0) {
			return null;
		}
		
		@Override
		public boolean isDefault() {
			return false;
		}
	}
	
	public ICallableValue toFCT(IConstructor funCon, IEvaluatorContext ctx) {
		PrintableFactory factory = new PrintableFactory() { };
	    VisitorAdapter<IPrint, Throwable> convert = new VisitorAdapter<IPrint, Throwable>(null) {
		
		
			@Override
			public IPrint visitConstructor(IConstructor o) throws Throwable {
				//ctx.getStdOut().print("Visiting: " + o + "\n");
				Object[] args = new Object[o.arity()];
				Class<?>[] types = new Class<?>[o.arity()];
				int i = 0;
				for (IValue kid: o.getChildren()) {
					//ctx.getStdOut().print("KID: " + kid + "\n");
					//ctx.getStdOut().print("KID: " + kid.getType() + "\n");
					if (kid.getType().isList()) {
						args[i]  = visitListChildren((IList) kid); 
					    types[i] = IPrint[].class;
					}
					else if (kid.getType().isAbstractData()) {
						//ctx.getStdOut().print("ADT: " + kid + "\n");
						// I don't know how this visitor works...
						args[i] = visitConstructor((IConstructor) kid);
						types[i] = IPrint.class;
					}
					else if (kid.getType().isConstructor()) {
						//ctx.getStdOut().print("Constructor: " + kid + "\n");
						args[i] = kid.accept(this);
						types[i] = IPrint.class;
					}
					else if (kid.getType().isString()) {
						args[i] = ((IString)kid).getValue();
						types[i] = String.class;
					}
					else if (kid.getType().isBool()) {
						args[i] = ((IBool)kid).getValue();
						types[i] = Boolean.class;
					}
					else if (kid.getType().isInteger()) {
						args[i] = ((IInteger)kid).intValue();
						types[i] = Integer.class;
					}
					else if (kid.getType().isReal()) {
						args[i] = ((IReal)kid).floatValue();
						types[i] = Float.class;
					}
					else {
						//ctx.getStdOut().print("Illegal: " + kid + "\n");
						throw RuntimeExceptionFactory.illegalArgument(value_factory.string("unsupported value: " + kid), null, null);
					}
					i++;
				}
				
				Method method = factory.getClass().getMethod(o.getName(), types);
				
				return (IPrint) method.invoke(factory, args);
			}

			private IPrint[] visitListChildren(IList list) throws Throwable {
				IPrint[] result = new IPrint[list.size()];
				int i = 0;
				for (IValue elem : list) {
					result[i++] = visitConstructor((IConstructor) elem);
				}
				return result;
			}
		};
	
		try {
			IPrint printer = funCon.accept(convert);
			//ctx.getStdOut().print("eval: " + eval+ "\n");
			return new IPrintClosure(ctx.getEvaluator(), printer);
		} catch (Throwable e) {
			//ctx.getStdOut().print("Exception: " + e.getMessage() + "\n");
			throw RuntimeExceptionFactory.illegalArgument(value_factory.string("unsupported funcon: " + funCon + "; " + e.getMessage()), null, null);
		}
	}
}