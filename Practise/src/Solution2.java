
public class Solution2 {
	public static void main(String[] args) {

		int nums[] = { 3, 3,2,2,3 };
		int val = 3;
		int removeElement = removeElement(nums, val);
		System.out.println("k is " + removeElement);
	}


	public static int removeElement(int[] nums, int val) {
	
		  /*  int i = 0;
		    int n = nums.length;
		    while (i < n) {
		        if (nums[i] == val) {
		            nums[i] = nums[n - 1];
		            // reduce array size by one
		            n--;
		        } else {
		            i++;
		        }
		    }
		    for(int a: nums) {
		    	System.out.println(a);
		    }
		    return n;*/
		  int i = 0;
	        for (int elem: nums){
	            if (elem != val){
	                nums[i] = elem;                
	                i++;
	            }
	        }
	        for(int a: nums) {
		    	System.out.println(a);
		    }
	        return i;
	        
	}

}

/*class Solution {
    public int removeElement(int[] nums, int val) {
       int i = 0;
		while (i < nums.length - 1) {
			int k = i + 1;
			if (val == nums[i]) {
				while (nums[i] == nums[k]) {
					if (k == nums.length - 1) {
						break;
					}
					k++;
				}
				nums[i]=nums[i]+nums[k];
				nums[k]=nums[i]-nums[k];
				nums[i]=nums[i]-nums[k];
			}

			i++;
		}
		
		int c = 1;
		for (int d = 0; d < nums.length; d++) {
			if (val == nums[d]) {
				c = d;
				break;
			} else {
				c = nums.length;
			}
		}
		return c;
        
    }
} */
