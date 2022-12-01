package com.wecodee.practice.javaclasses;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int temp = n;
		
		int revNum = 0;
		
		while(temp > 0 ) {
			
			int lastDigit = temp%10;
			
			revNum = revNum*10+lastDigit;
			
			temp/=10;
			
			System.out.println(+lastDigit +"  " + temp + "  " + revNum);
				
		}
		if(revNum == n) {
			System.out.println("------------------------------------");
			System.out.println(n + " is a palindrome");
		} else {
			System.out.println("------------------------------------");
			System.out.println(n + " is not a palindrome");

		}
		
	}

}
