package three.classwork2;
 
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Employee  {

	
	  List<Account> accounts = new ArrayList<Account>();
	  

	
	public AccountType getSavingAccount() {
		return accounts.get(0).getAccount();
	}
	public AccountType getCheckingAccount() {
		return accounts.get(1).getAccount();
	}
	public AccountType getRetirmentAccount() {
		return accounts.get(2).getAccount();
	}

	
	private String name;
	private GregorianCalendar hireDate; // Date is already depreciated

	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDate = new GregorianCalendar(yearOfHire, monthOfHire, dayOfHire);
	}

	public void deposit(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		selected.makeDeposite(amt); //(Notice the nice use of polymorphism here.)

	}

	public void withdraw (int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		selected.makeWithdrawal(amt); 
 	}

	public GregorianCalendar getHireDate() {
		return hireDate;

	}

	public String getName() {
		return name;

	}

	public String getFormatedAcctInfo() {
		 
		String info = accounts.get(0) + "\n" + accounts.get(1) + " \n" + accounts.get(2);

		return info;

	}

	public void createNewSavings(double startingBalance) {

		
		accounts.add(0,this);

	}

	public void createNewChecking(double startingBalance) {
		accounts.add(startingBalance, this );
	}

	public void createNewRetirement(double startingBalance) {
		accounts.add(startingBalance, this );
	}

}
