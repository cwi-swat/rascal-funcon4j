module lang::minijavaext::Translation

extend lang::minijava::Translation;
import lang::minijavarep::Translation;

import lang::std::Layout;

import lang::minijavaext::Syntax;
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

  
FunCon maybe_merge_classes(ID, decl) = 
  bind_(id("<ID>"), give_(bound_directly_(id("<ID>")), 
   sequential_(else_(sequential_(effect_(follow_if_link_(given_())) //follow-if-link fails if link is not set 
                                ,set_link_(given_(),merge_classes_(follow_if_link_(given_()), decl)))
  	                ,set_link_(given_(), decl))
  	          ,given_()))); 