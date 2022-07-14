
public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("hi");
		int a[]= {7,6,5,4,3,2,1};
		
		for(int i=1;i<a.length;i++) {
			int temp=a[i];
			int j=i-1;
			while(j>=0) {
				if(temp<a[j]) {
					a[j+1]=a[j];
				
				}
				j--;
			}
			
			a[j+1]=temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
