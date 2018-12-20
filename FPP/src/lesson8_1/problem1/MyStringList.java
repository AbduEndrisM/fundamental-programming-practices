package lesson8_1.problem1;

import java.util.Collections;
import java.util.List;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		if (size == strArray.length)
			resize();
		strArray[size++] = s;
	}

	public String get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return strArray[i];
	}
	/*
	 * public boolean find(String s) { for (String test : strArray) { if
	 * (test.equals(s)) return true; } return false; }
	 */
	/*
	 * public void insert(String s, int pos){ if(pos > size) return; if(pos >=
	 * strArray.length||size+1 > strArray.length) { resize(); } String[] temp = new
	 * String[strArray.length+1]; System.arraycopy(strArray,0,temp,0,pos); temp[pos]
	 * = s;
	 * 
	 * System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos); strArray =
	 * temp; ++size; }
	 */

	public void insert(String s, int pos) {
		if (pos > size)
			return;
		if (pos >= strArray.length || size + 1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length + 1];
		for (int i = 0; i < pos; i++)
			temp[i] = strArray[i];
		temp[pos] = s;
		for (int i = pos + 1; i < strArray.length; i++)
			temp[i] = strArray[i - 1];
		strArray = temp;
		++size;
	}

	public boolean remove(String s) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		String[] temp = new String[strArray.length]; // new String [strArray.length-1]
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index, strArray.length - (index + 1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize() {
		// System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2 * len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray, 0, temp, 0, len);
		strArray = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(strArray[i] + ", ");
		}
		sb.append(strArray[size - 1] + "]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public void minSort() {
		if (strArray == null || strArray.length <= 1)
			return;
		int len = size;
		int temp = 0;
		for (int i = 0; i < len; ++i) {
			int nextMinPos = minpos(i, len - 1);
			swap(i, nextMinPos);
		}
	}

	// find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top) {
		String m = strArray[bottom];
		int index = bottom;
		for (int i = bottom + 1; i <= top; ++i) {
			if (strArray[i].compareTo(m) < 0) {
				m = strArray[i];
				index = i;
			}
		}
		// return location of min, not the min itself
		return index;
	}

	void swap(int i, int j) {
		String temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;

	}

	public boolean search(String x1) {

		for (int i = 0; i < size; i++)
			if (strArray[i].equals(x1))
				return true;

		/*
		 * for(String test : strArray){ if(test.equals(x1)) return true; }
		 */

		return false;

	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();

		l.add("big");
		l.add("small");
		l.add("tall");
		l.add("short");
		l.add("round");
		l.add("square");
		l.add("enormous");
		l.add("eargantuan");
		l.add("lilliputian");
		l.add("numberless");
		l.add("none");
		l.add("vast");
		l.add("miniscule");

		/*
		 * System.out.println("The list of size " + l.size() + " is " + l);
		 * l.remove("Mark"); l.remove("Bob"); 
		 * System.out.println("The list of size " + l.size() + " is " + l); 
		 * l.insert("Richard", 3);
		 * System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l); 
		 * l.insert("Tonya", 0);
		 * System.out.println("The list of size " + l.size() +
		 * " after inserting Tonya into pos 0 is " + l);
		 * 
		 */

		// b4 sort
		 
		System.out.println("b4 sorting :");
		System.out.println(l);

		// MinSort
		System.out.println("After sorting :");
		l.minSort();
		System.out.println(l);

		// search

		boolean x1 = l.search("number");
		boolean x2 = l.search("tall");
		System.out.println("Search for 'number' - " + x1);
		System.out.println("Search for 'tall' - " + x2);

	}

}
