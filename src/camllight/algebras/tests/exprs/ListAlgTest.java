package camllight.algebras.tests.exprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class ListAlgTest extends TestStub {

    @Test
    public void testHeadTailListExp() throws Exception {
        test("1 :: 2 :: [];;", "[1, [2, []]]");
        test("1 :: 2 :: 3 :: [];;", "[1, [2, [3, []]]]");
    }

    @Test
    public void testExpList() throws Exception {
        test("[1 , 2];;", "[1, [2, []]]");
        test("[1 , 2 , 3 , 4];;", "[1, [2, [3, [4, []]]]]");
    }

    @Test
    public void testExpListSingle() throws Exception {
        test("[1];;", "[1, []]");
    }

    @Test
    public void testListConcatExp() throws Exception {
        test("[1] @ [2];;", "[1, [2, []]]");
        test("[1] @ [2, 3];;", "[1, [2, [3, []]]]");
    }
}