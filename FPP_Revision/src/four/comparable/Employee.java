package four.comparable;

import java.util.Arrays;
import java.util.Comparator;

class Employee /*implements Comparable<Employee>*/ {
	String name;
	int salary;

	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary;
	}

	public static void main(String[] args) {

		String[] nameList = { "Harry", "Bob", "Steve", "Jack" };

		
		Arrays.sort(nameList);
		System.out.println(Arrays.toString(nameList));
		
			 
		int[] nums = { 16, 35, 7, 1, 4 };
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		Employee[] emps = { new Employee("Pink", 200), new Employee("Gaga", 900), new Employee("Mike", 500),new Employee("Abdu", 500) };

		
	
		///////////////////////////////////
		//By name
		Arrays.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
		});
	System.out.println("Comparator - Name");
	System.out.println(Arrays.toString(emps));
	

	////////////////////////////////////////// method two of sorting method
	//By salary
	 Comparator<Employee> employeeNameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.salary - o2.salary;
		}
	};
	
	System.out.println("Comparator - Salary");
	System.out.println(Arrays.toString(emps));

	
	//////////////////////////////////
//////////////////////////////////////////
System.out.println("Compare - Salary");
Arrays.sort(emps,employeeNameComparator);
System.out.println(Arrays.toString(emps));

//												comparator implements compare method
//												comparable implements compareTo methos

	
	//////////////////////////////////////////
	//By salary then name
	Arrays.sort(emps, new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			int x = o1.salary-o2.salary;
			if (x==0)
			return o1.name.compareTo(o2.name);
			else
				return x;
		}
	});
	System.out.println("Comparator - Salary and name");
	System.out.println(Arrays.toString(emps));

	
	
	
	}


/*	// Salary  using compareTo
	@Override
	public int compareTo(Employee o) {
//		 return (this.salary-o.salary);
		return (Integer.compare(this.salary, o.salary));

	}
	*/



}