package one.three;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {


		Employee[] emp = new Employee[3];

		emp[0]=  new Employee("Abdu A", 1000, 2010, 5, 5);
		emp[1]=  new Employee("Abdu B", 2000, 2010, 5, 5);

		Manager mgr=  new Manager("Abdu C", 3000, 2010, 5, 5);
		mgr.setBonus(500);
		
		emp[2]=mgr;
		
		
		
		for(Employee e:emp) {
			System.out.println(e.getName()+", "+e.getSalary());	
		}
		

		System.out.println("/n/n");
		/////Second way
		Employee emp1=  new Employee("Abdu A", 1000, 2010, 5, 5);
		Employee emp2=  new Employee("Abdu B", 2000, 2010, 5, 5);
		Manager manager =  new Manager("Abdu C", 3000, 2010, 5, 5);
		manager.setBonus(8000);
		
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(manager);
		
		for(Employee e: list) {
			System.out.println(e.getName()+"," + e.getSalary());
		}
		
	}

}
