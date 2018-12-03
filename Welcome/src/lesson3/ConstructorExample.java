package lesson3;

class MyClass {
	int x;

	MyClass() // default constructor
	{
		System.out.println("Default Constructor");
		x = 10;
	}

	MyClass(int i) // Parameterized constructor
	{
		x = i;
	}
}

public class ConstructorExample {
	public static void main(String args[]) {
		MyClass m=new MyClass(30);
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass(20);
		System.out.println("t1.x = " + t1.x + " \nt2.x = " + t2.x);
	}
}
