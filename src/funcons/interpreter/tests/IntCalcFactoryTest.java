package funcons.interpreter.tests;

import funcons.algebras.IntCalcAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.IntCalcFactory;
import funcons.values.Bool;
import funcons.values.Environment;
import funcons.values.Null;
import org.junit.Before;
import org.junit.Test;

import java.util.function.BiFunction;

import static org.junit.Assert.assertEquals;

public class IntCalcFactoryTest {
    private IntCalcAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new IntCalcFactory() {};
    }

    @Test
    public void testLit() throws Exception {
        funcons.values.Int i = (funcons.values.Int)alg.lit(0).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testIntAdd() throws Exception {
        funcons.values.Int i = (funcons.values.Int)alg.intAdd(alg.lit(6), alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(9), i.intValue());
    }

    @Test
    public void testIntNegate() throws Exception {
        funcons.values.Int i = (funcons.values.Int)alg.intNegate(alg.lit(1)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(-1), i.intValue());
    }

    @Test
    public void testIntSubtract() throws Exception {
        funcons.values.Int i = (funcons.values.Int)alg.intSubtract(alg.lit(6), alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testIntMultiply() throws Exception {
        funcons.values.Int i = (funcons.values.Int)alg.intMultiply(alg.lit(6), alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(18), i.intValue());
    }

    @Test
    public void testIntDivide() throws Exception {
        funcons.values.Int i = (funcons.values.Int)alg.intDivide(alg.lit(6), alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(2), i.intValue());
    }


    @Test
    public void testIntModulo() throws Exception {
        funcons.values.Int i = (funcons.values.Int)alg.intModulo(alg.lit(6), alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }
}