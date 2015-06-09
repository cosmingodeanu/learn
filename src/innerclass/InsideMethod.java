package innerclass;

public class InsideMethod {
	private String x = "Outer2";

	void doStuff() {
		String z = "local variable";
		 class MyInner {
			public void seeOuter() {
				System.out.println("Outer x is " + x);
				// System.out.println("Local variable z is " + z); // Won't compile!
			} // close inner class method
		}	// close inner class definition
	}	// close outer class method doStuff()
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
