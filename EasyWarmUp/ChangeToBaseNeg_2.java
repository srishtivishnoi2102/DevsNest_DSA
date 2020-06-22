package EasyWarmUp;

import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/convert-to-base-2/
//
//num=46;
//32  8   4     2
//
//
//
//64
//-32
//16
//-8
//4
//-2
//1
public class ChangeToBaseNeg_2 {
	public static String baseNeg2(int num, int base) {
		if(num<=0) {
			return "0";
		}
		int rem=0;
		String result="";
		while(num!=0) {
			rem = num % base;
			num = num / base;
			
			if(rem<0) {
				rem=rem-base;
				num=num+1;
			}			
			result=String.valueOf(rem)+result;
			
		}
		
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println("Number in base -2, "+baseNeg2(num,-2));
	}

}
