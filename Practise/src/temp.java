
public class temp {

	
	 private static int[] findTwoSum_BruteForce(int k, int target) {
	        for (int i = 1; i <=k; i++) {
	            for (int j = i + 1; j <=k; j++) {
	                if (i + j == target) {
	                    return new int[] { i, j };
	                }
	            }
	        }
	        return new int[] {};
	    }
	public static void main(String[] args) {
		int[] findTwoSum_BruteForce = findTwoSum_BruteForce(2,5);
		for(int i:findTwoSum_BruteForce) {
			System.out.println(i);
		}
		System.out.println();
	}
}
