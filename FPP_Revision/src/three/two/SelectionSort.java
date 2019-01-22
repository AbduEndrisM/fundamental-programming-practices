package three.two;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

//		int[] nums = { 16, 35, 7, 1, -4, 36, 49 };
//		int[] nums = {-2,45,0,11,-9};
		int[] nums = {4,5,3,2,8};

		System.out.println(Arrays.toString(nums));
		//implement
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if (nums[j]<nums[i]) {
					int temp =nums[j];
					nums[j]=nums[i];
					nums[i]=temp;
				}
			}
			
			System.out.println(Arrays.toString(nums));
			
				

	}

}
}
