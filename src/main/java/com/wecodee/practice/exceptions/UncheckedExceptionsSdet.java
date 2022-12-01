package com.wecodee.practice.exceptions;

public class UncheckedExceptionsSdet {

	public static void main(String[] args) {

		// ------------- Types of Unchecked Exceptions --------------
		// 1.ArithmeticException
		// 2.NullPointerException
		// 3.NumberFormatException
		// 4.ArrayIndexOutOfBoundsException

		// 1.ArithmeticException:
		int a = 20;
		// System.out.println("Find the division :" + a / 0);

		// 2.NullPointerException
		String s = null;
		// System.out.println("Find the division :" + s.length());

		//
		String str = "12345";
		int i = Integer.parseInt(str);
		System.out.println(i);

		// 3.NumberFormatException
		String str1 = "123AB";
		// int i1 = Integer.parseInt(str1);
		// System.out.println("Integer.parseInt :" + i1);

		// 4.ArrayIndexOutOfBoundsException
		int b[] = new int[5];
		b[10] = 100;
		System.out.println("Array :" + b);

	}

}
