package com.wecodee.practice.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSdet {

	public static void main(String[] args) {

		// Declaring the HashMap
		// HashMap m = new HashMap();
		// HashMap<Integer, String> m = new HashMap<Integer, String>();

		HashMap m = new HashMap();
		// put()
		m.put(101, "David");
		m.put(102, "John");
		m.put(103, "Scott");
		m.put(104, "Charlse");

		m.put(102, "Akash"); // Here the value is updating to Akash
		System.out.println("All maps :" + m); // {101=David, 102=Akash, 103=Scott, 104=Charlse}

		// get()
		System.out.println("get value at 102 :" + m.get(102)); // Akash

		// remove()
		m.remove(104);
		System.out.println("After removing 104 :" + m); // {101=David, 102=Akash, 103=Scott}

		// containsKey()
		System.out.println("containsKey 101 :" + m.containsKey(101)); // true
		System.out.println("containsKey 104 :" + m.containsKey(104)); // False

		// containsValue()
		System.out.println("containsValue Akash :" + m.containsValue("Akash"));// true
		System.out.println("containsValue Dhamu :" + m.containsValue("Dhamu"));// False

		// isEmpty()
		System.out.println("isEmpty :" + m.isEmpty()); // false

		// keySet()
		System.out.println("keySet :" + m.keySet()); // [101, 102, 103] as Key Set

		// values()
		System.out.println("values :" + m.values()); // [David, Akash, Scott] as Collection

		// entrySet()
		System.out.println("entrySet :" + m.entrySet()); // [101=David, 102=Akash, 103=Scott]

		System.out.println("-------------------- New  Map ------------------------------------");

		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(101, "David");
		m1.put(102, "John");
		m1.put(103, "Scott");
		m1.put(104, "Charlse");

		// Printing All the keys as individual elements using for each loop
		System.out.println("----------- Printing All the keys ------------------");
		for (int i : m1.keySet()) {
			System.out.println(i); // It will return all the keys as individual element
		}

		// Printing All the Values as individual elements using for each loop
		System.out.println("----------- Printing All the Values ------------------");
		for (String s : m1.values()) {
			System.out.println(s);
		}

		// Printing keys & Values Pair as individual elements using for each loop
		System.out.println("----------- Printing keys & Values Pair ------------------");
		for (Object i : m1.keySet()) {
			System.out.println(i + "  " + m1.get(i));
		}

		// Entry Interface methods
		System.out.println("**************** Entry Interface methods ****************");
		for (Map.Entry entry : m1.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		// Reading the values using Iterator
		System.out.println("******** Using Iterator **********");

		Set s1 = m1.entrySet();
		Iterator it1 = s1.iterator();

		while (it1.hasNext()) {
			Map.Entry entry = (Entry) it1.next();
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}

		System.out.println("---------------------------------");

		Set s = m1.entrySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
