package lesson8_1.problem2;

public class PersonList {
	private final int INITIAL_LENGTH = 4;
	private Person[] personArray;
	private int size;

	public PersonList() {
		personArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	public void add(Person p) {
		if (size == personArray.length)
			resize();
		personArray[size++] = p;
	}

	public Person get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return personArray[i];
	}

	public boolean find(String lastName) {

		for (Person test : personArray) {
			if (test.getLast().equals(lastName))
				return true;
		}
		return false;
	}

	public void insert(Person s, int pos) {
		if (pos > size)
			return;
		if (pos >= personArray.length || size + 1 > personArray.length) {
			resize();
		}
		Person[] temp = new Person[personArray.length + 1];
		System.arraycopy(personArray, 0, temp, 0, pos);
		temp[pos] = s;

		System.arraycopy(personArray, pos, temp, pos + 1, personArray.length - pos);
		personArray = temp;
		++size;

	}

	public boolean remove(String s) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (personArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		Person[] temp = new Person[personArray.length];
		System.arraycopy(personArray, 0, temp, 0, index);
		System.arraycopy(personArray, index + 1, temp, index, personArray.length - (index + 1));
		personArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = personArray.length;
		int newlen = 2 * len;
		Person[] temp = new Person[newlen];
		System.arraycopy(personArray, 0, temp, 0, len);
		personArray = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(personArray[i] + ", ");
		}
		sb.append(personArray[size - 1] + "]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {

		PersonList l = new PersonList();

		l.add(new Person("Abdu", "Dave", 12));
		l.add(new Person("Birhane", "Elias", 12));
		l.add(new Person("Aradom", "Dawit", 32));

		System.out.print("The list of size " + l.size() + " is " + l);

		System.out.println("After removing  Dave");

		l.remove("Abdu");
		System.out.print("The list of size " + l.size() + " is " + l);

		System.out.println("After Inserting");
		Person p1 = new Person("Sobah", "Fall", 80);
		l.insert(p1, 1);
		System.out.print("The list of size " + l.size() + " after inserting  into pos 3 is " + l);

		MinSort ms = new MinSort(l.personArray);
		ms.sort();
		System.out.println("------------------------------");
		System.out.println(l);

		Search se = new Search(l.personArray);
		boolean r = se.search("Abdu");
		System.out.println(r);

	}

}
