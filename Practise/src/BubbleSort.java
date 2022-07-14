
public class BubbleSort {

	
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5};
		int n=a.length;
		int temp;
		// n=7 0,1,2,3,4,5 i.e 6 passes
		for(int i=0;i<n-1;i++) {
			boolean swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				System.out.println("no swapped");
				break;
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}
}
