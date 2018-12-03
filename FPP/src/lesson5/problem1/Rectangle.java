package lesson5.problem1;


public class Rectangle extends Shape{
	
	double width, height;

	public Rectangle(String color, double width, double height) {
		super(color);
		this.color=color;
		this.width=width;
		this.height=height;
		
	}
	
	public double calculateArea() {
		return width*height;
	}
	
	public double calculatePerimeter() {
		return 2*(width*height);
	}
	

}
