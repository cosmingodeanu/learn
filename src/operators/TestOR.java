package operators;

class TestOR {

	public static void main(String[] args) {

		if ((isItSmall(3)) || (isItSmall(7))) {

			System.out.println("1st Result is true");

		}

		if ((isItSmall(6)) || (isItSmall(9))) {

			System.out.println("this result isn't true");

		}
		boolean t = true;
		boolean f = false;
		System.out.println("! " + (t & !f) + " " + f);
		System.out.println("xor " + ((2 < 3) ^ (4 > 3) ^ (2 == 2)));
	}

	public static boolean isItSmall(int i) {
		// if (i < 5 ^ true ^ false) {
		if (i < 5) {

			System.out.println("i < 5");

			return true;

		} else {

			System.out.println("i >= 5");

			return false;

		}

	}
}