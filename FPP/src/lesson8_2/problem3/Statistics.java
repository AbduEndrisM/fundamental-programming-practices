package lesson8_2.problem3;
 
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	static double sum=0.0;
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		for (EmployeeData l:aList) {
			sum=sum+l.getSalary();
			
		}
		return sum;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
