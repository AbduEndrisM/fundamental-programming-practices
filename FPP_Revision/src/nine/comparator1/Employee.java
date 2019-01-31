package nine.comparator1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; 
import java.util.List;
 
public class Employee  {
	// instance fields
	private String name;
	private double salary;

	// constructor
	Employee(String aName, double aSalary) {
		name = aName;
		salary = aSalary;

	}

	// instance methods
	public String getName() {
		return name;
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		NameComparator n = new NameComparator();
		
		//create employee array with three employees
		Employee[] emp = {new Employee("AbduC", 2222),
						  new Employee("AbduB", 3333),
						  new Employee("AbduA", 4444) };
		
		System.out.println(Arrays.toString(emp));
		
		//Use Arrays.sort();	
		Arrays.sort(emp, new NameComparator());
		System.out.println(Arrays.toString(emp));
	
		
		//Use Collection.sort();
		List<Employee> empList = new ArrayList<>();
		empList = Arrays.asList(emp);
		
		Collections.sort(empList, new NameComparator());
		System.out.println(empList.toString());
		
		//print your employee array
	 
  
	}
}

	 
