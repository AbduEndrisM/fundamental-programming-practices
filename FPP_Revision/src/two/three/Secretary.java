package two.three;

import java.util.GregorianCalendar;

public class Secretary extends DeptEmployee{

	private double overtimeHours;
	public Secretary(double salary, String name, double hireDate, double overtimeHours ) {
		super(salary, name, hireDate);
		this.overtimeHours=overtimeHours;
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}
	// since we are passing this value through constructor no need to use setter
	/*public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}*/

	@Override
	public double computeSalary() {
		return (super.computeSalary()+12*overtimeHours);
		
	}
}
