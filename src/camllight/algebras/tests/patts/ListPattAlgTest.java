package camllight.algebras.tests.patts;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class ListPattAlgTest extends TestStub {

    @Test
    public void testEmptyListPatt() throws Exception {
        test("match [] with [] -> true | _ -> false;;", "true");
        test("match [1] with [] -> true | _ -> false;;", "false");
        test("match 3 with [] -> true | _ -> false;;", "false");
    }

    @Test
    public void testHeadTailListPatt() throws Exception {
        test("match [1 , 2]  with [h :: t] -> h;;", "1");
        test("match [1 , 2]  with [h :: t] -> t;;", "[2, []]");
        test("match [1 , 2]  with [h :: h2 :: _] -> h + h2;;", "3");
        test("match [1 , 2] with [h :: 3] -> true | _ -> false;;", "false");
    }

    @Test
    public void testPattList() throws Exception {
        test("match [1] with [1] -> true;;", "true");
        test("match [1] with [0] -> true | _ -> false;;", "false");
        test("match [1 , 2] with [1 , 2] -> true | _ -> false;;", "true");
        test("match [1 , 2] with [2 , 1] -> true | [1 , 3] -> true | _ -> false;;", "false");
        test("match [1,2,3,4] with [1, 2, 3, 4] -> true | _ -> false;;", "true");
    }
}