/*
 * Time complexity is O(sqrt(n)) and Space complexity is O(1)
 */
public class JumpSearch {

	public static void main(String[] args) {

		
		int a[]= {1,2,3,4,5,6,7,12,13,14,15,16,17,18,19,20};
		int n=a.length;
		int low=0;
		
		int key=15;
		int k=jump_Search(a,n,low,key);
		System.out.println(k);
	}

	private static int jump_Search(int[] a, int n, int low, int key) {

		if(n==1&&a[0]!=key) {
			return -1;
		}
		int m=(int)Math.floor(Math.sqrt(n));
		System.out.println(m);
		
		for(int i=0;i<n;i+=m) {
			if(a[i]==key) {
				return i;
			}
			if(a[i]<key) {
				low=i;
			}
			if(a[i]>key) {
				low=i-m;
			}
		}
		for(int i=low+1;i<n;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		
		return -1;
	}
}
