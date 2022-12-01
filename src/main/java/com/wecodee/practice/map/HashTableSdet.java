package com.wecodee.practice.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableSdet {

	public static void main(String[] args) {

		// Declaration
		// Hashtable ht = new Hashtable(); // Default capacity is 11, Load factor 0.75
		// Hashtable ht = new Hashtable(initial capacity); //creating hashtable with
		// initial capacity
		// Hashtable ht = new Hashtable(initial capacity, fill/load factor);

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		// put()
		ht.put(101, "Smith");
		ht.put(102, "Chipi");
		ht.put(103, "Samual");
		ht.put(104, "Bindli");

		// ht.put(105, null); //It will show NullPointerException, Null not acceptable
		System.out.println("Hashtable :" + ht);

		// get()
		System.out.println("get the value at 102 :" + ht.get(102));

		// remove()
		ht.remove(101);
		System.out.println("After removing :" + ht);

		// containsKey()
		System.out.println("containsKey 102 :" + ht.containsKey(102)); // true
		System.out.println("containsKey 105 :" + ht.containsKey(105)); // false

		// containsValue()
		System.out.println("containsValue Chipi :" + ht.containsValue("Chipi")); // true
		System.out.println("containsValue Akash :" + ht.containsValue("Akash")); // false

		// isEmpty()
		System.out.println("isEmpty :" + ht.isEmpty()); // false

		// keySet()
		System.out.println("keySet :" + ht.keySet()); // [104, 103, 102]

		// values()
		System.out.println("values :" + ht.values()); // [Bindli, Samual, Chipi]

		// Reading the keys as individual elements using for loop
		for (int i : ht.keySet()) {
			System.out.println("Key :" + i);
		}

		// Reading the values as individual elements using for loop
		for (String s : ht.values()) {
			System.out.println("Values :" + s);
		}

		System.out.println("---------------Entry Methods ----------------");
		// Entry specific methods entrySet=(Key+Value pair)
		for (Map.Entry entry : ht.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}
		
		System.out.println("---------------Iterator Methods ----------------");
		Set s=ht.entrySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry entry =  (Entry) it.next();
			System.out.println(entry.getKey() +"   "+entry.getValue());
		}

	}

}
