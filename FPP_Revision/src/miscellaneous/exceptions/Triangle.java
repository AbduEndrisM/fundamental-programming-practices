package miscellaneous.exceptions;

public class Triangle extends ClosedCurve {
	
		double base;
		double height;
		//these values will not be set if the 2-argument constructor is used
		double side1;
		double side2;
		double side3;
		
		//easy way of doing it
		public Triangle(double base, double height){
			this.base = base;
			this.height = height;
		}
		
		//constructor that accepts 3 sides
		public Triangle(double side1, double side2, double side3) throws IllegalTriangleException, IllegalClosedCurveException  {
			handleSides(side1,side2,side3);
		}
		private void validateSides(double x, double y, double z) throws IllegalTriangleException, IllegalClosedCurveException {
			if(x <= 0 || y <= 0 || z <= 0){
				log.warning("Non-positive side passed in");
				throw new IllegalClosedCurveException(this.getClass().getName());
			}
			if(x + y < z) {
				log.warning("Illegal sizes of sides passed in");
				throw new IllegalTriangleException("Illegal sizes "+ 
													"for a triangle: "+
													+side1+ ", "+ side2+", "+ side3);
			}
			
		}
		//we don't want client classes to use this because base and height will not be computed
		private void handleSides(double s1, double s2, double s3) throws IllegalTriangleException, IllegalClosedCurveException  {
			
			double[] arr = sort(s1,s2,s3);		
			double x = arr[0];
			double y = arr[1];
			double z = arr[2];
			//if validation fails, an exception will be thrown
			validateSides(x,y,z);
			side1 = x;
			side2 = y;
			side3 = z;
			computeBaseAndHeight(x,y,z);			
		}
		
		public  void setSides(double x, double y, double z) throws IllegalTriangleException, IllegalClosedCurveException  {
			handleSides(x,y,z);
		}
		//used in the side-side-side constructor
		private void computeBaseAndHeight(double x, double y, double z){
			double u = (y*y - x*x + z*z)/(2*z);
			double h = Math.sqrt(y*y - u*u);
			base = z;
			height = h;		
		}
		double computeArea() {
			return (0.5 * base * height);
		}
		private double[] sort(double a, double b, double c){
			double[] retVal = new double[3];
			double[] others = new double[2];
			double min = a;
			others = new double[]{b,c};
			if(b < min) {
				min = b;
				others = new double[]{a,c};
			}
			if(c < min) {
				min = c;
				others = new double[]{a,b};
			}
			retVal[0]= min;
			if(others[0]> others[1])
				others= new double[]{others[1],others[0]};
			
			retVal[1]=others[0];
			retVal[2]=others[1];
			//System.out.println("Sorted: "+Arrays.toString(retVal));
			return retVal;
		}
		public static void main(String[] args){
			try {
				Triangle t = new Triangle(1.41421, 1.41421, 2);
				//System.out.println("Area: "+t.computeArea());
				//System.out.println(""+(3560/256));
				//System.out.println(""+(3560-256*13));
				System.out.println(""+(232/16));
				System.out.println(""+(232-16*(232/16)));
				System.out.println(""+(9*256 + 14 * 16 + 2));
				System.out.println(""+(-5/2)+"  "+ (-5%2));
				System.out.println(""+(35/4));
				System.out.println(""+(35>>2));
			}
			catch(IllegalClosedCurveException ex){
				
			}
		}


		
}

