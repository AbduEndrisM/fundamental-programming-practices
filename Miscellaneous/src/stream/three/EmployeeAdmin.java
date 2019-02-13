package stream.three;
 
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAdmin {

	// returns a list of social security numbers, sorted in ascending order,
	// that belong to an Employee in the input table but that are not on the
	// socSecNums input list
	public static List<String> prepareSsnReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
		List<String>ssnReport = table.keySet().stream()
									.filter(x->(socSecNums.contains(x)==false))
									.collect(Collectors.toList());
		
		ssnReport.sort((o1,o2)->
			o1.compareTo(o2));
			
		return ssnReport;
				
	}			
		//return a list of Employees whose social security number is on the input list socSecNums
				//and whose salary is >80000; the return list does not need to be sorted  
	public static List<Employee> prepareEmpReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
		List<Employee>ssnReport = table.values().stream()
				.filter(x->(socSecNums.contains(x.getSsn())))
				.filter(x->x.getSalary()>80000)
				.collect(Collectors.toList());
		
		return ssnReport;
	}
}