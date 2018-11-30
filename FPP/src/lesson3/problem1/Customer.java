package lesson3.problem1;

public class Customer {

	private String firstName;
	private String lastName;
	private String SSN;
	
	private Address billingAddress;
	private Address shippingAddress;
	
	
	public Customer(String firstName, String lastName, String SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return firstName;
	}

	public String getSNN() {
		return SSN;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}

	public void setlastName(String lastName) {
		this.lastName=lastName;
	}

	public void setSNN(String SSN) {
		this.SSN=SSN;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress=billingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress=shippingAddress;
	}

	
	//String bill= billingAddress.getStreet() + " " + billingAddress.getCity()+ " " + billingAddress.getZip()+" "+ billingAddress.getState();
	//String ship= shippingAddress.getStreet() + " " + shippingAddress.getCity()+ " " + shippingAddress.getZip()+" "+ shippingAddress.getState();
	
	public String toString() {
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + SSN +"]" ;
		 
		 }
 	
	

}
