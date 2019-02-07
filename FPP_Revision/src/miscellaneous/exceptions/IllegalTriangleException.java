package miscellaneous.exceptions;


public class IllegalTriangleException extends IllegalClosedCurveException {

	public IllegalTriangleException() {
		super();
	}
	public IllegalTriangleException(String msg){
		super(msg);
	}
	private static final long serialVersionUID = 1L;

}
