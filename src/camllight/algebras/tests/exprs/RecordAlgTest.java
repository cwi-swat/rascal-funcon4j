package camllight.algebras.tests.exprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class RecordAlgTest extends TestStub {

    @Test
    public void testRecordExp() throws Exception {
        test("{ a = 3 };;", "{a=3}");
        test("{ mutable a = 3 }.a;;", "3");
        test("{ a = 3 , b = \"foo\" , c = false };;", "{a=3; b=foo; c=false}");
    }

    @Test
    public void testRecordSelectExp() throws Exception {
        test("{ a = 3 }.a;;", "3");
        test("let bar = {a=3,b=4,c=false,d=\"foo\"} in bar.d;;", "foo");
    }

    @Test
    public void testRecordAssignExp() throws Exception {
        test("let x = {mutable a = 4};; (x.a <- 5); x.a;;", "5");
        test("let x = {b = 3, mutable a = 1};; (x.a <- 2); x.b;; x.a;;", "32");
    }
}