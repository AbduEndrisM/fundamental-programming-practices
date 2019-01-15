package hash;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Integer> mm1 = new HashMap<>();
		mm1.put("AbduA", 1);
		mm1.put("AbduB", 2);
		mm1.put("AbduC", 1);
 
	//	System.out.println(mm1); 
/*
		HashMap :- HashMap never preserves your Insertion Order. It Internally Use a hashing Concept by which it generate a HashCode to the Corresponding key and add it to the HashMap.

		LinkedHashMap :- LinkedHashMap It preserves your Insertion Order. and keys will be found as same order you Insert into this LinkedHashMap.

		TreeMap :- The TreeMap class implements the Map interface by using a Tree. A TreeMap provides an efficient means of storing key/value pairs in sorted order, and allows rapid retrieval.

		You should note that, unlike a HashMap, a tree map guarantees that its elements will be sorted in ascending key order
		
		*/
		
		TreeMap <String, Integer> mm2 = new TreeMap<>();
		mm2.put("AbduA", 1);
		mm2.put("AbduC", 1);
		mm2.put("AbduB", 2);
	//	System.out.println(mm2); 
		
		LinkedHashMap <String, Integer> mm3 = new LinkedHashMap<>();
		mm3.put("AbduA", 1);
		mm3.put("AbduC", 1);
		mm3.put("AbduB", 2);
	//	System.out.println(mm3); 
		
		
		
		List<String> l= new LinkedList<String>();
		 
		HashMap <Integer, String> m2 = new HashMap<>();
		m2.put(5, "Abdu");
		m2.put(1,"Abdu"); 
		m2.put(2, "Abdu");
		m2.put(3,"Alex"); 
		m2.put(4, "Sobah");
		m2.put(2,"Nega"); 
		m2.put(1, "Abdu");
	//	System.out.println(m2);
		
		List<String> list = new ArrayList<String>(m2.values());
			System.out.println(Collections.frequency(list, "Abdu"));;
			
			
				
		Set <Integer> s = new HashSet<Integer>();
		
		s.addAll(m2.keySet());
	 	
		////System.out.println(m.keySet());
	}

}
