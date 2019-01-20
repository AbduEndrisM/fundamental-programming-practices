package miscellaneous.nine;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.soap.SAAJMetaFactory;
  
class Employee {

	private String name;
	private Date hireDay;
	private Account savingAccount;
	private Account checkingAccount;
	private Account retirementAccount;

	Employee(String aName, int aYear, int aMonth, int aDay) {
		name = aName;

		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
		return name;
	}

	// needs to be improved!!
	public Date getHireDay() {
		return hireDay;
	}

	public void createNewChecking(double startAmount) {
		checkingAccount=new Account(this, "CHECKING", startAmount);
		
		// implement
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingAccount=new Account(this, "SAVING", startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAccount=new Account(this, "RETIREMENT", startAmount);
		
	}

	public void deposit(AccountType acctType, double amt) {
		switch(acctType) {
		case CHECKING:
			checkingAccount.makeDeposit(amt);
		break;
		case SAVINGS:
			savingAccount.makeDeposit(amt);
		break;
		case RETIREMENT:
			retirementAccount.makeDeposit(amt);
		break;
		}
		// implement
	
	}

	public boolean withdraw(AccountType acctType, double amt) {
		
		switch(acctType) {
		case CHECKING:
			checkingAccount.makeWithdrawal(amt);
		break;
		case SAVINGS:
			savingAccount.makeWithdrawal(amt);
		break;
		case RETIREMENT:
			retirementAccount.makeWithdrawal(amt);
		break;
		}
		return false;
		// implement
	}

	public String getFormattedAcctInfo() {
		// implement
		return  checkingAccount + "\n"+savingAccount+"\n"+retirementAccount+"\n";
	} 

}