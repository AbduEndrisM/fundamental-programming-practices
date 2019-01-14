package one;

import java.util.Date;

public class Employee {

	private Account savingAccount;
	private Account checkingAccount;
	private Account retirementAccount;

	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {

	}

	public double deposit(String type, double amount) {
		return 0.0;
	}

	public boolean withdraw(String type, double amount) {
		return false;

	}

	public Date getHireDate() {
		return null;

	}

	public String getName() {
		return null;

	}

	public String getFormatedAcctInfo() {
		return null;

	}
	public void createNewSavings(double startingBalance) {

 	}
	public void createNewChecking(double startingBalance) {
 
	}

	public void createNewRetirement(double startingBalance) {
 
	}

}
