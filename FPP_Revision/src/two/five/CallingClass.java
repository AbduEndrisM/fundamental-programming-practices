package two.five;

public class CallingClass {
	public static void main(String[] args) {
		CallingClass c= new CallingClass();
		
		System.out.println(c.readVal());
	}
	private String readVal() {
		
		MyClass cl = new MyClass();
		return cl.getVal(); // produces a compiler error -- how to fix?

	}
}
