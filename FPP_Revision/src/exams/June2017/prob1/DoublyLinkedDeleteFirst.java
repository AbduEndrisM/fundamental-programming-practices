package exams.June2017.prob1;



public class DoublyLinkedDeleteFirst {
	
	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}
	
	//removes the node at position 1 and returns
	//the string contained in that node
	public String deleteFirst() {
		//implement
		
		if (isEmpty())
			throw new IllegalStateException();
		else {
			Node temp = header.next;

			Node temp2 =temp.next;
			if (temp.next==null)
				throw new  IllegalStateException();
			else {
				temp.next=temp2.next;
			
				temp2.next.previous=temp.next;
				
			}
			return temp2.value;	
		}
		
	}
	
	public boolean isEmpty() {
		//implement
		 
		if (header.next==null)
		return true;
		
			return false;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}
		Node n = new Node();
		n.value = item;
		next.next = n;
		n.previous = next;

	}
	
	

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		list.addLast("Bob");
		list.addLast("Abdu");
		list.addLast("Tom");
		list.addLast("Bill");
		list.addLast("Ethio");
		list.addLast("Tom");
		String deleted = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted);
		System.out.println(list);

	}
}
