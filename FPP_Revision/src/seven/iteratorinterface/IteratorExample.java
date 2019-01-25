package seven.iteratorinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorExample   {

	public static void main(String[] args) { 

		List<String> l = new ArrayList<>();
		l.add("Bob");
		l.add("Abdu");
		l.add("Edwin"); 
		l.add("Steve");
		l.add("Susan"); 
		l.add("Mark");
		
		//  MyCollection<String> stringCollection = new MyCollection<String>();
		// Using Iterator
		Iterator myIter = l.iterator();
		while (myIter.hasNext()) {
		System.out.print(myIter.next());
		}
		System.out.println();
		// for each style
		for (String str : l) {
		System.out.print(str.toString());
		}
		System.out.println();
		// using java 8 forEach method with MyStringList
		l.forEach(name -> System.out.print(name));

	}



	 
 
	
}

class MyIterator implements Iterator<String>{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
