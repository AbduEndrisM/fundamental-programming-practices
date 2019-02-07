package miscellaneous.exceptions;

public class Circle extends ClosedCurve {
	double radius;
	
	public Circle(double radius)  throws IllegalClosedCurveException {
		validateRadius(radius);
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
	private void validateRadius(double r) throws IllegalClosedCurveException {
		if(r<=0){
			log.warning("Non-positive radius passed in");
			throw new IllegalClosedCurveException(this.getClass().getName());
			
		}
	}
		
}
