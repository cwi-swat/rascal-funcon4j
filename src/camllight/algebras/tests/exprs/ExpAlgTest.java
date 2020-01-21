package camllight.algebras.tests.exprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class ExpAlgTest extends TestStub {

    @Test
    public void testConstExp() throws Exception {
        test("3;;", "3");
    }

    @Test
    public void testIdExp() throws Exception {
        test("foo;;", "null");
    }

    @Test
    public void testBracketedExp() throws Exception {
        test("(3);;", "3");
        test("4;;", "4");
        test("(1 + 2) * 3;;", "9");
    }

    @Test
    public void testBeginEndExp() throws Exception {
        test("begin 3 end;;", "3");
        test("4;;", "4");
        test("begin 1 + 2 end * 3;;", "9");
    }

    @Test
    public void testTypedExp() throws Exception {
        test("(3 : int);;", "3");
    }
}