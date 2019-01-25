package four.lambda.comparator;

import java.util.Arrays;
import java.util.List;

public class TestWithLambda {

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Harry", "Bob", "Steve", "Jack");

		// write lambda expression for comparator
		// Collections.sort(nameList, );

		System.out.println("Before sorting");
		nameList.forEach((name) -> System.out.println(name));

		
		//sort 
		nameList.sort((String o1, String o2) -> o1.compareTo(o2));
		System.out.println("After sorting");		
		nameList.forEach((name) -> System.out.println(name));

//		System.out.println(nameList);

		List<Integer> list = Arrays.asList(5, -3, 4);
		list.sort((Integer o1, Integer o2) -> o1-o2);
		
		
		//sort 
		// list.forEach((name) -> System.out.println(name));
		list.forEach(System.out::println);
	}

}
