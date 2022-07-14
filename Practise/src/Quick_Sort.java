
public class Quick_Sort {

	public static void main(String[] args) {
		
		int a[]= {54,3,2,8,4,9};
		
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
			quick_Sort(a, low, p-1);
			quick_Sort(a, p+1, high);
		}
		
	}

	private static int partition(int[] a, int low, int high) {

		
		int i=low-1;
		int pivot=high;
		for(int j=low;j<high;j++) {
			
			if(a[j]<a[pivot]) {
				i++;
				// Adding this condition to avoid unnecessary swaps if i and j are same then it
				// will swap the same index which is not required
				if(i!=j) {
					swap(a, i, j);
				}
				
			}
		}
		
		if(pivot!=i+1) {
			swap(a,i+1,pivot);
		}
		
		return i+1;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
