package Arrays_Strings;
//https://leetcode.com/problems/product-of-array-except-self/
//Note: Please solve it without division and in O(n).

public class ProductOfArrayExceptSelf {
	public static void display(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println("");
		
	}
	
	public static int[] approach2_using_leftRightProductList(int[] arr) {    //complexity O(n)
		int[] leftList=new int[arr.length];
		int[] rightList=new int[arr.length];
		int[] result=new int[arr.length];
		
		leftList[0]=1;
		for(int i=1;i<leftList.length; i++) {
			leftList[i]=leftList[i-1]*arr[i-1];
		}
//		display(leftList);
		rightList[rightList.length-1]=1;
		for(int i=rightList.length-2;i>=0; i--) {
			rightList[i]=rightList[i+1]*arr[i+1];
		}
//		display(rightList);
		
		for(int i=0;i<result.length;i++) {
			result[i]=leftList[i]*rightList[i];
		}
//		display(result);
		return result;
		
	}
	public static int[] approach1_using_division(int[] arr) {    //complexity O(n)
		int temp_pro=1;
		for(int i=0;i<arr.length;i++) {
			temp_pro*=arr[i];
		}
		
		int res[]= new int[arr.length]; ;
		for(int i=0;i<arr.length;i++) {
			res[i]= temp_pro/arr[i];
		}
		return res;
	}
	public static int[] approach3_constant_space(int[] nums) {

        int length = nums.length;        // The length of the input array 

        int[] result = new int[length];        // Final answer array to be returned

        // result[i] contains the product of all the elements to the left
        result[0] = 1;
        for (int i = 1; i < length; i++) {
        	result[i] = nums[i - 1] * result[i - 1];
        }
        // R contains the product of all the elements to the right
        // Note: for the element at index 'length - 1', there are no elements to the right, so the R would be 1
        int R = 1;
        for (int i = length - 1; i >= 0; i--) {
        	result[i] = result[i] * R;
            R *= nums[i];
        }

        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.println("Actual Array : ");
		display(arr);
//		System.out.println("using approach1_using_division : ");
//		display(approach1_using_division(arr));
//		System.out.println("using approach2_using_leftRightProductList : ");
//		display(approach2_using_leftRightProductList(arr));
		System.out.println("using approach3_constant_space : ");
		display(approach3_constant_space(arr));

	}

}
