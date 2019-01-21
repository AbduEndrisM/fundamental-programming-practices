package innerClass.local;

class Outer {
	void outerMethod() {
		System.out.println("inside outerMethod");
		// Inner class is local to outerMethod()
	
		class Inner {
			void innerMethod() {
				System.out.println("inside innerMethod");
			}
		}
		
		//create object of the inner class and access the method via obj.
		Inner y = new Inner();
		y.innerMethod();
	}
	
	
}

public class One {
	public static void main(String[] args) {
		Outer x = new Outer();
		x.outerMethod();
	}
}
