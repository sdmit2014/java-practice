package com.wecodee.practice.exceptions;

public class Throw {

	public static void main(String[] args) {
		fun();
	}

	static void fun() {
		int a = 6;
		int b = 3;
		int c = a / b;
		System.out.println(c);
		boolean isWrong = false;
		if (isWrong == false) {
			throw new ArrayIndexOutOfBoundsException("Something Wrong");
		}
	}

}
