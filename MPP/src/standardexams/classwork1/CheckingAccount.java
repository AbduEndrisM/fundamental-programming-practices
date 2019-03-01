package standardexams.classwork1;

public class CheckingAccount extends Account {

	private double balance;
	private double monthlyFeee;
	private String acctID;
	
	
	
	public double getMonthlyFeee() {
		return monthlyFeee;
	}

	public String getAcctID() {
		return acctID;
	}

	public double getBalance(double balance) {
		return balance;
	}

	@Override
	public String getAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computeUpdateBalance() {
		// TODO Auto-generated method stub
		//return getBalance()-getMonthlyFeee();
		return balance-monthlyFeee;
	}
	

}
