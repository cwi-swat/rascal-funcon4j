package camllight.algebras.tests.exprs;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class StringAlgTest extends TestStub {

    @Test
    public void testStringAppendExp() throws Exception {
        test("\"foo\" ^ \"bar\";;", "foobar");
    }
}