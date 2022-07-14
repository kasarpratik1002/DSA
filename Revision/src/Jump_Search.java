
public class Jump_Search {

	public static void main(String[] args) {
		int a[]= {3,4,5,6,7,8,9,11,12,14,15,16};
		
		int key=11;
		int low=0;
		int high=a.length-1;
		
		int p=jump_search(a,low,high,key);
		System.out.println(p);
	}

	private static int jump_search(int[] a, int low, int high, int key) {
		
		
		int n=a.length;
		int m=(int )Math.floor(Math.sqrt(n));
		//System.out.println(m);
		int p=0;
		for(int i=0;i<n;i+=m) {
			
			if(key==a[i]) {
				return i;
			}
			if(key<a[i]) {
				p=i-(m-1);
				break;
			}
			if(key>a[i]) {
				p=i;
			}
			
		}
		
		//Linear search from p
		
		for(int i=p;i<p+m;i++) {
			if(a[i]==key) {
				return i;
				
			}
		}
		return -1;
	}
	
	
}
