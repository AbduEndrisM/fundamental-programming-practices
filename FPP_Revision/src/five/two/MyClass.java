package five.two;

public class MyClass implements Cloneable{

	int x=6;
 
	  

	@Override
	protected MyClass clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (MyClass) super.clone();
	}



	@Override
	public String toString() {
		return "MyClass [x=" + x + "]";
	}
	
}
