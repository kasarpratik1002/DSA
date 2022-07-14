
public class Ternary_Search_recursive {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 12, 13, 14, 15, 16, 17 };
		int key = 124;
		int low = 0;
		int high = a.length - 1;

		int k = ternary_search(a, low, high, key);
		System.out.println(k);
	}

	private static int ternary_search(int[] a, int low, int high, int key) {

		if (low <= high) {

			int mid1 = low + (high - low) / 3;
			int mid2 = high - (high - low) / 3;

			if (key == a[mid1]) {
				return mid1;

			}
			if (key == a[mid2]) {
				return mid2;

			}

			if (key < a[mid1]) {
				return ternary_search(a, low, mid1 - 1, key);
			}

			if (key > a[mid2]) {
				return ternary_search(a, mid2 + 1, high, key);

			}

			if (key > a[mid1] && key < a[mid2]) {
				return ternary_search(a, mid1 + 1, mid2 - 1, key);
			}

		}

		return -1;
	}
}
