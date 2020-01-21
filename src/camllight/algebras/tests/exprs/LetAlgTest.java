package camllight.algebras.tests.exprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class LetAlgTest extends TestStub {
    @Test
    public void testLetExp() throws Exception {
        test("let x = 3;; x;;", "3");
        test("let add1 = fun x -> x + 1;; add1 10;;", "11");
    }

    @Test
    public void testLetInExp() throws Exception {
        test("let x = 3 in x;;", "3");
        test("let add1 = fun x -> x + 1 in add1 10;;", "11");
    }
}