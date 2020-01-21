package funcons.interpreter.tests;

import funcons.algebras.FloatCalcAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.FloatCalcFactory;
import funcons.values.Bool;
import funcons.values.Environment;
import funcons.values.Float;
import funcons.values.Null;
import org.junit.Before;
import org.junit.Test;

import java.util.function.BiFunction;

import static org.junit.Assert.*;

public class FloatCalcFactoryTest {

    private FloatCalcAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new FloatCalcFactory() {};
    }

    @Test
    public void testLit() throws Exception {
        Float f = (Float)alg.lit(1.0).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(1.0), f);
    }

    @Test
    public void testFloatAdd() throws Exception {
        Float f = (Float)alg.floatAdd(alg.lit(1.5), alg.lit(2.5))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(4.0), f);

        f = (Float)alg.floatAdd(alg.lit(1), alg.lit(2.5))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(3.5), f);
    }

    @Test
    public void testFloatNegate() throws Exception {
        Float f = (Float)alg.floatNegate(alg.lit(1.5))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(-1.5), f);
    }

    @Test
    public void testFloatSubtract() throws Exception {
        Float f = (Float)alg.floatSubtract(alg.lit(2.5), alg.lit(1.5))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(1.0), f);

        f = (Float)alg.floatSubtract(alg.lit(2.5), alg.lit(1))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(1.5), f);
    }

    @Test
    public void testFloatMultiply() throws Exception {
        Float f = (Float)alg.floatMultiply(alg.lit(2.5), alg.lit(1.5))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(3.75), f);

        f = (Float)alg.floatMultiply(alg.lit(2.5), alg.lit(2))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(5.0), f);
    }

    @Test
    public void testFloatDivide() throws Exception {
        Float f = (Float)alg.floatDivide(alg.lit(3.75), alg.lit(1.5))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(2.5), f);

        f = (Float)alg.floatDivide(alg.lit(3.0), alg.lit(2))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(1.5), f);
    }

    @Test
    public void testFloatModulo() throws Exception {
        Float f = (Float)alg.floatModulo(alg.lit(4.0), alg.lit(1.5))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(1.0), f);

        f = (Float)alg.floatModulo(alg.lit(2.5), alg.lit(1))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(.5), f);
    }

    @Test
    public void testFloatPowerOf() throws Exception {
        Float f = (Float)alg.floatPowerOf(alg.lit(4.0), alg.lit(2.0))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(16.0), f);

        f = (Float)alg.floatPowerOf(alg.lit(2), alg.lit(1.5))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float(2.8284271247461903), f);
    }
}