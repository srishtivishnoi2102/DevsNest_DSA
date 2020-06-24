package Arrays_Strings;

import java.util.Arrays;
import java.util.Scanner;

//You may assume the string contains only lowercase alphabets.
//https://leetcode.com/problems/valid-anagram/

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
    	int[] char_count_s=new int[26];
    	int[] char_count_t=new int[26];
    	for(int i=0; i<s.length(); i++) {
    		if(Character.isAlphabetic(s.charAt(i)))
    			char_count_s[s.charAt(i)-'a']+=1;
    	}
    	for(int i=0; i<t.length(); i++) {
    		
    		if(Character.isAlphabetic(t.charAt(i)))
    			char_count_t[t.charAt(i)-'a']+=1;
    	}
    	return Arrays.equals(char_count_s, char_count_t);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String 1: ");
		String s=sc.nextLine();
		System.out.println("Enter the String 2: ");
		String t=sc.nextLine();
		System.out.println(isAnagram(s, t));

	}

}
