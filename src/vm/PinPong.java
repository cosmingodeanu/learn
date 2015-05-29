package vm;

import java.util.Locale;

class Pingpong {
	synchronized void hit(long n) {
		for (int i = 1; i < 3; i++)
			System.out.println(n + "-" + i + " ");
	}
}

public class PinPong {

	static Pingpong pp = new Pingpong();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale loc = Locale.getDefault();
	}
	

}
