package exams.Jan2017.prob1;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	private int size = 0;

	public int peek() throws QueueException {
		// implement
		if (isEmpty())
			throw new QueueException();
		else {
			return arr[front];
		}

	}

	public void enqueue(int obj) {
		// implement
		if (isEmpty()) {
			front++;
		}
			if (isFull()) { 
				resize();
			}
				
				
			arr[front] = obj;
			rear++;
			 
		 
	}

	public int dequeue() throws QueueException {
		// implement
		if (isEmpty())
			throw new QueueException();
		else {
			int x = arr[front];
			front++;
			return x;
		}
	}

	public boolean isEmpty() {
		// implement
		if (front == -1 || front >= rear)
			return true;
			return false;
	}
	public boolean isFull() { 
		if (rear == arr.length-1)
			 
			return true;
		return false;
	}

	public int size() {
		// implement
		if (front==-1)
			return 0;
		return rear-front;
	}

	public void resize() {

		// implement
		int[] temp = new int [arr.length*2];
		System.arraycopy(arr, 0, temp, 0, arr.length-1);
		arr=temp;
	 
	}
}
