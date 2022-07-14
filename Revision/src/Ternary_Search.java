
public class Ternary_Search {

	
	public static void main(String[] args) {
		
		int a[]= {3,4,5,6,7,8,9,11,12,14,15,16};
		
		int key=311;
		int low=0;
		int high=a.length-1;
		
		int p=ternary_search(a,low,high,key);
		System.out.println(p);
	}

	private static int ternary_search(int[] a, int low, int high, int key) {

		
		
		while(low<=high) {
			int m1=low+(high-low)/3;
			int m2=high-(high-low)/3;
			
			if(a[m1]==key) {
				return m1;
			}
			if(a[m2]==key) {
				return m2;
				
			}
			
			if(key<a[m1]) {
				high=m1-1;
			}
			if(key>a[m2]) {
				low=m2+1;
			}
			if(key>a[m1]&&key<a[m2]) {
				high=m2-1;
				low=m1+1;
			}
			
		}
		
		return -1;
	}
}
