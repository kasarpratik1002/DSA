
public class Bubblesort {

	
	public static void main(String[] args) {
		int a[]= {5,3,2,1,0,7,8};
		
		for(int i=0;i<a.length-1;i++) {
			boolean swapped=false;
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
