package Arrays_Strings;

public class MaximumProductSubarray {
	public static int max(int a,int b) {
		return a>b?a:b;
	}
	public static int min(int a,int b) {
		return a<b?a:b;
	}
	
	/*
	 * positive * positive = positive   
	 * negative * negative = positive
	 * */
	public static int maxProduct_pos_answer(int[] nums) {  // will return a positive maximum product if possible else return 0
		int max_current=1;  // max_current>=1
		int min_current=1;	// min_current<=1
		
		int flag=0;
		
		int max_product=1;
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]>0) {   // current num is positive
				
				flag=1;
				
				//large positive * positive  -> max_currrent * nums[i]   -> large positive (max_current)
				max_current *= nums[i];
				
				
				//large negative * positive  -> min_currrent * nums[i]   -> large negative (min_current)
				min_current=min( min_current* nums[i] , 1);
								
				
			}else if(nums[i]==0) { //current num is zero
				//restart calculating  max_current and min_current
				max_current=1;
				min_current=1;
				
			}else {    //current num is negative
				
				int temp= max_current;    
				
				//large negative *negative  ->  min_current * nums[i]  ->  can give us max_current if min_current<0
				max_current=max(1, min_current*nums[i]);    
				
				//large positive *negative  -> max_currrent * nums[i]   -> large negative (min_current)
				min_current = temp * nums[i];               
				
			}
			max_product =max(max_current,max_product);
		}
		
		if(flag==1 && max_product==1) {
			return 0;
		}
				
		return max_product;
	}
	
	
	public static int maxProduct(int[] nums) {  // maximum product can be positive, negative or zero
		int max_current=1;  // max_current>=1
		int min_current=1;	// min_current<=1
		
		
		int max_product=Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]>0) {   // current num is positive
				
				//large positive * positive  -> max_currrent * nums[i]   -> large positive (max_current)
				max_current *= nums[i];
				
				//large negative * positive  -> min_currrent * nums[i]   -> large negative (min_current)
				min_current=min( min_current* nums[i] , 1);
								
				
			}else if(nums[i]==0) { //current num is zero
				//restart calculating  max_current and min_current
				max_current=0;
				min_current=1;
				
			}else {    //current num is negative
				
				int temp_max= max_current;    
				
				//large negative *negative  ->  min_current * nums[i]  ->  can give us max_current if min_current<0
				max_current= min_current*nums[i];    
				
				//large positive *negative  -> max_currrent * nums[i]   -> large negative (min_current)
				min_current = temp_max * nums[i];               
				
			}
			max_product =max(max_current,max_product);
			
			max_current=max(1,max_current);
		}
		
				
		return max_product;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0};
		System.out.println("Max Product Subarray : "+maxProduct(nums));

	}

}
