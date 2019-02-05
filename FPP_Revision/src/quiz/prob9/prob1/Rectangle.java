package quiz.prob9.prob1;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length){
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	


}
