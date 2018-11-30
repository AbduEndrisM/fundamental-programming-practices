package lesson3.problem3;
 
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
	}

	
	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct=new Account (this, acctType, CHECKING,3000)
		
	}

	public void createNewSavings(double startAmount) {
		// implement
		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		
	}

	public String getFormattedAcctInfo() {
		// implement
		return null;
	}
	public void deposit(String acctType, double amt){
		// implement
		switch (acct) {
		case CHECKING:
			checkingAcct.deposit
		}
		
		
	}
	public boolean withdraw(String acctType, double amt){
		// implement
	}

}
