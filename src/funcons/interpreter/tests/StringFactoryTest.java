package funcons.interpreter.tests;

import funcons.algebras.StringAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.StringFactory;
import funcons.values.Char;
import funcons.values.Environment;
import funcons.values.Null;
import funcons.values.String;
import funcons.values.cl.CLChar;
import funcons.values.cl.CLString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringFactoryTest {

    private StringAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new StringFactory() {};
    }

    @Test
    public void testString() throws Exception {
        String s = (String)alg.string("foo")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new String("foo"), s);
        assertEquals("foo", s.toString());
    }

    @Test
    public void testCamlLightString() throws Exception {
        CLString s = (CLString)alg.camlLightString("foo")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new String("foo"), s);
        assertEquals("foo", s.toString());

        s = (CLString)alg.camlLightString("\\\\ \\\" \\n \\r \\t \\b \\065")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new String("\\ \" \n \r \t \b A"), s);
    }

    @Test
    public void testChar_() throws Exception {
        Char c = (Char)alg.char_('a')
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Char('a'), c);
    }

    @Test
    public void testCamlLightChar() throws Exception {
        CLChar c = (CLChar)alg.camlLightChar("a")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new CLChar("a"), c);

        c = (CLChar)alg.camlLightChar("\\\\")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("\\", c.toString());

        c = (CLChar)alg.camlLightChar("\\`")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("`", c.toString());

        c = (CLChar)alg.camlLightChar("\\n")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("\n", c.toString());

        c = (CLChar)alg.camlLightChar("\\r")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("\r", c.toString());

        c = (CLChar)alg.camlLightChar("\\t")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("\t", c.toString());

        c = (CLChar)alg.camlLightChar("\\b")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("\b", c.toString());

        c = (CLChar)alg.camlLightChar("\\065")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("A", c.toString());
    }

    @Test
    public void testStringAppend() throws Exception {
        String s = (String)alg.stringAppend(alg.string("foo"), alg.string("bar"))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("foobar", s.stringValue());
    }
}