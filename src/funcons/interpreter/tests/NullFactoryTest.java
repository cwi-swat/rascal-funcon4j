package funcons.interpreter.tests;

import funcons.algebras.NullAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.NullFactory;
import funcons.values.Environment;
import funcons.values.Null;
import funcons.values.Undefined;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NullFactoryTest {

    private NullAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new NullFactory() {};
    }

    @Test
    public void testNull_() throws Exception {
        Null n = (Null)alg.null_().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(n, new Null());
    }

    @Test
    public void testUndefined() throws Exception {
        Undefined u = (Undefined)alg.undefined().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Undefined(), u);
    }
}