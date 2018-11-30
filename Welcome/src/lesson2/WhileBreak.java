package lesson2;

 

import java.util.Scanner;

public class WhileBreak {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a positive number: ");
			int value = sc.nextInt();
			if(value <= 0)
				break;
			 sum = sum + value;
		}
		System.out.println("The value you enter must be positive.");
		System.out.println("Total sum :" + sum);
        sc.close();

	}

}
