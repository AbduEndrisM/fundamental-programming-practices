package exams.Nov2016.Solution_prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double total=0.0;
		for(EmployeeData e:aList) {
			total=total+e.getSalary();
		}
		return total;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
