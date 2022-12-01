package com.wecodee.practice.oops;

class Dog {

	String color, breed;

	int legs, eyes;

	public void eat() {
		System.out.println("Dog is eating");
	}

	public void walk() {
		System.out.println("Dog is walking");
	}

	public void description() {
		System.out.println("Dog has " + eyes + " eyes and " + legs + " legs");
	}

}

public class ObjectClassDemo {

	public static void main(String[] args) {

		Dog dog1 = new Dog();

		dog1.eyes = 2;

		dog1.legs = 4;

		dog1.eat();

		dog1.walk();

		dog1.description();

	}

}
