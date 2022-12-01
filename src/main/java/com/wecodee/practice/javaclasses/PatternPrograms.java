package com.wecodee.practice.javaclasses;

import java.util.Scanner;

public class PatternPrograms {
	
	public static void main(String[] args) {
		
		new PatternPrograms().pattern1();
		
		System.out.println();
		
		new PatternPrograms().pattern2();
		
		System.out.println();

		new PatternPrograms().pattern3();
		
		System.out.println();

		new PatternPrograms().pattern4();
		
		System.out.println();

		new PatternPrograms().pattern5();
		
		System.out.println();

		new PatternPrograms().pattern6();
		
		System.out.println();
		
		new PatternPrograms().reversePattern();
		
	}

	// ************* Patter-1 *************
	public void pattern1() {
		
		System.out.println("--------------- Pattern-1 ---------------");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}
//---------------------------------------------------------------------------

	// ************* Pattern-2 *************
	public void pattern2() {
		
		System.out.println("--------------- Pattern-2 ---------------");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n-i+1; j++) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

//---------------------------------------------------------------------------

	// ************* Pattern-3 *************
	public void pattern3() {
		
		System.out.println("--------------- Pattern-3 ---------------");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {			//It will print number of rows.

			for (int j = 1; j <= n-i; j++) {

				System.out.print("  ");			//It will print first two spaces before *

			}
			
			for(int k=1; k<=i; k++) {
				
				System.out.print("*  ");  		//It will print next two spaces After *
				
			}

			System.out.println();

		}

	}

//---------------------------------------------------------------------------

	// ************* Pattern(Numbers)-4 *************
	public void pattern4() {
		
		System.out.println("--------------- Pattern-4 ---------------");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int num = 1;

		for (int i = 1; i <= n; i++) { // It will print number of rows.

			for (int j = 1; j <= n - i; j++) {

				System.out.print("  "); // It will print first two spaces before *

			}

			for (int k = 1; k <= i; k++) {

				System.out.print(num + "  "); // It will print next two spaces After *
				num++;

			}

			System.out.println();

		}

	}

//---------------------------------------------------------------------------
	// ************* Pattern(Numbers)-5 *************
	public void pattern5() {
		
		System.out.println("--------------- Pattern-5 ---------------");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int rows = 2 * n - 1; // logic for printing row numbers

		for (int i = 1; i <= rows; i++) { // It will print number of rows.
			if (i <= n) {
				for (int j = 1; j <= i; j++) {

					System.out.print("*  "); // It will print first two spaces before *

				}
			} else {

				for (int k = 1; k <= rows - i + 1; k++) {

					System.out.print("*  "); // It will print next two spaces After *

				}
			}
			System.out.println();

		}

	}

//---------------------------------------------------------------------------
	// ************* Pattern(Numbers)-6 *************
	public void pattern6() {

		System.out.println("--------------- Pattern-6 ---------------");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("*");

		for (int i = 2; i <= n - 1; i++) {
			System.out.print("* ");
			for (int j = 1; j <= i - 2; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			System.out.print("* ");
		}

	}
	
	//---------------------------------------------------------------------------
	
	// ************* Reverse Pattern *************
	public void reversePattern() {
		
		System.out.println("--------------- Reverse-Pattern ---------------");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i - 1; j++) {

				System.out.print("  ");

			}

			for (int k = 1; k <= n - i + 1; k++) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

}
