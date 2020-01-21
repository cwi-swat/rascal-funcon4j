package funcons.interpreter.tests;

import funcons.algebras.ListAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.ListFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.List;
import funcons.values.Null;
import funcons.values.ids.Id;
import funcons.values.signals.FailureTrue;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ListFactoryTest {

    private ListAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new ListFactory() {};
    }

    @Test
    public void testList() throws Exception {
        List l = (List)alg.list().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(l, new List());
        l = (List)alg.list(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(l, new List(new Int(0)));
        l = (List)alg.list(alg.lit(0), alg.lit(1)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(l, new List(new Int(0), new Int(1)));
    }

    @Test
    public void testListPrefix() throws Exception {
        List l = (List)alg.listPrefix(alg.lit(0), alg.list(alg.lit(1))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(l, new List(new Int(0), new Int(1)));
    }

    @Test
    public void testApplyToEach() throws Exception {
        {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            IEval printList = alg.applyToEach(alg.abs(alg.print(alg.given())), alg.list(alg.lit(0), alg.lit(1)));
            printList.eval(new Environment(), new Forwards(), new Store(), new Null());
            assertEquals("01", outContent.toString());
        }
        {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            IEval printList = alg.applyToEach(alg.abs(alg.bind(alg.id("foo")), alg.effect(alg.print(alg.boundValue(alg.id("foo"))))),
                    alg.intClosedInterval(alg.lit(0), alg.lit(3)));
            printList.eval(new Environment(), new Forwards(), new Store(), new Null());
            assertEquals("0123", outContent.toString());
        }
    }

    @Test
    public void testListPrefixMatch() throws Exception {
        IEval onlyZero = alg.abs(alg.seq(alg.match(alg.given(), alg.only(alg.lit(0))), alg.bindValue(alg.id("x"), alg.lit(5))));
        IEval anything = alg.abs(alg.seq(alg.match(alg.given(), alg.any()), alg.bindValue(alg.id("y"), alg.lit(6))));
        Environment env = (Environment)alg.listPrefixMatch(alg.list(alg.lit(0), alg.lit(1)), onlyZero, anything)
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(6), ((Int)env.val(new Id("y"))).intValue());

        IEval shouldFail = alg.listPrefixMatch(alg.list(alg.lit(9), alg.lit(1)), onlyZero, anything);
        try {
            shouldFail.eval(new Environment(), new Forwards(), new Store(), new Null());
        } catch (FailureTrue f) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testListPrefixPatt() throws Exception {
        IEval headIsZero = alg.listPrefixPatt(alg.only(alg.lit(0)), alg.any());
        Environment env = (Environment)alg.match(alg.list(alg.lit(0), alg.lit(1)), headIsZero).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotNull(env);

        try {
            @SuppressWarnings("unused")
            Environment e = (Environment)alg.match(alg.list(alg.lit(1), alg.lit(0)), headIsZero).eval(new Environment(), new Forwards(), new Store(), new Null());
        } catch(FailureTrue ignore) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testIntClosedInterval() throws Exception {
        List l = (List)alg.intClosedInterval(alg.lit(0), alg.lit(1)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new List(new Int(0), new Int(1)), l);
    }

    @Test
    public void testListReverse() throws Exception {
        List l1 = (List)alg.listReverse(alg.list(alg.lit(2), alg.lit(1))).eval(new Environment(), new Forwards(), new Store(), new Null());
        List l2 = (List)alg.list(alg.lit(1), alg.lit(2)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(l2, l1);
    }

    @Test
    public void testListAppend() throws Exception {
        List l = (List)alg.listAppend(alg.list(alg.lit(2)), alg.list(alg.lit(3)))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new List(new Int(2), new Int(3)), l);
    }
}