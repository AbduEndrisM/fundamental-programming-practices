package nine.list2;

import java.util.NoSuchElementException;
//
//import nine.list.MyStringLinkedList.Node;
// 
 

public class MyStringLinkedList {
	Node header;
	MyStringLinkedList(){
		header = new Node(null,null, null);
	}
	public void add(String item){

		// implement
		Node first = header.next;

		if (first == null) {
			Node n = new Node(header, item, null);
			header.next = n;

		} else {
			Node n = new Node(header, item, first);
			header.next = n;
			first.previous = n;

		}

	}

	//inserts a new Node contain data so that its
	//position in the list is now pos
	void insert(String data, int pos) {
		int count = 0;
		if (header.next == null || pos > size() || pos < 0)
			throw new NoSuchElementException();
//			return null;
		else if (pos == 0) {
			Node first = header.next;

			Node n = new Node(header, data, first);
			header.next = n;
			first.previous = n;
		} else if (pos == size()) {
			Node temp = header.next;
			while (temp.next != null) {
				temp = temp.next;
			}

			Node temp2 = new Node(null, data, null);

			temp2.value = data;
			temp2.previous = temp;
			temp.next = temp2;
		}
		 else {
			Node temp = header.next;
			while (temp != null) {
				Node temp2 = new Node(null, data, null);
				if (count == pos) {
					temp2.next = temp;
					temp2.previous = temp.previous;
					temp.previous.next = temp2;
					temp.previous = temp2;
				}
				count++;
				temp = temp.next;
			}

		}
		
			
	}
	 

	
	public void sort(){
		
		if(header == null || header.next==null) 
		return;
		
		Node temp = header.next;
		 
		while(temp.next!=null) {
			Node min = minNode(temp);
			swap (temp,min); 	//just swap the string value only
			temp = temp.next; 	 
		}
		 
		

	}
	void swap(Node n1, Node n2){
		
		String s = n1.value;
		n1.value=n2.value;
		n2.value=s;

		

	}
//implement
	public Node minNode(Node n){ // n would be the node to be compared by the remaining nodes (like outer loop of two for loops)
		Node temp = n.next; 	//  temp is the node which would be compared with n. if temp < n swap
		Node current=n;			// current is the intermediate node which is less than n and has to be checked until the end of the node
		
		while(temp!=null) {
			if(temp.value.compareTo(current.value)<0) { 
				current= temp; 
			}
			
			temp = temp.next;
		}
	
		
		//return location of min, not the min itself
		return current ;  //return the smallest node to next step - swap
	
	}

	public Node getNode(int pos){

		if(pos > size())
			throw new IndexOutOfBoundsException();
		Node curr = header.next;
		for (int i = 0; i < pos; i++) {
			curr = curr.next;
		}
		return curr;
	}

	// Count the number of nodes in the list
		public int size() {
			// implement
			int count = 0;
			Node curr = header.next;

			while (curr != null) {
				count++;
				curr = curr.next;
			}

			return count;
		}
		
		
		
		public boolean search(String string) {
			if (header.next == null){
				return false;
			}
			Node temp = header.next;
			while (temp != null) {
				if (temp.value.equals(string))
					return true;

				temp = temp.next;
			}

			return false;
			
		}

		public String toString() {
			// implement
			String result = "";
			Node curr = header.next;

			while (curr != null) {
				result += curr.value + "-> ";
				curr = curr.next;
			}

			return result;
		}
		
		
	class Node {
		Node previous;
		String value;
		Node next;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
	}
	

}

