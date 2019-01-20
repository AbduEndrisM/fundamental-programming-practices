package miscellaneous.one;

public class Address {

	private String shippingAddress;
	private String billingAddress;
	
	public Address(String shippingAddress, String billingAddress) {
	 
		this.shippingAddress = shippingAddress;
		this.billingAddress = billingAddress;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	
}
