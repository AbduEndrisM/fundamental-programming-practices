package ten.queue2;

import java.util.LinkedList;
 
/**
 * For this problem, you will implement a queue of String,
 *
 * using a linked list in the background.
 *
 */
public class QueueMyStringLinkedList {

//	LinkedList<String> ll;
	Node header;
	Node front;
	Node rear;
int size;
	public QueueMyStringLinkedList() {
		// TODO Auto-generated constructor stub
//		header = new Node();
		rear = null;
		front = null;
		size=0;
	}

	public String peek() {
		return null;
	}

	public void push(String obj) {

		if(isEmpty()) {
		rear = new Node();	
		rear.next=null;
		rear.previous=null;
		rear.value=obj;
		front = rear;
		size++;
		}
		else {
			Node temp = rear;
			rear = new Node();
			rear.next=null;
			rear.previous=temp;
			rear.value=obj;
			temp.next=rear;
		}
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
		String s="";
		Node temp = front;
    	while(temp != null){
    		s += temp.value + " ,";
    		temp = temp.next;
    	}
    	return s;
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

		QueueMyStringLinkedList names = new QueueMyStringLinkedList();
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
