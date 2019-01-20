package miscellaneous.one;

public class Main {

	public static void main (String[] args) {
		Address a1= new Address("6789-45-123", "Iowa city");
		Address a2= new Address("222-45-6789", "Chicago");
		Address a3= new Address("6789-45-123", "Los angeles");
		Address a4= new Address("123-456-6789", "Chicago");
		
		

		Customer[] c1 = {new Customer("Abdu", "Abdu", "11111111",a1),
						 new Customer("Sobah", "Sobah", "2222222",a2),
						 new Customer("Elias", "Elias", "333333",a3),
						 new Customer("Buba", "Sobah", "4444444",a4)};
		
		System.out.println("Chicago customers ");		

		for (Customer c:c1) {
			if (c.getBillingAgddress().equals("Chicago"))
				System.out.println(c);		
			}
	}
}
