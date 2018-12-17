package lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> myInts = new ArrayList<Integer>(25);
		System.out.println("Size of myInts = " + myInts.size());
		for (int k = 0; k < 10; k++)
			myInts.add(3 * k);// Auto boxing
		myInts.set(6, 44);
		System.out.println("Size of myInts = " + myInts.size());

		
		//myInts is Integer type myInts.get() /myInts.size/myInts.remove ..
		//num is int type . length/ [i] / ..
		int num[] = new int[myInts.size()];
		for (int k = 0; k < myInts.size(); k++) {
			num[k] = myInts.get(k); // Unboxing
			System.out.print(myInts.get(k) + " ");
		}
		
		//System.out.println(Arrays.toString(num));  OR
		System.out.println("\n-------------");
		for (int k = 0; k < num.length; k++) {
			 
			System.out.print(num[k] + " ");
		}
		
		myInts.add(null);
		System.out.println("\n" + myInts);
		System.out.println(Arrays.toString(num));
	}

}
