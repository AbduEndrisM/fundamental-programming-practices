package miscellaneous.nine;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private Employee employee;
	

	Account(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return " Account type:  " + acctType + "\n Current Balance = " + balance;
	}

	public void makeDeposit(double deposit) {
//implement
		balance = balance + deposit;
	}

	public boolean makeWithdrawal(double amount) {

//implement	
		if (amount > balance)
			return false;
		else {
			amount = balance - amount;
			return true;
		}

	}
	
	public double  getBalance() {
		//implement
		return balance;
			}
	
	
	
	
	
}