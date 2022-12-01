package com.wecodee.practice.exceptions;

//To check finally will executes the part of code, even after exceptions 
public class Driver1 {

	public static void main(String[] args) {

		try {

			int a[] = new int[8];

			System.out.println(a[9]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " In the ArrayIndexOutOfBoundsException");

		//Finally will executes the part of code, even after exceptions	
		} finally {
			System.out.println("End codes");
		}

	}

}
