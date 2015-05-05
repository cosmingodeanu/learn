package threads;

class NameRunnable implements Runnable {
	public void run() {
		for (int x = 1; x <= 30; x++) {
			System.out.println("Run by " + Thread.currentThread().getName()
					+ ", x is " + x);
			try {
				Thread.sleep((long) Math.random()*3);
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
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		one.start();
		two.start();
		three.start();
		one.join();
		two.join();
		three.join();
	}
}