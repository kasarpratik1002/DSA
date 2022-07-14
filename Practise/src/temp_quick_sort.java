
public class temp_quick_sort {

	
	public static void main(String[] args) {
		
		
		int a[]= {9,4,3,2,1,7,8};
		int low=0;
		int high=a.length-1;
		
		quick_Sort(a,low,high);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	private static void quick_Sort(int[] a, int low, int high) {
		
		
		if(low<high) {
			
			int p=partition(a,low,high);
			quick_Sort(a,low,p-1);
			quick_Sort(a,p+1,high);
			
		}
		
	}

	private static int partition(int[] a, int low, int high) {

		
		int i=low-1;
		int pivot=high;
		
		for(int j=low;j<high;j++) {
			if(a[j]<a[pivot]) {
				i++;
				if(i!=j) {
					swap(a, i, j);
				}
			}
		}
		if(i+1!=pivot) {
			swap(a,i+1,pivot);
		}
		
		return i+1;
	}

	private static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
