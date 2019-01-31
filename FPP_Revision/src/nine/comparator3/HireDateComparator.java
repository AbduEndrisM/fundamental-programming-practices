package nine.comparator3;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getHireDate().compareTo(o2.getHireDate());
	}

}
