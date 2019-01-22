package five.two;

public class MyClass implements Cloneable{

 
	  

	@Override
	protected MyClass clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (MyClass) super.clone();
	}
	
}
