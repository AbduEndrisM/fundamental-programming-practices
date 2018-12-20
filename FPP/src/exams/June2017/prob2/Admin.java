package exams.June2017.prob2;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		/* implement */
		List<Student> s = new ArrayList<>();
		for(Object o:studentArray)
			s.add((Student)o);
		return s;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		/*implement */ 
		double total=0.0;
		int x= studentList.size();
		for (Student s:studentList)
			total=+total+s.computeGpa();
		
		return total/x;
	}
}
