package lesson2;

//import java.util.Scanner;

public class SwitchExample {
	public static void main(String args[]) throws java.io.IOException {
		char choice;
		System.out.println("Help on:");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.print("Choose one: ");
		
		choice = (char) System.in.read(); // Input is char
		
		/*
		Scanner sc= new Scanner(System.in);   // choice and case variables  would be int and import scanner class
		int choice2 = sc.nextInt();*/
		
		System.out.println("\n");
		
		switch(choice) {
		case '1':
		System.out.println("The if:\n");
		System.out.println("if(condition) statement;");
		System.out.println("else statement;");
		break;
		case '2':
		System.out.println("The switch:\n");
		System.out.println("switch(expression) {");
		System.out.println(" case constant:");
		System.out.println(" statement sequence");
		System.out.println(" break;");
		System.out.println(" // ...");
		System.out.println("}");
		break;
		default:
		System.out.print("Selection not found.");
		break;
		}
	}
		
}
