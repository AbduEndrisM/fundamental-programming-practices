package exams.January2017.prob1;

public class Main {

	public static void main(String[] args) throws QueueException {
		ArrayQueueImpl q = new ArrayQueueImpl();
//		q.peek();
		for (int i = 0; i < 17; i++)
			q.enqueue(i);
		for (int i = 0; i < 15; i++)
			q.dequeue();
			
		System.out.println(q.peek());
	

		System.out.println(q.size());

	}

}
