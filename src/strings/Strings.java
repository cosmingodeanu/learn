package strings;

public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String x = "big surprise";
		System.out.println(x.toString());
		x = "				hi				";
		x.trim();
		System.out.println(x + "=x");
		System.out.println(x.trim() + "=x trimmed");

	}

}
