package com.wecodee.practice.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		System.out.println("-------------------------{ add }-------------------------");
		new ArrayListMethods().addFruits();

		System.out.println("-------------------------{ addAll }-------------------------");
		new ArrayListMethods().addAllFruits();

		System.out.println("-------------------------{ get Index }-------------------------");
		new ArrayListMethods().getFruitIndex();

		System.out.println("-------------------------{ set Index }-------------------------");
		new ArrayListMethods().setVegItem();

		System.out.println("-------------------------{ Remove Element }-------------------------");
		new ArrayListMethods().removeNonVegItem();

		System.out.println("-------------------------{ Remove All Element }-------------------------");
		new ArrayListMethods().removeAllVegItem();

		System.out.println("-------------------------{ Clear Elements }-------------------------");
		new ArrayListMethods().clearItem();

		System.out.println("-------------------------{ Size of Elements }-------------------------");
		new ArrayListMethods().sizeOfItems();

		System.out.println("-------------------------{ Contains Elements }-------------------------");
		new ArrayListMethods().containsItem();

		System.out.println("-------------------------{ isEmpty Elements }-------------------------");
		new ArrayListMethods().isEmptyItem();
		
		System.out.println("-------------------------{ toArray Elements }-------------------------");
		new ArrayListMethods().toArrayItems();;

	}

	public void addFruits() {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		System.out.println("Fruits:" + fruits);
	}

	public void addAllFruits() {
		List<String> fruits1 = new ArrayList<>();
		fruits1.add("Apple");
		fruits1.add("Mango");
		fruits1.add("Orange");

		List<String> vegetables = new LinkedList();
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.addAll(fruits1);
		System.out.println("All the Fruits:" + vegetables);
	}

	public void getFruitIndex() {
		List<String> fruits2 = new ArrayList<>();
		fruits2.add("Apple");
		fruits2.add("Mango");
		fruits2.add("Orange");
		System.out.println("Index element is: " + fruits2.get(1));
	}

	public void setVegItem() {
		List<String> novVeg = new ArrayList<>();
		novVeg.add("Fish Fry");
		novVeg.add("Checken Biryani");
		novVeg.add("Matton Biryani");

		novVeg.set(0, "Mushroom Pulav");
		System.out.println("Setted Veg Item is: " + novVeg);

	}

	public void removeNonVegItem() {
		List<String> veg = new ArrayList<>();
		veg.add("Dosa");
		veg.add("Poori");
		veg.add("Checken Biryani");
		veg.add("Pulav");
		System.out.println("Removed Non Veg Item is: " + veg.remove(2));
	}

	public void removeAllVegItem() {
		List<String> veg = new ArrayList<>();
		veg.add("Checken Biryani");
		veg.add("Dosa");
		veg.add("Poori");
		veg.add("Mutton Biryani");
		veg.add("Fish fry");

		List<String> toRemove = new LinkedList();
		toRemove.add("Poori");
		toRemove.add("Dosa");

		veg.removeAll(toRemove);
		System.out.println("After Removing All Veg Items: " + veg);
	}

	public void clearItem() {
		List<String> veg = new ArrayList<>();
		veg.add("Dosa");
		veg.add("Poori");
		veg.add("Checken Biryani");
		veg.add("Pulav");
		veg.clear();
		System.out.println("Cleared all items: " + veg);
	}

	public void sizeOfItems() {
		List<String> veg = new ArrayList<>();
		veg.add("Dosa");
		veg.add("Poori");
		veg.add("Checken Biryani");
		veg.add("Pulav");
		System.out.println("Size of the items is: " + veg.size());
	}

	public void containsItem() {
		List<String> veg = new ArrayList<>();
		veg.add("Dosa");
		veg.add("Poori");
		veg.add("Checken Biryani");
		veg.add("Pulav");
		System.out.println("contains LemonRice: " + veg.contains("LemonRice"));
		System.out.println("contains Dosa: " + veg.contains("Dosa"));
	}

	public void isEmptyItem() {
		List<String> veg = new ArrayList<>();
		veg.add("Dosa");
		veg.add("Poori");

		List<String> nonVeg = new ArrayList<>();

		System.out.println("isEmpty veg items: " + veg.isEmpty());
		System.out.println("isEmpty nov-veg items: " + nonVeg.isEmpty());
	}

	public void toArrayItems() {
		List<String> mobiles = new ArrayList<>();
		mobiles.add("Iphone");
		mobiles.add("Redmi");
		mobiles.add("Samsung");

		String temp[] = new String[mobiles.size()];

		mobiles.toArray(temp);
		for (String e : temp) {
			System.out.println(e);
		}

	}

}
