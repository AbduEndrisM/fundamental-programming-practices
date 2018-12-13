package lesson9.problem1;

public class MyStringLinkedList {
	Node header;
	int size;

	MyStringLinkedList() {
		header = null;

	}

	public void addSort(String item) {
		// Implement
		if (header == null) {
			header = new Node (null,item,null);
		}
		else if (header.next==null && header.previous==null) {
			if (header.value.compareTo(item)>0) {
				Node x = new Node(null, item, header);
				header.previous=x;
				
				header.next=null;

			}
			else {
				Node x = new Node(header, item, null);
			header.next=x;
			}

		}
		else {
			Node temp = header;

			while (temp!=null) {
				if (temp.value.compareTo(item) > 0) {

					Node x = new Node(temp.previous, item, temp);

					temp.previous = x;
					temp.previous.next = x;
				}
				temp = temp.next;

			}
			
		}

	} // insert in a Sorted Order

	public int size() {
		// Implement
		int count = 0;
		Node temp = header;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public boolean isEmpty() {
		// Implement
		if (header == null) // if (header.previous == null && header.next == null && header.value == null)
			return true;
		return false;
	}

	public Node getFirst() {
		// Implement
		if (header == null) {
			return null;
		}

		return header;
		/*
		 * Node temp =header; return temp;
		 */
	}

	public Node getLast() {
		// Implement
		if (header == null) {
			return null;
		} else {
			Node temp = header;
			while (temp.next != null) {
				temp = temp.next;
			}
			return temp;
		}

	}

	public boolean contains(String item) {
		// Implement
		if (header == null) {
			return false;
		}

		else {
			Node temp = header;
			boolean x = false;
			while (temp != null) {
				if (temp.value.compareTo(item) == 0) {
					x = true;
					break;
				}
				temp = temp.next;
			}
			return x;
		}
	}

	public void removeFirst() {
		// Implement
		if (header == null)
			return; // System.out.println("Empty LL");
		if (header.next == null)
			header = null;
		else {
			header.next.previous = null;
			header = header.next;
		}
	}

	public void removeLast() {
		// Implement

		if (header == null) {
			return;
		}
		if (header.next == null)
			header = null;

		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;

		}
		temp.previous = null;
		temp = null;
	}

	public void print() {

		// empty LL
		if (header == null) {
			System.out.println("Empty LL");
		}

		print(header);

	}

	// Write a recursive print method to display the elements in the list.
	void print(Node n) {
		if (n == null) // Last list
			return;
		else {
			Node m;
			System.out.println(n.value);
			m = n.next;
			print(m);
		}
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods
		mySL.addSort("Abdu");
		mySL.addSort("Elias"); 
		mySL.addSort("ARADOM"); 
		mySL.addSort("Abdu");
		mySL.addSort("Elias"); 
		mySL.addSort("Ethio"); 
 
		mySL.print();
		System.out.println("First" + mySL.getFirst().value);
		System.out.println("Last"+ mySL.getLast().value);
		System.out.println("Is empty "+mySL.isEmpty());
		System.out.println("Elias is found "+mySL.contains("ELias"));
		System.out.println("Size "+mySL.size());

	}

}
