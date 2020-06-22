package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/two-sum/
public class TwoSum {
	public static int[] targetSum2_sol1(int[] nums, int target) {      // time complexity O(n*n)
	    for(int i=0; i<nums.length; i++){
            int comp=target-nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==comp){
                    return new int[] {i,j};
                }
            }
        }
    return new int[]{-1,-1};   
    
	}

	
	public static int[] targetSum2_sol2(int[] nums, int target) {      // time complexity O(n)
		
		Map<Integer, Integer> value_to_index=new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			int compliment=target-nums[i];
			if(value_to_index.containsKey(compliment)) {
				return new int[] {value_to_index.get(compliment) , i};
			}
			value_to_index.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("NO MATCH FOUND");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,7,5,9,2,1,11};
		
		int res[]= targetSum2_sol2(arr, 10);
		
		System.out.println("First Index "+res[0]);
		System.out.println("Second Index "+res[1]);

	}

}
