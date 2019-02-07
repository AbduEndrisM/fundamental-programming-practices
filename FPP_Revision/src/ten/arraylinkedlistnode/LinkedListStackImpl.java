package ten.arraylinkedlistnode;

import java.util.LinkedList;
/**
 * For this problem, you will implement a stack of String,
 *
 * using  a linked list in the background.
 *
 */
public class LinkedListStackImpl {

	LinkedList<String> arr;


	public LinkedListStackImpl() {
		arr = new LinkedList<String>();
	}

	public String peek() {
		return arr.getLast().toString();
	}

	public void push(String obj) {
		arr.addLast(obj);
	}

	public String pop() {
		return arr.removeLast();

	}

	public boolean isEmpty() {
		return arr.isEmpty();
	}

	public int size() {
		return arr.size();
	}

	@Override
	public String toString() {
		return  arr.toString() ;
	}

	public static void main(String[] args) {

		LinkedListStackImpl ns = new LinkedListStackImpl();

		ns.push("Bob");
		ns.push("Harry");
		System.out.println(ns.size()+" " + ns);
		ns.push("Steve");
		System.out.println(ns.size() +" "  + ns);
		System.out.println("Pop Operation : " + ns.pop());
		System.out.println("Pop Operation : " + ns.pop());
		System.out.println(ns.size()+" " + ns);
		ns.push("Bill");
		System.out.println(ns.size()+" " + ns);

		System.out.println("Peek Operation : " + ns.peek());
		System.out.println(ns.size());
		System.out.println("Pop Operation : " + ns.pop());
		System.out.println("Pop Operation : " + ns.pop());
		System.out.println("Empty stack : " + ns.isEmpty());

		System.out.println("Pop Operation : " + ns.pop());
		System.out.println("Empty stack : " + ns.isEmpty());

	}

}
