package vm;

import java.util.HashSet;
import java.util.Set;

public class HAshmapsRetainsObjectsNotReferences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Integer i1 = 32;
		Integer i2 = 3;

		set.add(i1);
		set.add(i1);
		set.add(i2);
		System.out.println(set.size());
		set.remove(i1);
		System.out.println(set.size());
		i2 = 44;
		set.remove(i2);
		System.out.println(set.size());
	}

}
