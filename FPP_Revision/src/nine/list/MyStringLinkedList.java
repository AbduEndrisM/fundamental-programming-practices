package nine.list;

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
		// MyStringLinkedList list = new MyStringLinkedList();

		LinkedListMethods list = new MyStringLinkedList();
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
//		 System.out.println(list.size() + ": " + list);

//		list.addLast("Abdu");

//		System.out.println(list);

//		System.out.println("Display First: " + list.findFirst());
//		System.out.println("Display Last: " + list.findLast());

//		list.removeFirst();
//		System.out.println("	After FIrst removed:\n	"+list);

//		System.out.println("The array is empty: "+ list.isEmpty());

//		System.out.println("The array size is: "+list.size());
		
//		System.out.println("The element at index is: "+ list.get(2));
		
	}



}
