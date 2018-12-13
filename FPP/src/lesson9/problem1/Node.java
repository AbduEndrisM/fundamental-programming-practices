package lesson9.problem1;

public class Node {

	private String data;
	private Node prev;
	private Node next;

	Node(Node prev, String data, Node next) {

		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	
}
