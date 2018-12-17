package lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=new Employee(null, 0, 0, 0, 0);
		int[] ints = { 1, 3, 4 };
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Size of ArrayList "+list.size());
		for (int i = 0; i < ints.length; ++i) {
			list.add(ints[i]);
		}

		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i));
		}

		List<String> list2 = new ArrayList<String>();
		list2.add("Bob");
		list2.add("Abdu");
		list2.add("Sobah");
		for (String x : list2) {
			System.out.println(x);
		}
		String name = list2.get(0); // no downcast required
		System.out.println(name);

		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(new Integer(1));
		list3.add(new Integer(3));
		list3.add(2);
		System.out.println(list3.get(0));
		System.out.println(list3.get(2));
		//list.add("5"); //compiler won’t allow this
		
		List<Employee> empList = new LinkedList<Employee>();
		//List<Employee> empList2 = new LinkedList<>();  same to the above declaration
		
		empList.add(new Employee("Bob", 40000, 1996, 12, 2));
		empList.add(new Employee("Ali", 20000, 1996, 12, 2));
		empList.add(new Employee("Bob", 20000, 1996, 12, 2));
		empList.add(new Employee("Abdu", 50000, 2000, 11, 15));
	
		//String name = (String) empList.get(0); //  
		System.out.println(name);
		System.out.println("b4 sorting with compareto");
		for(Employee e:empList) {
			System.out.println(e);//e.toString();
		}
		
		 Collections.sort(empList, new CompareBySalary());
			
		 System.out.println("After sorting with compareto");	
		 for(Employee e:empList) {
				System.out.println(e);//e.toString();
			}
	}
	

}
class CompareBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		// TODO Auto-generated method stub
		
		return y.getName().compareTo(x.getName());
	}
	
	
}

class Employee {
	
	private String name;
	private int salary;
	private int year;
	private int month;
	private int day;

	public Employee(String name, int salary, int year, int month, int day) {
		// TODO Auto-generated constructor stub
		this.salary = salary;
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public String toString () {
		
		return "Name "+name + "  "+salary; 
		
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}

}
