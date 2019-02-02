package ten.stack2;

import java.util.NoSuchElementException;

public class StackMyStringLinkedList implements MyStringStack {

	private int size;
	private Node header;

	public StackMyStringLinkedList() {
		// TODO Auto-generated constructor stub
		size = 0;
		header = new Node();

	}

	@Override
	public void push(String string) {
		// TODO Auto-generated method stub
//		Node top = top;
		Node top = header;
		
		if (size == 0) {
			top.next = null;
			top.previous = null;
			top.value = string;
			header=top;

		} else {
			top.next = header;
			top.previous = null;
			top.value = string;
			header = top;	

		}
		size++;

	}

	public String pop() {
		// TODO Auto-generated method stub

		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		String string=header.value;
		
		Node temp = header.next;
		temp.previous=null;
		header=temp;
		size--;
		return string;
		
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size==0)
			return true;
		return false;
	}
	
	

	@Override
	public String toString() {
		String string = "";
//		Node temp = header;
//		int s=size;
////		for (int i = size; i >= 1; i--) {
//		while (s!= 0) {
//			
//			string = string + temp.value + " ";
//			temp = temp.next;
//			s--;
//		}
		return string;

	}

	class Node {
		String value;
		Node next;
		Node previous;

		public Node(Node previous, String value, Node next) {
			this.value = value;
			this.next = next;
			this.previous = previous;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}

	public static void main(String[] args) {
		StackMyStringLinkedList stack = new StackMyStringLinkedList();

		stack.push("Bob");

		System.out.println(stack);	
		stack.push("Harry");
		stack.push("Alice");
//
		System.out.println(stack);
		 System.out.println("Popping…" + stack.pop());
//		System.out.println("Peeking…." + stack.peek());
//		System.out.println("Popping…" + stack.pop());
	}
}
