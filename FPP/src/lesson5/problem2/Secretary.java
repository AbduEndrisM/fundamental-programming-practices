package lesson5.problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {

	private double overtimeHours;

	public Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
		super(name, salary, hireDate);
		this.overtimeHours = overtimeHours;
		// TODO Auto-generated constructor stub
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		double salary = super.computeSalary() + 12 * overtimeHours;
		return salary;

	}
}
