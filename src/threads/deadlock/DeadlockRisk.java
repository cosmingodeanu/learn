package threads.deadlock;

public class DeadlockRisk {

	private static class Resource {

		public int value;

	}

	private Resource resourceA = new Resource();

	private Resource resourceB = new Resource();

	public int read() {

		synchronized (resourceA) { // May deadlock here
			try {
				Thread.sleep((long) Math.random() * 3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (resourceB) {

				return resourceB.value + resourceA.value;

			}

		}

	}

	public void write(int a, int b) {
		synchronized (resourceB) { // May deadlock here
			try {
				Thread.sleep((long) Math.random() * 3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (resourceA) {

				resourceA.value = a;

				resourceB.value = b;

			}

		}

	}

	public static void main(String[] args) {
		final DeadlockRisk rsi = new DeadlockRisk();
		rsi.resourceA.value = 2;
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				rsi.read();

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				rsi.write(2, 3);

			}
		});

		t.start();
		t2.start();
	}
}