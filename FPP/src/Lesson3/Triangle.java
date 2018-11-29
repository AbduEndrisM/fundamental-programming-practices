package Lesson3;

public final class Triangle {

	 private final double b,h;

	public Triangle(double b, double h) {
		this.b = b;
		this.h=h;
	}

	public double getBase() {
		return b;
	}public double getHeight() {
		return h;
	}

	public double computeArea() {
		return (0.5*(b * h));
	}
}
