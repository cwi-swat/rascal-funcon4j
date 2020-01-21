package funcons.interpreter.tests;

import funcons.algebras.TypeAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.TypeFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.cl.CLVariant;
import funcons.values.ids.Meta;
import funcons.values.ids.TypeVar;
import funcons.values.signals.FailureTrue;
import funcons.values.types.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeFactoryTest {

    private TypeAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new TypeFactory() {};
    }

    @Test
    public void testType() throws Exception {
        Type t = (Type)alg.type("foo").eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Type("foo"), t);
    }

    @Test
    public void testTypeVar() throws Exception {
        TypeVar tv = (TypeVar)alg.typeVar("foo").eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TypeVar("foo"), tv);
    }

    @Test
    public void testTag() throws Exception {
        Tag t = (Tag)alg.tag("foo").eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Tag("foo"), t);
    }

    @Test
    public void testClVariant() throws Exception {
        Variant v = (Variant)alg.clVariant("foo", alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new CLVariant("foo", new Int(0)), v);
    }

    @Test
    public void testMeta() throws Exception {
        Meta m = (Meta)alg.meta("foo").eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Meta("foo"), m);
    }

    @Test
    public void testNomTag() throws Exception {
        NominalTag n1 = (NominalTag)alg.nomTag(alg.freshToken()).eval(new Environment(), new Forwards(), new Store(), new Null());
        NominalTag n2 = (NominalTag)alg.nomTag(alg.freshToken()).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotEquals(n1, n2);

        Token t = (Token)alg.freshToken().eval(new Environment(), new Forwards(), new Store(), new Null());
        n1 = (NominalTag)alg.nomTag((e,f,s,g) -> t).eval(new Environment(), new Forwards(), new Store(), new Null());
        n2 = (NominalTag)alg.nomTag((e,f,s,g) -> t).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(n1, n2);
    }

    @Test
    public void testNomVal() throws Exception {
        NominalVal n1 = (NominalVal)alg.nomVal(alg.nomTag(alg.freshToken()), alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        NominalVal n2 = (NominalVal)alg.nomVal(alg.nomTag(alg.freshToken()), alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotEquals(n1, n2);

        NominalTag nt = (NominalTag)alg.nomTag(alg.freshToken()).eval(new Environment(), new Forwards(), new Store(), new Null());
        n1 = (NominalVal)alg.nomVal((e,f,s,g) -> nt, alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        n2 = (NominalVal)alg.nomVal((e,f,s,g) -> nt, alg.lit(1)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotEquals(n1, n2);

        n1 = (NominalVal)alg.nomVal((e,f,s,g) -> nt, alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        n2 = (NominalVal)alg.nomVal((e,f,s,g) -> nt, alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(n1, n2);
    }

    @Test
    public void testNomValSelect() throws Exception {
        Token t = (Token)alg.freshToken().eval(new Environment(), new Forwards(), new Store(), new Null());
        IEval val = alg.nomValSelect(alg.nomTag((e,f,s,g) -> t), alg.nomVal(alg.nomTag((e,f,s,g) -> t), alg.lit(0)));
        Int i = (Int)val.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());

        val = alg.nomValSelect(alg.nomTag(alg.freshToken()), alg.nomVal(alg.nomTag(alg.freshToken()), alg.lit(0)));
        try {
            @SuppressWarnings("unused")
            Int i2 = (Int)val.eval(new Environment(), new Forwards(), new Store(), new Null());
        } catch(FailureTrue e) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testScopeNominalCoercion() throws Exception {
        IEval val = alg.scopeNominalCoercion(alg.type("foo"), alg.type("bar"), alg.abs(alg.any(), alg.lit(0)));
        Int i = (Int)val.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testDepends() throws Exception {
        Depends d = (Depends)alg.depends(alg.type("foo"), alg.type("bar")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Depends(new Type("foo"), new Type("bar")), d);
    }

    @Test
    public void testTupleType() throws Exception {
        TupleType tt = (TupleType)alg.tupleType().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TupleType(), tt);
        tt = (TupleType)alg.tupleType(alg.type("foo")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TupleType(new Type("foo")), tt);
        tt = (TupleType)alg.tupleType(alg.type("foo"), alg.type("bar")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TupleType(new Type("foo"), new Type("bar")), tt);
        tt = (TupleType)alg.tupleType(alg.type("foo"), alg.type("bar"), alg.type("baz")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TupleType(new Type("foo"), new Type("bar"), new Type("baz")), tt);
    }

    @Test
    public void testTupleTypePrefix() throws Exception {
        IEval tupleType = alg.tupleTypePrefix(alg.type("foo"), alg.tupleType(alg.type("bar")));
        TupleType tt = (TupleType)tupleType.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new TupleType(new Type("foo"), new Type("bar")), tt);
    }

    @Test
    public void testProjectType() throws Exception {
        IEval type = alg.projectType(alg.lit(1), alg.tupleType(alg.type("foo"), alg.type("bar"), alg.type("baz")));
        Type t = (Type)type.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Type("bar"), t);
    }

    @Test
    public void testTyped() throws Exception {
        Int i = (Int)alg.typed(alg.lit(0), alg.type("foo")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testBoundType() throws Exception {
        Null n = (Null)alg.boundType(alg.id("foo")).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Null(), n);
    }

    @Test
    public void testFreshToken() throws Exception {
        Token t1 = (Token)alg.freshToken().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotNull(t1);
        Token t2 = (Token)alg.freshToken().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotEquals(t1, t2);
    }

    @Test
    public void testNewType() throws Exception {
        NominalType t1 = (NominalType)alg.newType(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotNull(t1);
        NominalType t2 = (NominalType)alg.newType(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotEquals(t1, t2);
    }

    @Test
    public void testTypeDef() throws Exception {
        Environment env = (Environment)alg.typeDef(alg.id("foo"), alg.newType(alg.lit(0))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotNull(env);
    }

    @Test
    public void testRestrictDomain() throws Exception {
        IEval id = alg.restrictDomain(alg.abs(alg.given()), alg.type("foo"));
        Int i = (Int)alg.apply(id, alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testPattAtType() throws Exception {
        IEval patt = alg.pattAtType(alg.bind(alg.id("foo")), alg.type("bar"));
        IEval env = alg.match(alg.lit(0), patt);
        Int i = (Int)alg.scope(env, alg.boundValue(alg.id("foo"))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testVariantMatch() throws Exception {
        IEval env = alg.variantMatch(alg.tag("foo"), alg.clVariant("foo", alg.lit(0)), alg.bind(alg.id("bar")));
        Int i = (Int)alg.scope(env, alg.boundValue(alg.id("bar"))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());

        try {
            env = alg.variantMatch(alg.tag("foobar"), alg.clVariant("foo", alg.lit(0)), alg.bind(alg.id("bar")));
            i = (Int)alg.scope(env, alg.boundValue(alg.id("bar"))).eval(new Environment(), new Forwards(), new Store(), new Null());
            assertEquals(new Integer(0), i.intValue());
        } catch(FailureTrue ignore) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testUnknownType() throws Exception {
        UnknownType unknown = (UnknownType)alg.unknownType().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new UnknownType(), unknown);
    }
}