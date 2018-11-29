package lesson2;

import java.util.Scanner;

public class Prog66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] string = new String[3]; 

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings");
		
		
		
		for (int i=0; i<string.length;i++)
		string[i]= sc.nextLine();
		
		int newlength = string.length;
		int[] index = new int[5]; 
		int count=0;
		boolean dup=false;
		
		
		for (int i=0; i<string.length;i++) {
			for (int j=i+1; j<string.length;j++) {
				
			
				if (string[i].equals(string[j])) {
									
				index[count]=i;  //
				newlength--; //new array
				count++;
				}	
			}
			 
			
			
		}
		

		String[] string2 = new String[newlength];
		
		for (int i=0; i<string.length;i++) {
			//if(i==)
				
			System.out.println(string2[i]);
		}
			
		}
				
			

}
