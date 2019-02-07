package miscellaneous.exceptions;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		ClosedCurve[] objects = null;
		try {
			objects = new ClosedCurve[]{new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3,7),
								 new Circle(-5)};
		}
		catch(IllegalTriangleException e) {
			System.err.println("An IllegalTriangleException was thrown in a Triangle instance");
			System.exit(1);
		}
		catch(IllegalClosedCurveException e) {
			String classname = e.getMessage();
			System.err.println("An IllegalClosedCurveException was thrown in a "+getClassNameNoPackage(classname)+ " instance");
			System.exit(1);
		}
		//compute areas
		for(ClosedCurve cc : objects) {
			String nameOfCurve = getClassNameNoPackage(cc.getClass());

			System.out.println("The area of this "+
								nameOfCurve+
								" is "+
								cc.computeArea());

			}
	}
	public static String getClassNameNoPackage(String fullClassName) {
       int index = fullClassName.lastIndexOf('.');
        String className = null;
        String packageName = null;


        //in this case, there is no package name
        if(index==-1) {
            return fullClassName;
        }
        else {
				  //for other apps, may be useful to have this
            packageName = fullClassName.substring(0,index);

            className = fullClassName.substring(index+1);
            return className;
        }
	}
	public static String getClassNameNoPackage(Class aClass){
        String fullClassName = aClass.getName();
        return getClassNameNoPackage(fullClassName);
	}
}
