package exams.March2017.prob1;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node(null, null , null);
		}
		//adds to the end of the list
		public void addLast(String item){
			//implement
			Node temp = header.next;
			if (temp==null) {
				temp = new Node(header, item, null);
				header.next=temp;
			}
			else {
				
				while(temp.next!=null) {
					temp=temp.next;
				}
				Node temp2 = new Node(temp, item, null);
				temp.next=temp2;
			}

			
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

			public Node(Node previous, String value, Node next ) {
				 
				this.value = value;
				this.next = next;
				this.previous = previous;
			}
			
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			System.out.println(list);
		}
}
