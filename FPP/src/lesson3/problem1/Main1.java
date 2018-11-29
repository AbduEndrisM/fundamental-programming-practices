package lesson3;

public class Main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1= new Customer("x","y","z");
		Customer c2= new Customer("x","y","z");
		Customer c3= new Customer("x","y","z");
		
		Address a1= new Address("Fairfield","IA", "4th", "52556");
		Address a2= new Address("Chicago", "IL", "5th", "12345"); 
		
		
		  c1.setBillingAddress(a1);		
		  c1.setShippingAddress(a2);
		
	}
}
