package flows;

import java.io.IOException;

public class Exceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void methodTHing() {
		throw new IllegalArgumentException();
	}

	static void method3() {

		throw new IllegalStateException();
	}

	static void methodé() {

		throw new NumberFormatException();
	}

	class exce extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	}

	public void methodé2() {
		// throw new exce();
		// throw new ClassCastException();
	}

	static void methodé3() {
		// throw new Exception();
		// throw new IOException();
	}

}
