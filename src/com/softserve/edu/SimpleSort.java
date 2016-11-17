package com.softserve.edu;

public class SimpleSort {
	public static void BubbleSort(int array[], int size) {
		int i, j;
		int swap;
		boolean key;
		for (i = 0; i < size; i++) {
			key = true;
			for (j = 0; j < size - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap = array[j];
					array[j] = array[j + 1];
					array[j + 1] = swap;
					key = false;
				}
			}
			if (key) {
				break;
			}
		}
	}
}