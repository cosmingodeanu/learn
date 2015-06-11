package threads.test;

public class Leader implements Runnable {

	public static void main(String[] args) {

		Thread t = new Thread(new Leader());

		t.start();

		System.out.print("m1 ");
//		try {
//			t.wait();
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			e.notify();
		}

		System.out.print("m2 ");
	}

	public void run() {

		System.out.print("r1 ");

		System.out.print("r2 ");

	}
}