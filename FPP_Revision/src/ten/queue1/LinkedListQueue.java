package ten.queue1;

import java.util.LinkedList;
 

/**
 * For this problem, you will implement a queue of String,
 *
 * using a linked list in the background.
 *
 */
public class LinkedListQueue {

//	LinkedList<String> ll;
	Node header;
	public LinkedListQueue() {
		// TODO Auto-generated constructor stub
		header = new Node();
		
	}
	public String peek() {
		return null;
	}

	public void push(String obj) {

		if(header.next==null)
			
	}

	public void pop() {

	}

	public boolean isEmpty() {
		return false;
	}

	public int size() {
		return 0;
	}

	@Override
	public String toString() {
		return "";
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

		LinkedListQueue names = new LinkedListQueue();
		names.push("Ravi");
		names.push("Vijay");
		names.push("Muu");
		names.push("Ajay");
		System.out.println(names);
//
//		names.pop();
//		names.pop();
//		System.out.println(names);
//
//		System.out.println("peeking...." + names.peek());
//		names.push("Pont");
//		System.out.println(names);
//
//		System.out.println("size: " + names.size());

	}

}
