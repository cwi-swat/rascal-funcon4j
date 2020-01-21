package camllight.algebras.decls;

import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.List;

public interface GlobalAlg<E> extends BindAlg<E> {
    @Override
    funcons.algebras.RecordAlg<E> alg();

    /*@Syntax("decllabelsandvariants = ident '=' IDTOKEN 'of' type")
    default E declLabelsAndVariantsDecl(E id, java.lang.String idToken, E type) {
        return alg().scopeNominalCoercion(
                variantTypeDecl(idToken, type),
                alg().boundType(id),
                alg().pattAbs(
                        alg().bind(alg().meta("nom_tag")),
                        alg().mapUnion(
                                alg().bindValue(
                                        alg().id(idToken),
                                        alg().close(alg().abs(alg().nomVal(
                                                alg().boundValue(alg().meta("nom_tag")),
                                                alg().variant(idToken, alg().given()))))),
                                alg().bindValue(alg().nameId("variant_selector", idToken),
                                        alg().close(alg().abs(alg().nomValSelect(
                                                alg().boundValue(alg().meta("nom_tag")),
                                                alg().given())))))));
    }*/

    @Syntax("decl = 'type' decloptionalvartypes declnewtypeappendix*")
    default E declNewType(E environment, List<E> environments) {
        for (E otherEnvironment : environments) {
            environment = alg().mapUnion(environment, otherEnvironment);
        }
        return environment;
    }

    @Syntax("declnewtypeappendix = 'and' decloptionalvartypes")
    default E declNewTypeAppendix(E environment) {
        return environment;
    }

    // Syntax only
    @Syntax("decloptionalvartypes = declnewtype") @Level(0)
    default E declNewTypeWithoutVarTypes(E environment) {
        return environment;
    }

    // Syntax only
    @Syntax("decloptionalvartypes = vartype declnewtype")
    default E declNewTypeWithVarType(E varType, E environment) {
        return environment;
    }

    // Syntax only
    @Syntax("decloptionalvartypes = '(' vartype@','* ')' declnewtype") @Level(1)
    default E declNewTypeWithVarTypes(List<E> varTypes, E environment) {
        return environment;
    }

    //Syntax only
    @Syntax("declnewtype = IDTOKEN '==' type")
    default E declTypeDefEquals(java.lang.String idToken, E type) {
        return alg().typeDef(alg().id(idToken), type);
    }

    @Syntax("declnewtype = IDTOKEN '=' CONSTRTOKEN decltypeappendix*")
    default E declNewEnumType(java.lang.String identToken, java.lang.String constrToken, List<E> environments) {
        E environment = declEnumTypeAppendix(constrToken);
        for (E env : environments) {
            environment = alg().mapUnion(environment, env);
        }
        return environment;
    }

    @Syntax("declnewtype = IDTOKEN '=' CONSTRTOKEN 'of' type decltypeappendix*")
    default E declNewConstrType(java.lang.String identToken, java.lang.String constrToken, E type, List<E> environments) {
        E environment = declConstrTypeAppendix(constrToken, type);
        for (E env : environments) {
            environment = alg().mapUnion(environment, env);
        }
        return environment;
    }

    @Syntax("decltypeappendix = '|' CONSTRTOKEN 'of' type") @Level(1)
    default E declConstrTypeAppendix(java.lang.String constrToken, E type) {
        return alg().environment(alg().id(constrToken), alg().abs(alg().clVariant(constrToken, alg().given())));
    }

    @Syntax("decltypeappendix = '|' CONSTRTOKEN") @Level(0)
    default E declEnumTypeAppendix(java.lang.String constrToken) {
        return alg().environment(alg().id(constrToken), alg().clVariant(constrToken, alg().null_()));
    }

    // Syntax only
    @Syntax("declnewtype = ident '=' '{' decllabeltype@','+ '}'")
    default E declRecordType(E id, List<E> labelTypeTuples) {
        return alg().environment();
    }

    @Syntax("decllabeltype = IDTOKEN ':' type")
    default E declLabelType(java.lang.String idToken, E type) {
        return alg().tuple(alg().field(idToken), type);
    }

    @Syntax("decllabeltype = 'mutable' IDTOKEN ':' type")
    default E declMutableLabelType(java.lang.String idToken, E type) {
        return alg().tuple(alg().field(idToken), type);
    }

    @Syntax("decl = 'exception' CONSTRTOKEN declexceptionappendix*")
    default E declEnumException(java.lang.String constrToken, List<E> environments) {
        E environment = declEnumExceptionAppendix(constrToken);
        for (E otherEnvironment : environments) {
            environment = alg().mapUnion(environment, otherEnvironment);
        }
        return environment;
    }

    @Syntax("decl = 'exception' CONSTRTOKEN 'of' type declexceptionappendix*")
    default E declConstrException(java.lang.String constrToken, E type, List<E> environments) {
        E environment = declConstrExceptionAppendix(constrToken, type);
        for (E otherEnvironment : environments) {
            environment = alg().mapUnion(environment, otherEnvironment);
        }
        return environment;
    }

    @Syntax("declexceptionappendix = 'and' CONSTRTOKEN") @Level(0)
    default E declEnumExceptionAppendix(java.lang.String constrToken) {
        return alg().environment(alg().id(constrToken), alg().clVariant(constrToken, alg().null_()));
    }

    @Syntax("declexceptionappendix = 'and' CONSTRTOKEN 'of' type") @Level(1)
    default E declConstrExceptionAppendix(java.lang.String constrToken, E type) {
        return alg().environment(alg().id(constrToken), alg().abs(alg().clVariant(constrToken, alg().given())));
    }
}
