package com.wecodee.practice.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList3Sdet {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("c");

		ArrayList al2 = new ArrayList();
		al2.add(1);
		al2.add(2);
		al2.add(3);

		al2.addAll(al);
		System.out.println("After addinng all the values :" + al2);

		al2.removeAll(al);
		System.out.println("After removing al values :" + al2);

		System.out.println("Before sorting :" + al);

		// Sorting the elements using Collections class methods which is also belongs to
		// java.util packages

		// Sorting all the elements in "Proper-Order"
		Collections.sort(al);
		System.out.println("After sorting :" + al);

		// Sorting all the elements in "Reverse-Order"
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("After sorting reverse order :" + al);

		// Sorting all the elements in "Shuffling-Order"
		Collections.shuffle(al);
		System.out.println("After Shuffling :" + al);

		System.out.println("======== Converting Arry To ArrayList ================");
		new ArrayList3Sdet().convertingArryToArrayList();

	}

	public void convertingArryToArrayList() {

		String arr[] = { "X", "Y", "Z" };

		for (String ref : arr) {
			System.out.println(ref);
		}

		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println("After converting to arraylist :" + al);

	}

}
