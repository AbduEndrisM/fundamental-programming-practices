package lesson2;


public class IfExample {
	
	public static void main(String args[]) throws java.io.IOException { // exception is for char char = System.in.read
		char ch, answer = 'K';
		System.out.println("I'm thinking of a letter between A and Z.");
		System.out.print("Can you guess it: ");
		ch = (char) System.in.read(); // get a char
		if (ch == answer)
			System.out.println("** Right **");
		else
			System.out.println("...Sorry, you're wrong.");
			System.out.println("It was "+answer);
	}
}
