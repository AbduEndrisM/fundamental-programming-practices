package lesson3.objectDemo;

 
public class Account {
	private String id;
	Account() {
		id = generateId();
	}
	private double balance;
	
	public void updateBalance(double amount) {
		balance += amount;
	}
	public double getBalance() {
		return balance;
	}
	
	public String getId() {
		return id;
	}
	
	private String generateId() {
		//in reality, read from a database or
		//external data source
		return ""+RandomNumbers.getRandomInt(1000,9999);
	}
	
	
}
