package com.wecodee.practice.regex;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {

		System.out.println("----------- Pattern class split method------------------");

		Pattern p = Pattern.compile("\\s");

		String[] s = p.split("Wecodee innovation pvt ltd");

		for (String s1 : s) {
			System.out.println(s1);
		}
		System.out.println();

		Pattern p1 = Pattern.compile("a");

		String[] s1 = p1.split("Durga software solution");

		for (String s2 : s1) {
			System.out.println(s2);
		}

		System.out.println();

		// Pattern p2 = Pattern.compile("\\.");

		// OR

		Pattern p2 = Pattern.compile("[.]");

		String[] s2 = p2.split("www.wecodee.com");

		for (String s3 : s2) {
			System.out.println(s3);
		}

		System.out.println("----------- String class split method------------------");

		String str = "Deloitte software solutions";

		String[] st = str.split("\\s");

		for (String st1 : st) {
			System.out.println(st1);
		}

		System.out.println("----------- String Tokenizer------------------");

		StringTokenizer strToken = new StringTokenizer("Wecodee innovation pvt ltd");

		while (strToken.hasMoreTokens()) {
			System.out.println(strToken.nextToken());
		}
		
		System.out.println();
		
		StringTokenizer strToken1 = new StringTokenizer("02-03-2023", "-");

		while (strToken1.hasMoreTokens()) {
			System.out.println(strToken1.nextToken());
		}

	}

}
