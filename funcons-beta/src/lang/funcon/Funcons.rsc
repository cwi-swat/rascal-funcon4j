module lang::funcon::Funcons

extend lang::funcon::Abrupting;
extend lang::funcon::Binding;
extend lang::funcon::Bits;
extend lang::funcon::Booleans;
extend lang::funcon::Characters;
extend lang::funcon::Classes;
extend lang::funcon::ComputationTypes;
extend lang::funcon::Continuing;
extend lang::funcon::Controlling;
extend lang::funcon::Datatypes;
extend lang::funcon::Failing;
extend lang::funcon::Floats;
extend lang::funcon::Flowing;
extend lang::funcon::Functions;
extend lang::funcon::Generating;
extend lang::funcon::Generic;
extend lang::funcon::Giving;
extend lang::funcon::Graphs;
extend lang::funcon::Integers;
extend lang::funcon::Interacting;
extend lang::funcon::Linking;
extend lang::funcon::Lists;
extend lang::funcon::Maps;
extend lang::funcon::Multisets;
extend lang::funcon::Null;
extend lang::funcon::Objects;
extend lang::funcon::Patterns;
extend lang::funcon::Records;
extend lang::funcon::References;
extend lang::funcon::Returning;
extend lang::funcon::Sequences;
extend lang::funcon::Sets;
extend lang::funcon::Storing;
extend lang::funcon::Strings;
extend lang::funcon::Throwing;
extend lang::funcon::Thunks;
extend lang::funcon::Trees;
extend lang::funcon::Tuples;
extend lang::funcon::ValueTypes;
extend lang::funcon::Variants;
extend lang::funcon::Vectors;

data FunCon = literal(str s)
            | ident(str s)
            | star(FunCon c)
            ;
       /*     
data FCEnvironments = lift(FunCon);
data FCBooleans = lift(FunCon);

FunCon project([FCEnvironments] lift(f)) = f;
FunCon project([FCBooleans] lift(f)) = f;

FunCon scope(FCEnvironments x, FunCon y) = scope_(project(x), y);

*/