package EasyWarmUp;

import java.util.Scanner;
//https://leetcode.com/problems/power-of-four/
public class PowerOf4 {
	public static boolean isPowerOf4(int num) {
		if(num<1) {
			return false;
		}
		int right_set_bit= num & ~(num-1);
		if(num!=right_set_bit) {
			return false;
		}
		while( right_set_bit>0) {
			if(right_set_bit==1) {
				return true;
			}
			right_set_bit=right_set_bit>>2;
			
		}
	
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isPowerOf4(num));
		
		

	}

}
