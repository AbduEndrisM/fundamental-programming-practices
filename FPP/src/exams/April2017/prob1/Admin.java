package exams.April2017.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> table = new HashMap<>();
		Key k;
		
		for(Student s:students) {
			k = new Key (s.getFirstName(),s.getLastName());
			table.put(k, s);
		}
		return table;
	}
	 
}
	
