package Arrays_Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParanthesis {
	
	public static boolean isValid(String str) {
		Map<Character, Character> bracket_map=new HashMap<Character, Character>();
		bracket_map.put(')', '(');
		bracket_map.put(']', '[');
		bracket_map.put('}', '{');
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char temp_ch=str.charAt(i);
			if(bracket_map.containsKey(temp_ch)) {  //if temp is the closing bracket
				char top_element=stack.empty() ? '$' : stack.pop();
				if(top_element!=bracket_map.get(temp_ch)) {
					return false;
				}
				
			}
			else {
				stack.push(temp_ch);
			}
			
			
			
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input string : ");
		String input_string=sc.nextLine();
		System.out.println(isValid(input_string));
		
		
		
		
		
		

	}

}
