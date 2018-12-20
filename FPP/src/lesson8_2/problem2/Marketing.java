package lesson8_2.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
 
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
		if (!(obj instanceof Marketing))// if (this.getClass() != obj.getClass()) //
			return false;
		Marketing m = (Marketing) obj;

		if ((m.employeeName.equals(this.employeeName)) && (m.productName.equals(this.productName))&& 
				(m.salesAmount == this.salesAmount))
//			int x =  Double.compare(m.salesAmount, this.salesAmount); 
		//this.employeeName.equals (m.salesAmount);
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeName, productName, salesAmount);
	}

	public static void main(String[] args) {

		ArrayList<Marketing> market = new ArrayList<Marketing>();

		market.add(new Marketing("aaa", "sdfd", 222.4));
		market.add(new Marketing("bbbb", "sdfd", 3833.4));
		market.add(new Marketing("ccc", "sdfd", 1211.4));

		// Collections.sort(market, new sortBySalesAmount());
		// System.out.println(market);

		//Collections.sort(market, new sortByEmployeeName());
		Collections.sort(market, new sortByEmployeeSalary());
		//System.out.println(market);

		List<Marketing> r1 = new ArrayList<>();

		r1 = listMoreThan1000(market);
		Collections.sort(r1, new sortByEmployeeSalary());
		System.out.println(r1);
		//market.remove(1);
		market.size();

	//	System.out.println("Size : " + market.size());

	}

	private static List<Marketing> listMoreThan1000(ArrayList<Marketing> market) {
		// TODO Auto-generated method stub
		List<Marketing> r = new ArrayList<>();
		for (Marketing m : market) {
			if (m.salesAmount > 1000) {
				r.add(m);

			}
		}

	//	Collections.sort(r, new sortByEmployeeName());
		//System.out.println(r);

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

}class sortByEmployeeSalary implements Comparator<Marketing> {

	@Override
	public int compare(Marketing o1, Marketing o2) {
		// TODO Auto-generated method stub

		return Double.compare(o1.salesAmount, o2.salesAmount);

	}

}
