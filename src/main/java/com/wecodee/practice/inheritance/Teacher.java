package com.wecodee.practice.inheritance;

public class Teacher extends Person {

	public Teacher(String name) {
		super(name);
		System.out.println("Teacher Constructor");
	}

	public void teach() {
		System.out.println(name + " is teaching..");
	}

	public void walk() {
		super.walk();
		System.out.println("Teacher " + name + " is walking..");
	}

}
