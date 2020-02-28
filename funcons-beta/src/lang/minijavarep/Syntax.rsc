module lang::minijavarep::Syntax

extend lang::minijava::Syntax;

import lang::funcon::Funcons;
                  
syntax Phrase = Expression ";"? ".." | Statement ".." | VarDecl* ".." | ClassDecl* "..";
                  
syntax Program = Standard Phrase* Standard;

Program load(str s) = parse(#Program, s);
Program load(loc f) = parse(#Program, f);