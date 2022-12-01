package com.wecodee.practice.javaclasses;

import java.util.Scanner;

public class SortingAlgorithm {

	public static void main(String[] args) {

		new SortingAlgorithm().bubbleSort();
		
		System.out.println();

		new SortingAlgorithm().selectionSort();

	}

	// Bubble sort
	public void bubbleSort() {

		System.out.println("-------- Bubble sort --------");

		int a[] = { 9, 7, 8, 6, 5, 4, 3, 2 };

		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j + 1] < a[j]) {
					int temp;
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int sort : a) {
			System.out.print(sort + " ");
		}
	}

	// Selection Sort
	public void selectionSort() {

		System.out.println("-------- Selection Sort --------");

		int a[] = { 75, 39, 58, 80, 19, 7 };
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp;
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int sort : a) {
			System.out.print(sort + " ");
		}

	}

}
