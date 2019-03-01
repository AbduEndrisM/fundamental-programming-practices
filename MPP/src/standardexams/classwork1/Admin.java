package standardexams.classwork1;

import java.util.List;

public class Admin {

	public static void computeUpdatedBalanceSum(List<Employee> empList) {
		
		double sum=0.0;
		for (Employee e:empList) {
			sum+=e.computeUpdatedBalanceSum();
			
		}
		
		
		
	}
}
