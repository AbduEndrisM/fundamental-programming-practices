package lesson5.problem1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] shapes =  { new  Rectangle ("Red", 2.2, 3.3),
							new Circle("Black", 2.0),
							new Square ("Green", 6.5)				
			
		};

		
	/*	shapes[0] = new Shape("Black");
		shapes[1] = new Square("Blue", 10.0);
		shapes[2] = new Rectangle("Green", 5.0, 10.0);
		shapes[3] = new Circle("Yellow", 50.0);
		shapes[4] = 	*/
				
				printTotal(shapes);

	}

	public static void printTotal(Shape[] shapes) {

		double sum = 0.0;
		double perim = 0.0;
		for (Shape x : shapes) {/*
			sum = sum + x.calculateArea();
			perim = perim + x.calculatePerimeter();
			System.out.println(x.getClass().getSimpleName() + " Area :" + x.calculateArea() + "   " + x.color);
			System.out
					.println(x.getClass().getSimpleName() + "  Perimeter :" + x.calculatePerimeter() + "  " + x.color);*/
			
			System.out.println(x.getClass().getSimpleName()  + ":" +x.calculateArea());
		}
//
//		System.out.println("Total sum : " + sum);
//		System.out.println("Total perimeter :" + perim);

	}

}
