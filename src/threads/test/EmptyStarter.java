package threads.test;

public class EmptyStarter {

	public static synchronized void main(String[] args)
			throws InterruptedException {
		Thread t = new Thread();
		t.start();
		System.out.print("X");
//		synchronized (t) {
			t.wait(10000);
//		t.notify();
//		t.notifyAll();
//		}
		System.out.print("Y");
	}

}
