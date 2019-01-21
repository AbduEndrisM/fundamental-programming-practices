package innerClass.local;

class Outer3 {
	
	 /*Local inner class cannot access non-final local variable till JDK 1.7. 
	 Since JDK 1.8, it is possible to access the non-final local variable
	 in method local inner class.
	*/
	void outerMethod() {
		int x = 98;	//final int x=98;
		System.out.println("inside outerMethod");
		class Inner {
			void innerMethod() {
				System.out.println("x= " + x);
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}
}

public class Three {

	public static void main(String[] args) {
		Outer3 x = new Outer3();
		x.outerMethod();

	}

}
