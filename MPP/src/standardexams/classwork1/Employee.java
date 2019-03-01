package standardexams.classwork1;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private List<Account> accList =new ArrayList<>(); //0 to many relationship
	 
	
	public Employee(String name) {
		this.name = name;
		accList = new ArrayList<>();
	}
	 
	public String getName() {
		return name;
	}
	
	public String addAccount(Account acc) {
		return null;
		
	}
	public double computeUpdatedBalanceSum() {
		
		double sum =0;
		for (Account a:accList) {
			sum= sum+a.computeUpdateBalance();
		}
		return sum;
		
	}
	
}
