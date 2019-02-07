package miscellaneous.exceptions;

public class Square extends ClosedCurve {
	double side;
	
	public Square(double side)  throws IllegalClosedCurveException {
		validateSide(side);
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}
	private void validateSide(double s) throws IllegalClosedCurveException {
		if(s <= 0){
			log.warning("Non-positive side passed in");
			throw new IllegalClosedCurveException(this.getClass().getName());
			
		}
	}
}
