package Arrays_Strings;

public class SearchInRotatedArray {
	
	public static int search(int[] nums, int target) {
		int left=0;
		int right=nums.length-1;
		int mid;
		while(left<=right) {
			mid=(left+right)/2;
			if(nums[mid]==target) {
				return mid;
			}else if(nums[left]<=nums[mid]) { // increasing subarray
				if(nums[left]<=target && target<=nums[mid]) {
					right=mid-1;
				}else {
					left=mid+1;
				}
			}else if(nums[mid]<=nums[right]) {
				if(nums[mid]<=target && target<=nums[right]) {
					left=mid+1;
				}else {
					right=mid-1;
				}
				
			}
		}
			
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,5,6,7,0,1,2};
		System.out.println("index: "+search(arr, 3));

	}

}
