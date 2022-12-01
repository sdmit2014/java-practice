package com.wecodee.practice.abstraction;

public class Audi extends Car {

	@Override
	public void acceselrate() {
		System.out.println("Audi is acceselrating...");
	}

	@Override
	public void brake() {
		System.out.println("Audi is breaking...");
	}

}
