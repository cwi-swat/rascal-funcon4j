package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import funcons.values.cl.CLMatchFailureException;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ControlAlgTest extends TestStub {
    @Test
    public void testIf_() throws Exception {
        test("if true then 0;;", "0");
        test("if false then 0;;", "NULL");
    }

    @Test
    public void testIfElse() throws Exception {
        test("if true then 0 else 1;;", "0");
        test("if false then 0 else 1;;", "1");
    }

    @Test
    public void testWhileTrue() throws Exception {
        test("while false do 1 done;;", "NULL");
    }

    @Test
    public void testFor_() throws Exception {
        test("for i = 1 to 10 do print i done;;", "12345678910NULL");
    }

    @Test
    public void testForDownto() throws Exception {
        test("for i = 10 downto 1 do print i done;;", "10987654321NULL");
    }

    @Test
    public void testMatchWith() throws Exception {
        test("match 0 with 0 -> true;;", "true");

        try {
            CamlLight.eval("match 0 with 1 -> true;;");
            assertTrue(false);
        } catch (CLMatchFailureException ignore) {}
    }

    @Test
    public void testSeq() throws Exception {
        test("0 ; 1;;", "1");
    }
}