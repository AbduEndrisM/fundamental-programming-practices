package lesson5.problem4;

public class BasePlusComissionEmployee extends CommisionEmployee {

	private double baseSalary;

	public BasePlusComissionEmployee(String firstName, String lastName, String sss, double grossSalary,
			double comissionRate, double baseSalary) {
		super(firstName, lastName, sss, baseSalary, comissionRate);

		this.baseSalary = baseSalary;
	}

	@Override
	public double getPayment() {
		return baseSalary+ super.getPayment(); 


	}

}
