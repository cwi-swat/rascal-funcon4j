package camllight.algebras.tests.exprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class FunctionAlgTest extends TestStub {

    @Test
    public void testFunctionId() throws Exception {
        test("let id x = x in id 1;;", "1");
    }

    @Test
    public void testFuncAplication() throws Exception {
        test("let id x = x in id 1;;", "1");
    }

    @Test
    public void testBracketedFunction() throws Exception {
        test("let id = (function x -> x) in id 1;;", "1");
        test("let id = function x -> x in (id) 2;;", "2");
    }

    @Test
    public void testBeginEndFunction() throws Exception {
        test("let id = begin function x -> x end in id 1;;", "1");
        test("let id = function x -> x in begin id end 2;;", "2");
    }

    @Test
    public void testFunction() throws Exception {
        testFirstCharOutput("function x -> x;;", "ABS", 3);
        testFirstCharOutput("function 0 -> true | _ -> false;;", "ABS", 3);
    }

    @Test
    public void testFunc() throws Exception {
        testFirstCharOutput("fun x -> x;;", "ABS", 3);
    }

    @Test
    public void testCurriedFunc() throws Exception {
        testFirstCharOutput("fun a b c -> a + b + c;;", "ABS", 3);
    }
}