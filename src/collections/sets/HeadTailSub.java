package collections.sets;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class HeadTailSub {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NavigableSet<String> original = new TreeSet<String>();
		original.add("1");
		original.add("2");
		original.add("3");

		// this headset will contain "1" and "2"
		SortedSet<String> headset = original.headSet("3");
		System.out.println("head=" + headset);
		// this headset will contain "1", "2", and "3" because "inclusive"=true
		NavigableSet<String> headset2 = original.headSet("3", true);
		System.out.println("head=" + headset2);

		System.out.println();
		System.out.println("sub set next");
		NavigableSet<String> original2 = new TreeSet<String>();
		original.add("1");
		original.add("2");
		original.add("3");
		original.add("4");
		original.add("5");

		// this subset will contain "2" and "3"
		SortedSet<String> subset1 = original2.subSet("2", "4");

		// this subset will contain "2", "3" and "4" because
		// fromInclusive=true, and toInclusive=true
		NavigableSet<String> subset2 = original2.subSet("2", true, "4", true);
	}

}
