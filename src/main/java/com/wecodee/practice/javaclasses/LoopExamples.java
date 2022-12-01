package com.wecodee.practice.javaclasses;

import java.util.Scanner;

public class LoopExamples {
	
	public static void main(String[] args) {
		
		new LoopExamples().whileLoopExample();
		
		System.out.println();
		
		new LoopExamples().doWhileExample();
		
	}

	// While loop example.
	public void whileLoopExample() {
		
		System.out.println("-------- While loop --------");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int temp = n;

		int sum = 0;

		while (temp > 0) {

			int lastDigit = temp % 10;

			temp /= 10;

			sum += lastDigit;
			
			System.out.println(+lastDigit +" " + temp + " " + sum);
		}

		System.out.print("Sum Of Digit " + n + " is " + sum);

	}

	// Do-While loop example
	public void doWhileExample() {
		
		System.out.println("-------- Do-While loop --------");
		Scanner sc = new Scanner(System.in);

		int n = 1;

		do {
			n = sc.nextInt();
			System.out.println("Number is " + n);
		} while (n != 0);
	}

}
