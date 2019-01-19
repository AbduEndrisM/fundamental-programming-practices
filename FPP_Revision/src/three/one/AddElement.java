package three.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Add the element 9 at the position 1
 *
 */
public class AddElement {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		System.out.println(num);
		num.add(1, 9);
		System.out.println(num);

		
		System.out.println();
		System.out.println();
		
		
		  int[] nums = new int[8];
		  nums[0] = 4;
		  nums[1] = 5; 
		  nums[2] = 7; 
		  nums[3] = 1;
		  nums[4] = 3;
		  
		  System.out.println(Arrays.toString(nums));
		
		  for (int i=nums.length-2; i>=1;i--)
			 nums[i+1]=nums[i];
		    nums[1]=9;

		  System.out.println(Arrays.toString(nums));
			 
		  // implement
			// added element 9 at pos 1: [4, 9, 5, 7, 1, 3, 0, 0]

	}

}
