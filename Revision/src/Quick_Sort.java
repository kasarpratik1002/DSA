
public class Quick_Sort {

	public static void main(String[] args) {
		
		int a[]= {6,5,4,3,2,1};
		
		int low=0;
		int high=a.length-1;
		
		quick_sort(a,low,high);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	private static void quick_sort(int[] a, int low, int high) {

		
		if(low<high) {
			int p=partition(a,low,high);
			quick_sort(a, low, p-1);
			quick_sort(a, p+1, high);
		}
		
	}

	private static int partition(int[] a, int low, int high) {

		
		int pivot=high;
		int i=low-1;
		for(int j=low;j<high;j++) {
			
			if(a[j]<a[pivot]) {
				i++;
				if(i!=j) {
					swap(a, i, j);
				}
			}
		}
		
		if(pivot!=i+1) {
			int temp=a[pivot];
			a[pivot]=a[i+1];
			a[i+1]=temp;
		}
		return i+1;
	}

	private static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
