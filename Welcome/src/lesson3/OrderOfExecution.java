package lesson3;
 ;

//Demo code for the order of execution
public class OrderOfExecution {

	// static initialization
	private static int superInt = superIntMethod(); 
	private int number = 10;
	
	// static method
	public static int superIntMethod(){
		System.out.println("1-Initializing static super int");
		return 1;
	}

	// Constructor
	OrderOfExecution(){
		System.out.println("4-Running OrderOfexecution constructor");
	}
	
	// Instance Initialization Block - initialized immediately after all static initialization 
	{
			System.out.println("3-Running super object initialization block");
			System.out.println("Number = " + number);
	}
	
	static {
		System.out.println("2-Executing super static block");
		System.out.println("superInt = " + superInt);
	}
	public static void main(String[] args) {
		new OrderOfExecution();

	}

}
