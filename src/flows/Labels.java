package flows;

public class Labels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean isTrue = true;

		outer: for (int i = 0; i < 5; i++) {
			while (isTrue) {
				System.out.println("Hello");
				break outer;
			} // end of inner while loop
			System.out.println("Outer loop."); // Won't print
		} // end of outer for loop

		System.out.println("Good-Bye========================");
		outer: for (int i = 0; i < 5; i++) {
			assert (i == 1);
			assert (isTrue = false);
			for (int j = 0; j < 5;) {
				System.out.println("Hello");
				continue outer;
			} // end of inner loop
			System.out.println("outer"); // Never prints
		}
		System.out.println("Good-Bye");
	}

}
