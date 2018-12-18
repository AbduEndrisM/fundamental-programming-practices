package lesson8;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Sale {
	String item;
	double price;
	String type;

	public Sale(String item, double price, String type) {
		this.item = item;
		this.price = price;
		this.type=type;
		
	}
	
	public String toString() {
		return item + " "+ price +" "+type;
		
	}
}

public class TallySales {
	public static void main(String[] args) {
		ArrayList<Sale> sales = new ArrayList<Sale>();
		sales.add(new Sale("DVD", 40,"Action"));
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		fillTheList(sales);
		Sale ob = sales.get(1);
		System.out.println(ob.item + " " + ob.price);
		double total = 0;
		for (Sale sale : sales) {
			if (sale.item.equals("DVD")) {
				total += sale.price;
			}
		}
		System.out.println("Total selleing price of DVD :" + currency.format(total));
	
	System.out.println("Sorted items based on item name");
	Collections.sort(sales, new compareByItem());
	for (Sale sale : sales) {
		System.out.println(sale);
		
	}
	
	}
	
	

	static void fillTheList(ArrayList<Sale> sales) {
		sales.add(new Sale("DVD", 15.00,"Family"));
		sales.add(new Sale("Book", 12.00,"Science"));
		sales.add(new Sale("DVD", 21.00,"Action"));
		sales.add(new Sale("CD", 5.25,"Romantics"));
	}
}

class compareByItem implements Comparator<Sale>{
//compare using 2 items
	@Override
	public int compare(Sale x, Sale y) {
		// TODO Auto-generated method stub
		int a= x.item.compareTo(y.item);
		int b= x.type.compareTo(y.type);
		if(a==0)  
		return b==0?a:b;
		 
		return a;
		//return x.item.compareTo(y.item);
	}
	
}



