package one.two;

public class Account {

	private double balance;
	private AccountType accountType;
	private Employee employee;

	public Account(double balance, AccountType accountType, Employee employee) {
		this(accountType,employee);
		this.balance = balance;

	}

	public Account(AccountType accountType, Employee employee) {

		this.accountType = accountType;
		this.employee = employee;

	}

	protected void makeDeposite(double amount) {
		balance=balance+amount;

	}

	protected boolean makeWithdrawal(double amount) {
		if (balance<=amount)
		return false;
		else
		{
			balance= balance-amount;
			return true;
		}

	}

	protected double getBalance() {
		return balance;

	}

	public String toString() {
		return "Acc Type: "+accountType+ "\t Curr Balance: "+balance;
	}

}
