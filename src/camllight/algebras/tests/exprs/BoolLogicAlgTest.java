package camllight.algebras.tests.exprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class BoolLogicAlgTest extends TestStub {
    @Test
    public void testLAnd() throws Exception {
        test("false & false;;", "false");
        test("true & false;;", "false");
        test("false & true;;", "false");
        test("true & true;;", "true");
        test("true && true;;", "true");
    }

    @Test
    public void testLOr() throws Exception {
        test("false || false;;", "false");
        test("true || false;;", "true");
        test("false || true;;", "true");
        test("true || true;;", "true");
        test("true or true;;", "true");
    }

    @Test
    public void testLNot() throws Exception {
        test("not false;;", "true");
        test("not true;;", "false");
    }


    @Test
    public void testGreater() throws Exception {
        test("3 > 2;;", "true");
        test("3 > 3;;", "false");
        test("3 > 4;;", "false");
        test("(1,2) > (1,1);;", "true");
        test("(1,1) > (1,2);;", "false");
        test("(1,1) > (1,1);;", "false");
        test("(1,1,1) > (1,1);;", "true");
        test("(1,1) > (1,1,1);;", "false");
        test("[1,2] > [1,1];;", "true");
        test("[1,1] > [1,2];;", "false");
        test("[1,1] > [1,1];;", "false");
        test("[1,1,1] > [1,1];;", "true");
        test("[1,1] > [1,1,1];;", "false");
        test("{a = 1, b = 2} > {b = 1, a = 1};;", "true");
        test("\"abc\" > \"abd\";;", "false");
        test("\"abcd\" > \"abc\";;", "true");
        test("`a` > `b`;;", "false");
        test("[|1,2,3|] > [|1,2,2|];;", "true");
    }

    @Test
    public void testSmaller() throws Exception {
        test("3 < 2;;", "false");
        test("3 < 3;;", "false");
        test("3 < 4;;", "true");
    }

    @Test
    public void testGreaterEqual() throws Exception {
        test("3 >= 2;;", "true");
        test("3 >= 3;;", "true");
        test("3 >= 4;;", "false");
    }

    @Test
    public void testSmallerEqual() throws Exception {
        test("3 <= 2;;", "false");
        test("3 <= 3;;", "true");
        test("3 <= 4;;", "true");
    }

    @Test
    public void testEqual() throws Exception {
        test("3 = 2;;", "false");
        test("3 = 3;;", "true");
        test("3 = 4;;", "false");
    }

    @Test
    public void testNotEqual() throws Exception {
        test("3 <> 2;;", "true");
        test("3 <> 3;;", "false");
        test("3 <> 4;;", "true");
    }
}