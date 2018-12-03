package lesson4;

import java.util.Scanner;

public class Prob2 {

	public char minChar(String input) {
		if (input == null)
			return '0';
		if (input.length() == 1)
			return input.charAt(0);

		char ch = input.charAt(0);
		String t = input.substring(1);
		if (ch <= minChar(t))
			return ch;

		return minChar(t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prob2 m = new Prob2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = sc.next();
		System.out.println("The smallest chcaracter in the string " + input + "  is  : " + m.minChar(input));

	}

}
