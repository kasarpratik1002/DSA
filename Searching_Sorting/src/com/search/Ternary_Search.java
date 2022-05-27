package com.search;

public class Ternary_Search {

	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 6, 7, 8, 9, 11, 13, 14, 15 };

		int key = 1;
		int low = 0;
		int high = a.length - 1;
		int k = ternary_search(a, low, high, key);
		System.out.println(k);
	}

	private static int ternary_search(int[] a, int low, int high, int key) {

		while (low <= high && (key >= a[low] && key <= a[high])) {

			int mid1 = low + (high - low) / 3;
			int mid2 = high - (high - low) / 3;

			if (key == a[mid1]) {
				return mid1;
			}
			if (key == a[mid2]) {
				return mid2;
			}

			if (key < a[mid1]) {
				high = mid1 - 1;
			}
			if (key > a[mid2]) {
				low = mid2 + 1;
			}

			if (key < a[mid2] && key > a[mid1]) {
				high = mid2 - 1;
				low = mid1 + 1;

			}

		}

		return -1;
	}
}
