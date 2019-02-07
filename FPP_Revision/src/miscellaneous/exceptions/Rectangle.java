package miscellaneous.exceptions;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurveException {
		validateSides(width,length);
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	private void validateSides(double w, double l) throws IllegalClosedCurveException {
		if(w <= 0 || l <= 0){
			log.warning("Non-positive side passed in");
			throw new IllegalClosedCurveException(this.getClass().getName());
			
		}
	}
	


}
