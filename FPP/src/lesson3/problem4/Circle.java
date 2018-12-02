

package lesson3.problem4;

public final class Circle {

	  private final double r;

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
