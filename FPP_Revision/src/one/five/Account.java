package one.five;


public class Account {

	private double balance;
	private Employee employee;
	private AccountType acctType;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	
	protected void makeDeposite(double amount) {
		balance= balance+amount;
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
		//if(acctType!=null)
			
		return "Acc Type: " + acctType + "\t Balance = " + balance;
		//else
		//	return null;
	}
 

}
