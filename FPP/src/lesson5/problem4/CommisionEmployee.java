package lesson5.problem4;

public class CommisionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;

	public CommisionEmployee(String firstName, String lastName, String sss, double grossSales, double comissionRate) {
		super(firstName, lastName, sss);
		this.grossSales = grossSales;
		this.commissionRate = comissionRate;
	}

	@Override
	public double  getPayment() {
		return grossSales * (commissionRate/100) ;


	}

}
