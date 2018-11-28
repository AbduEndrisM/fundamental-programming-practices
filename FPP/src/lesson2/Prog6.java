package lesson2;

import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] string = new String[3]; 

		String[] string2 = new String[2]; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings");
		
		for (int i=0; i<string.length;i++)
		string[i]= sc.nextLine();
		
		
		for (int i=0; i<string.length;i++) {
			for (int j=i+1; j<string.length;j++) {
				
			
				if (string[i].equals(string[j]))
					break; 
			
			else 
			{
				for (int k=0;k<string2.length;k++) {
					
			//	string2[k] = new String[] {string[i]};
				}
				
				
			}
			
			}
				
			}
			
		for (int i=0; i<string2.length;i++) {
			System.out.println(string2[i]);
		}
		
	}

}
