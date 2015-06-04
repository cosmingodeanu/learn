package innerclass;

public class MyOuter2 {
	private int x = 7;

	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}

	// make an inner instance
	class MyInner {
		public void seeOuter() {
			System.out.println("Outer x is " + x);
		}
	}
}