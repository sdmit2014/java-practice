package com.wecodee.practice.exceptions;

//Normal exception handling..
public class Driver {

	public static void main(String[] args) {

		try {
			int a = 8;
			int b = 0;
			int c = a / b;

			System.out.println("Result:" + c);

		} catch (ArithmeticException e) {
			e.getMessage();
			System.out.println("Error accuring");
		}

	}

}
