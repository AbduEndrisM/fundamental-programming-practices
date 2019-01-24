package three.three;

public class Minimum {

	public static void main(String[] args) {
		int[] nums = {3,6,2,7,4};
		int min=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min)
				min=nums[i];
		}
		System.out.println(min);
			
	}

}
