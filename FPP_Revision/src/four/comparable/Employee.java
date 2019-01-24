package four.comparable;

import java.util.Arrays; 

class Employee implements Comparable<Employee>{
	String name;
	int salary;

	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}



	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary ;
	}



	public static void main(String[] args) {

		String[] nameList = {"Harry","Bob","Steve","Jack"};

		Arrays.sort(nameList);
		System.out.println(Arrays.toString(nameList));

		int[] nums = {16,35,7,1,4};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		Employee[] emps = {new Employee("Pink", 200),new Employee("Gaga", 900),new Employee("Mike", 500)};

		Arrays.sort(emps);
		System.out.println(Arrays.toString(emps));
		

	}
/*	  comparator not compare
	public int compareByName(Employee o) { 
		return (o.name.compareTo(name));
		 
	} 
	public int compareBySalary(Employee o) { 
		return (Integer.compare(o.salary, this.salary));
			 
	}*/

 

	@Override
	public int compareTo(Employee o) {
		//return (o.name.compareTo(name));
		return (Integer.compare(this.salary, o.salary));
		
	} 

}