package com.wecodee.practice.exceptions;

public class ExceptionsEduraka {

	public static void main(String[] args) {

		new ExceptionsEduraka().builtInException();

		new ExceptionsEduraka().handlingBuiltInExceptions();
		
		

	}

	public void builtInException() {

		// 1.ArithmeticException:
		int a = 20;
		// System.out.println("Find the division :" + a / 0);

		// 2.NullPointerException
		String s = null;
		// System.out.println("Find the division :" + s.length());

		//
		String str = "12345";
		int i = Integer.parseInt(str);
//		System.out.println(i);

		// 3.NumberFormatException
		String str1 = "123AB";
		// int i1 = Integer.parseInt(str1);
		// System.out.println("Integer.parseInt :" + i1);

		// 4.ArrayIndexOutOfBoundsException
		// int b[] = new int[5];
		// b[10] = 100;
		// System.out.println("Array :" + b);

	}

	public void handlingBuiltInExceptions() {
		System.out.println("--------------------------------------");
		try {

			int b = 10, c = 2;
			int z = b / c;
			System.out.println("Result :" + z);

			int a = 20;
			System.out.println(a / 0);

		} catch (ArithmeticException e) {

			System.out.println("Causing ArithmeticException Exception");
		}
		System.out.println("--------------------------------------");

		System.out.println("--------------------------------------");
		try {

			String str = "3465376";
			int j = Integer.parseInt(str);
			System.out.println("Result :" + j);

			String s = "1234AB";
			int i = Integer.parseInt(s);
			System.out.println(i);

		} catch (NumberFormatException e) {

			System.out.println("Causing NumberFormatException");
		}
		System.out.println("--------------------------------------");

		System.out.println("--------------------------------------");
		try {

			String str = "Akash";
			System.out.println("Result :" + str);

			String s = null;
			System.out.println(s.length());

		} catch (NullPointerException e) {

			System.out.println("Causing NullPointerException");
		}
		System.out.println("--------------------------------------");

		System.out.println("--------------------------------------");
		try {

			int a[] = new int[5];
			a[1] = 10;
			System.out.println("Result :" + a.length);

			int b[] = new int[5];
			b[6] = 10;
			System.out.println("Result :" + b);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Causing ArrayIndexOutOfBoundsException");
		}
		System.out.println("--------------------------------------");

		System.out.println("--------------------------------------");
		try {

			String str = "Akash";
			System.out.println("Result :" + str);

			String s = null;
			System.out.println(s.length());

		} catch (NullPointerException e) {

			System.out.println("Causing NullPointerException");
		}
		System.out.println("--------------------------------------");

	}

	

}

class Dhamu {

}
