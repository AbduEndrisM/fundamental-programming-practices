package exams.Mar2017.src.prob1;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		//adds to the end of the list
		public void addLast(String item){
			//implement
			if (header.next==null) {
				Node temp= new Node();
				temp.previous=header;
				temp.next=null;
				temp.value=item;
				header.next=temp;
			}
			else  {
				Node temp = new Node();
				temp=header.next;
				while(temp.next!=null) {
				temp = temp.next;
				}
				
					Node temp2 = new Node();
					temp2.previous=temp;
					temp2.next=null;
					temp.next=temp2;
					temp2.value=item;
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
			
		/*	public Node(Node previousString value, Node next, ) {
				 
				this.value = value;
				this.next = next;
				this.previous = previous;
			}*/

			public String toString() {
				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Carol");
			System.out.println(list);
		}
}
