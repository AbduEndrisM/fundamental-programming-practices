package three.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * swap the smallest element to 0th position in the array
 *
 */
public class SmallestElement {

	public static void main(String[] args) {

		int[] nums = { 16, 35, 7, 1, -4, 36, 49 };
		System.out.println(Arrays.toString(nums));

		int indx = 0;
		int smallest = nums[indx];
		for (int i = 0; i < nums.length; i++)
			if (nums[i] < smallest) {
				smallest = nums[i];
				indx = i;
			}
		int temp = nums[0];
		nums[0] = smallest;
		nums[indx] = temp;
		System.out.println(Arrays.toString(nums));

		System.out.println();
		System.out.println();
		List<Integer> num = new ArrayList<>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(0);
		num.add(5);
		System.out.println(num);

		int index = 0;
		int small = num.get(index);
		for (int i = 0; i < num.size(); i++) {
			if (num.get(i) < small) {
				small = num.get(i);
				index = i;
			}
		}
		num.set(index, num.get(0));
		num.set(0, small);

		System.out.println(num);

		// implement

//		[-4, 35, 7, 1, 16, 36, 49] is the expected output.
	}

}
