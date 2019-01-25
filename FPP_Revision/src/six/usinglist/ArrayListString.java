package six.usinglist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListString {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
//		List<String> l = new LinkedList()<>();
		
		l.add("Bob");
		
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
	 
	
	}

}
