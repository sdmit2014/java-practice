package com.wecodee.practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailValidate {

	public void validateOnlyGmailId(String email) {

		boolean ex = true;

		int result1 = 0;

		// String expression = "^(.+)@(.+)$";

		String expression = "[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com";

		Pattern p = Pattern.compile(expression);

		Matcher m = p.matcher(email);

		System.out.println(email + " : " + m.matches() + "\n");

		result1 = Boolean.compare(m.matches(), ex);

		if (result1 == 0) {
			System.out.println("Valid Email-ID");
		} else {
			System.out.println("Invalid Email-ID");
		}

	}

	public void validateIndianPhoneNo(String number) {

		boolean ex = true;

		int result1 = 0;

		// String expression = "^(.+)@(.+)$";

		String expression = "[6-9][0-9]{9}";

		Pattern p = Pattern.compile(expression);

		Matcher m = p.matcher(number);

		System.out.println(number + " : " + m.matches() + "\n");

		result1 = Boolean.compare(m.matches(), ex);

		if (result1 == 0) {
			System.out.println("Valid Phone Number");
		} else {
			System.out.println("Invalid Phone Number");
		}

	}

	public void validateAllGmailId(String email) {

		boolean ex = true;

		int result1 = 0;

		String expression = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";

		Pattern p = Pattern.compile(expression);

		Matcher m = p.matcher(email);

		System.out.println(email + " : " + m.matches() + "\n");

		result1 = Boolean.compare(m.matches(), ex);

		if (result1 == 0) {
			System.out.println("Valid Email-ID");
		} else {
			System.out.println("Invalid Email-ID");
		}

	}

}

public class RegexDemo {

	public static void main(String[] args) {

		String toEmail1 = "akash@wecodee.com";

		String toEmail2 = "akash@gmail.com";

		new EmailValidate().validateOnlyGmailId(toEmail1);

		System.out.println("----------------------------------------\n");

		new EmailValidate().validateAllGmailId(toEmail2);

		System.out.println("----------------------------------------\n");
		
		new EmailValidate().validateIndianPhoneNo("8731241782");

		System.out.println("----------------------------------------\n");

		int count = 0;

		Pattern p = Pattern.compile("WI");

		Matcher m = p.matcher(
				"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJBS0FTSCIsImV4cCI6MTY3NzYwNTI5MiwiaWF0IjoxNjc3NTkwODkyfQ.SKoAgAdMmg0gMej94zEe5Wn-X8TYmI0J0dLSWpH14eD9DNBVCNa7EDFum-I2MIZEyLIJ0cvtPieiEXsEP0Wbxw");

		while (m.find()) {
			count++;
			System.out.println("Start index : " + m.start() + " | End Index : " + m.end() + " |  Group :" + m.group());
		}
		System.out.println("The number of accurance : " + count);
		System.out.println();

	}

}
