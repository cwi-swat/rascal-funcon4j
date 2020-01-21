package funcons.interpreter.tests;

import funcons.algebras.BoolAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.BoolFactory;
import funcons.values.Bool;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import org.junit.Before;
import org.junit.Test;

import java.util.function.BiFunction;

import static org.junit.Assert.*;

public class BoolFactoryTest {

    private BoolAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new BoolFactory() {};
    }

    @Test
    public void testBool() throws Exception {
        Bool b = (Bool)alg.bool(false).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(b.boolValue(), false);
    }

    @Test
    public void testNot() throws Exception {
        Bool b = (Bool)alg.not(alg.bool(true)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertFalse(b.boolValue());

        b = (Bool)alg.not(alg.bool(false)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertTrue(b.boolValue());
    }

    @Test
    public void testGreater() throws Exception {
        boolOpTester(alg::greater, true, false, false);
    }

    @Test
    public void testSmaller() throws Exception {
        boolOpTester(alg::smaller, false, true, false);
    }

    @Test
    public void testGreaterEqual() throws Exception {
        boolOpTester(alg::greaterEqual, true, false, true);
    }

    @Test
    public void testSmallerEqual() throws Exception {
        boolOpTester(alg::smallerEqual, false, true, true);
    }

    private void boolOpTester(BiFunction<IEval, IEval, IEval> f, boolean greaterThan, boolean smallerThan, boolean equal) throws Exception {
        assertEquals(
                greaterThan,
                ((Bool)f.apply(alg.lit(6), alg.lit(3))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertEquals(
                smallerThan,
                ((Bool)f.apply(alg.lit(3), alg.lit(6))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertEquals(
                equal,
                ((Bool)f.apply(alg.lit(3), alg.lit(3))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());

        assertEquals(
                greaterThan,
                ((Bool)f.apply(alg.lit(6.0), alg.lit(3.0))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertEquals(
                smallerThan,
                ((Bool)f.apply(alg.lit(3.0), alg.lit(6.0))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertEquals(
                equal,
                ((Bool)f.apply(alg.lit(3.0), alg.lit(3.0))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());

        assertEquals(
                greaterThan,
                ((Bool)f.apply(alg.lit(6.0), alg.lit(3))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertEquals(
                smallerThan,
                ((Bool)f.apply(alg.lit(3), alg.lit(6.0))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
    }

    @Test
    public void testEqual() throws Exception {
        assertTrue(((Bool)alg.equal(alg.lit(3), alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertFalse(((Bool)alg.equal(alg.bool(true), alg.bool(false)).eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
    }

    @Test
    public void testPhysicalEqual() throws Exception {
        Int i = new Int(0);
        assertTrue(((Bool)alg.physicalEqual((e,f,s,g) -> i, (e,f,s,g) -> i)
                .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());

        assertFalse(((Bool)alg.physicalEqual(alg.lit(1), alg.lit(1))
                .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
    }
}