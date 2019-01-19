package three.one;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * Delete the element at the position 1 
 *
 */
public class DeleteElement {

	public static void main(String[] args) {

		
		
		
		List<Integer> num = new ArrayList<>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		System.out.println(num);
		num.remove(1);
		System.out.println(num);

	//OR	
		
		System.out.println();
		System.out.println();

		 // Delete the element at the position 1 
		
		int[] nums = new int[8];

		nums[0] = 4;
		nums[1] = 5;
		nums[2] = 7;
		nums[3] = 1;
		nums[4] = 3;

		System.out.println(Arrays.toString(nums));

		for (int i=2; i<nums.length;i++) //for (int i=1; i<nums.length-1;i++)
			nums[i-1]=nums[i];	//nums[i]=nums[i+1];

		System.out.println(Arrays.toString(nums));

	//	[4, 7, 1, 3, 0, 0, 0, 0] is the expected output.

	

}
}



