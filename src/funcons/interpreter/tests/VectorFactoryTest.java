package funcons.interpreter.tests;

import funcons.algebras.VectorAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.VectorFactory;
import funcons.values.*;
import funcons.values.ids.Id;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorFactoryTest {

    private VectorAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new VectorFactory() {};
    }

    @Test
    public void testVector() throws Exception {
        Vector v = (Vector)alg.vector().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Vector(), v);
    }

    @Test
    public void testVector1() throws Exception {
        Store store = new Store();
        Vector v = (Vector)alg.vector(alg.lit(3)).eval(new Environment(), new Forwards(), store, new Null());
        //assertEquals(new Vector(new Variable(0, store)), v);
        assertEquals(new Int(3), store.val((Variable)v.get(new Int(0))));
    }

    @Test
    public void testVectorSelect() throws Exception {
        Int i = (Int)alg.vectorSelect(alg.vector(alg.lit(1)), alg.lit(0))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), i.intValue());
    }

    @Test
    public void testVectorAppend() throws Exception {
        Store store = new Store();
        Vector v = (Vector)alg.vectorAppend(alg.vector(alg.lit(2)), alg.vector(alg.lit(3)))
                .eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(new Int(2), store.val((Variable)v.get(new Int(0))));
        assertEquals(new Int(3), store.val((Variable)v.get(new Int(1))));
    }

    @Test
    public void testVectorAssign() throws Exception {
        Store store = new Store();
        Environment env = (Environment)alg.bindValue(alg.id("foo"), alg.vector(alg.lit(2)))
                .eval(new Environment(), new Forwards(), store, new Null());
        alg.vectorAssign(alg.boundValue(alg.id("foo")), alg.lit(0), alg.lit(3))
                .eval(env, new Forwards(), store, new Null());
        assertEquals(new Vector(new Variable(0, store)), env.val(new Id("foo")));
        assertEquals(new Int(3), store.val((Variable)((Vector)env.val(new Id("foo"))).get(new Int(0))));

    }

    @Test
    public void testVectorLength() throws Exception {
        Int i = (Int)alg.vectorLength(alg.vector())
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(0), i);

        i = (Int)alg.vectorLength(alg.vector(alg.lit(5)))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(1), i);

        i = (Int)alg.vectorLength(
                alg.vectorAppend(alg.vector(alg.lit(6)), alg.vector(alg.lit(7)))
        ).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(2), i);
    }
}