class Solution {
	
	public static void main(String[] args) {
		int nums[]= {1,1};
		int removeDuplicates = removeDuplicates( nums);
		System.out.println("position is "+removeDuplicates);
	}
    public static int removeDuplicates(int[] nums) {
        int i=0;
        int pos=1;
        while(i<nums.length-1){
                int p=i;
                int k=i+1;
            while(nums[p]==nums[k]){
            	 k++;
            	if(k==nums.length) {
            		return pos;
            	}
               
              
            }
            nums[pos++]=nums[k];
            i=k;
        }
        
        for(int c:nums) {
        	System.out.println(c);
        }
        
        return pos;
    }
}

////Input: nums = [0,0,1,1,1,2,2,3,3,4]
////Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]