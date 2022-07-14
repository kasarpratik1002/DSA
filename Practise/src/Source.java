import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		in.nextLine();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
	
		int x=in.nextInt();
		in.nextLine();
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>x) {
				count++;
			}
		}
		
		double prob=(double)count/(double)a.length;
		System.out.println(prob);
	}
}
