package camllight.algebras.tests.decls;

import camllight.algebras.tests.TestStub;
import org.junit.Test;

public class GlobalAlgTest extends TestStub {

    @Test
    public void testDeclNewEnumType() throws Exception {
        test("type suit = Heart | Diamond | Club | Spade;; Club;;", "Variant(Tag(Club),NULL)");
        test("type suit = Heart;; Heart;;", "Variant(Tag(Heart),NULL)");
    }

    @Test
    public void testDeclNewConstrType() throws Exception {
        test("type foo = Foo of float | Bar of int;; Bar 3;;", "Variant(Tag(Bar),3)");
        test("type foo = Foo of float | Bar;; Bar;;", "Variant(Tag(Bar),NULL)");
    }

    @Test
    public void testDeclRecordType() throws Exception {
        test("type some_record = {a:int , b:float, c:string};;", "");
        test("type some_record = {a:int , b:float, mutable c:string};;", "");
        test("type some_record = {a:int};;", "");
    }

    @Test
    public void testDeclLabelsAndVariantsWithVarTypes() throws Exception {
        test("type ('a , 'b) pair = {fst:'a , snd:'b};;", "");
        test("type 'a solo = {fst:'a};;", "");
    }

    @Test
    public void testDeclTypeDefEquals() throws Exception {
        test("type a == int;;", "");
    }

    @Test
    public void testDeclLabelsAndVariantsMultiple() throws Exception {
        test("type a == int and b == float;;", "");
        test("type foo = {a:int} and ('a) x == float;;", "");
    }

    @Test
    public void testDeclEnumException() throws Exception {
        test("exception Foo;;", "");
        test("exception Foo;; Foo;;", "Variant(Tag(Foo),NULL)");
        test("exception Foo and Bar;; Foo;; Bar;;", "Variant(Tag(Foo),NULL)Variant(Tag(Bar),NULL)");
    }

    @Test
    public void testDeclConstrException() throws Exception {
        test("exception Foo of int;;", "");
        test("exception Foo of int;; Foo 3;;", "Variant(Tag(Foo),3)");
        test("exception Foo of int and Bar of string;; Foo 3;; Bar \"hello\";;", "Variant(Tag(Foo),3)Variant(Tag(Bar),hello)");
        test("exception Foo of int and Bar;; Foo 3;; Bar;;", "Variant(Tag(Foo),3)Variant(Tag(Bar),NULL)");
    }
}