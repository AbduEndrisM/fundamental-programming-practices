package lesson9.problem2;

class Node {
	int data;
	Node next;
	Node previous;

	Node(Node previous, int value, Node next) {
		this.previous = previous;
		this.data = value;
		this.next = next;
	}

	public String toString() {
		return "Value: " + data;
	}
}

//User Implementation of Stack 
interface Stack1 {
	public void push(int ob);

	public Object pop();

	public Object peek();

	public boolean isEmpty();

	public int size();
}

class ArrayStack implements Stack1 {
	private int sizeOfStack;
	private Node topElement;

	public boolean isEmpty() {
		return topElement == null;
	}

	public void Initialize() {
		sizeOfStack = 0;
		topElement = null;
	}

	public void push(int x) {

		Node oldElement = topElement;
		topElement = new Node(null, x, null);
		topElement.next = oldElement;
		topElement.previous = null;
		
		// oldElement.previous = topElement; // <----- problem here

		sizeOfStack++;
	}

	public Object pop() {
		if (!isEmpty()) {
			// topElement = topElement.next; // delete first node
			sizeOfStack--;
		}
		return topElement;
	}

	public Object peek() {
		int data = topElement.data;
		// System.out.println("Top element is "+data);
		return data;

	}

	public int size() {

		return sizeOfStack;
	}

}

public class StackDoublyLinkedList {
	public static void main(String[] args) {
		ArrayStack stk = new ArrayStack(); // create stack of size 4
		 
		Object item;
		stk.push(1); // push 3 items onto stack
		stk.push(2);
		stk.push(3);
		stk.push(4);

		System.out.println("size(): " + stk.size());
		item = stk.pop(); // delete item
		System.out.println(item + " is deleted");
		stk.push(5); // add three more items to the stack
		stk.push(6);
		System.out.println(stk.pop() + " is deleted");
		stk.push(7); // push one item
		item = stk.peek(); // get top item from the stack
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the Stack : " + stk.size());
	}

}
