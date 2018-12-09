package lesson5;
 

public class ClassE {
	static int superInt = superIntMethod();
	
	static int superIntMethod(){
		System.out.println("1-Initializing static super int");
		return 1;
	}
	
	static {
		System.out.println("2-Executing super static block");
	}
	
	static int superInstanceIntMethod() {
		System.out.println("5-Initialzing superInstanceInt");
		return 3;
	}
	
	private int superInstanceInt=superInstanceIntMethod();
	
	ClassE(){
		System.out.println("7-Running ClassE constructor");
	}
	{
		System.out.println("6-Running super object initialization block");
	}
	public static void main(String[] args) {
		new SubClass();
	}
}
class SubClass extends ClassE {
	static int subInt = subIntMethod();
	
	static int subIntMethod(){
		System.out.println("3-Initializing static sub int");
		return 2;
	}
	
	static {
		System.out.println("4-Executing sub static block");
	}
	static int subInstanceIntMethod() {
		System.out.println("9-Initialzing subInstanceInt");
		return 3;
	}
	SubClass(){
		System.out.println("10-Running SubClass constructor");
	}
	{
		System.out.println("8-Running sub object initialization block");
	}
	private int subInstanceInt = subInstanceIntMethod();
		
}
