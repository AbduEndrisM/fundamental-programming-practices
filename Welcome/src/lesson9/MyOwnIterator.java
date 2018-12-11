package lesson9;

import java.util.Iterator;

//STEP 1: Implement Iterable
public class MyOwnIterator implements Iterable{

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		
		return new MyIterator();
	}

	//STEP2: To implement Iterator, we create an Inner class
	
	class MyIterator implements Iterator{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
}
