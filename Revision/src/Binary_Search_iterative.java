
public class Binary_Search_iterative {

	
	public static void main(String[] args) {
		int a[]= {2,3,4,12,14,15,16,17,18,19};
		int low=0;
		int high=a.length-1;
		int key=19;
		int index=bin_Search(a,low,high,key);
		System.out.println(index);
	}

	private static int bin_Search(int[] a, int low, int high, int key) {

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
