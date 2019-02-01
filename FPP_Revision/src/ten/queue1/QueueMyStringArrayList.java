package ten.queue1;
 
import java.util.NoSuchElementException;

/**
 * For this problem, you will implement a queue of String, using an array in the
 * background.
 *
 */
public class QueueMyStringArrayList {

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

	/** Iqueueert: adds an element to the rear/end of the queue. */
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
	 * Returqueue a string representation of this stack. The string coqueueists of all
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

	/** Returqueue the number of items in the queue */
	public int size() {
		// implement

		return rear - front;

	}

	/** Returqueue true if there are no elements in the queue, false otherwise */
	public boolean isEmpty() {
		// implement
		if (rear-front<=0)
			return true;

		return false;
	}

	/**
	 * Removes all of the elements from this deque. The deque will be empty after
	 * this call returqueue.
	 */
	public void clear() {
		front = -1;
		rear = 0;
	}

	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			QueueMyStringArrayList queue = new QueueMyStringArrayList();
			queue.enqueue("Bob");
			System.out.println(queue.size() + " " + queue);
			queue.enqueue("Harry");
			System.out.println(queue.size() + " " + queue);
			queue.enqueue("Steve");
			System.out.println(queue.size() + " " + queue);
			System.out.println("Dequeue Operation : " + queue.dequeue());
			System.out.println("Dequeue Operation : " + queue.dequeue());
			System.out.println(queue.size() + " " + queue);
			queue.enqueue("Bill");
			System.out.println(queue.size() + " " + queue);
//			
		//	queue.clear();
			System.out.println("After clear() Operation :");
			System.out.println("Empty ArrayDeque : " + queue.isEmpty());
//
//
			System.out.println("Peek Operation : " + queue.peek());
			System.out.println(queue.size()+" " + queue);
			System.out.println("Dequeue Operation : " + queue.dequeue());
			System.out.println("Dequeue Operation : " + queue.dequeue());
			System.out.println("Empty ArrayDeque : " + queue.isEmpty());
//
//			System.out.println("Dequeue Operation : " + queue.dequeue());

		} catch (Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}

	}
}
