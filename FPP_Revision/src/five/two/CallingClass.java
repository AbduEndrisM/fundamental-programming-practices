package five.two;

public class CallingClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		MyClass c1 = new MyClass();
		System.out.println(c1);

		MyClass c2 = c1;
		c2.x = 8;

		System.out.println(c1);
		System.out.println(c2);

		MyClass copy = c1.clone();
		copy.x = 2;

		System.out.println(copy);
		myMethod(c1);
	}

	static void myMethod(MyClass c1) throws CloneNotSupportedException {


	 MyClass copy= c1.clone();
	 copy.x=55;
	 System.out.println(c1);
	 System.out.println(copy);
	 

	}

}
