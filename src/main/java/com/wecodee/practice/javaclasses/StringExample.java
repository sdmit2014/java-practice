package com.wecodee.practice.javaclasses;

public class StringExample {

	public static void main(String[] args) {

		new StringExample().inbuiltMethods1();

		System.out.println();

		new StringExample().inbuiltMethods2();

		System.out.println();

		new StringExample().inbuiltMethods3();

	}

	public void inbuiltMethods1() {

		System.out.println("---------InbuiltMethods-1----------");

		String name = "AKASH GOWDA";

		// 1.charAt(int Index)
		System.out.println(name.charAt(4));

		// 2. int lenght()
		System.out.println(name.length());

		// 3. Substring(int beginIndex)
		System.out.println(name.substring(2));

		// 4. Substring(int beginIndex, int endIndex)
		System.out.println(name.substring(2, 9));

		// 5. booelan contains
		System.out.print(name.contains("SH"));

	}

	public void inbuiltMethods2() {

		System.out.println("---------InbuiltMethods-2----------");

		String name = "Anu";

		String name1 = "Anu";

		String name2 = "";

		String name3 = name1 + "shka";

		String name4 = new String(" sharma");

		// 6. boolean equals(object another)
		System.out.println(name.equals(name4));

		// 7. boolean isEmpty()
		System.out.println(name2.isEmpty());

		// Concat
		System.out.println(name3);

		// 8. String concat(String str)
		System.out.println(name3.concat(name4));

		// 9. replace(char old, char new)
		System.out.println(name1.replace("A", "a"));

		System.out.println("----Split-----");

		String mane = "mane, solra, soukyama";

		// 10. String [] split(String regex)
		String maneWords[] = mane.split(", ");

		for (String Words : maneWords) {

			System.out.println(Words);

		}

	}

	public void inbuiltMethods3() {

		System.out.println("---------InbuiltMethods-3----------");

		String mobiles = "iphone, Apple, Vivo";

		String phone = "  OnePlus  ";

		// 11. indexOf(int char)
		System.out.println(mobiles.indexOf("A"));

		// 12. String toLowerCase()
		System.out.println(mobiles.toLowerCase());

		// 13. String upperLowerCase()
		System.out.println(mobiles.toUpperCase());

		// Before Trim
		System.out.println(phone);

		// 14. String Trim
		System.out.print(phone.trim());

	}

}
