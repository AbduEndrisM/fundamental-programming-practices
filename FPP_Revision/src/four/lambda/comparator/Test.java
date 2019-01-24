package four.lambda.comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Harry","Bob","Steve","Jack");

		//Sort all employees by first name
	    nameList.sort(Comparator.comparing(e -> e.getFirstName()));
	    
}
		
		//write lambda expression for comparator 
		//Collections.sort(nameList, );

		System.out.println(nameList);

		List<Integer> list = Arrays.asList(5,-3,4);
		//lambda expression with variable declaration
		//easy to read
		//Comparator<Integer> comparator = 

		//list.sort(comparator);
		list.forEach(System.out::println);
	}

}
