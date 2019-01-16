package three.classwork2;

public class RetirementAccount  extends Account{

	public RetirementAccount(double balance, Employee employee) {
		super(balance, employee); 
	}

	@Override
	public AccountType getAccount() {
		// TODO Auto-generated method stub
		return AccountType.RETIREMENT;
	}

}
