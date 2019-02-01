package exams;

import java.util.NoSuchElementException;

public class MinDoublyLinkedList {

		Node header;
		public MinDoublyLinkedList(){
			header = new Node();
		}
		public void add(String item){
			//implement
			Node firstNode = header.next;
			if(firstNode == null){
				header.next = new Node(item, null, header);
				return;
			}
			if (firstNode.value.compareTo(item) < 0) {
				Node secondNode = firstNode.next;
				Node newNode = new Node(item, secondNode, firstNode);
				firstNode.next = newNode;
				if(secondNode!= null){
					secondNode.previous = newNode;
				}
			}
			else{
				Node newNode = new Node(item, firstNode, header);
				header.next = newNode;
				firstNode.previous = newNode;
			}
		}

		//returns the minimum element in the linkedlist
		public String min(){
			//implement!!!
			
			if(header.next==null) {
				throw new NoSuchElementException();
				
			}
			Node first = header.next;
			String min=first.value;
				Node second = first.next;
			while(second!=null) {
				if (second.value.compareTo(first.value)<0) {
//					first=first.next;
					min = second.value;
				}
				second=second.next;
			}
			return min;
		}

		//finds the maximum element in the linkedlist and removes it.
		public String removeMax(){
			//implement!!!
			if(header.next==null) {
				throw new NoSuchElementException();
				
			}
			Node first = header.next;
			String max=first.value;
				Node second = first.next;
			while(second!=null) {
				
				if (second.value.compareTo(first.value)>0) {
				first=first.next;
					max = second.value;
				}
				second=second.next;
			}
			
			 
			return max;
			 
		}

		
		@Override
		public String toString() {

			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();

		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}

		class Node {
			String value;
			Node next;
			Node previous;

			public String toString() {
				return value == null ? "null" : value;
			}

			public Node(String value, Node next, Node previous){
				this.value = value;
				this.next = next;
				this.previous = previous;
			}

			public Node(){

			}
		}

		public static void main(String[] args){
			MinDoublyLinkedList list = new MinDoublyLinkedList();
			list.add("bob");
//			System.out.println(list);
			list.add("harry");
//			System.out.println(list);
			list.add("steve");
//			System.out.println(list);
			list.add("anne");
			System.out.println(list);

			System.out.println("Min: "+list.min());
//			System.out.println(list.removeMax());
			System.out.println("Remove Max: "+list.removeMax());
//			System.out.println(list);
//			System.out.println(list.removeMax());
//			System.out.println(list);
//			System.out.println(list.removeMax());
//			System.out.println(list);
//			System.out.println(list.removeMax());
//			System.out.println(list);
//			System.out.println(list.removeMax());
//			System.out.println(list);


		}
}
