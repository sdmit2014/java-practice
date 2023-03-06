package com.wecodee.practice.regex;

import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Pattern;

class ValidationForMobileAndEmail {

	public void valdateEmailId() {

		Scanner sc = new Scanner(System.in);

		String mail = sc.next();

		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");

		Matcher m = p.matcher(mail);

		if (m.find() && m.group().equals(mail)) {
			System.out.println("Entered Email " + mail + " is valid Email-Id");
		} else {
			System.out.println("Entered Email " + mail + " is invalid Email-Id");
		}

	}

	public void valdateMobileNumber() {

		Scanner sc = new Scanner(System.in);

		String num = sc.next();

		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");

		Matcher m = p.matcher(num);

		if (m.find() && m.group().equals(num)) {
			System.out.println("Entered number " + num + " is valid mobile number");
		} else {
			System.out.println("Entered number " + num + " is invalid mobile number");
		}

	}
}

public class RegexDemo4 {

	public static void main(String[] args) {

		new ValidationForMobileAndEmail().valdateEmailId();

		new ValidationForMobileAndEmail().valdateMobileNumber();

	}

}
