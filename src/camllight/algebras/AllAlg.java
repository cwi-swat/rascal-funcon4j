package camllight.algebras;

public interface AllAlg<E> extends
        camllight.algebras.base.ModuleAlg<E>,

        camllight.algebras.constants.ConstantsAlg<E>,

        camllight.algebras.decls.BindAlg<E>,
        camllight.algebras.decls.GlobalAlg<E>,

        camllight.algebras.exprs.ArrayAlg<E>,
        camllight.algebras.exprs.BoolLogicAlg<E>,
        camllight.algebras.exprs.ControlAlg<E>,
        camllight.algebras.exprs.ExceptionAlg<E>,
        camllight.algebras.exprs.ExpAlg<E>,
        camllight.algebras.exprs.FloatCalcAlg<E>,
        camllight.algebras.exprs.FunctionAlg<E>,
        camllight.algebras.exprs.IntCalcAlg<E>,
        camllight.algebras.exprs.LetAlg<E>,
        camllight.algebras.exprs.ListAlg<E>,
        camllight.algebras.exprs.RecordAlg<E>,
        camllight.algebras.exprs.RefAlg<E>,
        camllight.algebras.exprs.StringAlg<E>,
        camllight.algebras.exprs.TupleAlg<E>,

        camllight.algebras.patts.ListPattAlg<E>,
        camllight.algebras.patts.PattAlg<E>,
        camllight.algebras.patts.PattMatchAlg<E>,
        camllight.algebras.patts.RecordPattAlg<E>,
        camllight.algebras.patts.TuplePattAlg<E>,

        camllight.algebras.typeexprs.TypeExpAlg<E>
{
    @Override
    funcons.algebras.RecordAlg<E> alg();
}
