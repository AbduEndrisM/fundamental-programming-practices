package lesson8.shopping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Shopping> list = new ArrayList();
	
		list.add(new Shopping("Abdu", 300.0));
		list.add(new Shopping("Aradom", 600.0));
		list.add(new Shopping("Zed", 450.0));
		list.add(new Shopping("ewrwe", 500.0));
		list.add(new Shopping("vdsc", 550.0));
		list.add(new Shopping("df5S", 400.0));
		
		
		
		// Whenever equals and comparator 
		Shopping s1= new Shopping ("Galaxy", 40.3);
		Shopping s2= new Shopping ("Galaxy", 50.3);
		
		
		//Check both using equals
		boolean res1= s1.equals(s2); //false
		
		// --Inconsistent = True and False [equals and compare to]
		
		//check both using compare class
		SortByName sb = new SortByName();
		int res2 = sb.compare(s1, s2);
		
		
		System.out.println("equals - "+res1);
		System.out.println("compare - "+res2);
		
		
		// Compare after consistency ?????
		System.out.println(res1+ "\n"+res2);
		
		
		
		/*
		
		//System.out.println(list);
		
		//sort
		//during sorting we have to override comparator for our class
		//Collection.sort(list); doesnt work
		SortByName sbn= new SortByName();
		//Collections.sort(list, new SortByName());
		
		Collections.sort(list,new Comparator<Shopping>() {
			
			@Override
			public int compare(Shopping o1, Shopping o2) {
				return Double.compare(o1.getPrice(), o2.getPrice());
			
			}
		});
		System.out.println(list);
		
		
		*/
	}

}
