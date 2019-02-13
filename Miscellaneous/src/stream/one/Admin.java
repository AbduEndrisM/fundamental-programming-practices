package stream.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//In this problem, you will create a Stream pipeline to output the list of all Students from 
//the original list that have a gpa greater than 3.0 and have a major of "Computer Science".
//You will use the start-up code provided in your Eclipse workspace to implement your solution.
public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		
		List<Student>std  = new ArrayList<>();
//		list.forEach(e->{
//			if(e.getGpa()>3.0 && (e.getMajor().equals("Computer Science"))) {
//				std.add(e);
//			}
//				
//		});
//	 
		std = list.stream()
			.filter(x->x.getGpa() > 0)
			//.map(x->x.getName())
			//.filter(x->x.getMajor().equals("Computer Science"))
			.collect(Collectors.toList());
			//.reduce()
			//.map
		
		List<String> names = list.stream()
				.filter(x->x.getGpa() > 3.0)
				.map(x->x.getName())
				//.filter(x->x.getMajor().equals("Computer Science"))
				.collect(Collectors.toList());
		
		
		double avg = list.stream()
				
				.mapToDouble(x -> x.getGpa())
				.reduce(0, (x,y) -> x+y);
		System.out.println("The sum of all GPA is: " + avg);
				
		return std;
		
		
	}
}
