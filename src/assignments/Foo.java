package assignments;

class Bar {
	int barNum = 28;
}

public class Foo {
	Bar myBar = new Bar();

	void changeIt(Bar myBar) {
		myBar.barNum = 99;
		System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
		myBar = new Bar();
		myBar.barNum = 420;
		System.out.println("myBar.barNum in changeIt is now " + myBar.barNum);
	}

	public static void main(String[] args) {
		Foo f = new Foo();
		System.out.println("f.myBar.barNum is " + f.myBar.barNum);
		f.changeIt(f.myBar);
		System.out
				.println("f.myBar.barNum after changeIt is " + f.myBar.barNum);
		Character c = 'é';
		c.toString();
		Short s = new Short((short) 3);
		
		
	}
}
