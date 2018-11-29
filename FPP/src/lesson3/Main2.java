package Lesson3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(3.0, 4.5);
		Rectangle r = new Rectangle(3.0, 4.5);
		
		Scanner sc = new Scanner(System.in);
		
		char choice;

		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");
		choice = sc.next().charAt(0);

		switch (choice) {

		case 'C':
			System.out.println("Enter the width");
			 
			Circle c = new Circle(3.0);
			System.out.println(c.computeArea());
			break;

		case 'R':
			System.out.println("Enter the width");
			System.out.println(r.computeArea());
			break;

		case 'T':
			System.out.println("Enter the width");
			System.out.println(t.computeArea());
			break;

		default:
			System.out.println("Error");

		}

	}

}