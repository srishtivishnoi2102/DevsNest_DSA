package EasyWarmUp;
//https://leetcode.com/problems/reverse-bits/
public class ReverseBits {
	public static int reverse_bits(int n) {
        int result=0;
        for(int i=0; i<32; i++) {
        	result= result<<1;
        	result =result + (n&1);
        	n = n>>>1;   // logical right shift operator
        	
        }
        return result;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse_bits(-3));

	}

}

