package six.recursion;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

//		int[] nums = { 16, 35, 7, 1, -4, 36, 49 };
//		int[] nums = {-2,45,0,11,-9};
		int[] nums = {4,5,3,2,8};

		System.out.println(Arrays.toString(nums));
		//implement
		sort(nums, nums.length-1);
		 

}

	private static void sort(int[] nums, int n) {
		
		int max=nums[0];
		if(n==0)
			return ;
		for(int i=0; i<n;i++) {
			if(nums[i]>max) {
				int temp=max;
				max=nums[i];
				nums[i]=temp;
				
			}
			
		}sort(nums,n-1);
		
		System.out.println(Arrays.toString(nums));
	}
}
