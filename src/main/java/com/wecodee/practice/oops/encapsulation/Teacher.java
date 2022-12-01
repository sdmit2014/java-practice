package com.wecodee.practice.oops.encapsulation;

import com.wecodee.practice.oops.encapsulation.Students.X;
import com.wecodee.practice.oops.encapsulation.Students.Y;

public class Teacher {

	static {
		System.out.println("First static block");
	}

	public static void main(String[] args) {

		Students sc = new Students();

		X objx = sc.new X();

		Y objy = new Students.Y();

		sc.setName("Akash");

		sc.setRollNo(1);

		System.out.println("Name:" + sc.getName() + " RollNo:" + sc.getRollNo());

	}

	static {
		System.out.println("Second static block");
	}

}
