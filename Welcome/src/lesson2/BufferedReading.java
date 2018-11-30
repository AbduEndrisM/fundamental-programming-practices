package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReading {
	public static void main(String[] args) throws IOException {

	 
		
		//scanner class		
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter ur name");
		name = sc.nextLine();
		System.out.println("Your name is " + name);
		
		// using Buffer 
		String input = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Type your name: ");
		input = in.readLine();
		System.out.println("Your Name " + input);
		System.out.print("Type your Age: ");
		int x = Integer.parseInt(in.readLine());
		System.out.println("Your age: " + x);
		in.close();

		

	}
}