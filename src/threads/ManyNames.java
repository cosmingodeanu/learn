package threads;

class NameRunnable implements Runnable {
	public void run() {
		for (int x = 1; x <= 25; x++) {
			System.out.println("Run by " + Thread.currentThread().getName()
					+ ", x is " + x);
			try {
				Thread.sleep((long) Math.random() * 3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ManyNames {
	public static void main(String[] args) throws InterruptedException {
		// Make one Runnable
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		one.setName("Fred1");
		// one.setPriority(1);
		two.setName("Lucy2");
		three.setName("Ricky3");
		three.start();
		three.join();
		System.out.println("three finished");
		one.start();
		three.join();
		two.start();
		// one.join();
		// two.join();
		// three.join();
	}
}