package lesson2;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] string = new String[3]; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings");
		
		for (int i=0; i<string.length;i++) {
		string[i]= sc.nextLine();
		}
		
		int count=0;
		
		for (int i=0; i<string.length;i++) {
			
			if (string[i].charAt(0)=='A') {
				count++;
				
				//Question 1
				System.out.println(string[i].length());
				
			}
		}
			
			  //Question 2
		System.out.println("\n" + count); 
		
	}

}
