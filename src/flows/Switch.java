package flows;

public class Switch {
	enum Days {
		M, T, W, TH, F, SA, SU
	}

	static Days d;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 2;
		switch (x) {
		case 2:
			System.out.println("2");
		default:
			System.out.println("default");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		}
		System.out.println("=================");

		x = 7;
		switch (x) {
		case 2:
			System.out.println("2");
		default:
			System.out.println("default");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		}
		System.out.println("=================");

		switch (x) {
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		default:
			System.out.println("default");
		case 4:
			System.out.println("4");
		}

		System.out.println("=================");

		switch ('a') {
		case 1:
			System.out.println("");
		case 97:
			System.out.println("97 is ascii for a");
		}

		System.out.println("=================");

		switch (97) {
		case 1:
			System.out.println("");
		case 'a':
			System.out.println("97 is ascii for a");
		}
		int i = 444;
		System.out.println("=================");

		switch (i) {
		case 1:
			System.out.println("");
		case 'a':
			System.out.println("97 is ascii for a");
		}
		int id;
		id = 0;
		System.out.println("=================");
		switch (id) {
		case 1:
			System.out.println("");
		case 0:
			System.out.println("0");
		}

		System.out.println("=================");

		switch (d) {// runtime NPE
		case T:
			System.out.println("");
		case TH:
			System.out.println("0");
		}
	}

}
