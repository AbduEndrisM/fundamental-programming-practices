package miscellaneous.one;

public class Customer {
	private String firstName;
	private String lastName;
	private String SSN;
	String shippingAddress;
	String billingAgddress;

	public Customer(String firstName, String lastName, String sSN,Address a) {
	//	super();
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
		shippingAddress=a.getShippingAddress();
		billingAgddress=a.getBillingAddress();
	 
	}

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

	public String getShippingAddress() {
		return shippingAddress;
	}

	public String getBillingAgddress() {
		return billingAgddress;
	}
	
	public String  toString() {
		return firstName+", "+lastName+", "+"SSN : "+SSN;
	}

	
}
