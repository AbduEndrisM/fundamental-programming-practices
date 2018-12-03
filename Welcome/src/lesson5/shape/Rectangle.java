package lesson5.shape;

public class Rectangle extends Shape {
	double width, height;

	Rectangle(String color, String name, double width, double height) {
		super(color, name);
		this.width = width;
		this.height = height;
	}

	Rectangle() {
		System.out.println("Rectangle");
	}

	@Override // Overriding method from the parent, as well get the benefit of Compiler check
	double area() {
		return width * height;
	}

}
