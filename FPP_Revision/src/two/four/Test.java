package two.four;

class Test {
	public static void main(String[] args) {

		ClosedCurve[] objects = { new Triangle(5, 7), new Square(3), new Circle(3) };
		
		
		for(ClosedCurve c:objects) {
			System.out.printf(" Area :of the"+c + " %.2f",+c.computeArea());
			System.out.println();
		}
		
		System.out.println("\n");
		
		// compute areas
		for (Object o : objects) {
			if (o instanceof Triangle) {
				Triangle t = (Triangle) o;
				System.out.printf(" Area of the Triangle: %.2f", t.computeArea());
			}
			if (o instanceof Square) {
				Square s = (Square) o;
				System.out.printf("\n Area of the Square:   %.2f", s.computeArea());
			}
			if (o instanceof Circle) {
				Circle c = (Circle) o;
				System.out.printf("\n Area of the Circle:  %.2f", c.computeArea());
			}
		}
	}
}
