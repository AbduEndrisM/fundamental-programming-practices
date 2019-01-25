package seven.iteratorinterface;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListWithIterator   {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
//		List<String> l = new LinkedList()<>();
		
		l.add("Bob");
		
		//System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		//System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
	//	System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
	//	System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		//System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		//System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
	 
	 
		    System.out.println("----------------");
		Iterator<String> myIter = l.iterator();
		while (myIter.hasNext()) {
		System.out.print(myIter.next()+" ");
		
		}
		System.out.println("\n--------------------");
		for (String s:l)
			System.out.print (s+" ");
		System.out.println("\n------------------");
		
	   l.forEach(s->System.out.print(s+" "));
	
}
		
	 
	
	}
