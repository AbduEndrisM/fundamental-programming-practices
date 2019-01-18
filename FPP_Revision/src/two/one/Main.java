package two.one;

public class Main {

	public static void main(String[] args) {

		Circle c = new Circle(5.0);
		Rectangle r = new Rectangle(4.5, 6.0);
		Triangle t = new Triangle(3.3, 5.0);
		
		System.out.printf("\nArea of Triangle is  %.2f", t.computeArea());
		System.out.printf("\nArea  of  Circle is  %.2f", c.computeArea());
		System.out.printf("\nArea of Rectangle is  %.2f ", r.computeArea());

	}

}
