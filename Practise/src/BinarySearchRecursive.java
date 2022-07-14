import java.util.Scanner;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a[] = { 1, 2, 3, 4, 5, 14, 15, 16, 17, 19, 20 };

		System.out.println("Enter the key to be searched");

		int key = in.nextInt();

		int low = 0;
		int high = a.length - 1;
		int bin_Search = bin_Search(a, low, high, key);
		System.out.println(bin_Search);
	}

	private static int bin_Search(int[] a, int low, int high, int key) {

		if (a.length == 1 && a[0] != key) {
			return -1;
		}

		int mid = (low + high) / 2;

		if (low <= high) {

			if (key == a[mid]) {
				return mid;
			}
			if (key > a[mid]) {
				return bin_Search(a, mid + 1, high, key);
			}
			return bin_Search(a, low, mid - 1, key);

		}

		return -1;

	}
}
