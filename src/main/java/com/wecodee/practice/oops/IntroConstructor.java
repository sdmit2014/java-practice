package com.wecodee.practice.oops;

class NoArguments {

	int wheels;

	NoArguments() {
		wheels = 4;
	}
}

class Parameterized {

	int wheels;

	Parameterized(int noOfWheels) {
		wheels = noOfWheels;
	}
}

class ContructorOverloading {

	int wheels;
	String color;
	int indicators;

	ContructorOverloading(int wheels) {
		indicators = 2;
		color = "Red";
		this.wheels = wheels;
	}

	ContructorOverloading(int wheels, String color) {
		indicators = 2;
		this.wheels = wheels;
		this.color = color;
	}

}

public class IntroConstructor {

	public static void main(String[] args) {

		System.out.println("------------NoArguments------------");

		NoArguments car = new NoArguments();
		System.out.println("Car wheels:" + car.wheels);

		System.out.println("------------Parameterized------------");

		Parameterized bike = new Parameterized(2);
		System.out.println("Bike wheels:" + bike.wheels);

		Parameterized auto = new Parameterized(3);
		System.out.println("Auto wheels:" + auto.wheels);

		System.out.println("------------ContructorOverloading------------");

		ContructorOverloading bus = new ContructorOverloading(4);
		System.out
				.println("Bus wheels:" + bus.wheels + " Bus Indicators:" + bus.indicators + " Bus color:" + bus.color);

		ContructorOverloading van = new ContructorOverloading(4, "Gray");
		System.out
				.println("van wheels:" + van.wheels + " van Indicators:" + van.indicators + " van color:" + van.color);

	}

}
