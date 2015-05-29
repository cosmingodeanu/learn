package vm;

public class FinallyException {
	static void test() {
		try {
			String s = null;
			System.out.println(s.toString() + " ");
		} finally {
			System.out.print("finally ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception ex) {
			System.out.println("exception");
		}

	}

}
