import java.util.Scanner;
/*
 * 
 * Time complexity is O(Logn) and Space Complexity is O(1)
 */
public class BinarySearchIterative {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 12, 14, 15, 16, 17, 18 };
		System.out.println("Enter the key to be searched");
		int key = in.nextInt();

		int low = 0;
		int high = arr.length - 1;

		int bin_search = bin_search(arr, key, low, high);
		System.out.println(bin_search);
		in.close();
	}

	private static int bin_search(int[] arr, int key, int low, int high) {
		if (arr.length == 1 && arr[0] != key) {
			System.out.println("Element not found");
			return -1;
		}

		while (low <= high) {

			int mid = (low + high) / 2;

			if (key == arr[mid]) {
				return mid;
			}
			if (key > arr[mid]) {
				low = mid + 1;
			}
			if (key < arr[mid]) {
				high = mid - 1;
			}
		}

		return -1;
	}
}
