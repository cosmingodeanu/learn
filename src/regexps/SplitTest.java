package regexps;

public class SplitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			String[] tokens = args[0].split(args[1]);
			System.out.println("count " + tokens.length);
			for (String s : tokens)
				System.out.println(">" + s + "<");
		}
		System.out.println("static input up next");
		for (String s : "ab5 ccc 45 @".split("\\d"))
			System.out.println(">" + s + "<");

	}

}
