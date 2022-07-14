import java.util.Scanner;

class RotatedBinarySearchLeetcode {
    public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
		// search for the index of the smallest element 
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        int start = left;
        left = 0;
        right = nums.length - 1;
        // minimize the searching range
        if(nums[start] <= target && target <= nums[right]){
            left = start;
        }else{
            right = start;
        }
        //search for the target
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    	int nums[]=new int[6];
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter the elements in array");
    	for(int i=0;i<nums.length;i++) {
    		nums[i]=in.nextInt();
    	}
    	System.out.println(search(nums,0));
    	in.close();
	}
}