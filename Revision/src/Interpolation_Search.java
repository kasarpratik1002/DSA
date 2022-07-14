
public class Interpolation_Search {

	public static void main(String[] args) {
		int a[] = { 2,4,6,8,10 };

		int key = 6;
		int low = 0;
		int high = a.length - 1;

		int p = interpolation_search(a, low, high, key);
		System.out.println(p);
	}

	private static int interpolation_search(int[] a, int low, int high, int key) {

		while(low<=high) {

			int pos = low + ((key - a[low]) * (high - low) / (a[high] - a[low]));

			if (a[pos] == key) {
				return pos;
			}
			if (key < a[pos]) {
				return interpolation_search(a, low, pos - 1, key);
			}
			
			if(key>a[pos]) {
				return interpolation_search(a, pos+1, high, key);
			}
		}
		
		return -1;
	}
}
