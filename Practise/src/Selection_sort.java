
public class Selection_sort {

	
	public static void main(String[] args) {
		int a[]= {8,7,6,5,43,2};
		
		int n=a.length;
		//n-1 passes
		for(int i=0;i<n-1;i++) {
			
			int min=i;
			//find any min 
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			
			//if i is the minimum then no swapping required
			if(min!=i) {
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
		
		
		for(int i =0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
}
