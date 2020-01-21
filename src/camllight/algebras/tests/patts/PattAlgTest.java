package camllight.algebras.tests.patts;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class PattAlgTest extends TestStub {

    @Test
    public void testBracketedPatt() throws Exception {
        test("let isZero = function | (0) -> true | (_) -> false in isZero 1;;", "false");
    }

    @Test
    public void testPattId() throws Exception {
        test("let add1 = function x -> x + 1 in add1 2;;", "3");
    }

    @Test
    public void testPattType() throws Exception {
        test("let isZero = function | (0 : int) -> true | _ -> false in isZero 1;;", "false");
    }

    @Test
    public void testPattAs() throws Exception {
        test("let double = function x as y -> x + y in double 2;;", "4");
        test("let id = function | 0 as x -> x | _ as x -> x in id 1;;", "1");
    }

    @Test
    public void testPattWildcard() throws Exception {
        test("match 1 with _ -> true;;", "true");
    }

    @Test
    public void testPattConstant() throws Exception {
        test("match 1 with 1 -> true;;", "true");
        test("match 1 with 0 -> true | _ -> false;;", "false");
    }

    @Test
    public void testPattConstr() throws Exception {
        test("type suit = Heart | Spade;; let f = function Heart -> true | Spade -> false;; f Spade;;", "false");
        test("type suit = Heart;; let f = function Heart -> true;; f Heart;;", "true");
    }

    @Test
    public void testPattConstrPatt() throws Exception {
        test("type id = Name of string | SS of int * int;; " +
                "let get_name = function Name n -> n | _ -> \"\";; " +
                "get_name (Name \"foo\");;",
                "foo");

        test("type id = Name of string | SS of int * int;; " +
                "let get_name = function Name n -> n | _ -> \"\";; " +
                "get_name (SS (1,2));;",
                "");

        test("type id = Name of string | SS of int * int;; " +
                "let check_ss = function SS (1,2) -> true | _ -> false;; " +
                "check_ss (SS (1,2));;",
                "true");

        test("type id = Name of string | SS of int * int;; " +
                "let check_ss = function SS (1,2) -> true | _ -> false;; " +
                "check_ss (SS (2,3));;",
                "false");
    }

    @Test
    public void testOptionalPatt() throws Exception {
        test("match 1 with 0 | 1 -> true;;", "true");
        test("match 0 with 0 | 1 -> true;;", "true");
        test("match 4 with 0 | 1 -> true | 3 | 4 -> false;;", "false");
    }
}