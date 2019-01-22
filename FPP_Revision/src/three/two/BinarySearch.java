package three.two;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = {-4, 1, 7, 16, 35, 36, 49};

		System.out.println(Arrays.toString(nums));
		System.out.println("Is 16 in the Array?: " + BinarySearch.binarySearch(nums, 16));
		System.out.println("Is 7 in the Array?: " + BinarySearch.binarySearch(nums, 7));
		System.out.println("Is 40 in the Array?: " + BinarySearch.binarySearch(nums, 40));

//		Collections.binarySearch();
//		Arrays.binarySearch(a, key);
 
	}

	public static boolean binarySearch(int[] temp, int key) {
		
	
		        int l = 0, n = temp.length - 1; 
		        while (l <= n) { 
		            int m = l + (n - l) / 2;  
		            if (temp[m] == key) 
		                return true;  
		            if (temp[m] < key) 
		                l = m + 1; 
		   
		            else
		                n = m - 1; 
		        } 
		   
		        return false; 
		    } 
		 
}

