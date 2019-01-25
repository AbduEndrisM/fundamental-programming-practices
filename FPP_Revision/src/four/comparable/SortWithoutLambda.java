package four.comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import four.comparable.Developer;
public class SortWithoutLambda {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		//sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return (Integer) o1.getAge() - o2.getAge();
			}
		});
		
		System.out.println("After Sort by Age");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		//sort by name
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare (Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
				
			}
		});
	
		System.out.println("After Sort by Name");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", 70000, 33));
		result.add(new Developer("alvin", 80000, 20));
		result.add(new Developer("jason", 100000, 10));
		result.add(new Developer("iris", 170000, 55));
		
		return result;

	}
	
}
 