package six.stringlist;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		if (size == strArray.length)
			resize();
		strArray[size] = s;
		size++;
		// implement
	}

	public String get(int i) {
		// implement
		 
		
		if(i<0||i>=size)
		return null;
		
		return strArray[i];
		
	}

	public boolean find(String s) {
		// implemement

		// using lambda
		/*Optional<String> str = Stream
				.of(strArray)
				.filter(s1 -> s1.equals(s))
				.findAny();
		
		if(str.isPresent()) {
			//System.out.println(str.get());
			return true;
		}*/
			
		
		
		
 		//using for each
		for(String x:strArray) {
			if(s.equals(x))
				return true;
		}
		 
		
		
		
		/* using for loop
		for (int i=0; i<strArray.length;i++)
			if(s.equals(strArray[i]))
				return true;
		 
	*/
		return false;
	}

	public boolean remove(String s) {
		// implement
		int index = -1;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index < 0 || index >= strArray.length - 1)
			return false;
		else {

			String[] temp = new String[strArray.length - 1];
			int remainingElements = strArray.length - (index + 1);
// copying elements that come before the index that has to be removed
			System.arraycopy(strArray, 0, temp, 0, index);
// copying elements that come after the index that has to be removed
			System.arraycopy(strArray, index + 1, temp, index, remainingElements);

			strArray = temp;
			size--;
			return true;
		}

	}

	private void resize() {
		// implement
		String[] temp = new String[strArray.length * 2];
		System.arraycopy(strArray, 0, temp, 0, strArray.length);
		strArray = temp;
	}


	public String toString() {

		String x = "";
		for (int i = 0; i < size; i++) {
			x += strArray[i] + " ";
		}

		return x;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		// copy test code and run it
		MyStringList l = new MyStringList();
		l.add("Bob");
		//l.add("Abdu");
		l.add("edwin");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		 
		System.out.println("The list of size " + l.size() + " is " + l);
//		l.add("Susan");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.add("Mark");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.add("Dave");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.remove("Mark");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.remove("Bob");
//		System.out.println("The list of size " + l.size() + " is " + l);
		System.out.println(l.find("Abdu"));
		System.out.println(l.get(3));
	}


}
