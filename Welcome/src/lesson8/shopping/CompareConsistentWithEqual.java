package lesson8.shopping;

import java.util.Comparator;

public class CompareConsistentWithEqual implements Comparator<Shopping> {

	@Override
	public int compare(Shopping o1, Shopping o2) {
		// TODO Auto-generated method stub

		if (o1.getIname().compareTo(o2.getIname()) != 0)
			return o1.getIname().compareTo(o2.getIname());
		else
			return Double.compare(o1.getPrice(), o2.getPrice());
	}

}
