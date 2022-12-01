package com.wecodee.practice.arrayList;

//Generic type ArrayList
public class GenericTypeArrayList<X, Y> {

	X x;

	Y y;

	public GenericTypeArrayList(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	public void getDescribe() {
		System.out.println(x + " and " + y);
	}

	public static void main(String[] args) {
		GenericTypeArrayList<String, Integer> arr1 = new GenericTypeArrayList("Akash", 1);
		GenericTypeArrayList<Boolean, Integer> arr2 = new GenericTypeArrayList(true, 2);

		arr1.getDescribe();
		arr2.getDescribe();
	}

}
