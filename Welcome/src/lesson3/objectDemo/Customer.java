package lesson3.objectDemo;

 
public class Customer {
	private String name;
	private Account checkingAccount;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void createNewAccount() {	//setAccount
		checkingAccount = new Account();
	}
	
	public void makeDeposit(double amount) {	//setDeposit
		checkingAccount.updateBalance(amount);
	}
	public void makeWithDrawal(double amount) {		//setWithdraw
		checkingAccount.updateBalance(-amount);
	}
	public double checkBalance() {
		return checkingAccount.getBalance();
	}
	
	public String readCheckingAccountId() {
		return checkingAccount.getId();
	}
}
