package six.recursion;

import java.util.Arrays;

public class SelectionSortString {

	public static void main(String[] args) {

//		int[] nums = { 16, 35, 7, 1, -4, 36, 49 };
//		int[] nums = {-2,45,0,11,-9};
//		int[] nums = {4,5,3,2,8};
		String[] string = {"abdu","bar","sobah","zed", "aklil","edwin"};

		System.out.println(Arrays.toString(string));
		//implement
		sort(string, string.length-1);
		
/*		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if (nums[j]<nums[i]) {
					int temp =nums[j];
					nums[j]=nums[i];
					nums[i]=temp;
				}
			}
			
			System.out.println(Arrays.toString(nums));
			
				

	}*/

}

	private static void sort(String[] string, int n) {
		
		String max=string[0];
		for(int i=0; i<n;i++) {
			if(string[i].compareTo(max)>0) {
				String temp=max;
				max=string[i];
				string[i]=temp;
				
			}
			
		}sort(string,n-1);
		
		System.out.println(Arrays.toString(string));
	}
}
