package camllight.algebras.tests.patts;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import funcons.values.cl.CLMatchFailureException;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TuplePattAlgTest extends TestStub {

    @Test
    public void testPattTuple() throws Exception {
        test("match (1) with (1) -> true;;", "true");
        test("match (1,2,3,4) with (1,2,3,4) -> true;;", "true");
        try {
            CamlLight.eval("match (1,2,3,4) with (1,2,5,4) -> true;;");
            assertTrue(false);
        } catch (CLMatchFailureException ignore) {}
    }
}