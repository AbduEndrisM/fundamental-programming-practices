package two.three;

import java.util.GregorianCalendar;

public class DeptEmployee {
	private double salary;
	private String name;
	private double hireDate;
	public DeptEmployee(double salary, String name, double hireDate) {
		super();
		this.salary = salary;
		this.name = name;
		this.hireDate = hireDate;
	}
	 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getHireDate() {
		return hireDate;
	}
	public void setHireDate(double hireDate) {
		this.hireDate = hireDate;
	}
	
	public double computeSalary() {
		return salary;
		
	}
	

}
