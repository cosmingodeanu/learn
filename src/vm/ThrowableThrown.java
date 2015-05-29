package vm;

public class ThrowableThrown {
	static void test() throws Error {
		if (true)
			throw new AssertionError();
		System.out.println("test");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			test();
		} catch (Exception ex) {
			System.out.println("exception ");
		}
		System.out.println("end ");
	}

}
