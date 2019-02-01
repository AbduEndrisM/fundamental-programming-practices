package ten.queue;
 
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
	 
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(3);
		queue.add(1);
		queue.add(7);
		System.out.println(queue.peek());
		System.out.println(queue.element());
		
		for(int i:queue)
			System.out.println(i);
	}

}
