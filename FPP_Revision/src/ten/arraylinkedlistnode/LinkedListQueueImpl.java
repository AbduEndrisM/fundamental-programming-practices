package ten.arraylinkedlistnode;

import java.util.LinkedList;

public class LinkedListQueueImpl {
	
	LinkedList<String> arr;
	
	
	public LinkedListQueueImpl() {
		arr = new LinkedList<String>();
	}

	public String peek() {
		return arr.getFirst().toString();
	}

	public void push(String obj) {
		arr.addLast(obj);
	}

	public void pop() {
		arr.removeFirst();
		System.out.println("popping..");
		
	}

	public boolean isEmpty() {
		return arr.isEmpty();
	}

	public int size() {
		return arr.size();
	}

	 

	@Override
	public String toString() {
		return "LinkedListQueueImpl [arr=" + arr + "]";
	}

	public static void main(String[] args) {

		LinkedListQueueImpl names = new LinkedListQueueImpl();

		names.push("Ravi");  
		names.push("Vijay");  
		names.push("Muu");  
		names.push("Ajay");
		System.out.println(names);

		names.pop();
		names.pop();
		System.out.println(names);

		System.out.println("peeking...." + names.peek());
		names.push("Pont");
		System.out.println(names);

		System.out.println("size: " + names.size());

	}
	
}
