package camllight.algebras.tests.exprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class RefAlgTest extends TestStub {

    @Test
    public void testDereferenceExp() throws Exception {
        test("!(ref 3);;", "3");
        test("let x = ref 5;; !x;;", "5");
    }

    @Test
    public void testRefAssignExp() throws Exception {
        test("let x = ref 3;; x := 4; !x;;", "4");
        test("(ref 1) := 2;;", "NULL");
    }
}