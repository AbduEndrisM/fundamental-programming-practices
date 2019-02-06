//package inner.anonymous.exercise.functionalinterface;

package four.lambda.functionalinterface;
import java.util.Random;
 
public class TestMyIface {

	public static void main(String[] args) {

		//implement here
		// an anonymous inner class, lambda expression
		
		MyIface obj = new MyIface() {
			
			@Override
			public double getNumber() {

				return  Math.random();
			}
		};
	
		System.out.println(obj.getNumber());
		
		MyIface obj2 = ()-> Math.random();
		 
	
		System.out.println(obj2.getNumber());
		
	}


}
