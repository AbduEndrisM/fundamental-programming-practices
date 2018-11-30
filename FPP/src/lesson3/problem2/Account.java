

package lesson3.problem2;

 


class Account {
	//public final static String CHECKING = "checking";
	//public final static String SAVINGS = "savings";
	//public final static String RETIREMENT = "retirement";
	
	private final static double DEFAULT_BALANCE = 0.0;
	
	private double balance;
	
	private AccountT acctType;
	private Employee employee;

	Account(Employee emp, AccountT acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountT acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		balance= balance+deposit;
		
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if(balance>=amount) {
			balance=balance-amount;
			return true;
		}
		
		return false;
	}
}
