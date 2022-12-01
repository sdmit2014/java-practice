package com.wecodee.practice.arrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSdet1 {

	public static void main(String[] args) {

		// Declaring linkedList
		// Homogeneous
//		LinkedList<Integer> l1 = new LinkedList<Integer>();
//		LinkedList<String> l2 = new LinkedList<String>();

		// Heterogeneous
		LinkedList l = new LinkedList();

		// add();
		l.add(100);
		l.add("Java");
		l.add(15.2);
		l.add('A');
		l.add(true);
		l.add(null);
		System.out.println("All elements in linkdelist :" + l); // [100, Java, 15.2, A, true, null]

		// size();
		System.out.println("Size of the linkedlist :" + l.size()); // 6

		// remove();
		l.remove(3);
		System.out.println("After removing :" + l); // [100, Java, 15.2, true, null]

		// adding the element in the middle of the linked list
		l.add(3, 'A');
		System.out.println("After inserting element :" + l); // [100, Java, 15.2, A, true, null]

		// Retrieving the element from the object
		System.out.println("Retrieving a element :" + l.get(3)); // Retrieving a element :A

		// Replace/set a new value into the existing object
		l.set(5, "Adam");
		System.out.println("After Setting/Replacing new value :" + l); // [100, Java, 15.2, A, true, Adam]

		// search a value in the object
		// contains()
		System.out.println("Searching a value Java:" + l.contains("Java")); // Searching a value Java:true
		System.out.println("Searching a value Java:" + l.contains("SQL")); // Searching a value Java:false

		// isEmpty()
		System.out.println("Is Object is empty or not :" + l.isEmpty()); // Is Object is empty or not :false

		// Reading the elements from linked list using for loop
		System.out.println("---------------Using for loop---------------");
		for (int i = 0; i < l.size(); i++) {
			System.out.println("values :" + l.get(i));
		}

		// Reading the elements from linked list using for-each loop
		System.out.println("---------------Using for each---------------");
		for (Object ref : l) {
			System.out.println("values :" + ref);
		}

		// Reading the elements from linked list using Iterator method
		System.out.println("---------------Using Iterator method---------------");
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println("Values :" + it.next());
		}

	}

}
