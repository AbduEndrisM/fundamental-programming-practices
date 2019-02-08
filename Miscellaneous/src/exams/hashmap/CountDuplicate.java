package exams.hashmap;
 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class CountDuplicate {

	public static void main(String[] args) {

		Stack <Employee> emp = new Stack<>();
		
//		emp.push(new Employee("abduA", "edris", 1111));
//		emp.push(new Employee("abduB", "edris", 2222));
		emp.push(new Employee("abduC", "edrisM", 3333));
		emp.push(new Employee("abduD", "edris", 444));
		emp.push(new Employee("abduC", "edrisM", 3333));
		emp.push(new Employee("abduD", "edris", 444));
		emp.push(new Employee("abduC", "edrisa", 3333));
		emp.push(new Employee("abduD", "edris", 444));
		
		
		
		HashMap <String, Integer> table = new HashMap<>();
		  
		
		for(Employee e:emp) {
			int count =0;
			if(table.keySet().contains(e.lName)) {
				count++;
			table.put(e.lName, table.get(e.lName)+1);
		}
			else {
				count=1;
				table.put(e.lName,count);

			}
	}
System.out.println(table);
}
}
