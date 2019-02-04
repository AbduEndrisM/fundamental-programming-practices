package exams.Jan2017.prob1;

public class Main {

	public static void main(String[] args) throws QueueException {
		ArrayQueueImpl q = new ArrayQueueImpl();
	
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
			System.out.println("Peek:  "+ q.peek());
			
			for(int i = 0; i < 14; i ++)
			q.dequeue();
			System.out.println("Peek: "+ q.peek());
			
		System.out.println("Size:" +q.size());

		/*q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(5);
		q.enqueue(6);
		q.dequeue();
		q.dequeue();
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		System.out.println(q.size());*/

	}

}
