package vm;

class Foo {
	public int a = 3;

	public void addFive() {
		a += 5;
		System.out.println("f ");
	}
}

class Bar extends Foo {
	public int a = 8;

	public void addFive() {
		this.a += 5;
		System.out.println("b ");
	}
}

public class POly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo f = new Bar();
		f.addFive();
		System.out.println(f.a);
		StringBuilder sb = new StringBuilder("3");
		sb.append("3");
		StringBuffer sb2 = new StringBuffer("3");
		sb2.append("3");

	}

}
