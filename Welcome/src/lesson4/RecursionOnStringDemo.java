package lesson4;
 

public class RecursionOnStringDemo {
	public static void main(String args[]) {
		System.out.println("Length of a String is :" + length("Java Program"));
		System.out.print("Reversed String is :");
		printCharsReverse("Program");

	}

	// Recursive Method to find the length of a String
	public static int length(String str) {
		if (str == null || str.equals("")) {
			return 0;
		} else {
			return 1 + length(str.substring(1));
		}
	}

	// Recursive method to print the string in reverse order
	public static void printCharsReverse(String str) {
		if (str == null || str.equals("")) {
			return;
		} else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
}
