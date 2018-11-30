package lesson3.problem1;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Abdu", "Edris", "12345");
		Customer c2 = new Customer("Sobah", "Edris", "12345");
		Customer c3 = new Customer("Ali", "Edris", "12345");

		Address c1BillingAdd = new Address("Fairfield", "IA", "4th", "52556");
		Address c2BillingAdd = new Address("Chicago", "IL", "5th", "12345");
		Address c3BillingAdd = new Address("LA", "CA", "1th", "52556");

		Address c1ShippingAdd = new Address("Chicago", "IL", "5th", "12345");
		Address c2ShippingAdd = new Address("Fairfield", "IA", "4th", "52556");
		Address c3ShippingAdd = new Address("Atlanta", "Georgia", "5th", "12345");

		c1.setBillingAddress(c1BillingAdd);
		c1.setShippingAddress(c1ShippingAdd);

		c2.setBillingAddress(c2BillingAdd);
		c2.setShippingAddress(c2ShippingAdd);

		c3.setBillingAddress(c3BillingAdd);
		c3.setShippingAddress(c3ShippingAdd);

		Customer[] cust = { c1, c2, c3 };

		for (Customer c : cust) {
			if (c.getBillingAddress().getCity() == "Chicago")
				System.out.print(c);

		}
	}
}
