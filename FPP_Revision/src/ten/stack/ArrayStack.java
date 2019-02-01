package ten.stack;

import java.util.NoSuchElementException;

/**
 * For this problem, you will implement a stack of String, 
   using an array in the background.
 *
 */
public class ArrayStack {
	
	private final int INITIAL_LENGTH = 2;
	private int top;
	private String[] stackArray;
	
	public ArrayStack() {
			//implement
		stackArray = new String [INITIAL_LENGTH];
		top=0;
	}
	
	/** Pushes input onto the stack */
	public void push(String s) {
		// implement
		if(top==stackArray.length)
			resize();
		stackArray[top]= s;
		top++;
		

	}
	
	private void resize() {
		String[] temp = new String[stackArray.length*2];
		System.arraycopy(stackArray, 0, temp, 0, top);
		stackArray =temp;
	}

	/** Pops the input from the stack */
	public String pop()  { // throws EmptyStackException {
		//implement
		if(isEmpty()==true)
			 throw new NoSuchElementException();
		
		String topElement = stackArray[--top];
 
		return topElement;
	}
	
	/** Returns (but does not remove) the value at the top of the stack */
	public String peek() { // throws EmptyStackException {
		//implement
		int peekElement=top-1;
		return stackArray[peekElement];
		
	}
	
	/** Returns a string representation of this stack. The string
	 *  consists of all data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {
		//implement
		String string ="";
		for(int i=0;i<top;i++) {
			string=string + stackArray[i] + " ";
		}
		return string;
	}
	
	/** Returns the number of elements in the stack */
	public int size() {
		//implement
		return top;
	}
	
	/** Returns true if there are no elements in the stack, false otherwise */
	public boolean isEmpty() {
		//implement
		if(top==0)
			return true;
			return false;
	}

	/**
	 * It determines whether an String exists in the stack. 
	 * If the element is found, it returns the 1-based position of the element from the top of the stack. 
	 * Else, it returns -1.
	 * 
	 */
	public int search(String o) {
		//implement
		int index = -1;
		if (isEmpty()==true)
			return index;
		
		for(int i=0;i<stackArray.length;i++) {
			if(o.equals(stackArray[i]))
				index=i;
		}
		
        return index;
    }
	
/*	private int lastIndexOf(String o) {
		//implement
		int pos = -1;
		for (int i = 0; i < top; i++) {
			if(stackArray[i].equals(o)){
				pos = i;
				break;
			}
		}
		return pos;
	}*/

	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			ArrayStack ns = new ArrayStack();
			ns.push("Bob");
			System.out.println(ns.size()+" " + ns);
			ns.push("Harry");
			System.out.println(ns.size()+" " + ns);
			ns.push("Steve");
			System.out.println(ns.size() +" "  + ns); 
			System.out.println("Pop Operation : " + ns.pop()); 
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println(ns.size()+" " + ns);
			ns.push("Bill");
			System.out.println(ns.size()+" " + ns);
	        System.out.println("Search() Operation :Bob:  "  + ns.search("Bob"));
//
			System.out.println("Peek Operation : " + ns.peek());
			System.out.println(ns.size());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Empty stack : " + ns.isEmpty());
//
//			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Empty stack : " + ns.isEmpty());

		} catch(Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}
		
	}
}
