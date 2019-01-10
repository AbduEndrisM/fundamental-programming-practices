package generic;


// A program to calculate the 4 mathematical operations using generic types
// for int and double 

//It doesnt work tho

class Maths <T> {
	T a;
	T b;

	public Maths (){
	 
	}

	public static  <T extends Integer> Integer add(T a, T b) {
		return a+b;		
	}

	public T sub(T a, T b) {
		return b;
	}

	public T mul(T a, T b) {

		return b;
	}

	public T div(T a, T b) { 
		return b;
	}

}

public class GenericThreeYes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths <Integer> x = new Maths<Integer>();
		x.add(4,5);
		x.sub(3,4);
		x.mul(3,4);
		x.div(5, 6);
		
		Maths <Double> y = new Maths<Double>();
	//	y.add(3.3,4.9);
		y.sub(3.8,4.9);
		y.mul(3.0,4.0);
		y.div(13.0,4.0);
		
		
	}

}
