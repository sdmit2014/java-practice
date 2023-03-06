package com.wecodee.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("a");

		Matcher m = p.matcher("abaabaaab");

		while (m.find()) {
			System.out.println("Index : " + m.start() + " | Matcher : " + m.group());
		}
		System.out.println();

		Pattern p1 = Pattern.compile("a+");

		Matcher m1 = p1.matcher("abaabaaab");

		while (m1.find()) {
			System.out.println("Index : " + m1.start() + " | Matcher : " + m1.group());
		}

		System.out.println();

		Pattern p2 = Pattern.compile("a*");

		Matcher m2 = p2.matcher("abaabaaab");

		while (m2.find()) {
			System.out.println("Index : " + m2.start() + " | Matcher : " + m2.group());
		}

		System.out.println();

		Pattern p3 = Pattern.compile("a?");

		Matcher m3 = p3.matcher("abaabaaab");

		while (m3.find()) {
			System.out.println("Index : " + m3.start() + " | Matcher : " + m3.group());
		}

		System.out.println();

	}

}
