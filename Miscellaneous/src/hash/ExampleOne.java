package hash;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Integer> m = new HashMap<>();
		m.put("Abdu", 1);
		m.put("Sobah", 1); 
		m.put("AbduE", 1);
		
		
		List<String> l= new LinkedList<String>();
		
		  
		HashMap <Integer, String> m2 = new HashMap<>();
		m2.put(null, "Abdu");
		m2.put(1,"Abdu"); 
		m2.put(2, "Abdu");
		m2.put(3,"Alex"); 
		m2.put(4, "Sobah");
		
		m2.put(2,"Nega"); 
		m2.put(1, "Abdu");
		
		Set<String> str = new HashSet<String>();
		str.addAll(m2.values());
		
		Set <Integer> s = new HashSet<Integer>();
		
		s.addAll(m2.keySet());
	 	
		System.out.println(m);
		//System.out.println(m.keySet());
	}

}
