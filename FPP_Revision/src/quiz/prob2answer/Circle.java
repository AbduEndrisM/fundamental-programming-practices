package quiz.prob2answer;

public class Circle implements  Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
