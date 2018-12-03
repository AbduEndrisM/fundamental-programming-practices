package lesson3.problem3;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;

	}

	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);

	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);

	}

	public String getFormattedAcctInfo() {
		// implement
		String info = "Accont info for " + name + ":" + "\n\n" + checkingAcct + savingsAcct + " \n " + retirementAcct;

		return null;
	}

	public void deposit(String acctType, double amt) {
		// implement
		if (acctType.equals(AccountType.CHECKING)) {
			checkingAcct.makeDeposit(amt);
		} else if (acctType.equals(AccountType.SAVINGS)) {
			savingsAcct.makeDeposit(amt);
		} else
			retirementAcct.makeDeposit(amt);
	}

	public boolean withdraw(String acctType, double amt) {
		// implement

		if (acctType.equals(AccountType.CHECKING)) {
			return (checkingAcct.makeWithdrawal(amt));
		} else if (acctType.equals(AccountType.SAVINGS)) {
			return (savingsAcct.makeWithdrawal(amt));
		} else
			return (retirementAcct.makeWithdrawal(amt));
	}
}
