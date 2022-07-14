// Java program to illustrate
// recursive approach to ternary search
// Time complexity is O(Log3n) space is O(1)
class Tenary_Search_Iterative {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,111,113,115};

		int key =11;

		int low = 0;
		int high = a.length - 1;

		int k = ternary_search(a, low, high, key);
		System.out.println("Element found at index "+k);
	}

	private static int ternary_search(int[] a, int low, int high, int key) {

		while (low <= high) {

			int mid1 = low + (high - low) /3;
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

			if (key > a[mid1] && key < a[mid2]) {
				high = mid2 - 1;
				low = mid1 + 1;
			}
		}
		return -1;

	}
}
