package threads.notifall;

public class ReadWait {
	class Calculator extends Thread {
		int total;

		public void run() {
			synchronized (this) {
				for (int i = 0; i < 100; i++) {
					total += i;
				}
				notifyAll();
			}
		}
	}

	class Reader extends Thread {
		Calculator c;

		public Reader(Calculator c) {
			this.c = c;
		}

		public void run() throws IllegalAccessError{
			synchronized (c) {
				try {
					System.out.println("Waiting for calculation..."+Thread.currentThread().getName());
					c.wait();
				} catch (InterruptedException e) {
				}
				System.out.println("Total is: " + c.total + " from thread"+Thread.currentThread().getName());
			}
		}
	}

	public static void main(String... args) {
		ReadWait rw = new ReadWait();
		ReadWait.Calculator c = rw.new Calculator();
		ReadWait.Reader rr1 = rw.new Reader(c);rr1.setName("1");
		ReadWait.Reader rr2 = rw.new Reader(c);rr2.setName("2");
		ReadWait.Reader rr3 = rw.new Reader(c);rr3.setName("3");
		
		rr1.start();
		rr3.start();
		rr2.start();
		c.start();
	}
}
