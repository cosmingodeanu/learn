package vm;

public class RuntimeExcept {
	static void test() throws RuntimeException {
		try {
			System.out.println("test ");
			throw new RuntimeException();
		} catch (Exception ex) {
			System.out.println("exception");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			test();
		} catch (RuntimeException re) {
			System.out.println("runtime");
		}
		System.out.println("end ");

	}

}
