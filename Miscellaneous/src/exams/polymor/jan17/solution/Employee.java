package exams.polymor.jan17.solution;

import java.util.List;

public class Employee {
	String id;
	List accounts;
	
	public Employee(String id, List accounts) {
		this.id = id;
		this.accounts = accounts;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List getAccounts() {
		return accounts;
	}
	public void setAccounts(List accounts) {
		this.accounts = accounts;
	}
}
