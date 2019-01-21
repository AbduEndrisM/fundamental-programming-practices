package innerClass.nested;

class Outer2 {
	private String text1 = "I am Outer Class!";

	public void callinner() {
		Inner iobj = new Inner();
		iobj.printText();
	}

	class Inner {
		private String text2 = "I am Inner Class!";

		void printText() {
			System.out.println(text1);
			System.out.println(text2);
		}
	}
}

public class Two {

	public static void main(String[] args) {
		//
		// Object for outer class
		Outer2 ot = new Outer2();
		ot.callinner();
		
		System.out.println();
		// object for inner class
		Outer2.Inner obj = new Outer2().new Inner();
		obj.printText();

	}

}
