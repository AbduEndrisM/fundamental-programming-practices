package innerClass.nested;

//this and constructors

class MyOuterClass {
	
	MyInnerClass inner;
	private String param;

	MyOuterClass(String param) {
		inner = new MyInnerClass("innerStr");
		this.param = param; // the outer class version of this
	}

	void outerMethod() {
		System.out.println(inner.param);
		inner.innerMethod();
	}

	private class MyInnerClass {
		private String param;

		MyInnerClass(String param) {
			// the inner class version of 'this'
			this.param = param;
		}

		void innerMethod() {
			// accessing enclosing class’s version of this
			System.out.println(MyOuterClass.this.param);
			// Invoke inner class parameter
			System.out.println(param);
		}
	}

}
	

public class Three {

	public static void main(String[] args) {
		(new MyOuterClass("outerStr")).outerMethod();
		// the above line is similar to the below
		// commented line
		/*
		 * MyOuterClass obj = new MyOuterClass("outerStr"); obj.outerMethod();
		 */
	}


}
