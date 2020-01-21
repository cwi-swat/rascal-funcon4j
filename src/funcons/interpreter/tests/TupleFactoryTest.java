package funcons.interpreter.tests;

import funcons.algebras.TupleAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.TupleFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.Tuple;
import funcons.values.ids.Id;
import funcons.values.signals.FailureTrue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TupleFactoryTest {

    private TupleAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new TupleFactory() {};
    }

    @Test
    public void testTuple() throws Exception {
        Tuple t = (Tuple)alg.tuple().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Tuple(), t);
        t = (Tuple)alg.tuple(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Tuple(new Int(0)), t);
        t = (Tuple)alg.tuple(alg.lit(0), alg.lit(1)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Tuple(new Int(0), new Int(1)), t);
        t = (Tuple)alg.tuple(alg.lit(0), alg.lit(1), alg.lit(2)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Tuple(new Int(0), new Int(1), new Int(2)), t);
        System.out.println(t);
    }

    @Test
    public void testTuplePrefix() throws Exception {
        Tuple t = (Tuple)alg.tuplePrefix(alg.lit(5), alg.tuple()).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), ((Int)t.get(new Int(0))).intValue());

        t = (Tuple)alg.tuplePrefix(alg.lit(1), alg.tuplePrefix(alg.lit(2), alg.tuplePrefix(alg.lit(3), alg.tuple())))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(t, alg.tuple(alg.lit(1), alg.lit(2), alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null()));
    }

    @Test
    public void testProject() throws Exception {
        IEval tup1 = alg.tuple(alg.lit(1));
        IEval tup2 = alg.tuple(alg.lit(1), alg.lit(2));
        IEval tup3 = alg.tuple(alg.lit(1), alg.lit(2), alg.lit(3));

        Int i = (Int)alg.project(alg.lit(0), tup1).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), i.intValue());
        i = (Int)alg.project(alg.lit(1), tup2).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(2), i.intValue());
        i = (Int)alg.project(alg.lit(2), tup3).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testPartialApp() throws Exception {
        IEval incr = alg.partialApp(alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given()))), alg.lit(1));
        Int i = (Int)alg.apply(incr, alg.lit(2)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testPartialAppN() throws Exception {
        IEval uncurriedAdd = alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given())));
        IEval add2 = alg.partialAppN(uncurriedAdd, alg.lit(2));
        IEval add2to3 = alg.partialAppN(add2, alg.lit(3));
        Int i = (Int)alg.apply(add2to3, alg.tuple()).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }

    @Test
    public void testCurry() throws Exception {
        IEval uncurriedAdd = alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given())));
        IEval addTwo = alg.apply(alg.curry(uncurriedAdd), alg.lit(2));
        Int i = (Int) alg.apply(addTwo, alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }

    @Test
    public void testCurryN() throws Exception {
        IEval uncurriedAdd = alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given())));
        IEval curriedAdd = alg.curryN(alg.lit(2), uncurriedAdd);
        IEval add2 = alg.apply(curriedAdd, alg.lit(2));
        IEval add2to3 = alg.apply(add2, alg.lit(3));
        Int i = (Int)add2to3.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }

    @Test
    public void testUncurry() throws Exception {
        IEval curriedAdd = alg.curry(alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given()))));
        IEval uncurriedAdd = alg.uncurry(curriedAdd);
        Int i = (Int)alg.apply(uncurriedAdd, alg.tuple(alg.lit(2), alg.lit(3))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }

    @Test
    public void testTuplePrefixMatch() throws Exception {
        IEval onlyZero = alg.abs(alg.seq(alg.match(alg.given(), alg.only(alg.lit(0))), alg.bindValue(alg.id("x"), alg.lit(5))));
        IEval anything = alg.abs(alg.seq(alg.match(alg.given(), alg.any()), alg.bindValue(alg.id("y"), alg.lit(6))));
        Environment env = (Environment)alg.tuplePrefixMatch(alg.tuple(alg.lit(0), alg.lit(1), alg.lit(2)), onlyZero, anything)
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(6), ((Int)env.val(new Id("y"))).intValue());

        IEval shouldFail = alg.tuplePrefixMatch(alg.tuple(alg.lit(9), alg.lit(1), alg.lit(2)), onlyZero, anything);
        try {
            shouldFail.eval(new Environment(), new Forwards(), new Store(), new Null());
        } catch (FailureTrue f) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testTuplePrefixPatt() throws Exception {
        IEval pattBindY = alg.tuplePrefixPatt(alg.bind(alg.id("y")), alg.only(alg.tuple()));
        IEval pattBindXY = alg.tuplePrefixPatt(alg.bind(alg.id("x")), pattBindY);
        Environment env = (Environment)alg.match(alg.tuple(alg.lit(1), alg.lit(2)), pattBindXY).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(1), env.val(new Id("x")));
        assertEquals(new Int(2), env.val(new Id("y")));
    }

    @Test
    public void testTupleTail() throws Exception {
        IEval tailEval = alg.tupleTail(alg.tuple(alg.lit(0), alg.lit(1), alg.lit(2)));
        Tuple t = (Tuple)tailEval.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Tuple(new Int(1), new Int(2)), t);
    }

    @Test
    public void testTupleHead() throws Exception {
        IEval headEval = alg.tupleHead(alg.tuple(alg.lit(0), alg.lit(1), alg.lit(2)));
        Int i = (Int)headEval.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }
}