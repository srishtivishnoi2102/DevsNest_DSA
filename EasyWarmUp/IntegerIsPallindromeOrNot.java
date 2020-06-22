package EasyWarmUp;
//https://leetcode.com/problems/palindrome-number/
import java.util.Scanner;

public class IntegerIsPallindromeOrNot {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev=0;
        while(x>rev){
            rev=rev*10 + x%10;
            x=x/10;
        }
        if(rev==x || x==rev/10 ){
            return true;
        }
        return false;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(isPalindrome(num));
		sc.close();

	}

}
