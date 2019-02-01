package ten.queue;

import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

/**
 * For this problem, you will implement a queue of String, using an array in the
 * background.
 *
 */
public class ArrayQueue {

	private final int INITIAL_LENGTH = 2;
	private String[] arr = new String[INITIAL_LENGTH];
	private int front = -1;
	private int rear = 0;

	/**
	 * Retrieves, but does not remove, the element at the front/head of the queue.
	 */
	public String peek() { // throws IllegalStateException
		// implement
		if(isEmpty())
			throw new NoSuchElementException();
		return arr[front];
	}

	/** Retrieves and Remove: removes the element at the front/head of the queue. */
	public String dequeue() { // throws IllegalStateException {
		// implement

		if (front == -1) {
			throw new NoSuchElementException();
		}
		String string = arr[front];

		front++;

		return string;
	}

	/** Insert: adds an element to the rear/end of the queue. */
	public void enqueue(String s) {
		// implement
		if (rear == arr.length)
			resize();
		if ((rear == 0) && (front == -1)) {
			arr[rear++] = s;

			front++;

		}

		else {
			arr[rear++] = s;

		}

	}

	private void resize() {
		String[] temp = new String[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

	private boolean isFull() {
		if (rear == arr.length)
			return true;
		return false;
	}

	/**
	 * Returns a string representation of this stack. The string consists of all
	 * data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {
		// implement
		String string = "";
		for (int i = front; i < rear; i++) {
			string = string + arr[i] + " ";
		}
		return string;

	}

	/** Returns the number of items in the queue */
	public int size() {
		// implement

		return rear - front;

	}

	/** Returns true if there are no elements in the queue, false otherwise */
	public boolean isEmpty() {
		// implement
		if (rear-front<=0)
			return true;

		return false;
	}

	/**
	 * Removes all of the elements from this deque. The deque will be empty after
	 * this call returns.
	 */
	public void clear() {
		front = -1;
		rear = 0;
	}

	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			ArrayQueue ns = new ArrayQueue();
			ns.enqueue("Bob");
			System.out.println(ns.size() + " " + ns);
			ns.enqueue("Harry");
			System.out.println(ns.size() + " " + ns);
			ns.enqueue("Steve");
			System.out.println(ns.size() + " " + ns);
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println(ns.size() + " " + ns);
			ns.enqueue("Bill");
			System.out.println(ns.size() + " " + ns);
//			
		//	ns.clear();
			System.out.println("After clear() Operation :");
			System.out.println("Empty ArrayDeque : " + ns.isEmpty());
//
//
			System.out.println("Peek Operation : " + ns.peek());
			System.out.println(ns.size()+" " + ns);
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println("Empty ArrayDeque : " + ns.isEmpty());
//
//			System.out.println("Dequeue Operation : " + ns.dequeue());

		} catch (Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}

	}
}
