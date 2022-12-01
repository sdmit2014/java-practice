package com.wecodee.practice.javaclasses;

import java.util.Scanner;

public class TwoDimentionalArrays {

	public static void main(String[] args) {

		new TwoDimentionalArrays().demoArray();

		System.out.println();

		new TwoDimentionalArrays().twoDimentionArray();

	}

	public void demoArray() {
		// Declaration
//		int a[][] = new int[3][3];

//		System.out.println("Two-D Array:" + a[2][2]);

		System.out.println("----------- demoArray -----------");

		int a[][] = { { 1, 2, 3, 4 }, { 2, 4, 5, 6 }, { 1, 2, 4, 7 } };
		System.out.println("Array:" + a[2][2]);

	}

	public void twoDimentionArray() {

		System.out.println("----------- twoDimentionArray -----------");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Dimentions");

		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];

		System.out.print("Enter the Array 'A'");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter the Array 'B'");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		int c[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("Sum of arrays is");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
