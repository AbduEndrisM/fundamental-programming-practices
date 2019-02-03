package eleven.hashmap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
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
		List<Employee> emp = new ArrayList<>();
		 
		 
		for(String s:table.keySet()) {
			if( socSecNums.contains(s) && (table.get(s).getSalary()>80000)) {
				emp.add(table.get(s));
			}
		}
		
		 Collections.sort(emp, new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getSsn().compareTo(o2.getSsn());
			}
			 	 
		 });
		return emp;
	}
	
	/**
		Returns a list of Employees whose social security number is not in the input list socSecNums
	*/
	public static List<Employee> findSsnIsNotInList(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> emp = new ArrayList<>();
		 
		 
		for(String s:table.keySet()) {
			if( socSecNums.contains(s) ==false) {
				emp.add(table.get(s));
			}
		}
		
		
		return emp;
	}
}
