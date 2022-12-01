package com.wecodee.practice.oops;

public class MethodExample {

	public static void main(String[] args) {

		int x = 5;

		int y = 10;

		int c = 23;

		int d = 67;

		int result = maxOf(x, y);

		System.out.println("Maximum number is " + result);

		sayHello();

		swap(c, d);

		System.out.println(c + " " + d);

	}

	static int maxOf(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	// Pass by value example..
	static void swap(int a, int b) {

		int temp;
		temp = a;
		a = b;
		b = temp;

	}

	// Method overloading(But differ in Number of parameters)
	static int maxOf(int a, int b, int c) {
		return 0;
	}

	// Method overloading(Differ in data type of the arguments)
	static int maxOf(float a, int b) {
		return 0;
	}

	static void sayHello() {
		System.out.print("Hi charles,");
		System.out.println(" How are you?");
	}

}
