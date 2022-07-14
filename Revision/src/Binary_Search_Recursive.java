
public class Binary_Search_Recursive {

	
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9,10};
		
		int low=0;
		int high=a.length-1;
		int key=10;
		int p=bin_search(a,low,high,key);
		System.out.println(p);
	}

	private static int bin_search(int[] a, int low, int high, int key) {

		
		if(low<=high) {
			
			int mid=low+(high-low)/2;
			if(key==a[mid]) {
				return mid;
			}
			if(key>a[mid]) {
				return bin_search(a, mid+1, high, key);
			}
			if(key<a[mid]) {
				return bin_search(a, low, mid-1, key);
			}
		}
		
		
		return -1;
	}
}
