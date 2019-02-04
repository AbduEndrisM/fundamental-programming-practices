package exams.Jan2017.prob1;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() throws QueueException {
		if (isEmpty())
			throw new QueueException();
		return arr[front];
		// implement
	}

	public void enqueue(int obj) {
		// implement
		if(rear==arr.length)
			reSize();
		if (isEmpty())
			arr[++front] = obj;
		else
			arr[rear] = obj;

		rear++;

	}

	public int dequeue() throws QueueException {
		// implement
		if (isEmpty())
			throw new QueueException();
		else
			return arr[front++];

	}

	public boolean isEmpty() {
		// implement
		if (front == -1 || front > rear)
			return true;
		return false;
	}

	public int size() {
		// implement
		return rear-front;
	}
	public void reSize() {
		// implement
	
		int[]temp = new int [arr.length*2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr=temp;
	}

}
