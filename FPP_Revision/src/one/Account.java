package one;

public class Account {

	private double balance;
	private AccountType accountType;
	private Employee employee;

	public Account(double balance, AccountType accountType, Employee employee) {
		/*
		 * this.balance = balance; this.accountType = accountType; this.employee =
		 * employee;
		 */
	}

	public Account(AccountType accountType, Employee employee) {
		/*
		 * this.accountType = accountType; this.employee = employee;
		 */
	}

	protected void makeDeposite(double amount) {

	}

	protected boolean makeWithdrawal(double amount) {
		return false;

	}

	protected double getBalance(double amount) {
		return amount;

	}
	
	public String toString() {
		return null;
	}


}
