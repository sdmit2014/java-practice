package com.wecodee.practice.oops;

class Cat {
	int eyes;
}

public class PassByValue {

	public static void main(String[] args) {

		Cat x = new Cat();
		x.eyes = 2;
		Cat y = new Cat();
		y.eyes = 4;
		swap(x, y);
		System.out.println("swap eyes " + x.eyes + " swap eyes " + y.eyes);
		Cat z = new Cat();
		z.eyes = 5;
		changeCat(z);
		System.out.println("changeCat eyes " + z.eyes);
	}

	static void swap(Cat a, Cat b) {

		Cat temp = a;
		a = b;
		b = temp;

	}

	static void changeCat(Cat cat) {

		cat.eyes = 1;

	}

}
