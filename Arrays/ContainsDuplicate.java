package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] arr) {
		Map<Integer, Integer> tempMap=new HashMap<Integer, Integer>();

		for(int i=0; i<arr.length; i++) {
			if(tempMap.containsKey(arr[i])) {
				return true;
			}
			tempMap.put(arr[i], arr[i]);
			
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,7,5,9,2,1,4,11};
		System.out.println(containsDuplicate(arr));		

	}

}
