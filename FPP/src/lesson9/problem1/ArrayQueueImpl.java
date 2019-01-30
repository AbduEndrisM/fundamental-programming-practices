package lesson9.problem1;

public class ArrayQueueImpl {
	private int[] arr = new int[3];
	private int front = -1;
	private int real = -1;

	public boolean isEmpty() {
		if (front == -1 && real == -1) {
			return true;
		}
		return false;

	}

	public boolean isFull() {
		if (real == arr.length - 1) {
			return true;
		}
		return false;

	}

	public int size() {
		//int x = real - front + 1;
		return real-front+1; //x
	}

	public void reSize() {
		int[] temp = new int[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

	public void enqueue(int x) {
		if (isFull()) {
			reSize();
			real = real + 1;
			arr[real] = x;
		} else {

			if (isEmpty()) {
				front = front + 1;
				real = real + 1;
			} else {
				real = real + 1;

			}
			arr[real] = x;
		}
	}

	public Object dequeue() {
		if (isEmpty()) {
			System.out.println("Empty");

		} else if (front == real) { // front==-1 && real==-1
			front = front - 1;
			real = real - 1;

		} else {
			front = front + 1;
		}
		return arr[front];
	}

	public void peek() {
		if (front == -1)
			System.out.println("No peek - Empty");
		else
			System.out.println("Peek " + arr[front]);

	}

	public static void main(String[] args) {
		
		ArrayQueueImpl q = new ArrayQueueImpl();
		q.enqueue(12);
		q.enqueue(10);
		q.enqueue(5);
		q.enqueue(8);
		q.enqueue(5);
		q.enqueue(8);
		q.enqueue(8);

		System.out.println("size" + q.size());
		q.dequeue();
		System.out.println("size" + q.size());
		q.peek();
		System.out.println("Queue is Empty: " + q.isEmpty());
		System.out.println("Queue is Full: " + q.isFull());

		System.out.println("Array length: " + q.arr.length);
		for (int i = q.front; i <= q.real; i++) {
			System.out.print(q.arr[i] + " ");
		}
	}

}
