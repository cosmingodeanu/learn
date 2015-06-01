package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysToListsToArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] sa = { "one", "two", "three", "four" };
		List sList = Arrays.asList(sa);
		// make a List
		System.out.println("size " + sList.size());
		System.out.println("idx2 " + sList.get(2));
		sList.set(3, "six");
		// change List
		sa[1] = "five";
		// change array
		for (String s : sa)
			System.out.print(s + " ");
		System.out.println("\nsl[1] " + sList.get(1));
		
		
		System.out.println("-----------------");
		List<Integer> iL = new ArrayList<Integer>();
		for (int x = 0; x < 3; x++)
			iL.add(x);
		Object[] oa = iL.toArray();
		// create an Object array
		Integer[] ia2 = new Integer[3];
		ia2 = iL.toArray(ia2);
		// create an Integer array

	}

}
