package exams.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> list = new ArrayList<>();
		for(String s:table.keySet()) {
			if(socSecNums.contains(s)) {
				list.add(table.get(s));
			}
		}
		
		List<Employee> list2 = new ArrayList<>();
		
		Iterator<Employee> i = list.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			if(e.getSalary()>80000) {
				list2.add(e);
			}
		}
		
		
		
		Collections.sort(list2, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getSsn().compareTo(o2.getSsn());
			}
		});
			
		return list2;
		
	}
	
}
