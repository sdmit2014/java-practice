package com.wecodee.practice.exceptions;

public class HandlingUncheckedExceptions {

	public static void main(String[] args) {

		// 1.ArithmeticException
		System.out.println("------- Starts ------------");

		int a = 10;

		try {

			System.out.println(a / 0);

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());
		}

		System.out.println("------- Ends ------------");

		// 2.NullPointerException
		System.out.println("------- Starts ------------");

		String s = null;

		try {

			System.out.println(s.length());

		} catch (NullPointerException e) { //This is general Exception handling, it will handle all kind of exceptions.

			System.out.println(e.getMessage());

		}
		System.out.println("------- Ends ------------");
		
		// 1.ArithmeticException
				System.out.println("------- Starts ------------");

				int b = 10;

				try {

					System.out.println(a / 0);

				} catch (ArithmeticException e) {

					System.out.println(e.getMessage());
				}

				System.out.println("------- Ends ------------");

	}

}
