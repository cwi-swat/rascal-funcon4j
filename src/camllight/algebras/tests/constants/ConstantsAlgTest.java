package camllight.algebras.tests.constants;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class ConstantsAlgTest extends TestStub {

    @Test
    public void testInt_() throws Exception {
        test("3;;", "3");
    }

    @Test
    public void testFloat_() throws Exception {
        test("1.;;", "1.0");
        test("2.0;;", "2.0");
    }

    @Test
    public void testBool() throws Exception {
        test("true;;", "true");
        test("false;;", "false");
    }

    @Test
    public void testString() throws Exception {
        test("\"foo\";;", "foo");
        test("\"\\\\ \\\" \\n \\r \\t \\b \\065\";;", "\\ \" \n \r \t \b A");
    }

    @Test
    public void testChar_() throws Exception {
        test("`a`;;", "a");
        test("`\\\\`;;", "\\");
        test("`\\``;;", "`");
        test("`\\n`;;", "\n");
        test("`\\r`;;", "\r");
        test("`\\t`;;", "\t");
        test("`\\b`;;", "\b");
        test("`\\065`;;", "A");
    }

    @Test
    public void testNull_() throws Exception {
        test("();;", "NULL");
    }

    @Test
    public void testEmptyListConstant() throws Exception {
        test("[];;", "[]");
        test("[];;", "[]");
    }

    @Test
    public void testEmptyList() throws Exception {
        test("[];;", "[]");
        test("[];;", "[]");
    }
}