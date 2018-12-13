package lesson9.problem1;

public class MyStringLinkedList {
	Node header;
	int size;

	MyStringLinkedList() {
		header = null;
		size = 0;
	}

	public void addSort(String item) {
		// Implement
		if (header == (null)) {
			header = new Node(null, item, null);
	 
		} 

		else {
			
			header = new Node(header, item, null);
			 
			header.previous = header;
		 
		}

	} // insert in a Sorted Order

	 

	public int size(){ 
        // Implement
		
	 }

	public boolean isEmpty() {
		// Implement
		if (header==null)
		//if (header.previous == null && header.next == null && header.value == null)
			return true;
		return false;
	}

	public Node getFirst() {
		// Implement
		for (Node n:header)

	}

	public Node getLast() {
		// Implement
	}

	public boolean contains(String item) {
		// Implement
		Node temp = header;
	}

	public void removeFirst() {
		// Implement
		 if (header==null)
			 System.out.println("Empty LL");
		Node temp = header;
		while (temp.previous!=null) {
			temp = header.previous;
		}
		
		temp.next.previous=null;
		temp=null;
	}

	void removeLast() {
		// Implement
		 if (header==null)
			 return;
		header.previous=null;
		header=null;
	}

	public void print() {
		print(header);
	}

	// Write a recursive print method to display the elements in the list.
	void print(Node n) {
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

	}

}
