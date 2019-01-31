package nine.comparator3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		new EmployeeSort();

	}
	public EmployeeSort() {
		Employee[] empArray = { new Employee("Dave", 40000, 1996,11,5),
							    new Employee("Dave", 50000, 2000, 1, 3),
							    new Employee("Dave", 45000, 2001, 2, 7)};
		
		
		List<Employee> empList = Arrays.asList(empArray);
		
/*		
//		COMPARE BY NAME, THEN BY DateOfHire THEN BY SALARY 
		NameComparator2 new2 = new NameComparator2();
		Collections.sort(empList,new2);
		System.out.println(empList);
		*/
		
		
//		COMPARE BY NAME 
		NameComparator nameComp = new NameComparator();
		Collections.sort(empList, nameComp);
		System.out.println(empList);
		
//		COMPARE BY DateOfHire 
		SalaryComparator salaryyComp = new SalaryComparator();
		Collections.sort(empList, salaryyComp);
		System.out.println(empList);
		
//		COMPARE BY SALARY
		HireDateComparator hireDateComp = new HireDateComparator();
		Collections.sort(empList, hireDateComp);
		System.out.println(empList);
		
	}

}
