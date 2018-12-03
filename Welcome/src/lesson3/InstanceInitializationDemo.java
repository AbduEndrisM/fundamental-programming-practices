package lesson3;

/*  An initialization block is a block of statements enclosed inside a pair of braces. An
initialization block appears within the class declaration,but not inside methods or constructors.

Initialization blocks can simplify the classes if you have multiple constructors sharing a 
common code and none of them can invoke other constructors. */

class Book {
	static int numOfObjects;
	private String title;
	private int id;

	public Book(String title) {
		this.title = title;
	}

	public Book(int id) {
		this.id = id;
	}

	// Initialization blocks
	{
		int x;
		x = ++numOfObjects;
		System.out.println("Initialization block is executed " + x + " time");
	}
}

public class InstanceInitializationDemo {

	public static void main(String args[]) {
		Book b1 = new Book(111);
		Book b2 = new Book("Java Complete Reference");
		System.out.println("Total number of Objects for the Book class is " + Book.numOfObjects);
	}
}
