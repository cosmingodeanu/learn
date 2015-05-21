package operators;

public class PostPreIncrement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		if (y == x++) {
			System.out.println("this won't print");
		}
		if (y == x++) {
			System.out.println("this will print but x(" + x
					+ ") doesn't equal y(" + y + ") anymore");
		}

	}

}
