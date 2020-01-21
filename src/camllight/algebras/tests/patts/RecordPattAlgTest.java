package camllight.algebras.tests.patts;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class RecordPattAlgTest extends TestStub {

    @Test
    public void testRecordPatt() throws Exception {
        test("let f = function {a = 1} -> true;; f {a = 1};;", "true");
        test("let f = function {a = 1} -> false;; f {a = 1, b = 2};;", "false");
        test("let f = function {b = x} -> x;; f {a = 1, b = 2};;", "2");
        test("let f = function {a = 1, b = 2} -> true;; f {a = 1, b = 2};;", "true");
        test("let f = function {a = 1, b = 3} -> true | _ -> false;; f {a = 1, b = 2};;", "false");
    }
}