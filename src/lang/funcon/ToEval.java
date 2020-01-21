package lang.funcon;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

import org.rascalmpl.debug.IRascalMonitor;
import org.rascalmpl.interpreter.IEvaluator;
import org.rascalmpl.interpreter.IEvaluatorContext;
import org.rascalmpl.interpreter.env.Environment;
import org.rascalmpl.interpreter.result.AbstractFunction;
import org.rascalmpl.interpreter.result.ICallableValue;
import org.rascalmpl.interpreter.result.Result;
import org.rascalmpl.interpreter.result.ResultFactory;
import org.rascalmpl.interpreter.types.FunctionType;
import org.rascalmpl.interpreter.types.RascalTypeFactory;
import org.rascalmpl.interpreter.utils.RuntimeExceptionFactory;

import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.RecordFactory;
import funcons.values.Bool;
import funcons.values.Int;
import funcons.values.properties.Value;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IAnnotatable;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IConstructor;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IReal;
import io.usethesource.vallang.IString;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.IWithKeywordParameters;
import io.usethesource.vallang.type.Type;
import io.usethesource.vallang.type.TypeFactory;
import io.usethesource.vallang.visitors.IValueVisitor;
import io.usethesource.vallang.visitors.VisitorAdapter;

public class ToEval {

		private IValueFactory vf;

		public ToEval(IValueFactory vf) {
			this.vf = vf;
		}
		
		private static class IEvalClosure extends AbstractFunction 
		  implements Cloneable, ICallableValue {

			private final IEvaluator<Result<IValue>> eval;
			private final IEval myEval;
			private final IValueFactory vf;
			
			private static final RascalTypeFactory rtf = RascalTypeFactory.getInstance();
			private static final TypeFactory tf = TypeFactory.getInstance();
			
			private static final Type myType = rtf.functionType(
					tf.valueType(), tf.tupleType(tf.valueType()), null);

			// eval.getCurrentEnvt().getStore().lookupAlias("IEval")
			public IEvalClosure(IEvaluator<Result<IValue>> eval, IEval myEval, IValueFactory vf) {
				super(null, eval, (FunctionType)myType, 
						Collections.emptyList(), false, eval.getCurrentEnvt());
				this.eval = eval;
				this.myEval = myEval;
				this.vf = vf;
			}
			
			@Override
			public Type getType() {
				return myType;
			}

			@Override
			public Result<IValue> call(Type[] arg0, IValue[] arg1,
			    Map<String, IValue> arg2) {
				return call(null, arg0, arg1, arg2);
			}

			@Override
			public Result<IValue> call(IRascalMonitor arg0, Type[] arg1, IValue[] args, Map<String, IValue> arg3) {
				funcons.values.Environment env = new funcons.values.Environment();
				Forwards forward = new Forwards();
				Store store = new Store();
				IValue rgiven = args[0];
				
				try {
					return ResultFactory.makeResult(TypeFactory.getInstance().valueType(), 
							value2ivalue(myEval.eval(env, forward, store, ivalue2value(rgiven))), eval);
				} catch (FunconException e) {
					throw RuntimeExceptionFactory.javaException(e, null, null);
				}
			}

			private IValue value2ivalue(Value v) {
				if (v instanceof Int) {
					return vf.integer(((Int) v).intValue());
				}
				else if (v instanceof Bool) {
					return vf.bool(((Bool) v).boolValue());
				}
				else if (v instanceof funcons.values.String) {
					return vf.string(((funcons.values.String) v).stringValue());
				}
				else {
					return vf.node("unsupported", vf.string(v.toString()));
				}
			}

			private Value ivalue2value(IValue v) {
				if (v.getType().isInteger()) {
					return new Int(((IInteger)v).intValue());
				}
				else if (v.getType().isBool()) {
					return new Bool(((IBool)v).getValue());
				}
				else if (v.getType().isString()) {
					return new funcons.values.String(((IString)v).getValue());
				}
				else {
					return new funcons.values.String("UNSUPPORTED: " + v.toString());
				}
			}

			@Override
			public ICallableValue cloneInto(Environment arg0) {
				try {
					return (ICallableValue) this.clone();
				} catch (CloneNotSupportedException e) {
					throw new RuntimeException(e);
				}
			}

			@Override
			protected Object clone() throws CloneNotSupportedException {
				return new IEvalClosure(eval, myEval, vf);
			}
			
			@Override
			public int getArity() {
				return 1;
			}

			@Override
			public IEvaluator<Result<IValue>> getEval() {
				return eval;
			}

			@Override
			public boolean hasKeywordArguments() {
				return false;
			}

			@Override
			public boolean hasVarArgs() {
				return false;
			}

			@Override
			public boolean isStatic() {
				return false;
			}

			@Override
			public IConstructor encodeAsConstructor() {
				return null;
			}

			@Override
			public <T, E extends Throwable> T accept(IValueVisitor<T, E> arg0)
			    throws E {
				return null;
			}

			@Override
			public IAnnotatable<? extends IValue> asAnnotatable() {
				return null;
			}

			@Override
			public IWithKeywordParameters<? extends IValue> asWithKeywordParameters() {
				return null;
			}

			@Override
			public boolean isAnnotatable() {
				return false;
			}

			@Override
			public boolean isEqual(IValue arg0) {
				return this == arg0;
			}

			@Override
			public boolean mayHaveKeywordParameters() {
				return false;
			}

			@Override
			public boolean isDefault() {
				return false;
			}
			
		}
		
		public IValue toEval(IConstructor funCon, IEvaluatorContext ctx) {
			RecordFactory factory = new RecordFactory() { };
			
			VisitorAdapter<IEval, Throwable> convert = new VisitorAdapter<IEval, Throwable>(null) {
				
				
				@Override
				public IEval visitConstructor(IConstructor o) throws Throwable {
					//ctx.getStdOut().print("Visiting: " + o + "\n");
					Object[] args = new Object[o.arity()];
					Class<?>[] types = new Class<?>[o.arity()];
					int i = 0;
					for (IValue kid: o.getChildren()) {
						//ctx.getStdOut().print("KID: " + kid + "\n");
						//ctx.getStdOut().print("KID: " + kid.getType() + "\n");
						
						if (kid.getType().isAbstractData()) {
							//ctx.getStdOut().print("ADT: " + kid + "\n");
							// I don't know how this visitor works...
							args[i] = visitConstructor((IConstructor) kid);
							types[i] = IEval.class;
						}
						else if (kid.getType().isConstructor()) {
							//ctx.getStdOut().print("Constructor: " + kid + "\n");
							args[i] = kid.accept(this);
							types[i] = IEval.class;
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
							throw RuntimeExceptionFactory.illegalArgument(vf.string("unsupported value: " + kid), null, null);
						}
						i++;
					}
					
					Method method = factory.getClass().getMethod(o.getName(), types);
					
					return (IEval) method.invoke(factory, args);
				}
			};
			
			try {
				IEval eval = funCon.accept(convert);
				//ctx.getStdOut().print("eval: " + eval+ "\n");
				return new IEvalClosure(ctx.getEvaluator(), eval, vf);
			} catch (Throwable e) {
				//ctx.getStdOut().print("Exception: " + e.getMessage() + "\n");
				throw RuntimeExceptionFactory.illegalArgument(vf.string("unsupported funcon: " + funCon + "; " + e.getMessage()), null, null);
			}
			
		}
}
