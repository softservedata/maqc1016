package com.softserve.edu;

public class Appl {
	public static void main(String[] args) {
		int i;
		int workDays[] = { 22, 2, 8, 4, 3, 10, 18, 15, 21, 12, 23, 1, 7 };
		//
		System.out.println("Unsorted array: ");
		for (i = 0; i < workDays.length; i++) {
			System.out.print(workDays[i] + " ");
		}
		System.out.print("\n");

		//
		SimpleSort.BubbleSort(workDays, workDays.length);
		//
		System.out.println("Sorted array:");
		for (int element : workDays) {
			System.out.print(element + " ");
		}
		System.out.print("\n");
	}
}
