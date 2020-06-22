package EasyWarmUp;

import java.util.Scanner;
//https://leetcode.com/problems/power-of-two/
public class PowerOf2 {
	//   if ( (num) AND (num-1) ) ==0   then yes, num is power of two else NO
	
	public static boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n<1){
            return false;
        }
        if((n&(n-1))==0){
        return true; 
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isPowerOfTwo(num) );
		
	}
	
}
