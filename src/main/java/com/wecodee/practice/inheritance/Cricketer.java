package com.wecodee.practice.inheritance;

public class Cricketer extends Person {

	public Cricketer(String name) {
		super(name);
		System.out.println("Cricketer Constructor");
	}

	public void play() {
		System.out.println(name + " is playing..");
	}

}
