package three.three;



public class Maximum {
	public static void main(String[] args) {
		
		int[] nums = {3,6,2,7,4};
		int max=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max)
				max=nums[i];
		}
		System.out.println(max);
			
		
	}
}
