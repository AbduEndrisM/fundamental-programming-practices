package exams.Jan2017.prob1;

public class Main {

	public static void main(String[] args) throws QueueException {
		ArrayQueueImpl q = new ArrayQueueImpl();
		//q.peek();
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		System.out.println(q.isFull());
		for(int i = 0; i < 14; i++) {
		System.out.println(q.get());
		}
			 q.dequeue();
		System.out.println(q.size());
		 
	}

}
