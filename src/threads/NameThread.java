package threads;

public class NameThread implements Runnable {

	
	public void run() {
		System.out.println("NameRunnable running");
		System.out.println("Run by " + Thread.currentThread().getName());

	}
	public static void main(String... args) {
		NameThread nt = new NameThread();
		Thread t  = new Thread(nt);
		//t.setName("bread");
		t.start();
		System.out.println("max prio="+Thread.MAX_PRIORITY);
		System.out.println("norm prio="+Thread.NORM_PRIORITY);
		System.out.println("min prio="+Thread.MIN_PRIORITY);
		
	}

}
