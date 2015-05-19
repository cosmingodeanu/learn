package assignments.autoboxing;

public class Wrapps {
	public static void main(String[] args) {
		go(5);
		Integer i = 2;
		Integer x = i;
		System.out.println("x==i?" + (x == i));
		x++;
		System.out.println("after x++, x==i?" + (x == i));
		Integer trois = 3;
		System.out.println("x(3)==trois(3)" + (x == trois));
		Short si = 3;
		//System.out.println(si==trois);//compiler error

	}

	static boolean go(Integer i) { // boxes the int it was passed
		Boolean ifSo = true; // boxes the literal
		Short s = 300; // boxes the primitive
		if (ifSo) {// unboxing
			System.out.println(++s);// unboxes, increments, reboxes
		}
		return !ifSo; // unboxes, returns the inverse
	}
}
