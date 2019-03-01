package lab4;

import java.util.ArrayList;
import java.util.List;

public class Commssioned extends Employee {

	private double commission;
	private double baseSalary;

	List<Order> orderList = new ArrayList<>();


	
	public Commssioned() {
		orderList = new ArrayList<>();
	}

	@Override
	public double calcGrossPay(int month, int yr) {
		// TODO Auto-generated method stub
		double totalOrderSold = 0.0;
		for (Order o : orderList) {
			totalOrderSold = totalOrderSold + o.getOrderAmount() * commission;
		}
		 
		return  baseSalary + totalOrderSold;
	}

}
