package innerclass;

class Thising {
	private int x = 7;

	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}

	class MyInner {
		public void seeOuter() {
			System.out.println("Outer x is " + x);
			System.out.println("Inner class ref is " + this);
			System.out.println("Outer class ref is " + Thising.this);
		}
	}

	public static void main(String[] args) {
		Thising.MyInner inner = new Thising().new MyInner();
		inner.seeOuter();
	}
}