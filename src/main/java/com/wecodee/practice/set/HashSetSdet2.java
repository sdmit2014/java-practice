package com.wecodee.practice.set;

import java.util.HashSet;

public class HashSetSdet2 {

	public static void main(String[] args) {

		HashSet<Integer> num = new HashSet<Integer>();
		num.add(2);
		num.add(4);
		num.add(6);
		System.out.println("num :" + num);

		HashSet<Integer> num2 = new HashSet<Integer>();
		num2.add(10);

		// addAll()
		num2.addAll(num);
		System.out.println("Num2 :" + num2);

		// removeAll()
		num2.removeAll(num);
		System.out.println("After remove all :" + num2);

		System.out.println("================ Special Methods =========");
		new HashSetSdet2().specialMethods();

	}

	public void specialMethods() {

		HashSet<Integer> sec1 = new HashSet<Integer>();
		sec1.add(1);
		sec1.add(2);
		sec1.add(3);
		sec1.add(4);
		sec1.add(5);
		System.out.println("Sec1 :" + sec1);

		HashSet<Integer> sec2 = new HashSet<Integer>();
		sec2.add(3);
		sec2.add(4);

		System.out.println("Sec2 :" + sec2);

		// union
//		sec1.addAll(sec2);
//		System.out.println("union :" + sec1);

		// Intersection
//		sec1.retainAll(sec2);
//		System.out.println("Intersection :" + sec2);

		// difference
//		sec1.removeAll(sec2);
//		System.out.println("difference :" + sec1);

		// subset
		System.out.println("subset :" + sec1.containsAll(sec2));

	}

}
