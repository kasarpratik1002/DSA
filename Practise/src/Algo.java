

public class Algo {

	public static void main(String[] args) {
		int n=100;
		int count=0;
		for(int i=1;i<=n;i++) {
			for( i=1;i<=n;i++) {
				for(i=0;i<n;i++) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
