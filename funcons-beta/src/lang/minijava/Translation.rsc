module lang::minijava::Translation

import lang::std::Layout;

import lang::minijava::Syntax;
import lang::funcon::Funcons;

import IO;

FunCon sem(Program p) = 
  initialise_binding_(initialise_storing_(initialise_giving_(finalise_failing_(run(p)))));

FunCon run((Program) 
	`class <Identifier ID1> { 
 	'  public static void main ( String[] <Identifier ID2> ) { 
 	'    <Statement S> 
 	'  }
 	'} <ClassDecl* CDs>`) 
 	= scope_(class_sequence(CDs), execute(S));
	
FunCon class_sequence(CDs) = recursive_(bound_names(CDs), declare_classes(CDs));

FunCon bound_names(ClassDecl* decls) = set_([bound_name(cd) | cd <- decls]);
FunCon bound_name((ClassDecl) 
	`class <Identifier ID1> { <VarDecl* _> <MethodDecl* _> }`) 
	= id("<ID1>");
FunCon bound_name((ClassDecl)
	`class <Identifier ID1> extends <Identifier _> { <VarDecl* _> <MethodDecl* _> }`)
    = id("<ID1>");
	
FunCon declare_classes(ClassDecl* decls) = collateral_([declare_class(cd) | cd <- decls]);
FunCon declare_class((ClassDecl) 
	`class <Identifier ID1> { <VarDecl* VDs> <MethodDecl* MDs> }`) 
	= map_(tuple_(id("<ID1>"), class_ (thunk_ (closure_ (reference_ (object_ (
		 fresh_atom_(), id("<ID1>"), declare_variables(VDs))))),
		 declare_methods(MDs))));
FunCon declare_class((ClassDecl) 
	`class <Identifier ID1> extends <Identifier ID2> { <VarDecl* VDs> <MethodDecl* MDs> }`) 
	= map_(tuple_(id("<ID1>"), class_ (thunk_ (closure_ (reference_ (object_ (
		 fresh_atom_(), id("<ID1>"), declare_variables(VDs),
		   dereference_(force_(class_instantiator_(bound_(id("<ID2>"))))))))),
		 declare_methods(MDs),
		 id("<ID2>"))));

FunCon declare_variables(VarDecl* VDs) = collateral__([ declare_variable(VD) | VD <- VDs]);
FunCon declare_variable((VarDecl)
    `<Type T> <Identifier ID> ;`)
    = map_(tuple_(id("<ID>"), allocate_initialised_variable_(type_of(T), initial_value(T))));
 
FunCon type_of((Type) `int[]`) = vectors_(variables_());
FunCon type_of((Type) `boolean`) = booleans_();
FunCon type_of((Type) `int`) = integers_();
FunCon type_of((Type) `<Identifier ID>`) = pointers_(objects_());

FunCon initial_value((Type) `int[]`) = vector_();
FunCon initial_value((Type) `boolean`) = false_();
FunCon initial_value((Type) `int`) = literal("0");
FunCon initial_value((Type) `<Identifier ID>`) = pointer_null_();

FunCon methods() = functions_(tuples_(references_(objects_()), star_(values_())), value_());

FunCon declare_methods(MethodDecl* MDs) = collateral_([ declare_method(MD) | MD <- MDs ]);
FunCon declare_method((MethodDecl) 
	`public <Type T> <Identifier ID> ( <FormalList? FLs> ) { 
	'  <VarDecl* VDs> <Statement* Ss> return <Expression E> ;
	'}`) = map_(tuple_(id("<ID>"), function_ (closure_ (scope_ (
	       collateral_ (
	          match_ ( given_(),
	             tuple_ (
	               [pattern_ (abstraction_ (map_ (tuple_ (
	                 id("this"), allocate_initialised_variable_ (pointers_(objects_()), given_())))))] +
	               bind_formals(FLs))),
	           object_single_inheritance_feature_map_(
	             checked_(dereference_(first_(tuple_elements_(given_()))))),
	           declare_variables(VDs)),
	         sequential__(execute_all(Ss) + [evaluate(E)]))))));

list[FunCon] bind_formals([]) = [];
list[FunCon] bind_formals([FL]) = bind_formals(FL);
list[FunCon] bind_formals(opt(FL)) = bind_formals(FL);
list[FunCon] bind_formals(FormalList? FLs) = [ x | FL <- FLs, x <- bind_formals(FL)];
list[FunCon] bind_formals((FormalList)
  `<Type T> <Identifier ID>`)
  = bind_formals(T,ID);
list[FunCon] bind_formals((FormalList)
  `<Type T> <Identifier ID> , <FormalList FLs>`)
  = bind_formals(T,ID) + bind_formals(FLs);
list[FunCon] bind_formals(Type T, Identifier ID) = 
  [pattern_(abstraction_(map_(tuple_(
     id("<ID>"), allocate_initialised_variable_(type_of(T), given_())))))];
default FunCon bind_formals(n) = println(n);

list[FunCon] execute_all(Statement* Stmts) = [ execute(S) | S <- Stmts ]; 
FunCon execute((Statement)
  `{ <Statement* Stmts> }`)
  = sequential__(execute_all(Stmts));
FunCon execute((Statement) 
  `if ( <Expression E> ) <Statement S1> else <Statement S2>`) 
  = if_true_else_( evaluate(E), execute(S1), execute(S2) );
FunCon execute((Statement) 
  `while ( <Expression E> ) <Statement S>`)
  = while_true_( evaluate(E), execute(S) );
FunCon execute((Statement)
  `System.out.println(<Expression E>);`)
  = print_(to_string_ (evaluate(E)), literal("\"\\n\""));
FunCon execute((Statement)
  `<Identifier ID> = <Expression E>;`)
  = assign_ (bound_ (id("<ID>")), evaluate(E));
FunCon execute((Statement)
  `<Identifier ID> [ <Expression E1> ] = <Expression E2> ;`)
  = assign_ (checked_ (index_ (integer_add_ ( evaluate(E1), literal("1"))
                              ,vector_elements_ (assigned_ (bound_ (id("<ID>")))) ))
            ,evaluate(E2));
	
FunCon evaluate((Expression) 
  `<Expression E1> && <Expression E2>`)
  = if_true_else_( evaluate(E1), evaluate(E2), false_());
FunCon evaluate((Expression)
  `<Expression E1> \< <Expression E2>`)
  = integer_is_less_( evaluate(E1), evaluate(E2) );
FunCon evaluate((Expression)
  `<Expression E1> + <Expression E2>`)
  = integer_add_( evaluate(E1), evaluate(E2) );
FunCon evaluate((Expression)
  `<Expression E1> - <Expression E2>`)
  = integer_subtract_( evaluate(E1), evaluate(E2) );
FunCon evaluate((Expression)
  `<Expression E1> * <Expression E2>`)
  = integer_multiply_( evaluate(E1), evaluate(E2) );
FunCon evaluate((Expression)
  `<Expression E1> [ <Expression E2> ]`)
  = assigned_ (checked_ (index_ ( integer_add_ ( evaluate(E2), literal("1")),
      vector_elements_ (evaluate(E1)))));
FunCon evaluate((Expression) 
  `<Expression E>.length`)
  = length_( vector_elements_ (evaluate(E)));
FunCon evaluate((Expression)
  `<Expression E>.<Identifier ID> ( <ExpressionList? ELs> )`)
  = give_(evaluate(E),
      apply_ (lookup_ (
         class_name_single_inheritance_feature_map_ (
            object_class_name_ (checked_(dereference_(given_())))),
         id("<ID>")),
        tuple_ ( [given_()] + evaluate_actuals(ELs))));
FunCon evaluate((Expression)
  `<Integer I>`) = literal("<I>");
FunCon evaluate((Expression) `true`) = true_();
FunCon evaluate((Expression) `false`) = false_();
FunCon evaluate((Expression) `<Identifier ID>`) = assigned_ (bound_ (id("<ID>")));
FunCon evaluate((Expression) `this`) = assigned_ (bound_ (id("this")));
FunCon evaluate((Expression) 
  `new int[<Expression E>]`) 
  = vector_ (interleave_repeat_ (allocate_initialised_variable_ ( integers_(), literal("0"))
                                ,literal("1"), evaluate(E)));
FunCon evaluate((Expression)
  `new <Identifier ID> ()`)
  = force_ (class_instantiator_(bound_(id("<ID>"))));
FunCon evaluate((Expression)
  `!<Expression E>`) = not_(evaluate(E));
FunCon evaluate((Expression)
  `(<Expression E>)`) = evaluate(E);
	
list[FunCon] evaluate_actuals(ExpressionList? ELs ) = [ x | E <- ELs, x <- evaluate_actuals(E) ];
list[FunCon] evaluate_actuals((ExpressionList)
  `<Expression E>`)
  = [evaluate(E)];
list[FunCon] evaluate_actuals((ExpressionList)
  `<Expression E> , <ExpressionList EL>`) = evaluate(E) + evaluate_actuals(EL);	

FunCon id(str s) = ident("<s>");