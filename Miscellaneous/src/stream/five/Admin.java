package stream.five;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		List<Student> listStudent=new ArrayList<>();
		
			listStudent= list.stream()
						.filter(x->x.getGpa()>3.0)
						.filter(x->x.getMajor().equals("Computer Science"))
						.collect(Collectors.toList());
		return listStudent;
	}
}
