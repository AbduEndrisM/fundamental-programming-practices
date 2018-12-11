package lesson8.problem2;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private final int INITIAL_LENGTH = 4;
	private String lastName;
	private String firstName;
	private int age;

	private int size;
	private String[] objArray;

	public Person() {
		Object[] objArray = new Object[INITIAL_LENGTH];
		size = 0;

	}

	public Person(String last, String first, int a) {
		lastName = last;
		firstName = first;
		age = a;

	}

	public String getLast() // get last name
	{
		return lastName;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + "   FirstName=" + firstName + "   Age=" + age + "]";

	}

	public void add(String p) {
		if (size == objArray.length)
			resize();
		objArray[size] = p;
	}

	/*
	 * public String get(int i) { if (i < 0 || i >= size) { return null; } return
	 * strArray[i]; }
	 * 
	 * public boolean find(String s) {
	 * 
	 * for (int i = 0; i < size; i++) if (strArray[i].equals(s)) return true;
	 * for(String x:strArray) { if(x.equals(s)) return true; }
	 * 
	 * return false; }
	 * 
	 * public void insert(String s, int pos) { if (pos > size) return; if (pos >=
	 * strArray.length || size + 1 > strArray.length) { resize(); } String[] temp =
	 * new String[strArray.length + 1]; System.arraycopy(strArray, 0, temp, 0, pos);
	 * temp[pos] = s;
	 * 
	 * System.arraycopy(strArray, pos, temp, pos + 1, strArray.length - pos);
	 * strArray = temp; ++size;
	 * 
	 * }
	 * 
	 * public boolean remove(String s) { if (size == 0) return false; int index =
	 * -1; for (int i = 0; i < size; ++i) { if (strArray[i].equals(s)) { index = i;
	 * break; } } if (index == -1) return false; String[] temp = new
	 * String[strArray.length]; System.arraycopy(strArray, 0, temp, 0, index);
	 * System.arraycopy(strArray, index + 1, temp, index, strArray.length - (index +
	 * 1)); strArray = temp; --size; return true; }
	 */
	
	private void resize() {
		System.out.println("resizing");
		int len = objArray.length;
		int newlen = 2 * len;
		String[] temp = new String[newlen];
		System.arraycopy(objArray, 0, temp, 0, len);
		objArray = temp;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {

		List<Person> list = new ArrayList();

	/*	list.add(new Person("Abdu", "Edris", 30));
		list.add(new Person("Aradom", "Abdu", 20));
		list.add(new Person("Elias", "Aradom", 25));
*/
		Person p1 = new Person("Ali", "Ethio", 40);
		Person p2 = new Person("Edwin", "Fall", 50);
		list.add(p1);
		list.add(p2);

		// Check both using equals
		boolean res1 = p1.equals(22); // false
		System.out.println(res1);

		list.remove("Ethio");
		System.out.println("The list of size " + list.size() + " is " + list);

		// System.out.println(list.get(1).lastName);
		// System.out.println(list.get(4));
		// System.out.println(list);
		// System.out.println("\n\n");

		// System.out.println("The list of size " + list.size() + " is \n" + list);
		// list.remove("Mark");
	}

}
