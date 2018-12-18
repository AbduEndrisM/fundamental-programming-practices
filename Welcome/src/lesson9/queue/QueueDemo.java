package lesson9.queue;

 
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
// Demo for Queue Methods
public class QueueDemo {

		public static void main(String[] args) {
			Queue<String> queue = new LinkedList<String>();
			queue.offer("Java");
	        queue.offer("DotNet");
	        queue.offer("PHP");
	        queue.offer("HTML");
	          
	        System.out.println("Top Element: " + queue.element()); 
	        System.out.println("remove: " +  queue.remove());
	         	       	   //    System.out.println(queue.isEmpty());
	        System.out.println("Top Element: " + queue.element());
	        System.out.println("poll: " + queue.poll());
	         System.out.println("Remove : " + queue.remove());
	        System.out.println("Top Element: " + queue.peek());
	        queue.removeAll(queue);
	        System.out.println(queue.size());
	        System.out.println("Top Element: " + queue.peek());// return null
	       // System.out.println("Top Element: " + queue.element());// Throw NoSuchElement Exception

	        Queue<Integer> pq = new PriorityQueue<Integer>();
	        pq.add(25);
	        pq.add(15);
	        pq.add(35);
	        pq.add(30);
	        pq.add(11);
	        System.out.println("Priority Queue Elements : " + pq);
	        Iterator p = pq.iterator();
	        System.out.println("Elements removed according to the priority : ");
	        while(p.hasNext()){
	        	      	System.out.print(pq.remove() + "  ");
	        }
	        
	        Deque<String> dq = new LinkedList(); 
	        dq.add ("Java"); //add element at tail 
	        dq.addFirst("C#"); //add element at head 
	        dq.addLast ("Software Engineering"); //add element at tail
	        System.out.println("\nDQueue Elements : " + dq);
	}

}
