package com.wecodee.practice.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSdet1 {

	public static void main(String[] args) {

		// Declaring hash set
		// HashSet hs = new HashSet(); // Default size is 16 & Load factor is 0.75

		// HashSet hs = new HashSet(100); //Configured Initial capacity is 100

		// HashSet hs = new HashSet(100, (float)0.99); //Configured Load factor &
		// Initial capacity

		// HashSet<Integer> hs = new HashSet<Integer>();

		HashSet hs = new HashSet();

		// add(); Here insertion order not preserved..
		hs.add(100);
		hs.add("Java");
		hs.add('A');
		hs.add(15.3);
		hs.add(true);
		hs.add(null);
		System.out.println("All Elements from Hashset :" + hs); // [null, Java, A, 100, 15.3, true]

		// remove()
		hs.remove(15.3);
		System.out.println("After removing element :" + hs); // [null, Java, A, 100, true]

		// Imp: Here we don't have Get & Set methods for fetching and setting the
		// values.

		// contains()
		System.out.println("Contains Java :" + hs.contains("Java")); // true
		System.out.println("Contains Java :" + hs.contains("Python")); // false

		// isEmpty()
		System.out.println("isEmpty :" + hs.isEmpty()); // false

		// Reading data using for each loop
		System.out.println("-------Reading values using for each loop-------");

		for (Object ref : hs) {
			System.out.println("Values :" + ref);
		}

		// Reading data using Iterator
		System.out.println("-------Reading values using Iterator-------");

		Iterator it = hs.iterator();

		while (it.hasNext()) {
			System.out.println("Values :" + it.next());
		}

	}

}
