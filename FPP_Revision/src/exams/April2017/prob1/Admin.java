package exams.April2017.prob1;

import java.util.*;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		// implement
		HashMap<Key, Student> table = new HashMap<>();
		Key key;
		for (Student k : students) {
			key = new Key(k.getFirstName(), k.getLastName());

			table.put(key, k);
		}

		return table;
	}
}
