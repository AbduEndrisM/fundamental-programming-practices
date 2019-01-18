package two.one;

public final class Rectangle {
	private final double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;

	}

	public double getWidth() {
		return width;
		}
	public double getHeight() {
		return height;
		}


	public double computeArea() {
		return width * height;

	}

}
