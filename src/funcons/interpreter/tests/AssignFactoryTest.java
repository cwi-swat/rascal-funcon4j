package funcons.interpreter.tests;

import funcons.algebras.AssignAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AssignFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.Variable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AssignFactoryTest {

    private AssignAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new AssignFactory() {};
    }

    @Test
    public void testAlloc() throws Exception {
        Store store = new Store();
        Variable v = (Variable)alg.alloc(alg.lit(0)).eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(new Integer(0), ((Int)store.val(v)).intValue());
    }

    @Test
    public void testAssign() throws Exception {
        Store store = new Store();
        Variable v = (Variable)alg.alloc(alg.lit(0)).eval(new Environment(), new Forwards(), store, new Null());
        alg.assign((e,f,s,g) -> v, alg.lit(1)).eval(new Environment(), new Forwards(), store, new Null());
        Int i = (Int)store.val(v);
        assertEquals(new Integer(1), i.intValue());
    }

    @Test
    public void testAssignedValue() throws Exception {
        Store store = new Store();
        Variable v = (Variable)alg.alloc(alg.lit(0)).eval(new Environment(), new Forwards(), store, new Null());
        alg.assign((e,f,s,g) -> v, alg.lit(1)).eval(new Environment(), new Forwards(), store, new Null());
        Int i = (Int)alg.assignedValue((e,f,s,g) -> v).eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(new Integer(1), i.intValue());
    }

    @Test
    public void testAssignedValueIfVar() throws Exception {
        Int i = (Int)alg.assignedValueIfVar(alg.alloc(alg.lit(0))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());

        i = (Int)alg.assignedValueIfVar(alg.lit(1)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), i.intValue());
    }
}