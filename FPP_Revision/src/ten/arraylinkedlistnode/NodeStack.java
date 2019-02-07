package ten.arraylinkedlistnode;

import java.util.EmptyStackException;

public class NodeStack {
	private Node top;
    private int size;   // size of the stack

	/** Pushes input onto the stack */
	public void push(Object ob) {
		//implement

		
		Node oldTop = top;
		top = new Node(ob);
        top.next = oldTop;
        size++;
	}
	
	/** Pops the input from the stack */
	public Object pop()  { // throws EmptyStackException {
		//implement
		if(isEmpty())
			throw new EmptyStackException();
		Object rs = top.data;
		top = top.next;
		size--;
		return rs;
	}
	
	/** Returns (but does not remove) the value at the top of the stack */
	public Object peek() { // throws EmptyStackException {
		//implement
		if(isEmpty())
			throw new EmptyStackException();
		return top.data;
	}
	
	/** Returns a string representation of this stack. The string
	 *  consists of all data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {
		//implement
		String result= "";
		if(top == null) return "[]";
		
	
		for (Node x = top; x != null; x = x.next) 
		    result += x.data + " ,";
		
		return result;
	}
	
	/** Returns the number of elements in the stack */
	public int size() {
		//implement
		return size;
	}
	
	/** Returns true if there are no elements in the stack, false otherwise */
	public boolean isEmpty() {
		//implement
		return top == null;
	}
	
	private class Node {
		private Object data;
		private Node next;
		
		private Node(Object data) {
			this.data = data;
		}
	}
	
	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			NodeStack ns = new NodeStack();
			ns.push("Bob");
			System.out.println(ns.size() +": "+ ns);
			ns.push("Harry");
			System.out.println(ns.size() +": "+ ns);
			ns.push("Steve");
			System.out.println(ns.size() +": "+ ns);

			ns.pop();
			System.out.println(ns.size() +": "+ ns);

			ns.push("Bill");
			System.out.println(ns.size() +": "+ ns);

			System.out.println("peeking..." + ns.peek());
//			System.out.println(ns.size());
//			ns.pop();
//			System.out.println(ns.pop());
//			ns.pop();
			System.out.println("isEmpty..." + ns.isEmpty());
//			ns.pop();
		} catch(Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}
		
	}
}
