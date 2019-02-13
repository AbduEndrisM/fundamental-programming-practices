package stream.two;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Arthmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number = Arrays.asList(2,3,4,5);
		
		List<Integer> square = number.stream()
					.map(x->x*x)
					.collect(Collectors.toList());
				
		 System.out.println(square);
		 
		 

		    // create a list of String 
		    List<String> names = Arrays.asList("Reflection","Sobah", "Collection","Stream"); 
		  
		    // demonstration of filter method start with s
		    List<String>sNames = names.stream()
		    						.filter(x->x.startsWith("S"))
		    						.collect(Collectors.toList());
		    
			 System.out.println(sNames);

	}

}
