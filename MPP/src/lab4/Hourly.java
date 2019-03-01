package lab4;

public class Hourly  extends Employee {

	private double hourlyWage;
	private int hoursPerWeek;
	
	@Override
	public double calcGrossPay(int month, int yr) {
		// TODO Auto-generated method stub
		
		return hourlyWage*hoursPerWeek*4;
	}

}
