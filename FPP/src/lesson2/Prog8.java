package lesson2;

import java.util.Scanner;

public class Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= new int[3];
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter array");
		for (int i=0; i<a.length; i++) {
			a[i]= sc.nextInt();
		}
		
		int small= a[0];
		
		for (int i=0; i<a.length; i++) {
			
			if (a[i] <small) {
					small = a[i];
		  }
			
		} 
		
		System.out.println(small);
		
			
		
		
		}

}
