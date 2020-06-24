package Arrays_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
//https://leetcode.com/problems/group-anagrams/
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> result = new HashMap<String, List<String>>();
		int[] char_count=new int[26];
		Arrays.sort(strs);
		for(String word:strs) {
			Arrays.fill(char_count, 0);
	    	for(char ch:word.toCharArray()){
    			char_count[ch-'a']+=1;
	    	}

            StringBuilder sb = new StringBuilder("");
            for (int count:char_count) {
                sb.append('$');
                sb.append(count);
            }
            String key_temp = sb.toString();
	    	
	    	if(!result.containsKey(key_temp)) {
	    		result.put(key_temp, new ArrayList<String>());
	    	}
    		result.get(key_temp).add(word);

			
			
		}
		
        return new ArrayList(result.values());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs= {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> results = groupAnagrams(strs);
		for(int i=0;i<results.size();i++){
			List<String> list=results.get(i);
			System.out.print("[");
			for(int j=0;j<list.size();j++) {
				System.out.print(list.get(j)+",");
			}
			
		    System.out.println("],");
		} 

	}

}
