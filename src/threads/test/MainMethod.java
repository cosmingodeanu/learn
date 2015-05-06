package threads.test;

public class MainMethod {
	public static synchronized void main(String[] args)
			throws InterruptedException {
		Thread t = new Thread();
		t.start();
		synchronized (t) {
			System.out.print("X");
			t.wait(10000);
		}
		System.out.print("Y");
	}
}
