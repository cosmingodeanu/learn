package flows;

public class Gotcha {

	public static void main(String[] args) {
		// try {
		// new Gotcha().go();
		// } catch (Exception e) { //////////// doesn't catch stackoverflowERROR
		// System.out.println("ouch");
		// }
		// insert code here
		try {
			new Gotcha().go();
		} catch (Error e) {///////////  catchES stackoverflowERROR
			System.out.println("ouch");
		}
	}

	void go() {

		go();

	}
}