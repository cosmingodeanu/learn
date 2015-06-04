package vm;

class A {
	void foo() throws Exception {
		throw new Exception();
	}
}

class SubB2 extends A {
	void foo() {
		System.out.println("B");
	}
}

public class SUBS2Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new SubB2();
		try {
			a.foo();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
