package Arrays_Strings;

public class MinimumInRotatedSortedArray {
	private static void display(int[] arr,int l,int r) {
		for(int i=l; i<=r;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		
	}
	
	public static int findMin(int[] arr) {
        int low=0;
		int high=arr.length-1;
		display(arr, low, high);
		 while(low < high) 
			 
		    { 
		        int mid = low + (high - low)/2; 
		        
		        if(mid>low &&arr[mid-1]>arr[mid]) {
		        	return arr[mid];
		        }
		        if(mid <high && arr[mid]>arr[mid+1]) {
		        	return arr[mid+1];
		        }
		        if(arr[mid]<arr[high]) {
		        	high=mid-1;
		        }
		        if(arr[low]<arr[mid]) {
		        	low=mid+1;
		        }
	        display(arr, low, high);
		    } 
		 if(low==high) {
			 return arr[low];
		 }
		    return arr[0];
    }
//	public static int findMin(int[] arr) {
//        int low=0;
//		int high=arr.length-1;
//		 while(low < high) 
//		    { 
//		        int mid = l1ow + (high - low)/2; 
//		        if (arr[mid] == arr[high]) 
//		            high--; 
//		        else if(arr[mid] > arr[high]) 
//		            low = mid + 1; 
//		        else
//		            high = mid; 
//		    } 
//		    return arr[high];
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,5,6,7,8,1,2,3};
		System.out.println(findMin(arr));

	}

}
