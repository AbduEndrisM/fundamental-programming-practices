package one.five;

import java.time.LocalDate;

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;

		// Replace these lines with LocalDate references
		// GregorianCalendar cal = new
		// GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		// hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {

		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);

	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public void deposit(AccountType acctType, double amt) {
		switch (acctType) {
		case SAVINGS:
			savingsAcct.makeDeposite(amt);
			break;
		case CHECKING:
			checkingAcct.makeDeposite(amt);
			break;

		case RETIREMENT:
			retirementAcct.makeDeposite(amt);
			break;
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {

		boolean permited = false;
		switch (acctType) {
		case SAVINGS:
			permited = savingsAcct.makeWithdrawal(amt);
			break;
		case CHECKING:
			permited = checkingAcct.makeWithdrawal(amt);
			break;
		case RETIREMENT:
			permited = retirementAcct.makeWithdrawal(amt);
			break;
		}
		return permited;
	}

	public String getFormattedAcctInfo() {

		String check, save, retire;
		
		if (checkingAcct != null)
			check = checkingAcct.toString();
		if (savingsAcct != null)
			save = savingsAcct.toString();
		if (retirementAcct != null)
			retire = retirementAcct.toString();

		
		//String info  = "Accont info for " + this.name + ":" + "\n\n" + check + "\n" + save + " \n"
		//		+ retire + "\n\n";

		return null;//info;

	}
}