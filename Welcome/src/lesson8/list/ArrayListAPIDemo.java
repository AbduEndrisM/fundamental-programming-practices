package lesson8.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Parameterized Type - accepts only same types of array 
		ArrayList<String> sList= new ArrayList(Arrays.asList("FPP","MPP","WAP"));
		List<String> plist = new ArrayList();
		
		
		//Raw Type - accepts all types = object
		ArrayList list = new ArrayList();
		list.add(12);
		list.add("Abdu");
		list.add(45.5);
		
		//to access this values we are supposed to downcast 
		int z= (int) list.get(0); // int = downcast from object type
		
		
		plist.add("FPP");
		plist.add("WAP");
		plist.add("Java");
		
		System.out.println(plist.size());
		System.out.println(plist);
		System.out.println(plist.isEmpty());
		plist.add(1, "WAA");
		
		//Sorting - We can sort using collection utility class
		
		//Collections.sort(plist, Collections.reverseOrder());
		Collections.sort(plist);
		System.out.println(plist);
		int xx= Collections.binarySearch(plist, "Java");
		System.out.println(xx);
		

	}

}
