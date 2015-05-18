package threads.test;

public class Starter implements Runnable {

	void go(long id) {

		System.out.println(id);

	}

	public static void main(String[] args) {

		System.out.print(Thread.currentThread().getId() + " ");

		// insert code here782

		//new Starter().run();
		//new Thread(new Starter());
		//new Thread(new Starter()).run();
		new Thread(new Starter()).start();
	}

	public void run() {
		go(Thread.currentThread().getId());
	}
}