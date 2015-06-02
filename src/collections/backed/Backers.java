package collections.backed;

import java.util.SortedMap;
import java.util.TreeMap;

public class Backers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("a", "ant");
		map.put("d", "dog");
		map.put("h", "horse");
		SortedMap<String, String> submap;
		submap = map.subMap("b", "g"); // #1 create a backed collection
		System.out.println(map + " " + submap); // #2 show contents
		map.put("b", "bat");// #3 add to original
		submap.put("f", "fish"); // #4 add to copy
		// submap.put("y", "yack"); // added by me will throw exception because
		// out of range

		map.put("r", "raccoon");
		// submap.put("p", "pig"); // #5 add to original - out of range
		// #6 add to copy - out of range
		System.out.println(map + " " + submap); // #7 show final contents
	}

}
