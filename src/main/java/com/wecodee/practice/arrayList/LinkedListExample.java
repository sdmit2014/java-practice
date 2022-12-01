package com.wecodee.practice.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		List<Integer> ll = new LinkedList<>();

		getTimeDifference(al);
		getTimeDifference(ll);

	}

	static void getTimeDifference(List<Integer> list) {
		long start = System.currentTimeMillis();

		for (int i = 0; i <= 100000; i++) {
			list.add(0, i);
		}

		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName() + " Time difference: " + (end - start));

	}

}
