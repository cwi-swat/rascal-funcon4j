package funcons.prettyprinter;

import funcons.carriers.IPrint;

public class FCTPrinter {
	public static IPrint variadic(String funcon, IPrint[] args) {
		return () -> {
			String args_string = args.length == 0 ? "" : args[0].toFCT();
			for (int i = 1; i < args.length; i++)
				args_string += ", " + args[i].toFCT();
			return funcon + "(" + args_string + ")";
		};
	}
	
	public static IPrint nullary(String funcon) {
		return () -> funcon;
	}
	
	public static IPrint fixed (String funcon, IPrint... args) {
		return variadic(funcon, args);
	}
}