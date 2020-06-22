package EasyWarmUp;

import java.util.Scanner;
//https://leetcode.com/problems/add-strings/
//	42357
//	00294
//''''''''''
//	4254  	
public class AddingIntegerString {
	public static String addIntegerString(String s1,String s2) {
		String result="";
		int r1=s1.length()-1;
		int r2=s2.length()-1;
		int carry=0;
		int temp1;
		int temp2;
		int tempsum;
		while(r1>=0 && r2>=0) {
			temp1= (int)(s1.charAt(r1) -'0');
			temp2= (int)(s2.charAt(r2) -'0');
			tempsum=temp1+temp2+carry;
			carry=tempsum/10;
			result=String.valueOf(tempsum%10)+result;
			r1-=1;
			r2-=1;
		}
		
		while(r1>=0) {
			temp1= (int)(s1.charAt(r1) -'0');
			tempsum=temp1+carry;
			carry=tempsum/10;
			result=String.valueOf(tempsum%10)+result;
			r1-=1;
		}
		while(r2>=0) {
			temp2= (int)(s2.charAt(r2) -'0');
			tempsum=temp2+carry;
			carry=tempsum/10;
			result=String.valueOf(tempsum%10)+result;
			r2-=1;			
		}
		if(carry>0){
            result=String.valueOf(carry)+result;
        }
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		String num1=sc.nextLine();
		System.out.print("Enter Second Number: ");
		String num2=sc.nextLine();
		System.out.println("Sum of "+num1+" and "+num2+" is : "+addIntegerString(num1,num2));

	}

}
