package two.two;

public class Main {

	public static void main(String[] args) {
		Cylinder cl= new Cylinder(2.0, 3.0);
		
		System.out.printf("Area %.2f", cl.getArea());
		System.out.println();
		System.out.printf("Volume %.2f",cl.getVolume());
		System.out.println();
		
		Cylinder cldr= new Cylinder(2.0);
		System.out.printf("Area %.2f", cldr.getArea());
		
	
	}

}
