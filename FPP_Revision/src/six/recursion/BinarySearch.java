package six.recursion;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = { -4, 1, 7, 16, 35, 36, 49 };

		System.out.println(Arrays.toString(nums));

		 System.out.println("Is 16 in the Array?: " + BinarySearch.binarySearch(nums, 16, 0, nums.length));
		System.out.println("Is 7 in the Array?: " + BinarySearch.binarySearch(nums, 7, 0, nums.length));
		System.out.println("Is 40 in the Array?: " + BinarySearch.binarySearch(nums, 40, 0, nums.length));

//		Collections.binarySearch();
//		Arrays.binarySearch(a, key);

	}

	public static boolean binarySearch(int[] temp, int key, int start, int end) {
	
	

		 
//	            if(key>temp[n]|| key<temp)
		int m=(start+end)/2;
		
		if (start>end) {
			return false;
		}
		if (temp[m] == key) {
			return true;}
		else if (temp[m] < key) {
			
			return (binarySearch(temp, key, m+1, end));
		} else {
			
			return (binarySearch(temp, key, start, m-1));
		
		}
		
//		return false;
	}
		/*
		 * int l = 0, n = temp.length - 1; while (l <= n) { int m = l + (n - l) / 2; if
		 * (temp[m] == key) return true; if (temp[m] < key) l = m + 1;
		 * 
		 * else n = m - 1; }
		 * 
		 * return false;
		 */
	}


