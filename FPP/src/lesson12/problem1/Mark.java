package lesson12.problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("plases inset your mark in the range of 0 to 100 : ");
		int mark = in.nextInt();
		if (mark < 0 || mark > 100)
			throw new InputMismatchException("your mark is out of thr range range");
		System.out.println("your mark: " + mark);

	}
}
