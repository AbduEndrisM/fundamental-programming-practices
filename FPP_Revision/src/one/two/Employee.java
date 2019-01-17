package one.two;

import java.util.Date;

public class Employee {

	private Account savingAccount;
	private Account checkingAccount;
	private Account retirementAccount;
	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;

	}

	public void deposit(String type, double amount) {
		
		switch(type) {
		case "SAVINGS":
			savingAccount.makeDeposite(amount);
			break;
		case "CHECKING":
			checkingAccount.makeDeposite(amount);
			break;
		case "RETIREMENT":
			retirementAccount.makeDeposite(amount);
			break;
		} 
	}

	public boolean withdraw(String type, double amount) {
		boolean x=false; 
		switch(type) {
		case "SAVINGS":
			x =savingAccount.makeWithdrawal(amount);
 		case "CHECKING":
			x=checkingAccount.makeWithdrawal(amount);
			 
		case "RETIREMENT":
			x= retirementAccount.makeWithdrawal(amount);
			
		}
		return x; 

	}

	public Date getHireDate() {
		return null;

	}

	public String getName() {
		return null;

	}

	public String getFormatedAcctInfo() {
		return checkingAccount +"\n"+savingAccount+"\n"+retirementAccount;
	}

	public void createNewSavings(double startingBalance) {
		savingAccount = new Account(startingBalance, AccountType.SAVINGS, this);

	}

	public void createNewChecking(double startingBalance) {
		checkingAccount = new Account(startingBalance, AccountType.CHECKING, this);

	}

	public void createNewRetirement(double startingBalance) {
		retirementAccount = new Account(startingBalance, AccountType.RETIREMENT, this);
	}

}
