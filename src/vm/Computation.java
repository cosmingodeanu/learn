package vm;

public class Computation extends Thread {
	private int num;
	private boolean isComplete;
	private int result;

	public Computation(int num) {
		this.num = num;
	}

	public synchronized void run() {
		result = num * 2;
		isComplete = true;
		notify();
	}

	public synchronized int getResult() {
		while (!isComplete) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computation[] comps = new Computation[4];
		for (int i = 0; i < comps.length; i++) {
			comps[i] = new Computation(i);
			comps[i].start();
		}
		for (Computation computation : comps) {
			System.out.println(computation.getResult() + "");
		}
	}

}
