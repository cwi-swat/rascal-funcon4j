module lang::lambda::Lambda

extend lang::std::Layout;
import lang::funcon::Funcons;

syntax Expr
  = var: Id 
  | right apply: Expr func Expr arg
  | abs: "lambda" Id x "." Expr body
  | bracket "(" Expr ")";
  
syntax Id = [a-zA-Z]+ !>> [a-zA-Z];
  
FunCon sem((Expr)`<Id x>`) 
  = boundValue(id("<x>"));

FunCon sem((Expr)`<Expr f> <Expr a>`) 
  = apply(sem(f), sem(a));
  
FunCon sem((Expr)`lambda <Id x>. <Expr body>`) 
  = abs(bind(id("<x>")), sem(body));

FunCon sem((Expr)`(<Expr e>)`) = sem(e); 

//FunCon sem((Expr)`<Int nat>`)
//  = lit(toInt("<nat>"));
//  
//value eval(Expr e) = toEval(sem(e))(0);
//value evalFun(Expr e, int n) = toEval(sem((Expr)`<Expr e> <Int i>`))(0)
//  when Int i := [Int]"<n>";
//
Expr identity() = (Expr)`lambda x. x`;
//
//test bool testIdentity(int n)
//  = evalFun(identity(), n) == n;


