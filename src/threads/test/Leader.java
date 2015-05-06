package threads.test;

public class Leader implements Runnable {

	public static void main(String[] args) {

		Thread t = new Thread(new Leader());

		t.start();

		System.out.print("m1 ");

		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.print("m2 ");

	}

	public void run() {

		System.out.print("r1 ");

		System.out.print("r2 ");

	}
}