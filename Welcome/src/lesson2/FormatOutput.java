package lesson2;

import java.util.Date;

public class FormatOutput {
	public static void main(String args[]) {

		// System.out.println -- doesn't work - String, other variable together
		System.out.printf("You will pay me %5.2f \n", 100.5000);
		String.format(" the  date was  %d   ", 22);

		System.out.printf("You owe me %f \n", 195.50);
		System.out.printf("You owe me %.2f \n", 195.5076);
		System.out.printf("You owe me %17.2f \n", 195.50); // total a length of 17 digits= fill with empty space

		String name = "Bob";
		int age = 30;
		System.out.printf("Happy birthday %s. I can't believe you're %d.", name, age);

		String oweMe = String.format("You owe me %.2f dollars", 196f);
		String oweMe2 = String.format("You owe me %d dollars", 196);
		System.out.println(oweMe);
		System.out.println(oweMe2);

		String date = String.format("Today's date: %tF", new Date());
		System.out.println(date);
		String date1 = String.format("Today's date: %tc", new Date());
		System.out.println(date1);
		int x = 'K';
		int x1 = 123;
		System.out.printf("Hexa Decimal Value of x: %x\n", x);
		System.out.printf("Hexa Decimal Value of x1: %x", x1);
		System.out.printf("\n%3d #%2s #%7.2f\n", 1234, "Java", 51.6653);

		String str1 = "GFG";
		String str2 = "GeeksforGeeks";

		// %1$ represents first argument, %2$ second argument
		String gfg2 = String.format("My Company name" + " is: %1$s, %1$s and %2$s", str1, str2);
		System.out.println(gfg2);

	}
}
