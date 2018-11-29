package Lesson3;

public final class Circle {

	 final private double r;

	public Circle(double r) {
		this.r = r;
	}

	public double getRadius() {
		return r;
	}

	public double computeArea() {
		return Math.PI * r * r;
	}
	
}
