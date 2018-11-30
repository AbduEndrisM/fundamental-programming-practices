package lesson2;

public class BreakExample {
	public static void main(String args[]) {
		// Demo for break and continue
		int num;
		num = 100;
		// loop while i-squared is less than num
		for (int i = 0; i < num; i++) {
			if (i * i >= num)
				break; // terminate loop if i*i >= 100
			System.out.print(i + " ");
		}
		System.out.println("\nLoop complete.");
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		outer: for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
				// System.out.println("\t");
				if (i == j)
					continue outer;
			}
		}

	}
}
