package lesson5.problem4;

public class SalariedEmployee extends Employee{
	
	
	private double weeklySalary; 
	
	
	public SalariedEmployee(String firstName, String lastName, String sss, double weeklySalary) {
		super(firstName, lastName, sss);
		this.weeklySalary=weeklySalary;

	}

	@Override
	public double getPayment() {
		return weeklySalary;
		
	}

}
