package camllight.algebras.tests.typeexprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class TypeExpAlgTest extends TestStub {

    @Test
    public void testBracketedType() throws Exception {
        test("match (3 : int) with (3 : (int)) -> true | _ -> false;;", "true");
        test("match (3 : (int)) with 3 -> true | _ -> false;;", "true");
    }

    @Test
    public void testTypeId() throws Exception {
        test("match (3 : int) with (3 : int) -> true | _ -> false;;", "true");
        test("match (3 : int) with 3 -> true | _ -> false;;", "true");
    }

    @Test
    public void testFunctionType() throws Exception {
        test("match (3 : int -> float) with (3 : int -> float) -> true | _ -> false;;", "true");
        test("match (3 : int -> float) with 3 -> true | _ -> false;;", "true");
    }

    @Test
    public void testVarType() throws Exception {
        test("let x = 1 in match (3 : 'x) with (3 : 'x) -> true | _ -> false;;", "true");
        test("let x = 1 in match (3 : 'x) with 3 -> true | _ -> false;;", "true");
    }

    @Test
    public void testTupleType() throws Exception {
        test("match (3 : int * float) with (3 : int * float) -> true | _ -> false;;", "true");
        test("match (3 : int * float) with 3 -> true | _ -> false;;", "true");
    }
}