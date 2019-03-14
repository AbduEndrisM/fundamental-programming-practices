package lab8.classwork;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAdmin {
	public static List<String> prepareSsnReport(HashMap<String, Employee> table, List<String> socSecNums) {

		List<String> ssnReport = table.keySet().stream()
				.filter(x -> (socSecNums.contains(x) == false))
				.sorted()
				.collect(Collectors.toList());
		
		return ssnReport;

	}
 
	public static List<Employee> prepareEmpReport(HashMap<String, Employee> table, List<String> socSecNums) {
		
		return 
	/*	List<Employee>ssnReport = */
				
				table.values().stream()
				.filter(x->(socSecNums.contains(x.getSsn())))
				.filter(x->x.getSalary()>80000)
				.collect(Collectors.toList());
		
//		return ssnReport;
	}
}