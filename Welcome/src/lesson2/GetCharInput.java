package lesson2;

import java.io.IOException;
import java.util.Scanner;

public class GetCharInput {

		public static void main(String[] args) throws IOException {
			
			//way 2
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Enter Character Input : ");
			char c = reader.next().charAt(0);
			System.out.println("Char = " + c);
			
			//way 2
			System.out.println("Enter Another Character Input : ");
			char ch = (char) System.in.read();
			System.out.println("You Entered= " + ch);
			 
			
		}

}
