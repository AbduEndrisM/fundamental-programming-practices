package two.classWork;

import java.util.Date;
 

public class Employee {

	private Account savingAccount;
	private Account checkingAccount;
	private Account retirementAccount;

	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name=name;
		hireDate= new Date(yearOfHire, monthOfHire, dayOfHire) ;
	}

	public void deposit(String type, double amount) {

		switch (type) {
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

		if (amount <= 0)
			return false;
		else {

			switch (type) {
			case "SAVINGS":
				savingAccount.makeWithdrawal(amount);
				break;

			case "CHECKING":
				checkingAccount.makeWithdrawal(amount);
				break;

			case "RETIREMENT":
				retirementAccount.makeWithdrawal(amount);
				break;

			}
			return true;
		}
	}

	public Date getHireDate() {
		return hireDate;

	}

	public String getName() {
		return name;

	}

	public String getFormatedAcctInfo() {
	 	 
		String x= savingAccount.toString();
		String y= checkingAccount.toString();
		String z= retirementAccount.toString();
		//String info = savingAccount.toString()+"/n"+checkingAccount.toString()+"/n"+retirementAccount.toString();//x+"%n"+y+"%n"+z;
		
		String info = "Accont info for " + getName() + ":" + "\n\n" + AccountType.CHECKING+" "+checkingAccount.getBalance() + "\n"+ AccountType.SAVINGS+" " +savingAccount.getBalance() + " \n" + AccountType.RETIREMENT+" "+retirementAccount.getBalance();	  
		
		return info;

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
