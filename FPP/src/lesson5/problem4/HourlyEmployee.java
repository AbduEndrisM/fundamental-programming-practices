package lesson5.problem4;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String sss, double wage, double hours) {
		super(firstName, lastName, sss);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double getPayment() {
		return hours*wage;


	}

}
