package lab4;

public abstract class Employee {

	private String empId;

	public void print() {

	}

	public final Paycheck calcCompensation(int month, int year) {

		double grossPayment = calcGrossPay(month, year);
		double fica = grossPayment * 0.23;
		double state = grossPayment * 0.05;
		double local = grossPayment * 0.01;
		double medicare = grossPayment * 0.03;
		double ssn = grossPayment * 0.75;
		Paycheck p = new Paycheck(grossPayment, fica, state, local, medicare, ssn);

		return p;
	}

	public abstract double calcGrossPay(int month, int yr);

}
