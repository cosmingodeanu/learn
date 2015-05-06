package threads.test;

class MyThread1 extends Thread {
	MyThread1() {
		System.out.print(" MyThread");
	}

	public void run() {
		System.out.print(" bar");
	}

	public void run(String s) {
		System.out.print(" baz");
	}
}

public class TestThreads {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new MyThread1() {
			public void run() {
				System.out.print(" foo");
			}
		};
		t.start();
		
		Thread.sleep(1000);
		Thread té = new MyThread1();
		té.start();
	}
}
