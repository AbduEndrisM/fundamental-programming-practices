package exams.June2017.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Admin {
	public static List<Student>/*<implement>*/ convertArray(Student[] studentArray) {
		/* implement */
		/*List<Student>list = new ArrayList<>();
		list.addAll( Arrays.asList(studentArray));
		*/
		List<Student>list = Arrays.asList(studentArray);
		/*for(Student s:studentArray) {
			list.add(s);
		}
		*/
		return list;
	}
	
	
	public static double computeAverageGpa(List<Student>/*<implement>*/ studentList) {
		/*implement */
		double gpa=0.0;
		for(Student s:studentList) {
			gpa=gpa+s.computeGpa();
		}
		gpa=gpa/studentList.size();
		return gpa;
	}
}
