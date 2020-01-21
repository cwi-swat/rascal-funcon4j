package funcons.interpreter.tests;

import funcons.algebras.ElseAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.ElseFactory;
import funcons.values.*;
import funcons.values.ids.Id;
import funcons.values.properties.Value;
import funcons.values.signals.FailureTrue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElseFactoryTest {

    private ElseAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new ElseFactory() {};
    }

    @Test
    public void testOnly() throws Exception {
        Bool b = (Bool)alg.seq(alg.apply(alg.only(alg.lit(0)), alg.lit(0)), alg.bool(true)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertTrue(b.boolValue());

        b = (Bool)alg.else_(alg.apply(alg.only(alg.lit(0)), alg.lit(1)), alg.bool(false)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertFalse(b.boolValue());
    }

    @Test
    public void testAny() throws Exception {
        Bool b = (Bool)alg.seq(alg.apply(alg.any(), alg.lit(0)), alg.bool(true)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertTrue(b.boolValue());
    }

    @Test
    public void testWhenTrue() throws Exception {
        Int i =(Int)alg.whenTrue(alg.bool(true), alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testMatch() throws Exception {
        Bool b = (Bool)alg.seq(alg.match(alg.lit(0), alg.any()), alg.bool(true)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertTrue(b.boolValue());

        b = (Bool)alg.else_(alg.match(alg.lit(0), alg.only(alg.lit(1))), alg.bool(false)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertFalse(b.boolValue());
    }

    @Test
    public void testPattAbs() throws Exception {
        IEval part1 = alg.bind(alg.id("x"));
        IEval part2 = alg.intAdd(alg.boundValue(alg.id("x")), alg.lit(1));
        IEval incr = alg.pattAbs(part1, part2);
        Int i = (Int)alg.apply(incr, alg.lit(2)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testPattUnion() throws Exception {
        Store store = new Store();
        IEval patt1 = alg.bind(alg.id("foo"));
        IEval patt2 = alg.bind(alg.id("bar"));

        Environment env1 = (Environment) alg.match(alg.lit(1), patt1).eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(new Integer(1), ((Int)env1.val(new Id("foo"))).intValue());

        @SuppressWarnings("unchecked")
        Environment env = (Environment)alg.match(alg.lit(1), alg.pattUnion(patt1, patt2)).eval(new Environment(), new Forwards(), store, new Null());

        assertEquals(new Integer(1), ((Int)env.val(new Id("foo"))).intValue());
        assertEquals(new Integer(1), ((Int)env.val(new Id("bar"))).intValue());
    }

    @Test
    public void testPattNonBinding() throws Exception {
        Store store = new Store();
        IEval pat = alg.pattNonBinding(alg.bind(alg.id("foo")));
        Environment env = (Environment)alg.match(alg.lit(0), pat).eval(new Environment(), new Forwards(), store, new Null());
        Value null_ = alg.boundValue(alg.id("foo")).eval(env, new Forwards(), store, new Null());
        assertNull(null_);

        try {
            alg.match(alg.lit(0), alg.pattNonBinding(alg.only(alg.lit(1))))
                    .eval(new Environment(), new Forwards(), store, new Null());
        } catch (FailureTrue ignore) {
            return;
        }
        assertTrue(false);
    }
}