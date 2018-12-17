package lesson12.problem1;

import java.util.Scanner;


class MyException extends Exception {
	
	MyException() {
		System.out.println("Error:0-100");
	}
 
}

public class Prog1 {
	public static void main(String[] args) {
	//MyException me = new MyException();
			int x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mark is out of thr range range");

		try {

			x = sc.nextInt();
			
			if (x < 0 || x > 100)
				throw new MyException();
			System.out.println("x: "+x);
		}

		catch (MyException e) {
			// TODO: handle exception 
		}
	}
}
