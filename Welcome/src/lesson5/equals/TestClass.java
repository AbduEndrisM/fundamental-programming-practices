package lesson5.equals;



import java.util.Calendar;
import java.util.GregorianCalendar;
/* Case 1: For the code in package case1, override equals using the instanceof strategy:  
 * Two Persons are considered equal if they have the same name and date of birth,
 * and this definition for equals will be considered in this case to be an adequate criterion
 * for deciding if two PersonWithJob instances are equal; that is, two PersonWithJob instances 
 * are also considered equal if they have the same name and date of birth. */

public class TestClass {

	public static void main(String[] args) {
		
		 int xxx= 2;
		Test t = new Test();
	t.myMethod(8);
		
		

		
		GregorianCalendar d1 = new GregorianCalendar(1998, Calendar.SEPTEMBER, 5);
		GregorianCalendar d2 = new GregorianCalendar(1998, Calendar.SEPTEMBER, 5);
		GregorianCalendar d3 = new GregorianCalendar(1999, Calendar.OCTOBER, 15);
		Person p1 = new Person("John",d1);
		Person p2 = new Person("John",d2);
		Person p3 = new Person("David",d3);
		System.out.println("p1.equals(p2) : " + p1.equals(p2));
		System.out.println("p2.equals(p3) : " + p2.equals(p3));
		
		PersonWithJob pj1 = new PersonWithJob("John",d1,5000);
		PersonWithJob pj2 = new PersonWithJob("John",d2,4000);
		System.out.println("p1.equals(pj1) : " + p1.equals(pj1));
		}
}
	class Test{
		
		void myMethod(int x) {
			if (x==0)
				return;
			else {
				System.out.println(" "+x);
				myMethod(x--);
				return;
			}
		}
	

}

	
	

