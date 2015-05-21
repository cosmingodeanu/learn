package flows;

public class IfElseIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// else corresponds to innermost if
		int i = 0;

		if (i == 0)
		if (i > 3)i = 3;
		else i = 4;

	}
}
