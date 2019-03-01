package lab4;

public final class Paycheck {

	final double  grossPay;
	final double fica;
	final double state;
	final double local;
	final double medicare;
	final double socialSecurity;
	
	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
//		super();
		this.grossPay = grossPay;
		this.fica = grossPay;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}
	
	
	public void print() {
		
	}
	public double getNetPay() {
		 
		double all = grossPay - (fica+state+local+medicare+socialSecurity);
		
		return all;
	}

	
}
