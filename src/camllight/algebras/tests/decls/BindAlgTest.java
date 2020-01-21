package camllight.algebras.tests.decls;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class BindAlgTest extends TestStub {
    @Test
    public void testDeclRec() throws Exception {
        test("let rec power a b = if b = 0 then 1 else a * power a (b - 1) in power 3 4;;", "81");
    }

    @Test
    public void testDecl() throws Exception {
        test("let x = 3;; x;;", "3");
    }

    @Test
    public void testAndDecl() throws Exception {
        test("let x = 1 and y = 2;; x + y;;", "3");
        test("let x = 3 and y = 4 and z = 5;; x + y + z;;", "12");
    }

    @Test
    public void testDeclBindMono() throws Exception {
        test("let f = fun 3 -> true in f 3;;", "true");
        test("let f = fun _ -> true in f 3;;", "true");
        test("let f = fun x -> x in f 3;;", "3");
    }

    @Test
    public void testDeclBindMonoFunc() throws Exception {
        test("let f 2 3 4 = true in (f 2) 3 4;;", "true");
        test("let f _ 3 = true in f 1 3;;", "true");
        test("let f x y z = z in f 1 2 3;;", "3");
    }

    @Test
    public void testVariantDecl() throws Exception {
        // TODO
    }

    @Test
    public void testVariantTypeDecl() throws Exception {
        // TODO
    }
}