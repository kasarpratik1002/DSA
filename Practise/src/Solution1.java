
public class Solution1 {
	public static void main(String[] args) {
		
		int nums[]= {0,1,2,2,3,0,4,2};
		int val=2;
		int removeElement = removeElement(nums,  val);
		System.out.println("k is "+removeElement);
	}
	
	 public static int removeElement(int[] nums, int val) {
	       int i=0;
	       while(i<nums.length-1) {
	    	   int k=i+1;
	    	   if(val==nums[i]) {
	    		   while(nums[i]==nums[k]) {
	    			   if(k!=nums.length-1) {
	    				   k++;
	    			   }else {
	    				   break;
	    			   }
		    		  
		    	   }
	    		   int temp=nums[i];
		    	   nums[i]=nums[k];
		    	   nums[k]=temp;
	    	   }
	    	   
	    	   i++;
	       }
	       for(int x: nums) {
	    	   System.out.println(x);   
	       }
	      
	       int p=0;
	       int count=0;
	       while(val!=nums[p]) {
	    	   
	    	   count++;
	    	   p++;
	       }
	      
	     return count;   
	    }
}