package com.wecodee.practice.javaclasses;

import java.util.Scanner;

public class ExampleArrays {

	public static void main(String[] args) {

		new ExampleArrays().demoArrays();

		System.out.println();

		new ExampleArrays().averageMarks();

	}

	// Demo Example for Arrays
	public void demoArrays() {
		
		System.out.println("------------ demoArrays ------------");

		int[] age = { 21, 22, 23, 25, 24 };

		int[] marks = { 10, 9, 8, 7, 6 };

		marks[1] = 5; // update in arrays

		for (int i = 0; i < age.length; i++) {

			System.out.println(age[i]);
		}

		System.out.println("----------------------");
		System.out.println("Updated value of index :" + marks[1]);

	}

//------------------------------------------------------------------------------------

	// Average marks
	public void averageMarks() {
		
		System.out.println("------------ averageMarks ------------");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of students");

		int n = sc.nextInt();

		int marks[] = new int[n];

		System.out.print("Enter the marks");

		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}

		int avgMarks = 0;

		for (int i = 0; i < n; i++) {
			avgMarks += marks[i];
		}

		avgMarks /= n;
		System.out.println("---------------------------");
		System.out.println("Average marks of the students :" + avgMarks);

	}

}
