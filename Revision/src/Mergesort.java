
public class Mergesort {
	
	public static void main(String[] args) {
		
		int a[]= {10,12,4,3,2,1};
		
		int low=0;
		int high=a.length-1;
		
		divide(a,low,high);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	private static void divide(int[] a, int low, int high) {

		
		if(low<high) {
			
			int mid=low+(high-low)/2;
			divide(a,low,mid);
			divide(a,mid+1,high);
			conquer(a,low,mid,high);
			
			
		}
	}

	private static void conquer(int[] a, int low, int mid, int high) {

		
		int merged[]=new int[high-low+1];
		
		int i=low;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=high) {
			
			if(a[i]<a[j]) {
				merged[k++]=a[i++];
			}
			else {
				merged[k++]=a[j++];
			}
		}
		
		while(i<=mid) {
			merged[k++]=a[i++];
		}
		while(j<=high) {
			merged[k++]=a[j++];
		}
		
		for(int p=0,q=low;p<merged.length;p++,q++) {
			
			a[q]=merged[p];
		}
		
		
		
		
	}

}
