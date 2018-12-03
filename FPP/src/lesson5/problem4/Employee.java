package lesson5.problem4;

public  abstract class Employee {
	private String firstName;
	private String lastName;
	private String sss;
	

	abstract public double getPayment();


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getsss() {
		return sss;
	}


	public void setsss(String ssn) {
		this.sss = sss;
	}
	
	
	public Employee (String firstName, String lastName, String sss) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.sss=sss;
	}
	
	
	
}
