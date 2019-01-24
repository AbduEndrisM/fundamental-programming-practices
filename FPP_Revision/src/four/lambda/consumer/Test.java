
package four.lambda.consumer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Bob", "Harry", "Steve", "Jack");

		// write lambda expression for Consumer interface
		// nameList.forEach();
System.out.println(LocalDate.now());
System.out.println(LocalDateTime.now());

		System.out.println("for each");
		for (String s : nameList) {
			System.out.print(s);
		}
		System.out.println("\n\nUsing lambda");
		
		nameList.forEach(n -> {
			System.out.println(n);
		});

	}

}
