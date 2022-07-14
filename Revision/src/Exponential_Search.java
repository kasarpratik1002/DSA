
public class Exponential_Search {
	public static void main(String[] args) {
		int a[] = { 2,4,6,8,10 };

		int key = 6;
		int low = 0;
		int high = a.length - 1;

		int p = exponential_Search(a, low, high, key);
		System.out.println(p);
	}

	private static int exponential_Search(int[] a, int low, int high, int key) {
		
		if(a[0]==key) {
			return 0;
		}
		int i=1;
		while(i<a.length&&a[i]<=key) {
			
			i=i*2;
		}
		return bin_search(a,i/2,Math.min(a.length, i),key);
		
		
	}

	 static int  bin_search(int[] a, int low, int high, int key) {
			while(low<=high) {
				
				int mid=low+(high-low)/2;
				if(a[mid]==key) {
					return mid;
				}
				if(a[mid]>key) {
					high=mid-1;
				}
				if(a[mid]<key) {
					low=mid+1;
				}
			}
		return -1;
	}
}
