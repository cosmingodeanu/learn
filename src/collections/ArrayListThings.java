package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListThings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> test = new ArrayList<String>();
		String s = "hi";
		test.add("string");
		test.add(s);
		test.add(s);
		test.add(s + s);
		System.out.println(test.size());
		System.out.println(test.contains(42));
		System.out.println(test.contains("hihi"));
		test.remove("hi");
		System.out.println(test.size());
		System.out.println("sorting stuff=======");
		ArrayList<String> stuff = new ArrayList<String>(); // #1
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		System.out.println("unsorted " + stuff);
		Collections.sort(stuff);
		// #2
		System.out.println("sorted" + stuff);

	}
}
