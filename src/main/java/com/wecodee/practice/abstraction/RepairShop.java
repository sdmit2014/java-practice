package com.wecodee.practice.abstraction;

public class RepairShop {

	public static void repairCar(Car car) {
		System.out.println("Car is repaired...");
	}

	public static void main(String[] args) {

		Audi audi = new Audi();
		Lamborginny lamborginny = new Lamborginny();

		repairCar(audi);
		repairCar(lamborginny);
	}

}
