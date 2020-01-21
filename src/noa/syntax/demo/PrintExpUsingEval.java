package noa.syntax.demo;

import java.util.List;

public class PrintExpUsingEval implements ExpAlg<IPrintUsingEval> {
	@Override
	public IPrintUsingEval add(IPrintUsingEval l, IPrintUsingEval r) {
		return eval -> "[" + l.print(eval) + " + " + r.print(eval) + ": " + eval.eval() + "]";
	}

	@Override
	public IPrintUsingEval lit(int n) {
		return eval -> "" + n;
	}

	@Override
	public IPrintUsingEval avg(List<IPrintUsingEval> es) {
		return eval -> {
			String s = "[avg(";
			for (IPrintUsingEval e : es) {
				s += e.print(eval);
				s += ", ";
			}
			if (!s.equals("avg(")) {
				s = s.substring(0, s.length() - 2);
			}
			s += "): " + eval.eval() + "]";
			return s;
		};
	}
	
	@Override
	public IPrintUsingEval avg2(List<IPrintUsingEval> es) {
		return avg(es);
	}


	@Override
	public IPrintUsingEval mul(IPrintUsingEval l, IPrintUsingEval r) {
		return eval -> "[" + l.print(eval) + " * " + r.print(eval) + ": " + eval.eval() + "]";
	}

}
