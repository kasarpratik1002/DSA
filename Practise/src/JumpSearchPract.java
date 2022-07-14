
public class JumpSearchPract {

	
	
	public static void main(String[] args) {
	
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int key=9;
		System.out.println(jump_search(a,key,a.length));
	}

	private static int jump_search(int[] a, int key, int length) {
		int m=(int)Math.floor(Math.sqrt(length));
		int low=0;
		int start=0;
		while(low<length) {
			
			if(a[low]==key) {
				return low;
				
			}
			if(a[low]>key) {
				start=low-(m-1);
				break;
			}
			if(a[low]<key) {
				start=low;
			}
			low+=m;
			
		}
		for(int i=start;i<start+m;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		
		
		
		return -1;
		
	}
}
