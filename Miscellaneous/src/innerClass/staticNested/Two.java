package innerClass.staticNested;

public class Two {
	static int data = 30;
	int data1 = 100;

	void print() {
		System.out.println("data is " + data1);
	}

	static class Inner {
		static int x = 50;

		
		//can be called using className.msg
		static void msg() {
			System.out.println("data is " + x);
			System.out.println("data is " + data);

			// System.out.println("data is "+data1); //Error
		}

		//called using object of Inner class 
		void display() {
			System.out.println("Static Method Demo");
		}
	}

	public static void main(String[] args) {
		/*Two t = new Two();
		t.print();*/
		
		new Two().print();
		Inner.msg();
		
		//Static class
		/*Two t = new Two();      //Not like concrete classes
		Two.Inner x = t.new Inner();	
		x.display();*/

	 
		
		Inner obj1 = new Inner();	//Just write the static class name like concrete classes
		obj1.display();
	}
}