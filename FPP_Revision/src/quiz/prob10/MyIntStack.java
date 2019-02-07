package quiz.prob10;

public class MyIntStack {
	// DO NOT MODIFY the declaration or initialization of arr
	private Integer[] arr = new Integer[8];

	int top=0;

	/** Returns true if this stack has no elements */
	public boolean isEmpty() {
		// implement
		if (top == 0) // size==0;
			return true;

		return false;
	}

	/**
	 * Pushes an Integer onto the stack. Null inputs are ignored (if the input is
	 * null, the method simply returns, without modifying the stack in any way.)
	 * 
	 * @param x
	 */
	public void push(Integer x) {
		// implement
		if (x == null)
			return;
		else {
			if (isFull())
				resize();
			arr[top++]=x;
			 
		}
	}

	private void resize() {
		// TODO Auto-generated method stub
		Integer[] temp = new Integer[arr.length*2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr=temp;
		
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		if (arr.length == top)
			return true;
		return false;
	}

	/**
	 * Removes and returns the top element of the stack if the stack is not empty.
	 * If the stack is empty when pop is called, it causes a MyStackException to be
	 * thrown
	 */
	public Integer pop() throws MyStackException {
		if(isEmpty()) 
			throw new MyStackException("Is Empty");
		else {

			return arr[--top];
		}
		
		// implement

	}

	/**
	 * Returns, but does not remove, the top element of the stack if the stack is
	 * not empty. If the stack is empty when peek is called, it causes a
	 * MyStackException to be thrown
	 */
	public Integer peek() throws MyStackException {
		
		// implement
		if(isEmpty()) 
			throw new MyStackException("Is Empty");
		else {
			int x= top-1;
			return arr[x];	
		}
	}

}
