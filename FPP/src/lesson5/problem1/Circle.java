package lesson5.problem1;

public class Circle extends Shape {

	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.color=color;
		this.radius=radius;
		
	}
	
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
	
	

}


