/*
 * Time Complexity is O(Logn) space complexity=O(1);
 */
public class Exponential_Search {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5,7,8,9,11,14,15,16};
		
		int key=0;
		int low=0;
		int high=a.length-1;
		int k=exp_Search(a,low,high,key);
		System.out.println(k);
		
	}

	private static int exp_Search(int[] a, int low, int high, int key) {

		if(a[0]==key) {
			return 0;
		}
		
		int i=1;
		
		while(i<a.length&&a[i]<=key) {
			i*=2;
		}
		
		return bin_Search(a,i/2,Math.min(a.length-1, i),key);
		
		
		
	}

	private static int bin_Search(int[] a, int i, int min, int key) {
		
		int low=i;
		int high=min;
		while(low<=high) {
			int mid=(low+high)/2;
			if(key==a[mid]) {
				return mid;
			}
			
			if(key>a[mid]) {
				low=mid+1;
			}
			if(key<a[mid]) {
				high=mid-1;
			}
		}
		return -1;
	}
}
