package lesson3;

import java.util.Scanner;

enum Month {
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
};

public class EnumDemo1 {

	public static void main(String[] args) {
		Month birthMonth;
		String userEntry;
		int position;
		boolean comparison = false;
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the first three letters of " + "your birth month >>");
		userEntry = input.nextLine().toUpperCase();
		
		// values() returns an array containing all of the values
		// of the enum in the order they are declared
		for (Month mon : Month.values()) {
			System.out.println("Month Name : " + mon.name() + " and position :" + mon.ordinal());

			if (mon.equals(userEntry)) {
				comparison = true;
			}
		}
		if (!comparison) {
			System.out.println("Congratulations");
			birthMonth = Month.valueOf(userEntry);
			System.out.println("You entered " + birthMonth);
		}
		System.out.println("Have a nice day");
	}
}
