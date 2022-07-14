
public class Series {

	public static void main(String[] args) {
		
		int n=5;
		int d=2;
		int x=0;
		for(int i=0;i<n+d;i++) {
			
			System.out.print(n +" ");
			 n=Math.abs(n-d);
			/*if(n<0) {
				System.out.println(n+ " ");
				n=n+d;
				
				//continue;
			}*/
		}
	}
}
