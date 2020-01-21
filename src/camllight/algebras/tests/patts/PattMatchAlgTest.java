package camllight.algebras.tests.patts;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class PattMatchAlgTest extends TestStub {

    @Test
    public void testPattMatch() throws Exception {
        test("match 1 with 1 -> true;;", "true");
    }

    @Test
    public void testPattMatchMulti() throws Exception {
        test("match 1 with 1 -> true | _ -> false;;", "true");
        test("match 1 with 0 -> true | _ -> false;;", "false");
    }

    @Test
    public void testPattMatchStripe() throws Exception {
        test("match 1 with 1 -> true;;", "true");
        test("match 1 with | 1 -> true;;", "true");
    }

    @Test
    public void testPattMatchCurriedMulti() throws Exception {
        test("let f = fun a b c -> 1 * a + 2 * b + 3 * c in f 2 3 5;;", "23");
    }
}