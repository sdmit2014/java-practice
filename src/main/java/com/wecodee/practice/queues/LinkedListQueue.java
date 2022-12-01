package com.wecodee.practice.queues;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQueue {

	public static void main(String[] args) {

		LinkedList q = new LinkedList();

		// Adding elements - using add()
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C"); // duplicate element

		System.out.println("Queue :" + q); // [A, B, C, C]-Here Insertion order preserved & duplicates allowed

		// get the head element using element() & peek()
		System.out.println("Get using element method :" + q.element()); // A
		System.out.println("Get using peek method :" + q.peek()); // A

		System.out.println("-----------------------Empty queue-1--------------------------------");
		LinkedList q1 = new LinkedList();
		System.out.println("Get using element method :" + q1.peek()); // If Queue is empty, return 'null'

		System.out.println("-------------------------------------------------------");
		// System.out.println("Get using peek method :" + q1.element()); // If Queue is
		// empty, return 'NoSuchElementException'

		LinkedList q2 = new LinkedList();
		q2.add("A");
		q2.add("B");
		q2.add("C");
		q2.offer("C");
		System.out.println("New Queue-2 :" + q2);

		// System.out.println("Remove :" + q2.remove()); //It will return 'A' & then
		// remove the element from queue.

		// System.out.println("After remove :" + q2);

		System.out.println("Remove :" + q2.poll());

		System.out.println("After remove :" + q2);

		System.out.println("--------------------- Empty queue-2 -------------------");
		LinkedList q3 = new LinkedList();
		// System.out.println(q3.remove()); // If Queue is empty, return
		// 'NoSuchElementException'
		System.out.println(q3.poll());// If Queue is empty, return 'null'

		// Reading the elements using the iterator method
		LinkedList q4 = new LinkedList();
		q4.add("A");
		q4.add("B");
		q4.add("C");
		q4.offer("C");

		System.out.println("------------using Iterator --------------------");
		Iterator it = q4.iterator();
		while (it.hasNext()) {
			System.out.println("values :" + it.next());
		}

		// Reading the elements using the for-each loop
		System.out.println("------------for-each --------------------");
		for (Object ref : q4) {
			System.out.println("values :" + ref);
		}

	}

}
