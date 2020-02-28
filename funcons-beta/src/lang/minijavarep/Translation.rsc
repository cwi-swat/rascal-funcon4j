module lang::minijavarep::Translation

extend lang::minijava::Translation;

import lang::std::Layout;

import lang::minijavarep::Syntax;
import lang::funcon::Funcons;

import IO;

FunCon run((Program) `<Phrase* phrases>`) = accumulate__ ([ phrase_decl(p) | p <- phrases ]);
	
FunCon phrase_decl((Phrase)
	`<Expression E> ..`) = phrase_expr_decl(E);
FunCon phrase_decl((Phrase)
    `<Expression E> ;..`) = phrase_expr_decl(E);
FunCon phrase_expr_decl(E) = sequential_(print_(evaluate(E)), print_ (literal("\"\\n\"")), map_());
FunCon phrase_decl((Phrase)
	`<Statement S> ..`) = sequential_(execute(S), map_());
FunCon phrase_decl((Phrase)
	`<ClassDecl* CDs> ..`) = class_sequence_(CDs);
FunCon phrase_decl((Phrase)
    `<VarDecl* VDs> ..`) = declare_variables(VDs);

//FunCon class_sequence_(CDs) = declare_classes_(CDs);
FunCon class_sequence_(CDs) = accumulate_(bind_class_occurrences(class_occurrences(CDs))
                                         ,recursive_(bound_names(CDs), declare_classes_(CDs)));
    
FunCon bind_class_occurrences(list[FunCon] ids) = map_([ tuple_ (id, fresh_init_link_(values_(),empty_class(id))) | id <- ids]);
    
FunCon empty_class(id) = class_ (thunk_ (abstraction_(
                             sequential_(print_(literal("\"class \""), to_string_(id), literal("\" not declared\""))
                                        ,fail_()))), map_());
    
list[FunCon] class_occurrences(d) {
    res = [];
    top-down visit(d) {
       case (Expression) `new <Identifier ID> ()` : {
         res = res + [id("<ID>")];
       }
    };
    print(res);
    return res;
  }
  
FunCon declare_classes_(ClassDecl* decls) = accumulate_([declare_class_(cd) | cd <- decls]);

FunCon declare_class_((ClassDecl) 
	`class <Identifier ID1> { <VarDecl* VDs> <MethodDecl* MDs> }`) 
	= maybe_merge_classes(ID1,
	    class_ (thunk_ (closure_ (reference_ (object_ (
				 fresh_atom_(), id("<ID1>"), declare_variables(VDs))))),
				 declare_methods(MDs)));
                   
FunCon declare_class_((ClassDecl) 
	`class <Identifier ID1> extends <Identifier ID2> { <VarDecl* VDs> <MethodDecl* MDs> }`) 
	= maybe_merge_classes(ID1,
	   class_ (thunk_ (closure_ (reference_ (object_ (
				 fresh_atom_(), id("<ID1>"), declare_variables(VDs))))),
				 declare_methods(MDs),
				 id("<ID2>")));
    
// assumes <ID> is bound to a link (used in first argument of recursive)
FunCon maybe_merge_classes(ID, decl) = 
  bind_(id("<ID>"),	give_(bound_directly_(id("<ID>")), sequential_(set_link_(given_(),decl),given_())));
  