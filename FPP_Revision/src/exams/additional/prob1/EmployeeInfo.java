package exams.additional.prob1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import exams.additional.prob1.util.*;
public class EmployeeInfo {
	
	/**
	 * Removes from a copy of the input list all duplicate Employees,
	 * and then returns this list.
	 * 
	 * An Employee instance is considered to be a duplicate of another Employee
	 * instance if the two instances have the same name and salary.
	 */
	public static List<Employee> removeDuplicates(List<Employee> employees) {
		//IMPLEMENT
		List<Employee>list = new ArrayList<>();
		for(int i=0;i<employees.size();i++) {
			if (list.contains(employees.get(i))==false) {
				list.add(employees.get(i));
			}
		}
		return list;
	}
	
	
	//DO NOT MODIFY
	/**
	 * Use the main method to test your solution
	 */
	public static void main(String[] args) {	
		List<Employee> myDupsRemoved = removeDuplicates(TestData.originalList);
		System.out.println(myDupsRemoved);
		boolean dupsCorrectlyRemoved = Util.listsAreEqual(TestData.dupsRemoved, myDupsRemoved);
		System.out.println("Is answer correct? " + dupsCorrectlyRemoved);
	}
	
	

	 
}
