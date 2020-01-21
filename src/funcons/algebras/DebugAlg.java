package funcons.algebras;

import org.rascalmpl.value.ISourceLocation;

public interface DebugAlg<E> {
	E debug(ISourceLocation loc, E x);
}
