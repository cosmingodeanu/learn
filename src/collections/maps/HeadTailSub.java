package collections.maps;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class HeadTailSub {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NavigableMap<String, String> navigableMap = new TreeMap<String, String>();

		navigableMap.put("Matlab", "Another language");
		navigableMap.put("C++", "Good programming language");
		navigableMap.put("Python", "Language which Google use");
		navigableMap.put("Java", "Another good programming language");
		navigableMap.put("Ava", "programming language");
		navigableMap.put("Scala", "Another JVM language");
		navigableMap.put("Ruby", "Another language");

		System.out.println("SorteMap : " + navigableMap);
		for (String key : navigableMap.keySet()) {
			System.out.println("lower="+navigableMap.lowerKey(key)+", key="+key+", higher="+navigableMap.higherKey(key));
		}
		System.out.println("-----------------the rest-------------------------");
		// lowerKey returns key which is less than specified key
		System.out.println("lowerKey from Java : "
				+ navigableMap.lowerKey("Java"));
		System.out.println("lowerKey from Matlab : "
				+ navigableMap.lowerKey("Matlab"));

		// floorKey returns key which is less than or equal to specified key
		System.out.println("floorKey from Java: "
				+ navigableMap.floorKey("Java"));

		// ceilingKey returns key which is greater than or equal to specified
		// key
		System.out.println("ceilingKey from Java: "
				+ navigableMap.ceilingKey("Java"));

		// higherKey returns key which is greater specified key
		System.out.println("higherKey from Java: "
				+ navigableMap.higherKey("Java"));

		// Apart from navigation method, it also provides useful method
		// to create subMap from existing Map e.g. tailMap, headMap and subMap

		// an example of headMap - returns NavigableMap whose key is less than
		// specified
		NavigableMap<String, String> headMap = navigableMap.headMap("Python",
				false);
		System.out.println("headMap(Python,false) created form navigableMap : "
				+ headMap);
		NavigableMap<String, String> headMap2 = navigableMap.headMap("Python",
				true);
		System.out.println("headMap(Python,true) created form navigableMap : "
				+ headMap2);
		SortedMap<String, String> headMap3 = navigableMap.headMap("Python");
		System.out.println("headMap(Python) created form SortedMap : "
				+ headMap3);

		// an example of tailMap - returns NavigableMap whose key is greater
		// than specified

		NavigableMap<String, String> tailMapR = navigableMap.tailMap("Ruby",
				false);
		System.out.println("Ruby tailMap created form navigableMap : " + tailMapR);
		
		NavigableMap<String, String> tailMap = navigableMap.tailMap("Scala",
				false);
		System.out.println("Scala tailMap created form navigableMap : " + tailMap);
		
		NavigableMap<String, String> headMapS = navigableMap.headMap("Scala",
				false);
		System.out.println("Scala headMap created form navigableMap : " + headMapS);

		// an example of subMap - return NavigableMap from toKey to fromKey
		NavigableMap<String, String> subMap = navigableMap.subMap("C++", false,
				"Python", false);
		System.out.println("subMap created form navigableMap : " + subMap);

	}

}
