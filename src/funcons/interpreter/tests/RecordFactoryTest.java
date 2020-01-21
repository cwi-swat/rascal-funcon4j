package funcons.interpreter.tests;

import funcons.algebras.RecordAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.RecordFactory;
import funcons.values.*;
import funcons.values.ids.Id;
import funcons.values.signals.FailureTrue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordFactoryTest {

    private RecordAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new RecordFactory() {};
    }

    @Test
    public void testRecord() throws Exception {
        Record r = (Record)alg.record(alg.field("foo"), alg.lit(1))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(1), r.select(new Field("foo")));
        assertEquals(new Record(new Map<>(new Field("foo"), new Int(1))), r);
    }

    @Test
    public void testField() throws Exception {
        Field f = (Field)alg.field("foo")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Field("foo"), f);
    }

    @Test
    public void testRecordSelect() throws Exception {
        Int i = (Int)alg.recordSelect(alg.record(alg.field("foo"), alg.lit(1)), alg.field("foo"))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(1), i);
    }

    @Test
    public void testRecordOver() throws Exception {
        Record r = (Record)alg.recordOver(
                alg.record(alg.field("foo"), alg.lit(0)),
                alg.record(alg.field("foo"), alg.lit(1))
        ).eval(new Environment(), new Forwards(), new Store(), new Null());

        assertEquals(new Int(0), r.select(new Field("foo")));
    }

    @Test
    public void testRecordUnion() throws Exception {
        Record r = (Record)alg.recordUnion(
                alg.record(alg.field("foo"), alg.lit(0)),
                alg.record(alg.field("foo"), alg.lit(1))
        ).eval(new Environment(), new Forwards(), new Store(), new Null());

        assertEquals(new Int(1), r.select(new Field("foo")));
    }

    @Test
    public void testRecordMatch() throws Exception {
        Environment env = (Environment)alg.recordMatch(
                alg.record(alg.field("foo"), alg.lit(0)),
                alg.map(alg.field("foo"), alg.bind(alg.id("x")))
        ).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(0), env.val(new Id("x")));

        env = (Environment)alg.recordMatch(
                alg.record(alg.field("foo"), alg.lit(1)),
                alg.map(alg.field("foo"), alg.only(alg.lit(1)))
        ).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Environment(), env);

        env = (Environment)alg.recordMatch(
                alg.recordUnion(alg.record(alg.field("foo"), alg.lit(1)), alg.record(alg.field("bar"), alg.lit(2))),
                alg.map(alg.field("foo"), alg.only(alg.lit(1)))
        ).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Environment(), env);

        try {
            @SuppressWarnings("unused")
            Environment ignore = (Environment)alg.recordMatch(
                    alg.record(alg.field("foo"), alg.lit(1)),
                    alg.map(alg.field("foo"), alg.only(alg.lit(2)))
            ).eval(new Environment(), new Forwards(), new Store(), new Null());
        } catch (FailureTrue e) {
            return;
        }
        assertTrue(false);
    }
}