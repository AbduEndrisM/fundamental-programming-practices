package miscellaneous.seven;

import java.util.Random;

public class RandomNumbersAddition {

	public static void main(String[] args) {
		Random r = new Random();
		int x, y;

		// random.nextInt(max - min + 1) + min

		for (int i = 0; i < 4; i++) {
			x = r.nextInt(99 - 1 + 1) + 1;
			System.out.print("  " + x + "  ");

		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			y = r.nextInt(99 - 1 + 1) + 1;

			System.out.print("+  " + y + " ");
		}
		System.out.println();
		System.out.println("----------------------------");

		System.out.println("\n");

		for (int i = 0; i < 4; i++) {
			x = r.nextInt(99 - 1 + 1) + 1;
			System.out.print("  " + x + "  ");

		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			y = r.nextInt(99 - 1 + 1) + 1;

			System.out.print("+  " + y + " ");
		}
		System.out.println();
		System.out.println("---------------------------");

	}

}
