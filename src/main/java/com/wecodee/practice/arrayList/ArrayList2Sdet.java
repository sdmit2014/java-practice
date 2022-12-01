package com.wecodee.practice.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2Sdet {

	public static void main(String[] args) {

		// Declare ArrayList
		// ------ For Homogeneous data ------
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		ArrayList<String> al = new ArrayList<String>();

		// ------ For Heterogeneous data ------
		ArrayList al = new ArrayList<>();
		al.add(100);
		al.add("Java");
		al.add(10.5);
		al.add(true);
		al.add('A');
		System.out.println("Total Elements in arraylist :" + al); // [100, Java, 10.5, true, A]

		// Size();
		System.out.println("Size of the arraylist :" + al.size());

		// remove();
//		al.remove("Java"); //Here Java is a element
		al.remove(1);
		System.out.println("After removing elements from arraylist :" + al); // [100, 10.5, true, A]

		al.add(2, "Python");
		System.out.println("After insertion one new element :" + al); // [100, 10.5, Python, true, A]

		// Retrieve specific element from arraylist
		System.out.println("Retrieving specific element :" + al.get(2)); // :Python, here 2 is index of element/object

		// Replace/change a element
		al.set(2, "PlSql");
		System.out.println("After replacing a element :" + al); // [100, 10.5, PlSql, true, A]

		// search- contains() - will return true/false
		System.out.println("Search plsql :" + al.contains("PlSql")); // Search plsql :true
		System.out.println("Search HTML :" + al.contains("HTML")); // Search HTML :false

		// isEmpty();
		System.out.println("Is arrylist is epty or not :" + al.isEmpty()); // Is arrylist is epty or not :false

		// using different approach we can read the data from the arraylist...

		// 1.for loop
		System.out.println("======= Reading elements using for loop ======");

		for (int i = 0; i < al.size(); i++) {
			System.out.println("for loop :" + al.get(i));
		}

		// 2.for-each loop
		System.out.println("======= Reading elements using for-each loop ======");

		for (Object e : al) {
			System.out.println("For-each :" + e);
		}

		// 2.iterator();
		System.out.println("======= Reading elements using iterator method ======");

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println("iterator :"+it.next()); //Printing the element and will move to the next element 
		}

	}

}
