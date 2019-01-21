package innerClass.nested;

class Outer {
	int x=5;
	
	class Inner {
		int y=5;
		
		
		public void show() {
			System.out.println("In a nested class method");

			System.out.println(x+y);
		}
	}
}

public class One {
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.show();
	}
}
