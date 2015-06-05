package vm;

import java.io.Serializable;
import java.util.TreeSet;

public class Explorer3 {

	class A extends Explorer3 implements Runnable, Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();
		for (int i = 606; i < 613; i++)
			if (i % 2 == 0)
				s.add(i);
		subs = (TreeSet) s.subSet(608, true, 611, true);
		subs.add(629);// runtime exception out of range
		System.out.println(s + "" + subs);
	}

}
