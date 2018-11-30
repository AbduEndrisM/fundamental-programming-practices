

package lesson3.problem4;

public final class Triangle {

	 private  double b;
	 private double h;

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
