package two.five;

 
 
public class CallingClass {
	public String readVal() {
		MyClass cl = new MyClass();
		//return cl.getVal(); //produces a compiler error -- how to fix?
		return null;
	}
}
