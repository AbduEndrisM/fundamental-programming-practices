package lesson8;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; 
// Example of ArrayList Sorting and Binary Search
public class Array1 {
	public static void main(String[] args) {
		ArrayList<String> stringArray = new ArrayList<String>(
				Arrays.asList("Hello", "Welcome", "Java", "Object", "Array", "String", "Inheritance"));
/*
		stringArray.add("Hello");
		stringArray.add("Welcome");
		stringArray.add("Java");
		*/
		
		for (String x : stringArray) {
			System.out.println(x);
		}

		System.out.println("****** Unsorted String Array *******");
		System.out.println(stringArray);

		System.out.println("****** Sorted String Array *******");
		// Sort array in ascending order
		Collections.sort(stringArray);
		System.out.println(stringArray);

		int x = Collections.binarySearch(stringArray, "Java");
		System.out.println("String \"Java\" is in the position of : " + x);
		
		
		// Sort array in reverse order
		Collections.sort(stringArray, Collections.reverseOrder());
		 
		System.out.println("\n****** Reverse Sorted String Array *******");
		System.out.println(stringArray);

	}

}
