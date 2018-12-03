package lesson4;

import java.util.Scanner;

/*
 * 
 * Merge the two sorted string into a single sorted string.
	Note : Your input should be a sorted input string.
*/


public class Prob1 {

	public String concatenate(String firstString, String secondString) {
		if (firstString == null && secondString == null)
			return null;
		if (firstString == null)
			return secondString;
		if (secondString == null)
			return firstString;

		StringBuilder sb = new StringBuilder();
		sb.append("");

		if (firstString.charAt(0) <= (secondString.charAt(0))) {
			sb.append(firstString.charAt(0));
			if (firstString.length() > 1)
				firstString = firstString.substring(1);
			else
				firstString = null;
		} else {
			sb.append(secondString.charAt(0));
			if (secondString.length() > 1)
				secondString = secondString.substring(1);
			else
				secondString = null;
		}

		return sb.toString() + concatenate(firstString, secondString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prob1 sc = new Prob1();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the strings");
		String fString, sString;
		fString = input.next();
		sString = input.next();
		System.out.println("String before merging :" + fString + "  " + sString);
		System.out.print("String after merging and sorting  :");
		System.out.println(sc.concatenate(fString, sString));

	}

}
