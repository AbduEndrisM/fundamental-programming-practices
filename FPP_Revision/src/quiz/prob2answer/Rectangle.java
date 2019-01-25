package quiz.prob2answer;

public class Rectangle implements Shape{
	private double length;
	private double width;
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double computeArea() {
		return length * width;
	}
}
