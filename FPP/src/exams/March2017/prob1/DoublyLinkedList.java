package exams.March2017.prob1;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		//adds to the end of the list
		public void addLast(String item){
			//implement
		
			if(header==null) {
				//Node temp=new Node();
			header.previous=null;
			header.next=null;
			header.value=item;
			}
			else {
				
				Node temp=header;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			Node temp2=null;
			
			temp2.previous=temp.previous;
			temp2.value=item;
			temp2.next=null;
					header=temp2;
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
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			System.out.println(list);
		}
}
