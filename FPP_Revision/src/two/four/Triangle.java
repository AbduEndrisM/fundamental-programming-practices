package two.four;

final class Triangle extends ClosedCurve {
	/* we require height <= base */ final double base;
	final double height;

	Triangle(double base, double height) {
		if (height <= base) {
			this.base = base;
			this.height = height;
		} else {
			this.base = height;
			this.height = base;
		}
		assert (height <= base);
	}

	public double computeArea() {
		return (0.5 * base * height);
	}
	
	public String toString() {
		return "Triangle";
	}
}