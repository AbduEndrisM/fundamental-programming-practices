package six.recursion;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearchStringArray {

	public static void main(String[] args) {

		String[] string = {"abdu","bar","sobah","zed", "aklil","edwin"};

		//System.out.println(Arrays.toString(string));
		Arrays.sort(string);
		System.out.println(Arrays.toString(string));

		 System.out.println("Is abdu in the Array?: " + BinarySearchStringArray.binarySearch(string, "abdu", 0, string.length-1));
		System.out.println("Is aziza in the Array?: " + BinarySearchStringArray.binarySearch(string, "aziza", 0, string.length-1));
		System.out.println("Is Sobah in the Array?: " + BinarySearchStringArray.binarySearch(string, "Sobah", 0, string.length-1));

//		Collections.binarySearch();
//		Arrays.binarySearch(a, key);

	}

	public static boolean binarySearch(String[] string, String key, int start, int end) {
	
	

		 
//	            if(key>temp[n]|| key<temp)
		int m=(start+end)/2;
		
		if (start>end) {
			return false;
		}
		if (string[m].equals(key)) {//(string[m].compareTo(key)==0)
			return true;}
		else if (string[m].compareTo(key) < -1) {
			
			return (binarySearch(string, key, m+1, end));
		} else {
			
			return (binarySearch(string, key, start, m-1));
		
		}
		
	}
		
	}


