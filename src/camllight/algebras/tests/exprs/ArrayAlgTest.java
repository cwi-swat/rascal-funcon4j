package camllight.algebras.tests.exprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class ArrayAlgTest extends TestStub {

    @Test
    public void testEmptyArray() throws Exception {
        test("[||];;", "Vector<[]>");
        test("[|        |];;", "Vector<[]>");
    }

    @Test
    public void testArraySingle() throws Exception {
        test("[|2|].(0);;", "2");
    }

    @Test
    public void testArrayMulti() throws Exception {
        test("[|1,2,3|].(1);;", "2");
    }

    @Test
    public void testArraySelect() throws Exception {
        test("[| 1 , 2 , 3|].(0);;", "1");
        test("[| 1 , 2 , 3|].(1);;", "2");
        test("[| 1 , 2 , 3|].(2);;", "3");
    }

    @Test
    public void testArrayAssign() throws Exception {
        test("let v = [| 1 , 2 , 3 |];; v.(0) <- 4; v.(0);; v.(1);; v.(2);;", "423");
    }
}