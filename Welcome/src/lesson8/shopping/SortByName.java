package lesson8.shopping;

import java.util.Comparator;

//comparator to sort the shopping item  by name
public class SortByName implements Comparator{

/*	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	*/
	
	@Override
	public int compare(Object x, Object y) {
		// TODO Auto-generated method stub
		
		Shopping s1 = (Shopping) x;
		Shopping s2= (Shopping) y;
		
		
		return s1.getIname().compareTo(s2.getIname());
	}

	
	
}
