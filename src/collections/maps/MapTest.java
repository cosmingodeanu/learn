package collections.maps;

import java.util.*;

class Dog {
	public Dog(String n) {
		name = n;
	}

	public String name;

	public boolean equals(Object o) {
		if ((o instanceof Dog) && (((Dog) o).name == name)) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return name.length();
	}
}

class Cat {
}

enum Pets {
	DOG, CAT, HORSE
}

public class MapTest {
	public static void main(String[] args) {
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new Dog("aiko"));
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");
		Dog d1 = new Dog("clover");
		// add some key/value pairs
		// let's keep this reference
		m.put(d1, "Dog key");
		m.put(new Cat(), "Cat key");
		System.out.println(((Dog) m.get("k1")).name);
		String k2 = "k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new Cat()));
		System.out.println(m.size());
		System.out.println("----------------------");
		d1.name = "magnolia";
		// d1.name = "magnol"; //now it can be the same bucket and we receive
		// Dog
		System.out.println(m.get(d1));// the hashcode is 8 ( magnolia ) and it
										// should be 6( clover ), so the
										// retrieval fails at step 1 and we get
										// null
										// for (Object key : m.keySet()) {
		// if (key instanceof Dog)
		// System.out.println(((Dog) key).name + " being dog key iterated "
		// + ((Dog) key).hashCode());
		// else
		// System.out.println(key.hashCode()+"being a key iterated");
		// }
		d1.name = "clover";
		System.out.println(m.get(new Dog("clover")));// dog key
		d1.name = "arthur";
		System.out.println(m.get(new Dog("clover")));// null because hashCode is
														// equal but name values
														// not equal
		// System.out.println(m.get(new Dog("arthur")));// => Dog key

	}
}