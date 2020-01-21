package funcons.interpreter.tests;

import funcons.algebras.ApplyAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.ApplyFactory;
import funcons.values.Abs;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.ids.Id;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplyFactoryTest {

    private ApplyAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new ApplyFactory() {};
    }

    @Test
    public void testAbs() throws Exception {
        {
            Store store = new Store();
            @SuppressWarnings("unchecked")
            Abs<IEval> abs = (Abs<IEval>) alg.abs(alg.lit(1)).eval(new Environment(), new Forwards(), store, new Null());
            Int result = (Int) abs.body().eval(new Environment(), new Forwards(), store, new Null());
            assertEquals(result.intValue(), new Integer(1));
        }
        {
            Store store = new Store();
            @SuppressWarnings("unchecked")
            Abs<IEval> abs = (Abs<IEval>) alg.abs(alg.bind(alg.id("foo")), alg.boundValue(alg.id("foo"))).eval(new Environment(), new Forwards(), store, new Null());
            Int result = (Int) abs.body().eval(new Environment(), new Forwards(), store, new Int(10));
            assertEquals(result.intValue(), new Integer(10));
        }
    }

    @Test
    public void testApply() throws Exception {
        Int i = (Int)alg.apply(alg.abs(alg.intAdd(alg.lit(1), alg.given())), alg.lit(2)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testCompose() throws Exception {
        IEval incr = alg.abs(alg.intAdd(alg.given(), alg.lit(1)));
        IEval double_ = alg.abs(alg.intMultiply(alg.given(), alg.lit(2)));
        Int i = (Int)alg.apply(alg.compose(double_, incr), alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(8), i.intValue());
    }

    @Test
    public void testClosure() throws Exception {
        IEval closure = alg.closure(alg.boundValue(alg.id("foo")), (e,f,s,g) -> new Environment(new Id("foo"), new Int(0)));
        Int i = (Int)closure.eval(new Environment(new Id("foo"), new Int(1)), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testClose() throws Exception {
        IEval close = alg.close(alg.abs(alg.boundValue(alg.id("foo"))));
        @SuppressWarnings("unchecked")
        Abs<IEval> f = (Abs<IEval>)close.eval(new Environment(new Id("foo"), new Int(0)), new Forwards(), new Store(), new Null());
        Int i = (Int)f.body().eval(new Environment(new Id("foo"), new Int(1)), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testBind() throws Exception {
        Store store = new Store();
        Environment env = (Environment)alg.apply(alg.bind(alg.id("foo")), alg.lit(3)).eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(((Int)alg.boundValue(alg.id("foo")).eval(env, new Forwards(), store, new Null())).intValue(), new Integer(3));
    }
}