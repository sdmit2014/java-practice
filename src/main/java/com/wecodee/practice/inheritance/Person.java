package com.wecodee.practice.inheritance;

public class Person {

	protected String name;

	public Person(String name) {
		this.name = name;
		System.out.println("Person constructor");
	}

	public void walk() {
		System.out.println(name + " is walking..");
	}

	public void drink() {
		System.out.println(name + " is drinking..");
	}

	public void sleep() {
		System.out.println(name + " is sleeping..");
	}

}
