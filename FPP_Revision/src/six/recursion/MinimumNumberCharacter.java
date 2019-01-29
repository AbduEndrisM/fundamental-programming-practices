package six.recursion;

public class MinimumNumberCharacter {

	public static void main(String[] args) {

		int[] nums = { 2, 4, 1, 6, 9 };
		String string= "hello";
		
		
		//using loop
		int max = max(nums);
//		System.out.println(max);
		int min = min(nums);
//		System.out.println(min);
		char minString = minString(string);
//		System.out.println(minString);
		char maxString = maxString(string);
//		System.out.println(maxString);
		
		
		//using recursive
		
		int maxUsingRecursive = maxUsingRecursive(nums,1);
		System.out.println(maxUsingRecursive);
		
		int minUsingRecursive = minUsingRecursive(nums,1);
		System.out.println(minUsingRecursive);
		
		

	}

	private static int minUsingRecursive(int[] nums, int i) { 
		
		if(i==nums.length)
			return nums[0];
		if(nums[i]<nums[0]) {
			int temp = nums[0];
			nums[0]=nums[i];
			nums[i]=temp;
		}
		return minUsingRecursive(nums, ++i);
		
		  
	}

	private static int maxUsingRecursive(int[] nums, int i) {

		if(i==nums.length)
			return nums[0];
		if(nums[i]>nums[0]) {
			int temp= nums[0];
			nums[0]=nums[i];
			nums[i]=temp;
		}
		return maxUsingRecursive(nums, ++i);
		
	}

	private static char maxString(String string) {
		

		char max = string.charAt(0);
		
		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i) > max)
				max = string.charAt(i);
		}

		return max;
	}
	
	private static char minString(String string) {
		

		char min = string.charAt(0);
		
		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i) < min)
				min = string.charAt(i);
		}

		return min;
	}

	private static int max(int[] nums) {

		int max = nums[0];
		for (int i = 1; i < nums.length ; i++) {
			if (nums[i] > max)
				max = nums[i];
		}

		return max;
	}
	
	private static int min(int[] nums) {

		int min = nums[0];
		for (int i = 1; i < nums.length ; i++) {
			if (nums[i] < min)
				min = nums[i];
		}

		return min;
	}
	

}