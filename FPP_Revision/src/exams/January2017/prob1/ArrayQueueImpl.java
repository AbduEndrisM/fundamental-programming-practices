package exams.January2017.prob1;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() throws QueueException {
		if (isEmpty())
			throw new QueueException("No Element");

		else
			return arr[front];
		// implement
	}

	public void enqueue(int obj) throws QueueException {
		// implement
		if (isFull()) {
			resize();
		} else {

			if (isEmpty()) {
				arr[rear] = obj;
				front++;
				rear++;
			} else {
				arr[rear] = obj;
				rear++;
			}

		}

	}

	public int dequeue() throws QueueException {
		// implement
		if (isEmpty())
			throw new QueueException("No Element");

		else
			return arr[front++];

	}

	public boolean isEmpty() {
		if (front == -1 ||(rear<front))
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (rear == arr.length)
			return true;
		else
			return false;
	}

	public int size() {
		// implement
		return rear - front;
	}

	public void resize() {

		int[] temp = new int[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

}
