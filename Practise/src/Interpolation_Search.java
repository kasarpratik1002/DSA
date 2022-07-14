
public class Interpolation_Search {

	
	public static void main(String[] args) {
		int a[]= {1,3,5,7,9,11,13,15,17};
		int key=13;
		int low = 0;
		int high = a.length - 1;
		System.out.println(interpolation_Search(a,key,low,high));
	}

	private static int interpolation_Search(int[] a, int key, int low, int high) {
	
		
		
		while(low<=high) {
			//need to revisit
			int pos=(int )low+key-a[low]*((int)Math.floor((high-low)/a[high]-a[low]));
			
			if(a[pos]==key) {
				return pos;
			}
			
		}
		
		return -1;
		
	}
}
