package lesson4;

import java.util.Scanner;

public class RecursionSum {
	
	public static void main(String[] args) {
		
	
		Scanner in = new Scanner(System.in);
		System.out.print("Type a Number: ");
	
		int n = in.nextInt();
		RecursionSum r1 = new RecursionSum();

		System.out.println("Sum = " + r1.Sum(n));
	}

	public int Sum(int n) {
		if (n == 1) // base case
			return 1;
		else
			return Sum(n - 1) + n; // general case

	}
}
