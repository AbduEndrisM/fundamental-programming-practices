package exams.March2017.prob1;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		//adds to the end of the list
		public void addLast(String item){
			//implement
			if (header.previous == null && header.next==null && header.value==null) {
				Node temp = new Node();
				temp.next = null;
				temp.previous = null;
				temp.value = item;
				header = temp;
			} else {
				Node temp = header;
				while (temp.next != null) {
					temp = temp.next;
				}
				Node temp2 = new Node();
				temp2.previous = temp;
				temp2.next = null;
				temp2.value = item;
				temp.next = temp2;
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
