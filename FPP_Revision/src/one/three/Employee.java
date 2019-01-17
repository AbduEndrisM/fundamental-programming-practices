package one.three;
 
import java.util.GregorianCalendar;
 
public class Employee {

	private String name;
	private double salary;
	private GregorianCalendar hireDate;
	
	public Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		
		name = aName;
		salary = aSalary;
		hireDate = new GregorianCalendar(aYear, aMonth, aDay);
		 
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public GregorianCalendar getHireDate() {
		return hireDate;
	}
	public double raiseSalary(double percent) {
		
		return (salary+salary*(percent/100));
	}
	
	
	
	
	
}
