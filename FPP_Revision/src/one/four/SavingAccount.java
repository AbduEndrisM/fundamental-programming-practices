package one.four;

public class SavingAccount extends Account{

	public SavingAccount(double balance, Employee employee) {
		super(balance, employee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAccount() {
		// TODO Auto-generated method stub
		return AccountType.SAVINGS;
	}

}
