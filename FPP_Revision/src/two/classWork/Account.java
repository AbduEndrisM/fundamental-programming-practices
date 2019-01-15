package two.classWork;

public class Account {

	private double balance;
	private AccountType accountType;
	private Employee employee;

	public Account(double balance, AccountType accountType, Employee employee) {
		
		  this.balance = balance; 
		  this.accountType = accountType; 
		  this.employee =  employee;
		 
	}

	public Account(AccountType accountType, Employee employee) {
		/*
		 * this.accountType = accountType; this.employee = employee;
		 */
	}

	protected void makeDeposite(double amount) {
		amount += amount;

	}

	protected boolean makeWithdrawal(double amount) {
		if (amount > balance)
			return false;
		else {
			balance = balance - amount;
			return true;
		}
	}

	protected double getBalance() {

		return balance;

	}

	@Override
	public String toString() {
		 
			return "Account Type: " + accountType + ": Current Balance: " + getBalance();
		 


	}

}
