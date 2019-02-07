package ten.arraylinkedlistnode;

import java.util.EmptyStackException;
/**
 * For this problem, you will implement a stack of String, using an array in the background.
 *
 */
public class ArrayStack {

	private final int INITIAL_LENGTH = 10;
	private int top;
	private String[] stackArray;

	public ArrayStack() {
		stackArray = new String[INITIAL_LENGTH];
		top = 0;
    }

	/** Pushes input onto the stack */
	public void push(String s) {
		// implement
		stackArray[top] = s;
		top++;

	}

	/** Pops the input from the stack */
	public Object pop()  { // throws EmptyStackException {
		//implement
		if(top == 0)
			throw new EmptyStackException();
		String str = stackArray[top - 1];
		top--;//
		return str;
	}

	/** Returns (but does not remove) the value at the top of the stack */
	public Object peek() { // throws EmptyStackException {
		//implement
		if(top == 0)
			throw new EmptyStackException();



		return stackArray[top-1];
	}

	/** Returns a string representation of this stack. The string
	 *  consists of all data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {
		//implement
		String  result ="[";

		for (int i = 0 ; i < top; i++) {
			if (i == top - 1)
				result += stackArray[i] + "]";
			else
				result += stackArray[i] + ", ";
		}

		return result;
	}

	/** Returns the number of elements in the stack */
	public int size() {
		//implement
		return top;
	}

	/** Returns true if there are no elements in the stack, false otherwise */
	public boolean isEmpty() {
		//implement
		return top==0;
	}

	/**
	 * It determines whether an object exists in the stack.
	 * If the element is found, it returns the 1-based position of the element from the top of the stack.
	 * Else, it returns -1.
	 *
	 */
	public int search(Object o) {
		//implement
//        int i = lastIndexOf(o);
//
//        if (i >= 0) {
//            return size() - i;
//        }
        return lastIndexOf(o);
    }

	private int lastIndexOf(Object o) {
		//implement
		int pos = -1;
		for (int i = 0; i < top; i++) {
			if(stackArray[i].equals(o)){
				pos = i;
				break;
			}
		}
		return pos;
	}

	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			ArrayStack ns = new ArrayStack();
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
	        System.out.println("Search() Operation : "  + ns.search("Bob"));


//
			System.out.println("Peek Operation : " + ns.peek());
			System.out.println(ns.size());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Empty stack : " + ns.isEmpty());
//
			System.out.println("Pop Operation : " + ns.pop());
//			System.out.println("Empty stack : " + ns.isEmpty());

		} catch(Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}

	}
}
