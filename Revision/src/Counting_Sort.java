
public class Counting_Sort {

	
	public static void main(String[] args) {
		int a[]= {4,3,4,3,1,6,5,4,3,2,1,0};
		
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		int temp[]=new int[max+1];
		for(int i=0;i<temp.length;i++) {
			temp[i]=0;
		}
		
		
		for(int i=0;i<a.length;i++) {
			
			temp[a[i]]++;
		}
		int k=0;
		int i=0;
		while(i<temp.length){
			if(temp[i]>0) {
				a[k++]=i;
				temp[i]--;
			}else {
				i++;
			}
		}
		for(int p=0;p<a.length;p++) {
			System.out.println(a[p]);
		}
	}
}
