package lesson2;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO BANK OF AMERICA!");
		int entry;

		do {
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();

			if (pin != entry)
				System.out.println("Wrong pin");

		} while (entry != pin);

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}
