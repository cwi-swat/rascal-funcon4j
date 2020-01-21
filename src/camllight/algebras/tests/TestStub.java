package camllight.algebras.tests;

import camllight.CamlLight;
import funcons.values.signals.FunconException;
import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public abstract class TestStub {
    protected ByteArrayOutputStream out;
    private java.io.PrintStream oldOut;

    @Before
    public void setUp() throws Exception {
        oldOut = System.out;
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(oldOut);
    }

    public void test(java.lang.String input) throws FunconException {
        CamlLight.eval(input);
        out.reset();
    }

    public void test(java.lang.String input, java.lang.String expectedOutput) throws FunconException {
        CamlLight.eval(input);
        assertEquals(expectedOutput, out.toString());
        out.reset();
    }

    public void testFirstCharOutput(java.lang.String input, java.lang.String expectedOutput, int nChar) throws FunconException {
        CamlLight.eval(input);
        assertEquals(expectedOutput, out.toString().substring(0, nChar));
        out.reset();
    }
}
