package com.wecodee.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("[a-zA-Z0-9]");

		Matcher m = p.matcher("a7b@z#9");

		while (m.find()) {
			System.out.println("Index : " + m.start() + " | Matcher : " + m.group());
		}
		System.out.println();

		Pattern p1 = Pattern.compile("[^a-zA-Z0-9]");

		Matcher m1 = p1.matcher("a7b@z#9");

		while (m1.find()) {
			System.out.println("Index : " + m1.start() + " | Matcher : " + m1.group());
		}

		System.out.println();

		Pattern p2 = Pattern.compile("\\s");

		Matcher m2 = p2.matcher("a7b @z#9");

		while (m2.find()) {
			System.out.println("Index : " + m2.start() + " | Matcher : " + m2.group());
		}

		System.out.println();

		Pattern p3 = Pattern.compile("\\S");

		Matcher m3 = p3.matcher("a7b @z#9");

		while (m3.find()) {
			System.out.println("Index : " + m3.start() + " | Matcher : " + m3.group());
		}

		System.out.println();

		Pattern p4 = Pattern.compile("\\d");

		Matcher m4 = p4.matcher("a7b @z#9");

		while (m4.find()) {
			System.out.println("Index : " + m4.start() + " | Matcher : " + m4.group());
		}

		System.out.println();

		Pattern p5 = Pattern.compile("\\D");

		Matcher m5 = p5.matcher("a7b @z#9");

		while (m5.find()) {
			System.out.println("Index : " + m5.start() + " | Matcher : " + m5.group());
		}

		System.out.println();

		Pattern p6 = Pattern.compile("\\w");

		Matcher m6 = p6.matcher("a7b @z#9");

		while (m6.find()) {
			System.out.println("Index : " + m6.start() + " | Matcher : " + m6.group());
		}

		System.out.println();

		Pattern p7 = Pattern.compile("\\W");

		Matcher m7 = p7.matcher("a7b @z#9");

		while (m7.find()) {
			System.out.println("Index : " + m7.start() + " | Matcher : " + m7.group());
		}

		System.out.println();

		Pattern p8 = Pattern.compile("\\d");

		Matcher m8 = p8.matcher("a8b @z#9");

		while (m8.find()) {
			System.out.println("Index : " + m8.start() + " | Matcher : " + m8.group());
		}
		
		System.out.println();

		Pattern p9 = Pattern.compile(".");

		Matcher m9 = p9.matcher("a7b @z#9");

		while (m9.find()) {
			System.out.println("Index : " + m9.start() + " | Matcher : " + m9.group());
		}

	}

}
