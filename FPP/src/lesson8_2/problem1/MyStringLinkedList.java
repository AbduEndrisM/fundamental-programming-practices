package lesson8_2.problem1;

public class MyStringLinkedList {
	Node header;
	int size;

	MyStringLinkedList() {
		header = null;

	}
	
	// insert in a Sorted Order
	public void addSort(String item) {
		Node temp=null;
		if(header ==null) {
			header=new Node(null,item,null);	
		}
		else if (header.next==null&& header.previous==null)
		{   
			temp=new Node(null,item,null);
			if(header.value.compareToIgnoreCase(item)>0)
			{				
				temp.next=header;
				header.previous=temp;
				header=temp;  
				temp=null;				
			}
			else
			{
				temp.previous=header;				
				header.next=temp;
				temp=null;
			}			
		}
		else 
		{
			// last case
			Node temp2=new Node(null,item,null);
			Node temp1=getPosition(header, item);
		
			if(temp1.next!=null) {			
			temp2.previous=temp1.previous;
			temp2.next=temp1;			
		    temp1.previous.next=temp2;
			temp1.previous=temp2;
			}
			else
			{
				temp2.previous=temp1;
				temp2.next=null;
				temp1.next=temp2;
						
			}
			
			
			
			
			
		}
	} 
	
	
	Node getPosition(Node header,String item)
	{
		Node temp=header;
		while(temp!=null)
		{
			if(temp.value.compareToIgnoreCase(item)>0) {
				return temp;
			}
			temp=temp.next;
		}
		
		temp=getLast();
		return temp;
	}

	public int size() {
		// Implement
		int count = 0;
		Node temp = header;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public boolean isEmpty() {
		// Implement
		if (header == null) // if (header.previous == null && header.next == null && header.value == null)
			return true;
		return false;
	}

	public Node getFirst() {
		// Implement
		if (header == null) {
			return null;
		}

		return header;
		/*
		 * Node temp =header; return temp;
		 */
	}

	public Node getLast() {
		// Implement
		if (header == null) {
			return null;
		} else {
			Node temp = header;
			while (temp.next != null) {
				temp = temp.next;
			}
			return temp;
		}

	}

	public boolean contains(String item) {
		// Implement
		if (header == null) {
			return false;
		}

		else {
			Node temp = header;
			boolean x = false;
			while (temp != null) {
				if (temp.value.compareTo(item) == 0) {
					x = true;
					break;
				}
				temp = temp.next;
			}
			return x;
		}
	}

	public void removeFirst() {
		// Implement
		if (header == null)
			return; // System.out.println("Empty LL");
		if (header.next == null)
			header = null;
		else {
			header.next.previous = null;
			header = header.next;
		}
	}

	public void removeLast() {
		// Implement

		if (header == null) {
			return;
		}
		if (header.next == null)
			header = null;

		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;

		}
		temp.previous = null;
		temp = null;
	}

	public void print() {

		// empty LL
		if (header == null) {
			System.out.println("Empty LL");
		}

		print(header);

	}

	// Write a recursive print method to display the elements in the list.
	void print(Node n) {
		if (n == null) // Last list
			return;
		else {
			Node m;
			System.out.println(n.value);
			m = n.next;
			print(m);
		}
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods
		mySL.addSort("Abdu");
		mySL.addSort("Elias"); 
		mySL.addSort("ARADOM"); 
		mySL.addSort("Abdu");
		mySL.addSort("Elias"); 
		mySL.addSort("Ethio"); 
 
		mySL.print();
		System.out.println("First" + mySL.getFirst().value);
		System.out.println("Last"+ mySL.getLast().value);
		System.out.println("Is empty "+mySL.isEmpty());
		System.out.println("Elias is found "+mySL.contains("Elias"));
		System.out.println("Size "+mySL.size());

	}

}
