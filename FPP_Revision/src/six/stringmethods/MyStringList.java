package six.stringmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStringList  {
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

		// using lambda stream
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
	private void sort() {
		// implement 
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if (strArray[j].compareTo(strArray[i])<0) {
					String temp =strArray[j];
					strArray[j]=strArray[i];
					strArray[i]=temp;
				}
			}
		
	//Arrays.sort(strArray);
	
	}
	}

	
	
	
	
	public boolean binarySearch(String key) {
		// implement
		sort();	
	    int l = 0, n = strArray.length - 1; 
        while (l <= n) { 
            int m = l + (n - l) / 2;  
            if (strArray[m].compareTo(key)==0)
                return true;  
            if (strArray[m].compareTo(key)<0) 
                l = m + 1; 
   
            else
                n = m - 1; 
        } 
   
        return false; 
    }
	
	
	
	public void insert(String s, int pos) {
		// implement

		String[] temp = new String[strArray.length + 1];
		int remainingElements = strArray.length - (pos + 1);
//copying elements that come before the index that has to be removed
		System.arraycopy(strArray, 0, temp, 0, pos);
//copying elements that come after the index that has to be removed
		System.arraycopy(strArray, pos, temp, pos+1, remainingElements);
		temp[pos]=s;
		strArray = temp;
		size++;
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
		l.add("Edwin");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		 
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.remove("Mark");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.remove("Bob");
//		System.out.println("The list of size " + l.size() + " is " + l);
		System.out.println(l.find("Abdu"));
		System.out.println(l.get(3));

		l.insert("sobah", 1);
		System.out.println(l);
		l.sort();
		System.out.println(l);
		
		System.out.println("Edwin is in the list: "+l.binarySearch("Edwin"));
		
 

		Iterator<String> myIter = l.iterator();
		while (myIter.hasNext()) {
		System.out.print(myIter.next()+" ");
		}
		
	}

	private Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	 
 

}
