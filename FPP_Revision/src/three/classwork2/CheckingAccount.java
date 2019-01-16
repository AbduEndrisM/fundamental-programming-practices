package three.classwork2;

public class CheckingAccount extends Account {
	
	
	public CheckingAccount(double balance, Employee employee) {
		super(balance, employee);
		// TODO Auto-generated constructor stub
	}

	 

	@Override
	public AccountType getAccount() { 
		return AccountType.CHECKING;
	}

}
