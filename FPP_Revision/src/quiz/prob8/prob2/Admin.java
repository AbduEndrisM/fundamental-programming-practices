package quiz.prob8.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Admin {
	public static List<Student>/*<implement>*/ convertArray(Student[] studentArray) {
		/* implement */
		List<Student>list = new ArrayList<>();
		list.addAll(Arrays.asList(studentArray));
//		for(Student s:studentArray) {
//			list.add(s);
//		}
//		
		
		return list;
	}
	
	
	public static double computeAverageGpa(List<Student>/*<implement>*/ studentList) {
		/*implement */
		double avg=0.0;
		for(Student s:studentList) {
			avg+=s.computeGpa();
		}
		return avg/studentList.size();
	}
}
