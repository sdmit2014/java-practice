package com.wecodee.practice.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetSdet1 {

	public static void main(String[] args) {

		// Declaration
//		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		LinkedHashSet lh = new LinkedHashSet();
		lh.add(100);
		lh.add(200);
		lh.add(300);
		lh.add(400);
		lh.add(500);
		System.out.println("Linked HashSet :" + lh); // Res:[100, 200, 300, 400, 500]

		HashSet hset = new HashSet();
		hset.add(100);
		hset.add(200);
		hset.add(300);
		hset.add(400);
		hset.add(500);
		System.out.println("HashSet :" + hset); // Res:[400, 100, 500, 200, 300]

	}

}
