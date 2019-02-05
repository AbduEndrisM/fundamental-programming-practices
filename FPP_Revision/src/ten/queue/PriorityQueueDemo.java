package ten.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo{

	// Java progrm to demonstrate working of priority queue in Java 
	   public static void main(String args[]) 
	    { 
		// Create a Priority Queue of Integer
	        Comparator<String>sortedByStringLength = new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					return o1.length()-o2.length();
				}
	        	
			};
		    Comparator<Integer>sortedDSC = new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o2-o1;
				}
	        	
			};
			

	        // Add items to a Priority Queue (ENQUEUE)
			PriorityQueue<Integer> numbers = new PriorityQueue<>(sortedDSC);
	        
	        numbers.add(750);
	        numbers.add(500);
	        numbers.add(900);
	        numbers.add(100);

	        System.out.println(numbers.peek()+"\n");
	        // Remove items from the Priority Queue (DEQUEUE)
	    /*    while (!numbers.isEmpty()) {
	            System.out.println(numbers.remove());
	        }
*/
	        
	        
	       //Create a Priority Queue of String 
	       // A - 65 a -97
	        PriorityQueue<String> string = new PriorityQueue<>();
	        string.add("EAbdu");
	        string.add("aAbdu");
	        string.add("MAbdu");
	        string.add("BAbdu");
	        
	        System.out.println(string.peek());
	        
	        System.out.println("---------------------------------");
	        List<String> x = new ArrayList<>();
	        x.addAll(string);
	        
	       

	        x.sort(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					return o2.compareTo(o1);
				}
 			});
	        x.forEach(e->{
	        	System.out.println(e);
	        	
	        });
	        
	        System.out.println("---------------------------------");
	        //Create a Priority Queue of String  using comparator
		       // A - 65 a -97
		        
		        				
				PriorityQueue<String> strings = new PriorityQueue<>(sortedByStringLength);
		        strings.add("AbduE");
		        strings.add("aAbduasds");
		        strings.add("Abdu");
		        strings.add("BAbduE");
				
		        
		        System.out.println(strings.peek());
		     

	    } 
}
