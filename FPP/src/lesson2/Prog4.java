package lesson2;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String hello = sc.nextLine();
		
			
		for (int i=hello.length()-1;i>=0;i--)
		{
			
			System.out.print(hello.charAt(i));
		} 
		
	}

}
