package lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	List<OrderLine> orderLine;

	public Order(int orderNum, List<OrderLine> orderline) {
		super();
		this.orderNum = orderNum;
		this.orderLine = orderline;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public List<OrderLine> getOrderline() {
		return orderLine;
	}

	public static void main(String[] args) {

		List<OrderLine> orderList = new ArrayList<>();
		Order sr = new Order(100, orderList);
		System.out.println(sr.getOrderNum());

		OrderLine or = new OrderLine(new Order(100, orderList));
		System.out.println(or.getOrder().getOrderNum());

	}


}
