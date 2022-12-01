package com.wecodee.practice.interfaces;

public class Person implements Student, Youtuber {

	@Override
	public void makeVideo() {
		System.out.println("Person is making videos");
	}

	@Override
	public void study() {
		System.out.println("Person is studying");
	}

	@Override
	public void editVideo() {
		System.out.println("Video is editing");

	}

	//Main Method is executing
	public static void main(String[] args) {

		Person person = new Person();
		person.study();
		System.out.println("--------------------------");
		Youtuber youtuber = person;
		youtuber.editVideo();
		youtuber.makeVideo();
		
	}

}
