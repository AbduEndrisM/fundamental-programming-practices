package lesson8_2.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import lesson5.problem5.Computer;

public class Marketing {
	public String employeeName;
	public String productName;
	public double salesAmount;

	public Marketing(String employeeName, String productName, double salesAmount) {
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;

	}

	@Override
	public String toString() {
		return "Employe Name: " + employeeName + "  Product Name: " + productName + "  Sales Amount: " + salesAmount;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (!(obj instanceof Computer))// if (this.getClass() != obj.getClass()) //
			return false;
		Marketing m = (Marketing) obj;

		if ((m.employeeName == this.employeeName && m.productName == this.productName
				&& m.salesAmount == this.salesAmount))

			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeName, productName, salesAmount);
	}

	public static void main(String[] args) {

		ArrayList<Marketing> market = new ArrayList<Marketing>();

		market.add(new Marketing("fd", "sdfd", 245.4));
		market.add(new Marketing("abd", "sdfd", 2540.4));
		market.add(new Marketing("efd", "sdfd", 1252.4));

		// Collections.sort(market, new sortBySalesAmount());
		// System.out.println(market);

		Collections.sort(market, new sortByEmployeeName());
		// System.out.println(market);

		List<Marketing> r1 = new ArrayList<>();

		r1 = listMoreThan1000(market);
		System.out.println(r1);
		// market.remove(1);

		System.out.println("Size : " + market.size());

	}

	private static List<Marketing> listMoreThan1000(ArrayList<Marketing> market) {
		// TODO Auto-generated method stub
		List<Marketing> r = new ArrayList<>();
		for (Marketing m : market) {
			if (m.salesAmount > 1000) {
				r.add(m);

			}
		}

		Collections.sort(r, new sortByEmployeeName());
		// System.out.println(r);

		return r;

	}
}
/*
 * class sortBySalesAmount implements Comparator<Marketing> {
 * 
 * @Override public int compare(Marketing o1, Marketing o2) { // TODO
 * Auto-generated method stub return (int) ((o1.salesAmount - o2.salesAmount));
 * }
 * 
 * }
 */

class sortByEmployeeName implements Comparator<Marketing> {

	@Override
	public int compare(Marketing o1, Marketing o2) {
		// TODO Auto-generated method stub

		return o1.employeeName.compareTo(o2.employeeName);

	}

}
