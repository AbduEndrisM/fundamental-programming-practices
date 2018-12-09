package lesson5.shape;


public class TeShapet {

	public static void main(String[] args) {
	
	//	Shape s1 = new Shape(); // This is the object of Super class
	
		Shape[] shapes = new Shape[3];
		Shape s1 = new Shape();
		Shape s2 = new Square();
		Shape s3 = new Rectangle();
		shapes[0] = s1;
		shapes[1] = s2;
		shapes[2] = s3;
		
		Shape[] shape1 = new Shape[3];
		Shape s4 = new Square("Blue","Square",4.5);
		Shape s5 = new Rectangle("Red","Rectangle",4.6,6.7);
		Shape s6 = new Square("Blue","Square",5.0);
		shape1[0] = s4;
		shape1[1] = s5;
		shape1[2] = s6;
		
		// Polymorphism benefit - Dynamic binding 
		double sum = 0.0;
		for(Shape x:shape1){
			sum += x.area();
				System.out.println(x.getClass().getSimpleName() + " :" + x.area());
		}

		System.out.println("Total :" + sum);
	}

}
