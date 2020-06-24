package Arrays_Strings;
//https://leetcode.com/problems/maximum-subarray/
public class MaximumSumSubarray {
	public static int max(int a,int b) {  //helper method to calculate maximum
		return a>b?a:b;
	}
	
	public static int kadanes_algorithm(int[] nums) {
		int max_so_far=nums[0];
		int max_current=nums[0];
		
		for(int i=1; i<nums.length; i++) {
			int temp= max_current + nums[i];
			max_current = nums[i] > temp ? nums[i] : temp;
			max_so_far =max_so_far > max_current ? max_so_far : max_current;
		}
		
		return max_so_far;
	}
	
	public static void main(String[] args) {
		int[] nums= {-2,1};
		System.out.println(kadanes_algorithm(nums));
		
	}

}
