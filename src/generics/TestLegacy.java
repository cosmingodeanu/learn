package generics;

import java.util.*;

class Parent {
	public void stuff() {
	}
}

class Child extends Parent {
}

public class TestLegacy {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		Inserter in = new Inserter();
		in.insert(myList); // pass List<Integer> to legacy code
		System.out.println(myList);
		for (Integer s : myList) {
			System.out.println(s instanceof Integer);// runtime
														// classcastexception on
														// last string element
		}

		// List<Parent> myList2 = new ArrayList<Child>(); // DOESN'T COMPILE
		List<Parent> myList2 = new ArrayList<Parent>();
		in.smthWithSuper(myList2);
		
		List<Child> myList3 = new ArrayList<Child>();
		in.cannotAddSmth(myList3);
	}
}

class Inserter {
	// method with a non-generic List argument
	// void insert(List list) {
	// list.add(new Integer(42)); // adds to the incoming list
	// }
	void insert(List list) {
		list.add(new String("string thing"));
		// put a String in the list
		// passed in
	}

	void cannotAddSmth(List<? extends Parent> theList) {
		// theList.addAll(new Parent());//compiler error
		// theList.addAll(new Child());//compiler error
		theList.get(0).stuff();
	}
	void smthWithSuper(List<? super Child> theList) {
		// theList.addAll(new Parent());//compiler error
		// theList.addAll(new Child());//compiler error
	}
	//compiler error
}