package Lesson3;

public final class Rectangle {
	private final double l,w;

	public Rectangle(double l, double w) {
		this.l = l;
		this.w=w;
	}

	public double getLength() {
		return l;
	}
	public double getWidth() {
		return w;
	}

	public double computeArea() {
		return (l * w);
	}
	

}
