package ten.arraylinkedlistnode;

import java.util.NoSuchElementException;

public class NodeQueue {
	
    private int size;       // number of elements on queue
    private Node front;    // beginning of queue
    private Node rear;     // end of queue

    // helper linked list class
    private class Node {
        private String item;   // the item in the node
        private Node next;   // reference to next item
        
        private Node(String data) {
			this.item = data;
		}
    }

    /**
     * Initializes an empty queue.
     */
    public NodeQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    /**
     * Returns true if this queue is empty.
     *
     * @return {@code true} if this queue is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Returns the number of items in this queue.
     *
     * @return the number of items in this queue
     */
    public int size() {
        return size;
    }

    

    /**
     * Returns the item least recently added to this queue.
     *
     * @return the item least recently added to this queue
     * @throws NoSuchElementException if this queue is empty
     */
    public String peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return front.item;
    }

    /**
     * Add the item to the queue.
     */
    public void enqueue(String item) {
    	
        
        Node prev = rear;
        rear = new Node(item);
        rear.next = null;
        if (isEmpty()) 
        	front = rear;
        else { 
        	prev.next = rear;
        
        }
        
        size++;
    }

    /**
     * Removes and returns the item on this queue that was least recently added.
     *
     * @return the item on this queue that was least recently added
     * @throws NoSuchElementException if this queue is empty
     */
    public String dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        String data = front.item;
        front = front.next;
        size --;
        return data;
    }

    
    public String toString() {
        String s = "";
        
        if(front == null) return "[]";
        else{
        	Node temp = front;
        	while(temp != null){
        		s += temp.item + " ,";
        		temp = temp.next;
        	}
        }
        
        return s;
    }
   

    /**
     * Unit tests the {@code Queue} data type.
     */
    public static void main(String[] args) {
        NodeQueue ns = new NodeQueue();
        
		ns.enqueue("Bob");
		System.out.println(ns.size()+" " + ns);
		ns.enqueue("Harry");
		System.out.println(ns.size()+" " + ns);
		ns.enqueue("Steve");
		System.out.println(ns.size() +" "  + ns);
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println(ns.size()+" " + ns);
		ns.enqueue("Bill");
		System.out.println(ns.size()+" " + ns);

		System.out.println("Peek Operation : " + ns.peek());
		System.out.println(ns.size()+" " + ns);
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println("Dequeue Operation : " + ns.dequeue());
		System.out.println("Empty ArrayDeque : " + ns.isEmpty());

//		System.out.println("Dequeue Operation : " + ns.dequeue());
	
    }
}


