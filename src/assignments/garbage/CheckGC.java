package assignments.garbage;

import assignments.init.*;
import java.util.Date;

public class CheckGC {
	static {
		System.out.println("static checkgc class ");
	}

	public static void main(String[] args) {
		GarbageTruck gt; // its static block is not called
		gt = new GarbageTruck();// only now its static block is called
		Init ini; // its static block is not called
		ini = new Init();// only now its static block is called
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: " + rt.totalMemory());

		System.out.println("Before Memory = " + rt.freeMemory());
		Date d = null;
		for (int i = 0; i < 10000; i++) {
			d = new Date();

			d = null;
		}
		System.out.println("After Memory = " + rt.freeMemory());
		rt.gc();
		// an alternate to System.gc()
		System.out.println("After GC Memory = " + rt.freeMemory());

	}
}