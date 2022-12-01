package com.wecodee.practice.exceptions;

public class ExceptionsEduraka {

	public static void main(String[] args) {

		new ExceptionsEduraka().builtInException();

		new ExceptionsEduraka().handlingBuiltInExceptions();

		new NestedTryCatchBlock().nestedTryBlock();

		new NestedTryCatchBlock().nestedCatchBlock();

		new NestedTryCatchBlock().finallyBlock();

		new NestedTryCatchBlock().throwKeyWord();

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

class NestedTryCatchBlock {

	public void nestedTryBlock() {
		System.out.println("----------- Nested try-catch block -----------");
		try {

			try {

				try {

					System.out.println("2nd-Inner Exception Block");

					String s = "escabara";
					System.out.println("s-length :" + s.length());

					String s1 = null;
					System.out.println("s1-length :" + s1.length());

				} catch (NullPointerException e) {
					System.out.println("Causing NullPointerException");
				}

				System.out.println("1st-Inner Exception Block");

				String c = "3452";
				int i = Integer.parseInt(c);
				System.out.println("Integer Conversion :" + i);

				String c1 = "3A452";
				int i1 = Integer.parseInt(c1);

			} catch (NumberFormatException e) {
				System.out.println("Causing NumberFormatException");
			}

			System.out.println("---Outer exception Block---");

			int x = 10, y = 5;
			int z = x / y;
			System.out.println("Division :" + z);

			int a = 10;
			System.out.println(a / 0);

		} catch (ArithmeticException e) {
			System.out.println("Causing ArithmeticException");
		}

	}

	public void nestedCatchBlock() {
		System.out.println("----------- Nested Catch-catch block -----------");
		try {

			String s = "escabara";
			System.out.println("s-length :" + s.length());

			String s1 = null;
			System.out.println("s1-length :" + s1.length());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Causes ArrayIndexOutOfBoundsException");
		}

		catch (NullPointerException e1) {
			System.out.println("Causing NullPointerException");
		}

	}

	public void finallyBlock() {

		try {
			System.out.println("--------- finallyBlock() -------------");

			int num = Integer.parseInt("escabara");
			System.out.println("Num :" + num);

		} catch (NumberFormatException e) {

			System.out.println("Causes NumberFormatException");

		} finally {
			System.out.println("Default finally Block");
		}

	}

	static void throwKeyWord() {
		try {

			System.out.println("--------  throw --------");

			throw new ArithmeticException("DemoThrow");

		} catch (Exception e) {

			System.out.println("throughs ArithmeticException");

		}
	}

}
