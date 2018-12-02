package lesson3.problem1;

public class Customer {

	private String firstName;
	private String lastName;
	private String SSN;

	private Address billingAddress;
	private Address shippingAddress;

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

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	

	public Address getBillingAddress() {
		return billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	
	public Customer(String firstName, String lastName, String SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}

	// String bill= billingAddress.getStreet() + " " + billingAddress.getCity()+ " "
	// + billingAddress.getZip()+" "+ billingAddress.getState();
	// String ship= shippingAddress.getStreet() + " " + shippingAddress.getCity()+ "
	// " + shippingAddress.getZip()+" "+ shippingAddress.getState();

	public String toString() {
		return "[" + firstName + " " + lastName + ", " + "ssn: " + SSN + "]";

	}

}
