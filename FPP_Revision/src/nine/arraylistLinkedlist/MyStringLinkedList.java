package nine.arraylistLinkedlist;

import java.util.NoSuchElementException;

public class MyStringLinkedList implements LinkedListMethods {

	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	// adds to the front of the list
	public void addFirst(String item) {
		// implement
		Node first = header.next;

		if (first == null) {
			Node n = new Node(header, item, null);
			header.next = n;

		} else {
			Node n = new Node(header, item, first);
			header.next = n;
			first.previous = n;

		}
	}

	public void addLast(String string) {

		if (header.next == null) {
			addFirst(string);
		} else {
			Node temp = header.next;
			while (temp.next != null) {
				temp = temp.next;
			}

			Node temp2 = new Node(null, string, null);

			temp2.value = string;
			temp2.previous = temp;
			temp.next = temp2;
		}

	}

	public String findFirst() {

		if (header.next == null)
			throw new NoSuchElementException();

		else
			return header.next.value;
	}

	public String findLast() {

		if (header.next == null)
			throw new NoSuchElementException();
		else {
			Node temp = header;
			while (temp.next != null) {
				temp = temp.next;
			}
			return temp.value;
		}

	}

	public void removeFirst() {

		if (header.next == null)
			throw new NoSuchElementException();
		else {
			Node first = header.next;
			header.next = first.next;
			header = first.next.previous;

		}

	}

	public boolean isEmpty() {
		if (header.next == null)
			return true;
		return false;

	}

	public int size() {

		int count = 0;
		if (header.next == null)
			return count;
		else {
			Node temp = header.next;
			count++;

			while (temp.next != null) {
				temp = temp.next;
				count++;
			}
		}
		return count;

	}

	public String get(int index) {
		int count = -1;
		if (header.next == null || index >= size() || index < 0)
			throw new NoSuchElementException();
//			return null;
		else {
			Node temp = header.next;
			while (temp != null) {
				count++;
				if (count == index)
					return temp.value;

				temp = temp.next;
			}

		}
		return null;
	}

	public void add(int index, String element) {

		int count = 0;
		if (header.next == null || index > size() || index < 0)
			throw new NoSuchElementException();
//			return null;
		else if (index == 0) {
			addFirst(element);
		} else if (index == size()) {
			addLast(element);
		} else {
			Node temp = header.next;
			while (temp != null) {
				Node temp2 = new Node(null, element, null);
				if (count == index) {
					temp2.next = temp;
					temp2.previous = temp.previous;
					temp.previous.next = temp2;
					temp.previous = temp2;
				}
				count++;
				temp = temp.next;
			}

		}
	}

	public boolean find(String s) {
		if (isEmpty()) {
			return false;
		}
		Node temp = header.next;
		while (temp != null) {
			if (temp.value.equals(s))
				return true;

			temp = temp.next;
		}

		return false;
	}

	public void removeLast() {
		if (isEmpty()) {
			System.out.println("Empty List");
			return;
		}

		Node temp = header.next;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.previous.next = null;
	}

	public boolean remove(int index) {

		if (isEmpty() || index >= size())
			throw new NoSuchElementException();

		if (index == 0)
			removeFirst();
		else if (index == size() - 1)
			removeLast();
		else {
			int count = 0;

			Node temp = header.next;

			while (temp.next != null) {
				if (count == index) {
					temp.previous.next = temp.next;
					temp.next.previous = temp.previous;
				}
				count++;
				temp = temp.next;
			}

		}
		return false;
	}

	public String findMin() {
		if (isEmpty())
			return null;

		Node temp = header.next;
		String min = temp.value;
		while (temp != null) {
			if (temp.value.compareTo(min) < 0) {
				min = temp.value;
			} else
				temp = temp.next;
		}

		return min;
	}

	public String findMax() {
		if (isEmpty())
			return null;

		Node temp = header.next;
		String max = temp.value;
		while (temp != null) {
			if (temp.value.compareTo(max) > 0) {
				max = temp.value;
			} else
				temp = temp.next;
		}

		return max;
	}

	public void sort() {

		if (isEmpty())
			return;

		Node temp = header.next;
		String max = temp.value;

		while (temp != null) {
			if (temp.value.compareTo(max) > 0) {
				
			}

		}
	}


	public String recurMax() {
		
		Node temp = header.next;
		String max = temp.value;
		
		if(temp.value.compareTo(max)>0)
		return recurMax( );
		return max;
		
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node curr = header.next;
		while (curr != null) {
			sb.append(curr.value + "-> ");
			curr = curr.next;
		}
		return sb.toString();
	}

	class Node {
		Node previous;
		String value;
		Node next;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		// StackMyStringLinkedList list = new StackMyStringLinkedList();

		LinkedListMethods list = new MyStringLinkedList();
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
//		System.out.println(list);

		System.out.println(list.size() + ": " + list);

//		list.addLast("Abdu");

//		System.out.println(list);

		/*
		 * System.out.println("Display First: " + list.findFirst());
		 * System.out.println("Display Last: " + list.findLast());
		 */
		/*
		 * list.removeFirst(); System.out.println("	After FIrst removed:\n	"+list);
		 */
//		System.out.println("The array is empty: "+ list.isEmpty());

//		System.out.println("The array size is: "+list.size());

//		System.out.println("The element at index is: "+ list.get(2));

		/*
		 * System.out.println("After adding Abdu at index 2: "); list.add(2, "abdu");
		 * System.out.println(list);
		 */
//		System.out.println("Bob is found in the list:  " + list.find("Bob"));

		/*
		 * System.out.println("After removing the last element: " ); list.removeLast();
		 * System.out.println(list);
		 */

		/*
		 * System.out.println("After removing the second element: "); list.remove(2);
		 * System.out.println(list);
		 */

//		System.out.println("Minimum string:  "+list.findMin());

//		System.out.println("Maximum string:  "+list.findMax());

//		list.sort();
//		System.out.println(list);

		System.out.println("Max using recursive: " + list.recurMax());
		
		
	}

}
