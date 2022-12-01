package com.wecodee.practice.arrayList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSdet2 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("X");
		l.add("D");
		l.add("Z");
		l.add("A");
		l.add("Y");
		l.add("B");
		l.add("C");

		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);

		// addAll()
		l1.addAll(l);
		System.out.println("After adding collection of the linked list :" + l1); // [1, 2, 3, X, Y, Z, A, B, C]

		l1.removeAll(l1);
		System.out.println("After removing all the collection elements :" + l1); // []

		// Sort()
		System.out.println("Before sorting collections :" + l);
		Collections.sort(l);
		System.out.println("After sorting Collections :" + l);

		// Reverse order
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("After Sorting in reverse order :" + l);

		// Shuffling
		Collections.shuffle(l);
		System.out.println("After Shuffling :" + l);

		System.out.println("--------- Special methods in the linked list ---------");
		new LinkedListSdet2().specialMethods();

	}

	// Special methods in the linked list
	public void specialMethods() {

		LinkedList l = new LinkedList();
		l.add("Cow");
		l.add("Dog");
		l.add("Cat");
		System.out.println("All elements :" + l);

		// addFirst()
		l.addFirst("Tiger");

		// addLast()
		l.addLast("Lion");
		System.out.println("AddFirst & AddLast :" + l);

		// get First & Last
		System.out.println("get First value :" + l.getFirst());
		System.out.println("get Last value :" + l.getLast());

		// remove First & remove Last
		l.removeFirst();
		l.removeLast();
		System.out.println("After removing first element :" + l);

	}

}
