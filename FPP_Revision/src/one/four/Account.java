package one.four;

abstract class Account {

	private double balance;
	private Employee employee;

	public Account(double balance, Employee employee) {

		this.balance = balance;
		this.employee = employee;

	}

	abstract public AccountType getAccount();

	protected void makeDeposite(double amount) {
		balance= balance+amount;
	}


	protected boolean makeWithdrawal(double amount) {
		if (getAccount().equals("RETIREMENT")) {
			balance = balance-balance*(2/100);
		}

		return false;

	}

	protected double getBalance() {
		if (getAccount().equals("SAVINGS")) {
			balance = balance-balance*(0.25/100);
		}

		if (getAccount().equals("CHECKING")) {
			balance = balance-5;
			
		}
		return balance;

	}

	@Override
	public String toString() {

		return "Account Type: " + getAccount() + ": Current Balance: " + getBalance();

	}

}
