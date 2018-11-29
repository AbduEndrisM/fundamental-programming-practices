package lesson3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		char choice;

		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");
		choice = sc.next().charAt(0);

		switch (choice) {

		case 'C':
		
			System.out.println("Enter the radius");
			double radius= sc.nextDouble();
			
			Circle c = new Circle(radius);
			System.out.println("The area of Rectangle is : "+c.computeArea());
			
			break;
		
		case 'R':
			
			System.out.println("Enter the length");
			double length= sc.nextDouble();
			System.out.println("Enter the width");
			double width= sc.nextDouble();
			
			Rectangle r = new Rectangle(length, width);
			System.out.println("The area of Rectangle is : "+r.computeArea());
			
			break;

		case 'T':
			
			System.out.println("Enter the base");
			double base= sc.nextDouble();
			System.out.println("Enter the height");
			double height= sc.nextDouble();
			
			Triangle t = new Triangle(base, height);
			System.out.println("The area of Rectangle is : "+t.computeArea());
			
			break;

		default:
			System.out.println("Error");

		}

	}

}