package lesson4;

import java.util.Scanner;

// Check the given string input is palindrome or not.
public class Prob4 {
	// My Method to check
	public static boolean isPalindrome(String input) { // if length is 0 or 1 then String is palindrome
		if (input.length() == 0 || input.length() == 1)
			return true;
		if (input.charAt(0) == input.charAt(input.length() - 1))

			return isPalindrome(input.substring(1, input.length() - 1));

		return false;
	}

	public static void main(String[] args) {
		// For capturing user input
		Scanner sc = new Scanner(System.in);
		char ch;
		String string;
		
		String string2; // change all letter to capital and compare

		System.out.println("Enter the String :  ");
		string = sc.nextLine();

		string2 = string.toUpperCase(); // ensure that something in capital letters still can be a palindrome like javaJ

		if (isPalindrome(string2))
			System.out.println(string + " IS A PALINDROME");
		else
			System.out.println(string + " IS NOT A PALINDROME");

	}
}