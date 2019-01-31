package nine.comparator4;

import java.util.Comparator;

public class PriceComparator implements Comparator<SmartPhone>{

	@Override
	public int compare(SmartPhone o1, SmartPhone o2) {
		 
		return o1.getPrice()-o2.getPrice();
		
	}

}
